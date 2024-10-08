package com.meta.flytrap.attachment.model;

import X.002;
import X.0qQ;
import X.AnonymousClass00P;
import X.C255463uA;
import X.C255533uI;
import X.C255543uJ;
import X.C41847B3o;
import X.C73538PeU;
import X.SWU;
import X.VJ6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Serializable
public final class AttachmentCounter implements Parcelable {
    public static final SerialDescriptor A01;
    public static final Parcelable.Creator CREATOR = new SWU(18);
    public static final Companion Companion = new Object();
    public final ArrayList A00;

    public final class Companion {
        public final C255463uA serializer(C255463uA r2) {
            0qQ.A0B(r2, 0);
            return new C73538PeU(r2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.meta.flytrap.attachment.model.AttachmentCounter$Companion] */
    static {
        C255543uJ r1 = new C255543uJ("com.meta.flytrap.attachment.model.AttachmentCounter", (C255533uI) null, 1);
        r1.A00("stack");
        A01 = r1;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        ArrayList arrayList = this.A00;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C41847B3o.A1I(parcel, it, i);
        }
    }

    public /* synthetic */ AttachmentCounter(ArrayList arrayList, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = arrayList;
        }
    }

    public final String toString() {
        return 002.A0I("AttachmentCounter(count=", ')', this.A00.size());
    }

    public AttachmentCounter(ArrayList arrayList) {
        this.A00 = arrayList;
    }
}
