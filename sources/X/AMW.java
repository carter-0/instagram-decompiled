package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.ui.text.ConstrainedEditText;

public final /* synthetic */ class AMW implements View.OnClickListener {
    public final /* synthetic */ C358368an A00;

    public /* synthetic */ AMW(C358368an r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        AnonymousClass80P r5;
        String str;
        FragmentActivity requireActivity;
        String str2;
        Integer num;
        String A0f;
        MBM mbm;
        C41399AtL atL;
        String str3;
        boolean z;
        C358368an r1 = this.A00;
        ConstrainedEditText constrainedEditText = r1.A1j;
        boolean z2 = true;
        if (constrainedEditText.length() >= 1) {
            z2 = false;
        }
        UserSession userSession = r1.A1J;
        27r A01 = 27p.A01(userSession);
        if (z2) {
            r5 = AnonymousClass80P.IMAGE_TO_TEXT_WITH_META_AI_INTENT;
        } else {
            r5 = AnonymousClass80P.AI_REWRITE_WITH_META_AI_INTENT;
        }
        29Z r7 = A01.A0F;
        0Aj A0e = AnonymousClass7TE.A0e(r7.A01, "ig_camera_ui_tool_click");
        if (A0e.isSampled()) {
            A0e.A8M(r5, "tool_type");
            AnonymousClass283 r52 = r7.A04;
            String str4 = r52.A0L;
            if (str4 == null) {
                str4 = "";
            }
            A0e.AAJ("camera_session_id", str4);
            AnonymousClass7TE.A1W(A0e, "event_type", 2);
            AnonymousClass7TE.A1V(A0e, r52);
            AnonymousClass7TH.A0U(A0e);
            A0e.A8M(r52.A0C, "surface");
            AnonymousClass7TH.A0W(A0e, r7);
            A0e.AAJ("composition_str_id", r52.A0M);
            A0e.A8M(r52.A0A, "composition_media_type");
            AnonymousClass7TH.A0V(A0e);
        }
        0nA.A0N(r1.A15);
        r1.A0U = AnonymousClass7TF.A0c();
        if (z2) {
            constrainedEditText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            C3499482o r4 = r1.A1Q.A02;
            C352218Cl r0 = r4.A00().A02;
            if (r0 != null) {
                str3 = r0.A06();
                27p.A01(userSession).A1d(C358088aL.A0N, r1.A0U);
                r1.A0e = true;
                requireActivity = r1.A1I.requireActivity();
                str2 = r4.A01.A0F;
                0qQ.A07(str2);
                num = AnonymousClass05K.A0j;
                mbm = new MBM(r1, 3);
                atL = new C41399AtL(r1, 3);
                A0f = "";
                str = A0f;
                z = true;
            } else {
                return;
            }
        } else {
            str = null;
            constrainedEditText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            27p.A01(userSession).A1d(C358088aL.A08, r1.A0U);
            r1.A0e = true;
            requireActivity = r1.A1I.requireActivity();
            str2 = r1.A1Q.A02.A01.A0F;
            0qQ.A07(str2);
            num = AnonymousClass05K.A0Y;
            A0f = AnonymousClass7TF.A0f(constrainedEditText);
            mbm = new MBM(r1, 2);
            atL = new C41399AtL(r1, 2);
            str3 = "";
            z = false;
        }
        C55050HbL.A00(requireActivity, userSession, num, str2, A0f, str, str3, atL, mbm, z);
    }
}
