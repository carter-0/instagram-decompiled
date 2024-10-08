package X;

import android.view.View;

public final class FOQ implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public FOQ(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A01 = obj6;
        this.A03 = obj4;
        this.A04 = obj2;
        this.A05 = obj;
        this.A06 = obj3;
        this.A02 = obj5;
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r21) {
        /*
            r20 = this;
            r2 = r20
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x007d;
                case 1: goto L_0x0190;
                case 2: goto L_0x0067;
                case 3: goto L_0x0020;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = -360723544(0xffffffffea7fcba8, float:-7.7309455E25)
            int r12 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A03
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r2.A05
            X.6iJ r0 = (X.C314466iJ) r0
            X.OPL.A01(r1, r0)
            r0 = -426011107(0xffffffffe69b961d, float:-3.6736795E23)
        L_0x001c:
            X.AnonymousClass0fD.A0C(r0, r12)
            return
        L_0x0020:
            r0 = 1762792338(0x69121392, float:1.1037224E25)
            int r12 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r2.A06
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            java.lang.Object r1 = r2.A03
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r5 = r2.A04
            X.2Er r5 = (X.2Er) r5
            java.lang.Object r0 = r2.A05
            X.6iJ r0 = (X.C314466iJ) r0
            java.lang.Object r4 = r2.A02
            X.0iw r4 = (X.AnonymousClass0iw) r4
            X.C48825Ekn.A00(r1, r0)
            X.4kA r0 = X.AnonymousClass4k9.A00(r6)
            X.0xa r0 = r0.A00
            X.0xY r3 = r0.AR4()
            r0 = 1495(0x5d7, float:2.095E-42)
            java.lang.String r2 = X.C273654mx.A00(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.E5c(r2, r0)
            r3.apply()
            java.lang.String r1 = r5.C6C()
            r0 = 3421(0xd5d, float:4.794E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.C48803EkR.A00(r4, r6, r0, r1)
            r0 = 1445783609(0x562ce839, float:4.7528347E13)
            goto L_0x001c
        L_0x0067:
            r0 = -1346983030(0xffffffffafb6ab8a, float:-3.3227493E-10)
            int r12 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A03
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r2.A05
            X.6iJ r0 = (X.C314466iJ) r0
            X.C48825Ekn.A00(r1, r0)
            r0 = 320491553(0x131a5021, float:1.947704E-27)
            goto L_0x001c
        L_0x007d:
            r0 = -742093421(0xffffffffd3c48d93, float:-1.68837762E12)
            int r12 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r11 = r2.A01
            X.4mT r11 = (X.C273374mT) r11
            android.content.Context r10 = r11.requireContext()
            r9 = 0
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r7 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            r5 = 1
            java.util.BitSet r4 = X.DbS.A0w(r5)
            java.lang.Object r0 = r2.A02
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r1 = X.AnonymousClass7TF.A0f(r0)
            java.lang.String r0 = "some_cip_string"
            r8.put(r0, r1)
            java.lang.Object r0 = r2.A06
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r1 = X.AnonymousClass7TF.A0f(r0)
            java.lang.String r0 = "some_required_string"
            boolean r3 = X.Dba.A1Z(r0, r1, r8, r4)
            java.lang.Object r0 = r2.A05
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r1 = X.AnonymousClass7TF.A0f(r0)
            java.lang.String r0 = "some_prop_string"
            r7.put(r0, r1)
            java.lang.Object r0 = r2.A04
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            java.lang.Long r1 = X.DbV.A0q(r0)
            java.lang.String r0 = "some_prop_long"
            r7.put(r0, r1)
            java.lang.Object r0 = r2.A03
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            int r1 = java.lang.Integer.parseInt(r0)
            r0 = 2
            java.lang.String r13 = "employer"
            java.lang.String r14 = "name"
            if (r1 == r0) goto L_0x013d
            r0 = 3
            if (r1 == r0) goto L_0x015b
            r0 = 4
            if (r1 == r0) goto L_0x0125
            java.lang.String r1 = "PRIMITIVE"
            java.lang.String r0 = "content_type"
            r8.put(r0, r1)
        L_0x00f7:
            com.instagram.common.session.UserSession r0 = r11.getSession()
            com.instagram.bloks.hosting.IgBloksScreenConfig r11 = X.DbS.A0N(r0)
            int r0 = r4.nextClearBit(r3)
            if (r0 < r5) goto L_0x01e0
            java.util.HashMap r2 = X.C359608dC.A01(r8)
            java.lang.String r0 = "com.bloks.www.bloks.demos.nativescreen"
            X.DiU r1 = new X.DiU
            r1.<init>(r2, r7, r0)
            r0 = -1
            X.C46649DiU.A0B(r1, r0)
            r1.A03 = r9
            r1.A02 = r9
            r1.A04 = r9
            r1.A0H(r6)
            r1.A0D(r10, r11)
            r0 = -133250081(0xfffffffff80ec3df, float:-1.1582483E34)
            goto L_0x001c
        L_0x0125:
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "Elon Musk"
            r2.put(r14, r0)
            java.lang.String r0 = "Tesla, Inc"
            r2.put(r13, r0)
            java.lang.String r1 = "MIXED"
            java.lang.String r0 = "content_type"
            r8.put(r0, r1)
            java.lang.String r0 = "mixed_prop_shape"
            goto L_0x018b
        L_0x013d:
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "Mark Zuckerberg"
            r2.put(r14, r0)
            java.lang.String r0 = "Facebook, Inc"
            r2.put(r13, r0)
            java.lang.String r1 = "SIMPLE_COMPLEX"
            java.lang.String r0 = "content_type"
            r8.put(r0, r1)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00f7
            java.lang.String r0 = "simple_prop_dict"
            goto L_0x018b
        L_0x015b:
            java.util.HashMap r15 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "Lebron James"
            r15.put(r14, r0)
            java.lang.String r2 = "Los Angeles Lakers"
            r15.put(r13, r2)
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "Kobe Bryant"
            r1.put(r14, r0)
            r1.put(r13, r2)
            java.util.ArrayList r2 = X.DbV.A14(r15)
            r2.add(r1)
            java.lang.String r1 = "NESTED_COMPLEX"
            java.lang.String r0 = "content_type"
            r8.put(r0, r1)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00f7
            java.lang.String r0 = "nested_prop_vec"
        L_0x018b:
            r7.put(r0, r2)
            goto L_0x00f7
        L_0x0190:
            java.lang.Object r1 = r2.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.String r6 = "edit_profile"
            java.lang.Object r5 = r2.A04
            java.lang.Object r4 = r2.A05
            java.lang.Object r3 = r2.A06
            java.lang.String r2 = "edit_page"
            java.lang.String r0 = "disconnect_button"
            X.C50143FRa.A03(r1, r6, r2, r0)
            r15 = 2
            X.EDW r14 = new X.EDW
            r17 = r5
            r18 = r1
            r19 = r3
            r16 = r4
            r14.<init>(r15, r16, r17, r18, r19)
            r9 = 0
            X.2IS r2 = X.C41845B3m.A04()
            X.2IS r0 = X.C41845B3m.A04()
            X.1vR r3 = X.C41845B3m.A05()
            java.util.Map r5 = r2.getParamsCopy()
            java.util.Map r6 = r0.getParamsCopy()
            java.lang.Class<X.Bqh> r7 = X.C43017Bqh.class
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.lang.String r4 = "IgFullyDisconnectFbPagesBizlinkMutation"
            r8 = 1
            r10 = 0
            r0 = 3296(0xce0, float:4.619E-42)
            java.lang.String r12 = X.AnonymousClass000.A00(r0)
            com.facebook.pando.PandoGraphQLRequest r2 = new com.facebook.pando.PandoGraphQLRequest
            r11 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.DbZ.A1M(r2, r14, r1)
            return
        L_0x01e0:
            java.lang.IllegalStateException r0 = X.DbU.A0i()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FOQ.onClick(android.view.View):void");
    }
}
