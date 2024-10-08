package com.facebook.react.uimanager.events;

import X.C13948Tm8;
import X.C7842QbP;

public interface RCTModernEventEmitter extends RCTEventEmitter {
    void receiveEvent(int i, int i2, String str, C13948Tm8 tm8);

    void receiveEvent(int i, int i2, String str, boolean z, int i3, C13948Tm8 tm8, int i4);

    @Deprecated
    void receiveTouches(C7842QbP qbP);
}
