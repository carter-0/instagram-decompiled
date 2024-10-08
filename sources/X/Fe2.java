package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import java.util.List;
import java.util.Map;

public final /* synthetic */ class Fe2 implements C51882G5u {
    public final void E2Z(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession) {
        String str;
        Uri A03 = 0cp.A03(bundle.getString("uri_string"));
        0qQ.A0B(A03, 0);
        String queryParameter = A03.getQueryParameter("media_id");
        String queryParameter2 = A03.getQueryParameter("product_type");
        String queryParameter3 = A03.getQueryParameter("achievement_id");
        String A0h = DbZ.A0h(A03);
        if (queryParameter != null && queryParameter2 != null && queryParameter3 != null) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            UserSession userSession2 = userSession;
            if (queryParameter2.equals(ProductType.FEED.A00) || queryParameter2.equals(ProductType.FEED_CAROUSEL.A00)) {
                FGD.A02(fragmentActivity2, userSession2, queryParameter);
            } else {
                if (queryParameter2.equals(ProductType.CLIPS.A00)) {
                    if (!fragmentActivity2.getSupportFragmentManager().A12()) {
                        FGD.A00.A03(fragmentActivity2, userSession2, queryParameter);
                    } else {
                        str = "Cannot launch Reels viewer";
                    }
                } else if (queryParameter2.equals(ProductType.STORY.A00)) {
                    String queryParameter4 = A03.getQueryParameter(AnonymousClass000.A00(796));
                    if (queryParameter4 == null) {
                        str = "Deeplink missing: story_reel_id";
                    } else {
                        List A1I = AnonymousClass7TE.A1I(queryParameter3);
                        C309416Ye A00 = FGD.A00(fragmentActivity2, userSession2, queryParameter4, queryParameter);
                        A00.A0P = AnonymousClass7TE.A1D(A1I);
                        A00.A0A = A0h;
                        AnonymousClass6W8 A01 = AnonymousClass6W8.A01(fragmentActivity2, A00.A00(), userSession2);
                        A01.A07();
                        A01.A0C(fragmentActivity2);
                        return;
                    }
                } else {
                    str = 002.A0R("product_type not recognized: ", queryParameter2);
                }
                List A1I2 = AnonymousClass7TE.A1I(queryParameter3);
                I6J.A00.A03(userSession2, (ProductType) ProductType.A01.get(queryParameter2), "activity_feed", "url_handler_input_validation", A0h, queryParameter, str, A1I2, (List) null, (List) null, (Map) null, (Map) null);
                C59689JTv.A0B(fragmentActivity2.getApplicationContext(), "something_went_wrong");
                return;
            }
            FragmentActivity fragmentActivity3 = fragmentActivity2;
            C48794EkH.A00().A04(fragmentActivity3, userSession2, queryParameter, A0h, AnonymousClass7TE.A1I(queryParameter3));
        }
    }
}
