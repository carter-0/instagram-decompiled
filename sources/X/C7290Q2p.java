package X;

import java.util.List;

/* renamed from: X.Q2p  reason: case insensitive filesystem */
public final class C7290Q2p implements C13751TgN {
    public final /* synthetic */ C307766Rj A00;
    public final /* synthetic */ C276544tV A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public final void Dve(C276544tV r1) {
    }

    public C7290Q2p(C307766Rj r1, C276544tV r2, String str, List list) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = list;
        this.A02 = str;
    }

    public final C276544tV ABu(C276634te r10, C276544tV r11) {
        C276634te r4;
        C307766Rj r3 = this.A00;
        C276544tV r2 = this.A01;
        List list = this.A03;
        String str = this.A02;
        C276544tV r5 = r11;
        C276634te r0 = r11.A01;
        if (r0 != null) {
            if (r10 == null) {
                r10 = r2.A01;
            }
            r4 = r0.ClQ(r10);
        } else {
            r4 = null;
        }
        return new C276544tV(r4, r5, r11, list, r3.A00(r2, r11, str));
    }
}
