package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class E9L extends 2Ru implements C231272rL, AnonymousClass7Q7 {
    public final C46454DfI A00;
    public final ArrayList A01 = AnonymousClass7TE.A1C();
    public final HashSet A02 = AnonymousClass7TE.A1F();
    public final Activity A03;
    public final Context A04;
    public final F07 A05;
    public final AnonymousClass2s2 A06;
    public final AnonymousClass0iw A07;
    public final UserSession A08;
    public final C47635EAv A09;
    public final C46450DfD A0A;
    public final C47636EAw A0B;
    public final C49624Ezh A0C;
    public final C39695A5l A0D;
    public final C336947fR A0E;
    public final C47631EAr A0F;
    public final F02 A0G;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.A5l] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.2s2, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E9L(Activity activity, Context context, F07 f07, AnonymousClass0iw r27, UserSession userSession, C49624Ezh ezh, AnonymousClass32K r30, G88 g88, EEF eef, AnonymousClass32I r33, F02 f02) {
        super(false);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        this.A08 = userSession2;
        Context context2 = context;
        this.A04 = context2;
        Activity activity2 = activity;
        this.A03 = activity2;
        AnonymousClass0iw r12 = r27;
        this.A07 = r12;
        C49624Ezh ezh2 = ezh;
        this.A0C = ezh2;
        F02 f022 = f02;
        this.A0G = f022;
        F07 f072 = f07;
        this.A05 = f072;
        UserSession userSession3 = userSession2;
        Activity activity3 = activity2;
        F07 f073 = f072;
        C47631EAr eAr = new C47631EAr(activity3, context2, f073, r12, userSession3, eef, "unknown");
        this.A0F = eAr;
        this.A0D = new Object();
        C336947fR r8 = new C336947fR(context2);
        this.A0E = r8;
        G88 g882 = g88;
        C46450DfD dfD = new C46450DfD(context2, r12, userSession2, r30, g882, false, true, false);
        this.A0A = dfD;
        C47636EAw eAw = new C47636EAw(context2, r12, userSession3, ezh2, g882, 182.A06(0Tu.A05, userSession2, 36328710290357806L));
        this.A0B = eAw;
        C46454DfI dfI = new C46454DfI(context2, r33);
        this.A00 = dfI;
        ? obj = new Object();
        this.A06 = obj;
        C47635EAv eAv = new C47635EAv(activity2, context2, f072, userSession2);
        this.A09 = eAv;
        init(new C231642s0[]{eAr, r8, dfD, eAw, dfI, obj, eAv});
        dfI.A00 = f022;
        obj.A03 = AnonymousClass7TE.A0F(context2.getResources());
    }

    public final boolean AJe(String str) {
        0qQ.A0B(str, 0);
        return this.A02.contains(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0171, code lost:
        if (r11.A01 == false) goto L_0x0173;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r21 = this;
            r9 = r21
            r9.clear()
            java.util.HashSet r8 = r9.A02
            r8.clear()
            X.Ezh r0 = r9.A0C
            X.2oe r0 = r0.A01
            java.util.Map r0 = r0.A00
            r0.clear()
            X.F02 r0 = r9.A0G
            X.2oe r0 = r0.A01
            java.util.Map r0 = r0.A00
            r0.clear()
            X.F07 r0 = r9.A05
            X.2oe r0 = r0.A04
            java.util.Map r0 = r0.A00
            r0.clear()
            X.Eqk r2 = new X.Eqk
            r2.<init>()
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
            X.F2L r1 = new X.F2L
            r1.<init>(r7)
            X.EAr r0 = r9.A0F
            r9.addModel(r2, r1, r0)
            int r19 = r9.getCount()
            java.util.ArrayList r0 = r9.A01
            r20 = r0
            java.util.Iterator r18 = r20.iterator()
            r10 = 0
            r12 = 0
        L_0x0044:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x01a0
            java.lang.Object r11 = r18.next()
            int r17 = r12 + 1
            if (r12 >= 0) goto L_0x005a
            X.0sr.A1T()
        L_0x0055:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x005a:
            X.CTN r11 = (X.CTN) r11
            java.util.ArrayList r0 = r11.A00()
            boolean r0 = r0.isEmpty()
            r6 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x006d
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x007d
        L_0x006d:
            java.lang.String r0 = r11.A01
            if (r0 == 0) goto L_0x018c
            X.DfA r2 = new X.DfA
            r2.<init>((java.lang.CharSequence) r0)
            X.A5l r1 = r9.A0D
            X.7fR r0 = r9.A0E
            r9.addModel(r2, r1, r0)
        L_0x007d:
            int r19 = r19 + 1
            int r1 = r11.A00
            java.util.ArrayList r0 = r11.A00()
            int r0 = r0.size()
            int r5 = java.lang.Math.min(r1, r0)
            com.instagram.common.session.UserSession r4 = r9.A08
            X.0Tu r2 = X.0Tu.A06
            r0 = 36312363645535293(0x8101e7000c043d, double:3.027423215364079E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            java.lang.String r16 = "Required value was null."
            if (r0 == 0) goto L_0x00c8
            r13 = 0
        L_0x009f:
            if (r13 >= r5) goto L_0x00db
            java.util.ArrayList r0 = r11.A00()
            java.lang.Object r0 = r0.get(r13)
            X.3UI r0 = (X.AnonymousClass3UI) r0
            X.3UL r3 = r0.A00()
            if (r3 == 0) goto L_0x0196
            java.lang.String r0 = r3.getId()
            r8.add(r0)
            int r2 = r19 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            X.DfD r0 = r9.A0A
            r9.addModel(r3, r1, r0)
            int r13 = r13 + 1
            r19 = r2
            goto L_0x009f
        L_0x00c8:
            X.2HY r1 = X.C229632nm.A0C(r10, r5)
            r0 = 2
            X.2HZ r0 = X.C229632nm.A0B(r1, r0)
            int r14 = r0.A00
            int r13 = r0.A01
            int r3 = r0.A02
            if (r3 <= 0) goto L_0x0134
            if (r14 <= r13) goto L_0x0138
        L_0x00db:
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x010d
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            java.lang.String r0 = r11.A01
            if (r0 == 0) goto L_0x018c
            r2.put(r10, r0)
            java.lang.String r0 = r11.A00
            if (r0 == 0) goto L_0x018f
            r2.put(r6, r0)
            X.DfV r1 = new X.DfV
            r1.<init>(r7)
            r1.A00 = r2
            r1.A01 = r0
            X.DfI r0 = r9.A00
            r9.addModel(r1, r0)
            int r0 = r20.size()
            int r0 = r0 - r6
            if (r12 != r0) goto L_0x010d
            X.2s2 r1 = r9.A06
            r0 = 0
            r9.addModel(r0, r1)
        L_0x010d:
            int r0 = r20.size()
            if (r0 != r6) goto L_0x0115
            if (r12 == 0) goto L_0x011d
        L_0x0115:
            int r0 = r20.size()
            if (r0 <= r6) goto L_0x0130
            if (r12 != r6) goto L_0x0130
        L_0x011d:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314859022977875(0x81042c00220b53, double:3.029001302106846E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0130
            X.EAv r1 = r9.A09
            r0 = 0
            r9.addModel(r0, r1)
        L_0x0130:
            r12 = r17
            goto L_0x0044
        L_0x0134:
            if (r3 >= 0) goto L_0x00db
            if (r13 > r14) goto L_0x00db
        L_0x0138:
            java.util.ArrayList r0 = r11.A00()
            java.lang.Object r0 = r0.get(r14)
            X.3UI r0 = (X.AnonymousClass3UI) r0
            X.3UL r2 = r0.A00()
            if (r2 == 0) goto L_0x019b
            int r1 = r14 + 1
            if (r1 >= r5) goto L_0x018a
            java.util.ArrayList r0 = r11.A00()
            java.lang.Object r0 = r0.get(r1)
            X.3UI r0 = (X.AnonymousClass3UI) r0
            X.3UL r1 = r0.A00()
        L_0x015a:
            java.lang.String r0 = r2.getId()
            r8.add(r0)
            if (r1 == 0) goto L_0x016a
            java.lang.String r0 = r1.getId()
            r8.add(r0)
        L_0x016a:
            int r0 = r14 + 2
            if (r0 < r5) goto L_0x0173
            boolean r0 = r11.A01
            r15 = 1
            if (r0 != 0) goto L_0x0174
        L_0x0173:
            r15 = 0
        L_0x0174:
            X.0eP r2 = X.AnonymousClass7TE.A1L(r2, r1)
            java.lang.String r0 = r11.A00
            if (r0 == 0) goto L_0x018f
            X.Dro r1 = new X.Dro
            r1.<init>((int) r14, (java.lang.String) r0, (boolean) r15)
            X.EAw r0 = r9.A0B
            r9.addModel(r2, r1, r0)
            if (r14 == r13) goto L_0x00db
            int r14 = r14 + r3
            goto L_0x0138
        L_0x018a:
            r1 = 0
            goto L_0x015a
        L_0x018c:
            java.lang.String r0 = "title"
            goto L_0x0191
        L_0x018f:
            java.lang.String r0 = "name"
        L_0x0191:
            X.0qQ.A0F(r0)
            goto L_0x0055
        L_0x0196:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x019b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x01a0:
            r9.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E9L.A00():void");
    }

    public final void A01(AnonymousClass3UM r7) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            F2I f2i = (F2I) it.next();
            ArrayList A002 = f2i.A00();
            ArrayList A003 = f2i.A00();
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it2 = A003.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                AnonymousClass3UL A004 = ((AnonymousClass3UI) next).A00();
                if (A004 == null) {
                    throw AnonymousClass7TE.A0y();
                } else if (A004.equals(r7)) {
                    A1C.add(next);
                }
            }
            A002.removeAll(A1C);
        }
        A00();
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final void FK4() {
        A00();
    }
}
