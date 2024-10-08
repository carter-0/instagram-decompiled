package X;

import android.os.Parcel;
import android.util.SparseIntArray;

public final class N00 extends C71006OWm {
    public int A00;
    public int A01;
    public int A02;
    public final int A03;
    public final int A04;
    public final Parcel A05;
    public final SparseIntArray A06;
    public final String A07;

    public N00(Parcel parcel) {
        this(parcel, new 01r(0), new 01r(0), new 01r(0), "", parcel.dataPosition(), parcel.dataSize());
    }

    public N00(Parcel parcel, 01r r3, 01r r4, 01r r5, String str, int i, int i2) {
        super(r3, r4, r5);
        this.A06 = new SparseIntArray();
        this.A00 = -1;
        this.A01 = -1;
        this.A05 = parcel;
        this.A04 = i;
        this.A03 = i2;
        this.A02 = i;
        this.A07 = str;
    }
}
