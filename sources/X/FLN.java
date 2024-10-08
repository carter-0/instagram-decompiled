package X;

import android.net.Uri;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.common.session.UserSession;
import com.instagram.fx.igxfb.IgxfbNetEgoCTABannerParams;
import java.net.URLDecoder;

public final class FLN implements View.OnClickListener {
    public final /* synthetic */ C49623Ezg A00;

    public FLN(C49623Ezg ezg) {
        this.A00 = ezg;
    }

    public final void onClick(View view) {
        Long l;
        int A05 = AnonymousClass0fD.A05(-1404543127);
        C49623Ezg ezg = this.A00;
        IgxfbNetEgoCTABannerParams igxfbNetEgoCTABannerParams = ezg.A02;
        String decode = URLDecoder.decode(igxfbNetEgoCTABannerParams.A00, ReactWebViewManager.HTML_ENCODING);
        Long l2 = null;
        Uri.Builder A07 = DbW.A07(C273654mx.A00(731));
        UserSession userSession = ezg.A01;
        A07.appendQueryParameter("ref", 182.A04(0Tu.A05, userSession, 36887047448822511L));
        FGT.A00(ezg.A00, (FragmentActivity) null, userSession, decode, DbT.A10(A07.build()), "igxfb_net_ego", "IGXFB_NET_EGO", "");
        0wc r1 = ezg.A04;
        0qQ.A0A(decode);
        0qQ.A0B(decode, 3);
        0Aj A0e = AnonymousClass7TE.A0e(r1, "instagram_pymr_fb_banner_click");
        if (A0e.isSampled()) {
            A0e.A9F("entity_id", 00y.A0n(10, userSession.A06));
            String str = igxfbNetEgoCTABannerParams.A02;
            if (str != null) {
                l = 00y.A0n(10, str);
            } else {
                l = null;
            }
            A0e.A9F("netego_type", l);
            String str2 = igxfbNetEgoCTABannerParams.A01;
            if (str2 != null) {
                l2 = 00y.A0n(10, str2);
            }
            A0e.A9F("media_id", l2);
            A0e.AAJ("navigation_url", decode);
            A0e.Cgf();
        }
        AnonymousClass0fD.A0C(1425170292, A05);
    }
}
