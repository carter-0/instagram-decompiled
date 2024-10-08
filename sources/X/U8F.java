package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class U8F extends AnonymousClass9YH {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final String A02;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005a, code lost:
        if (r4.A00.A00 == null) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.2YL A02(X.C319836rJ r21, java.lang.Class r22, java.lang.String r23) {
        /*
            r20 = this;
            r1 = r21
            r2 = r22
            r0 = r23
            boolean r3 = X.C51973G9u.A1b(r0, r2, r1)
            java.lang.String r6 = "formID"
            java.lang.Object r2 = r1.A00(r6)
            java.lang.String r5 = "Required value was null."
            if (r2 == 0) goto L_0x008b
            java.lang.String r2 = (java.lang.String) r2
            X.Vtw r0 = X.C18544Vtw.A01
            X.Vk5 r4 = r0.A00(r2)
            r2 = r20
            com.instagram.common.session.UserSession r8 = r2.A01
            X.0iw r7 = r2.A00
            java.lang.String r0 = "adID"
            java.lang.Object r9 = r1.A00(r0)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r0 = "trackingToken"
            java.lang.Object r10 = r1.A00(r0)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r1.A00(r6)
            if (r11 == 0) goto L_0x0085
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r0 = "ad_creation_source"
            java.lang.Object r12 = r1.A00(r0)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L_0x0046
            java.lang.String r12 = "UNKNOWN"
        L_0x0046:
            java.lang.String r13 = X.C13991Tnr.A0f(r1)
            boolean r16 = X.C18809W3g.A06(r4)
            if (r4 == 0) goto L_0x0082
            boolean r17 = r4.A02()
            X.CwD r0 = r4.A00
            X.Jvx r0 = r0.A00
            r18 = 1
            if (r0 != 0) goto L_0x005e
        L_0x005c:
            r18 = 0
        L_0x005e:
            java.lang.String r0 = "is_form_extension"
            java.lang.Object r0 = r1.A00(r0)
            boolean r19 = X.AnonymousClass7TF.A1Y(r0, r3)
            java.lang.String r0 = "advertiser_fbidv2"
            java.lang.Object r14 = r1.A00(r0)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = r2.A02
            X.WYW r6 = new X.WYW
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.instagram.leadads.repository.LeadFormRepository r2 = new com.instagram.leadads.repository.LeadFormRepository
            r2.<init>(r8)
            X.UnR r0 = new X.UnR
            r0.<init>(r1, r8, r6, r2)
            return r0
        L_0x0082:
            r17 = 0
            goto L_0x005c
        L_0x0085:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x008b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U8F.A02(X.6rJ, java.lang.Class, java.lang.String):X.2YL");
    }

    public U8F(Bundle bundle, AnonymousClass0g9 r3, AnonymousClass0iw r4) {
        super(bundle, r3);
        this.A00 = r4;
        this.A01 = DbS.A0U(bundle);
        this.A02 = C18809W3g.A02(bundle);
    }
}
