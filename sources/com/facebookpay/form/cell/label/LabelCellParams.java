package com.facebookpay.form.cell.label;

import X.AnonymousClass7TE;
import X.C10782Ry3;
import X.C8028QfI;
import X.Pxe;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;
import com.fbpay.hub.common.link.LinkParams;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Collection;

public class LabelCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = SWV.A00(68);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final ImmutableList A07;
    public final String A08;

    public final int describeContents() {
        return 0;
    }

    public LabelCellParams(Parcel parcel) {
        super(parcel);
        this.A08 = parcel.readString();
        this.A03 = parcel.readInt();
        ArrayList A1C = AnonymousClass7TE.A1C();
        Pxe.A1O(parcel, LinkParams.class, A1C);
        this.A07 = ImmutableList.copyOf((Collection) A1C);
        this.A04 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A03);
        parcel.writeList(this.A07);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A01);
    }

    public LabelCellParams(C8028QfI qfI) {
        super((C10782Ry3) qfI);
        this.A08 = null;
        this.A03 = qfI.A03;
        this.A07 = qfI.A06;
        this.A04 = qfI.A07 ? R.layout.hub_cell_header : R.layout.hub_cell_label;
        this.A05 = qfI.A04;
        this.A00 = qfI.A00;
        this.A02 = qfI.A02;
        this.A06 = qfI.A05;
        this.A01 = qfI.A01;
    }
}
