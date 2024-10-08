package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;

/* renamed from: X.GDe  reason: case insensitive filesystem */
public final class C52058GDe extends AnonymousClass0T0 {
    public Double A00;
    public Double A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public String A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final C53368Gms A09;
    public final C61081JwJ A0A;
    public final HMA A0B;
    public final HLU A0C;
    public final AnonymousClass3WA A0D;
    public final AnonymousClass3W1 A0E;
    public final C52054GDa A0F;
    public final FollowStatus A0G;
    public final Integer A0H;
    public final Integer A0I;
    public final Integer A0J;
    public final String A0K;
    public final 0eP A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52058GDe) {
                C52058GDe gDe = (C52058GDe) obj;
                if (!(0qQ.A0K(this.A0J, gDe.A0J) && 0qQ.A0K(this.A0I, gDe.A0I) && this.A0G == gDe.A0G && this.A0f == gDe.A0f && this.A0T == gDe.A0T && this.A0U == gDe.A0U && this.A0Y == gDe.A0Y && this.A0C == gDe.A0C && this.A0W == gDe.A0W && this.A0V == gDe.A0V && 0qQ.A0K(this.A0E, gDe.A0E) && this.A0O == gDe.A0O && this.A0D == gDe.A0D && this.A08 == gDe.A08 && 0qQ.A0K(this.A0A, gDe.A0A) && this.A0M == gDe.A0M && 0qQ.A0K(this.A0H, gDe.A0H) && 0qQ.A0K(this.A0F, gDe.A0F) && this.A0N == gDe.A0N && this.A0c == gDe.A0c && this.A0d == gDe.A0d && this.A0b == gDe.A0b && this.A0a == gDe.A0a && this.A0e == gDe.A0e && this.A0P == gDe.A0P && this.A0Z == gDe.A0Z && this.A0B == gDe.A0B && this.A0X == gDe.A0X && 0qQ.A0K(this.A0K, gDe.A0K) && 0qQ.A0K(this.A09, gDe.A09) && this.A0R == gDe.A0R && this.A0S == gDe.A0S && this.A0Q == gDe.A0Q && 0qQ.A0K(this.A0L, gDe.A0L) && this.A07 == gDe.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int A09() {
        AnonymousClass3W1 r0 = this.A0E;
        if (r0 != null) {
            return r0.getPosition();
        }
        return -1;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A0W, AnonymousClass7TF.A07(this.A0C, AnonymousClass7TF.A09(this.A0Y, AnonymousClass7TF.A09(this.A0U, AnonymousClass7TF.A09(this.A0T, AnonymousClass7TF.A09(this.A0f, AnonymousClass7TF.A07(this.A0G, ((AnonymousClass7TG.A0C(this.A0J) * 31) + AnonymousClass7TG.A0C(this.A0I)) * 31)))))));
        int A093 = AnonymousClass7TF.A09(this.A0O, (AnonymousClass7TF.A09(this.A0V, A092) + AnonymousClass7TG.A0C(this.A0E)) * 31);
        boolean z = this.A0M;
        int A094 = AnonymousClass7TF.A09(this.A0P, AnonymousClass7TF.A09(this.A0e, AnonymousClass7TF.A09(this.A0a, AnonymousClass7TF.A09(this.A0b, AnonymousClass7TF.A09(this.A0d, AnonymousClass7TF.A09(this.A0c, AnonymousClass7TF.A09(this.A0N, (((AnonymousClass7TF.A09(z, (((AnonymousClass7TF.A07(this.A0D, A093) + this.A08) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A0H)) * 31) + AnonymousClass7TG.A0C(this.A0F)) * 31)))))));
        boolean z2 = this.A0X;
        return AnonymousClass7TF.A07(this.A0L, AnonymousClass7TF.A09(this.A0Q, AnonymousClass7TF.A09(this.A0S, AnonymousClass7TF.A09(this.A0R, AnonymousClass7TF.A07(this.A09, (AnonymousClass7TF.A09(z2, (AnonymousClass7TF.A09(this.A0Z, A094) + AnonymousClass7TG.A0C(this.A0B)) * 31) + C41845B3m.A00(this.A0K)) * 31))))) + this.A07;
    }

    public C52058GDe(C53368Gms gms, C61081JwJ jwJ, HMA hma, HLU hlu, AnonymousClass3WA r6, AnonymousClass3W1 r7, C52054GDa gDa, FollowStatus followStatus, Integer num, Integer num2, Integer num3, String str, 0eP r14, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20) {
        this.A0J = num;
        this.A0I = num2;
        this.A0G = followStatus;
        this.A0f = z;
        this.A0T = z2;
        this.A0U = z3;
        this.A0Y = z4;
        this.A0C = hlu;
        this.A0W = z5;
        this.A0V = z6;
        this.A0E = r7;
        this.A0O = z7;
        this.A0D = r6;
        this.A08 = i;
        this.A0A = jwJ;
        this.A0M = z8;
        this.A0H = num3;
        this.A0F = gDa;
        this.A0N = z9;
        this.A0c = z10;
        this.A0d = z11;
        this.A0b = z12;
        this.A0a = z13;
        this.A0e = z14;
        this.A0P = z15;
        this.A0Z = z16;
        this.A0B = hma;
        this.A0X = z17;
        this.A0K = str;
        this.A09 = gms;
        this.A0R = z18;
        this.A0S = z19;
        this.A0Q = z20;
        this.A0L = r14;
        this.A07 = i2;
    }

    public static Integer A05(C52058GDe gDe) {
        return Integer.valueOf(gDe.A09());
    }

    public static void A06(C267324bN r2, C52058GDe gDe, AnonymousClass0iw r4, C3728893a r5, boolean z) {
        r5.A03(r2, r4.getModuleName(), gDe.A09(), z);
    }

    public static void A07(C267324bN r7, C52058GDe gDe, AnonymousClass0iw r9, C3728893a r10, boolean z) {
        C267324bN r1 = r7;
        C3728893a r0 = r10;
        r0.A04(r1, r9.getModuleName(), gDe.A0K, gDe.A09(), z, gDe.A0O);
    }

    public static void A08(C267324bN r3, C52058GDe gDe, UserSession userSession, long j) {
        I3O.A00(userSession).A01(r3, Long.valueOf(j), gDe.A09());
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ClipsItemState(lastUserPausedPositionMs=");
        A1A.append(this.A0J);
        A1A.append(", lastStoppedPositionMs=");
        A1A.append(this.A0I);
        A1A.append(", initialFollowStatus=");
        A1A.append(this.A0G);
        A1A.append(", shouldShowOnboardingNux=");
        A1A.append(this.A0f);
        A1A.append(", isOnboardingNuxDirectType=");
        A1A.append(this.A0T);
        A1A.append(", isOnboardingNuxDirectionSwipeUp=");
        A1A.append(this.A0U);
        A1A.append(", isTapToPausedByUser=");
        A1A.append(this.A0Y);
        A1A.append(", sfpltInputStatus=");
        A1A.append(this.A0C);
        A1A.append(C273654mx.A00(1091));
        A1A.append(this.A0W);
        A1A.append(AnonymousClass000.A00(2026));
        A1A.append(this.A0V);
        A1A.append(", mediaStateReadOnly=");
        A1A.append(this.A0E);
        A1A.append(", isAcpDelivered=");
        A1A.append(this.A0O);
        A1A.append(", reportedType=");
        A1A.append(this.A0D);
        A1A.append(", numVideoLoops=");
        A1A.append(this.A08);
        A1A.append(", commentPreviews=");
        A1A.append(this.A0A);
        A1A.append(", commentPreviewsVisible=");
        A1A.append(this.A0M);
        A1A.append(", carouselIndexForVideoViewHolder=");
        A1A.append(this.A0H);
        A1A.append(", timeline=");
        A1A.append(this.A0F);
        A1A.append(", hasAutoAdvanceStarted=");
        A1A.append(this.A0N);
        A1A.append(", shouldShowDelayedSkipAdTimerInSponsoredLabel=");
        A1A.append(this.A0c);
        A1A.append(", shouldShowDelayedSkipAdsNextReelTimer=");
        A1A.append(this.A0d);
        A1A.append(", shouldShowDelayedSkipAdTimerAboveUsername=");
        A1A.append(this.A0b);
        A1A.append(", shouldShowColoredSnackBarStyledDelayedSkipAdTimer=");
        A1A.append(this.A0a);
        A1A.append(", shouldShowGreySnackBarStyledDelayedSkipAdTimer=");
        A1A.append(this.A0e);
        A1A.append(", isDelayedSkipAdScrolledUp=");
        A1A.append(this.A0P);
        A1A.append(", isVideoStoppedByStickerTap=");
        A1A.append(this.A0Z);
        A1A.append(", reminderAdCtaState=");
        A1A.append(this.A0B);
        A1A.append(AnonymousClass000.A00(2027));
        A1A.append(this.A0X);
        A1A.append(AnonymousClass000.A00(841));
        A1A.append(this.A0K);
        A1A.append(", multiAdsPlaybackInfo=");
        A1A.append(this.A09);
        A1A.append(", isFullscreenViewActive=");
        A1A.append(this.A0R);
        A1A.append(", isFullscreenViewNuxActive=");
        A1A.append(this.A0S);
        A1A.append(", isFanOutMenuActive=");
        A1A.append(this.A0Q);
        A1A.append(", fanOutMenuPosition=");
        A1A.append(this.A0L);
        A1A.append(", fanOutMenuHoverValue=");
        return C51975G9x.A0j(A1A, this.A07);
    }

    public static /* synthetic */ C52058GDe A00(C61081JwJ jwJ, HMA hma, HLU hlu, C52058GDe gDe, AnonymousClass3WA r57, Integer num, Integer num2, Integer num3, String str, 0eP r62, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20) {
        FollowStatus followStatus;
        AnonymousClass3W1 r20;
        C52054GDa gDa;
        int i5 = i2;
        0eP r11 = r62;
        boolean z21 = z20;
        int i6 = i;
        AnonymousClass3WA r12 = r57;
        boolean z22 = z7;
        boolean z23 = z4;
        boolean z24 = z3;
        HLU hlu2 = hlu;
        boolean z25 = z18;
        boolean z26 = z2;
        Integer num4 = num3;
        boolean z27 = z;
        boolean z28 = z6;
        C61081JwJ jwJ2 = jwJ;
        Integer num5 = num2;
        boolean z29 = z12;
        boolean z30 = z5;
        Integer num6 = num;
        boolean z31 = z8;
        boolean z32 = z9;
        boolean z33 = z10;
        boolean z34 = z14;
        boolean z35 = z13;
        boolean z36 = z15;
        boolean z37 = z16;
        boolean z38 = z11;
        boolean z39 = z17;
        String str2 = str;
        int i7 = i3;
        boolean z40 = z19;
        C53368Gms gms = null;
        C52058GDe gDe2 = gDe;
        if ((i3 & 1) != 0) {
            num6 = gDe2.A0J;
        }
        if ((i3 & 2) != 0) {
            num5 = gDe2.A0I;
        }
        if ((i3 & 4) != 0) {
            followStatus = gDe2.A0G;
        } else {
            followStatus = null;
        }
        if ((i3 & 8) != 0) {
            z27 = gDe2.A0f;
        }
        if ((i3 & 16) != 0) {
            z26 = gDe2.A0T;
        }
        if ((i3 & 32) != 0) {
            z24 = gDe2.A0U;
        }
        if ((i3 & 64) != 0) {
            z23 = gDe2.A0Y;
        }
        if ((i7 & 128) != 0) {
            hlu2 = gDe2.A0C;
        }
        if ((i7 & 256) != 0) {
            z30 = gDe2.A0W;
        }
        if ((i7 & 512) != 0) {
            z28 = gDe2.A0V;
        }
        if ((i7 & 1024) != 0) {
            r20 = gDe2.A0E;
        } else {
            r20 = null;
        }
        if ((i7 & C249703kE.FLAG_MOVED) != 0) {
            z22 = gDe2.A0O;
        }
        if ((i7 & 4096) != 0) {
            r12 = gDe2.A0D;
        }
        if ((i7 & 8192) != 0) {
            i6 = gDe2.A08;
        }
        if ((i7 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            jwJ2 = gDe2.A0A;
        }
        if ((i3 & Constants.LOAD_RESULT_PGO) != 0) {
            z31 = gDe2.A0M;
        }
        if ((i3 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            num4 = gDe2.A0H;
        }
        if ((i3 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            gDa = gDe2.A0F;
        } else {
            gDa = null;
        }
        if ((i3 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            z32 = gDe2.A0N;
        }
        if ((i3 & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            z33 = gDe2.A0c;
        }
        if ((i3 & Constants.LOAD_RESULT_NEED_REOPTIMIZATION) != 0) {
            z38 = gDe2.A0d;
        }
        if ((i3 & 2097152) != 0) {
            z29 = gDe2.A0b;
        }
        if ((i3 & 4194304) != 0) {
            z35 = gDe2.A0a;
        }
        if ((i3 & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0) {
            z34 = gDe2.A0e;
        }
        if ((i3 & 16777216) != 0) {
            z36 = gDe2.A0P;
        }
        if ((i3 & 33554432) != 0) {
            z37 = gDe2.A0Z;
        }
        if ((i3 & 67108864) != 0) {
            hma = gDe2.A0B;
        }
        if ((i3 & 134217728) != 0) {
            z39 = gDe2.A0X;
        }
        if ((i3 & 268435456) != 0) {
            str2 = gDe2.A0K;
        }
        if ((i3 & 536870912) != 0) {
            gms = gDe2.A09;
        }
        if ((i3 & SN3.MAX_SIGNED_POWER_OF_TWO) != 0) {
            z25 = gDe2.A0R;
        }
        if ((i3 & AnonymousClass972.MUTABLE_FLAG_MASK) != 0) {
            z40 = gDe2.A0S;
        }
        if ((i4 & 1) != 0) {
            z21 = gDe2.A0Q;
        }
        if ((i4 & 2) != 0) {
            r11 = gDe2.A0L;
        }
        if ((i4 & 4) != 0) {
            i5 = gDe2.A07;
        }
        AnonymousClass7TF.A1E(followStatus, 2, hlu2);
        0qQ.A0B(r12, 12);
        0qQ.A0B(gms, 29);
        0qQ.A0B(r11, 33);
        return new C52058GDe(gms, jwJ2, hma, hlu2, r12, r20, gDa, followStatus, num6, num5, num4, str2, r11, i6, i5, z27, z26, z24, z23, z30, z28, z22, z31, z32, z33, z38, z29, z35, z34, z36, z37, z39, z25, z40, z21);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52058GDe() {
        /*
            r36 = this;
            r2 = 0
            com.instagram.user.model.FollowStatus r8 = com.instagram.user.model.FollowStatus.A08
            r14 = 0
            r18 = 1
            X.HLU r4 = X.HLU.A03
            X.3WA r5 = X.AnonymousClass3WA.A0F
            r0 = 6
            X.Gms r1 = new X.Gms
            r1.<init>(r0)
            java.lang.Float r0 = X.C51967G9n.A0g()
            X.0eP r13 = new X.0eP
            r13.<init>(r0, r0)
            r0 = r36
            r3 = r2
            r6 = r2
            r7 = r2
            r9 = r2
            r10 = r2
            r11 = r2
            r12 = r2
            r15 = r14
            r16 = r14
            r17 = r14
            r19 = r14
            r20 = r14
            r21 = r14
            r22 = r14
            r23 = r14
            r24 = r14
            r25 = r18
            r26 = r18
            r27 = r18
            r28 = r14
            r29 = r18
            r30 = r14
            r31 = r14
            r32 = r14
            r33 = r14
            r34 = r14
            r35 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52058GDe.<init>():void");
    }
}
