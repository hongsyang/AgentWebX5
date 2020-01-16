package com.just.agentwebX5.permission;

/**
 * 权限拦截接口
 */

public interface IPermissionInterceptor {
    boolean intercept(String url, String[] permissions, String action);
}
