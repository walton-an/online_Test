package com.online_examing.repository;

import com.domain.PaperDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: walton
 * @Description: 登录、注册的Repository
 * @Createtime: 2017/11/28
 */

@Repository
public interface PaperRepository extends MongoRepository<PaperDetail,Long> {

    public List<PaperDetail> findByTitleAndType(String title, int type);

    public List<PaperDetail> findByType(int type);

}
