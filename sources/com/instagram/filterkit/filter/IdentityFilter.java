package com.instagram.filterkit.filter;

import X.AnonymousClass7TF;
import X.C14271Tsu;
import X.C41847B3o;
import X.Pxg;
import X.Um6;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.math.matrix.Matrix4;

public class IdentityFilter extends BaseSimpleFilter {
    public static final Parcelable.Creator CREATOR = new W6E(47);
    public C14271Tsu A00;
    public Um6 A01;
    public boolean A02;
    public boolean A03;
    public final Matrix4 A04;

    public IdentityFilter(Parcel parcel) {
        super(parcel);
        Matrix4 matrix4 = new Matrix4();
        this.A04 = matrix4;
        Parcelable A032 = C41847B3o.A03(parcel, Matrix4.class);
        A032.getClass();
        matrix4.A04((Matrix4) A032);
        this.A03 = AnonymousClass7TF.A1S(parcel.readInt(), 1);
        this.A02 = Pxg.A1V(parcel);
    }

    public IdentityFilter() {
        this.A04 = new Matrix4();
    }
}
