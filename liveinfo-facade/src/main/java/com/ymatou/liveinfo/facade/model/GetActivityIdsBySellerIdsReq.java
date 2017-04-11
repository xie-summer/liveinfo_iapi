package com.ymatou.liveinfo.facade.model;

import com.ymatou.liveinfo.facade.common.BaseRequest;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;

/**
 * Created by wangxudong on 2017/4/11.
 */
public class GetActivityIdsBySellerIdsReq extends BaseRequest {

    /**
     * 卖家Id列表
     */
    @NotEmpty(message = "卖家Id不能为空")
    private List<Integer> sellerIds;

    public List<Integer> getSellerIds() {
        return sellerIds;
    }

    public void setSellerIds(List<Integer> sellerIds) {
        this.sellerIds = sellerIds;
    }
}
