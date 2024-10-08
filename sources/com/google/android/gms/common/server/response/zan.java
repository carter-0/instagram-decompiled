package com.google.android.gms.common.server.response;

import X.AnonymousClass3Qk;
import X.AnonymousClass7TE;
import X.C301145yd;
import X.DbV;
import X.Pxf;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(46);
    public final int A00;
    public final String A01;
    public final HashMap A02;

    public zan(String str, ArrayList arrayList, int i) {
        this.A00 = i;
        HashMap A1E = AnonymousClass7TE.A1E();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = (zal) arrayList.get(i2);
            String str2 = zal.A01;
            HashMap A1E2 = AnonymousClass7TE.A1E();
            ArrayList arrayList2 = zal.A02;
            AnonymousClass3Qk.A02(arrayList2);
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = (zam) zal.A02.get(i3);
                A1E2.put(zam.A02, zam.A01);
            }
            A1E.put(str2, A1E2);
        }
        this.A02 = A1E;
        AnonymousClass3Qk.A02(str);
        this.A01 = str;
        Iterator A0u = Pxf.A0u(A1E);
        while (A0u.hasNext()) {
            Map map = (Map) A1E.get(A0u.next());
            Iterator A16 = DbV.A16(map);
            while (A16.hasNext()) {
                ((FastJsonResponse$Field) map.get(A16.next())).A00 = this;
            }
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        HashMap hashMap = this.A02;
        Iterator A0u = Pxf.A0u(hashMap);
        while (A0u.hasNext()) {
            String A18 = AnonymousClass7TE.A18(A0u);
            A1A.append(A18);
            A1A.append(":\n");
            Map map = (Map) hashMap.get(A18);
            Iterator A16 = DbV.A16(map);
            while (A16.hasNext()) {
                String A182 = AnonymousClass7TE.A18(A16);
                A1A.append("  ");
                A1A.append(A182);
                A1A.append(": ");
                A1A.append(map.get(A182));
            }
        }
        return A1A.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A00);
        ArrayList A1C = AnonymousClass7TE.A1C();
        HashMap hashMap = this.A02;
        Iterator A0u = Pxf.A0u(hashMap);
        while (A0u.hasNext()) {
            String A18 = AnonymousClass7TE.A18(A0u);
            A1C.add(new zal(A18, (Map) hashMap.get(A18)));
        }
        C301145yd.A0E(parcel, A1C, 2, false);
        C301145yd.A0C(parcel, this.A01, 3, false);
        C301145yd.A06(parcel, A03);
    }
}
