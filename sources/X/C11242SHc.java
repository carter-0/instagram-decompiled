package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.SHc  reason: case insensitive filesystem */
public final class C11242SHc {
    public final 0wc A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public static final void A00(C11242SHc sHc, String str, String str2) {
        if (sHc.A04) {
            String str3 = sHc.A03;
            if (AnonymousClass7TF.A1Q(str3.length())) {
                0wb.A03("Browser logger", "Error getting null IAB Session Id");
                return;
            }
            if (!(str2 == null || str2.length() == 0)) {
                0wb.A03("Browser logger", str2);
            }
            1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(sHc.A00, "iab_link_history_ux"), 177);
            if (DbT.A1Y(A0U)) {
                A0U.A0R("sub_event", str);
                Pxe.A1R(A0U, str3);
                Pxf.A1D(A0U, (double) System.currentTimeMillis());
                A0U.A0O("is_prefetch", false);
                A0U.A0R(AnonymousClass000.A00(599), str2);
                A0U.Cgf();
            }
        }
    }

    public final void A01(String str, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "mwb_safe_browsing_warning_events");
        if (A0e.isSampled()) {
            A0e.AAJ(TraceFieldType.AdhocEventName, str2);
            A0e.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            A0e.AAJ("clicked_url", "");
            A0e.Cgf();
        }
    }

    public C11242SHc(UserSession userSession, String str, String str2, boolean z) {
        AnonymousClass7TG.A1O(userSession, str);
        this.A01 = userSession;
        this.A03 = str;
        this.A04 = z;
        this.A02 = str2;
        this.A00 = DbW.A0J(userSession, str2);
    }
}
