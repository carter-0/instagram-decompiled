package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.model.mediatype.ProductType;

/* renamed from: X.Vmf  reason: case insensitive filesystem */
public abstract class C18165Vmf {
    public static final void A00(FragmentActivity fragmentActivity, XIGIGBoostDestination xIGIGBoostDestination, X3L x3l, C18654Vw9 vw9, UserSession userSession, ProductType productType, boolean z, boolean z2, boolean z3) {
        String A16;
        SpannableStringBuilder spannableStringBuilder;
        int A06;
        String A00;
        String str;
        String A162;
        String A163;
        String A164;
        int i;
        UserSession userSession2 = userSession;
        boolean A1Z = C66581MXm.A1Z(userSession2);
        C18654Vw9 vw92 = vw9;
        vw92.A05(A1Z);
        vw92.A03(x3l);
        ProductType productType2 = productType;
        vw92.A02(C305796Jo.A00(productType2, z3));
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (xIGIGBoostDestination == null || xIGIGBoostDestination != XIGIGBoostDestination.LEAD_GENERATION) {
            ProductType productType3 = ProductType.CLIPS;
            Context context = vw92.A00.getContext();
            if (productType2 == productType3) {
                A163 = AnonymousClass7TE.A16(context, 2131970715);
                A164 = AnonymousClass7TE.A16(context, 2131970712);
                A162 = AnonymousClass7TE.A16(context, 2131970711);
                i = 2131970717;
            } else if (z) {
                A163 = AnonymousClass7TE.A16(context, 2131970715);
                A164 = AnonymousClass7TE.A16(context, 2131970712);
                A162 = AnonymousClass7TE.A16(context, 2131970711);
                i = 2131970716;
            } else {
                String A165 = AnonymousClass7TE.A16(context, 2131970715);
                if (z2) {
                    String A166 = AnonymousClass7TE.A16(context, 2131970714);
                    A162 = AnonymousClass7TE.A16(context, 2131970712);
                    spannableStringBuilder = new SpannableStringBuilder(context.getString(2131970719, new Object[]{A165, A166, A162}));
                    C18654Vw9.A00(context, spannableStringBuilder, fragmentActivity2, vw92, userSession2, A166, "https://www.facebook.com/legal/couponterms/", "help_link_coupon_terms", 2Yu.A06(context));
                    AnonymousClass7AV.A04(spannableStringBuilder, new C48039ESe(fragmentActivity2, vw92, userSession2, "help_link_terms", "https://www.facebook.com/legal/self_service_ads_terms/", context.getColor(2Yu.A06(context)), A1Z ? 1 : 0), A165);
                    A06 = 2Yu.A06(context);
                    A00 = AnonymousClass000.A00(157);
                    str = "help_link_guidelines";
                    A16 = A162;
                    C18654Vw9.A00(context, spannableStringBuilder, fragmentActivity2, vw92, userSession2, A16, A00, str, A06);
                } else {
                    A16 = AnonymousClass7TE.A16(context, 2131970712);
                    spannableStringBuilder = new SpannableStringBuilder(DbV.A0u(context, A165, A16, 2131970718));
                    AnonymousClass7AV.A04(spannableStringBuilder, new C48039ESe(fragmentActivity2, vw9, userSession, "help_link_terms", "https://www.facebook.com/legal/self_service_ads_terms/", context.getColor(2Yu.A06(context)), 0), A165);
                    A06 = 2Yu.A06(context);
                    A00 = AnonymousClass000.A00(157);
                    str = "help_link_guidelines";
                    C18654Vw9.A00(context, spannableStringBuilder, fragmentActivity2, vw92, userSession2, A16, A00, str, A06);
                }
            }
            spannableStringBuilder = new SpannableStringBuilder(context.getString(i, new Object[]{A163, A164, A162}));
            C18654Vw9.A00(context, spannableStringBuilder, fragmentActivity2, vw92, userSession2, A163, "https://www.facebook.com/legal/self_service_ads_terms/", "help_link_terms", 2Yu.A06(context));
            String str2 = A164;
            C18654Vw9.A00(context, spannableStringBuilder, fragmentActivity2, vw92, userSession2, str2, AnonymousClass000.A00(157), "help_link_guidelines", 2Yu.A06(context));
            A06 = 2Yu.A06(context);
            A00 = "https://www.facebook.com/business/help/2405092116183307";
            str = "help_link_ad_library_learn_more";
            A16 = A162;
            C18654Vw9.A00(context, spannableStringBuilder, fragmentActivity2, vw92, userSession2, A16, A00, str, A06);
        } else {
            Context context2 = vw92.A00.getContext();
            boolean A1X = AnonymousClass7TG.A1X(AnonymousClass7TF.A0Q(userSession2).A03.CS2());
            String A167 = AnonymousClass7TE.A16(context2, 2131970715);
            String A168 = AnonymousClass7TE.A16(context2, 2131970712);
            String A169 = AnonymousClass7TE.A16(context2, 2131964858);
            String A1610 = AnonymousClass7TE.A16(context2, 2131964857);
            String string = context2.getString(2131970721, new Object[]{A167, A168, A169});
            0qQ.A07(string);
            String string2 = context2.getString(2131970720, new Object[]{A167, A168, A169, A1610});
            0qQ.A07(string2);
            if (A1X) {
                string = string2;
            }
            spannableStringBuilder = new SpannableStringBuilder(string);
            FragmentActivity fragmentActivity3 = fragmentActivity2;
            boolean z4 = A1Z;
            AnonymousClass7AV.A04(spannableStringBuilder, new C48039ESe(fragmentActivity3, vw9, userSession, "help_link_terms", "https://www.facebook.com/ads/leadgen/restricted_tos", context2.getColor(2Yu.A06(context2)), z4 ? 1 : 0), A169);
            AnonymousClass7AV.A04(spannableStringBuilder, new C48039ESe(fragmentActivity3, vw9, userSession, "help_link_terms", "https://www.facebook.com/legal/self_service_ads_terms/", context2.getColor(2Yu.A06(context2)), (int) z4), A167);
            C18654Vw9.A00(context2, spannableStringBuilder, fragmentActivity2, vw92, userSession2, A168, AnonymousClass000.A00(157), "help_link_guidelines", 2Yu.A06(context2));
            if (A1X) {
                FragmentActivity fragmentActivity4 = fragmentActivity2;
                C18654Vw9 vw93 = vw92;
                AnonymousClass7AV.A04(spannableStringBuilder, new C48039ESe(fragmentActivity4, vw93, userSession, "help_link_terms", AnonymousClass000.A00(1421), context2.getColor(2Yu.A06(context2)), (int) z4), A1610);
            }
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = vw92.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setFooterText(spannableStringBuilder);
        }
    }

    public static final void A01(X3L x3l, C18654Vw9 vw9, String str) {
        vw9.A05(C51970G9q.A1Y(x3l));
        vw9.A03(x3l);
        if (str == null) {
            str = "";
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = vw9.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionText(str);
        }
    }
}
