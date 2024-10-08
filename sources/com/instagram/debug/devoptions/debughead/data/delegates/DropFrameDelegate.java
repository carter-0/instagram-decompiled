package com.instagram.debug.devoptions.debughead.data.delegates;

import X.0oU;
import X.0xI;
import X.C361488gJ;
import kotlin.enums.EnumEntries;

public interface DropFrameDelegate {

    public enum ScrollStatus {
        START,
        STOP;

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        /* access modifiers changed from: public */
        static {
            ScrollStatus[] $values;
            $ENTRIES = 0oU.A00($values);
        }
    }

    void onFrameDrop(String str, int i);

    void onRegisterModule(String str);

    void onScrollStatusChange(ScrollStatus scrollStatus);

    void onScrolled(int i, int i2);

    void reportScrollForDebug(0xI r1);

    void reportScrollForDebugNew(C361488gJ r1);
}
