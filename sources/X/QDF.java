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
import java.util.Locale;
import java.util.Map;

public final class QDF extends 2YL {
    public Bundle A00;
    public C11330SNj A01;
    public String A02;
    public final Context A03;
    public final AnonymousClass2gB A04;
    public final AnonymousClass2gB A05 = Pxh.A0M();
    public final AnonymousClass2gB A06;
    public final AnonymousClass2Fj A07;
    public final SIS A08;
    public final AnonymousClass2Fj A09;

    public final int A01() {
        String string = this.A00.getString("CARD_INFO", "");
        Locale locale = Locale.US;
        if (string.toLowerCase(locale).contains("american express") || this.A00.getString("CARD_INFO", "").toLowerCase(locale).contains("amex")) {
            return 4;
        }
        return 3;
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [X.RQD, java.lang.Object] */
    public final void A02(Bundle bundle) {
        this.A00 = bundle;
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
        AnonymousClass2Fj r1 = this.A07;
        if (TextUtils.isEmpty(A0a.getString("BUNDLE_KEY_PAYMENT_TYPE")) || TextUtils.isEmpty(A0a.getString("BUNDLE_KEY_PRIMARY_FLOW_TYPE"))) {
            throw AnonymousClass7TE.A0w("The payment type and the primary flow type should not be null.");
        }
        ? obj = new Object();
        obj.A00 = A0a;
        r1.A0B(obj);
    }

    public final boolean A03() {
        Bundle bundle = this.A00;
        bundle.getClass();
        return "PAYPAL_ACCESS_TOKEN".equalsIgnoreCase(DbU.A0l(bundle, "AUTH_METHOD_TYPE"));
    }

    public QDF(Context context, SIS sis) {
        AnonymousClass2gB A0M = Pxh.A0M();
        this.A06 = A0M;
        AnonymousClass2gB A0M2 = Pxh.A0M();
        this.A04 = A0M2;
        this.A07 = JTO.A0K();
        AnonymousClass2Fj A0K = JTO.A0K();
        this.A09 = A0K;
        this.A08 = sis;
        this.A03 = context;
        AnonymousClass2gB A022 = AnonymousClass72Y.A02(A0K, new TPM(this, 4));
        C11652Sdu.A03(A022, A0M2, this, 15);
        A022.A09(new C11648Sdq((2Fk) A022, (AnonymousClass2gO) C11652Sdu.A00(this, 16), 25));
        C11652Sdu.A03(A022, A0M, this, 17);
    }

    public static void A00(QDF qdf) {
        String str;
        PttPayload pttPayload;
        String str2;
        String str3;
        String str4;
        try {
            SSZ A012 = SOC.A01();
            if (qdf.A03()) {
                str = "PAYPAL_ACCESS_TOKEN";
            } else {
                str = "CSC";
            }
            C11330SNj A062 = A012.A06(str, C11092S9t.A01(qdf.A00));
            AnonymousClass2Fj r2 = qdf.A09;
            SSZ A013 = SOC.A01();
            String A002 = C11092S9t.A00(qdf.A00);
            boolean A032 = qdf.A03();
            String A014 = AnonymousClass2E0.A0C().A01();
            String packageName = qdf.A03.getPackageName();
            String str5 = qdf.A02;
            str5.getClass();
            Bundle bundle = qdf.A00;
            if (A032) {
                if (bundle != null) {
                    str4 = bundle.getString("CREDENTIAL_ID");
                } else {
                    str4 = null;
                }
                pttPayload = PttPayload.byPayPal(A014, packageName, str5, str4, A062.A07, C11092S9t.A01(qdf.A00));
            } else {
                if (bundle != null) {
                    str3 = bundle.getString("CREDENTIAL_ID");
                } else {
                    str3 = null;
                }
                str3.getClass();
                pttPayload = PttPayload.byCsc(A014, packageName, str5, str3, A062.A07, C11092S9t.A01(qdf.A00));
            }
            HashSet A1F = AnonymousClass7TE.A1F();
            Collections.addAll(A1F, new C11330SNj[]{A062});
            Bundle bundle2 = qdf.A00;
            if (bundle2 != null) {
                str2 = bundle2.getString("PAYMENT_ACCOUNT_ID");
            } else {
                str2 = null;
            }
            Map A015 = S9s.A01(qdf.A00);
            DbW.A1N(pttPayload, 2, A015);
            r2.A0B(new C11214SFo(C11095S9w.A00(new C12496SvS(A013, 1), A1F), pttPayload, A002, str2, (String) null, (String) null, (String) null, (String) null, A015, A1F));
            qdf.A01 = A062;
        } catch (IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException e) {
            qdf.A06.A0B(e);
        }
    }
}
