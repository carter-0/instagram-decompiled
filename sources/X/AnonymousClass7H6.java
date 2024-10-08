package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityChecker;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7H6  reason: invalid class name */
public final class AnonymousClass7H6 implements AnonymousClass4DU, C252243on, C333107Xr, AnonymousClass7XW, C332937Xa, C332947Xb, C332307Ul, AnonymousClass7H7 {
    public static final String __redex_internal_original_name = "DirectAggregatedMediaViewerController";
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public View A05;
    public View A06;
    public View A07;
    public ViewGroup A08;
    public ViewGroup A09;
    public 1wn A0A;
    public 1wn A0B;
    public ReboundViewPager A0C;
    public TouchInterceptorFrameLayout A0D;
    public SimpleZoomableViewContainer A0E;
    public C3262876d A0F;
    public MediaViewerReplyBarEligibilityChecker A0G;
    public NR3 A0H;
    public C70715OHk A0I;
    public C71066Oal A0J;
    public OVY A0K;
    public C74508Pw3 A0L;
    public AnonymousClass77B A0M;
    public AnonymousClass2Ep A0N;
    public C68168N3i A0O;
    public DirectThreadAnalyticsParams A0P;
    public C19700We2 A0Q;
    public DirectShareTarget A0R;
    public C254743sy A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public Integer A0W;
    public String A0X;
    public String A0Y;
    public C62320sa A0Z;
    public C62320sa A0a;
    public 0sP A0b;
    public 0sP A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public View A0n;
    public ViewGroup A0o;
    public AnonymousClass7XW A0p;
    public C329967Kx A0q;
    public RoundedCornerFrameLayout A0r;
    public final AnonymousClass03Q A0s;
    public final FragmentActivity A0t;
    public final 1wn A0u;
    public final 1a8 A0v;
    public final UserSession A0w;
    public final AnonymousClass3E6 A0x;
    public final AnonymousClass3E6 A0y;
    public final C252293os A0z;
    public final AnonymousClass7HC A10;
    public final AnonymousClass7HI A11;
    public final AnonymousClass7HK A12;
    public final AnonymousClass7HN A13;
    public final AnonymousClass7H8 A14;
    public final AnonymousClass7HB A15;
    public final C317956o7 A16;
    public final AnonymousClass7HQ A17;
    public final C234382xm A18;
    public final AnonymousClass7HT A19;
    public final List A1A;
    public final List A1B;
    public final Map A1C;
    public final AnonymousClass0eM A1D;
    public final boolean A1E;
    public final boolean A1F;
    public final boolean A1G;
    public final boolean A1H;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006e, code lost:
        if (X.2Y9.A00 != false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnonymousClass7H6(androidx.fragment.app.FragmentActivity r10, com.instagram.common.session.UserSession r11, X.AnonymousClass3E6 r12, int r13, boolean r14, boolean r15) {
        /*
            r9 = this;
            r2 = 0
            r0 = r13 & 8
            if (r0 == 0) goto L_0x0006
            r12 = r2
        L_0x0006:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x000b
            r15 = 0
        L_0x000b:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x014b
            X.7H8 r1 = new X.7H8
            r1.<init>(r11)
        L_0x0014:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x001d
            X.7HB r2 = new X.7HB
            r2.<init>(r11)
        L_0x001d:
            r3 = 1
            X.0qQ.A0B(r11, r3)
            r0 = 6
            X.0qQ.A0B(r1, r0)
            r0 = 7
            X.0qQ.A0B(r2, r0)
            r9.<init>()
            r9.A0w = r11
            r9.A0t = r10
            r9.A1H = r14
            r9.A0y = r12
            r9.A1F = r15
            r9.A14 = r1
            r9.A15 = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.A1A = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r9.A0T = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r9.A0V = r0
            int r0 = X.2db.A01(r10)
            r9.A04 = r0
            int r0 = X.AnonymousClass2uJ.A00
            r9.A02 = r0
            r0 = -1
            r9.A01 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r9.A1C = r0
            X.0Tu r2 = X.0Tu.A05
            r0 = 18305356773989994(0x4108a000001e6a, double:1.8950610730993597E-307)
            boolean r0 = X.1AW.A06(r2, r0)
            r4 = 0
            if (r0 != 0) goto L_0x0070
            boolean r1 = X.2Y9.A00
            r0 = 0
            if (r1 == 0) goto L_0x0071
        L_0x0070:
            r0 = 1
        L_0x0071:
            r9.A1E = r0
            if (r12 != 0) goto L_0x0079
            X.3E5 r12 = X.AnonymousClass3E4.A01(r9, r4, r0)
        L_0x0079:
            r9.A0x = r12
            X.7HC r0 = new X.7HC
            r0.<init>(r9, r11)
            r9.A10 = r0
            X.4fh r1 = X.C318146oT.A01
            X.1a8 r0 = new X.1a8
            r0.<init>(r1)
            r9.A0v = r0
            X.0Tu r2 = X.0Tu.A06
            r0 = 36311569076126302(0x81012e0005025e, double:3.026920726470359E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 == 0) goto L_0x00a4
            r0 = 36311569077305968(0x81012e00170270, double:3.0269207272163843E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 == 0) goto L_0x00a4
            r4 = 1
        L_0x00a4:
            r9.A1G = r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r9.A1B = r6
            r1 = 34
            X.9L0 r0 = new X.9L0
            r0.<init>(r9, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r9.A1D = r0
            X.7HD r0 = X.AnonymousClass7HD.A00
            r9.A0a = r0
            r5 = 0
            com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl r0 = new com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl
            r0.<init>(r5, r5, r5)
            r9.A0G = r0
            X.7HG r0 = new X.7HG
            r0.<init>(r9)
            r9.A0s = r0
            X.7HH r0 = new X.7HH
            r0.<init>(r9)
            r9.A0u = r0
            X.7HI r0 = new X.7HI
            r0.<init>(r9)
            r9.A11 = r0
            X.7HK r0 = new X.7HK
            r0.<init>(r9)
            r9.A12 = r0
            X.7HM r0 = new X.7HM
            r0.<init>(r9)
            r9.A0z = r0
            X.7HN r0 = new X.7HN
            r0.<init>(r9)
            r9.A13 = r0
            X.7HO r8 = new X.7HO
            r8.<init>(r9)
            r9.A18 = r8
            X.7HQ r7 = new X.7HQ
            r7.<init>(r10)
            r9.A17 = r7
            X.7HS r0 = new X.7HS
            r0.<init>(r9)
            r9.A16 = r0
            android.view.Window r0 = r10.getWindow()
            android.view.View r2 = r0.getDecorView()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r2, r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            X.7HT r1 = new X.7HT
            r1.<init>(r2)
            X.7HU r0 = new X.7HU
            r0.<init>(r9)
            r1.A0C = r0
            r9.A19 = r1
            r7.A00 = r3
            java.util.Set r0 = r7.A01
            r0.add(r8)
            X.2ff r2 = X.C226112fe.A0B
            if (r4 == 0) goto L_0x0145
            r0 = 19
            X.9LZ r1 = new X.9LZ
            r1.<init>(r9, r0)
            X.7HW r0 = new X.7HW
            r0.<init>(r1)
            r6.add(r0)
            X.7HW r0 = new X.7HW
            r0.<init>(r1)
        L_0x0141:
            r2.A04(r10, r0, r5)
            return
        L_0x0145:
            X.7QF r0 = new X.7QF
            r0.<init>(r9)
            goto L_0x0141
        L_0x014b:
            r1 = r2
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7H6.<init>(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, X.3E6, int, boolean, boolean):void");
    }

    public static final AnonymousClass77B A06(AnonymousClass7H6 r3, int i) {
        if (i < 0) {
            return null;
        }
        NR3 nr3 = r3.A0H;
        if (nr3 != null) {
            if (i >= nr3.getCount()) {
                return null;
            }
            NR3 nr32 = r3.A0H;
            if (nr32 != null) {
                return (AnonymousClass77B) nr32.A0D.get(i);
            }
        }
        0qQ.A0F("pagerAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final C254793t3 A09(C254743sy r3) {
        C254793t3 r2 = null;
        if (r3 == null) {
            A0Y(new IllegalStateException("key is null"));
        } else if (C66647MaG.A0F(r3)) {
            r2 = C66647MaG.A08(C66647MaG.A03(r3));
            if (r2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(C66647MaG.A03(r3).getClass());
                sb.append(" does not contains threadId");
                A0Y(new IllegalStateException(sb.toString()));
                return r2;
            }
        } else if (r3 instanceof MsysThreadId) {
            return C66647MaG.A06(r3);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unsupported key type ");
            sb2.append(r3.getClass());
            sb2.append(' ');
            sb2.append(r3);
            A0Y(new IllegalStateException(sb2.toString()));
            return null;
        }
        return r2;
    }

    public static final void A0S(AnonymousClass7H6 r19, RoundedCornerFrameLayout roundedCornerFrameLayout) {
        float f;
        AnonymousClass7H6 r3 = r19;
        r3.A0h = false;
        AnonymousClass7HT r1 = r3.A19;
        if (!r1.isIdle()) {
            r1.A04();
        }
        AnonymousClass77B A052 = A05(r3);
        if (A052 != null) {
            r3.A0X(A052);
        }
        r3.A0Z(false);
        OVY ovy = r3.A0K;
        if (ovy != null) {
            ovy.A02.setVisibility(0);
        }
        A0O(r3);
        A0U(r3, true);
        A0L(r3);
        r3.A0G();
        if (roundedCornerFrameLayout != null) {
            A0V(r3, true);
            C71066Oal oal = r3.A0J;
            if (oal != null) {
                NR3 nr3 = r3.A0H;
                if (nr3 != null) {
                    ReboundViewPager reboundViewPager = r3.A0C;
                    if (reboundViewPager != null) {
                        nr3.A00 = reboundViewPager.getCurrentDataIndex();
                        NR3 nr32 = r3.A0H;
                        if (nr32 != null) {
                            nr32.A03 = true;
                            0fE.A00(nr32, 1920743064);
                            boolean EtI = r3.A0G.EtI();
                            ViewGroup viewGroup = r3.A09;
                            if (viewGroup != null) {
                                ReboundViewPager reboundViewPager2 = r3.A0C;
                                if (reboundViewPager2 != null) {
                                    int i = r3.A04;
                                    int i2 = r3.A02;
                                    boolean A0e2 = A0e(r3);
                                    PQB pqb = new PQB(r3);
                                    int height = roundedCornerFrameLayout.getHeight();
                                    int width = roundedCornerFrameLayout.getWidth();
                                    float f2 = ((float) width) / ((float) height);
                                    if (A0e2) {
                                        oal.A02 -= oal.A06.getResources().getDimensionPixelSize(R.dimen.ai_sticker_creation_suggested_prompt_pill_height);
                                    }
                                    Activity activity = oal.A06;
                                    Activity activity2 = activity;
                                    int i3 = oal.A02;
                                    float A012 = (float) (AnonymousClass0nB.A01(activity) - (activity.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap) * 2));
                                    if (f2 > A012 / ((float) i3)) {
                                        i3 = (int) (A012 / f2);
                                    }
                                    int i4 = oal.A02;
                                    int A013 = AnonymousClass0nB.A01(activity2) - (activity2.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap) * 2);
                                    float f3 = (float) i4;
                                    if (f2 <= ((float) A013) / f3) {
                                        A013 = (int) (f3 * f2);
                                    }
                                    float A002 = (float) AnonymousClass0nB.A00(activity2);
                                    float f4 = (float) i;
                                    float f5 = oal.A01 - f4;
                                    if (!EtI) {
                                        Resources resources = activity2.getResources();
                                        f = (float) (resources.getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin) + resources.getDimensionPixelSize(R.dimen.direct_in_thread_composer_top_margin) + resources.getDimensionPixelSize(R.dimen.direct_in_thread_composer_top_margin));
                                    } else {
                                        f = 0.0f;
                                    }
                                    float f6 = ((f5 - f4) - f) / 2.0f;
                                    if (oal.A0D) {
                                        View view = oal.A08;
                                        0nA.A0T(view, i2);
                                        0nA.A0e(view, i);
                                    } else {
                                        View view2 = oal.A08;
                                        view2.setTop(i);
                                        view2.setBottom((int) (A002 - ((float) i2)));
                                        0nA.A0g(viewGroup, view2.getWidth(), view2.getHeight());
                                        0nA.A0g(reboundViewPager2, reboundViewPager2.getWidth(), oal.A02);
                                    }
                                    C71392co r0 = C315596kB.A02;
                                    C294975nL A014 = C294975nL.A01(roundedCornerFrameLayout, 0);
                                    A014.A0G();
                                    C294975nL A0F2 = A014.A0F(true);
                                    A0F2.A0T(f6, 0.0f);
                                    C294975nL A0E2 = A0F2.A0E(C71066Oal.A0F);
                                    A0E2.A06 = new PQX(oal, roundedCornerFrameLayout, height, i3, width, A013);
                                    A0E2.A05 = pqb;
                                    A0E2.A0H();
                                    return;
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                    0qQ.A0F("viewPager");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F("pagerAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public static final void A0T(AnonymousClass7H6 r11, RoundedCornerFrameLayout roundedCornerFrameLayout, boolean z) {
        int i;
        int i2;
        C74508Pw3 pw3;
        r11.A0h = true;
        if (r11.A1E && (pw3 = r11.A0L) != null) {
            pw3.EE0();
        }
        AnonymousClass77B A052 = A05(r11);
        if (A052 != null) {
            r11.A0X(A052);
        }
        OVY ovy = r11.A0K;
        if (ovy != null) {
            ovy.A02.setVisibility(8);
        }
        A0V(r11, false);
        A0U(r11, false);
        r11.A0Z(true);
        A0L(r11);
        r11.A0G();
        C71066Oal oal = r11.A0J;
        if (oal != null) {
            NR3 nr3 = r11.A0H;
            String str = "pagerAdapter";
            if (nr3 != null) {
                ReboundViewPager reboundViewPager = r11.A0C;
                if (reboundViewPager == null) {
                    str = "viewPager";
                } else {
                    nr3.A00 = reboundViewPager.getCurrentDataIndex();
                    NR3 nr32 = r11.A0H;
                    if (nr32 != null) {
                        nr32.A03 = z;
                        PQA pqa = new PQA(r11);
                        RoundedCornerFrameLayout roundedCornerFrameLayout2 = roundedCornerFrameLayout;
                        0qQ.A0B(roundedCornerFrameLayout, 0);
                        View view = oal.A0A;
                        oal.A02 = view.getHeight();
                        oal.A01 = 0nA.A0F(view).top;
                        boolean z2 = false;
                        if (oal.A0D) {
                            View view2 = oal.A08;
                            0nA.A0T(view2, 0);
                            0nA.A0e(view2, 0);
                        }
                        if (z) {
                            int height = roundedCornerFrameLayout.getHeight();
                            int width = roundedCornerFrameLayout.getWidth();
                            float f = ((float) width) / ((float) height);
                            Activity activity = oal.A06;
                            if (f > ((float) AnonymousClass0nB.A01(activity)) / ((float) AnonymousClass0nB.A00(activity))) {
                                z2 = true;
                            }
                            int A002 = AnonymousClass0nB.A00(activity);
                            if (z2) {
                                i = AnonymousClass0nB.A01(activity);
                                i2 = (int) (((float) i) / f);
                            } else {
                                i = (int) (((float) A002) * f);
                                i2 = A002;
                            }
                            float f2 = 0nA.A0F(roundedCornerFrameLayout2).top;
                            C71392co r0 = C315596kB.A02;
                            C294975nL A012 = C294975nL.A01(roundedCornerFrameLayout2, 0);
                            A012.A0G();
                            C294975nL A0E2 = A012.A0F(true).A0E(C71066Oal.A0F);
                            A0E2.A0T(f2 - (((float) (A002 - height)) / 2.0f), 0.0f);
                            A0E2.A06 = new PQW(oal, roundedCornerFrameLayout2, height, i2, width, i);
                            A0E2.A05 = pqa;
                            A0E2.A0H();
                            return;
                        }
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final AnonymousClass4kA AxJ() {
        return null;
    }

    public final boolean CPk() {
        return false;
    }

    public final void Etu(2FW r1, MessageIdentifier messageIdentifier, String str, long j, boolean z) {
    }

    public final void Ewv(AnonymousClass7EF r1, MessageIdentifier messageIdentifier, String str) {
    }

    public final void FHP(MessageIdentifier messageIdentifier, boolean z) {
    }

    public final String getModuleName() {
        return "direct_aggregated_media_viewer";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        if (this.A1E) {
            Configuration configuration2 = this.A0t.getResources().getConfiguration();
            0qQ.A07(configuration2);
            if (O3Z.A00(configuration2, configuration)) {
                this.A0U = null;
            }
        }
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final int A00(AnonymousClass7H6 r9) {
        int i;
        2dZ A002;
        Integer num = r9.A0U;
        if (num != null) {
            return num.intValue();
        }
        FragmentActivity fragmentActivity = r9.A0t;
        int i2 = r9.A04;
        int i3 = r9.A02;
        boolean EtI = r9.A0G.EtI();
        boolean z = r9.A1F;
        int A003 = AnonymousClass0nB.A00(fragmentActivity);
        int i4 = 0;
        if (z || (A002 = 2dY.A00(fragmentActivity)) == null) {
            i = 0;
        } else {
            i = A002.AYI();
        }
        if (EtI) {
            Resources resources = fragmentActivity.getResources();
            i4 = resources.getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin) + resources.getDimensionPixelSize(R.dimen.direct_in_thread_composer_top_margin) + resources.getDimensionPixelSize(R.dimen.direct_in_thread_composer_top_margin);
        }
        return ((((A003 - i) - i4) - fragmentActivity.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap)) - i2) - i3;
    }

    public static final ViewGroup A01(AnonymousClass7H6 r1) {
        ViewGroup viewGroup;
        Window window = C61190ls.A00(r1.A0t).getWindow();
        0qQ.A0A(window);
        View decorView = window.getDecorView();
        if ((decorView instanceof ViewGroup) && (viewGroup = (ViewGroup) decorView) != null) {
            return viewGroup;
        }
        throw new IllegalStateException("Couldn't find activity root view");
    }

    public static final N3F A02(AnonymousClass7H6 r3, AnonymousClass77B r4) {
        Object obj;
        Iterator it = ((List) C69911NuD.A00(r3.A0w).A0M.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((N3F) obj).A05, r4.A0S)) {
                break;
            }
        }
        return (N3F) obj;
    }

    public static final OIL A03(AnonymousClass7H6 r2) {
        Object obj;
        ReboundViewPager reboundViewPager = r2.A0C;
        if (reboundViewPager == null) {
            0qQ.A0F("viewPager");
            throw AnonymousClass00P.createAndThrow();
        }
        View view = reboundViewPager.A0F;
        if (view != null) {
            obj = view.getTag();
        } else {
            obj = null;
        }
        if (obj instanceof OIL) {
            return (OIL) obj;
        }
        return null;
    }

    public static final OIL A04(AnonymousClass7H6 r2, int i) {
        Object obj;
        ReboundViewPager reboundViewPager = r2.A0C;
        if (reboundViewPager == null) {
            0qQ.A0F("viewPager");
            throw AnonymousClass00P.createAndThrow();
        }
        View A0D2 = reboundViewPager.A0D(i);
        if (A0D2 != null) {
            obj = A0D2.getTag();
        } else {
            obj = null;
        }
        if (obj instanceof OIL) {
            return (OIL) obj;
        }
        return null;
    }

    public static final AnonymousClass77B A05(AnonymousClass7H6 r2) {
        if (!r2.A0f) {
            return (AnonymousClass77B) 00k.A0O(r2.A1A, r2.A03);
        }
        ReboundViewPager reboundViewPager = r2.A0C;
        if (reboundViewPager != null) {
            return A06(r2, reboundViewPager.getCurrentDataIndex());
        }
        0qQ.A0F("viewPager");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final String A0A(AnonymousClass7H6 r2) {
        C254743sy r22 = r2.A0S;
        if (r22 == null) {
            return null;
        }
        if (r22 instanceof MsysThreadId) {
            return String.valueOf(C66647MaG.A06(r22).A00);
        }
        if (C66647MaG.A0F(r22)) {
            return C66647MaG.A03(r22).A00;
        }
        return null;
    }

    private final void A0B() {
        View inflate = LayoutInflater.from(this.A0t).inflate(R.layout.fragment_permanent_media_viewer, (ViewGroup) null);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.A08 = (ViewGroup) inflate;
        if (this.A0k) {
            0wb.A03("DirectPermanentMediaViewerController_onViewCreated", "view created twice");
        }
        this.A0k = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: type inference failed for: r0v36, types: [X.0sa, X.B0D] */
    /* JADX WARNING: type inference failed for: r1v10, types: [X.Y6p, X.0sa] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0C() {
        /*
            r26 = this;
            r6 = r26
            android.view.ViewGroup r9 = r6.A08
            X.0qQ.A0A(r9)
            androidx.fragment.app.FragmentActivity r5 = r6.A0t
            r10 = 0
            r3 = 1
            X.0qQ.A0B(r9, r3)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            r0 = 2131628170(0x7f0e108a, float:1.8883625E38)
            android.view.View r7 = r1.inflate(r0, r9, r10)
            X.0qQ.A0A(r7)
            X.OHI r1 = new X.OHI
            r1.<init>(r7)
            r7.setTag(r1)
            X.OhN r0 = new X.OhN
            r0.<init>(r1)
            r7.addOnAttachStateChangeListener(r0)
            r0 = 2131436056(0x7f0b2218, float:1.8493972E38)
            android.view.View r8 = r9.requireViewById(r0)
            X.0qQ.A07(r8)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r8.addView(r7)
            r0 = 2131436054(0x7f0b2216, float:1.8493968E38)
            android.view.View r0 = r9.requireViewById(r0)
            r6.A06 = r0
            r0 = 2131436053(0x7f0b2215, float:1.8493966E38)
            android.view.View r0 = r9.requireViewById(r0)
            r6.A07 = r0
            android.view.View r1 = r6.A06
            X.0qQ.A0A(r1)
            r0 = 2131435895(0x7f0b2177, float:1.8493645E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r0 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout) r0
            r6.A0r = r0
            r0 = r8
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r0
            r6.A0D = r0
            r0 = 2131436057(0x7f0b2219, float:1.8493974E38)
            android.view.View r0 = r9.requireViewById(r0)
            com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer r0 = (com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer) r0
            r6.A0E = r0
            com.instagram.common.session.UserSession r2 = r6.A0w
            X.0Tu r13 = X.0Tu.A05
            r0 = 36322229184636949(0x810ae000002815, double:3.0336622220173035E-306)
            boolean r11 = X.182.A06(r13, r2, r0)
            r4 = 2131434988(0x7f0b1dec, float:1.8491805E38)
            if (r11 == 0) goto L_0x0082
            r4 = 2131434989(0x7f0b1ded, float:1.8491807E38)
        L_0x0082:
            android.view.View r4 = r9.requireViewById(r4)
            X.0qQ.A07(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            android.view.View r11 = r4.inflate()
            java.lang.String r12 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r11, r12)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            boolean r0 = X.182.A06(r13, r2, r0)
            if (r0 == 0) goto L_0x0253
            X.7HK r0 = r6.A12
            X.3E6 r4 = r6.A0x
            X.P1D r1 = new X.P1D
            r1.<init>(r11, r4, r0)
        L_0x00a5:
            X.Pw3 r1 = (X.C74508Pw3) r1
            r6.A0L = r1
            r0 = 2131431929(0x7f0b11f9, float:1.8485601E38)
            android.view.View r1 = r9.requireViewById(r0)
            r6.A0n = r1
            if (r1 == 0) goto L_0x00bc
            X.Ohi r0 = new X.Ohi
            r0.<init>(r6)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x00bc:
            boolean r0 = r6.A1F
            if (r0 == 0) goto L_0x00cd
            X.0Tu r11 = X.0Tu.A06
            r0 = 36327791167290051(0x810fef00003ac3, double:3.037179642243432E-306)
            boolean r0 = X.182.A06(r11, r2, r0)
            if (r0 == 0) goto L_0x00eb
        L_0x00cd:
            r0 = 2131434986(0x7f0b1dea, float:1.8491801E38)
            android.view.View r0 = r9.requireViewById(r0)
            X.0qQ.A07(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r11 = r0.inflate()
            X.0qQ.A0C(r11, r12)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            X.7HI r1 = r6.A11
            X.OVY r0 = new X.OVY
            r0.<init>(r11, r2, r1)
            r6.A0K = r0
        L_0x00eb:
            r0 = 2131434987(0x7f0b1deb, float:1.8491803E38)
            android.view.View r0 = r9.requireViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6.A09 = r0
            boolean r11 = r6.A1E
            if (r11 == 0) goto L_0x022c
            X.03Q r0 = r6.A0s
            X.AnonymousClass03j.A00(r9, r0)
            boolean r0 = r9.isLaidOut()
            if (r0 == 0) goto L_0x0222
            boolean r0 = r9.isLayoutRequested()
            if (r0 != 0) goto L_0x0222
            r9.requestApplyInsets()
        L_0x010e:
            r0 = 2131443832(0x7f0b4078, float:1.8509743E38)
            android.view.View r0 = r9.requireViewById(r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r0
            r6.A0C = r0
            r1 = 0
            X.2ej r0 = X.C71682ef.A00()
            X.2el r13 = X.C71682ef.A01(r1, r0)
            X.2eX r12 = new X.2eX
            r12.<init>(r9)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r6.A0C
            java.lang.String r15 = "viewPager"
            if (r1 == 0) goto L_0x0276
            X.2eo[] r0 = new X.AnonymousClass2eo[r10]
            r13.A08(r1, r12, r0)
            android.content.Context r0 = r9.getContext()
            X.0qQ.A07(r0)
            X.Hnk r14 = new X.Hnk
            r14.<init>(r0, r2, r13, r6)
            X.B0D r0 = new X.B0D
            r0.<init>(r6)
            X.Y4Q r12 = new X.Y4Q
            r12.<init>(r0)
            X.Y4L r10 = new X.Y4L
            r10.<init>(r6)
            X.Y6p r1 = new X.Y6p
            r1.<init>(r6)
            X.Y4Q r0 = new X.Y4Q
            r0.<init>(r1)
            X.NR3 r1 = new X.NR3
            r22 = r6
            r25 = r0
            r23 = r12
            r24 = r10
            r21 = r14
            r20 = r13
            r19 = r2
            r18 = r6
            r17 = r5
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r6.A0H = r1
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r6.A0C
            if (r0 == 0) goto L_0x0276
            r0.setAdapter((android.widget.Adapter) r1)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r6.A0C
            if (r1 == 0) goto L_0x0276
            r1.A0b = r3
            X.3os r0 = r6.A0z
            r1.A0P(r0)
            boolean r0 = A0f(r6)
            if (r0 == 0) goto L_0x0195
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r6.A0C
            if (r1 == 0) goto L_0x0276
            X.Oz8 r0 = new X.Oz8
            r0.<init>(r6)
            r1.A0L = r0
        L_0x0195:
            X.7HN r1 = r6.A13
            X.OHk r0 = new X.OHk
            r0.<init>(r2, r1)
            r6.A0I = r0
            X.76d r0 = X.C3262776c.A00(r5, r2)
            r6.A0F = r0
            com.instagram.common.ui.base.IgView r0 = new com.instagram.common.ui.base.IgView
            r0.<init>(r5)
            r6.A05 = r0
            android.view.ViewGroup r1 = A01(r6)
            android.view.View r0 = r6.A05
            java.lang.String r10 = "Required value was null."
            if (r0 == 0) goto L_0x0270
            r1.addView(r0)
            android.view.ViewGroup r2 = A01(r6)
            if (r11 == 0) goto L_0x0216
            r2.addView(r9)
            int r0 = r6.A04
            X.0nA.A0e(r9, r0)
            int r0 = r6.A02
            X.0nA.A0T(r9, r0)
        L_0x01cb:
            r0 = 8
            r9.setVisibility(r0)
            r6.A08 = r9
            X.7HT r0 = r6.A19
            r0.start()
            android.view.View r3 = r6.A07
            if (r3 == 0) goto L_0x026a
            android.view.View r2 = r6.A0n
            if (r2 == 0) goto L_0x0264
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r1 = r6.A0r
            if (r1 == 0) goto L_0x025e
            X.Oal r0 = new X.Oal
            r10 = r5
            r13 = r9
            r14 = r7
            r15 = r8
            r16 = r1
            r17 = r11
            r12 = r2
            r11 = r3
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r6.A0J = r0
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r3 = r6.A0D
            X.0qQ.A0A(r3)
            X.PF7 r2 = new X.PF7
            r2.<init>(r7, r6)
            r1 = 1065353216(0x3f800000, float:1.0)
            X.We2 r0 = new X.We2
            r0.<init>(r3, r2, r1)
            r6.A0Q = r0
            X.6o7 r1 = r6.A16
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = r6.A0D
            X.0qQ.A0A(r0)
            X.C317416nE.A00(r0, r1)
            r4.DmJ(r5)
            return
        L_0x0216:
            int r1 = X.AnonymousClass0nB.A01(r5)
            int r0 = X.AnonymousClass0nB.A00(r5)
            r2.addView(r9, r1, r0)
            goto L_0x01cb
        L_0x0222:
            X.WBQ r0 = new X.WBQ
            r0.<init>()
            r9.addOnLayoutChangeListener(r0)
            goto L_0x010e
        L_0x022c:
            boolean r0 = r6.A1G
            X.2ff r13 = X.C226112fe.A0B
            if (r0 == 0) goto L_0x024d
            r0 = 20
            X.9LZ r12 = new X.9LZ
            r12.<init>(r6, r0)
            java.util.List r1 = r6.A1B
            X.7HW r0 = new X.7HW
            r0.<init>(r12)
            r1.add(r0)
            X.7HW r0 = new X.7HW
            r0.<init>(r12)
        L_0x0248:
            r13.A04(r5, r0, r10)
            goto L_0x010e
        L_0x024d:
            X.Agz r0 = new X.Agz
            r0.<init>(r6)
            goto L_0x0248
        L_0x0253:
            X.7HK r0 = r6.A12
            X.3E6 r4 = r6.A0x
            X.P1C r1 = new X.P1C
            r1.<init>(r11, r2, r4, r0)
            goto L_0x00a5
        L_0x025e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0264:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x026a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0270:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0276:
            X.0qQ.A0F(r15)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7H6.A0C():void");
    }

    private final void A0D() {
        1wn r2 = this.A0A;
        if (r2 != null) {
            AnonymousClass1Nd.A00(this.A0w).A01(r2, C71898Osg.class);
        }
        1wn r22 = this.A0B;
        if (r22 != null) {
            AnonymousClass1Nd.A00(this.A0w).A01(r22, C330837Ol.class);
        }
    }

    private final void A0E() {
        1wn r2 = this.A0A;
        if (r2 != null) {
            AnonymousClass1Nd.A00(this.A0w).A02(r2, C71898Osg.class);
        }
        1wn r22 = this.A0B;
        if (r22 != null) {
            AnonymousClass1Nd.A00(this.A0w).A02(r22, C330837Ol.class);
        }
    }

    private final void A0F() {
        AnonymousClass77B A052;
        if (C66647MaG.A0F(this.A0S) && (A052 = A05(this)) != null && !A052.A0q) {
            DirectThreadKey A032 = C66647MaG.A03(this.A0S);
            if (this.A0T == AnonymousClass05K.A01) {
                C70715OHk oHk = this.A0I;
                if (oHk == null) {
                    0qQ.A0F("mediaFetchController");
                    throw AnonymousClass00P.createAndThrow();
                }
                oHk.A00 = A032;
                if (A032 != null) {
                    oHk.A04.A02(oHk.A06.A0A(A032, (C254743sy) null), new PS5(oHk));
                }
            }
        }
    }

    private final void A0H() {
        Map map = this.A1C;
        for (View view : map.keySet()) {
            Number number = (Number) map.get(view);
            if (number != null) {
                view.setImportantForAccessibility(number.intValue());
            }
        }
        map.clear();
    }

    public static final void A0I(View view, AnonymousClass7H6 r8) {
        ViewParent viewParent;
        if (view != null) {
            viewParent = view.getParent();
            if (viewParent != null && (viewParent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) viewParent;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    0qQ.A07(childAt);
                    if (childAt != view) {
                        r8.A1C.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    }
                }
            }
        } else {
            viewParent = null;
        }
        if (viewParent instanceof View) {
            A0I((View) viewParent, r8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00dd, code lost:
        if (r0.A0V != X.AnonymousClass05K.A00) goto L_0x00df;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0J(X.AnonymousClass7H6 r29) {
        /*
            r0 = r29
            X.77B r4 = r0.A0M
            if (r4 != 0) goto L_0x0012
            java.util.List r2 = r0.A1A
            int r1 = r0.A03
            java.lang.Object r4 = X.00k.A0O(r2, r1)
            X.77B r4 = (X.AnonymousClass77B) r4
            if (r4 == 0) goto L_0x0042
        L_0x0012:
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r3 = r4.A01
            if (r3 == 0) goto L_0x0042
            android.view.ViewGroup r1 = r0.A08
            if (r1 == 0) goto L_0x018f
            android.content.Context r2 = r1.getContext()
            if (r2 == 0) goto L_0x018f
            java.lang.String r7 = A0A(r0)
            if (r7 == 0) goto L_0x0042
            com.instagram.common.session.UserSession r1 = r0.A0w
            X.OKq r5 = new X.OKq
            r5.<init>(r2, r0, r1)
            java.lang.String r8 = r4.A0T
            java.lang.String r2 = r1.A06
            java.lang.String r1 = r4.A0U
            boolean r9 = X.0qQ.A0K(r2, r1)
            boolean r10 = r4.A0j
            int r1 = r3.A00
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r5.A00(r6, r7, r8, r9, r10)
        L_0x0042:
            r8 = 0
            r0.A0M = r8
            r0.A0W = r8
            X.OVY r3 = r0.A0K
            r4 = 8
            if (r3 == 0) goto L_0x0059
            boolean r1 = r0.A0h
            r2 = 4
            if (r1 == 0) goto L_0x0054
            r2 = 8
        L_0x0054:
            android.view.ViewGroup r1 = r3.A02
            r1.setVisibility(r2)
        L_0x0059:
            android.view.View r1 = r0.A05
            if (r1 == 0) goto L_0x0060
            r1.setVisibility(r4)
        L_0x0060:
            android.view.View r2 = r0.A07
            if (r2 == 0) goto L_0x0068
            r1 = 0
            r2.setAlpha(r1)
        L_0x0068:
            r7 = 0
            r0.A0Z(r7)
            androidx.fragment.app.FragmentActivity r3 = r0.A0t
            X.0nA.A0J(r3)
            X.N3i r1 = r0.A0O
            if (r1 == 0) goto L_0x018c
            android.view.View r1 = r0.A07
            if (r1 == 0) goto L_0x018c
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 == 0) goto L_0x018c
            X.N3i r2 = r0.A0O
            if (r2 == 0) goto L_0x0184
            X.OIL r1 = A03(r0)
            if (r1 == 0) goto L_0x0090
            X.3oV r1 = r1.A07
            if (r1 == 0) goto L_0x0090
            r1.setVisibility(r4)
        L_0x0090:
            android.view.View r1 = r0.A06
            if (r1 == 0) goto L_0x0097
            r1.setVisibility(r7)
        L_0x0097:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r0.A0C
            if (r1 != 0) goto L_0x00a5
            java.lang.String r0 = "viewPager"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x00a5:
            r1.setVisibility(r4)
            X.Oal r6 = r0.A0J
            if (r6 == 0) goto L_0x018f
            android.graphics.RectF r10 = r2.A01
            float r15 = r2.A00
            X.77B r1 = A05(r0)
            if (r1 == 0) goto L_0x0180
            float r9 = r1.A02
        L_0x00b8:
            float r14 = r0.A00
            r1 = 20
            float r22 = X.0nA.A04(r3, r1)
            int r5 = r0.A04
            boolean r16 = A0e(r0)
            boolean r4 = r0.A0h
            X.77B r1 = A05(r0)
            if (r1 == 0) goto L_0x00df
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r1 = r1.A01
            if (r1 == 0) goto L_0x00df
            int r2 = r1.A00
            r1 = 2
            if (r2 != r1) goto L_0x00df
            java.lang.Integer r2 = r0.A0V
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r29 = 1
            if (r2 == r1) goto L_0x00e1
        L_0x00df:
            r29 = 0
        L_0x00e1:
            X.LyU r3 = new X.LyU
            r3.<init>(r0)
            X.0qQ.A0B(r10, r7)
            boolean r1 = r6.A05
            if (r1 != 0) goto L_0x018f
            r2 = 1
            android.view.View r12 = r6.A07
            r11 = 2
            r12.setLayerType(r11, r8)
            android.view.View r1 = r6.A09
            r1.setLayerType(r11, r8)
            android.app.Activity r13 = r6.A06
            r1 = 2130968586(0x7f04000a, float:1.754583E38)
            int r1 = X.2Yu.A0G(r13, r1)
            int r5 = r5 + r1
            if (r16 == 0) goto L_0x017e
            android.content.res.Resources r11 = r13.getResources()
            r1 = 2131165260(0x7f07004c, float:1.7944732E38)
            int r1 = r11.getDimensionPixelSize(r1)
            float r11 = (float) r1
        L_0x0111:
            if (r4 == 0) goto L_0x0177
            int r0 = X.AnonymousClass0nB.A00(r13)
            float r1 = (float) r0
        L_0x0118:
            if (r4 == 0) goto L_0x0170
            int r0 = X.AnonymousClass0nB.A01(r13)
        L_0x011e:
            float r11 = (float) r0
            X.OJW r13 = r6.A0B
            android.graphics.drawable.Drawable r0 = r12.getBackground()
            if (r0 == 0) goto L_0x016d
            int r28 = r0.getAlpha()
        L_0x012b:
            android.view.View r0 = r6.A0A
            float r23 = r0.getScaleX()
            float r24 = r0.getX()
            float r25 = r0.getY()
            r0 = 0
            if (r4 != 0) goto L_0x013e
            float r0 = (float) r5
            float r0 = -r0
        L_0x013e:
            r16 = r8
            r19 = r1
            r21 = r14
            r26 = r0
            r27 = r15
            r17 = r9
            r18 = r1
            r20 = r11
            r15 = r8
            r14 = r10
            X.OBS r0 = r13.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.OHl r4 = r0.A00
            X.OHl r1 = r0.A01
            X.PQJ r0 = new X.PQJ
            r0.<init>(r6, r3)
            r6.A05 = r2
            r24 = r6
            r25 = r1
            r26 = r4
            r27 = r0
            r28 = r7
            X.C71066Oal.A01(r24, r25, r26, r27, r28, r29)
            return
        L_0x016d:
            r28 = 0
            goto L_0x012b
        L_0x0170:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r0 = r6.A0C
            int r0 = r0.getWidth()
            goto L_0x011e
        L_0x0177:
            int r0 = A00(r0)
            float r1 = (float) r0
            float r1 = r1 - r11
            goto L_0x0118
        L_0x017e:
            r11 = 0
            goto L_0x0111
        L_0x0180:
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00b8
        L_0x0184:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x018c:
            A0N(r0)
        L_0x018f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7H6.A0J(X.7H6):void");
    }

    public static final void A0L(AnonymousClass7H6 r9) {
        IgdsMediaButton igdsMediaButton;
        long j;
        boolean A062;
        XSV xsv;
        DirectThreadKey A032;
        IgdsMediaButton igdsMediaButton2;
        ReboundViewPager reboundViewPager = r9.A0C;
        String str = null;
        if (reboundViewPager != null) {
            AnonymousClass77B A063 = A06(r9, reboundViewPager.getCurrentDataIndex());
            if (A063 != null) {
                boolean z = true;
                if (!r9.A0h && r9.A0V == AnonymousClass05K.A01 && A063.A0I == 1iA.A0Q) {
                    ReboundViewPager reboundViewPager2 = r9.A0C;
                    if (reboundViewPager2 != null) {
                        if (reboundViewPager2.A0O == AnonymousClass3TF.IDLE && r9.A0G.EtI()) {
                            UserSession userSession = r9.A0w;
                            0Tu r6 = 0Tu.A05;
                            if (182.A06(r6, userSession, 36327159807097032L)) {
                                if (A063.A0R != null) {
                                    A062 = A063.A0l;
                                } else {
                                    String str2 = userSession.A06;
                                    String str3 = A063.A0U;
                                    if (str3 == null) {
                                        str3 = A063.A0Y;
                                    }
                                    if (0qQ.A0K(str2, str3)) {
                                        j = 36328023096048499L;
                                    } else {
                                        j = 36328023095917426L;
                                    }
                                    A062 = 182.A06(r6, userSession, j);
                                    0qQ.A0A(Boolean.valueOf(A062));
                                }
                                if (A062) {
                                    OIL A033 = A03(r9);
                                    if (!(A033 == null || (igdsMediaButton2 = A033.A0D) == null)) {
                                        igdsMediaButton2.setVisibility(0);
                                    }
                                    AnonymousClass7I3 r1 = new AnonymousClass7I3(userSession);
                                    C254743sy r0 = r9.A0S;
                                    if (!(r0 == null || (A032 = C66647MaG.A03(r0)) == null)) {
                                        str = A032.A01;
                                    }
                                    AnonymousClass2Ep r02 = r9.A0N;
                                    if (r02 == null || !r02.CUG()) {
                                        z = false;
                                    }
                                    1Ln A0J2 = 1Ln.A0J(r1.A01);
                                    if (z) {
                                        xsv = XSV.A05;
                                    } else {
                                        xsv = XSV.A06;
                                    }
                                    if (A0J2.A00.isSampled()) {
                                        A0J2.A0Z(26);
                                        A0J2.A0X(1);
                                        A0J2.A0R("selected_item", "edit_with_ai");
                                        A0J2.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                                        A0J2.A0M(xsv, "thread_type");
                                        A0J2.Cgf();
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
                ReboundViewPager reboundViewPager3 = r9.A0C;
                if (reboundViewPager3 != null) {
                    OIL A042 = A04(r9, reboundViewPager3.getCurrentDataIndex());
                    if (A042 != null && (igdsMediaButton = A042.A0D) != null) {
                        igdsMediaButton.setVisibility(8);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("viewPager");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0N(AnonymousClass7H6 r4) {
        String str;
        C14044Tol tol;
        C70715OHk oHk = r4.A0I;
        if (oHk == null) {
            str = "mediaFetchController";
        } else {
            oHk.A04.A01();
            View view = r4.A06;
            if (view != null) {
                view.setVisibility(0);
            }
            ReboundViewPager reboundViewPager = r4.A0C;
            if (reboundViewPager == null) {
                str = "viewPager";
            } else {
                reboundViewPager.setVisibility(8);
                ViewGroup viewGroup = r4.A08;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                OIL A032 = A03(r4);
                if (!(A032 == null || (tol = A032.A0A.A01) == null)) {
                    tol.A0D("finished", true);
                }
                NR3 nr3 = r4.A0H;
                if (nr3 == null) {
                    str = "pagerAdapter";
                } else {
                    nr3.A0D.clear();
                    0fE.A00(nr3, 1213947383);
                    r4.A0l = false;
                    r4.A0U = null;
                    C74508Pw3 pw3 = r4.A0L;
                    if (pw3 != null) {
                        pw3.EE0();
                        pw3.EHy();
                    }
                    A0U(r4, false);
                    r4.A0E();
                    r4.A0g = false;
                    r4.A0A = null;
                    r4.A0B = null;
                    C19700We2 we2 = r4.A0Q;
                    if (we2 != null) {
                        we2.A00();
                    }
                    r4.A0f = false;
                    r4.A0H();
                    0nA.A0J(r4.A0t);
                    A0K(r4);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0O(AnonymousClass7H6 r2) {
        if (r2.A0l) {
            ViewGroup viewGroup = r2.A08;
            0qQ.A0A(viewGroup);
            ViewGroup viewGroup2 = r2.A08;
            0qQ.A0A(viewGroup2);
            viewGroup.setSystemUiVisibility(viewGroup2.getSystemUiVisibility() | 256 | 1024);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: android.view.View} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r11.A0c() != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0142, code lost:
        if (r6 != false) goto L_0x0057;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0P(X.AnonymousClass7H6 r11, X.AnonymousClass77B r12) {
        /*
            com.instagram.common.session.UserSession r1 = r11.A0w
            X.17i r0 = X.17h.A00(r1)
            java.lang.String r5 = r12.A0U
            com.instagram.user.model.User r8 = r0.A02(r5)
            java.lang.String r3 = r1.A06
            boolean r7 = X.0qQ.A0K(r5, r3)
            boolean r0 = r11.A0m
            if (r0 == 0) goto L_0x0037
            X.1Xj r0 = r12.A0E
            if (r0 != 0) goto L_0x0024
            X.5yB r0 = r12.A0F
            if (r0 != 0) goto L_0x0024
            X.3sy r0 = r11.A0S
            boolean r0 = r0 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 == 0) goto L_0x0037
        L_0x0024:
            boolean r0 = r12.A0p
            if (r0 != 0) goto L_0x0037
            boolean r0 = r12.A0i
            if (r0 != 0) goto L_0x0037
            android.net.Uri r0 = r12.A07
            if (r0 != 0) goto L_0x0037
            boolean r0 = r11.A0c()
            r6 = 1
            if (r0 == 0) goto L_0x0038
        L_0x0037:
            r6 = 0
        L_0x0038:
            r4 = 0
            if (r6 == 0) goto L_0x0141
            X.0sP r0 = r11.A0b
            if (r0 == 0) goto L_0x0141
            if (r7 != 0) goto L_0x0056
            X.9HW r2 = X.AnonymousClass9HV.A00(r1)
            X.3sy r0 = r11.A0S
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r0)
            X.3t3 r1 = X.C66647MaG.A08(r0)
            r0 = 7
            boolean r0 = r2.A00(r1, r0)
            if (r0 == 0) goto L_0x0141
        L_0x0056:
            r2 = 1
        L_0x0057:
            X.0sP r0 = r11.A0c
            if (r0 == 0) goto L_0x005e
            if (r7 != 0) goto L_0x005e
            r4 = 1
        L_0x005e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r0 = r12.A0c
            if (r0 == 0) goto L_0x006c
            X.Nj4 r0 = X.C69303Nj4.SHARE
            r1.add(r0)
        L_0x006c:
            if (r6 == 0) goto L_0x0073
            X.Nj4 r0 = X.C69303Nj4.DOWNLOAD
            r1.add(r0)
        L_0x0073:
            if (r2 == 0) goto L_0x007c
            if (r7 == 0) goto L_0x013d
            X.Nj4 r0 = X.C69303Nj4.UNSEND
        L_0x0079:
            r1.add(r0)
        L_0x007c:
            if (r4 == 0) goto L_0x0083
            X.Nj4 r0 = X.C69303Nj4.REPORT
            r1.add(r0)
        L_0x0083:
            X.OVY r0 = r11.A0K
            if (r0 == 0) goto L_0x008a
            r0.A01(r1)
        L_0x008a:
            X.OVY r4 = r11.A0K
            if (r4 == 0) goto L_0x0113
            r10 = 0
            if (r8 == 0) goto L_0x0139
            com.instagram.direct.model.messaginguser.MessagingUser r1 = com.instagram.direct.model.messaginguser.MessagingUser.A00(r8)
            com.instagram.common.typedurl.ImageUrl r2 = r8.Bh3()
            java.lang.String r10 = r8.B8Q()
        L_0x009d:
            boolean r7 = X.0qQ.A0K(r5, r3)
            java.lang.Long r6 = r12.A0L
            boolean r8 = r11.A0i
            boolean r0 = r12.A0p
            r5 = r0 ^ 1
            r9 = 0
            r4.A00 = r1
            if (r2 == 0) goto L_0x0131
            if (r5 == 0) goto L_0x0131
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r4.A07
            r1.setUrl(r2, r11)
            r1.setVisibility(r9)
        L_0x00b8:
            r2 = 4
            if (r10 == 0) goto L_0x012b
            if (r5 == 0) goto L_0x012b
            com.instagram.common.ui.base.IgTextView r3 = r4.A06
            if (r7 == 0) goto L_0x00cc
            android.content.Context r1 = r1.getContext()
            r0 = 2131976687(0x7f1361ef, float:1.9590502E38)
            java.lang.String r10 = r1.getString(r0)
        L_0x00cc:
            r3.setText(r10)
            r3.setVisibility(r9)
        L_0x00d2:
            if (r6 == 0) goto L_0x0125
            if (r5 == 0) goto L_0x0125
            com.instagram.common.ui.base.IgTextView r7 = r4.A05
            r7.setVisibility(r9)
            android.content.Context r2 = r7.getContext()
            X.0qQ.A07(r2)
            long r5 = r6.longValue()
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 / r0
            double r0 = (double) r5
            java.lang.String r0 = X.1G0.A05(r2, r0, r9)
            r7.setText(r0)
        L_0x00f2:
            if (r8 == 0) goto L_0x0117
            r1 = 2131100241(0x7f060251, float:1.7812858E38)
        L_0x00f7:
            android.view.ViewGroup r0 = r4.A02
            android.content.Context r2 = r0.getContext()
            int r0 = r2.getColor(r1)
            X.2dZ r1 = r4.A03
            r1.A0V(r0)
            r3.setTextColor(r0)
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            r1.ENd(r0)
        L_0x0113:
            r11.A0X(r12)
            return
        L_0x0117:
            android.view.ViewGroup r0 = r4.A02
            android.content.Context r1 = r0.getContext()
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            int r1 = X.2Yu.A0H(r1, r0)
            goto L_0x00f7
        L_0x0125:
            com.instagram.common.ui.base.IgTextView r0 = r4.A05
            r0.setVisibility(r2)
            goto L_0x00f2
        L_0x012b:
            com.instagram.common.ui.base.IgTextView r3 = r4.A06
            r3.setVisibility(r2)
            goto L_0x00d2
        L_0x0131:
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r4.A07
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00b8
        L_0x0139:
            r1 = r10
            r2 = r10
            goto L_0x009d
        L_0x013d:
            X.Nj4 r0 = X.C69303Nj4.DELETE
            goto L_0x0079
        L_0x0141:
            r2 = 0
            if (r6 == 0) goto L_0x005e
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7H6.A0P(X.7H6, X.77B):void");
    }

    public static final void A0Q(AnonymousClass7H6 r23, AnonymousClass77B r24) {
        N3F A022;
        String str;
        String str2;
        AnonymousClass79H A012;
        Long l;
        List arrayList;
        Long l2;
        AnonymousClass7H6 r0 = r23;
        Long l3 = null;
        AnonymousClass77B r2 = r24;
        if (!r0.A0g && r0.A0b()) {
            C329967Kx r8 = r0.A0q;
            if (r8 != null) {
                DirectThreadKey A032 = C66647MaG.A03(r0.A0S);
                UserSession userSession = r0.A0w;
                17i A002 = 17h.A00(userSession);
                2Dm A003 = 1bJ.A00(userSession);
                String str3 = r2.A0T;
                C254703su BRz = A003.BRz(A032, str3);
                if (BRz != null) {
                    arrayList = BRz.A0v();
                } else {
                    arrayList = new ArrayList();
                }
                String str4 = r2.A0N;
                String str5 = A032.A00;
                String str6 = userSession.A06;
                2FW r9 = 2FW.A1A;
                AnonymousClass77B A052 = A05(r0);
                if (!(A052 == null || (l2 = A052.A0L) == null)) {
                    l3 = Long.valueOf(TimeUnit.MICROSECONDS.toMillis(l2.longValue()));
                }
                A012 = AnonymousClass79F.A02((PointF) null, userSession, (AnonymousClass9HC) null, r8, r9, A002, l3, str3, str4, str5, str6, arrayList, false, false, false, false);
            } else {
                return;
            }
        } else if (!r0.A0g && r0.A0a() && (A022 = A02(r0, r2)) != null) {
            UserSession userSession2 = r0.A0w;
            Resources resources = r0.A0t.getResources();
            0qQ.A07(resources);
            ImmutableList A004 = OQ3.A00(A022);
            String str7 = A022.A05;
            String str8 = r0.A0X;
            if (str8 != null) {
                String str9 = C66647MaG.A03(r0.A0S).A00;
                String str10 = userSession2.A06;
                C329967Kx r4 = r0.A0q;
                if (r4 != null) {
                    User user = A022.A02;
                    if (user != null) {
                        str = user.getId();
                    } else {
                        str = null;
                    }
                    boolean A0K2 = 0qQ.A0K(str, str10);
                    AnonymousClass77B A053 = A05(r0);
                    if (A053 != null) {
                        str2 = A053.A0T;
                    } else {
                        str2 = null;
                    }
                    2FW r17 = 2FW.A1A;
                    AnonymousClass77B A054 = A05(r0);
                    if (!(A054 == null || (l = A054.A0L) == null)) {
                        l3 = Long.valueOf(TimeUnit.MICROSECONDS.toMillis(l.longValue()));
                    }
                    A012 = OQ3.A01(resources, A004, userSession2, (AnonymousClass9HC) null, r4, r17, l3, str7, str8, str9, str10, str2, A0K2);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            return;
        }
        r2.A00 = A012;
    }

    public static final void A0R(AnonymousClass7H6 r4, AnonymousClass77B r5, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel) {
        DirectThreadAnalyticsParams directThreadAnalyticsParams = r4.A0P;
        if (!(r4.A0S instanceof MsysThreadId) && r5 != null && r5.A0o && privacyMediaOverlayViewModel.A00 == 2 && directThreadAnalyticsParams != null) {
            UserSession userSession = r4.A0w;
            C71137Odf.A04(C69483NmR.PHOTO_VIEWER, userSession, directThreadAnalyticsParams, 0qQ.A0K(r5.A0U, userSession.A06));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        if (r0 == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0091, code lost:
        if (X.182.A06(X.0Tu.A05, r10.A0w, 36319407396953447L) != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (X.182.A06(X.0Tu.A05, r10.A0w, 36325098222858855L) != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0X(X.AnonymousClass77B r11) {
        /*
            r10 = this;
            boolean r0 = r10.A0e
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r11.A0g
            if (r0 == 0) goto L_0x0017
            com.instagram.common.session.UserSession r3 = r10.A0w
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325098222858855(0x810d7c00013267, double:3.0354766133415265E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00a1
        L_0x0017:
            r5 = 1
        L_0x0018:
            com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityChecker r0 = r10.A0G
            boolean r3 = r0.EtI()
            X.3sy r0 = r10.A0S
            boolean r1 = r0 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            boolean r0 = r11.A0h
            r2 = 0
            if (r0 != 0) goto L_0x0039
            X.5yB r0 = r11.A0F
            if (r0 != 0) goto L_0x0039
            boolean r0 = r11.A0m
            if (r0 != 0) goto L_0x0039
            boolean r0 = r11.A0i
            if (r0 != 0) goto L_0x0039
            if (r1 == 0) goto L_0x009f
            boolean r0 = r11.A0j
            if (r0 != 0) goto L_0x009f
        L_0x0039:
            boolean r1 = r10.A0h
            boolean r0 = r10.A0c()
            if (r3 == 0) goto L_0x0048
            if (r2 == 0) goto L_0x0048
            if (r1 != 0) goto L_0x0048
            r2 = 0
            if (r0 == 0) goto L_0x004a
        L_0x0048:
            r2 = 8
        L_0x004a:
            X.Pw3 r1 = r10.A0L
            if (r1 == 0) goto L_0x005e
            boolean r0 = r11.A0g
            r6 = r0 ^ 1
            r9 = 0
            r4 = 1
            X.9IC r3 = new X.9IC
            r7 = r6
            r8 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.Ed3(r3)
        L_0x005e:
            X.Pw3 r0 = r10.A0L
            if (r0 == 0) goto L_0x0065
            r0.Eid(r2)
        L_0x0065:
            X.3sy r0 = r10.A0S
            X.3t3 r6 = A09(r0)
            if (r6 == 0) goto L_0x009c
            X.Pw3 r5 = r10.A0L
            if (r5 == 0) goto L_0x009c
            X.3sy r0 = r10.A0S
            boolean r0 = r0 instanceof com.instagram.model.direct.DirectThreadKey
            r4 = 1
            if (r0 == 0) goto L_0x009d
            X.2Ep r0 = r10.A0N
            if (r0 == 0) goto L_0x0084
            int r1 = r0.C6a()
            r0 = 29
            if (r1 != r0) goto L_0x009d
        L_0x0084:
            com.instagram.common.session.UserSession r3 = r10.A0w
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319407396953447(0x81084f00591d67, double:3.03187771212383E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x009d
        L_0x0093:
            com.instagram.common.session.UserSession r0 = r10.A0w
            X.7Zj r0 = X.C70172NyQ.A00(r0, r6)
            r5.Epd(r0, r4)
        L_0x009c:
            return
        L_0x009d:
            r4 = 0
            goto L_0x0093
        L_0x009f:
            r2 = 1
            goto L_0x0039
        L_0x00a1:
            r5 = 0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7H6.A0X(X.77B):void");
    }

    public static final void A0Y(Throwable th) {
        0f9 AEf = 0wj.A01.AEf(002.A0T(__redex_internal_original_name, "toThreadTarget", '.'), 20134884);
        AEf.ERJ(th);
        AEf.report();
    }

    private final void A0Z(boolean z) {
        View view;
        if (this.A0d && (view = this.A0n) != null) {
            view.setAlpha(1.0f);
            int i = 8;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    private final boolean A0a() {
        if (this.A0T != AnonymousClass05K.A0C || !C66647MaG.A0F(this.A0S)) {
            return false;
        }
        return true;
    }

    private final boolean A0b() {
        if (this.A0T == AnonymousClass05K.A01 && C66647MaG.A0F(this.A0S)) {
            if (!182.A06(0Tu.A06, this.A0w, 36316448159568252L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A0d(MotionEvent motionEvent, AnonymousClass7H6 r7) {
        C19700We2 we2;
        OIL A032;
        ReboundViewPager reboundViewPager = r7.A0C;
        if (reboundViewPager == null) {
            0qQ.A0F("viewPager");
            throw AnonymousClass00P.createAndThrow();
        }
        if (reboundViewPager.A0O == AnonymousClass3TF.IDLE && (((we2 = r7.A0Q) == null || (!we2.A02.A00 && !we2.A03.A03())) && (A032 = A03(r7)) != null)) {
            C69226Nhg nhg = A032.A0A;
            View view = nhg.A09;
            if (view.getVisibility() == 0) {
                if (nhg.A04) {
                    return true;
                }
                if (OZ0.A00(view, nhg.A0A, motionEvent.getX(), motionEvent.getY(), 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A0f(AnonymousClass7H6 r4) {
        UserSession userSession;
        0Tu r2;
        long j;
        DirectShareTarget directShareTarget = r4.A0R;
        if (directShareTarget != null) {
            C254783t2 r0 = directShareTarget.A09;
            r0.getClass();
            userSession = r4.A0w;
            if (C69965Nv5.A00(userSession, r0)) {
                r2 = 0Tu.A05;
                j = 36325982986188217L;
                return 182.A06(r2, userSession, j);
            }
        }
        userSession = r4.A0w;
        r2 = 0Tu.A05;
        j = 36325982986057143L;
        return 182.A06(r2, userSession, j);
    }

    public final boolean A0h() {
        RoundedCornerFrameLayout roundedCornerFrameLayout;
        if (!this.A0l) {
            return false;
        }
        C19700We2 we2 = this.A0Q;
        if (we2 != null) {
            we2.A00();
        }
        if (this.A0h) {
            OIL A032 = A03(this);
            if (A032 == null || (roundedCornerFrameLayout = A032.A0E) == null) {
                return true;
            }
            A0S(this, roundedCornerFrameLayout);
            return true;
        }
        FragmentActivity fragmentActivity = this.A0t;
        Fragment A0R2 = fragmentActivity.getSupportFragmentManager().A0R("DirectIntermediatePermanentMediaViewer.ITEM_ACTIONS_FRAGMENT_TAG");
        if (A0R2 != null) {
            0s1 r0 = new 0s1(fragmentActivity.getSupportFragmentManager());
            r0.A03(A0R2);
            r0.A00();
            return true;
        }
        A0J(this);
        return true;
    }

    public final void D6z(View view) {
        if (!this.A1H) {
            A0B();
        }
        AnonymousClass1Nd.A00(this.A0w).A01(this.A0u, 2Kb.class);
    }

    public final void DBq(MessageIdentifier messageIdentifier, boolean z) {
        AnonymousClass7XW r0 = this.A0p;
        if (r0 != null) {
            r0.DBq(messageIdentifier, z);
        }
        A0M(this);
    }

    public final void DBr(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        AnonymousClass9HD r1 = AnonymousClass9HC.A1b;
        UserSession userSession = this.A0w;
        Parcelable.Creator creator = Capabilities.CREATOR;
        AnonymousClass9HC A002 = r1.A00(userSession, C376189Gz.A00(0sn.A00));
        FragmentActivity fragmentActivity = this.A0t;
        AnonymousClass7L2 A062 = C250563lf.A06(fragmentActivity, A002);
        bundle.putString(C66579MXk.A00(769), str);
        bundle.putString(C66579MXk.A00(770), this.A0X);
        bundle.putString(C66579MXk.A00(775), A0A(this));
        bundle.putString(C66579MXk.A00(771), str2);
        bundle.putInt(AnonymousClass000.A00(2200), A062.A01);
        AnonymousClass6W8 r2 = new AnonymousClass6W8(fragmentActivity, bundle, userSession, ModalActivity.class, "direct_intermediate_viewer_sheet");
        r2.A07();
        r2.A0C(fragmentActivity);
    }

    public final void onDestroy() {
        String str;
        UserSession userSession = this.A0w;
        if (JVU.A00(userSession)) {
            AnonymousClass7HB r4 = this.A15;
            UserSession userSession2 = r4.A02;
            0Tu r8 = 0Tu.A06;
            if (182.A06(r8, userSession2, 36311569076126302L) && 182.A06(r8, userSession2, 36311569077502579L)) {
                2el r1 = r4.A00;
                if (r1 != null) {
                    r1.A04(r4.A01);
                }
                r4.A00 = null;
                r4.A01 = null;
            }
            this.A1A.clear();
            ReboundViewPager reboundViewPager = this.A0C;
            if (reboundViewPager != null) {
                str = "viewPager";
                reboundViewPager.A0E();
                ReboundViewPager reboundViewPager2 = this.A0C;
                if (reboundViewPager2 != null) {
                    reboundViewPager2.A0Q(this.A0z);
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            NR3 nr3 = this.A0H;
            if (nr3 != null) {
                str = "pagerAdapter";
                AnonymousClass7H8 r7 = nr3.A0B;
                2el r42 = nr3.A09;
                0qQ.A0B(r42, 0);
                UserSession userSession3 = r7.A00;
                if (182.A06(r8, userSession3, 36311569076126302L) && 182.A06(r8, userSession3, 36311569077502579L)) {
                    List<View> list = r7.A03;
                    for (View A042 : list) {
                        r42.A04(A042);
                    }
                    list.clear();
                }
                C55804Hnk hnk = nr3.A0A;
                List<View> list2 = hnk.A02;
                for (View A043 : list2) {
                    hnk.A00.A04(A043);
                }
                list2.clear();
                NR3 nr32 = this.A0H;
                if (nr32 != null) {
                    nr32.A0D.clear();
                    0fE.A00(nr32, 1213947383);
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            this.A19.A0C = null;
            this.A08 = null;
            this.A0J = null;
            this.A0n = null;
            this.A0K = null;
            this.A05 = null;
            this.A09 = null;
            this.A0L = null;
            this.A0r = null;
            this.A06 = null;
            this.A07 = null;
            this.A0Q = null;
            this.A0D = null;
            this.A0q = null;
            this.A0E = null;
        }
        if (this.A1G) {
            for (C227182im A022 : this.A1B) {
                C226122ff.A02(this.A0t, A022);
            }
        }
        if (182.A06(0Tu.A05, userSession, 36330754695119621L)) {
            0u4.A03(C63526Kyb.A00).remove(this.A0Y);
        }
        C305926Kc.A00(this);
    }

    public final void onDestroyView() {
        ViewGroup viewGroup;
        if (this.A1E && (viewGroup = this.A08) != null) {
            AnonymousClass03j.A00(viewGroup, (AnonymousClass03Q) null);
        }
        A01(this).removeView(this.A0r);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A0D;
        if (touchInterceptorFrameLayout != null) {
            touchInterceptorFrameLayout.CNi((View.OnTouchListener) null);
        }
        C19700We2 we2 = this.A0Q;
        if (we2 != null) {
            we2.destroy();
        }
        this.A16.destroy();
        A01(this).removeView(this.A08);
        A01(this).removeView(this.A05);
        this.A19.stop();
        A0H();
        AnonymousClass1Nd.A00(this.A0w).A02(this.A0u, 2Kb.class);
        AnonymousClass7HQ r0 = this.A17;
        C234382xm r2 = this.A18;
        0qQ.A0B(r2, 0);
        r0.A01.remove(r2);
        this.A0k = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r2 = r0.A0A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPause() {
        /*
            r3 = this;
            boolean r0 = r3.A0f
            if (r0 == 0) goto L_0x0036
            X.OHk r0 = r3.A0I
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "mediaFetchController"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0012:
            X.1a8 r0 = r0.A04
            r0.A01()
            X.77B r0 = A05(r3)
            r1 = 1
            if (r0 == 0) goto L_0x0036
            boolean r0 = r0.A0s
            if (r0 != r1) goto L_0x0036
            X.OIL r0 = A03(r3)
            if (r0 == 0) goto L_0x0036
            X.Nhg r2 = r0.A0A
            X.Tol r1 = r2.A01
            if (r1 == 0) goto L_0x0036
            java.lang.String r0 = "horizontal_scroll"
            r1.A0A(r0)
            X.C69226Nhg.A01(r2)
        L_0x0036:
            X.1a8 r0 = r3.A0v
            r0.A01()
            A0O(r3)
            r3.A0E()
            r3.A0H()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7H6.onPause():void");
    }

    public final void onResume() {
        OIL A032;
        C14044Tol tol;
        if (this.A0f) {
            AnonymousClass77B A052 = A05(this);
            if (!(A052 == null || !A052.A0s || (A032 = A03(this)) == null || (tol = A032.A0A.A01) == null)) {
                tol.A0C("fragment_resumed", false);
            }
            A0I(this.A08, this);
            A0F();
        }
        A0D();
        this.A0j = false;
    }

    public final void onStart() {
        if (this.A0y == null) {
            this.A0x.DmJ(this.A0t);
        }
    }

    public final void onStop() {
        if (this.A0y == null) {
            this.A0x.onStop();
        }
        A0H();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        if (!this.A1H) {
            A0C();
        }
    }

    public static final C254933tI A07(AnonymousClass7H6 r32) {
        String str;
        String str2;
        String str3;
        AnonymousClass77B A052 = A05(r32);
        if (A052 == null || (str = A052.A0T) == null || (str2 = A052.A0N) == null || (str3 = A052.A0U) == null) {
            return null;
        }
        2FW r18 = 2FW.A1A;
        1Xj r16 = null;
        Boolean valueOf = Boolean.valueOf(0qQ.A0K(A052.A0J, true));
        1Xj r0 = A052.A0E;
        if (r0 != null) {
            r16 = r0;
        }
        return new C254933tI((C376649Iu) null, (AnonymousClass9JI) null, (AnonymousClass77X) null, (AnonymousClass7FN) null, (AnonymousClass7FJ) null, (AnonymousClass55L) null, (C271374ik) null, (C2609947v) null, (C254873tC) null, (UVA) null, r16, (2FW) null, r18, (AnonymousClass53G) null, (DirectStoreStickerResponseItem) null, (ExtendedImageUrl) null, valueOf, str2, (String) null, str, "permanent_media_viewer", str3, (String) null, (List) null, (Map) null, 0);
    }

    public static final AnonymousClass759 A08(AnonymousClass7H6 r8, int i) {
        OIL A042 = A04(r8, i);
        if (A042 == null) {
            return null;
        }
        IgProgressImageView igProgressImageView = (IgProgressImageView) A042.A06.getView();
        UserSession userSession = r8.A0w;
        return new AnonymousClass759(A042.A02, igProgressImageView, userSession, igProgressImageView.getIgImageView(), (C231672s5) null, A042.A08, (AnonymousClass0eM) null, 224);
    }

    private final void A0G() {
        C252063oV r3;
        AnonymousClass77B A052;
        OIL A032 = A03(this);
        if (A032 != null && (r3 = A032.A05) != null && (A052 = A05(this)) != null) {
            ((OJV) this.A1D.getValue()).A00(r3, A052, new Y4N(this));
        }
    }

    public static final void A0K(AnonymousClass7H6 r3) {
        View findViewById = A01(r3).findViewById(R.id.bottom_sheet_container);
        if (A01(r3).indexOfChild(findViewById) >= 0) {
            A01(r3).removeView(findViewById);
            ViewGroup viewGroup = r3.A0o;
            if (viewGroup != null) {
                viewGroup.addView(findViewById, r3.A01);
            }
        }
    }

    public static final void A0M(AnonymousClass7H6 r3) {
        ViewGroup viewGroup;
        View findViewById = A01(r3).findViewById(R.id.bottom_sheet_container);
        ViewParent parent = findViewById.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        r3.A0o = viewGroup;
        if (viewGroup != null) {
            r3.A01 = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            A01(r3).addView(findViewById);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Y6r, X.0sa] */
    public static final void A0U(AnonymousClass7H6 r4, boolean z) {
        AnonymousClass77B A052;
        OIL A032 = A03(r4);
        if (A032 != null && (A052 = A05(r4)) != null) {
            AnonymousClass7H8.A01(A032, A052, new Y4Q(new C22498Y6r(r4)), z);
        }
    }

    public static final void A0V(AnonymousClass7H6 r2, boolean z) {
        OIL A032;
        AnonymousClass77B A052 = A05(r2);
        if (A052 != null && A052.A0s) {
            AnonymousClass77B A053 = A05(r2);
            if ((A053 == null || !A053.A0p) && (A032 = A03(r2)) != null) {
                int i = 8;
                View view = A032.A0A.A09;
                if (z) {
                    i = 0;
                }
                view.setVisibility(i);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [X.0sa, X.Y6u] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.0sa, X.Y6t] */
    /* JADX WARNING: type inference failed for: r0v29, types: [X.0sa, X.Y6s] */
    public static final void A0W(AnonymousClass7H6 r15, boolean z) {
        OIL A032;
        RoundedCornerFrameLayout roundedCornerFrameLayout;
        AnonymousClass77B A052;
        OIL A033;
        RoundedCornerFrameLayout roundedCornerFrameLayout2;
        boolean A0e2 = A0e(r15);
        if (z) {
            List<AnonymousClass77B> list = r15.A1A;
            ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
            for (AnonymousClass77B A0Q2 : list) {
                A0Q(r15, A0Q2);
                arrayList.add(C60340gF.A00);
            }
        } else {
            AnonymousClass77B A053 = A05(r15);
            if (A053 != null) {
                A0Q(r15, A053);
            }
        }
        if (!A0e2 && A0e(r15) && !r15.A0h && (A033 = A03(r15)) != null && (roundedCornerFrameLayout2 = A033.A0E) != null) {
            OZ0 oz0 = OZ0.A00;
            OIL A034 = A03(r15);
            if (A034 != null) {
                Context context = A034.A02;
                AnonymousClass77B A054 = A05(r15);
                if (A054 != null) {
                    0eP A012 = oz0.A01(r15.A0t, context, new Y4O(r15), new Y4Q(new C22499Y6s(r15)), A054.A02, true, false);
                    float floatValue = ((Number) A012.A00).floatValue();
                    float floatValue2 = ((Number) A012.A01).floatValue();
                    if (r15.A0J != null) {
                        C71066Oal.A00(roundedCornerFrameLayout2, floatValue, floatValue2, 0.0f);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        OIL A035 = A03(r15);
        if (!(A035 == null || (A052 = A05(r15)) == null)) {
            r15.A14.A02(r15, A035, A052, new Y4Q(new C22500Y6t(r15)));
        }
        if (A0e2 && !A0e(r15) && !r15.A0h && (A032 = A03(r15)) != null && (roundedCornerFrameLayout = A032.A0E) != null) {
            OZ0 oz02 = OZ0.A00;
            OIL A036 = A03(r15);
            if (A036 != null) {
                Context context2 = A036.A02;
                AnonymousClass77B A055 = A05(r15);
                if (A055 != null) {
                    0eP A013 = oz02.A01(r15.A0t, context2, new Y4P(r15), new Y4Q(new C22501Y6u(r15)), A055.A02, false, false);
                    float floatValue3 = ((Number) A013.A00).floatValue();
                    float floatValue4 = ((Number) A013.A01).floatValue();
                    if (r15.A0J != null) {
                        C71066Oal.A00(roundedCornerFrameLayout, floatValue3, floatValue4, 0.0f);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (z) {
            NR3 nr3 = r15.A0H;
            if (nr3 != null) {
                ReboundViewPager reboundViewPager = r15.A0C;
                if (reboundViewPager == null) {
                    0qQ.A0F("viewPager");
                    throw AnonymousClass00P.createAndThrow();
                }
                nr3.A00 = reboundViewPager.getCurrentDataIndex();
                nr3.A05 = true;
                NR3 nr32 = r15.A0H;
                if (nr32 != null) {
                    0fE.A00(nr32, 1920743064);
                    return;
                }
            }
            0qQ.A0F("pagerAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    private final boolean A0c() {
        AnonymousClass77B A052 = A05(this);
        if (A052 == null || A052.A0s) {
            return false;
        }
        ReboundViewPager reboundViewPager = this.A0C;
        if (reboundViewPager == null) {
            0qQ.A0F("viewPager");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass759 A082 = A08(this, reboundViewPager.getCurrentDataIndex());
        if (A082 == null || A082.A05.CFV() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean A0e(AnonymousClass7H6 r2) {
        AnonymousClass79H r0;
        AnonymousClass77B A052 = A05(r2);
        if (A052 == null || (r0 = A052.A00) == null || !(!r0.A02.isEmpty())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:165:0x037d, code lost:
        if (r7.A0V != r0) goto L_0x037f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0g(com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityChecker r50, X.AnonymousClass7XW r51, X.C329967Kx r52, X.AnonymousClass7L0 r53, X.C68168N3i r54, com.instagram.model.direct.DirectShareTarget r55, X.C254743sy r56, java.lang.Integer r57, java.lang.Integer r58, java.lang.String r59, java.util.List r60, X.C62320sa r61, X.0sP r62, X.0sP r63, float r64, int r65, boolean r66, boolean r67, boolean r68, boolean r69, boolean r70) {
        /*
            r49 = this;
            r2 = r67
            r6 = 0
            r10 = r60
            X.0qQ.A0B(r10, r6)
            r0 = 13
            r12 = r57
            X.0qQ.A0B(r12, r0)
            r0 = 21
            r11 = r58
            X.0qQ.A0B(r11, r0)
            r7 = r49
            boolean r0 = r7.A0k
            if (r0 != 0) goto L_0x0022
            r7.A0B()
            r7.A0C()
        L_0x0022:
            r9 = r65
            java.lang.Object r4 = r10.get(r9)
            X.77B r4 = (X.AnonymousClass77B) r4
            boolean r0 = r7.A0h
            r1 = 0
            if (r0 == 0) goto L_0x0032
            A0S(r7, r1)
        L_0x0032:
            r3 = r53
            if (r53 == 0) goto L_0x003d
            X.Pw3 r0 = r7.A0L
            if (r0 == 0) goto L_0x003d
            r0.ADf(r3)
        L_0x003d:
            r0 = r52
            r7.A0q = r0
            r13 = r56
            r7.A0S = r13
            boolean r0 = X.C66647MaG.A0F(r13)
            if (r0 == 0) goto L_0x0164
            com.instagram.common.session.UserSession r0 = r7.A0w
            X.2Dm r3 = X.2L2.A00(r0)
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r13)
            X.3U9 r0 = r3.B33(r0)
        L_0x0059:
            r7.A0N = r0
            r3 = r55
            r7.A0R = r3
            if (r0 == 0) goto L_0x006a
            r0.BJz()
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r0 = X.C3263376i.A01(r0, r6)
            r7.A0P = r0
        L_0x006a:
            X.3sy r0 = r7.A0S
            if (r0 == 0) goto L_0x0082
            boolean r0 = X.C66647MaG.A0F(r0)
            if (r0 == 0) goto L_0x0082
            X.2Ep r0 = r7.A0N
            if (r0 == 0) goto L_0x0161
            int r0 = r0.C6a()
            boolean r0 = X.AnonymousClass48O.A03(r0)
            if (r0 != 0) goto L_0x0161
        L_0x0082:
            r7.A0e = r2
            r8 = r12
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r7.A0T = r0
            com.instagram.common.session.UserSession r5 = r7.A0w
            X.0Tu r14 = X.0Tu.A05
            r2 = 36320519787782672(0x81095200022210, double:3.03258119256347E-306)
            boolean r14 = X.182.A06(r14, r5, r2)
            java.lang.Boolean r3 = r4.A0J
            r15 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            boolean r2 = X.0qQ.A0K(r3, r2)
            r3 = 1
            if (r2 != 0) goto L_0x00a6
            if (r14 == 0) goto L_0x00a7
        L_0x00a6:
            r15 = 1
        L_0x00a7:
            int r14 = r12.intValue()
            if (r14 == r3) goto L_0x0142
            r2 = 2
            if (r14 != r2) goto L_0x00b4
            boolean r2 = r4.A0m
            if (r2 != 0) goto L_0x015e
        L_0x00b4:
            r7.A0T = r8
            r2 = r51
            r7.A0p = r2
            X.NR3 r8 = r7.A0H
            java.lang.String r16 = "pagerAdapter"
            if (r8 == 0) goto L_0x04f7
            java.lang.String r2 = r4.A0S
            if (r2 != 0) goto L_0x00c6
            java.lang.String r2 = ""
        L_0x00c6:
            r8.A02 = r2
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r2 = r7.A0C
            java.lang.String r15 = "viewPager"
            r25 = r15
            if (r2 == 0) goto L_0x04fb
            r14 = r68
            r2.A0a = r14
            r8.A04 = r3
            r7.A0l = r3
            boolean r2 = r7.A0a()
            if (r2 != 0) goto L_0x00e4
            boolean r2 = r7.A0b()
            if (r2 == 0) goto L_0x0177
        L_0x00e4:
            if (r69 == 0) goto L_0x012a
            java.lang.Object r14 = X.00k.A0O(r10, r6)
            X.2YL r14 = (X.2YL) r14
            if (r14 == 0) goto L_0x0106
            boolean r2 = r7.A0a()
            if (r2 == 0) goto L_0x0106
            r7.A0g = r3
            X.6oS r12 = X.C318116oQ.A00(r14)
            r2 = 10
            X.Pfp r8 = new X.Pfp
            r8.<init>(r14, r7, r1, r2)
            X.19B r2 = X.19B.A00
            X.1Eo.A03(r0, r2, r8, r12)
        L_0x0106:
            r2 = 10
            int r2 = X.0Yv.A1E(r10, r2)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r2)
            java.util.Iterator r8 = r10.iterator()
        L_0x0115:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x0167
            java.lang.Object r2 = r8.next()
            X.77B r2 = (X.AnonymousClass77B) r2
            A0Q(r7, r2)
            X.0gF r2 = X.C60340gF.A00
            r12.add(r2)
            goto L_0x0115
        L_0x012a:
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r12 != r2) goto L_0x0106
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r2 = X.C69911NuD.A00(r5)
            X.0Ud r2 = r2.A0J
            java.lang.Object r2 = r2.getValue()
            X.Njk r2 = (X.C69345Njk) r2
            X.0qQ.A0B(r2, r6)
            java.lang.String r2 = r2.A00
            r7.A0X = r2
            goto L_0x0106
        L_0x0142:
            X.1Xj r2 = r4.A0E
            if (r2 == 0) goto L_0x015e
            boolean r2 = r4.A0i
            if (r2 == 0) goto L_0x014c
            if (r15 == 0) goto L_0x015e
        L_0x014c:
            boolean r2 = r4.A0m
            if (r2 != 0) goto L_0x015e
            boolean r2 = r4.A0h
            if (r2 != 0) goto L_0x015e
            X.3sy r2 = r7.A0S
            boolean r2 = X.C66647MaG.A0F(r2)
            if (r2 == 0) goto L_0x015e
            goto L_0x00b4
        L_0x015e:
            r8 = r0
            goto L_0x00b4
        L_0x0161:
            r2 = 0
            goto L_0x0082
        L_0x0164:
            r0 = r1
            goto L_0x0059
        L_0x0167:
            boolean r2 = r7.A0b()
            if (r2 == 0) goto L_0x04e8
            X.Ot1 r2 = new X.Ot1
            r2.<init>(r7)
            r7.A0B = r2
        L_0x0174:
            r7.A0D()
        L_0x0177:
            java.util.List r8 = r7.A1A
            r8.clear()
            r8.addAll(r10)
            boolean r2 = A0f(r7)
            if (r2 == 0) goto L_0x04d7
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r2 = r7.A0C
            if (r2 == 0) goto L_0x04fb
            X.3os r14 = r7.A0z
            r2.A0Q(r14)
            X.NR3 r12 = r7.A0H
            if (r12 == 0) goto L_0x04f7
            java.util.List r2 = r12.A0D
            r2.clear()
            r2.addAll(r10)
            r12.Cs4()
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r2 = r7.A0C
            if (r2 == 0) goto L_0x04fb
            r2.A0P(r14)
        L_0x01a4:
            X.NR3 r10 = r7.A0H
            if (r10 == 0) goto L_0x04f7
            X.3t3 r2 = A09(r13)
            r10.A01 = r2
            X.Pw3 r12 = r7.A0L
            if (r12 == 0) goto L_0x01cc
            boolean r10 = r7.A0e
            r18 = 30
            X.9IC r2 = new X.9IC
            r19 = r3
            r20 = r10
            r21 = r6
            r22 = r6
            r23 = r6
            r24 = r6
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r12.Ed3(r2)
        L_0x01cc:
            boolean r2 = r4.A0m
            r7.A0i = r2
            r2 = r66
            r7.A0m = r2
            r7.A03 = r9
            r2 = r64
            r7.A00 = r2
            r2 = r59
            r7.A0Y = r2
            r2 = r62
            r7.A0b = r2
            r2 = r63
            r7.A0c = r2
            r2 = r61
            r7.A0Z = r2
            r2 = r50
            r7.A0G = r2
            r2 = r70
            r7.A0d = r2
            r7.A0V = r11
            r2 = r54
            r7.A0O = r2
            android.view.View r12 = r7.A05
            if (r12 == 0) goto L_0x020e
            androidx.fragment.app.FragmentActivity r11 = r7.A0t
            android.view.ViewGroup r10 = A01(r7)
            r9 = 16
            r2 = 2131100052(0x7f060194, float:1.7812475E38)
            android.graphics.drawable.BitmapDrawable r2 = X.C232972uk.A02(r11, r10, r9, r2)
            r12.setBackground(r2)
        L_0x020e:
            boolean r2 = r7.A0d
            if (r2 == 0) goto L_0x04bd
            X.OIL r2 = A03(r7)
            if (r2 == 0) goto L_0x0223
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r9 = r2.A0E
            if (r9 == 0) goto L_0x0223
            boolean r2 = r7.A0d
            r2 = r2 ^ 1
            A0T(r7, r9, r2)
        L_0x0223:
            java.lang.Integer r12 = r7.A0V
            r11 = 0
            if (r12 != r0) goto L_0x0490
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r2 = r7.A0C
            if (r2 == 0) goto L_0x04fb
            int r2 = r2.getCurrentDataIndex()
            X.759 r11 = A08(r7, r2)
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r10 = r4.A01
            if (r10 == 0) goto L_0x0244
            if (r11 == 0) goto L_0x0244
            r9 = 42
            X.AwZ r2 = new X.AwZ
            r2.<init>(r9, r4, r7, r10)
            r11.A04(r10, r2, r3)
        L_0x0244:
            android.view.View r2 = r7.A06
            r11 = 0
            if (r2 == 0) goto L_0x048d
            java.lang.Object r3 = r2.getTag()
        L_0x024d:
            boolean r2 = r3 instanceof X.OHI
            if (r2 == 0) goto L_0x0254
            r11 = r3
            X.OHI r11 = (X.OHI) r11
        L_0x0254:
            int r2 = r7.A03
            r8.set(r2, r4)
            boolean r2 = r7.A0l
            if (r2 == 0) goto L_0x0481
            if (r11 == 0) goto L_0x047c
            X.3sy r2 = r7.A0S
            X.3t3 r13 = A09(r2)
            boolean r2 = A0f(r7)
            if (r2 != 0) goto L_0x0282
            X.NR3 r3 = r7.A0H
            r15 = r16
            if (r3 == 0) goto L_0x04fb
            java.util.List r2 = r3.A0D
            r2.clear()
            r2.addAll(r8)
            r3.Cs4()
            X.NR3 r2 = r7.A0H
            if (r2 == 0) goto L_0x04fb
            r2.A01 = r13
        L_0x0282:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r3 = r7.A0C
            r15 = r25
            if (r3 == 0) goto L_0x04fb
            boolean r2 = r3.isLaidOut()
            if (r2 == 0) goto L_0x0472
            boolean r2 = r3.isLayoutRequested()
            if (r2 != 0) goto L_0x0472
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r3 = r7.A0C
            if (r3 == 0) goto L_0x04fb
            int r2 = r7.A03
            float r2 = (float) r2
            r3.A0G(r2)
        L_0x029e:
            X.7HB r14 = r7.A15
            X.1a8 r10 = r7.A0v
            r2 = 4
            X.0qQ.A0B(r10, r2)
            X.MdB r2 = r11.A00
            if (r2 == 0) goto L_0x02ad
            r2.Dds()
        L_0x02ad:
            X.7HA r8 = r14.A03
            boolean r3 = r4.A0d
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.MdB r9 = r8.A00(r7, r0, r2, r3)
            X.3oV r8 = r11.A02
            int r2 = r4.A03
            r8.setVisibility(r2)
            X.0eM r2 = r14.A04
            java.lang.Object r3 = r2.getValue()
            X.OJV r3 = (X.OJV) r3
            X.3oV r2 = r11.A01
            r3.A00(r2, r4, r1)
            android.view.View r8 = r8.getView()
            com.instagram.feed.widget.IgProgressImageView r8 = (com.instagram.feed.widget.IgProgressImageView) r8
            r8.A04()
            X.2el r12 = X.AnonymousClass2hM.A00(r8)
            r14.A00 = r12
            if (r12 == 0) goto L_0x02fd
            r12.A04(r8)
            java.lang.String r15 = r4.A0T
            if (r15 != 0) goto L_0x02e5
            java.lang.String r15 = ""
        L_0x02e5:
            X.30Y r2 = X.AnonymousClass30Y.A07
            X.30a r3 = new X.30a
            r3.<init>(r4, r7, r15)
            X.OzV r2 = new X.OzV
            r2.<init>(r9)
            r3.A00(r2)
            X.30Y r2 = r3.A01()
            r12.A05(r8, r2)
            r14.A01 = r8
        L_0x02fd:
            X.PGK r2 = new X.PGK
            r2.<init>(r9)
            r8.A04 = r2
            r9.Ddv(r13)
            X.1aU r3 = r4.A08
            X.PSH r2 = new X.PSH
            r2.<init>(r9, r8)
            r10.A02(r3, r2)
            X.1aU r3 = r4.A09
            X.PSY r2 = new X.PSY
            r12 = r2
            r13 = r7
            r14 = r5
            r15 = r4
            r16 = r9
            r17 = r8
            r12.<init>(r13, r14, r15, r16, r17)
            r10.A02(r3, r2)
            r11.A00 = r9
            A0P(r7, r4)
            r7.A0F()
        L_0x032b:
            boolean r15 = r7.A0d
            androidx.fragment.app.FragmentActivity r5 = r7.A0t
            android.content.res.Resources r3 = r5.getResources()
            r2 = 2131165226(0x7f07002a, float:1.7944663E38)
            int r2 = r3.getDimensionPixelSize(r2)
            float r14 = (float) r2
            boolean r3 = r4.A0p
            if (r3 == 0) goto L_0x046a
            r41 = r14
        L_0x0341:
            r8 = 0
            if (r3 == 0) goto L_0x0466
            android.content.res.Resources r5 = r5.getResources()
            r2 = 2131165283(0x7f070063, float:1.7944779E38)
            int r2 = r5.getDimensionPixelSize(r2)
            float r2 = (float) r2
            java.lang.Float r34 = java.lang.Float.valueOf(r2)
        L_0x0354:
            X.Oal r9 = r7.A0J
            if (r9 == 0) goto L_0x0447
            X.N3i r2 = r7.A0O
            if (r2 == 0) goto L_0x035e
            android.graphics.RectF r8 = r2.A01
        L_0x035e:
            if (r2 == 0) goto L_0x0463
            float r13 = r2.A00
        L_0x0362:
            float r2 = r4.A02
            r20 = r2
            if (r3 != 0) goto L_0x036a
            float r14 = r7.A00
        L_0x036a:
            int r5 = r7.A04
            boolean r10 = A0e(r7)
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r2 = r4.A01
            if (r2 == 0) goto L_0x037f
            int r3 = r2.A00
            r2 = 2
            if (r3 != r2) goto L_0x037f
            java.lang.Integer r2 = r7.A0V
            r48 = 1
            if (r2 == r0) goto L_0x0381
        L_0x037f:
            r48 = 0
        L_0x0381:
            X.PQC r12 = new X.PQC
            r12.<init>(r7)
            if (r8 == 0) goto L_0x0447
            boolean r0 = r9.A04
            if (r0 != 0) goto L_0x0447
            android.view.View r0 = r9.A07
            r2 = 2
            r0.setLayerType(r2, r1)
            android.view.View r0 = r9.A09
            r0.setLayerType(r2, r1)
            android.app.Activity r0 = r9.A06
            r2 = 2130968586(0x7f04000a, float:1.754583E38)
            int r2 = X.2Yu.A0G(r0, r2)
            int r5 = r5 + r2
            if (r10 == 0) goto L_0x0460
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131165260(0x7f07004c, float:1.7944732E38)
            int r2 = r3.getDimensionPixelSize(r2)
            float r4 = (float) r2
        L_0x03af:
            X.OJW r11 = r9.A0B
            r25 = 0
            android.content.Context r3 = r11.A00
            int r2 = X.0nA.A05(r3)
            float r10 = (float) r2
            int r2 = X.0nA.A06(r3)
            float r2 = (float) r2
            r31 = 255(0xff, float:3.57E-43)
            r26 = 1065353216(0x3f800000, float:1.0)
            r19 = r1
            r22 = r10
            r27 = r25
            r28 = r25
            r29 = r25
            r30 = r13
            r18 = r1
            r21 = r10
            r23 = r2
            r24 = r14
            r16 = r11
            r17 = r8
            X.OBS r16 = r16.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            int r1 = A00(r7)
            float r3 = (float) r1
            float r3 = r3 - r4
            int r1 = A00(r7)
            float r2 = (float) r1
            float r2 = r2 - r4
            int r1 = X.AnonymousClass0nB.A01(r0)
            android.content.res.Resources r10 = r0.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = r10.getDimensionPixelSize(r0)
            int r0 = r0 * 2
            int r1 = r1 - r0
            float r10 = (float) r1
            float r0 = (float) r5
            float r1 = -r0
            r32 = r11
            r33 = r8
            r35 = r34
            r36 = r20
            r37 = r3
            r38 = r2
            r39 = r10
            r40 = r14
            r42 = r26
            r43 = r25
            r44 = r25
            r45 = r1
            r46 = r13
            r47 = r31
            X.OBS r1 = r32.A00(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            if (r15 == 0) goto L_0x0424
            r1 = r16
        L_0x0424:
            X.OHl r3 = r1.A00
            X.OHl r2 = r1.A01
            int r1 = A00(r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            float r1 = r1.floatValue()
            float r1 = r1 - r4
            int r1 = (int) r1
            r9.A02 = r1
            r9.A01 = r0
            r43 = r9
            r44 = r3
            r45 = r2
            r46 = r12
            r47 = r15
            X.C71066Oal.A01(r43, r44, r45, r46, r47, r48)
        L_0x0447:
            android.view.ViewGroup r0 = r7.A08
            if (r0 == 0) goto L_0x044e
            r0.setVisibility(r6)
        L_0x044e:
            android.view.ViewGroup r0 = r7.A09
            if (r0 == 0) goto L_0x0455
            r0.setVisibility(r6)
        L_0x0455:
            android.view.View r0 = r7.A05
            if (r0 == 0) goto L_0x045c
            r0.setVisibility(r6)
        L_0x045c:
            A0L(r7)
            return
        L_0x0460:
            r4 = 0
            goto L_0x03af
        L_0x0463:
            r13 = 0
            goto L_0x0362
        L_0x0466:
            r34 = r1
            goto L_0x0354
        L_0x046a:
            r2 = 20
            float r41 = X.0nA.A04(r5, r2)
            goto L_0x0341
        L_0x0472:
            X.OkB r2 = new X.OkB
            r2.<init>(r7)
            r3.addOnLayoutChangeListener(r2)
            goto L_0x029e
        L_0x047c:
            java.lang.String r3 = "MediaViewerNullViewHolder"
            java.lang.String r2 = "Null ViewHolder is retrieved"
            goto L_0x0485
        L_0x0481:
            java.lang.String r3 = "MediaViewerNullViewModel"
            java.lang.String r2 = "Null view model is generated"
        L_0x0485:
            X.0wb.A03(r3, r2)
            A0J(r7)
            goto L_0x032b
        L_0x048d:
            r3 = r11
            goto L_0x024d
        L_0x0490:
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r10 = r7.A0P
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r2 = r4.A01
            if (r2 == 0) goto L_0x0244
            int r9 = r2.A00
            r2 = 2
            if (r9 != r2) goto L_0x0244
            boolean r2 = r4.A0o
            if (r2 != r3) goto L_0x0244
            if (r10 == 0) goto L_0x0244
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r12 != r2) goto L_0x04ba
            X.NmR r9 = X.C69483NmR.CARD_STACK
        L_0x04a7:
            java.lang.String r3 = r5.A06
            X.77B r2 = A05(r7)
            if (r2 == 0) goto L_0x04b1
            java.lang.String r11 = r2.A0U
        L_0x04b1:
            boolean r2 = X.0qQ.A0K(r3, r11)
            X.C71137Odf.A05(r9, r5, r10, r2)
            goto L_0x0244
        L_0x04ba:
            X.NmR r9 = X.C69483NmR.IN_THREAD
            goto L_0x04a7
        L_0x04bd:
            A0O(r7)
            androidx.fragment.app.FragmentActivity r9 = r7.A0t
            r2 = 2131100175(0x7f06020f, float:1.7812724E38)
            int r2 = r9.getColor(r2)
            X.2db.A02(r9, r2)
            X.OVY r2 = r7.A0K
            if (r2 == 0) goto L_0x0223
            android.view.ViewGroup r2 = r2.A02
            r2.setVisibility(r6)
            goto L_0x0223
        L_0x04d7:
            X.NR3 r12 = r7.A0H
            if (r12 == 0) goto L_0x04f7
            java.util.List r2 = r12.A0D
            r2.clear()
            r2.addAll(r10)
            r12.Cs4()
            goto L_0x01a4
        L_0x04e8:
            boolean r2 = r7.A0a()
            if (r2 == 0) goto L_0x0174
            X.Ot2 r2 = new X.Ot2
            r2.<init>(r7)
            r7.A0A = r2
            goto L_0x0174
        L_0x04f7:
            X.0qQ.A0F(r16)
            goto L_0x04fe
        L_0x04fb:
            X.0qQ.A0F(r15)
        L_0x04fe:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7H6.A0g(com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityChecker, X.7XW, X.7Kx, X.7L0, X.N3i, com.instagram.model.direct.DirectShareTarget, X.3sy, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.List, X.0sa, X.0sP, X.0sP, float, int, boolean, boolean, boolean, boolean, boolean):void");
    }
}
