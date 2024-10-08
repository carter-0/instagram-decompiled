package com.google.android.gms.common.server.converter;

import X.AnonymousClass7TE;
import X.C13472Taz;
import X.Pxe;
import X.Pxf;
import X.Pxi;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class StringToIntConverter extends AbstractSafeParcelable implements C13472Taz {
    public static final Parcelable.Creator CREATOR = SWX.A00(42);
    public final int A00;
    public final SparseArray A01;
    public final HashMap A02;

    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = Pxi.A06(parcel, this.A00);
        ArrayList A1C = AnonymousClass7TE.A1C();
        HashMap hashMap = this.A02;
        Iterator A0u = Pxf.A0u(hashMap);
        while (A0u.hasNext()) {
            String A18 = AnonymousClass7TE.A18(A0u);
            A1C.add(new zac(A18, AnonymousClass7TE.A0M(hashMap.get(A18))));
        }
        Pxi.A16(parcel, A1C, 2, A06);
    }

    public StringToIntConverter(int i, ArrayList arrayList) {
        this.A00 = i;
        this.A02 = AnonymousClass7TE.A1E();
        this.A01 = Pxe.A0L();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zac = (zac) arrayList.get(i2);
            String str = zac.A02;
            int i3 = zac.A01;
            this.A02.put(str, Integer.valueOf(i3));
            this.A01.put(i3, str);
        }
    }

    public StringToIntConverter() {
        this.A00 = 1;
        this.A02 = AnonymousClass7TE.A1E();
        this.A01 = Pxe.A0L();
    }
}
