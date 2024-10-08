package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;

/* renamed from: X.8qK  reason: invalid class name and case insensitive filesystem */
public final class C367188qK {
    public final UserSession A00;
    public final CXPNoticeStateRepository A01;
    public final C367198qL A02;
    public final C262224Cq A03;

    public C367188qK(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        CXPNoticeStateRepository cXPNoticeStateRepository = new CXPNoticeStateRepository(userSession, AnonymousClass05K.A00);
        AnonymousClass19S A022 = 19E.A02(AnonymousClass12T.A00.CO6(664689487, 3));
        C367198qL r0 = new C367198qL(userSession, 479857365);
        0qQ.A0B(A022, 3);
        this.A00 = userSession;
        this.A01 = cXPNoticeStateRepository;
        this.A03 = A022;
        this.A02 = r0;
    }

    public final void A00(Context context, UserSession userSession, C367208qM r13) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        C367208qM r4 = r13;
        if (r13.A00(userSession)) {
            C367198qL r3 = this.A02;
            r3.A02((String) null, (String) null, r13.toString());
            r3.A00("is_prefetch_endpoint", 1);
            C262224Cq r2 = this.A03;
            AnonymousClass9KM r32 = new AnonymousClass9KM((Object) r4, (Object) context, (Object) this, (Object) userSession2, (AnonymousClass4D7) null, 13);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r32, r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        if (r8 == null) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C376569Im r16, X.LEO r17, X.C66463MSr r18) {
        /*
            r15 = this;
            r9 = r17
            X.818 r6 = r9.A0D
            android.app.Activity r5 = r9.A0C
            r11 = r15
            X.8qL r2 = r15.A02
            java.lang.String r0 = r6.toString()
            r13 = 0
            r2.A02(r0, r13, r13)
            java.lang.String r12 = X.C368298sO.A00(r6)
            r10 = r18
            if (r12 != 0) goto L_0x0031
            java.lang.String r1 = "CLNoticeManager"
            java.lang.String r0 = "Unexpected Failure: Unmapped notice entrypoint on the client"
            X.0KC.A0C(r1, r0)
            java.lang.String r1 = "failure_reason"
            java.lang.String r0 = "unmapped_entrypoint"
            r2.A01(r1, r0)
            r0 = 3
            r2.A03(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r10.DfE(r0)
            return
        L_0x0031:
            X.8qM[] r4 = X.C367208qM.values()
            int r3 = r4.length
            r2 = 0
        L_0x0037:
            if (r2 >= r3) goto L_0x0069
            r1 = r4[r2]
            com.google.common.collect.ImmutableList r0 = r1.A00
            boolean r0 = r0.contains(r12)
            if (r0 == 0) goto L_0x0066
            com.google.common.collect.ImmutableList r8 = r1.A00
            if (r8 != 0) goto L_0x005f
        L_0x0047:
            com.google.common.collect.ImmutableList r8 = com.google.common.collect.ImmutableList.of(r12)
            if (r1 != 0) goto L_0x005f
            r14 = 0
        L_0x004e:
            X.4Cq r2 = r15.A03
            com.instagram.share.facebook.upsell.manager.CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1 r4 = new com.instagram.share.facebook.upsell.manager.CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1
            r7 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r4, r2)
            return
        L_0x005f:
            com.instagram.common.session.UserSession r0 = r15.A00
            boolean r14 = r1.A00(r0)
            goto L_0x004e
        L_0x0066:
            int r2 = r2 + 1
            goto L_0x0037
        L_0x0069:
            r1 = 0
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C367188qK.A01(X.9Im, X.LEO, X.MSr):void");
    }
}
