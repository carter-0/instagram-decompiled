package X;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.util.List;

/* renamed from: X.2ze  reason: invalid class name and case insensitive filesystem */
public final class C235272ze extends C230372pW {
    public static final 0bY A03 = new 1Q7("IgSecureUriParser").A00;
    public static final String A04;
    public final FragmentActivity A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;

    static {
        String name = C235272ze.class.getName();
        0qQ.A07(name);
        A04 = name;
    }

    public C235272ze(FragmentActivity fragmentActivity, 1Bk r3, UserSession userSession, AnonymousClass4DU r5) {
        super(r3, new C235282zf());
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = r5;
    }

    public static final void A00(1Xj r7, C235272ze r8) {
        List Alu;
        AndroidLink androidLink;
        String Avj;
        Uri A002;
        UserSession userSession = r8.A01;
        if (182.A06(0Tu.A05, userSession, 36330853478974262L) && (Alu = r7.A0C.Alu()) != null && !Alu.isEmpty() && (androidLink = (AndroidLink) 00k.A0J(((1Xj) Alu.get(0)).A3P())) != null && (Avj = androidLink.Avj()) != null && (A002 = 0cp.A00(A03, Avj)) != null && A002.isHierarchical()) {
            String queryParameter = A002.getQueryParameter("app_id");
            String queryParameter2 = A002.getQueryParameter("merchant_id");
            String queryParameter3 = A002.getQueryParameter("ad_id");
            String queryParameter4 = A002.getQueryParameter("ad_tracking_token");
            if (0qQ.A0K(queryParameter, "com.bloks.www.bloks.commerce.cart.singlemerchantcart") && queryParameter2 != null && queryParameter3 != null && queryParameter4 != null) {
                C249713kF r1 = C249713kF.A00;
                FragmentActivity fragmentActivity = r8.A00;
                0qQ.A0C(fragmentActivity, C66579MXk.A00(1));
                r1.A0d(fragmentActivity, fragmentActivity, userSession, queryParameter2, queryParameter3, queryParameter4, r8.A02.getModuleName());
            }
        }
    }

    public static final void A01(1Xj r6, C235272ze r7) {
        AnonymousClass47L r1;
        String queryParameter;
        List Alu = r6.A0C.Alu();
        if (Alu != null && !Alu.isEmpty()) {
            AndroidLink androidLink = (AndroidLink) 00k.A0J(((1Xj) Alu.get(0)).A3P());
            C249713kF r5 = C249713kF.A00;
            0qQ.A07(r5);
            String str = null;
            if (androidLink != null) {
                str = androidLink.Avj();
                r1 = C271714jT.A01(androidLink);
            } else {
                r1 = null;
            }
            if (r1 == AnonymousClass47L.AD_DESTINATION_ORGANIC_COLLECTION && str != null) {
                0bY r12 = A03;
                Uri A002 = 0cp.A00(r12, str);
                String A0Z = r5.A0Z(A002, r12, A04);
                if (A002 != null && 0qQ.A0K(A0Z, C273654mx.A00(130))) {
                    UserSession userSession = r7.A01;
                    if (182.A06(0Tu.A05, userSession, 36316783166165633L) && (queryParameter = A002.getQueryParameter(C273654mx.A00(77))) != null) {
                        String queryParameter2 = A002.getQueryParameter(DialogModule.KEY_TITLE);
                        S54 A0S = r5.A0S(r7.A00, userSession, queryParameter);
                        A0S.A00 = A002.getQueryParameter("ad_id");
                        A0S.A01 = A002.getQueryParameter(C273654mx.A00(44));
                        A0S.A02 = r6.getId();
                        A0S.A01(A002.getQueryParameter(AnonymousClass000.A00(346)));
                        A0S.A03 = r7.A02.getModuleName();
                        A0S.A04 = A002.getQueryParameter("shopping_session_id");
                        A0S.A05 = queryParameter2;
                        A0S.A06 = A002.getQueryParameter("tracking_token");
                        A0S.A00();
                    }
                }
            }
        }
    }
}
