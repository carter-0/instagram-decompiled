package com.google.android.gms.common.api.internal;

import X.AnonymousClass0fD;
import X.Pxh;
import X.SMX;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;

public interface IStatusCallback extends IInterface {

    public abstract class Stub extends zab implements IStatusCallback {
        public Stub() {
            int A03 = AnonymousClass0fD.A03(1502747780);
            attachInterface(this, "com.google.android.gms.common.api.internal.IStatusCallback");
            AnonymousClass0fD.A0A(1912880798, A03);
            AnonymousClass0fD.A0A(1257834874, AnonymousClass0fD.A03(718259093));
        }

        public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = AnonymousClass0fD.A03(409316828);
            boolean z = true;
            if (i == 1) {
                SMX.A00(parcel);
                DfT((Status) Pxh.A0L(parcel, Status.CREATOR));
                i3 = -1572063994;
            } else {
                z = false;
                i3 = -1889013388;
            }
            AnonymousClass0fD.A0A(i3, A03);
            return z;
        }
    }

    void DfT(Status status);
}
