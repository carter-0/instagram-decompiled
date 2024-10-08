package X;

import android.content.Context;
import android.content.DialogInterface;

public abstract class F6O {
    public static DialogInterface.OnClickListener A00(Context context, AnonymousClass0aP r12, C49590Eyz eyz, C49708F2t f2t, G8H g8h, String str) {
        C49590Eyz eyz2 = eyz;
        Object obj = C48068EUm.A01.get(eyz.A00);
        obj.getClass();
        C48068EUm eUm = (C48068EUm) obj;
        C48085EVd eVd = C48085EVd.GO_TO_HELPER_URL;
        C48085EVd eVd2 = eyz.A00;
        AnonymousClass0aP r5 = r12;
        if (eVd == eVd2) {
            C49938FFr.A00(r5, (C49922FEx) null, (EXD) null, (Integer) null, "access_dialog", eUm.A00);
            return new C50024FJj(7, (Object) eUm, (Object) r12, (Object) eyz, (Object) context);
        }
        C48085EVd eVd3 = C48085EVd.STOP_ACCOUNT_DELETION;
        String str2 = eUm.A00;
        G8H g8h2 = g8h;
        if (eVd3 == eVd2) {
            C49938FFr.A00(r5, (C49922FEx) null, (EXD) null, (Integer) null, "access_dialog", str2);
            return new C49999FIk(eUm, eyz2, g8h2, r5, str, 3);
        }
        C49938FFr.A00(r5, (C49922FEx) null, (EXD) null, (Integer) null, "access_dialog", str2);
        return new C50024FJj(8, (Object) eUm, (Object) f2t, (Object) g8h, (Object) r12);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (r22 == null) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.app.Activity r16, X.AnonymousClass0aP r17, X.C49708F2t r18, X.EM4 r19, X.G8H r20, java.lang.String r21, java.lang.String r22) {
        /*
            r13 = r18
            boolean r0 = r13.A08
            r4 = 1
            r6 = r19
            if (r0 == 0) goto L_0x013b
            java.util.ArrayList r0 = r6.A0A
            java.util.Iterator r2 = r0.iterator()
        L_0x000f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x013b
            java.lang.Object r0 = r2.next()
            X.Eyz r0 = (X.C49590Eyz) r0
            X.EVd r1 = r0.A00
            X.EVd r0 = X.C48085EVd.SWITCH_TO_SIGNUP_FLOW
            if (r1 != r0) goto L_0x000f
            r9 = 1
        L_0x0022:
            java.lang.String r5 = r6.mErrorTitle
            java.lang.String r1 = r6.getErrorMessage()
            r10 = r16
            X.8ab r3 = X.DbS.A0X(r10)
            java.lang.String r8 = r6.A05
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r11 = r17
            r7 = r22
            if (r0 == 0) goto L_0x010b
            r0 = 2131972232(0x7f135088, float:1.9581466E38)
            X.DbU.A17(r10, r3, r0)
        L_0x0040:
            if (r22 == 0) goto L_0x0054
        L_0x0042:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0054
            r2 = 2131964884(0x7f1333d4, float:1.9566562E38)
            r1 = 4
            X.FJd r0 = new X.FJd
            r0.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.String) r7, (int) r1)
            r3.A0H(r0, r2)
        L_0x0054:
            if (r5 != 0) goto L_0x005d
            r0 = 2131961740(0x7f13278c, float:1.9560185E38)
            java.lang.String r5 = r10.getString(r0)
        L_0x005d:
            r3.A05 = r5
            java.util.ArrayList r2 = r6.A0A
            r14 = r20
            r15 = r21
            if (r9 == 0) goto L_0x00bb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x009f
            java.lang.Object r12 = X.AnonymousClass7TE.A12(r2)
            X.Eyz r12 = (X.C49590Eyz) r12
            android.content.DialogInterface$OnClickListener r5 = A00(r10, r11, r12, r13, r14, r15)
            X.1Q0 r0 = X.1Q0.A05
            X.FIM r1 = new X.FIM
            r1.<init>(r5, r11, r0)
            java.lang.String r0 = r12.A01
            r3.A0b(r1, r0)
            int r0 = r2.size()
            if (r0 <= r4) goto L_0x009f
            java.lang.Object r12 = r2.get(r4)
            X.Eyz r12 = (X.C49590Eyz) r12
            android.content.DialogInterface$OnClickListener r4 = A00(r10, r11, r12, r13, r14, r15)
            java.lang.String r2 = r12.A01
            X.1Q0 r1 = X.1Q0.A06
            X.FIM r0 = new X.FIM
            r0.<init>(r4, r11, r1)
            r3.A0c(r0, r2)
        L_0x009f:
            boolean r0 = r10.isFinishing()
            if (r0 != 0) goto L_0x00ad
            X.Fs2 r0 = new X.Fs2
            r0.<init>(r3)
            X.11Z.A02(r0)
        L_0x00ad:
            if (r9 == 0) goto L_0x00ba
            X.1Q0 r0 = X.1Q0.A04
            X.FGI r1 = r0.A02(r11)
            X.DiE r0 = X.C46634DiE.ACCESS_DIALOG
            X.FGI.A03(r1, r0)
        L_0x00ba:
            return
        L_0x00bb:
            if (r2 == 0) goto L_0x00ff
            if (r20 == 0) goto L_0x00ff
            int r5 = r2.size()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x009f
            int r0 = r5 + -1
            java.lang.Object r12 = r2.get(r0)
            X.Eyz r12 = (X.C49590Eyz) r12
            java.lang.String r1 = r12.A01
            android.content.DialogInterface$OnClickListener r0 = A00(r10, r11, r12, r13, r14, r15)
            r3.A0b(r0, r1)
            r0 = 0
            if (r5 <= r4) goto L_0x009f
            java.lang.Object r12 = r2.get(r0)
            X.Eyz r12 = (X.C49590Eyz) r12
            java.lang.String r1 = r12.A01
            android.content.DialogInterface$OnClickListener r0 = A00(r10, r11, r12, r13, r14, r15)
            r3.A0c(r0, r1)
            r0 = 2
            if (r5 <= r0) goto L_0x009f
            java.lang.Object r12 = r2.get(r4)
            X.Eyz r12 = (X.C49590Eyz) r12
            java.lang.String r1 = r12.A01
            android.content.DialogInterface$OnClickListener r0 = A00(r10, r11, r12, r13, r14, r15)
            r3.A0a(r0, r1)
            goto L_0x009f
        L_0x00ff:
            boolean r0 = r13.A04
            if (r0 != 0) goto L_0x009f
            r1 = 2131960862(0x7f13241e, float:1.9558405E38)
            r0 = 0
            r3.A0I(r0, r1)
            goto L_0x009f
        L_0x010b:
            android.text.SpannableStringBuilder r2 = X.DbS.A0C(r1)
            java.lang.String r1 = r6.A03
            if (r1 == 0) goto L_0x011b
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r4)
            X.AnonymousClass7AV.A02(r2, r0, r1)
        L_0x011b:
            if (r22 == 0) goto L_0x0136
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0136
            X.FIa r14 = new X.FIa
            r15 = r10
            r16 = r11
            r18 = r8
            r19 = r4
            r17 = r7
            r14.<init>(r15, r16, r17, r18, r19)
            r3.A0Z(r14, r2, r8)
            goto L_0x0042
        L_0x0136:
            r3.A0q(r2)
            goto L_0x0040
        L_0x013b:
            r9 = 0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F6O.A01(android.app.Activity, X.0aP, X.F2t, X.EM4, X.G8H, java.lang.String, java.lang.String):void");
    }
}
