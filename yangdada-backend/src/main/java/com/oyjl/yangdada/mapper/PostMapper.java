package com.oyjl.yangdada.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oyjl.yangdada.model.entity.Post;
import java.util.Date;
import java.util.List;

/**
 * 帖子数据库操作
 *
 * @author <a href="https://github.com/ouyangtn">程序员红逗</a>
 * @from <a href="https://github.com/ouyangtn">程序员红豆的github</a>
 */
public interface PostMapper extends BaseMapper<Post> {

    /**
     * 查询帖子列表（包括已被删除的数据）
     */
    List<Post> listPostWithDelete(Date minUpdateTime);

}




