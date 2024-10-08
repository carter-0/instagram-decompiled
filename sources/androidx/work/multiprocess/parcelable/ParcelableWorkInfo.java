package androidx.work.multiprocess.parcelable;

import X.0qQ;
import X.AnonymousClass3D7;
import X.AnonymousClass7TE;
import X.C11028S6g;
import X.C2379139t;
import X.C255323tw;
import X.C255343ty;
import X.C51974G9v;
import X.C7216Pzk;
import X.Pxf;
import X.S5P;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.UUID;

public class ParcelableWorkInfo implements Parcelable {
    public static final String[] A01 = new String[0];
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(77);
    public final C11028S6g A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C11028S6g s6g = this.A00;
        parcel.writeString(s6g.A07.toString());
        parcel.writeInt(AnonymousClass3D7.A00(s6g.A05));
        new ParcelableData(s6g.A03).writeToParcel(parcel, i);
        parcel.writeStringArray((String[]) AnonymousClass7TE.A1D(s6g.A06).toArray(A01));
        new ParcelableData(s6g.A04).writeToParcel(parcel, i);
        parcel.writeInt(s6g.A01);
        parcel.writeInt(s6g.A00);
    }

    public ParcelableWorkInfo(Parcel parcel) {
        Parcel parcel2 = parcel;
        UUID fromString = UUID.fromString(parcel2.readString());
        C2379139t A02 = AnonymousClass3D7.A02(parcel2.readInt());
        C255323tw r2 = new ParcelableData(parcel2).A00;
        HashSet A0s = Pxf.A0s(parcel2.createStringArray());
        C255323tw r3 = new ParcelableData(parcel2).A00;
        int readInt = parcel2.readInt();
        int readInt2 = parcel2.readInt();
        C51974G9v.A1L(fromString, A02, r2);
        0qQ.A0B(r3, 5);
        this.A00 = new C11028S6g(C255343ty.A08, r2, r3, (S5P) null, A02, A0s, fromString, readInt, readInt2, -256, 0, Long.MAX_VALUE);
    }

    public ParcelableWorkInfo(C11028S6g s6g) {
        this.A00 = s6g;
    }
}
