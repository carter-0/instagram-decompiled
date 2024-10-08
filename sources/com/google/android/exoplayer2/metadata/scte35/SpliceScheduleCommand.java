package com.google.android.exoplayer2.metadata.scte35;

import X.C10459Rsa;
import X.C11217SFr;
import X.DbS;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = SWW.A00(70);
    public final List A00;

    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.A00;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C11217SFr sFr = (C11217SFr) list.get(i2);
            parcel.writeLong(sFr.A04);
            parcel.writeByte(sFr.A0A ? (byte) 1 : 0);
            parcel.writeByte(sFr.A08 ? (byte) 1 : 0);
            parcel.writeByte(sFr.A09 ? (byte) 1 : 0);
            List list2 = sFr.A06;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                C10459Rsa rsa = (C10459Rsa) list2.get(i3);
                parcel.writeInt(rsa.A00);
                parcel.writeLong(rsa.A01);
            }
            parcel.writeLong(sFr.A05);
            parcel.writeByte(sFr.A07 ? (byte) 1 : 0);
            parcel.writeLong(sFr.A03);
            parcel.writeInt(sFr.A02);
            parcel.writeInt(sFr.A00);
            parcel.writeInt(sFr.A01);
        }
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList A0v = DbS.A0v(readInt);
        for (int i = 0; i < readInt; i++) {
            A0v.add(new C11217SFr(parcel));
        }
        this.A00 = Collections.unmodifiableList(A0v);
    }

    public SpliceScheduleCommand(List list) {
        this.A00 = Collections.unmodifiableList(list);
    }
}
