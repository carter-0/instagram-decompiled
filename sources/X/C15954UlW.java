package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.api.model.SectionPagination;
import com.instagram.model.keyword.Keyword;
import com.instagram.search.surface.serp.contextualfeed.intf.KeywordSerpContextualFeedConfig;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Set;

/* renamed from: X.UlW  reason: case insensitive filesystem */
public final class C15954UlW extends GAR {
    public final UserSession A00;
    public final JRI A01;
    public final C322186vO A02;
    public final C17899Vhq A03;
    public final KeywordSerpContextualFeedConfig A04;
    public final C66986MgK A05;

    public final C54620HLd A05() {
        return null;
    }

    public final List A08() {
        return null;
    }

    public final void A0A() {
    }

    public final void A0B() {
    }

    public final void A0C() {
    }

    public final void A0F(2da r1) {
    }

    public final void A0H(AnonymousClass1qK r1) {
    }

    public final void A0I(AnonymousClass1qK r1) {
    }

    public final void A0L(C2362232x r1) {
    }

    public final void A0M(User user) {
    }

    public final void A0N(User user) {
    }

    public final void A0O(String str) {
    }

    public final void A0P(List list) {
    }

    public final boolean A0Y() {
        return true;
    }

    public final boolean A0Z() {
        return false;
    }

    public final boolean A0a() {
        return true;
    }

    public final boolean A0b() {
        return true;
    }

    public final boolean A0c() {
        return false;
    }

    public final boolean A0e() {
        return false;
    }

    public final boolean A0f() {
        return true;
    }

    public final boolean A0g() {
        return true;
    }

    public final boolean A0h(1Xj r2) {
        return true;
    }

    public final 1sy A06() {
        return 1sy.A0I;
    }

    public final Integer A07() {
        return AnonymousClass05K.A01;
    }

    public final void A09() {
        if (this.A03.A00.A03.A03 != AnonymousClass05K.A00 && A0S()) {
            A0Q(false, false);
        }
    }

    public final void A0D() {
        String A002 = this.A05.A00();
        if (A002 != null && A002.length() != 0) {
            UserSession userSession = this.A00;
            0qQ.A0B(userSession, 0);
            C17957Vip vip = (C17957Vip) userSession.A01(C15935Ul2.class, C20656Wwo.A00);
            String str = this.A04.A04;
            if (str != null) {
                vip.A00(str).A02 = A002;
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void A0Q(boolean z, boolean z2) {
        String str;
        UserSession userSession = this.A00;
        if (!182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36331033867600762L)) {
            C17899Vhq vhq = this.A03;
            C15960Ulc ulc = new C15960Ulc(this, z);
            if (z) {
                str = null;
            } else {
                str = this.A04.A03;
            }
            vhq.A00(ulc, str, (Set) null, z);
        }
    }

    public final boolean A0S() {
        return this.A03.A00.A05();
    }

    public final boolean A0T() {
        return GAR.A01(this.A00);
    }

    public final boolean A0U() {
        return C51973G9u.A1Y(this.A03.A00);
    }

    public final boolean A0W() {
        return C51973G9u.A1X(this.A03.A00);
    }

    public C15954UlW(Fragment fragment, UserSession userSession, JRI jri, KeywordSerpContextualFeedConfig keywordSerpContextualFeedConfig, C66986MgK mgK) {
        String str;
        UserSession userSession2 = userSession;
        this.A00 = userSession;
        this.A01 = jri;
        this.A05 = mgK;
        this.A04 = keywordSerpContextualFeedConfig;
        Context context = fragment.getContext();
        if (context != null) {
            0gy A002 = AnonymousClass07i.A00(fragment);
            SectionPagination sectionPagination = keywordSerpContextualFeedConfig.A00;
            if (sectionPagination != null) {
                str = sectionPagination.A00;
            } else {
                str = null;
            }
            C324356z9 r4 = new C324356z9(context, A002, userSession, str, true);
            Keyword keyword = keywordSerpContextualFeedConfig.A01;
            if (keyword != null) {
                this.A03 = new C17899Vhq(userSession2, r4, keyword, (String) null, keywordSerpContextualFeedConfig.A02, (String) null);
                this.A02 = new C322186vO(userSession);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final int A04(Context context) {
        return AnonymousClass3D4.A00(context);
    }
}
