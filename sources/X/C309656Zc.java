package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.6Zc  reason: invalid class name and case insensitive filesystem */
public final class C309656Zc implements C309666Zd {
    public C46505Dg8 A00;
    public UserSession A01;
    public C310016aI A02;
    public C317766nn A03;
    public C314626ia A04;
    public C311676d4 A05;
    public C262844Gf A06;
    public C310096aQ A07;
    public C314876iz A08;
    public C311266cP A09;
    public String A0A;
    public final C273384mU A0B;
    public final AnonymousClass0iw A0C;
    public final AnonymousClass4DU A0D;
    public final C317116mk A0E;
    public final C249763kK A0F;
    public final AnonymousClass6Z0 A0G;
    public final WeakReference A0H;

    private final void A01(C263944Ny r7, 1Xj r8, 2EG r9, Boolean bool, Long l, String str, String str2) {
        String str3;
        String str4;
        long j;
        Long A0n;
        if (0qQ.A0K(bool, true)) {
            str3 = r9.toString();
            str4 = "tappable_rounded_border";
        } else {
            str3 = "non_tappable_squared";
            str4 = str3;
        }
        UserSession userSession = this.A01;
        Long l2 = null;
        if (userSession == null) {
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
        0wc A012 = AnonymousClass0kN.A01(this.A0D, userSession);
        0Aj A002 = A012.A00(A012.A00, "instagram_ad_tap_collection_product_tile");
        A002.AAJ("action", str3);
        if (str == null || (A0n = 00y.A0n(10, str)) == null) {
            j = 0;
        } else {
            j = A0n.longValue();
        }
        A002.A9F("ad_id", Long.valueOf(j));
        A002.A7p("is_checkout_enabled", false);
        A002.A7p("is_tappable", bool);
        if (r7 != null) {
            l2 = r7.A00;
        }
        A002.A9F("merchant_id", l2);
        A002.AAJ("m_pk", r8.getId());
        A002.A9F("m_t", Long.valueOf((long) r8.BR7().A00));
        A002.A9F("product_id", l);
        A002.AAJ("tile_style", str4);
        A002.AAJ("tracking_token", str2);
        A002.Cgf();
    }

    public final void CI5(Context context, String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        0qQ.A0B(str4, 4);
        C46505Dg8 dg8 = this.A00;
        if (dg8 != null && dg8.A08.get() && str.length() != 0 && str2.length() != 0 && str3.length() != 0 && str4.length() != 0) {
            C54034GyJ gyJ = dg8.A00;
            if (gyJ != null) {
                gyJ.Ck7(str5);
            }
            C46505Dg8.A00(dg8);
            C310336ap r4 = new C310336ap();
            r4.A01 = 5000;
            r4.A0D = str;
            r4.A02();
            r4.A0L = true;
            r4.A0R = true;
            r4.A0G = str3;
            r4.A0J = true;
            r4.A0A = new Fd5(dg8, str5, str4);
            Drawable A022 = C14091Tpi.A02(context, str2);
            if (A022 != null) {
                r4.A08(A022, context.getColor(2Yu.A05(context)));
            }
            1xC.A01.A00(new AnonymousClass3GP(r4.A00()));
            dg8.A01();
        }
    }

    public final void Ch5(C255773uh r11, C250973mM r12) {
        Long l;
        long j;
        String str;
        Long l2;
        Integer num;
        Long l3;
        String str2;
        String str3;
        String str4;
        Integer num2;
        String str5;
        0qQ.A0B(r12, 0);
        0qQ.A0B(r11, 1);
        if (C297785sK.A0l(r12)) {
            C310016aI r0 = this.A02;
            if (r0 == null) {
                0qQ.A0F("reelViewerLogger");
                throw AnonymousClass00P.createAndThrow();
            }
            C310006aH r6 = r0.A01;
            if (r6 != null) {
                UserSession userSession = r6.A03;
                AnonymousClass0iw r7 = r6.A01;
                0wc A012 = AnonymousClass0kN.A01(r7, userSession);
                0Aj A002 = A012.A00(A012.A00, "instagram_ad_pivots_carousel_header_click");
                1Xj r02 = r11.A0b;
                r02.getClass();
                String A072 = C231122qu.A07(userSession, r02);
                Boolean bool = null;
                if (A072 != null) {
                    l = 00y.A0n(10, A072);
                } else {
                    l = null;
                }
                if (A002.isSampled() && l != null) {
                    A002.A9F("ad_id", l);
                    C270424gi r03 = r6.A00;
                    if (r03 != null) {
                        j = (long) r03.CMI(r12);
                    } else {
                        j = 0;
                    }
                    A002.A9F("chaining_position", Long.valueOf(j));
                    C249763kK r3 = r6.A04;
                    A002.AAJ("chaining_session_id", r3.getSessionId());
                    A002.AAJ("client_session_id", r3.getSessionId());
                    A002.AAJ("contextual_ads_category", "");
                    A002.AAe("position", 0sr.A1M(new Long[]{0L, Long.valueOf((long) r12.A01)}));
                    Reel reel = r12.A0H;
                    IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
                    if (intentAwareAdsInfo != null) {
                        str = intentAwareAdsInfo.A09;
                    } else {
                        str = null;
                    }
                    A002.AAJ("trigger_type", str);
                    IntentAwareAdsInfo intentAwareAdsInfo2 = reel.A0B;
                    if (intentAwareAdsInfo2 == null || (str5 = intentAwareAdsInfo2.A07) == null) {
                        l2 = null;
                    } else {
                        l2 = 00y.A0n(10, str5);
                    }
                    A002.A9F("hscroll_seed_ad_id", l2);
                    A002.AAJ("container_module", r7.getModuleName());
                    IntentAwareAdsInfo intentAwareAdsInfo3 = reel.A0B;
                    if (intentAwareAdsInfo3 != null) {
                        num = intentAwareAdsInfo3.A02;
                    } else {
                        num = null;
                    }
                    A002.AAJ("multi_ads_type", String.valueOf(num));
                    IntentAwareAdsInfo intentAwareAdsInfo4 = reel.A0B;
                    if (intentAwareAdsInfo4 == null || (num2 = intentAwareAdsInfo4.A02) == null) {
                        l3 = null;
                    } else {
                        l3 = Long.valueOf((long) num2.intValue());
                    }
                    A002.A9F("multi_ads_type_number", l3);
                    IntentAwareAdsInfo intentAwareAdsInfo5 = reel.A0B;
                    if (intentAwareAdsInfo5 != null) {
                        str2 = intentAwareAdsInfo5.A06;
                    } else {
                        str2 = null;
                    }
                    A002.AAJ("multi_ads_id", str2);
                    IntentAwareAdsInfo intentAwareAdsInfo6 = reel.A0B;
                    if (intentAwareAdsInfo6 != null) {
                        str3 = intentAwareAdsInfo6.A06;
                    } else {
                        str3 = null;
                    }
                    A002.AAJ("multi_ads_unit_id", str3);
                    IntentAwareAdsInfo intentAwareAdsInfo7 = reel.A0B;
                    if (intentAwareAdsInfo7 != null) {
                        str4 = intentAwareAdsInfo7.A04;
                    } else {
                        str4 = null;
                    }
                    A002.AAJ("insertion_mechanism", str4);
                    IntentAwareAdsInfo intentAwareAdsInfo8 = reel.A0B;
                    if (intentAwareAdsInfo8 != null) {
                        bool = intentAwareAdsInfo8.A01;
                    }
                    A002.A7p("is_seed_ad_multi_ads_eligible", bool);
                    A002.AAJ("tracking_token", r11.ByO(userSession));
                    A002.Cgf();
                }
            }
        }
    }

    public final void CtE(C255773uh r2) {
        0qQ.A0B(r2, 0);
        this.A0E.CtE(r2);
    }

    public final void D0p(C255773uh r12, C250973mM r13, AnonymousClass6MB r14) {
        Context context;
        String str;
        Fragment fragment = (Fragment) this.A0H.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            C273384mU r1 = this.A0B;
            r1.EHS(true);
            r1.EHY("tapped");
            C310016aI r7 = this.A02;
            if (r7 == null) {
                str = "reelViewerLogger";
            } else {
                Reel reel = r13.A0H;
                if (r12.CWu()) {
                    1Xj r6 = r12.A0b;
                    if (r6 != null) {
                        UserSession userSession = r7.A06;
                        C310026aJ r4 = r7.A0A;
                        r4.A00 = reel;
                        C254523sc A042 = C254513sb.A04(r6, r4, "caption_more_click");
                        A042.A0G(userSession, r6);
                        A042.A86 = r14.B2b();
                        Map BLs = r14.BLs();
                        0jB r9 = A042.A0m;
                        if (r9 == null) {
                            r9 = new 0jB();
                            A042.A0m = r9;
                        }
                        r9.A04(C271774jZ.A4s, Boolean.valueOf(Boolean.parseBoolean((String) BLs.getOrDefault("is_systematic_caption", "false"))));
                        C310016aI.A04(A042, (GT8) r7.A0I.get(r12.CFY()), r7);
                        String str2 = AnonymousClass1QI.A00.A02.A00;
                        if (str2 != null) {
                            A042.A65 = str2;
                        }
                        C233822wX.A0C(userSession, A042, r6, r4, (Integer) null);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                C317766nn r3 = this.A03;
                if (r3 == null) {
                    str = "reelViewerBottomSheetManager";
                } else {
                    String moduleName = this.A0C.getModuleName();
                    if (r3 instanceof C315656kI) {
                        r3.A0H(context, r13, moduleName, (String) null);
                        return;
                    }
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void D0s(boolean z, boolean z2) {
        this.A0E.DvB(false);
        this.A0B.EHS(true);
    }

    public final void D7L(C255783ui r2, float f, float f2) {
        0qQ.A0B(r2, 0);
        A04(r2, "tap_cta_sticker_attempt", f, f2);
    }

    public final void D7M(C255773uh r7, 2EG r8, float f, float f2) {
        0qQ.A0B(r7, 0);
        A02(r7, r8, "tap_cta_sticker", f, f2);
    }

    public final void DCB(C255773uh r4) {
        C313056fm r0;
        0qQ.A0B(r4, 0);
        AnonymousClass6Z5 r2 = (AnonymousClass6Z5) this.A0E;
        if (r4.CcK() && (r0 = ((ReelViewerFragment) r2.A17).mViewPager) != null && r0.isIdle()) {
            r2.CI6((28D) null, r4, (VWL) null, 2EG.A3l);
        }
    }

    public final void DCC(C255773uh r4) {
        C313056fm r0;
        0qQ.A0B(r4, 0);
        AnonymousClass6Z5 r2 = (AnonymousClass6Z5) this.A0E;
        if (r4.CcK() && (r0 = ((ReelViewerFragment) r2.A17).mViewPager) != null && r0.isIdle()) {
            r2.CI6((28D) null, r4, (VWL) null, 2EG.A3m);
        }
    }

    public final void DDc(C255773uh r13, C309426Yf r14, float[] fArr) {
        float f = (r14.A0A / 1000.0f) * r14.A0B;
        C310016aI r0 = this.A02;
        if (r0 != null) {
            r0.A08(r13, f);
            C273384mU r1 = this.A0B;
            C250973mM AuO = r1.AuO(r13.A0k);
            if (AuO != null) {
                C310016aI r5 = this.A02;
                if (r5 != null) {
                    r5.A0K(AuO, ((C310566bG) ((ReelViewerFragment) r1).A1E).A0B.Bz3(r13), (Float) null, "tap_expand_story", fArr[0], fArr[1]);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("reelViewerLogger");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r5.A0G;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DDd(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            r4 = 0
            X.0qQ.A0B(r6, r4)
            if (r7 == 0) goto L_0x003c
            X.6Z0 r0 = r5.A0G
            X.6jw r3 = r0.A0G
            if (r3 == 0) goto L_0x003c
            com.instagram.common.session.UserSession r2 = r0.A00
            if (r2 != 0) goto L_0x001a
            java.lang.String r0 = "userSession"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001a:
            X.5Gv r0 = r3.A00
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x003c
        L_0x0024:
            X.0xa r1 = r3.A03
            java.lang.String r0 = r3.A04
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x003c
            X.5Gt r0 = r3.A02
            r0.A03(r6)
            X.5Gv r0 = r0.A00()
            r3.A00 = r0
            r0.A07(r2)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309656Zc.DDd(android.view.View, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        if (r14 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        if (r0 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        r0 = r0.A0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0060, code lost:
        if (r0 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0062, code lost:
        r16 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0068, code lost:
        if (r0.A5D() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        r16 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006c, code lost:
        X.C70283O0n.A00(r6, r7, X.C66579MXk.A00(129), r9, r10, r11, r12, r22, r14, r15, r16, false, true, false);
        r1.EHd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DH3(com.instagram.common.session.UserSession r21, java.lang.String r22) {
        /*
            r20 = this;
            r2 = 0
            r18 = 1
            r5 = r20
            java.lang.ref.WeakReference r0 = r5.A0H
            java.lang.Object r0 = r0.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x007e
            android.content.Context r6 = r0.getContext()
            if (r6 == 0) goto L_0x007e
            X.4mU r1 = r5.A0B
            r0 = r1
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.3mM r3 = r0.A0a
            if (r3 != 0) goto L_0x0085
            r0 = 0
        L_0x001f:
            r11 = 0
            r7 = r21
            if (r0 == 0) goto L_0x0083
            X.1Xj r4 = r0.A0b
            if (r4 == 0) goto L_0x0083
            boolean r3 = X.C247643gg.A05(r7, r4)
            if (r3 == 0) goto L_0x0083
            com.instagram.user.model.User r3 = X.C247643gg.A00(r7, r4)
            if (r3 == 0) goto L_0x0083
            java.lang.String r15 = r3.getId()
        L_0x0038:
            X.0iw r3 = r5.A0C
            java.lang.String r9 = r3.getModuleName()
            if (r0 == 0) goto L_0x0081
            X.1Xj r3 = r0.A0b
            if (r3 == 0) goto L_0x0081
            java.lang.String r10 = r3.getId()
        L_0x0048:
            java.lang.String r4 = ""
            if (r10 != 0) goto L_0x004d
            r10 = r4
        L_0x004d:
            if (r0 == 0) goto L_0x007f
            java.lang.String r11 = r0.A0k
            java.lang.String r12 = r0.A0j
            X.3OA r3 = r0.A0g
            if (r3 == 0) goto L_0x005b
            java.lang.String r14 = r3.A0S
            if (r14 != 0) goto L_0x005e
        L_0x005b:
            r14 = r4
            if (r0 == 0) goto L_0x006a
        L_0x005e:
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x006a
            boolean r0 = r0.A5D()
            r16 = -1
            if (r0 == 0) goto L_0x006c
        L_0x006a:
            r16 = 0
        L_0x006c:
            r0 = 129(0x81, float:1.81E-43)
            java.lang.String r8 = X.C66579MXk.A00(r0)
            r13 = r22
            r19 = r2
            r17 = r2
            X.C70283O0n.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1.EHd()
        L_0x007e:
            return
        L_0x007f:
            r12 = r11
            goto L_0x005b
        L_0x0081:
            r10 = r11
            goto L_0x0048
        L_0x0083:
            r15 = r11
            goto L_0x0038
        L_0x0085:
            com.instagram.common.session.UserSession r0 = r0.getSession()
            X.0qQ.A0B(r0, r2)
            java.util.List r0 = X.C250973mM.A00(r0, r3)
            java.lang.Object r0 = r0.get(r2)
            X.3uh r0 = (X.C255773uh) r0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309656Zc.DH3(com.instagram.common.session.UserSession, java.lang.String):void");
    }

    public final void DIX(C255783ui r8, boolean z) {
        String str;
        String str2;
        if (!r8.A1f.equals("interactive_media_tooltip_from_tap_and_hold") || z) {
            str = "tapped";
        } else {
            str = "long_pressed";
        }
        C273384mU r2 = this.A0B;
        r2.EHY(str);
        C317116mk r4 = this.A0E;
        r4.DcE(r8, (int) r8.A03, (int) r8.A04);
        if (!z) {
            C255773uh Au5 = r2.Au5();
            if (Au5 != null) {
                boolean A0Z = C297785sK.A0Z(Au5);
                boolean equals = r8.A1f.equals("interactive_media_tooltip_from_tap_and_hold");
                if (A0Z) {
                    if (!equals) {
                        str2 = "tap_interactive_media";
                    } else {
                        str2 = "tap_and_hold_non_9x16_interactive_media";
                    }
                } else if (!equals) {
                    str2 = "tap_9x16_interactive_media";
                } else {
                    str2 = "tap_and_hold_9x16_interactive_media";
                }
                A03(Au5, str2, r8.A03, r8.A04);
            } else {
                return;
            }
        }
        if (r8.A1f.equals("interactive_media_tooltip_from_tap_and_hold") && z) {
            r4.DvB(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r0.A04() == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r1 == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DJ9(X.C255783ui r6) {
        /*
            r5 = this;
            r4 = 0
            X.0qQ.A0B(r6, r4)
            X.6ia r0 = r5.A04
            java.lang.String r3 = "reelInteractiveController"
            if (r0 == 0) goto L_0x0039
            X.3ui r0 = r0.A01
            if (r0 == 0) goto L_0x0015
            boolean r1 = r0.equals(r6)
            r0 = 1
            if (r1 != 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r2 = 1
            if (r0 == 0) goto L_0x0024
            X.6ia r0 = r5.A04
            if (r0 == 0) goto L_0x0039
            boolean r0 = r0.A04()
            r1 = 1
            if (r0 != 0) goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            X.6ia r0 = r5.A04
            if (r0 == 0) goto L_0x0039
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x0038
            r6.A1p = r2
            X.6ia r0 = r5.A04
            if (r0 == 0) goto L_0x0039
            r0.A03(r6, r2, r4)
        L_0x0038:
            return r1
        L_0x0039:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309656Zc.DJ9(X.3ui):boolean");
    }

    public final void DL3(C255783ui r11) {
        String str;
        C250973mM r0;
        long j;
        Long A0n;
        String str2;
        0qQ.A0B(r11, 0);
        String str3 = null;
        A04(r11, (String) null, r11.A03, r11.A04);
        C273384mU r4 = this.A0B;
        C255773uh Au5 = r4.Au5();
        if (Au5 != null) {
            if (r11.A1H.booleanValue()) {
                str = "tap_interactive_sticker_present_tooltip";
            } else {
                str = "tap_interactive_sticker_dismiss_tooltip";
            }
            A03(Au5, str, r11.A03, r11.A04);
            if (Au5.A19() && r11.A1H.booleanValue() && (r0 = ((ReelViewerFragment) r4).A0a) != null) {
                C310016aI r5 = this.A02;
                if (r5 == null) {
                    str2 = "reelViewerLogger";
                } else {
                    UserSession userSession = this.A01;
                    if (userSession == null) {
                        str2 = "userSession";
                    } else {
                        0wc A012 = AnonymousClass0kN.A01(C310016aI.A01(r0.A0H, r5), userSession);
                        1Xj r6 = Au5.A0b;
                        AnonymousClass3OA r02 = Au5.A0g;
                        Long l = null;
                        if (r02 != null) {
                            str3 = r02.A0S;
                        }
                        IGCTMessagingAdsInfoDictIntf A002 = C231122qu.A00(userSession, r6);
                        if (A002 != null) {
                            l = Long.valueOf(C16947VBz.A00(A002));
                        }
                        0Aj A003 = A012.A00(A012.A00, "whatsapp_sticker_tooltip_impression");
                        if (A003.isSampled()) {
                            long j2 = 0;
                            if (str3 == null || (A0n = 00y.A0n(10, str3)) == null) {
                                j = 0;
                            } else {
                                j = A0n.longValue();
                            }
                            A003.A9F("ad_id", Long.valueOf(j));
                            if (l != null) {
                                j2 = l.longValue();
                            }
                            A003.A9F("page_id", Long.valueOf(j2));
                            String A062 = C231122qu.A06(userSession, r6);
                            if (A062 == null) {
                                if (r6 != null) {
                                    A062 = r6.A0C.getOrganicTrackingToken();
                                } else {
                                    A062 = null;
                                }
                            }
                            A003.AAJ("client_token", A062);
                            A003.AAJ(C46346Dcp.A00(), r5.A0E.getSessionId());
                            A003.A8M(XSH.PAGE_INSTAGRAM_STORY, "on_feed_messaging_surface");
                            A003.AAJ("message_destination", "WHATSAPP");
                            A003.Cgf();
                            return;
                        }
                        return;
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final void DL7(C255773uh r11, C255783ui r12, 2EG r13) {
        String str;
        float f = r12.A03;
        float f2 = r12.A04;
        C255773uh r5 = r11;
        boolean A0Z = C297785sK.A0Z(r11);
        boolean equals = r12.A1f.equals("interactive_media_tooltip_from_tap_and_hold");
        if (A0Z) {
            if (!equals) {
                str = "tap_interactive_media_tooltip";
            } else {
                str = "tap_and_hold_non_9x16_interactive_media_tooltip";
            }
        } else if (!equals) {
            str = "tap_9x16_interactive_media_tooltip";
        } else {
            str = "tap_and_hold_9x16_interactive_media_tooltip";
        }
        A02(r5, r13, str, f, f2);
        if (r12.A1f.equals("interactive_media_tooltip_from_tap_and_hold")) {
            this.A0E.DvB(true);
        }
    }

    public final void DSM(C255773uh r19, C250973mM r20, float f, float f2) {
        FragmentActivity activity;
        User user;
        String str;
        C310016aI r11 = this.A02;
        String str2 = null;
        if (r11 == null) {
            str = "reelViewerLogger";
        } else {
            C273384mU r6 = this.A0B;
            C255773uh r5 = r19;
            r11.A0K(r20, ((ReelViewerFragment) r6).A1E.Bz3(r5), (Float) null, "tap_social_context", f, f2);
            Fragment fragment = (Fragment) this.A0H.get();
            if (fragment != null && (activity = fragment.getActivity()) != null && (user = r5.A0i) != null) {
                UserSession userSession = this.A01;
                str = "userSession";
                if (userSession != null) {
                    0Tu r4 = 0Tu.A06;
                    if (182.A06(r4, userSession, 36320884861117364L)) {
                        r6.EHS(true);
                        r6.EHY("tapped");
                        UserSession userSession2 = this.A01;
                        if (userSession2 != null) {
                            AnonymousClass0iw r10 = this.A0C;
                            1Xj r0 = r5.A0b;
                            if (r0 != null) {
                                str2 = r0.getId();
                            }
                            UserSession userSession3 = this.A01;
                            if (userSession3 != null) {
                                boolean A062 = 182.A06(r4, userSession3, 36320884861182901L);
                                UserSession userSession4 = this.A01;
                                if (userSession4 != null) {
                                    F8F.A01(activity, r10, userSession2, new C40646AgM(this), user, str2, A062, 182.A06(r4, userSession4, 2342163894074942390L));
                                    return;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DSN(RectF rectF, C255773uh r8, C250973mM r9, Integer num) {
        0qQ.A0B(num, 2);
        this.A0E.DcP((RectF) null, r8, r9, num, false);
    }

    public final void DSY(C255773uh r5, C250973mM r6, C255783ui r7) {
        String str;
        0qQ.A0B(r6, 1);
        0qQ.A0B(r5, 2);
        C310016aI r1 = this.A02;
        if (r1 == null) {
            str = "reelViewerLogger";
        } else {
            r1.A0B(r5, r6, AnonymousClass05K.A00);
            C311676d4 r0 = this.A05;
            str = "reelUserProfileTooltipHelper";
            if (r0 != null) {
                C275794rx r02 = r0.A05;
                if (r02 == null || !r02.isShowing()) {
                    A04(r7, "tap_multi_advertiser_carousel_banner_cta", r7.A03, r7.A04);
                    return;
                }
                C311676d4 r03 = this.A05;
                if (r03 != null) {
                    r03.A00(true, false);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DSa(android.graphics.RectF r19, X.C255773uh r20, X.C250973mM r21) {
        /*
            r18 = this;
            r6 = 1
            r2 = r20
            X.3HX r4 = r2.A08
            if (r4 == 0) goto L_0x00e0
            java.lang.String r3 = "multi_ad_pop_up_"
            java.lang.String r0 = r4.A1U
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x00c4
            java.lang.String r3 = X.002.A0R(r3, r0)
            X.3HX r0 = X.AnonymousClass3P9.A00
            X.0qQ.A0B(r3, r6)
            X.4Ip r0 = new X.4Ip
            r0.<init>(r4)
            r0.A1U = r3
            X.3HX r4 = r0.A00()
            r5 = r18
            com.instagram.common.session.UserSession r0 = r5.A01
            java.lang.String r8 = "userSession"
            if (r0 == 0) goto L_0x00bc
            com.instagram.reels.store.ReelStore r3 = com.instagram.reels.store.ReelStore.A03(r0)
            java.util.List r0 = java.util.Collections.singletonList(r4)
            X.0qQ.A07(r0)
            java.util.ArrayList r0 = r3.A0S(r0)
            java.lang.Object r11 = X.00k.A0I(r0)
            com.instagram.model.reels.Reel r11 = (com.instagram.model.reels.Reel) r11
            r3 = r21
            com.instagram.model.reels.Reel r0 = r3.A0H
            com.instagram.api.schemas.IntentAwareAdsInfo r0 = r0.A0B
            if (r0 == 0) goto L_0x00b6
            r11.A0B = r0
            com.instagram.common.session.UserSession r0 = r5.A01
            if (r0 == 0) goto L_0x00bc
            java.util.List r0 = r11.A0O(r0)
            int r0 = r0.size()
            int r0 = r0 - r6
            r11.A00 = r0
            com.instagram.common.session.UserSession r10 = r5.A01
            if (r10 == 0) goto L_0x00bc
            r14 = -1
            boolean r17 = r11.CcK()
            long r15 = java.lang.System.currentTimeMillis()
            java.lang.String r12 = r3.A0I
            java.lang.String r13 = r3.A0J
            X.3mM r9 = new X.3mM
            r9.<init>(r10, r11, r12, r13, r14, r15, r17)
            com.instagram.common.session.UserSession r7 = r5.A01
            if (r7 == 0) goto L_0x00bc
            X.0Tu r0 = X.0Tu.A06
            r3 = 36317818255513172(0x8106dd00231654, double:3.030872732678041E-306)
            boolean r0 = X.182.A06(r0, r7, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00b4
            com.instagram.common.session.UserSession r0 = r5.A01
            if (r0 == 0) goto L_0x00bc
            java.util.List r0 = r11.A0O(r0)
            int r0 = r0.size()
            if (r0 <= r6) goto L_0x00b4
            com.instagram.common.session.UserSession r0 = r5.A01
            if (r0 == 0) goto L_0x00bc
            X.3uh r0 = r11.A0A(r0, r6)
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x00b4
            java.lang.String r10 = r0.getId()
        L_0x00a6:
            X.4Gf r4 = r5.A06
            if (r4 != 0) goto L_0x00ca
            java.lang.String r0 = "highlightReelOpener"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00b4:
            r10 = 0
            goto L_0x00a6
        L_0x00b6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00bc:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00ca:
            com.instagram.model.reels.Reel r0 = r9.A0H
            java.lang.String r9 = r0.getId()
            X.0qQ.A07(r9)
            com.instagram.user.model.User r0 = r2.A0i
            if (r0 == 0) goto L_0x00e1
            X.3BQ r7 = X.AnonymousClass3BQ.MULTI_ADVERTISER_CAROUSEL_POP_UP
            r6 = 0
            r5 = r19
            r8 = r0
            r4.A00(r5, r6, r7, r8, r9, r10)
        L_0x00e0:
            return
        L_0x00e1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309656Zc.DSa(android.graphics.RectF, X.3uh, X.3mM):void");
    }

    public final void DWG(C255773uh r10, C250973mM r11, C309426Yf r12) {
        C310096aQ r0 = this.A07;
        if (r0 == null) {
            0qQ.A0F("reelProfileOpener");
            throw AnonymousClass00P.createAndThrow();
        }
        User A0L = r10.A0L();
        r0.A02(HLF.BRAND, r10, r11, r12, A0L, "sponsor_in_header", "reel_viewer_go_to_profile", false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012a, code lost:
        if (X.182.A06(r8, r9, r0) != false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012c, code lost:
        r2 = (double) (android.os.SystemClock.uptimeMillis() - r13.A0N);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0138, code lost:
        if (r24.A5X() != false) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013e, code lost:
        if (r24.A6C() != false) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0140, code lost:
        r1 = r10.A11.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0148, code lost:
        if (r1 == 10) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014c, code lost:
        if (r1 == 7) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014e, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0153, code lost:
        if (r2 < ((double) r4)) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0155, code lost:
        r23 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015e, code lost:
        if (r2 >= 2000.0d) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0160, code lost:
        if (r23 == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0166, code lost:
        if (r10.A11 != X.AnonymousClass3WT.DPA) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x016c, code lost:
        if (r24.A5X() != false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0172, code lost:
        if (r24.A6C() != false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0174, code lost:
        r13.A0p = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0178, code lost:
        ((X.C310566bG) r15.A1E).A0B.Bz3(r11).A0o = true;
        ((X.C310566bG) r15.A1E).A0B.Bz3(r11).A0X = r27;
        r1 = r28.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0198, code lost:
        if (r1 != null) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x019a, code lost:
        r0 = "reelInteractiveController";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019e, code lost:
        if (r23 == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a1, code lost:
        r0 = 36608956906477326L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ab, code lost:
        if (r24.A5X() == false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ad, code lost:
        r0 = 36609536727455607L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b3, code lost:
        r0 = 36609536727390070L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b9, code lost:
        r0 = 36608956906542863L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01be, code lost:
        r4 = X.182.A01(r8, r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x020b, code lost:
        if (((double) r10.A04) <= r2) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0213, code lost:
        if (r1.A04() == false) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0215, code lost:
        r1.A03(r10, true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x021a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x021b, code lost:
        r1 = r1.A08;
        r0 = r1.AqN();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0221, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0223, code lost:
        r1.DYC(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0226, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DZx(android.content.Context r30, X.C255783ui r31, java.lang.Integer r32) {
        /*
            r29 = this;
            r14 = 0
            r2 = r30
            X.0qQ.A0B(r2, r14)
            r26 = 1
            r1 = 2
            r27 = r32
            r0 = r27
            X.0qQ.A0B(r0, r1)
            r28 = r29
            r0 = r28
            X.4mU r12 = r0.A0B
            java.lang.String r0 = "tapped"
            r12.EHY(r0)
            X.3uh r11 = r12.Au5()
            r25 = 0
            r10 = r31
            if (r11 == 0) goto L_0x00a3
            X.1Xj r0 = r11.A0b
            r24 = r0
            if (r0 == 0) goto L_0x0087
            r0 = r28
            com.instagram.common.session.UserSession r9 = r0.A01
            if (r9 != 0) goto L_0x003b
            java.lang.String r0 = "userSession"
        L_0x0033:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003b:
            r15 = r12
            instagram.features.stories.fragment.ReelViewerFragment r15 = (instagram.features.stories.fragment.ReelViewerFragment) r15
            X.4gh r0 = r15.A1E
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            X.6Yf r13 = r0.Bz3(r11)
            r23 = 0
            r13.A0p = r14
            long r0 = r13.A0N
            r4 = 0
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0087
            r22 = 10
            r21 = 7
            boolean r0 = r24.A5X()
            if (r0 != 0) goto L_0x00b1
            boolean r0 = r24.A6C()
            if (r0 != 0) goto L_0x00b1
            r0 = r24
            X.1Xy r0 = r0.A0C
            com.instagram.model.showreel.IgShowreelComposition r0 = r0.BwC()
            if (r0 == 0) goto L_0x00af
            java.lang.String r1 = r0.C4b()
        L_0x0072:
            java.lang.String r0 = "ig_stories_carousel_media_showcase"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0111
            X.0Tu r3 = X.0Tu.A06
            r0 = 36328173419445300(0x81104800013c34, double:3.037421380045617E-306)
            boolean r0 = X.182.A06(r3, r9, r0)
            if (r0 == 0) goto L_0x0111
        L_0x0087:
            instagram.features.stories.fragment.ReelViewerFragment r12 = (instagram.features.stories.fragment.ReelViewerFragment) r12
            X.4gh r0 = r12.A1E
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            X.6Yf r0 = r0.Bz3(r11)
            r0.A0o = r14
            X.4gh r0 = r12.A1E
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            X.6Yf r1 = r0.Bz3(r11)
            r0 = r25
            r1.A0X = r0
        L_0x00a3:
            float r0 = r10.A03
            int r2 = (int) r0
            float r0 = r10.A04
            int r1 = (int) r0
            r0 = r28
            r0.DcE(r10, r2, r1)
        L_0x00ae:
            return
        L_0x00af:
            r1 = 0
            goto L_0x0072
        L_0x00b1:
            int r0 = X.0nA.A09(r2)
            float r1 = (float) r0
            int r0 = X.0nA.A08(r2)
            float r2 = (float) r0
            double r6 = (double) r1
            X.0Tu r8 = X.0Tu.A05
            r0 = 37172486680412735(0x84102e0001023f, double:3.571368486058039E-306)
            double r19 = X.182.A00(r8, r9, r0)
            double r19 = r19 * r6
            double r4 = (double) r2
            r0 = 37172486680543809(0x84102e00030241, double:3.571368486140931E-306)
            double r17 = X.182.A00(r8, r9, r0)
            double r17 = r17 * r4
            r0 = 37172486680478272(0x84102e00020240, double:3.571368486099485E-306)
            double r0 = X.182.A00(r8, r9, r0)
            double r6 = r6 * r0
            r0 = 37172486680347198(0x84102e0000023e, double:3.571368486016593E-306)
            double r0 = X.182.A00(r8, r9, r0)
            double r4 = r4 * r0
            float r0 = r10.A03
            double r2 = (double) r0
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 < 0) goto L_0x0087
            float r0 = r10.A04
            double r0 = (double) r0
            int r16 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r16 < 0) goto L_0x0087
            int r16 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r16 > 0) goto L_0x0087
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0087
            boolean r0 = r24.A5X()
            if (r0 == 0) goto L_0x010b
            r0 = 36328061750623145(0x81102e00063ba9, double:3.037350760232832E-306)
            goto L_0x0126
        L_0x010b:
            r0 = 36328061750819754(0x81102e00093baa, double:3.0373507603571683E-306)
            goto L_0x0126
        L_0x0111:
            X.3WT r0 = r10.A11
            int r1 = r0.ordinal()
            r0 = r22
            if (r1 == r0) goto L_0x01c3
            r0 = r21
            if (r1 != r0) goto L_0x0087
            X.0Tu r8 = X.0Tu.A05
            r0 = 36327481929710040(0x810fa7000139d8, double:3.036984079152633E-306)
        L_0x0126:
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 == 0) goto L_0x0087
        L_0x012c:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r13.A0N
            long r0 = r0 - r2
            double r2 = (double) r0
            boolean r0 = r24.A5X()
            if (r0 != 0) goto L_0x01a7
            boolean r0 = r24.A6C()
            if (r0 != 0) goto L_0x01a7
            X.3WT r0 = r10.A11
            int r1 = r0.ordinal()
            r0 = r22
            if (r1 == r0) goto L_0x01a1
            r0 = r21
            if (r1 == r0) goto L_0x01b9
            r4 = 0
        L_0x0150:
            double r0 = (double) r4
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x0157
            r23 = 1
        L_0x0157:
            r4 = 4656510908468559872(0x409f400000000000, double:2000.0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x019e
            if (r23 == 0) goto L_0x0087
            X.3WT r1 = r10.A11
            X.3WT r0 = X.AnonymousClass3WT.DPA
            if (r1 != r0) goto L_0x0178
            boolean r0 = r24.A5X()
            if (r0 != 0) goto L_0x0178
            boolean r0 = r24.A6C()
            if (r0 != 0) goto L_0x0178
            r0 = r26
            r13.A0p = r0
        L_0x0178:
            X.4gh r0 = r15.A1E
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            X.6Yf r1 = r0.Bz3(r11)
            r0 = r26
            r1.A0o = r0
            X.4gh r0 = r15.A1E
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            X.6Yf r1 = r0.Bz3(r11)
            r0 = r27
            r1.A0X = r0
            r0 = r28
            X.6ia r1 = r0.A04
            if (r1 != 0) goto L_0x020f
            java.lang.String r0 = "reelInteractiveController"
            goto L_0x0033
        L_0x019e:
            if (r23 == 0) goto L_0x0087
            goto L_0x0178
        L_0x01a1:
            r0 = 36608956906477326(0x820fa70002170e, double:3.214989987869022E-306)
            goto L_0x01be
        L_0x01a7:
            boolean r0 = r24.A5X()
            if (r0 == 0) goto L_0x01b3
            r0 = 36609536727455607(0x82102e00081777, double:3.215356668990439E-306)
            goto L_0x01be
        L_0x01b3:
            r0 = 36609536727390070(0x82102e00071776, double:3.215356668948993E-306)
            goto L_0x01be
        L_0x01b9:
            r0 = 36608956906542863(0x820fa70003170f, double:3.214989987910468E-306)
        L_0x01be:
            long r4 = X.182.A01(r8, r9, r0)
            goto L_0x0150
        L_0x01c3:
            X.0Tu r8 = X.0Tu.A05
            r0 = 2342170491143338455(0x20810fa7000039d7, double:4.071929921901639E-152)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 == 0) goto L_0x0087
            int r0 = X.0nA.A09(r2)
            float r1 = (float) r0
            int r0 = X.0nA.A08(r2)
            float r2 = (float) r0
            double r4 = (double) r1
            r0 = 37171906860089902(0x840fa70005022e, double:3.5710018053511305E-306)
            double r16 = X.182.A00(r8, r9, r0)
            double r16 = r16 * r4
            r0 = 37171906860155439(0x840fa70006022f, double:3.5710018053925764E-306)
            double r0 = X.182.A00(r8, r9, r0)
            double r4 = r4 * r0
            double r2 = (double) r2
            r0 = 37171906860024365(0x840fa70004022d, double:3.5710018053096846E-306)
            double r0 = X.182.A00(r8, r9, r0)
            double r2 = r2 * r0
            float r0 = r10.A03
            double r0 = (double) r0
            int r6 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r6 < 0) goto L_0x0087
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0087
            float r0 = r10.A04
            double r0 = (double) r0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0087
            goto L_0x012c
        L_0x020f:
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x021b
            r0 = r26
            r1.A03(r10, r0, r14)
            return
        L_0x021b:
            X.6iZ r1 = r1.A08
            android.view.View r0 = r1.AqN()
            if (r0 == 0) goto L_0x00ae
            r1.DYC(r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309656Zc.DZx(android.content.Context, X.3ui, java.lang.Integer):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r1 != true) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DcE(X.C255783ui r6, int r7, int r8) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.3WT r1 = r6.A11
            X.3WT r0 = X.AnonymousClass3WT.DPA
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0054
            X.4mU r0 = r5.A0B
            X.3uh r4 = r0.Au5()
            r2 = 1
            if (r4 == 0) goto L_0x0022
            X.1Xj r0 = r4.A0b
            if (r0 == 0) goto L_0x0022
            boolean r1 = r0.A66()
            r0 = 1
            if (r1 == r2) goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            java.lang.String r3 = "reelInteractiveController"
            if (r0 == 0) goto L_0x0035
            X.6ia r0 = r5.A04
            if (r0 == 0) goto L_0x0088
            X.3ui r0 = r0.A01
            if (r0 == 0) goto L_0x0076
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0076
        L_0x0035:
            if (r4 == 0) goto L_0x004f
            X.1Xj r1 = r4.A0b
            if (r1 == 0) goto L_0x004f
            boolean r0 = r1.A65()
            if (r0 != r2) goto L_0x004f
            X.6ia r0 = r5.A04
            if (r0 == 0) goto L_0x0088
            X.3ui r0 = r0.A01
            if (r0 == 0) goto L_0x006a
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x006a
        L_0x004f:
            java.lang.String r0 = "media_tap"
        L_0x0051:
            r5.A00(r7, r8, r0)
        L_0x0054:
            X.3WT r1 = r6.A11
            X.3WT r0 = X.AnonymousClass3WT.COLLECTION_AD_THUMBNAIL
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = "collection_thumbnail_tap_open"
            r5.A00(r7, r8, r0)
        L_0x0063:
            X.6mk r0 = r5.A0E
            boolean r0 = r0.DcE(r6, r7, r8)
            return r0
        L_0x006a:
            boolean r0 = r1.A5X()
            if (r0 != r2) goto L_0x0073
            java.lang.String r0 = "story_frida_tap"
            goto L_0x0051
        L_0x0073:
            java.lang.String r0 = "showreel_bloks_media_tap"
            goto L_0x0051
        L_0x0076:
            if (r4 == 0) goto L_0x0085
            X.1Xj r0 = r4.A0b
            if (r0 == 0) goto L_0x0085
            boolean r0 = r0.A6C()
            if (r0 != r2) goto L_0x0085
            java.lang.String r0 = "story_tesla_tap"
            goto L_0x0051
        L_0x0085:
            java.lang.String r0 = "showreel_native_media_tap"
            goto L_0x0051
        L_0x0088:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309656Zc.DcE(X.3ui, int, int):boolean");
    }

    public final void DcP(RectF rectF, C255773uh r8, C250973mM r9, Integer num, boolean z) {
        0qQ.A0B(r9, 0);
        0qQ.A0B(r8, 1);
        0qQ.A0B(num, 2);
        C317116mk r0 = this.A0E;
        r0.DcP((RectF) null, r8, r9, num, z);
    }

    public final boolean Dq1(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        0qQ.A0B(motionEvent, 0);
        0qQ.A0B(motionEvent2, 1);
        return this.A0E.Dq1(motionEvent, motionEvent2, f, f2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: X.4Ny} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dqi(androidx.fragment.app.FragmentActivity r33, X.1Xj r34, java.lang.Integer r35, int r36, boolean r37) {
        /*
            r32 = this;
            r8 = 0
            r0 = 2
            r10 = r33
            X.0qQ.A0B(r10, r0)
            r1 = r34
            X.1Xy r0 = r1.A0C
            java.util.List r2 = r0.Aok()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableList<com.instagram.feed.media.Media>"
            X.0qQ.A0C(r2, r0)
            java.util.List r5 = X.0u4.A01(r2)
            r0 = r32
            com.instagram.common.session.UserSession r3 = r0.A01
            java.lang.String r9 = "userSession"
            r2 = 0
            if (r3 == 0) goto L_0x0173
            java.lang.String r3 = X.C231122qu.A07(r3, r1)
            com.instagram.common.session.UserSession r4 = r0.A01
            if (r4 == 0) goto L_0x0173
            java.lang.String r18 = r1.A2v()
            if (r37 == 0) goto L_0x0065
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            r6 = r35
            if (r6 != r4) goto L_0x0062
            X.2EG r13 = X.2EG.A3b
        L_0x0037:
            r4 = 1
            int r6 = r36 + 1
            if (r5 == 0) goto L_0x012f
            int r7 = r5.size()
            if (r6 >= r7) goto L_0x012f
            java.lang.Object r5 = r5.get(r6)
            X.1Xj r5 = (X.1Xj) r5
            X.1Xy r5 = r5.A0C
            X.56P r7 = r5.C4I()
            r24 = 0
            if (r7 != 0) goto L_0x0068
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r4 = r0
            r5 = r2
            r6 = r1
            r7 = r13
            r9 = r2
            r10 = r3
            r11 = r18
            r4.A01(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0062:
            X.2EG r13 = X.2EG.A3a
            goto L_0x0037
        L_0x0065:
            X.2EG r13 = X.2EG.A3c
            goto L_0x0037
        L_0x0068:
            java.util.List r6 = r7.BN4()
            com.instagram.common.session.UserSession r5 = r0.A01
            if (r5 == 0) goto L_0x0173
            com.instagram.model.androidlink.AndroidLink r5 = X.AnonymousClass47K.A03(r10, r5, r6, r8)
            if (r5 == 0) goto L_0x00b3
            X.47L r12 = X.C271714jT.A01(r5)
            if (r12 == 0) goto L_0x00b3
            java.lang.String r14 = r5.CGH()
            com.instagram.common.session.UserSession r5 = r0.A01
            if (r5 == 0) goto L_0x0173
            java.util.List r19 = X.C231122qu.A0K(r5, r1)
            if (r14 == 0) goto L_0x0123
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r4)
            com.instagram.common.session.UserSession r11 = r0.A01
            if (r11 == 0) goto L_0x0173
            java.lang.String r15 = r1.getId()
            if (r15 == 0) goto L_0x0127
            X.4DU r4 = r0.A0D
            java.lang.String r16 = r4.getModuleName()
            r17 = r3
            X.FH7.A07(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x00a3:
            r19 = r0
            r20 = r2
            r21 = r1
            r22 = r13
            r25 = r3
            r26 = r18
            r19.A01(r20, r21, r22, r23, r24, r25, r26)
            return
        L_0x00b3:
            com.instagram.user.model.ProductDetailsProductItemDictIntf r5 = r7.Bfu()
            if (r5 == 0) goto L_0x0123
            com.instagram.user.model.ProductDetailsProductItemDictIntf r5 = r7.Bfu()
            if (r5 == 0) goto L_0x0123
            com.instagram.user.model.Product r8 = X.C14502TxO.A00(r5)
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r4)
            com.instagram.common.session.UserSession r5 = r0.A01
            if (r5 == 0) goto L_0x0173
            X.ULx r7 = X.C294165ly.A03(r5, r8)
            java.lang.String r5 = r8.A0H
            long r5 = java.lang.Long.parseLong(r5)
            java.lang.Long r24 = java.lang.Long.valueOf(r5)
            X.4Ny r5 = r7.A01
            X.3kF r25 = X.C249713kF.A00
            com.instagram.common.session.UserSession r7 = r0.A01
            if (r7 == 0) goto L_0x0173
            X.4DU r6 = r0.A0D
            java.lang.String r30 = "collection_ads"
            r26 = r10
            r27 = r7
            r28 = r6
            r29 = r8
            r31 = r2
            X.WNN r7 = r25.A0L(r26, r27, r28, r29, r30, r31)
            com.instagram.common.session.UserSession r6 = r0.A01
            if (r6 == 0) goto L_0x0173
            X.1Xj r8 = r1.A1e(r6)
            com.instagram.common.session.UserSession r6 = r0.A01
            if (r6 == 0) goto L_0x0173
            int r6 = r1.A15(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.A02(r8, r6)
            r7.A0b = r4
            r7.A08 = r2
            com.instagram.common.session.UserSession r2 = r0.A01
            if (r2 == 0) goto L_0x0173
            X.1Xj r2 = r1.A1e(r2)
            boolean r2 = r2.CcK()
            r7.A0X = r2
            r7.A0a = r4
            X.WNN.A01(r7)
            r2 = r5
            goto L_0x00a3
        L_0x0123:
            r23 = r2
            goto L_0x00a3
        L_0x0127:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x012f:
            X.0wj r4 = X.0wj.A01
            r1 = 817903741(0x30c0387d, float:1.3985894E-9)
            java.lang.String r0 = "AD_NEED_MORE_THUMBNAIL_LINK_COUNT"
            X.0f9 r4 = r4.AEf(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Needed thumbnail link at index "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " for collection ad "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " but had "
            r1.append(r0)
            if (r5 == 0) goto L_0x015e
            int r0 = r5.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x015e:
            r1.append(r2)
            java.lang.String r0 = " media"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "message"
            r4.ABQ(r0, r1)
            r4.report()
            return
        L_0x0173:
            X.0qQ.A0F(r9)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309656Zc.Dqi(androidx.fragment.app.FragmentActivity, X.1Xj, java.lang.Integer, int, boolean):void");
    }

    public final void Dr6(C255773uh r4, C250973mM r5, String str) {
        Context context;
        0qQ.A0B(r5, 0);
        Fragment fragment = (Fragment) this.A0H.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            C273384mU r1 = this.A0B;
            r1.EHS(true);
            r1.EHY("tapped");
            C317766nn r12 = this.A03;
            if (r12 == null) {
                0qQ.A0F("reelViewerBottomSheetManager");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r12.A0H(context, r5, this.A0C.getModuleName(), str);
            }
        }
    }

    public final void EGe(C255773uh r12, float[] fArr) {
        C273384mU r1 = this.A0B;
        C250973mM AuO = r1.AuO(r12.A0k);
        if (AuO != null) {
            C310016aI r4 = this.A02;
            if (r4 == null) {
                0qQ.A0F("reelViewerLogger");
                throw AnonymousClass00P.createAndThrow();
            }
            r4.A0K(AuO, ((C310566bG) ((ReelViewerFragment) r1).A1E).A0B.Bz3(r12), (Float) null, "swipe_up_guidance_tap", fArr[0], fArr[1]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(int r10, int r11, java.lang.String r12) {
        /*
            r9 = this;
            X.4mU r0 = r9.A0B
            X.3uh r1 = r0.Au5()
            if (r1 == 0) goto L_0x002d
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.3mM r3 = r0.A0a
            if (r3 == 0) goto L_0x002d
            X.6aI r2 = r9.A02
            if (r2 != 0) goto L_0x001c
            java.lang.String r0 = "reelViewerLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001c:
            float r7 = (float) r10
            float r8 = (float) r11
            X.4gh r0 = r0.A1E
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            X.6Yf r4 = r0.Bz3(r1)
            r5 = 0
            r6 = r12
            r2.A0K(r3, r4, r5, r6, r7, r8)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309656Zc.A00(int, int, java.lang.String):void");
    }

    private final void A03(C255773uh r10, String str, float f, float f2) {
        C273384mU r1 = this.A0B;
        C250973mM AuO = r1.AuO(r10.A0k);
        if (AuO != null) {
            C310016aI r2 = this.A02;
            if (r2 == null) {
                0qQ.A0F("reelViewerLogger");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r2.A0K(AuO, ((C310566bG) ((ReelViewerFragment) r1).A1E).A0B.Bz3(r10), (Float) null, str, f, f2);
            }
        }
    }

    private final void A04(C255783ui r5, String str, float f, float f2) {
        C273384mU r3 = this.A0B;
        r3.EHY("tapped");
        this.A0E.DcE(r5, (int) r5.A03, (int) r5.A04);
        C255773uh Au5 = r3.Au5();
        if (Au5 != null && str != null) {
            A03(Au5, str, f, f2);
        }
    }

    public final void AAb(CountDownTimer countDownTimer) {
        HashSet hashSet = ((AnonymousClass6Z5) this.A0E).A10;
        if (hashSet == null) {
            0qQ.A0F("upcomingEventCountDownTimers");
            throw AnonymousClass00P.createAndThrow();
        } else {
            hashSet.add(countDownTimer);
        }
    }

    public final C255783ui Bw8() {
        C314626ia r0 = this.A04;
        if (r0 != null) {
            return r0.A01;
        }
        0qQ.A0F("reelInteractiveController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CKa() {
        C46505Dg8 dg8 = this.A00;
        if (dg8 == null || !dg8.A08.get() || dg8.A02 != null) {
            return false;
        }
        return true;
    }

    public final boolean CPp() {
        C46505Dg8 dg8 = this.A00;
        if (dg8 == null) {
            return false;
        }
        return 182.A06(0Tu.A06, dg8.A06, 36323745308290502L);
    }

    public final boolean CQy(String str) {
        C309426Yf r0;
        String str2;
        F2N f2n;
        C46505Dg8 dg8 = this.A00;
        if (dg8 == null || (r0 = dg8.A02) == null) {
            return false;
        }
        Integer num = null;
        F2N f2n2 = r0.A0R;
        if (f2n2 != null) {
            str2 = f2n2.A03;
        } else {
            str2 = null;
        }
        if (!0qQ.A0K(str2, str)) {
            return false;
        }
        C309426Yf r02 = dg8.A02;
        if (!(r02 == null || (f2n = r02.A0R) == null)) {
            num = f2n.A02;
        }
        if (num == AnonymousClass05K.A01) {
            return true;
        }
        return false;
    }

    public final boolean CSU() {
        C46505Dg8 dg8 = this.A00;
        if (dg8 == null || dg8.A01 == null) {
            return false;
        }
        return true;
    }

    public final boolean CVf() {
        C314626ia r3 = this.A04;
        if (r3 == null) {
            0qQ.A0F("reelInteractiveController");
            throw AnonymousClass00P.createAndThrow();
        }
        C255783ui r0 = r3.A01;
        if (r0 == null) {
            return false;
        }
        String str = r0.A1f;
        if ((str.equals("interactive_media_tooltip_from_tap") || str.equals("interactive_media_tooltip_from_tap_and_hold")) && r3.A04()) {
            return true;
        }
        return false;
    }

    public final void Ctw(C255773uh r9) {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A0H.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            this.A0B.EHY("tapped");
            UserSession userSession = this.A01;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
            1Xj r5 = r9.A0b;
            if (r5 != null) {
                I3z.A00(activity, IGAdTransparencyDisclaimerPlacement.ABOVE_IMAGE, userSession, r5, C54646HMd.STORIES, new C20607Wvo(this, 46));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void D0q(Reel reel, C255773uh r5, String str) {
        C273384mU r0 = this.A0B;
        r0.EHS(true);
        r0.EHd();
        C310016aI r02 = this.A02;
        if (r02 == null) {
            0qQ.A0F("reelViewerLogger");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r02.A06(reel, r5, "tap_less");
        }
    }

    public final void D1D(C255773uh r3, C309426Yf r4) {
        float f = (r4.A0A / 1000.0f) * r4.A0B;
        C310016aI r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("reelViewerLogger");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A08(r3, f);
        }
    }

    public final void D3F(C255783ui r4) {
        this.A0B.EHY("tapped");
        C314626ia r2 = this.A04;
        if (r2 == null) {
            0qQ.A0F("reelInteractiveController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r2.A05(r4, (int) r4.A03, (int) r4.A04);
        }
    }

    public final void D7u() {
        this.A0B.EHY("debug_pause");
    }

    public final void D7v() {
        this.A0B.EHd();
    }

    public final void D93(C255773uh r25, C250973mM r26) {
        FragmentActivity activity;
        String str;
        String str2;
        Fragment fragment = (Fragment) this.A0H.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            UserSession userSession = this.A01;
            String str3 = "userSession";
            if (userSession != null) {
                C255773uh r4 = r25;
                String A0X = r4.A0X(userSession);
                C250973mM r6 = r26;
                if (A0X != null) {
                    UserSession userSession2 = this.A01;
                    if (userSession2 != null) {
                        C250963mL r3 = r4.A0e;
                        C250963mL r2 = C250963mL.MEDIA;
                        if (r3 == r2) {
                            1Xj r0 = r4.A0b;
                            r0.getClass();
                            str = C231122qu.A0C(userSession2, r0);
                        } else {
                            str = null;
                        }
                        UserSession userSession3 = this.A01;
                        if (userSession3 != null) {
                            if (r3 == r2) {
                                1Xj r02 = r4.A0b;
                                r02.getClass();
                                str2 = C231122qu.A0A(userSession3, r02);
                            } else {
                                str2 = null;
                            }
                            UserSession userSession4 = this.A01;
                            if (userSession4 != null) {
                                1Xj r11 = r4.A0b;
                                r11.getClass();
                                String A0G2 = C231122qu.A0G(userSession4, r11);
                                UserSession userSession5 = this.A01;
                                if (userSession5 != null) {
                                    String str4 = this.A0A;
                                    if (str4 == null) {
                                        str3 = "traySessionId";
                                    } else {
                                        String sessionId = this.A0F.getSessionId();
                                        UserSession userSession6 = userSession5;
                                        C296215pf r17 = new C296215pf(userSession6, r6.A0H, str4, sessionId, r6.A01, r6.A0E);
                                        UserSession userSession7 = this.A01;
                                        if (userSession7 != null) {
                                            if (A0G2 != null) {
                                                C55163HdF.A00(activity, userSession7, r17, r11, this.A0D, A0X, str, str2, A0G2);
                                                return;
                                            }
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    String id = r6.A0H.getId();
                    0qQ.A07(id);
                    throw new IllegalStateException(002.A0g("Disclaimer ad with ID ", id, " should have a disclaimer title!"));
                }
            }
            0qQ.A0F(str3);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void D9X(C255783ui r4) {
        C314626ia r2 = this.A04;
        if (r2 == null) {
            0qQ.A0F("reelInteractiveController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r2.A03(r4, true, false);
        }
    }

    public final void DA9(float f) {
        this.A0E.DA9(f);
    }

    public final void DL4(C255773uh r17, 2EG r18, float f, float f2) {
        String str;
        C250973mM r0;
        String str2;
        long j;
        Long A0n;
        String str3;
        C255773uh r11 = r17;
        if (r11.A19() && (r0 = ((ReelViewerFragment) this.A0B).A0a) != null) {
            C310016aI r3 = this.A02;
            if (r3 == null) {
                str3 = "reelViewerLogger";
            } else {
                UserSession userSession = this.A01;
                if (userSession == null) {
                    str3 = "userSession";
                } else {
                    0wc A012 = AnonymousClass0kN.A01(C310016aI.A01(r0.A0H, r3), userSession);
                    1Xj r6 = r11.A0b;
                    AnonymousClass3OA r02 = r11.A0g;
                    Long l = null;
                    if (r02 != null) {
                        str2 = r02.A0S;
                    } else {
                        str2 = null;
                    }
                    IGCTMessagingAdsInfoDictIntf A002 = C231122qu.A00(userSession, r6);
                    if (A002 != null) {
                        l = Long.valueOf(C16947VBz.A00(A002));
                    }
                    0Aj A003 = A012.A00(A012.A00, "whatsapp_sticker_send_button_click");
                    if (A003.isSampled()) {
                        long j2 = 0;
                        if (str2 == null || (A0n = 00y.A0n(10, str2)) == null) {
                            j = 0;
                        } else {
                            j = A0n.longValue();
                        }
                        A003.A9F("ad_id", Long.valueOf(j));
                        if (l != null) {
                            j2 = l.longValue();
                        }
                        A003.A9F("page_id", Long.valueOf(j2));
                        String A062 = C231122qu.A06(userSession, r6);
                        if (A062 == null) {
                            if (r6 != null) {
                                A062 = r6.A0C.getOrganicTrackingToken();
                            } else {
                                A062 = null;
                            }
                        }
                        A003.AAJ("client_token", A062);
                        A003.AAJ(C46346Dcp.A00(), r3.A0E.getSessionId());
                        A003.A8M(XSH.PAGE_INSTAGRAM_STORY, "on_feed_messaging_surface");
                        A003.AAJ("message_destination", "WHATSAPP");
                        A003.Cgf();
                    }
                }
            }
            0qQ.A0F(str3);
            throw AnonymousClass00P.createAndThrow();
        }
        2EG r12 = r18;
        if ((r11.A1I() || r11.A1M()) && r12 == 2EG.A3x) {
            str = "tap_interactive_sticker_no_tooltip_cta";
        } else {
            str = "tap_interactive_sticker_cta";
        }
        A02(r11, r12, str, f, f2);
    }

    public final void DL6(C255773uh r2, float f, float f2) {
        A03(r2, "tap_interactive_media_link_icon", f, f2);
    }

    public final void DL8(C255773uh r7, 2EG r8, float f, float f2) {
        A02(r7, r8, "tap_interactive_sticker_tooltip_cta", f, f2);
    }

    public final void DP2(float f, float f2) {
        C314626ia r4 = this.A04;
        if (r4 == null) {
            0qQ.A0F("reelInteractiveController");
            throw AnonymousClass00P.createAndThrow();
        }
        C255783ui r3 = r4.A01;
        if (r3 != null) {
            String str = r3.A1f;
            if ((str.equals("interactive_media_tooltip_from_tap") || str.equals("interactive_media_tooltip_from_tap_and_hold")) && r4.A04()) {
                DIX(r3, true);
                return;
            }
        }
        this.A0E.DP2(f, f2);
    }

    public final void DQq(C61079JwH jwH) {
        this.A0E.DQq(jwH);
    }

    public final void DRJ(C255773uh r3, C250973mM r4) {
        this.A0E.DRI((View) null, r3, r4);
    }

    public final void DSZ(View view, View view2, C255773uh r22, C250973mM r23, C309426Yf r24, String str, String str2, int i, int i2) {
        String str3;
        0qQ.A0B(view, 0);
        View view3 = view2;
        0qQ.A0B(view3, 3);
        C250973mM r11 = r23;
        0qQ.A0B(r11, 6);
        C255773uh r12 = r22;
        0qQ.A0B(r12, 7);
        C309426Yf r10 = r24;
        0qQ.A0B(r10, 8);
        C310016aI r2 = this.A02;
        if (r2 == null) {
            str3 = "reelViewerLogger";
        } else {
            r2.A0B(r12, r11, AnonymousClass05K.A0C);
            C314626ia r0 = this.A04;
            str3 = "reelInteractiveController";
            if (r0 != null) {
                if (r0.A04()) {
                    C255783ui r25 = new C255783ui();
                    r25.A11 = AnonymousClass3WT.CTA;
                    r25.A1p = true;
                    C314626ia r02 = this.A04;
                    if (r02 != null) {
                        r02.A03(r25, true, false);
                        return;
                    }
                } else {
                    C311676d4 r03 = this.A05;
                    str3 = "reelUserProfileTooltipHelper";
                    if (r03 != null) {
                        C275794rx r04 = r03.A05;
                        if (r04 == null || !r04.isShowing()) {
                            C273384mU r26 = this.A0B;
                            r26.EHY("tapped");
                            C316026kz Aui = r26.Aui();
                            if (Aui != null) {
                                RoundedCornerFrameLayout BQU = Aui.BQU();
                                if ((BQU instanceof View) && BQU != null) {
                                    C311676d4 r5 = this.A05;
                                    if (r5 != null) {
                                        User user = r12.A0i;
                                        if (user != null) {
                                            String id = user.getId();
                                            ImageUrl Bh3 = user.Bh3();
                                            String fullName = user.getFullName();
                                            if (fullName == null) {
                                                fullName = "";
                                            }
                                            View AuD = r26.AuD();
                                            r5.A00(false, true);
                                            r5.A08 = id;
                                            r5.A07 = "stories_multi_advertiser_carousel_banner";
                                            r5.A00 = null;
                                            r5.A03 = r11;
                                            r5.A02 = r12;
                                            r5.A04 = r10;
                                            r5.A06 = "profile_tooltop_in_stories_multi_advertiser_carousel_banner";
                                            r5.A01 = view3;
                                            C55887Hp8 A002 = C56591I2v.A00(BQU, r5.A0A);
                                            A002.A02 = C54604HKn.A01;
                                            C275794rx r05 = new C275794rx(A002);
                                            r5.A05 = r05;
                                            C56591I2v.A01(BQU, AuD, r05);
                                            C275794rx r15 = r5.A05;
                                            r15.A03 = r5;
                                            C56591I2v.A02(r5.A09, Bh3, r15, fullName, 2131970049, false);
                                            r5.A05.A02(view3, i, i2, false);
                                            return;
                                        }
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            C311676d4 r06 = this.A05;
                            if (r06 != null) {
                                r06.A00(true, false);
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str3);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DY0(C255773uh r16, C250973mM r17) {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A0H.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            this.A0B.EHY("tapped");
            UserSession userSession = this.A01;
            String str = "userSession";
            if (userSession != null) {
                1Xj r11 = r16.A0b;
                if (r11 != null) {
                    AnonymousClass4DU r12 = this.A0D;
                    String str2 = this.A0A;
                    if (str2 == null) {
                        str = "traySessionId";
                    } else {
                        C250973mM r0 = r17;
                        C56459Hyr.A00(activity, userSession, new C296215pf(userSession, r0.A0H, str2, this.A0F.getSessionId(), r0.A01, r0.A0E), r11, r12, new AnonymousClass9LF(this, 6), 2);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Political ad needs to have a media attached to it!");
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void Ded() {
        this.A0B.EHY("tapped");
    }

    public final void Df2(C255773uh r3, C250973mM r4) {
        this.A0E.Df3(r3, (ReelType) null, r4, (String) null);
    }

    public final void Dm6(C255773uh r4) {
        this.A0E.CI6((28D) null, r4, (VWL) null, 2EG.A3u);
    }

    public final void Dm8(Context context, C255773uh r12, C250973mM r13, C309406Yd r14, boolean z) {
        C273384mU r4 = this.A0B;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r4;
        if (reelViewerFragment.A0a != r13) {
            r14.ERT(1.0f);
        }
        C311266cP r7 = this.A09;
        if (r7 == null) {
            0qQ.A0F("reelLoaderControllerHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        if (r14.A03 != null) {
            AnonymousClass3PP A002 = AnonymousClass3PO.A00(r7.A02);
            C250973mM r0 = r14.A01;
            if (r0 != null) {
                String id = r0.A0H.getId();
                0qQ.A07(id);
                AnonymousClass3PN r02 = r14.A03;
                0qQ.A0A(r02);
                A002.A04(r02, id);
                r14.A03 = null;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        UserSession userSession = r7.A02;
        Reel reel = r13.A0H;
        if (!reel.A0z(userSession)) {
            C19481WaT waT = new C19481WaT(context, r13, r14, r7);
            r7.A0A.add(waT);
            AnonymousClass3PP A003 = AnonymousClass3PO.A00(userSession);
            String id2 = reel.getId();
            0qQ.A07(id2);
            A003.A05(waT, id2, (String) null, false);
            r14.A03 = waT;
            HashMap hashMap = new HashMap();
            hashMap.put("media_id", r12.A0j);
            if (r14.A01 == r13) {
                AnonymousClass6VC A004 = AnonymousClass6VB.A00(userSession);
                C255773uh A082 = r13.A08(userSession);
                0qQ.A0B(A082, 0);
                String str = A082.A0k;
                0qQ.A07(str);
                Long A012 = AnonymousClass6VC.A01(A004, str, AnonymousClass6VC.A02(A082));
                if (A012 != null) {
                    A004.A00.flowMarkPoint(A012.longValue(), "json_fetch_start");
                }
            }
            AnonymousClass3PP A005 = AnonymousClass3PO.A00(userSession);
            String id3 = reel.getId();
            0qQ.A07(id3);
            String moduleName = r7.A08.getModuleName();
            0qQ.A07(moduleName);
            A005.A02(AnonymousClass3BU.ON_TAP, id3, moduleName, hashMap);
        }
        if (reelViewerFragment.A0a == r13 || z) {
            r4.D7R(r12, r14);
            AnonymousClass6PH r5 = r14.A0k;
            0qQ.A0B(r5, 1);
            boolean A0Z = C297785sK.A0Z(r12);
            boolean A0Y = C297785sK.A0Y(r12);
            boolean A0f = C297785sK.A0f(r12);
            boolean z2 = true;
            if (r12.A14()) {
                return;
            }
            if ((A0Z && !A0Y) || A0f) {
                if (r5.A03.CFV() == 0) {
                    z2 = false;
                }
                AnonymousClass6KO.A00(r12, z2);
            }
        }
    }

    public final boolean Dps(float f, float f2) {
        return this.A0E.Dps(f, f2);
    }

    public final boolean Dpu() {
        return this.A0E.Dpu();
    }

    public final boolean Dpw() {
        return this.A0E.Dpw();
    }

    public final void Dqb(float f, float f2) {
        this.A0E.Dqb(f, f2);
    }

    public final void DvB(boolean z) {
        this.A0E.DvB(z);
    }

    public final void DzQ(C255773uh r2) {
        this.A0E.DzQ(r2);
    }

    public final void DzS(C255773uh r2, C309426Yf r3, boolean z) {
        this.A0E.DzS(r2, r3, z);
    }

    public final void DzT(C255773uh r2, C250973mM r3, boolean z) {
        this.A0E.DzT(r2, r3, z);
    }

    public final void E0C(C255773uh r3) {
        float currentPositionMs = ((float) ((ReelViewerFragment) this.A0B).mVideoPlayer.getCurrentPositionMs()) / 1000.0f;
        C310016aI r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("reelViewerLogger");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A08(r3, currentPositionMs);
        }
    }

    public final void EGf(C250973mM r8, C309426Yf r9, String str, float f, float f2) {
        C310016aI r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("reelViewerLogger");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A0K(r8, r9, (Float) null, str, f, f2);
        }
    }

    public final void EUb(1wn r2) {
        C46505Dg8 dg8 = this.A00;
        if (dg8 != null) {
            dg8.A01 = r2;
        }
    }

    public final boolean Esy(C250183l2 r3) {
        C46505Dg8 dg8 = this.A00;
        if (dg8 != null) {
            return C295435o9.A00(r3, dg8.A06, true);
        }
        return false;
    }

    public final void Evm() {
        ((AnonymousClass6Z5) this.A0E).A17.Crd(true);
    }

    public C309656Zc(AnonymousClass0iw r1, AnonymousClass4DU r2, C273384mU r3, C317116mk r4, C249763kK r5, AnonymousClass6Z0 r6, WeakReference weakReference) {
        this.A0E = r4;
        this.A0B = r3;
        this.A0C = r1;
        this.A0H = weakReference;
        this.A0F = r5;
        this.A0D = r2;
        this.A0G = r6;
    }

    private final void A02(C255773uh r5, 2EG r6, String str, float f, float f2) {
        A03(r5, str, f, f2);
        if (!C297785sK.A0Q(r5.A0b) || (!C297785sK.A0e(r5) && !C297785sK.A0b(r5))) {
            this.A0E.CI6((28D) null, r5, (VWL) null, r6);
            return;
        }
        C255783ui A002 = C289745e8.A00(AnonymousClass3WT.MULTI_PRODUCT, r5.A0b());
        if (A002 != null) {
            this.A0E.DcE(A002, (int) f, (int) f2);
        }
    }
}
