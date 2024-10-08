package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.ISu  reason: case insensitive filesystem */
public final class C57207ISu implements G73 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public final void DoN(1Xj r5) {
        0qQ.A0B(r5, 0);
        if (r5.A5G()) {
            UserSession userSession = this.A01;
            C270634h3 A0V = C51975G9x.A0V(ClipsViewerSource.VISUAL_REPLY, userSession, r5);
            A0V.A1H = this.A02;
            A0V.A09 = AnonymousClass5OB.VISUAL_COMMENT_REPLY;
            C250563lf.A0X(this.A00, A0V.A00(), userSession);
        } else if (r5.A5U()) {
            UserSession userSession2 = this.A01;
            F3W A032 = IgFragmentFactoryImpl.A00().A03(this.A03);
            A032.A0N = true;
            A032.A09 = this.A02;
            DbY.A0u(this.A00, A032.A00(), userSession2, "single_media_feed");
        }
    }

    public C57207ISu(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = fragmentActivity;
        this.A03 = str2;
    }

    public final void onFail(String str) {
        0wb.A03("VisualCommentReplyInteractiveUtil", 002.A0R("Failed to fetch visual reply original media: ", str));
    }
}
