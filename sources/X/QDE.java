package X;

import android.content.Context;
import android.os.Bundle;
import android.security.keystore.UserNotAuthenticatedException;
import android.text.TextUtils;
import java.security.GeneralSecurityException;
import java.security.Signature;

public final class QDE extends 2YL {
    public final Context A00;
    public final Q2D A01;
    public final 2Fk A02;
    public final AnonymousClass2gB A03 = Pxh.A0M();
    public final AnonymousClass2gB A04 = Pxh.A0M();
    public final AnonymousClass2Fj A05 = JTO.A0K();
    public final SSL A06;
    public final SIS A07;
    public final SSZ A08;
    public final AnonymousClass5A3 A09;

    public static Signature A00(QDE qde, C11330SNj sNj) {
        boolean z;
        String message;
        try {
            return SSZ.A02(qde.A08, sNj.A02);
        } catch (GeneralSecurityException e) {
            if ((e instanceof UserNotAuthenticatedException) || ((message = e.getMessage()) != null && 00l.A0d(message, "Key user not authenticated", false))) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            throw e;
        }
    }

    public final void A01() {
        Object obj;
        SR4 sr4 = (SR4) this.A05.A02();
        if (sr4 != null && (obj = sr4.A01) != null) {
            ((C11001S4v) obj).A00();
        }
    }

    public final void A02(Bundle bundle, String str, String str2) {
        this.A03.A0A(SUj.A08((Object) null));
        Bundle bundle2 = bundle;
        String str3 = str;
        C10440RsH A012 = C11301SKl.A01(Pxi.A0J(bundle2), str3);
        Bundle bundle3 = A012.A01;
        SQ8.A02("VERIFY_PIN_TO_DISABLE_PIN_HUB", bundle3);
        Pxi.A0w(bundle3, "REVOKE_AUTH_TICKET");
        if (bundle != null) {
            bundle3.putParcelable("logger_data", bundle2.getParcelable("logger_data"));
        }
        SR4.A02(this.A05, new C11001S4v((RLE) null, (SR5) null, (C10714Rws) null, new C12458Suq(A012, this, str2, str3, 0), A012, this.A09.A00.A03));
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.RQD, java.lang.Object] */
    public final void A03(C13735Tg7 tg7, C10440RsH rsH, C11330SNj sNj, Signature signature) {
        Bundle bundle = rsH.A01;
        String string = bundle.getString("PAYMENT_TYPE");
        String A002 = SQ8.A00(bundle, 1);
        int A032 = this.A01.A03(15);
        if (A032 != 0) {
            tg7.Cwz(new C13223TQo(A032));
            return;
        }
        String A012 = SQ8.A01(bundle, 1);
        if (TextUtils.isEmpty(A012)) {
            A012 = "VERIFY_BIO";
        }
        Bundle A0a = AnonymousClass7TE.A0a();
        string.getClass();
        A0a.putString("BUNDLE_KEY_PAYMENT_TYPE", string);
        A002.getClass();
        A0a.putString("BUNDLE_KEY_PRIMARY_FLOW_TYPE", A002);
        A0a.putString("BUNDLE_KEY_PRIMARY_FLOW_STEP_TYPE", A012);
        if (TextUtils.isEmpty(A0a.getString("BUNDLE_KEY_PAYMENT_TYPE")) || TextUtils.isEmpty(A0a.getString("BUNDLE_KEY_PRIMARY_FLOW_TYPE"))) {
            throw AnonymousClass7TE.A0w("The payment type and the primary flow type should not be null.");
        }
        SR5 sr5 = null;
        ? obj = new Object();
        obj.A00 = A0a;
        if (signature != null) {
            sr5 = new SR5(signature);
        }
        this.A09.A00.A03.execute(new TKZ(sr5, obj, this, tg7, rsH, sNj));
    }

    public QDE(Context context, SSL ssl, SIS sis, SOC soc, AnonymousClass5A3 r10) {
        AnonymousClass2gB A012;
        this.A00 = context;
        this.A07 = sis;
        this.A06 = ssl;
        this.A09 = r10;
        this.A01 = new Q2D(new Q2E(context));
        SSZ ssz = soc.A01;
        this.A08 = ssz;
        CharSequence charSequence = null;
        if (!TextUtils.isEmpty("BIO")) {
            A012 = AnonymousClass72Y.A01(SSC.A03(ssz.A01), new TPJ(6, new Sd0(ssz, 10), ssz));
        } else if (!TextUtils.isEmpty(charSequence)) {
            charSequence.getClass();
            throw AnonymousClass00P.createAndThrow();
        } else if (!TextUtils.isEmpty(charSequence)) {
            charSequence.getClass();
            throw AnonymousClass00P.createAndThrow();
        } else {
            A012 = AnonymousClass72Y.A01(SSC.A03(ssz.A01), new TPJ(6, new Sd0(ssz, 9), ssz));
        }
        this.A02 = TPM.A00(A012, this, 2);
    }
}
