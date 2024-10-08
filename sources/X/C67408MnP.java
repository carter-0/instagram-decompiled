package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.MnP  reason: case insensitive filesystem */
public final class C67408MnP implements XAH {
    public final Handler A00 = new C14697U1x(Looper.getMainLooper(), this, 11);
    public final 2el A01;
    public final C67411MnS A02;
    public final C67404MnL A03;
    public final C67414MnV A04;
    public final C67413MnU A05;
    public final C14435TwJ A06;
    public final C67405MnM A07;
    public final C67415MnW A08;
    public final C67407MnO A09;
    public final C67412MnT A0A;
    public final C67406MnN A0B;
    public final C67410MnR A0C;
    public final C67403MnK A0D;

    public final void ECK(View view, C66942Mfb mfb, C66967Mg0 mg0) {
        0qQ.A0B(view, 0);
        C67405MnM mnM = this.A07;
        C2354830a A002 = AnonymousClass30Y.A00(mfb, mg0, 002.A0T(mnM.A00.E4p(), mfb.A01(), ':'));
        A002.A00(this.A0A);
        this.A01.A05(view, A002.A01());
    }

    public C67408MnP(AnonymousClass0iw r13, UserSession userSession, 2el r15, C299435v9 r16, C14480Tx2 tx2, C358448av r18, C55868Hop hop, C20964X6r x6r, C20910X4b x4b, C20911X4c x4c, C74366Ptg ptg, String str) {
        C20964X6r x6r2 = x6r;
        C20910X4b x4b2 = x4b;
        AnonymousClass7TG.A1R(x4b2, x6r2);
        C20911X4c x4c2 = x4c;
        AnonymousClass7TF.A1G(userSession, 7, x4c2);
        C74366Ptg ptg2 = ptg;
        0qQ.A0B(ptg2, 11);
        this.A01 = r15;
        C67405MnM mnM = new C67405MnM(x4b2);
        this.A07 = mnM;
        C67410MnR mnR = new C67410MnR(r16, r18, x6r2, x4b2, x4c2);
        this.A0C = mnR;
        C55868Hop hop2 = hop;
        C67403MnK mnK = new C67403MnK(hop2);
        this.A0D = mnK;
        this.A0A = new C67412MnT(tx2, ptg2, mnR, mnM);
        String str2 = str;
        this.A06 = new C14435TwJ(r13, userSession, new C67409MnQ(x6r2, x4b2, str2));
        this.A09 = new C67407MnO(mnR, mnM);
        this.A0B = new C67406MnN(r13, userSession, mnM);
        this.A02 = new C67411MnS(mnR, mnM, str2);
        this.A03 = new C67404MnL(hop2, mnM);
        this.A04 = new C67414MnV(hop2, mnK, mnM);
        this.A05 = new C67413MnU(hop2, mnM);
        this.A08 = new C67415MnW(mnR, mnM);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0095, code lost:
        if (r15.A03.BxN() == null) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r31 = this;
            r0 = r31
            X.MnR r10 = r0.A0C
            java.util.Map r0 = r10.A05
            r30 = r0
            java.util.Iterator r19 = X.AnonymousClass7TF.A0u(r30)
        L_0x000c:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0103
            java.lang.Object r0 = r19.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r12 = r0.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r14 = r0.getValue()
            X.Mnj r14 = (X.C67428Mnj) r14
            java.util.List r2 = r14.A01
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x000c
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r18 = r2.iterator()
        L_0x0058:
            r17 = 0
        L_0x005a:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r3 = r18.next()
            X.Mni r3 = (X.C67427Mni) r3
            java.lang.String r0 = r3.A01
            r13.add(r0)
            java.lang.String r0 = r3.A02
            r11.add(r0)
            java.lang.String r0 = r3.A05
            r9.add(r0)
            java.lang.String r0 = r3.A04
            r8.add(r0)
            int r0 = r3.A00
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.add(r0)
            java.lang.String r0 = r3.A06
            r6.add(r0)
            com.instagram.user.model.User r15 = r3.A07
            r0 = 0
            if (r15 == 0) goto L_0x0097
            X.4Cl r1 = r15.A03
            java.lang.String r16 = r1.BxN()
            r1 = 1
            if (r16 != 0) goto L_0x0098
        L_0x0097:
            r1 = 0
        L_0x0098:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r5.add(r1)
            if (r15 == 0) goto L_0x00a7
            X.4Cl r0 = r15.A03
            java.lang.String r0 = r0.BqM()
        L_0x00a7:
            r4.add(r0)
            if (r17 != 0) goto L_0x00b7
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x0058
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00b7
            goto L_0x0058
        L_0x00b7:
            r17 = 1
            goto L_0x005a
        L_0x00ba:
            if (r17 == 0) goto L_0x00dd
            r0 = 10
            int r0 = X.0Yv.A1E(r2, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x00cb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00df
            java.lang.Object r0 = r2.next()
            X.Mni r0 = (X.C67427Mni) r0
            java.lang.String r0 = r0.A03
            r1.add(r0)
            goto L_0x00cb
        L_0x00dd:
            X.0sn r1 = X.0sn.A00
        L_0x00df:
            X.8av r3 = r10.A02
            X.TxB r2 = new X.TxB
            r23 = r9
            r24 = r7
            r25 = r8
            r26 = r1
            r27 = r6
            r28 = r5
            r29 = r4
            r20 = r2
            r21 = r13
            r22 = r11
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.String r1 = r14.A00
            java.lang.String r0 = r10.A00
            r3.ClE(r2, r12, r1, r0)
            goto L_0x000c
        L_0x0103:
            r30.clear()
            java.lang.String r0 = ""
            r10.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67408MnP.A00():void");
    }

    public final void A01(View view, AnonymousClass4DH r5, C14450TwY twY) {
        if (view != null) {
            this.A01.A08(view, AnonymousClass3DZ.A00(r5), new AnonymousClass2eo[]{new C67402MnJ(view, twY)});
        }
    }
}
