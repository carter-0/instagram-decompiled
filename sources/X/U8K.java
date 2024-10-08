package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;

public final class U8K extends AnonymousClass9YH {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final ImageUrl A02;
    public final String A03;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0050, code lost:
        if (r4.A00.A00 == null) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.2YL A02(X.C319836rJ r19, java.lang.Class r20, java.lang.String r21) {
        /*
            r18 = this;
            r1 = r19
            r2 = r20
            r0 = r21
            boolean r3 = X.C51973G9u.A1b(r0, r2, r1)
            java.lang.String r0 = "formID"
            java.lang.Object r9 = r1.A00(r0)
            if (r9 == 0) goto L_0x0077
            java.lang.String r9 = (java.lang.String) r9
            X.Vtw r0 = X.C18544Vtw.A01
            X.Vk5 r4 = r0.A00(r9)
            r0 = r18
            com.instagram.common.session.UserSession r6 = r0.A01
            X.0iw r5 = r0.A00
            java.lang.String r2 = "adID"
            java.lang.Object r7 = r1.A00(r2)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r2 = "trackingToken"
            java.lang.Object r8 = r1.A00(r2)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r2 = "ad_creation_source"
            java.lang.Object r10 = r1.A00(r2)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L_0x003c
            java.lang.String r10 = "UNKNOWN"
        L_0x003c:
            java.lang.String r11 = X.C13991Tnr.A0f(r1)
            boolean r14 = X.C18809W3g.A06(r4)
            if (r4 == 0) goto L_0x0075
            boolean r15 = r4.A02()
            X.CwD r2 = r4.A00
            X.Jvx r2 = r2.A00
            r16 = 1
            if (r2 != 0) goto L_0x0054
        L_0x0052:
            r16 = 0
        L_0x0054:
            java.lang.String r2 = "is_form_extension"
            java.lang.Object r2 = r1.A00(r2)
            boolean r17 = X.AnonymousClass7TF.A1Y(r2, r3)
            java.lang.String r2 = "advertiser_fbidv2"
            java.lang.Object r12 = r1.A00(r2)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = r0.A03
            X.WYW r4 = new X.WYW
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.instagram.common.typedurl.ImageUrl r2 = r0.A02
            X.UnQ r0 = new X.UnQ
            r0.<init>(r1, r6, r2, r4)
            return r0
        L_0x0075:
            r15 = 0
            goto L_0x0052
        L_0x0077:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U8K.A02(X.6rJ, java.lang.Class, java.lang.String):X.2YL");
    }

    public U8K(Context context, Bundle bundle, AnonymousClass0g9 r5, AnonymousClass0iw r6) {
        super(bundle, r5);
        ExtendedImageUrl extendedImageUrl;
        this.A00 = r6;
        UserSession A0U = DbS.A0U(bundle);
        this.A01 = A0U;
        this.A03 = C18809W3g.A02(bundle);
        1Xj A0U2 = DbV.A0U(A0U, bundle.getString("mediaID"));
        if (A0U2 != null) {
            extendedImageUrl = A0U2.A1n(context);
        } else {
            extendedImageUrl = null;
        }
        this.A02 = extendedImageUrl;
    }
}
