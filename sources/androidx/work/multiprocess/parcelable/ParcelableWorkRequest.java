package androidx.work.multiprocess.parcelable;

import X.AnonymousClass3D7;
import X.AnonymousClass3DG;
import X.AnonymousClass7TE;
import X.C375659En;
import X.C41847B3o;
import X.C66580MXl;
import X.C7216Pzk;
import X.DbT;
import X.Pxg;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.UUID;

public class ParcelableWorkRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(80);
    public final C375659En A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C375659En r1 = this.A00;
        parcel.writeString(DbT.A10(r1.A02));
        parcel.writeStringList(AnonymousClass7TE.A1D(r1.A01));
        AnonymousClass3DG r3 = r1.A00;
        parcel.writeString(r3.A0I);
        parcel.writeString(r3.A0H);
        parcel.writeInt(AnonymousClass3D7.A00(r3.A0E));
        new ParcelableData(r3.A0C).writeToParcel(parcel, i);
        new ParcelableData(r3.A0D).writeToParcel(parcel, i);
        parcel.writeLong(r3.A05);
        parcel.writeLong(r3.A06);
        parcel.writeLong(r3.A04);
        parcel.writeInt(r3.A02);
        parcel.writeParcelable(new ParcelableConstraints(r3.A0B), i);
        int intValue = r3.A0F.intValue();
        int i2 = 1;
        if (intValue == 0) {
            i2 = 0;
        } else if (intValue != 1) {
            throw AnonymousClass7TE.A1K();
        }
        parcel.writeInt(i2);
        parcel.writeLong(r3.A03);
        parcel.writeLong(r3.A08);
        parcel.writeLong(r3.A0A);
        parcel.writeInt(r3.A0J ? 1 : 0);
        int intValue2 = r3.A0G.intValue();
        int i3 = 1;
        if (intValue2 == 0) {
            i3 = 0;
        } else if (intValue2 != 1) {
            throw AnonymousClass7TE.A1K();
        }
        parcel.writeInt(i3);
    }

    public ParcelableWorkRequest(Parcel parcel) {
        String readString = parcel.readString();
        HashSet A12 = C66580MXl.A12(parcel.createStringArrayList());
        AnonymousClass3DG r2 = new AnonymousClass3DG(readString, parcel.readString());
        r2.A0H = parcel.readString();
        r2.A0E = AnonymousClass3D7.A02(parcel.readInt());
        r2.A0C = new ParcelableData(parcel).A00;
        r2.A0D = new ParcelableData(parcel).A00;
        r2.A05 = parcel.readLong();
        r2.A06 = parcel.readLong();
        r2.A04 = parcel.readLong();
        r2.A02 = parcel.readInt();
        r2.A0B = ((ParcelableConstraints) C41847B3o.A03(parcel, getClass())).A00;
        r2.A0F = AnonymousClass3D7.A03(parcel.readInt());
        r2.A03 = parcel.readLong();
        r2.A08 = parcel.readLong();
        r2.A0A = parcel.readLong();
        r2.A0J = Pxg.A1U(parcel);
        r2.A0G = AnonymousClass3D7.A05(parcel.readInt());
        this.A00 = new C375659En(r2, A12, UUID.fromString(readString));
    }

    public ParcelableWorkRequest(C375659En r1) {
        this.A00 = r1;
    }
}
