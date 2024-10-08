package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.Map;

/* renamed from: X.8iP  reason: invalid class name and case insensitive filesystem */
public final class C362738iP extends AnonymousClass3NK {
    public final /* synthetic */ C362048hG A00;

    public final boolean Dqe(View view) {
        0qQ.A0B(view, 0);
        if (!view.isEnabled()) {
            return false;
        }
        view.performHapticFeedback(3);
        C362048hG r5 = this.A00;
        IgTextView igTextView = r5.A0o.A03;
        if (igTextView == null) {
            0qQ.A0F("draftsTabView");
            throw AnonymousClass00P.createAndThrow();
        } else if (igTextView.isSelected()) {
            r5.A0g(false);
            return true;
        } else {
            UserSession userSession = r5.A0c;
            27r A01 = 27p.A01(userSession);
            AnonymousClass0eM r4 = r5.A1I;
            A01.A20(((C362688iK) r4.getValue()).getFolders());
            AnonymousClass5Gv r2 = r5.A0p.A00;
            if (r2 != null && r2.A09()) {
                r2.A08(false);
            }
            if (182.A06(0Tu.A05, userSession, 36316662907015732L)) {
                AnonymousClass9PQ.A08(r5.A0Z, userSession, AnonymousClass000.A00(501), AnonymousClass9PQ.A00((C279284yO) r5.A0f.A08.A00), (Map) null);
            }
            if (r5.A08 != AnonymousClass05K.A00) {
                return true;
            }
            boolean A002 = C394259xn.A00(userSession, (C279284yO) r5.A0f.A08.A00);
            C361508gL r22 = r5.A0g;
            if (A002) {
                if (r22 == null) {
                    return true;
                }
                r22.A01(r5.A0Q, (C361528gN) r4.getValue(), false);
                return true;
            } else if (r22 == null) {
                return true;
            } else {
                ((LG7) r22.A04.getValue()).A02(r22);
                return true;
            }
        }
    }

    public C362738iP(C362048hG r1) {
        this.A00 = r1;
    }
}
