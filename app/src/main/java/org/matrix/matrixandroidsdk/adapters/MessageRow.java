/* 
 * Copyright 2014 OpenMarket Ltd
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
package org.matrix.matrixandroidsdk.adapters;

import org.matrix.androidsdk.data.RoomState;
import org.matrix.androidsdk.rest.model.Event;

public class MessageRow {
    private Event event;
    private RoomState roomState;

    public MessageRow(Event event, RoomState roomState) {
        this.event = event;
        this.roomState = roomState;
    }

    public Event getEvent() {
        return event;
    }

    public RoomState getRoomState() {
        return roomState;
    }
}
