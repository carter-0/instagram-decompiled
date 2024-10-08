package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum;
import com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.4bN  reason: invalid class name and case insensitive filesystem */
public final class C267324bN extends AnonymousClass0T0 implements C249693kD, C267334bO {
    public static final C295375o3 A0d = new Object();
    public int A00;
    public C295365o2 A01;
    public 1Xj A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public String A07;
    public List A08;
    public boolean A09;
    public boolean A0A;
    public AnonymousClass3WR A0B;
    public final int A0C;
    public final long A0D;
    public final AdFormatType A0E;
    public final C258043yN A0F;
    public final C267334bO A0G;
    public final C270584gy A0H;
    public final AnonymousClass3QO A0I;
    public final 1iA A0J;
    public final User A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final List A0R;
    public final List A0S;
    public final List A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final String A0c;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0054, code lost:
        r11 = r0.A1t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0080, code lost:
        if (r7.CAV() != X.C295365o2.A0G) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0098, code lost:
        if (r7.CAV() != X.C295365o2.A0G) goto L_0x009a;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C267324bN(X.C267334bO r41) {
        /*
            r40 = this;
            r2 = 1
            r7 = r41
            java.lang.String r17 = r7.getOrganicTrackingToken()
            java.lang.String r18 = r7.BGe()
            boolean r32 = r7.CYg()
            boolean r33 = r7.CUz()
            X.5o2 r8 = r7.CAV()
            X.1Xj r10 = r7.BPf()
            X.1iA r12 = r7.BR7()
            com.instagram.api.schemas.AdFormatType r5 = r7.B7V()
            java.util.List r24 = r7.Alu()
            X.3yN r6 = r7.Am3()
            X.1Xj r0 = r7.BPf()
            r13 = 0
            if (r0 == 0) goto L_0x017b
            X.1Xy r0 = r0.A0C
            java.lang.String r19 = r0.getLoggingInfoToken()
        L_0x0038:
            X.1Xj r0 = r7.BPf()
            if (r0 == 0) goto L_0x0177
            X.1Xy r0 = r0.A0C
            java.lang.String r20 = r0.getMezqlToken()
        L_0x0044:
            X.1Xj r0 = r7.BPf()
            if (r0 == 0) goto L_0x0173
            long r30 = r0.A1A()
        L_0x004e:
            X.1Xj r0 = r7.BPf()
            if (r0 == 0) goto L_0x005a
            X.3QO r11 = r0.A1t()
            if (r11 != 0) goto L_0x005c
        L_0x005a:
            X.3QO r11 = X.AnonymousClass3QO.DEFAULT
        L_0x005c:
            X.1Xj r0 = r7.BPf()
            if (r0 == 0) goto L_0x016e
            java.lang.String r3 = r0.A0M
            java.lang.String r22 = r0.A2b()
        L_0x0068:
            boolean r34 = r7.CJc()
            X.1Xj r0 = r7.BPf()
            if (r0 == 0) goto L_0x0082
            boolean r0 = r0.A64()
            if (r0 != r2) goto L_0x0082
            X.5o2 r1 = r7.CAV()
            X.5o2 r0 = X.C295365o2.ORGANIC
            r35 = 1
            if (r1 == r0) goto L_0x0084
        L_0x0082:
            r35 = 0
        L_0x0084:
            X.1Xj r0 = r7.BPf()
            if (r0 == 0) goto L_0x009a
            boolean r0 = r0.A5r()
            if (r0 != r2) goto L_0x009a
            X.5o2 r1 = r7.CAV()
            X.5o2 r0 = X.C295365o2.ORGANIC
            r36 = 1
            if (r1 == r0) goto L_0x009c
        L_0x009a:
            r36 = 0
        L_0x009c:
            X.1Xj r0 = r7.BPf()
            if (r0 == 0) goto L_0x016a
            X.1Xy r0 = r0.A0C
            java.lang.Integer r0 = r0.Bd0()
            if (r0 == 0) goto L_0x016a
            int r28 = r0.intValue()
        L_0x00ae:
            X.1Xj r0 = r7.BPf()
            if (r0 == 0) goto L_0x0167
            X.1Xy r0 = r0.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x0167
            X.4gy r9 = r0.CF4()
        L_0x00c0:
            X.1Xj r0 = r7.BPf()
            if (r0 == 0) goto L_0x0163
            java.util.ArrayList r25 = r0.A3E()
        L_0x00ca:
            X.1Xj r0 = r7.BPf()
            if (r0 == 0) goto L_0x0160
            X.1Xy r0 = r0.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x0160
            java.lang.Boolean r1 = r0.Axb()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r37 = X.0qQ.A0K(r1, r0)
        L_0x00e4:
            java.util.List r26 = r7.C6m()
            r29 = 0
            java.lang.Integer r15 = X.AnonymousClass05K.A0j
            r4 = r40
            r14 = r13
            r16 = r13
            r21 = r3
            r23 = r13
            r27 = r13
            r38 = r29
            r39 = r29
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39)
            X.1Xj r0 = r7.BPf()
            if (r0 == 0) goto L_0x015e
            int r0 = r0.A03
        L_0x0106:
            r4.A00 = r0
            X.1Xj r0 = r4.A02
            if (r0 == 0) goto L_0x012f
            X.1Xy r0 = r0.A0C
            X.1sQ r3 = r0.getClipsMetadata()
            if (r3 == 0) goto L_0x012f
            X.1Xj r0 = r4.A02
            if (r0 == 0) goto L_0x012f
            java.lang.String r2 = r0.A30()
            if (r2 == 0) goto L_0x012f
            X.1Xj r1 = r4.A02
            if (r1 == 0) goto L_0x012f
            X.5o0 r0 = r3.AKX()
            r0.A0Y = r2
            X.1sP r0 = r0.A00()
            r1.A3v(r0)
        L_0x012f:
            X.1Xj r0 = r4.A02
            if (r0 == 0) goto L_0x017f
            java.util.List r1 = r0.A0e
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x017f
            X.3PG r0 = X.AnonymousClass3PG.NETWORK
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0148
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
        L_0x0145:
            r4.A03 = r0
            return
        L_0x0148:
            X.3PG r0 = X.AnonymousClass3PG.CACHED
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0153
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0145
        L_0x0153:
            X.3PG r0 = X.AnonymousClass3PG.LOCAL
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x017f
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0145
        L_0x015e:
            r0 = 0
            goto L_0x0106
        L_0x0160:
            r37 = 0
            goto L_0x00e4
        L_0x0163:
            r25 = r13
            goto L_0x00ca
        L_0x0167:
            r9 = r13
            goto L_0x00c0
        L_0x016a:
            r28 = 0
            goto L_0x00ae
        L_0x016e:
            r3 = r13
            r22 = r13
            goto L_0x0068
        L_0x0173:
            r30 = 0
            goto L_0x004e
        L_0x0177:
            r20 = r13
            goto L_0x0044
        L_0x017b:
            r19 = r13
            goto L_0x0038
        L_0x017f:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r4.A0D(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267324bN.<init>(X.4bO):void");
    }

    public final User A08(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        1Xj r0 = this.A02;
        if (r0 != null) {
            return r0.A2A(userSession);
        }
        return null;
    }

    public final AnonymousClass3WR A09(UserSession userSession, Integer num) {
        IGFormatLiquidityUseCaseEnum iGFormatLiquidityUseCaseEnum;
        C257743xt BF6;
        List list;
        1Xj r0;
        0qQ.A0B(userSession, 0);
        1Xj r4 = this.A02;
        AnonymousClass3WR r3 = null;
        if (!(num == null || (list = this.A0R) == null || (r0 = (1Xj) list.get(num.intValue())) == null)) {
            r4 = r0;
        }
        if (r4 != null && r4.A5H()) {
            C250513lZ injected = r4.A0C.getInjected();
            if (injected == null || (BF6 = injected.BF6()) == null) {
                iGFormatLiquidityUseCaseEnum = null;
            } else {
                iGFormatLiquidityUseCaseEnum = BF6.B7T();
            }
            if (iGFormatLiquidityUseCaseEnum == IGFormatLiquidityUseCaseEnum.PRODUCT_EXTENSION_SINGLE_MEDIA_TO_COLLECTION) {
                r4 = r4.A1b();
            }
        }
        if (182.A06(0Tu.A05, userSession, 36321988666468225L)) {
            AnonymousClass3WR r02 = this.A0B;
            if (r02 == null) {
                if (r4 != null) {
                    r02 = r4.CEL();
                }
                this.A0B = r3;
            }
            r3 = r02;
            this.A0B = r3;
        } else if (r4 != null) {
            return r4.CEL();
        }
        return r3;
    }

    public final void A0D(Integer num) {
        AnonymousClass3PG r2;
        0qQ.A0B(num, 0);
        this.A03 = num;
        switch (num.intValue()) {
            case 0:
            case 3:
                r2 = AnonymousClass3PG.NETWORK;
                break;
            case 1:
                r2 = AnonymousClass3PG.LOCAL;
                break;
            case 2:
            case 4:
                r2 = AnonymousClass3PG.CACHED;
                break;
            case 5:
                return;
            default:
                throw new RuntimeException();
        }
        1Xj r1 = this.A02;
        if (r1 != null) {
            r1.A0e.clear();
            r1.A48(r2);
        }
    }

    public final String AyM(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return this.A0G.AyM(userSession);
    }

    public final String ByO(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return this.A0G.ByO(userSession);
    }

    public final /* synthetic */ boolean CJc() {
        return C295385o4.A02(this);
    }

    public final C53332GmI A01() {
        C267334bO r1 = this.A0G;
        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.clips.model.MidcardClipsImpressionItem");
        return ((GYP) r1).A00;
    }

    public final C53328GmE A02() {
        GYO gyo;
        C267334bO r2 = this.A0G;
        if (!(r2 instanceof GYO) || (gyo = (GYO) r2) == null) {
            return null;
        }
        return gyo.A00;
    }

    public final C57031ILx A03() {
        C267334bO r1 = this.A0G;
        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.clips.model.MultiAdsClipsImpressionItem");
        return (C57031ILx) r1;
    }

    public final C45427Cw7 A04() {
        C57030ILw iLw;
        C267334bO r2 = this.A0G;
        if (!(r2 instanceof C57030ILw) || (iLw = (C57030ILw) r2) == null) {
            return null;
        }
        return iLw.A01;
    }

    public final 1Xj A05() {
        C295365o2 r1 = this.A01;
        if (r1 == C295365o2.NETEGO || r1 == C295365o2.BRAND_SURVEY) {
            return this.A02;
        }
        return A06().A0K;
    }

    public final AnonymousClass3OA A06() {
        boolean z = false;
        if (this.A01 == C295365o2.AD_PREVIEW) {
            z = true;
        }
        if (z || !A0F()) {
            C267334bO r0 = this.A0G;
            0qQ.A0C(r0, "null cannot be cast to non-null type com.instagram.clips.model.SponsoredClipsImpressionItem");
            return ((C52364GPk) r0).A00;
        }
        C267334bO r1 = this.A0G;
        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.clips.model.MultiAdsClipsImpressionItem");
        return ((C57031ILx) r1).A02;
    }

    public final AnonymousClass3OA A07() {
        C295355o1 r2;
        C267334bO r22 = this.A0G;
        if (!(r22 instanceof C295355o1) || (r2 = (C295355o1) r22) == null) {
            return null;
        }
        return r2.A01;
    }

    public final String A0B() {
        if (!GDZ.A01(this.A01)) {
            return getId();
        }
        if (A0F()) {
            C267334bO r1 = this.A0G;
            0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.clips.model.MultiAdsClipsImpressionItem");
            return ((C57031ILx) r1).A01.A02;
        }
        String id = A06().A0K.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final String A0C() {
        1Xj r0;
        String A2n;
        if (this.A01 != C295365o2.ORGANIC || (r0 = this.A02) == null || (A2n = r0.A2n()) == null) {
            return getId();
        }
        return A2n;
    }

    public final boolean A0E() {
        if (!this.A0G.CcK() || 1iA.A09 != this.A0J) {
            return false;
        }
        return true;
    }

    public final boolean A0F() {
        if (this.A01 == C295365o2.MULTI_ADS) {
            return true;
        }
        return false;
    }

    public final boolean A0G() {
        if (this.A01 == C295365o2.NETEGO) {
            return true;
        }
        return false;
    }

    public final boolean A0H() {
        if (!this.A0G.CcK()) {
            return false;
        }
        if (A06().A0K.A5o() || A06().A0K.A5n() || A06().A0K.A5e()) {
            return true;
        }
        return false;
    }

    public final boolean A0I() {
        1Xj r0;
        if (!this.A0G.CcK() || (r0 = this.A02) == null || !r0.A5p() || A06().A06()) {
            return false;
        }
        return true;
    }

    public final boolean A0J() {
        IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum;
        C250513lZ injected;
        C255123tc BF5;
        if (!this.A0G.CcK()) {
            return false;
        }
        1Xj r0 = this.A02;
        if (r0 == null || (injected = r0.A0C.getInjected()) == null || (BF5 = injected.BF5()) == null) {
            iGAdsFeedVideoWBViewerTypeEnum = null;
        } else {
            iGAdsFeedVideoWBViewerTypeEnum = BF5.BEn();
        }
        if (iGAdsFeedVideoWBViewerTypeEnum == IGAdsFeedVideoWBViewerTypeEnum.POST_TAP_WATCH_AND_BROWSE_VIEWER_ON_REELS_VIEWER || iGAdsFeedVideoWBViewerTypeEnum == IGAdsFeedVideoWBViewerTypeEnum.POST_TAP_WATCH_AND_BROWSE_VIEWER_ON_REELS_VIEWER_WITH_CHAINING || 0qQ.A0K(A06().A0e, "WATCH_AND_BROWSE")) {
            return true;
        }
        return false;
    }

    public final float AcY(UserSession userSession) {
        C246623eu A1S;
        1Xj r0 = this.A02;
        if (r0 == null || (A1S = r0.A1S()) == null) {
            return 0.0f;
        }
        return ((float) A1S.A01) / ((float) A1S.A00);
    }

    public final List Alu() {
        return this.A0R;
    }

    public final C258043yN Am3() {
        return this.A0F;
    }

    public final AdFormatType B7V() {
        return this.A0E;
    }

    public final String BGe() {
        return this.A0M;
    }

    public final 1Xj BPf() {
        return this.A02;
    }

    public final 1iA BR7() {
        return this.A0J;
    }

    public final List Bkd(AnonymousClass3WT r2) {
        List A3o;
        1Xj r0 = this.A02;
        if (r0 == null || (A3o = r0.A3o(r2)) == null) {
            return 0sn.A00;
        }
        return A3o;
    }

    public final List C6m() {
        return this.A0T;
    }

    public final C295365o2 CAV() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ User CCd() {
        return this.A0K;
    }

    public final String CFY() {
        return this.A0c;
    }

    public final boolean CUz() {
        return this.A0W;
    }

    public final boolean CWu() {
        return this.A0X;
    }

    public final boolean CYg() {
        return this.A0Y;
    }

    public final boolean CcK() {
        return this.A0G.CcK();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C267324bN) || !2PP.A00(((C267324bN) obj).getId(), getId())) {
            return false;
        }
        return true;
    }

    public final String getId() {
        String id = this.A0G.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final String getOrganicTrackingToken() {
        return this.A0P;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ClipsItem(content=");
        sb.append(this.A0G);
        sb.append(", organicTrackingToken=");
        sb.append(this.A0P);
        sb.append(", impressionToken=");
        sb.append(this.A0M);
        sb.append(", isOrganicTrackable=");
        sb.append(this.A0Y);
        sb.append(", isImpressionTrackable=");
        sb.append(this.A0W);
        sb.append(", type=");
        sb.append(this.A01);
        sb.append(", media=");
        sb.append(this.A02);
        sb.append(C66579MXk.A00(48));
        sb.append(this.A0J);
        sb.append(", formatType=");
        sb.append(this.A0E);
        sb.append(", carouselMedia=");
        sb.append(this.A0R);
        sb.append(", carouselRenderingConfiguration=");
        sb.append(this.A0F);
        sb.append(AnonymousClass000.A00(403));
        sb.append(this.A0Q);
        sb.append(", mezqlToken=");
        sb.append(this.A0O);
        sb.append(", takenAtSeconds=");
        sb.append(this.A0D);
        sb.append(C66579MXk.A00(185));
        sb.append(this.A0I);
        sb.append(", localVideoPath=");
        sb.append(this.A0N);
        sb.append(", deeplinkAREffectId=");
        sb.append(this.A0L);
        sb.append(", hasAudio=");
        sb.append(this.A0V);
        sb.append(", isShownOnProfileGrid=");
        sb.append(this.A0a);
        sb.append(", isProfileGridControlEnabled=");
        sb.append(this.A0Z);
        sb.append(", playCountValue=");
        sb.append(this.A0C);
        sb.append(", viewerInteractionSettings=");
        sb.append(this.A0H);
        sb.append(", peopleTags=");
        sb.append(this.A0S);
        sb.append(", disableUseInCache=");
        sb.append(this.A0U);
        sb.append(", threads=");
        sb.append(this.A0T);
        sb.append(", directSenders=");
        sb.append(this.A08);
        sb.append(", directSearchSection=");
        sb.append(this.A04);
        sb.append(", directSearchUISectionPosition=");
        sb.append(this.A05);
        sb.append(", clientReceivedTimeSec=");
        sb.append(this.A06);
        sb.append(", secondaryTitle=");
        sb.append(this.A07);
        sb.append(AnonymousClass000.A00(2026));
        sb.append(this.A0A);
        sb.append(", _customStartTimeMs=");
        sb.append(this.A00);
        sb.append(", _source=");
        Integer num = this.A03;
        if (num != null) {
            str = AnonymousClass9OK.A00(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", _isStreaming=");
        sb.append(this.A09);
        sb.append(')');
        return sb.toString();
    }

    public final IntentAwareAdsInfoIntf A00() {
        if (A0F()) {
            return (IntentAwareAdsInfoIntf) A03().A01.A01;
        }
        if (GDZ.A01(this.A01)) {
            return A06().A0C;
        }
        return null;
    }

    public final Integer A0A() {
        if (!A0F()) {
            return null;
        }
        Iterator it = 00k.A0p((Iterable) A03().A01.A00).iterator();
        while (it.hasNext()) {
            0k0 r2 = (0k0) it.next();
            if (0qQ.A0K(A06().A0S, ((AnonymousClass3OA) r2.A01).A0S)) {
                return Integer.valueOf(r2.A00);
            }
        }
        throw new NoSuchElementException(AnonymousClass000.A00(3));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getId()});
    }

    public C267324bN(AdFormatType adFormatType, C258043yN r5, C267334bO r6, C295365o2 r7, C270584gy r8, 1Xj r9, AnonymousClass3QO r10, 1iA r11, Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, List list4, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        User user;
        0qQ.A0B(r7, 6);
        this.A0G = r6;
        this.A0P = str;
        this.A0M = str2;
        this.A0Y = z;
        this.A0W = z2;
        this.A01 = r7;
        this.A02 = r9;
        this.A0J = r11;
        this.A0E = adFormatType;
        this.A0R = list;
        this.A0F = r5;
        this.A0Q = str3;
        this.A0O = str4;
        this.A0D = j;
        this.A0I = r10;
        this.A0N = str5;
        this.A0L = str6;
        this.A0V = z3;
        this.A0a = z4;
        this.A0Z = z5;
        this.A0C = i;
        this.A0H = r8;
        this.A0S = list2;
        this.A0U = z6;
        this.A0T = list3;
        this.A08 = list4;
        this.A04 = num;
        this.A05 = num2;
        this.A06 = l;
        this.A07 = str7;
        this.A0A = z7;
        this.A00 = i2;
        this.A03 = num3;
        this.A09 = z8;
        if (r9 != null) {
            user = r9.A0C.CCd();
        } else {
            user = null;
        }
        this.A0K = user;
        boolean z9 = false;
        this.A0X = this.A02 != null;
        this.A0c = getId();
        A0E();
        1Xj r1 = this.A02;
        this.A0b = r1 != null ? 0qQ.A0K(r1.A0C.CcI(), true) : z9;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C267324bN(X.GEC r37) {
        /*
            r36 = this;
            r1 = 0
            r24 = 0
            r3 = r37
            X.5o2 r4 = r3.A00
            X.1Xj r6 = r3.A01
            r26 = 0
            X.3QO r7 = X.AnonymousClass3QO.DEFAULT
            java.lang.Integer r11 = X.AnonymousClass05K.A0j
            r0 = r36
            r2 = r1
            r5 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r1
            r16 = r1
            r17 = r1
            r18 = r1
            r19 = r1
            r20 = r1
            r21 = r1
            r22 = r1
            r23 = r1
            r25 = r24
            r28 = r24
            r29 = r24
            r30 = r24
            r31 = r24
            r32 = r24
            r33 = r24
            r34 = r24
            r35 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267324bN.<init>(X.GEC):void");
    }

    public C267324bN() {
        this(new GEC(C295365o2.UNAVAILABLE, (1Xj) null));
    }
}
