package com.google.android.gms.internal.mlkit_vision_text_common;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zza implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zza(String str, IBinder iBinder) {
        int A03 = AnonymousClass0fD.A03(-1733163431);
        this.A00 = iBinder;
        this.A01 = str;
        AnonymousClass0fD.A0A(1374478656, A03);
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(213297439);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(1402986701, A03);
        return iBinder;
    }

    public final Parcel A00() {
        int A03 = AnonymousClass0fD.A03(1681264973);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        AnonymousClass0fD.A0A(-2125490481, A03);
        return obtain;
    }

    public final Parcel A01(Parcel parcel, int i) {
        int A03 = AnonymousClass0fD.A03(1177033838);
        parcel = Parcel.obtain();
        try {
            AnonymousClass7TH.A0N(this.A00, parcel, parcel, i);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
            AnonymousClass0fD.A0A(886701148, A03);
        }
    }

    public final void A02(Parcel parcel, int i) {
        int A03 = AnonymousClass0fD.A03(-1335711506);
        Parcel obtain = Parcel.obtain();
        try {
            AnonymousClass7TH.A0N(this.A00, parcel, obtain, i);
        } finally {
            parcel.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(1724044070, A03);
        }
    }
}
