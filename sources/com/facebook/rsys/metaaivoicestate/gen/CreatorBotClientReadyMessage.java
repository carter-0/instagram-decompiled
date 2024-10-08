package com.facebook.rsys.metaaivoicestate.gen;

import X.002;
import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;

public class CreatorBotClientReadyMessage {
    public static 2LV CONVERTER = C22181Xwr.A00(5);
    public static long sMcfTypeId;
    public final boolean ready;

    public static native CreatorBotClientReadyMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CreatorBotClientReadyMessage) && this.ready == ((CreatorBotClientReadyMessage) obj).ready;
        }
        return true;
    }

    public int hashCode() {
        return true + (this.ready ? 1 : 0);
    }

    public String toString() {
        return 002.A1B("CreatorBotClientReadyMessage{ready=", "}", this.ready);
    }

    public CreatorBotClientReadyMessage(boolean z) {
        this.ready = z;
    }
}
