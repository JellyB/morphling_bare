package com.huatu.morphling.dao.jpa.api;

import com.huatu.morphling.dao.jpa.entity.ShellLog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hanchao
 * @date 2017/11/23 13:21
 */
public interface ShellLogDao extends JpaRepository<ShellLog,Long> {
}
