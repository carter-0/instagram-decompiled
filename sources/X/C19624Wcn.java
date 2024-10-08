package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments;
import com.instagram.user.model.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Wcn  reason: case insensitive filesystem */
public final class C19624Wcn implements XCC {
    public final C18065Vkr A00;
    public final X9C A01;
    public final VZO A02;
    public final AnonymousClass0iw A03;
    public final C307786Rm A04;
    public final UserSession A05;
    public final C18738VzJ A06;
    public final C18588Vuf A07;
    public final Product A08;

    public final void A7o(C18588Vuf vuf, C16276Urd urd) {
    }

    public final void DEz(C18001Vjd vjd, String str) {
    }

    public final void DF0(C18001Vjd vjd, String str) {
    }

    public final void DIv(C16276Urd urd) {
        0qQ.A0B(urd, 0);
        C18738VzJ vzJ = this.A06;
        if (vzJ != null) {
            vzJ.A02 = true;
        }
        C307786Rm r3 = this.A04;
        FragmentActivity fragmentActivity = r3.A00;
        DbS.A1X(fragmentActivity);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (!C305756Jk.A00(fragmentActivity2)) {
            C59689JTv.A07(fragmentActivity2, 2131953140);
            return;
        }
        C249713kF r4 = C249713kF.A00;
        UserSession userSession = this.A05;
        String str = this.A02.A02;
        28D r6 = 28D.A4J;
        String moduleName = this.A03.getModuleName();
        OVZ A082 = r4.A08(fragmentActivity2, r6, userSession, urd.A01, this.A08, str, moduleName);
        Fragment fragment = ((C229382nI) r3.A02).A02;
        0qQ.A0B(fragment, 0);
        A082.A00 = fragment;
        A082.A03 = str;
        A082.A01();
    }

    public final void DIw(ProductArEffectMetadata productArEffectMetadata) {
    }

    public final void DIy(C16272UrZ urZ, String str) {
    }

    public final void DJ0(C16271UrY urY, String str) {
    }

    public final void DJ1(XC0 xc0, C16274Urb urb, String str) {
    }

    public final void DJ2(C16275Urc urc, String str) {
    }

    public final void EBR(View view, String str) {
    }

    public final void DIx(C18001Vjd vjd) {
        1Xj r4;
        C18065Vkr vkr = this.A00;
        vkr.A03("scroll");
        if (vjd == null) {
            X9C x9c = this.A01;
            C18588Vuf Bz5 = x9c.Bz5();
            W2j w2j = new W2j(Bz5);
            W2j.A01((1Xj) null, Uw7.A02, w2j, new C18570VuM(Bz5.A04));
            C18588Vuf.A00(x9c, w2j);
            return;
        }
        if (vjd instanceof C16272UrZ) {
            r4 = ((C16272UrZ) vjd).A00;
        } else if (vjd instanceof C16271UrY) {
            r4 = ((C16271UrY) vjd).A00;
        } else if (vjd instanceof C16274Urb) {
            r4 = ((C16274Urb) vjd).A00;
        } else {
            return;
        }
        X9C x9c2 = this.A01;
        C18588Vuf Bz52 = x9c2.Bz5();
        W2j w2j2 = new W2j(Bz52);
        W2j.A01(r4, Uw7.PREPARING, w2j2, new C18570VuM(Bz52.A04));
        C18588Vuf.A00(x9c2, w2j2);
        vkr.A00(r4);
    }

    public final void DIz(C16273Ura ura, String str) {
        C16273Ura ura2 = ura;
        boolean A1X = DbW.A1X(ura2);
        C18588Vuf vuf = this.A07;
        W1L w1l = vuf.A04;
        0lg r1 = this.A05;
        Product product = this.A08;
        Parcelable[] A002 = VHI.A00(w1l.A01(r1, product));
        String str2 = product.A0H;
        Map unmodifiableMap = Collections.unmodifiableMap(vuf.A07.A01);
        0qQ.A07(unmodifiableMap);
        Bundle bundle = new Bundle();
        0qQ.A0A(A002);
        String str3 = ura2.A01;
        String moduleName = this.A03.getModuleName();
        String str4 = this.A02.A00.A0H;
        HashMap hashMap = new HashMap(unmodifiableMap);
        Set keySet = vuf.A0D.keySet();
        0qQ.A07(keySet);
        bundle.putParcelable("arguments", new LightboxArguments((RankingInfo) null, product, str2, "", "mCheckoutSessionId", str3, moduleName, "", str4, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, hashMap, keySet, A002, A1X, A1X));
        Context context = this.A04.A00;
        Activity activity = (Activity) context;
        AnonymousClass6W8 r5 = new AnonymousClass6W8(activity, bundle, r1, ModalActivity.class, "shopping_lightbox");
        0qQ.A0C(context, "null cannot be cast to non-null type android.app.Activity");
        r5.A0A(activity, 7);
    }

    public C19624Wcn(VZO vzo, AnonymousClass0iw r2, C307786Rm r3, UserSession userSession, C18065Vkr vkr, C18738VzJ vzJ, X9C x9c, C18588Vuf vuf, Product product) {
        this.A05 = userSession;
        this.A08 = product;
        this.A07 = vuf;
        this.A03 = r2;
        this.A04 = r3;
        this.A00 = vkr;
        this.A01 = x9c;
        this.A02 = vzo;
        this.A06 = vzJ;
    }
}
