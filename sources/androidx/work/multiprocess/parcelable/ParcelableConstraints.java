package androidx.work.multiprocess.parcelable;

import X.00k;
import X.0qQ;
import X.AnonymousClass3D7;
import X.C255343ty;
import X.C66580MXl;
import X.C7216Pzk;
import X.DbS;
import X.Pxg;
import X.S47;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ParcelableConstraints implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(68);
    public final C255343ty A00;

    public final int describeContents() {
        return 0;
    }

    public ParcelableConstraints(Parcel parcel) {
        LinkedHashSet A0y = DbS.A0y();
        Integer A04 = AnonymousClass3D7.A04(parcel.readInt());
        0qQ.A0B(A04, 0);
        boolean A1U = Pxg.A1U(parcel);
        boolean A1U2 = Pxg.A1U(parcel);
        boolean A1U3 = Pxg.A1U(parcel);
        boolean A1U4 = Pxg.A1U(parcel);
        if (parcel.readInt() == 1) {
            for (S47 s47 : AnonymousClass3D7.A06(parcel.createByteArray())) {
                A0y.add(new S47(s47.A01, s47.A00));
            }
        }
        long readLong = parcel.readLong();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long millis = timeUnit.toMillis(readLong);
        this.A00 = new C255343ty(A04, 00k.A0k(A0y), timeUnit.toMillis(parcel.readLong()), millis, A1U2, A1U4, A1U, A1U3);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C255343ty r3 = this.A00;
        parcel.writeInt(AnonymousClass3D7.A01(r3.A02));
        parcel.writeInt(r3.A04 ? 1 : 0);
        parcel.writeInt(r3.A05 ? 1 : 0);
        parcel.writeInt(r3.A07 ? 1 : 0);
        parcel.writeInt(r3.A06 ? 1 : 0);
        int i2 = 1;
        Set set = r3.A03;
        if (!C66580MXl.A1b(set)) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (i2 != 0) {
            parcel.writeByteArray(AnonymousClass3D7.A07(set));
        }
        parcel.writeLong(r3.A00);
        parcel.writeLong(r3.A01);
    }

    public ParcelableConstraints(C255343ty r1) {
        this.A00 = r1;
    }
}
