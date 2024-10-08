package com.instagram.repository.storyhighlights;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C318476p0;
import X.C322986wk;
import X.C60340gF;
import android.content.Context;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.repository.storyhighlights.StoryHighlightsRepository$fetchStoryHighlights$1", f = "StoryHighlightsRepository.kt", i = {1}, l = {115, 128, 137}, m = "invokeSuspend", n = {"it"}, s = {"L$2"})
public final class StoryHighlightsRepository$fetchStoryHighlights$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final /* synthetic */ Context A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ C318476p0 A06;
    public final /* synthetic */ C322986wk A07;
    public final /* synthetic */ Boolean A08;
    public final /* synthetic */ Boolean A09;
    public final /* synthetic */ Boolean A0A;
    public final /* synthetic */ Integer A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryHighlightsRepository$fetchStoryHighlights$1(Context context, UserSession userSession, C318476p0 r4, C322986wk r5, Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, AnonymousClass4D7 r11, boolean z) {
        super(2, r11);
        this.A04 = context;
        this.A05 = userSession;
        this.A0C = str;
        this.A0D = z;
        this.A06 = r4;
        this.A0B = num;
        this.A0A = bool;
        this.A08 = bool2;
        this.A09 = bool3;
        this.A07 = r5;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.repository.storyhighlights.StoryHighlightsRepository$fetchStoryHighlights$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        Context context = this.A04;
        UserSession userSession = this.A05;
        String str = this.A0C;
        boolean z = this.A0D;
        C318476p0 r3 = this.A06;
        Integer num = this.A0B;
        return new StoryHighlightsRepository$fetchStoryHighlights$1(context, userSession, r3, this.A07, this.A0A, this.A08, this.A09, num, str, r14, z);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StoryHighlightsRepository$fetchStoryHighlights$1) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.4D7, com.instagram.repository.storyhighlights.StoryHighlightsRepository$fetchStoryHighlights$1] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r2 = r21
            X.1Hj r6 = X.1Hj.A02
            r7 = r20
            int r0 = r7.A00
            r5 = 3
            r4 = 1
            r1 = 0
            r8 = 2
            r3 = 0
            if (r0 == 0) goto L_0x0019
            if (r0 == r4) goto L_0x004a
            if (r0 == r8) goto L_0x007d
            X.0eS.A00(r2)
        L_0x0016:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0019:
            X.0eS.A00(r2)
            android.content.Context r11 = r7.A04
            com.instagram.common.session.UserSession r12 = r7.A05
            java.lang.String r9 = r7.A0C
            boolean r2 = r7.A0D
            X.6p0 r10 = r7.A06
            java.lang.Integer r0 = r7.A0B
            java.lang.Boolean r13 = r7.A0A
            java.lang.Boolean r14 = r7.A08
            java.lang.Boolean r15 = r7.A09
            r7.A00 = r4
            java.lang.Integer r16 = X.C318606pE.A00(r10)
            r19 = r2
            r18 = r9
            r17 = r0
            X.4Z5 r0 = X.AnonymousClass738.A05(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.1OC r2 = r0.A00
            r0 = 921724331(0x36f065ab, float:7.164393E-6)
            java.lang.Object r2 = r2.A02(r7, r0, r5, r1)
            if (r2 != r6) goto L_0x004d
            return r6
        L_0x004a:
            X.0eS.A00(r2)
        L_0x004d:
            X.3Ii r2 = (X.C239803Ii) r2
            X.6wk r11 = r7.A07
            com.instagram.common.session.UserSession r9 = r7.A05
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0073
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r10 = r2.A00
            X.3HO r10 = (X.AnonymousClass3HO) r10
            X.0V2 r2 = r11.A00
            X.6pU r0 = new X.6pU
            r0.<init>(r10, r4)
            r7.A01 = r11
            r7.A02 = r9
            r7.A03 = r10
            r7.A00 = r8
            java.lang.Object r0 = r2.emit(r0, r7)
            if (r0 != r6) goto L_0x0088
            return r6
        L_0x0073:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00bd
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x007d:
            java.lang.Object r10 = r7.A03
            X.3HO r10 = (X.AnonymousClass3HO) r10
            java.lang.Object r9 = r7.A02
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            X.0eS.A00(r2)
        L_0x0088:
            X.3Ia r0 = r10.FH3()
            java.util.List r0 = r0.A0J
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r0 = X.00k.A0O(r0, r1)
            X.3HY r0 = (X.AnonymousClass3HY) r0
            if (r0 == 0) goto L_0x00b6
            java.lang.String r8 = r0.getId()
            if (r8 == 0) goto L_0x00b6
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324737445998894(0x810d280007312e, double:3.0352484566025554E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x00b6
            X.3PP r2 = X.AnonymousClass3PO.A00(r9)
            java.lang.String r1 = "profile"
            X.3BU r0 = X.AnonymousClass3BU.FOREGROUND_PREFETCH
            r2.A02(r0, r8, r1, r3)
        L_0x00b6:
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r2 = new X.3Ih
            r2.<init>(r0)
        L_0x00bd:
            X.6wk r1 = r7.A07
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0016
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00e3
            X.5sO r2 = (X.C297815sO) r2
            java.lang.Object r2 = r2.A00
            X.4dm r2 = (X.C268654dm) r2
            X.0V2 r1 = r1.A00
            X.KXD r0 = new X.KXD
            r0.<init>(r2, r4)
            r7.A01 = r3
            r7.A02 = r3
            r7.A03 = r3
            r7.A00 = r5
            java.lang.Object r0 = r1.emit(r0, r7)
            if (r0 != r6) goto L_0x0016
            return r6
        L_0x00e3:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.storyhighlights.StoryHighlightsRepository$fetchStoryHighlights$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
