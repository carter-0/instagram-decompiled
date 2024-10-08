package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.IZi  reason: case insensitive filesystem */
public final class C57377IZi implements C273414mX {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass6Z5 A01;
    public final /* synthetic */ 0r1 A02;

    public final void Cyf() {
    }

    public C57377IZi(FragmentActivity fragmentActivity, AnonymousClass6Z5 r2, 0r1 r3) {
        this.A02 = r3;
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }

    public final void Cyc() {
        if (this.A02.A00) {
            1ZU A002 = C48794EkH.A00();
            FragmentActivity fragmentActivity = this.A00;
            UserSession userSession = this.A01.A09;
            if (userSession == null) {
                DbS.A17();
                throw AnonymousClass00P.createAndThrow();
            }
            A002.A05(fragmentActivity, userSession, "achievement_sticker_consumption", 0sn.A00);
        }
        G9w.A1O(this.A01);
    }
}
