package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class FRO implements CallerContextable {
    public static final String __redex_internal_original_name = "InteropRecipientAdapterDataController";
    public Integer A00;
    public final F0D A01 = new F0D();
    public final C74498Pvs A02;
    public final C46716Djn A03;
    public final G9b A04;
    public final UserSession A05;
    public final FEZ A06;
    public final Set A07 = AnonymousClass7TE.A1F();
    public final boolean A08;
    public final boolean A09;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(com.instagram.model.direct.DirectShareTarget r6, boolean r7) {
        /*
            r5 = this;
            r4 = 0
            X.0qQ.A0B(r6, r4)
            com.instagram.common.session.UserSession r0 = r5.A05
            java.lang.String r0 = r0.A06
            java.lang.Integer r2 = r6.A04(r0, r4)
            X.0qQ.A07(r2)
            boolean r0 = r6.A0O()
            if (r0 != 0) goto L_0x0026
            java.util.List r0 = X.DbW.A0m(r6)
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r0
            r1 = 1
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0.A0X
            if (r0 != r1) goto L_0x0030
        L_0x0026:
            if (r7 == 0) goto L_0x0030
        L_0x0028:
            X.F0D r0 = r5.A01
            java.util.List r0 = r0.A04
        L_0x002c:
            r0.add(r6)
        L_0x002f:
            return
        L_0x0030:
            boolean r0 = r6.A0F()
            if (r0 == 0) goto L_0x003d
            boolean r0 = r6.A0U()
            if (r0 == 0) goto L_0x003d
            goto L_0x0028
        L_0x003d:
            if (r7 != 0) goto L_0x0048
            boolean r0 = r6.A0S
            if (r0 == 0) goto L_0x0048
            X.F0D r0 = r5.A01
            java.util.List r0 = r0.A05
            goto L_0x002c
        L_0x0048:
            int r0 = r2.intValue()
            switch(r0) {
                case 0: goto L_0x0028;
                case 1: goto L_0x00a0;
                case 6: goto L_0x005a;
                case 17: goto L_0x0028;
                case 18: goto L_0x0055;
                case 19: goto L_0x0050;
                default: goto L_0x004f;
            }
        L_0x004f:
            return
        L_0x0050:
            X.F0D r0 = r5.A01
            java.util.List r0 = r0.A00
            goto L_0x002c
        L_0x0055:
            X.F0D r0 = r5.A01
            java.util.List r0 = r0.A01
            goto L_0x002c
        L_0x005a:
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x0096
            boolean r0 = r6.A0S()
            if (r0 != 0) goto L_0x0096
            X.Pvs r1 = r5.A02
            boolean r0 = r1.CKe()
            if (r0 == 0) goto L_0x0096
            java.util.List r0 = r1.Brr()
            java.util.Iterator r3 = r0.iterator()
        L_0x0074:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x009b
            com.instagram.model.direct.DirectShareTarget r2 = X.DbT.A0f(r3)
            boolean r0 = r2.A0M()
            if (r0 != 0) goto L_0x0096
            java.util.List r1 = X.DbT.A14(r6)
            java.util.List r0 = X.DbT.A14(r2)
            java.lang.Object r0 = r0.get(r4)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0074
        L_0x0096:
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x002f
            goto L_0x0028
        L_0x009b:
            X.F0D r0 = r5.A01
            java.util.List r0 = r0.A02
            goto L_0x002c
        L_0x00a0:
            X.F0D r0 = r5.A01
            java.util.List r0 = r0.A03
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FRO.A03(com.instagram.model.direct.DirectShareTarget, boolean):void");
    }

    public final void A04(String str, List list) {
        0qQ.A0B(str, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget A0f = DbT.A0f(it);
            Set set = this.A07;
            String A092 = A0f.A09();
            0qQ.A07(A092);
            if (set.add(A092)) {
                A03(A0f, AnonymousClass7TF.A1Q(str.length()));
            }
        }
        A02();
        this.A04.Dwl();
    }

    public FRO(Context context, AnonymousClass2t9 r17, UserSession userSession, C74498Pvs pvs, G9b g9b, C251033mS r21, AnonymousClass7g1 r22, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        UserSession userSession2 = userSession;
        String str2 = str;
        AnonymousClass7TG.A1Q(userSession2, str2);
        AnonymousClass7g1 r3 = r22;
        0qQ.A0B(r3, 10);
        AnonymousClass2t9 r6 = r17;
        G9b g9b2 = g9b;
        DbW.A1P(r6, 11, g9b2);
        C74498Pvs pvs2 = pvs;
        0qQ.A0B(pvs2, 13);
        this.A05 = userSession2;
        this.A08 = z2;
        boolean z7 = z3;
        this.A09 = z7;
        this.A04 = g9b2;
        this.A02 = pvs2;
        this.A06 = new FEZ(context, r6, userSession2, pvs2, r21, z, z7, z4, z5, z6);
        this.A03 = new C46716Djn(new C49464Ew5(this, str2), r3);
        this.A00 = AnonymousClass05K.A00;
    }

    public final ArrayList A00() {
        F0D f0d = this.A01;
        UserSession userSession = this.A05;
        boolean A1Q = AnonymousClass7TF.A1Q(this.A04.BqO().length());
        this.A02.CKe();
        List list = f0d.A04;
        int size = list.size();
        if (!A1Q) {
            size += DbT.A01(f0d.A00, f0d.A03.size());
        }
        ArrayList A0v = DbS.A0v(size);
        A0v.addAll(FFJ.A00(userSession, list));
        if (!A1Q) {
            A0v.addAll(FFJ.A00(userSession, f0d.A00));
            A0v.addAll(FFJ.A00(userSession, f0d.A03));
        }
        return A0v;
    }

    public final void A01() {
        F0D f0d = this.A01;
        f0d.A02.clear();
        f0d.A04.clear();
        f0d.A03.clear();
        f0d.A01.clear();
        f0d.A00.clear();
        f0d.A05.clear();
        this.A07.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0160, code lost:
        if (X.182.A06(X.0Tu.A05, r12, 36326515562329906L) == false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0173, code lost:
        if (X.AnonymousClass7TE.A1b(r9) == false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0185, code lost:
        if (X.AnonymousClass7TE.A1b(r3) == false) goto L_0x0187;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r25 = this;
            r0 = r25
            X.FEZ r6 = r0.A06
            java.lang.Integer r11 = r0.A00
            X.F0D r1 = r0.A01
            X.G9b r0 = r0.A04
            java.lang.String r0 = r0.BqO()
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r5 = 0
            boolean r4 = X.AnonymousClass7TF.A1U(r5, r11, r1)
            com.instagram.common.recyclerview.ViewModelListUpdate r7 = X.DbS.A0R()
            if (r0 == 0) goto L_0x013c
            java.util.List r10 = r1.A02
            java.util.List r8 = r1.A04
            java.util.List r12 = r1.A01
            X.0qQ.A0B(r10, r5)
            X.AnonymousClass7TF.A1B(r8, r4, r12)
            X.Pvs r0 = r6.A04
            boolean r0 = r0.CQi()
            r9 = r0 ^ 1
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r3 = 0
            boolean r0 = X.AnonymousClass7TE.A1b(r12)
            if (r0 == 0) goto L_0x0051
            java.lang.Integer r2 = X.AnonymousClass05K.A0J
            r0 = 33
            java.util.ArrayList r0 = X.FEZ.A00(r6, r2, r12, r0, r5)
            r1.addAll(r0)
            int r0 = r0.size()
            int r3 = r0 + -1
        L_0x0051:
            if (r9 == 0) goto L_0x0076
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0076
            java.lang.Integer r9 = X.AnonymousClass05K.A0A
            int r2 = r10.size()
            int r0 = r6.A00
            if (r2 <= r0) goto L_0x0067
            java.util.List r10 = r10.subList(r5, r0)
        L_0x0067:
            r0 = 27
            java.util.ArrayList r0 = X.FEZ.A00(r6, r9, r10, r0, r3)
            r1.addAll(r0)
            int r0 = r0.size()
            int r0 = r0 - r4
            int r3 = r3 + r0
        L_0x0076:
            boolean r0 = X.AnonymousClass7TE.A1b(r8)
            if (r0 == 0) goto L_0x009b
            java.lang.Integer r2 = X.AnonymousClass05K.A0B
            r0 = 6
            java.util.ArrayList r3 = X.FEZ.A00(r6, r2, r8, r0, r3)
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x0098
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r0 = 2131971393(0x7f134d41, float:1.9579764E38)
            X.GKO r2 = X.DbS.A0Q(r2, r0)
            X.EGf r0 = new X.EGf
            r0.<init>(r2)
            r3.add(r4, r0)
        L_0x0098:
            r1.addAll(r3)
        L_0x009b:
            r7.A01(r1)
            int r1 = r11.intValue()
            if (r1 == r5) goto L_0x0129
            r0 = 5
            if (r1 == r0) goto L_0x00f8
            r0 = 2
            if (r1 == r0) goto L_0x00cf
            r0 = 3
            if (r1 == r0) goto L_0x010c
            r0 = 6
            if (r1 != r0) goto L_0x00c9
            android.content.Context r1 = r6.A01
            r0 = 2131968394(0x7f13418a, float:1.9573681E38)
            java.lang.String r2 = r1.getString(r0)
            r0 = 2131968393(0x7f134189, float:1.957368E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 0
        L_0x00c1:
            X.NPC r3 = new X.NPC
            r3.<init>(r0, r2, r1, r5)
        L_0x00c6:
            r7.A00(r3)
        L_0x00c9:
            X.2t9 r0 = r6.A02
            r0.A05(r7)
            return
        L_0x00cf:
            boolean r0 = r6.A0A
            android.content.Context r3 = r6.A01
            if (r0 == 0) goto L_0x00eb
            r0 = 2131968420(0x7f1341a4, float:1.9573734E38)
            java.lang.String r2 = r3.getString(r0)
            r0 = 2131968422(0x7f1341a6, float:1.9573738E38)
            java.lang.String r1 = r3.getString(r0)
            r0 = 2131237638(0x7f081b06, float:1.8091532E38)
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            goto L_0x00c1
        L_0x00eb:
            r0 = 2131968382(0x7f13417e, float:1.9573657E38)
            java.lang.String r0 = r3.getString(r0)
            X.EGY r3 = new X.EGY
            r3.<init>(r0)
            goto L_0x00c6
        L_0x00f8:
            android.content.Context r3 = r6.A01
            r0 = 2131974095(0x7f1357cf, float:1.9585244E38)
            java.lang.String r2 = r3.getString(r0)
            r0 = 2131974096(0x7f1357d0, float:1.9585246E38)
            java.lang.String r1 = r3.getString(r0)
            r0 = 2131237636(0x7f081b04, float:1.8091528E38)
            goto L_0x011f
        L_0x010c:
            android.content.Context r3 = r6.A01
            r0 = 2131968398(0x7f13418e, float:1.957369E38)
            java.lang.String r2 = r3.getString(r0)
            r0 = 2131968400(0x7f134190, float:1.9573694E38)
            java.lang.String r1 = r3.getString(r0)
            r0 = 2131237637(0x7f081b05, float:1.809153E38)
        L_0x011f:
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            X.NPC r3 = new X.NPC
            r3.<init>(r0, r2, r1, r4)
            goto L_0x00c6
        L_0x0129:
            android.content.Context r2 = r6.A01
            r0 = 2131972868(0x7f135304, float:1.9582756E38)
            java.lang.String r1 = r2.getString(r0)
            int r0 = X.DbU.A01(r2)
            X.EGc r3 = new X.EGc
            r3.<init>(r1, r0, r4)
            goto L_0x00c6
        L_0x013c:
            java.util.List r10 = r1.A04
            java.util.List r8 = r1.A03
            java.util.List r9 = r1.A00
            java.util.List r3 = r1.A05
            com.instagram.common.session.UserSession r12 = r6.A03
            boolean r14 = X.AnonymousClass9B8.A0B(r12)
            boolean r1 = r6.A08
            r0 = 0
            if (r1 != 0) goto L_0x0162
            boolean r1 = r6.A09
            if (r1 != 0) goto L_0x0162
            X.0Tu r13 = X.0Tu.A05
            r1 = 36326515562329906(0x810ec600053732, double:3.036372944530187E-306)
            boolean r1 = X.182.A06(r13, r12, r1)
            r16 = 1
            if (r1 != 0) goto L_0x0164
        L_0x0162:
            r16 = 0
        L_0x0164:
            boolean r2 = X.AnonymousClass7TE.A1b(r10)
            boolean r15 = X.AnonymousClass7TE.A1b(r8)
            if (r14 == 0) goto L_0x0175
            boolean r1 = X.AnonymousClass7TE.A1b(r9)
            r14 = 1
            if (r1 != 0) goto L_0x0176
        L_0x0175:
            r14 = 0
        L_0x0176:
            if (r16 == 0) goto L_0x0187
            android.content.Context r1 = r6.A01
            boolean r1 = X.C267044ar.A01(r1, r12)
            if (r1 == 0) goto L_0x0187
            boolean r1 = X.AnonymousClass7TE.A1b(r3)
            r13 = 1
            if (r1 != 0) goto L_0x0188
        L_0x0187:
            r13 = 0
        L_0x0188:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            if (r2 == 0) goto L_0x019d
            java.lang.Integer r2 = X.AnonymousClass05K.A0B
            r0 = 6
            java.util.ArrayList r0 = X.FEZ.A00(r6, r2, r10, r0, r5)
            r1.addAll(r0)
            int r0 = r0.size()
            int r0 = r0 - r4
        L_0x019d:
            if (r16 == 0) goto L_0x01cf
            android.content.Context r10 = r6.A01
            boolean r2 = X.C267044ar.A01(r10, r12)
            if (r2 != 0) goto L_0x01cf
            r19 = 2131238154(0x7f081d0a, float:1.8092579E38)
            r2 = 2131964483(0x7f133243, float:1.9565749E38)
            java.lang.String r17 = r10.getString(r2)
            r2 = 2131964482(0x7f133242, float:1.9565747E38)
            java.lang.String r18 = r10.getString(r2)
            r20 = 2131964477(0x7f13323d, float:1.9565737E38)
            com.instagram.direct.inbox.DirectInviteContactViewModel r2 = new com.instagram.direct.inbox.DirectInviteContactViewModel
            r21 = r0
            r22 = r0
            r23 = r5
            r24 = r5
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r1.add(r2)
            int r0 = r0 + 1
        L_0x01cf:
            boolean r2 = r6.A09
            if (r2 != 0) goto L_0x009b
            if (r14 == 0) goto L_0x01e6
            java.lang.Integer r10 = X.AnonymousClass05K.A0K
            r2 = 35
            java.util.ArrayList r2 = X.FEZ.A00(r6, r10, r9, r2, r0)
            r1.addAll(r2)
            int r2 = r2.size()
            int r2 = r2 - r4
            int r0 = r0 + r2
        L_0x01e6:
            if (r13 == 0) goto L_0x0234
            java.lang.Integer r12 = X.AnonymousClass05K.A09
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            X.Pvs r2 = r6.A04
            X.V4b r9 = r2.DLe()
            X.OuE r2 = new X.OuE
            r2.<init>(r9, r12, r10)
            r1.add(r2)
            int r10 = r3.size()
            r9 = 0
        L_0x01ff:
            if (r9 >= r10) goto L_0x0230
            r19 = 2131238154(0x7f081d0a, float:1.8092579E38)
            java.lang.Object r2 = r3.get(r9)
            com.instagram.model.direct.DirectShareTarget r2 = (com.instagram.model.direct.DirectShareTarget) r2
            java.lang.String r17 = X.DbT.A0y(r2)
            java.lang.Object r2 = r3.get(r9)
            com.instagram.model.direct.DirectShareTarget r2 = (com.instagram.model.direct.DirectShareTarget) r2
            java.lang.String r12 = r2.A0K
            r20 = 2131964477(0x7f13323d, float:1.9565737E38)
            int r21 = r0 + r9
            r23 = -1
            com.instagram.direct.inbox.DirectInviteContactViewModel r2 = new com.instagram.direct.inbox.DirectInviteContactViewModel
            r18 = r12
            r22 = r9
            r24 = r23
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r1.add(r2)
            int r9 = r9 + 1
            goto L_0x01ff
        L_0x0230:
            int r0 = X.DbT.A01(r3, r0)
        L_0x0234:
            if (r15 == 0) goto L_0x009b
            java.lang.Integer r3 = X.AnonymousClass05K.A0E
            r2 = 12
            java.util.ArrayList r0 = X.FEZ.A00(r6, r3, r8, r2, r0)
            r1.addAll(r0)
            r0.size()
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FRO.A02():void");
    }

    public final void A05(List list) {
        A01();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget A0f = DbT.A0f(it);
            A03(A0f, true);
            Set set = this.A07;
            String A092 = A0f.A09();
            0qQ.A07(A092);
            set.add(A092);
        }
        A02();
        this.A04.Dwl();
        C46716Djn djn = this.A03;
        ArrayList A002 = A00();
        C363318jW r2 = djn.A00;
        r2.A01();
        Iterator it2 = A002.iterator();
        while (it2.hasNext()) {
            r2.A02(it2.next());
        }
    }
}
