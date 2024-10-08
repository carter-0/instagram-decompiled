package com.instagram.share.facebook.upsell.data;

import X.02z;
import X.05G;
import X.0qQ;
import X.106;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass43D;
import X.C252733pa;
import X.C367198qL;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;

public final class CLNoticeRepository extends C252733pa {
    public final Context A00;
    public final UserSession A01;
    public final CXPNoticeStateRepository A02;
    public final C367198qL A03;
    public final String A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;

    /* JADX WARNING: type inference failed for: r15v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r15v4 */
    /* JADX WARNING: type inference failed for: r15v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r19) {
        /*
            r18 = this;
            r3 = 39
            r4 = r19
            boolean r0 = X.ME9.A03(r3, r4)
            r5 = r18
            if (r0 == 0) goto L_0x00e0
            r15 = r4
            X.ME9 r15 = (X.ME9) r15
            int r2 = r15.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e0
            int r2 = r2 - r1
            r15.A00 = r2
        L_0x001a:
            java.lang.Object r6 = r15.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r15.A00
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008a
            if (r0 != r3) goto L_0x00e7
            java.lang.Object r1 = r15.A02
            X.8qM r1 = (X.C367208qM) r1
            java.lang.Object r7 = r15.A01
            com.instagram.share.facebook.upsell.data.CLNoticeRepository r7 = (com.instagram.share.facebook.upsell.data.CLNoticeRepository) r7
            X.0eS.A00(r6)
        L_0x0031:
            java.util.Map r6 = (java.util.Map) r6
            java.lang.String r3 = "CLNoticeRepository"
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            r4 = 0
            com.google.common.collect.ImmutableList r0 = r1.A00
            X.3kO r10 = r0.iterator()
            X.0qQ.A07(r10)
        L_0x0043:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00ec
            java.lang.String r9 = X.AnonymousClass7TE.A18(r10)
            java.lang.Object r8 = r6.get(r9)
            X.8sV r8 = (X.C368368sV) r8
            if (r8 != 0) goto L_0x0068
            r5.put(r9, r2)
            java.lang.String r0 = ": key doesn't exist in result"
            java.lang.String r0 = X.002.A0R(r9, r0)
            X.0KC.A0C(r3, r0)
            X.8qL r1 = r7.A03
            r0 = 3
            r1.A03(r0)
            goto L_0x0043
        L_0x0068:
            com.instagram.common.session.UserSession r1 = r7.A01
            X.C70335O2n.A00(r1, r8)
            r4 = r8
            X.0qQ.A0A(r9)
            X.8qL r0 = r7.A03
            X.LGS r0 = X.C367278qU.A01(r1, r8, r0, r9)
            if (r0 != 0) goto L_0x0086
            java.lang.String r0 = ": Unsupported notice variant on the client"
            java.lang.String r0 = X.002.A0R(r9, r0)
            X.0KC.A0C(r3, r0)
            r5.put(r9, r2)
            goto L_0x0043
        L_0x0086:
            r5.put(r9, r0)
            goto L_0x0043
        L_0x008a:
            X.0eS.A00(r6)
            java.lang.String r9 = r5.A04
            r17 = 0
            X.8qM[] r8 = X.C367208qM.values()
            int r7 = r8.length
            r6 = 0
        L_0x0097:
            if (r6 >= r7) goto L_0x00fe
            r1 = r8[r6]
            com.google.common.collect.ImmutableList r0 = r1.A00
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x00dd
            X.8qL r14 = r5.A03
            java.lang.String r0 = r1.toString()
            r10 = 0
            r14.A02(r9, r2, r0)
            java.lang.String r7 = X.AnonymousClass7TF.A0c()
            X.0qQ.A07(r7)
            com.instagram.common.session.UserSession r12 = r5.A01
            boolean r16 = r1.A00(r12)
            if (r16 == 0) goto L_0x00c0
            X.9ID r10 = X.C367278qU.A00(r12)
        L_0x00c0:
            com.instagram.share.facebook.upsell.api.CLNoticeApi r8 = com.instagram.share.facebook.upsell.api.CLNoticeApi.A00
            com.google.common.collect.ImmutableList r11 = r1.A00
            X.8qS r6 = X.C367258qS.A00
            android.content.Context r0 = r5.A00
            X.2IV r9 = r6.A01(r0, r12, r7)
            com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository r13 = r5.A02
            r15.A01 = r5
            r15.A02 = r1
            r15.A00 = r3
            java.lang.Object r6 = r8.A01(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r6 == r4) goto L_0x0100
            r7 = r5
            goto L_0x0031
        L_0x00dd:
            int r6 = r6 + 1
            goto L_0x0097
        L_0x00e0:
            X.ME9 r15 = new X.ME9
            r15.<init>(r5, r4, r3)
            goto L_0x001a
        L_0x00e7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00ec:
            X.05G r3 = r7.A05
        L_0x00ee:
            java.lang.Object r2 = r3.getValue()
            r1 = 5
            X.JwL r0 = new X.JwL
            r0.<init>(r1, r4, r5)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x00ee
        L_0x00fe:
            X.0gF r4 = X.C60340gF.A00
        L_0x0100:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.facebook.upsell.data.CLNoticeRepository.A00(X.4D7):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CLNoticeRepository(Context context, UserSession userSession, String str) {
        super("CXPNotices", AnonymousClass43D.A00(664689487));
        C367198qL r4 = new C367198qL(userSession, 479857365);
        CXPNoticeStateRepository cXPNoticeStateRepository = new CXPNoticeStateRepository(userSession, AnonymousClass05K.A00);
        0qQ.A0B(userSession, 2);
        this.A01 = userSession;
        this.A04 = str;
        this.A03 = r4;
        this.A02 = cXPNoticeStateRepository;
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        this.A00 = applicationContext;
        02z A012 = 106.A01((Object) null);
        this.A05 = A012;
        this.A06 = A012;
    }
}
