/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.messaging;

/**
 * This the handler that need to be extended when you extend the GW.
 */
public interface MessagingHandler {

    boolean sourceConnection(String metadata, State state);
    boolean sourceRequest(CarbonMessage carbonMessage, State state);
    boolean sourceResponse(CarbonMessage carbonMessage, State state);

    boolean targetConnection(String metadata, State state);
    boolean targetRequest(CarbonMessage carbonMessage, State state);
    boolean targetResponse(CarbonMessage carbonMessage, State state);

    String handlerName();
}
