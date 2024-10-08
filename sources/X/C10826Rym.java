package X;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Rym  reason: case insensitive filesystem */
public final class C10826Rym {
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

    public C10826Rym(Parcel parcel) {
        this.A04 = parcel.readLong();
        boolean z = false;
        this.A0A = AnonymousClass7TF.A1S(parcel.readByte(), 1);
        this.A08 = Pxj.A1W(parcel);
        this.A09 = Pxj.A1W(parcel);
        int readInt = parcel.readInt();
        ArrayList A0v = DbS.A0v(readInt);
        for (int i = 0; i < readInt; i++) {
            A0v.add(new C10346Rqj(parcel.readInt(), parcel.readLong()));
        }
        this.A06 = Collections.unmodifiableList(A0v);
        this.A05 = parcel.readLong();
        this.A07 = parcel.readByte() == 1 ? true : z;
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }
}
