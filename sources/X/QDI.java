package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.fbpay.auth.models.PttPayload;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class QDI extends 2YL {
    public static final Set A0B;
    public Bundle A00;
    public C11330SNj A01;
    public C11330SNj A02;
    public String A03;
    public final Context A04;
    public final AnonymousClass2gB A05;
    public final AnonymousClass2gB A06 = Pxh.A0M();
    public final AnonymousClass2gB A07;
    public final AnonymousClass2Fj A08;
    public final AnonymousClass2Fj A09;
    public final SIS A0A;

    public static boolean A00(QDI qdi) {
        if ("CONFIRM_PIN".equalsIgnoreCase(SQ8.A01(qdi.A00, 1)) || "CONFIRM_PIN".equalsIgnoreCase(SQ8.A01(qdi.A00, 2))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [X.RQD, java.lang.Object] */
    public final void A02(Bundle bundle, C11330SNj sNj) {
        this.A00 = bundle;
        this.A02 = sNj;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("BUNDLE_KEY_PAYMENT_TYPE", DbU.A0l(this.A00, "PAYMENT_TYPE"));
        String A002 = SQ8.A00(this.A00, 1);
        A002.getClass();
        A0a.putString("BUNDLE_KEY_PRIMARY_FLOW_TYPE", A002);
        String A012 = SQ8.A01(this.A00, 1);
        A012.getClass();
        A0a.putString("BUNDLE_KEY_PRIMARY_FLOW_STEP_TYPE", A012);
        if (!TextUtils.isEmpty(SQ8.A00(this.A00, 2)) && !TextUtils.isEmpty(SQ8.A01(this.A00, 2))) {
            A0a.putString("BUNDLE_KEY_SECONDARY_FLOW_TYPE", SQ8.A00(this.A00, 2));
            A0a.putString("BUNDLE_KEY_SECONDARY_FLOW_STEP_TYPE", SQ8.A01(this.A00, 2));
        }
        AnonymousClass2Fj r1 = this.A08;
        if (TextUtils.isEmpty(A0a.getString("BUNDLE_KEY_PAYMENT_TYPE")) || TextUtils.isEmpty(A0a.getString("BUNDLE_KEY_PRIMARY_FLOW_TYPE"))) {
            throw AnonymousClass7TE.A0w("The payment type and the primary flow type should not be null.");
        }
        ? obj = new Object();
        obj.A00 = A0a;
        r1.A0B(obj);
    }

    public final void A03(String str) {
        this.A03 = str;
        this.A07.A0A((Object) null);
        if (!A04() && !TextUtils.isEmpty(str) && str.length() == 4) {
            A01();
        }
    }

    public final boolean A04() {
        if ("RECOVER_PIN".equalsIgnoreCase(SQ8.A01(this.A00, 2)) || "RECOVER_PIN".equalsIgnoreCase(SQ8.A01(this.A00, 1))) {
            return true;
        }
        return false;
    }

    public final boolean A05() {
        if (TextUtils.isEmpty(SQ8.A01(this.A00, 2))) {
            String A012 = SQ8.A01(this.A00, 1);
            A012.getClass();
            if (!"VERIFY_PIN".equalsIgnoreCase(A012)) {
                return false;
            }
            return true;
        }
        return false;
    }

    static {
        HashSet A1F = AnonymousClass7TE.A1F();
        A1F.add("CREATE_PIN");
        A1F.add("CONFIRM_PIN");
        A1F.add("VERIFY_PIN");
        A0B = A1F;
    }

    public QDI(Context context, SIS sis) {
        AnonymousClass2gB A0M = Pxh.A0M();
        this.A07 = A0M;
        AnonymousClass2gB A0M2 = Pxh.A0M();
        this.A05 = A0M2;
        this.A08 = JTO.A0K();
        AnonymousClass2Fj A0K = JTO.A0K();
        this.A09 = A0K;
        this.A0A = sis;
        this.A04 = context;
        AnonymousClass2gB A022 = AnonymousClass72Y.A02(A0K, new TPM(this, 5));
        C11652Sdu.A03(A022, A0M2, this, 22);
        A022.A09(new C11648Sdq((2Fk) A022, (AnonymousClass2gO) C11652Sdu.A00(this, 23), 25));
        C11652Sdu.A03(A022, A0M, this, 24);
    }

    public final void A01() {
        C11330SNj[] sNjArr;
        HashSet A1F;
        String str;
        AnonymousClass2gB r3;
        Object sr4;
        if (!A04()) {
            if (A00(this)) {
                String str2 = this.A03;
                str2.getClass();
                if (!str2.equals(DbU.A0l(this.A00, "AUTH_FLOW_UTIL_PIN_ENTERED"))) {
                    r3 = this.A07;
                    sr4 = AnonymousClass7TE.A0w("Pin did not match");
                }
            } else if ("CREATE_PIN".equalsIgnoreCase(SQ8.A01(this.A00, 2)) || "CREATE_PIN".equalsIgnoreCase(SQ8.A01(this.A00, 1))) {
                Bundle A0a = AnonymousClass7TE.A0a();
                String str3 = this.A03;
                str3.getClass();
                A0a.putString("AUTH_FLOW_UTIL_PIN_ENTERED", str3);
                r3 = this.A06;
                sr4 = new SR4(SUj.A09(new AnonymousClass34S((Object) null, A0a)));
            } else if (!"VERIFY_PIN".equalsIgnoreCase(SQ8.A01(this.A00, 1))) {
                return;
            }
            try {
                C11330SNj A062 = SOC.A01().A06("PIN", C11092S9t.A01(this.A00));
                String A012 = AnonymousClass2E0.A0C().A01();
                String packageName = this.A04.getPackageName();
                String str4 = this.A03;
                str4.getClass();
                PttPayload byPin = PttPayload.byPin(A012, packageName, str4, A062.A07, C11092S9t.A01(this.A00));
                AnonymousClass2Fj r2 = this.A09;
                SSZ A013 = SOC.A01();
                String A002 = C11092S9t.A00(this.A00);
                C11330SNj sNj = this.A02;
                if (sNj != null) {
                    sNjArr = new C11330SNj[]{A062, sNj};
                    A1F = AnonymousClass7TE.A1F();
                } else {
                    sNjArr = new C11330SNj[]{A062};
                    A1F = AnonymousClass7TE.A1F();
                }
                Collections.addAll(A1F, sNjArr);
                Bundle bundle = this.A00;
                if (bundle != null) {
                    str = bundle.getString("PAYMENT_ACCOUNT_ID");
                } else {
                    str = null;
                }
                Map A014 = S9s.A01(this.A00);
                DbW.A1N(byPin, 2, A014);
                r2.A0A(new C11214SFo(C11095S9w.A00(new C12496SvS(A013, 1), A1F), byPin, A002, str, (String) null, (String) null, (String) null, (String) null, A014, A1F));
                this.A01 = A062;
                return;
            } catch (IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException e) {
                this.A07.A0A(e);
                return;
            }
        } else if (TextUtils.isEmpty(this.A03)) {
            r3 = this.A07;
            sr4 = AnonymousClass7TE.A0w("Field can not be empty");
        } else {
            SIS sis = this.A0A;
            String str5 = this.A03;
            this.A00.getString("PAYMENT_TYPE").getClass();
            C7422QCn A032 = SSC.A03(new C8278QnK(sis.A01, sis, S9s.A01(this.A00), str5, 1));
            this.A06.A0E(A032, new C11648Sdq(16, (Object) A032, (Object) this));
            return;
        }
        r3.A0A(sr4);
    }
}
