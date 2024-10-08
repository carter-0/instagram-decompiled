package X;

import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public final class FkF implements G6I {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ AnonymousClass6Z5 A01;
    public final /* synthetic */ String A02;

    public FkF(Fragment fragment, AnonymousClass6Z5 r2, String str) {
        this.A00 = fragment;
        this.A01 = r2;
        this.A02 = str;
    }

    public final void DZO() {
        Fragment fragment = this.A00;
        AnonymousClass6Z5 r0 = this.A01;
        C273434mZ r5 = r0.A16;
        UserSession userSession = r0.A09;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        }
        0eP A1L = AnonymousClass7TE.A1L(AnonymousClass000.A00(387), this.A02);
        C49263Es6.A00((RectF) null, AnonymousClass7TG.A0P(AnonymousClass000.A00(388), C48081EUz.AVATAR, A1L), fragment, userSession, r5);
    }
}
