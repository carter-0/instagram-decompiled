package com.google.android.gms.common;

import X.C301145yd;
import X.Pxf;
import X.Pxi;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(53);
    public final zzj A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.google.android.gms.common.internal.zzaa} */
    /* JADX WARNING: type inference failed for: r2v2, types: [com.google.android.gms.common.internal.zzaa] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzs(android.os.IBinder r7, java.lang.String r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            java.lang.String r4 = "Could not unwrap certificate"
            java.lang.String r3 = "GoogleCertificatesQuery"
            r6.<init>()
            r6.A01 = r8
            r5 = 0
            if (r7 == 0) goto L_0x0044
            java.lang.String r1 = "com.google.android.gms.common.internal.ICertData"
            android.os.IInterface r2 = r7.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0032 }
            boolean r0 = r2 instanceof com.google.android.gms.common.internal.zzaa     // Catch:{ RemoteException -> 0x0032 }
            if (r0 == 0) goto L_0x001f
            com.google.android.gms.common.internal.zzaa r2 = (com.google.android.gms.common.internal.zzaa) r2     // Catch:{ RemoteException -> 0x0032 }
        L_0x0018:
            com.google.android.gms.dynamic.IObjectWrapper r0 = r2.FPT()     // Catch:{ RemoteException -> 0x0032 }
            if (r0 == 0) goto L_0x004b
            goto L_0x0037
        L_0x001f:
            com.google.android.gms.common.internal.zzy r2 = new com.google.android.gms.common.internal.zzy     // Catch:{ RemoteException -> 0x0032 }
            r2.<init>(r1, r7)     // Catch:{ RemoteException -> 0x0032 }
            r0 = 1018010375(0x3cad9b07, float:0.021192087)
            int r1 = X.AnonymousClass0fD.A03(r0)     // Catch:{ RemoteException -> 0x0032 }
            r0 = -1403327283(0xffffffffac5aeccd, float:-3.1111114E-12)
            X.AnonymousClass0fD.A0A(r0, r1)     // Catch:{ RemoteException -> 0x0032 }
            goto L_0x0018
        L_0x0032:
            r0 = move-exception
            android.util.Log.e(r3, r4, r0)
            goto L_0x0044
        L_0x0037:
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.A00(r0)
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L_0x004b
            com.google.android.gms.common.zzk r5 = new com.google.android.gms.common.zzk
            r5.<init>(r0)
        L_0x0044:
            r6.A00 = r5
            r6.A02 = r9
            r6.A03 = r10
            return
        L_0x004b:
            android.util.Log.e(r3, r4)
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.zzs.<init>(android.os.IBinder, java.lang.String, boolean, boolean):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.A01;
        int A032 = Pxf.A03(parcel);
        Pxi.A13(parcel, str);
        zzj zzj = this.A00;
        if (zzj == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zzj = null;
        }
        C301145yd.A03(zzj, parcel, 2);
        C301145yd.A09(parcel, 3, this.A02);
        C301145yd.A09(parcel, 4, this.A03);
        C301145yd.A06(parcel, A032);
    }
}
