package X;

import android.graphics.RectF;
import android.net.Uri;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.net.URLDecoder;
import java.util.List;

public final class P25 implements C74319Psv {
    public final AnonymousClass7X7 A00;
    public final AnonymousClass7X8 A01;

    public final boolean Cmw(Uri uri, N3I n3i) {
        String str;
        boolean equals;
        N3I n3i2 = n3i;
        Uri uri2 = uri;
        boolean A1U = AnonymousClass7TF.A1U(0, uri2, n3i2);
        List<String> pathSegments = uri2.getPathSegments();
        String queryParameter = uri2.getQueryParameter("reel_id");
        String queryParameter2 = uri2.getQueryParameter("item_type");
        if (pathSegments.size() >= 3 && "stories".equalsIgnoreCase(AnonymousClass7TE.A19(pathSegments, 0)) && queryParameter != null) {
            String A19 = AnonymousClass7TE.A19(pathSegments, A1U ? 1 : 0);
            String A192 = AnonymousClass7TE.A19(pathSegments, 2);
            String queryParameter3 = uri2.getQueryParameter("reel_owner_id");
            if (queryParameter3 == null) {
                queryParameter3 = queryParameter;
            }
            1Nr r8 = new 1Nr(new User(queryParameter3, A19));
            String A0T = 002.A0T(A192, queryParameter3, '_');
            String queryParameter4 = uri2.getQueryParameter(AnonymousClass000.A00(3582));
            String str2 = null;
            if (queryParameter4 != null) {
                str = URLDecoder.decode(queryParameter4, ReactWebViewManager.HTML_ENCODING);
            } else {
                str = null;
            }
            if (!uri2.getBooleanQueryParameter("add_to_story", false)) {
                RectF rectF = n3i2.A01;
                if (rectF != null) {
                    String queryParameter5 = uri2.getQueryParameter("reaction");
                    AnonymousClass7X8 r4 = this.A01;
                    OMU omu = n3i2.A05;
                    ImageUrl imageUrl = n3i2.A04;
                    if (imageUrl != null) {
                        str2 = imageUrl.getUrl();
                    }
                    r4.CqX(rectF, omu, C66580MXl.A0i(n3i2.A08, n3i2.A07), r8, A0T, queryParameter, queryParameter5, str2, n3i2.A09);
                    return A1U;
                }
            } else if (Dba.A1X(2FW.A1v, queryParameter2)) {
                AnonymousClass7X7 r0 = this.A00;
                0qQ.A0A(A192);
                r0.Cpj(A192);
                return A1U;
            } else {
                boolean booleanQueryParameter = uri2.getBooleanQueryParameter("is_video", false);
                String queryParameter6 = uri2.getQueryParameter("music");
                AnonymousClass7X7 r6 = this.A00;
                boolean A1a = DbW.A1a(queryParameter6);
                if (queryParameter6 == null) {
                    equals = false;
                } else {
                    equals = queryParameter6.equals("original");
                }
                r6.CqV(n3i2.A05, r8, A0T, queryParameter, str, booleanQueryParameter, A1a, equals);
                return A1U;
            }
        }
        return false;
    }

    public P25(AnonymousClass7X7 r1, AnonymousClass7X8 r2) {
        AnonymousClass7TG.A1O(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
