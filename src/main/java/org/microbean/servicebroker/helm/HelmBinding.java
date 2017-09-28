/* -*- mode: Java; c-basic-offset: 2; indent-tabs-mode: nil; coding: utf-8-unix -*-
 *
 * Copyright © 2017 MicroBean.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.microbean.servicebroker.helm;

import java.util.Map;

@Deprecated
public class HelmBinding {

  private final Helm.Status status;

  private final Map<? extends String, ?> credentials;
  
  public HelmBinding(final Map<? extends String, ?> credentials, final Helm.Status status) {
    super();
    this.credentials = credentials;
    this.status = status;
  }

  public Helm.Status getStatus() {
    return this.status;
  }
  
}
