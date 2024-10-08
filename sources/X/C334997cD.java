package X;

/* renamed from: X.7cD  reason: invalid class name and case insensitive filesystem */
public final class C334997cD {
    public C337657gh A00;
    public C337727go A01;

    public final void A00() {
        String str;
        C337657gh r3 = this.A00;
        if (r3 != null) {
            synchronized (r3) {
                C337587ga r0 = r3.A02;
                if (r0 == null) {
                    str = null;
                } else {
                    str = r0.A03;
                }
            }
            if (str != null) {
                C337657gh.A04();
                C39675A4r A012 = C337657gh.A01(r3, str);
                int i = A012.A01.A00;
                if (0 < i) {
                    C337687gk r02 = r3.A09;
                    r02.A00.EHQ(A012.A00, 0);
                    return;
                }
                2W6.A00("SectionTree:OutOfBoundsRequestFocus", AnonymousClass05K.A01, 002.A02(0, i, "You are trying to request focus with offset on an index that is out of bounds: requested ", " , total "));
            }
        }
    }

    public final void A02(Integer num, Object obj) {
        0qQ.A0B(obj, 0);
        C337657gh r0 = this.A00;
        if (r0 != null) {
            C337657gh.A04();
            r0.A09.A00.EHg(num, obj, 0);
        }
    }

    public final void A01(Integer num, int i, int i2) {
        String str;
        C337657gh r3 = this.A00;
        if (r3 != null) {
            synchronized (r3) {
                C337587ga r0 = r3.A02;
                if (r0 == null) {
                    str = null;
                } else {
                    str = r0.A03;
                }
            }
            if (str != null) {
                C337657gh.A04();
                C39675A4r A012 = C337657gh.A01(r3, str);
                int i3 = A012.A01.A00;
                if (i >= i3 || i < 0) {
                    2W6.A00("SectionTree:OutOfBoundsRequestFocus", AnonymousClass05K.A01, 002.A02(i, i3, "You are trying to request focus with offset on an index that is out of bounds: requested ", " , total "));
                    return;
                }
                r3.A09.A00.EHf(num, A012.A00 + i, i2);
            }
        }
    }
}
