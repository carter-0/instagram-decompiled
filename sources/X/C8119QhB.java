package X;

import android.os.Bundle;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebookpay.msc.logging.LoggingData;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.HashMap;

/* renamed from: X.QhB  reason: case insensitive filesystem */
public final class C8119QhB extends QDP implements C13607TdZ {
    public C11345SOd A00;
    public LoggingData A01;
    public SUj A02 = SUj.A02();
    public String A03;
    public String A04;
    public String A05;
    public final AnonymousClass2gB A06 = Pxh.A0M();
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(C13319TUs.A00);

    public static final void A05(C8119QhB qhB, String str, String str2, String str3) {
        A06(qhB, str, (String) null, (String) null, (String) null, str2, str3, (String) null, (String) null, (String) null);
    }

    public final void CNB(QDO qdo) {
        0qQ.A0B(qdo, 0);
        String str = this.A03;
        if (str == null) {
            0qQ.A0F("financialID");
            throw AnonymousClass00P.createAndThrow();
        }
        qdo.A04(new 2Fk(str));
        Pxi.A1A(qdo.A06, this.A06, TY1.A00(this, 43), 20);
        Pxi.A1A(qdo.A08, this.A03, TY1.A00(this, 44), 20);
    }

    public static final String A02(C8119QhB qhB) {
        C250663lr A032;
        C250663lr A012;
        C250663lr A022;
        C250663lr A013;
        C250663lr A023;
        String A072;
        C250663lr r3 = (C250663lr) qhB.A02.A01;
        if (r3 != null && (A022 = r3.A02(C7731QUu.class, "status_info", -784537479)) != null && (A013 = A022.A01(QVQ.class, 641502205)) != null && (A023 = A013.A02(QVO.class, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, 1181241025)) != null && (A072 = A023.A07("text")) != null) {
            return A072;
        }
        C250663lr r32 = (C250663lr) qhB.A02.A01;
        if (r32 == null || (A032 = r32.A03(C7733QUw.class, "total_summary", -2027266239)) == null || (A012 = A032.A01(QVW.class, 723759619)) == null) {
            return null;
        }
        return A012.A09(DialogModule.KEY_TITLE);
    }

    public static final void A04(C8119QhB qhB, String str) {
        String str2 = qhB.A05;
        if (str2 == null) {
            0qQ.A0F("payoutReleaseID");
            throw AnonymousClass00P.createAndThrow();
        }
        int A012 = DbX.A01(00y.A0m(str2, 10));
        AnonymousClass2E0.A02();
        SQ2.A00(667750653, A012, str, 0Yt.A0E());
    }

    public static final void A07(C8119QhB qhB, short s) {
        String str = qhB.A05;
        if (str == null) {
            0qQ.A0F("payoutReleaseID");
            throw AnonymousClass00P.createAndThrow();
        }
        int A0A = AnonymousClass7TG.A0A(00y.A0m(str, 10));
        AnonymousClass2E0.A02();
        SQ2.A02(667750653, A0A, s);
    }

    /* JADX WARNING: type inference failed for: r11v3, types: [X.RwX, X.QgW] */
    /* JADX WARNING: type inference failed for: r12v1, types: [X.RwX, X.QgW] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a8, code lost:
        if (r2 == false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0134, code lost:
        if (X.0qQ.A0K(r2.A0A("payee_name"), "Meta") != false) goto L_0x0136;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C8119QhB r25) {
        /*
            com.google.common.collect.ImmutableList$Builder r4 = com.google.common.collect.ImmutableList.builder()
            r5 = r25
            X.SOd r0 = r5.A00
            if (r0 == 0) goto L_0x000d
            r4.add(r0)
        L_0x000d:
            X.SUj r0 = r5.A02
            boolean r0 = X.SUj.A0V(r0)
            if (r0 == 0) goto L_0x0311
            X.SSy r8 = X.C11422SSy.A00
            X.0qQ.A0A(r4)
            X.SUj r0 = r5.A02
            java.lang.Object r6 = r0.A01
            X.3lr r6 = (X.C250663lr) r6
            r1 = 0
            if (r6 == 0) goto L_0x0279
            java.lang.Class<X.QUw> r3 = X.C7733QUw.class
            java.lang.String r2 = "total_summary"
            r0 = -2027266239(0xffffffff872a5f41, float:-1.2817371E-34)
            X.3lr r3 = r6.A03(r3, r2, r0)
            if (r3 == 0) goto L_0x0279
            java.lang.Class<X.QVW> r2 = X.QVW.class
            r0 = 723759619(0x2b23b203, float:5.8156274E-13)
            X.3lr r0 = r3.A01(r2, r0)
            X.QVW r0 = (X.QVW) r0
        L_0x003c:
            boolean r0 = X.C11422SSy.A03(r0, r4)
            X.QDP.A01(r5, r0)
            X.SUj r0 = r5.A02
            java.lang.Object r6 = r0.A01
            X.3lr r6 = (X.C250663lr) r6
            if (r6 == 0) goto L_0x0276
            java.lang.Class<X.QUu> r3 = X.C7731QUu.class
            java.lang.String r2 = "status_info"
            r0 = -784537479(0xffffffffd13ce879, float:-5.0709631E10)
            X.3lr r3 = r6.A02(r3, r2, r0)
            if (r3 == 0) goto L_0x0276
            java.lang.Class<X.QVQ> r2 = X.QVQ.class
            r0 = 641502205(0x263c8bfd, float:6.541532E-16)
            X.3lr r3 = r3.A01(r2, r0)
            X.QVQ r3 = (X.QVQ) r3
        L_0x0064:
            r25 = 6
            X.TTH r2 = new X.TTH
            r0 = r25
            r2.<init>(r5, r0)
            r8.A04(r3, r4, r2)
            r7 = 0
            r24 = 4
            X.C8094Qgm.A00(r4)
            X.SUj r0 = r5.A02
            java.lang.Object r6 = r0.A01
            X.3lr r6 = (X.C250663lr) r6
            if (r6 == 0) goto L_0x0273
            java.lang.Class<X.QUx> r3 = X.C7734QUx.class
            java.lang.String r2 = "transaction_info"
            r0 = -230329707(0xfffffffff2457295, float:-3.9108524E30)
            X.3lr r3 = r6.A04(r3, r2, r0)
            if (r3 == 0) goto L_0x0273
            java.lang.Class<X.QTu> r2 = X.C7705QTu.class
            r0 = 710338203(0x2a56e69b, float:1.9087026E-13)
            X.3lr r0 = r3.reinterpretRequired(r7, r2, r0)
            X.QTu r0 = (X.C7705QTu) r0
        L_0x0097:
            boolean r0 = r8.A05(r0, r4)
            java.lang.String r23 = "Required value was null."
            if (r0 == 0) goto L_0x00aa
            java.lang.Boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0286
            boolean r2 = r0.booleanValue()
            r0 = 1
            if (r2 != 0) goto L_0x00ab
        L_0x00aa:
            r0 = 0
        L_0x00ab:
            X.QDP.A01(r5, r0)
            X.C8094Qgm.A00(r4)
            X.SUj r0 = r5.A02
            java.lang.Object r6 = r0.A01
            X.3lr r6 = (X.C250663lr) r6
            if (r6 == 0) goto L_0x026f
            java.lang.Class<X.QS6> r3 = X.QS6.class
            r2 = 3
            r0 = 1854628280(0x6e8b61b8, float:2.1568276E28)
            X.3lr r6 = r6.reinterpretRequired(r2, r3, r0)
            if (r6 == 0) goto L_0x026f
            java.lang.Class<X.QS5> r3 = X.QS5.class
            java.lang.String r2 = "earnings_included_in_payout"
            r0 = 44353839(0x2a4c92f, float:2.4213108E-37)
            X.3lr r6 = r6.getOptionalTreeField(r7, r2, r3, r0)
            if (r6 == 0) goto L_0x0270
            java.lang.String r0 = "section_title"
            java.lang.String r0 = r6.getOptionalStringField(r7, r0)
        L_0x00d9:
            X.C11422SSy.A02(r4, r0)
            r3 = 1
            if (r6 == 0) goto L_0x02a8
            java.lang.Class<X.QS4> r22 = X.QS4.class
            java.lang.String r21 = "table_rows"
            r20 = 196770889(0xbba7c49, float:7.18316E-32)
            r8 = r21
            r2 = r22
            r0 = r20
            com.google.common.collect.ImmutableList r0 = r6.getRequiredCompactedTreeListField(r3, r8, r2, r0)
            if (r0 == 0) goto L_0x028b
            java.util.Iterator r19 = r0.iterator()
        L_0x00f7:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x028b
            X.3lr r2 = X.C41845B3m.A0V(r19)
            java.lang.String r10 = "payee_name"
            java.lang.String r8 = r2.A0A(r10)
            java.lang.String r0 = "UNKNOWN"
            boolean r0 = X.0qQ.A0K(r8, r0)
            if (r0 == 0) goto L_0x0251
            java.lang.String r8 = "product_name"
            r0 = r25
            X.StR r18 = X.C12401StR.A00(r2, r8, r0)
        L_0x0119:
            java.lang.String r0 = "image_uri"
            java.lang.String r11 = r2.getOptionalStringField(r3, r0)
            java.lang.String r0 = "image_uri_dark"
            java.lang.String r9 = r2.A09(r0)
            java.lang.String r0 = r5.A04
            java.lang.String r12 = "Meta"
            if (r0 == 0) goto L_0x0136
            java.lang.String r0 = r2.A0A(r10)
            boolean r0 = X.0qQ.A0K(r0, r12)
            r8 = 1
            if (r0 == 0) goto L_0x0137
        L_0x0136:
            r8 = 0
        L_0x0137:
            X.Ssk r17 = new X.Ssk
            r0 = r17
            r0.<init>(r11, r9, r8, r3)
            java.lang.Class<X.QS3> r14 = X.QS3.class
            r13 = 8
            java.lang.String r11 = "universe_info"
            r9 = -1437888165(0xffffffffaa4b915b, float:-1.8080452E-13)
            X.3lr r0 = r2.getOptionalTreeField(r13, r11, r14, r9)
            if (r0 == 0) goto L_0x024e
            X.3lr r16 = r2.getOptionalTreeField(r13, r11, r14, r9)
            if (r16 == 0) goto L_0x024b
            java.lang.Class<X.QSc> r8 = X.C7661QSc.class
            r0 = -546348433(0xffffffffdf6f626f, float:-1.7249472E19)
            r15 = r8
            r8 = r0
            r0 = r16
            X.3lr r8 = r0.reinterpretRequired(r7, r15, r8)
            if (r8 == 0) goto L_0x024b
            java.lang.String r0 = "icon_uri"
            java.lang.String r15 = r8.A09(r0)
        L_0x0169:
            X.3lr r9 = r2.getOptionalTreeField(r13, r11, r14, r9)
            if (r9 == 0) goto L_0x0248
            java.lang.Class<X.QSc> r8 = X.C7661QSc.class
            r0 = -546348433(0xffffffffdf6f626f, float:-1.7249472E19)
            X.3lr r8 = r9.reinterpretRequired(r7, r8, r0)
            if (r8 == 0) goto L_0x0248
            java.lang.String r0 = "icon_uri_dark"
            java.lang.String r8 = r8.A0A(r0)
        L_0x0180:
            X.Ssk r9 = new X.Ssk
            r9.<init>(r15, r8, r7, r3)
        L_0x0185:
            java.lang.String r0 = r5.A04
            if (r0 != 0) goto L_0x0231
            r0 = 2131239842(0x7f0823a2, float:1.8096002E38)
            X.Ssl r8 = new X.Ssl
            r8.<init>(r1, r1, r0, r7)
        L_0x0191:
            java.lang.String r0 = r5.A04
            if (r0 != 0) goto L_0x0221
            r10 = 5
        L_0x0196:
            X.Qgk r10 = X.C8092Qgk.A00(r10)
            X.QgW r11 = new X.QgW
            r11.<init>()
            r0 = r17
            r11.A02 = r0
            r11.A00 = r8
            r11.A01 = r9
            X.QgY r11 = X.SIE.A02(r11, r10)
            java.lang.String r8 = "amount"
            r0 = r24
            X.StR r8 = X.C12401StR.A00(r2, r8, r0)
            X.RH2 r0 = X.RH2.PRIMARY_TEXT
            X.SST.A02(r8, r11, r0)
            X.RH2 r9 = X.RH2.A14
            r0 = r18
            X.SST.A03(r0, r11, r9)
            java.lang.String r0 = "date_range"
            java.lang.String r0 = r2.A0C(r0)
            X.StR r8 = X.C12401StR.A01(r0)
            X.SST r0 = new X.SST
            r0.<init>(r1, r8, r9)
            r11.A03 = r0
            r11.A03 = r7
            X.C8086Qge.A00(r10, r11, r3)
            X.C11426STk.A04()
            X.QgW r12 = new X.QgW
            r12.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r24)
            r0 = 3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            X.Ssm r0 = new X.Ssm
            r0.<init>(r11, r9, r8, r8)
            r12.A02 = r0
            r12.A03 = r7
            X.Qga r0 = new X.Qga
            r0.<init>(r12)
            r10.A06 = r0
            r0 = 35
            X.SbM r0 = X.C11499SbM.A00(r2, r5, r0)
            r10.A03 = r0
            X.SRP r9 = X.SRP.A00()
            r8 = 7
            java.lang.String r0 = "accessibility_label"
            X.StR r0 = X.C12401StR.A00(r2, r0, r8)
            r9.A01 = r0
            r9.A04 = r3
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r0 = 2131976625(0x7f1361b1, float:1.9590376E38)
            X.StQ r0 = X.C12400StQ.A00(r2, r0)
            r9.A00 = r0
            X.SO0.A01(r9, r10, r4)
            goto L_0x00f7
        L_0x0221:
            java.lang.String r0 = r2.A0A(r10)
            boolean r0 = X.0qQ.A0K(r0, r12)
            r10 = 37
            if (r0 == 0) goto L_0x0196
            r10 = 48
            goto L_0x0196
        L_0x0231:
            java.lang.String r0 = r2.A0A(r10)
            boolean r0 = X.0qQ.A0K(r0, r12)
            if (r0 == 0) goto L_0x0245
            r0 = 2131239809(0x7f082381, float:1.8095935E38)
            X.Ssl r8 = new X.Ssl
            r8.<init>(r1, r1, r0, r7)
            goto L_0x0191
        L_0x0245:
            r8 = r1
            goto L_0x0191
        L_0x0248:
            r8 = r1
            goto L_0x0180
        L_0x024b:
            r15 = r1
            goto L_0x0169
        L_0x024e:
            r9 = r1
            goto L_0x0185
        L_0x0251:
            java.lang.String r9 = r2.A0A(r10)
            if (r9 == 0) goto L_0x0281
            java.lang.String r8 = "product_name"
            r0 = r25
            java.lang.String r0 = r2.getOptionalStringField(r0, r8)
            if (r0 == 0) goto L_0x027c
            java.lang.Object[] r8 = new java.lang.Object[]{r9, r0}
            r0 = 2131961079(0x7f1324f7, float:1.9558845E38)
            X.StQ r18 = X.C12400StQ.A00(r8, r0)
            goto L_0x0119
        L_0x026f:
            r6 = r1
        L_0x0270:
            r0 = r1
            goto L_0x00d9
        L_0x0273:
            r0 = r1
            goto L_0x0097
        L_0x0276:
            r3 = r1
            goto L_0x0064
        L_0x0279:
            r0 = r1
            goto L_0x003c
        L_0x027c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r23)
            throw r0
        L_0x0281:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r23)
            throw r0
        L_0x0286:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r23)
            throw r0
        L_0x028b:
            r2 = r21
            r1 = r22
            r0 = r20
            com.google.common.collect.ImmutableList r0 = r6.getRequiredCompactedTreeListField(r3, r2, r1, r0)
            if (r0 == 0) goto L_0x02a8
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02a8
            java.lang.Boolean r0 = r5.A00
            if (r0 == 0) goto L_0x031b
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02a8
            r7 = 1
        L_0x02a8:
            X.QDP.A01(r5, r7)
            X.SUj r0 = r5.A02
            java.lang.Object r7 = r0.A01
            X.3lr r7 = (X.C250663lr) r7
            r2 = 0
            if (r7 == 0) goto L_0x0311
            java.lang.Class<X.QUv> r6 = X.C7732QUv.class
            java.lang.String r3 = "support_info"
            r1 = -1938073915(0xffffffff8c7b56c5, float:-1.9362448E-31)
            r0 = r24
            X.3lr r3 = r7.getOptionalTreeField(r0, r3, r6, r1)
            if (r3 == 0) goto L_0x0311
            java.lang.Class<X.QVa> r1 = X.C7737QVa.class
            r11 = 0
            r0 = -1501721608(0xffffffffa67d8bf8, float:-8.79667E-16)
            X.3lr r10 = r3.reinterpretRequired(r11, r1, r0)
            if (r10 == 0) goto L_0x0311
            java.lang.String r9 = "section_title"
            java.lang.String r0 = r10.getOptionalStringField(r11, r9)
            if (r0 == 0) goto L_0x0311
            java.lang.Class<X.BXc> r8 = X.C42259BXc.class
            java.lang.String r7 = "support_uri"
            r6 = 1128213833(0x433f2d49, float:191.1769)
            X.3lr r0 = r10.A02(r8, r7, r6)
            if (r0 == 0) goto L_0x0311
            java.lang.Class<X.QXV> r3 = X.QXV.class
            r1 = -1925217936(0xffffffff8d3f8170, float:-5.9012224E-31)
            X.3lr r0 = r0.reinterpretRequired(r11, r3, r1)
            if (r0 == 0) goto L_0x0311
            X.C8094Qgm.A00(r4)
            java.lang.String r0 = r10.getOptionalStringField(r11, r9)
            X.C11422SSy.A02(r4, r0)
            X.3lr r0 = r10.A02(r8, r7, r6)
            if (r0 == 0) goto L_0x0308
            X.3lr r2 = r0.reinterpretRequired(r11, r3, r1)
            X.QXV r2 = (X.QXV) r2
        L_0x0308:
            r1 = 5
            X.TTH r0 = new X.TTH
            r0.<init>(r5, r1)
            X.C11422SSy.A00(r2, r4, r0)
        L_0x0311:
            X.2gB r1 = r5.A06
            com.google.common.collect.ImmutableList r0 = r4.build()
            r1.A0B(r0)
            return
        L_0x031b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r23)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8119QhB.A03(X.QhB):void");
    }

    public static final void A06(C8119QhB qhB, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        String str10;
        2FO A002 = C11426STk.A00();
        LoggingData loggingData = qhB.A01;
        if (loggingData == null) {
            str10 = "loggingData";
        } else {
            HashMap A003 = C9634ReE.A00(loggingData);
            String str11 = qhB.A03;
            if (str11 == null) {
                str10 = "financialID";
            } else {
                A003.put("financial_entity_id", str11);
                String str12 = qhB.A05;
                if (str12 == null) {
                    str10 = "payoutReleaseID";
                } else {
                    A003.put("batch_item_id", str12);
                    Pxj.A1L("view_name", "payout_details", str2, A003);
                    if (str3 != null) {
                        A003.put("target_url", str3);
                    }
                    if (str4 != null) {
                        A003.put("payout_record_id", str4);
                    }
                    String str13 = qhB.A04;
                    if (str13 != null) {
                        A003.put("managed_merchant_account_id", str13);
                    }
                    if (str5 != null) {
                        A003.put("payout_status", str5);
                    }
                    if (str6 != null) {
                        A003.put("endpoint", str6);
                    }
                    if (str7 != null) {
                        A003.put("error_message", str7);
                    }
                    if (str8 != null) {
                        A003.put("error_stacktrace", str8);
                    }
                    if (str9 != null) {
                        A003.put("exception_class", str9);
                    }
                    A002.Cgl(str, A003);
                    return;
                }
            }
        }
        0qQ.A0F(str10);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0C(Bundle bundle) {
        String string;
        String str;
        super.A0C(bundle);
        String str2 = null;
        if (bundle != null) {
            str2 = bundle.getString("payout_release_id");
        }
        if (str2 != null) {
            this.A05 = str2;
            if (bundle == null || (string = bundle.getString("financial_entity_id")) == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            this.A03 = string;
            this.A04 = bundle.getString("managed_merchant_account_id");
            LoggingData loggingData = (LoggingData) bundle.getParcelable("logging_data");
            if (loggingData != null) {
                this.A01 = loggingData;
                this.A07.A0B(new S62(C12400StQ.A00(new Object[0], 2131969252), ImmutableList.of(), false));
                this.A00 = null;
                A05(this, "client_fetch_payouthub_init", (String) null, "BSC_PAYOUT_PAYOUTS_DETAIL");
                A04(this, "fetch_init");
                AnonymousClass2gB r2 = this.A06;
                Object value = this.A07.getValue();
                LoggingData loggingData2 = this.A01;
                if (loggingData2 == null) {
                    str = "loggingData";
                } else {
                    String str3 = loggingData2.A00;
                    String str4 = this.A03;
                    if (str4 == null) {
                        str = "financialID";
                    } else {
                        String str5 = this.A04;
                        String str6 = this.A05;
                        if (str6 == null) {
                            str = "payoutReleaseID";
                        } else {
                            SQB.A02(C8282QnO.A00(new C11550ScB(value, str3, str4, str5, str6, 1), AnonymousClass2E0.A06()), r2, C11647Sdp.A00(this, 15));
                            return;
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
