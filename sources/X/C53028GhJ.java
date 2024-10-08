package X;

import com.instagram.creator.agent.settings.avoidedtopics.repository.AvoidedTopicsRepository;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.GhJ  reason: case insensitive filesystem */
public final class C53028GhJ extends 2YL {
    public C61037Jvb A00;
    public String A01 = "";
    public String A02;
    public List A03;
    public boolean A04;
    public boolean A05 = true;
    public boolean A06;
    public C262204Co A07;
    public final AvoidedTopicsRepository A08;
    public final 05G A09;
    public final AnonymousClass0Ud A0A;

    public C53028GhJ(AvoidedTopicsRepository avoidedTopicsRepository) {
        this.A08 = avoidedTopicsRepository;
        02z A10 = DbS.A10(new C53399GnW());
        this.A09 = A10;
        this.A0A = 10b.A03(A10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (X.C51966G9m.A1X(r12.A01) == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        if (r12.A05 != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C53028GhJ r12) {
        /*
            X.05G r3 = r12.A09
        L_0x0002:
            java.lang.Object r4 = r3.getValue()
            r5 = r4
            X.GnW r5 = (X.C53399GnW) r5
            java.lang.Object r1 = r5.A02
            X.JwK r1 = (X.C61082JwK) r1
            boolean r0 = r12.A06
            r2 = 0
            if (r0 != 0) goto L_0x0017
            boolean r0 = r12.A05
            r6 = 1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r6 = 0
        L_0x0018:
            java.lang.Object r1 = r1.A00
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.0qQ.A0B(r1, r0)
            r0 = 19
            X.JwK r7 = new X.JwK
            r7.<init>((boolean) r6, (java.util.List) r1, (int) r0)
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x0038
            boolean r0 = r12.A05
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = r12.A01
            boolean r0 = X.C51966G9m.A1X(r0)
            r11 = 1
            if (r0 != 0) goto L_0x0039
        L_0x0038:
            r11 = 0
        L_0x0039:
            boolean r0 = r12.A05
            if (r0 != 0) goto L_0x0042
            boolean r0 = r12.A06
            if (r0 != 0) goto L_0x0042
            r2 = 1
        L_0x0042:
            java.lang.String r0 = r12.A01
            boolean r1 = X.C51966G9m.A1X(r0)
            r0 = 11
            X.Jvg r6 = new X.Jvg
            r6.<init>((boolean) r2, (boolean) r1, (int) r0)
            java.lang.Object r1 = r5.A04
            X.Jvk r1 = (X.C61046Jvk) r1
            boolean r0 = r12.A05
            r2 = r0 ^ 1
            java.lang.String r1 = r1.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 7
            X.Jvk r8 = new X.Jvk
            r8.<init>((java.lang.String) r1, (boolean) r2, (int) r0)
            java.lang.Object r9 = r5.A03
            X.HLa r9 = (X.C54617HLa) r9
            java.lang.Object r10 = r5.A05
            X.HLa r10 = (X.C54617HLa) r10
            X.GnW r5 = new X.GnW
            r5.<init>((X.C61042Jvg) r6, (X.C61082JwK) r7, (X.C61046Jvk) r8, (X.C54617HLa) r9, (X.C54617HLa) r10, (boolean) r11)
            boolean r0 = r3.AIY(r4, r5)
            if (r0 == 0) goto L_0x0002
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53028GhJ.A00(X.GhJ):void");
    }

    public final void A01() {
        Object value;
        if (!00l.A0W(this.A01)) {
            this.A04 = false;
            05G r2 = this.A09;
            do {
                value = r2.getValue();
            } while (!r2.AIY(value, C53399GnW.A00((C61042Jvg) null, (C61082JwK) null, (C53399GnW) value, (C61046Jvk) null, C54617HLa.LOADING, (C54617HLa) null, 62)));
            C262204Co r0 = this.A07;
            if (r0 != null) {
                r0.AG7((CancellationException) null);
            }
            this.A07 = C51966G9m.A1L(new C58102ImO(this, (AnonymousClass4D7) null, 33), C318116oQ.A00(this));
        }
    }
}
