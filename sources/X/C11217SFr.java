package X;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.SFr  reason: case insensitive filesystem */
public final class C11217SFr {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C11217SFr(Parcel parcel) {
        this.A04 = parcel.readLong();
        boolean z = false;
        this.A0A = AnonymousClass7TF.A1S(parcel.readByte(), 1);
        this.A08 = Pxj.A1W(parcel);
        this.A09 = Pxj.A1W(parcel);
        int readInt = parcel.readInt();
        ArrayList A0v = DbS.A0v(readInt);
        for (int i = 0; i < readInt; i++) {
            A0v.add(new C10459Rsa(parcel.readInt(), parcel.readLong()));
        }
        this.A06 = Collections.unmodifiableList(A0v);
        this.A05 = parcel.readLong();
        this.A07 = parcel.readByte() == 1 ? true : z;
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public C11217SFr(List list, int i, int i2, int i3, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = j;
        this.A0A = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j2;
        this.A07 = z4;
        this.A03 = j3;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }
}
