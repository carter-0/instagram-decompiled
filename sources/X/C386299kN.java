package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9kN  reason: invalid class name and case insensitive filesystem */
public final class C386299kN extends AnonymousClass3NK {
    public final /* synthetic */ C357918a4 A00;

    public C386299kN(C357918a4 r1) {
        this.A00 = r1;
    }

    public final boolean Dqe(View view) {
        C357918a4 r1 = this.A00;
        r1.A0y.D89();
        UserSession userSession = r1.A0v;
        27p.A01(userSession).A1K((C59725JVj) null, (AnonymousClass8IJ) null, "AUDIO_EDITOR_PAGE_TRASH_BUTTON", (List) null, r1.A13);
        29I r12 = 27p.A01(userSession).A02;
        AnonymousClass7TG.A1K(r12);
        29I.A00(r12, "user_removed_music_on_music_browser");
        return true;
    }
}
