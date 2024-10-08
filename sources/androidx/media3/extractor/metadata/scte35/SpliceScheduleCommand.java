package androidx.media3.extractor.metadata.scte35;

import X.C10346Rqj;
import X.C10826Rym;
import X.C7216Pzk;
import X.DbS;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(51);
    public final List A00;

    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.A00;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C10826Rym rym = (C10826Rym) list.get(i2);
            parcel.writeLong(rym.A04);
            parcel.writeByte(rym.A0A ? (byte) 1 : 0);
            parcel.writeByte(rym.A08 ? (byte) 1 : 0);
            parcel.writeByte(rym.A09 ? (byte) 1 : 0);
            List list2 = rym.A06;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                C10346Rqj rqj = (C10346Rqj) list2.get(i3);
                parcel.writeInt(rqj.A00);
                parcel.writeLong(rqj.A01);
            }
            parcel.writeLong(rym.A05);
            parcel.writeByte(rym.A07 ? (byte) 1 : 0);
            parcel.writeLong(rym.A03);
            parcel.writeInt(rym.A02);
            parcel.writeInt(rym.A00);
            parcel.writeInt(rym.A01);
        }
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList A0v = DbS.A0v(readInt);
        for (int i = 0; i < readInt; i++) {
            A0v.add(new C10826Rym(parcel));
        }
        this.A00 = Collections.unmodifiableList(A0v);
    }
}
