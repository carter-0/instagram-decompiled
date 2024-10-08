package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P9x  reason: case insensitive filesystem */
public final class C72540P9x implements AnonymousClass7XY, C333187Xz {
    public final C332257Ug A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final AnonymousClass7SM A03;
    public final C72946PQe A04 = new C72946PQe(this);
    public final C62320sa A05;
    public final C62320sa A06;
    public final C62320sa A07;

    public final void ASj(boolean z) {
        AnonymousClass782 r0 = (AnonymousClass782) this.A05.invoke();
        if (r0 != null) {
            r0.A00();
        }
    }

    public final void EvF() {
        UserSession userSession = this.A02;
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        AnonymousClass7TG.A1L(A0q.AR4(), A0q, C273654mx.A00(666), 0);
        Object invoke = this.A07.invoke();
        if (invoke != null) {
            AnonymousClass2Es r1 = (AnonymousClass2Es) invoke;
            boolean A022 = C331057Pi.A02(r1.AiM());
            boolean Cbs = r1.Cbs();
            Bundle A09 = DbY.A09(userSession);
            A09.putBoolean("IS_SHH_REPLAY_ENABLED", Cbs);
            A09.putBoolean("IS_CUTOVER_THREAD", A022);
            C68485NKd nKd = new C68485NKd();
            nKd.setArguments(A09);
            AnonymousClass4DH r5 = this.A01;
            Context requireContext = r5.requireContext();
            C62320sa r7 = this.A06;
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(requireContext, ((AnonymousClass7L2) r7.invoke()).A07.A0E);
            C331127Pr A0W = DbS.A0W(userSession);
            DbS.A1S(A0W, true);
            A0W.A05(r5.requireContext(), R.dimen.browser_actions_context_menu_max_width);
            A0W.A06 = 2Yu.A0F(contextThemeWrapper, R.attr.elevatedBackgroundColor);
            A0W.A0U = this.A04;
            C331157Pu A002 = A0W.A00();
            AnonymousClass7L2 r0 = (AnonymousClass7L2) r7.invoke();
            0qQ.A0B(r0, 0);
            nKd.A00 = r0;
            C68485NKd.A00(nKd);
            this.A03.CLU();
            Activity rootActivity = r5.getRootActivity();
            0qQ.A0A(rootActivity);
            A002.A02(rootActivity, nKd);
            this.A00.Cyt();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C72540P9x(AnonymousClass4DH r2, UserSession userSession, AnonymousClass7SM r4, C332257Ug r5, C62320sa r6, C62320sa r7, C62320sa r8) {
        C51974G9v.A1M(r2, r5, r4);
        0qQ.A0B(r6, 5);
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = r5;
        this.A03 = r4;
        this.A07 = r6;
        this.A06 = r7;
        this.A05 = r8;
    }
}
