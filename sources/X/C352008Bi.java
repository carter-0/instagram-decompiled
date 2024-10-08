package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Bi  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C352008Bi implements AnonymousClass0eK {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewStub A01;
    public final /* synthetic */ C3503284f A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ AnonymousClass8BA A04;

    public /* synthetic */ C352008Bi(View view, ViewStub viewStub, C3503284f r3, UserSession userSession, AnonymousClass8BA r5) {
        this.A04 = r5;
        this.A03 = userSession;
        this.A01 = viewStub;
        this.A02 = r3;
        this.A00 = view;
    }

    /* JADX WARNING: type inference failed for: r0v34 */
    /* JADX WARNING: type inference failed for: r17v6, types: [X.9Pf] */
    /* JADX WARNING: type inference failed for: r0v45 */
    /* JADX WARNING: type inference failed for: r0v46 */
    /* JADX WARNING: type inference failed for: r17v7, types: [X.9Pf] */
    /* JADX WARNING: type inference failed for: r0v47 */
    /* JADX WARNING: type inference failed for: r0v48 */
    /* JADX WARNING: type inference failed for: r17v8, types: [X.Aal] */
    /* JADX WARNING: type inference failed for: r14v2, types: [X.7vS] */
    /* JADX WARNING: type inference failed for: r0v49 */
    /* JADX WARNING: type inference failed for: r0v50 */
    /* JADX WARNING: type inference failed for: r17v9, types: [X.Aag] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007a, code lost:
        if (r0.A00 == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0059, code lost:
        if (r3 != r0.A00()) goto L_0x005b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get() {
        /*
            r38 = this;
            r1 = r38
            X.8BA r12 = r1.A04
            com.instagram.common.session.UserSession r0 = r1.A03
            r37 = r0
            android.view.ViewStub r11 = r1.A01
            X.84f r0 = r1.A02
            r23 = r0
            android.view.View r0 = r1.A00
            r22 = r0
            android.view.View r0 = r12.A0o
            android.content.Context r16 = r0.getContext()
            android.app.Activity r15 = r12.A0n
            X.4DH r14 = r12.A0s
            X.80D r2 = r12.A18
            java.lang.Integer r13 = r2.A28
            X.80E r0 = r2.A0y
            r21 = r0
            X.8Oh r10 = new X.8Oh
            r10.<init>(r12)
            X.8Be r9 = r12.A0y
            X.0iw r8 = r12.A0u
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r7 = r12.A0z
            X.82p r6 = r12.A13
            X.8Yz r0 = r12.A0w
            r20 = r0
            X.88B r0 = r12.A1m
            r19 = r0
            com.instagram.common.session.UserSession r0 = r12.A0v
            java.lang.String r4 = r2.A2p
            r1 = 0
            X.0qQ.A0B(r0, r1)
            X.6oG r3 = X.C318046oG.AVATAR_STATIC
            if (r4 == 0) goto L_0x005b
            X.6ay r0 = X.C310386ax.A00(r0)
            android.util.LruCache r0 = r0.A00
            java.lang.Object r0 = r0.get(r4)
            X.6nz r0 = (X.C317876nz) r0
            if (r0 == 0) goto L_0x005b
            X.6oG r0 = r0.A00()
            r34 = 1
            if (r3 == r0) goto L_0x005d
        L_0x005b:
            r34 = 0
        L_0x005d:
            X.846 r5 = r12.A1X
            X.6if r0 = r12.A1g
            if (r0 == 0) goto L_0x01ab
            java.lang.Object r0 = r0.get()
            X.8MJ r0 = (X.AnonymousClass8MJ) r0
            X.7vR r4 = new X.7vR
            r4.<init>(r0)
        L_0x006e:
            boolean r0 = r12.A20
            r18 = r0
            X.82n r0 = r2.A12
            if (r0 == 0) goto L_0x007c
            X.7zz r0 = r0.A00
            r36 = 1
            if (r0 != 0) goto L_0x007e
        L_0x007c:
            r36 = 0
        L_0x007e:
            X.9IV r3 = r12.A0r
            X.8B2 r0 = r12.A1l
            r17 = r0
            r29 = 0
            r0 = r16
            X.0qQ.A0B(r0, r1)
            r2 = 1
            X.0qQ.A0B(r15, r2)
            r0 = 2
            X.0qQ.A0B(r14, r0)
            r0 = 3
            X.0qQ.A0B(r13, r0)
            r0 = 5
            X.0qQ.A0B(r11, r0)
            r1 = 6
            r0 = r23
            X.0qQ.A0B(r0, r1)
            r0 = 9
            X.0qQ.A0B(r9, r0)
            r0 = 10
            X.0qQ.A0B(r8, r0)
            r0 = 11
            X.0qQ.A0B(r7, r0)
            r0 = 12
            X.0qQ.A0B(r6, r0)
            r0 = 17
            X.0qQ.A0B(r5, r0)
            r0 = 21
            X.0qQ.A0B(r3, r0)
            int r0 = r13.intValue()
            switch(r0) {
                case 0: goto L_0x0100;
                case 1: goto L_0x018c;
                case 2: goto L_0x0178;
                case 3: goto L_0x017f;
                case 4: goto L_0x0157;
                case 5: goto L_0x0151;
                case 6: goto L_0x0149;
                case 7: goto L_0x012b;
                case 8: goto L_0x00fa;
                case 9: goto L_0x00f4;
                default: goto L_0x00c6;
            }
        L_0x00c6:
            X.Aag r0 = new X.Aag
            r17 = r0
            r18 = r15
            r19 = r16
            r20 = r11
            r21 = r14
            r22 = r23
            r23 = r37
            r24 = r10
            r25 = r9
            r26 = r7
            r27 = r6
            r28 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x00e3:
            X.8Oi r0 = (X.C355038Oi) r0
            X.8it r1 = r12.A1q
            boolean r1 = r1.A06()
            r0.En3(r1)
            boolean r1 = r12.A0c
            r0.D19(r1)
            return r0
        L_0x00f4:
            X.Lm5 r0 = new X.Lm5
            r0.<init>(r11, r9)
            goto L_0x00e3
        L_0x00fa:
            X.Aai r0 = new X.Aai
            r0.<init>(r11, r10, r9)
            goto L_0x00e3
        L_0x0100:
            X.7vS r0 = new X.7vS
            r24 = r20
            r25 = r10
            r26 = r9
            r27 = r7
            r28 = r6
            r29 = r21
            r30 = r4
            r31 = r5
            r32 = r17
            r33 = r19
            r35 = r18
            r17 = r22
            r18 = r11
            r19 = r3
            r20 = r14
            r21 = r23
            r22 = r8
            r23 = r37
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x00e3
        L_0x012b:
            X.Aal r0 = new X.Aal
            r17 = r0
            r18 = r15
            r19 = r16
            r20 = r11
            r21 = r14
            r22 = r23
            r23 = r37
            r24 = r10
            r25 = r9
            r26 = r7
            r27 = r6
            r28 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x00e3
        L_0x0149:
            X.Aaj r0 = new X.Aaj
            r1 = r37
            r0.<init>(r11, r1, r9)
            goto L_0x00e3
        L_0x0151:
            X.Aah r0 = new X.Aah
            r0.<init>(r11, r9, r7)
            goto L_0x00e3
        L_0x0157:
            X.9Pf r0 = new X.9Pf
            r17 = r0
            r18 = r15
            r19 = r16
            r20 = r11
            r21 = r14
            r22 = r23
            r23 = r37
            r24 = r10
            r25 = r9
            r26 = r7
            r27 = r6
            r28 = r5
            r29 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x00e3
        L_0x0178:
            X.Aaf r0 = new X.Aaf
            r0.<init>(r11, r9)
            goto L_0x00e3
        L_0x017f:
            X.Aak r0 = new X.Aak
            r1 = r11
            r2 = r37
            r3 = r10
            r4 = r9
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x00e3
        L_0x018c:
            X.9Pf r0 = new X.9Pf
            r17 = r0
            r18 = r15
            r19 = r16
            r20 = r11
            r21 = r14
            r22 = r23
            r23 = r37
            r24 = r10
            r25 = r9
            r26 = r7
            r27 = r6
            r28 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x00e3
        L_0x01ab:
            r4 = 0
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352008Bi.get():java.lang.Object");
    }
}
