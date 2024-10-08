package com.instagram.repository.storyhighlights;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C322986wk;
import X.C60340gF;
import android.content.Context;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.repository.storyhighlights.StoryHighlightsRepository$fetchMoreStoryHighlights$1", f = "StoryHighlightsRepository.kt", i = {}, l = {193, 204, 205}, m = "invokeSuspend", n = {}, s = {})
public final class StoryHighlightsRepository$fetchMoreStoryHighlights$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C322986wk A03;
    public final /* synthetic */ Boolean A04;
    public final /* synthetic */ Boolean A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryHighlightsRepository$fetchMoreStoryHighlights$1(Context context, UserSession userSession, C322986wk r4, Boolean bool, Boolean bool2, Integer num, String str, String str2, String str3, AnonymousClass4D7 r11, boolean z) {
        super(2, r11);
        this.A01 = context;
        this.A02 = userSession;
        this.A09 = str;
        this.A08 = str2;
        this.A0A = z;
        this.A06 = num;
        this.A07 = str3;
        this.A05 = bool;
        this.A04 = bool2;
        this.A03 = r4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.repository.storyhighlights.StoryHighlightsRepository$fetchMoreStoryHighlights$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        Context context = this.A01;
        UserSession userSession = this.A02;
        String str = this.A09;
        String str2 = this.A08;
        boolean z = this.A0A;
        Integer num = this.A06;
        String str3 = this.A07;
        return new StoryHighlightsRepository$fetchMoreStoryHighlights$1(context, userSession, this.A03, this.A05, this.A04, num, str, str2, str3, r14, z);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.4D7, com.instagram.repository.storyhighlights.StoryHighlightsRepository$fetchMoreStoryHighlights$1] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r2 = r26
            X.1Hj r10 = X.1Hj.A02
            r11 = r25
            int r0 = r11.A00
            r9 = 0
            r8 = 3
            r7 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0018
            if (r0 == r1) goto L_0x00be
            if (r0 == r7) goto L_0x00e8
            X.0eS.A00(r2)
        L_0x0015:
            X.0gF r10 = X.C60340gF.A00
            return r10
        L_0x0018:
            X.0eS.A00(r2)
            android.content.Context r14 = r11.A01
            com.instagram.common.session.UserSession r13 = r11.A02
            java.lang.String r2 = r11.A09
            java.lang.String r6 = r11.A08
            boolean r0 = r11.A0A
            r18 = r0
            java.lang.Integer r15 = r11.A06
            java.lang.String r12 = r11.A07
            java.lang.Boolean r5 = r11.A05
            java.lang.Boolean r4 = r11.A04
            r11.A00 = r1
            r17 = 0
            X.0qQ.A0B(r14, r9)
            X.0qQ.A0B(r13, r1)
            X.0qQ.A0B(r2, r7)
            r0 = 727(0x2d7, float:1.019E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.String r0 = "/paginated_highlights_tray/"
            java.lang.String r1 = X.002.A0g(r1, r2, r0)
            java.lang.String r22 = X.AnonymousClass7TG.A0j()
            X.1NY r3 = X.AnonymousClass7TG.A0b(r13)
            r3.A0A(r1)
            java.lang.Integer r16 = X.AnonymousClass05K.A01
            r0 = r16
            r3.A07(r0)
            r3.A0A = r1
            java.lang.Class<X.3HO> r2 = X.AnonymousClass3HO.class
            java.lang.Class<X.1NR> r1 = X.AnonymousClass1NR.class
            r0 = r17
            r3.A0O(r0, r2, r1, r9)
            android.util.Pair r0 = X.C278474ww.A00(r13)
            java.lang.Object r1 = r0.first
            X.0qQ.A06(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            r3.A0G(r1, r0)
            if (r18 == 0) goto L_0x0081
            X.1Cn r0 = new X.1Cn
            r0.<init>(r14)
            X.1G2.A00(r14, r3, r13, r0, r9)
        L_0x0081:
            r0 = 809(0x329, float:1.134E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.A09(r15, r0)
            java.lang.String r0 = "cursor"
            r3.A0G(r0, r12)
            java.lang.String r0 = "fetch_high_res_cover_image"
            r3.A0E(r0, r5)
            java.lang.String r0 = "only_fetch_archived_highlights"
            r3.A0E(r0, r4)
            X.1OC r18 = r3.A0M()
            if (r6 != 0) goto L_0x00a1
            java.lang.String r6 = ""
        L_0x00a1:
            java.lang.Integer r20 = X.AnonymousClass05K.A15
            java.lang.Integer r21 = X.AnonymousClass05K.A0C
            X.4Z5 r0 = new X.4Z5
            r23 = r6
            r24 = r17
            r19 = r16
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            X.1OC r1 = r0.A00
            r0 = 921724331(0x36f065ab, float:7.164393E-6)
            java.lang.Object r2 = r1.A02(r11, r0, r8, r9)
            if (r2 != r10) goto L_0x00c1
            return r10
        L_0x00be:
            X.0eS.A00(r2)
        L_0x00c1:
            X.3Ii r2 = (X.C239803Ii) r2
            X.6wk r1 = r11.A03
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00df
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r2 = r2.A00
            X.3HO r2 = (X.AnonymousClass3HO) r2
            X.0V2 r1 = r1.A00
            X.6pU r0 = new X.6pU
            r0.<init>(r2, r9)
            r11.A00 = r7
            java.lang.Object r0 = r1.emit(r0, r11)
            if (r0 != r10) goto L_0x00eb
            return r10
        L_0x00df:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00ef
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00e8:
            X.0eS.A00(r2)
        L_0x00eb:
            X.3Ih r2 = X.C51967G9n.A0d()
        L_0x00ef:
            X.6wk r1 = r11.A03
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0015
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x010d
            X.4dm r2 = X.JTP.A0N(r2)
            X.0V2 r1 = r1.A00
            X.KXD r0 = new X.KXD
            r0.<init>(r2, r9)
            r11.A00 = r8
            java.lang.Object r0 = r1.emit(r0, r11)
            if (r0 != r10) goto L_0x0015
            return r10
        L_0x010d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.storyhighlights.StoryHighlightsRepository$fetchMoreStoryHighlights$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StoryHighlightsRepository$fetchMoreStoryHighlights$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
