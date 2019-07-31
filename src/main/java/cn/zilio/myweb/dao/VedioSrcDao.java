package cn.zilio.myweb.dao;

import cn.zilio.myweb.pojo.VedioSrc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VedioSrcDao extends JpaRepository<VedioSrc, Long> {
    VedioSrc saveAndFlush(VedioSrc vedioSrc);

    VedioSrc findByVedioSrcId(Integer vedioSrcId) throws Exception;

    List<VedioSrc> findAllByCourseId(Integer courseId) throws Exception;

    VedioSrc findByVedioName(String name) throws Exception;

    void deleteAllByCourseId(Integer courseId) throws Exception;
}
