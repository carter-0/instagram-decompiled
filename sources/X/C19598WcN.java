package X;

import com.instagram.user.model.Product;

/* renamed from: X.WcN  reason: case insensitive filesystem */
public final class C19598WcN implements X6z {
    public final /* synthetic */ C14781U8r A00;

    public final void DEL(C18043VkR vkR, Product product, Throwable th, long j, long j2) {
        String str;
        C14781U8r u8r = this.A00;
        C16222Uql uql = u8r.A02;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        uql.A03(vkR, product, str, j, j2, false);
        u8r.A00.remove(vkR.A01());
        C14781U8r.A00(u8r, new C20785Wyw(vkR, 15));
        C13991Tnr.A1K(u8r, C318116oQ.A00(u8r), 11);
    }

    public final void Dor(AnonymousClass1XT r13, C18043VkR vkR, Product product, long j, long j2) {
        C14781U8r u8r = this.A00;
        u8r.A02.A03(vkR, product, (String) null, j, j2, true);
        u8r.A00.remove(vkR.A01());
        C14781U8r.A00(u8r, new C20785Wyw(vkR, 16));
    }

    public C19598WcN(C14781U8r u8r) {
        this.A00 = u8r;
    }
}
