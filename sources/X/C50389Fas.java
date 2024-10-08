package X;

import android.text.TextUtils;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Fas  reason: case insensitive filesystem */
public final class C50389Fas implements G9b {
    public final /* synthetic */ EEP A00;

    public final void D8y(DirectShareTarget directShareTarget) {
    }

    public C50389Fas(EEP eep) {
        this.A00 = eep;
    }

    public final String BqO() {
        C49916FEq fEq = this.A00.A0B;
        if (fEq == null) {
            return "";
        }
        return fEq.A02.BqO();
    }

    public final boolean CbW(DirectShareTarget directShareTarget) {
        return this.A00.A0r.containsKey(directShareTarget.A09());
    }

    public final boolean Cdh(DirectShareTarget directShareTarget) {
        DirectShareTarget directShareTarget2 = this.A00.A0C;
        if (directShareTarget2 == null || !directShareTarget2.equals(directShareTarget)) {
            return false;
        }
        return true;
    }

    public final void Dbk(View view, DirectShareTarget directShareTarget, int i, int i2, int i3) {
        String str;
        View view2 = view;
        if (view != null) {
            EEP eep = this.A00;
            C67089Mi7 mi7 = eep.A0o;
            if (mi7.A03 != null) {
                DirectShareTarget directShareTarget2 = directShareTarget;
                C68273N8k n8k = new C68273N8k(directShareTarget2, directShareTarget2.A04(eep.A0g.A06, false), eep.A0L, eep.A0I, EEP.A04(eep), i, (long) i2, (long) i3);
                if (eep.A0A == null) {
                    eep.A0A = new FZN(new PE2(this, 1));
                }
                EK7 ek7 = mi7.A02;
                if (ek7 != null) {
                    str = ek7.A01;
                } else {
                    str = "";
                }
                eep.A0h.A05(view2, DbU.A0a(eep.A0A, AnonymousClass30Y.A00(n8k, 0, n8k.BK4(str))));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0244, code lost:
        if (r5.A0r.isEmpty() != false) goto L_0x0246;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Dbl(com.instagram.model.direct.DirectShareTarget r40, int r41, int r42, int r43) {
        /*
            r39 = this;
            r0 = r39
            X.EEP r5 = r0.A00
            com.instagram.common.session.UserSession r7 = r5.A0g
            java.lang.String r12 = r7.A06
            r11 = 0
            r6 = r40
            java.lang.Integer r30 = r6.A04(r12, r11)
            boolean r0 = X.EEP.A0L(r5, r6)
            r15 = 0
            r10 = 1
            r3 = 4
            r2 = 0
            if (r0 == 0) goto L_0x0067
            boolean r0 = r6.A0J()
            r6 = r0 ^ 1
            X.G9Y r1 = r5.A0m
            android.content.Context r0 = r1.requireContext()
            X.8ab r4 = X.DbS.A0Y(r0)
            android.content.Context r0 = r1.requireContext()
            android.content.res.Resources r3 = r0.getResources()
            if (r6 == 0) goto L_0x005c
            r1 = 2131958572(0x7f131b2c, float:1.955376E38)
        L_0x0036:
            java.lang.String r0 = r3.getString(r1)
            r4.A05 = r0
            if (r6 == 0) goto L_0x0058
            boolean r1 = r5.A0U
            r0 = 2131958573(0x7f131b2d, float:1.9553762E38)
            if (r1 == 0) goto L_0x0048
            r0 = 2131958571(0x7f131b2b, float:1.9553758E38)
        L_0x0048:
            r4.A08(r0)
            r4.A06()
            android.app.Dialog r0 = r4.A02()
            r5.A03 = r0
            X.AnonymousClass0fN.A00(r0)
        L_0x0057:
            return r2
        L_0x0058:
            r0 = 2131958709(0x7f131bb5, float:1.9554038E38)
            goto L_0x0048
        L_0x005c:
            boolean r0 = r5.A0U
            r1 = 2131958706(0x7f131bb2, float:1.9554032E38)
            if (r0 == 0) goto L_0x0036
            r1 = 2131958710(0x7f131bb6, float:1.955404E38)
            goto L_0x0036
        L_0x0067:
            boolean r0 = X.EEP.A0K(r5, r6)
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r5.A0X
            if (r0 != 0) goto L_0x00c8
            X.G9Y r9 = r5.A0m
            X.EZi r5 = r5.A06
            r3 = r5
            X.0qQ.A0B(r9, r10)
            X.0wc r1 = X.AnonymousClass0kN.A01(r9, r7)
            java.lang.String r0 = "direct_group_creation_unreachable_recipient_dialog_shown"
            X.0Aj r0 = X.AnonymousClass7TE.A0e(r1, r0)
            if (r5 != 0) goto L_0x0087
            X.EZi r3 = X.C48140EZi.UNKNOWN
        L_0x0087:
            java.lang.String r8 = "entry_point"
            r0.A8M(r3, r8)
            r0.Cgf()
            java.lang.String r4 = r6.A0J
            if (r4 != 0) goto L_0x0095
            java.lang.String r4 = ""
        L_0x0095:
            android.content.Context r0 = r9.requireContext()
            X.8ab r3 = X.DbS.A0Y(r0)
            r0 = 2131959422(0x7f131e7e, float:1.9555484E38)
            r3.A09(r0)
            android.content.Context r1 = r9.requireContext()
            r0 = 2131959423(0x7f131e7f, float:1.9555486E38)
            X.DbY.A0w(r1, r3, r4, r0)
            r0 = 2131956164(0x7f1311c4, float:1.9548876E38)
            X.Dba.A0t(r15, r3, r0)
            X.0wc r1 = X.AnonymousClass0kN.A01(r9, r7)
            java.lang.String r0 = "direct_group_creation_unreachable_recipient_row_tap"
            X.0Aj r0 = X.AnonymousClass7TE.A0e(r1, r0)
            if (r5 != 0) goto L_0x00c1
            X.EZi r5 = X.C48140EZi.UNKNOWN
        L_0x00c1:
            r0.A8M(r5, r8)
            r0.Cgf()
            return r2
        L_0x00c8:
            X.3t2 r0 = X.DbS.A0c(r6)
            boolean r0 = r0 instanceof X.AnonymousClass9HR
            r34 = r41
            r8 = r42
            r13 = r43
            if (r0 == 0) goto L_0x00f6
            boolean r0 = r6.A0S()
            if (r0 == 0) goto L_0x00f6
            boolean r0 = r6.A0T
            if (r0 != 0) goto L_0x00f6
            r14 = r5
            r15 = r6
            r16 = r30
            r17 = r34
            r18 = r8
            r19 = r13
            r20 = r10
            X.EEP.A09(r14, r15, r16, r17, r18, r19, r20)
            X.G9Y r0 = r5.A0m
            r0.E1C(r6)
        L_0x00f4:
            r2 = 1
            return r2
        L_0x00f6:
            int r1 = r30.intValue()
            if (r1 == r3) goto L_0x0246
            r0 = 5
            if (r1 == r0) goto L_0x0246
            r0 = 7
            if (r1 == r0) goto L_0x0207
            r0 = 6
            if (r1 == r0) goto L_0x0207
            r0 = 19
            if (r1 == r0) goto L_0x023e
            java.util.Map r3 = r5.A0r
            int r0 = r3.size()
            int r2 = r0 + 1
            X.G9Y r0 = r5.A0m
            android.content.Context r9 = r0.requireContext()
            boolean r4 = r6.A0P()
            java.lang.String r1 = X.DbT.A0y(r6)
            boolean r1 = X.C48889Elp.A00(r9, r7, r1, r4)
            if (r1 != 0) goto L_0x02a9
            java.lang.String r1 = r6.A09()
            boolean r1 = r3.containsKey(r1)
            if (r1 == 0) goto L_0x018b
            X.EEP.A0A(r5, r6, r11)
            r5.A0O()
            X.EEP.A0F(r5, r11)
            java.lang.String r17 = X.C69838Nt2.A00(r34)
            java.lang.String r18 = r6.A08()
            long r3 = (long) r8
            long r1 = (long) r13
            boolean r9 = r5.A0V
            if (r9 == 0) goto L_0x0188
            java.lang.String r25 = "UNKNOWN"
        L_0x0148:
            java.lang.String r19 = "recipient_list"
            r21 = r15
            r22 = r15
            r23 = r15
            r24 = r15
            r26 = r3
            r28 = r1
            r16 = r6
            r20 = r15
            r14 = r0
            r15 = r7
            X.C3265677h.A0H(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28)
            r0 = r34
            X.EEP.A07(r5, r8, r0)
            java.util.List r9 = r5.A0N()
            java.lang.String r8 = r5.A0L
            java.lang.String r0 = r5.A0I
            java.util.ArrayList r33 = X.EEP.A04(r5)
            X.N8k r7 = new X.N8k
            r29 = r6
            r31 = r8
            r32 = r0
            r35 = r3
            r37 = r1
            r28 = r7
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r37)
            X.Mi7 r0 = r5.A0o
            r0.A09(r7, r9)
            goto L_0x00f4
        L_0x0188:
            java.lang.String r25 = "DIRECT"
            goto L_0x0148
        L_0x018b:
            X.OZd r4 = r5.A0n
            boolean r3 = r5.A0U
            r1 = 1
            if (r3 != 0) goto L_0x0193
            r1 = 0
        L_0x0193:
            X.MmR r3 = X.C67350MmR.DEFAULT
            int r1 = r4.A02(r3, r11, r1)
            if (r2 >= r1) goto L_0x025c
            X.EEP.A0A(r5, r6, r10)
            r5.A0O()
            java.lang.String r9 = r5.A0H
            if (r9 == 0) goto L_0x01e9
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r10)
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r7)
            java.lang.String r0 = "direct_reshare_select_recipient"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x01e9
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323921402146420(0x810c6a00062e74, double:3.034732387184306E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0202
            r14 = r15
        L_0x01c7:
            r0 = 36323921401753199(0x810c6a00002e6f, double:3.0347323869356314E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x01d3
            r9 = r15
        L_0x01d3:
            java.lang.String r0 = "sender_id"
            X.DbU.A1N(r3, r0, r12, r9)
            java.lang.String r0 = "is_recipient_group"
            r3.A7p(r0, r4)
            if (r14 != 0) goto L_0x01e1
            java.lang.String r14 = ""
        L_0x01e1:
            java.lang.String r0 = "nav_chain"
            r3.AAJ(r0, r14)
            X.DbX.A1L(r3)
        L_0x01e9:
            r14 = r5
            r15 = r6
            r16 = r30
            r17 = r34
            r18 = r8
            r19 = r13
            r20 = r11
            X.EEP.A09(r14, r15, r16, r17, r18, r19, r20)
            X.EEP.A0F(r5, r10)
            r0 = r34
            X.EEP.A07(r5, r8, r0)
            goto L_0x00f4
        L_0x0202:
            java.lang.String r14 = X.DbS.A0k()
            goto L_0x01c7
        L_0x0207:
            X.G9Y r0 = r5.A0m
            r0.E1M(r6)
            X.FEq r0 = r5.A0B
            if (r0 == 0) goto L_0x00f4
            long r0 = (long) r8
            long r2 = (long) r13
            java.lang.String r8 = r5.A0L
            java.lang.String r7 = r5.A0I
            java.util.ArrayList r33 = X.EEP.A04(r5)
            X.N8k r4 = new X.N8k
            r29 = r6
            r31 = r8
            r32 = r7
            r35 = r0
            r37 = r2
            r28 = r4
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r37)
            X.Mi7 r2 = r5.A0o
            X.FEq r0 = r5.A0B
            java.util.List r0 = r0.A06
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            X.Mk6 r0 = r2.A03
            if (r0 == 0) goto L_0x00f4
            r0.A0A(r4, r1)
            goto L_0x00f4
        L_0x023e:
            java.util.Map r0 = r5.A0r
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0057
        L_0x0246:
            r14 = r5
            r15 = r6
            r16 = r30
            r17 = r34
            r18 = r8
            r19 = r13
            r20 = r10
            X.EEP.A09(r14, r15, r16, r17, r18, r19, r20)
            X.G9Y r0 = r5.A0m
            r0.E1L(r6)
            goto L_0x00f4
        L_0x025c:
            boolean r2 = r5.A0U
            r1 = 1
            if (r2 != 0) goto L_0x0262
            r1 = 0
        L_0x0262:
            int r8 = r4.A02(r3, r11, r1)
            android.content.Context r1 = r0.requireContext()
            X.8ab r6 = X.DbS.A0Y(r1)
            X.0Tu r4 = X.0Tu.A05
            boolean r2 = X.182.A05(r4, r7)
            r1 = 2131959723(0x7f131fab, float:1.9556094E38)
            if (r2 == 0) goto L_0x027c
            r1 = 2131959722(0x7f131faa, float:1.9556092E38)
        L_0x027c:
            r6.A09(r1)
            android.content.Context r1 = r0.requireContext()
            android.content.res.Resources r3 = r1.getResources()
            boolean r2 = X.182.A05(r4, r7)
            r1 = 2131820662(0x7f110076, float:1.9274045E38)
            if (r2 == 0) goto L_0x0293
            r1 = 2131820661(0x7f110075, float:1.9274043E38)
        L_0x0293:
            java.lang.String r1 = X.DbY.A0d(r3, r8, r1)
            r6.A0q(r1)
            r6.A06()
            android.app.Dialog r1 = r6.A02()
            r5.A01 = r1
            X.AnonymousClass0fN.A00(r1)
            X.C3265677h.A0M(r0, r7)
        L_0x02a9:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50389Fas.Dbl(com.instagram.model.direct.DirectShareTarget, int, int, int):boolean");
    }

    public final boolean Dbo(DirectShareTarget directShareTarget) {
        G9Y g9y = this.A00.A0m;
        String str = directShareTarget.A0J;
        if (str == null) {
            str = "";
        }
        g9y.E0p(str, directShareTarget.A0L);
        return true;
    }

    public final void Dbs(View view) {
        if (view != null) {
            this.A00.A0h.A04(view);
        }
    }

    public final void Dbt() {
        this.A00.A0m.Dbt();
    }

    public final void Dhj() {
        EEP eep = this.A00;
        C49916FEq fEq = eep.A0B;
        if (fEq != null) {
            String A01 = 0mp.A01(fEq.A02.BqO());
            A01.getClass();
            String lowerCase = A01.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                C337257fy A02 = EEP.A02(eep);
                if (A02 != null) {
                    A02.EhX(lowerCase);
                    EEP.A0B(eep, AnonymousClass05K.A00);
                    return;
                }
                Object obj = null;
                obj.getClass();
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final void Dwl() {
        EEP eep = this.A00;
        C49916FEq fEq = eep.A0B;
        if (fEq != null) {
            FRO fro = eep.A08;
            F0D f0d = fro.A01;
            boolean A1Q = AnonymousClass7TF.A1Q(fro.A04.BqO().length());
            fro.A02.CKe();
            List list = f0d.A04;
            int size = list.size();
            List list2 = f0d.A01;
            int A01 = DbT.A01(list2, size);
            if (!A1Q) {
                A01 += DbT.A01(f0d.A05, DbT.A01(f0d.A00, f0d.A03.size()));
            }
            ArrayList A0v = DbS.A0v(A01);
            A0v.addAll(list2);
            A0v.addAll(list);
            if (!A1Q) {
                A0v.addAll(f0d.A00);
                A0v.addAll(f0d.A03);
                A0v.addAll(f0d.A05);
            }
            if (!A0v.isEmpty()) {
                DirectShareTarget directShareTarget = (DirectShareTarget) AnonymousClass7TE.A12(A0v);
                Map map = eep.A0r;
                if (!map.containsKey(directShareTarget.A09()) && (directShareTarget.A0S() || (map.isEmpty() && !eep.A0U))) {
                    fEq.A02.FM8(directShareTarget);
                    return;
                }
            }
            fEq.A02.EIM();
        }
    }

    public final boolean Es2(DirectShareTarget directShareTarget) {
        EEP eep = this.A00;
        if (eep.A0r.isEmpty()) {
            return false;
        }
        if (directShareTarget.A0F()) {
            return true;
        }
        if (EEP.A0K(eep, directShareTarget)) {
            UserSession userSession = eep.A0g;
            G9Y g9y = eep.A0m;
            C48140EZi eZi = eep.A06;
            AnonymousClass7TG.A1N(userSession, g9y);
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(g9y, userSession), "direct_group_creation_unreachable_recipient_row_disabled");
            if (eZi == null) {
                eZi = C48140EZi.UNKNOWN;
            }
            DbS.A1F(eZi, A0e);
            A0e.Cgf();
        }
        return EEP.A0K(eep, directShareTarget);
    }
}
