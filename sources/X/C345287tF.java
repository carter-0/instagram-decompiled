package X;

import java.io.File;

/* renamed from: X.7tF  reason: invalid class name and case insensitive filesystem */
public class C345287tF extends C344317rf implements C345297tG {
    public C341527n6 A00;
    public C341647nI A01;

    public AD9 AMQ(C341687nM r7, ADm aDm, File file) {
        Integer num;
        if (aDm == null || (num = aDm.A07) == null) {
            num = AnonymousClass05K.A0C;
        }
        return new AD9((C341687nM) null, file, (Boolean) null, num, (Long) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: X.7nV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: X.AUL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: X.7nV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: X.7nV} */
    /* JADX WARNING: type inference failed for: r6v1, types: [X.7mq, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v2, types: [X.7mq, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09() {
        /*
            r21 = this;
            X.7r3 r1 = X.C343927r2.A00
            r0 = r21
            X.7qt r7 = r0.A00
            X.7r1 r2 = r7.Apf(r1)
            X.7r2 r2 = (X.C343927r2) r2
            java.lang.String r1 = "Lite-Controller-Thread"
            android.os.Handler r3 = r2.BAM(r1)
            X.0qQ.A07(r3)
            X.7r3 r1 = X.C344037rD.A00
            X.7r1 r4 = r7.Apf(r1)
            X.0qQ.A07(r4)
            X.7rD r4 = (X.C344037rD) r4
            X.7r3 r1 = X.C343967r6.A00
            X.7r1 r12 = r7.Apf(r1)
            X.0qQ.A07(r12)
            X.7r6 r12 = (X.C343967r6) r12
            X.7qg r1 = X.C345167t2.A01
            X.7qe r5 = r0.A0A(r1)
            X.0qQ.A07(r5)
            X.7t2 r5 = (X.C345167t2) r5
            X.7qg r1 = X.C344397rn.A00
            X.7qe r2 = r0.A0A(r1)
            X.0qQ.A07(r2)
            X.7rn r2 = (X.C344397rn) r2
            X.7n6 r1 = new X.7n6
            r1.<init>(r5, r2)
            r2.AAM(r1)
            X.7t1 r5 = (X.C345157t1) r5
            X.7t5 r2 = r5.A03
            X.7t6 r9 = r2.A07
            X.0qQ.A07(r9)
            X.7qg r5 = X.C345257tC.A00
            boolean r2 = r7.CQN(r5)
            r8 = 0
            if (r2 == 0) goto L_0x0065
            X.7qe r2 = r0.A0A(r5)
            X.7tC r2 = (X.C345257tC) r2
            X.7tB r2 = (X.C345247tB) r2
            X.7mr r8 = r2.A02
        L_0x0065:
            X.7qg r6 = X.C344477rv.A01
            boolean r2 = r7.CQN(r6)
            if (r2 == 0) goto L_0x0081
            X.7qg r5 = X.AnonymousClass7t9.A00
            boolean r2 = r7.CQN(r5)
            if (r2 == 0) goto L_0x0081
            X.7qe r2 = r0.A0A(r6)
            X.7rv r2 = (X.C344477rv) r2
            r2.BQ8()
            r0.A0A(r5)
        L_0x0081:
            r5 = r0
            boolean r2 = r0 instanceof X.C341547n8
            if (r2 == 0) goto L_0x00e1
            X.7n8 r5 = (X.C341547n8) r5
            r2 = 1
            X.0qQ.A0B(r4, r2)
            r2 = 2
            X.0qQ.A0B(r12, r2)
            if (r8 == 0) goto L_0x0137
            X.AUL r15 = new X.AUL
            r15.<init>()
            r5.A00 = r15
            X.7n9 r14 = new X.7n9
            r14.<init>(r4)
            X.7n0 r7 = r8.A0E
            X.7rD r10 = r8.A0L
            X.7mq r11 = r8.A0N
            X.7nB r6 = new X.7nB
            r6.<init>(r7, r8, r9, r10, r11)
            X.7mq r13 = new X.7mq
            r13.<init>()
            X.7nG r2 = new X.7nG
            r2.<init>(r3, r12, r14)
            X.7nI r4 = new X.7nI
            r4.<init>(r13, r14, r2)
            android.os.Handler r10 = r4.A01
            X.9df r3 = new X.9df
            r3.<init>(r10, r12, r14)
            X.7nG r2 = r4.A04
            r2.A03 = r3
            X.7nO r9 = new X.7nO
            r11 = r6
            r9.<init>(r10, r11, r12, r13, r14)
            r4.A03(r9)
            X.7nV r5 = new X.7nV
            r6 = r10
            r7 = r1
            r8 = r12
            r9 = r13
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A03(r5)
        L_0x00d9:
            r4.A03(r15)
        L_0x00dc:
            r0.A01 = r4
            r0.A00 = r1
            return
        L_0x00e1:
            r2 = 1
            X.0qQ.A0B(r4, r2)
            r2 = 2
            X.0qQ.A0B(r12, r2)
            if (r8 == 0) goto L_0x0137
            X.7n9 r5 = new X.7n9
            r5.<init>(r4)
            X.7n0 r14 = r8.A0E
            X.7rD r4 = r8.A0L
            X.7mq r2 = r8.A0N
            X.7nB r13 = new X.7nB
            r15 = r8
            r16 = r9
            r17 = r4
            r18 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            X.7mq r6 = new X.7mq
            r6.<init>()
            X.7nG r2 = new X.7nG
            r2.<init>(r3, r12, r5)
            X.7nI r4 = new X.7nI
            r4.<init>(r6, r5, r2)
            android.os.Handler r10 = r4.A01
            X.7nK r3 = new X.7nK
            r3.<init>(r10, r12, r5)
            X.7nG r2 = r4.A04
            r2.A03 = r3
            X.7nO r9 = new X.7nO
            r11 = r13
            r13 = r6
            r14 = r5
            r9.<init>(r10, r11, r12, r13, r14)
            r4.A03(r9)
            X.7nV r15 = new X.7nV
            r16 = r10
            r17 = r1
            r18 = r12
            r19 = r6
            r20 = r5
            r15.<init>(r16, r17, r18, r19, r20)
            goto L_0x00d9
        L_0x0137:
            X.7n9 r2 = new X.7n9
            r2.<init>(r4)
            X.7nI r4 = X.C392899vY.A00(r3, r1, r9, r12, r2)
            goto L_0x00dc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C345287tF.A09():void");
    }

    public final C343717qg BJt() {
        C343717qg r0 = C345297tG.A00;
        0qQ.A08(r0);
        return r0;
    }
}
