package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.android.R;

public final class NVW extends NKF {
    public static final String __redex_internal_original_name = "DirectChallengePromptFragment";
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(new C67570Mq4(this, 22));

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r2 == null) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            r12 = this;
            r1 = 0
            X.0qQ.A0B(r13, r1)
            super.onViewCreated(r13, r14)
            X.0eM r0 = r12.A00
            X.OyR r3 = X.C66580MXl.A0T(r0)
            X.NjA r2 = r12.A05
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            if (r2 == 0) goto L_0x0033
            int r1 = r2.ordinal()
            r0 = 1
            if (r1 != r0) goto L_0x0033
            java.lang.String r9 = "get_started_button"
        L_0x001e:
            int r1 = r2.ordinal()
            r0 = 1
            if (r1 != r0) goto L_0x0037
            java.lang.String r10 = "challenge_creator_nux_sheet"
        L_0x0027:
            r2 = 0
            java.lang.String r7 = "challenge_null_creation_sheet_rendered"
            java.lang.String r8 = "tap"
            r5 = r2
            r6 = r2
            r11 = r2
            X.C72202OyR.A03(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0033:
            java.lang.String r9 = "challenge_button"
            if (r2 != 0) goto L_0x001e
        L_0x0037:
            java.lang.String r10 = "thread_view"
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NVW.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(828086563);
        super.onCreate(bundle);
        Window A0G = DbV.A0G(this);
        if (A0G != null) {
            A0G.setSoftInputMode(16);
            AnonymousClass0fD.A09(2076604908, A02);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-336445579, A02);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(816905011);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_challenges_sheet, viewGroup, false);
        AnonymousClass0fD.A09(-1537642329, A02);
        return inflate;
    }
}
