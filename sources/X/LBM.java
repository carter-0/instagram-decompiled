package X;

import android.view.View;
import android.view.animation.Animation;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class LBM {
    public Animation A00;
    public List A01 = AnonymousClass7TE.A1C();
    public C262204Co A02;
    public final View A03;
    public final AnonymousClass4DH A04;
    public final UserSession A05;
    public final AnonymousClass0eM A06 = MMF.A00(this, 4);
    public final AnonymousClass0eM A07 = MMF.A00(this, 5);
    public final AnonymousClass0eM A08 = MMF.A00(this, 9);
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A = MMF.A00(this, 11);
    public final AnonymousClass0eM A0B = MMF.A00(this, 12);
    public final AnonymousClass0eM A0C = MMF.A00(this, 13);
    public final AnonymousClass0eM A0D = MMF.A00(this, 14);

    public LBM(View view, AnonymousClass4DH r9, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A04 = r9;
        this.A05 = userSession;
        this.A03 = view;
        MMF mmf = new MMF(this, 10);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMF(new MMF(r9, 6), 7));
        this.A09 = DbS.A0I(new MMF(A002, 8), mmf, new MJ6(18, (Object) null, A002), DbS.A0z(C60219Jhc.class));
    }
}
