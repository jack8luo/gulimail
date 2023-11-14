package com.luohao.gulimail.product.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.luohao.gulimail.product.entity.SpuInfoDescEntity;
import com.luohao.gulimail.product.service.SpuInfoDescService;
import com.luohao.common.utils.PageUtils;
import com.luohao.common.utils.R;



/**
 * spu信息介绍
 *
 * @author luohao
 * @email 18779121256@163.com
 * @date 2023-11-13 22:23:30
 */
@RestController
@RequestMapping("product/spuinfodesc")
public class SpuInfoDescController {
    @Autowired
    private SpuInfoDescService spuInfoDescService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = spuInfoDescService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{spuId}")
    public R info(@PathVariable("spuId") Long spuId){
		SpuInfoDescEntity spuInfoDesc = spuInfoDescService.getById(spuId);

        return R.ok().put("spuInfoDesc", spuInfoDesc);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SpuInfoDescEntity spuInfoDesc){
		spuInfoDescService.save(spuInfoDesc);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SpuInfoDescEntity spuInfoDesc){
		spuInfoDescService.updateById(spuInfoDesc);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] spuIds){
		spuInfoDescService.removeByIds(Arrays.asList(spuIds));

        return R.ok();
    }

}
