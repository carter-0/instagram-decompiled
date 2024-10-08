package com.facebook.rsys.messagequeue.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C22181Xwr;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class MessageQueue {
    public static 2LV CONVERTER = C22181Xwr.A00(3);
    public static long sMcfTypeId;
    public final ArrayList items;
    public final String name;

    public static native MessageQueue createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageQueue)) {
            return false;
        }
        MessageQueue messageQueue = (MessageQueue) obj;
        return this.name.equals(messageQueue.name) && this.items.equals(messageQueue.items);
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.items, C66583MXo.A06(this.name));
    }

    public MessageQueue(String str, ArrayList arrayList) {
        str.getClass();
        arrayList.getClass();
        this.name = str;
        this.items = arrayList;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MessageQueue{name=");
        A1A.append(this.name);
        A1A.append(",items=");
        return C66582MXn.A0v(this.items, A1A);
    }
}
