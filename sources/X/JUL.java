package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

public final class JUL {
    public static final JUL A00 = new Object();

    public static final void A00(Context context, AnonymousClass9OT r15, MediaGenAIDetectionMethod mediaGenAIDetectionMethod, UserSession userSession, String str, String str2, boolean z) {
        UserSession userSession2 = userSession;
        String str3 = str;
        AnonymousClass7TF.A1B(userSession2, 1, str3);
        HashMap A1E = AnonymousClass7TE.A1E();
        boolean A06 = 182.A06(0Tu.A05, userSession2, 36324475452731505L);
        Boolean valueOf = Boolean.valueOf(A06);
        String A002 = C66579MXk.A00(332);
        String str4 = str2;
        A1E.put(A002, str4);
        A1E.put("enable_edit_treatment", String.valueOf(A06));
        AnonymousClass9OT r9 = r15;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod2 = mediaGenAIDetectionMethod;
        if (z) {
            FragmentActivity fragmentActivity = null;
            if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
            }
            Long A0i = C51972G9s.A0i(str4);
            if (fragmentActivity != null && A0i != null) {
                C229382nI A04 = C229382nI.A04(fragmentActivity, C227942kP.A01(str3, true, true), userSession2);
                HashMap A1E2 = AnonymousClass7TE.A1E();
                HashMap A1E3 = AnonymousClass7TE.A1E();
                new BitSet(0);
                A1E2.put(A002, C51968G9o.A0v(A0i));
                A1E2.put("enable_edit_treatment", valueOf);
                C64613Lex lex = new C64613Lex(r9, mediaGenAIDetectionMethod2, userSession2, str3, str4);
                FBO A003 = HX9.A00("com.bloks.www.bloks.gen_ai_transparency.threads.open_dialog");
                A003.A04 = C359608dC.A01(A1E2);
                A003.A03 = A1E3;
                A003.A02 = lex;
                A003.A01(context, A04);
                return;
            }
            return;
        }
        C46649DiU A042 = C46649DiU.A04("com.bloks.www.bloks.gen_ai_transparency.learn_more_bottom_sheet", A1E);
        IgBloksScreenConfig A0N = DbS.A0N(userSession2);
        A0N.A05 = new K8S(r9, mediaGenAIDetectionMethod2, userSession2, str3, str4);
        A042.A0E(context, A0N);
    }

    public static final boolean A02(UserSession userSession, 1Xj r5) {
        if (r5 == null) {
            return false;
        }
        r5.A1I();
        if (!182.A06(0Tu.A05, userSession, 36324475452731505L) || !r5.A4i()) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession) {
        return 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36324475452665968L);
    }

    public final void A03(AnonymousClass9OT r4, MediaGenAIDetectionMethod mediaGenAIDetectionMethod, UserSession userSession, Boolean bool, String str, String str2, String str3) {
        String str4;
        AnonymousClass7TG.A1N(userSession, str);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(DbS.A0O(str), userSession), "ig_genai_transparency_event");
        if (A0e.isSampled()) {
            DbS.A1I(A0e, str2);
            A0e.AAJ("post_id", str3);
            A0e.A8M(r4, "compose_type");
            if (mediaGenAIDetectionMethod != null) {
                str4 = mediaGenAIDetectionMethod.A00;
            } else {
                str4 = null;
            }
            A0e.AAJ("genai_detection_method_str", str4);
            A0e.A7p("was_self_disclosed_as_ai_generated", bool);
            A0e.AAJ("analytics_module", str);
            A0e.Cgf();
        }
    }
}
