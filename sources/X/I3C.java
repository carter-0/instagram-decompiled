package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

public abstract class I3C {
    public static final void A00(Context context, UserSession userSession, C55533HjF hjF, String str, String str2, String str3) {
        String str4 = str3;
        0qQ.A0B(str4, 4);
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        DbS.A18(context, A0N, 2131976735);
        A0N.A0l = false;
        String A00 = AnonymousClass000.A00(2823);
        A0N.A0R = A00;
        A0N.A03 = new C54187H2h(hjF, 2);
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A1E2 = AnonymousClass7TE.A1E();
        HashMap A1E3 = AnonymousClass7TE.A1E();
        BitSet A0w = DbS.A0w(1);
        String str5 = str;
        if (str != null) {
            A1E.put("ad_id", str5);
            A0w.set(0);
            String str6 = str2;
            if (str2 != null) {
                A1E.put("ad_client_token", str6);
                A1E.put("source_surface", str4);
                if (A0w.nextClearBit(0) >= 1) {
                    C46649DiU A06 = C46649DiU.A06(A00, C359608dC.A01(A1E), A1E2);
                    C46649DiU.A0B(A06, -1);
                    A06.A03 = null;
                    A06.A02 = null;
                    A06.A04 = null;
                    A06.A0H(A1E3);
                    A06.A0E(context, A0N);
                    return;
                }
                throw DbU.A0i();
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C229382nI A04 = C229382nI.A04(fragmentActivity, DbS.A0O("ad_preferences"), userSession);
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A1E2 = AnonymousClass7TE.A1E();
        BitSet A0w = DbS.A0w(2);
        A1E.put("entrypoint", "afs_kitkat_three_dot_menu");
        A0w.set(0);
        A1E.put(AnonymousClass000.A00(5082), str);
        A0w.set(1);
        INE ine = new INE(6);
        if (A0w.nextClearBit(0) >= 2) {
            FBO fbo = new FBO(AnonymousClass000.A00(138));
            fbo.A04 = C359608dC.A01(A1E);
            fbo.A03 = A1E2;
            fbo.A02 = ine;
            fbo.A01(fragmentActivity, A04);
            return;
        }
        throw DbU.A0i();
    }

    public static final void A01(Context context, UserSession userSession, String str, String str2) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("target_user_id", str);
        if (str2 == null) {
            str2 = "FeedAds";
        }
        A1E.put(AnonymousClass000.A00(760), str2);
        C46649DiU A04 = C46649DiU.A04(AnonymousClass000.A00(45), A1E);
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        DbS.A18(context, A0N, 2131951988);
        A0N.A0R = AnonymousClass000.A00(2562);
        C46649DiU.A07(context, A0N, A04);
    }
}
