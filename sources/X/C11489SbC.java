package X;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.sponsored.analytics.SourceModelInfoParams;

/* renamed from: X.SbC  reason: case insensitive filesystem */
public final class C11489SbC implements View.OnClickListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass4DU A03;
    public final /* synthetic */ C250973mM A04;
    public final /* synthetic */ C296215pf A05;
    public final /* synthetic */ SourceModelInfoParams A06;
    public final /* synthetic */ AnonymousClass6a7 A07;

    public C11489SbC(DialogInterface.OnDismissListener onDismissListener, Fragment fragment, UserSession userSession, AnonymousClass4DU r4, C250973mM r5, C296215pf r6, SourceModelInfoParams sourceModelInfoParams, AnonymousClass6a7 r8) {
        this.A02 = userSession;
        this.A01 = fragment;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A06 = sourceModelInfoParams;
        this.A00 = onDismissListener;
        this.A07 = r8;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-1423473164);
        UserSession userSession = this.A02;
        Fragment fragment = this.A01;
        2EG r7 = 2EG.A27;
        Q03 q03 = new Q03(fragment, userSession, this.A05, this.A03, r7);
        q03.A0p = true;
        q03.A0M = this.A04.A0H;
        q03.A02(this.A06);
        q03.A0E = this.A00;
        q03.A0W = this.A07;
        new Q02(q03).A02();
        AnonymousClass0fD.A0C(-928066836, A052);
    }
}
