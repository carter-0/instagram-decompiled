package X;

import com.instagram.user.model.Product;

/* renamed from: X.WcM  reason: case insensitive filesystem */
public final class C19597WcM implements X6z {
    public final /* synthetic */ C14770U8g A00;

    public final void DEL(C18043VkR vkR, Product product, Throwable th, long j, long j2) {
        String str;
        C14770U8g u8g = this.A00;
        C16221Uqk uqk = u8g.A04;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        uqk.A03(vkR, product, str, j, j2, false);
        u8g.A00.remove(vkR.A01());
        C20785Wyw wyw = new C20785Wyw(vkR, 11);
        C13991Tnr.A0y(u8g.A01, u8g.A02, wyw);
        C13991Tnr.A1K(u8g, C318116oQ.A00(u8g), 10);
    }

    public final void Dor(AnonymousClass1XT r14, C18043VkR vkR, Product product, long j, long j2) {
        C14770U8g u8g = this.A00;
        u8g.A04.A03(vkR, product, (String) null, j, j2, true);
        u8g.A00.remove(vkR.A01());
        C20785Wyw wyw = new C20785Wyw(vkR, 12);
        C13991Tnr.A0y(u8g.A01, u8g.A02, wyw);
    }

    public C19597WcM(C14770U8g u8g) {
        this.A00 = u8g;
    }
}
