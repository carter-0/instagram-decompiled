package com.instagram.creation.cameraconfiguration;

import X.00k;
import X.0qQ;
import X.0sr;
import X.AnonymousClass00P;
import X.C279284yO;
import X.C338817ia;
import X.C358088aL;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashSet;
import java.util.Set;

public final class CameraConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(81);
    public boolean A00 = true;
    public boolean A01 = true;
    public boolean A02;
    public final C279284yO A03;
    public final Set A04;

    public CameraConfiguration(Parcel parcel) {
        boolean z = true;
        this.A03 = C338817ia.A00(parcel.readString());
        int[] createIntArray = parcel.createIntArray();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (createIntArray != null) {
            for (int i : createIntArray) {
                linkedHashSet.add(C358088aL.values()[i]);
            }
        }
        this.A04 = 00k.A0k(linkedHashSet);
        this.A00 = parcel.readInt() == 1;
        this.A02 = parcel.readInt() == 1;
        this.A01 = parcel.readInt() != 1 ? false : z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03.A02);
        Set set = this.A04;
        int[] iArr = new int[set.size()];
        int i2 = 0;
        for (Object next : set) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            } else {
                iArr[i2] = ((C358088aL) next).ordinal();
                i2 = i3;
            }
        }
        parcel.writeIntArray(iArr);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public CameraConfiguration(C279284yO r3, Set set, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(set, 1);
        0qQ.A0B(r3, 2);
        this.A04 = 00k.A0k(set);
        this.A03 = r3;
        this.A00 = z;
        this.A02 = z2;
        this.A01 = z3;
    }

    public CameraConfiguration(C279284yO r2, Set set) {
        0qQ.A0B(set, 1);
        this.A04 = 00k.A0k(set);
        this.A03 = r2;
    }
}
