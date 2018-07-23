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
public class ListCloudInstanceRequest extends RpcAcsRequest<ListCloudInstanceResponse> {
	
	public ListCloudInstanceRequest() {
		super("Zhuque", "2016-07-01", "ListCloudInstance");
	}

	private String displayName;

	private String cloudType;

	private String customerId;

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putQueryParameter("DisplayName", displayName);
		}
	}

	public String getCloudType() {
		return this.cloudType;
	}

	public void setCloudType(String cloudType) {
		this.cloudType = cloudType;
		if(cloudType != null){
			putQueryParameter("CloudType", cloudType);
		}
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
		if(customerId != null){
			putQueryParameter("CustomerId", customerId);
		}
	}

	@Override
	public Class<ListCloudInstanceResponse> getResponseClass() {
		return ListCloudInstanceResponse.class;
	}

}
