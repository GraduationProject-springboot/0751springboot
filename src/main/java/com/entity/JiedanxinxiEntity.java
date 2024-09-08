package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 接单信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-25 16:01:10
 */
@TableName("jiedanxinxi")
public class JiedanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiedanxinxiEntity() {
		
	}
	
	public JiedanxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 物品名称
	 */
					
	private String wupinmingcheng;
	
	/**
	 * 维修类型
	 */
					
	private String weixiuleixing;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 住户姓名
	 */
					
	private String zhuhuxingming;
	
	/**
	 * 接单内容
	 */
					
	private String jiedanneirong;
	
	/**
	 * 接单日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jiedanriqi;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 电话
	 */
					
	private String dianhua;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
	/**
	 * 设置：物品名称
	 */
	public void setWupinmingcheng(String wupinmingcheng) {
		this.wupinmingcheng = wupinmingcheng;
	}
	/**
	 * 获取：物品名称
	 */
	public String getWupinmingcheng() {
		return wupinmingcheng;
	}
	/**
	 * 设置：维修类型
	 */
	public void setWeixiuleixing(String weixiuleixing) {
		this.weixiuleixing = weixiuleixing;
	}
	/**
	 * 获取：维修类型
	 */
	public String getWeixiuleixing() {
		return weixiuleixing;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：住户姓名
	 */
	public void setZhuhuxingming(String zhuhuxingming) {
		this.zhuhuxingming = zhuhuxingming;
	}
	/**
	 * 获取：住户姓名
	 */
	public String getZhuhuxingming() {
		return zhuhuxingming;
	}
	/**
	 * 设置：接单内容
	 */
	public void setJiedanneirong(String jiedanneirong) {
		this.jiedanneirong = jiedanneirong;
	}
	/**
	 * 获取：接单内容
	 */
	public String getJiedanneirong() {
		return jiedanneirong;
	}
	/**
	 * 设置：接单日期
	 */
	public void setJiedanriqi(Date jiedanriqi) {
		this.jiedanriqi = jiedanriqi;
	}
	/**
	 * 获取：接单日期
	 */
	public Date getJiedanriqi() {
		return jiedanriqi;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：电话
	 */
	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}
	/**
	 * 获取：电话
	 */
	public String getDianhua() {
		return dianhua;
	}

}
