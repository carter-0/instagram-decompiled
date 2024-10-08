package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.NHt  reason: case insensitive filesystem */
public final class C68434NHt extends C272124k8 {
    public final 1P0 A00;
    public final DirectThreadKey A01;
    public final boolean A02 = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68434NHt(1P0 r2, UserSession userSession, DirectThreadKey directThreadKey) {
        super(userSession);
        0qQ.A0B(userSession, 1);
        this.A01 = directThreadKey;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009b, code lost:
        if (X.AnonymousClass48V.A01.compare(r10, r12) <= 0) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A04(com.instagram.common.session.UserSession r16, java.lang.Object r17) {
        /*
            r15 = this;
            r6 = r17
            r0 = 1342831783(0x5009fca7, float:9.2601457E9)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.NHP r6 = (X.NHP) r6
            r0 = 1063317931(0x3f60f1ab, float:0.87868756)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r1 = r16
            X.AnonymousClass7TG.A1N(r1, r6)
            boolean r0 = r15.A02
            if (r0 == 0) goto L_0x0134
            X.2Dm r3 = X.1bJ.A00(r1)
            com.instagram.model.direct.DirectThreadKey r8 = r15.A01
            X.2Dr r3 = (X.2Dr) r3
            monitor-enter(r3)
            r13 = 0
            X.0qQ.A0B(r8, r13)     // Catch:{ all -> 0x0130 }
            X.48S r11 = r3.A0P(r8)     // Catch:{ all -> 0x0130 }
            if (r11 != 0) goto L_0x003b
            java.lang.String r1 = "Null thread entry"
            r0 = 226(0xe2, float:3.17E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0130 }
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x0130 }
            goto L_0x0133
        L_0x003b:
            X.3U9 r7 = r11.A0I     // Catch:{ all -> 0x0130 }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x0130 }
            java.util.List r2 = r6.A04     // Catch:{ all -> 0x0130 }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x0130 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0130 }
            if (r0 != 0) goto L_0x00f7
            java.lang.String r12 = r6.A02     // Catch:{ all -> 0x0130 }
            monitor-enter(r11)     // Catch:{ all -> 0x0130 }
            if (r12 != 0) goto L_0x008c
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x0058
            r12 = 0
            goto L_0x008c
        L_0x0058:
            java.lang.Object r0 = r2.get(r13)     // Catch:{ all -> 0x00f4 }
            java.lang.String r12 = X.C66580MXl.A0y(r0)     // Catch:{ all -> 0x00f4 }
            java.lang.String r10 = "Required value was null."
            if (r12 == 0) goto L_0x0082
            java.util.Iterator r9 = r2.iterator()     // Catch:{ all -> 0x00f4 }
        L_0x0068:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x008c
            X.3su r0 = X.C66580MXl.A0a(r9)     // Catch:{ all -> 0x00f4 }
            java.lang.String r1 = r0.A0g()     // Catch:{ all -> 0x00f4 }
            if (r1 == 0) goto L_0x0087
            java.util.Comparator r0 = X.AnonymousClass48V.A01     // Catch:{ all -> 0x00f4 }
            int r0 = r0.compare(r12, r1)     // Catch:{ all -> 0x00f4 }
            if (r0 >= 0) goto L_0x0068
            r12 = r1
            goto L_0x0068
        L_0x0082:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)     // Catch:{ all -> 0x00f4 }
            goto L_0x008b
        L_0x0087:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)     // Catch:{ all -> 0x00f4 }
        L_0x008b:
            throw r0     // Catch:{ all -> 0x00f4 }
        L_0x008c:
            java.lang.String r10 = r7.CFm()     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x009d
            if (r12 == 0) goto L_0x009d
            java.util.Comparator r0 = X.AnonymousClass48V.A01     // Catch:{ all -> 0x00f4 }
            int r0 = r0.compare(r10, r12)     // Catch:{ all -> 0x00f4 }
            r1 = r10
            if (r0 > 0) goto L_0x009e
        L_0x009d:
            r1 = r12
        L_0x009e:
            r7.A0F(r1)     // Catch:{ all -> 0x00f4 }
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x00f4 }
            java.util.Iterator r14 = r2.iterator()     // Catch:{ all -> 0x00f4 }
        L_0x00a9:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x00d9
            X.3su r0 = X.C66580MXl.A0a(r14)     // Catch:{ all -> 0x00f4 }
            X.3su r2 = r11.A0H(r0, r13, r13)     // Catch:{ all -> 0x00f4 }
            if (r2 == r0) goto L_0x00c7
            if (r10 == 0) goto L_0x00c7
            java.util.Comparator r1 = X.AnonymousClass48V.A01     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = r0.A0g()     // Catch:{ all -> 0x00f4 }
            int r0 = r1.compare(r0, r10)     // Catch:{ all -> 0x00f4 }
            if (r0 <= 0) goto L_0x00a9
        L_0x00c7:
            if (r12 == 0) goto L_0x00a9
            java.util.Comparator r1 = X.AnonymousClass48V.A01     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = r2.A0g()     // Catch:{ all -> 0x00f4 }
            int r0 = r1.compare(r0, r12)     // Catch:{ all -> 0x00f4 }
            if (r0 > 0) goto L_0x00a9
            r9.add(r2)     // Catch:{ all -> 0x00f4 }
            goto L_0x00a9
        L_0x00d9:
            r11.A0S()     // Catch:{ all -> 0x00f4 }
            X.AnonymousClass48S.A0B(r11)     // Catch:{ all -> 0x00f4 }
            r11.A0U()     // Catch:{ all -> 0x00f4 }
            monitor-exit(r11)     // Catch:{ all -> 0x0130 }
            java.lang.Boolean r0 = r6.A01     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0130 }
        L_0x00eb:
            r7.A0I(r0)     // Catch:{ all -> 0x0130 }
            goto L_0x00f1
        L_0x00ef:
            r0 = 0
            goto L_0x00eb
        L_0x00f1:
            if (r0 == 0) goto L_0x0109
            goto L_0x0101
        L_0x00f4:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0130 }
            throw r0     // Catch:{ all -> 0x0130 }
        L_0x00f7:
            X.1Ng r2 = r3.A06     // Catch:{ all -> 0x0130 }
            X.0sn r1 = X.0sn.A00     // Catch:{ all -> 0x0130 }
            X.2Ke r0 = new X.2Ke     // Catch:{ all -> 0x0130 }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x0130 }
            goto L_0x011e
        L_0x0101:
            int r1 = r7.CBu()     // Catch:{ all -> 0x0130 }
            int r0 = r6.A00     // Catch:{ all -> 0x0130 }
            if (r1 <= r0) goto L_0x0114
        L_0x0109:
            r0 = 0
            java.util.List r0 = r3.CBt(r8, r0)     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x012e
            int r0 = r0.size()     // Catch:{ all -> 0x0130 }
        L_0x0114:
            r7.A07(r0)     // Catch:{ all -> 0x0130 }
            X.1Ng r2 = r3.A06     // Catch:{ all -> 0x0130 }
            X.2Ke r0 = new X.2Ke     // Catch:{ all -> 0x0130 }
            r0.<init>(r8, r9)     // Catch:{ all -> 0x0130 }
        L_0x011e:
            r2.A00(r0)     // Catch:{ all -> 0x0130 }
            X.2EN r1 = r7.C3d()     // Catch:{ all -> 0x0130 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0130 }
            X.2ED r0 = r3.A0C     // Catch:{ all -> 0x0130 }
            r0.A0R(r1)     // Catch:{ all -> 0x0130 }
            goto L_0x0133
        L_0x012e:
            r0 = 0
            goto L_0x0114
        L_0x0130:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0133:
            monitor-exit(r3)
        L_0x0134:
            X.1P0 r0 = r15.A00
            if (r0 == 0) goto L_0x013b
            r0.onSuccessInBackground(r6)
        L_0x013b:
            r0 = -1809667779(0xffffffff9422a93d, float:-8.212286E-27)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1487145497(0x58a40a19, float:1.44290621E15)
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68434NHt.A04(com.instagram.common.session.UserSession, java.lang.Object):void");
    }

    public final void A01(UserSession userSession) {
        int A03 = AnonymousClass0fD.A03(229740647);
        1P0 r0 = this.A00;
        if (r0 != null) {
            r0.onFinish();
        }
        AnonymousClass0fD.A0A(2129575136, A03);
    }

    public final void A05(C268654dm r3, UserSession userSession) {
        int A04 = DbX.A04(r3, -996307223);
        1P0 r0 = this.A00;
        if (r0 != null) {
            r0.onFail(r3);
        }
        AnonymousClass0fD.A0A(-875636640, A04);
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03 = AnonymousClass0fD.A03(363075685);
        int A04 = DbX.A04(obj, 1789748567);
        1P0 r0 = this.A00;
        if (r0 != null) {
            r0.onSuccess(obj);
        }
        AnonymousClass0fD.A0A(-1217829019, A04);
        AnonymousClass0fD.A0A(-1520528461, A03);
    }
}
