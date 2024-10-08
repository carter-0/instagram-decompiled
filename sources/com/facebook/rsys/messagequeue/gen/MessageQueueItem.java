package com.facebook.rsys.messagequeue.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C22181Xwr;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class MessageQueueItem {
    public static 2LV CONVERTER = C22181Xwr.A00(4);
    public static long sMcfTypeId;
    public final int expiryTimeMsec;
    public final int id;
    public final McfReference message;

    public static native MessageQueueItem createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageQueueItem)) {
            return false;
        }
        MessageQueueItem messageQueueItem = (MessageQueueItem) obj;
        return this.id == messageQueueItem.id && this.expiryTimeMsec == messageQueueItem.expiryTimeMsec && this.message.equals(messageQueueItem.message);
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.message, (C66583MXo.A01(this.id) + this.expiryTimeMsec) * 31);
    }

    public MessageQueueItem(int i, int i2, McfReference mcfReference) {
        mcfReference.getClass();
        this.id = i;
        this.expiryTimeMsec = i2;
        this.message = mcfReference;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MessageQueueItem{id=");
        A1A.append(this.id);
        A1A.append(",expiryTimeMsec=");
        A1A.append(this.expiryTimeMsec);
        A1A.append(",message=");
        return C66582MXn.A0v(this.message, A1A);
    }
}
