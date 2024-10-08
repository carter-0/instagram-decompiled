package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.J8n  reason: case insensitive filesystem */
public final class C59157J8n extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59157J8n(ImageUrl imageUrl, String str, C62320sa r4, int i, long j, boolean z, boolean z2) {
        super(2);
        this.A03 = str;
        this.A02 = imageUrl;
        this.A04 = r4;
        this.A01 = j;
        this.A05 = z;
        this.A06 = z2;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        String str = this.A03;
        C56615I4q.A02(A0R, this.A02, str, this.A04, C51966G9m.A01(this.A00), this.A01, this.A05, this.A06);
        return C60340gF.A00;
    }
}
