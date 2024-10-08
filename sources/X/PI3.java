package X;

import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class PI3 implements C13822Ths {
    public OTJ A00;
    public final Handler A01 = AnonymousClass7TF.A0D();
    public final FragmentActivity A02;
    public final UserSession A03;
    public final 1Xj A04;
    public final AnonymousClass4DU A05;
    public final C8944RGm A06;
    public final C63780L6m A07;
    public final OCV A08 = new OCV(new C66299MMi(this, 30), new C66299MMi(this, 31));
    public final C60167Jgm A09;

    public PI3(C68181N3w n3w) {
        C318136oS A002;
        AnonymousClass4D7 r2;
        int i;
        FragmentActivity fragmentActivity = (FragmentActivity) n3w.A02;
        this.A02 = fragmentActivity;
        UserSession userSession = (UserSession) n3w.A04;
        this.A03 = userSession;
        1Xj r1 = (1Xj) n3w.A03;
        this.A04 = r1;
        C8944RGm rGm = (C8944RGm) n3w.A07;
        this.A06 = rGm;
        this.A05 = new PG6(n3w);
        C60167Jgm A003 = new 2YN(new C61562KCp(userSession, r1), fragmentActivity).A00(C60167Jgm.class);
        this.A09 = A003;
        this.A07 = new C63780L6m(n3w.A0B);
        int ordinal = rGm.ordinal();
        if (ordinal == 4) {
            A002 = C318116oQ.A00(A003);
            r2 = null;
            i = 2;
        } else if (ordinal == 3) {
            A002 = C318116oQ.A00(A003);
            r2 = null;
            i = 1;
        } else {
            return;
        }
        AnonymousClass7TE.A1Z(new MFT(A003, r2, i), A002);
    }

    public final void DJ7() {
    }

    public final void DvV(String str, Object obj) {
    }

    public final void onDestroyView() {
    }

    public final View B7F() {
        OTJ otj = this.A00;
        if (otj != null) {
            return otj.A02.A01;
        }
        0qQ.A0F("viewBinder");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EF2(View view) {
        FragmentActivity fragmentActivity = this.A02;
        this.A00 = new OTJ((ViewStub) AnonymousClass7TE.A0b(view, R.id.ig_expandable_footer_stub), fragmentActivity, this.A05);
        if ((fragmentActivity instanceof AnonymousClass07Z) && fragmentActivity != null) {
            07U r4 = 07U.A05;
            AnonymousClass7TE.A1Z(new C66170MGh(fragmentActivity, r4, this, (AnonymousClass4D7) null, 3), DbW.A0E(fragmentActivity));
        }
    }
}
