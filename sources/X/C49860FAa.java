package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.FAa  reason: case insensitive filesystem */
public final class C49860FAa {
    public final UserSession A00;
    public final AnonymousClass0iw A01;
    public final 1Q9 A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public static 0xI A00(C49860FAa fAa, Integer num) {
        String str;
        1Q9 r3 = fAa.A02;
        0xI A002 = 0xI.A00(fAa.A01, "ig_live_reshare_waterfall");
        1QA.A02(A002, r3);
        switch (num.intValue()) {
            case 0:
                str = "reshare_list_opened";
                break;
            case 1:
                str = "candidate_selected";
                break;
            case 2:
                str = "candidate_deselected";
                break;
            default:
                str = "reshare_sent";
                break;
        }
        A002.A0C("step", str);
        A002.A0C("a_pk", fAa.A04);
        A002.A0C(TraceFieldType.BroadcastId, fAa.A03);
        A002.A0C("m_pk", fAa.A08);
        A002.A0C("source", fAa.A07);
        A002.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, fAa.A06);
        A002.A0C("live_module", fAa.A05);
        return A002;
    }

    public C49860FAa(AnonymousClass0iw r2, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A00 = userSession;
        this.A01 = r2;
        1Q9 A002 = 1Q9.A00(r2, getClass().getName());
        this.A02 = A002;
        A002.A08();
        this.A03 = str;
        this.A08 = str2;
        this.A04 = str3;
        this.A05 = str6;
        this.A07 = str4;
        this.A06 = str5;
    }
}
