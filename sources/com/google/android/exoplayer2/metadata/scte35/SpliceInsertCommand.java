package com.google.android.exoplayer2.metadata.scte35;

import X.AnonymousClass7TF;
import X.C10595Rup;
import X.DbS;
import X.Pxj;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = SWW.A00(68);
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : 0);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        parcel.writeByte(this.A0A ? (byte) 1 : 0);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        List list = this.A07;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C10595Rup rup = (C10595Rup) list.get(i2);
            parcel.writeInt(rup.A00);
            parcel.writeLong(rup.A02);
            parcel.writeLong(rup.A01);
        }
        parcel.writeByte(this.A08 ? (byte) 1 : 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        boolean z = false;
        this.A0B = AnonymousClass7TF.A1S(parcel.readByte(), 1);
        this.A09 = Pxj.A1W(parcel);
        this.A0A = Pxj.A1W(parcel);
        this.A0C = Pxj.A1W(parcel);
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList A0v = DbS.A0v(readInt);
        for (int i = 0; i < readInt; i++) {
            A0v.add(new C10595Rup(parcel.readLong(), parcel.readLong(), parcel.readInt()));
        }
        this.A07 = Collections.unmodifiableList(A0v);
        this.A08 = parcel.readByte() == 1 ? true : z;
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public SpliceInsertCommand(List list, int i, int i2, int i3, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A06 = j;
        this.A0B = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A0C = z4;
        this.A05 = j2;
        this.A04 = j3;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z5;
        this.A03 = j4;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }
}
