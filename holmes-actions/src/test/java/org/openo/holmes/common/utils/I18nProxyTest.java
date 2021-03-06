/**
 * Copyright 2016 ZTE Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.openo.holmes.common.utils;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Locale;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class I18nProxyTest {

    private I18nProxy i18nProxy;

    @Before
    public void setUp() {
        i18nProxy = I18nProxy.getInstance();
    }

    @Test
    public void getValue_locale_and_key() {
        String result = i18nProxy.getValue(new Locale("zh"), "test");
        assertThat(result, equalTo(null));
    }
    @Test
    public void getValueByArgs(){
        String result = i18nProxy.getValueByArgs(new Locale("zh"), "test",new String[]{"1"});
        assertThat(result,equalTo(null));
    }
    @Test
    public void getValue_by_key(){
        Map<String,String> result = i18nProxy.getValue("test");
        assertThat(result, equalTo(null));
    }
    @Test
    public void jsonI18n(){
        String result = i18nProxy.jsonI18n("test");
        assertThat(result,equalTo(null));
    }
    @Test
    public void i18nWithArgs(){
        String result = i18nProxy.i18nWithArgs("test",new String[]{});
        assertThat(result,equalTo("null"));
    }
}