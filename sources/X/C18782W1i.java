package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.shopping.model.analytics.ProductDetailsPageLoggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.BitSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.W1i  reason: case insensitive filesystem */
public final class C18782W1i {
    public IgBloksScreenConfig A00;
    public 1Xj A01;
    public C17538VZr A02;
    public Product A03;
    public final long A04;
    public final FragmentActivity A05;
    public final RankingInfo A06;
    public final AnonymousClass4DH A07;
    public final UserSession A08;
    public final AnonymousClass4DU A09;
    public final VP6 A0A;
    public final X9C A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;

    public C18782W1i(RankingInfo rankingInfo, AnonymousClass4DH r4, UserSession userSession, AnonymousClass4DU r6, VP6 vp6, X9C x9c, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        0qQ.A0B(userSession, 2);
        C51974G9v.A1N(vp6, str, str2);
        0qQ.A0B(str5, 11);
        this.A07 = r4;
        this.A08 = userSession;
        this.A09 = r6;
        this.A0B = x9c;
        this.A0A = vp6;
        this.A0J = str;
        this.A0C = str2;
        this.A0E = str3;
        this.A0G = str4;
        this.A06 = rankingInfo;
        this.A0H = str5;
        this.A0D = str6;
        this.A0I = str7;
        this.A0F = str8;
        FragmentActivity activity = r4.getActivity();
        if (activity != null) {
            this.A05 = activity;
            this.A04 = 600;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A03(28D r12, ProductArEffectMetadata productArEffectMetadata, Product product) {
        Product product2 = product;
        0qQ.A0B(product, 1);
        FragmentActivity fragmentActivity = this.A05;
        if (!C305756Jk.A00(fragmentActivity)) {
            C59689JTv.A07(fragmentActivity, 2131953140);
            return;
        }
        C249713kF r3 = C249713kF.A00;
        AnonymousClass4DH r2 = this.A07;
        FragmentActivity requireActivity = r2.requireActivity();
        UserSession userSession = this.A08;
        String str = this.A0J;
        OVZ A082 = r3.A08(requireActivity, r12, userSession, productArEffectMetadata, product2, str, this.A09.getModuleName());
        A082.A00 = r2;
        A082.A03 = str;
        A082.A01 = this.A0C;
        A082.A02 = C51971G9r.A0s(this.A01);
        A082.A01();
    }

    public final void A05(User user, List list, boolean z) {
        0qQ.A0B(list, 0);
        User user2 = user;
        C249713kF.A00.A15(this.A05, this.A08, user2, this.A09.getModuleName(), this.A0G, this.A0E, this.A0J, list, z);
    }

    public static final ProductDetailsPageLoggingInfo A00(C18782W1i w1i) {
        X9C x9c = w1i.A0B;
        Product product = x9c.Bz5().A08;
        if (product != null) {
            Product product2 = x9c.Bz5().A09;
            if (product2 != null) {
                return new ProductDetailsPageLoggingInfo(product, product2);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A01(C18782W1i w1i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        UserSession userSession = w1i.A08;
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
        igBloksScreenConfig.A0R = C273654mx.A00(128);
        w1i.A00 = igBloksScreenConfig;
        C17538VZr vZr = new C17538VZr(w1i.A07.requireContext());
        Map map = vZr.A04;
        map.put("merchant_name", str);
        BitSet bitSet = vZr.A02;
        bitSet.set(0);
        map.put(Pxd.A00(99), str2);
        bitSet.set(1);
        map.put("shopping_session_id", str3);
        map.put("checkout_session_id", str4);
        map.put("is_checkout_enabled", Boolean.valueOf(z));
        map.put("layout", str5);
        0qQ.A0B(str6, 0);
        map.put("prior_module", str6);
        map.put("prior_submodule", str7);
        0Tu r5 = 0Tu.A06;
        map.put("is_lightbox_preloading_enabled", AnonymousClass7TF.A0R(r5, userSession, 36313248408667994L));
        map.put("is_shimmer_enabled", AnonymousClass7TF.A0R(r5, userSession, 36313248408602457L));
        w1i.A02 = vZr;
    }

    public static final boolean A02(C18782W1i w1i) {
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(w1i.A07.requireActivity());
        if (A012 == null || !((AnonymousClass37F) A012).A0g) {
            return false;
        }
        return true;
    }

    public final void A04(Product product) {
        FH7.A0A(this.A05, this.A08, product, C51971G9r.A0s(this.A01), this.A0J, this.A09.getModuleName());
    }

    public final void A06(String str, String str2, String str3) {
        Product product = this.A03;
        if (product != null) {
            UserSession userSession = this.A08;
            AnonymousClass4DU r9 = this.A09;
            String str4 = product.A0H;
            if (str4 == null) {
                str4 = "";
            }
            C233822wX.A0K(userSession, new WWV(str3, this, 0), HLF.BRAND, new WWW(str4), r9, (C249763kK) null, (Integer) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, false);
            1a1 A022 = C46447Df9.A02();
            C46474Dfc A012 = C46548Dgp.A01(userSession, str, str2, r9.getModuleName());
            A012.A0L = this.A0J;
            UserDetailLaunchConfig A042 = A012.A04();
            if (A02(this)) {
                Bundle A013 = A022.A01(userSession, A042);
                DbU.A0w(this.A05, A013, userSession, ModalActivity.class, "profile");
                return;
            }
            C309516Yo A0Q = DbU.A0Q(this.A05, userSession);
            A0Q.A0B((Bundle) null, A022.A02(userSession, A042));
            A0Q.A04();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
