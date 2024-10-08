package com.instagram.fx.access.sso;

import X.00k;
import X.0lg;
import X.0qQ;
import X.2Fk;
import X.2YL;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C318116oQ;
import X.C51778G1n;
import X.C51779G1o;
import X.C51780G1p;
import X.C51781G1q;
import X.C51782G1r;
import X.C60937Jtv;
import X.DbT;
import X.MHF;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;

public final class FxSsoViewModel extends 2YL {
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(C51778G1n.A00);
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(C51779G1o.A00);
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(C51780G1p.A00);
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(C51781G1q.A00);
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(C51782G1r.A00);

    public final void A03(Context context, Bundle bundle, 0lg r11) {
        0qQ.A0B(r11, 0);
        AnonymousClass7TE.A1Z(new MHF(r11, context, bundle, this, (AnonymousClass4D7) null, 48), C318116oQ.A00(this));
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v17 */
    /* JADX WARNING: type inference failed for: r6v18 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.content.Context r25, android.os.Bundle r26, X.0lg r27, com.instagram.fx.access.sso.FxSsoViewModel r28, X.AnonymousClass4D7 r29) {
        /*
            r3 = r28
            r4 = r27
            r5 = r26
            r7 = 47
            r8 = r29
            boolean r0 = X.MED.A04(r7, r8)
            if (r0 == 0) goto L_0x0277
            r6 = r8
            X.MED r6 = (X.MED) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0277
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x001e:
            java.lang.Object r1 = r6.A04
            X.1Hj r2 = X.1Hj.A02
            int r0 = r6.A00
            java.lang.String r14 = "cached_ig_access_token"
            r7 = 1
            if (r0 == 0) goto L_0x01e9
            if (r0 != r7) goto L_0x0299
            java.lang.Object r5 = r6.A03
            android.os.BaseBundle r5 = (android.os.BaseBundle) r5
            java.lang.Object r4 = r6.A02
            X.0lg r4 = (X.0lg) r4
            java.lang.Object r3 = r6.A01
            com.instagram.fx.access.sso.FxSsoViewModel r3 = (com.instagram.fx.access.sso.FxSsoViewModel) r3
            X.0eS.A00(r1)
        L_0x003a:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x027e
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.Dv6 r0 = (X.C47339Dv6) r0
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0287
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            if (r0 == 0) goto L_0x0287
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r19 = r0.iterator()
        L_0x0058:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0288
            java.lang.Object r7 = r19.next()
            X.EbN r7 = (X.C48242EbN) r7
            if (r7 == 0) goto L_0x01d7
            X.EbB r1 = r7.A01
            if (r1 == 0) goto L_0x01d4
            com.instagram.fx.access.constants.FxcalAccountType r6 = r1.A00
        L_0x006c:
            com.instagram.fx.access.constants.FxcalAccountType r18 = com.instagram.fx.access.constants.FxcalAccountType.FACEBOOK
            java.lang.String r17 = ""
            r0 = r18
            if (r6 != r0) goto L_0x014b
            X.Eb2 r0 = r7.A00
            if (r0 == 0) goto L_0x0085
            java.lang.String r6 = r0.A00
            if (r6 == 0) goto L_0x0085
            X.0eM r0 = r3.A00
            X.2Fk r0 = X.DbT.A0H(r0)
            r0.A0B(r6)
        L_0x0085:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r7.A03
            if (r0 == 0) goto L_0x0142
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            if (r0 == 0) goto L_0x0142
            java.util.ArrayList r15 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x009b:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0142
            java.lang.Object r12 = r16.next()
            X.Exi r12 = (X.C49547Exi) r12
            if (r12 == 0) goto L_0x0140
            java.lang.Boolean r0 = r12.A01
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0104
            X.F1D r0 = r12.A00
            if (r0 == 0) goto L_0x013b
            com.instagram.common.typedurl.ImageUrl r8 = r0.A05
            java.lang.String r6 = r0.A0O
            java.lang.String r0 = r0.A0G
        L_0x00bb:
            java.lang.Integer r26 = X.AnonymousClass05K.A0N
            X.FV8 r11 = X.FV8.A00()
            java.lang.String r13 = "ig_android_growth_fx_access_fb_ig_sso"
            java.lang.String r10 = "FxSsoViewModel"
            boolean r11 = r11.A04(r4, r13, r10)
            if (r11 == 0) goto L_0x010c
            X.QP8 r20 = new X.QP8
            java.lang.String r11 = r12.A02
            if (r11 != 0) goto L_0x00db
            X.F1D r11 = r12.A00
            if (r11 == 0) goto L_0x00d9
            java.lang.String r11 = r11.A0O
            if (r11 != 0) goto L_0x00db
        L_0x00d9:
            r11 = r17
        L_0x00db:
            X.FV8 r12 = X.FV8.A00()
            java.lang.String r23 = r12.A02(r4, r13, r10)
            r24 = 0
            if (r1 == 0) goto L_0x010a
            java.lang.String r10 = r1.A01
        L_0x00e9:
            r25 = r10
            r21 = r18
            r22 = r11
            r20.<init>((com.instagram.fx.access.constants.FxcalAccountType) r21, (java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24, (java.lang.String) r25)
        L_0x00f2:
            X.Jtv r10 = new X.Jtv
            r24 = r10
            r25 = r8
            r27 = r20
            r28 = r6
            r29 = r0
            r24.<init>(r25, r26, r27, r28, r29)
            r9.add(r10)
        L_0x0104:
            X.0gF r0 = X.C60340gF.A00
        L_0x0106:
            r15.add(r0)
            goto L_0x009b
        L_0x010a:
            r10 = 0
            goto L_0x00e9
        L_0x010c:
            java.lang.String r11 = r12.A02
            if (r11 != 0) goto L_0x011a
            X.F1D r11 = r12.A00
            if (r11 == 0) goto L_0x0118
            java.lang.String r11 = r11.A0O
            if (r11 != 0) goto L_0x011a
        L_0x0118:
            r11 = r17
        L_0x011a:
            X.FXk r12 = X.C50305FXk.A03
            boolean r10 = X.Dbc.A12(r4, r10)
            if (r10 == 0) goto L_0x0138
            r23 = 0
        L_0x0124:
            r24 = 0
            if (r1 == 0) goto L_0x0136
            java.lang.String r10 = r1.A01
        L_0x012a:
            X.QP8 r20 = new X.QP8
            r25 = r10
            r21 = r18
            r22 = r11
            r20.<init>((com.instagram.fx.access.constants.FxcalAccountType) r21, (java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24, (java.lang.String) r25)
            goto L_0x00f2
        L_0x0136:
            r10 = 0
            goto L_0x012a
        L_0x0138:
            java.lang.String r23 = X.C50305FXk.A02
            goto L_0x0124
        L_0x013b:
            r8 = 0
            r6 = 0
            r0 = 0
            goto L_0x00bb
        L_0x0140:
            r0 = 0
            goto L_0x0106
        L_0x0142:
            X.0eM r0 = r3.A02
            X.2Fk r0 = X.DbT.A0H(r0)
            r0.A0B(r9)
        L_0x014b:
            if (r1 == 0) goto L_0x01d1
            com.instagram.fx.access.constants.FxcalAccountType r0 = r1.A00
        L_0x014f:
            com.instagram.fx.access.constants.FxcalAccountType r12 = com.instagram.fx.access.constants.FxcalAccountType.INSTAGRAM
            if (r0 != r12) goto L_0x01e2
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r7.A03
            if (r0 == 0) goto L_0x01d9
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            if (r0 == 0) goto L_0x01d9
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r13 = r0.iterator()
        L_0x0169:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01d9
            java.lang.Object r6 = r13.next()
            X.Exi r6 = (X.C49547Exi) r6
            if (r6 == 0) goto L_0x01cf
            java.lang.Boolean r0 = r6.A01
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01c0
            X.F1D r0 = r6.A00
            if (r0 == 0) goto L_0x01cb
            com.instagram.common.typedurl.ImageUrl r9 = r0.A05
            java.lang.String r8 = r0.A0O
            java.lang.String r7 = r0.A0G
        L_0x0189:
            java.lang.Integer r26 = X.AnonymousClass05K.A0Y
            if (r0 == 0) goto L_0x0195
            java.lang.String r6 = r0.A0G
            if (r6 != 0) goto L_0x0197
            java.lang.String r6 = r0.A0O
            if (r6 != 0) goto L_0x0197
        L_0x0195:
            r6 = r17
        L_0x0197:
            if (r5 == 0) goto L_0x01c8
            java.lang.String r23 = r5.getString(r14)
        L_0x019d:
            r24 = 0
            if (r1 == 0) goto L_0x01c6
            java.lang.String r0 = r1.A01
        L_0x01a3:
            X.QP8 r20 = new X.QP8
            r25 = r0
            r21 = r12
            r22 = r6
            r20.<init>((com.instagram.fx.access.constants.FxcalAccountType) r21, (java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24, (java.lang.String) r25)
            X.Jtv r0 = new X.Jtv
            r24 = r0
            r25 = r9
            r27 = r20
            r28 = r8
            r29 = r7
            r24.<init>(r25, r26, r27, r28, r29)
            r11.add(r0)
        L_0x01c0:
            X.0gF r0 = X.C60340gF.A00
        L_0x01c2:
            r10.add(r0)
            goto L_0x0169
        L_0x01c6:
            r0 = 0
            goto L_0x01a3
        L_0x01c8:
            r23 = 0
            goto L_0x019d
        L_0x01cb:
            r9 = 0
            r8 = 0
            r7 = 0
            goto L_0x0189
        L_0x01cf:
            r0 = 0
            goto L_0x01c2
        L_0x01d1:
            r0 = 0
            goto L_0x014f
        L_0x01d4:
            r6 = 0
            goto L_0x006c
        L_0x01d7:
            r0 = 0
            goto L_0x01e4
        L_0x01d9:
            X.0eM r0 = r3.A03
            X.2Fk r0 = X.DbT.A0H(r0)
            r0.A0B(r11)
        L_0x01e2:
            X.0gF r0 = X.C60340gF.A00
        L_0x01e4:
            r2.add(r0)
            goto L_0x0058
        L_0x01e9:
            X.0eS.A00(r1)
            if (r26 == 0) goto L_0x0274
            java.lang.String r0 = "current_user_id"
            java.lang.String r9 = r5.getString(r0)
            java.lang.String r10 = r5.getString(r14)
        L_0x01f8:
            X.0sn r8 = X.0sn.A00
            X.FV8 r0 = X.FV8.A00()
            java.lang.String r13 = "ig_android_growth_fx_access_fb_ig_sso"
            java.lang.String r12 = "FxSsoViewModel"
            boolean r0 = r0.A04(r4, r13, r12)
            if (r0 == 0) goto L_0x0255
            com.instagram.fx.access.constants.FxcalAccountType r11 = com.instagram.fx.access.constants.FxcalAccountType.FACEBOOK
            X.FV8 r0 = X.FV8.A00()
            java.lang.String r1 = r0.A02(r4, r13, r12)
            X.FV8 r0 = X.FV8.A00()
            java.lang.String r0 = r0.A01(r4, r13, r12)
        L_0x021a:
            X.F0H r0 = X.FHA.A0G(r11, r1, r0)
            java.util.ArrayList r8 = X.00k.A0T(r0, r8)
        L_0x0222:
            if (r9 == 0) goto L_0x0230
            if (r10 == 0) goto L_0x0230
            com.instagram.fx.access.constants.FxcalAccountType r0 = com.instagram.fx.access.constants.FxcalAccountType.INSTAGRAM
            X.F0H r0 = X.FHA.A0G(r0, r10, r9)
            java.util.ArrayList r8 = X.00k.A0T(r0, r8)
        L_0x0230:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x029e
            if (r9 == 0) goto L_0x0252
            java.lang.String r0 = "account_switcher"
        L_0x023a:
            r1 = r25
            X.1OC r1 = X.FHA.A07(r1, r4, r0, r8)
            r6.A01 = r3
            r6.A02 = r4
            r6.A03 = r5
            r6.A00 = r7
            r0 = 1737768369(0x67943db1, float:1.4000965E24)
            java.lang.Object r1 = r1.A00(r0, r6)
            if (r1 != r2) goto L_0x003a
            return r2
        L_0x0252:
            java.lang.String r0 = "login"
            goto L_0x023a
        L_0x0255:
            X.FXk r0 = X.C50305FXk.A03
            boolean r0 = r0.A00(r4, r12)
            if (r0 == 0) goto L_0x0222
            com.instagram.fx.access.constants.FxcalAccountType r11 = com.instagram.fx.access.constants.FxcalAccountType.FACEBOOK
            boolean r0 = X.Dbc.A12(r4, r12)
            if (r0 == 0) goto L_0x026e
            r1 = 0
        L_0x0266:
            boolean r0 = X.Dbc.A12(r4, r12)
            if (r0 == 0) goto L_0x0271
            r0 = 0
            goto L_0x021a
        L_0x026e:
            java.lang.String r1 = X.C50305FXk.A02
            goto L_0x0266
        L_0x0271:
            java.lang.String r0 = X.C50305FXk.A00
            goto L_0x021a
        L_0x0274:
            r9 = 0
            r10 = 0
            goto L_0x01f8
        L_0x0277:
            X.MED r6 = new X.MED
            r6.<init>(r3, r8, r7)
            goto L_0x001e
        L_0x027e:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x028c
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0287:
            r2 = 0
        L_0x0288:
            X.3Ih r1 = X.C41845B3m.A0d(r2)
        L_0x028c:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x029e
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x029e
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0299:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x029e:
            X.0gF r2 = X.C60340gF.A00
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fx.access.sso.FxSsoViewModel.A00(android.content.Context, android.os.Bundle, X.0lg, com.instagram.fx.access.sso.FxSsoViewModel, X.4D7):java.lang.Object");
    }

    public static boolean A01(FxSsoViewModel fxSsoViewModel) {
        return TextUtils.isEmpty((CharSequence) ((2Fk) fxSsoViewModel.A00.getValue()).A02());
    }

    public final String A02() {
        List list;
        C60937Jtv jtv;
        2Fk A0H = DbT.A0H(this.A02);
        if (A0H == null || (list = (List) A0H.A02()) == null || (jtv = (C60937Jtv) 00k.A0J(list)) == null) {
            return null;
        }
        return jtv.A04;
    }
}
