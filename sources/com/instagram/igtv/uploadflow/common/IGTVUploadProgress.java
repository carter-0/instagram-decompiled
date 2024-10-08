package com.instagram.igtv.uploadflow.common;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C62581KiE;
import X.JTU;
import X.L8E;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IGTVUploadProgress implements Parcelable {
    public static final W6E CREATOR = new W6E(76);
    public C62581KiE A00;
    public final L8E A01;

    public IGTVUploadProgress() {
        this((C62581KiE) null, (L8E) null, (DefaultConstructorMarker) null, 3);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A00);
        L8E l8e = this.A01;
        parcel.writeInt(l8e.A02 ? 1 : 0);
        parcel.writeInt(l8e.A01 ? 1 : 0);
        parcel.writeInt(l8e.A00 ? 1 : 0);
        parcel.writeInt(l8e.A03 ? 1 : 0);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.L8E] */
    public IGTVUploadProgress(Parcel parcel) {
        String readString = parcel.readString();
        C62581KiE valueOf = C62581KiE.valueOf(readString == null ? "START" : readString);
        ? obj = new Object();
        obj.A02 = false;
        obj.A01 = false;
        obj.A00 = false;
        obj.A03 = false;
        0qQ.A0B(valueOf, 1);
        this.A00 = valueOf;
        this.A01 = obj;
        obj.A02 = JTU.A1Q(parcel);
        obj.A01 = JTU.A1Q(parcel);
        obj.A00 = JTU.A1Q(parcel);
        obj.A03 = JTU.A1Q(parcel);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.L8E] */
    public /* synthetic */ IGTVUploadProgress(C62581KiE kiE, L8E l8e, DefaultConstructorMarker defaultConstructorMarker, int i) {
        C62581KiE kiE2 = C62581KiE.START;
        ? obj = new Object();
        obj.A02 = false;
        obj.A01 = false;
        obj.A00 = false;
        obj.A03 = false;
        0qQ.A0B(kiE2, 1);
        this.A00 = kiE2;
        this.A01 = obj;
    }
}
