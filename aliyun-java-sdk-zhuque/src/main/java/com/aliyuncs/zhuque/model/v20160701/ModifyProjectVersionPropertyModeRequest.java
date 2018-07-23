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
public class ModifyProjectVersionPropertyModeRequest extends RpcAcsRequest<ModifyProjectVersionPropertyModeResponse> {
	
	public ModifyProjectVersionPropertyModeRequest() {
		super("Zhuque", "2016-07-01", "ModifyProjectVersionPropertyMode");
	}

	private String versionId;

	private String modifier;

	private String project;

	private String propertyMode;

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
		if(versionId != null){
			putQueryParameter("VersionId", versionId);
		}
	}

	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
		if(modifier != null){
			putQueryParameter("Modifier", modifier);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getPropertyMode() {
		return this.propertyMode;
	}

	public void setPropertyMode(String propertyMode) {
		this.propertyMode = propertyMode;
		if(propertyMode != null){
			putQueryParameter("PropertyMode", propertyMode);
		}
	}

	@Override
	public Class<ModifyProjectVersionPropertyModeResponse> getResponseClass() {
		return ModifyProjectVersionPropertyModeResponse.class;
	}

}
