/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.registry.remoting;

import com.alipay.sofa.registry.common.model.store.URL;

import java.net.InetSocketAddress;
import java.util.Collection;

/**
 *
 * @author shangyu.wh
 * @version $Id: Client.java, v 0.1 2017-11-20 21:07 shangyu.wh Exp $
 */
public interface Client extends Endpoint {

    /**
     * get channels.
     *
     * @return channels
     */
    Collection<Channel> getChannels();

    /**
     * get channel.
     *
     * @param remoteAddress
     * @return channel
     */
    Channel getChannel(InetSocketAddress remoteAddress);

    /**
     * get channel by url.
     *
     * @param url
     * @return channel
     */
    Channel getChannel(URL url);

    /**
     * client connect target url server
     * @param url
     * @return
     */
    Channel connect(URL url);
}