package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.J8b  reason: case insensitive filesystem */
public final class C59145J8b extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59145J8b(Object obj, Object obj2, String str, String str2, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A05 = str;
        this.A04 = str2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (i != 0) {
            C54912HXu.A00(A0R, this.A05, this.A04, (C62320sa) this.A03, (C62320sa) this.A02, C51966G9m.A01(this.A01));
        } else {
            I64.A03(A0R, (ImageUrl) this.A02, this.A05, this.A04, (0sL) this.A03, C51966G9m.A01(this.A01));
        }
        return C60340gF.A00;
    }
}
