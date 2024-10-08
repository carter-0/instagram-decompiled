package X;

import android.graphics.PointF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.aistudio.logging.AiStudioLoggingData;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class OUq {
    public static final OUq A00 = new Object();
    public static final C72519P9c A01 = new C72519P9c(0);
    public static final PA1 A02 = new PA1(1);

    public final void A00(FragmentActivity fragmentActivity, UserSession userSession, N3F n3f, AnonymousClass7UB r111, C254743sy r112, String str, String str2, float f, float f2, boolean z) {
        AnonymousClass7UB r3 = r111;
        String str3 = str2;
        AnonymousClass7TF.A1F(r3, 6, str3);
        C254743sy r68 = r112;
        DirectThreadKey A03 = C66647MaG.A03(r68);
        UserSession userSession2 = userSession;
        P8Z p8z = new P8Z(n3f, str, userSession2.A06);
        String str4 = A03.A00;
        String str5 = A03.A01;
        0sn r13 = 0sn.A00;
        PointF pointF = new PointF(f, f2);
        C72500P8j p8j = new C72500P8j(userSession2, A03, str3);
        C72519P9c p9c = A01;
        PA1 pa1 = A02;
        0qQ.A0B(r13, 9);
        MessageIdentifier messageIdentifier = p8z.A03;
        long micros = TimeUnit.MILLISECONDS.toMicros(p8z.A00);
        2FW r20 = p8z.A02;
        List list = p8z.A04;
        boolean A002 = AnonymousClass9HV.A00(userSession2).A00(C66647MaG.A08(r68), 42);
        C72526P9j p9j = C72526P9j.A00;
        C72503P8m p8m = C72503P8m.A00;
        0qQ.A0C(r3, "null cannot be cast to non-null type com.instagram.direct.messagethread.environment.CanPauseThreadAutoScrolling");
        AnonymousClass7SN r11 = (AnonymousClass7SN) r3;
        P9U p9u = P9U.A00;
        C332257Ug r9 = (C332257Ug) r3;
        C73784Pjj pjj = C73784Pjj.A00;
        boolean z2 = z;
        if (z) {
            boolean A1S = AnonymousClass7TF.A1S(p8z.A05 ? 1 : 0, 1);
            182.A06(0Tu.A05, userSession2, 36316491108323741L);
            FragmentActivity fragmentActivity2 = fragmentActivity;
            MessageActionsViewModel A003 = MessageActionsViewModel.A0a.A00(fragmentActivity2, pointF, AnonymousClass7TE.A0W(), (AiStudioLoggingData) null, r20, messageIdentifier, (Boolean) null, (Integer) null, (Integer) null, (Long) null, str4, str5, (String) null, (String) null, (String) null, (String) null, (String) null, r13, list, (List) null, 0, 0, micros, true, false, A1S, false, z2, false, false, false, A002, false, false, false, false);
            0qQ.A0B(p9j, 28);
            0qQ.A0B(p8m, 32);
            0qQ.A0B(r11, 36);
            0qQ.A0B(p9u, 37);
            0qQ.A0B(r9, 38);
            0qQ.A0B(pjj, 56);
            if (A003.A0X) {
                1Av A004 = 1Au.A00(userSession2);
                0qQ.A0B(A004, 0);
                0xa r6 = A004.A01;
                int i = r6.getInt("should_show_long_press_nux_count", 0);
                if (i < 2) {
                    AnonymousClass7TG.A1M(r6, "should_show_long_press_nux_count", i + 1);
                }
            }
            r3.E27();
            UserSession userSession3 = userSession2;
            PA9 pa9 = new PA9(fragmentActivity2, (View) null, userSession3, (OBX) null, (C70694OGp) null, (C70694OGp) null, (C70694OGp) null, (C70694OGp) null, (C70694OGp) null, (C70694OGp) null, (C70694OGp) null, p8z, (AnonymousClass7XS) null, (C333157Xw) null, (C333177Xy) null, (C332897Ww) null, p8j, p8m, (AnonymousClass7XC) null, (C332867Wr) null, (AnonymousClass7Ws) null, (AnonymousClass7X4) null, (C333027Xj) null, r3, p9u, (C333077Xo) null, (AnonymousClass7XF) null, p9c, (C74329Pt5) null, p9j, (AnonymousClass7YI) null, (AnonymousClass7YJ) null, (AnonymousClass7YL) null, (AnonymousClass7XK) null, r9, (AnonymousClass7XG) null, (AnonymousClass7XB) null, (AnonymousClass7XN) null, r11, (AnonymousClass7XO) null, (AnonymousClass7XP) null, pa1, (N2I) null, (OFD) null, (C70562OBk) null, (OG4) null, (C328837Gl) null, (C328837Gl) null, (OG5) null, A003, (C254703su) null, r68, (C273414mX) null, (List) null, pjj, 0, false, r11.CW1(), false);
            NIE A012 = NIE.A01(userSession2, A003, (C254783t2) null, r68, 0, false, false, false, false);
            A012.A0N(pa9);
            0hq supportFragmentManager = fragmentActivity2.getSupportFragmentManager();
            if (supportFragmentManager != null) {
                0s1 r2 = new 0s1(supportFragmentManager);
                r2.A0C(A012, C273654mx.A00(1237), R.id.media_viewer_content_view);
                r2.A00();
            }
        }
    }
}
