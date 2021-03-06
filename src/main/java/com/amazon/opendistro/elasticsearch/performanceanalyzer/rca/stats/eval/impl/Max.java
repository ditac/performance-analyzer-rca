/*
 *
 *  * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License").
 *  * You may not use this file except in compliance with the License.
 *  * A copy of the License is located at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * or in the "license" file accompanying this file. This file is distributed
 *  * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 *  * express or implied. See the License for the specific language governing
 *  * permissions and limitations under the License.
 *
 */

package com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.stats.eval.impl;

import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.stats.eval.Statistics;

/** To get the maximum observed value */
public class Max extends MinMaxCommon {

  public Max() {
    super(Long.MIN_VALUE);
  }

  @Override
  boolean shouldUpdate(Number v) {
    return getOldVal().doubleValue() < v.doubleValue();
  }

  @Override
  public Statistics type() {
    return Statistics.MAX;
  }
}
