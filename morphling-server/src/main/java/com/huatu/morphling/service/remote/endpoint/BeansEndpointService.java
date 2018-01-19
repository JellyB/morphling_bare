package com.huatu.morphling.service.remote.endpoint;

import com.huatu.morphling.common.consts.EndpointConsts;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hanchao
 * @date 2017/12/23 11:49
 */
@Service
public class BeansEndpointService extends AbstractEndpointService<List> {
    @Override
    public String endpoint() {
        return EndpointConsts.BEANS;
    }
}
