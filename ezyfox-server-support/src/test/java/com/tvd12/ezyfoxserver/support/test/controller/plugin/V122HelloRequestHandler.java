package com.tvd12.ezyfoxserver.support.test.controller.plugin;

import com.tvd12.ezyfox.annotation.EzyFeature;
import com.tvd12.ezyfox.annotation.EzyManagement;
import com.tvd12.ezyfox.annotation.EzyPayment;
import com.tvd12.ezyfox.bean.annotation.EzyPrototype;
import com.tvd12.ezyfox.binding.EzyDataBinding;
import com.tvd12.ezyfox.core.annotation.EzyRequestListener;
import com.tvd12.ezyfox.function.EzyHandler;


@EzyManagement
@EzyPayment
@EzyFeature("hello.world")
@EzyPrototype
@EzyRequestListener("v1.2.2/hello")
public class V122HelloRequestHandler implements EzyHandler, EzyDataBinding {

    @Override
    public void handle() {}
    
}
