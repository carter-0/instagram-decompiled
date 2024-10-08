package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Gs3  reason: case insensitive filesystem */
public final class C53650Gs3 extends C251343mx {
    public final C61050Jvo A00;
    public final 2WX A01;

    public C53650Gs3(C61050Jvo jvo, 2WX r3) {
        0qQ.A0B(jvo, 1);
        this.A00 = jvo;
        this.A01 = r3;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r7) {
        0qQ.A0B(r7, 0);
        C243673Zt A002 = C243633Zp.A00(r7, C58412IrV.A00);
        ImageUrl imageUrl = (ImageUrl) this.A00.A04;
        if (imageUrl == null) {
            return new AnonymousClass3XA();
        }
        return C51974G9v.A0P(new C52801Gct(imageUrl), r7.A05, this.A01.A00(C244243as.A00(A002, 2WX.A02, "potato_media_shape", new J6H(this, 28))));
    }
}
