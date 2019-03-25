package com.anany.movie.api.controller;


import com.anany.movie.api.base.BaseController;
import com.anany.movie.api.entity.DoubanEntity;
import com.anany.movie.api.dao.MovieDoubanDao;
import com.anany.movie.api.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by anany on 2019-03-25.
 * <p>
 * Email: zhuj@fapiao.com
 */
@RestController
@RequestMapping("/api")
public class ApiController extends BaseController {

    @Autowired
    private MovieDoubanDao movieDoubanDao;

    @RequestMapping("/queryMovie")
    public R getUser() {
        List<DoubanEntity> list = movieDoubanDao.findList();
        return R.ok().put("data", list);
    }
}
