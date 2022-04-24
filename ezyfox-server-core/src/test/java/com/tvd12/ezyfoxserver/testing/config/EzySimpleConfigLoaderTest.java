package com.tvd12.ezyfoxserver.testing.config;

import com.tvd12.ezyfoxserver.config.EzyConfig;
import com.tvd12.ezyfoxserver.config.EzySimpleConfig;
import com.tvd12.ezyfoxserver.config.EzySimpleConfigLoader;
import com.tvd12.test.assertion.Asserts;
import org.testng.annotations.Test;

public class EzySimpleConfigLoaderTest {

    @Test
    public void loadFilePathNullTest() {
        // given
        EzySimpleConfigLoader sut = new EzySimpleConfigLoader();

        // when
        EzyConfig config = sut.load(null);

        // then
        Asserts.assertEquals(EzySimpleConfig.defaultConfig(), config);
    }

}
