package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.P1q  reason: case insensitive filesystem */
public final class C72325P1q implements C74389Pu5 {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C70432O6j A02;

    public C72325P1q(AnonymousClass0iw r1, UserSession userSession, C70432O6j o6j) {
        this.A02 = o6j;
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final AnonymousClass7L0 AuX() {
        return this.A02.A00.A03.A0A;
    }

    public final void DCY() {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this.A00, this.A01), "direct_custom_cutout_sticker_tap");
        if (A0e.isSampled()) {
            A0e.AAJ("target", "custom_cutout_sticker");
            A0e.Cgf();
        }
        P3E p3e = this.A02.A00.A03;
        UserSession userSession = p3e.A0G;
        Nt1.A00(new GSY(AnonymousClass05K.A0Y, (Integer) null, "custom_cutout_sticker", (String) null, 12), DbW.A0J(userSession, "ig_direct_expression_tray"), userSession, p3e.A0S, p3e.A0U);
        C70983OUx oUx = p3e.A0J.A00.A00;
        if (oUx != null) {
            C68464NJc A002 = C70983OUx.A00(oUx);
            Bundle A0a = AnonymousClass7TE.A0a();
            AnonymousClass6W8.A05(A002.getActivity(), A0a, TransparentModalActivity.class, C273654mx.A00(470), 1109);
        }
    }
}
