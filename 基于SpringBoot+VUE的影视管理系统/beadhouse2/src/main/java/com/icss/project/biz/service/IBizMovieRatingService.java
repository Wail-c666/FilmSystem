package com.icss.project.biz.service;

import java.util.List;
import com.icss.project.biz.domain.BizMovieRating;

/**
 * 电影评分Service接口
 *
 * @author toto1695798531089
 * @date 2023-09-27
 */
public interface IBizMovieRatingService
{
    /**
     * 查询电影评分
     *
     * @param movieRatingId 电影评分主键
     * @return 电影评分
     */
    public BizMovieRating selectBizMovieRatingByMovieRatingId(Long movieRatingId);

    /**
     * 查询电影评分列表
     *
     * @param bizMovieRating 电影评分
     * @return 电影评分集合
     */
    public List<BizMovieRating> selectBizMovieRatingList(BizMovieRating bizMovieRating);

    /**
     * 新增电影评分
     *
     * @param bizMovieRating 电影评分
     * @return 结果
     */
    public int insertBizMovieRating(BizMovieRating bizMovieRating);

    /**
     * 修改电影评分
     *
     * @param bizMovieRating 电影评分
     * @return 结果
     */
    public int updateBizMovieRating(BizMovieRating bizMovieRating);

    /**
     * 批量删除电影评分
     *
     * @param movieRatingIds 需要删除的电影评分主键集合
     * @return 结果
     */
    public int deleteBizMovieRatingByMovieRatingIds(Long[] movieRatingIds);

    /**
     * 删除电影评分信息
     *
     * @param movieRatingId 电影评分主键
     * @return 结果
     */
    public int deleteBizMovieRatingByMovieRatingId(Long movieRatingId);
}
