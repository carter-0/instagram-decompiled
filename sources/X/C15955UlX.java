package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.api.model.SectionPagination;
import com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig;
import com.instagram.location.contextualfeed.intf.LocationContextualFeedConfig;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.UlX  reason: case insensitive filesystem */
public final class C15955UlX extends GAR {
    public final Fragment A00;
    public final UserSession A01;
    public final JRI A02;
    public final LocationContextualFeedConfig A03;
    public final C18621VvE A04;
    public final VOM A05;
    public final C66986MgK A06;
    public final boolean A07;

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

    public C15955UlX(Fragment fragment, UserSession userSession, JRI jri, LocationContextualFeedConfig locationContextualFeedConfig, C66986MgK mgK) {
        Fragment fragment2 = fragment;
        this.A00 = fragment2;
        UserSession userSession2 = userSession;
        this.A01 = userSession2;
        this.A02 = jri;
        this.A06 = mgK;
        this.A05 = new VOM(new C17856Vh9(fragment2.requireContext(), new WW8(this)));
        LocationContextualFeedConfig locationContextualFeedConfig2 = locationContextualFeedConfig;
        this.A03 = locationContextualFeedConfig2;
        C19421WYo wYo = new C19421WYo(this);
        String str = locationContextualFeedConfig2.A03;
        EntityContextualFeedConfig entityContextualFeedConfig = locationContextualFeedConfig2.A00;
        C16672Uz8 uz8 = entityContextualFeedConfig.A04;
        FragmentActivity requireActivity = fragment2.requireActivity();
        0gy A002 = AnonymousClass07i.A00(fragment2);
        SectionPagination sectionPagination = entityContextualFeedConfig.A02;
        String str2 = sectionPagination.A00;
        C16672Uz8 uz82 = uz8;
        C19421WYo wYo2 = wYo;
        C19421WYo wYo3 = wYo;
        C19421WYo wYo4 = wYo;
        this.A04 = new C18621VvE(fragment2.getActivity(), AnonymousClass07i.A00(fragment2), userSession2, wYo, wYo2, wYo3, wYo4, str, Collections.singletonMap(this.A03.A00.A04, new C17658Vbo(userSession2, uz82, new C324356z9(requireActivity, A002, userSession2, str2, true), new VW4(sectionPagination.A01, sectionPagination.A02, AnonymousClass7TF.A1V(str2)), str, locationContextualFeedConfig2.A02, (String) null, true)), true);
        this.A07 = entityContextualFeedConfig.A07;
    }

    public final 1sy A06() {
        return 1sy.A0G;
    }

    public final Integer A07() {
        return AnonymousClass05K.A01;
    }

    public final void A09() {
        if (!C51973G9u.A1X(C18621VvE.A00(this.A04, this.A03.A00.A04).A04) && A0S()) {
            A0Q(false, false);
        }
    }

    public final void A0D() {
        String A002 = this.A06.A00();
        if (!TextUtils.isEmpty(A002)) {
            UserSession userSession = this.A01;
            0qQ.A0B(userSession, 0);
            String str = this.A03.A01;
            0qQ.A0B(str, 0);
            ((C17957Vip) userSession.A01(C15934Ul1.class, C20653Wwl.A00)).A00(str).A02 = A002;
        }
    }

    public final void A0F(2da r4) {
        VOM vom = this.A05;
        EntityContextualFeedConfig entityContextualFeedConfig = this.A03.A00;
        String str = entityContextualFeedConfig.A06;
        str.getClass();
        String str2 = entityContextualFeedConfig.A05;
        str2.getClass();
        r4.EfN(str, str2);
        vom.A00.A00(r4, -1);
    }

    public final void A0Q(boolean z, boolean z2) {
        this.A04.A01(this.A03.A00.A04, z, z2);
    }

    public final boolean A0S() {
        return this.A04.A02(this.A03.A00.A04);
    }

    public final boolean A0T() {
        return GAR.A01(this.A01);
    }

    public final boolean A0U() {
        return C51973G9u.A1Y(C18621VvE.A00(this.A04, this.A03.A00.A04).A04);
    }

    public final boolean A0W() {
        return C51973G9u.A1X(C18621VvE.A00(this.A04, this.A03.A00.A04).A04);
    }

    public final boolean A0a() {
        return this.A07;
    }

    public final int A04(Context context) {
        return AnonymousClass3D4.A00(context);
    }

    public final void A0P(List list) {
        0wb.A03("LocationContextualFeedController", 002.A0c("Cache miss for ", " media.", C51971G9r.A0H(list)));
    }
}
