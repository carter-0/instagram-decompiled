package X;

import android.content.Context;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.brandedcontent.adseligibility.util.AdsEligibilityErrorDataItem;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

public final class FSH implements AnonymousClass2Kv {
    public final /* synthetic */ C357058Wh A00;
    public final /* synthetic */ AnonymousClass3Q2 A01;
    public final /* synthetic */ C62320sa A02;

    public FSH(C357058Wh r1, AnonymousClass3Q2 r2, C62320sa r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void invoke(AnonymousClass3JD r22) {
        C250663lr A0U;
        C250663lr optionalTreeField;
        int i;
        if (r22 == null || (A0U = C41845B3m.A0U(r22)) == null || (optionalTreeField = A0U.getOptionalTreeField(0, AnonymousClass000.A00(4182), BYQ.class, 1605628860)) == null || optionalTreeField.getCoercedBooleanField(0, "is_eligible")) {
            this.A02.invoke();
            return;
        }
        ImmutableList requiredCompactedTreeListField = optionalTreeField.getRequiredCompactedTreeListField(1, "error_data", BYP.class, -1285538584);
        0qQ.A07(requiredCompactedTreeListField);
        ArrayList A0p = AnonymousClass7TF.A0p(requiredCompactedTreeListField);
        Iterator it = requiredCompactedTreeListField.iterator();
        while (it.hasNext()) {
            C250663lr A0V = C41845B3m.A0V(it);
            String A0A = A0V.A0A(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
            String str = "";
            if (A0A == null) {
                A0A = str;
            }
            String A07 = A0V.A07(C273654mx.A00(147));
            if (A07 == null) {
                A07 = str;
            }
            String A08 = A0V.A08(AnonymousClass000.A00(146));
            if (A08 != null) {
                str = A08;
            }
            A0p.add(new AdsEligibilityErrorDataItem(A0A, A07, str));
        }
        ArrayList A0p2 = AnonymousClass7TF.A0p(requiredCompactedTreeListField);
        Iterator it2 = requiredCompactedTreeListField.iterator();
        while (it2.hasNext()) {
            A0p2.add(String.valueOf(C41845B3m.A0V(it2).A00(TraceFieldType.ErrorCode)));
        }
        C47402E0u e0u = new C47402E0u();
        Bundle A0a = AnonymousClass7TE.A0a();
        C357058Wh r13 = this.A00;
        C357048Wg r1 = r13.A03;
        A0a.putSerializable("media_type", r1);
        A0a.putSerializable("error_data_list", AnonymousClass7TE.A1D(A0p));
        A0a.putStringArrayList("error_data_codes", AnonymousClass7TE.A1D(A0p2));
        e0u.setArguments(A0a);
        UserSession userSession = r13.A04;
        AnonymousClass3Q2 r14 = this.A01;
        String str2 = r14.A32;
        String str3 = r1.A00;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(e0u, userSession), "instagram_bc_ads_ppl_boost_eligibility_error");
        DbS.A1I(A0e, "instagram_bc_ad_ppl_boost_eligibility_error_surface_impression");
        A0e.AAe("error_codes", A0p2);
        A0e.AAJ("media_id", str2);
        A0e.AAJ("media_type", str3);
        A0e.Cgf();
        C331127Pr A0W = DbS.A0W(userSession);
        Context context = r13.A01;
        DbZ.A0z(context, A0W, 2131969191);
        A0W.A0g = C357058Wh.A01(r13, r1);
        A0W.A1J = true;
        A0W.A0K = new FO6(1, e0u, A0p2, r13, r14);
        A0W.A0h = C357058Wh.A02(r13, r1);
        A0W.A0L = new FO6(2, e0u, A0p2, r13, r14);
        A0W.A1N = true;
        int ordinal = r1.ordinal();
        if (ordinal != 2) {
            i = 2131974419;
            if (ordinal != 0) {
                i = 2131962326;
            }
        } else {
            i = 2131971519;
        }
        A0W.A0b = AnonymousClass7TE.A16(context, i);
        A0W.A0U = new FmA(0, this.A02, r13);
        A0W.A00().A02(r13.A02, e0u);
    }
}
