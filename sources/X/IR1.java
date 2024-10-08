package X;

import com.instagram.direct.model.DirectThreadThemeInfo;

public final class IR1 implements C74391Pu7 {
    public final /* synthetic */ H13 A00;
    public final /* synthetic */ DirectThreadThemeInfo A01;
    public final /* synthetic */ boolean A02;

    public IR1(H13 h13, DirectThreadThemeInfo directThreadThemeInfo, boolean z) {
        this.A00 = h13;
        this.A02 = z;
        this.A01 = directThreadThemeInfo;
    }

    public final void D0V() {
        H13 h13 = this.A00;
        I6F i6f = h13.A00;
        if (i6f == null) {
            0qQ.A0F("aiThemesLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        String A012 = C51968G9o.A0i(h13).A01();
        0Aj A0e = AnonymousClass7TE.A0e(i6f.A01, "direct_theme_preview_back_click");
        if (A0e.isSampled()) {
            I6F.A03(A0e, i6f, A012);
            I6F.A01(C54670HOb.AI_THEME_LOADING, A0e, i6f, "minor_entry_point");
            I6F.A02(A0e, i6f);
        }
        DbT.A1I(h13);
    }

    public final void DjZ() {
        H13 h13 = this.A00;
        if (h13.A01) {
            C358248ab A0H = Dba.A0H(h13);
            A0H.A09(2131954994);
            A0H.A08(2131954993);
            A0H.A0R(new C50017FJc(1, (Object) this.A01, (Object) h13, this.A02), C358278ae.DEFAULT, 2131956706);
            A0H.A0C(C56695I8b.A00);
            AnonymousClass7TH.A0a(A0H, true);
        } else if (this.A02) {
            H13.A03(h13, this.A01);
        } else {
            H13.A02(h13);
        }
    }
}
