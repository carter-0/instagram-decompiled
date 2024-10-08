package X;

import com.facebook.traffic.nts.providers.httpinterceptor.HttpRequestInterface;

/* renamed from: X.Sqw  reason: case insensitive filesystem */
public final class C12295Sqw implements HttpRequestInterface {
    public final 1QS A00;

    public final String getUrlOrThrow() {
        return DbT.A10(this.A00.A09);
    }

    public C12295Sqw(1QS r1) {
        this.A00 = r1;
    }

    public final void setHeader(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        this.A00.A01(str, str2);
    }
}
