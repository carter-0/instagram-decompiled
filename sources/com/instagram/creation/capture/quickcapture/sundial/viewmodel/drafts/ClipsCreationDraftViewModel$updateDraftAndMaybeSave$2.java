package com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts;

import X.0sL;
import X.0sP;
import X.AnonymousClass1Ek;
import X.AnonymousClass3QO;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass88B;
import X.AnonymousClass8DO;
import X.C2801950r;
import X.C3499582p;
import X.C353828Ji;
import X.C354048Kl;
import X.C357458Xy;
import X.C357638Yz;
import X.C366678pU;
import X.C366688pV;
import X.C60340gF;
import X.C62320sa;
import com.instagram.api.schemas.ACRType;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2", f = "ClipsCreationDraftViewModel.kt", i = {0}, l = {912, 962, 964}, m = "invokeSuspend", n = {"mutation"}, s = {"L$0"})
public final class ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final /* synthetic */ ACRType A02;
    public final /* synthetic */ C357638Yz A03;
    public final /* synthetic */ C353828Ji A04;
    public final /* synthetic */ TargetViewSizeProvider A05;
    public final /* synthetic */ C3499582p A06;
    public final /* synthetic */ AnonymousClass8DO A07;
    public final /* synthetic */ C354048Kl A08;
    public final /* synthetic */ C366678pU A09;
    public final /* synthetic */ C366688pV A0A;
    public final /* synthetic */ ClipsCreationDraftViewModel A0B;
    public final /* synthetic */ C2801950r A0C;
    public final /* synthetic */ C357458Xy A0D;
    public final /* synthetic */ AnonymousClass88B A0E;
    public final /* synthetic */ AnonymousClass3QO A0F;
    public final /* synthetic */ AudioOverlayTrack A0G;
    public final /* synthetic */ Boolean A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ String A0J;
    public final /* synthetic */ String A0K;
    public final /* synthetic */ String A0L;
    public final /* synthetic */ String A0M;
    public final /* synthetic */ String A0N;
    public final /* synthetic */ List A0O;
    public final /* synthetic */ C62320sa A0P;
    public final /* synthetic */ C62320sa A0Q;
    public final /* synthetic */ C62320sa A0R;
    public final /* synthetic */ C62320sa A0S;
    public final /* synthetic */ C62320sa A0T;
    public final /* synthetic */ C62320sa A0U;
    public final /* synthetic */ C62320sa A0V;
    public final /* synthetic */ C62320sa A0W;
    public final /* synthetic */ C62320sa A0X;
    public final /* synthetic */ C62320sa A0Y;
    public final /* synthetic */ C62320sa A0Z;
    public final /* synthetic */ 0sP A0a;
    public final /* synthetic */ 0sP A0b;
    public final /* synthetic */ boolean A0c;
    public final /* synthetic */ boolean A0d;
    public final /* synthetic */ boolean A0e;
    public final /* synthetic */ boolean A0f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2(ACRType aCRType, C357638Yz r4, C353828Ji r5, TargetViewSizeProvider targetViewSizeProvider, C3499582p r7, AnonymousClass8DO r8, C354048Kl r9, C366678pU r10, C366688pV r11, ClipsCreationDraftViewModel clipsCreationDraftViewModel, C2801950r r13, C357458Xy r14, AnonymousClass88B r15, AnonymousClass3QO r16, AudioOverlayTrack audioOverlayTrack, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, List list, AnonymousClass4D7 r26, C62320sa r27, C62320sa r28, C62320sa r29, C62320sa r30, C62320sa r31, C62320sa r32, C62320sa r33, C62320sa r34, C62320sa r35, C62320sa r36, C62320sa r37, 0sP r38, 0sP r39, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2, r26);
        this.A0B = clipsCreationDraftViewModel;
        this.A0C = r13;
        this.A0e = z;
        this.A0a = r38;
        this.A0D = r14;
        this.A03 = r4;
        this.A0E = r15;
        this.A0W = r27;
        this.A0A = r11;
        this.A0G = audioOverlayTrack;
        this.A0f = z2;
        this.A0J = str;
        this.A0X = r28;
        this.A0R = r29;
        this.A0K = str2;
        this.A0V = r30;
        this.A09 = r10;
        this.A0U = r31;
        this.A06 = r7;
        this.A0Y = r32;
        this.A04 = r5;
        this.A07 = r8;
        this.A08 = r9;
        this.A05 = targetViewSizeProvider;
        this.A0I = str3;
        this.A0T = r33;
        this.A0b = r39;
        this.A0Q = r34;
        this.A0S = r35;
        this.A0Z = r36;
        this.A0P = r37;
        this.A02 = aCRType;
        this.A0d = z3;
        this.A0F = r16;
        this.A0M = str4;
        this.A0L = str5;
        this.A0c = z4;
        this.A0N = str6;
        this.A0H = bool;
        this.A0O = list;
    }

    /* JADX WARNING: type inference failed for: r16v0, types: [com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r66) {
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = this.A0B;
        C2801950r r62 = this.A0C;
        boolean z = this.A0e;
        0sP r52 = this.A0a;
        C357458Xy r61 = this.A0D;
        C357638Yz r60 = this.A03;
        AnonymousClass88B r59 = this.A0E;
        C62320sa r41 = this.A0W;
        C366688pV r58 = this.A0A;
        AudioOverlayTrack audioOverlayTrack = this.A0G;
        boolean z2 = this.A0f;
        String str = this.A0J;
        C62320sa r28 = this.A0X;
        C62320sa r27 = this.A0R;
        String str2 = this.A0K;
        C62320sa r25 = this.A0V;
        C366678pU r24 = this.A09;
        C62320sa r18 = this.A0U;
        C3499582p r21 = this.A06;
        C62320sa r17 = this.A0Y;
        C353828Ji r19 = this.A04;
        AnonymousClass8DO r22 = this.A07;
        C354048Kl r23 = this.A08;
        TargetViewSizeProvider targetViewSizeProvider = this.A05;
        String str3 = this.A0I;
        C62320sa r14 = this.A0T;
        0sP r13 = this.A0b;
        C62320sa r12 = this.A0Q;
        C62320sa r11 = this.A0S;
        C62320sa r10 = this.A0Z;
        C62320sa r9 = this.A0P;
        ACRType aCRType = this.A02;
        boolean z3 = this.A0d;
        AnonymousClass3QO r6 = this.A0F;
        String str4 = this.A0M;
        String str5 = this.A0L;
        boolean z4 = this.A0c;
        String str6 = this.A0N;
        String str7 = str;
        String str8 = str2;
        return new ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2(aCRType, r60, r19, targetViewSizeProvider, r21, r22, r23, r24, r58, clipsCreationDraftViewModel, r62, r61, r59, r6, audioOverlayTrack, this.A0H, str7, str8, str3, str4, str5, str6, this.A0O, r66, r41, r28, r27, r25, r18, r17, r14, r12, r11, r10, r9, r52, r13, z, z2, z3, z4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v0, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.0rm} */
    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2, X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x012c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r59) {
        /*
            r58 = this;
            X.1Hj r5 = X.1Hj.A02
            r6 = r58
            int r0 = r6.A00
            r7 = 3
            r4 = 2
            r9 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0014
            if (r0 == r9) goto L_0x0108
            X.0eS.A00(r59)
        L_0x0011:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0014:
            X.0eS.A00(r59)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r8 = r6.A0B
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A00(r8)
            if (r0 != 0) goto L_0x0028
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r2 = r8.A0H
            X.50r r1 = r6.A0C
            X.3QO r0 = r8.A01
            r2.A0P(r1, r0)
        L_0x0028:
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A00(r8)
            if (r0 == 0) goto L_0x0105
            X.JXu r1 = r0.A0G
        L_0x0030:
            X.JXu r0 = X.JXu.A02
            if (r1 != r0) goto L_0x0036
            r8.A02 = r9
        L_0x0036:
            X.0rm r1 = new X.0rm
            r1.<init>()
            X.12T r2 = X.AnonymousClass12T.A00
            r0 = 480314591(0x1ca104df, float:1.0655345E-21)
            X.0nV r2 = r2.CO6(r0, r7)
            X.8Xy r0 = r6.A0D
            r21 = r0
            X.8Yz r0 = r6.A03
            r57 = r0
            X.88B r0 = r6.A0E
            r22 = r0
            X.0sa r0 = r6.A0W
            r34 = r0
            X.8pV r0 = r6.A0A
            r56 = r0
            com.instagram.music.common.model.AudioOverlayTrack r0 = r6.A0G
            r24 = r0
            boolean r0 = r6.A0f
            r47 = r0
            java.lang.String r0 = r6.A0J
            r26 = r0
            X.0sa r0 = r6.A0X
            r35 = r0
            X.0sa r0 = r6.A0R
            r36 = r0
            java.lang.String r0 = r6.A0K
            r27 = r0
            X.0sa r0 = r6.A0V
            r37 = r0
            X.8pU r0 = r6.A09
            r55 = r0
            X.0sa r0 = r6.A0U
            r38 = r0
            X.82p r0 = r6.A06
            r54 = r0
            X.0sa r0 = r6.A0Y
            r39 = r0
            X.8Ji r0 = r6.A04
            r53 = r0
            X.8DO r0 = r6.A07
            r52 = r0
            X.8Kl r0 = r6.A08
            r51 = r0
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r6.A05
            r50 = r0
            java.lang.String r0 = r6.A0I
            r28 = r0
            X.0sa r0 = r6.A0T
            r40 = r0
            X.0sP r0 = r6.A0b
            r45 = r0
            X.0sa r0 = r6.A0Q
            r41 = r0
            X.0sa r0 = r6.A0S
            r42 = r0
            X.0sa r0 = r6.A0Z
            r20 = r0
            X.0sa r0 = r6.A0P
            r19 = r0
            com.instagram.api.schemas.ACRType r0 = r6.A02
            r18 = r0
            boolean r0 = r6.A0d
            r17 = r0
            X.3QO r0 = r6.A0F
            r16 = r0
            java.lang.String r15 = r6.A0M
            java.lang.String r14 = r6.A0L
            boolean r13 = r6.A0c
            java.lang.String r12 = r6.A0N
            java.lang.Boolean r11 = r6.A0H
            java.util.List r10 = r6.A0O
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2$1 r0 = new com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2$1
            r23 = r16
            r25 = r11
            r29 = r15
            r30 = r14
            r31 = r12
            r32 = r10
            r33 = r3
            r43 = r20
            r44 = r19
            r46 = r1
            r48 = r17
            r49 = r13
            r10 = r0
            r11 = r18
            r12 = r57
            r13 = r53
            r14 = r50
            r15 = r54
            r16 = r52
            r17 = r51
            r18 = r55
            r19 = r56
            r20 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            r6.A01 = r1
            r6.A00 = r9
            java.lang.Object r0 = X.1Eo.A00(r6, r2, r0)
            if (r0 != r5) goto L_0x010f
            return r5
        L_0x0105:
            r1 = r3
            goto L_0x0030
        L_0x0108:
            java.lang.Object r1 = r6.A01
            X.0rm r1 = (X.0rm) r1
            X.0eS.A00(r59)
        L_0x010f:
            boolean r2 = r6.A0e
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r0 = r6.A0B
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r8 = r0.A0H
            java.lang.Object r9 = r1.A00
            X.B1S r9 = (X.B1S) r9
            if (r2 == 0) goto L_0x012d
            X.0sP r0 = r6.A0a
            r6.A01 = r3
            r6.A00 = r4
            r13 = 0
            r10 = r3
            r11 = r6
            r12 = r0
            r14 = r13
            java.lang.Object r0 = r8.A0F(r9, r10, r11, r12, r13, r14)
        L_0x012a:
            if (r0 != r5) goto L_0x0011
            return r5
        L_0x012d:
            r6.A01 = r3
            r6.A00 = r7
            r0 = 0
            java.lang.Object r0 = r8.A0G(r9, r6, r0)
            goto L_0x012a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
