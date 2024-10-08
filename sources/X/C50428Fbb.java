package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.Fbb  reason: case insensitive filesystem */
public final class C50428Fbb implements AnonymousClass789 {
    public final /* synthetic */ AnonymousClass791 A00;
    public final /* synthetic */ AnonymousClass790 A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;

    public C50428Fbb(AnonymousClass791 r1, AnonymousClass790 r2, User user, String str) {
        this.A01 = r2;
        this.A02 = user;
        this.A03 = str;
        this.A00 = r1;
    }

    public final void DLh(boolean z) {
        ViewStub A0F;
        if (z) {
            UserSession userSession = this.A01.A00;
            if (182.A06(0Tu.A05, userSession, 36319802528112294L)) {
                try {
                    17h.A00(userSession).A01(this.A02, true, false);
                } catch (AnonymousClass1DX unused) {
                    0wb.A03("userId_missing_exception", 002.A0g("Received user ", this.A02.getUsername(), " is missing a userId"));
                }
            }
            String str = this.A03;
            ArrayList A1M = 0sr.A1M(new String[]{this.A02.getId()});
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "direct_kindness_reminder");
            if (A0e.isSampled()) {
                A0e.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                A0e.AAe("recipient_ids", A1M);
                A0e.Cgf();
            }
            AnonymousClass791 r4 = this.A00;
            View view = r4.A01;
            if (view.findViewById(R.id.nux_banner) == null && (A0F = DbS.A0F(view, R.id.nux_banner_viewstub)) != null) {
                View inflate = A0F.inflate();
                TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.title);
                TextView A0d2 = AnonymousClass7TE.A0d(inflate, R.id.message);
                Context context = r4.A00;
                A0d.setText(context.getText(2131960539));
                A0d.setFocusableInTouchMode(true);
                DbT.A1H(A0d2);
                A0d2.setText(C48886Elm.A00(context, r4.A02));
                View findViewById = inflate.findViewById(R.id.dismiss_button);
                C314466iJ r2 = r4.A03;
                FPE.A01(findViewById, 55, inflate, r2);
                inflate.setBackgroundColor(r4.A05.A02);
                DbX.A1D(inflate, R.id.bottom_divider, 8);
                r4.A04.A00.A00 = AnonymousClass05K.A0u;
                r2.DUt();
            } else {
                return;
            }
        }
        02m.A0p.markerEnd(190451680, 2);
    }
}
