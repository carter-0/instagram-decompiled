package X;

import com.instagram.android.R;
import com.instagram.user.model.User;

/* renamed from: X.3et  reason: invalid class name and case insensitive filesystem */
public final class C246613et extends AnonymousClass0T0 {
    public final float A00;
    public final float A01;
    public final AnonymousClass9IE A02;
    public final AnonymousClass9IZ A03;
    public final AnonymousClass9J3 A04;
    public final C246643ew A05;
    public final C231672s5 A06;
    public final C246653ex A07;
    public final AnonymousClass3ZH A08;
    public final C246523ek A09;
    public final C246603es A0A;
    public final C246553en A0B;
    public final C246483eg A0C;
    public final C246633ev A0D;
    public final AnonymousClass3W1 A0E;
    public final C245853da A0F;
    public final AnonymousClass3TO A0G;
    public final User A0H;
    public final String A0I;
    public final String A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final C67231sQ A0U;
    public final C246623eu A0V;
    public final String A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C246613et) {
                C246613et r5 = (C246613et) obj;
                if (!0qQ.A0K(this.A0J, r5.A0J) || !0qQ.A0K(this.A0H, r5.A0H) || this.A0R != r5.A0R || this.A0P != r5.A0P || this.A0L != r5.A0L || this.A0c != r5.A0c || this.A0a != r5.A0a || this.A0O != r5.A0O || this.A0N != r5.A0N || this.A0Q != r5.A0Q || this.A0S != r5.A0S || this.A0b != r5.A0b || this.A0Y != r5.A0Y || this.A0K != r5.A0K || this.A0Z != r5.A0Z || this.A0X != r5.A0X || Float.compare(this.A00, r5.A00) != 0 || !0qQ.A0K(this.A0V, r5.A0V) || Float.compare(this.A01, r5.A01) != 0 || this.A0M != r5.A0M || !0qQ.A0K(this.A0U, r5.A0U) || !0qQ.A0K(this.A0I, r5.A0I) || !0qQ.A0K(this.A0W, r5.A0W) || this.A0G != r5.A0G || this.A0F != r5.A0F || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A0A, r5.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaViewUiState(mediaId=");
        sb.append(this.A0J);
        sb.append(", user=");
        sb.append(this.A0H);
        sb.append(", isVideo=");
        sb.append(this.A0R);
        sb.append(", isReelMedia=");
        sb.append(this.A0P);
        sb.append(", isClipMedia=");
        sb.append(this.A0L);
        sb.append(", isIGTVMedia=");
        sb.append(this.A0c);
        sb.append(", isAdVideo=");
        sb.append(this.A0a);
        sb.append(", isPlayableMedia=");
        sb.append(this.A0O);
        sb.append(", isMediaCovered=");
        sb.append(this.A0N);
        sb.append(AnonymousClass000.A00(847));
        sb.append(this.A0Q);
        sb.append(", isViolatingBrandedContentPolicy=");
        sb.append(this.A0S);
        sb.append(", isEventReminderEnabled=");
        sb.append(this.A0b);
        sb.append(", hasPeopleTags=");
        sb.append(this.A0Y);
        sb.append(", hasAllProductTags=");
        sb.append(this.A0K);
        sb.append(", hasProductTags=");
        sb.append(this.A0Z);
        sb.append(", hasMediaCroppingInfo=");
        sb.append(this.A0X);
        sb.append(C66579MXk.A00(77));
        sb.append(this.A00);
        sb.append(AnonymousClass000.A00(2054));
        sb.append(this.A0V);
        sb.append(", renderAspectRatio=");
        sb.append(this.A01);
        sb.append(", isClipMediaEligibleForFullAspectRatioRender=");
        sb.append(this.A0M);
        sb.append(", clipsMetadata=");
        sb.append(this.A0U);
        sb.append(", colorPreviewHex=");
        sb.append(this.A0I);
        sb.append(", standaloneFundraiserId=");
        sb.append(this.A0W);
        sb.append(", videoIconState=");
        sb.append(this.A0G);
        sb.append(", videoPlayButtonState=");
        sb.append(this.A0F);
        sb.append(", viewSimilarUiState=");
        sb.append(this.A03);
        sb.append(", mediaOverlayBlurredCoverUiState=");
        sb.append(this.A0D);
        sb.append(", informBloksPayload=");
        sb.append(this.A05);
        sb.append(", mediaVideoScrubberUiState=");
        sb.append(this.A0C);
        sb.append(", mediaLargerCTABufferUiState=");
        sb.append(this.A04);
        sb.append(", brandedContentViolationBannerUiState=");
        sb.append(this.A02);
        sb.append(", floatingBubblesUiState=");
        sb.append(this.A07);
        sb.append(", textOverlayUiState=");
        sb.append(this.A09);
        sb.append(", midNudgeUiState=");
        sb.append(this.A0B);
        sb.append(AnonymousClass000.A00(2021));
        sb.append(this.A06);
        sb.append(AnonymousClass000.A00(202));
        sb.append(this.A0E);
        sb.append(", immutableMedia=");
        sb.append(this.A08);
        sb.append(", actions=");
        sb.append(this.A0A);
        sb.append(')');
        return sb.toString();
    }

    public final int A00() {
        C246603es r2 = this.A0A;
        C62320sa r1 = r2.A0E;
        if (((Boolean) r1.invoke()).booleanValue() && ((Boolean) r2.A0D.invoke()).booleanValue()) {
            return R.dimen.audio_page_audio_filter_tooltip_vertical_offset;
        }
        if (((Boolean) r2.A0D.invoke()).booleanValue()) {
            return R.dimen.abc_alert_dialog_button_dimen;
        }
        if (((Boolean) r1.invoke()).booleanValue()) {
            return R.dimen.ad4ad_button_bottom_margin;
        }
        return R.dimen.abc_button_padding_horizontal_material;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12 = this.A0J.hashCode() * 31;
        User user = this.A0H;
        int i = 0;
        if (user == null) {
            hashCode = 0;
        } else {
            hashCode = user.hashCode();
        }
        int i2 = (hashCode12 + hashCode) * 31;
        int i3 = 1237;
        if (this.A0R) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0P) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0L) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0c) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A0a) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0O) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        int i15 = 1237;
        if (this.A0N) {
            i15 = 1231;
        }
        int i16 = (i14 + i15) * 31;
        int i17 = 1237;
        if (this.A0Q) {
            i17 = 1231;
        }
        int i18 = (i16 + i17) * 31;
        int i19 = 1237;
        if (this.A0S) {
            i19 = 1231;
        }
        int i20 = (i18 + i19) * 31;
        int i21 = 1237;
        if (this.A0b) {
            i21 = 1231;
        }
        int i22 = (i20 + i21) * 31;
        int i23 = 1237;
        if (this.A0Y) {
            i23 = 1231;
        }
        int i24 = (i22 + i23) * 31;
        int i25 = 1237;
        if (this.A0K) {
            i25 = 1231;
        }
        int i26 = (i24 + i25) * 31;
        int i27 = 1237;
        if (this.A0Z) {
            i27 = 1231;
        }
        int i28 = (i26 + i27) * 31;
        int i29 = 1237;
        if (this.A0X) {
            i29 = 1231;
        }
        int floatToIntBits = (((i28 + i29) * 31) + Float.floatToIntBits(this.A00)) * 31;
        C246623eu r0 = this.A0V;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        int floatToIntBits2 = (((floatToIntBits + hashCode2) * 31) + Float.floatToIntBits(this.A01)) * 31;
        int i30 = 1237;
        if (this.A0M) {
            i30 = 1231;
        }
        int i31 = (floatToIntBits2 + i30) * 31;
        C67231sQ r02 = this.A0U;
        if (r02 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r02.hashCode();
        }
        int i32 = (i31 + hashCode3) * 31;
        String str = this.A0I;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int i33 = (i32 + hashCode4) * 31;
        String str2 = this.A0W;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int hashCode13 = (((((((i33 + hashCode5) * 31) + this.A0G.hashCode()) * 31) + this.A0F.hashCode()) * 31) + this.A03.hashCode()) * 31;
        C246633ev r03 = this.A0D;
        if (r03 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = r03.hashCode();
        }
        int i34 = (hashCode13 + hashCode6) * 31;
        C246643ew r04 = this.A05;
        if (r04 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = r04.hashCode();
        }
        int i35 = (i34 + hashCode7) * 31;
        C246483eg r05 = this.A0C;
        if (r05 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = r05.hashCode();
        }
        int i36 = (i35 + hashCode8) * 31;
        AnonymousClass9J3 r06 = this.A04;
        if (r06 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = r06.hashCode();
        }
        int hashCode14 = (((i36 + hashCode9) * 31) + this.A02.hashCode()) * 31;
        C246653ex r07 = this.A07;
        if (r07 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = r07.hashCode();
        }
        int i37 = (hashCode14 + hashCode10) * 31;
        C246523ek r08 = this.A09;
        if (r08 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = r08.hashCode();
        }
        int i38 = (i37 + hashCode11) * 31;
        C246553en r09 = this.A0B;
        if (r09 != null) {
            i = r09.hashCode();
        }
        return ((((((((i38 + i) * 31) + this.A06.hashCode()) * 31) + this.A0E.hashCode()) * 31) + this.A08.hashCode()) * 31) + this.A0A.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0099, code lost:
        if (((java.lang.Boolean) r14.A0B.invoke()).booleanValue() != false) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C246613et(X.AnonymousClass9IE r4, X.AnonymousClass9IZ r5, X.AnonymousClass9J3 r6, X.C67231sQ r7, X.C246643ew r8, X.C231672s5 r9, X.C246653ex r10, X.C246623eu r11, X.AnonymousClass3ZH r12, X.C246523ek r13, X.C246603es r14, X.C246553en r15, X.C246483eg r16, X.C246633ev r17, X.AnonymousClass3W1 r18, X.C245853da r19, X.AnonymousClass3TO r20, com.instagram.user.model.User r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, float r25, float r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40, boolean r41) {
        /*
            r3 = this;
            r0 = 35
            X.0qQ.A0B(r9, r0)
            r3.<init>()
            r0 = r22
            r3.A0J = r0
            r0 = r21
            r3.A0H = r0
            r0 = r27
            r3.A0R = r0
            r0 = r28
            r3.A0P = r0
            r0 = r29
            r3.A0L = r0
            r0 = r30
            r3.A0c = r0
            r0 = r31
            r3.A0a = r0
            r0 = r32
            r3.A0O = r0
            r0 = r33
            r3.A0N = r0
            r0 = r34
            r3.A0Q = r0
            r0 = r35
            r3.A0S = r0
            r0 = r36
            r3.A0b = r0
            r2 = r37
            r3.A0Y = r2
            r0 = r38
            r3.A0K = r0
            r1 = r39
            r3.A0Z = r1
            r0 = r40
            r3.A0X = r0
            r0 = r25
            r3.A00 = r0
            r3.A0V = r11
            r0 = r26
            r3.A01 = r0
            r0 = r41
            r3.A0M = r0
            r3.A0U = r7
            r0 = r23
            r3.A0I = r0
            r0 = r24
            r3.A0W = r0
            r0 = r20
            r3.A0G = r0
            r0 = r19
            r3.A0F = r0
            r3.A03 = r5
            r0 = r17
            r3.A0D = r0
            r3.A05 = r8
            r0 = r16
            r3.A0C = r0
            r3.A04 = r6
            r3.A02 = r4
            r3.A07 = r10
            r3.A09 = r13
            r3.A0B = r15
            r3.A06 = r9
            r0 = r18
            r3.A0E = r0
            r3.A08 = r12
            r3.A0A = r14
            if (r37 != 0) goto L_0x009b
            if (r39 != 0) goto L_0x009b
            X.0sa r0 = r14.A0B
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x009c
        L_0x009b:
            r0 = 1
        L_0x009c:
            r3.A0T = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246613et.<init>(X.9IE, X.9IZ, X.9J3, X.1sQ, X.3ew, X.2s5, X.3ex, X.3eu, X.3ZH, X.3ek, X.3es, X.3en, X.3eg, X.3ev, X.3W1, X.3da, X.3TO, com.instagram.user.model.User, java.lang.String, java.lang.String, java.lang.String, float, float, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
