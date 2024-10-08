package X;

import android.app.Application;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ljb  reason: case insensitive filesystem */
public final class C64875Ljb implements C252213ok, B21 {
    public ComposeView A00;
    public boolean A01;
    public boolean A02;
    public int A03;
    public String A04 = "";
    public final C56547I1b A05 = new C56547I1b();
    public final UserSession A06;
    public final AnonymousClass3E6 A07;
    public final C52961GgE A08;
    public final C62320sa A09;
    public final 0sP A0A;

    public final void DCS(Object obj) {
        C284945Oz r2 = this.A08.A01;
        this.A04 = ((C285975Tl) r2.getValue()).A01.A00;
        27r A012 = 27p.A01(this.A06);
        String str = ((C285975Tl) r2.getValue()).A01.A00;
        String A002 = C273654mx.A00(29);
        AnonymousClass29X r4 = A012.A0D;
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(r4.A01, "ig_camera_start_session");
        if (A0e.isSampled()) {
            JTO.A1T(A0e, "IG_CAMERA_START_STICKER_EDIT_SESSION");
            JTO.A1Q(A0e, "STICKER_EDIT");
            AnonymousClass283 r1 = r4.A04;
            JTO.A1S(A0e, JTP.A0p(r1));
            JTS.A15(r1.A09, A0e, 1);
            AnonymousClass7TH.A0U(A0e);
            JTP.A1F(A0e);
            A0e.AAJ("sticker_id", A002);
            A0e.AAJ("add_yours_prompt", str);
            AnonymousClass7TG.A1D(A0e, "nav_chain", DbS.A0k());
        }
    }

    public final void DDW() {
        String str;
        if (this.A01) {
            str = this.A04;
        } else {
            str = ((C285975Tl) this.A08.A01.getValue()).A01.A00;
        }
        27r A012 = 27p.A01(this.A06);
        String A002 = C273654mx.A00(29);
        AnonymousClass29Q r5 = A012.A07;
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(r5.A01, "ig_camera_end_session");
        if (A0e.isSampled()) {
            JTO.A1Q(A0e, "STICKER_EDIT");
            JTO.A1T(A0e, "IG_CAMERA_START_STICKER_EDIT_SESSION");
            AnonymousClass283 r2 = r5.A04;
            JTO.A1S(A0e, JTP.A0p(r2));
            JTS.A15(r2.A09, A0e, 1);
            AnonymousClass7TH.A0U(A0e);
            JTP.A1F(A0e);
            A0e.AAJ("sticker_id", A002);
            A0e.AAJ("add_yours_prompt", str);
            DbY.A1C(A0e);
            JTT.A18(A0e);
        }
    }

    public final void DMr(int i, boolean z) {
        if (this.A03 > i && !this.A02) {
            this.A05.A00();
            this.A0A.invoke(this.A08.A0E());
        }
        this.A03 = i;
    }

    public C64875Ljb(View view, UserSession userSession, AnonymousClass3E6 r7, C62320sa r8, 0sP r9) {
        ComposeView composeView;
        this.A06 = userSession;
        this.A07 = r7;
        this.A09 = r8;
        this.A0A = r9;
        Context applicationContext = view.getContext().getApplicationContext();
        0qQ.A0C(applicationContext, AnonymousClass000.A00(29));
        this.A08 = new C52961GgE((Application) applicationContext, userSession, " me");
        View A0C = JTS.A0C(view, R.id.memu_sticker_edit_screen_stub);
        if (A0C instanceof ComposeView) {
            composeView = (ComposeView) A0C;
        } else {
            composeView = null;
        }
        this.A00 = composeView;
        if (composeView != null) {
            composeView.setContent(AnonymousClass5PI.A03(new C59342JFu(this, 15), -1019015936));
        }
        r7.A9Y(this);
    }
}
