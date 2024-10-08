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

public final class FSD implements AnonymousClass2Kv {
    public final /* synthetic */ C357058Wh A00;
    public final /* synthetic */ C62320sa A01;

    public FSD(C357058Wh r1, C62320sa r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void invoke(AnonymousClass3JD r12) {
        1Ln r5;
        C250663lr A0U;
        C250663lr optionalTreeField;
        if (r12 == null || (A0U = C41845B3m.A0U(r12)) == null || (optionalTreeField = A0U.getOptionalTreeField(0, AnonymousClass000.A00(4181), BYL.class, -1741123855)) == null || optionalTreeField.getCoercedBooleanField(0, "is_eligible")) {
            this.A01.invoke();
            27r A012 = 27p.A01(this.A00.A04);
            r5 = 1Ln.A08(A012.A01);
            C279294yP A0J = A012.A0J();
            AnonymousClass283 r2 = A012.A04;
            String str = r2.A0L;
            if (DbT.A1Y(r5) && A0J != null && str != null) {
                r5.A0a(A0J);
                r5.A0r("ADS_MODE_STORY_SHARE_NO_ERROR_REVIEW_SHEET");
                r5.A0b(r2.A09);
                r5.A0T();
                r5.A0U();
                r5.A0R("camera_session_id", str);
                Dbc.A0i(r5, r2);
                r5.A0O("ads_mode_boost_story_enabled", AnonymousClass7TE.A0v());
            } else {
                return;
            }
        } else {
            ImmutableList requiredCompactedTreeListField = optionalTreeField.getRequiredCompactedTreeListField(1, "error_data", BYK.class, -1030875462);
            0qQ.A07(requiredCompactedTreeListField);
            ArrayList A0p = AnonymousClass7TF.A0p(requiredCompactedTreeListField);
            Iterator it = requiredCompactedTreeListField.iterator();
            while (it.hasNext()) {
                C250663lr A0V = C41845B3m.A0V(it);
                String optionalStringField = A0V.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
                String str2 = "";
                if (optionalStringField == null) {
                    optionalStringField = str2;
                }
                String A0A = A0V.A0A(C273654mx.A00(147));
                if (A0A == null) {
                    A0A = str2;
                }
                String A09 = A0V.A09(AnonymousClass000.A00(146));
                if (A09 != null) {
                    str2 = A09;
                }
                A0p.add(new AdsEligibilityErrorDataItem(optionalStringField, A0A, str2));
            }
            ArrayList A0p2 = AnonymousClass7TF.A0p(requiredCompactedTreeListField);
            Iterator it2 = requiredCompactedTreeListField.iterator();
            while (it2.hasNext()) {
                A0p2.add(String.valueOf(C41845B3m.A0V(it2).getCoercedIntField(1, TraceFieldType.ErrorCode)));
            }
            C47402E0u e0u = new C47402E0u();
            Bundle A0a = AnonymousClass7TE.A0a();
            C357058Wh r7 = this.A00;
            C357048Wg r10 = r7.A03;
            A0a.putSerializable("media_type", r10);
            A0a.putSerializable("error_data_list", AnonymousClass7TE.A1D(A0p));
            A0a.putStringArrayList("error_data_codes", AnonymousClass7TE.A1D(A0p2));
            A0a.putBoolean(AnonymousClass000.A00(1492), true);
            e0u.setArguments(A0a);
            UserSession userSession = r7.A04;
            C331127Pr A0W = DbS.A0W(userSession);
            Context context = r7.A01;
            DbZ.A0z(context, A0W, 2131954003);
            A0W.A0g = C357058Wh.A01(r7, r10);
            A0W.A1J = true;
            A0W.A0K = new FPE(15, (Object) A0p2, (Object) r7);
            A0W.A0h = C357058Wh.A02(r7, r10);
            A0W.A0L = new FPE(16, (Object) A0p2, (Object) r7);
            A0W.A1N = true;
            A0W.A0b = context.getString(2131954032);
            A0W.A0U = new FmB(0, A0p2, r7, this.A01);
            A0W.A00().A02(r7.A02, e0u);
            27r A013 = 27p.A01(userSession);
            ArrayList A1D = AnonymousClass7TE.A1D(A0p2);
            29R r4 = A013.A09;
            r5 = 1Ln.A08(r4.A01);
            C279294yP A0J2 = r4.A0J();
            if (DbT.A1Y(r5) && A0J2 != null) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it3 = A1D.iterator();
                while (it3.hasNext()) {
                    A1C.add(Long.valueOf(AnonymousClass7TE.A18(it3)));
                }
                r5.A0t("IG_CAMERA_ENTITY_TAP");
                Dbc.A0i(r5, Dbc.A08(r5, A0J2, r4, "ADS_MODE_ERROR_REVIEW_SHEET_SHOWN"));
                r5.A0O("ads_mode_boost_story_enabled", true);
                r5.A0S("ads_mode_boost_story_error_codes", A1C);
            } else {
                return;
            }
        }
        r5.Cgf();
    }
}
