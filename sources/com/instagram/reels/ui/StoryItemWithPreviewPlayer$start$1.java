package com.instagram.reels.ui;

import X.0sL;
import X.AnonymousClass0iw;
import X.AnonymousClass1Ek;
import X.AnonymousClass3BT;
import X.AnonymousClass3V3;
import X.AnonymousClass3W1;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C17718Vcn;
import X.C241103Nw;
import X.C263414Lx;
import X.C296845qj;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.reels.ui.StoryItemWithPreviewPlayer$start$1", f = "StoryItemWithPreviewPlayer.kt", i = {0}, l = {201}, m = "invokeSuspend", n = {"allItems"}, s = {"L$0"})
public final class StoryItemWithPreviewPlayer$start$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public boolean A0B;
    public final /* synthetic */ int A0C;
    public final /* synthetic */ AnonymousClass0iw A0D;
    public final /* synthetic */ AnonymousClass3V3 A0E;
    public final /* synthetic */ AnonymousClass3W1 A0F;
    public final /* synthetic */ AnonymousClass3BT A0G;
    public final /* synthetic */ C296845qj A0H;
    public final /* synthetic */ C17718Vcn A0I;
    public final /* synthetic */ C241103Nw A0J;
    public final /* synthetic */ C263414Lx A0K;
    public final /* synthetic */ boolean A0L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryItemWithPreviewPlayer$start$1(AnonymousClass0iw r2, AnonymousClass3V3 r3, AnonymousClass3W1 r4, AnonymousClass3BT r5, C296845qj r6, C17718Vcn vcn, C241103Nw r8, C263414Lx r9, AnonymousClass4D7 r10, int i, boolean z) {
        super(2, r10);
        this.A0G = r5;
        this.A0H = r6;
        this.A0C = i;
        this.A0J = r8;
        this.A0E = r3;
        this.A0I = vcn;
        this.A0F = r4;
        this.A0L = z;
        this.A0K = r9;
        this.A0D = r2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.reels.ui.StoryItemWithPreviewPlayer$start$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        AnonymousClass3BT r4 = this.A0G;
        C296845qj r5 = this.A0H;
        int i = this.A0C;
        C241103Nw r7 = this.A0J;
        AnonymousClass3V3 r2 = this.A0E;
        C17718Vcn vcn = this.A0I;
        AnonymousClass3W1 r3 = this.A0F;
        boolean z = this.A0L;
        return new StoryItemWithPreviewPlayer$start$1(this.A0D, r2, r3, r4, r5, vcn, r7, this.A0K, r14, i, z);
    }

    /* JADX WARNING: type inference failed for: r23v1, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            r34 = this;
            X.1Hj r13 = X.1Hj.A02
            r14 = r34
            int r0 = r14.A00
            if (r0 == 0) goto L_0x00dc
            boolean r1 = r14.A0B
            java.lang.Object r12 = r14.A0A
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r11 = r14.A09
            X.0iw r11 = (X.AnonymousClass0iw) r11
            java.lang.Object r10 = r14.A08
            X.4Lx r10 = (X.C263414Lx) r10
            java.lang.Object r9 = r14.A07
            X.3W1 r9 = (X.AnonymousClass3W1) r9
            java.lang.Object r8 = r14.A06
            X.5qj r8 = (X.C296845qj) r8
            java.lang.Object r7 = r14.A05
            X.Vcn r7 = (X.C17718Vcn) r7
            java.lang.Object r6 = r14.A04
            X.3V3 r6 = (X.AnonymousClass3V3) r6
            java.lang.Object r5 = r14.A03
            X.3BT r5 = (X.AnonymousClass3BT) r5
            java.lang.Object r4 = r14.A02
            X.3Nw r4 = (X.C241103Nw) r4
            java.lang.Object r3 = r14.A01
            java.util.List r3 = (java.util.List) r3
            X.0eS.A00(r35)
        L_0x0035:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0117
            java.lang.Object r2 = r12.next()
            X.3uh r2 = (X.C255773uh) r2
            X.3BT r0 = r4.A02
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x0126
            int r16 = r3.indexOf(r2)
            r0 = r6
            X.3rq r0 = (X.C254043rq) r0
            r33 = r0
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r15 = r0.A02
            if (r15 == 0) goto L_0x005b
            r0 = r16
            r15.setCurrentSegment(r0)
        L_0x005b:
            android.content.Context r0 = r7.A01
            r32 = r0
            com.instagram.common.session.UserSession r0 = r7.A03
            r31 = r0
            X.3Nw r0 = r7.A09
            r24 = r0
            X.3BT r0 = r7.A05
            r30 = r0
            int r0 = r7.A00
            r29 = r0
            X.3BT r0 = r7.A06
            r21 = r0
            X.2pG r0 = r7.A0A
            r20 = r0
            java.util.List r0 = r7.A0D
            r19 = r0
            java.lang.String r0 = r7.A0C
            r17 = r0
            java.lang.Integer r0 = r7.A0B
            r16 = r0
            X.5kP r0 = r7.A08
            r15 = r0
            X.3O9 r0 = r7.A04
            r18 = r0
            X.5qj r0 = r7.A07
            r22 = r0
            X.0iw r0 = r7.A02
            r23 = r15
            r25 = r20
            r26 = r16
            r27 = r17
            r28 = r19
            r15 = r32
            r16 = r0
            r17 = r31
            r19 = r2
            r20 = r30
            X.C294515ma.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            com.instagram.model.reels.Reel r0 = r5.A03
            r17 = r0
            r14.A01 = r3
            r14.A02 = r4
            r14.A03 = r5
            r14.A04 = r6
            r14.A05 = r7
            r14.A06 = r8
            r14.A07 = r9
            r14.A08 = r10
            r14.A09 = r11
            r14.A0A = r12
            r14.A0B = r1
            r0 = 1
            r14.A00 = r0
            r15 = r11
            r16 = r9
            r18 = r2
            r19 = r5
            r20 = r33
            r21 = r8
            r22 = r10
            r23 = r14
            r24 = r1
            java.lang.Object r0 = X.C296845qj.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            if (r0 != r13) goto L_0x0035
            return r13
        L_0x00dc:
            X.0eS.A00(r35)
            X.3BT r5 = r14.A0G
            X.5qj r8 = r14.A0H
            com.instagram.common.session.UserSession r1 = r8.A02
            r4 = 0
            com.instagram.model.reels.Reel r0 = r5.A03
            java.util.List r3 = r0.A0O(r1)
            X.0qQ.A07(r3)
            int r2 = r0.A03(r1)
            int r0 = r3.size()
            java.util.List r1 = r3.subList(r2, r0)
            java.util.List r0 = r3.subList(r4, r2)
            java.util.ArrayList r0 = X.00k.A0S(r0, r1)
            X.3Nw r4 = r14.A0J
            X.3V3 r6 = r14.A0E
            X.Vcn r7 = r14.A0I
            X.3W1 r9 = r14.A0F
            boolean r1 = r14.A0L
            X.4Lx r10 = r14.A0K
            X.0iw r11 = r14.A0D
            java.util.Iterator r12 = r0.iterator()
            goto L_0x0035
        L_0x0117:
            X.5qj r0 = r14.A0H
            X.Vgq r0 = r0.A05
            int r2 = r14.A0C
            X.3rs r0 = r0.A01
            androidx.recyclerview.widget.RecyclerView r1 = r0.A08
            int r0 = r2 + 1
            r1.A0p(r0)
        L_0x0126:
            X.0gF r13 = X.C60340gF.A00
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.ui.StoryItemWithPreviewPlayer$start$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StoryItemWithPreviewPlayer$start$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
