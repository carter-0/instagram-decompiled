package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.JAn  reason: case insensitive filesystem */
public final class C59209JAn extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59209JAn(Object obj, Object obj2, String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        super(2);
        this.A00 = i4;
        this.A03 = i;
        this.A07 = str;
        this.A06 = str2;
        this.A04 = obj;
        this.A08 = z;
        this.A05 = obj2;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        int i2 = this.A03;
        if (i != 0) {
            C56571I2b.A00(A0R, (AnonymousClass5RW) this.A04, this.A07, this.A06, (C62320sa) this.A05, i2, C51966G9m.A01(this.A01), this.A02, this.A08);
        } else {
            String str = this.A06;
            boolean z = this.A08;
            C54786HSt.A00(A0R, (ImmutableList) this.A04, str, this.A07, (C62320sa) this.A05, i2, C51966G9m.A01(this.A01), this.A02, z);
        }
        return C60340gF.A00;
    }
}
