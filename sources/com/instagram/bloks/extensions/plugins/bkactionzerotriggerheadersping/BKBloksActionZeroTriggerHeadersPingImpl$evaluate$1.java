package com.instagram.bloks.extensions.plugins.bkactionzerotriggerheadersping;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C277014uI;
import X.C307896Rx;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.bloks.extensions.plugins.bkactionzerotriggerheadersping.BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1", f = "BKBloksActionZeroTriggerHeadersPingImpl.kt", i = {}, l = {39, 43, 49, 52, 62}, m = "invokeSuspend", n = {}, s = {})
public final class BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ C307896Rx A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1(C307896Rx r2, C277014uI r3, Integer num, String str, String str2, AnonymousClass4D7 r7, boolean z, boolean z2) {
        super(2, r7);
        this.A02 = r3;
        this.A05 = str;
        this.A07 = z;
        this.A04 = str2;
        this.A01 = r2;
        this.A03 = num;
        this.A06 = z2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.bloks.extensions.plugins.bkactionzerotriggerheadersping.BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        C277014uI r2 = this.A02;
        String str = this.A05;
        boolean z = this.A07;
        return new BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1(this.A01, r2, this.A03, str, this.A04, r11, z, this.A06);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.bloks.extensions.plugins.bkactionzerotriggerheadersping.BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1Hj r5 = X.1Hj.A02
            int r0 = r10.A00
            r8 = 0
            r6 = 5
            r7 = 4
            r9 = 3
            r3 = 2
            r2 = 1
            java.lang.String r4 = ""
            if (r0 == 0) goto L_0x0017
            if (r0 == r2) goto L_0x00b2
            if (r0 == r3) goto L_0x00a8
            if (r0 == r9) goto L_0x0065
            if (r0 != r7) goto L_0x00a8
            goto L_0x0080
        L_0x0017:
            X.0eS.A00(r11)
            X.4uI r0 = r10.A02
            if (r0 != 0) goto L_0x0033
            java.lang.String r1 = r10.A05
            r10.A00 = r2
            X.OSR r0 = X.AnonymousClass3OC.A00
            if (r0 == 0) goto L_0x0031
            com.instagram.zero.main.IgZeroMain r0 = com.instagram.zero.main.IgZeroMain.A08
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r0.A04(r1, r10)
        L_0x002e:
            if (r0 != r5) goto L_0x00b5
            return r5
        L_0x0031:
            r0 = 0
            goto L_0x002e
        L_0x0033:
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x004c
            java.lang.String r1 = r10.A04
            r10.A00 = r3
        L_0x003b:
            X.OSR r0 = X.AnonymousClass3OC.A00
            if (r0 == 0) goto L_0x004a
            com.instagram.zero.main.IgZeroMain r0 = com.instagram.zero.main.IgZeroMain.A08
            if (r0 == 0) goto L_0x004a
            java.lang.Object r11 = r0.A02(r1, r10)
        L_0x0047:
            if (r11 != r5) goto L_0x00ab
            return r5
        L_0x004a:
            r11 = 0
            goto L_0x0047
        L_0x004c:
            java.lang.Integer r0 = r10.A03
            if (r0 != 0) goto L_0x006b
            java.lang.String r1 = r10.A05
            r10.A00 = r9
            X.OSR r0 = X.AnonymousClass3OC.A00
            if (r0 == 0) goto L_0x0063
            com.instagram.zero.main.IgZeroMain r0 = com.instagram.zero.main.IgZeroMain.A08
            if (r0 == 0) goto L_0x0063
            java.lang.Object r11 = r0.A04(r1, r10)
        L_0x0060:
            if (r11 != r5) goto L_0x0068
            return r5
        L_0x0063:
            r11 = 0
            goto L_0x0060
        L_0x0065:
            X.0eS.A00(r11)
        L_0x0068:
            libraries.zero.headers.ZeroHeadersEntry r11 = (libraries.zero.headers.ZeroHeadersEntry) r11
            goto L_0x0087
        L_0x006b:
            int r0 = r0.intValue()     // Catch:{ 3EF -> 0x0086 }
            long r2 = (long) r0     // Catch:{ 3EF -> 0x0086 }
            java.lang.String r1 = r10.A05     // Catch:{ 3EF -> 0x0086 }
            com.instagram.bloks.extensions.plugins.bkactionzerotriggerheadersping.BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1$headersEntry$1 r0 = new com.instagram.bloks.extensions.plugins.bkactionzerotriggerheadersping.BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1$headersEntry$1     // Catch:{ 3EF -> 0x0086 }
            r0.<init>(r1, r8)     // Catch:{ 3EF -> 0x0086 }
            r10.A00 = r7     // Catch:{ 3EF -> 0x0086 }
            java.lang.Object r11 = X.I3P.A00(r10, r0, r2)     // Catch:{ 3EF -> 0x0086 }
            if (r11 != r5) goto L_0x0083
            goto L_0x00b1
        L_0x0080:
            X.0eS.A00(r11)     // Catch:{ 3EF -> 0x0086 }
        L_0x0083:
            libraries.zero.headers.ZeroHeadersEntry r11 = (libraries.zero.headers.ZeroHeadersEntry) r11     // Catch:{ 3EF -> 0x0086 }
            r8 = r11
        L_0x0086:
            r11 = r8
        L_0x0087:
            if (r11 == 0) goto L_0x009f
            X.4uI r2 = r10.A02
            java.lang.String r4 = r11.A03
        L_0x008d:
            X.6Rx r1 = r10.A01
            X.6Tl r0 = new X.6Tl
            r0.<init>()
            r0.A01(r4)
            X.6Tm r0 = r0.A00()
            X.C299275ur.A00(r1, r0, r2)
            goto L_0x00b5
        L_0x009f:
            boolean r0 = r10.A06
            if (r0 == 0) goto L_0x00ae
            java.lang.String r1 = r10.A04
            r10.A00 = r6
            goto L_0x003b
        L_0x00a8:
            X.0eS.A00(r11)
        L_0x00ab:
            if (r11 == 0) goto L_0x00ae
            r4 = r11
        L_0x00ae:
            X.4uI r2 = r10.A02
            goto L_0x008d
        L_0x00b1:
            return r5
        L_0x00b2:
            X.0eS.A00(r11)
        L_0x00b5:
            X.0gF r5 = X.C60340gF.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.bloks.extensions.plugins.bkactionzerotriggerheadersping.BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
