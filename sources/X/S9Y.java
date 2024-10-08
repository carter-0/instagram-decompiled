package X;

import android.os.Bundle;
import com.facebookpay.logging.LoggingContext;

public abstract class S9Y {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r4.A01 != true) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.os.Bundle A00(X.AnonymousClass2Fj r20, com.facebookpay.form.fragment.model.FeatureConfiguration r21, com.facebookpay.logging.LoggingContext r22) {
        /*
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            X.Rzl r3 = X.C9963RkI.A00
            r1 = 1
            r4 = r21
            if (r21 == 0) goto L_0x0012
            boolean r0 = r4.A01
            r18 = 2131961322(0x7f1325ea, float:1.9559338E38)
            if (r0 == r1) goto L_0x0015
        L_0x0012:
            r18 = 2131961329(0x7f1325f1, float:1.9559352E38)
        L_0x0015:
            java.lang.Object r0 = X.SUj.A0C(r20)
            X.QSO r0 = (X.QSO) r0
            com.facebookpay.form.model.AddressFormFieldsConfig r5 = X.C11393SRk.A00(r0)
            r7 = 0
            r19 = 2131961338(0x7f1325fa, float:1.955937E38)
            r20 = 2131961345(0x7f132601, float:1.9559384E38)
            r21 = 0
            r6 = r22
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r13 = r7
            r14 = r7
            r15 = r7
            r16 = r7
            r17 = r7
            r22 = r21
            com.facebookpay.form.fragment.model.FormParams r1 = r3.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = "ECP_FORM_FRAGMENT_PARAMS"
            r2.putParcelable(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S9Y.A00(X.2Fj, com.facebookpay.form.fragment.model.FeatureConfiguration, com.facebookpay.logging.LoggingContext):android.os.Bundle");
    }

    public static final Bundle A01(C8924RFs rFs, C8924RFs rFs2, LoggingContext loggingContext, String str, String str2, String str3, String str4) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("ECP_SESSION_ID", str);
        A0a.putString("ECP_PRODUCT_ID", str2);
        A0a.putString("ECP_CLIENT_RECEIVER_ID", str3);
        A0a.putString("ECP_CONTENT_FRAGMENT_REQUEST_KEY", str4);
        A0a.putParcelable("logging_context", loggingContext);
        A0a.putSerializable("ECP_SELECTION_NAV_BAR_STYLE", rFs);
        A0a.putSerializable("ECP_FORM_NAV_BAR_STYLE", rFs2);
        return A0a;
    }
}
