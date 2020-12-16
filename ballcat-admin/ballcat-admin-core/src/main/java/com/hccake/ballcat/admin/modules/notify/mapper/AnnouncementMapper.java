package com.hccake.ballcat.admin.modules.notify.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.hccake.ballcat.admin.modules.notify.model.entity.Announcement;
import com.hccake.ballcat.admin.modules.notify.model.vo.AnnouncementVO;
import org.apache.ibatis.annotations.Param;

/**
 * 公告信息
 *
 * @author hccake 2020-12-15 17:01:15
 */
public interface AnnouncementMapper extends BaseMapper<Announcement> {

	/**
	 * 分页查询
	 * @param page 分页对象
	 * @param wrapper 查询wrapper
	 * @return IPage<AnnouncementVO> VO分页数据
	 */
	IPage<AnnouncementVO> selectPageVo(IPage<?> page, @Param(Constants.WRAPPER) Wrapper<Announcement> wrapper);

}