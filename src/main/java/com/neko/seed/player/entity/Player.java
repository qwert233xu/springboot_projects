package com.neko.seed.player.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author XU BIAO
 * @since 2023-06-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Player implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 玩家昵称
     */
    private String name;

    /**
     * 玩家性别
     */
    private String sex;

    /**
     * 玩家角色
     */
    private String role;


}
