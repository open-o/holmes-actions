/**
 * Copyright 2017 ZTE Corporation.
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
package org.openo.holmes.common.db;

import java.util.List;

import org.openo.holmes.common.api.entity.AlarmsCorrelation;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import org.openo.holmes.common.db.mapper.AlarmsCorrelationMapper;

@RegisterMapper(AlarmsCorrelationMapper.class)
public interface AlarmsCorrelationDao {

  @SqlUpdate("INSERT INTO APLUS_CORRELATION (ruleId,ruleInfo,resultType,createTime,parentAlarmId,childAlarmId,reserve1,reserve2,reserve3) values(:ruleId,:ruleInfo,:resultType,:createTime,:parentAlarmId,:childAlarmId,:reserve1,:reserve2,:reserve3)")
  public abstract void save(@BindBean AlarmsCorrelation aplusCorrelation);

  @SqlQuery("SELECT * FROM APLUS_CORRELATION")
  public abstract List<AlarmsCorrelation> queryAll();
}
