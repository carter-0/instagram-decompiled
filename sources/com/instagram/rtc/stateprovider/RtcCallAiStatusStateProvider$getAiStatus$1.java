package com.instagram.rtc.stateprovider;

import X.0sK;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.stateprovider.RtcCallAiStatusStateProvider$getAiStatus$1", f = "RtcCallAiStatusStateProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RtcCallAiStatusStateProvider$getAiStatus$1 extends AnonymousClass1Ek implements 0sK {
    public /* synthetic */ Object A00;
    public /* synthetic */ boolean A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcCallAiStatusStateProvider$getAiStatus$1(String str, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1a = AnonymousClass7TE.A1a(obj2);
        RtcCallAiStatusStateProvider$getAiStatus$1 rtcCallAiStatusStateProvider$getAiStatus$1 = new RtcCallAiStatusStateProvider$getAiStatus$1(this.A02, (AnonymousClass4D7) obj3);
        rtcCallAiStatusStateProvider$getAiStatus$1.A00 = obj;
        rtcCallAiStatusStateProvider$getAiStatus$1.A01 = A1a;
        return rtcCallAiStatusStateProvider$getAiStatus$1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r1 != null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.0eS.A00(r8)
            java.lang.Object r1 = r7.A00
            com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceState r1 = (com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceState) r1
            boolean r6 = r7.A01
            r5 = 1
            r2 = 0
            if (r1 == 0) goto L_0x0019
            com.facebook.rsys.metaaivoicestate.gen.MetaAiUserContent r0 = r1.userContent
            if (r0 == 0) goto L_0x0019
            com.facebook.rsys.metaaivoicestate.gen.MetaAiCaption r0 = r0.caption
            if (r0 == 0) goto L_0x0019
            java.lang.String r3 = r0.text
            if (r3 != 0) goto L_0x001d
        L_0x0019:
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x0024
        L_0x001d:
            int r0 = r1.state
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r0)
        L_0x0024:
            java.lang.String r4 = r7.A02
            X.N9M r1 = new X.N9M
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.stateprovider.RtcCallAiStatusStateProvider$getAiStatus$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
