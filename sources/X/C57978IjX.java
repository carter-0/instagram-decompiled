package X;

import java.util.Map;

/* renamed from: X.IjX  reason: case insensitive filesystem */
public final class C57978IjX implements Runnable {
    public final /* synthetic */ AnonymousClass6L7 A00;
    public final /* synthetic */ WKI A01;
    public final /* synthetic */ AnonymousClass59L A02;
    public final /* synthetic */ AnonymousClass59M A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C57978IjX(AnonymousClass6L7 r1, WKI wki, AnonymousClass59L r3, AnonymousClass59M r4, String str, Map map) {
        this.A04 = str;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = wki;
        this.A05 = map;
        this.A00 = r1;
    }

    public final void run() {
        try {
            String str = this.A04;
            if (str != null) {
                AnonymousClass59M r0 = this.A03;
                AnonymousClass59M r1 = r0;
                r0.AUl(r1, this.A00, this.A01, r0, str, this.A05);
            }
        } catch (C242623Vf unused) {
            11Z.A02(new C57709IfC(new C57708IfB(this.A03)));
        }
    }
}
