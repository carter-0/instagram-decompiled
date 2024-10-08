package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import java.util.List;
import java.util.Map;

/* renamed from: X.Fhu  reason: case insensitive filesystem */
public final class C50755Fhu implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        String str;
        ProductType productType;
        FragmentActivity fragmentActivity;
        UserSession userSession;
        0qQ.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("media_id");
        String queryParameter2 = uri.getQueryParameter("product_type");
        String queryParameter3 = uri.getQueryParameter("achievement_id");
        String A0h = DbZ.A0h(uri);
        if (queryParameter == null || queryParameter2 == null || queryParameter3 == null) {
            str = "Deeplink missing:";
            if (queryParameter == null) {
                str = 002.A0R(str, " media_id");
            }
            if (queryParameter2 == null) {
                str = 002.A0R(str, " product_type");
            }
            if (queryParameter3 == null) {
                str = 002.A0R(str, " achievement_id");
            }
        } else {
            if (queryParameter2.equals(ProductType.FEED.A00) || queryParameter2.equals(ProductType.FEED_CAROUSEL.A00)) {
                fragmentActivity = this.A00;
                userSession = this.A01;
                FGD.A02(fragmentActivity, userSession, queryParameter);
            } else if (queryParameter2.equals(ProductType.CLIPS.A00)) {
                fragmentActivity = this.A00;
                if (!fragmentActivity.getSupportFragmentManager().A12()) {
                    FGD fgd = FGD.A00;
                    userSession = this.A01;
                    fgd.A03(fragmentActivity, userSession, queryParameter);
                } else {
                    str = "Cannot launch Reels viewer";
                }
            } else if (queryParameter2.equals(ProductType.STORY.A00)) {
                String queryParameter4 = uri.getQueryParameter(AnonymousClass000.A00(796));
                if (queryParameter4 == null) {
                    str = "Deeplink missing: story_reel_id";
                } else {
                    FragmentActivity fragmentActivity2 = this.A00;
                    UserSession userSession2 = this.A01;
                    List A1I = AnonymousClass7TE.A1I(queryParameter3);
                    C309416Ye A002 = FGD.A00(fragmentActivity2, userSession2, queryParameter4, queryParameter);
                    A002.A0P = AnonymousClass7TE.A1D(A1I);
                    A002.A0A = A0h;
                    AnonymousClass6W8 A012 = AnonymousClass6W8.A01(fragmentActivity2, A002.A00(), userSession2);
                    A012.A07();
                    A012.A0C(fragmentActivity2);
                    return;
                }
            } else {
                str = 002.A0R("product_type not recognized: ", queryParameter2);
            }
            C48794EkH.A00().A04(fragmentActivity, userSession, queryParameter, A0h, AnonymousClass7TE.A1I(queryParameter3));
            return;
        }
        List list = null;
        if (queryParameter2 != null) {
            productType = (ProductType) ProductType.A01.get(queryParameter2);
        } else {
            productType = null;
        }
        if (queryParameter3 != null) {
            list = AnonymousClass7TE.A1I(queryParameter3);
        }
        I6J.A00.A03(this.A01, productType, "activity_feed", "url_handler_input_validation", A0h, queryParameter, str, list, (List) null, (List) null, (Map) null, (Map) null);
        C59689JTv.A0B(this.A00.getApplicationContext(), "something_went_wrong");
    }

    public C50755Fhu(FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass7TG.A1O(fragmentActivity, userSession);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
