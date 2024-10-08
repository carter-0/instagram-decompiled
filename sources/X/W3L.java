package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.api.LeadGenInfoFieldData;
import com.instagram.leadgen.core.api.LeadGenInfoFieldTypes;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.organic.model.LeadFormCustomQuestion;
import com.instagram.leadgen.organic.model.LeadGenFormData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class W3L {
    public static final SpannableStringBuilder A01(Context context, String str) {
        String A16 = AnonymousClass7TE.A16(context, 2131964828);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        AnonymousClass7AV.A03(spannableStringBuilder, new StyleSpan(1), A16);
        return spannableStringBuilder;
    }

    public static final String A02(Context context, LeadGenFormData leadGenFormData) {
        0qQ.A0B(leadGenFormData, 1);
        JSONArray jSONArray = new JSONArray();
        if (leadGenFormData.A08) {
            jSONArray.put(new JSONObject().put("label", context.getString(2131964759)).put("type_", LeadGenInfoFieldTypes.FULL_NAME.A00));
        }
        if (leadGenFormData.A09) {
            jSONArray.put(new JSONObject().put("label", context.getString(2131964760)).put("type_", LeadGenInfoFieldTypes.PHONE.A00));
        }
        if (leadGenFormData.A07) {
            jSONArray.put(new JSONObject().put("label", context.getString(2131964758)).put("type_", LeadGenInfoFieldTypes.A0A.A00));
        }
        if (leadGenFormData.A0A) {
            jSONArray.put(new JSONObject().put("label", context.getString(2131964765)).put("type_", LeadGenInfoFieldTypes.ZIP.A00));
        }
        if (DbT.A1b(leadGenFormData.A06)) {
            Iterator it = leadGenFormData.A06.iterator();
            while (it.hasNext()) {
                LeadFormCustomQuestion leadFormCustomQuestion = (LeadFormCustomQuestion) it.next();
                JSONObject put = new JSONObject().put("label", leadFormCustomQuestion.A01).put("type_", LeadGenInfoFieldTypes.CUSTOM.A00);
                if (leadFormCustomQuestion.A00 == C16534Uwe.MULTIPLE_CHOICE) {
                    put.put("options", new JSONArray(leadFormCustomQuestion.A02));
                }
                jSONArray.put(put);
            }
        }
        return DbT.A10(jSONArray);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.content.Context] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(android.app.Activity r7, android.content.Context r8, com.instagram.common.session.UserSession r9, java.lang.String r10) {
        /*
            r3 = r9
            boolean r6 = X.DbW.A1X(r9)
            X.2EG r4 = X.2EG.A3V
            X.SUL r1 = new X.SUL
            r2 = r7
            r5 = r10
            if (r7 != 0) goto L_0x000e
            r2 = r8
        L_0x000e:
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.String r0 = "lead_gen"
            r1.A0S = r0
            r1.A0A()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3L.A07(android.app.Activity, android.content.Context, com.instagram.common.session.UserSession, java.lang.String):void");
    }

    public static final String A03(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) it.next();
            jSONArray.put(new JSONObject().put("field_key", leadGenFormBaseQuestion.A09).put("values", leadGenFormBaseQuestion.A00));
        }
        return DbT.A10(jSONArray);
    }

    public static final ArrayList A04(Resources resources, LeadGenFormData leadGenFormData) {
        LeadGenFormData leadGenFormData2 = leadGenFormData;
        boolean A1X = DbW.A1X(leadGenFormData2);
        ArrayList arrayList = new ArrayList();
        Resources resources2 = resources;
        if (leadGenFormData2.A08) {
            arrayList.add(new LeadGenFormBaseQuestion(C16595Uxp.A0O, (Integer) null, (String) null, AnonymousClass7TF.A0d(resources2, 2131964759), "", "", (String) null, (String) null, (String) null, (String) null, (String) null, 0sn.A00, (List) null, (List) null, (List) null, 0Yt.A0E(), A1X ? 1 : 0, A1X, A1X, A1X, A1X));
        }
        if (leadGenFormData2.A09) {
            arrayList.add(new LeadGenFormBaseQuestion(C16595Uxp.A0P, (Integer) null, (String) null, AnonymousClass7TF.A0d(resources2, 2131964760), "", "", (String) null, (String) null, (String) null, (String) null, (String) null, 0sn.A00, (List) null, (List) null, (List) null, 0Yt.A0E(), A1X, A1X, A1X, A1X, A1X));
        }
        if (leadGenFormData2.A07) {
            arrayList.add(new LeadGenFormBaseQuestion(C16595Uxp.A0A, (Integer) null, (String) null, AnonymousClass7TF.A0d(resources2, 2131964758), "", "", (String) null, (String) null, (String) null, (String) null, (String) null, 0sn.A00, (List) null, (List) null, (List) null, 0Yt.A0E(), A1X, A1X, A1X, A1X, A1X));
        }
        if (leadGenFormData2.A0A) {
            arrayList.add(new LeadGenFormBaseQuestion(C16595Uxp.A0a, (Integer) null, (String) null, AnonymousClass7TF.A0d(resources2, 2131964765), "", "", (String) null, (String) null, (String) null, (String) null, (String) null, 0sn.A00, (List) null, (List) null, (List) null, 0Yt.A0E(), A1X, A1X, A1X, A1X, A1X));
        }
        Iterator A1G = AnonymousClass7TE.A1G(leadGenFormData2.A06);
        while (A1G.hasNext()) {
            LeadFormCustomQuestion leadFormCustomQuestion = (LeadFormCustomQuestion) AnonymousClass7TF.A0a(A1G);
            String str = leadFormCustomQuestion.A01;
            arrayList.add(new LeadGenFormBaseQuestion(C16595Uxp.A06, (Integer) null, (String) null, str, "", "", (String) null, (String) null, (String) null, (String) null, (String) null, leadFormCustomQuestion.A02, (List) null, (List) null, (List) null, 0Yt.A0E(), A1X ? 1 : 0, A1X, A1X, A1X, A1X));
        }
        return arrayList;
    }

    public static final List A05() {
        return 0sr.A1P(new XIGIGBoostCallToAction[]{XIGIGBoostCallToAction.APPLY_NOW, XIGIGBoostCallToAction.LEARN_MORE, XIGIGBoostCallToAction.GET_QUOTE, XIGIGBoostCallToAction.SIGN_UP});
    }

    public static final List A06(LeadForm leadForm) {
        C16595Uxp uxp;
        List<LeadGenInfoFieldData> list = leadForm.A05;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (LeadGenInfoFieldData leadGenInfoFieldData : list) {
            String str = leadGenInfoFieldData.A00;
            if (leadGenInfoFieldData.A02) {
                uxp = C16595Uxp.A06;
            } else {
                uxp = C16595Uxp.A07;
            }
            0sn r0 = leadGenInfoFieldData.A01;
            if (r0 == null) {
                r0 = 0sn.A00;
            }
            A0r.add(new LeadGenFormBaseQuestion(uxp, (Integer) null, (String) null, str, "", "", (String) null, (String) null, (String) null, (String) null, (String) null, r0, (List) null, (List) null, (List) null, 0Yt.A0E(), 0, false, false, false, false));
        }
        return A0r;
    }

    public static final SpannableStringBuilder A00(Activity activity, Context context, UserSession userSession, int i, int i2) {
        Object[] objArr;
        Context context2 = context;
        String A16 = AnonymousClass7TE.A16(context, 2131964858);
        String A162 = AnonymousClass7TE.A16(context, 2131964857);
        UserSession userSession2 = userSession;
        if (AnonymousClass7TG.A1X(AnonymousClass7TF.A0Q(userSession).A03.CS2())) {
            objArr = new Object[]{A16, A162};
        } else {
            objArr = new Object[]{A16};
        }
        String string = context.getString(i, objArr);
        0qQ.A0A(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        Activity activity2 = activity;
        AnonymousClass7AV.A05(spannableStringBuilder, new C48049ESs(activity2, context2, userSession2, "https://business.facebook.com/ads/leadgen/restricted_tos", context.getColor(i2)), A16);
        if (AnonymousClass7TG.A1X(AnonymousClass7TF.A0Q(userSession).A03.CS2())) {
            AnonymousClass7AV.A05(spannableStringBuilder, new C48049ESs(activity2, context2, userSession2, AnonymousClass000.A00(1421), context.getColor(i2)), A162);
        }
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder A08(Activity activity, Context context, UserSession userSession) {
        int i = 2131964707;
        if (AnonymousClass7TG.A1X(AnonymousClass7TF.A0Q(userSession).A03.CS2())) {
            i = 2131964708;
        }
        return A00(activity, context, userSession, i, 2Yu.A06(context));
    }
}
