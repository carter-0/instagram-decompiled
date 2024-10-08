package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.modal.TransparentBackgroundModalActivity;
import com.instagram.shopping.model.analytics.ShoppingNavigationInfo;
import com.instagram.shopping.model.pdp.link.secondarytext.SecondaryTextContent;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.Uqx  reason: case insensitive filesystem */
public final class C16234Uqx extends VP2 {
    public final W03 A00;
    public final W1W A01;
    public final VP3 A02;
    public final X9C A03;
    public final C18782W1i A04;
    public final C17497VYa A05;
    public final WVN A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16234Uqx(Activity activity, AnonymousClass0iw r9, UserSession userSession, W03 w03, W1W w1w, C18782W1i w1i, X9C x9c, C18020Vjw vjw) {
        super(vjw);
        DbW.A1N(userSession, 1, w1w);
        AnonymousClass7TF.A1F(w1i, 7, vjw);
        this.A03 = x9c;
        this.A01 = w1w;
        this.A00 = w03;
        this.A04 = w1i;
        this.A05 = new C17497VYa(w03, w1w, w1i, x9c);
        Activity activity2 = activity;
        AnonymousClass0iw r2 = r9;
        this.A06 = new WVN(activity2, r2, userSession, w03, w1w, x9c);
        this.A02 = new VP3(w1i);
    }

    public final void A00(C16263UrQ urQ) {
        String str;
        ImageUrl Bh3;
        String str2;
        C16263UrQ urQ2 = urQ;
        0qQ.A0B(urQ2, 0);
        C17502VYf vYf = urQ2.A01;
        if (vYf != null) {
            SecondaryTextContent secondaryTextContent = vYf.A00;
            int intValue = vYf.A01.intValue();
            if (intValue == 0) {
                C17497VYa vYa = this.A05;
                0qQ.A07(urQ2.A02);
                Product product = vYa.A03.Bz5().A09;
                if (product != null) {
                    vYa.A02.A04(product);
                    W03 w03 = vYa.A00;
                    if (w03 != null) {
                        w03.A03(product, "view_external_link");
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            } else if (intValue == 1) {
                WVN wvn = this.A06;
                Product product2 = wvn.A05.Bz5().A09;
                if (product2 != null) {
                    W03 w032 = wvn.A03;
                    if (w032 != null) {
                        C15054ULx A032 = C294165ly.A03(w032.A03, product2);
                        0Aj A0e = AnonymousClass7TE.A0e(w032.A02, "instagram_ads_app_message_advertiser_cta_click");
                        if (A0e.isSampled()) {
                            C15029UKi uKi = w032.A01;
                            if (uKi == null || (str2 = uKi.A05) == null) {
                                str2 = "";
                            }
                            C51965G9l.A1L(A0e, W03.A00(A0e, w032, str2));
                            W03.A01(A0e, w032, C15054ULx.A01(A0e, A032));
                            A0e.Cgf();
                        }
                    }
                    Parcelable.Creator creator = User.CREATOR;
                    User user = product2.A0B;
                    String str3 = null;
                    if (user != null) {
                        str3 = AnonymousClass3ZA.A00(user);
                        str = C13988Tno.A0b(user);
                    } else {
                        str = null;
                    }
                    User user2 = new User(str3, str);
                    if (user == null || (Bh3 = user.A03.Bh3()) == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    user2.A0l(Bh3);
                    0lg r4 = wvn.A02;
                    String A002 = C273654mx.A00(52);
                    Bundle A0B = DbY.A0B("IgSessionManager.SESSION_TOKEN_KEY", r4.A05);
                    String A003 = AnonymousClass000.A00(220);
                    A0B.putString(A003, A002);
                    String A004 = AnonymousClass000.A00(432);
                    A0B.putParcelable(A004, product2);
                    if (secondaryTextContent != null) {
                        A0B.putParcelable(AnonymousClass000.A00(433), secondaryTextContent);
                    }
                    E5l A005 = C48839El1.A00(A0B, wvn, user2);
                    AnonymousClass37E r0 = AnonymousClass37D.A00;
                    Activity activity = wvn.A00;
                    AnonymousClass37D A012 = r0.A01(activity);
                    if (A012 == null) {
                        return;
                    }
                    if (((AnonymousClass37F) A012).A0g) {
                        0eP r12 = new 0eP(A003, A002);
                        0eP r13 = new 0eP(A004, product2);
                        0eP r14 = new 0eP(AnonymousClass000.A00(908), secondaryTextContent);
                        0eP r15 = new 0eP(AnonymousClass000.A00(2208), wvn.A01.getModuleName());
                        W1W w1w = wvn.A04;
                        AnonymousClass6W8 r152 = new AnonymousClass6W8(activity, Q21.A00(r12, r13, r14, r15, new 0eP(AnonymousClass000.A00(2207), w1w.A0C), new 0eP(AnonymousClass000.A00(2209), new ShoppingNavigationInfo("message_cta", w1w.A0F, w1w.A0D, w1w.A0H)), new 0eP(C66579MXk.A00(4), "message_merchant")), r4, TransparentBackgroundModalActivity.class, "bottom_sheet");
                        r152.A09(0);
                        r152.A0C(activity.getApplicationContext());
                        return;
                    }
                    A012.A0J(A005);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }
}
