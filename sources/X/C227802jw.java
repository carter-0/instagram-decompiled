package X;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager;
import com.instagram.common.ui.widget.recyclerview.MainFeedRecyclerView;
import com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource;
import com.instagram.ui.listview.StickyHeaderListView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2jw  reason: invalid class name and case insensitive filesystem */
public final class C227802jw extends C227812jx implements AnonymousClass4DR, C227252iu, AnonymousClass4DS, AnonymousClass4DT, C227292iy, C227822jy, CallerContextable {
    public static final String __redex_internal_original_name = "MainFeedFragment";
    public int A00 = -1;
    public View A01;
    public IgSimpleImageView A02;
    public IgSimpleImageView A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgTextView A06;
    public AnonymousClass332 A07;
    public AnonymousClass57X A08;
    public 1FI A09 = 1FI.A0F;
    public AnonymousClass57Q A0A;
    public C238213Az A0B;
    public C270374gd A0C;
    public StickyHeaderListView A0D;
    public AnonymousClass3D5 A0E;
    public GradientSpinner A0F;
    public AnonymousClass3AD A0G;
    public C2354930b A0H;
    public C2357130x A0I;
    public Integer A0J;
    public String A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public AnonymousClass06Q A0V;
    public AnonymousClass3E3 A0W;
    public C229072mn A0X;
    public AnonymousClass57N A0Y;
    public C232692uG A0Z;
    public AnonymousClass2kR A0a;
    public AnonymousClass2xI A0b;
    public AnonymousClass3GG A0c;
    public AnonymousClass57E A0d;
    public C228062kj A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public final C249383je A0i;
    public final C227872kC A0j;
    public final C227892kG A0k;
    public final AnonymousClass0eM A0l = AnonymousClass0eN.A01(new AnonymousClass9LY(this, 29));
    public final AnonymousClass0eM A0m;
    public final AnonymousClass0eM A0n;
    public final AnonymousClass0eM A0o;
    public final AnonymousClass2k6 A0p = new Object();
    public final C249383je A0q;
    public final Object A0r;
    public final AtomicBoolean A0s;
    public final AnonymousClass0eM A0t;

    public final void A0G(1Xj r10) {
        0qQ.A0B(r10, 0);
        HnZ A012 = A09().A01();
        AnonymousClass3W1 r0 = new AnonymousClass3W1(false);
        UserSession userSession = A012.A00;
        C227802jw r4 = A012.A02;
        2EG r8 = 2EG.A3E;
        Q03 q03 = new Q03(r4, userSession, new C271794jb(userSession, r10, r0.A06()), AnonymousClass2kO.A00, r8);
        q03.A0J = r10;
        q03.A09 = 0;
        q03.A0h = A012.A01.A01;
        new Q02(q03).A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        if (X.182.A06(X.0Tu.A06, A05(), 36312887640393169L) == false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
        if (X.182.A06(X.0Tu.A06, A05(), 36312887641507297L) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H(X.1Xj r8, com.instagram.feed.ui.state.IntentAwareAdPivotState r9, X.C54077Gz1 r10, java.util.List r11) {
        /*
            r7 = this;
            r0 = 0
            X.0qQ.A0B(r11, r0)
            r0 = 1
            X.0qQ.A0B(r8, r0)
            X.4I5 r6 = X.AnonymousClass59V.A00
            int r0 = r10.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r6.A02(r0)
            r5 = 1
            if (r0 == 0) goto L_0x0029
            com.instagram.common.session.UserSession r3 = r7.getSession()
            X.0Tu r2 = X.0Tu.A06
            r0 = 36312887640393169(0x810261009305d1, double:3.0277545918221576E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4 = 1
            if (r0 != 0) goto L_0x002a
        L_0x0029:
            r4 = 0
        L_0x002a:
            int r0 = r10.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r6.A01(r0)
            if (r0 == 0) goto L_0x004f
            com.instagram.common.session.UserSession r3 = r7.getSession()
            X.0Tu r2 = X.0Tu.A06
            r0 = 36312887641507297(0x81026100a405e1, double:3.0277545925267367E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x004f
        L_0x0047:
            if (r4 != 0) goto L_0x0051
            if (r5 != 0) goto L_0x0051
            r7.A0I(r8, r9, r10, r11)
            return
        L_0x004f:
            r5 = 0
            goto L_0x0047
        L_0x0051:
            int r1 = r10.A00
            java.lang.String r0 = r10.getId()
            r7.A0M(r8, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227802jw.A0H(X.1Xj, com.instagram.feed.ui.state.IntentAwareAdPivotState, X.Gz1, java.util.List):void");
    }

    public final void A0J(1Xj r8, AnonymousClass3W1 r9, int i) {
        1Xj r2 = r8;
        0qQ.A0B(r8, 0);
        AnonymousClass3W1 r3 = r9;
        0qQ.A0B(r9, 1);
        HnZ A012 = A09().A01();
        C2357130x r1 = A012.A03;
        if (r1 != null) {
            User A2A = r8.A2A(A012.A00);
            int i2 = i;
            if (A2A == null || !A2A.A2Q()) {
                r1.BQE().D2u(r2, r3, (Boolean) null, i2, false);
            } else {
                r1.BQE().D2P(r8, r9, i, false);
            }
        }
    }

    public final void A0K(1Xj r9, AnonymousClass3W1 r10, int i) {
        User A2A;
        1Xj r3 = r9;
        0qQ.A0B(r9, 0);
        AnonymousClass3W1 r4 = r10;
        0qQ.A0B(r10, 1);
        HnZ A012 = A09().A01();
        C2357130x r2 = A012.A03;
        if (r2 != null && (A2A = r9.A2A(A012.A00)) != null) {
            int i2 = i;
            if (A2A.A2Q()) {
                r2.BQE().D2O(r9, r10, i, false);
            } else {
                r2.BQE().D3K(r3, r4, A2A.getId(), i2, false);
            }
        }
    }

    public final void A0L(1Xj r25, C55512Hiu hiu, int i) {
        1Xj r5 = r25;
        0qQ.A0B(r5, 1);
        C55512Hiu hiu2 = hiu;
        0qQ.A0B(hiu2, 3);
        C228062kj A0A2 = A0A();
        C10639RvY rvY = A0A2.A0W;
        if (rvY == null) {
            rvY = new C10639RvY(A0A2.A20.requireActivity(), A0A2.A1t, AnonymousClass2kO.A00);
            A0A2.A0W = rvY;
        }
        Activity activity = rvY.A00;
        UserSession userSession = rvY.A01;
        new C52031GCd(activity, userSession, rvY.A02, (C228232l0) null, new IZG(hiu2, i), C52212GJd.A08, (String) null).A0L(new C271794jb(userSession, r5), r5, new C55894HpF((String) null, (String) null, (String) null, false, true, true, false, false, true, true, false, false, false, false, false, false, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        if (X.182.A06(X.0Tu.A06, r8.A00, 36312887640524243L) == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M(X.1Xj r12, java.lang.String r13, int r14) {
        /*
            r11 = this;
            r0 = 2
            X.0qQ.A0B(r13, r0)
            X.3GG r0 = r11.A09()
            X.HnZ r8 = r0.A01()
            r4 = 0
            X.4I5 r10 = X.AnonymousClass59V.A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            boolean r0 = r10.A01(r5)
            if (r0 == 0) goto L_0x0099
            com.instagram.clips.intf.ClipsViewerSource r7 = com.instagram.clips.intf.ClipsViewerSource.FEED_PAE_MULTI_ADS
        L_0x001b:
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            boolean r0 = r10.A02(r5)
            if (r0 == 0) goto L_0x0033
            com.instagram.common.session.UserSession r3 = r8.A00
            X.0Tu r2 = X.0Tu.A06
            r0 = 36312887640524243(0x810261009505d3, double:3.0277545919050494E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r9 = 1
            if (r0 != 0) goto L_0x0034
        L_0x0033:
            r9 = 0
        L_0x0034:
            boolean r0 = r10.A01(r5)
            if (r0 == 0) goto L_0x0094
            com.instagram.common.session.UserSession r3 = r8.A00
            X.0Tu r2 = X.0Tu.A06
            r0 = 36312887641572834(0x81026100a505e2, double:3.0277545925681825E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0094
            com.instagram.clips.intf.ClipsViewerSource r7 = com.instagram.clips.intf.ClipsViewerSource.FEED_PAE_MULTI_ADS_AD_CHAIN
        L_0x004b:
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
        L_0x004d:
            X.2jw r0 = r8.A02
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.common.session.UserSession r2 = r8.A00
            X.4h3 r1 = new X.4h3
            r1.<init>(r7, r2)
            java.lang.String r0 = r12.getId()
            r1.A1C = r0
            r1.A1g = r4
            r1.A1c = r4
            X.0qQ.A0B(r6, r4)
            r1.A0S = r6
            java.lang.String r0 = X.C231122qu.A07(r2, r12)
            r1.A17 = r0
            X.1wP r0 = X.1wN.A00(r2)
            X.3OA r0 = r0.A00(r12)
            r1.A02(r2, r0, r4)
            java.lang.String r0 = X.C231122qu.A0F(r2, r12)
            r1.A1A = r0
            X.GAi r0 = com.instagram.api.schemas.IntentAwareAdsInfoIntf.A00
            X.GAj r0 = r0.A00()
            r0.A02 = r5
            r0.A06 = r13
            com.instagram.api.schemas.IntentAwareAdsInfoIntf r0 = r0.A00()
            r1.A0D = r0
            X.I6Y.A01(r3, r1, r2, r4)
            return
        L_0x0094:
            if (r9 == 0) goto L_0x004d
            com.instagram.clips.intf.ClipsViewerSource r7 = com.instagram.clips.intf.ClipsViewerSource.FEED_MULTI_ADS_AD_CHAIN
            goto L_0x004b
        L_0x0099:
            com.instagram.clips.intf.ClipsViewerSource r7 = com.instagram.clips.intf.ClipsViewerSource.FEED_MULTI_ADS
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227802jw.A0M(X.1Xj, java.lang.String, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        if (X.0qQ.A0K(r9.A09, r12) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0040, code lost:
        if (X.0qQ.A0K(r9.A09, r12) == false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Q(java.lang.String r12) {
        /*
            r11 = this;
            r8 = 0
            X.0qQ.A0B(r12, r8)
            X.2kj r0 = r11.A0A()
            X.2rI r3 = r0.A0J()
            X.2rX r4 = r3.A00
            X.2rW r4 = (X.AnonymousClass2rW) r4
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.LinkedList r0 = r4.A02
            java.util.Iterator r10 = r0.iterator()
            X.0qQ.A07(r10)
        L_0x0023:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r6 = r10.next()
            r9 = r6
            X.1Xg r9 = (X.1Xg) r9
            X.0qQ.A0B(r9, r8)
            X.1UQ r1 = r9.A06
            X.1UQ r0 = X.1UQ.A0l
            if (r1 != r0) goto L_0x0042
            java.lang.String r0 = r9.A09
            boolean r0 = X.0qQ.A0K(r0, r12)
            r2 = 1
            if (r0 != 0) goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            X.1UQ r0 = X.1UQ.A0T
            if (r1 != r0) goto L_0x0050
            java.lang.String r0 = r9.A09
            boolean r1 = X.0qQ.A0K(r0, r12)
            r0 = 1
            if (r1 != 0) goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            if (r2 != 0) goto L_0x0059
            if (r0 != 0) goto L_0x0059
            r5.add(r6)
            goto L_0x0023
        L_0x0059:
            r7.add(r6)
            goto L_0x0023
        L_0x005d:
            java.util.Iterator r1 = r7.iterator()
        L_0x0061:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r1.next()
            r4.A0C(r0)
            goto L_0x0061
        L_0x006f:
            java.util.List r0 = java.util.Collections.unmodifiableList(r5)
            r4.A01 = r0
            X.AnonymousClass2rW.A00(r4)
            r0 = -1
            r3.A0A(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227802jw.A0Q(java.lang.String):void");
    }

    public final void A0U(boolean z, String str) {
        Pair pair;
        1Xj A022;
        Context context;
        int i;
        String str2 = str;
        0qQ.A0B(str2, 1);
        if (A0W()) {
            UserSession A052 = getSession();
            0qQ.A0B(A052, 0);
            if (182.A06(0Tu.A05, A052, 36323406006135952L)) {
                return;
            }
        }
        if (Systrace.A0E(1)) {
            0fS.A01("onFeedRequestFinished", -1428780876);
        }
        try {
            C238183Aw A0Y2 = A0A().A0Y();
            String str3 = A0A().A1x.A01;
            Integer num = AnonymousClass05K.A0C;
            A0Y2.A00(str3, num, str2);
            if (z) {
                C228062kj A0A2 = A0A();
                AnonymousClass36C r2 = A0A2.A0j;
                if (r2 == null) {
                    r2 = new AnonymousClass36C(A0A2.A1t, A0A2.A0J());
                    A0A2.A0j = r2;
                }
                r2.A00();
                StickyHeaderListView stickyHeaderListView = this.A0D;
                if (stickyHeaderListView != null) {
                    if (A0A().A0J().A0F()) {
                        context = stickyHeaderListView.getContext();
                        i = R.attr.igds_color_secondary_background;
                    } else if (stickyHeaderListView.getBackground() != null) {
                        context = stickyHeaderListView.getContext();
                        i = R.attr.igds_color_primary_background;
                    }
                    stickyHeaderListView.setBackgroundColor(context.getColor(2Yu.A0H(context, i)));
                }
                C2354930b r10 = this.A0H;
                if (r10 != null && !r10.A00) {
                    UserSession A053 = getSession();
                    0Tu r9 = 0Tu.A06;
                    if (182.A06(r9, A053, 36312887639803337L)) {
                        AnonymousClass2rI A0J2 = A0A().A0J();
                        boolean z2 = false;
                        if (A0J2.A04 != null) {
                            z2 = true;
                        }
                        if (z2) {
                            Integer num2 = null;
                            int size = A0J2.A07().size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    break;
                                }
                                1Xg r22 = (1Xg) A0J2.A07().get(i2);
                                if (r22.A06 != 1UQ.A0F) {
                                    if (!(num2 == null || (A022 = 1Xi.A02(r22.A05)) == null || !A022.CcK())) {
                                        pair = new Pair(Integer.valueOf(i2), num2);
                                        break;
                                    }
                                } else {
                                    num2 = Integer.valueOf(i2);
                                }
                                i2++;
                            }
                        }
                        pair = new Pair(-1, -1);
                        int intValue = ((Number) pair.first).intValue();
                        int intValue2 = ((Number) pair.second).intValue();
                        if (intValue != -1) {
                            r10.A00 = true;
                            int i3 = intValue + 1;
                            1Xj A023 = 1Xi.A02(A0A().A0J().A03(intValue).A05);
                            if (A023 != null) {
                                long j = (long) i3;
                                if (j >= 182.A01(r9, getSession(), 36594362615858879L)) {
                                    AnonymousClass3W1 BQr = A0A().A0K().BQr(A023);
                                    AnonymousClass3DY r6 = AnonymousClass3DY.END_OF_FEED;
                                    C233002un r0 = r10.A03;
                                    if (r0 != null && r0.A09(A023, BQr, r6, num)) {
                                        if (182.A06(0Tu.A05, r10.A01, 36312887639082432L)) {
                                            r10.A01(A023, BQr, r6, Integer.valueOf(intValue2));
                                        }
                                    }
                                } else if (182.A06(r9, getSession(), 36312887639082432L)) {
                                    A0A().A0Z().A0B(A023, Long.valueOf(j), Long.valueOf((long) ((intValue - intValue2) - 1)), "eof", "min_num_items_not_consumed_before_seed_ad_in_session");
                                }
                            }
                        }
                    }
                }
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1407331619);
            }
        }
    }

    public final boolean CbJ() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: androidx.compose.ui.platform.ComposeView} */
    /* JADX WARNING: type inference failed for: r13v5, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x042e, code lost:
        if (X.AnonymousClass05K.A01 != X.C229092mp.A00(r10)) goto L_0x0430;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x057d, code lost:
        if (r4.A01 != 1) goto L_0x057f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02e2, code lost:
        r9.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02e5, code lost:
        r4.A01++;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r39) {
        /*
            r38 = this;
            r7 = 0
            r6 = r39
            X.0qQ.A0B(r6, r7)
            r1 = r38
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L_0x077d
            X.2kj r0 = r1.A0A()
            X.3JG r5 = r0.A0m()
            int r20 = r1.A00()
            int r19 = r1.A00()
            boolean r21 = r1.Cda()
            X.3E3 r0 = r1.A0W
            r18 = r0
            r16 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0034
            r1 = -1100346720(0xffffffffbe6a0aa0, float:-0.22855616)
            java.lang.String r0 = "MainFeedActionBarDelegate:configureActionBar"
            X.0fS.A01(r0, r1)
        L_0x0034:
            X.2kC r0 = r5.A0B     // Catch:{ all -> 0x076f }
            X.2jw r0 = r0.A00     // Catch:{ all -> 0x076f }
            r37 = r0
            java.lang.String r1 = "null cannot be cast to non-null type instagram.features.feed.mainfeed.fragment.MainFeedFragment"
            X.0qQ.A0C(r0, r1)     // Catch:{ all -> 0x076f }
            r6.ErT(r0)     // Catch:{ all -> 0x076f }
            X.3Dv r1 = r5.A01     // Catch:{ all -> 0x076f }
            X.3jo r0 = r1.A01     // Catch:{ all -> 0x076f }
            X.2dZ r2 = r0.AYJ()     // Catch:{ all -> 0x076f }
            if (r2 == 0) goto L_0x0055
            boolean r1 = r1.A00     // Catch:{ all -> 0x076f }
            r0 = 0
            if (r1 == 0) goto L_0x0052
            r0 = 1
        L_0x0052:
            r2.A0Y(r0)     // Catch:{ all -> 0x076f }
        L_0x0055:
            X.35N r4 = r5.A05     // Catch:{ all -> 0x076f }
            X.4DU r1 = X.AnonymousClass2kO.A00     // Catch:{ all -> 0x076f }
            X.354 r2 = r5.A0D     // Catch:{ all -> 0x076f }
            X.2oA r9 = r5.A07     // Catch:{ all -> 0x076f }
            X.0wc r8 = r5.A03     // Catch:{ all -> 0x076f }
            r3 = 1
            X.3JI r26 = new X.3JI     // Catch:{ all -> 0x076f }
            r0 = r26
            r0.<init>(r8, r9, r2)     // Catch:{ all -> 0x076f }
            com.instagram.common.session.UserSession r0 = r2.A01     // Catch:{ all -> 0x076f }
            boolean r0 = X.2R8.A00(r0)     // Catch:{ all -> 0x076f }
            if (r0 != 0) goto L_0x0072
            r27 = 0
            goto L_0x0079
        L_0x0072:
            X.FPS r27 = new X.FPS     // Catch:{ all -> 0x076f }
            r0 = r27
            r0.<init>(r2)     // Catch:{ all -> 0x076f }
        L_0x0079:
            X.3JJ r36 = new X.3JJ     // Catch:{ all -> 0x076f }
            r0 = r36
            r0.<init>(r2)     // Catch:{ all -> 0x076f }
            X.3JK r35 = new X.3JK     // Catch:{ all -> 0x076f }
            r0 = r35
            r0.<init>(r2)     // Catch:{ all -> 0x076f }
            X.3JL r11 = new X.3JL     // Catch:{ all -> 0x076f }
            r11.<init>(r2)     // Catch:{ all -> 0x076f }
            X.3JM r10 = new X.3JM     // Catch:{ all -> 0x076f }
            r10.<init>(r2)     // Catch:{ all -> 0x076f }
            X.3JN r34 = new X.3JN     // Catch:{ all -> 0x076f }
            r0 = r34
            r0.<init>(r2)     // Catch:{ all -> 0x076f }
            X.3JO r12 = new X.3JO     // Catch:{ all -> 0x076f }
            r12.<init>(r2)     // Catch:{ all -> 0x076f }
            X.3JP r8 = new X.3JP     // Catch:{ all -> 0x076f }
            r8.<init>(r2)     // Catch:{ all -> 0x076f }
            X.3JQ r33 = new X.3JQ     // Catch:{ all -> 0x076f }
            r0 = r33
            r0.<init>(r2)     // Catch:{ all -> 0x076f }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x076f }
            if (r0 == 0) goto L_0x00b7
            r2 = 1028008145(0x3d4628d1, float:0.04837877)
            java.lang.String r0 = "configureMainFeedActionBar"
            X.0fS.A01(r0, r2)     // Catch:{ all -> 0x076f }
        L_0x00b7:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0761 }
            r9.<init>()     // Catch:{ all -> 0x0761 }
            r4.A01 = r7     // Catch:{ all -> 0x0761 }
            r4.A00 = r7     // Catch:{ all -> 0x0761 }
            r4.A07 = r6     // Catch:{ all -> 0x0761 }
            androidx.fragment.app.FragmentActivity r2 = r4.A0B     // Catch:{ all -> 0x0761 }
            java.lang.Integer r0 = X.2Y9.A00(r2)     // Catch:{ all -> 0x0761 }
            boolean r0 = X.2Y9.A02(r0)     // Catch:{ all -> 0x0761 }
            if (r0 == 0) goto L_0x010c
            r1 = 2131623991(0x7f0e0037, float:1.887515E38)
            com.instagram.common.session.UserSession r0 = r4.A0E     // Catch:{ all -> 0x0761 }
            android.view.View r1 = r6.ETj(r0, r1, r7, r7)     // Catch:{ all -> 0x0761 }
            r0 = 2131427554(0x7f0b00e2, float:1.8476728E38)
            android.view.View r0 = r1.requireViewById(r0)     // Catch:{ all -> 0x0761 }
            X.AnonymousClass0fU.A00(r12, r0)     // Catch:{ all -> 0x0761 }
            r0 = 2131427553(0x7f0b00e1, float:1.8476725E38)
            android.view.View r0 = r1.requireViewById(r0)     // Catch:{ all -> 0x0761 }
            X.AnonymousClass0fU.A00(r8, r0)     // Catch:{ all -> 0x0761 }
        L_0x00eb:
            boolean r0 = r4.A0L     // Catch:{ all -> 0x0761 }
            if (r0 == 0) goto L_0x00f9
            X.2ff r1 = X.C226112fe.A0B     // Catch:{ all -> 0x0761 }
            X.M00 r0 = new X.M00     // Catch:{ all -> 0x0761 }
            r0.<init>(r2)     // Catch:{ all -> 0x0761 }
            r1.A04(r2, r0, r3)     // Catch:{ all -> 0x0761 }
        L_0x00f9:
            X.AnonymousClass35N.A04(r4)     // Catch:{ all -> 0x0761 }
            X.2oA r2 = r4.A0I     // Catch:{ all -> 0x0761 }
            boolean r0 = r2.A00     // Catch:{ all -> 0x0761 }
            if (r0 != 0) goto L_0x05c2
            java.lang.Integer r1 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0761 }
            X.2o1 r0 = r2.A04     // Catch:{ all -> 0x0761 }
            java.lang.Integer r0 = r0.A01     // Catch:{ all -> 0x0761 }
            if (r1 != r0) goto L_0x05c2
            goto L_0x05c5
        L_0x010c:
            com.instagram.common.session.UserSession r8 = r4.A0E     // Catch:{ all -> 0x0761 }
            java.lang.Boolean r0 = X.AnonymousClass2b9.A00(r8)     // Catch:{ all -> 0x0761 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0761 }
            if (r0 == 0) goto L_0x0300
            r32 = 2
        L_0x011a:
            r0 = r32
            java.lang.String r0 = X.2bA.A00(r8, r0)     // Catch:{ all -> 0x0761 }
            if (r0 == 0) goto L_0x02f7
            int r1 = r0.length()     // Catch:{ all -> 0x0761 }
            if (r1 == 0) goto L_0x02f7
            int r1 = r0.hashCode()     // Catch:{ all -> 0x0761 }
            switch(r1) {
                case -1756340165: goto L_0x013c;
                case -1331586071: goto L_0x019d;
                case -1309148525: goto L_0x01ac;
                case 3347807: goto L_0x01b9;
                case 3377875: goto L_0x01e5;
                case 109400031: goto L_0x01f2;
                case 955310242: goto L_0x0201;
                default: goto L_0x012f;
            }     // Catch:{ all -> 0x0761 }
        L_0x012f:
            java.lang.String r1 = "Failed to parse headericon: "
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x0761 }
            java.lang.String r0 = "Nav3"
            X.0wb.A03(r0, r1)     // Catch:{ all -> 0x0761 }
            goto L_0x02f7
        L_0x013c:
            java.lang.String r11 = "friend_map"
            boolean r1 = r0.equals(r11)     // Catch:{ all -> 0x0761 }
            if (r1 == 0) goto L_0x012f
            java.lang.Boolean r0 = X.AnonymousClass2b9.A00(r8)     // Catch:{ all -> 0x0761 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0761 }
            if (r0 == 0) goto L_0x02f7
            boolean r0 = X.2bA.A08(r8, r11)     // Catch:{ all -> 0x0761 }
            if (r0 == 0) goto L_0x02f7
            r0 = 2131238503(0x7f081e67, float:1.8093287E38)
            X.3JS r10 = new X.3JS     // Catch:{ all -> 0x0761 }
            r10.<init>(r2, r0)     // Catch:{ all -> 0x0761 }
            X.3JR r1 = new X.3JR     // Catch:{ all -> 0x0761 }
            r1.<init>()     // Catch:{ all -> 0x0761 }
            r0 = 2131962692(0x7f132b44, float:1.9562116E38)
            r1.A05 = r0     // Catch:{ all -> 0x0761 }
            r0 = r33
            r1.A0G = r0     // Catch:{ all -> 0x0761 }
            r1.A0N = r3     // Catch:{ all -> 0x0761 }
            r1.A0F = r10     // Catch:{ all -> 0x0761 }
            X.3Jb r0 = new X.3Jb     // Catch:{ all -> 0x0761 }
            r0.<init>(r1)     // Catch:{ all -> 0x0761 }
            android.view.View r1 = r6.AA3(r0)     // Catch:{ all -> 0x0761 }
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.ImageView"
            X.0qQ.A0C(r1, r0)     // Catch:{ all -> 0x0761 }
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{ all -> 0x0761 }
            X.AnonymousClass3HE.A00()     // Catch:{ all -> 0x0761 }
            r0 = 29
            X.MPB r14 = new X.MPB     // Catch:{ all -> 0x0761 }
            r14.<init>((int) r0, (java.lang.Object) r2, (java.lang.Object) r1)     // Catch:{ all -> 0x0761 }
            com.instagram.friendmap.data.FriendMapRepository r13 = X.AnonymousClass4A3.A00(r8)     // Catch:{ all -> 0x0761 }
            X.4Cq r12 = r13.A01     // Catch:{ all -> 0x0761 }
            r10 = 0
            r1 = 47
            X.MHF r0 = new X.MHF     // Catch:{ all -> 0x0761 }
            r0.<init>(r14, r13, r10, r1)     // Catch:{ all -> 0x0761 }
            X.19B r1 = X.19B.A00     // Catch:{ all -> 0x0761 }
            X.1Eo.A05(r1, r0, r12)     // Catch:{ all -> 0x0761 }
            goto L_0x02e2
        L_0x019d:
            java.lang.String r1 = "direct"
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x0761 }
            if (r1 == 0) goto L_0x012f
            r0 = r35
            X.AnonymousClass35N.A00(r0, r6, r4, r9)     // Catch:{ all -> 0x0761 }
            goto L_0x02f7
        L_0x01ac:
            java.lang.String r1 = "explore"
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x0761 }
            if (r1 == 0) goto L_0x012f
            X.AnonymousClass35N.A02(r6, r4, r9)     // Catch:{ all -> 0x0761 }
            goto L_0x02f7
        L_0x01b9:
            java.lang.String r1 = "menu"
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x0761 }
            if (r1 == 0) goto L_0x012f
            X.3JR r1 = new X.3JR     // Catch:{ all -> 0x0761 }
            r1.<init>()     // Catch:{ all -> 0x0761 }
            r0 = 2131966173(0x7f1338dd, float:1.9569177E38)
            r1.A05 = r0     // Catch:{ all -> 0x0761 }
            r0 = r34
            r1.A0G = r0     // Catch:{ all -> 0x0761 }
            r1.A0N = r3     // Catch:{ all -> 0x0761 }
            r0 = 2131238541(0x7f081e8d, float:1.8093364E38)
            r1.A06 = r0     // Catch:{ all -> 0x0761 }
            X.3Jb r0 = new X.3Jb     // Catch:{ all -> 0x0761 }
            r0.<init>(r1)     // Catch:{ all -> 0x0761 }
            r6.AA3(r0)     // Catch:{ all -> 0x0761 }
            java.lang.String r0 = "main_overflow"
            r9.add(r0)     // Catch:{ all -> 0x0761 }
            goto L_0x02e5
        L_0x01e5:
            java.lang.String r1 = "news"
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x0761 }
            if (r1 == 0) goto L_0x012f
            X.AnonymousClass35N.A03(r6, r4, r9)     // Catch:{ all -> 0x0761 }
            goto L_0x02f7
        L_0x01f2:
            java.lang.String r1 = "share"
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x0761 }
            if (r1 == 0) goto L_0x012f
            r0 = r36
            X.AnonymousClass35N.A01(r0, r6, r4, r9)     // Catch:{ all -> 0x0761 }
            goto L_0x02f7
        L_0x0201:
            java.lang.String r11 = "meta_ai"
            boolean r1 = r0.equals(r11)     // Catch:{ all -> 0x0761 }
            if (r1 == 0) goto L_0x012f
            X.FLQ r31 = new X.FLQ     // Catch:{ all -> 0x0761 }
            r0 = r31
            r0.<init>(r4)     // Catch:{ all -> 0x0761 }
            java.lang.Boolean r0 = X.C249093j7.A00(r8)     // Catch:{ all -> 0x0761 }
            boolean r12 = r0.booleanValue()     // Catch:{ all -> 0x0761 }
            java.lang.Boolean r0 = X.C249093j7.A00(r8)     // Catch:{ all -> 0x0761 }
            boolean r30 = r0.booleanValue()     // Catch:{ all -> 0x0761 }
            java.lang.Boolean r0 = X.C249093j7.A00(r8)     // Catch:{ all -> 0x0761 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0761 }
            r14 = 0
            if (r0 == 0) goto L_0x022c
            r14 = -1
        L_0x022c:
            r28 = 1500(0x5dc, double:7.41E-321)
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r2)     // Catch:{ all -> 0x0761 }
            r1 = 2131627847(0x7f0e0f47, float:1.888297E38)
            r0 = r6
            X.2dZ r0 = (X.2dZ) r0     // Catch:{ all -> 0x0761 }
            android.view.ViewGroup r0 = r0.A0O     // Catch:{ all -> 0x0761 }
            android.view.View r25 = r10.inflate(r1, r0, r7)     // Catch:{ all -> 0x0761 }
            r1 = 2131436277(0x7f0b22f5, float:1.849442E38)
            r0 = r25
            android.view.View r10 = r0.requireViewById(r1)     // Catch:{ all -> 0x0761 }
            X.0qQ.A07(r10)     // Catch:{ all -> 0x0761 }
            android.widget.ImageView r10 = (android.widget.ImageView) r10     // Catch:{ all -> 0x0761 }
            X.0rm r13 = new X.0rm     // Catch:{ all -> 0x0761 }
            r13.<init>()     // Catch:{ all -> 0x0761 }
            if (r12 == 0) goto L_0x02be
            if (r30 != 0) goto L_0x0257
            if (r14 == 0) goto L_0x02be
        L_0x0257:
            android.content.res.Resources r1 = r2.getResources()     // Catch:{ all -> 0x0761 }
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            int r12 = r1.getDimensionPixelSize(r0)     // Catch:{ all -> 0x0761 }
            X.0Tu r24 = X.0Tu.A05     // Catch:{ all -> 0x0761 }
            r22 = 36330088974926274(0x811206000241c2, double:3.038632785045108E-306)
            r0 = r22
            r15 = r24
            boolean r1 = X.182.A06(r15, r8, r0)     // Catch:{ all -> 0x0761 }
            r0 = 2131886152(0x7f120048, float:1.9406875E38)
            if (r1 == 0) goto L_0x0279
            r0 = 2131886123(0x7f12002b, float:1.9406816E38)
        L_0x0279:
            X.61R r15 = X.C303756Aq.A00(r2, r0)     // Catch:{ all -> 0x0761 }
            if (r15 == 0) goto L_0x0282
            r15.setBounds(r7, r7, r12, r12)     // Catch:{ all -> 0x0761 }
        L_0x0282:
            if (r30 <= 0) goto L_0x0295
            r0 = r22
            r14 = r24
            boolean r1 = X.182.A06(r14, r8, r0)     // Catch:{ all -> 0x0761 }
            r0 = 2131886151(0x7f120047, float:1.9406873E38)
            if (r1 == 0) goto L_0x02a8
            r0 = 2131886122(0x7f12002a, float:1.9406814E38)
            goto L_0x02a8
        L_0x0295:
            if (r15 == 0) goto L_0x02be
            r0 = -1
            if (r14 != r0) goto L_0x029b
            goto L_0x029f
        L_0x029b:
            r15.EFJ(r14)     // Catch:{ all -> 0x0761 }
            goto L_0x02a2
        L_0x029f:
            r15.EFK()     // Catch:{ all -> 0x0761 }
        L_0x02a2:
            r10.setImageDrawable(r15)     // Catch:{ all -> 0x0761 }
            r13.A00 = r15     // Catch:{ all -> 0x0761 }
            goto L_0x02be
        L_0x02a8:
            X.61R r0 = X.C303756Aq.A00(r2, r0)     // Catch:{ all -> 0x0761 }
            if (r0 == 0) goto L_0x02be
            r0.setBounds(r7, r7, r12, r12)     // Catch:{ all -> 0x0761 }
            X.OeU r1 = new X.OeU     // Catch:{ all -> 0x0761 }
            r1.<init>(r10, r15)     // Catch:{ all -> 0x0761 }
            r0.A8s(r1)     // Catch:{ all -> 0x0761 }
            r10.setImageDrawable(r0)     // Catch:{ all -> 0x0761 }
            r13.A00 = r0     // Catch:{ all -> 0x0761 }
        L_0x02be:
            java.lang.Object r0 = r13.A00     // Catch:{ all -> 0x0761 }
            if (r0 != 0) goto L_0x02ec
            r0 = 2131238406(0x7f081e06, float:1.809309E38)
            r10.setImageResource(r0)     // Catch:{ all -> 0x0761 }
        L_0x02c8:
            X.3JR r1 = new X.3JR     // Catch:{ all -> 0x0761 }
            r1.<init>()     // Catch:{ all -> 0x0761 }
            r0 = r25
            r1.A0I = r0     // Catch:{ all -> 0x0761 }
            r0 = 2131952555(0x7f1303ab, float:1.9541556E38)
            r1.A05 = r0     // Catch:{ all -> 0x0761 }
            r0 = r31
            r1.A0G = r0     // Catch:{ all -> 0x0761 }
            X.3Jb r0 = new X.3Jb     // Catch:{ all -> 0x0761 }
            r0.<init>(r1)     // Catch:{ all -> 0x0761 }
            r6.AA4(r0)     // Catch:{ all -> 0x0761 }
        L_0x02e2:
            r9.add(r11)     // Catch:{ all -> 0x0761 }
        L_0x02e5:
            int r0 = r4.A01     // Catch:{ all -> 0x0761 }
            int r0 = r0 + 1
            r4.A01 = r0     // Catch:{ all -> 0x0761 }
            goto L_0x02f7
        L_0x02ec:
            X.PWg r12 = new X.PWg     // Catch:{ all -> 0x0761 }
            r12.<init>(r13)     // Catch:{ all -> 0x0761 }
            r0 = r28
            r10.postDelayed(r12, r0)     // Catch:{ all -> 0x0761 }
            goto L_0x02c8
        L_0x02f7:
            int r32 = r32 + -1
            r1 = -1
            r0 = r32
            if (r1 >= r0) goto L_0x03b6
            goto L_0x011a
        L_0x0300:
            r0 = r35
            X.AnonymousClass35N.A00(r0, r6, r4, r9)     // Catch:{ all -> 0x0761 }
            boolean r0 = r4.A0M     // Catch:{ all -> 0x0761 }
            if (r0 == 0) goto L_0x03ab
            java.util.Map r0 = X.2aC.A0V     // Catch:{ all -> 0x0761 }
            int r0 = r4.A03     // Catch:{ all -> 0x0761 }
            boolean r14 = X.C48984EnM.A00(r8, r0)     // Catch:{ all -> 0x0761 }
            X.0BQ r0 = X.AnonymousClass0BO.A00(r8)     // Catch:{ all -> 0x0761 }
            boolean r0 = r0.CKD()     // Catch:{ all -> 0x0761 }
            if (r0 == 0) goto L_0x0347
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r2)     // Catch:{ all -> 0x0761 }
            r12 = 2131628317(0x7f0e111d, float:1.8883923E38)
            r0 = r6
            X.2dZ r0 = (X.2dZ) r0     // Catch:{ all -> 0x0761 }
            android.view.ViewGroup r0 = r0.A0O     // Catch:{ all -> 0x0761 }
            android.view.View r12 = r13.inflate(r12, r0, r7)     // Catch:{ all -> 0x0761 }
            r0 = 2131428382(0x7f0b041e, float:1.8478407E38)
            android.view.View r13 = r12.requireViewById(r0)     // Catch:{ all -> 0x0761 }
            X.0qQ.A07(r13)     // Catch:{ all -> 0x0761 }
            com.instagram.common.ui.widget.imageview.IgImageView r13 = (com.instagram.common.ui.widget.imageview.IgImageView) r13     // Catch:{ all -> 0x0761 }
            X.0eE r0 = X.AnonymousClass0t1.A01     // Catch:{ all -> 0x0761 }
            com.instagram.user.model.User r0 = r0.A01(r8)     // Catch:{ all -> 0x0761 }
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()     // Catch:{ all -> 0x0761 }
            r13.setUrl(r0, r1)     // Catch:{ all -> 0x0761 }
            if (r14 > 0) goto L_0x037b
            goto L_0x0375
        L_0x0347:
            r0 = 2131238943(0x7f08201f, float:1.8094179E38)
            X.3JS r12 = new X.3JS     // Catch:{ all -> 0x0761 }
            r12.<init>(r2, r0)     // Catch:{ all -> 0x0761 }
            if (r14 <= 0) goto L_0x0357
            r0 = 2130970239(0x7f04067f, float:1.7549183E38)
            r12.A02(r0, r3)     // Catch:{ all -> 0x0761 }
        L_0x0357:
            X.3JR r1 = new X.3JR     // Catch:{ all -> 0x0761 }
            r1.<init>()     // Catch:{ all -> 0x0761 }
            r1.A0F = r12     // Catch:{ all -> 0x0761 }
            r0 = 2131969940(0x7f134794, float:1.9576817E38)
            r1.A05 = r0     // Catch:{ all -> 0x0761 }
            r1.A0G = r11     // Catch:{ all -> 0x0761 }
            r1.A0H = r10     // Catch:{ all -> 0x0761 }
            r1.A0P = r3     // Catch:{ all -> 0x0761 }
            r1.A0N = r3     // Catch:{ all -> 0x0761 }
            X.3Jb r0 = new X.3Jb     // Catch:{ all -> 0x0761 }
            r0.<init>(r1)     // Catch:{ all -> 0x0761 }
            android.view.View r0 = r6.AA3(r0)     // Catch:{ all -> 0x0761 }
            goto L_0x039e
        L_0x0375:
            boolean r0 = X.AnonymousClass3H7.A02(r8)     // Catch:{ all -> 0x0761 }
            if (r0 == 0) goto L_0x0385
        L_0x037b:
            r0 = 2131437123(0x7f0b2643, float:1.8496136E38)
            android.view.View r0 = r12.requireViewById(r0)     // Catch:{ all -> 0x0761 }
            r0.setVisibility(r7)     // Catch:{ all -> 0x0761 }
        L_0x0385:
            X.3JR r1 = new X.3JR     // Catch:{ all -> 0x0761 }
            r1.<init>()     // Catch:{ all -> 0x0761 }
            r1.A0I = r12     // Catch:{ all -> 0x0761 }
            r0 = 2131969940(0x7f134794, float:1.9576817E38)
            r1.A05 = r0     // Catch:{ all -> 0x0761 }
            r1.A0G = r11     // Catch:{ all -> 0x0761 }
            r1.A0H = r10     // Catch:{ all -> 0x0761 }
            X.3Jb r0 = new X.3Jb     // Catch:{ all -> 0x0761 }
            r0.<init>(r1)     // Catch:{ all -> 0x0761 }
            android.view.View r0 = r6.AA4(r0)     // Catch:{ all -> 0x0761 }
        L_0x039e:
            r4.A06 = r0     // Catch:{ all -> 0x0761 }
            java.lang.String r0 = "main_profile"
            r9.add(r0)     // Catch:{ all -> 0x0761 }
            int r0 = r4.A01     // Catch:{ all -> 0x0761 }
            int r0 = r0 + 1
            r4.A01 = r0     // Catch:{ all -> 0x0761 }
        L_0x03ab:
            X.AnonymousClass35N.A03(r6, r4, r9)     // Catch:{ all -> 0x0761 }
            X.AnonymousClass35N.A02(r6, r4, r9)     // Catch:{ all -> 0x0761 }
            r0 = r36
            X.AnonymousClass35N.A01(r0, r6, r4, r9)     // Catch:{ all -> 0x0761 }
        L_0x03b6:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x0761 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03df
            X.4DU r0 = r4.A0F     // Catch:{ all -> 0x0761 }
            X.0wc r10 = X.AnonymousClass0kN.A01(r0, r8)     // Catch:{ all -> 0x0761 }
            java.lang.String r1 = "ig_navigation_tab_impression"
            X.0kJ r0 = r10.A00     // Catch:{ all -> 0x0761 }
            X.0Aj r10 = r10.A00(r0, r1)     // Catch:{ all -> 0x0761 }
            X.0qv r0 = X.0qv.A02     // Catch:{ all -> 0x0761 }
            java.lang.String r1 = r0.A05(r2)     // Catch:{ all -> 0x0761 }
            java.lang.String r0 = "app_device_id"
            r10.AAJ(r0, r1)     // Catch:{ all -> 0x0761 }
            java.lang.String r0 = "headers"
            r10.AAe(r0, r9)     // Catch:{ all -> 0x0761 }
            r10.Cgf()     // Catch:{ all -> 0x0761 }
        L_0x03df:
            int r0 = r4.A00     // Catch:{ all -> 0x0761 }
            if (r0 != r3) goto L_0x0404
            int r0 = r4.A01     // Catch:{ all -> 0x0761 }
            if (r0 != r3) goto L_0x0404
            android.content.Context r1 = X.C60960kU.A00     // Catch:{ all -> 0x0761 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0761 }
            r0 = 12
            float r0 = X.0nA.A04(r1, r0)     // Catch:{ all -> 0x0761 }
            int r0 = (int) r0     // Catch:{ all -> 0x0761 }
        L_0x03f3:
            r4.A04 = r0     // Catch:{ all -> 0x0761 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x0761 }
            if (r0 == 0) goto L_0x0411
            r1 = -1411643532(0xffffffffabdc0774, float:-1.5634009E-12)
            java.lang.String r0 = "configureMainFeedActionBarTitleView"
            X.0fS.A01(r0, r1)     // Catch:{ all -> 0x0761 }
            goto L_0x0411
        L_0x0404:
            android.content.Context r1 = X.C60960kU.A00     // Catch:{ all -> 0x0761 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0761 }
            r0 = 16
            float r0 = X.0nA.A04(r1, r0)     // Catch:{ all -> 0x0761 }
            int r0 = (int) r0     // Catch:{ all -> 0x0761 }
            goto L_0x03f3
        L_0x0411:
            X.0Tu r9 = X.0Tu.A06     // Catch:{ all -> 0x0753 }
            r0 = 36876838312935543(0x83034a00150077, double:3.384399267985042E-306)
            java.lang.String r10 = X.182.A04(r9, r8, r0)     // Catch:{ all -> 0x0753 }
            r0 = 36313888359647511(0x81034a00170917, double:3.0283874507081765E-306)
            boolean r0 = X.182.A06(r9, r8, r0)     // Catch:{ all -> 0x0753 }
            if (r0 == 0) goto L_0x0430
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0753 }
            java.lang.Integer r0 = X.C229092mp.A00(r10)     // Catch:{ all -> 0x0753 }
            r9 = 1
            if (r1 == r0) goto L_0x0431
        L_0x0430:
            r9 = 0
        L_0x0431:
            X.0Tu r10 = X.0Tu.A05     // Catch:{ all -> 0x0753 }
            r0 = 36324694496194812(0x810d1e000530fc, double:3.035221294973509E-306)
            boolean r11 = X.182.A06(r10, r8, r0)     // Catch:{ all -> 0x0753 }
            r0 = 36331106882044829(0x8112f30000439d, double:3.039276513605665E-306)
            boolean r14 = X.182.A06(r10, r8, r0)     // Catch:{ all -> 0x0753 }
            r0 = 36318999369751342(0x8107f000081b2e, double:3.031619674078225E-306)
            boolean r36 = X.182.A06(r10, r8, r0)     // Catch:{ all -> 0x0753 }
            java.lang.String r1 = "setupTitleView:"
            if (r14 == 0) goto L_0x0465
            java.lang.String r0 = "compose"
        L_0x0454:
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x0753 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x0753 }
            if (r0 == 0) goto L_0x0468
            r0 = 1657558623(0x62cc565f, float:1.8846797E21)
            X.0fS.A01(r1, r0)     // Catch:{ all -> 0x0753 }
            goto L_0x0468
        L_0x0465:
            java.lang.String r0 = "xml"
            goto L_0x0454
        L_0x0468:
            if (r14 == 0) goto L_0x04bc
            r0 = 43
            X.Wvs r1 = new X.Wvs     // Catch:{ all -> 0x0745 }
            r1.<init>(r8, r0)     // Catch:{ all -> 0x0745 }
            java.lang.Class<X.HkV> r0 = X.C55610HkV.class
            java.lang.Object r13 = r8.A01(r0, r1)     // Catch:{ all -> 0x0745 }
            X.HkV r13 = (X.C55610HkV) r13     // Catch:{ all -> 0x0745 }
            X.4DU r12 = r4.A0F     // Catch:{ all -> 0x0745 }
            X.2oA r0 = r4.A0I     // Catch:{ all -> 0x0745 }
            boolean r11 = r0.A00     // Catch:{ all -> 0x0745 }
            X.0eM r0 = r4.A0K     // Catch:{ all -> 0x0745 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0745 }
            X.2mn r0 = (X.C229072mn) r0     // Catch:{ all -> 0x0745 }
            long r0 = r0.A01     // Catch:{ all -> 0x0745 }
            r8 = 2131962337(0x7f1329e1, float:1.9561396E38)
            java.lang.String r32 = r2.getString(r8)     // Catch:{ all -> 0x0745 }
            X.0qQ.A07(r32)     // Catch:{ all -> 0x0745 }
            r10 = 0
            androidx.compose.ui.platform.ComposeView r8 = new androidx.compose.ui.platform.ComposeView     // Catch:{ all -> 0x0745 }
            r8.<init>(r2, r10, r7)     // Catch:{ all -> 0x0745 }
            X.J8o r10 = new X.J8o     // Catch:{ all -> 0x0745 }
            r28 = r10
            r29 = r8
            r30 = r13
            r31 = r12
            r33 = r0
            r35 = r11
            r28.<init>(r29, r30, r31, r32, r33, r35, r36)     // Catch:{ all -> 0x0745 }
            r0 = 1774585118(0x69c6051e, float:2.9923935E25)
            X.5PJ r0 = X.AnonymousClass5PI.A04(r10, r0, r3)     // Catch:{ all -> 0x0745 }
            r8.setContent(r0)     // Catch:{ all -> 0x0745 }
            r13.A00 = r7     // Catch:{ all -> 0x0745 }
            int r0 = r4.A04     // Catch:{ all -> 0x0745 }
            r6.ETi(r8, r0, r7, r7)     // Catch:{ all -> 0x0745 }
            goto L_0x04d0
        L_0x04bc:
            if (r9 == 0) goto L_0x04c7
            r1 = 2131624002(0x7f0e0042, float:1.8875171E38)
            if (r11 == 0) goto L_0x04ca
            r1 = 2131627544(0x7f0e0e18, float:1.8882355E38)
            goto L_0x04ca
        L_0x04c7:
            r1 = 2131623997(0x7f0e003d, float:1.8875161E38)
        L_0x04ca:
            int r0 = r4.A04     // Catch:{ all -> 0x0745 }
            android.view.View r8 = r6.ETj(r8, r1, r0, r7)     // Catch:{ all -> 0x0745 }
        L_0x04d0:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x0753 }
            if (r0 == 0) goto L_0x04dc
            r0 = -858954145(0xffffffffcccd665f, float:-1.07688696E8)
            X.0fS.A00(r0)     // Catch:{ all -> 0x0753 }
        L_0x04dc:
            if (r9 == 0) goto L_0x055a
            if (r14 != 0) goto L_0x054d
            java.lang.String r1 = "setupViewSwitcher"
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x0753 }
            if (r0 == 0) goto L_0x04ee
            r0 = -1087679197(0xffffffffbf2b5523, float:-0.66926783)
            X.0fS.A01(r1, r0)     // Catch:{ all -> 0x0753 }
        L_0x04ee:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.actionbar.ActionBarTitleViewSwitcher"
            X.0qQ.A0C(r8, r0)     // Catch:{ all -> 0x073a }
            r0 = r8
            com.instagram.actionbar.ActionBarTitleViewSwitcher r0 = (com.instagram.actionbar.ActionBarTitleViewSwitcher) r0     // Catch:{ all -> 0x073a }
            r4.A08 = r0     // Catch:{ all -> 0x073a }
            X.0eM r0 = r4.A0K     // Catch:{ all -> 0x073a }
            java.lang.Object r11 = r0.getValue()     // Catch:{ all -> 0x073a }
            X.2mn r11 = (X.C229072mn) r11     // Catch:{ all -> 0x073a }
            com.instagram.actionbar.ActionBarTitleViewSwitcher r1 = r4.A08     // Catch:{ all -> 0x073a }
            if (r1 == 0) goto L_0x0541
            if (r11 == 0) goto L_0x0541
            if (r36 == 0) goto L_0x0541
            boolean r0 = r11.A00     // Catch:{ all -> 0x073a }
            if (r0 == 0) goto L_0x052c
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x073a }
            if (r0 == 0) goto L_0x051a
            r7 = 628157478(0x2570ec26, float:2.0896692E-16)
            java.lang.String r0 = "ActionBarTitleViewSwitcher:showSecondaryTitle:immediate"
            X.0fS.A01(r0, r7)     // Catch:{ all -> 0x073a }
        L_0x051a:
            java.lang.String r0 = r11.A02     // Catch:{ all -> 0x072c }
            r1.A04(r3, r3, r0)     // Catch:{ all -> 0x072c }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x073a }
            if (r0 == 0) goto L_0x0541
            r0 = 1637987089(0x61a1b311, float:3.728536E20)
            X.0fS.A00(r0)     // Catch:{ all -> 0x073a }
            goto L_0x0541
        L_0x052c:
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x073a }
            android.os.Handler r10 = new android.os.Handler     // Catch:{ all -> 0x073a }
            r10.<init>(r0)     // Catch:{ all -> 0x073a }
            X.4id r7 = new X.4id     // Catch:{ all -> 0x073a }
            r7.<init>(r1, r11)     // Catch:{ all -> 0x073a }
            long r0 = r11.A01     // Catch:{ all -> 0x073a }
            r10.postDelayed(r7, r0)     // Catch:{ all -> 0x073a }
            r11.A00 = r3     // Catch:{ all -> 0x073a }
        L_0x0541:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x0753 }
            if (r0 == 0) goto L_0x054d
            r0 = 1600850799(0x5f6b0b6f, float:1.6936753E19)
            X.0fS.A00(r0)     // Catch:{ all -> 0x0753 }
        L_0x054d:
            android.content.Context r1 = X.C60960kU.A00     // Catch:{ all -> 0x0753 }
            r0 = 2131964369(0x7f1331d1, float:1.9565518E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0753 }
            r8.setContentDescription(r0)     // Catch:{ all -> 0x0753 }
            goto L_0x056a
        L_0x055a:
            android.content.Context r0 = X.C60960kU.A00     // Catch:{ all -> 0x0753 }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ all -> 0x0753 }
            r0 = 2131972795(0x7f1352bb, float:1.9582608E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0753 }
            r8.setContentDescription(r0)     // Catch:{ all -> 0x0753 }
        L_0x056a:
            android.view.ViewGroup$LayoutParams r7 = r8.getLayoutParams()     // Catch:{ all -> 0x0753 }
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            X.0qQ.A0C(r7, r0)     // Catch:{ all -> 0x0753 }
            android.widget.FrameLayout$LayoutParams r7 = (android.widget.FrameLayout.LayoutParams) r7     // Catch:{ all -> 0x0753 }
            int r0 = r4.A00     // Catch:{ all -> 0x0753 }
            if (r0 != r3) goto L_0x057f
            int r1 = r4.A01     // Catch:{ all -> 0x0753 }
            r0 = 81
            if (r1 == r3) goto L_0x0582
        L_0x057f:
            r0 = 8388691(0x800053, float:1.175506E-38)
        L_0x0582:
            r7.gravity = r0     // Catch:{ all -> 0x0753 }
            r8.setLayoutParams(r7)     // Catch:{ all -> 0x0753 }
            r0 = 8
            float r0 = X.0nA.A04(r2, r0)     // Catch:{ all -> 0x0753 }
            int r11 = (int) r0     // Catch:{ all -> 0x0753 }
            int r10 = r8.getPaddingLeft()     // Catch:{ all -> 0x0753 }
            int r7 = r8.getPaddingTop()     // Catch:{ all -> 0x0753 }
            int r1 = r8.getPaddingRight()     // Catch:{ all -> 0x0753 }
            int r0 = r8.getPaddingBottom()     // Catch:{ all -> 0x0753 }
            int r0 = r0 + r11
            r8.setPadding(r10, r7, r1, r0)     // Catch:{ all -> 0x0753 }
            r0 = r26
            X.AnonymousClass0fU.A00(r0, r8)     // Catch:{ all -> 0x0753 }
            r0 = r27
            r8.setOnLongClickListener(r0)     // Catch:{ all -> 0x0753 }
            X.3Ji r0 = new X.3Ji     // Catch:{ all -> 0x0753 }
            r0.<init>(r9)     // Catch:{ all -> 0x0753 }
            X.03v.A0B(r8, r0)     // Catch:{ all -> 0x0753 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x0761 }
            if (r0 == 0) goto L_0x00eb
            r0 = -1732620339(0xffffffff98ba4fcd, float:-4.816045E-24)
            X.0fS.A00(r0)     // Catch:{ all -> 0x0761 }
            goto L_0x00eb
        L_0x05c2:
            r4.A06()     // Catch:{ all -> 0x0761 }
        L_0x05c5:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x076f }
            if (r0 == 0) goto L_0x05d1
            r0 = 1368668462(0x5194392e, float:7.9576809E10)
            X.0fS.A00(r0)     // Catch:{ all -> 0x076f }
        L_0x05d1:
            X.358 r7 = r5.A08     // Catch:{ all -> 0x076f }
            androidx.fragment.app.FragmentActivity r0 = r37.requireActivity()     // Catch:{ all -> 0x076f }
            X.2dZ r10 = X.2dY.A00(r0)     // Catch:{ all -> 0x076f }
            X.01N r2 = X.0jo.A1H()     // Catch:{ all -> 0x076f }
            if (r10 == 0) goto L_0x05f9
            com.instagram.common.session.UserSession r9 = r7.A02     // Catch:{ all -> 0x076f }
            X.0Tu r8 = X.0Tu.A05     // Catch:{ all -> 0x076f }
            r0 = 36317560555181391(0x8106a10000154f, double:3.030709761950547E-306)
            boolean r0 = X.182.A06(r8, r9, r0)     // Catch:{ all -> 0x076f }
            if (r0 == 0) goto L_0x05f9
            android.view.ViewGroup r0 = r10.A0O     // Catch:{ all -> 0x076f }
            android.view.View[] r0 = X.0nA.A10(r0)     // Catch:{ all -> 0x076f }
            X.018.A18(r2, r0)     // Catch:{ all -> 0x076f }
        L_0x05f9:
            com.instagram.common.session.UserSession r10 = r7.A02     // Catch:{ all -> 0x076f }
            X.0Tu r9 = X.0Tu.A05     // Catch:{ all -> 0x076f }
            r0 = 36323045229472536(0x810b9e00102b18, double:3.0341782920572776E-306)
            boolean r0 = X.182.A06(r9, r10, r0)     // Catch:{ all -> 0x076f }
            if (r0 == 0) goto L_0x062b
            X.2ZQ r1 = X.C71172bH.A00()     // Catch:{ all -> 0x076f }
            if (r1 == 0) goto L_0x062b
            r0 = r1
            com.instagram.mainactivity.InstagramMainActivity r0 = (com.instagram.mainactivity.InstagramMainActivity) r0     // Catch:{ all -> 0x076f }
            X.0eM r0 = r0.A0k     // Catch:{ all -> 0x076f }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x076f }
            X.2au r0 = (X.2au) r0     // Catch:{ all -> 0x076f }
            android.view.View r0 = r0.A02     // Catch:{ all -> 0x076f }
            if (r0 == 0) goto L_0x0620
            r2.add(r0)     // Catch:{ all -> 0x076f }
        L_0x0620:
            android.view.ViewGroup r0 = r1.C3o()     // Catch:{ all -> 0x076f }
            android.view.View[] r0 = X.0nA.A10(r0)     // Catch:{ all -> 0x076f }
            X.018.A18(r2, r0)     // Catch:{ all -> 0x076f }
        L_0x062b:
            X.01N r1 = X.0jo.A1I(r2)     // Catch:{ all -> 0x076f }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x076f }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x063b
            X.2js r0 = r7.A01     // Catch:{ all -> 0x076f }
            r0.A0A = r1     // Catch:{ all -> 0x076f }
        L_0x063b:
            X.35Q r8 = r4.A0G     // Catch:{ all -> 0x076f }
            if (r8 == 0) goto L_0x0659
            android.view.View r2 = r8.A00     // Catch:{ all -> 0x076f }
            if (r2 == 0) goto L_0x0659
            r0 = 36317560555181391(0x8106a10000154f, double:3.030709761950547E-306)
            boolean r0 = X.182.A06(r9, r10, r0)     // Catch:{ all -> 0x076f }
            if (r0 == 0) goto L_0x0659
            X.2js r1 = r7.A01     // Catch:{ all -> 0x076f }
            java.util.List r0 = java.util.Collections.singletonList(r2)     // Catch:{ all -> 0x076f }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x076f }
            r1.A09 = r0     // Catch:{ all -> 0x076f }
        L_0x0659:
            android.view.View r7 = r4.A05     // Catch:{ all -> 0x076f }
            if (r7 == 0) goto L_0x0668
            X.2qK r0 = r5.A0C     // Catch:{ all -> 0x076f }
            X.2qT r2 = r0.A07     // Catch:{ all -> 0x076f }
            X.2qi r1 = r0.A05     // Catch:{ all -> 0x076f }
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.DIRECT_ICON     // Catch:{ all -> 0x076f }
            r2.A00(r7, r0, r1)     // Catch:{ all -> 0x076f }
        L_0x0668:
            X.35R r0 = r4.A0H     // Catch:{ all -> 0x076f }
            android.view.View r7 = r0.A00     // Catch:{ all -> 0x076f }
            if (r7 == 0) goto L_0x0679
            X.2qK r0 = r5.A0C     // Catch:{ all -> 0x076f }
            X.2qT r2 = r0.A07     // Catch:{ all -> 0x076f }
            X.2qi r1 = r0.A05     // Catch:{ all -> 0x076f }
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.SEARCH_ICON     // Catch:{ all -> 0x076f }
            r2.A00(r7, r0, r1)     // Catch:{ all -> 0x076f }
        L_0x0679:
            if (r8 == 0) goto L_0x068a
            android.view.View r7 = r8.A00     // Catch:{ all -> 0x076f }
            if (r7 == 0) goto L_0x068a
            X.2qK r0 = r5.A0C     // Catch:{ all -> 0x076f }
            X.2qT r2 = r0.A07     // Catch:{ all -> 0x076f }
            X.2qi r1 = r0.A05     // Catch:{ all -> 0x076f }
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.HOME_HEADER_ACTIVITY_BUTTON     // Catch:{ all -> 0x076f }
            r2.A00(r7, r0, r1)     // Catch:{ all -> 0x076f }
        L_0x068a:
            X.4DV r0 = r5.A0A     // Catch:{ all -> 0x076f }
            X.3Ar r8 = r0.getScrollingViewProxy()     // Catch:{ all -> 0x076f }
            X.0qQ.A0A(r8)     // Catch:{ all -> 0x076f }
            r0 = r37
            boolean r2 = r0.A0U     // Catch:{ all -> 0x076f }
            com.instagram.common.session.UserSession r9 = r5.A04     // Catch:{ all -> 0x076f }
            java.lang.String r0 = "ig_select_free_data_banner"
            boolean r0 = X.C238173Av.A02(r9, r0)     // Catch:{ all -> 0x076f }
            if (r0 == 0) goto L_0x06cc
            r0 = 2131629903(0x7f0e174f, float:1.888714E38)
            android.view.View r6 = r6.A7q(r0)     // Catch:{ all -> 0x076f }
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.LinearLayout"
            X.0qQ.A0C(r6, r0)     // Catch:{ all -> 0x076f }
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6     // Catch:{ all -> 0x076f }
            X.57h r1 = r5.A00     // Catch:{ all -> 0x076f }
            if (r1 == 0) goto L_0x06bb
            X.2ks r0 = r5.A09     // Catch:{ all -> 0x076f }
            r0.FJ2(r1)     // Catch:{ all -> 0x076f }
            X.ORY.A01(r9, r1)     // Catch:{ all -> 0x076f }
        L_0x06bb:
            X.57h r1 = new X.57h     // Catch:{ all -> 0x076f }
            r1.<init>(r6)     // Catch:{ all -> 0x076f }
            X.ORY.A00(r9, r1)     // Catch:{ all -> 0x076f }
            X.2ks r0 = r5.A09     // Catch:{ all -> 0x076f }
            r0.EBt(r1)     // Catch:{ all -> 0x076f }
            r5.A00 = r1     // Catch:{ all -> 0x076f }
            r1 = 1
            goto L_0x06dc
        L_0x06cc:
            X.57h r1 = r5.A00     // Catch:{ all -> 0x076f }
            if (r1 == 0) goto L_0x06d8
            X.2ks r0 = r5.A09     // Catch:{ all -> 0x076f }
            r0.FJ2(r1)     // Catch:{ all -> 0x076f }
            X.ORY.A01(r9, r1)     // Catch:{ all -> 0x076f }
        L_0x06d8:
            r0 = 0
            r5.A00 = r0     // Catch:{ all -> 0x076f }
            r1 = 0
        L_0x06dc:
            r0 = r37
            r0.A0U = r1     // Catch:{ all -> 0x076f }
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x06ee
            X.2js r6 = r5.A02     // Catch:{ all -> 0x076f }
            X.2rI r2 = r5.A06     // Catch:{ all -> 0x076f }
            r1 = r20
            r0 = r19
            r6.A07(r2, r8, r1, r0)     // Catch:{ all -> 0x076f }
        L_0x06ee:
            if (r21 == 0) goto L_0x0702
            X.2ff r7 = X.C226112fe.A0B     // Catch:{ all -> 0x076f }
            androidx.fragment.app.FragmentActivity r6 = r37.requireActivity()     // Catch:{ all -> 0x076f }
            X.WfQ r2 = new X.WfQ     // Catch:{ all -> 0x076f }
            r1 = r20
            r0 = r19
            r2.<init>(r8, r5, r1, r0)     // Catch:{ all -> 0x076f }
            r7.A04(r6, r2, r3)     // Catch:{ all -> 0x076f }
        L_0x0702:
            boolean r0 = X.C240043Jj.A00(r9)     // Catch:{ all -> 0x076f }
            if (r0 == 0) goto L_0x0715
            X.2js r2 = r5.A02     // Catch:{ all -> 0x076f }
            float r0 = r2.A01     // Catch:{ all -> 0x076f }
            float r1 = r2.A00     // Catch:{ all -> 0x076f }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0715
            X.C227762js.A00(r2, r1)     // Catch:{ all -> 0x076f }
        L_0x0715:
            com.instagram.actionbar.ActionBarTitleViewSwitcher r1 = r4.A08     // Catch:{ all -> 0x076f }
            if (r1 == 0) goto L_0x071f
            if (r18 == 0) goto L_0x071f
            r0 = r18
            r0.A00 = r1     // Catch:{ all -> 0x076f }
        L_0x071f:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x077d
            r0 = -472898279(0xffffffffe3d02519, float:-7.679192E21)
            X.0fS.A00(r0)
            return
        L_0x072c:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x073a }
            if (r0 == 0) goto L_0x0739
            r0 = 798654475(0x2f9a800b, float:2.8103417E-10)
            X.0fS.A00(r0)     // Catch:{ all -> 0x073a }
        L_0x0739:
            throw r1     // Catch:{ all -> 0x073a }
        L_0x073a:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x0753 }
            if (r0 == 0) goto L_0x0752
            r0 = -1215366436(0xffffffffb78efadc, float:-1.7044535E-5)
            goto L_0x074f
        L_0x0745:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x0753 }
            if (r0 == 0) goto L_0x0752
            r0 = -318929407(0xffffffffecfd8601, float:-2.4519284E27)
        L_0x074f:
            X.0fS.A00(r0)     // Catch:{ all -> 0x0753 }
        L_0x0752:
            throw r1     // Catch:{ all -> 0x0753 }
        L_0x0753:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x0761 }
            if (r0 == 0) goto L_0x0760
            r0 = -745084799(0xffffffffd396e881, float:-1.29629173E12)
            X.0fS.A00(r0)     // Catch:{ all -> 0x0761 }
        L_0x0760:
            throw r1     // Catch:{ all -> 0x0761 }
        L_0x0761:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x076f }
            if (r0 == 0) goto L_0x076e
            r0 = -655120246(0xffffffffd8f3a88a, float:-2.14324156E15)
            X.0fS.A00(r0)     // Catch:{ all -> 0x076f }
        L_0x076e:
            throw r1     // Catch:{ all -> 0x076f }
        L_0x076f:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x077c
            r0 = -1326941784(0xffffffffb0e879a8, float:-1.6914798E-9)
            X.0fS.A00(r0)
        L_0x077c:
            throw r1
        L_0x077d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227802jw.configureActionBar(X.2da):void");
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        super.onAttach(context);
        if (this.A0N) {
            A0C();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        ViewTreeObserver viewTreeObserver;
        0qQ.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        View view = this.mView;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C56822IDt(configuration, this));
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager, com.instagram.mainfeed.fragment.layoutmanager.MainFeedLinearLayoutManager, com.instagram.common.ui.widget.recyclerview.LinearLayoutManagerCompat, X.3pI] */
    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        C355538Qj dlk;
        0qQ.A0B(recyclerView, 0);
        C228062kj A0A2 = A0A();
        C238663Ct r2 = A0A2.A0m;
        if (r2 == null) {
            r2 = new C238663Ct(A0A2.A20, A0A2.A1t);
            A0A2.A0m = r2;
        }
        C2365134a A0O2 = A0A().A0O();
        C228302lG A0R2 = A0A().A0R();
        C227812jx r7 = r2.A00;
        ? customScrollingLinearLayoutManager = new CustomScrollingLinearLayoutManager(r7.requireContext(), 2.0f, 1, false);
        customScrollingLinearLayoutManager.A00 = true;
        customScrollingLinearLayoutManager.A02 = true;
        recyclerView.setLayoutManager(customScrollingLinearLayoutManager);
        recyclerView.setItemAnimator((AnonymousClass3AS) null);
        recyclerView.A0S = true;
        UserSession userSession = r2.A01;
        recyclerView.setItemViewCacheSize(((Number) C231492rl.A00(userSession).A05.getValue()).intValue());
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36318715901385107L)) {
            AnonymousClass1HI.A02.Eym(new C387079ld(r2));
        }
        MainFeedRecyclerView mainFeedRecyclerView = (MainFeedRecyclerView) recyclerView;
        mainFeedRecyclerView.A02 = new C238683Cz(mainFeedRecyclerView);
        mainFeedRecyclerView.setDownwardFlingScale(182.A00(r3, userSession, 37172576877150789L));
        mainFeedRecyclerView.setUpwardFlingScale(182.A00(r3, userSession, 37172576877085252L));
        long A012 = 182.A01(r3, userSession, 36609626923603842L);
        if (A012 > 0) {
            mainFeedRecyclerView.A01 = System.currentTimeMillis() + (A012 * 1000);
        }
        if (182.A06(r3, userSession, 36317620689114510L)) {
            mainFeedRecyclerView.A03 = new IP2(A0R2);
        }
        if (182.A06(r3, userSession, 36320313630400752L)) {
            dlk = new C46809Dll(r7.requireContext(), userSession, A0O2);
        } else if (182.A06(r3, userSession, 36320313630335215L)) {
            dlk = new C46808Dlk(r7.requireContext(), userSession, A0O2);
        } else {
            return;
        }
        new C355568Qm(dlk).A0A(recyclerView);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        Parcelable parcelable = A0A().A0O().A0P.A00;
        if (parcelable != null) {
            bundle.putParcelable("stories_tray_instance_state", parcelable);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: type inference failed for: r5v10, types: [X.3je, java.lang.Object, X.3Dx] */
    /* JADX WARNING: type inference failed for: r0v89, types: [X.1FE, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0428, code lost:
        if (X.182.A06(r4, r5, 36312887644915214L) != false) goto L_0x042a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r26, android.os.Bundle r27) {
        /*
            r25 = this;
            r3 = 0
            r4 = r26
            X.0qQ.A0B(r4, r3)
            r15 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r15)
            if (r0 == 0) goto L_0x0016
            r1 = -832285389(0xffffffffce645533, float:-9.5769722E8)
            java.lang.String r0 = "MainFeedFragment.onViewCreated"
            X.0fS.A01(r0, r1)
        L_0x0016:
            X.0wX r17 = X.C61170le.A00     // Catch:{ all -> 0x054b }
            X.18g r2 = X.C638918c.A01(r17)     // Catch:{ all -> 0x054b }
            java.lang.String r1 = "MAIN_FRAGMENT_ON_VIEW_CREATED_START"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r2.A02     // Catch:{ all -> 0x054b }
            r2.A0O(r0, r1)     // Catch:{ all -> 0x054b }
            r6 = r25
            X.0eM r0 = r6.A0m     // Catch:{ all -> 0x054b }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x054b }
            X.3D1 r2 = (X.AnonymousClass3D1) r2     // Catch:{ all -> 0x054b }
            if (r2 == 0) goto L_0x005c
            X.19B r0 = X.19B.A00     // Catch:{ all -> 0x054b }
            androidx.compose.runtime.Recomposer r11 = X.AnonymousClass5PK.A03(r4, r0)     // Catch:{ all -> 0x054b }
            X.0eM r0 = r2.A01     // Catch:{ all -> 0x054b }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x054b }
            X.OYc r1 = (X.OYc) r1     // Catch:{ all -> 0x054b }
            android.content.Context r8 = r4.getContext()     // Catch:{ all -> 0x054b }
            if (r8 == 0) goto L_0x0540
            int r0 = r2.A00     // Catch:{ all -> 0x054b }
            X.0rk r10 = new X.0rk     // Catch:{ all -> 0x054b }
            r10.<init>()     // Catch:{ all -> 0x054b }
            X.GVC r7 = new X.GVC     // Catch:{ all -> 0x054b }
            r9 = r1
            r12 = r0
            r13 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x054b }
            android.os.MessageQueue r1 = X.OYc.A02     // Catch:{ all -> 0x054b }
            X.OgZ r0 = new X.OgZ     // Catch:{ all -> 0x054b }
            r0.<init>(r7)     // Catch:{ all -> 0x054b }
            r1.addIdleHandler(r0)     // Catch:{ all -> 0x054b }
        L_0x005c:
            X.3Ar r7 = r6.getScrollingViewProxy()     // Catch:{ all -> 0x054b }
            X.3As r7 = (X.C238143As) r7     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2rI r0 = r0.A0J()     // Catch:{ all -> 0x054b }
            r6.setAdapter(r0)     // Catch:{ all -> 0x054b }
            com.instagram.common.session.UserSession r0 = r6.getSession()     // Catch:{ all -> 0x054b }
            X.2xN r11 = X.C234232xM.A00(r0)     // Catch:{ all -> 0x054b }
            java.lang.String r2 = "Required value was null."
            if (r7 == 0) goto L_0x053a
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x054b }
            r0.<init>(r7)     // Catch:{ all -> 0x054b }
            r11.A01 = r0     // Catch:{ all -> 0x054b }
            android.content.Context r19 = r6.requireContext()     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2rI r21 = r0.A0J()     // Catch:{ all -> 0x054b }
            com.instagram.ui.listview.StickyHeaderListView r5 = r6.A0D     // Catch:{ all -> 0x054b }
            if (r5 == 0) goto L_0x0534
            android.content.Context r0 = r6.requireContext()     // Catch:{ all -> 0x054b }
            int r0 = X.AnonymousClass3D4.A00(r0)     // Catch:{ all -> 0x054b }
            float r1 = (float) r0     // Catch:{ all -> 0x054b }
            X.3D5 r0 = new X.3D5     // Catch:{ all -> 0x054b }
            r20 = r5
            r22 = r7
            r23 = r1
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x054b }
            r6.A0E = r0     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2js r5 = r0.A03()     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2rI r1 = r0.A0J()     // Catch:{ all -> 0x054b }
            int r0 = r6.A00()     // Catch:{ all -> 0x054b }
            r5.A06(r1, r7, r0)     // Catch:{ all -> 0x054b }
            r1 = r27
            super.onViewCreated(r4, r1)     // Catch:{ all -> 0x054b }
            X.332 r0 = r6.A07     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x00cb
            r0.onViewCreated(r4, r1)     // Catch:{ all -> 0x054b }
        L_0x00cb:
            r13 = 2
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x054b }
            r5.<init>(r13)     // Catch:{ all -> 0x054b }
            com.instagram.ui.listview.StickyHeaderListView r1 = r6.A0D     // Catch:{ all -> 0x054b }
            if (r1 == 0) goto L_0x052e
            X.3Di r0 = new X.3Di     // Catch:{ all -> 0x054b }
            r0.<init>(r1)     // Catch:{ all -> 0x054b }
            r5.add(r0)     // Catch:{ all -> 0x054b }
            X.3Dj r1 = X.C238773Dj.A00     // Catch:{ all -> 0x054b }
            com.instagram.common.session.UserSession r0 = r6.getSession()     // Catch:{ all -> 0x054b }
            java.util.List r0 = r1.A00(r4, r0)     // Catch:{ all -> 0x054b }
            r5.addAll(r0)     // Catch:{ all -> 0x054b }
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()     // Catch:{ all -> 0x054b }
            X.2dZ r0 = X.2dY.A00(r0)     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x0175
            android.view.ViewGroup r9 = r0.A0P     // Catch:{ all -> 0x054b }
            com.instagram.common.session.UserSession r10 = r6.getSession()     // Catch:{ all -> 0x054b }
            X.0Tu r8 = X.0Tu.A05     // Catch:{ all -> 0x054b }
            r0 = 36311736579523310(0x810155000002ee, double:3.027026656293109E-306)
            boolean r0 = X.182.A06(r8, r10, r0)     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x0172
            X.3Dk r0 = new X.3Dk     // Catch:{ all -> 0x054b }
            r0.<init>(r9)     // Catch:{ all -> 0x054b }
        L_0x010c:
            r5.add(r0)     // Catch:{ all -> 0x054b }
        L_0x010f:
            android.app.Activity r14 = r6.getRootActivity()     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2el r10 = r0.A05()     // Catch:{ all -> 0x054b }
            X.3DZ r9 = X.AnonymousClass3DZ.A00(r6)     // Catch:{ all -> 0x054b }
            android.view.ViewGroup r1 = r7.CEd()     // Catch:{ all -> 0x054b }
            X.2eo[] r0 = new X.AnonymousClass2eo[r3]     // Catch:{ all -> 0x054b }
            java.lang.Object[] r8 = r5.toArray(r0)     // Catch:{ all -> 0x054b }
            X.2eo[] r8 = (X.AnonymousClass2eo[]) r8     // Catch:{ all -> 0x054b }
            int r0 = r8.length     // Catch:{ all -> 0x054b }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r8, r0)     // Catch:{ all -> 0x054b }
            X.2eo[] r0 = (X.AnonymousClass2eo[]) r0     // Catch:{ all -> 0x054b }
            r8 = 1
            r10.A07(r1, r9, r0)     // Catch:{ all -> 0x054b }
            X.2kj r9 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2el r12 = r9.A04     // Catch:{ all -> 0x054b }
            r0 = 0
            if (r12 != 0) goto L_0x0149
            X.2ej r1 = X.C71682ef.A00()     // Catch:{ all -> 0x054b }
            X.2el r12 = X.C71682ef.A01(r0, r1)     // Catch:{ all -> 0x054b }
            r9.A04 = r12     // Catch:{ all -> 0x054b }
        L_0x0149:
            X.3DZ r10 = X.AnonymousClass3DZ.A00(r6)     // Catch:{ all -> 0x054b }
            android.view.ViewGroup r9 = r7.CEd()     // Catch:{ all -> 0x054b }
            X.2eo[] r1 = new X.AnonymousClass2eo[r3]     // Catch:{ all -> 0x054b }
            java.lang.Object[] r5 = r5.toArray(r1)     // Catch:{ all -> 0x054b }
            X.2eo[] r5 = (X.AnonymousClass2eo[]) r5     // Catch:{ all -> 0x054b }
            int r1 = r5.length     // Catch:{ all -> 0x054b }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r1)     // Catch:{ all -> 0x054b }
            X.2eo[] r1 = (X.AnonymousClass2eo[]) r1     // Catch:{ all -> 0x054b }
            r12.A08(r9, r10, r1)     // Catch:{ all -> 0x054b }
            com.instagram.ui.listview.StickyHeaderListView r1 = r6.A0D     // Catch:{ all -> 0x054b }
            r5 = 0
            if (r1 == 0) goto L_0x017d
            r0 = 2131439764(0x7f0b3094, float:1.8501492E38)
            android.view.View r0 = r1.findViewById(r0)     // Catch:{ all -> 0x054b }
            com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent r0 = (com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent) r0     // Catch:{ all -> 0x054b }
            goto L_0x017d
        L_0x0172:
            X.2eo r0 = X.C17147VJz.A00     // Catch:{ all -> 0x054b }
            goto L_0x010c
        L_0x0175:
            java.lang.String r1 = "MainFeedFragment_createClipRegionFromActionBarContainer"
            java.lang.String r0 = "null action bar"
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x054b }
            goto L_0x010f
        L_0x017d:
            if (r14 == 0) goto L_0x0191
            boolean r1 = r6.Cda()     // Catch:{ all -> 0x054b }
            if (r1 == 0) goto L_0x0191
            if (r0 == 0) goto L_0x0191
            X.2ff r9 = X.C226112fe.A0B     // Catch:{ all -> 0x054b }
            X.WfN r1 = new X.WfN     // Catch:{ all -> 0x054b }
            r1.<init>(r0)     // Catch:{ all -> 0x054b }
            r9.A04(r14, r1, r8)     // Catch:{ all -> 0x054b }
        L_0x0191:
            boolean r1 = r6.A0g     // Catch:{ all -> 0x054b }
            if (r1 == 0) goto L_0x01aa
            com.instagram.ui.listview.StickyHeaderListView r9 = r6.A0D     // Catch:{ all -> 0x054b }
            if (r9 == 0) goto L_0x01a2
            r1 = 2131442356(0x7f0b3ab4, float:1.850675E38)
            android.view.View r5 = r9.findViewById(r1)     // Catch:{ all -> 0x054b }
            com.instagram.mainfeed.fragment.swipenavigation.MainFeedSwipeRefreshLayout r5 = (com.instagram.mainfeed.fragment.swipenavigation.MainFeedSwipeRefreshLayout) r5     // Catch:{ all -> 0x054b }
        L_0x01a2:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.mainfeed.fragment.swipenavigation.MainFeedSwipeRefreshLayout"
            X.0qQ.A0C(r5, r1)     // Catch:{ all -> 0x054b }
            if (r5 == 0) goto L_0x01b5
            goto L_0x01b3
        L_0x01aa:
            X.3Dl r1 = new X.3Dl     // Catch:{ all -> 0x054b }
            r1.<init>(r6)     // Catch:{ all -> 0x054b }
            r7.ErF(r1)     // Catch:{ all -> 0x054b }
            goto L_0x01bc
        L_0x01b3:
            r5.A00 = r11     // Catch:{ all -> 0x054b }
        L_0x01b5:
            X.3AD r1 = r6.A0G     // Catch:{ all -> 0x054b }
            X.Wf4 r1 = (X.C19763Wf4) r1     // Catch:{ all -> 0x054b }
            r7.setUpPTRSpinner(r1)     // Catch:{ all -> 0x054b }
        L_0x01bc:
            X.2kj r1 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2l3 r1 = r1.A0Q()     // Catch:{ all -> 0x054b }
            r7.EhT(r1)     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x01cf
            int r1 = r6.A00()     // Catch:{ all -> 0x054b }
            r0.A02 = r1     // Catch:{ all -> 0x054b }
        L_0x01cf:
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2mr r0 = r0.A0s()     // Catch:{ all -> 0x054b }
            boolean r0 = r0.A01()     // Catch:{ all -> 0x054b }
            r7.setIsLoading(r0)     // Catch:{ all -> 0x054b }
            r7.EUW(r3)     // Catch:{ all -> 0x054b }
            android.view.ViewGroup r0 = r7.CEd()     // Catch:{ all -> 0x054b }
            r0.setVerticalScrollBarEnabled(r3)     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.1Pp r9 = r0.A0c     // Catch:{ all -> 0x054b }
            if (r9 != 0) goto L_0x01f4
            X.1Pp r9 = X.AnonymousClass1Po.A00     // Catch:{ all -> 0x054b }
            r0.A0c = r9     // Catch:{ all -> 0x054b }
        L_0x01f4:
            android.view.View r5 = r6.mView     // Catch:{ all -> 0x054b }
            if (r5 == 0) goto L_0x0528
            java.lang.String r1 = "feed_"
            X.4DU r0 = X.AnonymousClass2kO.A00     // Catch:{ all -> 0x054b }
            java.lang.String r0 = r0.getModuleName()     // Catch:{ all -> 0x054b }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x054b }
            r9.A03(r5, r0)     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.1Pp r5 = r0.A0c     // Catch:{ all -> 0x054b }
            if (r5 != 0) goto L_0x0213
            X.1Pp r5 = X.AnonymousClass1Po.A00     // Catch:{ all -> 0x054b }
            r0.A0c = r5     // Catch:{ all -> 0x054b }
        L_0x0213:
            android.view.View r1 = r6.mView     // Catch:{ all -> 0x054b }
            if (r1 == 0) goto L_0x0522
            X.3Bh r0 = X.C238293Bh.LoadingData     // Catch:{ all -> 0x054b }
            r5.A02(r1, r0)     // Catch:{ all -> 0x054b }
            boolean r0 = X.AnonymousClass1A9.A00()     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x024e
            com.instagram.common.session.UserSession r5 = r6.getSession()     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2rI r1 = r0.A0J()     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.3GD r0 = r0.A0C()     // Catch:{ all -> 0x054b }
            X.0qQ.A0B(r5, r3)     // Catch:{ all -> 0x054b }
            X.WQe r10 = new X.WQe     // Catch:{ all -> 0x054b }
            r10.<init>(r5, r0, r1)     // Catch:{ all -> 0x054b }
            X.1xC r9 = X.1xC.A01     // Catch:{ all -> 0x054b }
            java.lang.Class<X.Lf7> r5 = X.Lf7.class
            java.lang.Object r1 = r6.A0r     // Catch:{ all -> 0x054b }
            monitor-enter(r9)     // Catch:{ all -> 0x054b }
            X.0qQ.A0B(r1, r13)     // Catch:{ all -> 0x0548 }
            X.1Nj r0 = r9.A00     // Catch:{ all -> 0x0548 }
            r0.A03(r10, r5, r1)     // Catch:{ all -> 0x0548 }
            monitor-exit(r9)     // Catch:{ all -> 0x054b }
        L_0x024e:
            r7.AHq()     // Catch:{ all -> 0x054b }
            X.3je r0 = r6.A0q     // Catch:{ all -> 0x054b }
            r7.AAD(r0)     // Catch:{ all -> 0x054b }
            android.util.TypedValue r5 = new android.util.TypedValue     // Catch:{ all -> 0x054b }
            r5.<init>()     // Catch:{ all -> 0x054b }
            android.content.Context r0 = r6.requireContext()     // Catch:{ all -> 0x054b }
            android.content.res.Resources$Theme r1 = r0.getTheme()     // Catch:{ all -> 0x054b }
            com.instagram.common.session.UserSession r0 = r6.getSession()     // Catch:{ all -> 0x054b }
            int r0 = X.0Pn.A01(r0)     // Catch:{ all -> 0x054b }
            r1.resolveAttribute(r0, r5, r8)     // Catch:{ all -> 0x054b }
            com.instagram.common.session.UserSession r0 = r6.getSession()     // Catch:{ all -> 0x054b }
            X.3Dp r1 = X.C238833Dp.A00(r0)     // Catch:{ all -> 0x054b }
            X.3Ds r0 = X.C238863Ds.STORY     // Catch:{ all -> 0x054b }
            r1.A05(r4, r0)     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2ks r1 = r0.A1w     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.366 r0 = r0.A0d()     // Catch:{ all -> 0x054b }
            X.3je r0 = r0.A02     // Catch:{ all -> 0x054b }
            r1.EBt(r0)     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2ks r1 = r0.A1w     // Catch:{ all -> 0x054b }
            X.3Az r0 = r6.A0B     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x0516
            r1.EBt(r0)     // Catch:{ all -> 0x054b }
            X.57Q r0 = r6.A0A     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x02b4
            X.2wp r0 = r0.A0L     // Catch:{ all -> 0x054b }
            boolean r0 = r0.A03()     // Catch:{ all -> 0x054b }
            if (r0 != r8) goto L_0x02b4
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2ks r1 = r0.A1w     // Catch:{ all -> 0x054b }
            X.57Q r0 = r6.A0A     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x0510
            r1.EBt(r0)     // Catch:{ all -> 0x054b }
        L_0x02b4:
            X.3D5 r0 = r6.A0E     // Catch:{ all -> 0x054b }
            r9 = 0
            if (r0 == 0) goto L_0x02ca
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2ks r1 = r0.A1w     // Catch:{ all -> 0x054b }
            X.3D5 r0 = r6.A0E     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x050a
            X.3D6 r0 = r0.A08     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x050a
            r1.EBt(r0)     // Catch:{ all -> 0x054b }
        L_0x02ca:
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2ks r1 = r0.A1w     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2lG r0 = r0.A0R()     // Catch:{ all -> 0x054b }
            r1.EBt(r0)     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2ks r1 = r0.A1w     // Catch:{ all -> 0x054b }
            X.332 r0 = r6.A07     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x051c
            r1.EBt(r0)     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2ks r1 = r0.A1w     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2js r0 = r0.A03()     // Catch:{ all -> 0x054b }
            r1.EBt(r0)     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2ks r1 = r0.A1w     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.3Dv r0 = r0.A01()     // Catch:{ all -> 0x054b }
            r1.EBt(r0)     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2ks r1 = r0.A1w     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.34a r0 = r0.A0O()     // Catch:{ all -> 0x054b }
            X.1GX r0 = r0.A0N     // Catch:{ all -> 0x054b }
            r1.EBt(r0)     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2ks r1 = r0.A1w     // Catch:{ all -> 0x054b }
            com.instagram.common.session.UserSession r0 = r6.getSession()     // Catch:{ all -> 0x054b }
            X.1GW r0 = X.1GV.A00(r0)     // Catch:{ all -> 0x054b }
            r1.EBt(r0)     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2rI r0 = r0.A0J()     // Catch:{ all -> 0x054b }
            X.3je r0 = r0.A0X     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x034f
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2ks r1 = r0.A1w     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2rI r0 = r0.A0J()     // Catch:{ all -> 0x054b }
            X.3je r0 = r0.A0X     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x0504
            r1.EBt(r0)     // Catch:{ all -> 0x054b }
        L_0x034f:
            r0 = 36310787394568490(0x810078002b012a, double:3.0264263879056195E-306)
            X.0tM r0 = X.AnonymousClass0yP.A00(r0)     // Catch:{ all -> 0x054b }
            boolean r0 = X.0yU.A07(r0)     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x036c
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2ks r1 = r0.A1w     // Catch:{ all -> 0x054b }
            X.KUW r0 = new X.KUW     // Catch:{ all -> 0x054b }
            r0.<init>()     // Catch:{ all -> 0x054b }
            r1.EBt(r0)     // Catch:{ all -> 0x054b }
        L_0x036c:
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2ks r1 = r0.A1w     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2lJ r0 = r0.A0f()     // Catch:{ all -> 0x054b }
            r1.EBt(r0)     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2ks r11 = r0.A1w     // Catch:{ all -> 0x054b }
            com.instagram.common.session.UserSession r10 = r6.getSession()     // Catch:{ all -> 0x054b }
            android.content.Context r0 = r6.getContext()     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x0397
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x0397
            android.util.DisplayMetrics r9 = r0.getDisplayMetrics()     // Catch:{ all -> 0x054b }
        L_0x0397:
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r9 == 0) goto L_0x039c
            goto L_0x03a1
        L_0x039c:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r12 = -1
            r13 = -1
            goto L_0x03ab
        L_0x03a1:
            float r0 = r9.ydpi     // Catch:{ all -> 0x054b }
            double r0 = (double) r0     // Catch:{ all -> 0x054b }
            float r4 = r9.xdpi     // Catch:{ all -> 0x054b }
            double r4 = (double) r4     // Catch:{ all -> 0x054b }
            int r12 = r9.widthPixels     // Catch:{ all -> 0x054b }
            int r13 = r9.heightPixels     // Catch:{ all -> 0x054b }
        L_0x03ab:
            X.3Dw r9 = new X.3Dw     // Catch:{ all -> 0x054b }
            r21 = r4
            r23 = r12
            r24 = r13
            r18 = r9
            r19 = r0
            r18.<init>(r19, r21, r23, r24)     // Catch:{ all -> 0x054b }
            X.3Dx r5 = new X.3Dx     // Catch:{ all -> 0x054b }
            r5.<init>()     // Catch:{ all -> 0x054b }
            r0 = 0
            r5.A00 = r0     // Catch:{ all -> 0x054b }
            X.1FE r0 = new X.1FE     // Catch:{ all -> 0x054b }
            r0.<init>()     // Catch:{ all -> 0x054b }
            r5.A02 = r0     // Catch:{ all -> 0x054b }
            X.36a r0 = X.C2370236a.A00(r10)     // Catch:{ all -> 0x054b }
            r5.A03 = r0     // Catch:{ all -> 0x054b }
            X.0Tu r4 = X.0Tu.A05     // Catch:{ all -> 0x054b }
            r0 = 36318715902302615(0x8107ae000e1997, double:3.031440408122218E-306)
            boolean r0 = X.182.A06(r4, r10, r0)     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x03f1
            X.0qQ.A0B(r10, r3)     // Catch:{ all -> 0x054b }
            r0 = 21
            X.TTP r1 = new X.TTP     // Catch:{ all -> 0x054b }
            r1.<init>(r0, r9, r10)     // Catch:{ all -> 0x054b }
            java.lang.Class<X.T7F> r0 = X.T7F.class
            java.lang.Object r0 = r10.A01(r0, r1)     // Catch:{ all -> 0x054b }
            X.T7F r0 = (X.T7F) r0     // Catch:{ all -> 0x054b }
            r5.A01 = r0     // Catch:{ all -> 0x054b }
        L_0x03f1:
            r11.EBt(r5)     // Catch:{ all -> 0x054b }
            boolean r0 = r6.A0T     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x0406
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2ks r1 = r0.A1w     // Catch:{ all -> 0x054b }
            X.3Dy r0 = new X.3Dy     // Catch:{ all -> 0x054b }
            r0.<init>(r6)     // Catch:{ all -> 0x054b }
            r1.EBt(r0)     // Catch:{ all -> 0x054b }
        L_0x0406:
            com.instagram.common.session.UserSession r5 = r6.getSession()     // Catch:{ all -> 0x054b }
            X.0qQ.A0B(r5, r3)     // Catch:{ all -> 0x054b }
            r0 = 36312887645046287(0x81026100da060f, double:3.027754594764808E-306)
            boolean r0 = X.182.A06(r4, r5, r0)     // Catch:{ all -> 0x054b }
            if (r0 != 0) goto L_0x042a
            com.instagram.common.session.UserSession r5 = r6.getSession()     // Catch:{ all -> 0x054b }
            X.0qQ.A0B(r5, r3)     // Catch:{ all -> 0x054b }
            r0 = 36312887644915214(0x81026100d8060e, double:3.027754594681917E-306)
            boolean r0 = X.182.A06(r4, r5, r0)     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x0446
        L_0x042a:
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2ks r1 = r0.A1w     // Catch:{ all -> 0x054b }
            X.3je r0 = r6.A0i     // Catch:{ all -> 0x054b }
            r1.EBt(r0)     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.2pL r3 = r0.A0G()     // Catch:{ all -> 0x054b }
            r1 = 32
            X.9LY r0 = new X.9LY     // Catch:{ all -> 0x054b }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x054b }
            r3.A06 = r0     // Catch:{ all -> 0x054b }
        L_0x0446:
            X.1ud r3 = X.1ua.A0G     // Catch:{ all -> 0x054b }
            android.content.Context r1 = r6.getContext()     // Catch:{ all -> 0x054b }
            if (r1 == 0) goto L_0x04fe
            com.instagram.common.session.UserSession r0 = r6.getSession()     // Catch:{ all -> 0x054b }
            X.1ua r1 = r3.A01(r1, r0)     // Catch:{ all -> 0x054b }
            X.2kj r0 = r6.A0A()     // Catch:{ all -> 0x054b }
            X.3E0 r0 = r0.A0V()     // Catch:{ all -> 0x054b }
            r1.A0J(r0)     // Catch:{ all -> 0x054b }
            X.57N r0 = r6.A0Y     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x048d
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()     // Catch:{ all -> 0x054b }
            android.app.Application r5 = r0.getApplication()     // Catch:{ all -> 0x054b }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x054b }
            com.instagram.common.session.UserSession r3 = r6.getSession()     // Catch:{ all -> 0x054b }
            X.57N r1 = r6.A0Y     // Catch:{ all -> 0x054b }
            if (r1 == 0) goto L_0x04f8
            X.Ghi r0 = new X.Ghi     // Catch:{ all -> 0x054b }
            r0.<init>(r5, r3, r1)     // Catch:{ all -> 0x054b }
            X.2YN r1 = new X.2YN     // Catch:{ all -> 0x054b }
            r1.<init>(r0, r6)     // Catch:{ all -> 0x054b }
            java.lang.Class<X.Jfg> r0 = X.C60100Jfg.class
            X.2YL r0 = r1.A00(r0)     // Catch:{ all -> 0x054b }
            X.Jfg r0 = (X.C60100Jfg) r0     // Catch:{ all -> 0x054b }
            X.C56585I2p.A00(r6, r0)     // Catch:{ all -> 0x054b }
        L_0x048d:
            X.3E1 r0 = new X.3E1     // Catch:{ all -> 0x054b }
            r0.<init>(r6)     // Catch:{ all -> 0x054b }
            r6.A0V = r0     // Catch:{ all -> 0x054b }
            X.0hq r1 = r6.getParentFragmentManager()     // Catch:{ all -> 0x054b }
            X.06Q r0 = r6.A0V     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x04f2
            r1.A0s(r0)     // Catch:{ all -> 0x054b }
            boolean r0 = r6.A0O     // Catch:{ all -> 0x054b }
            if (r0 != 0) goto L_0x04af
            r6.A0O = r8     // Catch:{ all -> 0x054b }
            X.1Hb r1 = X.AnonymousClass1HI.A02     // Catch:{ all -> 0x054b }
            X.3E2 r0 = new X.3E2     // Catch:{ all -> 0x054b }
            r0.<init>(r6)     // Catch:{ all -> 0x054b }
            r1.Eym(r0)     // Catch:{ all -> 0x054b }
        L_0x04af:
            android.content.Context r8 = r6.getContext()     // Catch:{ all -> 0x054b }
            if (r8 == 0) goto L_0x04ec
            android.content.Context r3 = r6.requireContext()     // Catch:{ all -> 0x054b }
            com.instagram.common.session.UserSession r2 = r6.getSession()     // Catch:{ all -> 0x054b }
            r0 = 37163424299680028(0x8407f00005011c, double:3.565637399991397E-306)
            double r4 = X.182.A00(r4, r2, r0)     // Catch:{ all -> 0x054b }
            int r0 = X.AnonymousClass0nB.A00(r3)     // Catch:{ all -> 0x054b }
            double r2 = (double) r0     // Catch:{ all -> 0x054b }
            double r2 = r2 * r4
            float r1 = (float) r2     // Catch:{ all -> 0x054b }
            X.3E3 r0 = new X.3E3     // Catch:{ all -> 0x054b }
            r0.<init>(r8, r7, r1)     // Catch:{ all -> 0x054b }
            r6.A0W = r0     // Catch:{ all -> 0x054b }
            X.18g r2 = X.C638918c.A01(r17)     // Catch:{ all -> 0x054b }
            java.lang.String r1 = "MAIN_FRAGMENT_ON_VIEW_CREATED_END"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r2.A02     // Catch:{ all -> 0x054b }
            r2.A0O(r0, r1)     // Catch:{ all -> 0x054b }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r15)
            if (r0 == 0) goto L_0x04eb
            r0 = 1182377162(0x4679a4ca, float:15977.197)
            X.0fS.A00(r0)
        L_0x04eb:
            return
        L_0x04ec:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x054b }
            r1.<init>(r2)     // Catch:{ all -> 0x054b }
            goto L_0x054a
        L_0x04f2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x054b }
            r1.<init>(r2)     // Catch:{ all -> 0x054b }
            goto L_0x054a
        L_0x04f8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x054b }
            r1.<init>(r2)     // Catch:{ all -> 0x054b }
            goto L_0x054a
        L_0x04fe:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x054b }
            r1.<init>(r2)     // Catch:{ all -> 0x054b }
            goto L_0x054a
        L_0x0504:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x054b }
            r0.<init>(r2)     // Catch:{ all -> 0x054b }
            goto L_0x0521
        L_0x050a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x054b }
            r0.<init>(r2)     // Catch:{ all -> 0x054b }
            goto L_0x0521
        L_0x0510:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x054b }
            r0.<init>(r2)     // Catch:{ all -> 0x054b }
            goto L_0x0521
        L_0x0516:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x054b }
            r0.<init>(r2)     // Catch:{ all -> 0x054b }
            goto L_0x0521
        L_0x051c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x054b }
            r0.<init>(r2)     // Catch:{ all -> 0x054b }
        L_0x0521:
            throw r0     // Catch:{ all -> 0x054b }
        L_0x0522:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x054b }
            r1.<init>(r2)     // Catch:{ all -> 0x054b }
            goto L_0x054a
        L_0x0528:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x054b }
            r1.<init>(r2)     // Catch:{ all -> 0x054b }
            goto L_0x054a
        L_0x052e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x054b }
            r1.<init>(r2)     // Catch:{ all -> 0x054b }
            goto L_0x054a
        L_0x0534:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x054b }
            r1.<init>(r2)     // Catch:{ all -> 0x054b }
            goto L_0x054a
        L_0x053a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x054b }
            r1.<init>(r2)     // Catch:{ all -> 0x054b }
            goto L_0x054a
        L_0x0540:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x054b }
            r1.<init>(r0)     // Catch:{ all -> 0x054b }
            goto L_0x054a
        L_0x0548:
            r1 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x054b }
        L_0x054a:
            throw r1     // Catch:{ all -> 0x054b }
        L_0x054b:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r15)
            if (r0 == 0) goto L_0x0558
            r0 = -1033620325(0xffffffffc264349b, float:-57.051373)
            X.0fS.A00(r0)
        L_0x0558:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227802jw.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A03(C227802jw r2) {
        FragmentActivity activity;
        View currentFocus;
        if (r2.A0L) {
            AnonymousClass332 r0 = r2.A07;
            if (r0 != null) {
                r0.onPause();
            }
            r2.A0L = false;
        }
        r2.A0A().A04().EEH(r2.A0A().A08());
        View view = r2.mView;
        if (view != null) {
            0nA.A0N(view);
        }
        FragmentActivity activity2 = r2.getActivity();
        if (activity2 != null && activity2.getCurrentFocus() != null && (activity = r2.getActivity()) != null && (currentFocus = activity.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
        }
    }

    /* JADX WARNING: type inference failed for: r0v22, types: [X.2le, X.2lf] */
    /* JADX WARNING: type inference failed for: r0v50, types: [java.lang.Object, X.Fdd] */
    public static final void A04(C227802jw r6) {
        if (r6.A0s.compareAndSet(false, true)) {
            AnonymousClass2kR r3 = r6.A0a;
            if (r3 == null) {
                0qQ.A0F("feedSession");
                throw AnonymousClass00P.createAndThrow();
            }
            r6.A0e = new C228062kj(r3, new C40566AeD(new C20607Wvo(r6, 5)), r6.A0j, r6);
            C228062kj A0A2 = r6.A0A();
            UserSession userSession = A0A2.A1t;
            0Tu r4 = 0Tu.A05;
            if (182.A06(r4, userSession, 36327829822323431L)) {
                if (A0A2.A04 == null) {
                    A0A2.A04 = C71682ef.A01((0lg) null, C71682ef.A00());
                }
                if (A0A2.A0e == null) {
                    A0A2.A0e = new C229722nv(A0A2.A1z);
                }
                if (A0A2.A0Z == null) {
                    A0A2.A0Z = new AnonymousClass2lZ(A0A2.A1s, AnonymousClass2kO.A00, userSession, new AnonymousClass2lX());
                }
                A0A2.A0M();
                A0A2.A0N();
                if (A0A2.A0O == null) {
                    A0A2.A0O = new C229752ny(A0A2.A20, userSession);
                }
                if (A0A2.A0Q == null) {
                    A0A2.A0Q = new AnonymousClass3G9(A0A2.A1s);
                }
                A0A2.A0n();
                A0A2.A0y();
            }
            if (182.A06(r4, userSession, 36327829822388968L)) {
                if (A0A2.A0V == null) {
                    A0A2.A0V = new Object();
                }
                A0A2.A0E();
                if (A0A2.A0i == null) {
                    A0A2.A0i = new AnonymousClass2qE(userSession, A0A2.A1x, new C230762qD(A0A2.A20, userSession), A0A2.A1z);
                }
                A0A2.A0D();
                A0A2.A0S();
                A0A2.A0e();
                if (A0A2.A0D == null) {
                    AnonymousClass41L r1 = A0A2.A0G;
                    if (r1 == null) {
                        r1 = new AnonymousClass41L(AnonymousClass2kO.A00, userSession);
                        A0A2.A0G = r1;
                    }
                    A0A2.A0D = new AnonymousClass2xI(userSession, r1);
                }
                if (A0A2.A0G == null) {
                    A0A2.A0G = new AnonymousClass41L(AnonymousClass2kO.A00, userSession);
                }
                A0A2.A0I();
            }
            if (182.A06(r4, userSession, 36327829822454505L)) {
                if (A0A2.A03 == null) {
                    A0A2.A03 = AnonymousClass0kN.A01(AnonymousClass2kO.A00, userSession);
                }
                A0A2.A08();
                A0A2.A0Z();
                A0A2.A0a();
                A0A2.A04();
                if (A0A2.A0I == null) {
                    A0A2.A0I = new C229732nw(userSession, AnonymousClass2kO.A00);
                }
                A0A2.A0q();
            }
            if (182.A06(r4, userSession, 36327829822520042L)) {
                A0A2.A0r();
                if (A0A2.A0k == null) {
                    A0A2.A0k = new C230782qG(userSession, A0A2.A1z, A0A2);
                }
                A0A2.A0u();
                A0A2.A0x();
                A0A2.A0K();
                A0A2.A0b();
                if (A0A2.A0m == null) {
                    A0A2.A0m = new C238663Ct(A0A2.A20, userSession);
                }
            }
            if (182.A06(r4, userSession, 36327829822585579L)) {
                A0A2.A03();
                if (A0A2.A0E == null) {
                    A0A2.A0E = new AnonymousClass2xI(userSession, new AnonymousClass41K(userSession));
                }
                if (A0A2.A05 == null) {
                    A0A2.A05 = new AnonymousClass34Y();
                }
                A0A2.A0h();
            }
            if (182.A06(r4, userSession, 36327829822651116L)) {
                if (A0A2.A0A == null) {
                    A0A2.A0A = new C229962oh(AnonymousClass2kO.A00, userSession);
                }
                A0A2.A0B();
                A0A2.A0f();
                if (A0A2.A0F == null) {
                    A0A2.A0F = new AnonymousClass2xI(userSession, new C2355330f(userSession));
                }
                if (A0A2.A0c == null) {
                    A0A2.A0c = AnonymousClass1Po.A00;
                }
                if (A0A2.A0S == null) {
                    A0A2.A0S = new AnonymousClass2lH(userSession);
                }
                A0A2.A10();
                if (A0A2.A0d == null) {
                    A0A2.A0d = new AnonymousClass36L(A0A2.A20, userSession);
                }
                if (A0A2.A00 == null) {
                    A0A2.A00 = new C228432lf();
                }
            }
        }
    }

    /* renamed from: A05 */
    public final UserSession getSession() {
        return (UserSession) this.A0t.getValue();
    }

    public final 1Xj A06() {
        View view = this.mView;
        if (view == null) {
            0wj.A01.AEf("The attached view is null when getMedia() gets called.", 817899586);
            return null;
        }
        int height = view.getHeight();
        AnonymousClass2rI A0J2 = A0A().A0J();
        int A022 = A0J2.A02(height);
        if (A022 >= 0) {
            return 1Xi.A02(A0J2.A03(A022).A05);
        }
        return null;
    }

    public final 2Zg A07() {
        2Zg r1 = this.mParentFragment;
        if (r1 instanceof 2Zg) {
            0qQ.A0C(r1, AnonymousClass000.A00(51));
        } else {
            r1 = getRootActivity();
            if (!(r1 instanceof 2Zg)) {
                return null;
            }
        }
        return r1;
    }

    public final AnonymousClass3GG A09() {
        AnonymousClass3GG r12 = this.A0c;
        if (r12 != null) {
            return r12;
        }
        C227872kC r11 = this.A0j;
        C228182kv r10 = A0A().A1x;
        UserSession A052 = getSession();
        AnonymousClass3G8 r3 = (AnonymousClass3G8) ((AnonymousClass2k7) this.A0n.getValue()).A03.getValue();
        AnonymousClass35N A0H2 = A0A().A0H();
        C227762js A032 = A0A().A03();
        C2365134a A0O2 = A0A().A0O();
        C238213Az r9 = this.A0B;
        C2357130x r5 = this.A0I;
        C228472lj A0o2 = A0A().A0o();
        AnonymousClass2l3 A0Q2 = A0A().A0Q();
        AnonymousClass2k6 r14 = this.A0p;
        C228062kj A0A2 = A0A();
        AnonymousClass3GA r1 = A0A2.A0Y;
        if (r1 == null) {
            Context context = A0A2.A1s;
            UserSession userSession = A0A2.A1t;
            Integer num = AnonymousClass05K.A04;
            AnonymousClass2rI A0J2 = A0A2.A0J();
            AnonymousClass3G9 r0 = A0A2.A0Q;
            if (r0 == null) {
                r0 = new AnonymousClass3G9(context);
                A0A2.A0Q = r0;
            }
            r1 = new AnonymousClass3GA(userSession, A0J2, r0, num);
            A0A2.A0Y = r1;
        }
        AnonymousClass3GD A0C2 = A0A().A0C();
        C228062kj A0A3 = A0A();
        AnonymousClass3GF r6 = A0A3.A0q;
        if (r6 == null) {
            r6 = new AnonymousClass3GF(A0A3.A20.requireActivity(), A0A3.A1t);
            A0A3.A0q = r6;
        }
        C249883kW r13 = r6.A01;
        1FI r4 = this.A09;
        AnonymousClass35W A0p2 = A0A().A0p();
        1FI r19 = r4;
        AnonymousClass3G8 r23 = r3;
        AnonymousClass3GG r122 = new AnonymousClass3GG(r13, r14, A032, A052, A0C2, A0H2, r19, A0O2, A0A().A0P(), A0Q2, r23, (AnonymousClass2lI) A0A().A21.getValue(), r9, r10, r1, A0o2, r11, this, A0p2, r5, A0A().A0x());
        this.A0c = r122;
        return r122;
    }

    public final C228062kj A0A() {
        C228062kj r0 = this.A0e;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("viewLayerDependencyProvider");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0B() {
        if (!this.A0L) {
            AnonymousClass332 r0 = this.A07;
            if (r0 != null) {
                r0.onResume();
            }
            this.A0L = true;
        }
        A0A().A04().A9Y(A0A().A08());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0192, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0193, code lost:
        X.0fh.A00(1090028658);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0199, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C() {
        /*
            r15 = this;
            boolean r0 = r15.A0h
            if (r0 != 0) goto L_0x01a3
            X.3GG r0 = r15.A09()
            X.3GH r3 = r0.A00()
            com.instagram.common.session.UserSession r2 = r3.A06
            X.2cc r0 = X.C71342cb.A00(r2)
            java.lang.String r9 = r0.A03()
            java.lang.String r1 = "MainFeedFragment.onWarmStart"
            r0 = -160734056(0xfffffffff66b6498, float:-1.193584E33)
            X.0fh.A01(r1, r0)
            X.0wX r5 = X.C61170le.A00     // Catch:{ all -> 0x0192 }
            X.18g r0 = X.C638918c.A01(r5)     // Catch:{ all -> 0x0192 }
            boolean r0 = r0.A0V()     // Catch:{ all -> 0x0192 }
            r10 = 0
            if (r0 == 0) goto L_0x0055
            X.2l3 r4 = r3.A0B     // Catch:{ all -> 0x0192 }
            monitor-enter(r4)     // Catch:{ all -> 0x0192 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x018f }
            r4.A0O = r0     // Catch:{ all -> 0x018f }
            r4.A0P = r0     // Catch:{ all -> 0x018f }
            android.os.Handler r1 = r4.A0B     // Catch:{ all -> 0x018f }
            java.lang.Runnable r0 = r4.A0K     // Catch:{ all -> 0x018f }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x018f }
            java.lang.Runnable r0 = r4.A0J     // Catch:{ all -> 0x018f }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x018f }
            r4.A06 = r10     // Catch:{ all -> 0x018f }
            r4.A04 = r10     // Catch:{ all -> 0x018f }
            r4.A07 = r10     // Catch:{ all -> 0x018f }
            r4.A03 = r10     // Catch:{ all -> 0x018f }
            r4.A0Q = r10     // Catch:{ all -> 0x018f }
            r4.A05 = r10     // Catch:{ all -> 0x018f }
            r0 = 0
            r4.A01 = r0     // Catch:{ all -> 0x018f }
            X.1Gs r0 = r4.A0H     // Catch:{ all -> 0x018f }
            r0.A03()     // Catch:{ all -> 0x018f }
            goto L_0x0073
        L_0x0055:
            X.18g r0 = X.C638918c.A01(r5)     // Catch:{ all -> 0x0192 }
            boolean r0 = r0.A0U()     // Catch:{ all -> 0x0192 }
            if (r0 != 0) goto L_0x0069
            X.18g r0 = X.C638918c.A01(r5)     // Catch:{ all -> 0x0192 }
            boolean r0 = r0.A0W()     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x007b
        L_0x0069:
            X.2lL r0 = r3.A0A     // Catch:{ all -> 0x0192 }
            r0.A06(r10)     // Catch:{ all -> 0x0192 }
            r0 = 680947753(0x28967029, float:1.6701987E-14)
            goto L_0x019d
        L_0x0073:
            monitor-exit(r4)     // Catch:{ all -> 0x0192 }
            X.18g r0 = X.C638918c.A01(r5)     // Catch:{ all -> 0x0192 }
            r0.A0R(r4)     // Catch:{ all -> 0x0192 }
        L_0x007b:
            X.2jw r1 = r3.A0I     // Catch:{ all -> 0x0192 }
            boolean r0 = r1.isAdded()     // Catch:{ all -> 0x0192 }
            r4 = 1
            if (r0 != 0) goto L_0x0091
            X.2kC r0 = r3.A0H     // Catch:{ all -> 0x0192 }
            X.2jw r0 = r0.A00     // Catch:{ all -> 0x0192 }
            r0.A0N = r4     // Catch:{ all -> 0x0192 }
            X.2lL r0 = r3.A0A     // Catch:{ all -> 0x0192 }
            r0.A06(r10)     // Catch:{ all -> 0x0192 }
            goto L_0x019a
        L_0x0091:
            X.3GG r0 = r1.A09()     // Catch:{ all -> 0x0192 }
            X.3GH r0 = r0.A00()     // Catch:{ all -> 0x0192 }
            r0.A02 = r10     // Catch:{ all -> 0x0192 }
            r1.A0T(r10)     // Catch:{ all -> 0x0192 }
            X.2kC r0 = r3.A0H     // Catch:{ all -> 0x0192 }
            X.2jw r0 = r0.A00     // Catch:{ all -> 0x0192 }
            r0.A0N = r10     // Catch:{ all -> 0x0192 }
            X.2lj r6 = r3.A0G     // Catch:{ all -> 0x0192 }
            X.3PG r0 = r6.A08     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x00c2
            X.2ll r5 = X.C228482lk.A00(r2)     // Catch:{ all -> 0x0192 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0192 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0192 }
            r5.A01 = r0     // Catch:{ all -> 0x0192 }
            r0 = 0
            r5.A03 = r0     // Catch:{ all -> 0x0192 }
            r5.A00 = r0     // Catch:{ all -> 0x0192 }
            java.util.ArrayList r0 = r5.A06     // Catch:{ all -> 0x0192 }
            r0.clear()     // Catch:{ all -> 0x0192 }
        L_0x00c2:
            X.3Az r0 = r3.A0E     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x00ed
            X.3B0 r5 = r0.A06()     // Catch:{ all -> 0x0192 }
        L_0x00ca:
            X.3B0 r11 = X.AnonymousClass3B0.DEFAULT_BEHAVIOR     // Catch:{ all -> 0x0192 }
            if (r5 != r11) goto L_0x00f5
            X.1NN r0 = X.1NM.A00(r2)     // Catch:{ all -> 0x0192 }
            com.instagram.common.session.UserSession r8 = r0.A00     // Catch:{ all -> 0x0192 }
            X.0Tu r7 = X.0Tu.A05     // Catch:{ all -> 0x0192 }
            r0 = 36325867022005551(0x810e2f0001352f, double:3.035962805017603E-306)
            boolean r0 = X.182.A06(r7, r8, r0)     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x00f5
            X.3B0 r0 = X.AnonymousClass3GH.A00(r3)     // Catch:{ all -> 0x0192 }
            if (r0 != r11) goto L_0x00f5
            X.2lL r0 = r3.A0A     // Catch:{ all -> 0x0192 }
            r0.A06(r10)     // Catch:{ all -> 0x0192 }
            goto L_0x00f0
        L_0x00ed:
            X.3B0 r5 = X.AnonymousClass3B0.DEFAULT_BEHAVIOR     // Catch:{ all -> 0x0192 }
            goto L_0x00ca
        L_0x00f0:
            r0 = 1160597878(0x452d5176, float:2773.0913)
            goto L_0x019d
        L_0x00f5:
            java.lang.String r0 = "feed_timeline"
            boolean r0 = X.0qQ.A0K(r9, r0)     // Catch:{ all -> 0x0192 }
            if (r0 != 0) goto L_0x0128
            java.lang.String r0 = "comments_v2_feed_timeline"
            boolean r0 = X.0qQ.A0K(r9, r0)     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x0112
            X.0Tu r7 = X.0Tu.A05     // Catch:{ all -> 0x0192 }
            r0 = 36327215641671913(0x810f69000038e9, double:3.0368156775250656E-306)
            boolean r0 = X.182.A06(r7, r2, r0)     // Catch:{ all -> 0x0192 }
            if (r0 != 0) goto L_0x011f
        L_0x0112:
            X.0Tu r7 = X.0Tu.A05     // Catch:{ all -> 0x0192 }
            r0 = 36327215641737450(0x810f69000138ea, double:3.0368156775665115E-306)
            boolean r0 = X.182.A06(r7, r2, r0)     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x0128
        L_0x011f:
            X.2l3 r0 = r3.A0B     // Catch:{ all -> 0x0192 }
            r0.A03()     // Catch:{ all -> 0x0192 }
            r0 = 297504669(0x11bb8f9d, float:2.9591906E-28)
            goto L_0x019d
        L_0x0128:
            com.facebook.common.time.AwakeTimeSinceBootClock r0 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE     // Catch:{ all -> 0x0192 }
            long r13 = r0.now()     // Catch:{ all -> 0x0192 }
            long r0 = r3.A01     // Catch:{ all -> 0x0192 }
            long r13 = r13 - r0
            X.0Tu r12 = X.0Tu.A05     // Catch:{ all -> 0x0192 }
            r0 = 36599095666019761(0x8206af00460db1, double:3.20875369969563E-306)
            long r10 = X.182.A01(r12, r2, r0)     // Catch:{ all -> 0x0192 }
            r8 = 0
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0157
            long r1 = X.182.A01(r12, r2, r0)     // Catch:{ all -> 0x0192 }
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0157
            X.3PG r0 = r6.A08     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x0157
            X.2l3 r0 = r3.A0B     // Catch:{ all -> 0x0192 }
            r0.A03()     // Catch:{ all -> 0x0192 }
            r0 = 851011417(0x32b96759, float:2.1583832E-8)
            goto L_0x019d
        L_0x0157:
            X.34a r1 = r3.A09     // Catch:{ all -> 0x0192 }
            X.1FI r0 = X.1FI.A0M     // Catch:{ all -> 0x0192 }
            java.lang.Boolean r2 = X.AnonymousClass3GH.A01(r0, r1, r5, r3)     // Catch:{ all -> 0x0192 }
            if (r2 == 0) goto L_0x016a
            boolean r1 = r2.booleanValue()     // Catch:{ all -> 0x0192 }
            X.2lL r0 = r3.A0A     // Catch:{ all -> 0x0192 }
            r0.A06(r1)     // Catch:{ all -> 0x0192 }
        L_0x016a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0192 }
            boolean r0 = X.0qQ.A0K(r2, r0)     // Catch:{ all -> 0x0192 }
            if (r0 != 0) goto L_0x0179
            X.2l3 r0 = r3.A0B     // Catch:{ all -> 0x0192 }
            r0.A03()     // Catch:{ all -> 0x0192 }
        L_0x0179:
            X.2l3 r4 = r3.A0B     // Catch:{ all -> 0x0192 }
            monitor-enter(r4)     // Catch:{ all -> 0x0192 }
            boolean r0 = r4.A0N     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x018a
            java.lang.Integer r1 = r4.A0P     // Catch:{ all -> 0x018f }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x018f }
            if (r1 != r0) goto L_0x018a
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x018f }
            r4.A0P = r0     // Catch:{ all -> 0x018f }
        L_0x018a:
            monitor-exit(r4)     // Catch:{ all -> 0x0192 }
            r0 = -1195684439(0xffffffffb8bb4da9, float:-8.93132E-5)
            goto L_0x019d
        L_0x018f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0192 }
            throw r0     // Catch:{ all -> 0x0192 }
        L_0x0192:
            r1 = move-exception
            r0 = 1090028658(0x40f88472, float:7.7661676)
            X.0fh.A00(r0)
            throw r1
        L_0x019a:
            r0 = 1981045216(0x761459e0, float:7.522293E32)
        L_0x019d:
            X.0fh.A00(r0)
            r0 = 1
            r15.A0h = r0
        L_0x01a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227802jw.A0C():void");
    }

    public final void A0O(AnonymousClass3PG r9, C270374gd r10, boolean z) {
        String str;
        String str2;
        this.A0C = r10;
        if (!z) {
            if (Systrace.A0E(1)) {
                0fS.A01("setMegaphone", -1591751992);
            }
            if (r10 == null) {
                try {
                    if (r9 != AnonymousClass3PG.CACHED) {
                        C231002qi r4 = A0A().A0v().A05;
                        HashMap hashMap = new HashMap();
                        UserSession userSession = ((A4F) ((AnonymousClass2k7) this.A0n.getValue()).A04.getValue()).A00;
                        Pair A002 = C379669Uv.A00(userSession);
                        if (A002 != null) {
                            hashMap.put("lat", ((Float) A002.first).toString());
                            hashMap.put("lng", ((Float) A002.second).toString());
                        }
                        if (182.A06(0Tu.A05, userSession, 36316864770478782L)) {
                            19i A012 = 0jh.A04.A01(userSession).A01(19f.A21);
                            if (A012 == null || (str2 = A012.A01) == null) {
                                str = "";
                            } else {
                                str = str2.toUpperCase(Locale.ROOT);
                                0qQ.A07(str);
                            }
                            String A042 = 0qv.A02.A04(C60960kU.A00);
                            hashMap.put("family_device_id", str);
                            if (A042 != null) {
                                hashMap.put(Pxd.A00(189), A042);
                            }
                        }
                        r4.Dh4(hashMap);
                    }
                } catch (Throwable th) {
                    if (Systrace.A0E(1)) {
                        0fS.A00(1568907731);
                    }
                    throw th;
                }
            } else if (r10.A00 != null) {
                C228062kj A0A2 = A0A();
                C230782qG r2 = A0A2.A0k;
                if (r2 == null) {
                    r2 = new C230782qG(A0A2.A1t, A0A2.A1z, A0A2);
                    A0A2.A0k = r2;
                }
                F9Z.A00(((FAK) r2.A04.getValue()).A02, r10, AnonymousClass05K.A00, AnonymousClass05K.A0N);
                A0A().A0J().A0D(r10);
            }
            if (Systrace.A0E(1)) {
                0fS.A00(-462532080);
            }
        }
    }

    public final void A0P(Integer num) {
        if (num != null) {
            A0A().A07().A00 = num.intValue();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0134, code lost:
        if (r0 > 0) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d5, code lost:
        r0 = r5.A0A().A0O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0229, code lost:
        if ((java.lang.System.currentTimeMillis() - r0) > java.util.concurrent.TimeUnit.SECONDS.toMillis(X.182.A01(r4, r6.A07, 36610962656532664L))) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0262, code lost:
        if (X.AnonymousClass1B1.A00(r6).A00(X.1B2.A0L) == false) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0278, code lost:
        if (r10 >= 0) goto L_0x0124;
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0202  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0S(java.lang.String r16) {
        /*
            r15 = this;
            X.57Q r1 = r15.A0A
            if (r1 == 0) goto L_0x0013
            boolean r0 = X.AnonymousClass57Q.A02(r1)
            if (r0 == 0) goto L_0x0013
            X.2wr r0 = r1.A0K
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            return
        L_0x0013:
            X.2kj r0 = r15.A0A()
            X.2li r2 = r0.A0x()
            X.2jw r5 = r2.A00
            boolean r0 = r5.mDetached
            if (r0 != 0) goto L_0x0012
            android.view.View r0 = r5.mView
            if (r0 == 0) goto L_0x0012
            X.2kj r0 = r5.A0A()
            X.2lG r0 = r0.A0R()
            r4 = r16
            r0.A00(r4)
            X.2kj r0 = r5.A0A()
            X.2lG r1 = r0.A0R()
            java.lang.String r0 = "AUTO_SCROLL_TO_TOP"
            r1.A00(r0)
            X.2kj r0 = r5.A0A()
            X.35V r3 = r0.A0r()
            java.lang.String r0 = "MainFeedFragment.scrollToTopWithReason."
            java.lang.String r1 = X.002.A0R(r0, r4)
            r7 = 0
            X.0qQ.A0B(r1, r7)
            X.0eM r0 = r3.A00
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            X.36a r0 = (X.C2370236a) r0
            r0.A03(r1)
            X.3Ar r0 = r5.mScrollingViewProxy
            r14 = 1
            if (r0 == 0) goto L_0x0078
            boolean r1 = r0.COw()
            X.2kj r0 = r5.A0A()
            X.34a r0 = r0.A0O()
            boolean r0 = r0.A0B()
            if (r1 == 0) goto L_0x00a2
            if (r0 == 0) goto L_0x00a2
        L_0x0078:
            X.2kj r0 = r5.A0A()
            X.34a r0 = r0.A0O()
            r0.A07()
            r2.A00()
            X.3Az r3 = r5.A0B
            if (r3 == 0) goto L_0x00b8
            X.3B0 r0 = r3.A02
            int r2 = r0.ordinal()
            r1 = 1
            r0 = 2
            if (r2 == r0) goto L_0x00a4
            if (r2 != r1) goto L_0x00b8
            boolean r0 = r3.A0B()
            if (r0 == 0) goto L_0x00b8
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C238213Az.A01(r3, r0)
            return
        L_0x00a2:
            r14 = 0
            goto L_0x0078
        L_0x00a4:
            X.2lj r0 = r3.A08
            X.2lo r0 = r0.A0i
            java.util.List r0 = r0.A04
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00b8
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C238213Az.A00(r3, r0)
            return
        L_0x00b8:
            X.2kj r0 = r5.A0A()
            r0.A0J()
            X.GSY r0 = X.C242583Vb.A00
            if (r0 != 0) goto L_0x0012
            X.2kj r0 = r5.A0A()
            X.3Ay r1 = r0.A0w()
            android.os.Bundle r0 = r5.mArguments
            r1.A01(r0)
            com.instagram.common.session.UserSession r2 = r5.getSession()
            X.0Tu r4 = X.0Tu.A05
            r0 = 36317620685575540(0x8106af000d1574, double:3.030747788653932E-306)
            boolean r1 = X.182.A06(r4, r2, r0)
            X.2kj r0 = r5.A0A()
            X.2lj r0 = r0.A0o()
            if (r1 == 0) goto L_0x02d9
            X.2lr r0 = r0.A0f
            java.lang.Long r12 = r0.A05()
        L_0x00ef:
            com.instagram.common.session.UserSession r6 = r5.getSession()
            r0 = 36325467589981156(0x810dd2000033e4, double:3.035710202596992E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x0235
            if (r6 == 0) goto L_0x0235
            X.1Av r1 = X.1Au.A00(r6)
            X.S5L r0 = new X.S5L
            r0.<init>(r1)
            java.lang.Boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0235
            boolean r0 = r0.booleanValue()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            if (r0 == 0) goto L_0x022e
            r0 = 36606942566749697(0x820dd200011601, double:3.2137161113141745E-306)
        L_0x011c:
            long r0 = X.182.A01(r4, r6, r0)
            long r10 = r2.toMillis(r0)
        L_0x0124:
            r13 = 0
            r2 = 1
            if (r12 == 0) goto L_0x0136
            long r8 = java.lang.System.currentTimeMillis()
            long r0 = r12.longValue()
            long r8 = r8 - r0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r12 = 0
            if (r0 <= 0) goto L_0x0137
        L_0x0136:
            r12 = 1
        L_0x0137:
            com.instagram.common.session.UserSession r3 = r5.getSession()
            r0 = 36329487679766683(0x81117a0006409b, double:3.038252523564961E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 != 0) goto L_0x0202
            r3 = r12
        L_0x0147:
            com.instagram.common.session.UserSession r0 = r5.getSession()
            X.1NN r0 = X.1NM.A00(r0)
            com.instagram.common.session.UserSession r6 = r0.A00
            r0 = 36317517606556891(0x810697001014db, double:3.030682601067473E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x018a
            X.2kj r0 = r5.A0A()
            X.2kn r8 = r0.A1y
            r6 = 0
            long r9 = java.lang.System.currentTimeMillis()
            long r0 = r8.A01
            long r9 = r9 - r0
            long r0 = r8.A03
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r1 = 0
            if (r8 > 0) goto L_0x0172
            r1 = 1
        L_0x0172:
            X.2kj r0 = r5.A0A()
            X.34a r0 = r0.A0O()
            if (r1 == 0) goto L_0x01ec
            android.view.View r8 = r0.A00
            if (r8 == 0) goto L_0x018a
            X.5It r6 = new X.5It
            r6.<init>(r0)
            r0 = 250(0xfa, double:1.235E-321)
            r8.postDelayed(r6, r0)
        L_0x018a:
            if (r14 == 0) goto L_0x01ba
            X.2kj r0 = r5.A0A()
            X.2lj r0 = r0.A0o()
            X.2lr r0 = r0.A0f
            java.lang.Long r0 = r0.A05()
            if (r0 == 0) goto L_0x01ba
            X.2kj r0 = r5.A0A()
            X.34a r0 = r0.A0O()
            boolean r0 = r0.A0D(r2)
            if (r0 != 0) goto L_0x01ba
            com.instagram.common.session.UserSession r6 = r5.getSession()
            r0 = 36317620685510003(0x8106af000c1573, double:3.0307477886124864E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x01ba
            r13 = 1
        L_0x01ba:
            if (r12 != 0) goto L_0x0314
            if (r3 != 0) goto L_0x0314
            if (r13 != 0) goto L_0x0314
            com.instagram.common.session.UserSession r0 = r5.getSession()
            X.1NN r0 = X.1NM.A00(r0)
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36317517606556891(0x810697001014db, double:3.030682601067473E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 != 0) goto L_0x0012
            X.2kj r0 = r5.A0A()
            X.34a r0 = r0.A0O()
            android.view.View r3 = r0.A00
            if (r3 == 0) goto L_0x0012
            X.5It r2 = new X.5It
            r2.<init>(r0)
            r0 = 250(0xfa, double:1.235E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x01ec:
            X.2kn r0 = r0.A0O
            boolean r0 = r0.A0H()
            if (r0 != 0) goto L_0x018a
            X.2kj r0 = r5.A0A()
            X.34a r1 = r0.A0O()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r1.A0C(r6, r0)
            goto L_0x018a
        L_0x0202:
            X.2kj r0 = r5.A0A()
            X.2kn r6 = r0.A1y
            long r0 = r6.A01
            r8 = 0
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x022b
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r0
            com.instagram.common.session.UserSession r6 = r6.A07
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 36610962656532664(0x82117a000718b8, double:3.216258432280525E-306)
            long r0 = X.182.A01(r4, r6, r0)
            long r8 = r3.toMillis(r0)
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            r3 = 0
            if (r0 <= 0) goto L_0x0147
        L_0x022b:
            r3 = 1
            goto L_0x0147
        L_0x022e:
            r0 = 36606942566815234(0x820dd200021602, double:3.2137161113556204E-306)
            goto L_0x011c
        L_0x0235:
            r0 = 36328701700619806(0x8110c300043e1e, double:3.037755467187592E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x027f
            if (r6 == 0) goto L_0x027f
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            X.Hra r3 = X.C55041HbC.A00(r6)
            X.1FI r2 = X.1FI.A03
            r0 = 36328701700685343(0x8110c300053e1f, double:3.037755467229038E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x0264
            long r0 = X.AnonymousClass1B0.A02
            X.1B0 r1 = X.AnonymousClass1B1.A00(r6)
            X.1B2 r0 = X.1B2.A0L
            boolean r1 = r1.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0265
        L_0x0264:
            r0 = 0
        L_0x0265:
            java.lang.Integer r0 = r3.A00(r2, r0)
            r2 = 0
            if (r0 == 0) goto L_0x027c
            int r0 = r0.intValue()
            long r0 = (long) r0
        L_0x0272:
            long r10 = r8.toMillis(r0)
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x027f
            goto L_0x0124
        L_0x027c:
            r0 = 0
            goto L_0x0272
        L_0x027f:
            r0 = 36329487679701146(0x81117a0005409a, double:3.0382525235235154E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x0293
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 36610962656336055(0x82117a000418b7, double:3.216258432156189E-306)
            goto L_0x011c
        L_0x0293:
            r0 = 36326086065272304(0x810e62000035f0, double:3.036101328861514E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x02b7
            if (r6 == 0) goto L_0x02b7
            long r0 = X.AnonymousClass1B0.A02
            X.1B0 r1 = X.AnonymousClass1B1.A00(r6)
            X.1B2 r0 = X.1B2.A0L
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x02b7
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 36607561042040402(0x820e6200011652, double:3.2141072375784165E-306)
            goto L_0x011c
        L_0x02b7:
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 36594981083351031(0x8202f1000907f7, double:3.2061516210478305E-306)
            long r0 = X.182.A01(r4, r6, r0)
            long r2 = r8.toMillis(r0)
            r0 = 36599095661890973(0x8206af00070d9d, double:3.208753697084568E-306)
            long r0 = X.182.A01(r4, r6, r0)
            long r0 = r8.toMillis(r0)
            long r10 = java.lang.Math.min(r2, r0)
            goto L_0x0124
        L_0x02d9:
            X.2lr r1 = r0.A0f
            java.lang.Long r12 = r1.A05()
            X.2mD r0 = r0.A0e
            java.lang.Long r10 = r0.A03
            if (r12 == 0) goto L_0x02f9
            if (r10 == 0) goto L_0x00ef
            long r2 = r12.longValue()
            long r0 = r10.longValue()
            long r0 = java.lang.Math.max(r2, r0)
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            goto L_0x00ef
        L_0x02f9:
            if (r10 != 0) goto L_0x0311
            java.lang.Object r6 = r1.A0Y
            monitor-enter(r6)
            X.3Yt r0 = r1.A07     // Catch:{ all -> 0x037d }
            r10 = 0
            if (r0 == 0) goto L_0x0310
            long r1 = r0.A00     // Catch:{ all -> 0x037d }
            java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x037d }
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0310
            r10 = r3
        L_0x0310:
            monitor-exit(r6)
        L_0x0311:
            r12 = r10
            goto L_0x00ef
        L_0x0314:
            r6 = 0
            if (r12 != 0) goto L_0x0319
            if (r13 == 0) goto L_0x0346
        L_0x0319:
            com.instagram.common.session.UserSession r8 = r5.getSession()
            r0 = 2342156515320072225(0x208102f100050821, double:4.0600796093076946E-152)
            boolean r0 = X.182.A06(r4, r8, r0)
            if (r0 == 0) goto L_0x0368
            r5.A0D()
            com.instagram.common.session.UserSession r7 = r5.getSession()
            r0 = 36328323743300839(0x81106b00013ce7, double:3.0375164454571655E-306)
            boolean r0 = X.182.A06(r4, r7, r0)
            if (r0 == 0) goto L_0x0341
            android.view.View r0 = r5.mView
            if (r0 == 0) goto L_0x0341
            r0.performHapticFeedback(r2)
        L_0x0341:
            X.1FI r0 = X.1FI.A03
            r5.A0N(r0, r6)
        L_0x0346:
            if (r3 != 0) goto L_0x034a
            if (r13 == 0) goto L_0x0012
        L_0x034a:
            X.2kj r0 = r5.A0A()
            X.34a r0 = r0.A0O()
            X.2kn r0 = r0.A0O
            boolean r0 = r0.A0H()
            if (r0 != 0) goto L_0x0012
            X.2kj r0 = r5.A0A()
            X.34a r1 = r0.A0O()
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            r1.A0C(r6, r0)
            return
        L_0x0368:
            X.3Az r2 = r5.A0B
            if (r2 == 0) goto L_0x0346
            boolean r0 = r2.A0B()
            if (r0 != 0) goto L_0x0346
            X.2lj r1 = r2.A09
            X.DHQ r0 = new X.DHQ
            r0.<init>(r2)
            r1.A08(r0, r7)
            goto L_0x0346
        L_0x037d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227802jw.A0S(java.lang.String):void");
    }

    public final void EKl() {
        A0S("HOME_PRESS");
    }

    public final String getModuleName() {
        return AnonymousClass2kO.A00.getModuleName();
    }

    public final boolean onBackPressed() {
        ((AnonymousClass2k7) this.A0n.getValue()).A01.getValue();
        View view = this.mView;
        boolean z = this.A0Q;
        C227802jw r2 = A0A().A0x().A00;
        C238133Ar r0 = r2.mScrollingViewProxy;
        boolean z2 = true;
        if (r0 != null) {
            boolean COw = r0.COw();
            boolean A0B2 = r2.A0A().A0O().A0B();
            if (!COw || !A0B2) {
                z2 = false;
            }
        }
        AnonymousClass9LR r22 = new AnonymousClass9LR(this, 25);
        boolean z3 = false;
        if (view != null && !z && !z2) {
            r22.invoke("BACK_BUTTON_PRESS");
            z3 = true;
        }
        this.A0Q = false;
        return z3;
    }

    public final void onHiddenChanged(boolean z) {
        if (z) {
            C238213Az r2 = this.A0B;
            if (r2 != null && r2.A02.ordinal() == 1 && r2.A0B()) {
                C238213Az.A01(r2, AnonymousClass05K.A0C);
            }
            AnonymousClass57Q r1 = this.A0A;
            if (r1 != null) {
                r1.A07(false);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.2k6] */
    public C227802jw() {
        AnonymousClass9LY r6 = new AnonymousClass9LY(this, 31);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LY(new AnonymousClass9LY(this, 35), 36));
        this.A0n = new C227862kA(new AnonymousClass9LY(A002, 37), r6, new AnonymousClass9M1(49, (Object) null, A002), new 0Yh(AnonymousClass2k7.class));
        0Yh r4 = new 0Yh(AnonymousClass2kB.class);
        this.A0o = new C227862kA(new AnonymousClass9LY(this, 33), new AnonymousClass9LY(this, 34), new AnonymousClass9M1(48, (Object) null, this), r4);
        this.A0s = new AtomicBoolean(false);
        this.A0r = new Object();
        this.A0j = new C227872kC(this);
        this.A0q = new AnonymousClass2kE(this);
        this.A0k = new C227892kG(this);
        this.A0i = new C227902kH(this);
        this.A0t = C227642jf.A02(this);
        this.A0m = AnonymousClass0eN.A01(new AnonymousClass9LY(this, 30));
    }

    private final int A00() {
        int i;
        Context context = getContext();
        if (context != null) {
            C227872kC r1 = this.A0j;
            0qQ.A0B(r1, 1);
            int A002 = AnonymousClass3D4.A00(context) + 0;
            if (r1.A00.A0U) {
                i = context.getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding);
            } else {
                i = 0;
            }
            return A002 + i;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final View A01(1QK r2, C227802jw r3) {
        2ZX rootActivity = r3.getRootActivity();
        0qQ.A0C(rootActivity, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabController");
        return rootActivity.C3m(r2.toString());
    }

    private final C228232l0 A02(C228232l0 r5) {
        if (182.A06(0Tu.A05, getSession(), 2342161149590312860L)) {
            return A0A().A0k();
        }
        return r5;
    }

    public final C71162bE A08() {
        2Zg r0 = ((AnonymousClass2lI) A0A().A21.getValue()).A00;
        if (r0 != null) {
            return r0.C3W();
        }
        return null;
    }

    public final void A0D() {
        A0A().A0w().A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x039e, code lost:
        if (X.AnonymousClass1B1.A00(r2).A00(X.1B2.A0P) == false) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03c7, code lost:
        if (r3.A00 != 0) goto L_0x03c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03e9, code lost:
        if (r11 >= X.182.A01(r8, r2, 36599095666019761L)) goto L_0x03eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0150, code lost:
        if (r12 <= r5.A05) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01f5, code lost:
        if (r12 < r0) goto L_0x0152;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0213  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E() {
        /*
            r14 = this;
            X.2kj r0 = r14.A0A()
            X.2lG r6 = r0.A0R()
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x0048
            r5 = 1
            r6.A04 = r5
            X.57F r0 = r6.A08
            if (r0 == 0) goto L_0x0023
            com.google.common.collect.EvictingQueue r4 = r0.A00
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = "enter"
            X.Xa6 r0 = new X.Xa6
            r0.<init>(r1, r3)
            r4.add(r0)
        L_0x0023:
            boolean r0 = r6.A03
            if (r0 != 0) goto L_0x0048
            X.02m r4 = r6.A07
            int r0 = r6.A00
            int r3 = r0 + 1
            r6.A00 = r3
            long r0 = X.C228302lG.A0B
            r2 = 974460948(0x3a151814, float:5.687487E-4)
            r4.A0S(r2, r3, r0)
            com.google.common.collect.EvictingQueue r0 = r6.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0083
            java.lang.String r1 = "ENTER_HOME_COLD_START"
        L_0x0041:
            int r0 = r6.A00
            r4.markerPoint(r2, r0, r1)
            r6.A03 = r5
        L_0x0048:
            com.instagram.common.session.UserSession r2 = r14.getSession()
            X.0Tu r8 = X.0Tu.A05
            r0 = 36324402438090828(0x810cda0000304c, double:3.035036596252526E-306)
            boolean r0 = X.182.A06(r8, r2, r0)
            if (r0 == 0) goto L_0x0073
            com.instagram.common.session.UserSession r0 = r14.getSession()
            X.1Av r0 = X.1Au.A00(r0)
            long r2 = java.lang.System.currentTimeMillis()
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "last_home_visit_time"
            r1.E5c(r0, r2)
            r1.apply()
        L_0x0073:
            com.instagram.common.session.UserSession r2 = r14.getSession()
            r0 = 36324402438287438(0x810cda0003304e, double:3.035036596376863E-306)
            boolean r0 = X.182.A06(r8, r2, r0)
            if (r0 == 0) goto L_0x0093
            goto L_0x0086
        L_0x0083:
            java.lang.String r1 = "ENTER_HOME_WARM_START"
            goto L_0x0041
        L_0x0086:
            com.instagram.common.session.UserSession r0 = r14.getSession()     // Catch:{ Exception -> 0x0093 }
            X.2aO r1 = X.2aN.A00(r0)     // Catch:{ Exception -> 0x0093 }
            X.2aD r0 = X.2aD.A0Q     // Catch:{ Exception -> 0x0093 }
            r1.A04(r0)     // Catch:{ Exception -> 0x0093 }
        L_0x0093:
            boolean r0 = r14.A0f
            if (r0 == 0) goto L_0x00b4
            com.instagram.common.session.UserSession r2 = r14.getSession()
            r0 = 36317620685575540(0x8106af000d1574, double:3.030747788653932E-306)
            boolean r0 = X.182.A06(r8, r2, r0)
            if (r0 == 0) goto L_0x00b4
            r0 = 0
            r14.A0f = r0
            X.2kj r0 = r14.A0A()
            X.2rI r0 = r0.A0J()
            r0.notifyDataSetChangedSmart()
        L_0x00b4:
            boolean r0 = r14.A0P
            if (r0 != 0) goto L_0x0259
            com.instagram.common.session.UserSession r0 = r14.getSession()
            X.1OI r0 = X.1OH.A00(r0)
            java.lang.String r1 = "ENTERED_HOME"
            X.1OI.A05(r0, r1)
            com.instagram.common.session.UserSession r0 = r14.getSession()
            X.3G7 r0 = X.AnonymousClass3G6.A00(r0)
            X.AnonymousClass3G7.A02(r0, r1)
            com.instagram.common.session.UserSession r0 = r14.getSession()
            X.2ll r0 = X.C228482lk.A00(r0)
            X.C228492ll.A03(r0, r1)
            X.3GG r0 = r14.A09()
            X.3GH r7 = r0.A00()
            r10 = 1
            X.3GA r3 = r7.A0F
            X.19S r0 = X.19E.A01()
            r3.A00 = r0
            X.1Ng r2 = r3.A02
            java.lang.Class<X.2Ny> r1 = X.AnonymousClass2Ny.class
            X.1wn r0 = r3.A03
            r2.A01(r0, r1)
            X.AnonymousClass3GA.A02(r3)
            X.3GD r1 = r7.A07
            r6 = 0
            r1.A07 = r6
            X.Cvx r0 = r1.A04
            if (r0 == 0) goto L_0x010d
            r1.A04 = r0
            X.2kt r0 = r1.A0C
            if (r0 == 0) goto L_0x010a
            r0.EBt(r1)
        L_0x010a:
            X.AnonymousClass3GD.A03(r1)
        L_0x010d:
            com.instagram.common.session.UserSession r0 = r7.A06
            X.2jw r9 = r7.A0I
            X.C240063Jl.A00(r9, r0)
            boolean r0 = X.C240073Jm.A00
            X.C240073Jm.A00 = r6
            if (r0 == 0) goto L_0x012c
            X.3Ar r0 = r9.getScrollingViewProxy()
            android.view.ViewGroup r1 = r0.CEd()
            if (r1 == 0) goto L_0x012c
            X.FsI r0 = new X.FsI
            r0.<init>(r7)
            r1.post(r0)
        L_0x012c:
            X.34a r0 = r7.A09
            X.2kn r5 = r0.A0O
            X.4D6 r4 = r0.A0G
            X.0qQ.A0B(r4, r6)
            com.instagram.common.session.UserSession r11 = r5.A07
            X.1NN r0 = X.1NM.A00(r11)
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36607341999887926(0x820e2f00131636, double:3.213968714439179E-306)
            long r12 = X.182.A01(r8, r2, r0)
            r2 = 0
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x01de
            long r0 = r5.A05
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x0158
        L_0x0152:
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            r0 = 0
            r5.A0I(r4, r0, r1)
        L_0x0158:
            r5.A05 = r2
            r5.A04 = r2
            boolean r0 = r7.A02
            r9.A0T(r0)
            X.2lI r0 = r7.A0D
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x016c
            r9.A0B()
        L_0x016c:
            X.3Az r2 = r14.A0B
            if (r2 == 0) goto L_0x020f
            com.instagram.common.session.UserSession r0 = r14.getSession()
            X.2cc r0 = X.C71342cb.A00(r0)
            java.lang.String r1 = r0.A0F
            com.instagram.common.session.UserSession r0 = r14.getSession()
            X.2cc r0 = X.C71342cb.A00(r0)
            java.lang.String r7 = r0.A03()
            X.1QK r0 = X.1QK.A0C
            java.lang.String r0 = r0.toString()
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x01f9
            com.instagram.common.session.UserSession r3 = r2.A05
            r0 = 36317620685575540(0x8106af000d1574, double:3.030747788653932E-306)
            boolean r0 = X.182.A06(r8, r3, r0)
            if (r0 == 0) goto L_0x020f
            X.3Bd r0 = X.C238243Bc.A00(r3)
            if (r7 == 0) goto L_0x020f
            com.instagram.common.session.UserSession r3 = r0.A02
            r0 = 36880570640957777(0x8306af002b0151, double:3.3867596072551813E-306)
            java.lang.String r3 = X.182.A04(r8, r3, r0)
            int r0 = r3.length()
            if (r0 == 0) goto L_0x020f
            java.lang.String r1 = ","
            X.11S r0 = new X.11S
            r0.<init>(r1)
            java.util.List r1 = r0.A03(r3)
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r5 = r1.toArray(r0)
            java.lang.String[] r5 = (java.lang.String[]) r5
            int r4 = r5.length
            r3 = 0
        L_0x01cb:
            if (r3 >= r4) goto L_0x020f
            r1 = r5[r3]
            boolean r0 = r7.equals(r1)
            if (r0 != 0) goto L_0x01f9
            boolean r0 = X.00l.A0d(r7, r1, r6)
            if (r0 != 0) goto L_0x01f9
            int r3 = r3 + 1
            goto L_0x01cb
        L_0x01de:
            X.1NN r0 = X.1NM.A00(r11)
            com.instagram.common.session.UserSession r11 = r0.A00
            r0 = 36607341998970420(0x820e2f00051634, double:3.213968713858944E-306)
            long r12 = X.182.A01(r8, r11, r0)
            long r0 = r5.A04
            int r11 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r11 > 0) goto L_0x0158
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 >= 0) goto L_0x0158
            goto L_0x0152
        L_0x01f9:
            boolean r3 = r2.A0B()
            X.3B0 r0 = r2.A02
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0437
            if (r1 != r10) goto L_0x020f
            if (r3 == 0) goto L_0x020f
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.C238213Az.A01(r2, r0)
        L_0x020f:
            X.57Q r2 = r14.A0A
            if (r2 == 0) goto L_0x0259
            r2.A0E = r6
            java.lang.String r1 = r2.A07
            if (r1 == 0) goto L_0x0259
            java.util.concurrent.ConcurrentHashMap r0 = r2.A0O
            java.lang.Object r1 = r0.get(r1)
            X.HLf r0 = X.C54622HLf.PAUSED
            if (r1 != r0) goto L_0x0259
            X.2wr r0 = r2.A0K
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x022d
            r2.A0B = r10
        L_0x022d:
            X.2jw r0 = r2.A06
            if (r0 == 0) goto L_0x0238
            android.view.View r0 = r0.A01
            if (r0 == 0) goto L_0x0238
            r0.setVisibility(r6)
        L_0x0238:
            X.2jw r1 = r2.A06
            if (r1 == 0) goto L_0x024c
            com.instagram.common.ui.base.IgSimpleImageView r0 = r1.A03
            if (r0 == 0) goto L_0x0243
            r0.setVisibility(r6)
        L_0x0243:
            com.instagram.common.ui.base.IgTextView r1 = r1.A04
            if (r1 == 0) goto L_0x024c
            r0 = 8
            r1.setVisibility(r0)
        L_0x024c:
            X.2jw r0 = r2.A06
            if (r0 == 0) goto L_0x0259
            float r1 = r2.A00
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r0.A0F
            if (r0 == 0) goto L_0x0259
            r0.A09(r1)
        L_0x0259:
            r14.A0B()
            boolean r0 = r14.A0P
            if (r0 != 0) goto L_0x02f1
            X.3GG r0 = r14.A09()
            X.3GH r3 = r0.A00()
            X.3kW r6 = r3.A03
            X.2jw r4 = r3.A0I
            X.2kj r5 = r4.A0A()
            X.3GF r2 = r5.A0q
            if (r2 != 0) goto L_0x0283
            X.2jw r0 = r5.A20
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            com.instagram.common.session.UserSession r0 = r5.A1t
            X.3GF r2 = new X.3GF
            r2.<init>(r1, r0)
            r5.A0q = r2
        L_0x0283:
            r6.AAX(r2)
            com.instagram.common.session.UserSession r2 = r3.A06
            X.2cc r5 = X.C71342cb.A00(r2)
            X.3G8 r6 = r3.A0C
            X.1Hb r1 = X.AnonymousClass1HI.A02
            X.3K1 r0 = new X.3K1
            r0.<init>(r6)
            r1.Eym(r0)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.1OP r0 = X.1OP.$redex_init_class
            r6 = 0
            X.3K2 r7 = X.AnonymousClass3K2.A04(r1)
            if (r7 != 0) goto L_0x0424
            X.1Hb r1 = X.AnonymousClass1HI.A02
            X.3K6 r0 = new X.3K6
            r0.<init>(r3)
            r1.Eyo(r0)
        L_0x02af:
            X.1FI r1 = r4.A09
            X.0qQ.A0B(r1, r6)
            X.1FI r7 = X.1FI.A0F
            if (r1 == r7) goto L_0x02f2
            X.1FI r0 = X.1FI.A05
            if (r1 == r0) goto L_0x02f2
            X.2lj r5 = r3.A0G
            X.1FI r1 = r3.A08
            r0 = 0
            r5.A0A(r1, r0, r0)
            X.2kC r0 = r3.A0H
            X.2jw r0 = r0.A00
            r0.A09 = r7
        L_0x02ca:
            X.3K8 r1 = X.AnonymousClass3K7.A00(r2)
            X.4DU r0 = X.AnonymousClass2kO.A00
            r1.A00(r0)
            X.1wY.A00(r2)
            r4.requireActivity()
            X.11Z.A00()
            X.35W r3 = r3.A0J
            X.35f r2 = r3.A02
            java.lang.Class<X.3K9> r1 = X.AnonymousClass3K9.class
            X.1wn r0 = r3.A0I
            r2.A99(r0, r1)
            java.lang.Class<X.3KA> r1 = X.AnonymousClass3KA.class
            X.1wn r0 = r3.A0F
            r2.A99(r0, r1)
            r0 = 1
            r14.A0P = r0
        L_0x02f1:
            return
        L_0x02f2:
            r0 = 36317620686558588(0x8106af001c157c, double:3.030747789275616E-306)
            boolean r0 = X.182.A06(r8, r2, r0)
            if (r0 == 0) goto L_0x02ca
            java.lang.String r1 = r5.A05
            X.1QK r0 = X.1QK.A0C
            java.lang.String r0 = r0.toString()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x02ca
            java.lang.String r0 = r5.A03()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x02ca
            java.lang.String r1 = r5.A03()
            java.lang.String r0 = "feed_timeline"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x02ca
            r0 = 36880570640105807(0x8306af001e014f, double:3.386759606716392E-306)
            java.lang.String r1 = X.182.A04(r8, r2, r0)
            java.lang.String r9 = ","
            X.11S r0 = new X.11S
            r0.<init>(r9)
            java.util.List r1 = r0.A03(r1)
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r12 = r1.toArray(r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r11 = r12.length
            r10 = 0
        L_0x0342:
            if (r10 >= r11) goto L_0x0355
            r1 = r12[r10]
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0352
            r7.add(r1)
        L_0x0352:
            int r10 = r10 + 1
            goto L_0x0342
        L_0x0355:
            r0 = 36880570640761168(0x8306af00280150, double:3.386759607130845E-306)
            java.lang.String r1 = X.182.A04(r8, r2, r0)
            X.11S r0 = new X.11S
            r0.<init>(r9)
            java.util.List r1 = r0.A03(r1)
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r11 = r1.toArray(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r10 = r11.length
            r9 = 0
        L_0x0374:
            if (r9 >= r10) goto L_0x0387
            r1 = r11[r9]
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0384
            r6.add(r1)
        L_0x0384:
            int r9 = r9 + 1
            goto L_0x0374
        L_0x0387:
            r0 = 36317620686624125(0x8106af001d157d, double:3.0307477893170616E-306)
            boolean r0 = X.182.A06(r8, r2, r0)
            if (r0 == 0) goto L_0x03a0
            long r0 = X.AnonymousClass1B0.A02
            X.1B0 r1 = X.AnonymousClass1B1.A00(r2)
            X.1B2 r0 = X.1B2.A0P
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x03c9
        L_0x03a0:
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03b2
            java.lang.String r0 = r5.A03()
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L_0x03c9
        L_0x03b2:
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03c4
            java.lang.String r0 = r5.A03()
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x03c9
        L_0x03c4:
            int r0 = r3.A00
            r13 = 0
            if (r0 == 0) goto L_0x03ca
        L_0x03c9:
            r13 = 1
        L_0x03ca:
            com.facebook.common.time.AwakeTimeSinceBootClock r0 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            long r11 = r0.now()
            long r0 = r3.A01
            long r11 = r11 - r0
            r0 = 36599095666019761(0x8206af00460db1, double:3.20875369969563E-306)
            long r9 = X.182.A01(r8, r2, r0)
            r6 = 0
            int r5 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x03eb
            long r5 = X.182.A01(r8, r2, r0)
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            r7 = 1
            if (r0 < 0) goto L_0x03ec
        L_0x03eb:
            r7 = 0
        L_0x03ec:
            r0 = 36317620687082881(0x8106af00241581, double:3.030747789607181E-306)
            boolean r0 = X.182.A06(r8, r2, r0)
            if (r0 == 0) goto L_0x0418
            X.3B0 r6 = X.AnonymousClass3GH.A00(r3)
        L_0x03fb:
            X.3B0 r5 = X.AnonymousClass3B0.FORCE_FEED_REFRESH
            X.3B0 r1 = X.AnonymousClass3B0.FORCE_FEED_AND_STORIES_REFRESH
            X.3B0 r0 = X.AnonymousClass3B0.FORCE_STORIES_REFRESH
            X.3B0[] r0 = new X.AnonymousClass3B0[]{r5, r1, r0}
            if (r7 != 0) goto L_0x02ca
            if (r13 != 0) goto L_0x02ca
            boolean r0 = X.03t.A0O(r6, r0)
            if (r0 == 0) goto L_0x02ca
            X.34a r1 = r3.A09
            X.1FI r0 = X.1FI.A0M
            X.AnonymousClass3GH.A01(r0, r1, r6, r3)
            goto L_0x02ca
        L_0x0418:
            X.3Az r0 = r3.A0E
            if (r0 == 0) goto L_0x0421
            X.3B0 r6 = r0.A06()
            goto L_0x03fb
        L_0x0421:
            X.3B0 r6 = X.AnonymousClass3B0.DEFAULT_BEHAVIOR
            goto L_0x03fb
        L_0x0424:
            boolean r0 = r7.A0Z()
            if (r0 == 0) goto L_0x02af
            X.3BQ r1 = r7.A0H
            X.3BQ r0 = X.AnonymousClass3BQ.FEED_ITEM_HEADER
            if (r1 != r0) goto L_0x02af
            X.4DU r0 = X.AnonymousClass2kO.A00
            r7.A0X(r0)
            goto L_0x02af
        L_0x0437:
            X.2lj r0 = r2.A08
            X.2lo r0 = r0.A0i
            java.util.List r0 = r0.A04
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x020f
            if (r3 == 0) goto L_0x020f
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.C238213Az.A00(r2, r0)
            goto L_0x020f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227802jw.A0E():void");
    }

    public final void A0F() {
        C228302lG A0R2 = A0A().A0R();
        if (A0R2.A04) {
            A0R2.A04 = false;
            AnonymousClass57F r0 = A0R2.A08;
            if (r0 != null) {
                r0.A00.add(new C21398Xa6(System.currentTimeMillis(), "exit"));
            }
            02m r3 = A0R2.A07;
            r3.markerPoint(974475790, A0R2.A01, "EXIT_HOME");
            r3.markerEnd(974475790, A0R2.A01, 2);
            A0R2.A05 = false;
            r3.markerPoint(974460948, A0R2.A00, "EXIT_HOME");
            r3.markerEnd(974460948, A0R2.A00, 2);
            A0R2.A03 = false;
            A0R2.A02 = "";
        }
        1OI A002 = 1OH.A00(getSession());
        1OI.A05(A002, "EXITED_HOME");
        1OI.A04(A002, "EXITED_HOME");
        A002.A0D(AnonymousClass05K.A0N);
        AnonymousClass3G7 A003 = AnonymousClass3G6.A00(getSession());
        AnonymousClass3G7.A02(A003, "EXITED_HOME");
        AnonymousClass3G7.A01(A003, "EXITED_HOME");
        C228492ll.A03(C228482lk.A00(getSession()), "EXITED_HOME");
        if (this.A0P) {
            AnonymousClass3GH A004 = A09().A00();
            C3018960m.A00();
            HashMap hashMap = ((AnonymousClass6YM) A004.A06.A01(AnonymousClass6YM.class, AnonymousClass6YN.A00)).A00;
            Iterator it = hashMap.values().iterator();
            if (it.hasNext()) {
                0qQ.A07(it.next());
                throw new NullPointerException("isTaskExecuted");
            }
            hashMap.clear();
            AnonymousClass3GA r32 = A004.A0F;
            r32.A02.A02(r32.A03, AnonymousClass2Ny.class);
            Map map = r32.A06;
            if (!map.isEmpty()) {
                HashMap hashMap2 = new HashMap(map);
                map.clear();
                for (AnonymousClass3Q2 A005 : hashMap2.values()) {
                    AnonymousClass3GA.A00(A005, r32);
                }
            }
            C262224Cq r1 = r32.A00;
            if (r1 == null) {
                0qQ.A0F("mediaPlacerScope");
                throw AnonymousClass00P.createAndThrow();
            }
            19E.A05((CancellationException) null, r1);
            AnonymousClass3GD r2 = A004.A07;
            r2.A07 = true;
            r2.A0A.removeMessages(3);
            C228162kt r02 = r2.A0C;
            if (r02 != null) {
                r02.FJ2(r2);
            }
            Dialog dialog = r2.A01;
            if (dialog != null) {
                dialog.dismiss();
            }
            C227762js r22 = A004.A05;
            boolean z = false;
            if (r22.A01 >= r22.A00) {
                z = true;
            }
            A004.A02 = z;
            C227802jw r8 = A004.A0I;
            r22.A09(r8.getScrollingViewProxy());
            C249883kW r7 = A004.A03;
            C228062kj A0A2 = r8.A0A();
            AnonymousClass3GF r23 = A0A2.A0q;
            if (r23 == null) {
                r23 = new AnonymousClass3GF(A0A2.A20.requireActivity(), A0A2.A1t);
                A0A2.A0q = r23;
            }
            r7.EEn(r23);
            A004.A00 = r8.getScrollingViewProxy().B6L();
            A004.A01 = AwakeTimeSinceBootClock.INSTANCE.now() - 500;
            C238213Az r12 = this.A0B;
            if (r12 != null && r12.A02.ordinal() == 1 && r12.A0B()) {
                C238213Az.A01(r12, AnonymousClass05K.A0C);
            }
            AnonymousClass57Q r03 = this.A0A;
            if (r03 != null) {
                r03.A07(false);
            }
        }
        A03(this);
        if (this.A0P) {
            1wY.A00(getSession());
            11Z.A00();
            11Z.A00();
            Future future = ((AnonymousClass3G8) ((AnonymousClass2k7) this.A0n.getValue()).A03.getValue()).A00;
            if (future != null) {
                future.cancel(true);
            }
            C238183Aw A0Y2 = A0A().A0Y();
            String str = A0A().A1x.A01;
            String str2 = A0A().A0o().A0J;
            if (str2 == null) {
                str2 = "";
            }
            A0Y2.A00(str, AnonymousClass05K.A00, str2);
            AnonymousClass35W A0p2 = A0A().A0p();
            A0p2.A02.EDz(A0p2.A0I, AnonymousClass3K9.class);
            this.A0P = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(X.1Xj r10, com.instagram.feed.ui.state.IntentAwareAdPivotState r11, X.C54077Gz1 r12, java.util.List r13) {
        /*
            r9 = this;
            X.3GG r0 = r9.A09()
            X.HnZ r3 = r0.A01()
            r4 = 1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.4I5 r1 = X.AnonymousClass59V.A00
            int r0 = r12.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.A01(r0)
            java.lang.String r5 = "Required value was null."
            if (r0 == 0) goto L_0x00a0
            com.instagram.common.session.UserSession r7 = r3.A00
            X.0Tu r6 = X.0Tu.A06
            r0 = 36312887638230453(0x810261007205b5, double:3.0277545904544473E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = r10.getId()
            if (r0 == 0) goto L_0x00ba
            r2.add(r0)
        L_0x0036:
            X.To7 r8 = new X.To7
            r8.<init>()
            com.instagram.common.session.UserSession r6 = r3.A00
            X.0jB r0 = X.C55032Hb3.A00(r6, r11, r12)
            r8.A02(r0)
            java.lang.String r0 = "feed_contextual_ads_chain"
            X.Del r5 = X.C49262Es5.A00(r0)
            r0 = 966(0x3c6, float:1.354E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.A06 = r0
            X.2jw r7 = r3.A02
            android.content.Context r1 = r7.requireContext()
            r0 = 2131964411(0x7f1331fb, float:1.9565603E38)
            java.lang.String r0 = r1.getString(r0)
            r5.A07 = r0
            X.2kv r0 = r3.A01
            java.lang.String r0 = r0.A01
            r5.A0A = r0
            r5.A09(r2)
            java.lang.String r0 = r10.getId()
            r5.A08 = r0
            r5.A08(r8)
            r3 = 0
            android.os.Bundle r0 = X.C55031Hb2.A00(r6, r10, r11, r3, r12)
            r5.A01 = r0
            X.0Tu r2 = X.0Tu.A06
            r0 = 36312887646225951(0x81026100ec061f, double:3.0277545955108325E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0089
            r5.A0C = r4
        L_0x0089:
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            X.6Yo r1 = new X.6Yo
            r1.<init>(r0, r6)
            instagram.features.feed.fragment.ContextualFeedFragment r0 = r5.A07()
            r1.A0B(r3, r0)
            r1.A08()
            r1.A04()
            return
        L_0x00a0:
            java.util.Iterator r1 = r13.iterator()
        L_0x00a4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r1.next()
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x00c0
            r2.add(r0)
            goto L_0x00a4
        L_0x00ba:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x00c0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227802jw.A0I(X.1Xj, com.instagram.feed.ui.state.IntentAwareAdPivotState, X.Gz1, java.util.List):void");
    }

    public final void A0N(1FI r2, Map map) {
        A0A().A0w().A02(r2, map);
    }

    public final void A0R(String str) {
        C228182kv r0 = A0A().A1x;
        if (str != null) {
            r0.A01 = str;
            A0A().A0T().A00 = false;
            A0A().A0H().A06();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0T(boolean z) {
        FragmentActivity activity = getActivity();
        Activity rootActivity = getRootActivity();
        if (activity != null && rootActivity != null) {
            if (Cda()) {
                C226112fe.A0B.A04(rootActivity, new C57429IaZ(activity, this, z), true);
            } else {
                A0A().A0W().A01(activity, z, 0);
            }
        }
    }

    public final void A0V(boolean z, boolean z2) {
        FragmentActivity activity;
        AnonymousClass37D A012;
        AnonymousClass3AD r0;
        C238143As r02;
        if (A0W()) {
            UserSession A052 = getSession();
            0qQ.A0B(A052, 0);
            if (182.A06(0Tu.A05, A052, 36323406006135952L)) {
                return;
            }
        }
        if (!(this.mView == null || (r02 = (C238143As) getScrollingViewProxy()) == null)) {
            r02.setIsLoading(z);
        }
        if (!z) {
            boolean z3 = false;
            this.A0R = false;
            this.A0M = false;
            if (!((AnonymousClass2lI) A0A().A21.getValue()).A01() || !this.A0P) {
                z3 = true;
            }
            this.A0f = z3;
        } else {
            if (!(!182.A06(0Tu.A05, getSession(), 36317620688459146L) || (activity = getActivity()) == null || (A012 = AnonymousClass37D.A00.A01(activity)) == null)) {
                A012.A0B();
            }
        }
        if (z2 && (r0 = this.A0G) != null) {
            r0.setIsLoading(z);
        }
    }

    public final boolean A0W() {
        FragmentActivity activity;
        FragmentActivity activity2 = getActivity();
        if (activity2 == null || activity2.isFinishing() || ((activity = getActivity()) != null && activity.isDestroyed())) {
            return true;
        }
        return false;
    }

    public final boolean A0X() {
        C2357130x r0;
        C20218WnI wnI;
        AnonymousClass41J BQP;
        C20218WnI wnI2 = A0A().A0D().A00;
        boolean z = true;
        if (wnI2 == null || !wnI2.A00.A09()) {
            z = false;
        }
        if (z || ((r0 = this.A0I) != null && (BQP = r0.BQP()) != null && BQP.Ca5())) {
            return true;
        }
        C228062kj A0A2 = A0A();
        AnonymousClass2xI r2 = A0A2.A0E;
        if (r2 == null) {
            UserSession userSession = A0A2.A1t;
            r2 = new AnonymousClass2xI(userSession, new AnonymousClass41K(userSession));
            A0A2.A0E = r2;
        }
        C20218WnI wnI3 = r2.A00;
        if (wnI3 != null && wnI3.A00.A09()) {
            return true;
        }
        AnonymousClass2xI r02 = this.A0b;
        if (r02 != null && (wnI = r02.A00) != null && wnI.A00.A09()) {
            return true;
        }
        C228062kj A0A3 = A0A();
        AnonymousClass2xI r03 = A0A3.A0D;
        if (r03 == null) {
            UserSession userSession2 = A0A3.A1t;
            AnonymousClass41L r1 = A0A3.A0G;
            if (r1 == null) {
                r1 = new AnonymousClass41L(AnonymousClass2kO.A00, userSession2);
                A0A3.A0G = r1;
            }
            r03 = new AnonymousClass2xI(userSession2, r1);
            A0A3.A0D = r03;
        }
        C20218WnI wnI4 = r03.A00;
        if (wnI4 == null || !wnI4.A00.A09()) {
            return false;
        }
        return true;
    }

    public final C227762js BD0() {
        return A0A().A03();
    }

    public final boolean CUF() {
        return 182.A06(0Tu.A05, getSession(), 36317560555443537L);
    }

    public final boolean Cda() {
        return 182.A06(0Tu.A05, getSession(), 36317560555443537L);
    }

    public final void DqH() {
        AnonymousClass358.A00(A0A().A0W(), false);
    }

    public final void afterOnDestroy() {
        super.afterOnDestroy();
        C228062kj A0A2 = A0A();
        unregisterLifecycleListener(A0A2.A0M());
        AnonymousClass35K r3 = A0A2.A0N;
        if (r3 == null) {
            r3 = new AnonymousClass35K(A0A2.A20.requireActivity(), A0A2.A1t, A0A2.A0i());
            A0A2.A0N = r3;
        }
        unregisterLifecycleListener(r3);
        unregisterLifecycleListener(A0A2.A0E());
        unregisterLifecycleListener(A0A2.A0c());
        unregisterLifecycleListener(A0A2.A0S());
        unregisterLifecycleListener(A0A2.A0j());
        unregisterLifecycleListener(A0A2.A0H());
        AnonymousClass35S r32 = A0A2.A0f;
        if (r32 == null) {
            r32 = new AnonymousClass35S(A0A2.A1t, A0A2.A0O(), A0A2.A20);
            A0A2.A0f = r32;
        }
        unregisterLifecycleListener(r32);
        AnonymousClass35T r2 = A0A2.A0g;
        if (r2 == null) {
            r2 = new AnonymousClass35T(A0A2.A1t, A0A2.A20);
            A0A2.A0g = r2;
        }
        unregisterLifecycleListener(r2);
        AnonymousClass35U r33 = A0A2.A0h;
        if (r33 == null) {
            r33 = new AnonymousClass35U(A0A2.A1t, A0A2.A0J(), A0A2.A1w);
            A0A2.A0h = r33;
        }
        unregisterLifecycleListener(r33);
        unregisterLifecycleListener(A0A2.A0o());
        unregisterLifecycleListener(A0A2.A0p());
        unregisterLifecycleListener(A0A2.A0r());
        unregisterLifecycleListener(A0A2.A0O());
        AnonymousClass364 r34 = A0A2.A0n;
        if (r34 == null) {
            r34 = new AnonymousClass364(A0A2.A1t, A0A2.A0J(), A0A2.A20);
            A0A2.A0n = r34;
        }
        unregisterLifecycleListener(r34);
        unregisterLifecycleListener(A0A2.A0y());
        unregisterLifecycleListener(A0A2.A0d());
        AnonymousClass36C r22 = A0A2.A0j;
        if (r22 == null) {
            r22 = new AnonymousClass36C(A0A2.A1t, A0A2.A0J());
            A0A2.A0j = r22;
        }
        unregisterLifecycleListener(r22);
        AnonymousClass36J r5 = A0A2.A0X;
        if (r5 == null) {
            r5 = new AnonymousClass36J(A0A2.A1s, A0A2.A20, A0A2.A1t, A0A2.A1v.Bbm());
            A0A2.A0X = r5;
        }
        unregisterLifecycleListener(r5);
        unregisterLifecycleListener(A0A2.A0v());
        AnonymousClass36K r35 = A0A2.A0J;
        if (r35 == null) {
            r35 = new AnonymousClass36K(A0A2.A20, A0A2.A0J(), A0A2.A0J());
            A0A2.A0J = r35;
        }
        unregisterLifecycleListener(r35);
        unregisterLifecycleListener(A0A2.A0g());
        unregisterLifecycleListener(A0A2.A0P());
        unregisterLifecycleListener(A0A2.A0L());
        unregisterLifecycleListener(A0A2.A0f());
        AnonymousClass36L r23 = A0A2.A0d;
        if (r23 == null) {
            r23 = new AnonymousClass36L(A0A2.A20, A0A2.A1t);
            A0A2.A0d = r23;
        }
        unregisterLifecycleListener(r23);
        unregisterLifecycleListener(A0A2.A0z());
        AnonymousClass36Y r1 = A0A2.A0p;
        if (r1 == null) {
            r1 = new AnonymousClass36Y(A0A2.A02());
            A0A2.A0p = r1;
        }
        unregisterLifecycleListener(r1);
        unregisterLifecycleListener(A0A().A0h());
        unregisterLifecycleListener(A0A().A0P());
        unregisterLifecycleListener(A0A().A0p());
        C232692uG r0 = this.A0Z;
        if (r0 != null) {
            unregisterLifecycleListener(r0);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 11) {
                2ZX rootActivity = getRootActivity();
                0qQ.A0C(rootActivity, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabController");
                rootActivity.ETc(1QK.A0E.toString());
            }
        } else if (i != 4921 && i != 4928) {
        } else {
            if ((i2 == 1 || i2 == 2) && intent != null) {
                String stringExtra = intent.getStringExtra("ARG_MEDIA_ID");
                AnonymousClass2rI A0J2 = A0A().A0J();
                if (stringExtra != null) {
                    for (1Xj r6 : A0J2.BQW()) {
                        String id = r6.getId();
                        if (id != null && (stringExtra.equals(id) || 0qQ.A0K(AnonymousClass3VO.A02(stringExtra), AnonymousClass3VO.A02(id)))) {
                            UserSession A052 = getSession();
                            UserSession A053 = getSession();
                            0qQ.A0B(A053, 0);
                            C64547Ldo ldo = new C64547Ldo();
                            Integer num = AnonymousClass05K.A01;
                            LAG A002 = C246353eS.A00(AnonymousClass818.IG_REEL_IN_FEED_OVERFLOW_MENU, ldo, A053, r6, num);
                            Context requireContext = requireContext();
                            if (i2 == 1) {
                                num = AnonymousClass05K.A00;
                            }
                            C246353eS.A03(requireContext, A002, A052, num);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v1, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v4, resolved type: X.4DJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v177, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r72v0, resolved type: X.2jw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v228, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: X.07Z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v320, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v90, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v113, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v260, resolved type: X.2vw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v261, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v138, resolved type: X.3CI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v139, resolved type: X.2wL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v276, resolved type: X.IXr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v335, resolved type: X.HEX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v171, resolved type: X.2wL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v336, resolved type: X.2wU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v14, resolved type: X.2wU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v15, resolved type: X.2wL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v16, resolved type: X.HEX} */
    /* JADX WARNING: type inference failed for: r44v4, types: [X.30n, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v83, types: [X.32y, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v24, types: [X.FRM, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v172, types: [X.Ez9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v173, types: [X.Ez9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v176, types: [X.Ez9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v20, types: [X.FRM, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v206, types: [X.2le, X.2lf] */
    /* JADX WARNING: type inference failed for: r4v133, types: [X.2vU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v277 */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x10bf, code lost:
        if (r12 != false) goto L_0x10c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x1112, code lost:
        if (r0 != null) goto L_0x1114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01c2, code lost:
        if (X.182.A06(r2, A05(), 36328151945329634L) != false) goto L_0x01c4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0358 A[Catch:{ all -> 0x172f }] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x038c A[Catch:{ all -> 0x172f }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0393 A[Catch:{ all -> 0x1674, all -> 0x1773 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x039d A[Catch:{ all -> 0x1674, all -> 0x1773 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03bb A[Catch:{ all -> 0x1674, all -> 0x1773 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03e4 A[Catch:{ all -> 0x1674, all -> 0x1773 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0404 A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0455 A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0477 A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0655 A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0675 A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0676 A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x06ce A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x06fc A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x071b A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x072e A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0753 A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0759 A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x07aa A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x07ec A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0844 A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x084a A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0860 A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0862 A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0887 A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x08a6 A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x08b4 A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0904 A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0934 A[Catch:{ all -> 0x171e }] */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x10d2 A[SYNTHETIC, Splitter:B:400:0x10d2] */
    /* JADX WARNING: Removed duplicated region for block: B:517:0x1485 A[Catch:{ all -> 0x1674, all -> 0x1773 }] */
    /* JADX WARNING: Removed duplicated region for block: B:520:0x14c2 A[Catch:{ all -> 0x1674, all -> 0x1773 }] */
    /* JADX WARNING: Removed duplicated region for block: B:523:0x14d8 A[Catch:{ all -> 0x1674, all -> 0x1773 }] */
    /* JADX WARNING: Removed duplicated region for block: B:526:0x14ea A[Catch:{ all -> 0x1674, all -> 0x1773 }] */
    /* JADX WARNING: Removed duplicated region for block: B:529:0x1515 A[Catch:{ all -> 0x1674, all -> 0x1773 }] */
    /* JADX WARNING: Removed duplicated region for block: B:532:0x1539 A[Catch:{ all -> 0x1674, all -> 0x1773 }] */
    /* JADX WARNING: Removed duplicated region for block: B:535:0x154d A[Catch:{ all -> 0x1674, all -> 0x1773 }] */
    /* JADX WARNING: Removed duplicated region for block: B:538:0x156e A[Catch:{ all -> 0x1674, all -> 0x1773 }] */
    /* JADX WARNING: Removed duplicated region for block: B:541:0x159b A[Catch:{ all -> 0x1674, all -> 0x1773 }] */
    /* JADX WARNING: Removed duplicated region for block: B:544:0x15b4 A[Catch:{ all -> 0x1674, all -> 0x1773 }] */
    /* JADX WARNING: Removed duplicated region for block: B:547:0x15de A[Catch:{ all -> 0x1674, all -> 0x1773 }] */
    /* JADX WARNING: Removed duplicated region for block: B:558:0x1665  */
    /* JADX WARNING: Removed duplicated region for block: B:609:0x1716 A[SYNTHETIC, Splitter:B:609:0x1716] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0337 A[Catch:{ all -> 0x1674, all -> 0x1773 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r75) {
        /*
            r74 = this;
            r0 = -93112574(0xfffffffffa733702, float:-3.1571096E35)
            int r34 = X.AnonymousClass0fD.A02(r0)
            r26 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)
            if (r0 == 0) goto L_0x0017
            r1 = -1363947897(0xffffffffaeb3ce87, float:-8.176664E-11)
            java.lang.String r0 = "MainFeedFragment.onCreate"
            X.0fS.A01(r0, r1)
        L_0x0017:
            r1 = r74
            r0 = r75
            super.onCreate(r0)     // Catch:{ all -> 0x1773 }
            android.content.Context r30 = r1.requireContext()     // Catch:{ all -> 0x1773 }
            androidx.fragment.app.FragmentActivity r20 = r1.requireActivity()     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r4 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.4DU r31 = X.AnonymousClass2kO.A00     // Catch:{ all -> 0x1773 }
            X.2kR r3 = new X.2kR     // Catch:{ all -> 0x1773 }
            r2 = r30
            r0 = r31
            r3.<init>(r2, r4, r0)     // Catch:{ all -> 0x1773 }
            r1.A0a = r3     // Catch:{ all -> 0x1773 }
            X.0wX r33 = X.C61170le.A00     // Catch:{ all -> 0x1773 }
            X.18g r3 = X.C638918c.A01(r33)     // Catch:{ all -> 0x1773 }
            java.lang.String r2 = "MAIN_FRAGMENT_ONCREATE_START"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r3.A02     // Catch:{ all -> 0x1773 }
            r3.A0O(r0, r2)     // Catch:{ all -> 0x1773 }
            X.2kT r4 = X.AnonymousClass2kS.A02     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r3 = r1.getSession()     // Catch:{ all -> 0x1773 }
            monitor-enter(r4)     // Catch:{ all -> 0x1773 }
            java.lang.String r0 = "QpLoginInterstitialInitializer.init"
            X.0lq.A02(r0)     // Catch:{ all -> 0x176a }
            if (r3 == 0) goto L_0x008c
            r0 = 41
            X.9LD r2 = new X.9LD     // Catch:{ all -> 0x0087 }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0087 }
            java.lang.Class<X.2kS> r0 = X.AnonymousClass2kS.class
            java.lang.Object r2 = r3.A01(r0, r2)     // Catch:{ all -> 0x0087 }
            X.2kS r2 = (X.AnonymousClass2kS) r2     // Catch:{ all -> 0x0087 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0087 }
            r0.<init>(r1)     // Catch:{ all -> 0x0087 }
            r2.A00 = r0     // Catch:{ all -> 0x0087 }
            X.14i r0 = X.14i.A08     // Catch:{ all -> 0x0087 }
            X.15Y r0 = X.15Y.A03     // Catch:{ all -> 0x0087 }
            X.14i.A03(r0, r2)     // Catch:{ all -> 0x0087 }
            X.0wX r0 = r3.A03     // Catch:{ all -> 0x0087 }
            android.content.Context r0 = r0.A06()     // Catch:{ all -> 0x0087 }
            X.2bK r2 = new X.2bK     // Catch:{ all -> 0x0087 }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0087 }
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1q     // Catch:{ all -> 0x0087 }
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)     // Catch:{ all -> 0x0087 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x0087 }
            r2.A05(r1, r0)     // Catch:{ all -> 0x0087 }
            goto L_0x008c
        L_0x0087:
            r0 = move-exception
            X.0lq.A01()     // Catch:{ all -> 0x176a }
            throw r0     // Catch:{ all -> 0x176a }
        L_0x008c:
            X.0lq.A01()     // Catch:{ all -> 0x176a }
            monitor-exit(r4)     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x1773 }
            r3 = 36323672293649789(0x810c3000002d7d, double:3.034574849967957E-306)
            boolean r0 = X.182.A06(r2, r0, r3)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x00ab
            android.os.Bundle r0 = r1.requireArguments()     // Catch:{ all -> 0x1773 }
            java.lang.String r0 = X.C228022kf.A00(r0)     // Catch:{ all -> 0x1773 }
            r1.A0K = r0     // Catch:{ all -> 0x1773 }
        L_0x00ab:
            java.lang.String r3 = "MainFeedFragment.onCreate:initViewLayerDependencyProvider"
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x00b9
            r0 = -958267411(0xffffffffc6e1ffed, float:-28927.963)
            X.0fS.A01(r3, r0)     // Catch:{ all -> 0x1773 }
        L_0x00b9:
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1759 }
            r3 = 36327829822126820(0x810ff800023ae4, double:3.037204087717855E-306)
            boolean r0 = X.182.A06(r2, r0, r3)     // Catch:{ all -> 0x1759 }
            java.lang.String r23 = "feedSession"
            r3 = 0
            if (r0 == 0) goto L_0x00d2
            r1.getSession()     // Catch:{ all -> 0x1759 }
            A04(r1)     // Catch:{ all -> 0x1759 }
            goto L_0x00ef
        L_0x00d2:
            X.2kR r6 = r1.A0a     // Catch:{ all -> 0x1759 }
            if (r6 != 0) goto L_0x00de
            X.0qQ.A0F(r23)     // Catch:{ all -> 0x1759 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x1759 }
            throw r0     // Catch:{ all -> 0x1759 }
        L_0x00de:
            X.2kC r5 = r1.A0j     // Catch:{ all -> 0x1759 }
            X.0eM r0 = r1.A0n     // Catch:{ all -> 0x1759 }
            java.lang.Object r4 = r0.getValue()     // Catch:{ all -> 0x1759 }
            X.2k7 r4 = (X.AnonymousClass2k7) r4     // Catch:{ all -> 0x1759 }
            X.2kj r0 = new X.2kj     // Catch:{ all -> 0x1759 }
            r0.<init>(r6, r4, r5, r1)     // Catch:{ all -> 0x1759 }
            r1.A0e = r0     // Catch:{ all -> 0x1759 }
        L_0x00ef:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x00fb
            r0 = -262949339(0xfffffffff053b625, float:-2.6208615E29)
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
        L_0x00fb:
            X.0h9 r4 = r1.mLifecycleRegistry     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2kw r0 = r0.A0u()     // Catch:{ all -> 0x1773 }
            r4.A09(r0)     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            r4 = 36329835571921248(0x8111cb00034160, double:3.0384725319643574E-306)
            X.182.A06(r2, r0, r4)     // Catch:{ all -> 0x1773 }
            X.2kC r0 = r1.A0j     // Catch:{ all -> 0x1773 }
            r32 = 0
            X.2jw r4 = r0.A00     // Catch:{ all -> 0x1773 }
            r0 = r32
            r4.A0U = r0     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r5 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2kv r4 = r0.A1x     // Catch:{ all -> 0x1773 }
            r0 = r31
            X.2kz r22 = X.C228202kx.A00(r5, r0, r4)     // Catch:{ all -> 0x1773 }
            X.18g r4 = X.C638918c.A01(r33)     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2l3 r0 = r0.A0Q()     // Catch:{ all -> 0x1773 }
            r4.A0R(r0)     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r7 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2lC r6 = r0.A0I()     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2ks r0 = r0.A1w     // Catch:{ all -> 0x1773 }
            r4 = r32
            X.0qQ.A0B(r7, r4)     // Catch:{ all -> 0x1773 }
            r4 = 2
            X.0qQ.A0B(r0, r4)     // Catch:{ all -> 0x1773 }
            r4 = 36320897744774074(0x8109aa000023ba, double:3.0328202140867434E-306)
            boolean r4 = X.182.A06(r2, r7, r4)     // Catch:{ all -> 0x1773 }
            if (r4 == 0) goto L_0x01ae
            r4 = 36320897744905148(0x8109aa000223bc, double:3.032820214169635E-306)
            boolean r4 = X.182.A06(r2, r7, r4)     // Catch:{ all -> 0x1773 }
            if (r4 == 0) goto L_0x01ae
            X.57E r4 = new X.57E     // Catch:{ all -> 0x1773 }
            r4.<init>(r7, r6, r0)     // Catch:{ all -> 0x1773 }
        L_0x0173:
            r1.A0d = r4     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.2lF r6 = X.C228282lE.A00(r0)     // Catch:{ all -> 0x1773 }
            java.lang.Long r0 = r6.A00     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x018e
            long r4 = r0.longValue()     // Catch:{ all -> 0x1773 }
            X.1QP r7 = r6.A02     // Catch:{ all -> 0x1773 }
            java.lang.String r0 = "logic_constraint"
            r7.flowEndCancel(r4, r0)     // Catch:{ all -> 0x1773 }
            r6.A00 = r3     // Catch:{ all -> 0x1773 }
        L_0x018e:
            X.1QP r7 = r6.A02     // Catch:{ all -> 0x1773 }
            java.lang.Integer r5 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x1773 }
            java.lang.String r4 = "load_feed"
            java.lang.String r0 = "app_start"
            long r4 = r7.A00(r5, r4, r0)     // Catch:{ all -> 0x1773 }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x1773 }
            r6.A00 = r0     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            r4 = 36329337355583547(0x8111570001403b, double:3.038157457946239E-306)
            boolean r0 = X.182.A06(r2, r0, r4)     // Catch:{ all -> 0x1773 }
            goto L_0x01b0
        L_0x01ae:
            r4 = 0
            goto L_0x0173
        L_0x01b0:
            r13 = 1
            if (r0 != 0) goto L_0x01c4
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            r4 = 36328151945329634(0x811043000c3be2, double:3.0374077997284006E-306)
            boolean r0 = X.182.A06(r2, r0, r4)     // Catch:{ all -> 0x1773 }
            r16 = 0
            if (r0 == 0) goto L_0x01c6
        L_0x01c4:
            r16 = 1
        L_0x01c6:
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.2I1 r4 = X.2Hz.A00(r0)     // Catch:{ all -> 0x1773 }
            java.lang.String r0 = "main_fragment_on_create"
            r4.A04(r0)     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger r0 = X.2Hi.A00(r0)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x01e0
            r0.onLogMainFragmentOnCreate()     // Catch:{ all -> 0x1773 }
        L_0x01e0:
            if (r16 != 0) goto L_0x01ed
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2lj r0 = r0.A0o()     // Catch:{ all -> 0x1773 }
            r0.A04()     // Catch:{ all -> 0x1773 }
        L_0x01ed:
            com.instagram.common.session.UserSession r7 = r1.getSession()     // Catch:{ all -> 0x1773 }
            r0 = r32
            X.0qQ.A0B(r7, r0)     // Catch:{ all -> 0x1773 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x0204
            r4 = 247361848(0xebe7138, float:4.6947642E-30)
            java.lang.String r0 = "BasicAdsOptInQueryHelper.fetchBasicAdsOptInData"
            X.0fS.A01(r0, r4)     // Catch:{ all -> 0x1773 }
        L_0x0204:
            X.2me r6 = new X.2me     // Catch:{ all -> 0x174b }
            r6.<init>(r7)     // Catch:{ all -> 0x174b }
            r25 = 0
            X.2IS r5 = new X.2IS     // Catch:{ all -> 0x174b }
            r5.<init>()     // Catch:{ all -> 0x174b }
            X.2IS r4 = new X.2IS     // Catch:{ all -> 0x174b }
            r4.<init>()     // Catch:{ all -> 0x174b }
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion     // Catch:{ all -> 0x174b }
            X.1vR r36 = X.AnonymousClass1vS.A00()     // Catch:{ all -> 0x174b }
            java.util.Map r38 = r5.getParamsCopy()     // Catch:{ all -> 0x174b }
            java.util.Map r39 = r4.getParamsCopy()     // Catch:{ all -> 0x174b }
            java.lang.Class<X.2mf> r40 = X.C228992mf.class
            java.util.ArrayList r46 = new java.util.ArrayList     // Catch:{ all -> 0x174b }
            r46.<init>()     // Catch:{ all -> 0x174b }
            java.lang.String r37 = "BasicAdsOptInQuery"
            java.lang.String r45 = "xfb_user_basic_ads_preferences"
            com.facebook.pando.PandoGraphQLRequest r0 = new com.facebook.pando.PandoGraphQLRequest     // Catch:{ all -> 0x174b }
            r35 = r0
            r41 = r32
            r42 = r3
            r43 = r32
            r44 = r3
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x174b }
            r18 = 0
            r4 = r18
            X.1Ef r0 = r0.setMaxToleratedCacheAgeMs(r4)     // Catch:{ all -> 0x174b }
            X.1vn r4 = X.1vm.A01(r7)     // Catch:{ all -> 0x174b }
            r4.A06(r0, r6)     // Catch:{ all -> 0x174b }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x0258
            r0 = 2076928704(0x7bcb6ac0, float:2.1124028E36)
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
        L_0x0258:
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            r4 = r32
            X.0qQ.A0B(r0, r4)     // Catch:{ all -> 0x1773 }
            boolean r4 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r4 == 0) goto L_0x026f
            r5 = -424921693(0xffffffffe6ac35a3, float:-4.0661823E23)
            java.lang.String r4 = "AFSOptInQueryHelper.fetchAFSOptInData"
            X.0fS.A01(r4, r5)     // Catch:{ all -> 0x1773 }
        L_0x026f:
            r4 = 36319772463799925(0x8108a400071e75, double:3.032108581867549E-306)
            boolean r4 = X.182.A06(r2, r0, r4)     // Catch:{ all -> 0x1740 }
            if (r4 != 0) goto L_0x0284
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x02ca
            r0 = -1921410694(0xffffffff8d79997a, float:-7.691379E-31)
            goto L_0x02c7
        L_0x0284:
            X.2ml r7 = new X.2ml     // Catch:{ all -> 0x1740 }
            r7.<init>(r0)     // Catch:{ all -> 0x1740 }
            X.2IS r5 = new X.2IS     // Catch:{ all -> 0x1740 }
            r5.<init>()     // Catch:{ all -> 0x1740 }
            X.2IS r4 = new X.2IS     // Catch:{ all -> 0x1740 }
            r4.<init>()     // Catch:{ all -> 0x1740 }
            X.1vR r36 = X.AnonymousClass1vS.A00()     // Catch:{ all -> 0x1740 }
            java.util.Map r38 = r5.getParamsCopy()     // Catch:{ all -> 0x1740 }
            java.util.Map r39 = r4.getParamsCopy()     // Catch:{ all -> 0x1740 }
            java.lang.Class<X.2mm> r40 = X.C229062mm.class
            java.util.ArrayList r46 = new java.util.ArrayList     // Catch:{ all -> 0x1740 }
            r46.<init>()     // Catch:{ all -> 0x1740 }
            java.lang.String r37 = "AFSOptInQuery"
            java.lang.String r45 = "AFSStatusGraphQLWrapper"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest     // Catch:{ all -> 0x1740 }
            r35 = r6
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x1740 }
            r4 = r18
            X.1Ef r4 = r6.setMaxToleratedCacheAgeMs(r4)     // Catch:{ all -> 0x1740 }
            X.1vn r0 = X.1vm.A01(r0)     // Catch:{ all -> 0x1740 }
            r0.A06(r4, r7)     // Catch:{ all -> 0x1740 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x02ca
            r0 = -1006468995(0xffffffffc402807d, float:-522.0076)
        L_0x02c7:
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
        L_0x02ca:
            com.instagram.common.session.UserSession r7 = r1.getSession()     // Catch:{ all -> 0x1773 }
            r0 = 2131962337(0x7f1329e1, float:1.9561396E38)
            r4 = r30
            java.lang.String r6 = r4.getString(r0)     // Catch:{ all -> 0x1773 }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x1773 }
            r0 = r32
            X.0qQ.A0B(r7, r0)     // Catch:{ all -> 0x1773 }
            java.lang.Class<X.2mn> r5 = X.C229072mn.class
            r4 = 32
            X.Phj r0 = new X.Phj     // Catch:{ all -> 0x1773 }
            r0.<init>(r6, r7, r4)     // Catch:{ all -> 0x1773 }
            java.lang.Object r0 = r7.A01(r5, r0)     // Catch:{ all -> 0x1773 }
            X.2mn r0 = (X.C229072mn) r0     // Catch:{ all -> 0x1773 }
            r1.A0X = r0     // Catch:{ all -> 0x1773 }
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x1773 }
            X.2eh r0 = X.AnonymousClass2eg.A00     // Catch:{ all -> 0x1773 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x1773 }
            r0.A00 = r13     // Catch:{ all -> 0x1773 }
            X.0eM r0 = r1.A0n     // Catch:{ all -> 0x1773 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x1773 }
            X.2k7 r0 = (X.AnonymousClass2k7) r0     // Catch:{ all -> 0x1773 }
            X.0eM r0 = r0.A02     // Catch:{ all -> 0x1773 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x1773 }
            X.2mo r0 = (X.C229082mo) r0     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r6 = r0.A00     // Catch:{ all -> 0x1773 }
            X.0Tu r29 = X.0Tu.A06     // Catch:{ all -> 0x1773 }
            r4 = 36876838312935543(0x83034a00150077, double:3.384399267985042E-306)
            r0 = r29
            java.lang.String r7 = X.182.A04(r0, r6, r4)     // Catch:{ all -> 0x1773 }
            r4 = 36313888359647511(0x81034a00170917, double:3.0283874507081765E-306)
            boolean r0 = X.182.A06(r0, r6, r4)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x032f
            java.lang.Integer r4 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x1773 }
            java.lang.Integer r0 = X.C229092mp.A00(r7)     // Catch:{ all -> 0x1773 }
            if (r4 != r0) goto L_0x032f
            r1.A0T = r13     // Catch:{ all -> 0x1773 }
        L_0x032f:
            java.lang.String r4 = "MainFeedFragment.onCreate:PeekMediaController"
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x033d
            r0 = 1481805797(0x58528fe5, float:9.2606186E14)
            X.0fS.A01(r4, r0)     // Catch:{ all -> 0x1773 }
        L_0x033d:
            com.instagram.common.session.UserSession r6 = r1.getSession()     // Catch:{ all -> 0x172f }
            X.0qQ.A0B(r6, r13)     // Catch:{ all -> 0x172f }
            r4 = 36311354327630335(0x8100fc000301ff, double:3.0267849186567865E-306)
            r0 = r29
            boolean r4 = X.182.A06(r0, r6, r4)     // Catch:{ all -> 0x172f }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x172f }
            X.0qQ.A0A(r0)     // Catch:{ all -> 0x172f }
            if (r4 == 0) goto L_0x038c
            androidx.fragment.app.FragmentActivity r36 = r1.requireActivity()     // Catch:{ all -> 0x172f }
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()     // Catch:{ all -> 0x172f }
            X.0hq r38 = X.C229102mq.A00(r0)     // Catch:{ all -> 0x172f }
            com.instagram.common.session.UserSession r39 = r1.getSession()     // Catch:{ all -> 0x172f }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x172f }
            X.2kv r4 = r0.A1x     // Catch:{ all -> 0x172f }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x172f }
            X.2rI r42 = r0.A0J()     // Catch:{ all -> 0x172f }
            X.2uE r0 = new X.2uE     // Catch:{ all -> 0x172f }
            r35 = r0
            r37 = r1
            r40 = r3
            r41 = r31
            r43 = r4
            r44 = r32
            r45 = r13
            r46 = r32
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x172f }
            goto L_0x038d
        L_0x038c:
            r0 = r3
        L_0x038d:
            boolean r4 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r4 == 0) goto L_0x0399
            r4 = 1347347072(0x504ee280, float:1.38838016E10)
            X.0fS.A00(r4)     // Catch:{ all -> 0x1773 }
        L_0x0399:
            r1.A0Z = r0     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x03ac
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2nD r4 = r0.A0M()     // Catch:{ all -> 0x1773 }
            X.2uG r0 = r1.A0Z     // Catch:{ all -> 0x1773 }
            r4.A00 = r0     // Catch:{ all -> 0x1773 }
        L_0x03ac:
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            r4 = 36321391666472256(0x810a1d00072540, double:3.033132572157537E-306)
            boolean r17 = X.182.A06(r2, r0, r4)     // Catch:{ all -> 0x1773 }
            if (r17 == 0) goto L_0x03dc
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.34T r0 = r0.A0h()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2lL r0 = r0.A0P()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.34a r0 = r0.A0O()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
        L_0x03dc:
            java.lang.String r4 = "MainFeedFragment.onCreate:setAdapters"
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x03ea
            r0 = 339792785(0x1440d391, float:9.735247E-27)
            X.0fS.A01(r4, r0)     // Catch:{ all -> 0x1773 }
        L_0x03ea:
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x171e }
            X.2pK r4 = r0.A0Z()     // Catch:{ all -> 0x171e }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x171e }
            X.2rI r0 = r0.A0J()     // Catch:{ all -> 0x171e }
            r4.A00 = r0     // Catch:{ all -> 0x171e }
            X.2kj r5 = r1.A0A()     // Catch:{ all -> 0x171e }
            X.2lH r4 = r5.A0S     // Catch:{ all -> 0x171e }
            if (r4 != 0) goto L_0x040d
            com.instagram.common.session.UserSession r0 = r5.A1t     // Catch:{ all -> 0x171e }
            X.2lH r4 = new X.2lH     // Catch:{ all -> 0x171e }
            r4.<init>(r0)     // Catch:{ all -> 0x171e }
            r5.A0S = r4     // Catch:{ all -> 0x171e }
        L_0x040d:
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x171e }
            X.2rI r0 = r0.A0J()     // Catch:{ all -> 0x171e }
            r4.A00 = r0     // Catch:{ all -> 0x171e }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x171e }
            X.2qK r4 = r0.A0v()     // Catch:{ all -> 0x171e }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x171e }
            X.2rI r0 = r0.A0J()     // Catch:{ all -> 0x171e }
            r4.A00 = r0     // Catch:{ all -> 0x171e }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x171e }
            X.2mr r4 = r0.A0s()     // Catch:{ all -> 0x171e }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x171e }
            X.2rI r0 = r0.A0J()     // Catch:{ all -> 0x171e }
            r4.A00 = r0     // Catch:{ all -> 0x171e }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x171e }
            X.2lj r0 = r0.A0o()     // Catch:{ all -> 0x171e }
            X.2kj r4 = r1.A0A()     // Catch:{ all -> 0x171e }
            X.2rI r39 = r4.A0J()     // Catch:{ all -> 0x171e }
            X.2kj r6 = r1.A0A()     // Catch:{ all -> 0x171e }
            X.2nw r4 = r6.A0I     // Catch:{ all -> 0x171e }
            r46 = r4
            if (r4 != 0) goto L_0x0462
            com.instagram.common.session.UserSession r7 = r6.A1t     // Catch:{ all -> 0x171e }
            X.2nw r46 = new X.2nw     // Catch:{ all -> 0x171e }
            r5 = r46
            r4 = r31
            r5.<init>(r7, r4)     // Catch:{ all -> 0x171e }
            r6.A0I = r5     // Catch:{ all -> 0x171e }
        L_0x0462:
            r4 = r39
            r0.A06 = r4     // Catch:{ all -> 0x171e }
            com.instagram.common.session.UserSession r10 = r0.A0Q     // Catch:{ all -> 0x171e }
            r4 = 36311852543640352(0x81017000000320, double:3.027099992467676E-306)
            boolean r45 = X.182.A06(r2, r10, r4)     // Catch:{ all -> 0x171e }
            java.lang.String r21 = "Required value was null."
            r24 = 0
            if (r45 == 0) goto L_0x08a6
            X.3kK r6 = r0.A0l     // Catch:{ all -> 0x171e }
            X.4DU r4 = r0.A0S     // Catch:{ all -> 0x171e }
            r61 = r4
            X.2pK r11 = new X.2pK     // Catch:{ all -> 0x171e }
            r11.<init>(r4, r10, r4, r6)     // Catch:{ all -> 0x171e }
            java.lang.Integer r52 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x171e }
            X.2un r4 = new X.2un     // Catch:{ all -> 0x171e }
            r47 = r4
            r48 = r30
            r49 = r10
            r50 = r11
            r51 = r3
            r47.<init>(r48, r49, r50, r51, r52)     // Catch:{ all -> 0x171e }
            r5 = r39
            r4.A07 = r5     // Catch:{ all -> 0x171e }
            r0.A0A = r4     // Catch:{ all -> 0x171e }
            r0.A09 = r4     // Catch:{ all -> 0x171e }
            X.2jw r14 = r0.A0n     // Catch:{ all -> 0x171e }
            X.2kj r4 = r14.A0A()     // Catch:{ all -> 0x171e }
            X.2pz r5 = r4.A0n()     // Catch:{ all -> 0x171e }
            X.2uw r7 = new X.2uw     // Catch:{ all -> 0x171e }
            r4 = r30
            r7.<init>(r4, r10, r5)     // Catch:{ all -> 0x171e }
            r4 = 36326236389127821(0x810e850000368d, double:3.0361963942730483E-306)
            r8 = r29
            boolean r4 = X.182.A06(r8, r10, r4)     // Catch:{ all -> 0x171e }
            if (r4 == 0) goto L_0x0588
            X.2v0 r3 = new X.2v0     // Catch:{ all -> 0x171e }
            r3.<init>(r10)     // Catch:{ all -> 0x171e }
            X.2v5 r5 = new X.2v5     // Catch:{ all -> 0x171e }
            r4 = r39
            r5.<init>(r10, r4, r3)     // Catch:{ all -> 0x171e }
        L_0x04c5:
            r0.A07 = r5     // Catch:{ all -> 0x171e }
            r4 = 36311852544099108(0x81017000070324, double:3.027099992757795E-306)
            boolean r4 = X.182.A06(r2, r10, r4)     // Catch:{ all -> 0x171e }
            if (r4 == 0) goto L_0x0581
            X.2v6 r12 = new X.2v6     // Catch:{ all -> 0x171e }
            r12.<init>()     // Catch:{ all -> 0x171e }
        L_0x04d7:
            r0.A0D = r12     // Catch:{ all -> 0x171e }
            X.2mK r9 = r0.A0U     // Catch:{ all -> 0x171e }
            X.2un r8 = r0.A0A     // Catch:{ all -> 0x171e }
            com.instagram.common.session.UserSession r5 = r9.A01     // Catch:{ all -> 0x171e }
            X.2v8 r4 = new X.2v8     // Catch:{ all -> 0x171e }
            r37 = r4
            r38 = r5
            r40 = r7
            r41 = r3
            r42 = r8
            r43 = r12
            r44 = r0
            r37.<init>(r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x171e }
            r0.A03 = r4     // Catch:{ all -> 0x171e }
            X.1PG r4 = X.1PG.A00(r10)     // Catch:{ all -> 0x171e }
            X.2mL r3 = X.C228792mL.A00     // Catch:{ all -> 0x171e }
            X.2vA r37 = r4.A03(r3)     // Catch:{ all -> 0x171e }
            X.2mM r8 = r9.A02     // Catch:{ all -> 0x171e }
            r3 = 6
            X.0qQ.A0B(r8, r3)     // Catch:{ all -> 0x171e }
            X.2vB r7 = new X.2vB     // Catch:{ all -> 0x171e }
            r7.<init>(r5)     // Catch:{ all -> 0x171e }
            boolean r12 = X.1P7.A03(r5)     // Catch:{ all -> 0x171e }
            X.2vD r4 = X.C233192vD.FEED     // Catch:{ all -> 0x171e }
            java.lang.String r52 = r6.getSessionId()     // Catch:{ all -> 0x171e }
            java.lang.String r3 = r6.getSessionId()     // Catch:{ all -> 0x171e }
            java.lang.String r43 = r6.getSessionId()     // Catch:{ all -> 0x171e }
            X.2vE r6 = new X.2vE     // Catch:{ all -> 0x171e }
            r35 = r6
            r36 = r5
            r38 = r61
            r40 = r11
            r41 = r8
            r42 = r7
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x171e }
            java.lang.String r51 = "session_id_not_defined_for_feed"
            if (r12 == 0) goto L_0x0579
            r47 = r5
            r48 = r7
            r49 = r4
            r50 = r6
            r53 = r3
            X.2vG r3 = X.C55154Hd4.A00(r47, r48, r49, r50, r51, r52, r53)     // Catch:{ all -> 0x171e }
        L_0x053e:
            r0.A0E = r3     // Catch:{ all -> 0x171e }
            X.2vS r7 = new X.2vS     // Catch:{ all -> 0x171e }
            r7.<init>(r0)     // Catch:{ all -> 0x171e }
            X.2vU r4 = new X.2vU     // Catch:{ all -> 0x171e }
            r4.<init>()     // Catch:{ all -> 0x171e }
            X.0xi r44 = X.0tS.A4E     // Catch:{ all -> 0x171e }
            r6 = r44
            r3 = r30
            X.0tS r3 = r6.A01(r3)     // Catch:{ all -> 0x171e }
            boolean r3 = r3.A0T()     // Catch:{ all -> 0x171e }
            if (r3 == 0) goto L_0x0568
            X.57P r11 = new X.57P     // Catch:{ all -> 0x171e }
            r11.<init>(r10)     // Catch:{ all -> 0x171e }
            X.VvI r6 = new X.VvI     // Catch:{ all -> 0x171e }
            r3 = r30
            r6.<init>(r3, r7, r11)     // Catch:{ all -> 0x171e }
            r4.A00 = r6     // Catch:{ all -> 0x171e }
        L_0x0568:
            r0.A05 = r4     // Catch:{ all -> 0x171e }
            X.2v8 r15 = r0.A03     // Catch:{ all -> 0x171e }
            X.2v7 r3 = r0.A0D     // Catch:{ all -> 0x171e }
            r43 = r3
            X.2vG r11 = r0.A0E     // Catch:{ all -> 0x171e }
            X.2rI r3 = r0.A06     // Catch:{ all -> 0x171e }
            r42 = r3
            if (r15 == 0) goto L_0x08aa
            goto L_0x0591
        L_0x0579:
            X.2vG r3 = X.C233232vL.A00(r5, r7, r4, r6, r3)     // Catch:{ all -> 0x171e }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x171e }
            goto L_0x053e
        L_0x0581:
            X.2w9 r12 = new X.2w9     // Catch:{ all -> 0x171e }
            r12.<init>()     // Catch:{ all -> 0x171e }
            goto L_0x04d7
        L_0x0588:
            X.2v5 r5 = new X.2v5     // Catch:{ all -> 0x171e }
            r4 = r39
            r5.<init>(r10, r4, r7)     // Catch:{ all -> 0x171e }
            goto L_0x04c5
        L_0x0591:
            if (r43 == 0) goto L_0x08aa
            if (r11 == 0) goto L_0x08aa
            if (r3 == 0) goto L_0x08aa
            X.2vV r6 = new X.2vV     // Catch:{ all -> 0x171e }
            r6.<init>(r10, r3)     // Catch:{ all -> 0x171e }
            r0.A04 = r6     // Catch:{ all -> 0x171e }
            X.2lC r3 = r0.A0V     // Catch:{ all -> 0x171e }
            r60 = r3
            X.VvI r3 = r4.A00     // Catch:{ all -> 0x171e }
            if (r3 == 0) goto L_0x05d1
            X.2vk r12 = r3.A0B     // Catch:{ all -> 0x171e }
            X.57P r12 = (X.AnonymousClass57P) r12     // Catch:{ all -> 0x171e }
        L_0x05aa:
            X.2kj r3 = r14.A0A()     // Catch:{ all -> 0x171e }
            X.2ks r7 = r3.A1w     // Catch:{ all -> 0x171e }
            X.1PG r41 = X.1PG.A00(r10)     // Catch:{ all -> 0x171e }
            X.0qQ.A07(r41)     // Catch:{ all -> 0x171e }
            X.2vV r3 = r0.A04     // Catch:{ all -> 0x171e }
            r40 = r3
            r3 = 9
            X.0qQ.A0B(r7, r3)     // Catch:{ all -> 0x171e }
            boolean r3 = r9.A00     // Catch:{ all -> 0x171e }
            if (r3 != 0) goto L_0x05d3
            X.1PB r4 = r9.A03     // Catch:{ all -> 0x171e }
            X.2vW r3 = new X.2vW     // Catch:{ all -> 0x171e }
            r3.<init>()     // Catch:{ all -> 0x171e }
            X.1PG.A01(r3, r4)     // Catch:{ all -> 0x171e }
            r9.A00 = r13     // Catch:{ all -> 0x171e }
            goto L_0x05d3
        L_0x05d1:
            r12 = 0
            goto L_0x05aa
        L_0x05d3:
            if (r12 == 0) goto L_0x05d7
            r12.A00 = r8     // Catch:{ all -> 0x171e }
        L_0x05d7:
            X.1PG r4 = X.1PG.A00(r5)     // Catch:{ all -> 0x171e }
            X.1PB r3 = r9.A03     // Catch:{ all -> 0x171e }
            r59 = r3
            X.3kU r38 = r4.A06(r3)     // Catch:{ all -> 0x171e }
            X.0qQ.A07(r38)     // Catch:{ all -> 0x171e }
            r3 = 36315614934994352(0x8104dc00000db0, double:3.0294793439098796E-306)
            boolean r3 = X.182.A06(r2, r5, r3)     // Catch:{ all -> 0x171e }
            if (r3 == 0) goto L_0x0649
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.sponsored.asyncads.common.ModelIdentifier<kotlin.Any, com.instagram.feed.feeditem.FeedItem>"
            X.0qQ.A0C(r8, r3)     // Catch:{ all -> 0x171e }
            r3 = 36315614935190963(0x8104dc00030db3, double:3.029479344034217E-306)
            boolean r6 = X.182.A06(r2, r5, r3)     // Catch:{ all -> 0x171e }
            if (r6 == 0) goto L_0x0641
            X.2vY r6 = X.C233342vY.A01     // Catch:{ all -> 0x171e }
            boolean r3 = X.182.A06(r2, r5, r3)     // Catch:{ all -> 0x171e }
            X.2va r4 = new X.2va     // Catch:{ all -> 0x171e }
            r4.<init>(r3)     // Catch:{ all -> 0x171e }
        L_0x060c:
            X.2vb r6 = new X.2vb     // Catch:{ all -> 0x171e }
            r3 = r32
            r6.<init>(r4, r8, r3)     // Catch:{ all -> 0x171e }
        L_0x0613:
            X.2vd r37 = new X.2vd     // Catch:{ all -> 0x171e }
            r47 = r37
            r48 = r5
            r49 = r12
            r50 = r42
            r51 = r6
            r52 = r8
            r53 = r11
            r47.<init>(r48, r49, r50, r51, r52, r53)     // Catch:{ all -> 0x171e }
            r3 = 36316379439370526(0x81058e0003111e, double:3.029962819555784E-306)
            boolean r3 = X.182.A06(r2, r5, r3)     // Catch:{ all -> 0x171e }
            if (r3 != 0) goto L_0x064f
            r3 = 36316379439304989(0x81058e0002111d, double:3.029962819514338E-306)
            r14 = r29
            boolean r3 = X.182.A06(r14, r5, r3)     // Catch:{ all -> 0x171e }
            r36 = 0
            if (r3 == 0) goto L_0x0651
            goto L_0x064f
        L_0x0641:
            X.2vY r4 = X.C233342vY.A01     // Catch:{ all -> 0x171e }
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.sponsored.asyncads.brandsafety.BlocklistEnforcer<com.instagram.feed.feeditem.FeedItem>"
            X.0qQ.A0C(r4, r3)     // Catch:{ all -> 0x171e }
            goto L_0x060c
        L_0x0649:
            X.2wA r6 = new X.2wA     // Catch:{ all -> 0x171e }
            r6.<init>()     // Catch:{ all -> 0x171e }
            goto L_0x0613
        L_0x064f:
            r36 = 1
        L_0x0651:
            X.2un r3 = r15.A05     // Catch:{ all -> 0x171e }
            if (r3 == 0) goto L_0x0657
            r3.A0B = r11     // Catch:{ all -> 0x171e }
        L_0x0657:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x171e }
            r14.<init>()     // Catch:{ all -> 0x171e }
            r3 = 36316379439501600(0x81058e00051120, double:3.029962819638676E-306)
            boolean r4 = X.182.A06(r2, r5, r3)     // Catch:{ all -> 0x171e }
            X.2vg r3 = new X.2vg     // Catch:{ all -> 0x171e }
            r47 = r3
            r53 = r37
            r54 = r38
            r47.<init>(r48, r49, r50, r51, r52, r53, r54)     // Catch:{ all -> 0x171e }
            r14.add(r3)     // Catch:{ all -> 0x171e }
            if (r4 == 0) goto L_0x0676
            goto L_0x0698
        L_0x0676:
            X.2vq r4 = new X.2vq     // Catch:{ all -> 0x171e }
            r4.<init>(r8)     // Catch:{ all -> 0x171e }
            X.2vs r3 = new X.2vs     // Catch:{ all -> 0x171e }
            r3.<init>(r13)     // Catch:{ all -> 0x171e }
            X.2vt r47 = new X.2vt     // Catch:{ all -> 0x171e }
            r49 = r7
            r51 = r59
            r52 = r6
            r53 = r8
            r54 = r37
            r55 = r11
            r56 = r38
            r57 = r4
            r58 = r3
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)     // Catch:{ all -> 0x171e }
            goto L_0x06b1
        L_0x0698:
            X.2vq r4 = new X.2vq     // Catch:{ all -> 0x171e }
            r4.<init>(r8)     // Catch:{ all -> 0x171e }
            X.2vs r3 = new X.2vs     // Catch:{ all -> 0x171e }
            r3.<init>(r13)     // Catch:{ all -> 0x171e }
            X.HFI r47 = new X.HFI     // Catch:{ all -> 0x171e }
            r49 = r7
            r52 = r37
            r53 = r38
            r54 = r4
            r55 = r3
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55)     // Catch:{ all -> 0x171e }
        L_0x06b1:
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.sponsored.asyncads.common.ModelIdentifier<com.instagram.mainfeed.ad.acp.model.SponsoredFeedItem, com.instagram.feed.feeditem.FeedItem>"
            X.0qQ.A0C(r8, r3)     // Catch:{ all -> 0x171e }
            X.2vv r3 = new X.2vv     // Catch:{ all -> 0x171e }
            r48 = r3
            r49 = r8
            r50 = r37
            r51 = r38
            r52 = r47
            r53 = r32
            r54 = r32
            r48.<init>(r49, r50, r51, r52, r53, r54)     // Catch:{ all -> 0x171e }
            r14.add(r3)     // Catch:{ all -> 0x171e }
            if (r36 == 0) goto L_0x06ed
            X.HFE r3 = new X.HFE     // Catch:{ all -> 0x171e }
            r47 = r3
            r48 = r5
            r49 = r7
            r50 = r42
            r51 = r59
            r52 = r6
            r53 = r8
            r54 = r37
            r55 = r11
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55)     // Catch:{ all -> 0x171e }
            X.IZ2 r4 = new X.IZ2     // Catch:{ all -> 0x171e }
            r4.<init>(r5, r11, r3)     // Catch:{ all -> 0x171e }
            r14.add(r4)     // Catch:{ all -> 0x171e }
        L_0x06ed:
            X.1PG r3 = X.1PG.A00(r5)     // Catch:{ all -> 0x171e }
            X.1PM r4 = r3.A00     // Catch:{ all -> 0x171e }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x171e }
            boolean r3 = r37.ARN()     // Catch:{ all -> 0x171e }
            if (r3 == 0) goto L_0x0759
            X.HEX r3 = new X.HEX     // Catch:{ all -> 0x171e }
            r47 = r3
            r48 = r42
            r49 = r37
            r50 = r4
            r51 = r59
            r52 = r8
            r47.<init>(r48, r49, r50, r51, r52)     // Catch:{ all -> 0x171e }
        L_0x070d:
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.sponsored.asyncads.rules.InjectionRulesEnforcer<com.instagram.feed.feeditem.FeedItem, kotlin.Any>"
            X.0qQ.A0C(r3, r4)     // Catch:{ all -> 0x171e }
            r14.add(r3)     // Catch:{ all -> 0x171e }
            int r3 = r14.size()     // Catch:{ all -> 0x171e }
            if (r3 != r13) goto L_0x0753
            r3 = r32
            java.lang.Object r7 = r14.get(r3)     // Catch:{ all -> 0x171e }
        L_0x0721:
            X.2vi r7 = (X.C233432vi) r7     // Catch:{ all -> 0x171e }
            r3 = 36318827570534886(0x8107c8000019e6, double:3.0315110275619583E-306)
            boolean r3 = X.182.A06(r2, r5, r3)     // Catch:{ all -> 0x171e }
            if (r3 != 0) goto L_0x075f
            r3 = 36318827570665959(0x8107c8000219e7, double:3.0315110276448494E-306)
            r6 = r29
            boolean r3 = X.182.A06(r6, r5, r3)     // Catch:{ all -> 0x171e }
            if (r3 != 0) goto L_0x075f
            r3 = 36319377326349495(0x81084800001cb7, double:3.031858695352806E-306)
            boolean r3 = X.182.A06(r2, r5, r3)     // Catch:{ all -> 0x171e }
            if (r3 != 0) goto L_0x075f
            r3 = 36319377326480568(0x81084800021cb8, double:3.031858695435697E-306)
            boolean r3 = X.182.A06(r6, r5, r3)     // Catch:{ all -> 0x171e }
            r14 = 0
            if (r3 == 0) goto L_0x0760
            goto L_0x075f
        L_0x0753:
            X.2vx r7 = new X.2vx     // Catch:{ all -> 0x171e }
            r7.<init>(r14)     // Catch:{ all -> 0x171e }
            goto L_0x0721
        L_0x0759:
            X.2vw r3 = new X.2vw     // Catch:{ all -> 0x171e }
            r3.<init>()     // Catch:{ all -> 0x171e }
            goto L_0x070d
        L_0x075f:
            r14 = 1
        L_0x0760:
            r3 = 36319377326546105(0x81084800031cb9, double:3.031858695477143E-306)
            boolean r35 = X.182.A06(r2, r5, r3)     // Catch:{ all -> 0x171e }
            if (r14 == 0) goto L_0x0786
            if (r35 == 0) goto L_0x0786
            X.1Pg r4 = X.1Pg.A02     // Catch:{ all -> 0x171e }
            r3 = r59
            X.1Ph r6 = r4.A00(r3)     // Catch:{ all -> 0x171e }
            X.IWH r4 = new X.IWH     // Catch:{ all -> 0x171e }
            r3 = r42
            r4.<init>(r3, r6, r8)     // Catch:{ all -> 0x171e }
            X.2rX r3 = r3.A00     // Catch:{ all -> 0x171e }
            X.2rW r3 = (X.AnonymousClass2rW) r3     // Catch:{ all -> 0x171e }
            r3.Eaa(r4)     // Catch:{ all -> 0x171e }
            r4.DMW()     // Catch:{ all -> 0x171e }
        L_0x0786:
            X.2w4 r3 = X.C233632w4.A05     // Catch:{ all -> 0x171e }
            X.2w5 r6 = new X.2w5     // Catch:{ all -> 0x171e }
            r6.<init>(r3)     // Catch:{ all -> 0x171e }
            r6.A0G = r15     // Catch:{ all -> 0x171e }
            r6.A0K = r11     // Catch:{ all -> 0x171e }
            r3 = r38
            r6.A0L = r3     // Catch:{ all -> 0x171e }
            X.0tS r3 = r44.A00()     // Catch:{ all -> 0x171e }
            boolean r3 = r3.A0L()     // Catch:{ all -> 0x171e }
            if (r3 != 0) goto L_0x084a
            r3 = 36312879040824667(0x81025f0000055b, double:3.027749153420409E-306)
            boolean r3 = X.182.A06(r2, r5, r3)     // Catch:{ all -> 0x171e }
            if (r3 != 0) goto L_0x084a
            X.1PJ r3 = r9.A04     // Catch:{ all -> 0x171e }
            X.2wL r4 = new X.2wL     // Catch:{ all -> 0x171e }
            r47 = r4
            r48 = r5
            r49 = r8
            r50 = r37
            r51 = r11
            r52 = r38
            r53 = r3
            r47.<init>(r48, r49, r50, r51, r52, r53)     // Catch:{ all -> 0x171e }
        L_0x07bf:
            r6.A0J = r4     // Catch:{ all -> 0x171e }
            r6.A0N = r7     // Catch:{ all -> 0x171e }
            r3 = r37
            r6.A0H = r3     // Catch:{ all -> 0x171e }
            r6.A0E = r8     // Catch:{ all -> 0x171e }
            r3 = r60
            r6.A0P = r3     // Catch:{ all -> 0x171e }
            X.2wR r7 = new X.2wR     // Catch:{ all -> 0x171e }
            r4 = r30
            r3 = r61
            r7.<init>(r4, r3, r5)     // Catch:{ all -> 0x171e }
            r6.A02(r7)     // Catch:{ all -> 0x171e }
            X.2wT r3 = new X.2wT     // Catch:{ all -> 0x171e }
            r3.<init>(r5)     // Catch:{ all -> 0x171e }
            r6.A02(r3)     // Catch:{ all -> 0x171e }
            r3 = 36313235523110730(0x8102b20000074a, double:3.0279745942535545E-306)
            boolean r3 = X.182.A06(r2, r5, r3)     // Catch:{ all -> 0x171e }
            if (r3 == 0) goto L_0x0844
            r3 = 36313235523372875(0x8102b20004074b, double:3.027974594419336E-306)
            boolean r52 = X.182.A06(r2, r5, r3)     // Catch:{ all -> 0x171e }
            r3 = 2342156244737525584(0x208102b2000b0750, double:4.059850178261016E-152)
            boolean r53 = X.182.A06(r2, r5, r3)     // Catch:{ all -> 0x171e }
            r3 = 36594710500149053(0x8202b20005073d, double:3.2059805031413485E-306)
            long r3 = X.182.A01(r2, r5, r3)     // Catch:{ all -> 0x171e }
            int r7 = (int) r3     // Catch:{ all -> 0x171e }
            r3 = 36313235523503948(0x8102b20006074c, double:3.027974594502227E-306)
            boolean r54 = X.182.A06(r2, r5, r3)     // Catch:{ all -> 0x171e }
            r3 = 36313235523897169(0x8102b2000c0751, double:3.0279745947509017E-306)
            boolean r55 = X.182.A06(r2, r5, r3)     // Catch:{ all -> 0x171e }
            X.2wU r3 = new X.2wU     // Catch:{ all -> 0x171e }
            r47 = r3
            r48 = r30
            r49 = r61
            r50 = r5
            r51 = r7
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55)     // Catch:{ all -> 0x171e }
        L_0x0829:
            X.2wS r3 = (X.C233782wS) r3     // Catch:{ all -> 0x171e }
            r6.A02(r3)     // Catch:{ all -> 0x171e }
            r3 = r43
            r6.A0B = r3     // Catch:{ all -> 0x171e }
            r6.A0F = r12     // Catch:{ all -> 0x171e }
            r3 = r32
            r6.A0p = r3     // Catch:{ all -> 0x171e }
            r3 = 36315005049768885(0x81044e00020bb5, double:3.0290936500374836E-306)
            boolean r3 = X.182.A06(r2, r5, r3)     // Catch:{ all -> 0x171e }
            r6.A0j = r3     // Catch:{ all -> 0x171e }
            goto L_0x0851
        L_0x0844:
            X.IXr r3 = new X.IXr     // Catch:{ all -> 0x171e }
            r3.<init>()     // Catch:{ all -> 0x171e }
            goto L_0x0829
        L_0x084a:
            X.3CI r4 = new X.3CI     // Catch:{ all -> 0x171e }
            r4.<init>()     // Catch:{ all -> 0x171e }
            goto L_0x07bf
        L_0x0851:
            if (r36 != 0) goto L_0x0862
            r3 = 36323281451625516(0x810bd500002c2c, double:3.0343276798980124E-306)
            r7 = r29
            boolean r3 = X.182.A06(r7, r5, r3)     // Catch:{ all -> 0x171e }
            if (r3 != 0) goto L_0x0862
            r3 = 0
            goto L_0x0866
        L_0x0862:
            X.3DW r3 = X.AnonymousClass3DV.A00(r5)     // Catch:{ all -> 0x171e }
        L_0x0866:
            r6.A0M = r3     // Catch:{ all -> 0x171e }
            r3 = r41
            r6.A08 = r3     // Catch:{ all -> 0x171e }
            r3 = r59
            r6.A0C = r3     // Catch:{ all -> 0x171e }
            r6.A03 = r5     // Catch:{ all -> 0x171e }
            r6.A0W = r14     // Catch:{ all -> 0x171e }
            r6.A0C = r3     // Catch:{ all -> 0x171e }
            r3 = r35
            r6.A0q = r3     // Catch:{ all -> 0x171e }
            r3 = 36318595642497338(0x8107920003193a, double:3.031364355337114E-306)
            boolean r3 = X.182.A06(r2, r5, r3)     // Catch:{ all -> 0x171e }
            r6.A0o = r3     // Catch:{ all -> 0x171e }
            if (r40 == 0) goto L_0x088b
            r3 = r40
            r6.A05 = r3     // Catch:{ all -> 0x171e }
        L_0x088b:
            X.2wV r3 = r6.A00()     // Catch:{ all -> 0x171e }
            r0.A0C = r3     // Catch:{ all -> 0x171e }
            r3 = 36316113151201232(0x81055000000fd0, double:3.029794417845266E-306)
            r5 = r29
            boolean r5 = X.182.A06(r5, r10, r3)     // Catch:{ all -> 0x171e }
            X.2we r4 = new X.2we     // Catch:{ all -> 0x171e }
            r3 = r42
            r4.<init>(r3, r0, r5)     // Catch:{ all -> 0x171e }
            r0.A0B = r4     // Catch:{ all -> 0x171e }
            goto L_0x08aa
        L_0x08a6:
            r0.A03 = r3     // Catch:{ all -> 0x171e }
            r0.A0C = r3     // Catch:{ all -> 0x171e }
        L_0x08aa:
            X.2jw r11 = r0.A0n     // Catch:{ all -> 0x171e }
            X.4DU r9 = r0.A0S     // Catch:{ all -> 0x171e }
            X.2lG r12 = r0.A0a     // Catch:{ all -> 0x171e }
            X.2li r8 = r0.A0o     // Catch:{ all -> 0x171e }
            if (r45 == 0) goto L_0x08b8
            X.2v8 r3 = r0.A03     // Catch:{ all -> 0x171e }
            r25 = r3
        L_0x08b8:
            X.2lH r7 = r0.A0g     // Catch:{ all -> 0x171e }
            X.2lU r6 = r0.A0T     // Catch:{ all -> 0x171e }
            X.2vV r4 = r0.A04     // Catch:{ all -> 0x171e }
            X.3kK r5 = r0.A0l     // Catch:{ all -> 0x171e }
            X.2wf r3 = new X.2wf     // Catch:{ all -> 0x171e }
            r47 = r3
            r48 = r10
            r49 = r9
            r50 = r6
            r51 = r25
            r52 = r4
            r53 = r39
            r54 = r46
            r55 = r12
            r56 = r7
            r57 = r5
            r58 = r11
            r59 = r8
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)     // Catch:{ all -> 0x171e }
            r0.A0F = r3     // Catch:{ all -> 0x171e }
            android.content.Context r3 = r11.requireContext()     // Catch:{ all -> 0x171e }
            int r4 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION     // Catch:{ all -> 0x171e }
            X.0Pl r44 = X.0Pl.A04(r3, r10)     // Catch:{ all -> 0x171e }
            X.2wh r6 = new X.2wh     // Catch:{ all -> 0x171e }
            r40 = r6
            r41 = r3
            r42 = r9
            r43 = r10
            r45 = r13
            r40.<init>(r41, r42, r43, r44, r45)     // Catch:{ all -> 0x171e }
            java.util.List r8 = r6.A04     // Catch:{ all -> 0x171e }
            r3 = r39
            boolean r3 = r8.contains(r3)     // Catch:{ all -> 0x171e }
            if (r3 != 0) goto L_0x0915
            X.2wl r7 = new X.2wl     // Catch:{ all -> 0x171e }
            r4 = r30
            r3 = r39
            r7.<init>(r4, r6, r3)     // Catch:{ all -> 0x171e }
            r8.add(r7)     // Catch:{ all -> 0x171e }
            java.util.Map r4 = r6.A05     // Catch:{ all -> 0x171e }
            r4.put(r3, r7)     // Catch:{ all -> 0x171e }
        L_0x0915:
            r0.A02 = r6     // Catch:{ all -> 0x171e }
            r11.registerLifecycleListener(r6)     // Catch:{ all -> 0x171e }
            r3 = 2342154114433089972(0x208100c2000101b4, double:4.0580438608082715E-152)
            boolean r3 = X.182.A06(r2, r10, r3)     // Catch:{ all -> 0x171e }
            if (r3 == 0) goto L_0x0944
            r3 = 36317801073481266(0x8106d900021632, double:3.030861866691877E-306)
            boolean r3 = X.182.A06(r2, r10, r3)     // Catch:{ all -> 0x171e }
            if (r3 != 0) goto L_0x0944
            X.2wf r6 = r0.A0F     // Catch:{ all -> 0x171e }
            if (r6 == 0) goto L_0x1716
            X.2lr r4 = r0.A0f     // Catch:{ all -> 0x171e }
            X.2wm r3 = new X.2wm     // Catch:{ all -> 0x171e }
            r7 = r3
            r8 = r10
            r9 = r39
            r10 = r4
            r11 = r5
            r12 = r6
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x171e }
            r0.A0G = r3     // Catch:{ all -> 0x171e }
        L_0x0944:
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x171e }
            X.2lj r0 = r0.A0o()     // Catch:{ all -> 0x171e }
            X.2lr r0 = r0.A0f     // Catch:{ all -> 0x171e }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x171e }
            r0.A02 = r3     // Catch:{ all -> 0x171e }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x0960
            r0 = 504655581(0x1e146edd, float:7.857981E-21)
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
        L_0x0960:
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            r3 = r32
            X.0qQ.A0B(r0, r3)     // Catch:{ all -> 0x1773 }
            r3 = 36317801073481266(0x8106d900021632, double:3.030861866691877E-306)
            boolean r0 = X.182.A06(r2, r0, r3)     // Catch:{ all -> 0x1773 }
            if (r0 != 0) goto L_0x0988
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2q2 r3 = r0.A07()     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2lj r0 = r0.A0o()     // Catch:{ all -> 0x1773 }
            X.2wm r0 = r0.A0G     // Catch:{ all -> 0x1773 }
            r3.A01 = r0     // Catch:{ all -> 0x1773 }
        L_0x0988:
            java.lang.String r3 = "MainFeedFragment.onCreate:FeedDelaySkipController"
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x0996
            r0 = -1105627388(0xffffffffbe197704, float:-0.14986807)
            X.0fS.A01(r3, r0)     // Catch:{ all -> 0x1773 }
        L_0x0996:
            com.instagram.common.session.UserSession r3 = r1.getSession()     // Catch:{ all -> 0x1705 }
            X.2wp r0 = new X.2wp     // Catch:{ all -> 0x1705 }
            r0.<init>(r3)     // Catch:{ all -> 0x1705 }
            boolean r0 = r0.A03()     // Catch:{ all -> 0x1705 }
            if (r0 == 0) goto L_0x09e9
            com.instagram.common.session.UserSession r37 = r1.getSession()     // Catch:{ all -> 0x1705 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1705 }
            X.2rI r41 = r0.A0J()     // Catch:{ all -> 0x1705 }
            com.instagram.common.session.UserSession r3 = r1.getSession()     // Catch:{ all -> 0x1705 }
            X.Xa7 r6 = new X.Xa7     // Catch:{ all -> 0x1705 }
            r0 = r31
            r6.<init>(r3, r0)     // Catch:{ all -> 0x1705 }
            X.0eM r0 = r1.A0l     // Catch:{ all -> 0x1705 }
            java.lang.Object r5 = r0.getValue()     // Catch:{ all -> 0x1705 }
            X.2wr r5 = (X.C234022wr) r5     // Catch:{ all -> 0x1705 }
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1705 }
            X.2wq r4 = new X.2wq     // Catch:{ all -> 0x1705 }
            r4.<init>(r0)     // Catch:{ all -> 0x1705 }
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1705 }
            X.2wp r3 = new X.2wp     // Catch:{ all -> 0x1705 }
            r3.<init>(r0)     // Catch:{ all -> 0x1705 }
            X.57Q r0 = new X.57Q     // Catch:{ all -> 0x1705 }
            r35 = r0
            r36 = r30
            r38 = r4
            r39 = r5
            r40 = r3
            r42 = r6
            r35.<init>(r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x1705 }
            r1.A0A = r0     // Catch:{ all -> 0x1705 }
        L_0x09e9:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x09f5
            r0 = 1839222956(0x6da050ac, float:6.201891E27)
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
        L_0x09f5:
            java.lang.String r3 = "MainFeedFragment.onCreate:initMediaLinkBroadcastHandler"
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x0a03
            r0 = 546183014(0x208e1766, float:2.407122E-19)
            X.0fS.A01(r3, r0)     // Catch:{ all -> 0x1773 }
        L_0x0a03:
            com.instagram.common.session.UserSession r4 = r1.getSession()     // Catch:{ all -> 0x16f4 }
            X.2wt r3 = new X.2wt     // Catch:{ all -> 0x16f4 }
            r0 = r31
            r3.<init>(r1, r4, r0)     // Catch:{ all -> 0x16f4 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16f4 }
            X.2rI r0 = r0.A0J()     // Catch:{ all -> 0x16f4 }
            r3.A00 = r0     // Catch:{ all -> 0x16f4 }
            r0 = r22
            X.2l0 r0 = r1.A02(r0)     // Catch:{ all -> 0x16f4 }
            r3.A02 = r0     // Catch:{ all -> 0x16f4 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16f4 }
            X.2kv r4 = r0.A1x     // Catch:{ all -> 0x16f4 }
            r0 = r32
            X.0qQ.A0B(r4, r0)     // Catch:{ all -> 0x16f4 }
            r3.A03 = r4     // Catch:{ all -> 0x16f4 }
            X.2ww r0 = r3.A08     // Catch:{ all -> 0x16f4 }
            r0.A00 = r4     // Catch:{ all -> 0x16f4 }
            java.lang.String r0 = r31.getModuleName()     // Catch:{ all -> 0x16f4 }
            r3.A04 = r0     // Catch:{ all -> 0x16f4 }
            X.57Q r0 = r1.A0A     // Catch:{ all -> 0x16f4 }
            r3.A01 = r0     // Catch:{ all -> 0x16f4 }
            r1.registerLifecycleListener(r3)     // Catch:{ all -> 0x16f4 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x0a4a
            r0 = 470121328(0x1c057b70, float:4.416555E-22)
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
        L_0x0a4a:
            java.lang.String r3 = "MainFeedFragment.onCreate:TombstoneModule"
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x0a58
            r0 = 789195390(0x2f0a2a7e, float:1.2566123E-10)
            X.0fS.A01(r3, r0)     // Catch:{ all -> 0x1773 }
        L_0x0a58:
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16e3 }
            X.2js r5 = r0.A03()     // Catch:{ all -> 0x16e3 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16e3 }
            X.2rI r7 = r0.A0J()     // Catch:{ all -> 0x16e3 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16e3 }
            X.2ks r0 = r0.A1w     // Catch:{ all -> 0x16e3 }
            X.2ku r0 = r0.A01     // Catch:{ all -> 0x16e3 }
            X.2xD r25 = new X.2xD     // Catch:{ all -> 0x16e3 }
            r3 = r25
            r4 = r1
            r6 = r0
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x16e3 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x0a86
            r0 = 1435014024(0x55889388, float:1.87709029E13)
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
        L_0x0a86:
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            r3 = 2342162575518604773(0x2081087400001de5, double:4.06521814359108E-152)
            boolean r0 = X.182.A06(r2, r0, r3)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x0aab
            com.instagram.common.session.UserSession r3 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.2xE r4 = new X.2xE     // Catch:{ all -> 0x1773 }
            r0 = r31
            r4.<init>(r0, r3)     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r3 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.2xI r0 = new X.2xI     // Catch:{ all -> 0x1773 }
            r0.<init>(r3, r4)     // Catch:{ all -> 0x1773 }
            r1.A0b = r0     // Catch:{ all -> 0x1773 }
        L_0x0aab:
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.2xN r4 = X.C234232xM.A00(r0)     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2xS r0 = r0.A0F()     // Catch:{ all -> 0x1773 }
            X.2uK r3 = r0.A0G     // Catch:{ all -> 0x1773 }
            r0 = r32
            X.0qQ.A0B(r3, r0)     // Catch:{ all -> 0x1773 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x1773 }
            r0.<init>(r3)     // Catch:{ all -> 0x1773 }
            r4.A00 = r0     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r5 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2rI r4 = r0.A0J()     // Catch:{ all -> 0x1773 }
            X.2xi r35 = new X.2xi     // Catch:{ all -> 0x1773 }
            r3 = r35
            r6 = r20
            r0 = r31
            r3.<init>(r6, r4, r5, r0)     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2my r3 = r0.A0N()     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2xS r0 = r0.A0F()     // Catch:{ all -> 0x1773 }
            r3.A00 = r0     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2pM r4 = r0.A0a()     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2xS r3 = r0.A0F()     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2lb r0 = r0.A0K()     // Catch:{ all -> 0x1773 }
            r4.A01 = r3     // Catch:{ all -> 0x1773 }
            r4.A00 = r0     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r3 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2kv r0 = r0.A1x     // Catch:{ all -> 0x1773 }
            X.2uY r7 = new X.2uY     // Catch:{ all -> 0x1773 }
            r7.<init>(r3, r0)     // Catch:{ all -> 0x1773 }
            java.util.ArrayList r49 = new java.util.ArrayList     // Catch:{ all -> 0x1773 }
            r49.<init>()     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2xS r0 = r0.A0F()     // Catch:{ all -> 0x1773 }
            X.2el r0 = r0.A0B     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x0b35
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            r0.A0F()     // Catch:{ all -> 0x1773 }
        L_0x0b35:
            java.lang.String r3 = "MainFeedFragment.onCreateMediaViewpointHelper"
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x0b43
            r0 = 1429045458(0x552d80d2, float:1.19230494E13)
            X.0fS.A01(r3, r0)     // Catch:{ all -> 0x1773 }
        L_0x0b43:
            com.instagram.common.session.UserSession r46 = r1.getSession()     // Catch:{ all -> 0x16d1 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16d1 }
            X.2el r47 = r0.A05()     // Catch:{ all -> 0x16d1 }
            com.instagram.common.session.UserSession r6 = r1.getSession()     // Catch:{ all -> 0x16d1 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16d1 }
            X.2kv r5 = r0.A1x     // Catch:{ all -> 0x16d1 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16d1 }
            X.2q2 r11 = r0.A07()     // Catch:{ all -> 0x16d1 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16d1 }
            X.2xS r9 = r0.A0F()     // Catch:{ all -> 0x16d1 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16d1 }
            X.2xq r12 = r0.A0e()     // Catch:{ all -> 0x16d1 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16d1 }
            X.2lj r0 = r0.A0o()     // Catch:{ all -> 0x16d1 }
            X.2ux r14 = r0.A07     // Catch:{ all -> 0x16d1 }
            java.lang.String r0 = r31.getModuleName()     // Catch:{ all -> 0x16d1 }
            X.0h9 r10 = r1.mLifecycleRegistry     // Catch:{ all -> 0x16d1 }
            X.0qQ.A07(r10)     // Catch:{ all -> 0x16d1 }
            X.2kj r3 = r1.A0A()     // Catch:{ all -> 0x16d1 }
            X.2lT r41 = r3.A0S()     // Catch:{ all -> 0x16d1 }
            X.57Q r8 = r1.A0A     // Catch:{ all -> 0x16d1 }
            r3 = 2
            X.0qQ.A0B(r6, r3)     // Catch:{ all -> 0x16d1 }
            r3 = 3
            X.0qQ.A0B(r5, r3)     // Catch:{ all -> 0x16d1 }
            r3 = 10
            X.0qQ.A0B(r0, r3)     // Catch:{ all -> 0x16d1 }
            X.1sy r42 = X.1sy.A0H     // Catch:{ all -> 0x16d1 }
            r3 = 36320670111507210(0x8109750000230a, double:3.032676257892173E-306)
            boolean r3 = X.182.A06(r2, r6, r3)     // Catch:{ all -> 0x16d1 }
            if (r3 == 0) goto L_0x0c4c
            X.2y4 r4 = new X.2y4     // Catch:{ all -> 0x16d1 }
            r3 = r31
            r4.<init>(r6, r3, r5)     // Catch:{ all -> 0x16d1 }
        L_0x0baf:
            X.2pb r4 = (X.C230422pb) r4     // Catch:{ all -> 0x16d1 }
            X.2pc r3 = X.C230432pc.FEED     // Catch:{ all -> 0x16d1 }
            X.2y6 r3 = X.AnonymousClass2y5.A00(r6, r4, r3)     // Catch:{ all -> 0x16d1 }
            X.2y7 r4 = new X.2y7     // Catch:{ all -> 0x16d1 }
            r4.<init>(r3)     // Catch:{ all -> 0x16d1 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x16d1 }
            r3.<init>(r13)     // Catch:{ all -> 0x16d1 }
            r3.add(r4)     // Catch:{ all -> 0x16d1 }
            r36 = r30
            r37 = r20
            r38 = r6
            r39 = r7
            r40 = r31
            r43 = r5
            r44 = r5
            r45 = r3
            java.util.ArrayList r7 = X.C234542yA.A00(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)     // Catch:{ all -> 0x16d1 }
            X.0uX r4 = X.0uX.A00(r6)     // Catch:{ all -> 0x16d1 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x16d1 }
            X.2zi r3 = new X.2zi     // Catch:{ all -> 0x16d1 }
            r3.<init>(r6, r4)     // Catch:{ all -> 0x16d1 }
            r7.add(r3)     // Catch:{ all -> 0x16d1 }
            X.2zl r4 = new X.2zl     // Catch:{ all -> 0x16d1 }
            r3 = r30
            r4.<init>(r3)     // Catch:{ all -> 0x16d1 }
            r7.add(r4)     // Catch:{ all -> 0x16d1 }
            X.2zm r4 = new X.2zm     // Catch:{ all -> 0x16d1 }
            r4.<init>(r3)     // Catch:{ all -> 0x16d1 }
            r7.add(r4)     // Catch:{ all -> 0x16d1 }
            X.2zo r3 = new X.2zo     // Catch:{ all -> 0x16d1 }
            r3.<init>(r10, r6, r11, r0)     // Catch:{ all -> 0x16d1 }
            r7.add(r3)     // Catch:{ all -> 0x16d1 }
            r3 = 36310366485086245(0x81001600020025, double:3.0261602030541813E-306)
            boolean r3 = X.182.A06(r2, r6, r3)     // Catch:{ all -> 0x16d1 }
            if (r3 == 0) goto L_0x0c18
            X.2zq r10 = new X.2zq     // Catch:{ all -> 0x16d1 }
            r4 = r30
            r3 = r31
            r10.<init>(r4, r6, r3)     // Catch:{ all -> 0x16d1 }
            r7.add(r10)     // Catch:{ all -> 0x16d1 }
        L_0x0c18:
            X.2el r3 = r9.A0B     // Catch:{ all -> 0x16d1 }
            if (r3 == 0) goto L_0x0c24
            X.30B r3 = new X.30B     // Catch:{ all -> 0x16d1 }
            r3.<init>(r9)     // Catch:{ all -> 0x16d1 }
            r7.add(r3)     // Catch:{ all -> 0x16d1 }
        L_0x0c24:
            boolean r3 = X.AnonymousClass30D.A07(r6)     // Catch:{ all -> 0x16d1 }
            if (r3 == 0) goto L_0x0c32
            X.30E r3 = new X.30E     // Catch:{ all -> 0x16d1 }
            r3.<init>(r12)     // Catch:{ all -> 0x16d1 }
            r7.add(r3)     // Catch:{ all -> 0x16d1 }
        L_0x0c32:
            X.30G r3 = new X.30G     // Catch:{ all -> 0x16d1 }
            r36 = r3
            r38 = r30
            r39 = r6
            r41 = r14
            r36.<init>(r37, r38, r39, r40, r41)     // Catch:{ all -> 0x16d1 }
            r7.add(r3)     // Catch:{ all -> 0x16d1 }
            r3 = 36319278542101600(0x81083100001c60, double:3.031796223796665E-306)
            boolean r3 = X.182.A06(r2, r6, r3)     // Catch:{ all -> 0x16d1 }
            goto L_0x0c55
        L_0x0c4c:
            X.IYp r4 = new X.IYp     // Catch:{ all -> 0x16d1 }
            r3 = r31
            r4.<init>(r6, r3, r5)     // Catch:{ all -> 0x16d1 }
            goto L_0x0baf
        L_0x0c55:
            if (r3 == 0) goto L_0x0c5f
            X.580 r3 = new X.580     // Catch:{ all -> 0x16d1 }
            r3.<init>(r6)     // Catch:{ all -> 0x16d1 }
            r7.add(r3)     // Catch:{ all -> 0x16d1 }
        L_0x0c5f:
            X.2zG r4 = new X.2zG     // Catch:{ all -> 0x16d1 }
            r3 = r31
            r4.<init>(r6, r3)     // Catch:{ all -> 0x16d1 }
            r7.add(r4)     // Catch:{ all -> 0x16d1 }
            if (r8 == 0) goto L_0x0c7b
            X.2wp r3 = r8.A0L     // Catch:{ all -> 0x16d1 }
            boolean r3 = r3.A03()     // Catch:{ all -> 0x16d1 }
            if (r3 != r13) goto L_0x0c7b
            X.4FY r3 = new X.4FY     // Catch:{ all -> 0x16d1 }
            r3.<init>(r6, r8)     // Catch:{ all -> 0x16d1 }
            r7.add(r3)     // Catch:{ all -> 0x16d1 }
        L_0x0c7b:
            r3 = 36329689542836478(0x8111a9000040fe, double:3.038380182583137E-306)
            boolean r3 = X.182.A06(r2, r6, r3)     // Catch:{ all -> 0x16d1 }
            if (r3 == 0) goto L_0x0c90
            X.HBK r3 = new X.HBK     // Catch:{ all -> 0x16d1 }
            r4 = r20
            r3.<init>(r4, r6, r5, r0)     // Catch:{ all -> 0x16d1 }
            r7.add(r3)     // Catch:{ all -> 0x16d1 }
        L_0x0c90:
            X.30S r56 = new X.30S     // Catch:{ all -> 0x16d1 }
            r44 = r56
            r45 = r1
            r48 = r7
            r44.<init>(r45, r46, r47, r48, r49)     // Catch:{ all -> 0x16d1 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x0ca7
            r0 = -668416187(0xffffffffd828c745, float:-7.4229524E14)
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
        L_0x0ca7:
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            boolean r0 = X.AnonymousClass2o2.A06(r0)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x0cc6
            com.instagram.common.session.UserSession r6 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.Lip r5 = X.C54975Ha8.A00(r6)     // Catch:{ all -> 0x1773 }
            X.6jB r4 = X.C314986jA.A00(r6)     // Catch:{ all -> 0x1773 }
            com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl r3 = new com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl     // Catch:{ all -> 0x1773 }
            r0 = r31
            r3.<init>(r0, r6, r5, r4)     // Catch:{ all -> 0x1773 }
            r1.A0Y = r3     // Catch:{ all -> 0x1773 }
        L_0x0cc6:
            com.instagram.common.session.UserSession r5 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2rI r4 = r0.A0J()     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2lj r0 = r0.A0o()     // Catch:{ all -> 0x1773 }
            X.2un r3 = r0.A09     // Catch:{ all -> 0x1773 }
            X.30b r0 = new X.30b     // Catch:{ all -> 0x1773 }
            r0.<init>(r5, r4, r3)     // Catch:{ all -> 0x1773 }
            r1.A0H = r0     // Catch:{ all -> 0x1773 }
            X.2kj r3 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2rI r3 = r3.A0J()     // Catch:{ all -> 0x1773 }
            X.2rX r3 = r3.A00     // Catch:{ all -> 0x1773 }
            X.2rW r3 = (X.AnonymousClass2rW) r3     // Catch:{ all -> 0x1773 }
            r3.Eaa(r0)     // Catch:{ all -> 0x1773 }
            java.lang.String r3 = "MainFeedFragment.onCreate:MainFeedListAdapterDelegate"
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x0d00
            r0 = -46291052(0xfffffffffd3da794, float:-1.5755888E37)
            X.0fS.A01(r3, r0)     // Catch:{ all -> 0x1773 }
        L_0x0d00:
            X.0hq r15 = r1.mFragmentManager     // Catch:{ all -> 0x16bf }
            if (r15 == 0) goto L_0x16af
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.2rI r57 = r0.A0J()     // Catch:{ all -> 0x16bf }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.2xS r55 = r0.A0F()     // Catch:{ all -> 0x16bf }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.2xq r65 = r0.A0e()     // Catch:{ all -> 0x16bf }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.30c r46 = r0.A06()     // Catch:{ all -> 0x16bf }
            com.instagram.common.session.UserSession r42 = r1.getSession()     // Catch:{ all -> 0x16bf }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.2xI r50 = r0.A0D()     // Catch:{ all -> 0x16bf }
            X.2kj r4 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.2xI r8 = r4.A0F     // Catch:{ all -> 0x16bf }
            if (r8 != 0) goto L_0x0d46
            com.instagram.common.session.UserSession r3 = r4.A1t     // Catch:{ all -> 0x16bf }
            X.30f r0 = new X.30f     // Catch:{ all -> 0x16bf }
            r0.<init>(r3)     // Catch:{ all -> 0x16bf }
            X.2xI r8 = new X.2xI     // Catch:{ all -> 0x16bf }
            r8.<init>(r3, r0)     // Catch:{ all -> 0x16bf }
            r4.A0F = r8     // Catch:{ all -> 0x16bf }
        L_0x0d46:
            X.2xI r0 = r1.A0b     // Catch:{ all -> 0x16bf }
            r52 = r0
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.30h r67 = r0.A0i()     // Catch:{ all -> 0x16bf }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.2kv r0 = r0.A1x     // Catch:{ all -> 0x16bf }
            r70 = r0
            com.instagram.common.session.UserSession r3 = r1.getSession()     // Catch:{ all -> 0x16bf }
            X.30l r14 = new X.30l     // Catch:{ all -> 0x16bf }
            r0 = r20
            r14.<init>(r0, r3)     // Catch:{ all -> 0x16bf }
            X.0Pk r4 = X.0Pl.A0n     // Catch:{ all -> 0x16bf }
            com.instagram.common.session.UserSession r3 = r1.getSession()     // Catch:{ all -> 0x16bf }
            r0 = r30
            X.0Pl r54 = r4.A00(r0, r3)     // Catch:{ all -> 0x16bf }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.2lG r59 = r0.A0R()     // Catch:{ all -> 0x16bf }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.2el r43 = r0.A05()     // Catch:{ all -> 0x16bf }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.2os r62 = r0.A0b()     // Catch:{ all -> 0x16bf }
            X.30n r44 = new X.30n     // Catch:{ all -> 0x16bf }
            r44.<init>()     // Catch:{ all -> 0x16bf }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.2lj r0 = r0.A0o()     // Catch:{ all -> 0x16bf }
            X.2un r0 = r0.A09     // Catch:{ all -> 0x16bf }
            r61 = r0
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.2lj r0 = r0.A0o()     // Catch:{ all -> 0x16bf }
            X.2ux r0 = r0.A07     // Catch:{ all -> 0x16bf }
            r58 = r0
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.2lj r0 = r0.A0o()     // Catch:{ all -> 0x16bf }
            X.2lr r0 = r0.A0f     // Catch:{ all -> 0x16bf }
            boolean r3 = r0.A0b     // Catch:{ all -> 0x16bf }
            if (r3 != 0) goto L_0x0e89
            X.1UN r0 = r0.A0R     // Catch:{ all -> 0x16bf }
            X.0eM r0 = r0.A06     // Catch:{ all -> 0x16bf }
            java.lang.Object r3 = r0.getValue()     // Catch:{ all -> 0x16bf }
            X.1Uy r3 = (X.1Uy) r3     // Catch:{ all -> 0x16bf }
            com.instagram.mainfeed.network.FeedCacheCoordinator r3 = (com.instagram.mainfeed.network.FeedCacheCoordinator) r3     // Catch:{ all -> 0x16bf }
        L_0x0dc0:
            com.instagram.common.session.UserSession r5 = r1.getSession()     // Catch:{ all -> 0x16bf }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.2qK r0 = r0.A0v()     // Catch:{ all -> 0x16bf }
            X.2qi r4 = r0.A05     // Catch:{ all -> 0x16bf }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.2qK r0 = r0.A0v()     // Catch:{ all -> 0x16bf }
            X.2qT r0 = r0.A07     // Catch:{ all -> 0x16bf }
            X.30o r12 = new X.30o     // Catch:{ all -> 0x16bf }
            r12.<init>(r5, r4, r0)     // Catch:{ all -> 0x16bf }
            r0 = r22
            X.2l0 r68 = r1.A02(r0)     // Catch:{ all -> 0x16bf }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.30p r7 = r0.A0R     // Catch:{ all -> 0x16bf }
            if (r7 != 0) goto L_0x0e04
            X.2jw r4 = r0.A20     // Catch:{ all -> 0x16bf }
            android.view.View r9 = r4.mView     // Catch:{ all -> 0x16bf }
            r4 = 43
            X.9LY r5 = new X.9LY     // Catch:{ all -> 0x16bf }
            r5.<init>(r0, r4)     // Catch:{ all -> 0x16bf }
            r6 = 44
            X.9LY r4 = new X.9LY     // Catch:{ all -> 0x16bf }
            r4.<init>(r0, r6)     // Catch:{ all -> 0x16bf }
            X.30p r7 = new X.30p     // Catch:{ all -> 0x16bf }
            r7.<init>(r9, r5, r4)     // Catch:{ all -> 0x16bf }
            r0.A0R = r7     // Catch:{ all -> 0x16bf }
        L_0x0e04:
            X.57N r0 = r1.A0Y     // Catch:{ all -> 0x16bf }
            r45 = r0
            X.2kj r4 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.30r r6 = r4.A01     // Catch:{ all -> 0x16bf }
            if (r6 != 0) goto L_0x0e1b
            com.instagram.common.session.UserSession r5 = r4.A1t     // Catch:{ all -> 0x16bf }
            X.30r r6 = new X.30r     // Catch:{ all -> 0x16bf }
            r0 = r31
            r6.<init>(r0, r5)     // Catch:{ all -> 0x16bf }
            r4.A01 = r6     // Catch:{ all -> 0x16bf }
        L_0x0e1b:
            X.2kj r5 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.30t r4 = r5.A02     // Catch:{ all -> 0x16bf }
            if (r4 != 0) goto L_0x0e30
            X.2jw r10 = r5.A20     // Catch:{ all -> 0x16bf }
            com.instagram.common.session.UserSession r9 = r5.A1t     // Catch:{ all -> 0x16bf }
            X.30t r4 = new X.30t     // Catch:{ all -> 0x16bf }
            r0 = r31
            r4.<init>(r10, r0, r9)     // Catch:{ all -> 0x16bf }
            r5.A02 = r4     // Catch:{ all -> 0x16bf }
        L_0x0e30:
            X.2qi r0 = r4.A01     // Catch:{ all -> 0x16bf }
            r66 = r0
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.2js r39 = r0.A03()     // Catch:{ all -> 0x16bf }
            X.30b r11 = r1.A0H     // Catch:{ all -> 0x16bf }
            if (r11 == 0) goto L_0x16a4
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.2lT r49 = r0.A0S()     // Catch:{ all -> 0x16bf }
            java.lang.String r0 = r1.A0K     // Catch:{ all -> 0x16bf }
            r73 = r0
            X.2kj r4 = r1.A0A()     // Catch:{ all -> 0x16bf }
            X.30w r0 = r4.A0l     // Catch:{ all -> 0x16bf }
            if (r0 != 0) goto L_0x0e63
            X.2xS r10 = r4.A0F()     // Catch:{ all -> 0x16bf }
            X.2jw r9 = r4.A20     // Catch:{ all -> 0x16bf }
            com.instagram.common.session.UserSession r5 = r4.A1t     // Catch:{ all -> 0x16bf }
            X.30w r0 = new X.30w     // Catch:{ all -> 0x16bf }
            r0.<init>(r9, r5, r10)     // Catch:{ all -> 0x16bf }
            r4.A0l = r0     // Catch:{ all -> 0x16bf }
        L_0x0e63:
            X.57Q r5 = r1.A0A     // Catch:{ all -> 0x16bf }
            X.30x r4 = new X.30x     // Catch:{ all -> 0x16bf }
            r36 = r4
            r37 = r15
            r38 = r6
            r40 = r0
            r41 = r14
            r47 = r31
            r48 = r25
            r51 = r8
            r53 = r12
            r60 = r5
            r63 = r3
            r64 = r7
            r69 = r35
            r71 = r11
            r72 = r1
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73)     // Catch:{ all -> 0x16bf }
            goto L_0x0ea4
        L_0x0e89:
            com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource r3 = r0.A06     // Catch:{ all -> 0x16bf }
            if (r3 != 0) goto L_0x0dc0
            com.instagram.common.session.UserSession r3 = r0.A0J     // Catch:{ all -> 0x16bf }
            com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource r3 = X.C63310Kut.A00(r3)     // Catch:{ all -> 0x16bf }
            X.3kK r5 = r0.A0X     // Catch:{ all -> 0x16bf }
            r3.A03 = r5     // Catch:{ all -> 0x16bf }
            com.instagram.common.session.UserSession r6 = r3.A09     // Catch:{ all -> 0x16bf }
            X.2lt r4 = new X.2lt     // Catch:{ all -> 0x16bf }
            r4.<init>(r6, r5)     // Catch:{ all -> 0x16bf }
            r3.A02 = r4     // Catch:{ all -> 0x16bf }
            r0.A06 = r3     // Catch:{ all -> 0x16bf }
            goto L_0x0dc0
        L_0x0ea4:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x0eb0
            r0 = 310838194(0x128703b2, float:8.520609E-28)
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
        L_0x0eb0:
            r1.A0I = r4     // Catch:{ all -> 0x1773 }
            java.lang.String r3 = "MainFeedFragment.onCreate:FeedListControllerBuilder"
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x0ec0
            r0 = 13690140(0xd0e51c, float:1.9183972E-38)
            X.0fS.A01(r3, r0)     // Catch:{ all -> 0x1773 }
        L_0x0ec0:
            X.0hq r5 = r1.mFragmentManager     // Catch:{ all -> 0x1692 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1692 }
            X.2rI r4 = r0.A0J()     // Catch:{ all -> 0x1692 }
            X.2kR r3 = r1.A0a     // Catch:{ all -> 0x1692 }
            if (r3 != 0) goto L_0x0ed6
            X.0qQ.A0F(r23)     // Catch:{ all -> 0x1692 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x1692 }
            throw r0     // Catch:{ all -> 0x1692 }
        L_0x0ed6:
            X.32x r0 = new X.32x     // Catch:{ all -> 0x1692 }
            r0.<init>(r1, r5, r4, r3)     // Catch:{ all -> 0x1692 }
            X.2kj r3 = r1.A0A()     // Catch:{ all -> 0x1692 }
            X.2xS r3 = r3.A0F()     // Catch:{ all -> 0x1692 }
            r0.A0G = r3     // Catch:{ all -> 0x1692 }
            X.2kj r3 = r1.A0A()     // Catch:{ all -> 0x1692 }
            X.2xq r3 = r3.A0e()     // Catch:{ all -> 0x1692 }
            r0.A0K = r3     // Catch:{ all -> 0x1692 }
            r3 = r35
            r0.A0Q = r3     // Catch:{ all -> 0x1692 }
            X.30x r3 = r1.A0I     // Catch:{ all -> 0x1692 }
            r0.A0A = r3     // Catch:{ all -> 0x1692 }
            X.2kj r3 = r1.A0A()     // Catch:{ all -> 0x1692 }
            X.30c r3 = r3.A06()     // Catch:{ all -> 0x1692 }
            r0.A08 = r3     // Catch:{ all -> 0x1692 }
            r3 = r25
            r0.A0C = r3     // Catch:{ all -> 0x1692 }
            X.2kj r3 = r1.A0A()     // Catch:{ all -> 0x1692 }
            X.30h r3 = r3.A0i()     // Catch:{ all -> 0x1692 }
            r0.A0N = r3     // Catch:{ all -> 0x1692 }
            X.2kj r3 = r1.A0A()     // Catch:{ all -> 0x1692 }
            X.2js r3 = r3.A03()     // Catch:{ all -> 0x1692 }
            r0.A02 = r3     // Catch:{ all -> 0x1692 }
            X.2kj r3 = r1.A0A()     // Catch:{ all -> 0x1692 }
            X.2xI r3 = r3.A0D()     // Catch:{ all -> 0x1692 }
            r0.A0E = r3     // Catch:{ all -> 0x1692 }
            X.57Q r3 = r1.A0A     // Catch:{ all -> 0x1692 }
            r0.A0I = r3     // Catch:{ all -> 0x1692 }
            X.32y r3 = new X.32y     // Catch:{ all -> 0x1692 }
            r3.<init>()     // Catch:{ all -> 0x1692 }
            r0.A0B = r3     // Catch:{ all -> 0x1692 }
            X.2kj r3 = r1.A0A()     // Catch:{ all -> 0x1692 }
            X.2kv r3 = r3.A1x     // Catch:{ all -> 0x1692 }
            r0.A0R = r3     // Catch:{ all -> 0x1692 }
            X.2kj r3 = r1.A0A()     // Catch:{ all -> 0x1692 }
            X.2kv r3 = r3.A1x     // Catch:{ all -> 0x1692 }
            r0.A0J = r3     // Catch:{ all -> 0x1692 }
            r3 = 23592977(0x1680011, float:4.2611718E-38)
            r0.A00 = r3     // Catch:{ all -> 0x1692 }
            r3 = r22
            X.2l0 r3 = r1.A02(r3)     // Catch:{ all -> 0x1692 }
            r0.A0P = r3     // Catch:{ all -> 0x1692 }
            X.2kj r4 = r1.A0A()     // Catch:{ all -> 0x1692 }
            X.2le r3 = r4.A00     // Catch:{ all -> 0x1692 }
            if (r3 != 0) goto L_0x0f5a
            X.2le r3 = new X.2le     // Catch:{ all -> 0x1692 }
            r3.<init>()     // Catch:{ all -> 0x1692 }
            r4.A00 = r3     // Catch:{ all -> 0x1692 }
        L_0x0f5a:
            r0.A01 = r3     // Catch:{ all -> 0x1692 }
            X.332 r0 = r0.A00()     // Catch:{ all -> 0x1692 }
            r0.onCreate()     // Catch:{ all -> 0x1692 }
            boolean r3 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r3 == 0) goto L_0x0f6f
            r3 = -284561024(0xffffffffef09f180, float:-4.26914E28)
            X.0fS.A00(r3)     // Catch:{ all -> 0x1773 }
        L_0x0f6f:
            r1.A07 = r0     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            r3 = 36318140377143201(0x810728001517a1, double:3.031076443693951E-306)
            boolean r0 = X.182.A06(r2, r0, r3)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x0f90
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.34K r0 = X.AnonymousClass34J.A00(r0)     // Catch:{ all -> 0x1773 }
            r3 = r22
            X.2l0 r3 = r1.A02(r3)     // Catch:{ all -> 0x1773 }
            r0.A01 = r3     // Catch:{ all -> 0x1773 }
        L_0x0f90:
            com.instagram.common.session.UserSession r3 = r1.getSession()     // Catch:{ all -> 0x1773 }
            java.lang.String r0 = r31.getModuleName()     // Catch:{ all -> 0x1773 }
            X.34L r7 = new X.34L     // Catch:{ all -> 0x1773 }
            r7.<init>(r3, r0)     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r6 = r1.getSession()     // Catch:{ all -> 0x1773 }
            java.lang.String r5 = r31.getModuleName()     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            r3 = r32
            X.0qQ.A0B(r0, r3)     // Catch:{ all -> 0x1773 }
            r3 = 36878470401884338(0x8304c6002a00b2, double:3.3854314076081546E-306)
            java.lang.String r8 = X.182.A04(r2, r0, r3)     // Catch:{ all -> 0x1773 }
            r3 = 36878470401818801(0x8304c6002900b1, double:3.385431407566709E-306)
            java.lang.String r0 = X.182.A04(r2, r0, r3)     // Catch:{ all -> 0x1773 }
            X.34N r4 = X.AnonymousClass34M.A01(r8)     // Catch:{ all -> 0x1773 }
            X.34P r0 = X.AnonymousClass34O.A00(r0)     // Catch:{ all -> 0x1773 }
            X.34Q r3 = new X.34Q     // Catch:{ all -> 0x1773 }
            r3.<init>(r4, r0)     // Catch:{ all -> 0x1773 }
            X.34R r0 = new X.34R     // Catch:{ all -> 0x1773 }
            r0.<init>(r6, r3, r5)     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r3 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.1wY r4 = X.1wY.A00(r3)     // Catch:{ all -> 0x1773 }
            java.lang.String r3 = r31.getModuleName()     // Catch:{ all -> 0x1773 }
            java.lang.Integer r5 = X.1wY.A0F     // Catch:{ all -> 0x1773 }
            X.0qQ.A08(r5)     // Catch:{ all -> 0x1773 }
            r4.A07(r7, r0, r3)     // Catch:{ all -> 0x1773 }
            if (r17 != 0) goto L_0x1009
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.34T r0 = r0.A0h()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2lL r0 = r0.A0P()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.34a r0 = r0.A0O()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
        L_0x1009:
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2lj r0 = r0.A0o()     // Catch:{ all -> 0x1773 }
            X.353 r3 = new X.353     // Catch:{ all -> 0x1773 }
            r3.<init>(r1)     // Catch:{ all -> 0x1773 }
            X.2lo r0 = r0.A0i     // Catch:{ all -> 0x1773 }
            r0.A00 = r3     // Catch:{ all -> 0x1773 }
            X.0h9 r3 = r1.mLifecycleRegistry     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.358 r0 = r0.A0W()     // Catch:{ all -> 0x1773 }
            r3.A09(r0)     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2rI r3 = r0.A0J()     // Catch:{ all -> 0x1773 }
            X.35A r0 = new X.35A     // Catch:{ all -> 0x1773 }
            r0.<init>(r1)     // Catch:{ all -> 0x1773 }
            r3.registerDataSetObserver(r0)     // Catch:{ all -> 0x1773 }
            X.AnonymousClass35B.A00()     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r6 = r1.getSession()     // Catch:{ all -> 0x1773 }
            if (r6 == 0) goto L_0x1176
            X.35C r5 = new X.35C     // Catch:{ all -> 0x1773 }
            r5.<init>(r6)     // Catch:{ all -> 0x1773 }
            X.1Av r7 = r5.A01     // Catch:{ all -> 0x1773 }
            X.0s0 r8 = r7.A79     // Catch:{ all -> 0x1773 }
            X.0YZ[] r25 = X.1Av.A8a     // Catch:{ all -> 0x1773 }
            r17 = 252(0xfc, float:3.53E-43)
            r0 = r25[r17]     // Catch:{ all -> 0x1773 }
            java.lang.Object r0 = r8.CDM(r7, r0)     // Catch:{ all -> 0x1773 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x1176
            X.16F r0 = X.16P.A00(r0)     // Catch:{ IOException -> 0x1176 }
            X.Ezs r0 = X.C49782F6q.parseFromJson(r0)     // Catch:{ IOException -> 0x1176 }
            r12 = 0
            if (r0 == 0) goto L_0x1176
            java.lang.Boolean r3 = r0.A02     // Catch:{ IOException -> 0x1176 }
            if (r3 == 0) goto L_0x1095
            boolean r3 = r3.booleanValue()     // Catch:{ IOException -> 0x1176 }
            if (r3 == 0) goto L_0x1095
            int r11 = r0.A00     // Catch:{ IOException -> 0x1176 }
            com.instagram.common.session.UserSession r9 = r5.A00     // Catch:{ IOException -> 0x1176 }
            r3 = 36593945995707936(0x82020000010620, double:3.205497027454374E-306)
            r10 = r29
            long r22 = X.182.A01(r10, r9, r3)     // Catch:{ IOException -> 0x1176 }
            r14 = -1
            int r3 = (r22 > r14 ? 1 : (r22 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x1086
            long r3 = (long) r11     // Catch:{ IOException -> 0x1176 }
            int r10 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r10 >= 0) goto L_0x10c7
        L_0x1086:
            r3 = 36312471018931327(0x8102000000047f, double:3.027491118732089E-306)
            r10 = r29
            boolean r3 = X.182.A06(r10, r9, r3)     // Catch:{ IOException -> 0x1176 }
            if (r3 == 0) goto L_0x10c7
            r12 = 1
            goto L_0x10c1
        L_0x1095:
            int r11 = r0.A00     // Catch:{ IOException -> 0x1176 }
            com.instagram.common.session.UserSession r9 = r5.A00     // Catch:{ IOException -> 0x1176 }
            r3 = 36593945995707936(0x82020000010620, double:3.205497027454374E-306)
            r10 = r29
            long r22 = X.182.A01(r10, r9, r3)     // Catch:{ IOException -> 0x1176 }
            r14 = -1
            int r3 = (r22 > r14 ? 1 : (r22 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x10af
            long r3 = (long) r11     // Catch:{ IOException -> 0x1176 }
            int r10 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r10 >= 0) goto L_0x10bb
        L_0x10af:
            r3 = 36312471018931327(0x8102000000047f, double:3.027491118732089E-306)
            boolean r3 = X.182.A06(r2, r9, r3)     // Catch:{ IOException -> 0x1176 }
            if (r3 == 0) goto L_0x10bb
            r12 = 1
        L_0x10bb:
            r3 = r28
            r0.A02 = r3     // Catch:{ IOException -> 0x1176 }
            if (r12 == 0) goto L_0x10c7
        L_0x10c1:
            int r3 = r0.A00     // Catch:{ IOException -> 0x1176 }
            int r3 = r3 + 1
            r0.A00 = r3     // Catch:{ IOException -> 0x1176 }
        L_0x10c7:
            java.lang.String r4 = X.C49782F6q.A00(r0)     // Catch:{ IOException -> 0x1176 }
            r3 = r25[r17]     // Catch:{ IOException -> 0x1176 }
            r8.Epx(r7, r4, r3)     // Catch:{ IOException -> 0x1176 }
            if (r12 == 0) goto L_0x1176
            X.FRM r7 = new X.FRM     // Catch:{ all -> 0x1773 }
            r7.<init>()     // Catch:{ all -> 0x1773 }
            r7.A00 = r6     // Catch:{ all -> 0x1773 }
            X.EXD r3 = r0.A01     // Catch:{ all -> 0x1773 }
            r7.A01 = r3     // Catch:{ all -> 0x1773 }
            X.FBl r8 = X.C47938ENp.A03     // Catch:{ all -> 0x1773 }
            X.Ffq r4 = new X.Ffq     // Catch:{ all -> 0x1773 }
            r4.<init>(r5)     // Catch:{ all -> 0x1773 }
            r3 = r30
            X.ENp r5 = r8.A01(r3, r6, r7, r4)     // Catch:{ all -> 0x1773 }
            java.util.List r3 = r0.A04     // Catch:{ all -> 0x1773 }
            X.ENv r3 = X.C49045EoP.A00(r7, r3)     // Catch:{ all -> 0x1773 }
            java.lang.Integer r0 = r0.A03     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x10ff
            int r7 = r0.intValue()     // Catch:{ all -> 0x1773 }
        L_0x10f8:
            r5.A01 = r3     // Catch:{ all -> 0x1773 }
            int r4 = r3.A00     // Catch:{ all -> 0x1773 }
            if (r4 > 0) goto L_0x1102
            goto L_0x1101
        L_0x10ff:
            r7 = 0
            goto L_0x10f8
        L_0x1101:
            r4 = 0
        L_0x1102:
            java.util.List r3 = r3.A01     // Catch:{ all -> 0x1773 }
            int r0 = r3.size()     // Catch:{ all -> 0x1773 }
            if (r4 >= r0) goto L_0x1145
            int r0 = r3.size()     // Catch:{ all -> 0x1773 }
            java.util.List r0 = r3.subList(r4, r0)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x114b
        L_0x1114:
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x1773 }
            if (r0 != 0) goto L_0x114b
            X.F39 r4 = r5.A01     // Catch:{ all -> 0x1773 }
            java.util.List r3 = r4.A01     // Catch:{ all -> 0x1773 }
            int r0 = r3.size()     // Catch:{ all -> 0x1773 }
            if (r7 >= r0) goto L_0x113f
            java.lang.Object r0 = r3.get(r7)     // Catch:{ all -> 0x1773 }
            X.F3l r0 = (X.C49722F3l) r0     // Catch:{ all -> 0x1773 }
        L_0x112a:
            r4.A00 = r7     // Catch:{ all -> 0x1773 }
        L_0x112c:
            r5.A00 = r0     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x116f
            java.util.Map r3 = r5.A04     // Catch:{ all -> 0x1773 }
            boolean r0 = r3.containsKey(r0)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x116f
            X.F39 r0 = r5.A01     // Catch:{ all -> 0x1773 }
            X.F3l r0 = r0.A00()     // Catch:{ all -> 0x1773 }
            goto L_0x112c
        L_0x113f:
            r0 = 0
            int r7 = r3.size()     // Catch:{ all -> 0x1773 }
            goto L_0x112a
        L_0x1145:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x1773 }
            r0.<init>()     // Catch:{ all -> 0x1773 }
            goto L_0x1114
        L_0x114b:
            r5.A01()     // Catch:{ all -> 0x1773 }
            r0 = r24
            r5.A00 = r0     // Catch:{ all -> 0x1773 }
            java.util.Set r3 = r5.A02     // Catch:{ all -> 0x1773 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x1773 }
            r0.<init>()     // Catch:{ all -> 0x1773 }
            r5.A02 = r0     // Catch:{ all -> 0x1773 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x1773 }
        L_0x115f:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x116f
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x1773 }
            X.G6A r0 = (X.G6A) r0     // Catch:{ all -> 0x1773 }
            r0.onFinished()     // Catch:{ all -> 0x1773 }
            goto L_0x115f
        L_0x116f:
            r3 = r30
            r0 = r32
            X.C49044EoO.A00(r6, r3, r0)     // Catch:{ all -> 0x1773 }
        L_0x1176:
            X.AnonymousClass35B.A00()     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.0qQ.A0B(r0, r13)     // Catch:{ all -> 0x1773 }
            X.1Av r5 = X.1Au.A00(r0)     // Catch:{ all -> 0x1773 }
            X.0s0 r4 = r5.A4i     // Catch:{ all -> 0x1773 }
            X.0YZ[] r10 = X.1Av.A8a     // Catch:{ all -> 0x1773 }
            r9 = 36
            r3 = r10[r9]     // Catch:{ all -> 0x1773 }
            java.lang.Object r3 = r4.CDM(r5, r3)     // Catch:{ all -> 0x1773 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x1773 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x1773 }
            if (r3 == r13) goto L_0x1277
            X.0xa r6 = r5.A01     // Catch:{ all -> 0x1773 }
            java.lang.String r5 = "nux_started_timestamp"
            r3 = r18
            long r7 = r6.getLong(r5, r3)     // Catch:{ all -> 0x1773 }
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 == 0) goto L_0x1277
            r3 = 36330097564860873(0x811208000241c9, double:3.038638217354337E-306)
            r7 = r29
            boolean r3 = X.182.A06(r7, r0, r3)     // Catch:{ all -> 0x1773 }
            if (r3 == 0) goto L_0x1277
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x1773 }
            r3 = r18
            long r3 = r6.getLong(r5, r3)     // Catch:{ all -> 0x1773 }
            long r7 = r7 - r3
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x1277
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x1773 }
            r5.<init>()     // Catch:{ all -> 0x1773 }
            r3 = r30
            boolean r3 = X.C267044ar.A00(r3, r0)     // Catch:{ all -> 0x1773 }
            if (r3 == 0) goto L_0x11f1
            r3 = 36330097564729800(0x811208000041c8, double:3.038638217271446E-306)
            boolean r3 = X.182.A06(r2, r0, r3)     // Catch:{ all -> 0x1773 }
            if (r3 == 0) goto L_0x11f1
            X.EZx r4 = X.C48155EZx.CONTACT_INVITE_REDESIGN_C     // Catch:{ all -> 0x1773 }
            X.Ez9 r3 = new X.Ez9     // Catch:{ all -> 0x1773 }
            r3.<init>()     // Catch:{ all -> 0x1773 }
            r3.A00 = r4     // Catch:{ all -> 0x1773 }
            r4 = r24
            r3.A02 = r4     // Catch:{ all -> 0x1773 }
            r3.A03 = r4     // Catch:{ all -> 0x1773 }
            r3.A01 = r4     // Catch:{ all -> 0x1773 }
            r5.add(r3)     // Catch:{ all -> 0x1773 }
        L_0x11f1:
            r3 = 36330097564926410(0x811208000341ca, double:3.038638217395783E-306)
            boolean r3 = X.182.A06(r2, r0, r3)     // Catch:{ all -> 0x1773 }
            if (r3 == 0) goto L_0x1210
            X.EZx r4 = X.C48155EZx.DISCOVER_PEOPLE     // Catch:{ all -> 0x1773 }
            X.Ez9 r3 = new X.Ez9     // Catch:{ all -> 0x1773 }
            r3.<init>()     // Catch:{ all -> 0x1773 }
            r3.A00 = r4     // Catch:{ all -> 0x1773 }
            r4 = r24
            r3.A02 = r4     // Catch:{ all -> 0x1773 }
            r3.A03 = r4     // Catch:{ all -> 0x1773 }
            r3.A01 = r4     // Catch:{ all -> 0x1773 }
            r5.add(r3)     // Catch:{ all -> 0x1773 }
        L_0x1210:
            X.17i r4 = X.17h.A00(r0)     // Catch:{ all -> 0x1773 }
            java.lang.String r3 = r0.A06     // Catch:{ all -> 0x1773 }
            com.instagram.user.model.User r3 = r4.A02(r3)     // Catch:{ all -> 0x1773 }
            if (r3 == 0) goto L_0x1241
            boolean r3 = r3.A1n()     // Catch:{ all -> 0x1773 }
            if (r3 == 0) goto L_0x1241
            r3 = 36330097564991947(0x811208000441cb, double:3.038638217437229E-306)
            boolean r3 = X.182.A06(r2, r0, r3)     // Catch:{ all -> 0x1773 }
            if (r3 == 0) goto L_0x1241
            X.EZx r4 = X.C48155EZx.TAKE_PROFILE_PHOTO     // Catch:{ all -> 0x1773 }
            X.Ez9 r3 = new X.Ez9     // Catch:{ all -> 0x1773 }
            r3.<init>()     // Catch:{ all -> 0x1773 }
            r3.A00 = r4     // Catch:{ all -> 0x1773 }
            r4 = r24
            r3.A02 = r4     // Catch:{ all -> 0x1773 }
            r3.A03 = r4     // Catch:{ all -> 0x1773 }
            r3.A01 = r4     // Catch:{ all -> 0x1773 }
            r5.add(r3)     // Catch:{ all -> 0x1773 }
        L_0x1241:
            boolean r3 = r5.isEmpty()     // Catch:{ all -> 0x1773 }
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x1277
            X.FRM r6 = new X.FRM     // Catch:{ all -> 0x1773 }
            r6.<init>()     // Catch:{ all -> 0x1773 }
            r6.A00 = r0     // Catch:{ all -> 0x1773 }
            r6.A04 = r13     // Catch:{ all -> 0x1773 }
            X.ENv r5 = X.C49045EoP.A00(r6, r5)     // Catch:{ all -> 0x1773 }
            X.FBl r4 = X.C47938ENp.A03     // Catch:{ all -> 0x1773 }
            r3 = r30
            r7 = r24
            X.ENp r3 = r4.A01(r3, r0, r6, r7)     // Catch:{ all -> 0x1773 }
            r3.A02(r5, r13)     // Catch:{ all -> 0x1773 }
            X.1Av r5 = X.1Au.A00(r0)     // Catch:{ all -> 0x1773 }
            X.0s0 r4 = r5.A4i     // Catch:{ all -> 0x1773 }
            r3 = r10[r9]     // Catch:{ all -> 0x1773 }
            r6 = r28
            r4.Epx(r5, r6, r3)     // Catch:{ all -> 0x1773 }
            r4 = r30
            r3 = r32
            X.C49044EoO.A00(r0, r4, r3)     // Catch:{ all -> 0x1773 }
        L_0x1277:
            r0 = r20
            boolean r0 = r0 instanceof X.C71012Zk     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x12bb
            r0 = r20
            X.2Zk r0 = (X.C71012Zk) r0     // Catch:{ all -> 0x1773 }
            com.instagram.mainactivity.InstagramMainActivity r0 = (com.instagram.mainactivity.InstagramMainActivity) r0     // Catch:{ all -> 0x1773 }
            X.L8H r0 = r0.A06     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x1292
            X.0eM r0 = r0.A02     // Catch:{ all -> 0x1773 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x1773 }
            X.57X r0 = (X.AnonymousClass57X) r0     // Catch:{ all -> 0x1773 }
        L_0x128f:
            r1.A08 = r0     // Catch:{ all -> 0x1773 }
            goto L_0x1294
        L_0x1292:
            r0 = 0
            goto L_0x128f
        L_0x1294:
            if (r0 == 0) goto L_0x12bb
            X.2Fk r3 = r0.A04     // Catch:{ all -> 0x1773 }
            if (r3 == 0) goto L_0x12a4
            X.FQt r0 = new X.FQt     // Catch:{ all -> 0x1773 }
            r4 = r20
            r0.<init>(r4, r1)     // Catch:{ all -> 0x1773 }
            r3.A06(r1, r0)     // Catch:{ all -> 0x1773 }
        L_0x12a4:
            X.57X r0 = r1.A08     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x12bb
            X.2Fk r4 = r0.A05     // Catch:{ all -> 0x1773 }
            if (r4 == 0) goto L_0x12bb
            r0 = 15
            X.J6L r3 = new X.J6L     // Catch:{ all -> 0x1773 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x1773 }
            X.Aul r0 = new X.Aul     // Catch:{ all -> 0x1773 }
            r0.<init>(r3)     // Catch:{ all -> 0x1773 }
            r4.A06(r1, r0)     // Catch:{ all -> 0x1773 }
        L_0x12bb:
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2lj r6 = r0.A0o()     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2l3 r5 = r0.A0Q()     // Catch:{ all -> 0x1773 }
            X.30x r4 = r1.A0I     // Catch:{ all -> 0x1773 }
            if (r4 == 0) goto L_0x1686
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2xS r7 = r0.A0F()     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r3 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.35D r0 = new X.35D     // Catch:{ all -> 0x1773 }
            r0.<init>(r3, r7, r5, r4)     // Catch:{ all -> 0x1773 }
            r6.A0H = r0     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2l3 r3 = r0.A0Q()     // Catch:{ all -> 0x1773 }
            java.lang.String r0 = "MAIN_FEED_FRAGMENT_CREATED"
            X.AnonymousClass2l3.A02(r3, r0)     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r4 = r3.A0F     // Catch:{ all -> 0x1773 }
            X.2I1 r3 = X.2Hz.A00(r4)     // Catch:{ all -> 0x1773 }
            if (r3 == 0) goto L_0x12fc
            java.lang.String r0 = "main_feed_fragment_created"
            r3.A04(r0)     // Catch:{ all -> 0x1773 }
        L_0x12fc:
            com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger r0 = X.2Hi.A00(r4)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x1305
            r0.onLogMainFeedFragmentCreated()     // Catch:{ all -> 0x1773 }
        L_0x1305:
            java.lang.String r3 = "MainFeedFragment.onCreate:NDXLauncher"
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x1313
            r0 = -2088963428(0xffffffff837cf29c, float:-7.4334646E-37)
            X.0fS.A01(r3, r0)     // Catch:{ all -> 0x1773 }
        L_0x1313:
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1674 }
            X.35E r3 = new X.35E     // Catch:{ all -> 0x1674 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x1674 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x1674 }
            r3.A00(r0)     // Catch:{ all -> 0x1674 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x132d
            r0 = 22366955(0x1554aeb, float:3.9175672E-38)
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
        L_0x132d:
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            r3 = 36318303585179723(0x81074e000a184b, double:3.0311796571134336E-306)
            boolean r0 = X.182.A06(r2, r0, r3)     // Catch:{ all -> 0x1773 }
            r1.A0g = r0     // Catch:{ all -> 0x1773 }
            X.0xm r0 = X.AnonymousClass0xl.A00(r33)     // Catch:{ all -> 0x1773 }
            X.0xa r0 = r0.A00     // Catch:{ all -> 0x1773 }
            X.0xY r3 = r0.AR4()     // Catch:{ all -> 0x1773 }
            java.lang.String r0 = "user_logged_in_before"
            r3.E5T(r0, r13)     // Catch:{ all -> 0x1773 }
            r3.apply()     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            r3 = 36320657226605316(0x81097200002304, double:3.032668109428332E-306)
            boolean r0 = X.182.A06(r2, r0, r3)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x1372
            com.instagram.common.session.UserSession r5 = r1.getSession()     // Catch:{ all -> 0x1773 }
            r0 = r32
            X.0qQ.A0B(r5, r0)     // Catch:{ all -> 0x1773 }
            java.lang.Class<X.IOJ> r4 = X.IOJ.class
            r3 = 22
            X.MML r0 = new X.MML     // Catch:{ all -> 0x1773 }
            r0.<init>(r5, r3)     // Catch:{ all -> 0x1773 }
            r5.A01(r4, r0)     // Catch:{ all -> 0x1773 }
        L_0x1372:
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            r3 = 36322031616141208(0x810ab200002798, double:3.0335372789050525E-306)
            boolean r0 = X.182.A06(r2, r0, r3)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x139f
            com.instagram.common.session.UserSession r5 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.1FI r3 = X.1FI.A06     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            boolean r4 = X.1FT.A00(r0, r3)     // Catch:{ all -> 0x1773 }
            r0 = r32
            X.0qQ.A0B(r5, r0)     // Catch:{ all -> 0x1773 }
            r3 = 4
            X.GKL r0 = new X.GKL     // Catch:{ all -> 0x1773 }
            r0.<init>(r3, r5, r4)     // Catch:{ all -> 0x1773 }
            java.lang.Class<X.IOH> r3 = X.IOH.class
            r5.A01(r3, r0)     // Catch:{ all -> 0x1773 }
        L_0x139f:
            if (r16 == 0) goto L_0x13ac
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2lj r0 = r0.A0o()     // Catch:{ all -> 0x1773 }
            r0.A04()     // Catch:{ all -> 0x1773 }
        L_0x13ac:
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            r3 = 36321919946991454(0x810a980000275e, double:3.0334666588850925E-306)
            boolean r0 = X.182.A06(r2, r0, r3)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x13cc
            X.0nO r4 = X.0nY.A00()     // Catch:{ all -> 0x1773 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x1773 }
            X.35G r3 = new X.35G     // Catch:{ all -> 0x1773 }
            r0 = r30
            r3.<init>(r0, r1)     // Catch:{ all -> 0x1773 }
            r4.ATE(r3)     // Catch:{ all -> 0x1773 }
        L_0x13cc:
            com.instagram.common.session.UserSession r4 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.0qQ.A0B(r4, r13)     // Catch:{ all -> 0x1773 }
            r3 = 4
            X.9Ky r0 = new X.9Ky     // Catch:{ all -> 0x1773 }
            r0.<init>(r4, r3)     // Catch:{ all -> 0x1773 }
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)     // Catch:{ all -> 0x1773 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x1773 }
            X.35H r0 = (X.AnonymousClass35H) r0     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r5 = r0.A00     // Catch:{ all -> 0x1773 }
            r3 = 36328654455913986(0x8110b800033e02, double:3.0377255894453925E-306)
            r0 = r29
            boolean r0 = X.182.A06(r0, r5, r3)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x13ff
            com.instagram.common.session.UserSession r4 = r1.getSession()     // Catch:{ all -> 0x1773 }
            java.lang.String r3 = r31.getModuleName()     // Catch:{ all -> 0x1773 }
            r0 = r20
            X.AnonymousClass4KB.A00(r0, r1, r4, r3)     // Catch:{ all -> 0x1773 }
        L_0x13ff:
            com.instagram.common.session.UserSession r5 = r1.getSession()     // Catch:{ all -> 0x1773 }
            r0 = r32
            X.0qQ.A0B(r5, r0)     // Catch:{ all -> 0x1773 }
            java.lang.Boolean r0 = X.AnonymousClass35I.A00(r5)     // Catch:{ all -> 0x1773 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x142b
            r3 = 2342172144706666318(0x20811128000e3f4e, double:4.073332003335826E-152)
            boolean r0 = X.182.A06(r2, r5, r3)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x142b
            com.instagram.common.session.UserSession r3 = r1.getSession()     // Catch:{ all -> 0x1773 }
            com.instagram.nme.contextualpromo.ClipsUploadPromoHelper r2 = new com.instagram.nme.contextualpromo.ClipsUploadPromoHelper     // Catch:{ all -> 0x1773 }
            r0 = r24
            r2.<init>(r1, r3, r0)     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r2)     // Catch:{ all -> 0x1773 }
        L_0x142b:
            r4 = 36327713857878662(0x810fdd00003a86, double:3.0371307514603693E-306)
            r2 = 36327713857944199(0x810fdd00013a87, double:3.037130751501815E-306)
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.1AA r6 = X.182.A02(r0, r4)     // Catch:{ all -> 0x1773 }
            if (r6 == 0) goto L_0x161c
            X.0Tu r0 = new X.0Tu     // Catch:{ all -> 0x1773 }
            r0.<init>()     // Catch:{ all -> 0x1773 }
            X.0Tu r0 = X.0Tu.A00(r0)     // Catch:{ all -> 0x1773 }
            r0.A01 = r13     // Catch:{ all -> 0x1773 }
            X.0Tu r0 = X.0Tu.A00(r0)     // Catch:{ all -> 0x1773 }
            r0.A03 = r13     // Catch:{ all -> 0x1773 }
            boolean r0 = r6.Ah0(r0, r4)     // Catch:{ all -> 0x1773 }
            if (r0 != r13) goto L_0x161c
            com.instagram.common.session.UserSession r2 = r1.getSession()     // Catch:{ all -> 0x1773 }
            r0 = r32
            X.0qQ.A0B(r2, r0)     // Catch:{ all -> 0x1773 }
            X.L7A r5 = new X.L7A     // Catch:{ all -> 0x1773 }
            r5.<init>(r2)     // Catch:{ all -> 0x1773 }
            X.4Cq r4 = r5.A02     // Catch:{ all -> 0x1773 }
            r2 = 39
            X.MFx r3 = new X.MFx     // Catch:{ all -> 0x1773 }
            r0 = r24
            r3.<init>(r5, r0, r2)     // Catch:{ all -> 0x1773 }
            X.19B r2 = X.19B.A00     // Catch:{ all -> 0x1773 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x1773 }
            X.1Eo.A03(r0, r2, r3, r4)     // Catch:{ all -> 0x1773 }
        L_0x1476:
            X.2kj r4 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.2nD r0 = r4.A0M()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.35K r5 = r4.A0N     // Catch:{ all -> 0x1773 }
            if (r5 != 0) goto L_0x1498
            X.2jw r0 = r4.A20     // Catch:{ all -> 0x1773 }
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r2 = r4.A1t     // Catch:{ all -> 0x1773 }
            X.30h r0 = r4.A0i()     // Catch:{ all -> 0x1773 }
            X.35K r5 = new X.35K     // Catch:{ all -> 0x1773 }
            r5.<init>(r3, r2, r0)     // Catch:{ all -> 0x1773 }
            r4.A0N = r5     // Catch:{ all -> 0x1773 }
        L_0x1498:
            r1.registerLifecycleListener(r5)     // Catch:{ all -> 0x1773 }
            X.356 r0 = r4.A0E()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.35L r0 = r4.A0c()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.2lT r0 = r4.A0S()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.35M r0 = r4.A0j()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.35N r0 = r4.A0H()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.35S r5 = r4.A0f     // Catch:{ all -> 0x1773 }
            if (r5 != 0) goto L_0x14d1
            X.2jw r3 = r4.A20     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r2 = r4.A1t     // Catch:{ all -> 0x1773 }
            X.34a r0 = r4.A0O()     // Catch:{ all -> 0x1773 }
            X.35S r5 = new X.35S     // Catch:{ all -> 0x1773 }
            r5.<init>(r2, r0, r3)     // Catch:{ all -> 0x1773 }
            r4.A0f = r5     // Catch:{ all -> 0x1773 }
        L_0x14d1:
            r1.registerLifecycleListener(r5)     // Catch:{ all -> 0x1773 }
            X.35T r3 = r4.A0g     // Catch:{ all -> 0x1773 }
            if (r3 != 0) goto L_0x14e3
            X.2jw r2 = r4.A20     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r0 = r4.A1t     // Catch:{ all -> 0x1773 }
            X.35T r3 = new X.35T     // Catch:{ all -> 0x1773 }
            r3.<init>(r0, r2)     // Catch:{ all -> 0x1773 }
            r4.A0g = r3     // Catch:{ all -> 0x1773 }
        L_0x14e3:
            r1.registerLifecycleListener(r3)     // Catch:{ all -> 0x1773 }
            X.35U r5 = r4.A0h     // Catch:{ all -> 0x1773 }
            if (r5 != 0) goto L_0x14f9
            com.instagram.common.session.UserSession r3 = r4.A1t     // Catch:{ all -> 0x1773 }
            X.2rI r2 = r4.A0J()     // Catch:{ all -> 0x1773 }
            X.2ks r0 = r4.A1w     // Catch:{ all -> 0x1773 }
            X.35U r5 = new X.35U     // Catch:{ all -> 0x1773 }
            r5.<init>(r3, r2, r0)     // Catch:{ all -> 0x1773 }
            r4.A0h = r5     // Catch:{ all -> 0x1773 }
        L_0x14f9:
            r1.registerLifecycleListener(r5)     // Catch:{ all -> 0x1773 }
            X.2lj r0 = r4.A0o()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.35W r0 = r4.A0p()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.35V r0 = r4.A0r()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.364 r5 = r4.A0n     // Catch:{ all -> 0x1773 }
            if (r5 != 0) goto L_0x1524
            X.2jw r3 = r4.A20     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r2 = r4.A1t     // Catch:{ all -> 0x1773 }
            X.2rI r0 = r4.A0J()     // Catch:{ all -> 0x1773 }
            X.364 r5 = new X.364     // Catch:{ all -> 0x1773 }
            r5.<init>(r2, r0, r3)     // Catch:{ all -> 0x1773 }
            r4.A0n = r5     // Catch:{ all -> 0x1773 }
        L_0x1524:
            r1.registerLifecycleListener(r5)     // Catch:{ all -> 0x1773 }
            X.365 r0 = r4.A0y()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.366 r0 = r4.A0d()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.36C r3 = r4.A0j     // Catch:{ all -> 0x1773 }
            if (r3 != 0) goto L_0x1546
            com.instagram.common.session.UserSession r2 = r4.A1t     // Catch:{ all -> 0x1773 }
            X.2rI r0 = r4.A0J()     // Catch:{ all -> 0x1773 }
            X.36C r3 = new X.36C     // Catch:{ all -> 0x1773 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x1773 }
            r4.A0j = r3     // Catch:{ all -> 0x1773 }
        L_0x1546:
            r1.registerLifecycleListener(r3)     // Catch:{ all -> 0x1773 }
            X.36J r6 = r4.A0X     // Catch:{ all -> 0x1773 }
            if (r6 != 0) goto L_0x1560
            android.content.Context r5 = r4.A1s     // Catch:{ all -> 0x1773 }
            X.2jw r3 = r4.A20     // Catch:{ all -> 0x1773 }
            X.2k9 r0 = r4.A1v     // Catch:{ all -> 0x1773 }
            X.36H r2 = r0.Bbm()     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r0 = r4.A1t     // Catch:{ all -> 0x1773 }
            X.36J r6 = new X.36J     // Catch:{ all -> 0x1773 }
            r6.<init>(r5, r3, r0, r2)     // Catch:{ all -> 0x1773 }
            r4.A0X = r6     // Catch:{ all -> 0x1773 }
        L_0x1560:
            r1.registerLifecycleListener(r6)     // Catch:{ all -> 0x1773 }
            X.2qK r0 = r4.A0v()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.36K r5 = r4.A0J     // Catch:{ all -> 0x1773 }
            if (r5 != 0) goto L_0x157f
            X.2rI r3 = r4.A0J()     // Catch:{ all -> 0x1773 }
            X.2rI r2 = r4.A0J()     // Catch:{ all -> 0x1773 }
            X.2jw r0 = r4.A20     // Catch:{ all -> 0x1773 }
            X.36K r5 = new X.36K     // Catch:{ all -> 0x1773 }
            r5.<init>(r0, r3, r2)     // Catch:{ all -> 0x1773 }
            r4.A0J = r5     // Catch:{ all -> 0x1773 }
        L_0x157f:
            r1.registerLifecycleListener(r5)     // Catch:{ all -> 0x1773 }
            X.2pD r0 = r4.A0g()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.2r8 r0 = r4.A0L()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.2lJ r0 = r4.A0f()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.36L r3 = r4.A0d     // Catch:{ all -> 0x1773 }
            if (r3 != 0) goto L_0x15a6
            X.2jw r2 = r4.A20     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r0 = r4.A1t     // Catch:{ all -> 0x1773 }
            X.36L r3 = new X.36L     // Catch:{ all -> 0x1773 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x1773 }
            r4.A0d = r3     // Catch:{ all -> 0x1773 }
        L_0x15a6:
            r1.registerLifecycleListener(r3)     // Catch:{ all -> 0x1773 }
            X.36M r0 = r4.A0z()     // Catch:{ all -> 0x1773 }
            r1.registerLifecycleListener(r0)     // Catch:{ all -> 0x1773 }
            X.36Y r2 = r4.A0p     // Catch:{ all -> 0x1773 }
            if (r2 != 0) goto L_0x15bf
            X.36O r0 = r4.A02()     // Catch:{ all -> 0x1773 }
            X.36Y r2 = new X.36Y     // Catch:{ all -> 0x1773 }
            r2.<init>(r0)     // Catch:{ all -> 0x1773 }
            r4.A0p = r2     // Catch:{ all -> 0x1773 }
        L_0x15bf:
            r1.registerLifecycleListener(r2)     // Catch:{ all -> 0x1773 }
            X.18g r3 = X.C638918c.A01(r33)     // Catch:{ all -> 0x1773 }
            java.lang.String r2 = "MAIN_FRAGMENT_ONCREATE_END"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r3.A02     // Catch:{ all -> 0x1773 }
            r3.A0O(r0, r2)     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r4 = r1.getSession()     // Catch:{ all -> 0x1773 }
            r2 = 36329663773032692(0x8111a3000040f4, double:3.038363885655456E-306)
            r0 = r29
            boolean r0 = X.182.A06(r0, r4, r2)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x165f
            X.0eM r0 = r1.A0o     // Catch:{ all -> 0x1773 }
            java.lang.Object r4 = r0.getValue()     // Catch:{ all -> 0x1773 }
            X.2kB r4 = (X.AnonymousClass2kB) r4     // Catch:{ all -> 0x1773 }
            android.content.Context r5 = r1.requireContext()     // Catch:{ all -> 0x1773 }
            com.instagram.common.session.UserSession r9 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.2kj r0 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.36O r7 = r0.A02()     // Catch:{ all -> 0x1773 }
            X.2kj r3 = r1.A0A()     // Catch:{ all -> 0x1773 }
            X.36Y r2 = r3.A0p     // Catch:{ all -> 0x1773 }
            if (r2 != 0) goto L_0x1609
            X.36O r0 = r3.A02()     // Catch:{ all -> 0x1773 }
            X.36Y r2 = new X.36Y     // Catch:{ all -> 0x1773 }
            r2.<init>(r0)     // Catch:{ all -> 0x1773 }
            r3.A0p = r2     // Catch:{ all -> 0x1773 }
        L_0x1609:
            X.AwS r0 = new X.AwS     // Catch:{ all -> 0x1773 }
            r0.<init>(r2)     // Catch:{ all -> 0x1773 }
            java.lang.String r11 = "ig_self_profile"
            r6 = r1
            r8 = r4
            r10 = r24
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r0
            X.C319076q0.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x1773 }
            goto L_0x165f
        L_0x161c:
            com.instagram.common.session.UserSession r0 = r1.getSession()     // Catch:{ all -> 0x1773 }
            X.1AA r4 = X.182.A02(r0, r2)     // Catch:{ all -> 0x1773 }
            if (r4 == 0) goto L_0x1476
            X.0Tu r0 = new X.0Tu     // Catch:{ all -> 0x1773 }
            r0.<init>()     // Catch:{ all -> 0x1773 }
            X.0Tu r0 = X.0Tu.A00(r0)     // Catch:{ all -> 0x1773 }
            r0.A01 = r13     // Catch:{ all -> 0x1773 }
            X.0Tu r0 = X.0Tu.A00(r0)     // Catch:{ all -> 0x1773 }
            r0.A03 = r13     // Catch:{ all -> 0x1773 }
            boolean r0 = r4.Ah0(r0, r2)     // Catch:{ all -> 0x1773 }
            if (r0 != r13) goto L_0x1476
            com.instagram.common.session.UserSession r2 = r1.getSession()     // Catch:{ all -> 0x1773 }
            r0 = r32
            X.0qQ.A0B(r2, r0)     // Catch:{ all -> 0x1773 }
            X.L7A r5 = new X.L7A     // Catch:{ all -> 0x1773 }
            r5.<init>(r2)     // Catch:{ all -> 0x1773 }
            X.4Cq r4 = r5.A02     // Catch:{ all -> 0x1773 }
            r2 = 38
            X.MFx r3 = new X.MFx     // Catch:{ all -> 0x1773 }
            r0 = r24
            r3.<init>(r5, r0, r2)     // Catch:{ all -> 0x1773 }
            X.19B r2 = X.19B.A00     // Catch:{ all -> 0x1773 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x1773 }
            X.1Eo.A03(r0, r2, r3, r4)     // Catch:{ all -> 0x1773 }
            goto L_0x1476
        L_0x165f:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)
            if (r0 == 0) goto L_0x166b
            r0 = -55335394(0xfffffffffcb3a61e, float:-7.462323E36)
            X.0fS.A00(r0)
        L_0x166b:
            r1 = -508732616(0xffffffffe1ad5b38, float:-3.9973247E20)
            r0 = r34
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x1674:
            r2 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x1681
            r0 = -1395837252(0xffffffffaccd36bc, float:-5.832527E-12)
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
        L_0x1681:
            r1 = -933284517(0xffffffffc85f355b, float:-228565.42)
            goto L_0x176d
        L_0x1686:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x1773 }
            r0 = r21
            r2.<init>(r0)     // Catch:{ all -> 0x1773 }
            r1 = -163137750(0xfffffffff646b72a, float:-1.0076072E33)
            goto L_0x176d
        L_0x1692:
            r2 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x169f
            r0 = 1088065832(0x40da9128, float:6.8302193)
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
        L_0x169f:
            r1 = -908397367(0xffffffffc9daf4c9, float:-1793689.1)
            goto L_0x176d
        L_0x16a4:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x16bf }
            r0 = r21
            r2.<init>(r0)     // Catch:{ all -> 0x16bf }
            r1 = -1301083648(0xffffffffb2730a00, float:-1.4146735E-8)
            goto L_0x16b9
        L_0x16af:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x16bf }
            r0 = r21
            r2.<init>(r0)     // Catch:{ all -> 0x16bf }
            r1 = 568784091(0x21e6f4db, float:1.5650219E-18)
        L_0x16b9:
            r0 = r34
            X.AnonymousClass0fD.A09(r1, r0)     // Catch:{ all -> 0x16bf }
            throw r2     // Catch:{ all -> 0x16bf }
        L_0x16bf:
            r2 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x16cc
            r0 = 1285964511(0x4ca642df, float:8.716876E7)
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
        L_0x16cc:
            r1 = 1830857633(0x6d20aba1, float:3.107818E27)
            goto L_0x176d
        L_0x16d1:
            r2 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x16de
            r0 = -486637371(0xffffffffe2fe80c5, float:-2.3473759E21)
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
        L_0x16de:
            r1 = -563310944(0xffffffffde6c8ea0, float:-4.26143439E18)
            goto L_0x176d
        L_0x16e3:
            r2 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x16f0
            r0 = -1488667305(0xffffffffa744bd57, float:-2.7303105E-15)
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
        L_0x16f0:
            r1 = 1259232406(0x4b0e5c96, float:9329814.0)
            goto L_0x176d
        L_0x16f4:
            r2 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x1701
            r0 = -2086687962(0xffffffff839fab26, float:-9.384474E-37)
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
        L_0x1701:
            r1 = -809028192(0xffffffffcfc735a0, float:-6.6843607E9)
            goto L_0x176d
        L_0x1705:
            r2 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x1712
            r0 = -1619182437(0xffffffff9f7d3c9b, float:-5.3624966E-20)
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
        L_0x1712:
            r1 = 333398472(0x13df41c8, float:5.635798E-27)
            goto L_0x176d
        L_0x1716:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x171e }
            r0 = r21
            r1.<init>(r0)     // Catch:{ all -> 0x171e }
            throw r1     // Catch:{ all -> 0x171e }
        L_0x171e:
            r2 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x172b
            r0 = -1315471594(0xffffffffb1977f16, float:-4.4091264E-9)
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
        L_0x172b:
            r1 = 1977603673(0x75dfd659, float:5.6749496E32)
            goto L_0x176d
        L_0x172f:
            r2 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x173c
            r0 = 1489283544(0x58c4a9d8, float:1.72987002E15)
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
        L_0x173c:
            r1 = -833072092(0xffffffffce585424, float:-9.0734822E8)
            goto L_0x176d
        L_0x1740:
            r2 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x1772
            r0 = -1676261358(0xffffffff9c164812, float:-4.9723985E-22)
            goto L_0x1755
        L_0x174b:
            r2 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x1772
            r0 = -1126688714(0xffffffffbcd81836, float:-0.026378732)
        L_0x1755:
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
            goto L_0x1772
        L_0x1759:
            r2 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)     // Catch:{ all -> 0x1773 }
            if (r0 == 0) goto L_0x1766
            r0 = -30917359(0xfffffffffe283d11, float:-5.5906845E37)
            X.0fS.A00(r0)     // Catch:{ all -> 0x1773 }
        L_0x1766:
            r1 = 1540223807(0x5bcdf33f, float:1.15939644E17)
            goto L_0x176d
        L_0x176a:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x1773 }
            goto L_0x1772
        L_0x176d:
            r0 = r34
            X.AnonymousClass0fD.A09(r1, r0)     // Catch:{ all -> 0x1773 }
        L_0x1772:
            throw r2     // Catch:{ all -> 0x1773 }
        L_0x1773:
            r2 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r26)
            if (r0 == 0) goto L_0x1780
            r0 = -407860189(0xffffffffe7b08c23, float:-1.6674431E24)
            X.0fS.A00(r0)
        L_0x1780:
            r1 = -1953748814(0xffffffff8b8c28b2, float:-5.398727E-32)
            r0 = r34
            X.AnonymousClass0fD.A09(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227802jw.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r4v86, types: [X.3AC, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x038e A[Catch:{ all -> 0x03bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0391 A[Catch:{ all -> 0x03bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x039e A[Catch:{ all -> 0x03bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c5 A[Catch:{ all -> 0x03bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dd A[Catch:{ all -> 0x03bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ec A[Catch:{ all -> 0x03bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fd A[Catch:{ all -> 0x03bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0131 A[Catch:{ all -> 0x03bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0133 A[Catch:{ all -> 0x03bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b5 A[Catch:{ all -> 0x03bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01e6 A[Catch:{ all -> 0x03bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x021a A[Catch:{ all -> 0x03bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0229 A[Catch:{ all -> 0x03bc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r16, android.view.ViewGroup r17, android.os.Bundle r18) {
        /*
            r15 = this;
            r0 = -1215218008(0xffffffffb7913ea8, float:-1.7314524E-5)
            int r1 = X.AnonymousClass0fD.A02(r0)
            r0 = 0
            r4 = r16
            X.0qQ.A0B(r4, r0)
            java.lang.String r3 = "MainFeedFragment.onCreateView"
            r2 = -1605022709(0xffffffffa0554c0b, float:-1.8066962E-19)
            X.0fh.A01(r3, r2)
            r2 = 2131626917(0x7f0e0ba5, float:1.8881084E38)
            r5 = 0
            r3 = r17
            android.view.View r2 = r4.inflate(r2, r3, r0)     // Catch:{ all -> 0x03bc }
            X.0qQ.A0A(r2)     // Catch:{ all -> 0x03bc }
            boolean r4 = r15.A0g     // Catch:{ all -> 0x03bc }
            X.3AA r3 = new X.3AA     // Catch:{ all -> 0x03bc }
            r3.<init>(r15)     // Catch:{ all -> 0x03bc }
            X.0qQ.A0B(r2, r0)     // Catch:{ all -> 0x03bc }
            if (r4 == 0) goto L_0x002f
            goto L_0x004e
        L_0x002f:
            X.3AC r4 = new X.3AC     // Catch:{ all -> 0x03bc }
            r4.<init>()     // Catch:{ all -> 0x03bc }
            r3 = 2131439765(0x7f0b3095, float:1.8501494E38)
            android.view.View r3 = r2.findViewById(r3)     // Catch:{ all -> 0x03bc }
            android.view.ViewStub r3 = (android.view.ViewStub) r3     // Catch:{ all -> 0x03bc }
            if (r3 == 0) goto L_0x0042
            r3.inflate()     // Catch:{ all -> 0x03bc }
        L_0x0042:
            r3 = 2131439764(0x7f0b3094, float:1.8501492E38)
            android.view.View r3 = r2.findViewById(r3)     // Catch:{ all -> 0x03bc }
            com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent r3 = (com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent) r3     // Catch:{ all -> 0x03bc }
            r4.A00 = r3     // Catch:{ all -> 0x03bc }
            goto L_0x0053
        L_0x004e:
            X.Wf4 r4 = new X.Wf4     // Catch:{ all -> 0x03bc }
            r4.<init>(r2, r3)     // Catch:{ all -> 0x03bc }
        L_0x0053:
            X.3AD r4 = (X.AnonymousClass3AD) r4     // Catch:{ all -> 0x03bc }
            r15.A0G = r4     // Catch:{ all -> 0x03bc }
            r3 = 2131441822(0x7f0b389e, float:1.8505666E38)
            android.view.View r3 = r2.findViewById(r3)     // Catch:{ all -> 0x03bc }
            com.instagram.ui.listview.StickyHeaderListView r3 = (com.instagram.ui.listview.StickyHeaderListView) r3     // Catch:{ all -> 0x03bc }
            r15.A0D = r3     // Catch:{ all -> 0x03bc }
            X.332 r3 = r15.A07     // Catch:{ all -> 0x03bc }
            if (r3 == 0) goto L_0x0069
            r3.D6z(r2)     // Catch:{ all -> 0x03bc }
        L_0x0069:
            X.57Q r4 = r15.A0A     // Catch:{ all -> 0x03bc }
            r3 = 1
            if (r4 == 0) goto L_0x0077
            X.2wp r4 = r4.A0L     // Catch:{ all -> 0x03bc }
            boolean r4 = r4.A03()     // Catch:{ all -> 0x03bc }
            if (r4 != r3) goto L_0x0077
            r5 = 1
        L_0x0077:
            if (r5 == 0) goto L_0x0251
            r4 = 2131431389(0x7f0b0fdd, float:1.8484506E38)
            android.view.View r8 = r2.findViewById(r4)     // Catch:{ all -> 0x03bc }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x03bc }
            android.view.ViewStub r8 = (android.view.ViewStub) r8     // Catch:{ all -> 0x03bc }
            X.57Q r4 = r15.A0A     // Catch:{ all -> 0x03bc }
            if (r4 == 0) goto L_0x009f
            com.instagram.common.session.UserSession r7 = r4.A0I     // Catch:{ all -> 0x03bc }
            X.0qQ.A0B(r7, r0)     // Catch:{ all -> 0x03bc }
            X.0Tu r6 = X.0Tu.A06     // Catch:{ all -> 0x03bc }
            r4 = 36324840529473957(0x810d40004831a5, double:3.035313647007269E-306)
            boolean r4 = X.182.A06(r6, r7, r4)     // Catch:{ all -> 0x03bc }
            if (r4 != r3) goto L_0x009f
            r4 = 2131431393(0x7f0b0fe1, float:1.8484514E38)
            goto L_0x00b7
        L_0x009f:
            X.57Q r4 = r15.A0A     // Catch:{ all -> 0x03bc }
            if (r4 == 0) goto L_0x00bd
            X.2wr r4 = r4.A0K     // Catch:{ all -> 0x03bc }
            com.instagram.common.session.UserSession r7 = r4.A00     // Catch:{ all -> 0x03bc }
            X.0Tu r6 = X.0Tu.A06     // Catch:{ all -> 0x03bc }
            r4 = 36324840527704475(0x810d40002d319b, double:3.0353136458882415E-306)
            boolean r4 = X.182.A06(r6, r7, r4)     // Catch:{ all -> 0x03bc }
            if (r4 != r3) goto L_0x00bd
            r4 = 2131431390(0x7f0b0fde, float:1.8484508E38)
        L_0x00b7:
            android.view.View r8 = r2.findViewById(r4)     // Catch:{ all -> 0x03bc }
            android.view.ViewStub r8 = (android.view.ViewStub) r8     // Catch:{ all -> 0x03bc }
        L_0x00bd:
            android.view.View r6 = r8.inflate()     // Catch:{ all -> 0x03bc }
            r15.A01 = r6     // Catch:{ all -> 0x03bc }
            if (r6 == 0) goto L_0x00d8
            android.content.Context r4 = r2.getContext()     // Catch:{ all -> 0x03bc }
            android.content.res.Resources r5 = r4.getResources()     // Catch:{ all -> 0x03bc }
            r4 = 2131165207(0x7f070017, float:1.7944625E38)
            int r4 = r5.getDimensionPixelSize(r4)     // Catch:{ all -> 0x03bc }
            float r4 = (float) r4     // Catch:{ all -> 0x03bc }
            r6.setElevation(r4)     // Catch:{ all -> 0x03bc }
        L_0x00d8:
            android.view.View r5 = r15.A01     // Catch:{ all -> 0x03bc }
            r6 = 0
            if (r5 == 0) goto L_0x0133
            r4 = 2131432752(0x7f0b1530, float:1.848727E38)
            android.view.View r4 = r5.findViewById(r4)     // Catch:{ all -> 0x03bc }
            com.instagram.common.ui.base.IgTextView r4 = (com.instagram.common.ui.base.IgTextView) r4     // Catch:{ all -> 0x03bc }
        L_0x00e6:
            r15.A04 = r4     // Catch:{ all -> 0x03bc }
            android.view.View r5 = r15.A01     // Catch:{ all -> 0x03bc }
            if (r5 == 0) goto L_0x0131
            r4 = 2131431392(0x7f0b0fe0, float:1.8484512E38)
            android.view.View r4 = r5.findViewById(r4)     // Catch:{ all -> 0x03bc }
            com.instagram.common.ui.base.IgTextView r4 = (com.instagram.common.ui.base.IgTextView) r4     // Catch:{ all -> 0x03bc }
        L_0x00f5:
            r15.A06 = r4     // Catch:{ all -> 0x03bc }
            android.content.Context r10 = r15.getContext()     // Catch:{ all -> 0x03bc }
            if (r10 == 0) goto L_0x01b1
            com.instagram.common.session.UserSession r7 = r15.getSession()     // Catch:{ all -> 0x03bc }
            X.0qQ.A0B(r7, r0)     // Catch:{ all -> 0x03bc }
            X.0Tu r8 = X.0Tu.A06     // Catch:{ all -> 0x03bc }
            r4 = 36324840529473957(0x810d40004831a5, double:3.035313647007269E-306)
            boolean r4 = X.182.A06(r8, r7, r4)     // Catch:{ all -> 0x03bc }
            if (r4 == 0) goto L_0x0138
            com.instagram.common.ui.base.IgTextView r5 = r15.A06     // Catch:{ all -> 0x03bc }
            if (r5 == 0) goto L_0x011f
            r4 = 2131100036(0x7f060184, float:1.7812442E38)
            int r4 = r10.getColor(r4)     // Catch:{ all -> 0x03bc }
            r5.setTextColor(r4)     // Catch:{ all -> 0x03bc }
        L_0x011f:
            android.view.View r5 = r15.A01     // Catch:{ all -> 0x03bc }
            if (r5 == 0) goto L_0x012f
            r4 = 2131431391(0x7f0b0fdf, float:1.848451E38)
            android.view.View r5 = r5.findViewById(r4)     // Catch:{ all -> 0x03bc }
            com.instagram.common.ui.base.IgTextView r5 = (com.instagram.common.ui.base.IgTextView) r5     // Catch:{ all -> 0x03bc }
        L_0x012c:
            r15.A05 = r5     // Catch:{ all -> 0x03bc }
            goto L_0x0135
        L_0x012f:
            r5 = 0
            goto L_0x012c
        L_0x0131:
            r4 = 0
            goto L_0x00f5
        L_0x0133:
            r4 = r6
            goto L_0x00e6
        L_0x0135:
            if (r5 == 0) goto L_0x0170
            goto L_0x0166
        L_0x0138:
            X.0eM r4 = r15.A0l     // Catch:{ all -> 0x03bc }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x03bc }
            X.2wr r4 = (X.C234022wr) r4     // Catch:{ all -> 0x03bc }
            com.instagram.common.session.UserSession r7 = r4.A00     // Catch:{ all -> 0x03bc }
            r4 = 36324840527704475(0x810d40002d319b, double:3.0353136458882415E-306)
            boolean r4 = X.182.A06(r8, r7, r4)     // Catch:{ all -> 0x03bc }
            com.instagram.common.ui.base.IgTextView r5 = r15.A06     // Catch:{ all -> 0x03bc }
            if (r4 == 0) goto L_0x0155
            if (r5 == 0) goto L_0x01b1
            r4 = 2130970280(0x7f0406a8, float:1.7549266E38)
            goto L_0x015a
        L_0x0155:
            if (r5 == 0) goto L_0x01b1
            r4 = 2130970277(0x7f0406a5, float:1.754926E38)
        L_0x015a:
            int r4 = X.2Yu.A0H(r10, r4)     // Catch:{ all -> 0x03bc }
            int r4 = r10.getColor(r4)     // Catch:{ all -> 0x03bc }
            r5.setTextColor(r4)     // Catch:{ all -> 0x03bc }
            goto L_0x01b1
        L_0x0166:
            r4 = 2131100269(0x7f06026d, float:1.7812915E38)
            int r4 = r10.getColor(r4)     // Catch:{ all -> 0x03bc }
            r5.setTextColor(r4)     // Catch:{ all -> 0x03bc }
        L_0x0170:
            r4 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r7 = r15.getString(r4)     // Catch:{ all -> 0x03bc }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x03bc }
            r5 = 2131957528(0x7f131718, float:1.9551642E38)
            java.lang.Object[] r4 = new java.lang.Object[]{r7}     // Catch:{ all -> 0x03bc }
            java.lang.String r4 = r15.getString(r5, r4)     // Catch:{ all -> 0x03bc }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x03bc }
            android.text.SpannableString r9 = new android.text.SpannableString     // Catch:{ all -> 0x03bc }
            r9.<init>(r4)     // Catch:{ all -> 0x03bc }
            int r8 = X.00l.A08(r4, r7, r0, r0)     // Catch:{ all -> 0x03bc }
            r4 = -1
            if (r8 == r4) goto L_0x01aa
            int r7 = r7.length()     // Catch:{ all -> 0x03bc }
            int r7 = r7 + r8
            r4 = 2131099803(0x7f06009b, float:1.781197E38)
            int r4 = r10.getColor(r4)     // Catch:{ all -> 0x03bc }
            android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan     // Catch:{ all -> 0x03bc }
            r5.<init>(r4)     // Catch:{ all -> 0x03bc }
            r4 = 33
            r9.setSpan(r5, r8, r7, r4)     // Catch:{ all -> 0x03bc }
        L_0x01aa:
            com.instagram.common.ui.base.IgTextView r4 = r15.A05     // Catch:{ all -> 0x03bc }
            if (r4 == 0) goto L_0x01b1
            r4.setText(r9)     // Catch:{ all -> 0x03bc }
        L_0x01b1:
            android.view.View r5 = r15.A01     // Catch:{ all -> 0x03bc }
            if (r5 == 0) goto L_0x039e
            r4 = 2131430864(0x7f0b0dd0, float:1.848344E38)
            android.view.View r4 = r5.findViewById(r4)     // Catch:{ all -> 0x03bc }
            com.instagram.ui.widget.gradientspinner.GradientSpinner r4 = (com.instagram.ui.widget.gradientspinner.GradientSpinner) r4     // Catch:{ all -> 0x03bc }
        L_0x01be:
            r15.A0F = r4     // Catch:{ all -> 0x03bc }
            X.2kj r4 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.2rI r5 = r4.A0J()     // Catch:{ all -> 0x03bc }
            X.57Q r4 = r15.A0A     // Catch:{ all -> 0x03bc }
            r5.A07 = r4     // Catch:{ all -> 0x03bc }
            X.2kj r4 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.2rI r8 = r4.A0J()     // Catch:{ all -> 0x03bc }
            X.0eM r4 = r15.A0l     // Catch:{ all -> 0x03bc }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x03bc }
            X.2wr r4 = (X.C234022wr) r4     // Catch:{ all -> 0x03bc }
            boolean r4 = r4.A00()     // Catch:{ all -> 0x03bc }
            android.content.Context r10 = r2.getContext()     // Catch:{ all -> 0x03bc }
            if (r4 == 0) goto L_0x0391
            X.0qQ.A07(r10)     // Catch:{ all -> 0x03bc }
            int r4 = X.AnonymousClass0nB.A00(r10)     // Catch:{ all -> 0x03bc }
            float r9 = (float) r4     // Catch:{ all -> 0x03bc }
            com.instagram.common.session.UserSession r7 = r15.getSession()     // Catch:{ all -> 0x03bc }
            X.0qQ.A0B(r7, r0)     // Catch:{ all -> 0x03bc }
            X.0Tu r0 = X.0Tu.A06     // Catch:{ all -> 0x03bc }
            r4 = 37169265459528171(0x840d40004701eb, double:3.5693313729998255E-306)
            double r4 = X.182.A00(r0, r7, r4)     // Catch:{ all -> 0x03bc }
            float r0 = (float) r4     // Catch:{ all -> 0x03bc }
            float r9 = r9 * r0
            int r0 = (int) r9     // Catch:{ all -> 0x03bc }
        L_0x0203:
            r8.A00 = r0     // Catch:{ all -> 0x03bc }
            android.content.res.Resources r4 = r10.getResources()     // Catch:{ all -> 0x03bc }
            r0 = 2131165208(0x7f070018, float:1.7944627E38)
            int r0 = r4.getDimensionPixelSize(r0)     // Catch:{ all -> 0x03bc }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03bc }
            r15.A0J = r0     // Catch:{ all -> 0x03bc }
            android.view.View r4 = r15.A01     // Catch:{ all -> 0x03bc }
            if (r4 == 0) goto L_0x038e
            r0 = 2131432753(0x7f0b1531, float:1.8487272E38)
            android.view.View r0 = r4.findViewById(r0)     // Catch:{ all -> 0x03bc }
            com.instagram.common.ui.base.IgSimpleImageView r0 = (com.instagram.common.ui.base.IgSimpleImageView) r0     // Catch:{ all -> 0x03bc }
        L_0x0223:
            r15.A03 = r0     // Catch:{ all -> 0x03bc }
            android.view.View r4 = r15.A01     // Catch:{ all -> 0x03bc }
            if (r4 == 0) goto L_0x0232
            r0 = 2131431388(0x7f0b0fdc, float:1.8484504E38)
            android.view.View r6 = r4.findViewById(r0)     // Catch:{ all -> 0x03bc }
            com.instagram.common.ui.base.IgSimpleImageView r6 = (com.instagram.common.ui.base.IgSimpleImageView) r6     // Catch:{ all -> 0x03bc }
        L_0x0232:
            r15.A02 = r6     // Catch:{ all -> 0x03bc }
            com.instagram.common.session.UserSession r6 = r15.getSession()     // Catch:{ all -> 0x03bc }
            X.0Tu r0 = X.0Tu.A05     // Catch:{ all -> 0x03bc }
            r4 = 36325489065014256(0x810dd7000333f0, double:3.035723783494397E-306)
            boolean r0 = X.182.A06(r0, r6, r4)     // Catch:{ all -> 0x03bc }
            if (r0 == 0) goto L_0x0251
            android.view.View r4 = r15.A01     // Catch:{ all -> 0x03bc }
            if (r4 == 0) goto L_0x0251
            X.IAf r0 = new X.IAf     // Catch:{ all -> 0x03bc }
            r0.<init>(r15)     // Catch:{ all -> 0x03bc }
            X.AnonymousClass0fU.A00(r0, r4)     // Catch:{ all -> 0x03bc }
        L_0x0251:
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION     // Catch:{ all -> 0x03bc }
            X.4DU r7 = X.AnonymousClass2kO.A00     // Catch:{ all -> 0x03bc }
            android.content.Context r5 = r15.getContext()     // Catch:{ all -> 0x03bc }
            if (r5 == 0) goto L_0x03ae
            X.2kG r13 = r15.A0k     // Catch:{ all -> 0x03bc }
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.2lj r11 = r0.A0o()     // Catch:{ all -> 0x03bc }
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.2lj r12 = r0.A0o()     // Catch:{ all -> 0x03bc }
            com.instagram.ui.listview.StickyHeaderListView r6 = r15.A0D     // Catch:{ all -> 0x03bc }
            com.instagram.common.session.UserSession r8 = r15.getSession()     // Catch:{ all -> 0x03bc }
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.3Ay r14 = r0.A0w()     // Catch:{ all -> 0x03bc }
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.2lG r9 = r0.A0R()     // Catch:{ all -> 0x03bc }
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.2kv r10 = r0.A1x     // Catch:{ all -> 0x03bc }
            X.3Az r4 = new X.3Az     // Catch:{ all -> 0x03bc }
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x03bc }
            r15.A0B = r4     // Catch:{ all -> 0x03bc }
            r4.A07()     // Catch:{ all -> 0x03bc }
            X.1QK r0 = X.1QK.A0A     // Catch:{ all -> 0x03bc }
            android.view.View r6 = A01(r0, r15)     // Catch:{ all -> 0x03bc }
            if (r6 == 0) goto L_0x02b4
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.2qK r0 = r0.A0v()     // Catch:{ all -> 0x03bc }
            X.2qT r5 = r0.A07     // Catch:{ all -> 0x03bc }
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.2qK r0 = r0.A0v()     // Catch:{ all -> 0x03bc }
            X.2qi r4 = r0.A05     // Catch:{ all -> 0x03bc }
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.CREATE_POST_ICON     // Catch:{ all -> 0x03bc }
            r5.A00(r6, r0, r4)     // Catch:{ all -> 0x03bc }
        L_0x02b4:
            X.1QK r0 = X.1QK.A0F     // Catch:{ all -> 0x03bc }
            android.view.View r6 = A01(r0, r15)     // Catch:{ all -> 0x03bc }
            if (r6 == 0) goto L_0x02d5
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.2qK r0 = r0.A0v()     // Catch:{ all -> 0x03bc }
            X.2qT r5 = r0.A07     // Catch:{ all -> 0x03bc }
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.2qK r0 = r0.A0v()     // Catch:{ all -> 0x03bc }
            X.2qi r4 = r0.A05     // Catch:{ all -> 0x03bc }
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.EXPLORE_TAB     // Catch:{ all -> 0x03bc }
            r5.A00(r6, r0, r4)     // Catch:{ all -> 0x03bc }
        L_0x02d5:
            X.1QK r0 = X.1QK.A0B     // Catch:{ all -> 0x03bc }
            android.view.View r6 = A01(r0, r15)     // Catch:{ all -> 0x03bc }
            if (r6 == 0) goto L_0x02f6
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.2qK r0 = r0.A0v()     // Catch:{ all -> 0x03bc }
            X.2qT r5 = r0.A07     // Catch:{ all -> 0x03bc }
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.2qK r0 = r0.A0v()     // Catch:{ all -> 0x03bc }
            X.2qi r4 = r0.A05     // Catch:{ all -> 0x03bc }
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.DIRECT_ICON_TAB_BAR     // Catch:{ all -> 0x03bc }
            r5.A00(r6, r0, r4)     // Catch:{ all -> 0x03bc }
        L_0x02f6:
            X.1QK r0 = X.1QK.A0D     // Catch:{ all -> 0x03bc }
            android.view.View r6 = A01(r0, r15)     // Catch:{ all -> 0x03bc }
            if (r6 == 0) goto L_0x0317
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.2qK r0 = r0.A0v()     // Catch:{ all -> 0x03bc }
            X.2qT r5 = r0.A07     // Catch:{ all -> 0x03bc }
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.2qK r0 = r0.A0v()     // Catch:{ all -> 0x03bc }
            X.2qi r4 = r0.A05     // Catch:{ all -> 0x03bc }
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.NEWS_TAB     // Catch:{ all -> 0x03bc }
            r5.A00(r6, r0, r4)     // Catch:{ all -> 0x03bc }
        L_0x0317:
            X.1QK r0 = X.1QK.A0E     // Catch:{ all -> 0x03bc }
            android.view.View r5 = A01(r0, r15)     // Catch:{ all -> 0x03bc }
            if (r5 == 0) goto L_0x0369
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.2qK r0 = r0.A0v()     // Catch:{ all -> 0x03bc }
            X.2qT r6 = r0.A07     // Catch:{ all -> 0x03bc }
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.2qK r0 = r0.A0v()     // Catch:{ all -> 0x03bc }
            X.2qi r4 = r0.A05     // Catch:{ all -> 0x03bc }
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.PROFILE_TAB     // Catch:{ all -> 0x03bc }
            r6.A00(r5, r0, r4)     // Catch:{ all -> 0x03bc }
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.2qK r0 = r0.A0v()     // Catch:{ all -> 0x03bc }
            boolean r0 = r0.A01     // Catch:{ all -> 0x03bc }
            if (r0 == 0) goto L_0x0369
            boolean r0 = r5 instanceof com.instagram.notifications.badging.ui.component.ToastingBadge     // Catch:{ all -> 0x03bc }
            if (r0 == 0) goto L_0x0369
            r0 = r5
            com.instagram.notifications.badging.ui.component.ToastingBadge r0 = (com.instagram.notifications.badging.ui.component.ToastingBadge) r0     // Catch:{ all -> 0x03bc }
            X.2g3 r0 = r0.getViewModel()     // Catch:{ all -> 0x03bc }
            X.05G r4 = r0.A0J     // Catch:{ all -> 0x03bc }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x03bc }
            r4.Epw(r0)     // Catch:{ all -> 0x03bc }
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.2qK r0 = r0.A0v()     // Catch:{ all -> 0x03bc }
            X.2qT r3 = r0.A07     // Catch:{ all -> 0x03bc }
            X.9PA r0 = new X.9PA     // Catch:{ all -> 0x03bc }
            r0.<init>(r5)     // Catch:{ all -> 0x03bc }
            r3.A01 = r0     // Catch:{ all -> 0x03bc }
        L_0x0369:
            X.1QK r0 = X.1QK.A09     // Catch:{ all -> 0x03bc }
            android.view.View r5 = A01(r0, r15)     // Catch:{ all -> 0x03bc }
            if (r5 == 0) goto L_0x038a
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.2qK r0 = r0.A0v()     // Catch:{ all -> 0x03bc }
            X.2qT r4 = r0.A07     // Catch:{ all -> 0x03bc }
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x03bc }
            X.2qK r0 = r0.A0v()     // Catch:{ all -> 0x03bc }
            X.2qi r3 = r0.A05     // Catch:{ all -> 0x03bc }
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.CLIPS_TAB_ICON     // Catch:{ all -> 0x03bc }
            r4.A00(r5, r0, r3)     // Catch:{ all -> 0x03bc }
        L_0x038a:
            r2.requestFocus()     // Catch:{ all -> 0x03bc }
            goto L_0x03a1
        L_0x038e:
            r0 = r6
            goto L_0x0223
        L_0x0391:
            android.content.res.Resources r4 = r10.getResources()     // Catch:{ all -> 0x03bc }
            r0 = 2131165208(0x7f070018, float:1.7944627E38)
            int r0 = r4.getDimensionPixelSize(r0)     // Catch:{ all -> 0x03bc }
            goto L_0x0203
        L_0x039e:
            r4 = r6
            goto L_0x01be
        L_0x03a1:
            r0 = 1326530789(0x4f1140e5, float:2.43694925E9)
            X.0fh.A00(r0)
            r0 = 1653867127(0x62940277, float:1.3651479E21)
            X.AnonymousClass0fD.A09(r0, r1)
            return r2
        L_0x03ae:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03bc }
            r2.<init>(r0)     // Catch:{ all -> 0x03bc }
            r0 = -1325488785(0xffffffffb0fea56f, float:-1.8527951E-9)
            X.AnonymousClass0fD.A09(r0, r1)     // Catch:{ all -> 0x03bc }
            throw r2     // Catch:{ all -> 0x03bc }
        L_0x03bc:
            r2 = move-exception
            r0 = 569366944(0x21efd9a0, float:1.6252875E-18)
            X.0fh.A00(r0)
            r0 = 766770206(0x2db3fc1e, float:2.0461906E-11)
            X.AnonymousClass0fD.A09(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227802jw.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        AnonymousClass00P th;
        0Tu r6;
        FragmentActivity activity;
        AnonymousClass37D A012;
        int A022 = AnonymousClass0fD.A02(1748994734);
        if (Systrace.A0E(1)) {
            0fS.A01("MainFeedFragment.onDestroy", 560351245);
        }
        try {
            super.onDestroy();
            AnonymousClass332 r0 = this.A07;
            if (r0 != null) {
                r0.onDestroy();
            }
            C228472lj A0o2 = A0A().A0o();
            if (Systrace.A0E(1)) {
                0fS.A01("MainFeedDeliveryController.stop", -1700883155);
            }
            try {
                C61940qJ.A00(C228472lj.A00(A0o2));
                C228552lr r4 = A0o2.A0f;
                synchronized (r4.A0Y) {
                    r4.A0D = true;
                    r4.A0A = null;
                    if (!r4.A0b) {
                        1UN r9 = r4.A0R;
                        UserSession userSession = r9.A03;
                        r6 = 0Tu.A05;
                        if (182.A06(r6, userSession, 36314914855783313L) || 182.A06(r6, userSession, 36314914855652239L)) {
                            C262224Cq r8 = r9.A07;
                            AnonymousClass9K1 r7 = new AnonymousClass9K1((Object) r4, (Object) r9, (AnonymousClass4D7) null, 12);
                            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r7, r8);
                        } else {
                            1UN.A01(r9, r4);
                        }
                    } else {
                        MainFeedLocalDataSource mainFeedLocalDataSource = r4.A06;
                        if (mainFeedLocalDataSource == null) {
                            0qQ.A0F("mainFeedLocalDataSource");
                        } else {
                            C63657L1t l1t = r4.A08;
                            if (l1t == null) {
                                0qQ.A0F("localSourceDelegate");
                            } else {
                                UserSession userSession2 = mainFeedLocalDataSource.A09;
                                r6 = 0Tu.A05;
                                if (182.A06(r6, userSession2, 36314914855783313L) || 182.A06(r6, userSession2, 36314914855652239L)) {
                                    C262224Cq r72 = mainFeedLocalDataSource.A0H;
                                    1Eo.A05(19B.A00, new MH3(mainFeedLocalDataSource, l1t, (AnonymousClass4D7) null, 10), r72);
                                } else {
                                    mainFeedLocalDataSource.A07();
                                    synchronized (mainFeedLocalDataSource) {
                                        try {
                                            mainFeedLocalDataSource.A0E.remove(l1t);
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                }
                            }
                        }
                        th = AnonymousClass00P.createAndThrow();
                        throw th;
                    }
                    UserSession userSession3 = r4.A0J;
                    if (182.A06(r6, userSession3, 36328529902124440L)) {
                        C55048HbJ.A00(r4.A0G, userSession3).A03();
                    }
                    r4.A07 = null;
                    r4.A0Z.clear();
                }
                r4.A0H.removeCallbacksAndMessages((Object) null);
                r4.A0U.onStop();
                if (Systrace.A0E(1)) {
                    0fS.A00(131744579);
                }
                AnonymousClass354 A10 = A0A().A10();
                A10.A00 = null;
                if (AnonymousClass354.A00(A10) != null) {
                    AnonymousClass3VK A002 = AnonymousClass3VI.A00(A10.A01);
                    A002.A00.remove(AnonymousClass3VL.FEED);
                }
                AnonymousClass3E3 r1 = this.A0W;
                if (r1 != null) {
                    A0A().A1w.FJ2(r1);
                    this.mLifecycleRegistry.A0A(r1);
                }
                this.A0A = null;
                this.A0W = null;
                this.A0I = null;
                1xC r3 = 1xC.A01;
                Object obj = this.A0r;
                synchronized (r3) {
                    0qQ.A0B(obj, 0);
                    r3.A00.A05(obj);
                }
                A0A().A1w.FJ2(A0A().A01());
                A0A().A1w.FJ2(1GV.A00(getSession()));
                1wY.A00(getSession()).A08(AnonymousClass2kO.A00.getModuleName());
                if (!(getContext() == null || (activity = getActivity()) == null || (A012 = AnonymousClass37D.A00.A01(activity)) == null)) {
                    A012.A0P((C332277Ui) null);
                }
                A0A().A0q().A00 = null;
                AnonymousClass57E r32 = this.A0d;
                if (r32 != null && r32.A02.isEnabled()) {
                    r32.A00.EDk(r32.A03);
                    r32.A01.FJ2(r32.A04);
                }
                this.A0d = null;
                AnonymousClass2kT r42 = AnonymousClass2kS.A02;
                UserSession A052 = getSession();
                synchronized (r42) {
                    try {
                        0qQ.A0B(A052, 0);
                        Class<AnonymousClass2kS> cls = AnonymousClass2kS.class;
                        AnonymousClass2kS r02 = (AnonymousClass2kS) A052.A01(cls, new AnonymousClass9LD(A052, 41));
                        if (r02 != null) {
                            14i.A06(r02);
                        }
                        A052.A03(cls);
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                AnonymousClass57Q r03 = this.A0A;
                if (r03 != null) {
                    r03.A06 = null;
                }
                if (Systrace.A0E(1)) {
                    0fS.A00(581414629);
                }
                AnonymousClass0fD.A09(-589459100, A022);
            } catch (Throwable th4) {
                th = th4;
                if (Systrace.A0E(1)) {
                    0fS.A00(853423916);
                }
                throw th;
            }
        } catch (Throwable th5) {
            if (Systrace.A0E(1)) {
                0fS.A00(1516776565);
            }
            AnonymousClass0fD.A09(-894899964, A022);
            throw th5;
        }
    }

    public final void onDestroyView() {
        IllegalStateException th;
        int i;
        AnonymousClass3D6 r0;
        AnonymousClass37D A012;
        int A022 = AnonymousClass0fD.A02(927197070);
        if (Systrace.A0E(1)) {
            0fS.A01("MainFeedFragment.onDestroyView", 1389415491);
        }
        try {
            super.onDestroyView();
            AnonymousClass332 r02 = this.A07;
            if (r02 != null) {
                r02.onDestroyView();
            }
            if (A0A().A0m().A00 != null) {
                C228152ks r1 = A0A().A1w;
                C2813757h r03 = A0A().A0m().A00;
                if (r03 != null) {
                    r1.FJ2(r03);
                    UserSession A052 = getSession();
                    C2813757h r04 = A0A().A0m().A00;
                    if (r04 != null) {
                        ORY.A01(A052, r04);
                        A0A().A0m().A00 = null;
                    } else {
                        th = new IllegalStateException("Required value was null.");
                        i = 1000669219;
                    }
                } else {
                    th = new IllegalStateException("Required value was null.");
                    i = 698360930;
                }
                AnonymousClass0fD.A09(i, A022);
                throw th;
            }
            FragmentActivity activity = getActivity();
            if (!(activity == null || (A012 = AnonymousClass37D.A00.A01(activity)) == null)) {
                AnonymousClass37F r12 = (AnonymousClass37F) A012;
                if (r12.A0g && r12.A0f) {
                    A012.A0B();
                }
            }
            C228062kj A0A2 = A0A();
            1Pp r13 = A0A2.A0c;
            if (r13 == null) {
                r13 = AnonymousClass1Po.A00;
                A0A2.A0c = r13;
            }
            View view = this.mView;
            if (view != null) {
                r13.A01(view);
                if (this.A0V != null) {
                    0hq parentFragmentManager = getParentFragmentManager();
                    AnonymousClass06Q r14 = this.A0V;
                    if (r14 != null) {
                        parentFragmentManager.A0F.remove(r14);
                    } else {
                        th = new IllegalStateException("Required value was null.");
                        i = 1850376029;
                    }
                }
                if (AnonymousClass1A9.A00()) {
                    1xC r5 = 1xC.A01;
                    Object obj = this.A0r;
                    synchronized (r5) {
                        0qQ.A0B(obj, 0);
                        r5.A00.A05(obj);
                    }
                }
                AnonymousClass34J.A00(getSession()).A01 = null;
                if (this.A0E != null) {
                    C228152ks r15 = A0A().A1w;
                    AnonymousClass3D5 r05 = this.A0E;
                    if (r05 == null || (r0 = r05.A08) == null) {
                        th = new IllegalStateException("Required value was null.");
                        i = 1802837445;
                    } else {
                        r15.FJ2(r0);
                        AnonymousClass3D5 r16 = this.A0E;
                        if (r16 != null) {
                            r16.A05.clear();
                            r16.A07.unregisterDataSetObserver(r16);
                        }
                        this.A0E = null;
                    }
                }
                AnonymousClass3E3 r17 = this.A0W;
                if (r17 != null) {
                    A0A().A1w.FJ2(r17);
                    this.mLifecycleRegistry.A0A(r17);
                }
                this.A0W = null;
                A0A().A1w.A01.A00();
                C238213Az r06 = this.A0B;
                if (r06 != null) {
                    r06.A01 = null;
                    this.A0D = null;
                    this.A01 = null;
                    this.A04 = null;
                    this.A03 = null;
                    this.A02 = null;
                    this.A06 = null;
                    this.A05 = null;
                    this.A0F = null;
                    this.A0G = null;
                    A0A().A09().A05.clear();
                    1ud r2 = 1ua.A0G;
                    Context context = getContext();
                    if (context != null) {
                        r2.A01(context, getSession()).A0K(A0A().A0V());
                        if (Systrace.A0E(1)) {
                            0fS.A00(-178604268);
                        }
                        AnonymousClass0fD.A09(1428010221, A022);
                        return;
                    }
                    th = new IllegalStateException("Required value was null.");
                    i = 1051739203;
                } else {
                    th = new IllegalStateException("Required value was null.");
                    i = -785115981;
                }
            } else {
                th = new IllegalStateException("Required value was null.");
                i = -219735572;
            }
            AnonymousClass0fD.A09(i, A022);
        } catch (Throwable th2) {
            if (Systrace.A0E(1)) {
                0fS.A00(1286474639);
            }
            AnonymousClass0fD.A09(486740283, A022);
            throw th2;
        }
        throw th;
    }

    public final void onDetach() {
        int A022 = AnonymousClass0fD.A02(531910169);
        super.onDetach();
        AnonymousClass35W A0p2 = A0A().A0p();
        A0p2.A02.EDz(A0p2.A0F, AnonymousClass3KA.class);
        AnonymousClass0fD.A09(-2089566015, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1707705659);
        if (Systrace.A0E(1)) {
            0fS.A01("MainFeedFragment.onPause", 456108254);
        }
        try {
            C227802jw.super.onPause();
            C240053Jk.A03.A02(getActivity(), getSession());
            C71162bE A082 = A08();
            if (A082 != null) {
                A082.A01(A0A().A0X());
            }
            AnonymousClass3E3 r1 = this.A0W;
            if (r1 != null) {
                A0A().A1w.FJ2(r1);
                this.mLifecycleRegistry.A0A(r1);
            }
            A0F();
            AnonymousClass3KD.A02 = null;
            UserSession A052 = getSession();
            0Tu r5 = 0Tu.A05;
            if (182.A06(r5, A052, 36318913470405361L)) {
                1Ua A002 = 1UX.A00(requireContext(), getSession());
                0qQ.A07(A002);
                A002.A01();
            }
            this.A0h = false;
            2LI.A00(getSession()).A00 = false;
            if (182.A06(r5, getSession(), 36328151945657319L)) {
                boolean A062 = 182.A06(r5, getSession(), 36328151945722856L);
                0uX A003 = 0uX.A00(getSession());
                if (A062) {
                    Map map = A003.A05;
                    HashSet hashSet = new HashSet(map.size());
                    for (0tj r12 : map.values()) {
                        hashSet.add(new 0tj(r12));
                    }
                    A003.A03.FNh(hashSet);
                } else {
                    A003.A04.AWE();
                }
            }
            if (182.A06(r5, getSession(), 36328529902189977L)) {
                Application application = requireActivity().getApplication();
                0qQ.A07(application);
                C55048HbJ.A00(application, getSession()).A03();
            }
            int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            1GW A004 = 1GV.A00(getSession());
            if (A004.A04) {
                new Handler(Looper.getMainLooper()).postDelayed(new C379589Um(A004), 6000);
            }
            A0A().A0l().A03.A01 = true;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-936303490);
            }
            AnonymousClass0fD.A09(698532907, A022);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0157, code lost:
        r9 = r8.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r15 = this;
            r0 = -1357091953(0xffffffffaf1c6b8f, float:-1.422633E-10)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r13 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r13)
            if (r0 == 0) goto L_0x0017
            r1 = -1854346347(0xffffffff9178eb95, float:-1.9636345E-28)
            java.lang.String r0 = "MainFeedFragment.onResume"
            X.0fS.A01(r0, r1)
        L_0x0017:
            super.onResume()     // Catch:{ all -> 0x034b }
            com.instagram.common.session.UserSession r0 = r15.getSession()     // Catch:{ all -> 0x034b }
            X.37U r6 = X.AnonymousClass37T.A00(r0)     // Catch:{ all -> 0x034b }
            com.instagram.common.session.UserSession r3 = r6.A04     // Catch:{ all -> 0x034b }
            X.0Tu r4 = X.0Tu.A05     // Catch:{ all -> 0x034b }
            r0 = 36329964420743562(0x8111e90000418a, double:3.0385540164784213E-306)
            boolean r0 = X.182.A06(r4, r3, r0)     // Catch:{ all -> 0x034b }
            if (r0 == 0) goto L_0x0040
            r0 = 1
            r6.A02 = r0     // Catch:{ all -> 0x034b }
            android.os.Handler r5 = r6.A03     // Catch:{ all -> 0x034b }
            X.37V r3 = new X.37V     // Catch:{ all -> 0x034b }
            r3.<init>(r6)     // Catch:{ all -> 0x034b }
            r0 = 200(0xc8, double:9.9E-322)
            r5.postDelayed(r3, r0)     // Catch:{ all -> 0x034b }
        L_0x0040:
            r6 = 0
            r15.A0S = r6     // Catch:{ all -> 0x034b }
            X.57Q r0 = r15.A0A     // Catch:{ all -> 0x034b }
            if (r0 == 0) goto L_0x0049
            r0.A06 = r15     // Catch:{ all -> 0x034b }
        L_0x0049:
            X.3Jk r3 = X.C240053Jk.A03     // Catch:{ all -> 0x034b }
            androidx.fragment.app.FragmentActivity r1 = r15.getActivity()     // Catch:{ all -> 0x034b }
            com.instagram.common.session.UserSession r0 = r15.getSession()     // Catch:{ all -> 0x034b }
            r3.A03(r1, r0)     // Catch:{ all -> 0x034b }
            android.content.Context r0 = r15.getContext()     // Catch:{ all -> 0x034b }
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x0103
            X.1ud r5 = X.1ua.A0G     // Catch:{ all -> 0x034b }
            android.content.Context r1 = r15.getContext()     // Catch:{ all -> 0x034b }
            if (r1 == 0) goto L_0x00f8
            com.instagram.common.session.UserSession r0 = r15.getSession()     // Catch:{ all -> 0x034b }
            X.1ua r5 = r5.A01(r1, r0)     // Catch:{ all -> 0x034b }
            monitor-enter(r5)     // Catch:{ all -> 0x034b }
            com.instagram.pendingmedia.store.PendingMediaStore r0 = r5.A04     // Catch:{ all -> 0x00f4 }
            java.util.Map r0 = r0.A06     // Catch:{ all -> 0x00f4 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00f4 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x00f4 }
            r9.<init>()     // Catch:{ all -> 0x00f4 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00f4 }
        L_0x0080:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x0099
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x00f4 }
            r1 = r7
            X.3Q2 r1 = (X.AnonymousClass3Q2) r1     // Catch:{ all -> 0x00f4 }
            java.lang.Integer r0 = X.AnonymousClass05K.A06     // Catch:{ all -> 0x00f4 }
            boolean r0 = X.C261624Ah.A00(r1, r0)     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x0080
            r9.add(r7)     // Catch:{ all -> 0x00f4 }
            goto L_0x0080
        L_0x0099:
            java.util.List r0 = X.00k.A0a(r9)     // Catch:{ all -> 0x00f4 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x00f4 }
            r9.<init>()     // Catch:{ all -> 0x00f4 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00f4 }
        L_0x00a6:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x00f4 }
            r0 = r7
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0     // Catch:{ all -> 0x00f4 }
            X.3QD r1 = r0.A6J     // Catch:{ all -> 0x00f4 }
            X.3QD r0 = X.AnonymousClass3QD.CONFIGURED     // Catch:{ all -> 0x00f4 }
            if (r1 == r0) goto L_0x00a6
            r9.add(r7)     // Catch:{ all -> 0x00f4 }
            goto L_0x00a6
        L_0x00bd:
            java.util.Iterator r8 = r9.iterator()     // Catch:{ all -> 0x00f4 }
        L_0x00c1:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x0102
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x00f4 }
            X.3Q2 r7 = (X.AnonymousClass3Q2) r7     // Catch:{ all -> 0x00f4 }
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.POST_LIVE_IGTV     // Catch:{ all -> 0x00f4 }
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)     // Catch:{ all -> 0x00f4 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x00f4 }
            X.Lc5 r1 = new X.Lc5     // Catch:{ all -> 0x00f4 }
            r1.<init>(r0)     // Catch:{ all -> 0x00f4 }
            java.lang.Class<X.1us> r0 = X.1us.class
            java.util.ArrayList r1 = r7.A0K(r1, r0)     // Catch:{ all -> 0x00f4 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x00f4 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r1 = X.00k.A0J(r1)     // Catch:{ all -> 0x00f4 }
            X.1us r1 = (X.1us) r1     // Catch:{ all -> 0x00f4 }
            r0 = 0
            r5.A0G(r7, r1, r0)     // Catch:{ all -> 0x00f4 }
            goto L_0x00c1
        L_0x00f4:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x034b }
            goto L_0x034a
        L_0x00f8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x034b }
            r1.<init>(r3)     // Catch:{ all -> 0x034b }
            r0 = -68776671(0xfffffffffbe68d21, float:-2.3941814E36)
            goto L_0x0347
        L_0x0102:
            monitor-exit(r5)     // Catch:{ all -> 0x034b }
        L_0x0103:
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x034b }
            X.0eM r0 = r0.A21     // Catch:{ all -> 0x034b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x034b }
            X.2lI r0 = (X.AnonymousClass2lI) r0     // Catch:{ all -> 0x034b }
            boolean r0 = r0.A01()     // Catch:{ all -> 0x034b }
            if (r0 == 0) goto L_0x0221
            r15.A0E()     // Catch:{ all -> 0x034b }
            androidx.fragment.app.FragmentActivity r0 = r15.getActivity()     // Catch:{ all -> 0x034b }
            if (r0 == 0) goto L_0x0193
            X.AnonymousClass2uJ.A01(r0)     // Catch:{ all -> 0x034b }
            androidx.fragment.app.FragmentActivity r1 = r15.getActivity()     // Catch:{ all -> 0x034b }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate"
            X.0qQ.A0C(r1, r0)     // Catch:{ all -> 0x034b }
            X.2ZP r1 = (X.AnonymousClass2ZP) r1     // Catch:{ all -> 0x034b }
            r1.Enj(r6)     // Catch:{ all -> 0x034b }
            X.2kj r3 = r15.A0A()     // Catch:{ all -> 0x034b }
            X.30r r8 = r3.A01     // Catch:{ all -> 0x034b }
            if (r8 != 0) goto L_0x0142
            com.instagram.common.session.UserSession r1 = r3.A1t     // Catch:{ all -> 0x034b }
            X.4DU r0 = X.AnonymousClass2kO.A00     // Catch:{ all -> 0x034b }
            X.30r r8 = new X.30r     // Catch:{ all -> 0x034b }
            r8.<init>(r0, r1)     // Catch:{ all -> 0x034b }
            r3.A01 = r8     // Catch:{ all -> 0x034b }
        L_0x0142:
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x034b }
            X.2mu r0 = r0.A0q()     // Catch:{ all -> 0x034b }
            X.2nI r7 = r0.A00()     // Catch:{ all -> 0x034b }
            androidx.fragment.app.FragmentActivity r5 = r15.requireActivity()     // Catch:{ all -> 0x034b }
            r3 = 1
            X.1Xj r1 = r8.A00     // Catch:{ all -> 0x034b }
            if (r1 == 0) goto L_0x0221
            com.instagram.common.session.UserSession r9 = r8.A04     // Catch:{ all -> 0x034b }
            java.lang.String r10 = X.C231122qu.A07(r9, r1)     // Catch:{ all -> 0x034b }
            if (r10 == 0) goto L_0x0221
            r0 = 10
            java.lang.Long r12 = X.00y.A0n(r0, r10)     // Catch:{ all -> 0x034b }
            if (r12 == 0) goto L_0x0221
            boolean r0 = r8.A02     // Catch:{ all -> 0x034b }
            if (r0 == 0) goto L_0x0221
            boolean r0 = r8.A01     // Catch:{ all -> 0x034b }
            if (r0 != 0) goto L_0x0221
            X.1wP r0 = X.1wN.A00(r9)     // Catch:{ all -> 0x034b }
            X.3OA r0 = r0.A00(r1)     // Catch:{ all -> 0x034b }
            if (r0 == 0) goto L_0x017c
            boolean r0 = r0.A0s     // Catch:{ all -> 0x034b }
            goto L_0x0190
        L_0x017c:
            X.1Xy r0 = r1.A0C     // Catch:{ all -> 0x034b }
            X.3lZ r0 = r0.getInjected()     // Catch:{ all -> 0x034b }
            if (r0 == 0) goto L_0x0221
            java.lang.Boolean r1 = r0.CQV()     // Catch:{ all -> 0x034b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x034b }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x034b }
        L_0x0190:
            if (r0 == 0) goto L_0x0221
            goto L_0x019d
        L_0x0193:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x034b }
            r1.<init>(r3)     // Catch:{ all -> 0x034b }
            r0 = -1289296335(0xffffffffb326e631, float:-3.8859245E-8)
            goto L_0x0347
        L_0x019d:
            r0 = 36318368009099363(0x81075d00011863, double:3.031220399059628E-306)
            boolean r0 = X.182.A06(r4, r9, r0)     // Catch:{ all -> 0x034b }
            if (r0 == 0) goto L_0x0221
            r8.A01 = r3     // Catch:{ all -> 0x034b }
            r8.A02 = r6     // Catch:{ all -> 0x034b }
            r0 = 0
            r8.A00 = r0     // Catch:{ all -> 0x034b }
            X.30s r8 = r8.A03     // Catch:{ all -> 0x034b }
            X.0sm r1 = X.0Yt.A0E()     // Catch:{ all -> 0x034b }
            java.lang.String r0 = "cg_iaw_v2_popup_is_eligible"
            r8.A00(r0, r1)     // Catch:{ all -> 0x034b }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x034b }
            r9.<init>()     // Catch:{ all -> 0x034b }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x034b }
            r8.<init>()     // Catch:{ all -> 0x034b }
            r10 = 3
            java.util.BitSet r11 = new java.util.BitSet     // Catch:{ all -> 0x034b }
            r11.<init>(r10)     // Catch:{ all -> 0x034b }
            java.lang.String r0 = "ad_id"
            r9.put(r0, r12)     // Catch:{ all -> 0x034b }
            r11.set(r6)     // Catch:{ all -> 0x034b }
            X.0Yt.A0E()     // Catch:{ all -> 0x034b }
            java.lang.String r1 = "CGContextualIAWBottomsheet"
            java.lang.String r0 = "force_component"
            r9.put(r0, r1)     // Catch:{ all -> 0x034b }
            java.lang.String r1 = "bottom_sheet"
            java.lang.String r0 = "presentation_mode"
            r9.put(r0, r1)     // Catch:{ all -> 0x034b }
            r11.set(r3)     // Catch:{ all -> 0x034b }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x034b }
            java.lang.String r0 = "skip_component_cooldown_check"
            r9.put(r0, r1)     // Catch:{ all -> 0x034b }
            java.lang.String r0 = "skip_user_cooldown_check"
            r9.put(r0, r1)     // Catch:{ all -> 0x034b }
            java.lang.String r1 = "CGIAWV2"
            r0 = 4130(0x1022, float:5.787E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x034b }
            r9.put(r0, r1)     // Catch:{ all -> 0x034b }
            r0 = 2
            r11.set(r0)     // Catch:{ all -> 0x034b }
            X.FVK r3 = new X.FVK     // Catch:{ all -> 0x034b }
            r3.<init>()     // Catch:{ all -> 0x034b }
            int r0 = r11.nextClearBit(r6)     // Catch:{ all -> 0x034b }
            if (r0 < r10) goto L_0x033f
            java.lang.String r0 = "com.bloks.www.bloks.ig_contextual_tray_infra.async"
            X.FBO r1 = X.HX9.A00(r0)     // Catch:{ all -> 0x034b }
            java.util.HashMap r0 = X.C359608dC.A01(r9)     // Catch:{ all -> 0x034b }
            r1.A04 = r0     // Catch:{ all -> 0x034b }
            r1.A03 = r8     // Catch:{ all -> 0x034b }
            r1.A02 = r3     // Catch:{ all -> 0x034b }
            r1.A01(r5, r7)     // Catch:{ all -> 0x034b }
        L_0x0221:
            X.2bE r1 = r15.A08()     // Catch:{ all -> 0x034b }
            if (r1 == 0) goto L_0x023d
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x034b }
            X.3KB r0 = r0.A0X()     // Catch:{ all -> 0x034b }
            r1.A00(r0)     // Catch:{ all -> 0x034b }
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x034b }
            X.3KB r0 = r0.A0X()     // Catch:{ all -> 0x034b }
            r0.DV0(r1)     // Catch:{ all -> 0x034b }
        L_0x023d:
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x034b }
            X.2l3 r3 = r0.A0Q()     // Catch:{ all -> 0x034b }
            java.lang.String r0 = "MAIN_FEED_FRAGMENT_RESUMED"
            X.AnonymousClass2l3.A02(r3, r0)     // Catch:{ all -> 0x034b }
            com.instagram.common.session.UserSession r5 = r3.A0F     // Catch:{ all -> 0x034b }
            X.2I1 r1 = X.2Hz.A00(r5)     // Catch:{ all -> 0x034b }
            if (r1 == 0) goto L_0x0257
            java.lang.String r0 = "main_feed_fragment_resumed"
            r1.A04(r0)     // Catch:{ all -> 0x034b }
        L_0x0257:
            com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger r0 = X.2Hi.A00(r5)     // Catch:{ all -> 0x034b }
            if (r0 == 0) goto L_0x0260
            r0.onLogMainFeedFragmentResumed()     // Catch:{ all -> 0x034b }
        L_0x0260:
            boolean r0 = r3.A0N     // Catch:{ all -> 0x034b }
            if (r0 != 0) goto L_0x02a7
            X.18g r0 = r3.A0I     // Catch:{ all -> 0x034b }
            boolean r0 = r0.A0V()     // Catch:{ all -> 0x034b }
            if (r0 == 0) goto L_0x0276
            android.os.MessageQueue r1 = r3.A0D     // Catch:{ all -> 0x034b }
            X.JXy r0 = new X.JXy     // Catch:{ all -> 0x034b }
            r0.<init>(r3)     // Catch:{ all -> 0x034b }
            r1.addIdleHandler(r0)     // Catch:{ all -> 0x034b }
        L_0x0276:
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x034b }
            X.2mu r0 = r0.A0q()     // Catch:{ all -> 0x034b }
            X.2nI r0 = r0.A00()     // Catch:{ all -> 0x034b }
            X.AnonymousClass3KD.A02 = r0     // Catch:{ all -> 0x034b }
            com.instagram.common.session.UserSession r0 = r15.getSession()     // Catch:{ all -> 0x034b }
            X.2aO r0 = X.2aN.A00(r0)     // Catch:{ all -> 0x034b }
            X.2aT r0 = r0.A00()     // Catch:{ all -> 0x034b }
            X.2aQ r0 = r0.A00     // Catch:{ all -> 0x034b }
            r0.AHZ()     // Catch:{ all -> 0x034b }
            X.3E3 r5 = r15.A0W     // Catch:{ all -> 0x034b }
            if (r5 == 0) goto L_0x02d0
            com.instagram.common.session.UserSession r3 = r15.getSession()     // Catch:{ all -> 0x034b }
            r0 = 36318999369292588(0x8107f000011b2c, double:3.031619673788107E-306)
            boolean r0 = X.182.A06(r4, r3, r0)     // Catch:{ all -> 0x034b }
            goto L_0x02b2
        L_0x02a7:
            android.os.Handler r1 = r3.A0C     // Catch:{ all -> 0x034b }
            X.3KC r0 = new X.3KC     // Catch:{ all -> 0x034b }
            r0.<init>(r3)     // Catch:{ all -> 0x034b }
            r1.post(r0)     // Catch:{ all -> 0x034b }
            goto L_0x0276
        L_0x02b2:
            if (r0 == 0) goto L_0x02d0
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x034b }
            X.35N r0 = r0.A0H()     // Catch:{ all -> 0x034b }
            com.instagram.actionbar.ActionBarTitleViewSwitcher r0 = r0.A08     // Catch:{ all -> 0x034b }
            if (r0 == 0) goto L_0x02c2
            r5.A00 = r0     // Catch:{ all -> 0x034b }
        L_0x02c2:
            X.2kj r0 = r15.A0A()     // Catch:{ all -> 0x034b }
            X.2ks r0 = r0.A1w     // Catch:{ all -> 0x034b }
            r0.EBt(r5)     // Catch:{ all -> 0x034b }
            X.0h9 r0 = r15.mLifecycleRegistry     // Catch:{ all -> 0x034b }
            r0.A09(r5)     // Catch:{ all -> 0x034b }
        L_0x02d0:
            com.instagram.common.session.UserSession r0 = r15.getSession()     // Catch:{ all -> 0x034b }
            X.2LK r5 = X.2LI.A00(r0)     // Catch:{ all -> 0x034b }
            r0 = 1
            r5.A00 = r0     // Catch:{ all -> 0x034b }
            boolean r0 = r5.A01     // Catch:{ all -> 0x034b }
            if (r0 == 0) goto L_0x02f9
            com.instagram.common.session.UserSession r0 = r5.A03     // Catch:{ all -> 0x034b }
            X.1NN r0 = X.1NM.A00(r0)     // Catch:{ all -> 0x034b }
            com.instagram.common.session.UserSession r3 = r0.A00     // Catch:{ all -> 0x034b }
            r0 = 36319115333606309(0x81080b00041ba5, double:3.031693010087055E-306)
            boolean r0 = X.182.A06(r4, r3, r0)     // Catch:{ all -> 0x034b }
            if (r0 == 0) goto L_0x02f9
            java.lang.Integer r0 = X.AnonymousClass05K.A02     // Catch:{ all -> 0x034b }
            X.2LK.A00(r5, r0)     // Catch:{ all -> 0x034b }
            r5.A01 = r6     // Catch:{ all -> 0x034b }
        L_0x02f9:
            android.content.Context r3 = r15.getContext()     // Catch:{ all -> 0x034b }
            if (r3 == 0) goto L_0x0313
            boolean r0 = r15.Cda()     // Catch:{ all -> 0x034b }
            if (r0 == 0) goto L_0x0313
            androidx.fragment.app.FragmentActivity r1 = r15.getActivity()     // Catch:{ all -> 0x034b }
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            int r0 = r3.getColor(r0)     // Catch:{ all -> 0x034b }
            X.2db.A02(r1, r0)     // Catch:{ all -> 0x034b }
        L_0x0313:
            com.instagram.common.session.UserSession r3 = r15.getSession()     // Catch:{ all -> 0x034b }
            r0 = 36324071725805280(0x810c8d00032ee0, double:3.034827452471474E-306)
            boolean r0 = X.182.A06(r4, r3, r0)     // Catch:{ all -> 0x034b }
            if (r0 == 0) goto L_0x032c
            X.1Hb r1 = X.AnonymousClass1HI.A01     // Catch:{ all -> 0x034b }
            X.H8Q r0 = new X.H8Q     // Catch:{ all -> 0x034b }
            r0.<init>(r15)     // Catch:{ all -> 0x034b }
            r1.Eym(r0)     // Catch:{ all -> 0x034b }
        L_0x032c:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r13)
            if (r0 == 0) goto L_0x0338
            r0 = 10929256(0xa6c468, float:1.531515E-38)
            X.0fS.A00(r0)
        L_0x0338:
            r0 = 223346443(0xd4fff0b, float:6.4093797E-31)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x033f:
            java.lang.String r0 = "Missing Required Props"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x034b }
            r1.<init>(r0)     // Catch:{ all -> 0x034b }
            goto L_0x034a
        L_0x0347:
            X.AnonymousClass0fD.A09(r0, r2)     // Catch:{ all -> 0x034b }
        L_0x034a:
            throw r1     // Catch:{ all -> 0x034b }
        L_0x034b:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r13)
            if (r0 == 0) goto L_0x0358
            r0 = 22525015(0x157b457, float:3.961865E-38)
            X.0fS.A00(r0)
        L_0x0358:
            r0 = -782270045(0xffffffffd15f81a3, float:-5.9997041E10)
            X.AnonymousClass0fD.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227802jw.onResume():void");
    }

    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        super.onSetUserVisibleHint(z, z2);
        if (z) {
            AnonymousClass37U A002 = AnonymousClass37T.A00(getSession());
            if (182.A06(0Tu.A05, A002.A04, 36329964420743562L)) {
                A002.A02 = true;
                A002.A03.postDelayed(new AnonymousClass37V(A002), 200);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003a, code lost:
        if (r8.A0h != false) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079 A[Catch:{ all -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r8 = this;
            r0 = -986934311(0xffffffffc52c93d9, float:-2761.2405)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r6 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)
            if (r0 == 0) goto L_0x0017
            r1 = 814193108(0x308799d4, float:9.866263E-10)
            java.lang.String r0 = "MainFeedFragment.onStart"
            X.0fS.A01(r0, r1)
        L_0x0017:
            X.C227802jw.super.onStart()     // Catch:{ all -> 0x00a2 }
            X.2kj r0 = r8.A0A()     // Catch:{ all -> 0x00a2 }
            X.3E6 r1 = r0.A04()     // Catch:{ all -> 0x00a2 }
            android.content.Context r0 = r8.getContext()     // Catch:{ all -> 0x00a2 }
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x00a2 }
            r1.DmJ(r0)     // Catch:{ all -> 0x00a2 }
            com.instagram.common.session.UserSession r0 = r8.getSession()     // Catch:{ all -> 0x00a2 }
            X.36v r4 = X.C2372236u.A00(r0)     // Catch:{ all -> 0x00a2 }
            boolean r0 = r8.A0N     // Catch:{ all -> 0x00a2 }
            if (r0 != 0) goto L_0x003c
            boolean r0 = r8.A0h     // Catch:{ all -> 0x00a2 }
            r2 = 0
            if (r0 == 0) goto L_0x003d
        L_0x003c:
            r2 = 1
        L_0x003d:
            monitor-enter(r4)     // Catch:{ all -> 0x00a2 }
            com.instagram.common.session.UserSession r0 = r4.A02     // Catch:{ all -> 0x009f }
            X.1QP r5 = X.AnonymousClass1QO.A00(r0)     // Catch:{ all -> 0x009f }
            X.0wX r1 = X.C61170le.A00     // Catch:{ all -> 0x009f }
            X.18g r0 = X.C638918c.A01(r1)     // Catch:{ all -> 0x009f }
            boolean r0 = r0.A0U()     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x0057
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x009f }
        L_0x0052:
            X.36w r0 = X.C2372336v.A01(r4, r0)     // Catch:{ all -> 0x009f }
            goto L_0x0077
        L_0x0057:
            X.18g r0 = X.C638918c.A01(r1)     // Catch:{ all -> 0x009f }
            boolean r0 = r0.A0W()     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x0064
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x009f }
            goto L_0x0052
        L_0x0064:
            X.18g r0 = X.C638918c.A01(r1)     // Catch:{ all -> 0x009f }
            boolean r0 = r0.A0V()     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x0073
            if (r2 == 0) goto L_0x0073
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x009f }
            goto L_0x0052
        L_0x0073:
            X.36w r0 = X.C2372336v.A00(r5, r4)     // Catch:{ all -> 0x009f }
        L_0x0077:
            if (r0 == 0) goto L_0x0080
            long r1 = r0.A05     // Catch:{ all -> 0x009f }
            java.lang.String r0 = "ENTERED_HOME"
            r5.flowMarkPoint(r1, r0)     // Catch:{ all -> 0x009f }
        L_0x0080:
            monitor-exit(r4)     // Catch:{ all -> 0x00a2 }
            com.instagram.common.session.UserSession r0 = r8.getSession()     // Catch:{ all -> 0x00a2 }
            X.3EA r1 = X.AnonymousClass3E9.A00(r0)     // Catch:{ all -> 0x00a2 }
            r0 = 1
            r1.A01 = r0     // Catch:{ all -> 0x00a2 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)
            if (r0 == 0) goto L_0x0098
            r0 = 694568089(0x29664499, float:5.1129758E-14)
            X.0fS.A00(r0)
        L_0x0098:
            r0 = 2129055109(0x7ee6cd85, float:1.5339478E38)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x009f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00a2 }
            throw r0     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)
            if (r0 == 0) goto L_0x00af
            r0 = -1591784206(0xffffffffa11f4cf2, float:-5.397313E-19)
            X.0fS.A00(r0)
        L_0x00af:
            r0 = 27470798(0x1a32bce, float:5.99396E-38)
            X.AnonymousClass0fD.A09(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227802jw.onStart():void");
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-247193018);
        if (Systrace.A0E(1)) {
            0fS.A01("MainFeedFragment.onStop", -1014633765);
        }
        try {
            C227802jw.super.onStop();
            A0A().A04().onStop();
            C2372236u.A00(getSession()).A06(AnonymousClass05K.A0N);
            AnonymousClass3EA A002 = AnonymousClass3E9.A00(getSession());
            02m r5 = A002.A02;
            if (r5.isMarkerOn(20133815, 0)) {
                if (!0qQ.A0K(C64031Cc.A02, "normal")) {
                    AnonymousClass3EA.A01(A002);
                } else if (A002.A00) {
                    r5.markerEndAtPoint(20133815, 0, 2, "direct_inbox_icon_displayed");
                } else {
                    r5.markerAnnotate(20133815, "cancel_reason", "direct inbox icon not displayed");
                    r5.markerEnd(20133815, 4);
                }
            }
            A002.A01 = false;
            A002.A00 = false;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-828197644);
            }
            AnonymousClass0fD.A09(-252922772, A022);
        }
    }

    public final void onViewStateRestored(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(505806226);
        super.onViewStateRestored(bundle);
        A0A().A0O().onViewStateRestored(bundle);
        AnonymousClass0fD.A09(-2134119844, A022);
    }
}
