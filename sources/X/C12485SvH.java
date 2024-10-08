package X;

import android.util.SparseArray;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.SvH  reason: case insensitive filesystem */
public final class C12485SvH implements C13737Tg9 {
    public final C12512Svp A00;
    public final 1vn A01;
    public final String A02;

    public static String A02(String str) {
        int parseInt = Integer.parseInt(str.substring(2, 4));
        int i = Calendar.getInstance().get(1);
        int i2 = ((i / 100) * 100) + parseInt;
        if (i2 < i) {
            i2 += 100;
        }
        return String.valueOf(i2);
    }

    public final C2818759x EE9(SparseArray sparseArray, S4g s4g) {
        2IS A04 = C41845B3m.A04();
        2IS A042 = C41845B3m.A04();
        0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, this.A02, "payment_type");
        0Df.A00(A03, AnonymousClass7TF.A0b(), "client_mutation_id");
        0Df.A00(A03, A01(sparseArray, 12), "credit_card_id");
        return C8294Qna.A00(s4g, this.A01, new PandoGraphQLRequest(C41847B3o.A04(A03, A04, "input"), "IGFBPayDisableCreditCard", A04.getParamsCopy(), A042.getParamsCopy(), C43249BvB.class, true, (PandoRealtimeInfoJNI) null, 40, "input", "disable_credit_card", AnonymousClass7TE.A1C()), Cs7.A01);
    }

    public static 1OC A00(String str, String str2, String str3) {
        1Fc r1 = new 1Fc();
        if (str != null) {
            r1.A05("creditCardNumber", str);
        }
        r1.A05("csc", str2);
        if (str3 != null) {
            r1.A05("payment_dev_cycle", str3);
        }
        return AnonymousClass9D0.A01(1GK.A06.A00(new TNH(r1, 10), 658, 2, false, false).A02(new 1QY((AnonymousClass1O9) null), 747, 2, true, false).A01(new T7V(1), 748, 2), "FetchPaymentToken", "https://secure.facebook.com/payments/generate_token");
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [X.RsP, java.lang.Object] */
    public final C2818759x EM7(SparseArray sparseArray, S4g s4g) {
        SparseArray sparseArray2 = sparseArray;
        boolean A1V = AnonymousClass7TF.A1V(sparseArray.get(12));
        C2818659w r7 = new C2818659w();
        if (!A1V) {
            String substring = C41847B3o.A15(sparseArray, 14).toString().substring(0, 2);
            String A022 = A02(C41847B3o.A15(sparseArray, 14).toString());
            String A012 = A01(sparseArray, 15);
            String A013 = A01(sparseArray, 13);
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("expiry_month", substring);
            A1E.put("expiry_year", A022);
            String packageName = AnonymousClass2E0.A08().A00.getPackageName();
            0qQ.A07(packageName);
            A1E.put("app_id", packageName);
            A1E.put(Py2.A01(0, 9, 101), AnonymousClass2E0.A0C().A01());
            A1E.put("credit_card", A013);
            A1E.put("csc", A012);
            HashSet A1F = AnonymousClass7TE.A1F();
            A1F.add("credit_card");
            A1F.add("csc");
            SSZ A014 = SOC.A01();
            ? obj = new Object();
            obj.A00 = A1E;
            obj.A01 = A1F;
            C11214SFo A002 = C11214SFo.A0A.A00(A014, obj, "ADD_CARD", AnonymousClass7TE.A1E(), (Set) null);
            SUj.A0H(SSC.A03(SQA.A03(AnonymousClass2E0.A04(), AnonymousClass2E0.A06(), A002)), new C11638Sdg(sparseArray2, r7, this, A013, 1));
            return r7;
        }
        1OC A003 = A00((String) null, (String) C41847B3o.A15(sparseArray, 15), (String) null);
        A003.A00 = new C8765R8q(3, sparseArray, r7, this);
        1ES.A03(A003);
        return r7;
    }

    public C12485SvH(UserSession userSession, String str) {
        this.A02 = str;
        this.A00 = new C12512Svp(userSession);
        this.A01 = 1vm.A01(userSession);
    }

    public static String A01(SparseArray sparseArray, int i) {
        Object obj = sparseArray.get(i);
        if (obj == null) {
            return "";
        }
        String obj2 = obj.toString();
        if (!obj2.equals("null")) {
            return obj2;
        }
        return "";
    }
}
