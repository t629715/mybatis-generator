package com.learning.generator.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "config_param")
public class ConfigParam {
    /**
     * 参数名称
     */
    @Id
    @Column(name = "param_name")
    private String paramName;

    /**
     * 值
     */
    @Column(name = "param_value")
    private String paramValue;

    /**
     * 值类型
     */
    @Column(name = "value_type")
    private String valueType;

    /**
     * 描述
     */
    private String description;

    /**
     * 模块
     */
    private String module;

    /**
     * 缓存数据区域 0:Local(map), 1:Remote(redis)
     */
    @Column(name = "cache_region")
    private Short cacheRegion;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 更新时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 获取参数名称
     *
     * @return param_name - 参数名称
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * 设置参数名称
     *
     * @param paramName 参数名称
     */
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    /**
     * 获取值
     *
     * @return param_value - 值
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * 设置值
     *
     * @param paramValue 值
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    /**
     * 获取值类型
     *
     * @return value_type - 值类型
     */
    public String getValueType() {
        return valueType;
    }

    /**
     * 设置值类型
     *
     * @param valueType 值类型
     */
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取模块
     *
     * @return module - 模块
     */
    public String getModule() {
        return module;
    }

    /**
     * 设置模块
     *
     * @param module 模块
     */
    public void setModule(String module) {
        this.module = module;
    }

    /**
     * 获取缓存数据区域 0:Local(map), 1:Remote(redis)
     *
     * @return cache_region - 缓存数据区域 0:Local(map), 1:Remote(redis)
     */
    public Short getCacheRegion() {
        return cacheRegion;
    }

    /**
     * 设置缓存数据区域 0:Local(map), 1:Remote(redis)
     *
     * @param cacheRegion 缓存数据区域 0:Local(map), 1:Remote(redis)
     */
    public void setCacheRegion(Short cacheRegion) {
        this.cacheRegion = cacheRegion;
    }

    /**
     * 获取创建时间
     *
     * @return gmt_create - 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取更新时间
     *
     * @return gmt_modified - 更新时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置更新时间
     *
     * @param gmtModified 更新时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}