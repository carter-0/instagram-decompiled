package com.google.android.gms.internal.base;

import X.AnonymousClass0fD;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zab extends Binder implements IInterface {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r6.readInt() == 0) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        r1.createFromParcel(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        X.SMX.A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        r7.writeNoException();
        r1 = true;
        r0 = 1582938461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
        /*
            r4 = this;
            r3 = r4
            com.google.android.gms.signin.internal.zad r3 = (com.google.android.gms.signin.internal.zad) r3
            r0 = 532833864(0x1fc26648, float:8.2331406E-20)
            int r2 = X.AnonymousClass0fD.A03(r0)
            switch(r5) {
                case 3: goto L_0x0018;
                case 4: goto L_0x0026;
                case 5: goto L_0x000d;
                case 6: goto L_0x0026;
                case 7: goto L_0x0029;
                case 8: goto L_0x0043;
                case 9: goto L_0x0015;
                default: goto L_0x000d;
            }
        L_0x000d:
            r1 = 0
            r0 = -1661156465(0xffffffff9cfcc38f, float:-1.6726512E-21)
        L_0x0011:
            X.AnonymousClass0fD.A0A(r0, r2)
            return r1
        L_0x0015:
            android.os.Parcelable$Creator r1 = com.google.android.gms.signin.internal.zag.CREATOR
            goto L_0x0036
        L_0x0018:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.ConnectionResult.CREATOR
            int r0 = r6.readInt()
            if (r0 == 0) goto L_0x0023
            r1.createFromParcel(r6)
        L_0x0023:
            android.os.Parcelable$Creator r1 = com.google.android.gms.signin.internal.zaa.CREATOR
            goto L_0x0036
        L_0x0026:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.api.Status.CREATOR
            goto L_0x0036
        L_0x0029:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.api.Status.CREATOR
            int r0 = r6.readInt()
            if (r0 == 0) goto L_0x0034
            r1.createFromParcel(r6)
        L_0x0034:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
        L_0x0036:
            int r0 = r6.readInt()
            if (r0 == 0) goto L_0x003f
            r1.createFromParcel(r6)
        L_0x003f:
            X.SMX.A00(r6)
            goto L_0x0054
        L_0x0043:
            android.os.Parcelable$Creator r1 = com.google.android.gms.signin.internal.zak.CREATOR
            int r0 = r6.readInt()
            if (r0 != 0) goto L_0x005c
            r0 = 0
        L_0x004c:
            com.google.android.gms.signin.internal.zak r0 = (com.google.android.gms.signin.internal.zak) r0
            X.SMX.A00(r6)
            r3.FOP(r0)
        L_0x0054:
            r7.writeNoException()
            r1 = 1
            r0 = 1582938461(0x5e59b95d, float:3.92216826E18)
            goto L_0x0011
        L_0x005c:
            java.lang.Object r0 = r1.createFromParcel(r6)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.base.zab.A00(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-75446214, AnonymousClass0fD.A03(-1937372195));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean A00;
        int i3;
        int A03 = AnonymousClass0fD.A03(-187010873);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                A00 = true;
                i3 = 984591939;
            }
            A00 = A00(i, parcel, parcel2, i2);
            i3 = 714703134;
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            A00 = A00(i, parcel, parcel2, i2);
            i3 = 714703134;
        }
        AnonymousClass0fD.A0A(i3, A03);
        return A00;
    }
}
