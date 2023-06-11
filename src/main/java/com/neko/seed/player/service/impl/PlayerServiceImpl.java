package com.neko.seed.player.service.impl;

import com.neko.seed.player.entity.Player;
import com.neko.seed.player.mapper.PlayerMapper;
import com.neko.seed.player.service.IPlayerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author XU BIAO
 * @since 2023-06-10
 */
@Service
public class PlayerServiceImpl extends ServiceImpl<PlayerMapper, Player> implements IPlayerService {

}
