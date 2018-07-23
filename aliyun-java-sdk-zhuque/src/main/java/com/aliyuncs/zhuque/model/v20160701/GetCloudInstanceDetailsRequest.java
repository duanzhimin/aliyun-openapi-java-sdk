/*
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

package com.aliyuncs.zhuque.model.v20160701;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetCloudInstanceDetailsRequest extends RpcAcsRequest<GetCloudInstanceDetailsResponse> {
	
	public GetCloudInstanceDetailsRequest() {
		super("Zhuque", "2016-07-01", "GetCloudInstanceDetails");
	}

	private String cloudInstance;

	public String getCloudInstance() {
		return this.cloudInstance;
	}

	public void setCloudInstance(String cloudInstance) {
		this.cloudInstance = cloudInstance;
		if(cloudInstance != null){
			putQueryParameter("CloudInstance", cloudInstance);
		}
	}

	@Override
	public Class<GetCloudInstanceDetailsResponse> getResponseClass() {
		return GetCloudInstanceDetailsResponse.class;
	}

}
