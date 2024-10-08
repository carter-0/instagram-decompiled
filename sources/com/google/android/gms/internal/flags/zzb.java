package com.google.android.gms.internal.flags;

import X.AnonymousClass0fD;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class zzb extends Binder implements IInterface {
    public IBinder asBinder() {
        AnonymousClass0fD.A0A(-752924833, AnonymousClass0fD.A03(829104579));
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) {
        /*
            r7 = this;
            r0 = 2082162106(0x7c1b45ba, float:3.224881E36)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r8 <= r0) goto L_0x001a
            boolean r0 = super.onTransact(r8, r9, r10, r11)
            if (r0 == 0) goto L_0x001d
            r1 = 1
            r0 = -2144055115(0xffffffff803450b5, float:-4.804398E-39)
        L_0x0016:
            X.AnonymousClass0fD.A0A(r0, r3)
            return r1
        L_0x001a:
            X.Pxf.A14(r7, r9)
        L_0x001d:
            r5 = r7
            com.google.android.gms.flags.impl.FlagProviderImpl r5 = (com.google.android.gms.flags.impl.FlagProviderImpl) r5
            r0 = -1546929479(0xffffffffa3cbbab9, float:-2.2088384E-17)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 1
            if (r8 == r0) goto L_0x0080
            r0 = 2
            if (r8 == r0) goto L_0x0069
            r0 = 3
            if (r8 == r0) goto L_0x0058
            r0 = 4
            if (r8 == r0) goto L_0x0041
            r0 = 5
            if (r8 == r0) goto L_0x008f
            r0 = -1291390846(0xffffffffb306f082, float:-3.1418047E-8)
            X.AnonymousClass0fD.A0A(r0, r4)
            r1 = 0
        L_0x003d:
            r0 = -1923412358(0xffffffff8d5b0e7a, float:-6.750201E-31)
            goto L_0x0016
        L_0x0041:
            java.lang.String r6 = r9.readString()
            long r0 = r9.readLong()
            int r2 = r9.readInt()
            long r0 = r5.getLongFlagValue(r6, r0, r2)
            r10.writeNoException()
            r10.writeLong(r0)
            goto L_0x00a5
        L_0x0058:
            java.lang.String r2 = r9.readString()
            int r1 = r9.readInt()
            int r0 = r9.readInt()
            int r0 = r5.getIntFlagValue(r2, r1, r0)
            goto L_0x0079
        L_0x0069:
            java.lang.String r2 = r9.readString()
            boolean r1 = X.C41848B3p.A1X(r9)
            int r0 = r9.readInt()
            boolean r0 = r5.getBooleanFlagValue(r2, r1, r0)
        L_0x0079:
            r10.writeNoException()
            r10.writeInt(r0)
            goto L_0x00a5
        L_0x0080:
            android.os.IBinder r0 = r9.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.IObjectWrapper.Stub.A01(r0)
            r5.init(r0)
            r10.writeNoException()
            goto L_0x00a5
        L_0x008f:
            java.lang.String r2 = r9.readString()
            java.lang.String r1 = r9.readString()
            int r0 = r9.readInt()
            java.lang.String r0 = r5.getStringFlagValue(r2, r1, r0)
            r10.writeNoException()
            r10.writeString(r0)
        L_0x00a5:
            r0 = -1492930898(0xffffffffa703aeae, float:-1.8274596E-15)
            X.AnonymousClass0fD.A0A(r0, r4)
            r1 = 1
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.flags.zzb.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
