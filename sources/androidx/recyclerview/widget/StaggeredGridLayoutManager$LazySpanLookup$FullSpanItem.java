package androidx.recyclerview.widget;

import X.AnonymousClass7TE;
import X.C7216Pzk;
import X.Pxg;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(63);
    public int A00;
    public int A01;
    public boolean A02;
    public int[] A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int length;
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        int[] iArr = this.A03;
        if (iArr == null || (length = iArr.length) <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(length);
        parcel.writeIntArray(this.A03);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FullSpanItem{mPosition=");
        A1A.append(this.A01);
        A1A.append(", mGapDir=");
        A1A.append(this.A00);
        A1A.append(", mHasUnwantedGapAfter=");
        A1A.append(this.A02);
        A1A.append(", mGapPerSpan=");
        A1A.append(Arrays.toString(this.A03));
        return Pxg.A0x(A1A);
    }
}
