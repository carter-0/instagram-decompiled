package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class LEJ {
    public View A00;
    public final View A01;
    public final View A02;
    public final LGO A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;

    public LEJ(View view, Fragment fragment, UserSession userSession, LGO lgo, C313666go r11, int i) {
        0qQ.A0B(userSession, 2);
        this.A03 = lgo;
        this.A0A = AnonymousClass1YB.A00(new C58184Ino(view, i, 0));
        this.A07 = MMN.A00(view, 20);
        this.A09 = MMN.A00(view, 22);
        this.A08 = MMN.A00(view, 21);
        this.A04 = MMN.A00(view, 17);
        this.A06 = MMN.A00(view, 19);
        this.A05 = MMN.A00(view, 18);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.avatar_likes_container);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.iglive_reactions_shadow_bottom);
        C66304MMn A012 = C66304MMn.A01(r11, userSession, 3);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMN(new MMN(fragment, 23), 24));
        this.A0B = C66304MMn.A00(A002, new MMN(A002, 25), A012, DbS.A0z(C60171Jgq.class), 2);
        if (r11 != C313666go.VIEWER) {
            A00(fragment);
        }
    }

    public final void A00(Fragment fragment) {
        DbV.A1F(fragment.getViewLifecycleOwner(), ((C60171Jgq) this.A0B.getValue()).A00, new MP8(this, 43), 58);
    }
}
