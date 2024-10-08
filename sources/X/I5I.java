package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository;
import com.instagram.common.session.UserSession;

public abstract class I5I {
    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r7, 0sP r8) {
        2MU r1 = ClipsDraftPreviewItemRepository.A09;
        Application application = fragmentActivity.getApplication();
        0qQ.A07(application);
        ClipsDraftPreviewItemRepository A00 = r1.A00(application, userSession);
        String id = r7.getId();
        if (id != null) {
            A00.A03(id, new JGB(r8, 39));
        } else {
            C51968G9o.A1O(r8, false);
        }
    }

    public static final void A02(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        29O r2 = 27p.A01(userSession).A06;
        1Ln A07 = 1Ln.A07(r2.A01);
        if (DbT.A1Y(A07)) {
            1Ln A00 = 29O.A00(A07, r2, "SAVE_APPLIED");
            A00.A0R("composition_str_id", str);
            A00.A0a(r2.A0J());
            A00.A0b(28D.A3W);
            A00.Cgf();
        }
    }

    public static final void A03(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        29O r2 = 27p.A01(userSession).A06;
        1Ln A07 = 1Ln.A07(r2.A01);
        if (DbT.A1Y(A07)) {
            1Ln A00 = 29O.A00(A07, r2, "SAVE_CLICK");
            A00.A0R("composition_str_id", str);
            A00.A0a(r2.A0J());
            A00.A0b(28D.A3W);
            A00.Cgf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36325360216191910L) == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(android.content.Context r3, com.instagram.common.session.UserSession r4, boolean r5) {
        /*
            if (r5 != 0) goto L_0x0012
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325360216191910(0x810db9000633a6, double:3.035642298980313E-306)
            boolean r1 = X.182.A06(r2, r4, r0)
            r0 = 2131971790(0x7f134ece, float:1.958057E38)
            if (r1 != 0) goto L_0x0015
        L_0x0012:
            r0 = 2131971789(0x7f134ecd, float:1.9580567E38)
        L_0x0015:
            java.lang.String r2 = r3.getString(r0)
            java.lang.String r1 = "\n\n"
            r0 = 2131971791(0x7f134ecf, float:1.9580571E38)
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            X.0qQ.A07(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I5I.A00(android.content.Context, com.instagram.common.session.UserSession, boolean):java.lang.String");
    }
}
