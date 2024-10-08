package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.ITo  reason: case insensitive filesystem */
public final class C57227ITo implements JPP {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;

    public final void D2A(String str) {
        Context context = this.A00.getContext();
        if (context != null) {
            Long A0n = C51971G9r.A0n(0, C51965G9l.A0u(str));
            if (A0n != null) {
                Dbc.A0s(AnonymousClass0kN.A01(this.A02, this.A01), A0n, "ig_coauthor_invite_cta_tap", "accept_flow_entrypoint_other");
            }
            UserSession userSession = this.A01;
            boolean A06 = 182.A06(0Tu.A05, userSession, 36324363783450663L);
            AnonymousClass4DU r0 = this.A02;
            if (A06) {
                HashMap A002 = AnonymousClass3YV.A00(userSession, r0, str);
                if (A002 != null) {
                    C46649DiU.A04("com.instagram.creator_connections.screens.collab_accept_bottom_sheet_screen.component.view", A002).A0E(context, DbS.A0N(userSession));
                    return;
                }
                return;
            }
            AnonymousClass3YV.A03(context, userSession, r0, str);
        }
    }

    public final void D2j(1Xj r10) {
        Fragment fragment = this.A00;
        if (fragment.getContext() != null) {
            LTZ.A09(fragment, this.A01, r10, this.A02, (C262944Gp) null, (String) null, false, true);
        }
    }

    public C57227ITo(Fragment fragment, UserSession userSession, AnonymousClass4DU r3) {
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = r3;
    }
}
