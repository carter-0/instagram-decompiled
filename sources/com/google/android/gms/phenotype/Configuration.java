package com.google.android.gms.phenotype;

import X.AnonymousClass7TF;
import X.C301145yd;
import X.C9730Rfn;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Configuration extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = SWR.A00(65);
    public final int A00;
    public final Map A01 = new TreeMap();
    public final zzi[] A02;
    public final String[] A03;

    public final /* synthetic */ int compareTo(Object obj) {
        return this.A00 - ((Configuration) obj).A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        return this.A00 == configuration.A00 && C9730Rfn.A00(this.A01, configuration.A01) && Arrays.equals(this.A03, configuration.A03);
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("Configuration(");
        A16.append(this.A00);
        A16.append(", ");
        A16.append("(");
        Iterator A0v = AnonymousClass7TF.A0v(this.A01);
        while (A0v.hasNext()) {
            A16.append(A0v.next());
            A16.append(", ");
        }
        Pxg.A1P(")", ", ", "(", A16);
        String[] strArr = this.A03;
        if (strArr != null) {
            for (String append : strArr) {
                A16.append(append);
                A16.append(", ");
            }
        } else {
            A16.append("null");
        }
        A16.append(")");
        return AnonymousClass7TF.A0l(")", A16);
    }

    public Configuration(zzi[] zziArr, String[] strArr, int i) {
        this.A00 = i;
        this.A02 = zziArr;
        for (zzi zzi : zziArr) {
            this.A01.put(zzi.A01, zzi);
        }
        this.A03 = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A07(parcel, 2, this.A00);
        C301145yd.A0G(parcel, this.A02, 3, i);
        C301145yd.A0H(parcel, this.A03, 4);
        C301145yd.A06(parcel, A032);
    }
}
