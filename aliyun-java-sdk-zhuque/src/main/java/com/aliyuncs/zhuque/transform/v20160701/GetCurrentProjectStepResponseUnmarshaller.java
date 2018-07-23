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

package com.aliyuncs.zhuque.transform.v20160701;

import com.aliyuncs.zhuque.model.v20160701.GetCurrentProjectStepResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCurrentProjectStepResponseUnmarshaller {

	public static GetCurrentProjectStepResponse unmarshall(GetCurrentProjectStepResponse getCurrentProjectStepResponse, UnmarshallerContext context) {
		
		getCurrentProjectStepResponse.setRequestId(context.stringValue("GetCurrentProjectStepResponse.RequestId"));
		getCurrentProjectStepResponse.setData(context.stringValue("GetCurrentProjectStepResponse.Data"));
		getCurrentProjectStepResponse.setResult(context.stringValue("GetCurrentProjectStepResponse.Result"));
		getCurrentProjectStepResponse.setMessage(context.stringValue("GetCurrentProjectStepResponse.Message"));
	 
	 	return getCurrentProjectStepResponse;
	}
}