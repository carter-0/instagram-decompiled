package com.google.android.gms.common.server.response;

import X.AnonymousClass7TE;
import X.C301145yd;
import X.DbV;
import X.Pxi;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(47);
    public final int A00;
    public final String A01;
    public final ArrayList A02;

    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = Pxi.A06(parcel, this.A00);
        C301145yd.A0B(parcel, this.A01);
        C301145yd.A0E(parcel, this.A02, 3, false);
        C301145yd.A06(parcel, A06);
    }

    public zal(String str, ArrayList arrayList, int i) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = arrayList;
    }

    public zal(String str, Map map) {
        ArrayList A1C;
        this.A00 = 1;
        this.A01 = str;
        if (map == null) {
            A1C = null;
        } else {
            A1C = AnonymousClass7TE.A1C();
            Iterator A16 = DbV.A16(map);
            while (A16.hasNext()) {
                String A18 = AnonymousClass7TE.A18(A16);
                A1C.add(new zam((FastJsonResponse$Field) map.get(A18), A18));
            }
        }
        this.A02 = A1C;
    }
}
