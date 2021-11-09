package cn.wlx.channel.carry.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wlx
 * @since 2021-11-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MComentropy implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private Long id;

    /**
     * 标签
     */
    private String label;

    /**
     * 属性
     */
    private String key;

    /**
     * 信息熵
     */
    private String comentropy;

    /**
     * 百分比
     */
    private String percentage;

    private Date createTime;

    private Date updateTime;

    private Long datasourceId;


}
