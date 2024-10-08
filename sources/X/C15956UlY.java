package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.api.model.SectionPagination;
import com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig;
import com.instagram.hashtag.contextualfeed.intf.HashtagContextualFeedConfig;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.UlY  reason: case insensitive filesystem */
public final class C15956UlY extends GAR implements C266514Zg {
    public final int A00;
    public final UserSession A01;
    public final C16672Uz8 A02;
    public final JRI A03;
    public final C322186vO A04;
    public final C18575VuR A05;
    public final Hashtag A06;
    public final C66986MgK A07;
    public final String A08;
    public final C16672Uz8 A09;
    public final C17354VSh A0A;
    public final C51930G7y A0B;
    public final C49659F0q A0C;
    public final C18459Vs8 A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;

    public final C54620HLd A05() {
        return null;
    }

    public final void A0A() {
    }

    public final void A0B() {
    }

    public final void A0C() {
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

    public final boolean A0Y() {
        return true;
    }

    public final boolean A0Z() {
        return false;
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

    public C15956UlY(Fragment fragment, AnonymousClass0iw r23, UserSession userSession, JRI jri, HashtagContextualFeedConfig hashtagContextualFeedConfig, C66986MgK mgK) {
        UserSession userSession2 = userSession;
        this.A01 = userSession2;
        this.A03 = jri;
        this.A07 = mgK;
        HashtagContextualFeedConfig hashtagContextualFeedConfig2 = hashtagContextualFeedConfig;
        Hashtag hashtag = hashtagContextualFeedConfig2.A01;
        0qQ.A07(hashtag);
        this.A06 = hashtag;
        EntityContextualFeedConfig entityContextualFeedConfig = hashtagContextualFeedConfig2.A00;
        C16672Uz8 uz8 = entityContextualFeedConfig.A04;
        0qQ.A0A(uz8);
        this.A02 = uz8;
        this.A09 = entityContextualFeedConfig.A03;
        String str = entityContextualFeedConfig.A06;
        0qQ.A0A(str);
        this.A0F = str;
        this.A0E = entityContextualFeedConfig.A05;
        this.A00 = entityContextualFeedConfig.A01;
        String str2 = hashtagContextualFeedConfig2.A02;
        0qQ.A07(str2);
        this.A08 = str2;
        this.A04 = new C322186vO(userSession2);
        this.A0G = entityContextualFeedConfig.A07;
        Fragment fragment2 = fragment;
        this.A0A = new C17354VSh(fragment2.requireActivity(), new C17856Vh9(fragment2.requireActivity(), WW9.A00));
        C19386WXd wXd = new C19386WXd(this);
        this.A0B = wXd;
        Hashtag hashtag2 = this.A06;
        C49530ExC A002 = ORV.A00(userSession2, false);
        0qQ.A07(A002);
        this.A0C = new C49659F0q(fragment2, r23, userSession2, wXd, hashtag2, A002, str2);
        FragmentActivity requireActivity = fragment2.requireActivity();
        0gy A003 = AnonymousClass07i.A00(fragment2);
        SectionPagination sectionPagination = entityContextualFeedConfig.A02;
        C18459Vs8 vs8 = new C18459Vs8(new C324356z9(requireActivity, A003, userSession2, sectionPagination.A00, true), sectionPagination.A01, sectionPagination.A02);
        this.A0D = vs8;
        FragmentActivity requireActivity2 = fragment2.requireActivity();
        Map singletonMap = Collections.singletonMap(uz8, vs8);
        String name = this.A06.getName();
        if (name != null) {
            this.A05 = new C18575VuR(requireActivity2, userSession2, uz8, name, hashtagContextualFeedConfig2.A03, singletonMap);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final 1sy A06() {
        return 1sy.A0C;
    }

    public final Integer A07() {
        return AnonymousClass05K.A01;
    }

    public final List A08() {
        UserSession userSession = this.A01;
        0qQ.A0B(userSession, 0);
        String str = this.A08;
        0qQ.A0B(str, 0);
        return (List) ((VO6) userSession.A01(VO6.class, C20650Wwi.A00)).A00.remove(str);
    }

    public final void A09() {
        if (C18459Vs8.A00(this.A05).A06()) {
            A0Q(false, false);
        }
    }

    public final void A0D() {
        String A002 = this.A07.A00();
        if (A002 != null && A002.length() != 0) {
            UserSession userSession = this.A01;
            0qQ.A0B(userSession, 0);
            String str = this.A08;
            0qQ.A0B(str, 0);
            ((C17957Vip) userSession.A01(C15933Ul0.class, C20649Wwh.A00)).A00(str).A02 = A002;
        }
    }

    public final void A0F(2da r5) {
        C17354VSh vSh;
        String str = this.A0E;
        if (str != null) {
            vSh = this.A0A;
            String str2 = this.A0F;
            0qQ.A0B(str2, 1);
            r5.EfN(str2, str);
        } else {
            r5.AHX();
            vSh = this.A0A;
            String str3 = this.A0F;
            0qQ.A0B(str3, 1);
            r5.setTitle(str3);
        }
        vSh.A01.A00(r5, -1);
    }

    public final void A0G(0jB r3) {
        C16672Uz8 uz8 = this.A09;
        if (uz8 != null) {
            r3.A04(C298085sr.A00, uz8.toString());
        }
    }

    public final void A0Q(boolean z, boolean z2) {
        this.A05.A01(new C15961Uld(1, this, z), GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, z, false, false);
    }

    public final boolean A0S() {
        return C18459Vs8.A00(this.A05).A05();
    }

    public final boolean A0T() {
        return GAR.A01(this.A01);
    }

    public final boolean A0U() {
        return C51973G9u.A1Y(C18459Vs8.A00(this.A05));
    }

    public final boolean A0W() {
        return C51973G9u.A1X(C18459Vs8.A00(this.A05));
    }

    public final boolean A0a() {
        return this.A0G;
    }

    public final Hashtag BCW() {
        return this.A06;
    }

    public final int A04(Context context) {
        return AnonymousClass3D4.A00(context);
    }

    public final void A0P(List list) {
        0wb.A03("HashtagContextualFeedController", 002.A0c("Cache miss for ", " media.", C51971G9r.A0H(list)));
    }
}
