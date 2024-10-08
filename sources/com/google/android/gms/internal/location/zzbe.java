package com.google.android.gms.internal.location;

import X.C301145yd;
import X.Pxf;
import X.Pxi;
import X.SWR;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzap;
import com.google.android.gms.location.zzaq;

public final class zzbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(23);
    public int A00;
    public PendingIntent A01;
    public zzai A02;
    public zzbc A03;
    public zzap A04;
    public zzaq A05;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.google.android.gms.location.zzaq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.google.android.gms.location.zzap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.google.android.gms.location.zzap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: com.google.android.gms.location.zzaq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.google.android.gms.location.zzaq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: com.google.android.gms.location.zzap} */
    /* JADX WARNING: type inference failed for: r3v3, types: [com.google.android.gms.internal.location.zzb] */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzbe(android.app.PendingIntent r5, android.os.IBinder r6, android.os.IBinder r7, android.os.IBinder r8, com.google.android.gms.internal.location.zzbc r9, int r10) {
        /*
            r4 = this;
            r4.<init>()
            r4.A00 = r10
            r4.A03 = r9
            r3 = 0
            if (r6 != 0) goto L_0x0058
            r2 = r3
        L_0x000b:
            r4.A05 = r2
            r4.A01 = r5
            if (r7 != 0) goto L_0x0038
            r2 = r3
        L_0x0012:
            r4.A04 = r2
            if (r8 == 0) goto L_0x0022
            java.lang.String r1 = "com.google.android.gms.location.internal.IFusedLocationProviderCallback"
            android.os.IInterface r3 = r8.queryLocalInterface(r1)
            boolean r0 = r3 instanceof com.google.android.gms.internal.location.zzai
            if (r0 == 0) goto L_0x0025
            com.google.android.gms.internal.location.zzai r3 = (com.google.android.gms.internal.location.zzai) r3
        L_0x0022:
            r4.A02 = r3
            return
        L_0x0025:
            com.google.android.gms.internal.location.zzak r3 = new com.google.android.gms.internal.location.zzak
            r3.<init>(r1, r8)
            r0 = -1820971121(0xffffffff93762f8f, float:-3.1073013E-27)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = -911171265(0xffffffffc9b0a13f, float:-1446951.9)
            X.AnonymousClass0fD.A0A(r0, r1)
            goto L_0x0022
        L_0x0038:
            java.lang.String r1 = "com.google.android.gms.location.ILocationCallback"
            android.os.IInterface r2 = r7.queryLocalInterface(r1)
            boolean r0 = r2 instanceof com.google.android.gms.location.zzap
            if (r0 == 0) goto L_0x0045
            com.google.android.gms.location.zzap r2 = (com.google.android.gms.location.zzap) r2
            goto L_0x0012
        L_0x0045:
            com.google.android.gms.location.zzar r2 = new com.google.android.gms.location.zzar
            r2.<init>(r1, r7)
            r0 = -1821358649(0xffffffff937045c7, float:-3.0326662E-27)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = 40883946(0x26fd6ea, float:1.7620624E-37)
            X.AnonymousClass0fD.A0A(r0, r1)
            goto L_0x0012
        L_0x0058:
            java.lang.String r1 = "com.google.android.gms.location.ILocationListener"
            android.os.IInterface r2 = r6.queryLocalInterface(r1)
            boolean r0 = r2 instanceof com.google.android.gms.location.zzaq
            if (r0 == 0) goto L_0x0065
            com.google.android.gms.location.zzaq r2 = (com.google.android.gms.location.zzaq) r2
            goto L_0x000b
        L_0x0065:
            com.google.android.gms.location.zzas r2 = new com.google.android.gms.location.zzas
            r2.<init>(r1, r6)
            r0 = 1722998234(0x66b2ddda, float:4.2233684E23)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = 147939916(0x8d1624c, float:1.2601839E-33)
            X.AnonymousClass0fD.A0A(r0, r1)
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbe.<init>(android.app.PendingIntent, android.os.IBinder, android.os.IBinder, android.os.IBinder, com.google.android.gms.internal.location.zzbc, int):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        int A032 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A00);
        boolean A1R = Pxi.A1R(parcel, this.A03, i);
        zzaq zzaq = this.A05;
        IBinder iBinder = null;
        if (zzaq == null) {
            asBinder = null;
        } else {
            asBinder = zzaq.asBinder();
        }
        C301145yd.A03(asBinder, parcel, 3);
        C301145yd.A0A(parcel, this.A01, 4, i, A1R);
        zzap zzap = this.A04;
        if (zzap == null) {
            asBinder2 = null;
        } else {
            asBinder2 = zzap.asBinder();
        }
        C301145yd.A03(asBinder2, parcel, 5);
        zzai zzai = this.A02;
        if (zzai != null) {
            iBinder = zzai.asBinder();
        }
        C301145yd.A03(iBinder, parcel, 6);
        C301145yd.A06(parcel, A032);
    }
}
