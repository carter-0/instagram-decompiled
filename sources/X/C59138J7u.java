package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.J7u  reason: case insensitive filesystem */
public final class C59138J7u extends 0Yg implements 0sL {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59138J7u(Object obj, String str, float f, int i, int i2) {
        super(2);
        this.A01 = i2;
        this.A03 = obj;
        this.A00 = f;
        this.A04 = str;
        this.A02 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A01;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (i != 0) {
            C55200Hdq.A00(A0R, (ImageUrl) this.A03, this.A04, this.A00, C51966G9m.A01(this.A02));
        } else {
            C56650I6f.A04(A0R, (AnonymousClass2DO) this.A03, this.A04, this.A00, C51966G9m.A01(this.A02));
        }
        return C60340gF.A00;
    }
}
