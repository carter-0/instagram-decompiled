package com.facebookpay.addresstypeahead.controller;

import X.05G;
import X.0qQ;
import X.0sP;
import X.106;
import X.19E;
import X.2Fk;
import X.2HY;
import X.AnonymousClass19G;
import X.AnonymousClass19S;
import X.AnonymousClass2E0;
import X.AnonymousClass2Fj;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C250663lr;
import X.C262084Cb;
import X.C262104Cd;
import X.C262204Co;
import X.C262224Cq;
import X.C41845B3m;
import X.C59676JTh;
import X.C62320sa;
import X.JTO;
import com.facebookpay.addresstypeahead.repositoryimpl.AddressTypeaheadRepositoryImpl;
import com.facebookpay.logging.LoggingContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class AddressTypeaheadController {
    public String A00;
    public C262204Co A01;
    public boolean A02;
    public final 2Fk A03;
    public final 2Fk A04;
    public final AnonymousClass2Fj A05;
    public final AddressTypeaheadRepositoryImpl A06 = AnonymousClass2E0.A01().A00;
    public final LoggingContext A07;
    public final C62320sa A08;
    public final 0sP A09;
    public final C262224Cq A0A;
    public final 05G A0B;
    public final AnonymousClass2Fj A0C;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDy, java.lang.Object, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v2, types: [X.MEC, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.facebookpay.addresstypeahead.controller.AddressTypeaheadController r22, java.lang.String r23, java.lang.String r24, X.AnonymousClass4D7 r25) {
        /*
            r12 = r22
            r13 = r23
            r3 = 15
            r5 = r25
            boolean r0 = X.C66146MDy.A02(r3, r5)
            if (r0 == 0) goto L_0x01f3
            r4 = r5
            X.MDy r4 = (X.C66146MDy) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01f3
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001c:
            java.lang.Object r2 = r4.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r14 = 1
            if (r0 == 0) goto L_0x00fc
            if (r0 != r14) goto L_0x02a0
            java.lang.Object r13 = r4.A02
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r4.A01
            com.facebookpay.addresstypeahead.controller.AddressTypeaheadController r12 = (com.facebookpay.addresstypeahead.controller.AddressTypeaheadController) r12
            X.0eS.A00(r2)
        L_0x0032:
            X.SUj r2 = (X.SUj) r2
            boolean r0 = X.SUj.A0V(r2)
            if (r0 == 0) goto L_0x02a5
            java.lang.Object r11 = r2.A01
            X.3lr r11 = (X.C250663lr) r11
            if (r11 == 0) goto L_0x026a
            java.lang.Class<X.QTe> r3 = X.C7689QTe.class
            java.lang.String r2 = "suggestions"
            r1 = -1381290268(0xffffffffadab2ee4, float:-1.9461273E-11)
            com.google.common.collect.ImmutableList r0 = r11.A06(r3, r2, r1)
            if (r0 == 0) goto L_0x026a
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r14) goto L_0x026a
            X.2Fj r0 = r12.A0C
            r25 = r0
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            com.google.common.collect.ImmutableList r0 = r11.A06(r3, r2, r1)
            java.util.ArrayList r18 = X.DbV.A15(r0)
            java.util.Iterator r17 = r0.iterator()
            r23 = 0
        L_0x006a:
            boolean r0 = r17.hasNext()
            r3 = 0
            if (r0 == 0) goto L_0x01fa
            java.lang.Object r9 = r17.next()
            int r16 = r23 + 1
            if (r23 >= 0) goto L_0x0081
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0081:
            X.3lr r9 = (X.C250663lr) r9
            java.lang.Class<X.QTc> r2 = X.C7687QTc.class
            java.lang.String r1 = "main_text"
            r0 = 974486285(0x3a157b0d, float:5.702235E-4)
            X.3lr r0 = r9.getOptionalTreeField(r14, r1, r2, r0)
            if (r0 == 0) goto L_0x00f5
            java.lang.Class<X.QVr> r15 = X.C7754QVr.class
            r8 = 0
            r7 = 41959267(0x2803f63, float:1.8844292E-37)
            X.3lr r6 = r0.reinterpretRequired(r8, r15, r7)
            if (r6 == 0) goto L_0x00f5
            java.lang.String r5 = "value"
            java.lang.String r4 = r6.getOptionalStringField(r8, r5)
            if (r4 == 0) goto L_0x00f5
            java.lang.Class<X.QTd> r2 = X.C7688QTd.class
            java.lang.String r1 = "secondary_text"
            r0 = -236980279(0xfffffffff1dff7c9, float:-2.2180708E30)
            X.3lr r0 = r9.A04(r2, r1, r0)
            if (r0 == 0) goto L_0x00f9
            X.3lr r7 = r0.reinterpretRequired(r8, r15, r7)
            if (r7 == 0) goto L_0x00fa
            java.lang.String r5 = r7.getOptionalStringField(r8, r5)
        L_0x00be:
            java.lang.Class<X.QVq> r2 = X.C7753QVq.class
            java.lang.String r1 = "matched_substring"
            r0 = 2056905337(0x7a99e279, float:3.995074E35)
            com.google.common.collect.ImmutableList r6 = X.C41845B3m.A0X(r6, r2, r1, r14, r0)
            java.util.ArrayList r6 = A01(r6)
            if (r7 == 0) goto L_0x00da
            com.google.common.collect.ImmutableList r0 = r7.getRequiredCompactedTreeListField(r14, r1, r2, r0)
            if (r0 == 0) goto L_0x00da
            java.util.ArrayList r3 = A01(r0)
        L_0x00da:
            X.QgF r1 = new X.QgF
            r1.<init>(r4, r5, r6, r3)
            X.TTU r0 = new X.TTU
            r19 = r0
            r20 = r12
            r21 = r9
            r22 = r13
            r24 = r8
            r19.<init>(r20, r21, r22, r23, r24)
            r1.A00 = r0
            r0 = r18
            r0.add(r1)
        L_0x00f5:
            r23 = r16
            goto L_0x006a
        L_0x00f9:
            r7 = r3
        L_0x00fa:
            r5 = r3
            goto L_0x00be
        L_0x00fc:
            X.0eS.A00(r2)
            boolean r0 = X.00l.A0W(r13)
            if (r0 == 0) goto L_0x010e
            X.2Fj r1 = r12.A0C
            X.0sn r0 = X.0sn.A00
            r1.A0A(r0)
            goto L_0x02ce
        L_0x010e:
            X.Sto r0 = X.C51965G9l.A0g()
            com.facebookpay.logging.LoggingContext r3 = r12.A07
            r6 = 0
            java.lang.String r2 = "address_typeahead"
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_load_ecpaddresstypeahead_init"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 49
            X.1Ln r1 = X.C51965G9l.A0U(r1, r0)
            r0 = 20
            X.TY3.A00(r1, r3, r6, r2, r0)
            com.facebookpay.addresstypeahead.repositoryimpl.AddressTypeaheadRepositoryImpl r6 = r12.A06
            java.lang.String r11 = r12.A00
            if (r11 != 0) goto L_0x0136
            java.lang.String r11 = X.AnonymousClass7TF.A0c()
            r12.A00 = r11
        L_0x0136:
            X.DbS.A1Y(r11)
            java.lang.String r10 = r3.A02
            long r0 = r3.A00
            java.lang.String r3 = java.lang.String.valueOf(r0)
            r0 = 3
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r0)
            r1 = r24
            X.AnonymousClass7TF.A1B(r13, r14, r1)
            X.0qQ.A0B(r11, r0)
            r4.A01 = r12
            r4.A02 = r13
            r4.A00 = r14
            r2 = 28
            boolean r0 = X.MEC.A03(r2, r4)
            if (r0 == 0) goto L_0x0164
            java.lang.String r0 = "i2"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0164:
            X.MEC r4 = X.MEC.A00(r6, r4, r2)
            java.lang.Object r2 = r4.A01
            int r0 = r4.A00
            if (r0 == 0) goto L_0x0181
            if (r0 != r14) goto L_0x02d1
            X.0eS.A00(r2)
        L_0x0173:
            X.S21 r2 = (X.S21) r2
            X.SUj r1 = r2.A00()
            X.ScD r0 = X.C11552ScD.A00
            X.SUj r2 = X.SUj.A03(r0, r1)
            goto L_0x0032
        L_0x0181:
            X.0eS.A00(r2)
            X.SDu r7 = r6.A01
            r4.A00 = r14
            X.Sn6 r8 = X.C62999Kpp.A00()
            X.2IS r6 = r8.A00
            java.lang.String r0 = "query_input"
            r6.A04(r0, r13)
            r2 = 1
            r8.A05 = r14
            java.lang.String r0 = "country"
            r6.A04(r0, r1)
            r8.A03 = r14
            X.2IS r1 = r8.A01
            java.lang.String r0 = X.Py0.A00()
            r1.A04(r0, r11)
            r8.A06 = r14
            java.lang.String r0 = "upl_session_id"
            r1.A04(r0, r10)
            r8.A07 = r14
            java.lang.String r0 = "payment_product_id"
            r1.A04(r0, r3)
            if (r3 != 0) goto L_0x01ba
            r2 = 0
        L_0x01ba:
            r8.A04 = r2
            X.0eM r0 = X.O55.A01
            java.lang.Object r0 = r0.getValue()
            double r2 = X.JTO.A00(r0)
            java.lang.Double r1 = new java.lang.Double
            r1.<init>(r2)
            java.lang.String r0 = "attribution_icon_scale"
            r6.A03(r0, r1)
            r8.A02 = r14
            java.lang.String r0 = "max_results"
            r6.A03(r0, r9)
            X.1Ef r1 = r8.build()
            X.S1I r0 = X.SDu.A01
            X.0qQ.A0A(r1)
            r0.A00(r1)
            X.0eM r0 = r7.A00
            java.lang.Object r0 = r0.getValue()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r0 = (com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor) r0
            java.lang.Object r2 = r0.A00(r1, r4)
            if (r2 != r5) goto L_0x0173
            return r5
        L_0x01f3:
            X.MDy r4 = new X.MDy
            r4.<init>(r12, r5, r3)
            goto L_0x001c
        L_0x01fa:
            r0 = r18
            r10.addAll(r0)
            java.lang.Class<X.QTa> r7 = X.C7685QTa.class
            java.lang.String r6 = "attribution"
            r0 = 1683022712(0x6450e378, float:1.5413254E22)
            X.3lr r4 = r11.getOptionalTreeField(r14, r6, r7, r0)
            if (r4 == 0) goto L_0x029e
            java.lang.Class<X.BVP> r2 = X.BVP.class
            java.lang.String r1 = "icon_light(scale:$attribution_icon_scale)"
            r0 = -1240306991(0xffffffffb6126ad1, float:-2.181787E-6)
            X.3lr r4 = r4.getOptionalTreeField(r14, r1, r2, r0)
            if (r4 == 0) goto L_0x029e
            java.lang.Class<X.BXo> r1 = X.C42271BXo.class
            r2 = 0
            r0 = 672632885(0x28179035, float:8.413454E-15)
            X.3lr r1 = r4.reinterpretRequired(r2, r1, r0)
            if (r1 == 0) goto L_0x029e
            java.lang.String r0 = "uri"
            java.lang.String r5 = r1.getOptionalStringField(r2, r0)
        L_0x022c:
            r0 = 1683022712(0x6450e378, float:1.5413254E22)
            X.3lr r6 = r11.getOptionalTreeField(r14, r6, r7, r0)
            if (r6 == 0) goto L_0x0255
            java.lang.Class<X.BVO> r2 = X.BVO.class
            r4 = 0
            java.lang.String r1 = "icon_dark(scale:$attribution_icon_scale)"
            r0 = -509519137(0xffffffffe1a15adf, float:-3.7205922E20)
            X.3lr r2 = r6.getOptionalTreeField(r4, r1, r2, r0)
            if (r2 == 0) goto L_0x0255
            java.lang.Class<X.BXo> r1 = X.C42271BXo.class
            r0 = 672632885(0x28179035, float:8.413454E-15)
            X.3lr r1 = r2.reinterpretRequired(r4, r1, r0)
            if (r1 == 0) goto L_0x0255
            java.lang.String r0 = "uri"
            java.lang.String r3 = r1.getOptionalStringField(r4, r0)
        L_0x0255:
            X.QgE r2 = new X.QgE
            r2.<init>(r5, r3)
            r1 = 3
            X.IwS r0 = new X.IwS
            r0.<init>(r10, r12, r13, r1)
            r2.A00 = r0
            r10.add(r2)
            r0 = r25
            r0.A0A(r10)
        L_0x026a:
            X.Sto r3 = X.C51965G9l.A0g()
            com.facebookpay.logging.LoggingContext r6 = r12.A07
            if (r11 == 0) goto L_0x029c
            java.lang.Class<X.QTe> r2 = X.C7689QTe.class
            java.lang.String r1 = "suggestions"
            r0 = -1381290268(0xffffffffadab2ee4, float:-1.9461273E-11)
            com.google.common.collect.ImmutableList r0 = r11.A06(r2, r1, r0)
            if (r0 == 0) goto L_0x029c
            int r8 = r0.size()
        L_0x0284:
            r5 = 0
            java.lang.String r7 = "address_typeahead"
            r9 = 0
            X.0Ae r1 = r3.A00
            java.lang.String r0 = "client_load_ecpaddresstypeahead_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 50
            X.1Ln r1 = X.C51965G9l.A0U(r1, r0)
            X.IxH r4 = new X.IxH
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x02cb
        L_0x029c:
            r8 = 0
            goto L_0x0284
        L_0x029e:
            r5 = r3
            goto L_0x022c
        L_0x02a0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02a5:
            X.Sto r1 = X.C51965G9l.A0g()
            com.facebookpay.logging.LoggingContext r6 = r12.A07
            java.lang.Throwable r0 = r2.A02
            java.util.LinkedHashMap r3 = X.AnonymousClass7TE.A1H()
            X.Pxj.A1Q(r0, r3)
            java.lang.String r2 = "address_typeahead"
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "client_load_ecpaddresstypeahead_fail"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 48
            X.1Ln r1 = X.C51965G9l.A0U(r1, r0)
            r0 = 19
            X.TY3 r4 = new X.TY3
            r4.<init>(r3, r6, r2, r0)
        L_0x02cb:
            X.C12411Sto.A03(r1, r6, r4)
        L_0x02ce:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x02d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.addresstypeahead.controller.AddressTypeaheadController.A00(com.facebookpay.addresstypeahead.controller.AddressTypeaheadController, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public AddressTypeaheadController(LoggingContext loggingContext, C62320sa r7, 0sP r8) {
        this.A07 = loggingContext;
        this.A09 = r8;
        this.A08 = r7;
        AnonymousClass2Fj A0K = JTO.A0K();
        this.A0C = A0K;
        this.A04 = A0K;
        AnonymousClass2Fj A0K2 = JTO.A0K();
        this.A05 = A0K2;
        this.A03 = A0K2;
        AnonymousClass19G r4 = new AnonymousClass19G((C262204Co) null);
        C262084Cb r1 = AnonymousClass2E0.A0B().A00.A00.AOJ(568, 3).get(C262104Cd.A00);
        0qQ.A0C(r1, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        AnonymousClass19S A022 = 19E.A02(r4.plus(r1));
        this.A0A = A022;
        this.A0B = 106.A01((Object) null);
        AnonymousClass7TE.A1Z(new C59676JTh((Object) this, (AnonymousClass4D7) null, 38), A022);
    }

    public static final ArrayList A01(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C250663lr A0V = C41845B3m.A0V(it);
            if (A0V.getCoercedIntField(0, "length") > 0) {
                A1C.add(new 2HY(A0V.getCoercedIntField(1, "offset"), (A0V.getCoercedIntField(1, "offset") + A0V.getCoercedIntField(0, "length")) - 1));
            }
        }
        return A1C;
    }
}
