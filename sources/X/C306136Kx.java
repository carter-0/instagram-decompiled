package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.common.session.UserSession;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Kx  reason: invalid class name and case insensitive filesystem */
public final class C306136Kx extends 1P0 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AdsAPIInstagramPosition A01;
    public final /* synthetic */ XIGIGBoostCallToAction A02;
    public final /* synthetic */ UserSession A03;

    public C306136Kx(FragmentActivity fragmentActivity, AdsAPIInstagramPosition adsAPIInstagramPosition, XIGIGBoostCallToAction xIGIGBoostCallToAction, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A03 = userSession;
        this.A01 = adsAPIInstagramPosition;
        this.A02 = xIGIGBoostCallToAction;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String string;
        int A032 = AnonymousClass0fD.A03(-484470963);
        1XO r1 = (1XO) obj;
        int A033 = AnonymousClass0fD.A03(-353826049);
        0qQ.A0B(r1, 0);
        List list = r1.A06;
        0qQ.A07(list);
        1Xj r10 = (1Xj) 00k.A0J(list);
        if (r10 != null) {
            FragmentActivity fragmentActivity = this.A00;
            UserSession userSession = this.A03;
            AdsAPIInstagramPosition adsAPIInstagramPosition = this.A01;
            XIGIGBoostCallToAction xIGIGBoostCallToAction = this.A02;
            C309516Yo r5 = new C309516Yo(fragmentActivity, userSession);
            int i = 2131970672;
            if (adsAPIInstagramPosition.ordinal() == 2) {
                i = 2131970671;
            }
            String string2 = fragmentActivity.getString(i);
            String id = r10.getId();
            String id2 = r10.getId();
            if (id2 == null) {
                id2 = "";
            }
            ArrayList A1L = 0sr.A1L(new String[]{id2});
            if (xIGIGBoostCallToAction == XIGIGBoostCallToAction.NO_BUTTON) {
                string = null;
            } else {
                string = fragmentActivity.getString(C18677Vwa.A00(xIGIGBoostCallToAction));
            }
            Bundle bundle = new Bundle();
            bundle.putString(C53352Gmc.A03, adsAPIInstagramPosition.A00);
            bundle.putString(C53352Gmc.A02, string);
            ContextualFeedFragment contextualFeedFragment = new ContextualFeedFragment();
            contextualFeedFragment.setArguments(C46424Del.A05(bundle, "FEED_AD_PREVIEW", string2, id, "feed_ad_preview", (String) null, A1L));
            r5.A0B((Bundle) null, contextualFeedFragment);
            r5.A0F = true;
            r5.A04();
        }
        AnonymousClass0fD.A0A(-82232601, A033);
        AnonymousClass0fD.A0A(525485154, A032);
    }
}
