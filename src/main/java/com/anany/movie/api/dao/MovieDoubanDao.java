package com.anany.movie.api.dao;

import com.anany.movie.api.entity.DoubanEntity;
import com.anany.movie.api.AppConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by anany on 2019-03-25.
 * <p>
 * Email: zhuj@fapiao.com
 */
@Component
public class MovieDoubanDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void insert(DoubanEntity entity) {
        mongoTemplate.save(entity);
    }

    public void update(DoubanEntity entity) {
        Query query = new Query(Criteria.where("_id").is(entity.getId()));
        Update update = new Update()
                .set("actor", entity.getActor())
                .set("author", entity.getAuthor());
        mongoTemplate.updateFirst(query, update, DoubanEntity.class);
    }

    public DoubanEntity findMovieById(Long id) {
        Query query = new Query(Criteria.where("_id").is(id));
        return mongoTemplate.findOne(query, DoubanEntity.class);
    }

    public DoubanEntity findMovieByName(String movieName) {
        Query query = new Query(Criteria.where("title").is(movieName));
        return mongoTemplate.findOne(query, DoubanEntity.class);
    }

    public List<DoubanEntity> findList() {
        Query query = new Query(Criteria.where("type").is(0))
                .limit(AppConst.RECORD_COUNT);
        return mongoTemplate.find(query, DoubanEntity.class);
    }
}
