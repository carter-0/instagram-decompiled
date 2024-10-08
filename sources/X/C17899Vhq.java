package X;

import android.location.Location;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.Vhq  reason: case insensitive filesystem */
public final class C17899Vhq {
    public C324356z9 A00;
    public final UserSession A01;
    public final Keyword A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C17899Vhq(UserSession userSession, C324356z9 r3, Keyword keyword, String str, String str2, String str3) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r3;
        this.A02 = keyword;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
    }

    public final void A00(C324596za r14, String str, Set set, boolean z) {
        Location location;
        String str2;
        if (z) {
            C324366zA r1 = this.A00.A03;
            r1.A07 = null;
            r1.A02 = null;
        }
        C324356z9 r4 = this.A00;
        UserSession userSession = this.A01;
        String str3 = this.A02.A04;
        String str4 = r4.A03.A07;
        1Wr r12 = 1Wr.A00;
        if (r12 != null) {
            location = r12.getLastLocation(userSession, "KeywordSerpRequestController");
        } else {
            location = null;
        }
        String str5 = this.A05;
        String str6 = this.A04;
        String str7 = this.A03;
        0qQ.A0B(str3, 1);
        String str8 = null;
        try {
            str2 = Pxg.A0v(str3, (Locale) null, new Object[]{URLEncoder.encode(str3, ReactWebViewManager.HTML_ENCODING)}, 1);
        } catch (UnsupportedEncodingException unused) {
            str2 = "";
        }
        if (str4 != null) {
            str7 = null;
        }
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("fbsearch/search_engine_result_page/");
        C13989Tnp.A1N(A0b, "query", str2);
        A0b.A0G("lat", C13989Tnp.A0n(location));
        if (location != null) {
            str8 = Double.valueOf(location.getLongitude()).toString();
        }
        A0b.A0G("lng", str8);
        A0b.A0G("next_max_id", str4);
        A0b.A0G("rank_token", str);
        A0b.A0G("seen_categories", C51970G9q.A0k(set));
        A0b.A0G("prior_serp_keyword_id", str5);
        A0b.A0G("prior_module", str6);
        0qQ.A0B("topic_id", 0);
        A0b.A0G("pinned_media_id", str7);
        r4.A03(DbT.A0R((15p) null, A0b, UY6.class, C18245VoC.class, false), r14);
    }
}
