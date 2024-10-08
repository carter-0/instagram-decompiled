package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.ESh  reason: case insensitive filesystem */
public final class C48042ESh extends C2806552w {
    public final /* synthetic */ AnonymousClass74j A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48042ESh(AnonymousClass74j r1, Integer num) {
        super(num);
        this.A00 = r1;
    }

    public final void onClick(View view) {
        AnonymousClass74j r2 = this.A00;
        UserSession userSession = r2.A07;
        AnonymousClass0iw r0 = r2.A06;
        AnonymousClass7TG.A1N(userSession, r0);
        DbV.A1G(AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r0, userSession), C273654mx.A00(3151)), "privacy_disclosure_click");
        ((AnonymousClass7YD) r2.A0A).CqG();
    }
}
