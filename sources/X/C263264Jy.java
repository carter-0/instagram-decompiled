package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.instagram.android.R;
import com.instagram.api.schemas.IGPostTriggerExperience;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.4Jy  reason: invalid class name and case insensitive filesystem */
public final class C263264Jy {
    public static final C263264Jy A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (X.182.A06(X.0Tu.A06, r6, 36325905676711271L) != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r7 != null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        if (r7 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0099, code lost:
        if (A0A(r6, r8, false) != false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ae, code lost:
        if (A09(r6, r8, r9) != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b2, code lost:
        return X.C263274Jz.A04;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C263274Jz A00(com.instagram.common.session.UserSession r6, X.1Xj r7, java.lang.String r8, boolean r9) {
        /*
            r5 = 1
            X.0qQ.A0B(r6, r5)
            r0 = 2
            X.0qQ.A0B(r8, r0)
            r1 = 0
            if (r7 == 0) goto L_0x0078
            X.1Xy r0 = r7.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x0078
            X.3tc r0 = r0.BF5()
            if (r0 == 0) goto L_0x0078
            com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum r2 = r0.BEn()
        L_0x001d:
            X.1Xy r0 = r7.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x002f
            X.3xt r0 = r0.BF6()
            if (r0 == 0) goto L_0x002f
            com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum r1 = r0.B7T()
        L_0x002f:
            com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum r0 = com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum.PRODUCT_EXTENSION_SINGLE_MEDIA_TO_COLLECTION
            r3 = 0
            if (r1 != r0) goto L_0x0067
            if (r7 == 0) goto L_0x00c9
            X.1Xj r0 = r7.A1b()
            boolean r0 = r0.CeS()
            if (r0 != r5) goto L_0x0069
            X.0Tu r4 = X.0Tu.A06
            r0 = 36325905676711271(0x810e3800013567, double:3.03598725040915E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x0069
        L_0x004d:
            r1 = 1
        L_0x004e:
            boolean r0 = r7.CcK()
            if (r0 == 0) goto L_0x00c9
            if (r1 == 0) goto L_0x00c9
            java.lang.String r0 = "feed_contextual_ads_chain"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x00c6
            boolean r0 = A05(r6, r7)
            if (r0 == 0) goto L_0x007c
            X.4Jz r0 = X.C263274Jz.TAP_TO_WATCH_AND_BROWSE_LEADGEN_ON_REELS_VIEWER
            return r0
        L_0x0067:
            if (r7 == 0) goto L_0x00c9
        L_0x0069:
            boolean r0 = r7.CeS()
            if (r0 != r5) goto L_0x0076
            boolean r0 = r7.A5H()
            if (r0 != 0) goto L_0x0076
            goto L_0x004d
        L_0x0076:
            r1 = 0
            goto L_0x004e
        L_0x0078:
            r2 = r1
            if (r7 == 0) goto L_0x002f
            goto L_0x001d
        L_0x007c:
            com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum r0 = com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum.POST_TAP_WATCH_AND_BROWSE_VIEWER
            if (r2 != r0) goto L_0x0083
            X.4Jz r0 = X.C263274Jz.TAP_TO_WATCH_AND_BROWSE
            return r0
        L_0x0083:
            com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum r0 = com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum.POST_TAP_WATCH_AND_BROWSE_VIEWER_ON_REELS_VIEWER
            if (r2 != r0) goto L_0x008a
            X.4Jz r0 = X.C263274Jz.TAP_TO_WATCH_AND_BROWSE_REELS_VIEWER
            return r0
        L_0x008a:
            com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum r0 = com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum.POST_TAP_WATCH_AND_BROWSE_VIEWER_ON_REELS_VIEWER_WITH_CHAINING
            if (r2 != r0) goto L_0x0091
            X.4Jz r0 = X.C263274Jz.TAP_TO_WATCH_AND_BROWSE_ON_REELS_VIEWER_WITH_CHAINING
            return r0
        L_0x0091:
            com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum r0 = com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum.POST_TAP_REELS_VIEWER_WITH_CHAINING
            if (r2 != r0) goto L_0x009e
            boolean r0 = A0A(r6, r8, r3)
            if (r0 == 0) goto L_0x00b0
        L_0x009b:
            X.4Jz r0 = X.C263274Jz.TAP_TO_FEED_OF_ADS
            return r0
        L_0x009e:
            boolean r0 = A06(r6, r7)
            if (r0 == 0) goto L_0x00b3
            boolean r0 = A0A(r6, r8, r9)
            if (r0 != 0) goto L_0x009b
            boolean r0 = A09(r6, r8, r9)
            if (r0 == 0) goto L_0x00c3
        L_0x00b0:
            X.4Jz r0 = X.C263274Jz.TAP_TO_REELS_CHAIN
            return r0
        L_0x00b3:
            com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum r0 = com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum.POST_TAP_REELS_VIEWER
            if (r2 == r0) goto L_0x00c3
            boolean r0 = r7.A6A()
            if (r0 == 0) goto L_0x00c6
            r7.A6A()
            X.4Jz r0 = X.C263274Jz.TAP_TO_REELS
            return r0
        L_0x00c3:
            X.4Jz r0 = X.C263274Jz.TAP_TO_REELS
            return r0
        L_0x00c6:
            X.4Jz r0 = X.C263274Jz.TAP_TO_SOUND
            return r0
        L_0x00c9:
            X.4Jz r0 = X.C263274Jz.UNDEFINED
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C263264Jy.A00(com.instagram.common.session.UserSession, X.1Xj, java.lang.String, boolean):X.4Jz");
    }

    public static final C55174HdQ A01(Context context, UserSession userSession, C246623eu r60, AnonymousClass337 r61, Integer num, boolean z, boolean z2) {
        Object fny;
        Object fnx;
        Float Aod;
        int i;
        int max;
        float f;
        String BQz;
        Boolean ARY;
        C246623eu r3 = r60;
        if (r60 != null) {
            Context context2 = context;
            if (context != null) {
                int A01 = (int) ((((float) AnonymousClass0nB.A01(context2)) / ((float) r3.A01)) * ((float) r3.A00));
                int A08 = 0nA.A08(context2);
                AnonymousClass337 r11 = r61;
                int ordinal = r11.ordinal();
                UserSession userSession2 = userSession;
                boolean z3 = z;
                switch (ordinal) {
                    case 2:
                    case 7:
                        fny = new C51070Fo0(userSession2);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        if (z) {
                            fnx = new C51065Fnv(userSession2);
                        } else {
                            fnx = new C51067Fnx(userSession2, r11);
                        }
                        fny = (C51963G9j) fnx;
                        break;
                    case 6:
                        fny = new Object();
                        break;
                    case 8:
                        fny = new C51069Fnz(userSession2);
                        break;
                    case 10:
                        fny = new C51066Fnw(userSession2, r3);
                        break;
                    case 11:
                        fny = new C51068Fny(userSession2, r3);
                        break;
                    case 14:
                    case 15:
                        fny = new Object();
                        break;
                    default:
                        fny = new Object();
                        break;
                }
                G8L g8l = (G8L) fny;
                Float BPC = g8l.BPC();
                if (BPC != null) {
                    float f2 = (float) A08;
                    if ((((float) A01) / f2 <= BPC.floatValue() || z) && (Aod = g8l.Aod()) != null) {
                        float floatValue = Aod.floatValue();
                        Boolean Aof = g8l.Aof();
                        if (Aof != null) {
                            boolean booleanValue = Aof.booleanValue();
                            Boolean Aoe = g8l.Aoe();
                            if (Aoe != null) {
                                boolean booleanValue2 = Aoe.booleanValue();
                                Boolean BD5 = g8l.BD5();
                                if (BD5 != null) {
                                    boolean booleanValue3 = BD5.booleanValue();
                                    Boolean BD6 = g8l.BD6();
                                    if (BD6 != null) {
                                        boolean booleanValue4 = BD6.booleanValue();
                                        int A0G = 2Yu.A0G(context2, R.attr.bottomSheetTopCornerRadius);
                                        int i2 = A08 - A01;
                                        int BT3 = (int) (g8l.BT3() * f2);
                                        if (z2) {
                                            i = 0nA.A0A(context2);
                                        } else {
                                            i = 0;
                                        }
                                        if (g8l.CTm()) {
                                            max = (int) (g8l.B6O() * f2);
                                        } else {
                                            max = A0G + Math.max(i2, BT3);
                                        }
                                        int i3 = max + i;
                                        if (!z) {
                                            f = ((float) i3) / f2;
                                        } else if (g8l.CTn()) {
                                            f = g8l.B6P();
                                        } else {
                                            f = floatValue;
                                        }
                                        boolean BNp = g8l.BNp();
                                        String BR0 = g8l.BR0();
                                        if (!(BR0 == null || (BQz = g8l.BQz()) == null || (ARY = g8l.ARY()) == null)) {
                                            boolean booleanValue5 = ARY.booleanValue();
                                            boolean CWx = g8l.CWx();
                                            String AD3 = g8l.AD3();
                                            boolean Cd3 = g8l.Cd3();
                                            boolean APE = g8l.APE();
                                            boolean CYH = g8l.CYH();
                                            boolean Ceb = g8l.Ceb();
                                            String AE9 = g8l.AE9();
                                            double dragUpReleaseRatio = g8l.getDragUpReleaseRatio();
                                            double swipeUpDistanceAdjustment = g8l.getSwipeUpDistanceAdjustment();
                                            float swipeUpFlingVelocity = g8l.getSwipeUpFlingVelocity();
                                            double swipeDownDistanceAdjustment = g8l.getSwipeDownDistanceAdjustment();
                                            float swipeDownFlingVelocity = g8l.getSwipeDownFlingVelocity();
                                            boolean APM = g8l.APM();
                                            boolean EDM = g8l.EDM();
                                            Integer num2 = AnonymousClass05K.A00;
                                            if (num == num2) {
                                                if (ordinal == 4 || ordinal == 5) {
                                                    num2 = AnonymousClass05K.A01;
                                                }
                                                boolean ARc = g8l.ARc();
                                                g8l.CTm();
                                                return new XQ7(g8l.backPressDestination(), r11, num2, AD3, AE9, BR0, BQz, g8l.getDragUpReleaseRatio(), swipeUpDistanceAdjustment, swipeDownDistanceAdjustment, f, floatValue, swipeUpFlingVelocity, swipeDownFlingVelocity, A01, i3, ARc, booleanValue, APE, BNp, CYH, Ceb, g8l.ARM(), g8l.ARX(), g8l.CLh(), g8l.Ezb(), g8l.ARi(), g8l.Et7(), z3, g8l.AB8(), APM, EDM);
                                            }
                                            return new C54512HGy(g8l.backPressDestination(), AD3, AE9, BR0, BQz, dragUpReleaseRatio, f, floatValue, A01, i3, booleanValue, BNp, CYH, Ceb, g8l.CTm(), booleanValue2, booleanValue3, booleanValue4, booleanValue5, CWx, Cd3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.HdQ, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        if (A09(r13, r15.getModuleName(), true) != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00af, code lost:
        if (A0A(r13, r5, false) != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c9, code lost:
        if (A09(r13, r5, true) != false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cb, code lost:
        r4 = X.AnonymousClass05K.A01;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C55174HdQ A02(android.content.Context r12, com.instagram.common.session.UserSession r13, X.1Xj r14, X.AnonymousClass4DU r15, X.AnonymousClass337 r16, java.lang.Integer r17) {
        /*
            r11 = 0
            r1 = 1
            r0 = 2
            X.0qQ.A0B(r15, r0)
            r0 = 6
            r8 = r16
            X.0qQ.A0B(r8, r0)
            boolean r0 = r14.CcK()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            return r0
        L_0x0014:
            java.lang.String r0 = r15.getModuleName()
            r6 = r13
            X.4Jz r2 = A00(r13, r14, r0, r11)
            X.1Xy r0 = r14.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x0064
            X.3tc r0 = r0.BF5()
            if (r0 == 0) goto L_0x0064
            java.lang.Boolean r3 = r0.Cd2()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r10 = X.0qQ.A0K(r3, r0)
        L_0x0037:
            boolean r0 = r14.A5H()
            if (r0 == 0) goto L_0x005f
            X.1Xj r0 = r14.A1b()
            X.3eu r7 = r0.A1S()
        L_0x0045:
            X.4Jz r0 = X.C263274Jz.TAP_TO_WATCH_AND_BROWSE
            r9 = r17
            if (r2 == r0) goto L_0x0057
            X.4Jz r0 = X.C263274Jz.TAP_TO_WATCH_AND_BROWSE_REELS_VIEWER
            if (r2 == r0) goto L_0x0057
            X.4Jz r0 = X.C263274Jz.TAP_TO_WATCH_AND_BROWSE_ON_REELS_VIEWER_WITH_CHAINING
            if (r2 == r0) goto L_0x0057
            X.4Jz r0 = X.C263274Jz.TAP_TO_WATCH_AND_BROWSE_LEADGEN_ON_REELS_VIEWER
            if (r2 != r0) goto L_0x0066
        L_0x0057:
            r5 = r12
            X.HdQ r0 = A01(r5, r6, r7, r8, r9, r10, r11)
            if (r0 == 0) goto L_0x0066
            return r0
        L_0x005f:
            X.3eu r7 = r14.A1S()
            goto L_0x0045
        L_0x0064:
            r10 = 0
            goto L_0x0037
        L_0x0066:
            X.4Jz r0 = X.C263274Jz.TAP_TO_FEED_OF_ADS
            if (r2 == r0) goto L_0x00dc
            X.4Jz r0 = X.C263274Jz.TAP_TO_REELS_CHAIN
            if (r2 == r0) goto L_0x0088
            boolean r0 = A06(r13, r14)
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = r15.getModuleName()
            boolean r0 = A0A(r13, r0, r1)
            if (r0 != 0) goto L_0x00dc
            java.lang.String r0 = r15.getModuleName()
            boolean r0 = A09(r13, r0, r1)
            if (r0 == 0) goto L_0x00d0
        L_0x0088:
            X.337 r3 = X.AnonymousClass337.SEED_AD
        L_0x008a:
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            if (r9 != r4) goto L_0x00df
            java.lang.String r5 = r15.getModuleName()
            X.0qQ.A0B(r5, r1)
            X.1Xy r0 = r14.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x00ce
            X.3tc r0 = r0.BF5()
            if (r0 == 0) goto L_0x00ce
            com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum r2 = r0.BEn()
        L_0x00a7:
            com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum r0 = com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum.POST_TAP_REELS_VIEWER_WITH_CHAINING
            if (r2 != r0) goto L_0x00b9
            boolean r0 = A0A(r13, r5, r11)
            if (r0 == 0) goto L_0x00cb
        L_0x00b1:
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
        L_0x00b3:
            X.HGz r0 = new X.HGz
            r0.<init>(r3, r4)
            return r0
        L_0x00b9:
            boolean r0 = A06(r13, r14)
            if (r0 == 0) goto L_0x00b3
            boolean r0 = A0A(r13, r5, r1)
            if (r0 != 0) goto L_0x00b1
            boolean r0 = A09(r13, r5, r1)
            if (r0 == 0) goto L_0x00b3
        L_0x00cb:
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            goto L_0x00b3
        L_0x00ce:
            r2 = 0
            goto L_0x00a7
        L_0x00d0:
            boolean r0 = r14.A6A()
            if (r0 == 0) goto L_0x00d9
            X.337 r3 = X.AnonymousClass337.FEED_REEL_VIEWER_TALL_VIDEO
            goto L_0x008a
        L_0x00d9:
            X.337 r3 = X.AnonymousClass337.FEED_REEL_VIEWER_OTHER_RESOLUTION
            goto L_0x008a
        L_0x00dc:
            X.337 r3 = X.AnonymousClass337.FEED_OF_ADS
            goto L_0x008a
        L_0x00df:
            X.HdQ r0 = new X.HdQ
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C263264Jy.A02(android.content.Context, com.instagram.common.session.UserSession, X.1Xj, X.4DU, X.337, java.lang.Integer):X.HdQ");
    }

    public static final void A03(Activity activity, int i) {
        Fragment fragment;
        BrowserLiteFragment browserLiteFragment;
        REW rew;
        BottomSheetFragment bottomSheetFragment;
        0qQ.A0B(activity, 1);
        AnonymousClass37D A01 = AnonymousClass37D.A00.A01(activity);
        Fragment fragment2 = null;
        if (A01 != null) {
            fragment = A01.A09();
        } else {
            fragment = null;
        }
        if ((fragment instanceof BottomSheetFragment) && (bottomSheetFragment = (BottomSheetFragment) fragment) != null) {
            fragment2 = bottomSheetFragment.A0M();
        }
        if ((fragment2 instanceof BrowserLiteFragment) && (browserLiteFragment = (BrowserLiteFragment) fragment2) != null) {
            if (i == 2) {
                rew = REW.FULL_SCREEN;
            } else if (i != 3) {
                rew = REW.PEEK;
            } else {
                rew = REW.HALF_SHEET;
            }
            browserLiteFragment.FMM(rew, AnonymousClass05K.A1I);
        }
    }

    public static final boolean A05(UserSession userSession, 1Xj r5) {
        if (!0qQ.A0K(Boolean.valueOf(182.A06(0Tu.A05, userSession, 36329238571335551L)), true) || !1sx.A0S((AndroidLink) 00k.A0O(r5.A3P(), 0)) || r5.A5W()) {
            return false;
        }
        return true;
    }

    public static final boolean A07(UserSession userSession, 1Xj r4, String str, boolean z) {
        0Tu r2;
        0qQ.A0B(str, 1);
        0qQ.A0B(userSession, 3);
        if (r4 == null || !r4.CcK() || !r4.A6P(IGPostTriggerExperience.IG_POST_TRIGGER_EXPERIENCE_FEED_VIDEO_AD_TO_REELS_CHAIN) || !str.equals("feed_contextual_chain")) {
            return false;
        }
        if (z) {
            r2 = 0Tu.A05;
        } else {
            r2 = 0Tu.A06;
        }
        boolean A06 = 182.A06(r2, userSession, 36321992961763206L);
        0qQ.A0A(Boolean.valueOf(A06));
        return A06;
    }

    public static final boolean A08(UserSession userSession, 1Xj r3, String str, boolean z) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        if (r3 == null || !r3.CcK()) {
            return false;
        }
        switch (A00(userSession, r3, str, z).ordinal()) {
            case 0:
            case 9:
                return false;
            default:
                return true;
        }
    }

    public static final boolean A09(UserSession userSession, String str, boolean z) {
        0Tu r2;
        0qQ.A0B(str, 1);
        if (!str.equals("feed_timeline")) {
            return false;
        }
        if (z) {
            r2 = 0Tu.A05;
        } else {
            r2 = 0Tu.A06;
        }
        boolean A06 = 182.A06(r2, userSession, 36321992961435523L);
        0qQ.A0A(Boolean.valueOf(A06));
        return A06;
    }

    public static final boolean A0A(UserSession userSession, String str, boolean z) {
        0Tu r2;
        0qQ.A0B(str, 1);
        if (!str.equals("feed_timeline")) {
            return false;
        }
        if (z) {
            r2 = 0Tu.A05;
        } else {
            r2 = 0Tu.A06;
        }
        boolean A06 = 182.A06(r2, userSession, 36321992961501060L);
        0qQ.A0A(Boolean.valueOf(A06));
        return A06;
    }

    public final C55174HdQ A0B(Context context, UserSession userSession, 1Xj r10, AnonymousClass337 r11) {
        C246623eu r2;
        0qQ.A0B(r10, 0);
        if (!r10.CcK()) {
            return null;
        }
        if (r10.CeS()) {
            r2 = r10.A1S();
        } else {
            r2 = new C246623eu(r10.A0y(), r10.A0x());
        }
        return A01(context, userSession, r2, r11, AnonymousClass05K.A00, false, true);
    }

    public static final void A04(UserSession userSession, 1Xj r4, AnonymousClass4DU r5, C297795sM r6, String str, String str2) {
        String A0i = 002.A0i(AnonymousClass000.A00(1139), str, str2, '_');
        C254523sc A04 = C254513sb.A04(r4, r5, "gesture");
        A04.A0G(userSession, r4);
        A04.A73 = "bottom_sheet";
        A04.A4s = "watch_browse";
        A04.A7M = A0i;
        if (r6 != null) {
            A04.A12 = r6;
        }
        C233822wX.A0H(userSession, A04, r5);
    }

    public static final boolean A06(UserSession userSession, 1Xj r4) {
        if (!r4.A6P(IGPostTriggerExperience.IG_POST_TRIGGER_EXPERIENCE_FEED_VIDEO_AD_TO_REELS_CHAIN)) {
            return false;
        }
        if (182.A06(0Tu.A06, userSession, 36321992961566597L) || r4.A6A()) {
            return true;
        }
        return false;
    }
}
