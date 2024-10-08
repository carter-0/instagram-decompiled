package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.FFo  reason: case insensitive filesystem */
public final class C49935FFo {
    public final long A00;
    public final 0wc A01;
    public final String A02;
    public final String A03;

    public static 0Aj A00(C49935FFo fFo) {
        0wc r2 = fFo.A01;
        0Aj A002 = r2.A00(r2.A00, AnonymousClass000.A00(1484));
        A002.A9F("igid", Long.valueOf(fFo.A00));
        return A002;
    }

    public static void A01(0Aj r2, C49935FFo fFo, String str, String str2, boolean z) {
        r2.AAJ(Dbp.A00(), fFo.A03);
        r2.A7p("is_support_partner_enabled", Boolean.valueOf(z));
        r2.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, fFo.A02);
        r2.AAJ("service_type", str);
        r2.A9F("partner_id", 00y.A0n(10, str2));
    }

    public static void A02(0Aj r2, C49935FFo fFo, String str, boolean z) {
        r2.AAJ("action", str);
        r2.AAJ(Dbp.A00(), fFo.A03);
        r2.A7p("is_support_partner_enabled", Boolean.valueOf(z));
        r2.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, fFo.A02);
    }

    public C49935FFo(AnonymousClass0iw r3, UserSession userSession, String str, String str2) {
        AnonymousClass7TG.A1P(userSession, str);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = AnonymousClass0kN.A01(r3, userSession);
        this.A00 = Long.parseLong(userSession.A06);
    }
}
