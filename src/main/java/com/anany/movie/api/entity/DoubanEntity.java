package com.anany.movie.api.entity;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by anany on 2019-03-25.
 * <p>
 * Email: zhuj@fapiao.com
 */
@Document(collection = "douban")
public class DoubanEntity {


    /**
     * _id : 10000801
     * cover : https://img3.doubanio.com/f/movie/03d3c900d2a79a15dc1295154d5293a2d5ebd792/pics/movie/tv_default_large.png
     * title : 拉普兰
     * url : https://movie.douban.com/subject/10000801/
     * actor : 斯蒂芬·格拉汉姆 / 扎威·阿什顿 / Elizabeth Berrington
     * author : Michael Wynne
     * cover_local : db_cover\tv_default_large.png
     * create_time : 1553071266388
     * date_published : null
     * director : Catherine Morshead
     * genre : 喜剧
     * imdb_id : tt2091334
     * introduction : null
     * language : 英语
     * length : null
     * m_production_country : 英国
     * other_name : null
     * rating_human : null
     * rating_num :
     * type : 1
     * update_time : null
     * episode : null
     * first_broadcast : null
     * season_count : null
     * single_length : null
     */

    private String id;
    private String cover;
    private String title;
    private String url;
    private String actor;
    private String author;
    private String coverLocal;
    private long createTime;
    private Object datePublished;
    private String director;
    private String genre;
    private String imdbId;
    private Object introduction;
    private String language;
    private Object length;
    private String mProductionCountry;
    private Object otherName;
    private Object ratingHuman;
    private String ratingNum;
    private int type;
    private Object updateTime;
    private Object episode;
    private Object firstBroadcast;
    private Object seasonCount;
    private Object singleLength;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCoverLocal() {
        return coverLocal;
    }

    public void setCoverLocal(String coverLocal) {
        this.coverLocal = coverLocal;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public Object getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Object datePublished) {
        this.datePublished = datePublished;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public Object getIntroduction() {
        return introduction;
    }

    public void setIntroduction(Object introduction) {
        this.introduction = introduction;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Object getLength() {
        return length;
    }

    public void setLength(Object length) {
        this.length = length;
    }

    public String getmProductionCountry() {
        return mProductionCountry;
    }

    public void setmProductionCountry(String mProductionCountry) {
        this.mProductionCountry = mProductionCountry;
    }

    public Object getOtherName() {
        return otherName;
    }

    public void setOtherName(Object otherName) {
        this.otherName = otherName;
    }

    public Object getRatingHuman() {
        return ratingHuman;
    }

    public void setRatingHuman(Object ratingHuman) {
        this.ratingHuman = ratingHuman;
    }

    public String getRatingNum() {
        return ratingNum;
    }

    public void setRatingNum(String ratingNum) {
        this.ratingNum = ratingNum;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Object getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Object updateTime) {
        this.updateTime = updateTime;
    }

    public Object getEpisode() {
        return episode;
    }

    public void setEpisode(Object episode) {
        this.episode = episode;
    }

    public Object getFirstBroadcast() {
        return firstBroadcast;
    }

    public void setFirstBroadcast(Object firstBroadcast) {
        this.firstBroadcast = firstBroadcast;
    }

    public Object getSeasonCount() {
        return seasonCount;
    }

    public void setSeasonCount(Object seasonCount) {
        this.seasonCount = seasonCount;
    }

    public Object getSingleLength() {
        return singleLength;
    }

    public void setSingleLength(Object singleLength) {
        this.singleLength = singleLength;
    }
}
