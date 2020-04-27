/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.homematic.internal.type;

import org.eclipse.smarthome.core.thing.ThingTypeUID;
import org.eclipse.smarthome.core.thing.binding.ThingTypeProvider;
import org.eclipse.smarthome.core.thing.type.ThingType;

/**
 * Extends the ThingTypeProvider to manually add a ThingType.
 *
 * @author Gerhard Riegler - Initial contribution
 */
public interface HomematicThingTypeProvider extends ThingTypeProvider {

    /**
     * Adds the ThingType to this provider.
     */
    public void addThingType(ThingType thingType);

    /**
     * Use this method to lookup a ThingType which was generated by the
     * homematic binding. Other than {@link #getThingType(ThingTypeUID, Locale)}
     * of this provider, it will return also those {@link ThingType}s which are
     * excluded by {@link HomematicThingTypeExcluder}
     * 
     * @param thingTypeUID
     *            e.g. <i>homematic:HM-Sec-SC</i>
     * @return ThingType that was added to HomematicThingTypeProvider, identified
     *         by its thingTypeUID<br>
     *         <i>null</i> if no ThingType with the given thingTypeUID was added
     *         before
     */
    public ThingType getInternalThingType(ThingTypeUID thingTypeUID);
}
