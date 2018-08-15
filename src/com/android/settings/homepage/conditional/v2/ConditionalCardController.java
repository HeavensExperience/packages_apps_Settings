/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings.homepage.conditional.v2;

import android.content.Context;

/**
 * Data controller for a {@link ConditionalCard}.
 */
public interface ConditionalCardController {

    /**
     * A stable ID for this card.
     *
     * @see {@link ConditionalCard#getId()}
     */
    long getId();

    /**
     * Whether or not the card is displayable on the ui.
     */
    boolean isDisplayable();

    /**
     * Handler when the card is clicked.
     */
    void onPrimaryClick(Context context);

    /**
     * Handler when the card action is clicked.
     */
    void onActionClick();

    void startMonitoringStateChange();

    void stopMonitoringStateChange();
}
