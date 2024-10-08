package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.PollType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerDirectData;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveMimicryParams;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.save.api.SaveApiUtil;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2is  reason: invalid class name and case insensitive filesystem */
public final class C227232is extends AnonymousClass4DH implements AnonymousClass4DR, C227242it, C227252iu, AnonymousClass0j6, C227262iv, C227272iw, AnonymousClass4DT, C227282ix, C252213ok, C252223ol, C227292iy, C227302iz, C227312j0, C227322j1, C227332j2, C70992Zi, C227342j3, C227352j4 {
    public static final String __redex_internal_original_name = "ClipsViewerFragment";
    public long A00;
    public SwipeRefreshLayout A01;
    public C229382nI A02;
    public JPD A03;
    public GKH A04;
    public GMC A05;
    public Dc2 A06;
    public GCS A07;
    public C52019GBq A08;
    public GBE A09;
    public GDB A0A;
    public GCX A0B;
    public GD6 A0C;
    public GCU A0D;
    public C52018GBp A0E;
    public B55 A0F;
    public C52015GBm A0G;
    public C52043GCp A0H;
    public GC7 A0I;
    public C56042Hrp A0J;
    public C56024HrW A0K;
    public GCV A0L;
    public GC3 A0M;
    public C52012GBj A0N;
    public String A0O;
    public boolean A0P;
    public int A0Q;
    public long A0R;
    public Bundle A0S;
    public 1wn A0T;
    public 1wn A0U;
    public AnonymousClass3KG A0V;
    public AnonymousClass3KQ A0W;
    public AnonymousClass3E6 A0X;
    public C229402nK A0Y;
    public C233812wV A0Z;
    public C234342xi A0a;
    public GCR A0b;
    public GD2 A0c;
    public GDC A0d;
    public GCQ A0e;
    public C52049GCv A0f;
    public C52258GKz A0g;
    public GBD A0h;
    public I4M A0i;
    public GD8 A0j;
    public C57690Iet A0k;
    public final 1wn A0l;
    public final AnonymousClass0eM A0m;
    public final AnonymousClass0eM A0n;
    public final AnonymousClass0eM A0o;
    public final AnonymousClass0eM A0p;
    public final AnonymousClass0eM A0q;
    public final AnonymousClass0eM A0r;
    public final AnonymousClass0eM A0s;
    public final AnonymousClass0eM A0t;
    public final AnonymousClass0eM A0u;
    public final AnonymousClass0eM A0v;
    public final AnonymousClass0eM A0w;
    public final AnonymousClass0eM A0x;
    public final AnonymousClass0eM A0y;
    public final AnonymousClass0eM A0z;
    public final AnonymousClass0eM A10;
    public final AnonymousClass0eM A11;
    public final AnonymousClass0eM A12;
    public final AnonymousClass0eM A13;
    public final AnonymousClass0eM A14;
    public final AnonymousClass0eM A15;
    public final AnonymousClass0eM A16;
    public final AnonymousClass0eM A17;
    public final AnonymousClass0eM A18;
    public final AnonymousClass0eM A19;
    public final AnonymousClass0eM A1A;
    public final AnonymousClass0eM A1B;
    public final AnonymousClass0eM A1C;
    public final AnonymousClass0eM A1D;
    public final AnonymousClass0eM A1E;
    public final AnonymousClass0eM A1F;
    public final 1wn A1G;
    public final C61110lV A1H;
    public final C227842k3 A1I;
    public final C55925Hpn A1J;
    public final AnonymousClass0eM A1K;
    public final AnonymousClass0eM A1L = C227642jf.A02(this);
    public final boolean A1M;

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0141, code lost:
        if (r7 > (X.182.A01(r3, r2, 36609725707130793L) * 1000)) goto L_0x0143;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A05() {
        /*
            r13 = this;
            r7 = r13
            androidx.fragment.app.FragmentActivity r6 = r13.requireActivity()
            com.instagram.common.session.UserSession r8 = A01(r13)
            boolean r12 = r13.Cda()
            r11 = 0
            r10 = 1
            r0 = 2130970158(0x7f04062e, float:1.7549018E38)
            int r9 = X.2Yu.A0H(r6, r0)
            X.C317756nm.A01(r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = r13.A0H()
            if (r0 == 0) goto L_0x0275
            boolean r0 = X.2Y9.A00
            if (r0 == 0) goto L_0x0035
            androidx.fragment.app.FragmentActivity r2 = r13.requireActivity()
            android.content.Context r1 = r13.requireContext()
            r0 = 2131099778(0x7f060082, float:1.7811919E38)
            int r0 = r1.getColor(r0)
            X.C317756nm.A00(r2, r0)
        L_0x0035:
            r13.A0R(r11)
            androidx.fragment.app.FragmentActivity r0 = r13.requireActivity()
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L_0x0047
            r0 = 128(0x80, float:1.794E-43)
            r1.addFlags(r0)
        L_0x0047:
            X.GBE r4 = r13.A09
            if (r4 == 0) goto L_0x0271
            X.GYI r0 = r4.A0r
            if (r0 == 0) goto L_0x0051
            r0.A00 = r10
        L_0x0051:
            X.0eM r0 = r4.A1W
            java.lang.Object r0 = r0.getValue()
            X.GE6 r0 = (X.GE6) r0
            r0.A00 = r10
            X.0eM r0 = r4.A1d
            java.lang.Object r0 = r0.getValue()
            X.GE7 r0 = (X.GE7) r0
            r0.A00 = r10
            X.0eM r0 = r4.A1T
            java.lang.Object r0 = r0.getValue()
            X.GE8 r0 = (X.GE8) r0
            r0.A00 = r10
            X.0eM r0 = r4.A1V
            java.lang.Object r0 = r0.getValue()
            X.GCJ r0 = (X.GCJ) r0
            r0.A00 = r10
            X.0eM r0 = r4.A1R
            java.lang.Object r0 = r0.getValue()
            X.GCK r0 = (X.GCK) r0
            r0.A00 = r10
            X.0eM r0 = r4.A1X
            java.lang.Object r0 = r0.getValue()
            X.GCL r0 = (X.GCL) r0
            r0.A00 = r10
            X.0eM r0 = r4.A1U
            java.lang.Object r0 = r0.getValue()
            X.GE9 r0 = (X.GE9) r0
            r0.A00 = r10
            X.0eM r0 = r4.A1Y
            java.lang.Object r0 = r0.getValue()
            X.GCM r0 = (X.GCM) r0
            r0.A00 = r10
            X.0eM r0 = r4.A1g
            java.lang.Object r3 = r0.getValue()
            X.GDS r3 = (X.GDS) r3
            X.3W1 r2 = r3.A0C
            if (r2 == 0) goto L_0x00b3
            X.2xU r1 = r3.A0B
            r0 = 0
            r2.A0L(r1, r0, r11)
        L_0x00b3:
            androidx.fragment.app.FragmentActivity r1 = r3.A05
            r0 = 2131427559(0x7f0b00e7, float:1.8476738E38)
            android.view.View r2 = r1.findViewById(r0)
            X.GBj r0 = r3.A0G
            X.4bN r1 = r0.A0B()
            if (r1 == 0) goto L_0x00d9
            X.GD6 r0 = r3.A0E
            X.GBg r0 = r0.A0A
            X.GDe r0 = r0.BzC(r1)
            int r0 = r0.A09()
            if (r0 != 0) goto L_0x00d9
            if (r2 == 0) goto L_0x00d9
            r0 = 8
            r2.setVisibility(r0)
        L_0x00d9:
            X.2is r6 = r4.A07
            if (r6 == 0) goto L_0x0189
            com.instagram.clips.intf.ClipsViewerConfig r0 = r4.A0Y
            com.instagram.clips.intf.ClipsViewerSource r1 = r0.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_TAB
            if (r1 == r0) goto L_0x00e9
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_NEARBY_PUSH
            if (r1 != r0) goto L_0x0189
        L_0x00e9:
            com.instagram.common.session.UserSession r0 = A01(r6)
            X.4t3 r0 = X.C276314t2.A00(r0)
            boolean r0 = r0.A01()
            java.lang.String r9 = "clipsViewerFragmentViewModel"
            if (r0 != 0) goto L_0x0143
            long r7 = java.lang.System.currentTimeMillis()
            long r0 = r6.A00
            long r7 = r7 - r0
            com.instagram.common.session.UserSession r0 = A01(r6)
            X.4t3 r0 = X.C276314t2.A00(r0)
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x015b
            X.93Q r1 = X.AnonymousClass93Q.A00
            com.instagram.common.session.UserSession r0 = A01(r6)
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x015b
            com.instagram.common.session.UserSession r2 = A01(r6)
            X.0qQ.A0B(r2, r11)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36328250730495120(0x81105a001a3c90, double:3.03747027186483E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x015b
            com.instagram.common.session.UserSession r2 = A01(r6)
            X.0qQ.A0B(r2, r11)
            r0 = 36609725707130793(0x82105a001917a9, double:3.2154761804979864E-306)
            long r2 = X.182.A01(r3, r2, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x015b
        L_0x0143:
            X.GBj r0 = r6.A0N
            if (r0 != 0) goto L_0x0151
            java.lang.String r9 = "clipsViewerViewPager"
        L_0x0149:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0151:
            r0.A0I(r11, r11)
            X.GBE r0 = r6.A09
            if (r0 == 0) goto L_0x0149
            r0.A0E()
        L_0x015b:
            X.GBE r5 = r6.A09
            if (r5 == 0) goto L_0x0149
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            X.07V r1 = r0.getLifecycle()
            X.0qQ.A0B(r1, r11)
            boolean r0 = r5.A22
            if (r0 == 0) goto L_0x020f
            X.GLn r0 = r5.A0J
            if (r0 == 0) goto L_0x0189
            java.lang.String r1 = r0.A01
            java.lang.String r3 = r0.A00
            java.lang.String r0 = r0.A02
            if (r1 == 0) goto L_0x01f7
            X.BJ4 r2 = new X.BJ4
            r2.<init>(r1, r10)
        L_0x017f:
            X.GLR r0 = r5.A16
            if (r0 == 0) goto L_0x0186
            r0.A0B(r2)
        L_0x0186:
            r0 = 0
            r5.A0J = r0
        L_0x0189:
            r4.A0H()
            com.instagram.common.session.UserSession r6 = r4.A0a
            X.1wY.A00(r6)
            X.11Z.A00()
            X.11Z.A00()
            X.GD9 r0 = r4.A1L
            X.4bN r2 = r0.A02()
            X.2qi r7 = r4.A0h
            X.0qQ.A0B(r6, r11)
            r0 = 2
            X.0qQ.A0B(r7, r0)
            if (r2 == 0) goto L_0x01e9
            com.instagram.user.model.User r0 = r2.A08(r6)
            if (r0 == 0) goto L_0x01f5
            java.lang.String r1 = r0.getId()
        L_0x01b2:
            java.lang.String r0 = r6.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01e9
            long r2 = r2.A0D
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r9 = r5.toSeconds(r0)
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.HOURS
            X.0Tu r5 = X.0Tu.A06
            r0 = 37157935331541060(0x8402f200060044, double:3.562166154438013E-306)
            double r5 = X.182.A00(r5, r6, r0)
            long r0 = (long) r5
            long r0 = r8.toSeconds(r0)
            long r9 = r9 - r0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x01e9
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1p
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
            X.0qQ.A07(r0)
            r7.AVg(r0)
        L_0x01e9:
            X.2is r5 = r4.A07
            if (r5 == 0) goto L_0x0265
            X.Hrp r2 = r5.A0J
            if (r2 != 0) goto L_0x022a
            java.lang.String r9 = "overlayFragmentController"
            goto L_0x0149
        L_0x01f5:
            r1 = 0
            goto L_0x01b2
        L_0x01f7:
            if (r3 == 0) goto L_0x0206
            com.instagram.clips.intf.ClipsViewerConfig r0 = r5.A0Y
            java.lang.String r1 = r0.A1K
            X.B5J r0 = X.B5J.A00
            X.GPD r2 = new X.GPD
            r2.<init>(r3, r1, r0)
            goto L_0x017f
        L_0x0206:
            if (r0 == 0) goto L_0x0186
            X.BJ4 r2 = new X.BJ4
            r2.<init>(r0, r11)
            goto L_0x017f
        L_0x020f:
            X.0eM r0 = r5.A1k
            java.lang.Object r5 = r0.getValue()
            X.0xx r3 = X.C71772f0.A00(r1)
            r1 = 0
            r0 = 41
            X.ImL r2 = new X.ImL
            r2.<init>(r5, r1, r0)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r2, r3)
            goto L_0x0189
        L_0x022a:
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x026b
            r2.A08 = r11
            androidx.fragment.app.Fragment r1 = r2.A00
            if (r1 == 0) goto L_0x023c
            X.Ihx r0 = new X.Ihx
            r0.<init>(r1, r2)
            X.11Z.A03(r0)
        L_0x023c:
            X.GBE r0 = r5.A09
            if (r0 == 0) goto L_0x0271
            X.GKU r0 = r0.A0I
            if (r0 == 0) goto L_0x0256
            X.0xa r0 = r0.A03
            X.0xY r3 = r0.AR4()
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "KEY_LAST_VIEWER_ENTRY"
            r3.E5c(r0, r1)
            r3.apply()
        L_0x0256:
            com.instagram.common.session.UserSession r0 = A01(r5)
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.3KT> r1 = X.AnonymousClass3KT.class
            X.1wn r0 = r5.A0l
            r2.A01(r0, r1)
        L_0x0265:
            X.GDx r0 = r4.A1F
            r0.A00()
            return
        L_0x026b:
            r0 = 0
            r2.A00 = r0
            r2.A07 = r0
            goto L_0x023c
        L_0x0271:
            java.lang.String r9 = "clipsViewerFragmentViewModel"
            goto L_0x0149
        L_0x0275:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227232is.A05():void");
    }

    private final void A07() {
        UserSession A012 = A01(this);
        GD9 A0O2 = A0O();
        ClipsViewerConfig A002 = A00(this);
        C52012GBj gBj = this.A0N;
        String str = "clipsViewerViewPager";
        if (gBj != null) {
            C55925Hpn hpn = this.A1J;
            List list = (List) this.A12.getValue();
            C52018GBp gBp = this.A0E;
            if (gBp == null) {
                str = "clipsAutoScrollController";
            } else {
                GBE gbe = this.A09;
                if (gbe == null) {
                    str = "clipsViewerFragmentViewModel";
                } else {
                    GDB gdb = new GDB(A002, A012, (HPJ) ((C52065GDl) this.A13.getValue()).A07.getValue(), hpn, this, gbe, gBp, gBj, A0O2, list);
                    this.A0A = gdb;
                    GD2 gd2 = this.A0c;
                    if (gd2 != null) {
                        gd2.A00 = gdb;
                    }
                    GDC gdc = new GDC(gdb);
                    this.A0d = gdc;
                    C52012GBj gBj2 = this.A0N;
                    if (gBj2 != null) {
                        gBj2.A02 = gdc;
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CUF() {
        return false;
    }

    public final void D0t(1Xj r1) {
    }

    public final /* synthetic */ void DAU() {
    }

    public final /* synthetic */ void DAW() {
    }

    public final /* synthetic */ void DAu() {
    }

    public final void DMr(int i, boolean z) {
    }

    public final /* synthetic */ void Dfn() {
    }

    public final void Dk5(1Xj r1) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: X.3E3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v49, resolved type: X.3E3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v50, resolved type: X.3E3} */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02cb, code lost:
        if (r8 == com.instagram.clips.intf.ClipsViewerSource.A0n) goto L_0x02cd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r32) {
        /*
            r31 = this;
            r5 = 0
            r6 = r32
            X.0qQ.A0B(r6, r5)
            r13 = r31
            com.instagram.common.session.UserSession r2 = A01(r13)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36326691655792560(0x810eef000237b0, double:3.036484306745041E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x0020
            X.GDB r0 = r13.A0A
            if (r0 != 0) goto L_0x0020
            r13.A07()
        L_0x0020:
            X.GDB r3 = r13.A0A
            if (r3 == 0) goto L_0x01f7
            r3.A06 = r6
            X.2is r14 = r3.A0I
            boolean r0 = r14.Cda()
            r1 = 2131099778(0x7f060082, float:1.7811919E38)
            if (r0 == 0) goto L_0x0034
            r1 = 2131100175(0x7f06020f, float:1.7812724E38)
        L_0x0034:
            android.content.Context r2 = r3.A0C
            r10 = 2130970279(0x7f0406a7, float:1.7549264E38)
            int r0 = X.2Yu.A0H(r2, r10)
            java.lang.Integer r22 = X.AnonymousClass05K.A00
            r12 = 0
            r11 = 0
            r27 = -2
            int r24 = r2.getColor(r1)
            int r23 = r2.getColor(r0)
            android.graphics.drawable.Drawable r1 = r3.A01
            if (r1 != 0) goto L_0x0066
            boolean r0 = r14.Cda()
            com.instagram.common.session.UserSession r6 = r3.A0G
            if (r0 == 0) goto L_0x03e6
            r0 = 37161985485766870(0x8406a1000700d6, double:3.564727488279077E-306)
            double r0 = X.182.A00(r4, r6, r0)
        L_0x0060:
            android.graphics.drawable.GradientDrawable$Orientation r6 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            android.graphics.drawable.GradientDrawable r1 = X.GIZ.A00(r2, r6, r0)
        L_0x0066:
            r3.A01 = r1
            if (r1 != 0) goto L_0x0071
            r0 = 2131231394(0x7f0802a2, float:1.8078868E38)
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r0)
        L_0x0071:
            com.instagram.clips.intf.ClipsViewerSource r7 = r3.A0F
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_TAB
            if (r7 == r0) goto L_0x00a0
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.REVIEW_FOLLOWING_SCREEN
            if (r7 == r0) goto L_0x00a0
            X.2da r6 = r3.A06
            if (r6 == 0) goto L_0x0083
            r0 = 1
            r6.Eu4(r0)
        L_0x0083:
            X.2da r0 = r3.A06
            if (r0 == 0) goto L_0x0090
            X.2dZ r0 = (X.2dZ) r0
            android.widget.ImageView r0 = r0.A0Q()
            r0.setBackground(r12)
        L_0x0090:
            X.GJf r11 = new X.GJf
            r11.<init>(r3)
            com.instagram.clips.intf.ClipsViewerConfig r0 = r3.A0E
            java.lang.Integer r6 = r0.A0W
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r6 != r0) goto L_0x00a0
            r27 = 2131239025(0x7f082071, float:1.8094345E38)
        L_0x00a0:
            X.2da r0 = r3.A06
            if (r0 == 0) goto L_0x00c2
            r25 = -2
            X.57Z r15 = new X.57Z
            r17 = r12
            r18 = r12
            r20 = r12
            r21 = r11
            r26 = r25
            r28 = r25
            r29 = r25
            r30 = r5
            r16 = r12
            r19 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r0.ErJ(r15)
        L_0x00c2:
            boolean r0 = r14.Cda()
            if (r0 == 0) goto L_0x03e1
            X.2ff r8 = X.C226112fe.A0B
            androidx.fragment.app.FragmentActivity r6 = r3.A0D
            r1 = 1
            X.IaV r0 = new X.IaV
            r0.<init>(r3)
            r8.A04(r6, r0, r1)
        L_0x00d5:
            X.2da r0 = r3.A06
            r11 = 0
            if (r0 == 0) goto L_0x00dd
            r0.EnO(r12)
        L_0x00dd:
            int r1 = X.2Yu.A0H(r2, r10)
            com.instagram.clips.intf.ClipsViewerConfig r6 = r3.A0E
            boolean r0 = r6.A1f
            if (r0 == 0) goto L_0x026d
            X.2da r8 = r3.A06
            if (r8 == 0) goto L_0x0100
            java.lang.String r0 = " "
        L_0x00ed:
            X.2dZ r8 = (X.2dZ) r8
            r8.setTitle(r0)
            android.content.Context r0 = X.2dZ.A00(r8)
            int r0 = r0.getColor(r1)
            X.2dZ.A0I(r8, r0)
            r8.C7y()
        L_0x0100:
            X.2da r1 = r3.A06
            if (r1 == 0) goto L_0x010c
            X.GDv r0 = new X.GDv
            r0.<init>(r3)
            r1.Eoo(r0)
        L_0x010c:
            X.2da r1 = r3.A06
            if (r1 == 0) goto L_0x0118
            boolean r0 = r14 instanceof X.C227252iu
            if (r0 == 0) goto L_0x0115
            r11 = r14
        L_0x0115:
            r1.ErT(r11)
        L_0x0118:
            java.util.List r9 = r3.A0N
            int r0 = r9.size()
            r8 = 1
            if (r0 <= r8) goto L_0x0193
            com.instagram.actionbar.ActionBarTitleViewSwitcher r1 = r3.A07
            if (r1 != 0) goto L_0x012d
            X.2da r0 = r3.A06
            if (r0 == 0) goto L_0x026a
            com.instagram.common.ui.base.IgTextView r1 = r0.C7y()
        L_0x012d:
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0139
            X.GLs r0 = new X.GLs
            r0.<init>(r3)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x0139:
            boolean r0 = X.GDB.A07(r3)
            if (r0 != 0) goto L_0x0179
            X.2da r0 = r3.A06
            if (r0 == 0) goto L_0x0179
            r0.EuC(r8)
            X.2dZ r0 = (X.2dZ) r0
            X.0eM r10 = r0.A0X
            java.lang.Object r1 = r10.getValue()
            X.0qQ.A07(r1)
            android.view.View r1 = (android.view.View) r1
            X.GM3 r0 = new X.GM3
            r0.<init>(r3)
            X.AnonymousClass0fU.A00(r0, r1)
            java.lang.Object r10 = r10.getValue()
            X.0qQ.A07(r10)
            android.view.View r10 = (android.view.View) r10
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1084227584(0x40a00000, float:5.0)
            float r0 = r0 * r1
            int r1 = (int) r0
            int r0 = r10.getPaddingLeft()
            r10.setPadding(r0, r1, r1, r1)
        L_0x0179:
            com.instagram.common.session.UserSession r10 = r3.A0G
            r0 = 36320652933145298(0x810971001722d2, double:3.032665394226928E-306)
            boolean r0 = X.182.A06(r4, r10, r0)
            if (r0 == 0) goto L_0x0193
            X.C247323g9.A00(r10)
            X.2da r1 = r3.A06
            if (r1 == 0) goto L_0x0193
            r0 = 2131624648(0x7f0e02c8, float:1.8876482E38)
            r1.ETg(r0, r5, r5, r5)
        L_0x0193:
            int r1 = r7.ordinal()
            r0 = 81
            if (r1 == r0) goto L_0x025c
            r0 = 11
            if (r1 == r0) goto L_0x0228
            r0 = 13
            if (r1 == r0) goto L_0x0228
            r0 = 12
            if (r1 == r0) goto L_0x01b9
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L_0x01b9
            X.GDB.A04(r3)
            X.GD9 r0 = r3.A0M
            X.4bN r0 = r0.A02()
            if (r0 == 0) goto L_0x01b9
            r3.A0C(r0)
        L_0x01b9:
            int r0 = r9.size()
            if (r0 <= r8) goto L_0x01f7
            com.instagram.actionbar.ActionBarTitleViewSwitcher r4 = r3.A07
            if (r4 != 0) goto L_0x01cb
            X.2da r0 = r3.A06
            if (r0 == 0) goto L_0x0226
            com.instagram.common.ui.base.IgTextView r4 = r0.C7y()
        L_0x01cb:
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x01f7
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.2eS.A04(r4, r0)
            X.2eQ.A01(r4)
            r1 = 2131955873(0x7f1310a1, float:1.9548286E38)
            int r0 = r9.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r2.getString(r1, r0)
            X.2eQ.A08(r4, r0)
            r0 = 2131955874(0x7f1310a2, float:1.9548288E38)
            java.lang.String r0 = r2.getString(r0)
            r4.setContentDescription(r0)
        L_0x01f7:
            com.instagram.clips.intf.ClipsViewerConfig r0 = A00(r13)
            java.lang.Integer r0 = r0.A0c
            if (r0 == 0) goto L_0x020f
            int r1 = r0.intValue()
            if (r1 <= 0) goto L_0x020f
            X.GDB r0 = r13.A0A
            if (r0 == 0) goto L_0x020f
            X.HCB r0 = r0.A08
            if (r0 == 0) goto L_0x020f
            r0.A00 = r1
        L_0x020f:
            com.instagram.clips.intf.ClipsViewerConfig r0 = A00(r13)
            com.google.common.collect.ImmutableList r1 = r0.A0D
            if (r1 == 0) goto L_0x0225
            X.GDB r0 = r13.A0A
            if (r0 == 0) goto L_0x0225
            int r1 = r1.size()
            X.HCB r0 = r0.A08
            if (r0 == 0) goto L_0x0225
            r0.A00 = r1
        L_0x0225:
            return
        L_0x0226:
            r4 = 0
            goto L_0x01cb
        L_0x0228:
            X.GBE r1 = r3.A0J
            boolean r0 = r1.A0U()
            if (r0 != 0) goto L_0x023e
            X.0eM r0 = r1.A1q
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01b9
        L_0x023e:
            r0 = 70
            float r0 = X.0nA.A04(r2, r0)
            X.2da r1 = r3.A06
            if (r1 == 0) goto L_0x024c
            int r0 = (int) r0
            r1.ETf(r0)
        L_0x024c:
            X.GDB.A04(r3)
            com.instagram.common.session.UserSession r0 = r3.A0G
            X.GMD r0 = X.GNS.A00(r0)
            int r0 = r0.A00
            r3.A0B(r0)
            goto L_0x01b9
        L_0x025c:
            boolean r0 = r6.A1g
            if (r0 == 0) goto L_0x01b9
            com.instagram.common.session.UserSession r0 = r3.A0G
            X.GNS.A00(r0)
            r3.A0A()
            goto L_0x01b9
        L_0x026a:
            r1 = 0
            goto L_0x012d
        L_0x026d:
            com.instagram.clips.intf.ClipsViewerSource r8 = r6.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.BLEND
            if (r8 != r0) goto L_0x02a2
            r8 = 2131624000(0x7f0e0040, float:1.8875167E38)
            X.2da r1 = r3.A06
            if (r1 == 0) goto L_0x0100
            com.instagram.common.session.UserSession r0 = r3.A0G
            android.view.View r1 = r1.ETj(r0, r8, r5, r5)
            if (r1 == 0) goto L_0x0100
            r0 = 2131442898(0x7f0b3cd2, float:1.8507849E38)
            android.view.View r1 = r1.requireViewById(r0)
            X.0qQ.A07(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = X.GDB.A02(r3)
            r1.setText(r0)
            int r0 = X.2Yu.A0A(r2)
            int r0 = r2.getColor(r0)
            r1.setTextColor(r0)
            goto L_0x0100
        L_0x02a2:
            boolean r0 = X.GDB.A07(r3)
            if (r0 != 0) goto L_0x02ba
            java.lang.String r0 = r6.A0t
            if (r0 != 0) goto L_0x02ba
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CREATOR_INSPIRATION_HUB
            if (r8 == r0) goto L_0x02ba
            X.2da r8 = r3.A06
            if (r8 == 0) goto L_0x0100
            java.lang.String r0 = X.GDB.A02(r3)
            goto L_0x00ed
        L_0x02ba:
            X.2da r1 = r3.A06
            if (r1 == 0) goto L_0x02c3
            java.lang.String r0 = ""
            r1.setTitle(r0)
        L_0x02c3:
            java.lang.String r9 = r6.A0t
            if (r9 != 0) goto L_0x02cd
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CREATOR_INSPIRATION_HUB
            r16 = 0
            if (r8 != r0) goto L_0x02cf
        L_0x02cd:
            r16 = 1
        L_0x02cf:
            if (r16 == 0) goto L_0x0353
            r1 = 2131624006(0x7f0e0046, float:1.887518E38)
            r15 = 0
        L_0x02d5:
            X.2da r12 = r3.A06
            r8 = 0
            if (r12 == 0) goto L_0x02e0
            com.instagram.common.session.UserSession r0 = r3.A0G
            android.view.View r8 = r12.ETj(r0, r1, r15, r5)
        L_0x02e0:
            boolean r0 = r8 instanceof com.instagram.actionbar.ActionBarTitleViewSwitcher
            if (r0 == 0) goto L_0x0100
            com.instagram.actionbar.ActionBarTitleViewSwitcher r8 = (com.instagram.actionbar.ActionBarTitleViewSwitcher) r8
            if (r8 == 0) goto L_0x0100
            r3.A07 = r8
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            boolean r0 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L_0x02fa
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            if (r1 == 0) goto L_0x02fa
            r0 = 16
            r1.gravity = r0
        L_0x02fa:
            boolean r0 = X.GDB.A07(r3)
            if (r0 == 0) goto L_0x0307
            r0 = 2131955879(0x7f1310a7, float:1.9548298E38)
            java.lang.String r9 = r2.getString(r0)
        L_0x0307:
            java.lang.String r1 = X.GDB.A02(r3)
            r0 = 1
            r8.A03(r1, r9, r0, r5)
            android.content.Context r1 = r8.getContext()
            int r0 = X.2Yu.A0H(r1, r10)
            int r9 = r1.getColor(r0)
            android.graphics.ColorFilter r1 = X.AnonymousClass37O.A00(r9)
            android.widget.ImageView r0 = r8.A05
            if (r0 == 0) goto L_0x0326
            r0.setColorFilter(r1)
        L_0x0326:
            android.widget.ImageView r0 = r8.A06
            if (r0 == 0) goto L_0x032d
            r0.setColorFilter(r1)
        L_0x032d:
            com.instagram.common.ui.base.IgTextView r0 = r8.A09
            if (r0 == 0) goto L_0x0334
            r0.setTextColor(r9)
        L_0x0334:
            android.widget.ImageView r0 = r8.A04
            if (r0 == 0) goto L_0x033b
            r0.setColorFilter(r1)
        L_0x033b:
            com.instagram.common.ui.base.IgTextView r0 = r8.A0A
            if (r0 != 0) goto L_0x0349
            java.lang.String r0 = "secondLabel"
        L_0x0341:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0349:
            r0.setTextColor(r9)
            android.widget.ImageView r0 = r8.A07
            if (r0 != 0) goto L_0x035f
            java.lang.String r0 = "secondLabelChevron"
            goto L_0x0341
        L_0x0353:
            r1 = 2131624005(0x7f0e0045, float:1.8875177E38)
            r0 = 1098907648(0x41800000, float:16.0)
            float r0 = X.0nA.A00(r2, r0)
            int r15 = (int) r0
            goto L_0x02d5
        L_0x035f:
            r0.setColorFilter(r1)
            X.GBj r0 = r3.A0L
            androidx.recyclerview.widget.RecyclerView r0 = X.C52012GBj.A03(r0)
            if (r0 == 0) goto L_0x0100
            X.3Aq r9 = new X.3Aq
            r9.<init>(r0)
            if (r16 == 0) goto L_0x0387
            X.HCB r1 = new X.HCB
            r1.<init>(r8)
            r3.A08 = r1
        L_0x0378:
            r0 = r1
            X.3je r0 = (X.C249383je) r0
            r9.AAD(r0)
            X.0h9 r0 = r14.mLifecycleRegistry
            X.07Y r1 = (X.AnonymousClass07Y) r1
            r0.A09(r1)
            goto L_0x0100
        L_0x0387:
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            com.instagram.common.session.UserSession r10 = r3.A0G
            java.lang.Boolean r0 = X.C52274GLq.A00(r10)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x03c4
            r0 = 36318518333348059(0x810780000718db, double:3.031315464719811E-306)
            boolean r0 = X.182.A06(r4, r10, r0)
            if (r0 == 0) goto L_0x03c4
            r0 = 37162943263277311(0x840780000400ff, double:3.5653331906333407E-306)
        L_0x03a5:
            double r0 = X.182.A00(r4, r10, r0)
            float r10 = (float) r0
            int r12 = X.AnonymousClass0nB.A00(r2)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165770(0x7f07024a, float:1.7945766E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            int r12 = r12 - r0
            float r0 = (float) r12
            float r0 = r0 * r10
        L_0x03bc:
            X.3E3 r1 = new X.3E3
            r1.<init>(r2, r9, r0)
            r3.A07 = r8
            goto L_0x0378
        L_0x03c4:
            java.lang.Boolean r0 = X.GM2.A00(r10)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x03df
            r0 = 36320128946085939(0x8108f700072033, double:3.032334022700663E-306)
            boolean r0 = X.182.A06(r4, r10, r0)
            if (r0 == 0) goto L_0x03df
            r0 = 37164553876144463(0x8408f70006014f, double:3.566351748695945E-306)
            goto L_0x03a5
        L_0x03df:
            r0 = 0
            goto L_0x03bc
        L_0x03e1:
            X.GDB.A03(r3)
            goto L_0x00d5
        L_0x03e6:
            r0 = 36321301471831281(0x810a08000224f1, double:3.0330755327033995E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x0429
            r0 = 37165726401823114(0x840a080000018a, double:3.567093258656506E-306)
            double r0 = X.182.A00(r4, r6, r0)
            r7 = 36321301473076473(0x810a08001524f9, double:3.033075533490864E-306)
            boolean r7 = X.182.A06(r4, r6, r7)
            if (r7 == 0) goto L_0x0060
            X.2da r7 = r3.A06
            if (r7 == 0) goto L_0x0427
            int r9 = r7.AYI()
        L_0x040d:
            r7 = 37165726403264913(0x840a0800160191, double:3.5670932595683054E-306)
            double r6 = X.182.A00(r4, r6, r7)
            float r8 = (float) r6
            float r6 = (float) r9
            android.graphics.drawable.GradientDrawable$Orientation r16 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r15 = r2
            r17 = r0
            r19 = r6
            r20 = r8
            android.graphics.drawable.ShapeDrawable r1 = X.GIZ.A01(r15, r16, r17, r19, r20)
            goto L_0x0066
        L_0x0427:
            r9 = 0
            goto L_0x040d
        L_0x0429:
            r1 = 0
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227232is.configureActionBar(X.2da):void");
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        C227232is.super.onAttach(context);
        this.A0J = new C56042Hrp();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (2Y9.A02(AnonymousClass2YH.A00(configuration.screenWidthDp))) {
            0Pn.A05(requireActivity(), A01(this), 2Yu.A0H(getContext(), R.attr.igds_color_clips_tab_bar_icon));
        }
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        Animation A012 = C3253772d.A01(this, i2, z, false);
        if (A012 == null) {
            return null;
        }
        A012.setAnimationListener(new GKQ(this, z));
        return A012;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C52012GBj gBj = this.A0N;
        String str = "clipsViewerViewPager";
        String str2 = null;
        if (gBj != null) {
            bundle.putInt("ClipsViewerFragment.SAVED_VIEW_PAGER_OFFSET_STATE", gBj.A06());
        }
        bundle.putLong("ClipsViewerFragment.SAVED_CLIPS_TAB_LAST_EXIT_TIME_MS", this.A00);
        if (A0J()) {
            UserSession A012 = A01(this);
            0Tu r8 = 0Tu.A05;
            if (182.A06(r8, A012, 36325918563120514L)) {
                GBE gbe = this.A09;
                if (gbe == null) {
                    str = "clipsViewerFragmentViewModel";
                } else {
                    Object[] array = A03(false).toArray(new String[0]);
                    0qQ.A0B(array, 0);
                    AnonymousClass19S A022 = 19E.A02(AnonymousClass12T.A00.CO6(480314591, 3));
                    1Eo.A03(AnonymousClass05K.A00, 19B.A00, new C58100ImM(array, gbe, (AnonymousClass4D7) null, 1), A022);
                    GD6 gd6 = this.A0C;
                    if (gd6 == null) {
                        str = "viewerAdapter";
                    } else {
                        bundle.putInt("ClipsViewerFragment.SAVED_CLIPS_VIEWER_LIST_SIZE", gd6.A0A.A0A());
                        C52012GBj gBj2 = this.A0N;
                        if (gBj2 != null) {
                            C267324bN A0B2 = gBj2.A0B();
                            if (A0B2 != null) {
                                str2 = A0B2.getId();
                            }
                            bundle.putString("ClipsViewerFragment.SAVED_CLIPS_VIEWER_ITEM_ID", str2);
                            return;
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            String[] strArr = (String[]) A03(true).toArray(new String[0]);
            int i = 0;
            for (String length : strArr) {
                i += length.length() * 2;
            }
            if (((long) i) <= 182.A01(r8, A01(this), 36607393539888707L)) {
                bundle.putInt("ClipsViewerFragment.SAVED_VIEW_PAGER_OFFSET_STATE", 0);
                bundle.putStringArray("ClipsViewerFragment.SAVED_CLIPS_VIEWER_ITEM_LIST", strArr);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r11v17, types: [X.HKJ] */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0668, code lost:
        if (r1.A0U() == false) goto L_0x066a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0921, code lost:
        if (r4 != null) goto L_0x07e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0b5a, code lost:
        if (r5 == null) goto L_0x0b5c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0b67, code lost:
        if (r5 == null) goto L_0x0b69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0b77, code lost:
        if (r2.A0C.BDp() == null) goto L_0x0b7c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0b79, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0b7a, code lost:
        if (r15 != false) goto L_0x0b7d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0b7c, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0b7d, code lost:
        r12 = r11.A0A;
        r15 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0b81, code lost:
        if (r15 != null) goto L_0x0b87;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0b83, code lost:
        r16 = "clipsViewManipulator";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0b87, code lost:
        r27 = new X.C57400Ia6(r23, r29, r2, r31, r10, r1.A0F, r15, r11.A0E);
        r6 = r11.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0ba0, code lost:
        if (r7 == null) goto L_0x0ba5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0ba2, code lost:
        r7.A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0ba5, code lost:
        X.SUD.A06(r2, r27, "webclick", r5.CGH());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0bb2, code lost:
        if (X.C263264Jy.A05(r4, r2) == false) goto L_0x0db2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0bb4, code lost:
        r12 = new X.SFY(r4, r2, r36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0bbf, code lost:
        if (r25 == false) goto L_0x0dae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0bc1, code lost:
        r7 = X.2EG.A2T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0bc3, code lost:
        r9 = r10.getPosition();
        r15 = r10.A03;
        r11 = r7.toString();
        X.0qQ.A0B(r11, 6);
        r34 = null;
        r32 = null;
        r33 = null;
        r28 = null;
        r29 = null;
        r42 = 0;
        r10 = X.C231122qu.A07(r4, r2);
        r35 = r2.A33(r9);
        r40 = r2.getId();
        r39 = r5.BM9();
        r41 = r2.C9L();
        r30 = X.C231122qu.A09(r4, r2);
        r7 = r2.A2A(r4);
        r50 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0bfb, code lost:
        if (r7 == null) goto L_0x0c3d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0bfd, code lost:
        r34 = r7.getUsername();
        r32 = r7.A03.getFbidV2();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0c0b, code lost:
        if (r7.A2Q() != false) goto L_0x0c11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0c0d, code lost:
        r33 = r7.getId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0c11, code lost:
        r28 = r7.Bh3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0c15, code lost:
        if (r35 == null) goto L_0x0c2b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0c1b, code lost:
        if (r2.A5D() == false) goto L_0x0c2b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0c1d, code lost:
        r8 = r2.A1c(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0c21, code lost:
        if (r8 == null) goto L_0x0c2b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0c23, code lost:
        r29 = r8.A1n(r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0c29, code lost:
        if (r29 != null) goto L_0x0c31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0c2b, code lost:
        r29 = r2.A1n(r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0c31, code lost:
        r5 = r7.A03.B6v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0c37, code lost:
        if (r5 == null) goto L_0x0c3d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0c39, code lost:
        r42 = r5.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0c3d, code lost:
        r47 = X.1sx.A0G(r4, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0c45, code lost:
        if (r2.A5n() != false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0c4b, code lost:
        if (r2.A5e() == false) goto L_0x0c4f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0c4d, code lost:
        r50 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0c4f, code lost:
        r49 = r2.A5o();
        r51 = r2.A6E();
        r48 = r2.A5l();
        r52 = r2.A6G();
        r13 = new X.C16388Uu6();
        r13.setArguments(X.QOk.A00(r4, r28, r29, r30, r10, r32, r33, r34, r35, r11, (java.lang.String) null, (java.lang.String) null, r39, r40, r41, r42, r9, r15, true, false, r47, r48, r49, r50, r51, r52));
        r10 = X.0Yt.A06(new X.0eP[]{new X.0eP(4, new X.CTX((java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (kotlin.jvm.internal.DefaultConstructorMarker) null, 0.0d, 0.0d, 0.0f, 1023, false)), new X.0eP(3, new X.CTW((java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (kotlin.jvm.internal.DefaultConstructorMarker) null, 0.0d, 0.0d, 0.0f, 1023, false)), new X.0eP(2, new X.CTV((java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (kotlin.jvm.internal.DefaultConstructorMarker) null, 0.0d, 0.0d, 0.0f, 2047, false, false))});
        X.0qQ.A0B(r10, 2);
        r5 = new X.T8Y(new X.C57369IZa(r1), r27);
        r2 = r12.A01;
        r2.add(r5);
        r2.add(r13);
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0d03, code lost:
        if (r10.containsKey(2) == false) goto L_0x0dab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0d05, code lost:
        r5 = r10.get(2);
        X.0qQ.A0C(r5, "null cannot be cast to non-null type com.instagram.watchandbrowse.model.FullScreenDestinationSheetState");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0d16, code lost:
        if (((X.CTV) r5).A02 != 1.0f) goto L_0x0dab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0d18, code lost:
        r10.get(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0d1f, code lost:
        if ((r26 instanceof android.app.Activity) == false) goto L_0x0e41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0d21, code lost:
        r26 = (android.app.Activity) r26;
        r2 = new X.C331127Pr(r4);
        r2.A0a = java.lang.Boolean.valueOf(r11);
        r2.A1H = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0d38, code lost:
        if (r10.containsKey(2) == false) goto L_0x0d43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0d3a, code lost:
        X.0qQ.A0C(r10.get(2), "null cannot be cast to non-null type com.instagram.watchandbrowse.model.FullScreenDestinationSheetState");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0d43, code lost:
        r2.A1A = false;
        r4 = (X.CU4) r10.get(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0d4b, code lost:
        if (r4 == null) goto L_0x0d9d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0d4d, code lost:
        r4 = r4.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0d51, code lost:
        r2.A03 = r4;
        r10.get(3);
        r2.A1O = false;
        r2.A0q = true;
        r2.A0k = false;
        r2.A1F = true;
        r2.A1Q = true;
        r2.A1P = true;
        r2.A1I = true;
        r2.A11 = true;
        r2.A1R = true;
        r5 = r12.A00;
        r2.A0U = r5;
        r2.A0s = r10.containsKey(4);
        r4 = (X.CU4) r10.get(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0d78, code lost:
        if (r4 == null) goto L_0x0d9b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0d7a, code lost:
        r4 = r4.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0d7e, code lost:
        r2.A01 = r4;
        r2.A0X = r5;
        r2.A00().A02(r26, r13);
        r4 = r12.A02.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0d95, code lost:
        if (r4.hasNext() == false) goto L_0x0e41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0d97, code lost:
        r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0d9b, code lost:
        r4 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0d9d, code lost:
        r4 = new X.CTW((java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (kotlin.jvm.internal.DefaultConstructorMarker) null, 0.0d, 0.0d, 0.0f, 1023, false).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0dab, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0dae, code lost:
        r7 = X.2EG.A2S;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0db2, code lost:
        r10 = true;
        r9 = X.SUD.A01(r2, r5, r27, r14);
        r9.A0z = true;
        r9.A0Z = true;
        r9.A0F = new X.IZX(r8);
        r9.A0J = r27;
        r9.A0G = new X.C57369IZa(r1);
        r9.A18 = true;
        r8 = r11.A0H;
        r9.A0k = r8;
        r9.A01 = r11.A03;
        r9.A0c = false;
        r9.A0y = r11.A0L;
        r9.A11 = true;
        r9.A0g = r12;
        r9.A03 = r6;
        r9.A12 = true;
        r9.A13 = true;
        r9.A15 = true;
        r9.A1B = true;
        r9.A0q = true;
        r5 = r11.A0I;
        r4 = X.RIg.A04;
        r9.A0s = r5;
        r9.A09 = r4;
        r9.A0x = r11.A0K;
        r12 = r11.A0C;
        r9.A0i = r12;
        r9.A0e = r11.A0G;
        r9.A0I = new X.C57391IZw(r11, r2, r1);
        r9.A16 = r12;
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0e0f, code lost:
        if (r11.A07 != X.AnonymousClass05K.A01) goto L_0x0e12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0e11, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0e12, code lost:
        r9.A1A = r2;
        r9.A0K = r7;
        r9.A17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0e1b, code lost:
        if (r11.A0F == false) goto L_0x0e2f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0e1d, code lost:
        r9.A1F = new int[]{com.instagram.android.R.anim.fragment_slide_left_enter, com.instagram.android.R.anim.fragment_slide_left_exit, com.instagram.android.R.anim.fragment_slide_right_enter, com.instagram.android.R.anim.fragment_slide_right_exit};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0e2f, code lost:
        if (r12 == false) goto L_0x0e3e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0e31, code lost:
        if (r8 == false) goto L_0x0e3b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0e33, code lost:
        r9.A04 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0e37, code lost:
        r9.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0e3b, code lost:
        r9.A04 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0e3e, code lost:
        r9.A04 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0e41, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0e42, code lost:
        r1.A03 = r10;
        r1.A0G.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0e7a, code lost:
        if (r12 == null) goto L_0x0b69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0f01, code lost:
        if (X.182.A06(X.0Tu.A06, r9.A0a, 2342161158179723198L) == false) goto L_0x0f03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:0x10f3, code lost:
        if (r14.A0B != true) goto L_0x10f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:655:0x10f7, code lost:
        if (r14 != null) goto L_0x10f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:656:0x10f9, code lost:
        r20 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:657:0x10fd, code lost:
        if (r14.A0F == true) goto L_0x1101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:658:0x10ff, code lost:
        r20 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:659:0x1101, code lost:
        X.0qQ.A0B(r15, 0);
        X.0qQ.A0B(r4, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:0x1108, code lost:
        if (r24 != null) goto L_0x1148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:661:0x110a, code lost:
        X.0KC.A0D("WatchAndBrowseUtil", "iabHeightRatio is null");
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:662:0x1112, code lost:
        r9.A0L = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:663:0x1114, code lost:
        if (r1 == false) goto L_0x0f03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:0x1116, code lost:
        r25 = r62.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:0x111a, code lost:
        if (r25 == null) goto L_0x11bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x111c, code lost:
        r29 = X.2EG.A2R.toString();
        r2 = new X.C271794jb(r4, r7, r10.A06());
        r1 = r8.A00;
        r27 = java.lang.Float.valueOf(-1.0f);
        X.C233822wX.A0L(r4, r2, r25, r61, r27, r27, r29, "webclick", r31, r1, X.1sx.A0A(r6, r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:667:0x1148, code lost:
        r25 = new X.SUL(r15, r4, X.2EG.A4C, r31, false);
        r25.A0z = true;
        r25.A0c = false;
        r25.A03 = r24.floatValue();
        r25.A0G = r13;
        r25.A0y = true;
        r25.A0J = r12;
        r25.A12 = true;
        r25.A0D(r33);
        r25.A0B(r32);
        r25.A0C(r11);
        r25.A0F(r5);
        r25.A18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:668:0x117d, code lost:
        if (r20 == false) goto L_0x1191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:669:0x117f, code lost:
        r25.A1F = new int[]{com.instagram.android.R.anim.fragment_slide_left_enter, com.instagram.android.R.anim.fragment_slide_left_exit, com.instagram.android.R.anim.fragment_slide_right_enter, com.instagram.android.R.anim.fragment_slide_right_exit};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:670:0x1191, code lost:
        if (r23 == false) goto L_0x119a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:671:0x1193, code lost:
        r25.A0F = new X.PQZ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:672:0x119a, code lost:
        r25.A0A();
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x11c2, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x02ea */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02ee A[Catch:{ 3cy | IkX -> 0x02fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0284  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r66, android.os.Bundle r67) {
        /*
            r65 = this;
            r3 = 0
            r64 = r66
            r0 = r64
            X.0qQ.A0B(r0, r3)
            r0 = r65
            r17 = r67
            r2 = r64
            r1 = r17
            super.onViewCreated(r2, r1)
            android.os.Bundle r2 = r0.requireArguments()
            java.lang.String r1 = "ClipsConstants.ARGS_IGSHID"
            java.lang.String r11 = r2.getString(r1)
            if (r11 == 0) goto L_0x0061
            X.I4M r5 = r0.A0i
            if (r5 == 0) goto L_0x0061
            com.instagram.common.session.UserSession r7 = r5.A0C
            X.0Tu r4 = X.0Tu.A05
            r1 = 36322199119865852(0x810ad9000027fc, double:3.033643208935001E-306)
            boolean r1 = X.182.A06(r4, r7, r1)
            if (r1 == 0) goto L_0x0061
            boolean r1 = r5.A04
            if (r1 != 0) goto L_0x0061
            X.H4A r6 = new X.H4A
            r6.<init>(r5)
            r5 = 0
            r1 = -2
            X.1NY r4 = new X.1NY
            r4.<init>(r7, r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            r4.A08(r1)
            java.lang.String r1 = "discover/external_link_sharing_user_info/"
            r4.A0A(r1)
            java.lang.String r1 = "igshid"
            r4.A9m(r1, r11)
            java.lang.Class<X.CDn> r2 = X.C43795CDn.class
            java.lang.Class<X.CyJ> r1 = X.C45545CyJ.class
            r4.A0O(r5, r2, r1, r3)
            X.1OC r1 = r4.A0M()
            r1.A00 = r6
            X.1ES.A03(r1)
        L_0x0061:
            X.0eM r1 = r0.A0x
            java.lang.Object r9 = r1.getValue()
            X.93a r9 = (X.C3728893a) r9
            java.lang.String r16 = "clipsViewerFragmentViewModel"
            r21 = 0
            if (r9 == 0) goto L_0x00cc
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.GAc r1 = r1.A19
            java.lang.String r5 = r1.getModuleName()
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.93T r1 = r1.A1D
            java.lang.String r10 = r1.A01
            java.lang.String r8 = r1.A00
            X.0qQ.A0B(r5, r3)
            r7 = 1
            X.0qQ.A0B(r10, r7)
            r1 = 2
            X.0qQ.A0B(r8, r1)
            boolean r1 = r9.A00
            if (r1 != 0) goto L_0x00cc
            X.0XK r2 = new X.0XK
            r2.<init>()
            java.lang.String r1 = "analytics_module"
            r2.A00(r1, r5, r7)
            r6 = 42
            r4 = 10
            r1 = 73
            java.lang.String r1 = X.Dbn.A00(r6, r4, r1)
            r2.A00(r1, r10, r7)
            java.lang.String r1 = "chaining_session_id"
            r2.A00(r1, r8, r7)
            X.02m r22 = X.C3728893a.A00(r9)
            r23 = 976032351(0x3a2d125f, float:6.602164E-4)
            r25 = 7
            java.lang.String r1 = "enter_viewer_"
            java.lang.String r26 = X.002.A0R(r1, r5)
            long r28 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r30 = java.util.concurrent.TimeUnit.MILLISECONDS
            r24 = r3
            r27 = r2
            r31 = r3
            r22.markerPoint(r23, r24, r25, r26, r27, r28, r30, r31)
        L_0x00cc:
            com.instagram.common.session.UserSession r8 = A01(r0)
            r20 = 4
            X.9LY r4 = new X.9LY
            r1 = r20
            r4.<init>(r0, r1)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.GIN r1 = r1.A15
            com.instagram.clips.intf.ClipsViewerConfig r7 = A00(r0)
            X.GD2 r2 = new X.GD2
            r5 = r2
            r6 = r0
            r9 = r1
            r10 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.GBn r1 = r1.A1K
            r1.A94(r2)
            r0.A0c = r2
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.GBn r2 = r1.A1K
            X.07Z r1 = r0.getViewLifecycleOwner()
            r2.A00 = r1
            r2 = 2131430323(0x7f0b0bb3, float:1.8482344E38)
            r1 = r64
            android.view.View r4 = r1.requireViewById(r2)
            X.0qQ.A07(r4)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.2el r5 = r1.A0b
            X.3DZ r2 = X.AnonymousClass3DZ.A00(r0)
            X.2eo[] r1 = new X.AnonymousClass2eo[r3]
            r5.A08(r4, r2, r1)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.2el r2 = r1.A0b
            X.0qQ.A0B(r2, r3)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r2)
            X.C245843dZ.A00 = r1
            X.GBj r9 = r0.A0N
            java.lang.String r18 = "clipsViewerViewPager"
            if (r9 == 0) goto L_0x11b6
            X.GBl r1 = r9.A04
            if (r1 != 0) goto L_0x013f
            X.GBl r1 = new X.GBl
            r1.<init>()
            r9.A04 = r1
        L_0x013f:
            androidx.viewpager2.widget.ViewPager2 r4 = (androidx.viewpager2.widget.ViewPager2) r4
            r9.A00 = r4
            X.GD6 r13 = r9.A09
            androidx.recyclerview.widget.RecyclerView r5 = X.C52012GBj.A03(r9)
            X.GBY r8 = r13.A0B
            X.GBQ r1 = r8.A06
            android.app.Activity r4 = r8.A01
            X.2ff r2 = X.C226112fe.A0B
            X.2im r1 = r1.A08
            r2.A04(r4, r1, r3)
            if (r5 == 0) goto L_0x016f
            X.3pI r4 = r5.A0D
            java.lang.String r1 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            X.0qQ.A0C(r4, r1)
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
            boolean r1 = r8.A08
            if (r1 == 0) goto L_0x01e7
            X.GBZ r1 = r8.A04
            X.0qQ.A0B(r4, r3)
            r1.A00 = r4
        L_0x016c:
            X.GBY.A01(r8)
        L_0x016f:
            androidx.viewpager2.widget.ViewPager2 r7 = r9.A00
            if (r7 == 0) goto L_0x027e
            X.2Rw r1 = r13.A05()
            r7.setAdapter(r1)
            r6 = 1
            r7.setOrientation(r6)
            X.GBl r1 = r9.A04
            if (r1 == 0) goto L_0x0259
            r7.A05(r1)
            android.content.Context r2 = r7.getContext()
            X.0qQ.A07(r2)
            r1 = 0
            float r1 = X.0nA.A00(r2, r1)
            int r2 = (int) r1
            if (r2 >= r3) goto L_0x0195
            r2 = 0
        L_0x0195:
            X.Tp7 r1 = new X.Tp7
            r1.<init>(r2)
            r7.setPageTransformer(r1)
            com.instagram.common.session.UserSession r10 = r9.A08
            X.0Tu r5 = X.0Tu.A05
            r1 = 36313042249778797(0x8102850003066d, double:3.027852367420191E-306)
            boolean r1 = X.182.A06(r5, r10, r1)
            if (r1 != 0) goto L_0x01b0
            boolean r1 = r9.A0C
            if (r1 == 0) goto L_0x01b3
        L_0x01b0:
            r7.setOffscreenPageLimit(r6)
        L_0x01b3:
            androidx.recyclerview.widget.RecyclerView r4 = X.C52012GBj.A03(r9)
            if (r4 == 0) goto L_0x027e
            X.0qQ.A0B(r10, r3)
            r1 = 36317693699167689(0x8106c0000015c9, double:3.0307939627436094E-306)
            boolean r1 = X.182.A06(r5, r10, r1)
            if (r1 == 0) goto L_0x027e
            X.Mei r1 = r9.A03
            if (r1 != 0) goto L_0x01fb
            r1 = 36599168676007368(0x8206c000020dc8, double:3.20879987150578E-306)
            long r1 = X.182.A01(r5, r10, r1)
            float r12 = (float) r1
            r1 = 36599168675941831(0x8206c000010dc7, double:3.2087998714643343E-306)
            long r1 = X.182.A01(r5, r10, r1)
            int r5 = (int) r1
            X.Mei r1 = new X.Mei
            r1.<init>(r4, r7, r12, r5)
            r9.A03 = r1
            goto L_0x01fb
        L_0x01e7:
            X.GBa r2 = r8.A05
            r1 = 1
            r2.A01 = r1
            X.GD3 r1 = new X.GD3
            r1.<init>(r4, r8)
            X.2We r1 = X.GBY.A00(r1, r8)
            r2.A00 = r1
            r8.A00 = r1
            goto L_0x016c
        L_0x01fb:
            java.lang.Class<androidx.viewpager2.widget.ViewPager2> r5 = androidx.viewpager2.widget.ViewPager2.class
            java.lang.String r2 = "mPagerSnapHelper"
            java.lang.reflect.Field r10 = r5.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0250 }
            java.lang.Class<X.2lf> r5 = X.C228432lf.class
            java.lang.String r2 = "mScrollListener"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0250 }
            r10.setAccessible(r6)     // Catch:{ SecurityException -> 0x0247 }
            r5.setAccessible(r6)     // Catch:{ SecurityException -> 0x0247 }
            java.lang.Object r6 = r10.get(r7)     // Catch:{ Exception -> 0x023e }
            java.lang.String r2 = "null cannot be cast to non-null type androidx.recyclerview.widget.PagerSnapHelper"
            X.0qQ.A0C(r6, r2)     // Catch:{ Exception -> 0x023e }
            X.2le r6 = (X.C228422le) r6     // Catch:{ Exception -> 0x023e }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ Exception -> 0x023e }
            java.lang.String r2 = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.OnScrollListener"
            X.0qQ.A0C(r5, r2)     // Catch:{ Exception -> 0x023e }
            X.3jg r5 = (X.C249403jg) r5     // Catch:{ Exception -> 0x023e }
            r4.A16(r5)
            r2 = r21
            r4.A0E = r2
            r1.A07(r4)     // Catch:{ IllegalStateException -> 0x0235 }
            r10.set(r7, r1)     // Catch:{ Exception -> 0x0261 }
            goto L_0x027e
        L_0x0235:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "attaching the new instance to recycler view caused an exception: "
            goto L_0x0269
        L_0x023e:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "getting the instance objects caused an exception: "
            goto L_0x0269
        L_0x0247:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "setting the fields to accessible caused an exception: "
            goto L_0x0269
        L_0x0250:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "getting the fields caused an exception: "
            goto L_0x0269
        L_0x0259:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0261:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "setting the new instance caused an exception: "
        L_0x0269:
            r2.append(r1)
            java.lang.String r1 = r4.getMessage()
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            X.0wb r2 = X.C70394O4v.A00
            java.lang.String r1 = "ClipsViewPagerHelper"
            r2.Ew0(r1, r4)
        L_0x027e:
            androidx.recyclerview.widget.RecyclerView r2 = X.C52012GBj.A03(r9)
            if (r2 == 0) goto L_0x02fe
            X.2We r1 = r8.A00
            if (r1 == 0) goto L_0x028b
            r1.A0e(r2)
        L_0x028b:
            boolean r1 = r8.A08
            if (r1 != 0) goto L_0x02fe
            X.GBg r1 = r8.A03
            java.util.List r1 = r1.A0I()
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x02fe
            X.GBa r2 = r8.A05
            boolean r1 = r2.A0F
            X.GBg r6 = r2.A07
            if (r1 == 0) goto L_0x02f7
            int r1 = r6.A0A()
            X.2HY r1 = X.C229632nm.A0C(r3, r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r8 = r1.iterator()
        L_0x02b4:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x02e3
            r1 = r8
            X.0sh r1 = (X.0sh) r1
            int r4 = r1.A00()
            X.4bN r7 = r6.A0E(r4)
            X.9OA r1 = r2.A08
            java.lang.String r7 = r7.getId()
            android.util.LruCache r1 = r1.A01
            java.lang.Object r1 = r1.get(r7)
            X.5nP r1 = (X.C295015nP) r1
            if (r1 == 0) goto L_0x02db
            X.7hq r1 = r1.A02()
            if (r1 != 0) goto L_0x02df
        L_0x02db:
            X.7hp r1 = X.C52003GBa.A00(r2, r4)
        L_0x02df:
            r5.add(r1)
            goto L_0x02b4
        L_0x02e3:
            X.2We r1 = r2.A00     // Catch:{ 3cy | IkX -> 0x02ea }
            if (r1 == 0) goto L_0x02ea
            r1.A0b(r3, r5)     // Catch:{ 3cy | IkX -> 0x02ea }
        L_0x02ea:
            X.2We r1 = r2.A00     // Catch:{ 3cy | IkX -> 0x02fe }
            if (r1 == 0) goto L_0x02fe
            r1.A0h(r2)     // Catch:{ 3cy | IkX -> 0x02fe }
            goto L_0x02fe
        L_0x02f2:
            X.0qQ.A0F(r16)
            goto L_0x03c9
        L_0x02f7:
            int r1 = r6.A0A()
            r2.DKr(r3, r1)
        L_0x02fe:
            X.2Rw r1 = r13.A05()
            r1.registerAdapterDataObserver(r9)
            androidx.recyclerview.widget.RecyclerView r2 = X.C52012GBj.A03(r9)
            if (r2 == 0) goto L_0x0320
            X.GBk r1 = r9.A0A
            r2.A15(r1)
            X.GD7 r1 = new X.GD7
            r1.<init>(r9)
            r2.addOnLayoutChangeListener(r1)
            boolean r1 = r9.A0B
            if (r1 == 0) goto L_0x0320
            r1 = 2
            r2.setOverScrollMode(r1)
        L_0x0320:
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.GE0 r1 = r1.A1B
            r9.A0J(r1)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.GE1 r1 = r1.A1C
            r9.A0J(r1)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.GE2 r1 = r1.A12
            r9.A0J(r1)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.GE3 r1 = r1.A18
            r9.A0J(r1)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.GCx r1 = r1.A0o
            r9.A0J(r1)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.GE4 r1 = r1.A1J
            r9.A0J(r1)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.2lJ r2 = r1.A0f
            if (r2 == 0) goto L_0x0367
            androidx.recyclerview.widget.RecyclerView r1 = X.C52012GBj.A03(r9)
            if (r1 == 0) goto L_0x0367
            r1.A15(r2)
        L_0x0367:
            X.GMC r1 = r0.A05
            if (r1 == 0) goto L_0x036e
            r9.A0J(r1)
        L_0x036e:
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.GME r1 = r1.A0H
            if (r1 == 0) goto L_0x0379
            r9.A0J(r1)
        L_0x0379:
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.IMq r1 = r1.A08
            if (r1 == 0) goto L_0x0384
            r9.A0J(r1)
        L_0x0384:
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.GE5 r1 = r1.A0u
            if (r1 == 0) goto L_0x038f
            r9.A0J(r1)
        L_0x038f:
            X.0eM r1 = r0.A0u
            java.lang.Object r1 = r1.getValue()
            if (r1 == 0) goto L_0x03a2
            X.0eM r1 = r0.A0v
            java.lang.Object r1 = r1.getValue()
            X.32U r1 = (X.AnonymousClass32U) r1
            r9.A0J(r1)
        L_0x03a2:
            com.instagram.common.session.UserSession r4 = A01(r0)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.GAc r2 = r1.A19
            X.GCs r1 = new X.GCs
            r1.<init>(r4, r2)
            X.3Ds r4 = X.C238863Ds.SNACKS
            X.0eM r1 = r1.A01
            java.lang.Object r2 = r1.getValue()
            X.3Dp r2 = (X.C238833Dp) r2
            r1 = r64
            r2.A05(r1, r4)
            X.GC7 r2 = r0.A0I
            if (r2 != 0) goto L_0x03ce
            java.lang.String r19 = "swipeGestureController"
        L_0x03c6:
            X.0qQ.A0F(r19)
        L_0x03c9:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03ce:
            r4 = 2131433532(0x7f0b183c, float:1.8488852E38)
            android.view.View r7 = r1.requireViewById(r4)
            X.0qQ.A07(r7)
            com.instagram.ui.gesture.GestureManagerFrameLayout r7 = (com.instagram.ui.gesture.GestureManagerFrameLayout) r7
            X.0qQ.A0B(r7, r3)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            X.GC8 r1 = r2.A08
            X.0qQ.A0B(r1, r3)
            r6.add(r1)
            com.instagram.clips.intf.ClipsViewerConfig r1 = r2.A05
            boolean r1 = r1.A1X
            if (r1 == 0) goto L_0x0401
            android.content.Context r4 = r2.A02
            X.4mY r2 = r2.A09
            X.6nC r1 = new X.6nC
            r1.<init>(r4, r2)
            r6.add(r1)
        L_0x0401:
            X.Tp8 r1 = new X.Tp8
            r1.<init>(r7, r6, r5)
            com.instagram.common.session.UserSession r5 = A01(r0)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.GAc r4 = r1.A19
            X.GD6 r1 = r0.A0C
            java.lang.String r19 = "viewerAdapter"
            if (r1 == 0) goto L_0x03c6
            X.GD8 r2 = new X.GD8
            r2.<init>(r5, r4, r1)
            r0.A0j = r2
            X.GBj r1 = r0.A0N
            if (r1 == 0) goto L_0x11b6
            r1.A0J(r2)
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            boolean r1 = r1.A1o
            if (r1 == 0) goto L_0x044e
            com.instagram.common.session.UserSession r6 = A01(r0)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            java.lang.String r9 = r1.A1O
            X.GD6 r7 = r0.A0C
            if (r7 == 0) goto L_0x03c6
            X.GBj r8 = r0.A0N
            if (r8 == 0) goto L_0x11b6
            com.instagram.clips.intf.ClipsViewerConfig r5 = A00(r0)
            X.IMp r4 = new X.IMp
            r4.<init>(r5, r6, r7, r8, r9)
            X.GBj r1 = r0.A0N
            if (r1 == 0) goto L_0x11b6
            r1.A0J(r4)
        L_0x044e:
            int r1 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            com.instagram.common.session.UserSession r5 = A01(r0)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.GAc r4 = r1.A19
            r1 = 23594667(0x16806ab, float:4.2616454E-38)
            X.2nK r2 = new X.2nK
            r2.<init>(r6, r4, r5, r1)
            X.GBj r1 = r0.A0N
            if (r1 == 0) goto L_0x11b6
            androidx.recyclerview.widget.RecyclerView r1 = X.C52012GBj.A03(r1)
            if (r1 == 0) goto L_0x0473
            r1.A15(r2)
        L_0x0473:
            r0.registerLifecycleListener(r2)
            r0.A0Y = r2
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.GBn r2 = r1.A1K
            X.GCx r1 = r1.A0o
            r2.A94(r1)
            X.GBj r4 = r0.A0N
            if (r67 == 0) goto L_0x0576
            if (r4 == 0) goto L_0x11b6
            java.lang.String r2 = "ClipsViewerFragment.SAVED_VIEW_PAGER_OFFSET_STATE"
            r1 = r17
            int r1 = r1.getInt(r2, r3)
            r4.A0I(r1, r3)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = "ClipsViewerFragment.SAVED_CLIPS_TAB_LAST_EXIT_TIME_MS"
            r4 = r17
            long r1 = r4.getLong(r5, r1)
            r0.A00 = r1
        L_0x04a2:
            X.GD9 r1 = r0.A0O()
            X.4bN r6 = r1.A02()
            if (r6 == 0) goto L_0x04c3
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            java.lang.String r5 = r1.A1O
            if (r5 == 0) goto L_0x04c3
            X.2nF r4 = r1.A0X
            X.GD9 r1 = r0.A0O()
            int r2 = r1.A01()
            r1 = r21
            r4.A06(r6, r1, r5, r2)
        L_0x04c3:
            r0.A07()
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.GAc r9 = r1.A19
            com.instagram.common.session.UserSession r24 = A01(r0)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.93T r8 = r1.A1D
            X.Hlh r7 = r1.A1E
            X.2wV r6 = r0.A0Z
            X.GD6 r1 = r0.A0C
            if (r1 == 0) goto L_0x03c6
            boolean r5 = r1.A0F
            com.instagram.clips.intf.ClipsViewerConfig r23 = A00(r0)
            X.GDB r4 = r0.A0A
            r1 = 12
            X.9LQ r2 = new X.9LQ
            r2.<init>(r0, r1)
            X.GDD r1 = new X.GDD
            r22 = r1
            r25 = r9
            r26 = r6
            r27 = r8
            r28 = r0
            r29 = r0
            r30 = r0
            r31 = r0
            r32 = r4
            r33 = r7
            r34 = r2
            r35 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.GBj r2 = r0.A0N
            if (r2 == 0) goto L_0x11b6
            r2.A0J(r1)
            X.Hrp r6 = r0.A0J
            java.lang.String r8 = "overlayFragmentController"
            if (r6 == 0) goto L_0x11b1
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            com.instagram.common.session.UserSession r4 = A01(r0)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.HqC r2 = r1.A0n
            r1 = 2
            X.0qQ.A0B(r4, r1)
            r6.A01 = r5
            r6.A05 = r0
            r6.A02 = r4
            r6.A06 = r2
            r2 = 2131430252(0x7f0b0b6c, float:1.84822E38)
            r1 = r64
            android.view.View r2 = r1.requireViewById(r2)
            r1 = r2
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r1
            r63 = r1
            r0.A01 = r1
            X.0qQ.A07(r2)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.GCA r7 = r1.A0z
            X.GBj r6 = r0.A0N
            if (r6 == 0) goto L_0x11b6
            X.Hrp r5 = r0.A0J
            if (r5 == 0) goto L_0x11b1
            X.Hrq r4 = r1.A14
            r2 = 1
            r1 = r63
            X.0qQ.A0B(r1, r2)
            r1 = 3
            X.0qQ.A0B(r4, r1)
            java.util.List r1 = r7.A00
            java.util.Iterator r7 = r1.iterator()
        L_0x0564:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0596
            java.lang.Object r2 = r7.next()
            X.GCw r2 = (X.C52050GCw) r2
            r1 = r63
            r2.A0B(r1, r4, r5, r6)
            goto L_0x0564
        L_0x0576:
            if (r4 == 0) goto L_0x11b6
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            int r1 = r1.A00
            r4.A0I(r1, r3)
            X.GD9 r1 = r0.A0O()
            X.4bN r1 = r1.A02()
            if (r1 == 0) goto L_0x04a2
            X.GMC r2 = r0.A05
            if (r2 == 0) goto L_0x04a2
            X.1Xj r1 = r1.A02
            r2.A02(r1)
            goto L_0x04a2
        L_0x0596:
            X.GBE r5 = r0.A09
            if (r5 == 0) goto L_0x02f2
            X.0sa r1 = r5.A20
            java.lang.Object r1 = r1.invoke()
            X.GD6 r1 = (X.GD6) r1
            X.GDN r4 = new X.GDN
            r4.<init>(r5, r1)
            com.instagram.common.session.UserSession r1 = r5.A0a
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Class<X.36g> r1 = X.C2370836g.class
            r2.A01(r4, r1)
            r5.A04 = r4
            X.GBE r5 = r0.A09
            if (r5 == 0) goto L_0x02f2
            X.GDO r4 = new X.GDO
            r4.<init>(r5)
            com.instagram.common.session.UserSession r1 = r5.A0a
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Class<X.WQA> r1 = X.WQA.class
            r2.A01(r4, r1)
            r5.A03 = r4
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            boolean r1 = r1.A1g
            if (r1 == 0) goto L_0x062b
            com.instagram.common.session.UserSession r6 = A01(r0)
            X.HqO r5 = new X.HqO
            r2 = r64
            r1 = r63
            r5.<init>(r2, r1, r0)
            X.Hlj r4 = new X.Hlj
            r4.<init>(r6, r5)
            if (r11 == 0) goto L_0x062b
            com.instagram.common.session.UserSession r1 = r4.A00
            X.H4B r2 = new X.H4B
            r2.<init>(r4)
            X.1vn r1 = X.1vm.A01(r1)
            X.2IS r6 = new X.2IS
            r6.<init>()
            X.2IS r5 = new X.2IS
            r5.<init>()
            java.lang.String r4 = "shid"
            r6.A04(r4, r11)
            X.2IY r4 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r23 = X.AnonymousClass1vS.A00()
            java.util.Map r25 = r6.getParamsCopy()
            java.util.Map r26 = r5.getParamsCopy()
            java.lang.Class<X.BYq> r27 = X.C42299BYq.class
            java.util.ArrayList r33 = new java.util.ArrayList
            r33.<init>()
            java.lang.String r24 = "ClipsExternalSenderInfoQuery"
            java.lang.String r32 = "xdt_get_relationship_for_shid"
            com.facebook.pando.PandoGraphQLRequest r4 = new com.facebook.pando.PandoGraphQLRequest
            r22 = r4
            r28 = r3
            r29 = r21
            r30 = r3
            r31 = r21
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r1.A06(r4, r2)
        L_0x062b:
            X.GDP r4 = new X.GDP
            r4.<init>(r0)
            com.instagram.common.session.UserSession r1 = A01(r0)
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Class<X.36f> r1 = X.C2370736f.class
            r2.A01(r4, r1)
            r0.A0U = r4
            X.GDQ r4 = new X.GDQ
            r4.<init>(r0)
            com.instagram.common.session.UserSession r1 = A01(r0)
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Class<X.DGm> r1 = X.C45957DGm.class
            r2.A01(r4, r1)
            r0.A0T = r4
            r64.requestFocus()
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            com.instagram.clips.intf.ClipsViewerSource r2 = r1.A0J
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.BLEND
            if (r2 == r1) goto L_0x066a
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            boolean r1 = r1.A0U()
            if (r1 != 0) goto L_0x0813
        L_0x066a:
            X.GD6 r1 = r0.A0C
            r5 = 0
            if (r1 != 0) goto L_0x0679
            r16 = r19
        L_0x0671:
            X.0qQ.A0F(r16)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0679:
            X.GBg r1 = r1.A0A
            int r1 = r1.A0A()
            if (r1 <= 0) goto L_0x0948
            X.GD9 r1 = r0.A0O()
            X.4bN r2 = r1.A02()
        L_0x0689:
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0671
            X.GAc r11 = r1.A19
            com.instagram.common.session.UserSession r8 = A01(r0)
            if (r2 == 0) goto L_0x0697
            X.1Xj r5 = r2.A02
        L_0x0697:
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0671
            X.93T r10 = r1.A1D
            X.Hlh r1 = r1.A1E
            java.lang.String r4 = r1.A00
            if (r2 == 0) goto L_0x0945
            X.GD9 r1 = r0.A0O()
            int r12 = r1.A01()
        L_0x06ab:
            com.instagram.clips.intf.ClipsViewerConfig r7 = A00(r0)
            X.0qQ.A0B(r11, r3)
            r1 = 1
            X.0qQ.A0B(r8, r1)
            r1 = 3
            X.0qQ.A0B(r10, r1)
            r1 = 6
            X.0qQ.A0B(r7, r1)
            X.1QJ r1 = X.AnonymousClass1QI.A00
            X.1QM r1 = r1.A02
            java.lang.String r9 = r1.A00
            if (r9 == 0) goto L_0x0813
            X.0wc r6 = X.AnonymousClass0kN.A01(r11, r8)
            java.lang.String r2 = "instagram_clips_viewer_entry"
            X.0kJ r1 = r6.A00
            X.0Aj r6 = r6.A00(r1, r2)
            java.lang.String r2 = r11.getModuleName()
            java.lang.String r1 = "containermodule"
            r6.AAJ(r1, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            java.lang.String r1 = "media_index"
            r6.A8k(r1, r2)
            java.lang.String r2 = r10.CFD()
            java.lang.String r1 = "viewer_session_id"
            r6.AAJ(r1, r2)
            java.lang.String r1 = "nav_chain"
            r6.AAJ(r1, r9)
            java.lang.String r2 = r10.AmZ()
            java.lang.String r1 = "chaining_session_id"
            r6.AAJ(r1, r2)
            if (r5 == 0) goto L_0x092d
            java.lang.String r2 = r5.A30()
            if (r2 == 0) goto L_0x11cb
            r1 = 10
            java.lang.Long r2 = X.00y.A0n(r1, r2)
            java.lang.String r1 = "media_id"
            r6.A9F(r1, r2)
            X.1Xy r1 = r5.A0C
            java.lang.String r2 = r1.getLoggingInfoToken()
            java.lang.String r1 = "ranking_info_token"
            r6.AAJ(r1, r2)
            X.1Xy r1 = r5.A0C
            java.lang.String r2 = r1.getMezqlToken()
            java.lang.String r1 = "mezql_token"
            r6.AAJ(r1, r2)
        L_0x0724:
            X.0Tu r9 = X.0Tu.A05
            r1 = 36323934286655099(0x810c6d00002e7b, double:3.0347405353994763E-306)
            boolean r1 = X.182.A06(r9, r8, r1)
            if (r1 == 0) goto L_0x074a
            if (r5 == 0) goto L_0x0929
            X.1Xy r1 = r5.A0C
            com.instagram.user.model.User r1 = r1.CCd()
            if (r1 == 0) goto L_0x0929
            java.lang.String r2 = r1.getId()
            r1 = 10
            java.lang.Long r2 = X.00y.A0n(r1, r2)
        L_0x0745:
            java.lang.String r1 = "media_author_id"
            r6.A9F(r1, r2)
        L_0x074a:
            java.lang.String r2 = r7.A18
            if (r2 == 0) goto L_0x0753
            java.lang.String r1 = "search_session_id"
            r6.AAJ(r1, r2)
        L_0x0753:
            java.lang.String r2 = r7.A14
            if (r2 == 0) goto L_0x075c
            java.lang.String r1 = "rank_token"
            r6.AAJ(r1, r2)
        L_0x075c:
            java.lang.String r2 = r7.A13
            if (r2 == 0) goto L_0x0765
            java.lang.String r1 = "query_text"
            r6.AAJ(r1, r2)
        L_0x0765:
            java.lang.String r2 = r7.A0u
            if (r2 == 0) goto L_0x076e
            java.lang.String r1 = "tray_session_id"
            r6.AAJ(r1, r2)
        L_0x076e:
            java.lang.Integer r1 = r7.A0b
            if (r1 == 0) goto L_0x0782
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            if (r2 == 0) goto L_0x0782
            java.lang.String r1 = "cpc_type"
            r6.A9F(r1, r2)
        L_0x0782:
            X.5OD r2 = r7.A0B
            if (r2 == 0) goto L_0x078b
            java.lang.String r1 = "viewer_entry_action_source"
            r6.A8M(r2, r1)
        L_0x078b:
            java.lang.String r2 = r7.A0x
            if (r2 == 0) goto L_0x079c
            r1 = 10
            java.lang.Long r2 = X.00y.A0n(r1, r2)
            if (r2 == 0) goto L_0x079c
            java.lang.String r1 = "moment_id"
            r6.A9F(r1, r2)
        L_0x079c:
            com.instagram.clips.intf.ClipsViewerDirectData r1 = r7.A0I
            if (r1 == 0) goto L_0x07a9
            java.lang.String r2 = r1.A01
            if (r2 == 0) goto L_0x07a9
            java.lang.String r1 = "message_id"
            r6.AAJ(r1, r2)
        L_0x07a9:
            X.6zg r1 = X.C324636ze.A00(r8)
            com.instagram.search.common.analytics.SearchContext r9 = r1.A00
            if (r9 == 0) goto L_0x0925
            X.B8p r8 = new X.B8p
            r8.<init>()
            java.lang.String r2 = r9.A05
            java.lang.String r1 = "search_session_id"
            r8.A06(r1, r2)
            java.lang.String r2 = r9.A03
            java.lang.String r1 = "rank_token"
            r8.A06(r1, r2)
            java.lang.String r2 = r9.A02
            java.lang.String r1 = "query_text"
            r8.A06(r1, r2)
            java.lang.String r2 = r9.A06
            java.lang.String r1 = "serp_session_id"
            r8.A06(r1, r2)
            java.lang.String r2 = r9.A00
            java.lang.String r1 = "click_id"
            r8.A06(r1, r2)
        L_0x07d9:
            java.lang.String r1 = "search_context"
            r6.AAK(r8, r1)
            if (r5 == 0) goto L_0x0921
            java.lang.String r1 = r5.getId()
            if (r1 == 0) goto L_0x0921
            r4 = r1
        L_0x07e7:
            java.lang.Long r1 = X.C271444ir.A01(r4)
            if (r1 == 0) goto L_0x07fd
            long r4 = r1.longValue()
            double r1 = (double) r4
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
            if (r2 == 0) goto L_0x07fd
            java.lang.String r1 = "vpv_duration"
            r6.A8D(r1, r2)
        L_0x07fd:
            java.lang.String r1 = r7.A0m
            if (r1 == 0) goto L_0x0810
            long r1 = java.lang.Long.parseLong(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            if (r2 == 0) goto L_0x0810
            java.lang.String r1 = "blend_id"
            r6.A9F(r1, r2)
        L_0x0810:
            r6.Cgf()
        L_0x0813:
            X.0lV r2 = r0.A1H
            X.15Y r1 = X.15Y.A03
            X.14i.A03(r1, r2)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.0eM r1 = r1.A1Q
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0864
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.0eM r1 = r1.A1e
            java.lang.Object r4 = r1.getValue()
            X.HQU r4 = (X.HQU) r4
            X.0xi r2 = X.0tS.A4E
            android.content.Context r1 = r64.getContext()
            X.0qQ.A07(r1)
            X.0tS r1 = r2.A01(r1)
            boolean r1 = r1.A0T()
            if (r1 == 0) goto L_0x0864
            X.VvI r4 = r4.A00
            if (r4 == 0) goto L_0x0864
            r2 = 2131430243(0x7f0b0b63, float:1.8482181E38)
            r1 = r64
            android.view.View r1 = r1.requireViewById(r2)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            android.view.View r1 = r1.inflate()
            X.0qQ.A0A(r1)
            r4.A02(r1)
        L_0x0864:
            X.3E6 r1 = r0.A0X
            java.lang.String r6 = "keyboardHeightChangeDetector"
            if (r1 == 0) goto L_0x11ac
            r1.A9Y(r0)
            com.instagram.common.session.UserSession r5 = A01(r0)
            X.0qQ.A0B(r5, r3)
            X.0Tu r22 = X.0Tu.A05
            r1 = 36323663703715181(0x810c2e00002d6d, double:3.034569417658722E-306)
            r4 = r22
            boolean r1 = X.182.A06(r4, r5, r1)
            if (r1 == 0) goto L_0x088e
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x02f2
            X.GBn r2 = r1.A1K
            X.Ies r1 = r1.A0s
            r2.A94(r1)
        L_0x088e:
            X.GBE r9 = r0.A09
            if (r9 == 0) goto L_0x02f2
            X.3E6 r7 = r0.A0X
            if (r7 == 0) goto L_0x11ac
            X.GCb r1 = r9.A06
            if (r1 == 0) goto L_0x11c3
            r2 = r64
            r1.A00 = r2
            r4 = 2131439572(0x7f0b2fd4, float:1.8501103E38)
            android.view.View r5 = r2.requireViewById(r4)
            android.view.ViewStub r5 = (android.view.ViewStub) r5
            r4 = 2131439569(0x7f0b2fd1, float:1.8501097E38)
            android.view.View r2 = r2.requireViewById(r4)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            com.instagram.common.session.UserSession r6 = r1.A0C
            X.4DU r4 = r1.A0D
            java.lang.String r10 = r4.getModuleName()
            X.0qQ.A0B(r5, r3)
            r4 = 1
            X.0qQ.A0B(r2, r4)
            r4 = 5
            X.0qQ.A0B(r10, r4)
            X.6ib r8 = new X.6ib
            r8.<init>(r2, r7)
            X.Tp9 r4 = new X.Tp9
            r11 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r1.A02 = r4
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            com.instagram.clips.intf.ClipsViewerSource r2 = r1.A0J
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_TAB
            if (r2 != r1) goto L_0x0a0b
            com.instagram.common.session.UserSession r4 = A01(r0)
            X.0qQ.A0B(r4, r3)
            r1 = 16
            X.IwK r2 = new X.IwK
            r2.<init>(r4, r1)
            java.lang.Class<X.GLx> r1 = X.C52281GLx.class
            java.lang.Object r10 = r4.A01(r1, r2)
            X.GLx r10 = (X.C52281GLx) r10
            java.lang.String r9 = r0.getModuleName()
            X.0eM r1 = r0.A12
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            X.0qQ.A0B(r9, r3)
            r8 = 1
            X.0qQ.A0B(r1, r8)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r1.iterator()
        L_0x090c:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x094b
            java.lang.Object r2 = r5.next()
            X.0qQ.A0B(r2, r3)
            X.GJY r1 = X.GJY.A08
            if (r2 == r1) goto L_0x090c
            r4.add(r2)
            goto L_0x090c
        L_0x0921:
            if (r4 == 0) goto L_0x07fd
            goto L_0x07e7
        L_0x0925:
            r8 = r21
            goto L_0x07d9
        L_0x0929:
            r2 = r21
            goto L_0x0745
        L_0x092d:
            X.1Xv r1 = X.1Xj.A0h
            java.lang.String r2 = X.1Xv.A05(r4)
            if (r2 == 0) goto L_0x0942
            r1 = 10
            java.lang.Long r2 = X.00y.A0n(r1, r2)
        L_0x093b:
            java.lang.String r1 = "media_id"
            r6.A9F(r1, r2)
            goto L_0x0724
        L_0x0942:
            r2 = r21
            goto L_0x093b
        L_0x0945:
            r12 = 0
            goto L_0x06ab
        L_0x0948:
            r2 = r5
            goto L_0x0689
        L_0x094b:
            java.util.Iterator r25 = r4.iterator()
        L_0x094f:
            boolean r1 = r25.hasNext()
            if (r1 == 0) goto L_0x0a0b
            java.lang.Object r2 = r25.next()
            X.GJY r2 = (X.GJY) r2
            com.instagram.common.session.UserSession r7 = r10.A00
            X.0qQ.A0B(r2, r3)
            X.0qQ.A0B(r7, r8)
            r6 = 2
            r1 = 3
            int r2 = r2.ordinal()
            if (r2 == r3) goto L_0x094f
            if (r2 == r1) goto L_0x094f
            r1 = r20
            if (r2 == r1) goto L_0x094f
            if (r2 == r8) goto L_0x09e5
            r4 = 36318866225437208(0x8107d100031a18, double:3.0315354730778376E-306)
            r1 = r22
            boolean r1 = X.182.A06(r1, r7, r4)
        L_0x097e:
            if (r1 == 0) goto L_0x094f
            if (r2 == r8) goto L_0x09cd
            if (r2 != r6) goto L_0x094f
            X.HKJ r11 = new X.HKJ
            r2 = r21
            r11.<init>(r7, r2, r2, r9)
            r1 = 4593(0x11f1, float:6.436E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r1)
        L_0x0991:
            java.lang.Integer r2 = r11.Bec(r7)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r2 != r1) goto L_0x094f
            long r23 = java.lang.System.currentTimeMillis()
            long r1 = r11.A00
            java.util.Map r5 = r10.A01
            java.lang.Object r4 = r5.get(r6)
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 == 0) goto L_0x09b4
            long r14 = r4.longValue()
            long r12 = r23 - r14
            int r4 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r4 > 0) goto L_0x09b4
            goto L_0x094f
        L_0x09b4:
            r26 = r11
            r27 = r21
            r28 = r7
            r29 = r9
            r30 = r21
            r31 = r3
            r32 = r3
            r26.AQ0(r27, r28, r29, r30, r31, r32)
            java.lang.Long r1 = java.lang.Long.valueOf(r23)
            r5.put(r6, r1)
            goto L_0x094f
        L_0x09cd:
            X.HKM r11 = new X.HKM
            r26 = r11
            r27 = r7
            r28 = r21
            r29 = r21
            r30 = r9
            r31 = r21
            r26.<init>(r27, r28, r29, r30, r31)
            r1 = 4592(0x11f0, float:6.435E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r1)
            goto L_0x0991
        L_0x09e5:
            java.lang.Boolean r1 = X.C52274GLq.A00(r7)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x09fb
            r4 = 36318518333020377(0x810780000218d9, double:3.0313154645125833E-306)
        L_0x09f4:
            r1 = r22
            boolean r1 = X.182.A06(r1, r7, r4)
            goto L_0x097e
        L_0x09fb:
            java.lang.Boolean r1 = X.GM2.A00(r7)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x094f
            r4 = 36320128945758256(0x8108f700022030, double:3.032334022493435E-306)
            goto L_0x09f4
        L_0x0a0b:
            boolean r1 = r0.A0I()
            if (r1 != 0) goto L_0x0a28
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            java.lang.Integer r1 = r1.A0f
            if (r1 == 0) goto L_0x0a28
            int r1 = r1.intValue()
            android.view.ViewGroup$LayoutParams r2 = r64.getLayoutParams()
            r2.height = r1
            r1 = r64
            r1.setLayoutParams(r2)
        L_0x0a28:
            boolean r1 = r0.A0I()
            if (r1 == 0) goto L_0x0ec4
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0671
            X.0eM r1 = r1.A1g
            java.lang.Object r1 = r1.getValue()
            X.GDS r1 = (X.GDS) r1
            r1.A03 = r3
            android.content.Context r2 = r1.A04
            r26 = r2
            com.instagram.clips.intf.ClipsViewerConfig r8 = r1.A06
            androidx.fragment.app.FragmentActivity r2 = r1.A05
            r23 = r2
            com.instagram.common.session.UserSession r4 = r1.A09
            X.GDU r2 = new X.GDU
            r9 = r2
            r10 = r23
            r11 = r26
            r12 = r64
            r13 = r8
            r14 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            r1.A02 = r2
            X.4bN r5 = r1.A08
            r7 = 0
            if (r5 == 0) goto L_0x0a6f
            X.1Xj r6 = r5.A02
            if (r6 == 0) goto L_0x0a6f
            com.instagram.clips.intf.ClipsViewerSource r2 = r1.A07
            int r9 = r2.ordinal()
            r2 = 43
            if (r9 == r2) goto L_0x0e82
            r2 = 44
            if (r9 == r2) goto L_0x0e82
        L_0x0a6f:
            if (r5 == 0) goto L_0x0e7e
            X.1Xj r2 = r5.A02
        L_0x0a73:
            X.3W1 r10 = r1.A0C
            X.4DU r6 = r1.A0A
            r36 = r6
            X.GDV r9 = new X.GDV
            r27 = r9
            r28 = r23
            r29 = r8
            r30 = r4
            r31 = r2
            r32 = r6
            r33 = r10
            r34 = r7
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)
            r1.A01 = r9
            X.GDW r6 = new X.GDW
            r2 = r23
            r6.<init>(r2, r9)
            r1.A00 = r6
            com.instagram.clips.intf.ClipsWatchAndBrowseData r11 = r8.A0K
            if (r11 == 0) goto L_0x0b69
            if (r5 == 0) goto L_0x0b69
            boolean r2 = r1.A03
            if (r2 != 0) goto L_0x0b69
            X.1Xj r2 = r5.A02
            if (r2 == 0) goto L_0x0b69
            X.4bO r6 = r5.A0G
            boolean r6 = r6.CcK()
            if (r6 == 0) goto L_0x0e76
            X.3OA r12 = r5.A06()
        L_0x0ab3:
            if (r10 == 0) goto L_0x0b69
            X.GJF r6 = r10.A0n
            if (r6 != 0) goto L_0x0b69
            boolean r6 = r11.A0J
            r25 = r6
            if (r6 == 0) goto L_0x0e72
            X.2EG r32 = X.2EG.A2T
        L_0x0ac1:
            X.GlN r9 = r10.A06()
            X.4jb r6 = new X.4jb
            r6.<init>(r4, r12, r9)
            X.Q03 r9 = new X.Q03
            r27 = r9
            r28 = r0
            r29 = r4
            r30 = r6
            r31 = r36
            r27.<init>(r28, r29, r30, r31, r32)
            r9.A0O = r12
            r9.A0J = r2
            int r6 = r10.getPosition()
            r9.A0B = r6
            r9.A0K = r10
            java.lang.String r6 = r1.A0H
            r9.A0h = r6
            X.3kK r6 = r1.A0D
            java.lang.String r6 = r6.getSessionId()
            r9.A0b = r6
            r12 = 36323741013126592(0x810c4000002dc0, double:3.0346183084417985E-306)
            r6 = r22
            boolean r6 = X.182.A06(r6, r4, r12)
            if (r6 == 0) goto L_0x0b19
            r12 = 36318148968781776(0x81072a002f17d0, double:3.0310818770807816E-306)
            r6 = r22
            boolean r6 = X.182.A06(r6, r4, r12)
            if (r6 == 0) goto L_0x0b19
            X.1Xy r6 = r2.A0C
            X.3lZ r6 = r6.getInjected()
            if (r6 == 0) goto L_0x0e6e
            com.instagram.api.schemas.IGAdsIABScreenshotDataDict r6 = r6.BEo()
        L_0x0b17:
            r9.A0G = r6
        L_0x0b19:
            com.instagram.api.schemas.IntentAwareAdsInfoIntf r6 = r5.A00()
            if (r6 == 0) goto L_0x0e51
            r9.A0H = r6
            boolean r6 = r5.A0F()
            if (r6 == 0) goto L_0x0b2f
            java.lang.Integer r5 = r5.A0A()
            if (r5 == 0) goto L_0x0b69
            r9.A0Y = r5
        L_0x0b2f:
            X.0Tu r12 = X.0Tu.A06
            r5 = 36328839139442300(0x8110e300023e7c, double:3.037842384052359E-306)
            boolean r15 = X.182.A06(r12, r4, r5)
            X.1Xy r5 = r2.A0C
            java.lang.String r13 = r5.BDp()
            if (r13 == 0) goto L_0x0b5c
            r5 = 36328839139376763(0x8110e300013e7b, double:3.037842384010913E-306)
            boolean r5 = X.182.A06(r12, r4, r5)
            if (r5 != 0) goto L_0x0e4b
            if (r15 != 0) goto L_0x0e4b
            X.Q02 r5 = new X.Q02
            r5.<init>(r9)
            X.Q04 r5 = r5.A01()
            com.instagram.model.androidlink.AndroidLink r5 = r5.A02
        L_0x0b5a:
            if (r5 != 0) goto L_0x0b71
        L_0x0b5c:
            X.Q02 r5 = new X.Q02
            r5.<init>(r9)
            X.Q04 r5 = r5.A01()
            com.instagram.model.androidlink.AndroidLink r5 = r5.A02
            if (r5 != 0) goto L_0x0b71
        L_0x0b69:
            X.GC7 r2 = r0.A0I
            if (r2 != 0) goto L_0x0e9a
            java.lang.String r16 = "swipeGestureController"
            goto L_0x0671
        L_0x0b71:
            X.1Xy r6 = r2.A0C
            java.lang.String r6 = r6.BDp()
            if (r6 == 0) goto L_0x0b7c
            r14 = 1
            if (r15 != 0) goto L_0x0b7d
        L_0x0b7c:
            r14 = 0
        L_0x0b7d:
            boolean r12 = r11.A0A
            X.GDU r15 = r1.A02
            if (r15 != 0) goto L_0x0b87
            java.lang.String r16 = "clipsViewManipulator"
            goto L_0x0671
        L_0x0b87:
            X.GBn r13 = r1.A0F
            boolean r6 = r11.A0E
            X.Ia6 r24 = new X.Ia6
            r27 = r24
            r28 = r23
            r30 = r2
            r32 = r10
            r33 = r13
            r34 = r15
            r35 = r6
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35)
            float r6 = r11.A04
            if (r7 == 0) goto L_0x0ba5
            r7.A00(r6)
        L_0x0ba5:
            java.lang.String r15 = r5.CGH()
            java.lang.String r13 = "webclick"
            X.SUD.A06(r2, r9, r13, r15)
            boolean r13 = X.C263264Jy.A05(r4, r2)
            if (r13 == 0) goto L_0x0db2
            r6 = 1
            r14 = 2
            r23 = 3
            X.SFY r12 = new X.SFY
            r7 = r36
            r12.<init>(r4, r2, r7)
            if (r25 == 0) goto L_0x0dae
            X.2EG r7 = X.2EG.A2T
        L_0x0bc3:
            int r9 = r10.getPosition()
            int r15 = r10.A03
            java.lang.String r11 = r7.toString()
            r7 = 6
            X.0qQ.A0B(r11, r7)
            r34 = r21
            r32 = r21
            r33 = r21
            r28 = r21
            r29 = r21
            r42 = 0
            java.lang.String r10 = X.C231122qu.A07(r4, r2)
            java.lang.String r35 = r2.A33(r9)
            java.lang.String r40 = r2.getId()
            java.lang.String r39 = r5.BM9()
            java.lang.String r41 = r2.C9L()
            java.lang.String r30 = X.C231122qu.A09(r4, r2)
            com.instagram.user.model.User r7 = r2.A2A(r4)
            r50 = 0
            if (r7 == 0) goto L_0x0c3d
            java.lang.String r34 = r7.getUsername()
            X.4Cl r5 = r7.A03
            java.lang.String r32 = r5.getFbidV2()
            boolean r5 = r7.A2Q()
            if (r5 != 0) goto L_0x0c11
            java.lang.String r33 = r7.getId()
        L_0x0c11:
            com.instagram.common.typedurl.ImageUrl r28 = r7.Bh3()
            if (r35 == 0) goto L_0x0c2b
            boolean r5 = r2.A5D()
            if (r5 == 0) goto L_0x0c2b
            X.1Xj r8 = r2.A1c(r9)
            if (r8 == 0) goto L_0x0c2b
            r5 = r26
            com.instagram.model.mediasize.ExtendedImageUrl r29 = r8.A1n(r5)
            if (r29 != 0) goto L_0x0c31
        L_0x0c2b:
            r5 = r26
            com.instagram.model.mediasize.ExtendedImageUrl r29 = r2.A1n(r5)
        L_0x0c31:
            X.4Cl r5 = r7.A03
            java.lang.Integer r5 = r5.B6v()
            if (r5 == 0) goto L_0x0c3d
            int r42 = r5.intValue()
        L_0x0c3d:
            boolean r47 = X.1sx.A0G(r4, r10)
            boolean r5 = r2.A5n()
            if (r5 != 0) goto L_0x0c4d
            boolean r5 = r2.A5e()
            if (r5 == 0) goto L_0x0c4f
        L_0x0c4d:
            r50 = 1
        L_0x0c4f:
            boolean r49 = r2.A5o()
            boolean r51 = r2.A6E()
            boolean r48 = r2.A5l()
            boolean r52 = r2.A6G()
            X.Uu6 r13 = new X.Uu6
            r13.<init>()
            r27 = r4
            r31 = r10
            r36 = r11
            r37 = r21
            r38 = r21
            r43 = r9
            r44 = r15
            r45 = r6
            r46 = r3
            android.os.Bundle r2 = X.QOk.A00(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            r13.setArguments(r2)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r20)
            r39 = 0
            r35 = 0
            r53 = 1023(0x3ff, float:1.434E-42)
            X.CTX r2 = new X.CTX
            r40 = r2
            r41 = r21
            r42 = r21
            r43 = r21
            r44 = r21
            r45 = r21
            r46 = r21
            r47 = r21
            r48 = r35
            r50 = r35
            r52 = r39
            r54 = r3
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            X.0eP r10 = new X.0eP
            r10.<init>(r9, r2)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r23)
            X.CTW r2 = new X.CTW
            r40 = r2
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            X.0eP r5 = new X.0eP
            r5.<init>(r8, r2)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r40 = 2047(0x7ff, float:2.868E-42)
            X.CTV r2 = new X.CTV
            r27 = r2
            r28 = r21
            r29 = r21
            r30 = r21
            r31 = r21
            r32 = r21
            r33 = r21
            r34 = r21
            r37 = r35
            r41 = r3
            r42 = r3
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r37, r39, r40, r41, r42)
            X.0eP r11 = new X.0eP
            r11.<init>(r7, r2)
            X.0eP[] r2 = new X.0eP[]{r10, r5, r11}
            java.util.LinkedHashMap r10 = X.0Yt.A06(r2)
            X.0qQ.A0B(r10, r14)
            X.IZa r11 = new X.IZa
            r11.<init>(r1)
            X.T8Y r5 = new X.T8Y
            r2 = r24
            r5.<init>(r11, r2)
            java.util.List r2 = r12.A01
            r2.add(r5)
            r2.add(r13)
            boolean r2 = r10.containsKey(r7)
            r11 = 1
            if (r2 == 0) goto L_0x0dab
            java.lang.Object r5 = r10.get(r7)
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.watchandbrowse.model.FullScreenDestinationSheetState"
            X.0qQ.A0C(r5, r2)
            X.CTV r5 = (X.CTV) r5
            float r2 = r5.A02
            r5 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0dab
        L_0x0d18:
            r10.get(r8)
            r2 = r26
            boolean r2 = r2 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0e41
            r2 = r26
            android.app.Activity r2 = (android.app.Activity) r2
            r26 = r2
            X.7Pr r2 = new X.7Pr
            r2.<init>(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r11)
            r2.A0a = r4
            r2.A1H = r11
            boolean r4 = r10.containsKey(r7)
            if (r4 == 0) goto L_0x0d43
            java.lang.Object r5 = r10.get(r7)
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.watchandbrowse.model.FullScreenDestinationSheetState"
            X.0qQ.A0C(r5, r4)
        L_0x0d43:
            r2.A1A = r3
            java.lang.Object r4 = r10.get(r8)
            X.CU4 r4 = (X.CU4) r4
            if (r4 == 0) goto L_0x0d9d
            float r4 = r4.A00()
        L_0x0d51:
            r2.A03 = r4
            r10.get(r8)
            r2.A1O = r3
            r2.A0q = r6
            r2.A0k = r3
            r2.A1F = r6
            r2.A1Q = r6
            r2.A1P = r6
            r2.A1I = r6
            r2.A11 = r6
            r2.A1R = r6
            X.TmV r5 = r12.A00
            r2.A0U = r5
            boolean r4 = r10.containsKey(r9)
            r2.A0s = r4
            java.lang.Object r4 = r10.get(r9)
            X.CU4 r4 = (X.CU4) r4
            if (r4 == 0) goto L_0x0d9b
            float r4 = r4.A00()
        L_0x0d7e:
            r2.A01 = r4
            r2.A0X = r5
            X.7Pu r4 = r2.A00()
            r2 = r26
            r4.A02(r2, r13)
            java.util.List r2 = r12.A02
            java.util.Iterator r4 = r2.iterator()
        L_0x0d91:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0e41
            r4.next()
            goto L_0x0d91
        L_0x0d9b:
            r4 = 0
            goto L_0x0d7e
        L_0x0d9d:
            X.CTW r4 = new X.CTW
            r40 = r4
            r41 = r21
            r42 = r21
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            float r4 = r4.A02
            goto L_0x0d51
        L_0x0dab:
            r11 = 0
            goto L_0x0d18
        L_0x0dae:
            X.2EG r7 = X.2EG.A2S
            goto L_0x0bc3
        L_0x0db2:
            r10 = 1
            X.SUL r9 = X.SUD.A01(r2, r5, r9, r14)
            r9.A0z = r10
            r9.A0Z = r10
            X.IZX r4 = new X.IZX
            r4.<init>(r8)
            r9.A0F = r4
            r4 = r24
            r9.A0J = r4
            X.IZa r4 = new X.IZa
            r4.<init>(r1)
            r9.A0G = r4
            r9.A18 = r10
            boolean r8 = r11.A0H
            r9.A0k = r8
            float r4 = r11.A03
            r9.A01 = r4
            r9.A0c = r3
            boolean r4 = r11.A0L
            r9.A0y = r4
            r9.A11 = r10
            r9.A0g = r12
            r9.A03 = r6
            r9.A12 = r10
            r9.A13 = r10
            r9.A15 = r10
            r9.A1B = r10
            r9.A0q = r10
            boolean r5 = r11.A0I
            X.RIg r4 = X.RIg.WATCH_WITH_OVERLAY
            r9.A0s = r5
            r9.A09 = r4
            boolean r4 = r11.A0K
            r9.A0x = r4
            boolean r12 = r11.A0C
            r9.A0i = r12
            boolean r4 = r11.A0G
            r9.A0e = r4
            X.IZw r4 = new X.IZw
            r4.<init>(r11, r2, r1)
            r9.A0I = r4
            r9.A16 = r12
            java.lang.Integer r5 = r11.A07
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            r2 = 0
            if (r5 != r4) goto L_0x0e12
            r2 = 1
        L_0x0e12:
            r9.A1A = r2
            r9.A0K = r7
            r9.A17 = r10
            boolean r2 = r11.A0F
            r7 = 3
            if (r2 == 0) goto L_0x0e2f
            r6 = 2130772046(0x7f01004e, float:1.71472E38)
            r5 = 2130772047(0x7f01004f, float:1.7147201E38)
            r4 = 2130772048(0x7f010050, float:1.7147203E38)
            r2 = 2130772049(0x7f010051, float:1.7147205E38)
            int[] r2 = new int[]{r6, r5, r4, r2}
            r9.A1F = r2
        L_0x0e2f:
            if (r12 == 0) goto L_0x0e3e
            if (r8 == 0) goto L_0x0e3b
            r2 = r20
            r9.A04 = r2
        L_0x0e37:
            r9.A0A()
            goto L_0x0e42
        L_0x0e3b:
            r9.A04 = r10
            goto L_0x0e37
        L_0x0e3e:
            r9.A04 = r7
            goto L_0x0e37
        L_0x0e41:
            r10 = 1
        L_0x0e42:
            r1.A03 = r10
            X.GBj r1 = r1.A0G
            r1.A0E()
            goto L_0x0b69
        L_0x0e4b:
            com.instagram.model.androidlink.AndroidLinkImpl r5 = X.C271714jT.A00(r13)
            goto L_0x0b5a
        L_0x0e51:
            java.lang.Integer r12 = r8.A0d
            if (r12 == 0) goto L_0x0b2f
            java.lang.String r6 = r8.A19
            if (r6 == 0) goto L_0x0b2f
            X.GAi r5 = com.instagram.api.schemas.IntentAwareAdsInfoIntf.A00
            X.GAj r5 = r5.A00()
            r5.A02 = r12
            r5.A06 = r6
            com.instagram.api.schemas.IntentAwareAdsInfoIntf r5 = r5.A00()
            X.0qQ.A0B(r5, r3)
            r9.A0H = r5
            goto L_0x0b2f
        L_0x0e6e:
            r6 = r21
            goto L_0x0b17
        L_0x0e72:
            X.2EG r32 = X.2EG.A2S
            goto L_0x0ac1
        L_0x0e76:
            X.3OA r12 = r5.A07()
            if (r12 != 0) goto L_0x0ab3
            goto L_0x0b69
        L_0x0e7e:
            r2 = r21
            goto L_0x0a73
        L_0x0e82:
            X.4DU r2 = r1.A0A
            java.lang.String r12 = X.C231122qu.A07(r4, r6)
            X.3kK r6 = r1.A0D
            java.lang.String r13 = r6.getSessionId()
            java.lang.String r14 = "watch_and_browse"
            X.S6e r7 = new X.S6e
            r9 = r7
            r10 = r2
            r11 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x0a6f
        L_0x0e9a:
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0671
            X.0eM r1 = r1.A1g
            java.lang.Object r1 = r1.getValue()
            X.GDS r1 = (X.GDS) r1
            X.GDW r1 = r1.A00
            if (r1 == 0) goto L_0x0ec0
            r2.A01 = r1
            X.GDB r1 = r0.A0A
            if (r1 == 0) goto L_0x0f03
            X.2da r1 = r1.A06
            if (r1 == 0) goto L_0x0f03
            X.2dZ r1 = (X.2dZ) r1
            android.widget.FrameLayout r2 = r1.A06
            if (r2 == 0) goto L_0x0f03
            r1 = r20
            r2.setVisibility(r1)
            goto L_0x0f03
        L_0x0ec0:
            java.lang.String r16 = "clipsMediaWatchAndBrowseGestureDelegate"
            goto L_0x0671
        L_0x0ec4:
            X.GBE r9 = r0.A09
            if (r9 == 0) goto L_0x0671
            X.GD9 r1 = r9.A1L
            r62 = r1
            X.4bN r8 = r62.A02()
            r24 = 0
            if (r8 == 0) goto L_0x11a8
            X.1Xj r6 = r8.A02
        L_0x0ed6:
            boolean r1 = r9.A0L
            if (r1 != 0) goto L_0x0f03
            com.instagram.clips.intf.ClipsViewerConfig r5 = r9.A0Y
            boolean r1 = r5.A00()
            if (r1 == 0) goto L_0x0f03
            if (r6 == 0) goto L_0x0f03
            X.GAc r1 = r9.A19
            r61 = r1
            java.lang.String r2 = r61.getModuleName()
            java.lang.String r1 = "feed_timeline"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x103d
            com.instagram.common.session.UserSession r7 = r9.A0a
            X.0Tu r4 = X.0Tu.A06
            r1 = 2342161158179723198(0x2081072a000517be, double:4.064016360448988E-152)
            boolean r1 = X.182.A06(r4, r7, r1)
            if (r1 != 0) goto L_0x103d
        L_0x0f03:
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            boolean r1 = r1.A1p
            if (r1 == 0) goto L_0x1036
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            boolean r1 = r1.A1q
            if (r1 != 0) goto L_0x1036
            r2 = 1
            r1 = r63
            r1.setEnabled(r2)
            r1.A0E = r0
        L_0x0f1b:
            X.07U r7 = X.07U.A05
            X.07Z r6 = r0.getViewLifecycleOwner()
            X.0xx r4 = X.AnonymousClass07a.A00(r6)
            r11 = 16
            X.9KM r2 = new X.9KM
            r5 = r2
            r8 = r0
            r9 = r64
            r10 = r21
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (X.AnonymousClass4D7) r10, (int) r11)
            X.19B r5 = X.19B.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.1Eo.A03(r1, r5, r2, r4)
            X.GBE r6 = r0.A09
            if (r6 == 0) goto L_0x02f2
            com.instagram.clips.intf.ClipsViewerConfig r4 = r6.A0Y
            boolean r1 = r4.A1i
            if (r1 != 0) goto L_0x1023
            com.instagram.clips.intf.ClipsViewerSource r2 = r4.A0J
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_MEDIA_NOTES_NOTIF_CHAIN
            if (r2 == r1) goto L_0x1023
        L_0x0f49:
            if (r67 == 0) goto L_0x0f8f
            boolean r1 = r0.A0J()
            if (r1 == 0) goto L_0x0f8f
            com.instagram.common.session.UserSession r6 = A01(r0)
            r1 = 36325918563120514(0x810e3b00183582, double:3.035995399826245E-306)
            r4 = r22
            boolean r1 = X.182.A06(r4, r6, r1)
            if (r1 == 0) goto L_0x0fba
            java.lang.String r2 = "ClipsViewerFragment.SAVED_CLIPS_VIEWER_ITEM_ID"
            r1 = r17
            java.lang.String r8 = r1.getString(r2)
            X.GBE r7 = r0.A09
            if (r7 == 0) goto L_0x02f2
            X.GIn r2 = r7.A0E
            if (r2 == 0) goto L_0x0f75
            r1 = 1
            r2.A03 = r1
        L_0x0f75:
            X.2is r1 = r7.A07
            if (r1 == 0) goto L_0x0f8f
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            X.07V r1 = r1.getLifecycle()
            X.0xx r6 = X.C71772f0.A00(r1)
            r4 = 10
            X.IlT r2 = new X.IlT
            r2.<init>(r7, r8, r10, r4)
            X.1Eo.A05(r5, r2, r6)
        L_0x0f8f:
            com.instagram.common.session.UserSession r5 = A01(r0)
            X.0Tu r4 = X.0Tu.A06
            r1 = 36330067499958708(0x811201000041b4, double:3.0386192041891464E-306)
            boolean r1 = X.182.A06(r4, r5, r1)
            if (r1 == 0) goto L_0x0fb9
            com.instagram.common.session.UserSession r1 = A01(r0)
            X.IOI r4 = X.I3O.A00(r1)
            com.instagram.clips.intf.ClipsViewerConfig r0 = A00(r0)
            com.instagram.clips.intf.ClipsViewerSource r2 = r0.A0J
            X.0qQ.A0B(r2, r3)
            long r0 = java.lang.System.currentTimeMillis()
            r4.A04 = r0
            r4.A06 = r2
        L_0x0fb9:
            return
        L_0x0fba:
            java.lang.String r2 = "ClipsViewerFragment.SAVED_CLIPS_VIEWER_ITEM_LIST"
            r1 = r17
            java.lang.String[] r5 = r1.getStringArray(r2)     // Catch:{ Exception -> 0x100f }
            if (r5 == 0) goto L_0x0ff7
            int r1 = r5.length     // Catch:{ Exception -> 0x100f }
            if (r1 == 0) goto L_0x0ff7
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x100f }
            r4.<init>()     // Catch:{ Exception -> 0x100f }
            X.0sC r2 = new X.0sC     // Catch:{ Exception -> 0x100f }
            r2.<init>(r5)     // Catch:{ Exception -> 0x100f }
        L_0x0fd1:
            boolean r1 = r2.hasNext()     // Catch:{ Exception -> 0x100f }
            if (r1 == 0) goto L_0x0fff
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x100f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x100f }
            X.16F r1 = X.16P.A00(r1)     // Catch:{ Exception -> 0x100f }
            X.4sL r1 = X.C275974sH.parseFromJson(r1)     // Catch:{ Exception -> 0x100f }
            X.0qQ.A0A(r1)     // Catch:{ Exception -> 0x100f }
            r4.add(r1)     // Catch:{ Exception -> 0x100f }
            goto L_0x0fd1
        L_0x0fec:
            com.instagram.common.session.UserSession r1 = A01(r0)     // Catch:{ Exception -> 0x100f }
            java.util.List r1 = X.C295325ny.A05(r1, r4)     // Catch:{ Exception -> 0x100f }
            r2.A0B(r1, r3)     // Catch:{ Exception -> 0x100f }
        L_0x0ff7:
            X.GBj r1 = r0.A0N     // Catch:{ Exception -> 0x100f }
            if (r1 != 0) goto L_0x100b
            X.0qQ.A0F(r18)     // Catch:{ Exception -> 0x100f }
            goto L_0x1006
        L_0x0fff:
            X.GD6 r2 = r0.A0C     // Catch:{ Exception -> 0x100f }
            if (r2 != 0) goto L_0x0fec
            X.0qQ.A0F(r19)     // Catch:{ Exception -> 0x100f }
        L_0x1006:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()     // Catch:{ Exception -> 0x100f }
            throw r1     // Catch:{ Exception -> 0x100f }
        L_0x100b:
            r1.A0H(r3)     // Catch:{ Exception -> 0x100f }
            goto L_0x0f8f
        L_0x100f:
            X.0wj r4 = X.0wj.A01
            r2 = 817892914(0x30c00e32, float:1.3973873E-9)
            r1 = 2169(0x879, float:3.04E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0f9 r1 = r4.AEf(r1, r2)
            r1.report()
            goto L_0x0f8f
        L_0x1023:
            java.lang.String r4 = r4.A0w
            if (r4 == 0) goto L_0x0f49
            r1 = 1
            X.BJ4 r2 = new X.BJ4
            r2.<init>(r4, r1)
            X.GLR r1 = r6.A16
            if (r1 == 0) goto L_0x0f49
            r1.A0B(r2)
            goto L_0x0f49
        L_0x1036:
            r1 = r63
            r1.setEnabled(r3)
            goto L_0x0f1b
        L_0x103d:
            if (r8 == 0) goto L_0x11a0
            X.3OA r7 = r8.A06()
        L_0x1043:
            android.content.Context r1 = r9.A0Q
            com.instagram.common.session.UserSession r4 = r9.A0a
            com.instagram.model.androidlink.AndroidLink r11 = X.AnonymousClass47K.A02(r1, r4, r6, r3, r3)
            if (r8 == 0) goto L_0x105b
            X.1se r2 = X.1sd.A00(r4)
            r10 = r21
            X.GDe r1 = X.C52057GDd.A01(r8, r4, r2, r10, r10)
            X.3W1 r10 = r1.A0E
            if (r10 != 0) goto L_0x10ba
        L_0x105b:
            com.instagram.user.model.FollowStatus r33 = com.instagram.user.model.FollowStatus.A08
            r43 = 1
            X.HLU r29 = X.HLU.A03
            X.3WA r30 = X.AnonymousClass3WA.A0F
            r1 = 6
            X.Gms r8 = new X.Gms
            r8.<init>(r1)
            r1 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            X.0eP r2 = new X.0eP
            r2.<init>(r1, r1)
            X.GDe r1 = new X.GDe
            r25 = r1
            r26 = r8
            r27 = r21
            r28 = r21
            r31 = r21
            r32 = r21
            r34 = r21
            r35 = r21
            r36 = r21
            r37 = r21
            r38 = r2
            r39 = r3
            r40 = r3
            r41 = r3
            r42 = r3
            r44 = r3
            r45 = r3
            r46 = r3
            r47 = r3
            r48 = r3
            r49 = r3
            r50 = r43
            r51 = r43
            r52 = r43
            r53 = r3
            r54 = r43
            r55 = r3
            r56 = r3
            r57 = r3
            r58 = r3
            r59 = r3
            r60 = r3
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            X.3W1 r10 = r1.A0E
        L_0x10ba:
            if (r7 == 0) goto L_0x11a4
            if (r11 == 0) goto L_0x11a4
            if (r10 == 0) goto L_0x11a4
            java.lang.String r31 = r11.CGH()
            if (r31 == 0) goto L_0x11a4
            androidx.fragment.app.FragmentActivity r15 = r9.A0R
            com.instagram.clips.intf.ClipsWatchAndBrowseData r14 = r5.A0K
            if (r14 == 0) goto L_0x10d2
            float r1 = r14.A04
            java.lang.Float r24 = java.lang.Float.valueOf(r1)
        L_0x10d2:
            X.IZZ r13 = new X.IZZ
            r13.<init>(r9)
            X.HFa r12 = new X.HFa
            r12.<init>(r9)
            java.lang.String r1 = r7.A0j
            r33 = r1
            java.lang.String r1 = r7.A0S
            r32 = r1
            java.lang.String r11 = r6.getId()
            X.93T r8 = r9.A1D
            java.lang.String r5 = r8.A01
            r2 = 1
            if (r14 == 0) goto L_0x10f5
            boolean r1 = r14.A0B
            r23 = 1
            if (r1 == r2) goto L_0x10f9
        L_0x10f5:
            r23 = 0
            if (r14 == 0) goto L_0x10ff
        L_0x10f9:
            boolean r1 = r14.A0F
            r20 = 1
            if (r1 == r2) goto L_0x1101
        L_0x10ff:
            r20 = 0
        L_0x1101:
            X.0qQ.A0B(r15, r3)
            r1 = 2
            X.0qQ.A0B(r4, r1)
            if (r24 != 0) goto L_0x1148
            java.lang.String r2 = "WatchAndBrowseUtil"
            java.lang.String r1 = "iabHeightRatio is null"
            X.0KC.A0D(r2, r1)
            r1 = 0
        L_0x1112:
            r9.A0L = r1
            if (r1 == 0) goto L_0x0f03
            X.4bN r25 = r62.A02()
            if (r25 == 0) goto L_0x11bb
            X.2EG r1 = X.2EG.A2R
            java.lang.String r29 = r1.toString()
            X.GlN r1 = r10.A06()
            X.4jb r2 = new X.4jb
            r2.<init>(r4, r7, r1)
            java.lang.String r1 = r8.A00
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r27 = java.lang.Float.valueOf(r5)
            java.lang.String r33 = X.1sx.A0A(r6, r10)
            java.lang.String r30 = "webclick"
            r23 = r4
            r24 = r2
            r26 = r61
            r28 = r27
            r32 = r1
            X.C233822wX.A0L(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0f03
        L_0x1148:
            X.2EG r28 = X.2EG.A4C
            X.SUL r1 = new X.SUL
            r25 = r1
            r26 = r15
            r27 = r4
            r29 = r31
            r30 = r3
            r25.<init>(r26, r27, r28, r29, r30)
            r1.A0z = r2
            r1.A0c = r3
            float r14 = r24.floatValue()
            r1.A03 = r14
            r1.A0G = r13
            r1.A0y = r2
            r1.A0J = r12
            r1.A12 = r2
            r12 = r33
            r1.A0D(r12)
            r12 = r32
            r1.A0B(r12)
            r1.A0C(r11)
            r1.A0F(r5)
            r1.A18 = r2
            if (r20 == 0) goto L_0x1191
            r12 = 2130772046(0x7f01004e, float:1.71472E38)
            r11 = 2130772047(0x7f01004f, float:1.7147201E38)
            r5 = 2130772048(0x7f010050, float:1.7147203E38)
            r2 = 2130772049(0x7f010051, float:1.7147205E38)
            int[] r2 = new int[]{r12, r11, r5, r2}
            r1.A1F = r2
        L_0x1191:
            if (r23 == 0) goto L_0x119a
            X.PQZ r2 = new X.PQZ
            r2.<init>()
            r1.A0F = r2
        L_0x119a:
            r1.A0A()
            r1 = 1
            goto L_0x1112
        L_0x11a0:
            r7 = r21
            goto L_0x1043
        L_0x11a4:
            r9.A0L = r3
            goto L_0x0f03
        L_0x11a8:
            r6 = r21
            goto L_0x0ed6
        L_0x11ac:
            X.0qQ.A0F(r6)
            goto L_0x03c9
        L_0x11b1:
            X.0qQ.A0F(r8)
            goto L_0x03c9
        L_0x11b6:
            X.0qQ.A0F(r18)
            goto L_0x03c9
        L_0x11bb:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x11c3:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x11cb:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227232is.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final ClipsViewerConfig A00(C227232is r0) {
        return (ClipsViewerConfig) r0.A1K.getValue();
    }

    public static final UserSession A01(C227232is r0) {
        return (UserSession) r0.A1L.getValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0007: MOVE  (r1v2 X.2Zg) = (r1v0 X.2Zg)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    private final X.2Zg A02() {
        /*
            r3 = this;
            androidx.fragment.app.Fragment r1 = r3.mParentFragment
            boolean r0 = r1 instanceof X.2Zg
            r2 = 0
            if (r0 == 0) goto L_0x000c
            X.2Zg r1 = (X.2Zg) r1
            if (r1 == 0) goto L_0x000c
            return r1
        L_0x000c:
            android.app.Activity r1 = r3.getRootActivity()
            boolean r0 = r1 instanceof X.2Zg
            if (r0 == 0) goto L_0x0018
            r2 = r1
            X.2Zg r2 = (X.2Zg) r2
            return r2
        L_0x0018:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227232is.A02():X.2Zg");
    }

    private final List A03(boolean z) {
        List<C267324bN> list;
        if (z) {
            try {
                GD6 gd6 = this.A0C;
                if (gd6 != null) {
                    List A0I2 = gd6.A0A.A0I();
                    C52012GBj gBj = this.A0N;
                    if (gBj != null) {
                        int A062 = gBj.A06();
                        GD6 gd62 = this.A0C;
                        if (gd62 != null) {
                            int size = gd62.A0A.A0I().size();
                            C52012GBj gBj2 = this.A0N;
                            if (gBj2 != null) {
                                list = A0I2.subList(A062, Math.min(size, gBj2.A06() + 5));
                            }
                        }
                    }
                    0qQ.A0F("clipsViewerViewPager");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F("viewerAdapter");
                throw AnonymousClass00P.createAndThrow();
            } catch (Exception unused) {
                0wj.A01.AEf("ClipsViewerFragment: Failed to parse json for viewer items\"", 817892914).report();
                return 0sn.A00;
            }
        } else {
            GD6 gd63 = this.A0C;
            if (gd63 != null) {
                list = gd63.A0A.A0I();
            }
            0qQ.A0F("viewerAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        ArrayList arrayList = new ArrayList();
        for (C267324bN A002 : list) {
            C276014sL A003 = C295325ny.A00(A002);
            if (A003 != null) {
                StringWriter stringWriter = new StringWriter();
                17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
                C275974sH.A00(A0A2, A003);
                A0A2.close();
                String obj = stringWriter.toString();
                0qQ.A07(obj);
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v63, resolved type: X.3CI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v164, resolved type: X.GHq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v9, resolved type: X.GHq} */
    /* JADX WARNING: type inference failed for: r14v1 */
    /* JADX WARNING: type inference failed for: r9v4, types: [X.2mN, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v64, types: [X.2wO] */
    /* JADX WARNING: type inference failed for: r12v4, types: [X.2mN, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v45, types: [java.lang.Object, X.HxK] */
    /* JADX WARNING: type inference failed for: r6v12, types: [X.IY6] */
    /* JADX WARNING: type inference failed for: r21v10, types: [X.GHj] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (X.1DL.A07(r39, "android.permission.CAMERA") == false) goto L_0x002e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A08(android.content.Context r41, X.AnonymousClass2lD r42, X.C52012GBj r43) {
        /*
            r40 = this;
            r0 = r40
            X.GBE r1 = r0.A09
            java.lang.String r17 = "clipsViewerFragmentViewModel"
            if (r1 == 0) goto L_0x06cb
            X.0eM r1 = r1.A1Q
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x067d
            java.lang.String r2 = "android.permission.RECORD_AUDIO"
            r39 = r41
            r1 = r39
            boolean r1 = X.1DL.A07(r1, r2)
            if (r1 == 0) goto L_0x002e
            java.lang.String r2 = "android.permission.CAMERA"
            r1 = r39
            boolean r1 = X.1DL.A07(r1, r2)
            r37 = 1
            if (r1 != 0) goto L_0x0030
        L_0x002e:
            r37 = 0
        L_0x0030:
            com.instagram.common.session.UserSession r18 = A01(r0)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x06cb
            X.93T r1 = r1.A1D
            java.lang.String r9 = r1.A00
            java.lang.String r25 = r0.getModuleName()
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x06cb
            X.GAc r8 = r1.A19
            com.instagram.common.session.UserSession r1 = A01(r0)
            r6 = 0
            X.0qQ.A0B(r1, r6)
            X.1PG r1 = X.1PG.A00(r1)
            X.1PB r12 = X.C52216GJh.A01
            X.2vA r19 = r1.A03(r12)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x06cb
            X.HJk r7 = r1.A0q
            X.93T r5 = r1.A1D
            com.instagram.common.session.UserSession r10 = A01(r0)
            r4 = 0
            X.0qQ.A0B(r10, r6)
            X.0Tu r1 = X.0Tu.A05
            r2 = 36323118242868079(0x810baf00002b6f, double:3.03422446602262E-306)
            boolean r2 = X.182.A06(r1, r10, r2)
            if (r2 == 0) goto L_0x0281
            X.Tnz r10 = X.GPt.A00(r10)
            X.HxK r3 = new X.HxK
            r3.<init>()
            X.GPu r2 = new X.GPu
            r2.<init>(r10, r3)
        L_0x0083:
            X.JPY r2 = (X.JPY) r2
            r23 = r5
            r24 = r9
            r20 = r8
            r21 = r2
            r22 = r7
            X.2vG r20 = X.GEU.A00(r18, r19, r20, r21, r22, r23, r24, r25)
            com.instagram.common.session.UserSession r8 = A01(r0)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x06cb
            X.93T r2 = r2.A1D
            r19 = r2
            android.content.Context r22 = r0.requireContext()
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x06cb
            X.4h9 r2 = r3.A0S
            r18 = r2
            X.HJk r2 = r3.A0q
            r16 = r2
            java.lang.String r15 = r0.getModuleName()
            com.instagram.clips.intf.ClipsViewerConfig r9 = A00(r0)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x06cb
            X.GAc r13 = r2.A19
            com.instagram.common.session.UserSession r3 = A01(r0)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x06cb
            X.HJk r2 = r2.A0q
            X.GEP r11 = new X.GEP
            r11.<init>(r3, r2)
            com.instagram.common.session.UserSession r5 = A01(r0)
            r2 = 36318556988381426(0x810789000c18f2, double:3.0313399103185633E-306)
            boolean r38 = X.182.A06(r1, r5, r2)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x06cb
            X.0eM r2 = r2.A1a
            java.lang.Object r10 = r2.getValue()
            X.GCz r10 = (X.C52053GCz) r10
            X.GD9 r7 = r0.A0O()
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x06cb
            X.HJk r5 = r2.A0q
            com.instagram.common.session.UserSession r2 = A01(r0)
            X.0qQ.A0B(r2, r6)
            X.1PG r2 = X.1PG.A00(r2)
            X.2vA r26 = r2.A03(r12)
            X.0qQ.A0B(r8, r6)
            r3 = 1
            r2 = r19
            X.0qQ.A0B(r2, r3)
            r3 = 3
            r2 = r18
            X.0qQ.A0B(r2, r3)
            r3 = 4
            r2 = r16
            X.0qQ.A0B(r2, r3)
            r2 = 5
            X.0qQ.A0B(r15, r2)
            r2 = 6
            X.0qQ.A0B(r9, r2)
            r2 = 8
            X.0qQ.A0B(r13, r2)
            r2 = 14
            X.0qQ.A0B(r7, r2)
            r2 = 15
            X.0qQ.A0B(r5, r2)
            com.instagram.clips.intf.ClipsViewerSource r3 = r9.A0J
            boolean r2 = r3.A00()
            if (r2 != 0) goto L_0x0273
            r2 = 44
            int r3 = r3.ordinal()
            if (r3 == r2) goto L_0x0266
            r2 = 45
            if (r3 == r2) goto L_0x0273
        L_0x013e:
            java.lang.String r3 = r9.A1H
            java.lang.String r2 = r9.A1B
            java.lang.String r5 = r9.A1E
            X.GHj r14 = new X.GHj
            r27 = r13
            r28 = r20
            r29 = r10
            r30 = r16
            r31 = r19
            r32 = r7
            r33 = r15
            r34 = r3
            r35 = r2
            r36 = r5
            r21 = r14
            r23 = r18
            r24 = r11
            r25 = r8
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
        L_0x0165:
            X.2uo r14 = (X.C233012uo) r14
            com.instagram.clips.intf.ClipsViewerConfig r2 = A00(r0)
            java.lang.String r11 = r2.A1F
            java.lang.String r7 = "viewerAdapter"
            r36 = r42
            if (r11 == 0) goto L_0x038b
            com.instagram.common.session.UserSession r3 = A01(r0)
            java.lang.String r2 = r0.getModuleName()
            boolean r2 = X.AnonymousClass71K.A0B(r3, r11, r2)
            if (r2 == 0) goto L_0x038b
            com.instagram.common.session.UserSession r5 = A01(r0)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x06cb
            X.93T r2 = r2.A1D
            r23 = r2
            android.content.Context r21 = r0.requireContext()
            X.GD6 r2 = r0.A0C
            r20 = r2
            if (r2 == 0) goto L_0x06cf
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x06cb
            X.93T r2 = r3.A1D
            java.lang.String r13 = r2.A00
            X.HJk r10 = r3.A0q
            java.lang.String r19 = r0.getModuleName()
            com.instagram.clips.intf.ClipsViewerConfig r2 = A00(r0)
            java.lang.String r2 = r2.A1H
            r22 = r2
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x06cb
            X.0eM r2 = r2.A1e
            java.lang.Object r2 = r2.getValue()
            X.HQU r2 = (X.HQU) r2
            X.VvI r2 = r2.A00
            if (r2 == 0) goto L_0x0263
            X.2vk r9 = r2.A0B
        L_0x01bf:
            X.GBE r6 = r0.A09
            if (r6 == 0) goto L_0x06cb
            int r8 = r6.A00
            X.2nF r2 = r6.A0X
            r35 = r2
            X.GAc r3 = r6.A19
            X.HJk r2 = r6.A0q
            X.0qQ.A0B(r5, r4)
            r7 = 1
            r6 = r23
            X.0qQ.A0B(r6, r7)
            r6 = 4
            X.0qQ.A0B(r13, r6)
            r6 = 5
            X.0qQ.A0B(r10, r6)
            r7 = 6
            r6 = r19
            X.0qQ.A0B(r6, r7)
            r6 = 12
            X.0qQ.A0B(r3, r6)
            r6 = 13
            X.0qQ.A0B(r2, r6)
            r18 = 0
            r16 = 1
            X.HEY r6 = new X.HEY
            r6.<init>(r11)
            java.util.Set r15 = X.C45193Crv.A00
            boolean r7 = r15.contains(r6)
            if (r7 != 0) goto L_0x020a
            X.IXm r7 = new X.IXm
            r7.<init>()
            X.1PG.A01(r7, r6)
            r15.add(r6)
        L_0x020a:
            X.1PG r7 = X.1PG.A00(r5)
            X.3kU r26 = r7.A06(r6)
            X.0qQ.A07(r26)
            X.1PG r7 = X.1PG.A00(r5)
            X.1PX r24 = r7.A04(r6)
            X.0qQ.A07(r24)
            X.1PG r7 = X.1PG.A00(r5)
            X.2vA r28 = r7.A03(r12)
            r30 = 0
            r27 = r5
            r29 = r3
            r31 = r2
            r32 = r23
            r33 = r13
            r34 = r19
            X.2vG r7 = X.GEU.A00(r27, r28, r29, r30, r31, r32, r33, r34)
            X.5o2 r2 = X.C295365o2.ORGANIC
            java.util.List r12 = r10.A0K(r2)
            r2 = 10
            int r3 = X.0Yv.A1E(r12, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            java.util.Iterator r12 = r12.iterator()
        L_0x024f:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x0288
            java.lang.Object r3 = r12.next()
            X.4bN r3 = (X.C267324bN) r3
            java.lang.String r3 = r3.getId()
            r2.add(r3)
            goto L_0x024f
        L_0x0263:
            r9 = 0
            goto L_0x01bf
        L_0x0266:
            X.0Tu r6 = X.0Tu.A06
            r2 = 36321992962090891(0x810aa9000a278b, double:3.0335128339279846E-306)
            boolean r2 = X.182.A06(r6, r8, r2)
            if (r2 == 0) goto L_0x013e
        L_0x0273:
            X.IY6 r14 = new X.IY6
            r6 = r14
            r7 = r22
            r9 = r13
            r10 = r5
            r11 = r16
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0165
        L_0x0281:
            X.GI7 r2 = new X.GI7
            r2.<init>()
            goto L_0x0083
        L_0x0288:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x02a0
            int r3 = r2.size()
            int r3 = r3 - r16
            int r12 = java.lang.Math.min(r3, r8)
            int r3 = r2.size()
            java.util.List r2 = r2.subList(r12, r3)
        L_0x02a0:
            X.2w4 r3 = new X.2w4
            r3.<init>(r2, r4, r8, r4)
            X.IY5 r15 = new X.IY5
            r27 = r19
            r28 = r11
            r29 = r22
            r30 = r8
            r22 = r15
            r23 = r5
            r25 = r7
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)
            X.1PG r12 = X.1PG.A00(r5)
            X.HEY r2 = new X.HEY
            r2.<init>(r11)
            X.3kU r13 = r12.A06(r2)
            X.0qQ.A07(r13)
            X.GIU r12 = new X.GIU
            r12.<init>()
            X.IYB r2 = new X.IYB
            r22 = r2
            r23 = r35
            r24 = r5
            r25 = r20
            r26 = r10
            r27 = r11
            r22.<init>(r23, r24, r25, r26, r27)
            X.HFD r10 = new X.HFD
            r10.<init>(r12, r2, r13, r8)
            X.6Vq r8 = new X.6Vq
            r22 = r8
            r23 = r12
            r24 = r2
            r25 = r13
            r26 = r10
            r27 = r4
            r28 = r4
            r29 = r16
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            X.GEd r4 = new X.GEd
            r4.<init>(r7)
            X.1PJ r28 = X.C52216GJh.A02
            X.HEi r10 = new X.HEi
            r22 = r10
            r23 = r5
            r24 = r12
            r25 = r2
            r26 = r4
            r27 = r13
            r22.<init>(r23, r24, r25, r26, r27, r28)
            X.2w5 r4 = new X.2w5
            r4.<init>(r3)
            r4.A0G = r15
            r4.A0H = r2
            r4.A0J = r10
            r4.A0K = r7
            r4.A0N = r8
            r4.A0L = r13
            r2 = r36
            r4.A0P = r2
            r4.A0E = r12
            r4.A0F = r9
            r2 = 36313699379579074(0x81031e000008c2, double:3.028267938951935E-306)
            boolean r2 = X.182.A06(r1, r5, r2)
            if (r2 == 0) goto L_0x0385
            X.GEj r7 = new X.GEj
            r3 = r21
            r2 = r19
            r7.<init>(r5, r3, r2)
        L_0x033d:
            r4.A02(r7)
            r2 = 36315005049768885(0x81044e00020bb5, double:3.0290936500374836E-306)
            boolean r2 = X.182.A06(r1, r5, r2)
            r4.A0j = r2
            X.1PG r2 = X.1PG.A00(r5)
            r2.getClass()
            r4.A08 = r2
            r4.A0C = r6
            r4.A03 = r5
            r2 = 36318595642562875(0x8107920004193b, double:3.0313643553785596E-306)
            boolean r2 = X.182.A06(r1, r5, r2)
            r4.A0o = r2
            r2 = 36320730241245989(0x81098300032325, double:3.0327142841811E-306)
            boolean r2 = X.182.A06(r1, r5, r2)
            if (r2 == 0) goto L_0x0376
            X.2wC r2 = X.C233682wC.A03
            r4.A09 = r2
            r2 = r16
            r4.A00 = r2
        L_0x0376:
            X.2wV r3 = r4.A00()
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x06cb
            int r2 = r2.A00
            r3.A0C(r2)
            goto L_0x060d
        L_0x0385:
            X.IXs r7 = new X.IXs
            r7.<init>()
            goto L_0x033d
        L_0x038b:
            com.instagram.common.session.UserSession r6 = A01(r0)
            android.content.Context r19 = r0.requireContext()
            X.GD6 r11 = r0.A0C
            if (r11 == 0) goto L_0x06cf
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x06cb
            X.HJk r15 = r2.A0q
            X.GCH r10 = r2.A1A
            java.lang.String r13 = r0.getModuleName()
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x06cb
            X.0eM r2 = r2.A1e
            java.lang.Object r2 = r2.getValue()
            X.HQU r2 = (X.HQU) r2
            X.VvI r2 = r2.A00
            if (r2 == 0) goto L_0x0426
            X.2vk r5 = r2.A0B
            X.IXt r5 = (X.C57336IXt) r5
        L_0x03b7:
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x06cb
            int r9 = r3.A00
            X.2nF r2 = r3.A0X
            r22 = r2
            java.lang.String r2 = r3.A1O
            r21 = r2
            com.instagram.clips.intf.ClipsViewerConfig r2 = A00(r0)
            com.instagram.clips.intf.ClipsViewerSource r7 = r2.A0J
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x06cb
            X.HJk r2 = r2.A0q
            r33 = r2
            X.0qQ.A0B(r6, r4)
            r2 = 3
            X.0qQ.A0B(r15, r2)
            r2 = 4
            X.0qQ.A0B(r10, r2)
            r2 = 5
            X.0qQ.A0B(r13, r2)
            r2 = 10
            X.0qQ.A0B(r7, r2)
            r3 = 12
            r2 = r33
            X.0qQ.A0B(r2, r3)
            boolean r2 = X.C52216GJh.A00
            if (r2 != 0) goto L_0x03fd
            X.GJj r2 = new X.GJj
            r2.<init>()
            X.1PG.A01(r2, r12)
            r2 = 1
            X.C52216GJh.A00 = r2
        L_0x03fd:
            X.5o2 r2 = X.C295365o2.ORGANIC
            java.util.List r3 = r15.A0K(r2)
            r2 = 10
            int r2 = X.0Yv.A1E(r3, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            java.util.Iterator r3 = r3.iterator()
        L_0x0412:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0428
            java.lang.Object r2 = r3.next()
            X.4bN r2 = (X.C267324bN) r2
            java.lang.String r2 = r2.getId()
            r4.add(r2)
            goto L_0x0412
        L_0x0426:
            r5 = 0
            goto L_0x03b7
        L_0x0428:
            r2 = 36318556988381426(0x810789000c18f2, double:3.0313399103185633E-306)
            boolean r2 = X.182.A06(r1, r6, r2)
            if (r2 == 0) goto L_0x045b
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L_0x045b
            r2 = 36318556989102332(0x810789001718fc, double:3.031339910774467E-306)
            boolean r2 = X.182.A06(r1, r6, r2)
            if (r2 == 0) goto L_0x06bf
            int r3 = r9 + 1
            if (r9 != 0) goto L_0x0449
            r3 = 0
        L_0x0449:
            int r2 = r4.size()
            int r2 = r2 + -1
            int r3 = java.lang.Math.min(r2, r3)
        L_0x0453:
            int r2 = r4.size()
            java.util.List r4 = r4.subList(r3, r2)
        L_0x045b:
            r18 = 0
            X.2w4 r8 = new X.2w4
            r3 = r18
            r8.<init>(r4, r3, r9, r3)
            boolean r2 = r14 instanceof X.C270674h7
            if (r2 == 0) goto L_0x0470
            r2 = r14
            X.4h7 r2 = (X.C270674h7) r2
            if (r2 == 0) goto L_0x0470
            r10.A03(r2)
        L_0x0470:
            X.1PG r2 = X.1PG.A00(r6)
            X.3kU r16 = r2.A06(r12)
            X.0qQ.A07(r16)
            X.GIU r9 = new X.GIU
            r9.<init>()
            r2 = 36317925627401873(0x8106f600001691, double:3.0309406350928074E-306)
            boolean r2 = X.182.A06(r1, r6, r2)
            if (r2 == 0) goto L_0x06b8
            r2 = 36317925627467410(0x8106f600011692, double:3.030940635134253E-306)
            boolean r4 = X.182.A06(r1, r6, r2)
            r2 = 36315614935190963(0x8104dc00030db3, double:3.029479344034217E-306)
            boolean r10 = X.182.A06(r1, r6, r2)
            if (r10 == 0) goto L_0x06b4
            X.2vY r10 = X.C233342vY.A01
            boolean r3 = X.182.A06(r1, r6, r2)
            X.HEd r2 = new X.HEd
            r2.<init>(r3)
        L_0x04aa:
            X.2vb r10 = new X.2vb
            r10.<init>(r2, r9, r4)
        L_0x04af:
            boolean r2 = r7.A00()
            if (r2 != 0) goto L_0x0699
            r2 = 44
            int r3 = r7.ordinal()
            if (r3 == r2) goto L_0x068c
            r2 = 45
            if (r3 == r2) goto L_0x0699
        L_0x04c1:
            X.GIV r7 = new X.GIV
            r23 = r33
            r24 = r6
            r25 = r10
            r26 = r9
            r27 = r20
            r28 = r5
            r29 = r11
            r30 = r15
            r31 = r21
            r21 = r7
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x04da:
            X.2w5 r4 = new X.2w5
            r4.<init>(r8)
            r4.A0G = r14
            r4.A0H = r7
            X.0xi r2 = X.0tS.A4E
            X.0tS r2 = r2.A00()
            boolean r2 = r2.A0L()
            if (r2 != 0) goto L_0x0685
            r2 = 36312879041086814(0x81025f0004055e, double:3.027749153586192E-306)
            boolean r2 = X.182.A06(r1, r6, r2)
            if (r2 != 0) goto L_0x0685
            X.GEd r8 = new X.GEd
            r2 = r20
            r8.<init>(r2)
            X.1PJ r3 = X.C52216GJh.A02
            r2 = 5
            X.0qQ.A0B(r3, r2)
            X.GHq r2 = new X.GHq
            r22 = r6
            r23 = r9
            r24 = r7
            r25 = r8
            r26 = r16
            r27 = r3
            r21 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27)
        L_0x051a:
            r4.A0J = r2
            r2 = r20
            r4.A0K = r2
            r11 = 1
            r2 = 9
            X.0qQ.A0B(r12, r2)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r2 = 36318556987857130(0x810789000418ea, double:3.0313399099869964E-306)
            boolean r29 = X.182.A06(r1, r6, r2)
            r2 = 36318556989364480(0x810789001b1900, double:3.0313399109402507E-306)
            boolean r30 = X.182.A06(r1, r6, r2)
            X.4jm r2 = new X.4jm
            r22 = r33
            r23 = r6
            r24 = r10
            r25 = r9
            r26 = r16
            r27 = r15
            r28 = r33
            r21 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r8.add(r2)
            r2 = 36318556988512500(0x810789000e18f4, double:3.031339910401455E-306)
            boolean r2 = X.182.A06(r1, r6, r2)
            if (r2 == 0) goto L_0x0597
            X.2vq r3 = new X.2vq
            r3.<init>(r9)
            X.2vs r2 = new X.2vs
            r2.<init>(r11)
            X.GIS r21 = new X.GIS
            r32 = r43
            r22 = r6
            r23 = r12
            r26 = r7
            r27 = r20
            r28 = r16
            r29 = r3
            r30 = r2
            r31 = r33
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.2vv r2 = new X.2vv
            r22 = r2
            r23 = r9
            r24 = r7
            r25 = r16
            r26 = r21
            r27 = r18
            r28 = r18
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r8.add(r2)
        L_0x0597:
            X.2vx r2 = new X.2vx
            r2.<init>(r8)
            r4.A0N = r2
            r2 = r16
            r4.A0L = r2
            r2 = r36
            r4.A0P = r2
            r4.A0E = r9
            r4.A0F = r5
            r2 = 36313699379579074(0x81031e000008c2, double:3.028267938951935E-306)
            boolean r2 = X.182.A06(r1, r6, r2)
            if (r2 == 0) goto L_0x067e
            X.GEj r3 = new X.GEj
            r2 = r19
            r3.<init>(r6, r2, r13)
        L_0x05bc:
            r4.A02(r3)
            r2 = 36315005049768885(0x81044e00020bb5, double:3.0290936500374836E-306)
            boolean r2 = X.182.A06(r1, r6, r2)
            r4.A0j = r2
            X.1PG r2 = X.1PG.A00(r6)
            r5 = 0
            r2.getClass()
            r4.A08 = r2
            r4.A0C = r12
            r4.A03 = r6
            r2 = 36318595642562875(0x8107920004193b, double:3.0313643553785596E-306)
            boolean r2 = X.182.A06(r1, r6, r2)
            r4.A0o = r2
            r2 = 36318556988905722(0x810789001418fa, double:3.03133991065013E-306)
            boolean r2 = X.182.A06(r1, r6, r2)
            r4.A0g = r2
            r4.A0S = r13
            r2 = 36318556989364480(0x810789001b1900, double:3.0313399109402507E-306)
            boolean r2 = X.182.A06(r1, r6, r2)
            if (r2 != 0) goto L_0x0606
            r2 = 36318556990413071(0x810789002b190f, double:3.031339911603384E-306)
            boolean r2 = X.182.A06(r1, r6, r2)
            if (r2 == 0) goto L_0x0607
        L_0x0606:
            r5 = 1
        L_0x0607:
            r4.A0l = r5
            X.2wV r3 = r4.A00()
        L_0x060d:
            r0.A0Z = r3
            com.instagram.common.session.UserSession r4 = A01(r0)
            r2 = 36318556987791593(0x810789000318e9, double:3.0313399099455506E-306)
            boolean r1 = X.182.A06(r1, r4, r2)
            if (r1 == 0) goto L_0x062b
            X.2wV r2 = r0.A0Z
            if (r2 == 0) goto L_0x062b
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x06cb
            int r1 = r1.A00
            r2.A0C(r1)
        L_0x062b:
            com.instagram.common.session.UserSession r1 = A01(r0)
            boolean r1 = X.1KU.A09(r1)
            if (r1 != 0) goto L_0x0657
            com.instagram.common.session.UserSession r4 = A01(r0)
            r1 = r18
            X.0qQ.A0B(r4, r1)
            X.0Tu r3 = X.0Tu.A06
            r1 = 36321992961501060(0x810aa900012784, double:3.033512833554973E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 != 0) goto L_0x0657
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            com.instagram.clips.intf.ClipsViewerSource r1 = r1.A0J
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x067d
        L_0x0657:
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x06cb
            X.4hF r3 = r1.A0Z
            boolean r1 = r14 instanceof X.C290515fR
            if (r1 == 0) goto L_0x0666
            X.5fR r14 = (X.C290515fR) r14
            r3.Elk(r14)
        L_0x0666:
            com.instagram.common.session.UserSession r2 = A01(r0)
            X.GBE r0 = r0.A09
            if (r0 == 0) goto L_0x06cb
            X.HJk r1 = r0.A0q
            X.GEP r0 = new X.GEP
            r0.<init>(r2, r1)
            r3.ES0(r0)
            r0 = r39
            r3.ESn(r0)
        L_0x067d:
            return
        L_0x067e:
            X.IXs r3 = new X.IXs
            r3.<init>()
            goto L_0x05bc
        L_0x0685:
            X.3CI r2 = new X.3CI
            r2.<init>()
            goto L_0x051a
        L_0x068c:
            X.0Tu r4 = X.0Tu.A06
            r2 = 36321992962090891(0x810aa9000a278b, double:3.0335128339279846E-306)
            boolean r2 = X.182.A06(r4, r6, r2)
            if (r2 == 0) goto L_0x04c1
        L_0x0699:
            X.HIz r7 = new X.HIz
            r23 = r33
            r24 = r6
            r25 = r10
            r26 = r9
            r27 = r20
            r28 = r5
            r29 = r11
            r30 = r15
            r31 = r21
            r21 = r7
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x04da
        L_0x06b4:
            X.2vY r2 = X.C233342vY.A01
            goto L_0x04aa
        L_0x06b8:
            X.2wA r10 = new X.2wA
            r10.<init>()
            goto L_0x04af
        L_0x06bf:
            int r2 = r4.size()
            int r2 = r2 + -1
            int r3 = java.lang.Math.min(r2, r9)
            goto L_0x0453
        L_0x06cb:
            X.0qQ.A0F(r17)
            goto L_0x06d2
        L_0x06cf:
            X.0qQ.A0F(r7)
        L_0x06d2:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227232is.A08(android.content.Context, X.2lD, X.GBj):void");
    }

    private final void A09(Bundle bundle) {
        C52272GLn gLn;
        if (this.A09 == null) {
            this.A0S = bundle;
            return;
        }
        String string = bundle.getString("source");
        if (string != null) {
            A00(this).A00 = string;
        }
        GBE gbe = this.A09;
        if (gbe == null) {
            0qQ.A0F("clipsViewerFragmentViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        ClipsViewerConfig A002 = A00(this);
        0qQ.A0B(A002, 2);
        ImmutableList immutableList = A002.A0E;
        if (immutableList != null && A002.A0J == ClipsViewerSource.CLIPS_NEARBY_PUSH) {
            bundle.putString("media_list", 0mp.A05(",", immutableList));
        }
        if (gbe.A22) {
            if (bundle.containsKey(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                gLn = new C52272GLn(bundle.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), (String) null, (String) null);
            } else if (bundle.containsKey("media_list")) {
                gLn = new C52272GLn((String) null, bundle.getString("media_list"), (String) null);
            } else if (bundle.containsKey("short_url")) {
                gLn = new C52272GLn((String) null, (String) null, bundle.getString("short_url"));
            } else {
                gLn = null;
            }
            gbe.A0J = gLn;
        } else {
            C52045GCr gCr = (C52045GCr) gbe.A1k.getValue();
            if (bundle.containsKey(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                gCr.A00 = bundle.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            } else if (bundle.containsKey("media_list")) {
                gCr.A01 = bundle.getString("media_list");
            } else if (bundle.containsKey("short_url")) {
                gCr.A02 = bundle.getString("short_url");
            }
        }
        C51979GAc gAc = gbe.A19;
        gAc.A00 = A002;
        gAc.A02 = null;
    }

    public static final void A0E(C267324bN r11, C227232is r12) {
        String str;
        1Xj r4 = r11.A02;
        GD6 gd6 = r12.A0C;
        if (gd6 == null) {
            str = "viewerAdapter";
        } else {
            AnonymousClass3W1 r6 = gd6.A0A.BzC(r11).A0E;
            if (A00(r12).A1x && r4 != null && r6 != null) {
                FragmentActivity requireActivity = r12.requireActivity();
                GBE gbe = r12.A09;
                str = "clipsViewerFragmentViewModel";
                if (gbe != null) {
                    AnonymousClass93T r7 = gbe.A1D;
                    C51979GAc gAc = gbe.A19;
                    I56.A00(requireActivity, A01(r12), r4, gAc, r6, r7, (String) null, C273654mx.A00(1431), 0, SaveApiUtil.A09(A01(r12), r4));
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final boolean A0I() {
        GBE gbe = this.A09;
        if (gbe == null) {
            0qQ.A0F("clipsViewerFragmentViewModel");
            throw AnonymousClass00P.createAndThrow();
        } else if (((GDS) gbe.A1g.getValue()).A07 == ClipsViewerSource.CLIPS_MULTI_ADS_WATCH_AND_BROWSE) {
            return I2T.A02(A01(this));
        } else {
            return true;
        }
    }

    public final C52029GCb A0L() {
        GBE gbe = this.A09;
        if (gbe == null) {
            0qQ.A0F("clipsViewerFragmentViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        C52029GCb gCb = gbe.A06;
        if (gCb != null) {
            return gCb;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final C52019GBq A0M() {
        C52019GBq gBq = this.A08;
        if (gBq != null) {
            return gBq;
        }
        0qQ.A0F("videoControllerDelegate");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C52012GBj A0N() {
        C52012GBj gBj = this.A0N;
        if (gBj != null) {
            return gBj;
        }
        0qQ.A0F("clipsViewerViewPager");
        throw AnonymousClass00P.createAndThrow();
    }

    public final GD9 A0O() {
        GBE gbe = this.A09;
        if (gbe != null) {
            return gbe.A1L;
        }
        0qQ.A0F("clipsViewerFragmentViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0P(C267324bN r19, Integer num) {
        1Xj r2 = r19.A02;
        if (r2 != null) {
            UserSession A012 = A01(this);
            String id = r2.getId();
            if (id == null) {
                id = "";
            }
            String A2Z = r2.A2Z();
            String moduleName = getModuleName();
            C71071Oaq.A01(this, A012, new N2M(GPK.DIRECT_INBOX_TRAY_STACK, r2.A1Q(), (ContentNotesImmersiveMimicryParams) null, num, (Integer) null, id, A2Z, moduleName, r2.A0C.BIl(), r2.A0C.getLoggingInfoToken(), (String) null, (String) null, false));
        }
    }

    public final void A0Q(List list, boolean z) {
        GD6 gd6 = this.A0C;
        if (gd6 == null) {
            0qQ.A0F("viewerAdapter");
            throw AnonymousClass00P.createAndThrow();
        } else {
            gd6.A0B(list, z);
        }
    }

    public final void A0R(boolean z) {
        String str;
        if (this.A08 != null && A0O().A02() != null) {
            C52019GBq gBq = this.A08;
            if (gBq == null) {
                str = "videoControllerDelegate";
            } else {
                C267324bN A022 = A0O().A02();
                0qQ.A0C(A022, "null cannot be cast to non-null type com.instagram.clips.model.ClipsItem");
                C52058GDe A042 = gBq.A04(A022);
                if (this.A09 == null) {
                    str = "clipsViewerFragmentViewModel";
                } else {
                    0qQ.A0B(A042, 0);
                    AnonymousClass3W1 r1 = A042.A0E;
                    if (r1 != null && r1.A1m != z) {
                        r1.A1m = z;
                        return;
                    }
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final /* synthetic */ boolean ABA() {
        return true;
    }

    public final String BCb() {
        GBE gbe = this.A09;
        if (gbe != null) {
            return gbe.BCb();
        }
        0qQ.A0F("clipsViewerFragmentViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C227762js BD0() {
        C52043GCp gCp = this.A0H;
        if (gCp != null) {
            return gCp.A03;
        }
        return null;
    }

    public final Integer BQo() {
        return AnonymousClass05K.A0C;
    }

    public final boolean COC() {
        return this.A1M;
    }

    public final /* synthetic */ boolean CV1() {
        return false;
    }

    public final boolean CW7() {
        GBE gbe = this.A09;
        if (gbe != null) {
            return gbe.CW7();
        }
        0qQ.A0F("clipsViewerFragmentViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CbJ() {
        if (this.A0H == null) {
            return false;
        }
        return true;
    }

    public final void DAt() {
        View view;
        GBE gbe = this.A09;
        String str = "clipsViewerFragmentViewModel";
        if (gbe != null) {
            GNH gnh = gbe.A0B;
            if (!(gnh == null || (view = gnh.A02) == null)) {
                view.setVisibility(0);
            }
            GBE gbe2 = this.A09;
            if (gbe2 != null) {
                GME gme = gbe2.A0H;
                if (gme != null) {
                    gme.A0H();
                }
                GBE gbe3 = this.A09;
                if (gbe3 != null) {
                    gbe3.A0n.A00();
                    C56024HrW hrW = this.A0K;
                    if (hrW == null) {
                        str = "drawerEventsDispatcher";
                    } else {
                        hrW.A00();
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DAw(C19140WMw wMw, float f, float f2, float f3) {
        GBE gbe = this.A09;
        if (gbe != null) {
            C234052wu r2 = gbe.A0d;
            boolean z = false;
            if (f2 == f3) {
                z = true;
            }
            if (z) {
                C56024HrW hrW = this.A0K;
                if (hrW != null) {
                    hrW.A01();
                    r2.onPause();
                    unregisterLifecycleListener(r2);
                    GBE gbe2 = this.A09;
                    if (gbe2 != null) {
                        AnonymousClass348 r0 = gbe2.A05;
                        if (r0 != null) {
                            r0.onPause();
                            return;
                        }
                        return;
                    }
                }
            } else if (f2 == 0.0f) {
                C56024HrW hrW2 = this.A0K;
                if (hrW2 != null) {
                    hrW2.A00();
                    r2.onResume();
                    GBE gbe3 = this.A09;
                    if (gbe3 != null) {
                        AnonymousClass348 r02 = gbe3.A05;
                        if (r02 != null) {
                            r02.onResume();
                        }
                        registerLifecycleListener(r2);
                        return;
                    }
                }
            } else {
                return;
            }
            0qQ.A0F("drawerEventsDispatcher");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("clipsViewerFragmentViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dcp() {
        SwipeRefreshLayout swipeRefreshLayout;
        GBE gbe = this.A09;
        if (gbe == null) {
            0qQ.A0F("clipsViewerFragmentViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        gbe.A0E();
        if (A00(this).A1p && !A00(this).A1q && (swipeRefreshLayout = this.A01) != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
    }

    public final 0jB E4x() {
        String str;
        0jB r4 = new 0jB();
        if (A00(this).A0J == ClipsViewerSource.DIRECT || A00(this).A0J == ClipsViewerSource.DIRECT_AD_FEED_OF_ADS) {
            if (182.A06(0Tu.A06, A01(this), 36318634297596244L)) {
                str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                r4.A0A("click_point", str);
                return r4;
            }
        }
        str = A00(this).A0J.A00;
        r4.A0A("click_point", str);
        return r4;
    }

    public final /* synthetic */ boolean Es5() {
        return false;
    }

    public final /* synthetic */ boolean Esq() {
        return true;
    }

    public final void FHu() {
        int i;
        SwipeRefreshLayout swipeRefreshLayout = this.A01;
        if (swipeRefreshLayout != null && !swipeRefreshLayout.A0G) {
            GBE gbe = this.A09;
            if (gbe == null) {
                0qQ.A0F("clipsViewerFragmentViewModel");
                throw AnonymousClass00P.createAndThrow();
            }
            HK9 hk9 = gbe.A0A;
            if (hk9 != null) {
                boolean A062 = 182.A06(0Tu.A05, hk9.A01, 36323530560711924L);
                C52012GBj gBj = hk9.A02;
                if (gBj != null && (i = hk9.A00 + 1) != gBj.A06() && i >= 0 && i <= gBj.A08()) {
                    gBj.A0I(i, A062);
                }
            }
        }
    }

    public final boolean getCanShowVoiceMessageBar() {
        return false;
    }

    public final String getModuleName() {
        GBE gbe = this.A09;
        if (gbe != null) {
            return gbe.A19.getModuleName();
        }
        return "UNKNOWN";
    }

    public final C227842k3 getStatusBarType() {
        return this.A1I;
    }

    public C227232is() {
        0eO r2 = 0eO.A02;
        this.A1K = AnonymousClass0eN.A00(r2, new AnonymousClass9N4((Object) this, "ClipsViewerLauncher.KEY_CONFIG", "ClipsViewerLauncher.KEY_CONFIG", 3));
        this.A0t = AnonymousClass1YB.A00(new AnonymousClass9LH(this, 19));
        this.A0w = AnonymousClass1YB.A00(new AnonymousClass9LH(this, 22));
        this.A0m = AnonymousClass1YB.A00(new AnonymousClass9LH(this, 13));
        this.A17 = AnonymousClass1YB.A00(new AnonymousClass9LH(this, 33));
        this.A19 = AnonymousClass1YB.A00(new AnonymousClass9LH(this, 35));
        this.A1C = AnonymousClass1YB.A00(new AnonymousClass9LY(this, 7));
        this.A0n = AnonymousClass1YB.A00(new AnonymousClass9LH(this, 14));
        this.A0o = AnonymousClass1YB.A00(GBK.A00);
        this.A18 = AnonymousClass1YB.A00(new AnonymousClass9LH(this, 34));
        this.A14 = AnonymousClass1YB.A00(new AnonymousClass9LH(this, 30));
        this.A1F = AnonymousClass1YB.A00(new AnonymousClass9LY(this, 18));
        this.A16 = AnonymousClass1YB.A00(new AnonymousClass9LH(this, 32));
        this.A15 = AnonymousClass1YB.A00(new AnonymousClass9LH(this, 31));
        this.A1E = AnonymousClass1YB.A00(new AnonymousClass9LY(this, 17));
        this.A10 = AnonymousClass1YB.A00(new AnonymousClass9LH(this, 26));
        this.A1A = AnonymousClass1YB.A00(new AnonymousClass9LY(this, 5));
        AnonymousClass9LH r10 = new AnonymousClass9LH(this, 29);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r2, new AnonymousClass9LY(new AnonymousClass9LY(this, 11), 12));
        this.A13 = new C227862kA(new AnonymousClass9LY(A002, 13), r10, new AnonymousClass9M1(45, (Object) null, A002), new 0Yh(C52065GDl.class));
        this.A0y = AnonymousClass1YB.A00(new AnonymousClass9LH(this, 24));
        AnonymousClass9LH r11 = new AnonymousClass9LH(this, 25);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(r2, new AnonymousClass9LY(new AnonymousClass9LY(this, 14), 15));
        this.A0z = new C227862kA(new AnonymousClass9LY(A003, 16), r11, new AnonymousClass9M1(46, (Object) null, A003), new 0Yh(GDE.class));
        this.A1B = new C227862kA(new AnonymousClass9LY(this, 9), new AnonymousClass9LY(this, 6), new AnonymousClass9M1(43, (Object) null, this), new 0Yh(GIY.class));
        this.A0q = AnonymousClass1YB.A00(new AnonymousClass9LH(this, 16));
        this.A0r = AnonymousClass1YB.A00(new AnonymousClass9LH(this, 17));
        this.A0s = AnonymousClass1YB.A00(new AnonymousClass9LH(this, 18));
        this.A0p = new C227862kA(new AnonymousClass9LY(this, 10), new AnonymousClass9LH(this, 15), new AnonymousClass9M1(44, (Object) null, this), new 0Yh(C357638Yz.class));
        this.A1D = AnonymousClass1YB.A00(new AnonymousClass9LY(this, 8));
        this.A11 = AnonymousClass1YB.A00(new AnonymousClass9LH(this, 27));
        this.A0R = System.currentTimeMillis();
        this.A00 = System.currentTimeMillis();
        this.A1G = new C57084INy(this);
        this.A0x = AnonymousClass0eN.A00(r2, new AnonymousClass9LH(this, 23));
        this.A0u = AnonymousClass1YB.A00(new AnonymousClass9LH(this, 20));
        this.A0v = AnonymousClass1YB.A00(new AnonymousClass9LH(this, 21));
        this.A12 = AnonymousClass0eN.A01(new AnonymousClass9LH(this, 28));
        this.A1M = true;
        this.A1H = new IOF(this);
        this.A1J = new C55925Hpn(this);
        this.A0l = new GQ1(this);
        this.A1I = C227842k3.FORCED_DARK_MODE;
    }

    private final void A04() {
        if (A00(this).A1y) {
            C317756nm.A02(requireActivity(), this, A01(this), true, false);
            if (2Y9.A00) {
                C317756nm.A00(requireActivity(), requireContext().getColor(R.color.fds_transparent));
            }
        }
    }

    private final void A06() {
        1wn r0;
        C267324bN A022;
        1Xj r02;
        C67231sQ clipsMetadata;
        JPD jpd;
        C54575HJk hJk;
        int A0B2;
        Window window = requireActivity().getWindow();
        if (window != null) {
            window.clearFlags(128);
        }
        GBE gbe = this.A09;
        if (gbe == null) {
            0qQ.A0F("clipsViewerFragmentViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        GYI gyi = gbe.A0r;
        if (gyi != null) {
            gyi.A00 = false;
        }
        ((GE6) gbe.A1W.getValue()).A00 = false;
        ((GE7) gbe.A1d.getValue()).A00 = false;
        ((GE8) gbe.A1T.getValue()).A00 = false;
        ((GCJ) gbe.A1V.getValue()).A00 = false;
        ((GCK) gbe.A1R.getValue()).A00 = false;
        ((GCL) gbe.A1X.getValue()).A00 = false;
        ((GE9) gbe.A1U.getValue()).A00 = false;
        ((GCM) gbe.A1Y.getValue()).A00 = false;
        GDS gds = (GDS) gbe.A1g.getValue();
        AnonymousClass3W1 r2 = gds.A0C;
        if (r2 != null) {
            r2.A0M(gds.A0B, (Integer) null, false);
        }
        UserSession userSession = gbe.A0a;
        if (1KU.A06(userSession)) {
            0qQ.A0B(userSession, 0);
            0Tu r22 = 0Tu.A05;
            if (!182.A06(r22, userSession, 36325918562137461L) && (182.A06(r22, userSession, 36325918562071924L) || 182.A06(r22, userSession, 36318509746428101L))) {
                C52166GHi.A00(userSession);
                C267324bN A023 = gbe.A1L.A02();
                if (!(A023 == null || (A0B2 = hJk.A0B(A023)) == -1)) {
                    List A0I2 = (hJk = gbe.A0q).A0I();
                    ArrayList A0U2 = 00k.A0U(A0I2.subList(A0B2 + 1, A0I2.size()));
                    C52185GIb gIb = gbe.A0t;
                    if (!gIb.A01 && gIb.A00) {
                        C229352nF r1 = gbe.A0X;
                        String str = gbe.A1O;
                        if (str != null) {
                            C294885nC A024 = r1.A02(str);
                            List list = A024.A03;
                            list.removeAll(A0U2);
                            for (C229372nH D3q : A024.A05) {
                                D3q.D3q(A024.A01, list, true, true);
                            }
                        }
                    }
                }
            }
        }
        gbe.A1K.A0N((C267324bN) null, "fragment_paused", false, true);
        1wY.A00(userSession);
        11Z.A00();
        11Z.A00();
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        Class<AnonymousClass3KT> cls = AnonymousClass3KT.class;
        C227232is r03 = gbe.A07;
        MusicAttributionConfig musicAttributionConfig = null;
        if (r03 != null) {
            r0 = r03.A0l;
        } else {
            r0 = null;
        }
        A002.A02(r0, cls);
        JU5 ju5 = gbe.A0e;
        C262224Cq r4 = ju5.A0N;
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, new C66161MFy(ju5, (AnonymousClass4D7) null, 0), r4);
        C227232is r04 = gbe.A07;
        if (!(r04 == null || (jpd = r04.A03) == null)) {
            jpd.Dyx();
        }
        if (0qQ.A0K(C71342cb.A00(userSession).A05, 1QK.A09.toString()) && 182.A06(0Tu.A06, userSession, 36319257067396187L) && (A022 = gbe.A1L.A02()) != null && (r02 = A022.A02) != null && (clipsMetadata = r02.A0C.getClipsMetadata()) != null) {
            if (C291335gz.A01(clipsMetadata) != null && !C291335gz.A03(clipsMetadata).A05) {
                musicAttributionConfig = C291335gz.A03(clipsMetadata);
            }
            0qQ.A0B(userSession, 0);
            ((C63713L3x) userSession.A01(C63713L3x.class, new C41656Ay8(userSession, 48))).A00 = musicAttributionConfig;
        }
    }

    public static final void A0A(C267324bN r11, C227232is r12) {
        Integer num;
        if (A00(r12).A22 || A00(r12).A1L != null || ((A00(r12).A12 != null && A00(r12).A0G == PollType.COMMENT_POLL) || !((num = A00(r12).A0e) == null || num == AnonymousClass05K.A0u))) {
            GBE gbe = r12.A09;
            if (gbe == null) {
                0qQ.A0F("clipsViewerFragmentViewModel");
                throw AnonymousClass00P.createAndThrow();
            }
            FragmentActivity requireActivity = r12.requireActivity();
            AnonymousClass5OB r3 = A00(r12).A0C;
            String str = A00(r12).A1L;
            A00(r12);
            ((GCT) gbe.A1f.getValue()).A00(requireActivity, r3, r11, (C52058GDe) null, (C273414mX) null, 0, str, false, A00(r12).A22, false);
        }
    }

    public static final void A0B(C267324bN r3, C227232is r4) {
        String str;
        if (0qQ.A0K(A00(r4).A11, "480")) {
            GBE gbe = r4.A09;
            if (gbe == null) {
                str = "clipsViewerFragmentViewModel";
            } else {
                GD6 gd6 = r4.A0C;
                if (gd6 == null) {
                    str = "viewerAdapter";
                } else {
                    C52058GDe BzC = gd6.A0A.BzC(r3);
                    0qQ.A0B(BzC, 1);
                    C52029GCb gCb = gbe.A06;
                    if (gCb != null) {
                        C52033GCf gCf = gCb.A0Y;
                        1Xj r0 = r3.A02;
                        if (r0 != null) {
                            C52034GCg gCg = gCf.A0H;
                            gCg.A00 = r3;
                            gCg.A02 = r0;
                            gCg.A01 = BzC;
                            gCg.A03 = BzC.A0E;
                            gCg.A0D(HNR.A10);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A0C(C267324bN r10, C227232is r11) {
        AnonymousClass33B r6;
        String str = A00(r11).A1N;
        1Xj r7 = r10.A02;
        GBE gbe = r11.A09;
        if (gbe != null) {
            AnonymousClass314 r0 = (AnonymousClass314) gbe.A1c.getValue();
            if (r0 != null) {
                r6 = r0.Aqg();
            } else {
                r6 = null;
            }
            if (r7 != null && str != null && str.length() != 0 && r6 != null) {
                I0Q i0q = I0Q.A00;
                Context requireContext = r11.requireContext();
                UserSession A012 = A01(r11);
                GBE gbe2 = r11.A09;
                if (gbe2 != null) {
                    i0q.A00(requireContext, A012, (AnonymousClass4GS) null, r6, r7, gbe2.A19, str, true);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("clipsViewerFragmentViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0D(C267324bN r3, C227232is r4) {
        if (A00(r4).A1w) {
            GBE gbe = r4.A09;
            if (gbe == null) {
                0qQ.A0F("clipsViewerFragmentViewModel");
                throw AnonymousClass00P.createAndThrow();
            }
            JTC jtc = (JTC) gbe.A1c.getValue();
            if (jtc != null) {
                jtc.DNX((View) null, r3, (C52058GDe) null, true);
            }
        }
    }

    public static final void A0F(AnonymousClass1i4 r9, C227232is r10, String str, String str2) {
        0wc A022 = AnonymousClass0kN.A02(A01(r10));
        String A042 = C61120lW.A04(A01(r10).A03.A06());
        String str3 = r9.A03;
        String str4 = r9.A06;
        String str5 = r9.A05;
        String str6 = r9.A00;
        0Aj A002 = A022.A00(A022.A00, C273654mx.A00(228));
        if (str3 == null) {
            str3 = "";
        }
        A002.AAJ("metric", str3);
        A002.AAJ("action", str2);
        if (str == null) {
            str = "";
        }
        A002.AAJ("media_id", str);
        A002.AAJ("actor_id", A01(r10).A06);
        if (str4 == null) {
            str4 = "";
        }
        A002.AAJ("tip_stage", str4);
        A002.AAJ("interface", "Android");
        A002.AAJ("app_version", A042);
        A002.AAJ("tip_id", str5);
        A002.AAJ("channel_id", str6);
        A002.Cgf();
    }

    public static final void A0G(C227232is r4) {
        Dc2 dc2;
        if (182.A06(0Tu.A06, A01(r4), 36325703813248151L) && (dc2 = r4.A06) != null) {
            1xC.A01.A00(new AnonymousClass3GR(dc2));
        }
    }

    private final boolean A0H() {
        2Zg A022 = A02();
        boolean z = true;
        if (A022 != null) {
            if (A022.C3W().A01 != 0.0f) {
                z = false;
            }
            this.A0P = z;
        }
        return z;
    }

    private final boolean A0J() {
        UserSession A012 = A01(this);
        0Tu r4 = 0Tu.A05;
        if (!182.A06(r4, A012, 36325918562727294L)) {
            return false;
        }
        return 00l.A0Q(182.A04(r4, A01(this), 36888868516201277L), new char[]{','}, 0).contains(A00(this).A0J.name());
    }

    public final View A0K() {
        C52012GBj gBj;
        if (!isAdded() || (gBj = this.A0N) == null) {
            return null;
        }
        return gBj.A0A(gBj.A06());
    }

    public final String BjP() {
        1Xj r0;
        C267324bN A022 = A0O().A02();
        if (A022 == null || (r0 = A022.A02) == null) {
            return null;
        }
        return r0.A0C.getLoggingInfoToken();
    }

    public final boolean Cda() {
        return 182.A06(0Tu.A05, A01(this), 36317560555509074L);
    }

    public final void DV0(C71162bE r6) {
        float f;
        int A032 = AnonymousClass0fD.A03(873483314);
        if (this.A0P && !A0H()) {
            if (2Y9.A00) {
                C317756nm.A00(requireActivity(), requireContext().getColor(R.color.fds_transparent));
            }
            this.A0P = false;
        }
        if (A0H()) {
            A05();
        } else {
            2Zg A022 = A02();
            if (A022 != null) {
                float f2 = A022.C3W().A01;
                if (f2 > 0.0f) {
                    f = 1.0f - f2;
                } else {
                    f = 1.0f + f2;
                }
                if (f == 0.0f) {
                    A06();
                    C317756nm.A00(requireActivity(), requireContext().getColor(R.color.fds_transparent));
                    if (2bA.A07(A01(this))) {
                        A04();
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(1321154200, A032);
    }

    public final void Dk4() {
        1Xj r5;
        C267324bN A022 = A0O().A02();
        if (A022 != null && (r5 = A022.A02) != null) {
            C246353eS.A05(this, C246353eS.A00(AnonymousClass818.IG_REELS_OVERFLOW_MENU, new C64545Ldm(), A01(this), r5, AnonymousClass05K.A0C), A01(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (r0.A06() == 0) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean EBF() {
        /*
            r9 = this;
            com.instagram.common.session.UserSession r2 = A01(r9)
            X.0Tu r7 = X.0Tu.A05
            r0 = 36323530560646387(0x810c0f000e2cf3, double:3.034485217445893E-306)
            boolean r0 = X.182.A06(r7, r2, r0)
            r8 = 0
            if (r0 != 0) goto L_0x003d
            com.instagram.common.session.UserSession r2 = A01(r9)
            r0 = 36323496200121538(0x810c0700022cc2, double:3.0344634877116195E-306)
            boolean r2 = X.182.A06(r7, r2, r0)
            java.lang.String r1 = "clipsViewerViewPager"
            r4 = 1
            X.GBj r0 = r9.A0N
            if (r2 == 0) goto L_0x003e
            if (r0 == 0) goto L_0x008f
            int r0 = r0.A07()
            if (r0 != 0) goto L_0x0047
            com.instagram.common.session.UserSession r2 = A01(r9)
            r0 = 36323496199990464(0x810c0700002cc0, double:3.034463487628728E-306)
            boolean r0 = X.182.A06(r7, r2, r0)
            if (r0 == 0) goto L_0x0047
        L_0x003d:
            return r8
        L_0x003e:
            if (r0 == 0) goto L_0x008f
            int r0 = r0.A06()
            if (r0 != 0) goto L_0x003d
            goto L_0x008b
        L_0x0047:
            com.instagram.common.session.UserSession r2 = A01(r9)
            r0 = 36323496200056001(0x810c0700012cc1, double:3.0344634876701736E-306)
            boolean r0 = X.182.A06(r7, r2, r0)
            if (r0 == 0) goto L_0x006f
            com.instagram.common.session.UserSession r2 = A01(r9)
            r0 = 36604971176891551(0x820c070003149f, double:3.212469396429733E-306)
            long r5 = X.182.A01(r7, r2, r0)
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r9.A0R
            long r2 = r2 - r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x006f
            return r8
        L_0x006f:
            long r0 = java.lang.System.currentTimeMillis()
            r9.A0R = r0
            com.instagram.common.session.UserSession r2 = A01(r9)
            r0 = 36328323743366376(0x81106b00023ce8, double:3.0375164454986114E-306)
            boolean r0 = X.182.A06(r7, r2, r0)
            if (r0 == 0) goto L_0x008b
            android.view.View r0 = r9.mView
            if (r0 == 0) goto L_0x008b
            r0.performHapticFeedback(r4)
        L_0x008b:
            r9.Dcp()
            return r4
        L_0x008f:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227232is.EBF():boolean");
    }

    public final void EKl() {
        AnonymousClass37D A012;
        if (!182.A06(0Tu.A05, A01(this), 36321889882220364L)) {
            C267324bN A022 = A0O().A02();
            1Xj r1 = null;
            if (A022 != null) {
                r1 = A022.A02;
            }
            if (GED.A03(A01(this), r1) && (A012 = AnonymousClass37D.A00.A01(requireActivity())) != null) {
                A012.A0B();
            }
            C52012GBj gBj = this.A0N;
            if (gBj == null) {
                0qQ.A0F("clipsViewerViewPager");
                throw AnonymousClass00P.createAndThrow();
            } else {
                gBj.A0I(0, true);
            }
        }
    }

    public final boolean Ez8() {
        return A00(this).A25;
    }

    public final String getMediaId() {
        1Xj r0;
        C267324bN A022 = A0O().A02();
        if (A022 == null || (r0 = A022.A02) == null) {
            return null;
        }
        return r0.getId();
    }

    public final AnonymousClass0wW getSession() {
        return A01(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: X.4bN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            super.onActivityResult(r8, r9, r10)
            r0 = 9783(0x2637, float:1.3709E-41)
            if (r8 != r0) goto L_0x0071
            if (r10 == 0) goto L_0x0106
            android.os.Bundle r2 = r10.getExtras()
            if (r2 == 0) goto L_0x0106
            java.lang.String r0 = "action_type"
            java.lang.String r1 = r2.getString(r0)
            java.lang.String r0 = "clips_quality_survey"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00e9
            r0 = 2336(0x920, float:3.273E-42)
            java.lang.String r6 = X.C273654mx.A00(r0)
            java.lang.String r5 = X.C320236s2.A01(r2, r6)
            r0 = 345(0x159, float:4.83E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r4 = X.C320236s2.A01(r2, r0)
            java.lang.String r0 = "tracking_token"
            java.lang.String r3 = X.C320236s2.A01(r2, r0)
            com.instagram.common.session.UserSession r1 = A01(r7)
            X.GBE r0 = r7.A09
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = "clipsViewerFragmentViewModel"
        L_0x0041:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0049:
            X.GAc r0 = r0.A19
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r1)
            java.lang.String r1 = "instagram_organic_reels_survey_exit"
            X.0kJ r0 = r2.A00
            X.0Aj r1 = r2.A00(r0, r1)
            r1.AAJ(r6, r5)
            java.lang.String r0 = "m_pk"
            r1.AAJ(r0, r4)
            java.lang.String r0 = "simple_action_tracking_token"
            r1.AAJ(r0, r3)
            r1.Cgf()
            r0 = -1
            if (r9 != r0) goto L_0x00e9
            X.GD6 r1 = r7.A0C
            if (r1 != 0) goto L_0x00b1
            java.lang.String r0 = "viewerAdapter"
            goto L_0x0041
        L_0x0071:
            r0 = 4921(0x1339, float:6.896E-42)
            if (r8 == r0) goto L_0x0079
            r0 = 4928(0x1340, float:6.906E-42)
            if (r8 != r0) goto L_0x00e9
        L_0x0079:
            r6 = 1
            if (r9 == r6) goto L_0x007f
            r0 = 2
            if (r9 != r0) goto L_0x00e9
        L_0x007f:
            X.GD9 r0 = r7.A0O()
            X.4bN r0 = r0.A02()
            if (r0 == 0) goto L_0x00e9
            X.1Xj r5 = r0.A02
            if (r5 == 0) goto L_0x00e9
            com.instagram.common.session.UserSession r4 = A01(r7)
            X.Ldm r3 = new X.Ldm
            r3.<init>()
            com.instagram.common.session.UserSession r2 = A01(r7)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.818 r0 = X.AnonymousClass818.IG_REELS_OVERFLOW_MENU
            X.LAG r2 = X.C246353eS.A00(r0, r3, r2, r5, r1)
            android.content.Context r1 = r7.requireContext()
            if (r9 != r6) goto L_0x00ae
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x00aa:
            X.C246353eS.A03(r1, r2, r4, r0)
            goto L_0x00e9
        L_0x00ae:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x00aa
        L_0x00b1:
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.GBg r1 = r1.A0A
            X.5o2 r0 = X.C295365o2.SURVEY
            java.util.List r0 = r1.A0K(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x00c1:
            boolean r0 = r3.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x00de
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.4bN r0 = (X.C267324bN) r0
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x00d7
            java.lang.String r2 = r0.getId()
        L_0x00d7:
            boolean r0 = X.0qQ.A0K(r2, r4)
            if (r0 == 0) goto L_0x00c1
            r2 = r1
        L_0x00de:
            X.4bN r2 = (X.C267324bN) r2
            if (r2 == 0) goto L_0x00e9
            X.4bO r1 = r2.A0G
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.clips.model.SurveyClipsImpressionItem"
            X.0qQ.A0C(r1, r0)
        L_0x00e9:
            com.instagram.clips.intf.ClipsViewerConfig r0 = A00(r7)
            com.instagram.clips.intf.ClipsViewerSource r1 = r0.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CREATOR_INSPIRATION_HUB
            if (r1 != r0) goto L_0x0106
            r1 = 9683(0x25d3, float:1.3569E-41)
            if (r9 != r1) goto L_0x0106
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            r0.setResult(r1)
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            r0.finish()
            return
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227232is.onActivityResult(int, int, android.content.Intent):void");
    }

    public final boolean onBackPressed() {
        String str;
        1Xj r0;
        C57690Iet iet;
        String str2;
        String str3 = null;
        if (A00(this).A0J == ClipsViewerSource.PROFILE || A00(this).A0J == ClipsViewerSource.SELF_PROFILE) {
            GBE gbe = this.A09;
            str = "clipsViewerFragmentViewModel";
            if (gbe != null) {
                String str4 = gbe.A1O;
                if (str4 != null) {
                    C229352nF r2 = gbe.A0X;
                    int A012 = A0O().A01();
                    C294885nC r02 = (C294885nC) r2.A01.get(str4);
                    if (r02 != null) {
                        r02.A00 = A012;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        ClipsViewerDirectData clipsViewerDirectData = A00(this).A0I;
        boolean z = true;
        if (clipsViewerDirectData == null || !clipsViewerDirectData.A09) {
            z = false;
        }
        if (z && (iet = this.A0k) != null) {
            Intent intent = new Intent();
            if (!(clipsViewerDirectData == null || (str2 = clipsViewerDirectData.A02) == null)) {
                intent.putExtra("ClipsConstants.ARG_PLAY_PILE_THREAD_ID", str2);
            }
            intent.putStringArrayListExtra("ClipsConstants.ARG_PLAY_PILE_SEEN_IDS", iet.A01);
            intent.putStringArrayListExtra("ClipsConstants.ARG_PLAY_PILE_SEEN_USER_IDS", iet.A02);
            intent.putStringArrayListExtra("ClipsConstants.ARG_PLAY_PILE_SEEN_CLIENT_CONTEXTS", iet.A00);
            requireActivity().setResult(-1, intent);
        }
        if (A00(this).A0J == ClipsViewerSource.CREATOR_INSPIRATION_HUB) {
            Intent intent2 = new Intent();
            C267324bN A022 = A0O().A02();
            if (!(A022 == null || (r0 = A022.A02) == null)) {
                str3 = r0.getId();
            }
            intent2.putExtra(AnonymousClass000.A00(99), str3);
            requireActivity().setResult(-1, intent2);
        }
        C56042Hrp hrp = this.A0J;
        if (hrp == null) {
            str = "overlayFragmentController";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C331157Pu r03 = hrp.A03;
        boolean z2 = true;
        if (r03 == null || !r03.A0T()) {
            z2 = false;
            if (2Y9.A00) {
                C317756nm.A00(requireActivity(), requireContext().getColor(R.color.fds_transparent));
                return false;
            }
        }
        return z2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r70v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v2, resolved type: X.2j4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r69v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v3, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v8, resolved type: X.2is} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r99v1, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v65, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v66, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: X.2is} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v11, resolved type: X.07Z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v13, resolved type: X.2is} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v6, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r52v8, resolved type: X.2is} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r53v12, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v20, resolved type: X.07Z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r59v17, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r60v13, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v14, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v10, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r67v7, resolved type: X.2ix} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r80v3, resolved type: X.2is} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v4, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v434, resolved type: X.HK6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v436, resolved type: X.HK7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v26, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v534, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v547, resolved type: X.HK7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v24, resolved type: X.HK7} */
    /* JADX WARNING: type inference failed for: r20v4 */
    /* JADX WARNING: type inference failed for: r50v22, types: [X.GNL] */
    /* JADX WARNING: type inference failed for: r50v23, types: [X.GCD] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x230e: MOVE  (r2v347 X.2ZP) = (r2v346 X.2ZP)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x14aa  */
    /* JADX WARNING: Removed duplicated region for block: B:492:0x1510  */
    /* JADX WARNING: Removed duplicated region for block: B:507:0x1551  */
    /* JADX WARNING: Removed duplicated region for block: B:512:0x1561  */
    public final void onCreate(android.os.Bundle r143) {
        /*
            r142 = this;
            r0 = 33936406(0x205d416, float:9.832162E-38)
            int r49 = X.AnonymousClass0fD.A02(r0)
            r0 = r142
            r27 = r143
            r1 = r27
            X.C227232is.super.onCreate(r1)
            android.os.Bundle r31 = r0.requireArguments()
            android.content.Context r48 = r0.requireContext()
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            androidx.fragment.app.FragmentActivity r4 = r0.getActivity()
            com.instagram.common.session.UserSession r3 = A01(r0)
            X.Hn9 r25 = new X.Hn9
            r2 = r25
            r1 = r48
            r2.<init>(r5, r1, r4, r3)
            com.instagram.common.session.UserSession r2 = A01(r0)
            X.Hjt r42 = new X.Hjt
            r1 = r42
            r1.<init>(r2)
            androidx.fragment.app.Fragment r4 = r0.mParentFragment
            r29 = 0
            if (r4 == 0) goto L_0x005c
            com.instagram.common.session.UserSession r3 = A01(r0)
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.9jL r1 = new X.9jL
            r1.<init>(r3, r2)
            X.2YN r2 = new X.2YN
            r2.<init>(r1, r4)
            java.lang.Class<X.Jgx> r1 = X.C60178Jgx.class
            X.2YL r29 = r2.A00(r1)
            r1 = r29
            X.Jgx r1 = (X.C60178Jgx) r1
            r29 = r1
        L_0x005c:
            com.instagram.common.session.UserSession r1 = A01(r0)
            com.instagram.clips.intf.ClipsViewerConfig r7 = A00(r0)
            X.0gy r6 = X.AnonymousClass07i.A00(r0)
            X.0eM r2 = r0.A0w
            java.lang.Object r3 = r2.getValue()
            X.A6u r3 = (X.C39729A6u) r3
            X.0eM r2 = r0.A0m
            r141 = r2
            java.lang.Object r20 = r141.getValue()
            r2 = r20
            X.GAc r2 = (X.C51979GAc) r2
            r20 = r2
            r2 = 44
            X.9LH r15 = new X.9LH
            r15.<init>(r0, r2)
            androidx.fragment.app.FragmentActivity r19 = r0.requireActivity()
            X.0eM r2 = r0.A0t
            r140 = r2
            java.lang.Object r18 = r140.getValue()
            r2 = r18
            X.HJk r2 = (X.C54575HJk) r2
            r18 = r2
            r2 = 47
            X.9LH r21 = new X.9LH
            r4 = r21
            r4.<init>(r0, r2)
            r4 = 48
            X.9LH r53 = new X.9LH
            r2 = r53
            r2.<init>(r0, r4)
            r4 = 49
            X.9LH r52 = new X.9LH
            r2 = r52
            r2.<init>(r0, r4)
            r8 = 0
            X.9LY r33 = new X.9LY
            r2 = r33
            r2.<init>(r0, r8)
            r45 = 1
            X.9LY r26 = new X.9LY
            r4 = r26
            r2 = r45
            r4.<init>(r0, r2)
            X.0eM r2 = r0.A14
            java.lang.Object r17 = r2.getValue()
            r2 = r17
            X.H3C r2 = (X.H3C) r2
            r17 = r2
            r2 = r45
            X.0qQ.A0B(r1, r2)
            r36 = 2
            r2 = r36
            X.0qQ.A0B(r7, r2)
            r2 = 4
            X.0qQ.A0B(r3, r2)
            r2 = 8
            r4 = r20
            X.0qQ.A0B(r4, r2)
            r4 = 13
            r2 = r18
            X.0qQ.A0B(r2, r4)
            r32 = 19
            X.93T r2 = r3.A00
            r127 = r2
            X.GF2 r2 = r3.A02
            r128 = r2
            java.lang.String r2 = r3.A03
            r74 = r2
            X.Hlh r2 = r3.A01
            r126 = r2
            X.GAn r24 = new X.GAn
            r2 = r24
            r2.<init>(r1)
            java.lang.String r3 = r20.getModuleName()
            r2 = r127
            X.GKY r23 = X.C52020GBr.A00(r1, r2, r3)
            X.0Tu r4 = X.0Tu.A05
            r2 = 36318140377274275(0x810728001717a3, double:3.031076443776843E-306)
            boolean r2 = X.182.A06(r4, r1, r2)
            if (r2 == 0) goto L_0x0127
            X.34K r2 = X.AnonymousClass34J.A00(r1)
            r3 = r23
            r2.A00 = r3
        L_0x0127:
            X.4h5 r14 = new X.4h5
            r14.<init>(r1)
            X.GIb r16 = new X.GIb
            r2 = r16
            r2.<init>(r7, r1, r15)
            java.lang.String r62 = r20.getModuleName()
            r46 = 0
            r54 = r46
            r55 = r23
            r56 = r7
            r57 = r1
            r58 = r18
            r59 = r2
            r60 = r14
            r61 = r128
            r63 = r21
            X.4hF r22 = X.C270704hA.A00(r54, r55, r56, r57, r58, r59, r60, r61, r62, r63)
            X.AnonymousClass2bO.A00()
            r44 = 4
            com.instagram.quickpromotion.intf.QPTooltipAnchor r3 = com.instagram.quickpromotion.intf.QPTooltipAnchor.SHOPPING_ICON
            X.2qQ r2 = new X.2qQ
            r2.<init>()
            X.0eP r11 = new X.0eP
            r11.<init>(r3, r2)
            com.instagram.quickpromotion.intf.QPTooltipAnchor r3 = com.instagram.quickpromotion.intf.QPTooltipAnchor.CLIPS_VIEWER_OVERFLOW_ICON_WITH_INSIGHTS
            X.KW6 r2 = new X.KW6
            r2.<init>()
            X.0eP r10 = new X.0eP
            r10.<init>(r3, r2)
            com.instagram.quickpromotion.intf.QPTooltipAnchor r3 = com.instagram.quickpromotion.intf.QPTooltipAnchor.CLIPS_LIKE_BUTTON
            X.KW7 r2 = new X.KW7
            r2.<init>()
            X.0eP r9 = new X.0eP
            r9.<init>(r3, r2)
            com.instagram.quickpromotion.intf.QPTooltipAnchor r5 = com.instagram.quickpromotion.intf.QPTooltipAnchor.CLIPS_CONTENT_APPRECIATION_BUTTON
            X.KW8 r3 = new X.KW8
            r3.<init>()
            X.0eP r2 = new X.0eP
            r2.<init>(r5, r3)
            X.0eP[] r2 = new X.0eP[]{r11, r10, r9, r2}
            java.util.LinkedHashMap r3 = X.0Yt.A06(r2)
            r2 = r45
            X.0qQ.A0B(r3, r2)
            X.2qT r30 = new X.2qT
            r2 = r30
            r2.<init>(r1, r3)
            r3 = r18
            r2 = r20
            r2.A01 = r3
            X.GD9 r37 = new X.GD9
            r2 = r37
            r3 = r21
            r2.<init>(r15, r3)
            X.GE0 r41 = new X.GE0
            r3 = r41
            r3.<init>(r1, r0, r2)
            X.2el r39 = X.2el.A00()
            int r2 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            r59 = 499007346(0x1dbe3f72, float:5.0358182E-21)
            java.lang.String r58 = r20.getModuleName()
            X.02m r56 = X.02m.A0p
            X.0qQ.A07(r56)
            X.2lJ r40 = new X.2lJ
            r54 = r40
            r55 = r48
            r54.<init>(r55, r56, r57, r58, r59)
            X.2mA r3 = new X.2mA
            r2 = r40
            r3.<init>(r2)
            X.GJv r13 = new X.GJv
            r13.<init>(r1, r3)
            java.lang.Integer r10 = X.AnonymousClass05K.A0Y
            X.2qB r9 = new X.2qB
            r5 = r46
            r9.<init>(r5, r5, r2)
            X.57M r47 = new X.57M
            r3 = r47
            r2 = r39
            r3.<init>(r1, r2, r9, r10)
            r28 = 23
            X.IwK r3 = new X.IwK
            r2 = r28
            r3.<init>(r1, r2)
            java.lang.Class<X.Hlg> r2 = X.C55683Hlg.class
            java.lang.Object r12 = r1.A01(r2, r3)
            X.Hlg r12 = (X.C55683Hlg) r12
            com.instagram.clips.intf.ClipsViewerSource r5 = r7.A0J
            com.instagram.clips.intf.ClipsViewerSource r43 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_TAB
            r2 = r43
            if (r5 != r2) goto L_0x23cd
            X.02m r9 = X.02m.A0p
            X.0qQ.A07(r9)
            X.6sO r50 = new X.6sO
            r3 = r50
            r2 = r41
            r3.<init>(r9, r2)
            X.02m r9 = X.02m.A0p
            X.0qQ.A07(r9)
            X.GLu r51 = new X.GLu
            r3 = r51
            r3.<init>(r9, r2)
            r2.A00 = r3
        L_0x021c:
            boolean r3 = r7.A1i
            r2 = r45
            X.0qQ.A0B(r5, r2)
            if (r3 != 0) goto L_0x23c9
            com.instagram.clips.intf.ClipsViewerSource r2 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_MEDIA_NOTES_NOTIF_CHAIN
            if (r5 == r2) goto L_0x23c9
            r139 = 1
            boolean r2 = X.1KU.A06(r1)
            if (r2 == 0) goto L_0x23af
            r2 = 36320197665759335(0x810907000a2067, double:3.0323774812988305E-306)
            boolean r2 = X.182.A06(r4, r1, r2)
            if (r2 != 0) goto L_0x23af
            r139 = 0
        L_0x023e:
            X.0rm r70 = new X.0rm
            r70.<init>()
            if (r139 == 0) goto L_0x23ab
            X.GLd r11 = new X.GLd
            r11.<init>()
            X.0wX r2 = r1.A03
            android.content.Context r2 = r2.A06()
            java.lang.String r10 = r7.A0o
            X.6z9 r9 = new X.6z9
            r9.<init>(r2, r6, r1, r10)
            boolean r3 = r7.A1t
            boolean r2 = r7.A1U
            X.GLR r116 = new X.GLR
            r54 = r116
            r55 = r50
            r56 = r22
            r58 = r9
            r59 = r11
            r60 = r10
            r61 = r3
            r62 = r2
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62)
            r2 = r70
            r2.A00 = r11
        L_0x0274:
            java.lang.String r9 = r7.A0o
            r38 = 42
            X.J6f r3 = new X.J6f
            r10 = r38
            r2 = r70
            r3.<init>(r2, r10)
            X.GCH r2 = new X.GCH
            r54 = r2
            r55 = r48
            r56 = r6
            r57 = r50
            r58 = r22
            r59 = r20
            r60 = r1
            r61 = r9
            r62 = r3
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62)
            X.GMD r81 = X.GNS.A00(r1)
            X.0qQ.A07(r81)
            X.3DW r95 = X.AnonymousClass3DV.A00(r1)
            X.2wt r73 = new X.2wt
            r6 = r73
            r3 = r20
            r6.<init>(r0, r1, r3)
            java.lang.String r10 = r5.A00
            X.GE1 r72 = new X.GE1
            r54 = r72
            r56 = r1
            r57 = r0
            r58 = r10
            r59 = r15
            r54.<init>(r55, r56, r57, r58, r59)
            java.lang.String r11 = r7.A02
            if (r11 != 0) goto L_0x02c5
            java.lang.String r11 = X.C228022kf.A00(r31)
        L_0x02c5:
            X.GJx r71 = new X.GJx
            r3 = r71
            r3.<init>(r1, r15)
            X.0rm r69 = new X.0rm
            r69.<init>()
            X.1YN r54 = X.AnonymousClass2bO.A00()
            com.instagram.quickpromotion.intf.QuickPromotionSlot r59 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0F
            X.AnonymousClass2bO.A00()
            X.576 r9 = new X.576
            r9.<init>(r3)
            X.JUD r6 = new X.JUD
            r5 = r30
            r3 = r69
            r6.<init>(r5, r3)
            X.2bW r58 = X.2bV.A07(r6, r5, r9)
            r55 = r0
            r56 = r20
            r57 = r1
            X.2qi r9 = r54.A01(r55, r56, r57, r58, r59)
            r3 = r69
            r3.A00 = r9
            java.lang.String r68 = "qpFragmentPresenter"
            X.GDx r67 = new X.GDx
            r54 = r67
            r55 = r24
            r56 = r7
            r58 = r9
            r59 = r20
            r54.<init>(r55, r56, r57, r58, r59)
            X.GII r6 = new X.GII
            r3 = r67
            r6.<init>(r3)
            X.HnV r66 = new X.HnV
            r5 = r66
            r3 = r30
            r5.<init>(r1, r9, r3, r6)
            r35 = 26
            X.Ivl r3 = new X.Ivl
            r6 = r35
            r3.<init>(r5, r6)
            java.lang.String r59 = r20.getModuleName()
            X.Hrq r114 = new X.Hrq
            r54 = r114
            r55 = r19
            r56 = r1
            r57 = r39
            r58 = r20
            r60 = r11
            r61 = r3
            r54.<init>(r55, r56, r57, r58, r59, r60, r61)
            X.02m r6 = X.02m.A0p
            X.0qQ.A07(r6)
            X.GCx r65 = new X.GCx
            r5 = r65
            r3 = r37
            r5.<init>(r6, r1, r3, r10)
            X.JU5 r90 = X.C63289KuY.A00(r1)
            X.HqD r31 = new X.HqD
            r3 = r31
            r3.<init>(r15)
            r3 = r126
            java.lang.String r9 = r3.A00
            r34 = 25
            X.Ivl r5 = new X.Ivl
            r6 = r34
            r3 = r21
            r5.<init>(r3, r6)
            X.4O0 r99 = new X.4O0
            r54 = r99
            r55 = r7
            r57 = r20
            r58 = r127
            r59 = r31
            r60 = r9
            r61 = r5
            r54.<init>(r55, r56, r57, r58, r59, r60, r61)
            java.lang.String r5 = "audio"
            r3 = r48
            java.lang.Object r3 = r3.getSystemService(r5)
            java.lang.String r5 = "null cannot be cast to non-null type android.media.AudioManager"
            X.0qQ.A0C(r3, r5)
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            r5 = 36315533330615647(0x8104c900000d5f, double:3.029427736972192E-306)
            boolean r109 = X.182.A06(r4, r1, r5)
            r5 = 36315533330746720(0x8104c900020d60, double:3.029427737055083E-306)
            boolean r110 = X.182.A06(r4, r1, r5)
            r5 = 36315533330877794(0x8104c900040d62, double:3.029427737137975E-306)
            boolean r111 = X.182.A06(r4, r1, r5)
            r5 = 36315533330943331(0x8104c900050d63, double:3.029427737179421E-306)
            boolean r112 = X.182.A06(r4, r1, r5)
            X.GBn r64 = new X.GBn
            r96 = r64
            r97 = r48
            r98 = r3
            r100 = r7
            r101 = r18
            r102 = r20
            r103 = r1
            r104 = r90
            r105 = r18
            r106 = r33
            r107 = r53
            r108 = r52
            r96.<init>(r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112)
            X.GCA r63 = new X.GCA
            r63.<init>()
            X.GHv r62 = new X.GHv
            r52 = r62
            r53 = r48
            r54 = r0
            r55 = r20
            r57 = r64
            r52.<init>(r53, r54, r55, r56, r57)
            r5 = r63
            r3 = r62
            r5.A00(r3)
            X.0h9 r6 = r0.mLifecycleRegistry
            X.0qQ.A07(r6)
            X.Ies r61 = new X.Ies
            r5 = r61
            r3 = r18
            r5.<init>(r6, r3, r1)
            java.lang.String r56 = r20.getModuleName()
            X.TrX r96 = new X.TrX
            r52 = r96
            r53 = r19
            r54 = r1
            r57 = r11
            r52.<init>(r53, r54, r55, r56, r57)
            X.GE3 r60 = new X.GE3
            r52 = r60
            r53 = r48
            r55 = r0
            r56 = r12
            r57 = r37
            r52.<init>(r53, r54, r55, r56, r57)
            X.GD0 r59 = new X.GD0
            r3 = r59
            r3.<init>(r7, r15)
            X.GJw r58 = new X.GJw
            r133 = r58
            r134 = r7
            r135 = r1
            r136 = r40
            r137 = r116
            r138 = r2
            r133.<init>(r134, r135, r136, r137, r138, r139)
            java.lang.String r3 = r7.A1I
            X.GLg r5 = new X.GLg
            r5.<init>(r1, r3)
            if (r17 == 0) goto L_0x0437
            r6 = r64
            r3 = r17
            r6.A94(r3)
        L_0x0437:
            r3 = r126
            X.4h6 r3 = r3.A01
            r2.A03(r3)
            java.lang.String r88 = r20.getModuleName()
            X.GJu r3 = new X.GJu
            r82 = r3
            r83 = r48
            r84 = r7
            r85 = r1
            r86 = r16
            r87 = r42
            r89 = r15
            r82.<init>(r83, r84, r85, r86, r87, r88, r89)
            r2.A03(r3)
            r3 = r60
            r2.A03(r3)
            r3 = r127
            r2.A03(r3)
            r3 = r128
            r2.A03(r3)
            r3 = r41
            r2.A03(r3)
            if (r50 == 0) goto L_0x0478
            X.GLt r6 = new X.GLt
            r3 = r50
            r6.<init>(r3, r1)
            r2.A03(r6)
        L_0x0478:
            r3 = r72
            r2.A03(r3)
            r2.A03(r13)
            r3 = r65
            r2.A03(r3)
            boolean r9 = X.1KU.A03(r1)
            X.GLf r6 = new X.GLf
            r3 = r48
            r6.<init>(r1, r3, r9)
            r2.A03(r6)
            r3 = r59
            X.4h6 r3 = r3.A05
            r2.A03(r3)
            r2.A03(r14)
            r3 = r58
            r2.A03(r3)
            r2.A03(r5)
            r5 = 36324299358941141(0x810cc200012fd5, double:3.0349714085831974E-306)
            boolean r3 = X.182.A06(r4, r1, r5)
            if (r3 == 0) goto L_0x04c2
            r3 = r45
            X.0qQ.A0B(r10, r3)
            X.02m r5 = X.02m.A0p
            X.0qQ.A07(r5)
            X.GJy r3 = new X.GJy
            r3.<init>(r5, r10)
            r2.A03(r3)
        L_0x04c2:
            if (r17 == 0) goto L_0x04c9
            r3 = r17
            r2.A03(r3)
        L_0x04c9:
            boolean r3 = X.AnonymousClass3YR.A02(r1)
            if (r3 == 0) goto L_0x0593
            r3 = r74
            X.4bN r13 = X.GDY.A00(r7, r1, r3)
            java.lang.String r10 = r7.A1H
            X.Ivl r5 = new X.Ivl
            r3 = r32
            r5.<init>(r0, r3)
            r6 = 20
            X.Ivl r3 = new X.Ivl
            r3.<init>(r0, r6)
            X.B5B r12 = new X.B5B
            r12.<init>(r13, r5, r3)
            X.0t1 r3 = X.0eE.A00(r1)
            com.instagram.user.model.User r3 = r3.A00()
            X.4Cl r3 = r3.A03
            java.lang.String r3 = r3.getFbidV2()
            if (r3 == 0) goto L_0x0587
            X.2IV r6 = new X.2IV
            r6.<init>()
            java.lang.String r5 = "INSTAGRAM_USER_FBID_V2"
            java.lang.String r9 = "key"
            r6.A09(r5, r9)
            java.lang.String r5 = "value"
            r6.A09(r3, r5)
            if (r10 == 0) goto L_0x0587
            X.2IV r3 = new X.2IV
            r3.<init>()
            java.lang.String r11 = "INSTAGRAM_MEDIA_IGID"
            r3.A09(r11, r9)
            r3.A09(r10, r5)
            X.2IV[] r3 = new X.2IV[]{r6, r3}
            java.util.List r9 = X.0sr.A1P(r3)
            X.2IV r6 = new X.2IV
            r6.<init>()
            java.lang.String r5 = "AYMT_INSTAGRAM_REELS_SELF_VIEW_CHANNEL"
            java.lang.String r3 = "channel_name"
            r6.A09(r5, r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r45)
            java.lang.String r3 = "max_tips"
            r6.A07(r5, r3)
            java.lang.String r3 = "extra_params"
            r6.A05(r3, r9)
            X.2IS r3 = new X.2IS
            r3.<init>()
            X.2IS r9 = new X.2IS
            r9.<init>()
            java.lang.String r5 = "input"
            r3.A00(r6, r5)
            X.2IY r5 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r98 = X.AnonymousClass1vS.A00()
            java.util.Map r100 = r3.getParamsCopy()
            java.util.Map r101 = r9.getParamsCopy()
            java.lang.Class<X.B5A> r102 = X.B5A.class
            java.util.ArrayList r108 = new java.util.ArrayList
            r108.<init>()
            java.lang.String r99 = "CreatorSelfViewInsights"
            java.lang.String r107 = "xfb_aymt_instagram_graphql_channel_tip"
            com.facebook.pando.PandoGraphQLRequest r9 = new com.facebook.pando.PandoGraphQLRequest
            r97 = r9
            r103 = r8
            r104 = r46
            r105 = r8
            r106 = r46
            r97.<init>(r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108)
            X.1vn r6 = X.1vm.A01(r1)
            X.0qQ.A0A(r9)
            X.PzU r5 = new X.PzU
            r5.<init>(r12)
            X.Smg r3 = new X.Smg
            r3.<init>(r12)
            r6.ATL(r3, r5, r9)
        L_0x0587:
            if (r13 == 0) goto L_0x0593
            X.1Xj r3 = r13.A02
            if (r3 == 0) goto L_0x0593
            X.1i4 r5 = r3.A0c
            r3 = r45
            r5.A08 = r3
        L_0x0593:
            X.HK5 r11 = new X.HK5
            r5 = r19
            r3 = r64
            r11.<init>(r5, r1, r3)
            r3 = r63
            r3.A00(r11)
            X.GE4 r57 = new X.GE4
            r5 = r57
            r3 = r64
            r5.<init>(r1, r3)
            X.GYI r56 = new X.GYI
            r6 = r56
            r5 = r20
            r3 = r127
            r6.<init>(r1, r5, r3)
            X.Hlf r55 = new X.Hlf
            r5 = r55
            r3 = r22
            r5.<init>(r3, r1)
            X.IRC r54 = new X.IRC
            r5 = r54
            r3 = r21
            r5.<init>(r15, r3)
            X.GIN r53 = new X.GIN
            r97 = r53
            r98 = r48
            r99 = r0
            r100 = r7
            r101 = r1
            r102 = r29
            r103 = r20
            r104 = r127
            r105 = r126
            r106 = r15
            r97.<init>(r98, r99, r100, r101, r102, r103, r104, r105, r106)
            r5 = r63
            r3 = r53
            r5.A00(r3)
            X.1Av r103 = X.1Au.A00(r1)
            X.GI5 r111 = new X.GI5
            r97 = r111
            r98 = r19
            r99 = r7
            r100 = r18
            r101 = r20
            r102 = r1
            r104 = r64
            r105 = r21
            r97.<init>(r98, r99, r100, r101, r102, r103, r104, r105, r106)
            X.GE2 r52 = new X.GE2
            r97 = r52
            r98 = r48
            r101 = r1
            r102 = r20
            r103 = r127
            r105 = r15
            r106 = r21
            r97.<init>(r98, r99, r100, r101, r102, r103, r104, r105, r106)
            X.GE5 r105 = new X.GE5
            r74 = r105
            r75 = r48
            r76 = r18
            r77 = r1
            r78 = r20
            r79 = r21
            r80 = r15
            r74.<init>(r75, r76, r77, r78, r79, r80)
            X.HqC r29 = new X.HqC
            r6 = r29
            r5 = r52
            r3 = r26
            r6.<init>(r5, r3)
            java.lang.String r3 = r20.getModuleName()
            X.Ah8 r14 = new X.Ah8
            r14.<init>(r3)
            r3 = r126
            java.lang.String r9 = r3.A00
            r26 = 24
            X.Ivl r6 = new X.Ivl
            r5 = r21
            r3 = r26
            r6.<init>(r5, r3)
            X.How r129 = new X.How
            r117 = r129
            r118 = r48
            r119 = r7
            r120 = r20
            r121 = r1
            r122 = r127
            r123 = r31
            r124 = r9
            r125 = r6
            r117.<init>(r118, r119, r120, r121, r122, r123, r124, r125)
            r33 = 21
            X.Ivl r13 = new X.Ivl
            r3 = r33
            r13.<init>(r1, r3)
            r32 = 22
            X.Ivl r12 = new X.Ivl
            r3 = r32
            r12.<init>(r1, r3)
            X.Ivl r10 = new X.Ivl
            r3 = r28
            r10.<init>(r1, r3)
            r31 = 18
            X.Ivl r9 = new X.Ivl
            r3 = r31
            r9.<init>(r1, r3)
            X.2nF r82 = X.C229342nE.A00(r1)
            X.0qQ.A07(r82)
            r3 = r70
            java.lang.Object r6 = r3.A00
            X.GLd r6 = (X.C52262GLd) r6
            r3 = r69
            java.lang.Object r5 = r3.A00
            if (r5 != 0) goto L_0x069d
            X.0qQ.A0F(r68)
        L_0x0698:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x069d:
            X.2qi r5 = (X.C231002qi) r5
            X.GBE r3 = new X.GBE
            r74 = r3
            r76 = r19
            r77 = r23
            r78 = r24
            r79 = r50
            r80 = r51
            r83 = r7
            r84 = r22
            r86 = r39
            r87 = r25
            r88 = r54
            r89 = r73
            r91 = r40
            r92 = r47
            r93 = r5
            r94 = r30
            r97 = r71
            r98 = r29
            r99 = r65
            r100 = r58
            r101 = r18
            r102 = r56
            r103 = r61
            r104 = r16
            r106 = r59
            r107 = r14
            r108 = r62
            r109 = r63
            r110 = r11
            r112 = r52
            r113 = r66
            r115 = r53
            r117 = r17
            r118 = r60
            r119 = r20
            r120 = r55
            r121 = r2
            r122 = r41
            r123 = r72
            r124 = r127
            r125 = r126
            r126 = r67
            r127 = r6
            r130 = r57
            r131 = r64
            r132 = r37
            r133 = r13
            r134 = r12
            r135 = r10
            r136 = r9
            r137 = r15
            r138 = r21
            r74.<init>(r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139)
            X.GJw r1 = r3.A0p
            r1.A00 = r0
            r3.A07 = r0
            X.0eM r1 = r0.A17
            r22 = r1
            java.lang.Object r2 = r22.getValue()
            X.I4A r2 = (X.I4A) r2
            X.9LR r1 = new X.9LR
            r5 = r28
            r1.<init>(r3, r5)
            r2.A00 = r1
            r0.A09 = r3
            com.instagram.common.session.UserSession r1 = A01(r0)
            boolean r1 = X.1KU.A09(r1)
            java.lang.String r16 = "clipsViewerFragmentViewModel"
            if (r1 != 0) goto L_0x073f
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            com.instagram.clips.intf.ClipsViewerSource r1 = r1.A0J
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x074a
        L_0x073f:
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.4hF r2 = r1.A0Z
            r1 = r48
            r2.ESn(r1)
        L_0x074a:
            X.0eM r1 = r0.A0x
            java.lang.Object r6 = r1.getValue()
            X.93a r6 = (X.C3728893a) r6
            if (r6 == 0) goto L_0x07b5
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GAc r1 = r1.A19
            java.lang.String r3 = r1.getModuleName()
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.93T r1 = r1.A1D
            java.lang.String r7 = r1.A01
            java.lang.String r5 = r1.A00
            X.0qQ.A0B(r3, r8)
            r1 = r45
            X.0qQ.A0B(r7, r1)
            r1 = r36
            X.0qQ.A0B(r5, r1)
            boolean r1 = r6.A00
            if (r1 != 0) goto L_0x07b5
            X.C3728893a.A02(r6)
            X.0XK r1 = new X.0XK
            r1.<init>()
            java.lang.String r9 = "analytics_module"
            r2 = r45
            r1.A00(r9, r3, r2)
            r10 = 10
            r9 = 73
            r2 = r38
            java.lang.String r9 = X.Dbn.A00(r2, r10, r9)
            r2 = r45
            r1.A00(r9, r7, r2)
            java.lang.String r7 = "chaining_session_id"
            r1.A00(r7, r5, r2)
            X.02m r6 = X.C3728893a.A00(r6)
            r7 = 976032351(0x3a2d125f, float:6.602164E-4)
            r9 = 7
            java.lang.String r2 = "create_viewer_"
            java.lang.String r10 = X.002.A0R(r2, r3)
            long r12 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS
            r11 = r1
            r15 = r8
            r6.markerPoint(r7, r8, r9, r10, r11, r12, r14, r15)
        L_0x07b5:
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            com.instagram.clips.intf.ClipsViewerSource r1 = r1.A0J
            boolean r1 = r1.A01()
            if (r1 == 0) goto L_0x07d5
            com.instagram.common.session.UserSession r1 = A01(r0)
            X.GTq r2 = X.GM4.A00(r1)
            X.0JR r1 = r2.A08
            long r5 = r1.now()
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r2.A07 = r1
        L_0x07d5:
            X.HrW r1 = new X.HrW
            r1.<init>()
            r0.A0K = r1
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            com.instagram.clips.intf.ClipsViewerSource r1 = r1.A0J
            r126 = r1
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            com.instagram.clips.intf.ClipsViewerSource r2 = r1.A0J
            r1 = r43
            if (r2 != r1) goto L_0x238e
            java.lang.String r1 = "clips_viewer_clips_tab"
        L_0x07f0:
            r0.setModuleNameV2(r1)
            com.instagram.common.session.UserSession r1 = A01(r0)
            X.0qQ.A0B(r1, r8)
            X.02m r2 = X.02m.A0p
            X.0qQ.A07(r2)
            X.GPE r1 = new X.GPE
            r1.<init>(r2)
            r0.A03 = r1
            X.GBE r5 = r0.A09
            if (r5 == 0) goto L_0x0bc5
            com.instagram.common.session.UserSession r1 = A01(r0)
            X.2cc r3 = X.C71342cb.A00(r1)
            java.lang.String r18 = "ClipsViewerFragment"
            X.GE0 r1 = r5.A1B
            android.content.Context r2 = r5.A0Q
            X.0qQ.A0B(r2, r8)
            X.GIQ r1 = r1.A05
            r1.A0R(r2, r3, r0)
            java.lang.String r2 = "fragment"
            r3 = r18
            r1.A0J(r2, r3)
            com.instagram.clips.intf.ClipsViewerConfig r2 = r5.A0Y
            com.instagram.clips.intf.ClipsViewerSource r2 = r2.A0J
            java.lang.String r3 = r2.A00
            X.0qQ.A0B(r3, r8)
            java.lang.String r2 = "version"
            r5 = r28
            r1.A0G(r2, r5)
            r2 = 4609(0x1201, float:6.459E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r1.A0J(r2, r3)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GLu r2 = r1.A0V
            if (r2 == 0) goto L_0x085b
            boolean r1 = r2.A00
            if (r1 == 0) goto L_0x085b
            X.02m r5 = r2.A01
            r3 = 749808675(0x2cb12c23, float:5.0355427E-12)
            r5.markerStart(r3)
            java.lang.String r2 = "logger_version"
            r1 = r45
            r5.markerAnnotate(r3, r2, r1)
        L_0x085b:
            r17 = 0
            r2 = r43
            r1 = r126
            if (r1 != r2) goto L_0x0865
            r17 = 1
        L_0x0865:
            if (r17 == 0) goto L_0x088a
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GE0 r1 = r1.A1B
            r0.addLoggerListener(r1)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GE0 r3 = r1.A1B
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = "ON_CREATE"
            java.lang.String r2 = r1.toLowerCase(r2)
            X.0qQ.A07(r2)
            java.lang.String r1 = "_start"
            java.lang.String r1 = X.002.A0R(r2, r1)
            r3.CmM(r1)
        L_0x088a:
            com.instagram.common.session.UserSession r3 = A01(r0)
            X.0qQ.A0B(r3, r8)
            r30 = 15
            X.Ivj r2 = new X.Ivj
            r1 = r30
            r2.<init>(r3, r1)
            java.lang.Class<X.GJS> r1 = X.GJS.class
            java.lang.Object r2 = r3.A01(r1, r2)
            X.GJS r2 = (X.GJS) r2
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.93T r1 = r1.A1D
            r2.A00 = r1
            com.instagram.common.session.UserSession r2 = A01(r0)
            java.lang.String r1 = r0.getModuleName()
            X.34L r7 = new X.34L
            r7.<init>(r2, r1)
            com.instagram.common.session.UserSession r6 = A01(r0)
            java.lang.String r5 = r0.getModuleName()
            com.instagram.common.session.UserSession r3 = A01(r0)
            r20 = 0
            X.0qQ.A0B(r3, r8)
            r1 = 36315520449711452(0x8104c6003d0d5c, double:3.029419591036512E-306)
            boolean r1 = X.182.A06(r4, r3, r1)
            if (r1 == 0) goto L_0x2388
            r1 = 36878470403063989(0x8304c6003c00b5, double:3.3854314083541706E-306)
            java.lang.String r9 = X.182.A04(r4, r3, r1)
            r1 = 36878470402998452(0x8304c6003b00b4, double:3.385431408312725E-306)
            java.lang.String r1 = X.182.A04(r4, r3, r1)
            X.34N r3 = X.AnonymousClass34M.A01(r9)
            X.34P r2 = X.AnonymousClass34O.A00(r1)
            X.34Q r1 = new X.34Q
            r1.<init>(r3, r2)
        L_0x08f2:
            X.34R r2 = new X.34R
            r2.<init>(r6, r1, r5)
            com.instagram.common.session.UserSession r1 = A01(r0)
            X.1wY r3 = X.1wY.A00(r1)
            java.lang.String r1 = r0.getModuleName()
            java.lang.Integer r5 = X.1wY.A0F
            X.0qQ.A08(r5)
            r3.A07(r7, r2, r1)
            androidx.fragment.app.FragmentActivity r11 = r0.requireActivity()
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GAc r1 = r1.A19
            com.instagram.common.session.UserSession r12 = A01(r0)
            X.GAd r86 = new X.GAd
            r9 = r86
            r10 = r0
            r13 = r1
            r14 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            X.GAe r53 = new X.GAe
            r1 = r53
            r1.<init>(r0)
            com.instagram.common.session.UserSession r3 = A01(r0)
            r1 = 36318556988512500(0x810789000e18f4, double:3.031339910401455E-306)
            boolean r1 = X.182.A06(r4, r3, r1)
            if (r1 != 0) goto L_0x094e
            com.instagram.common.session.UserSession r3 = A01(r0)
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            java.lang.String r2 = r1.A1F
            java.lang.String r1 = r0.getModuleName()
            boolean r1 = X.AnonymousClass71K.A0B(r3, r2, r1)
            r2 = 0
            if (r1 == 0) goto L_0x094f
        L_0x094e:
            r2 = 1
        L_0x094f:
            X.GAf r29 = new X.GAf
            r1 = r29
            r1.<init>(r2)
            X.0h9 r1 = r0.mLifecycleRegistry
            r21 = r1
            X.0qQ.A07(r21)
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.07V r58 = r1.getLifecycle()
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.Hlh r1 = r1.A1E
            java.lang.String r1 = r1.A00
            r19 = r1
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            java.lang.String r15 = r1.A1B
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.2el r14 = r1.A0b
            com.instagram.common.session.UserSession r61 = A01(r0)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GAc r13 = r1.A19
            X.93T r12 = r1.A1D
            X.0eM r1 = r0.A1D
            r95 = r1
            java.lang.Object r9 = r95.getValue()
            java.lang.String r9 = (java.lang.String) r9
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.57M r7 = r1.A0g
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            com.instagram.search.common.analytics.SearchContext r6 = r1.A0S
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            com.instagram.clips.model.metadata.PlaylistContext r5 = r1.A0O
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.HJk r1 = r1.A0q
            java.util.List r73 = r1.A0I()
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.0eM r1 = r1.A1Z
            java.lang.Object r3 = r1.getValue()
            X.GAh r3 = (X.C51984GAh) r3
            X.0eM r1 = r0.A0u
            r74 = r1
            java.lang.Object r2 = r74.getValue()
            X.2pL r2 = (X.C230292pL) r2
            com.instagram.clips.intf.ClipsViewerConfig r11 = A00(r0)
            X.GAi r1 = com.instagram.api.schemas.IntentAwareAdsInfoIntf.A00
            X.GAj r10 = r1.A00()
            java.lang.Integer r1 = r11.A0d
            r10.A02 = r1
            java.lang.String r1 = r11.A19
            r10.A06 = r1
            com.instagram.api.schemas.IntentAwareAdsInfoIntf r1 = r10.A00()
            com.instagram.api.schemas.IntentAwareAdsInfo r59 = r1.F5F()
            androidx.fragment.app.FragmentActivity r56 = r0.getActivity()
            X.GAk r1 = new X.GAk
            r54 = r1
            r55 = r48
            r57 = r21
            r60 = r5
            r62 = r14
            r63 = r13
            r64 = r2
            r65 = r7
            r66 = r6
            r67 = r12
            r68 = r29
            r69 = r3
            r70 = r19
            r71 = r15
            r72 = r9
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73)
            com.instagram.common.session.UserSession r3 = A01(r0)
            X.6ag r24 = new X.6ag
            r5 = r24
            r2 = r48
            r5.<init>(r2, r3)
            com.instagram.common.session.UserSession r5 = A01(r0)
            r2 = 36325768238347479(0x810e18000a34d7, double:3.035900333834468E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            com.instagram.common.session.UserSession r10 = A01(r0)
            if (r2 == 0) goto L_0x2373
            androidx.fragment.app.FragmentActivity r9 = r0.requireActivity()
            X.0hq r58 = r0.getParentFragmentManager()
            java.lang.String r2 = r0.getModuleName()
            X.0xG r7 = new X.0xG
            r7.<init>(r2)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.2el r6 = r2.A0b
            X.Dcn r5 = new X.Dcn
            r5.<init>(r0)
            r2 = 18297539933700933(0x41018400030345, double:1.8919714473026774E-307)
            boolean r2 = X.1AW.A06(r4, r2)
            if (r2 == 0) goto L_0x0a58
            boolean r2 = r9 instanceof X.AnonymousClass2ZY
            if (r2 == 0) goto L_0x236d
            r2 = r9
            X.2ZY r2 = (X.AnonymousClass2ZY) r2
            X.0hq r58 = r2.AuV()
            if (r58 == 0) goto L_0x236d
        L_0x0a58:
            X.2nI r2 = new X.2nI
            r54 = r2
            r55 = r46
            r56 = r46
            r57 = r9
            r59 = r46
            r60 = r7
            r61 = r10
            r62 = r5
            r63 = r6
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62, r63)
        L_0x0a6f:
            r0.A02 = r2
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GLu r3 = r2.A0V
            X.GBC r52 = new X.GBC
            r2 = r52
            r2.<init>(r3)
            X.9LY r11 = new X.9LY
            r2 = r36
            r11.<init>(r0, r2)
            r2 = 36
            X.9LH r5 = new X.9LH
            r5.<init>(r0, r2)
            X.0eO r9 = X.0eO.A02
            r3 = 37
            X.9LH r2 = new X.9LH
            r2.<init>(r5, r3)
            X.0eM r10 = X.AnonymousClass0eN.A00(r9, r2)
            java.lang.Class<X.GDR> r2 = X.GDR.class
            X.0Yh r7 = new X.0Yh
            r7.<init>(r2)
            r2 = 38
            X.9LH r6 = new X.9LH
            r6.<init>(r10, r2)
            r5 = 41
            X.9M1 r3 = new X.9M1
            r2 = r46
            r3.<init>(r5, r2, r10)
            X.2kA r21 = new X.2kA
            r2 = r21
            r2.<init>(r6, r11, r3, r7)
            r25 = 3
            X.9LY r10 = new X.9LY
            r2 = r25
            r10.<init>(r0, r2)
            r2 = 39
            X.9LH r6 = new X.9LH
            r6.<init>(r0, r2)
            r3 = 40
            X.9LH r2 = new X.9LH
            r2.<init>(r6, r3)
            X.0eM r9 = X.AnonymousClass0eN.A00(r9, r2)
            java.lang.Class<X.GL0> r2 = X.GL0.class
            X.0Yh r7 = new X.0Yh
            r7.<init>(r2)
            X.9LH r6 = new X.9LH
            r6.<init>(r9, r5)
            X.9M1 r5 = new X.9M1
            r3 = r38
            r2 = r46
            r5.<init>(r3, r2, r9)
            X.2kA r19 = new X.2kA
            r2 = r19
            r2.<init>(r6, r10, r5, r7)
            com.instagram.common.session.UserSession r7 = A01(r0)
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GAc r5 = r2.A19
            X.2xi r3 = new X.2xi
            r2 = r46
            r3.<init>(r6, r2, r7, r5)
            r0.A0a = r3
            com.instagram.common.session.UserSession r7 = A01(r0)
            com.instagram.common.session.UserSession r5 = A01(r0)
            r2 = -1
            X.328 r3 = new X.328
            r3.<init>(r0, r2)
            java.lang.Object r2 = r141.getValue()
            X.GAc r2 = (X.C51979GAc) r2
            X.32A r6 = new X.32A
            r6.<init>(r2, r5, r3)
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GE5 r3 = r2.A0u
            X.GBD r2 = new X.GBD
            r2.<init>(r5, r7, r6, r3)
            r0.A0h = r2
            androidx.fragment.app.FragmentActivity r55 = r0.requireActivity()
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            boolean r91 = r2.A0V()
            com.instagram.common.session.UserSession r61 = A01(r0)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GAc r2 = r2.A19
            r83 = r2
            com.instagram.clips.intf.ClipsViewerConfig r60 = A00(r0)
            X.0eM r2 = r0.A0z
            java.lang.Object r51 = r2.getValue()
            r2 = r51
            X.GDE r2 = (X.GDE) r2
            r51 = r2
            java.lang.Object r50 = r22.getValue()
            r2 = r50
            X.I4A r2 = (X.I4A) r2
            r50 = r2
            X.0eM r2 = r0.A1C
            r94 = r2
            java.lang.Object r47 = r94.getValue()
            r2 = r47
            X.GBI r2 = (X.GBI) r2
            r47 = r2
            X.0eM r2 = r0.A0n
            java.lang.Object r41 = r2.getValue()
            r2 = r41
            X.GBJ r2 = (X.GBJ) r2
            r41 = r2
            X.0eM r2 = r0.A0o
            java.lang.Object r40 = r2.getValue()
            r2 = r40
            X.Hew r2 = (X.C55267Hew) r2
            r40 = r2
            X.0eM r2 = r0.A18
            java.lang.Object r39 = r2.getValue()
            r2 = r39
            X.GBL r2 = (X.GBL) r2
            r39 = r2
            X.0eM r2 = r0.A1F
            r93 = r2
            java.lang.Object r15 = r93.getValue()
            X.GBM r15 = (X.GBM) r15
            X.0eM r2 = r0.A16
            java.lang.Object r14 = r2.getValue()
            X.GBN r14 = (X.GBN) r14
            X.0eM r2 = r0.A15
            java.lang.Object r13 = r2.getValue()
            X.Dci r13 = (X.C46340Dci) r13
            X.0eM r2 = r0.A1E
            java.lang.Object r12 = r2.getValue()
            X.Dcj r12 = (X.C46341Dcj) r12
            X.0eM r2 = r0.A10
            java.lang.Object r11 = r2.getValue()
            X.JU3 r11 = (X.JU3) r11
            X.GBD r2 = r0.A0h
            r37 = r2
            if (r2 != 0) goto L_0x0bca
            java.lang.String r16 = "profilePictureNavigator"
        L_0x0bc5:
            X.0qQ.A0F(r16)
            goto L_0x0698
        L_0x0bca:
            X.0eM r2 = r0.A1A
            java.lang.Object r9 = r2.getValue()
            X.GBO r9 = (X.GBO) r9
            X.GBE r5 = r0.A09
            if (r5 == 0) goto L_0x0bc5
            X.HJk r2 = r5.A0q
            r66 = r2
            X.HrW r2 = r0.A0K
            r28 = r2
            if (r2 != 0) goto L_0x0be7
            java.lang.String r37 = "drawerEventsDispatcher"
        L_0x0be2:
            X.0qQ.A0F(r37)
            goto L_0x0698
        L_0x0be7:
            X.2nI r2 = r0.A02
            r23 = r2
            if (r2 != 0) goto L_0x0bf0
            java.lang.String r37 = "bloksHost"
            goto L_0x0be2
        L_0x0bf0:
            X.9LR r22 = new X.9LR
            r3 = r22
            r2 = r26
            r3.<init>(r0, r2)
            X.JPD r2 = r0.A03
            r59 = r2
            X.0eM r2 = r5.A1Z
            java.lang.Object r7 = r2.getValue()
            X.GAh r7 = (X.C51984GAh) r7
            java.lang.Object r6 = r74.getValue()
            X.2pL r6 = (X.C230292pL) r6
            java.lang.Object r5 = r21.getValue()
            X.GDR r5 = (X.GDR) r5
            java.lang.Object r3 = r19.getValue()
            X.GL0 r3 = (X.GL0) r3
            X.GBE r10 = r0.A09
            if (r10 == 0) goto L_0x0bc5
            X.GF2 r2 = r10.A1H
            r87 = r2
            X.H3C r2 = r10.A17
            r26 = r2
            boolean r92 = r0.Cda()
            X.2xi r2 = r0.A0a
            r10 = r2
            if (r2 != 0) goto L_0x0c2f
            java.lang.String r16 = "zoomController"
            goto L_0x0bc5
        L_0x0c2f:
            X.GD6 r2 = new X.GD6
            r54 = r2
            r56 = r48
            r57 = r0
            r58 = r23
            r62 = r6
            r63 = r24
            r64 = r10
            r65 = r7
            r67 = r1
            r68 = r51
            r69 = r28
            r70 = r26
            r71 = r39
            r72 = r47
            r73 = r13
            r74 = r11
            r75 = r9
            r76 = r37
            r77 = r12
            r78 = r40
            r79 = r15
            r80 = r14
            r81 = r41
            r82 = r50
            r84 = r52
            r85 = r53
            r88 = r5
            r89 = r3
            r90 = r22
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92)
            r0.A0C = r2
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.HJk r5 = r3.A0q
            java.lang.String r28 = "viewerAdapter"
            boolean r3 = r2.A0F
            r5.A00 = r3
            com.instagram.common.session.UserSession r5 = A01(r0)
            X.B55 r3 = new X.B55
            r3.<init>(r5, r2)
            r0.A0F = r3
            X.GD6 r5 = r0.A0C
            if (r5 == 0) goto L_0x23a6
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GHv r3 = r2.A0x
            X.0qQ.A0B(r3, r8)
            java.util.List r2 = r5.A0D
            r2.add(r3)
            X.GBe r3 = r5.A0C
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r3.A06 = r2
            com.instagram.common.session.UserSession r5 = A01(r0)
            r2 = 36315348647152787(0x81049e00020c93, double:3.029310942406619E-306)
            boolean r57 = X.182.A06(r4, r5, r2)
            r11 = 1
            if (r57 == 0) goto L_0x0dc5
            com.instagram.common.session.UserSession r5 = A01(r0)
            r2 = 36315348647087250(0x81049e00010c92, double:3.029310942365173E-306)
            boolean r5 = X.182.A06(r4, r5, r2)
            com.instagram.common.session.UserSession r6 = A01(r0)
            r2 = 36315348647218324(0x81049e00030c94, double:3.029310942448065E-306)
            boolean r6 = X.182.A06(r4, r6, r2)
            com.instagram.common.session.UserSession r7 = A01(r0)
            r2 = 36596823623993984(0x82049e00040a80, double:3.2073168511697496E-306)
            long r2 = X.182.A01(r4, r7, r2)
            int r9 = (int) r2
            com.instagram.common.session.UserSession r7 = A01(r0)
            r2 = 2342158357860715665(0x2081049e00000c91, double:4.061641927474995E-152)
            boolean r2 = X.182.A06(r4, r7, r2)
            com.facebook.video.heroplayer.ipc.HeroScrollSetting r7 = new com.facebook.video.heroplayer.ipc.HeroScrollSetting
            r7.<init>(r9, r5, r6, r2)
        L_0x0ceb:
            com.instagram.common.session.UserSession r53 = A01(r0)
            X.GD6 r9 = r0.A0C
            if (r9 == 0) goto L_0x23a6
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            boolean r6 = r2.A21
            X.HJk r5 = r2.A0q
            com.instagram.common.session.UserSession r10 = A01(r0)
            r2 = 36315533330615647(0x8104c900000d5f, double:3.029427736972192E-306)
            boolean r58 = X.182.A06(r4, r10, r2)
            com.instagram.clips.intf.ClipsViewerConfig r52 = A00(r0)
            X.GBj r2 = new X.GBj
            r50 = r2
            r51 = r7
            r54 = r5
            r55 = r9
            r56 = r6
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58)
            r0.A0N = r2
            X.GD6 r3 = r0.A0C
            if (r3 == 0) goto L_0x23a6
            X.GBm r2 = new X.GBm
            r2.<init>(r3)
            r0.A0G = r2
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GE5 r3 = r2.A0u
            X.GBn r2 = r2.A1K
            r2.A94(r3)
            r1.A02(r3)
            com.instagram.common.session.UserSession r53 = A01(r0)
            X.GD6 r7 = r0.A0C
            if (r7 == 0) goto L_0x23a6
            com.instagram.common.session.UserSession r3 = A01(r0)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GAc r2 = r2.A19
            X.GBo r6 = new X.GBo
            r6.<init>(r2, r3)
            com.instagram.clips.intf.ClipsViewerConfig r52 = A00(r0)
            com.instagram.common.session.UserSession r2 = A01(r0)
            X.1Av r54 = X.1Au.A00(r2)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GAc r2 = r2.A19
            java.lang.String r58 = r2.getModuleName()
            X.9LH r5 = new X.9LH
            r2 = r38
            r5.<init>(r0, r2)
            r2 = 43
            X.9LH r3 = new X.9LH
            r3.<init>(r0, r2)
            X.GBp r2 = new X.GBp
            r50 = r2
            r51 = r48
            r55 = r0
            r56 = r7
            r57 = r6
            r59 = r5
            r60 = r3
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.GBn r3 = r3.A1K
            r3.A94(r2)
            X.GBj r3 = r0.A0N
            java.lang.String r26 = "clipsViewerViewPager"
            if (r3 == 0) goto L_0x1cbc
            r3.A0J(r2)
            r1.A01(r2)
            r1.A02(r2)
            r0.A0E = r2
            X.GD9 r55 = r0.A0O()
            X.GD6 r5 = r0.A0C
            if (r5 == 0) goto L_0x23a6
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.GBq r2 = new X.GBq
            r50 = r2
            r51 = r0
            r52 = r0
            r53 = r3
            r54 = r5
            r50.<init>(r51, r52, r53, r54, r55)
            r0.A08 = r2
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GBn r5 = r2.A1K
            X.GE0 r3 = r2.A1B
            monitor-enter(r5)
            goto L_0x0dce
        L_0x0dc5:
            r3 = -16
            com.facebook.video.heroplayer.ipc.HeroScrollSetting r7 = new com.facebook.video.heroplayer.ipc.HeroScrollSetting
            r7.<init>(r3, r8, r8, r11)
            goto L_0x0ceb
        L_0x0dce:
            X.0qQ.A0B(r3, r8)     // Catch:{ all -> 0x240e }
            java.util.Set r2 = r5.A0J     // Catch:{ all -> 0x240e }
            r2.add(r3)     // Catch:{ all -> 0x240e }
            monitor-exit(r5)
            X.GD6 r5 = r0.A0C
            if (r5 == 0) goto L_0x23a6
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GBn r3 = r2.A1K
            if (r3 == 0) goto L_0x0de7
            X.GBe r2 = r5.A0C
            r2.A05 = r3
        L_0x0de7:
            r5.A01 = r3
            com.instagram.common.session.UserSession r3 = A01(r0)
            r2 = r48
            X.3KG r2 = X.AnonymousClass3KF.A00(r2, r3)
            r0.A0V = r2
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GE4 r2 = r2.A1J
            com.instagram.common.session.UserSession r5 = r2.A01
            r2 = 36326498382198566(0x810ec200013726, double:3.036362079745949E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 != 0) goto L_0x0e13
            r2 = 36326498382395176(0x810ec200043728, double:3.036362079870286E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 == 0) goto L_0x0e25
        L_0x0e13:
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GE4 r2 = r2.A1J
            r1.A02(r2)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GE4 r2 = r2.A1J
            r1.A01(r2)
        L_0x0e25:
            com.instagram.clips.intf.ClipsViewerConfig r2 = A00(r0)
            com.instagram.clips.intf.ClipsViewerDirectData r6 = r2.A0I
            if (r6 == 0) goto L_0x103a
            boolean r2 = r6.A04
            if (r2 == 0) goto L_0x103a
            boolean r2 = r6.A0C
            if (r2 != 0) goto L_0x103a
            boolean r2 = r6.A08
            if (r2 != 0) goto L_0x103a
            boolean r2 = r6.A06
            if (r2 != 0) goto L_0x103a
        L_0x0e3d:
            com.instagram.clips.intf.ClipsViewerSource r3 = com.instagram.clips.intf.ClipsViewerSource.DIRECT
            r2 = r126
            if (r2 == r3) goto L_0x0e47
            com.instagram.clips.intf.ClipsViewerSource r3 = com.instagram.clips.intf.ClipsViewerSource.DIRECT_AD_FEED_OF_ADS
            if (r2 != r3) goto L_0x0eac
        L_0x0e47:
            if (r11 == 0) goto L_0x0eac
            com.instagram.common.session.UserSession r5 = A01(r0)
            r2 = 36320674406474511(0x8109760000230f, double:3.0326789740467886E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 == 0) goto L_0x0eac
            if (r6 == 0) goto L_0x102f
            java.lang.String r2 = r6.A02
            if (r2 == 0) goto L_0x102f
            java.lang.String r2 = r6.A00
            if (r2 == 0) goto L_0x102f
            com.instagram.common.session.UserSession r7 = A01(r0)
            java.lang.String r5 = r6.A01
            com.instagram.common.session.UserSession r2 = A01(r0)
            X.GMD r3 = X.GNS.A00(r2)
            X.0qQ.A07(r3)
            X.Iet r2 = new X.Iet
            r2.<init>(r3, r7, r5)
            r0.A0k = r2
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.GBn r3 = r3.A1K
            r3.A94(r2)
            boolean r2 = r6.A09
            if (r2 == 0) goto L_0x0eac
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GBn r9 = r2.A1K
            com.instagram.common.session.UserSession r7 = A01(r0)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.Hlh r2 = r2.A1E
            java.lang.String r5 = r2.A00
            com.instagram.common.session.UserSession r2 = A01(r0)
            X.GMD r3 = X.GNS.A00(r2)
            X.0qQ.A07(r3)
            X.Ier r2 = new X.Ier
            r2.<init>(r3, r7, r5)
            r9.A94(r2)
        L_0x0eac:
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            if (r6 == 0) goto L_0x102c
            boolean r2 = r6.A0A
        L_0x0eb4:
            r3.A0N = r2
            com.instagram.common.session.UserSession r5 = A01(r0)
            r2 = 36316482518389137(0x8105a600001191, double:3.0300280071422196E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 == 0) goto L_0x0ef7
            com.instagram.common.session.UserSession r6 = A01(r0)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.93T r5 = r2.A1D
            X.GAc r2 = r2.A19
            java.lang.String r3 = r2.getModuleName()
            X.2pg r2 = X.C230472pg.ORGANIC
            X.2ph r2 = X.C52020GBr.A01(r6, r2, r5, r3)
            r1.A01(r2)
            com.instagram.common.session.UserSession r6 = A01(r0)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.93T r5 = r2.A1D
            X.GAc r2 = r2.A19
            java.lang.String r3 = r2.getModuleName()
            X.2pg r2 = X.C230472pg.SPONSORED
            X.2ph r2 = X.C52020GBr.A01(r6, r2, r5, r3)
            r1.A02(r2)
        L_0x0ef7:
            com.instagram.common.session.UserSession r5 = A01(r0)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GAc r3 = r2.A19
            X.GBt r13 = new X.GBt
            r2 = r48
            r13.<init>(r2, r3, r5)
            com.instagram.common.session.UserSession r6 = A01(r0)
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.07V r5 = r2.getLifecycle()
            X.0gy r3 = X.AnonymousClass07i.A00(r0)
            instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController r12 = new instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController
            r2 = r48
            r12.<init>(r2, r5, r3, r6)
            com.instagram.common.session.UserSession r11 = A01(r0)
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.07V r52 = r2.getLifecycle()
            X.GBj r10 = r0.A0N
            if (r10 == 0) goto L_0x1cbc
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GBn r9 = r2.A1K
            java.lang.Object r7 = r21.getValue()
            X.GDR r7 = (X.GDR) r7
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.Hlh r6 = r2.A1E
            X.93T r5 = r2.A1D
            X.GAc r3 = r2.A19
            com.instagram.common.session.UserSession r53 = A01(r0)
            X.GBx r2 = new X.GBx
            r50 = r2
            r51 = r48
            r54 = r3
            r55 = r5
            r56 = r7
            r57 = r6
            r58 = r13
            r59 = r12
            r60 = r9
            r61 = r10
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            X.GBy r3 = new X.GBy
            r3.<init>(r11, r2)
            X.GB1 r2 = r1.A0D
            java.util.List r2 = r2.A00
            r2.add(r3)
            com.instagram.common.session.UserSession r5 = A01(r0)
            r2 = 36326760375138261(0x810eff000037d5, double:3.036527765135973E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 == 0) goto L_0x0f90
            com.instagram.common.session.UserSession r5 = A01(r0)
            com.instagram.clips.intf.ClipsViewerConfig r3 = A00(r0)
            X.IPD r2 = new X.IPD
            r2.<init>(r3, r5)
            r1.A01(r2)
            r1.A02(r2)
        L_0x0f90:
            com.instagram.common.session.UserSession r12 = A01(r0)
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.07V r52 = r2.getLifecycle()
            X.GBj r11 = r0.A0N
            if (r11 == 0) goto L_0x1cbc
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GBn r10 = r2.A1K
            X.How r9 = r2.A1I
            java.lang.Object r7 = r19.getValue()
            X.GL0 r7 = (X.GL0) r7
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.Hlh r6 = r2.A1E
            X.93T r5 = r2.A1D
            X.GAc r3 = r2.A19
            com.instagram.common.session.UserSession r53 = A01(r0)
            X.GKy r2 = new X.GKy
            r50 = r2
            r54 = r3
            r55 = r5
            r56 = r6
            r57 = r7
            r58 = r9
            r59 = r10
            r60 = r11
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            X.GBz r3 = new X.GBz
            r3.<init>(r12, r2)
            X.GAy r2 = r1.A0E
            java.util.List r2 = r2.A00
            r2.add(r3)
            com.instagram.common.session.UserSession r5 = A01(r0)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GAc r3 = r2.A19
            X.GC0 r7 = new X.GC0
            r2 = r48
            r7.<init>(r2, r3, r5)
            com.instagram.common.session.UserSession r6 = A01(r0)
            X.GBj r5 = r0.A0N
            if (r5 == 0) goto L_0x1cbc
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GBn r3 = r2.A1K
            com.instagram.common.session.UserSession r11 = A01(r0)
            X.GC1 r2 = new X.GC1
            r9 = r2
            r10 = r48
            r12 = r7
            r13 = r3
            r14 = r5
            r9.<init>(r10, r11, r12, r13, r14)
            X.GC2 r3 = new X.GC2
            r3.<init>(r6, r2)
            X.GB3 r2 = r1.A0F
            java.util.List r2 = r2.A02
            r2.add(r3)
            android.os.Bundle r2 = r0.A0S
            if (r2 == 0) goto L_0x1022
            r0.A09(r2)
            r2 = r46
            r0.A0S = r2
        L_0x1022:
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GBn r5 = r2.A1K
            X.GE1 r3 = r2.A1C
            monitor-enter(r5)
            goto L_0x103d
        L_0x102c:
            r2 = 0
            goto L_0x0eb4
        L_0x102f:
            X.0wb r5 = X.0wb.A01
            java.lang.String r3 = "ClipsViewerFragment received null thread data when navigated from direct"
            r2 = r18
            r5.Ew0(r2, r3)
            goto L_0x0eac
        L_0x103a:
            r11 = 0
            goto L_0x0e3d
        L_0x103d:
            X.0qQ.A0B(r3, r8)     // Catch:{ all -> 0x240e }
            java.util.Set r2 = r5.A0J     // Catch:{ all -> 0x240e }
            r2.add(r3)     // Catch:{ all -> 0x240e }
            monitor-exit(r5)
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.GC3 r2 = new X.GC3
            r2.<init>(r3)
            r0.A0M = r2
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.HnV r6 = r2.A13
            X.GBj r5 = r0.A0N
            if (r5 == 0) goto L_0x1cbc
            com.instagram.common.session.UserSession r3 = r6.A00
            X.GC4 r2 = new X.GC4
            r2.<init>(r3, r6, r5)
            r1.A01(r2)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GJx r3 = r2.A0l
            X.2qi r2 = r2.A0h
            X.GC5 r18 = new X.GC5
            r5 = r18
            r5.<init>(r2, r3)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.2qi r6 = r2.A0h
            X.GAc r5 = r2.A19
            com.instagram.common.session.UserSession r3 = A01(r0)
            X.GC6 r2 = new X.GC6
            r2.<init>(r3, r5, r6)
            X.GB4 r3 = r1.A0H
            java.util.List r3 = r3.A00
            r3.add(r2)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GBn r3 = r2.A1K
            X.GF2 r2 = r2.A1H
            r3.A94(r2)
            com.instagram.common.session.UserSession r53 = A01(r0)
            androidx.fragment.app.FragmentActivity r51 = r0.requireActivity()
            X.GBj r7 = r0.A0N
            if (r7 == 0) goto L_0x1cbc
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GBn r6 = r2.A1K
            X.GC3 r5 = r0.A0M
            java.lang.String r23 = "clipsUiAnimationManager"
            if (r5 == 0) goto L_0x2397
            com.instagram.clips.intf.ClipsViewerConfig r52 = A00(r0)
            X.Hpn r3 = r0.A1J
            X.GKz r2 = new X.GKz
            r50 = r2
            r54 = r3
            r55 = r5
            r56 = r6
            r57 = r7
            r50.<init>(r51, r52, r53, r54, r55, r56, r57)
            r0.A0g = r2
            com.instagram.common.session.UserSession r55 = A01(r0)
            androidx.fragment.app.FragmentActivity r52 = r0.requireActivity()
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GAc r7 = r2.A19
            X.GD6 r6 = r0.A0C
            if (r6 == 0) goto L_0x23a6
            X.GKz r5 = r0.A0g
            java.lang.String r37 = "dragDismissDelegate"
            if (r5 == 0) goto L_0x0be2
            com.instagram.clips.intf.ClipsViewerConfig r54 = A00(r0)
            X.GC7 r2 = new X.GC7
            r50 = r2
            r51 = r10
            r53 = r0
            r56 = r7
            r57 = r5
            r58 = r3
            r59 = r6
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59)
            r0.A0I = r2
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GCA r3 = r2.A0z
            X.GD0 r2 = r2.A0v
            r3.A00(r2)
            X.GC7 r2 = r0.A0I
            java.lang.String r19 = "swipeGestureController"
            if (r2 == 0) goto L_0x23a1
            r3.A00(r2)
            X.GBm r2 = r0.A0G
            if (r2 != 0) goto L_0x1113
            java.lang.String r37 = "endSceneController"
            goto L_0x0be2
        L_0x1113:
            r3.A00(r2)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GJx r2 = r2.A0l
            r3.A00(r2)
            X.B55 r2 = r0.A0F
            if (r2 != 0) goto L_0x1127
            java.lang.String r37 = "clipsViewerAppreciationGiftController"
            goto L_0x0be2
        L_0x1127:
            r3.A00(r2)
            com.instagram.common.session.UserSession r2 = A01(r0)
            boolean r2 = X.1KU.A06(r2)
            if (r2 == 0) goto L_0x113d
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GIb r2 = r2.A0t
            r3.A00(r2)
        L_0x113d:
            X.GBE r5 = r0.A09
            if (r5 == 0) goto L_0x0bc5
            androidx.fragment.app.FragmentActivity r2 = r5.A0R
            X.GCB r3 = new X.GCB
            r3.<init>(r2)
            X.GCA r2 = r5.A0z
            r2.A00(r3)
            r5.A09 = r3
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            boolean r2 = r2.A0W()
            java.lang.String r13 = "Required value was null."
            X.GBE r5 = r0.A09
            if (r2 == 0) goto L_0x1a39
            if (r5 == 0) goto L_0x0bc5
            r5.A0F()
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GNH r2 = r2.A0B
            if (r2 != 0) goto L_0x1186
            com.instagram.common.session.UserSession r5 = A01(r0)
            X.0qQ.A0B(r5, r8)
            r2 = 36325287201551176(0x810da800033348, double:3.0355961242275064E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 == 0) goto L_0x1186
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GNH r2 = r2.A0D()
            r2.A04 = r0
        L_0x1186:
            X.GBE r15 = r0.A09
            if (r15 == 0) goto L_0x0bc5
            com.instagram.clips.intf.ClipsViewerConfig r3 = r15.A0Y
            com.instagram.clips.model.ClipsReplyBarData r14 = r3.A0L
            if (r14 == 0) goto L_0x23dc
            X.0sa r2 = r15.A20
            java.lang.Object r12 = r2.invoke()
            X.GD6 r12 = (X.GD6) r12
            com.instagram.common.session.UserSession r2 = r15.A0a
            r21 = r2
            X.GAc r11 = r15.A19
            androidx.fragment.app.FragmentActivity r10 = r15.A0R
            X.HJk r9 = r15.A0q
            X.Meq r7 = r15.A0D
            X.GNH r6 = r15.A0B
            com.instagram.clips.intf.ClipsViewerDirectData r2 = r3.A0I
            if (r2 == 0) goto L_0x11ae
            boolean r2 = r2.A09
            r20 = r2
        L_0x11ae:
            com.instagram.clips.intf.ClipsViewerSource r5 = r3.A0J
            X.GCB r3 = r15.A09
            X.Mep r2 = new X.Mep
            r50 = r2
            r51 = r10
            r52 = r5
            r53 = r14
            r54 = r21
            r55 = r11
            r56 = r9
            r57 = r12
            r58 = r3
            r59 = r6
            r60 = r7
            r61 = r20
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            X.GCA r3 = r15.A0z
            r3.A00(r2)
            r15.A0H = r2
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.Meq r3 = r2.A0D
            if (r3 == 0) goto L_0x23d3
            X.GME r2 = r2.A0H
            if (r2 == 0) goto L_0x23f4
            r3.A04 = r2
        L_0x11e4:
            if (r17 == 0) goto L_0x1207
            com.instagram.common.session.UserSession r5 = A01(r0)
            r2 = 36323530560646387(0x810c0f000e2cf3, double:3.034485217445893E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 == 0) goto L_0x1207
            X.GBE r5 = r0.A09
            if (r5 == 0) goto L_0x0bc5
            com.instagram.common.session.UserSession r2 = r5.A0a
            X.HK9 r3 = new X.HK9
            r3.<init>(r2)
            X.GCA r2 = r5.A0z
            r2.A00(r3)
            r5.A0A = r3
        L_0x1207:
            com.instagram.common.session.UserSession r5 = A01(r0)
            X.0Tu r22 = X.0Tu.A06
            r2 = 36321584939738661(0x810a4a00032625, double:3.03325479894946E-306)
            r6 = r22
            boolean r2 = X.182.A06(r6, r5, r2)
            if (r2 != 0) goto L_0x1229
            com.instagram.common.session.UserSession r5 = A01(r0)
            r2 = 36321584940394027(0x810a4a000d262b, double:3.0332547993639163E-306)
            boolean r2 = X.182.A06(r6, r5, r2)
            if (r2 == 0) goto L_0x1240
        L_0x1229:
            X.GBE r7 = r0.A09
            if (r7 == 0) goto L_0x0bc5
            X.37E r3 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r2 = r7.A0R
            X.37D r6 = r3.A01(r2)
            X.GD9 r5 = r7.A1L
            com.instagram.common.session.UserSession r3 = r7.A0a
            X.IMq r2 = new X.IMq
            r2.<init>(r3, r6, r5)
            r7.A08 = r2
        L_0x1240:
            com.instagram.common.session.UserSession r5 = A01(r0)
            r2 = 36318226275112965(0x81073c00001805, double:3.031130765915913E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 == 0) goto L_0x1260
            com.instagram.common.session.UserSession r5 = A01(r0)
            X.GHG r3 = new X.GHG
            r3.<init>(r0)
            X.GHH r2 = new X.GHH
            r2.<init>(r5, r3)
            r1.A02(r2)
        L_0x1260:
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            boolean r2 = r2.A0V()
            if (r2 == 0) goto L_0x1280
            com.instagram.clips.intf.ClipsViewerConfig r2 = A00(r0)
            boolean r2 = r2.A1g
            if (r2 != 0) goto L_0x1280
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.GNH r2 = r3.A0B
            if (r2 != 0) goto L_0x1280
            X.GNH r2 = r3.A0D()
            r2.A04 = r0
        L_0x1280:
            X.GBE r11 = r0.A09
            if (r11 == 0) goto L_0x0bc5
            X.HK8 r2 = r11.A0G
            if (r2 != 0) goto L_0x12da
            com.instagram.common.session.UserSession r10 = A01(r0)
            com.instagram.clips.intf.ClipsViewerConfig r2 = A00(r0)
            X.GD6 r9 = r0.A0C
            if (r9 == 0) goto L_0x23a6
            java.lang.Object r7 = r141.getValue()
            X.GAc r7 = (X.C51979GAc) r7
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.GCB r6 = r3.A09
            X.0qQ.A0B(r10, r8)
            r3 = r45
            X.0qQ.A0B(r2, r3)
            r3 = r25
            X.0qQ.A0B(r7, r3)
            boolean r3 = r2.A23
            if (r3 == 0) goto L_0x1a29
            X.HiE r5 = new X.HiE
            r5.<init>(r10)
            com.instagram.clips.intf.ClipsViewerSource r3 = r2.A0J
            com.instagram.clips.intf.ClipsViewerSource r2 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_MEDIA_NOTES_NOTIF_CHAIN
            r56 = 0
            if (r3 != r2) goto L_0x12c0
            r56 = 1
        L_0x12c0:
            X.HK7 r2 = new X.HK7
            r50 = r2
            r51 = r7
            r52 = r10
            r53 = r5
            r54 = r9
            r55 = r6
            r50.<init>(r51, r52, r53, r54, r55, r56)
            r2.A05 = r0
        L_0x12d3:
            X.GCA r3 = r11.A0z
            r3.A00(r2)
        L_0x12d8:
            r11.A0G = r2
        L_0x12da:
            com.instagram.clips.intf.ClipsViewerConfig r2 = A00(r0)
            com.instagram.clips.intf.ClipsViewerSource r3 = r2.A0J
            X.0qQ.A0B(r3, r8)
            com.instagram.clips.intf.ClipsViewerSource r2 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_PROMPT
            if (r3 == r2) goto L_0x12eb
            com.instagram.clips.intf.ClipsViewerSource r2 = com.instagram.clips.intf.ClipsViewerSource.NEWSFEED_YOU
            if (r3 != r2) goto L_0x1321
        L_0x12eb:
            X.GBE r11 = r0.A09
            if (r11 == 0) goto L_0x0bc5
            X.GPN r10 = r11.A0C
            if (r10 != 0) goto L_0x131f
            android.content.Context r9 = r11.A0Q
            com.instagram.common.session.UserSession r7 = r11.A0a
            X.0sa r2 = r11.A20
            java.lang.Object r6 = r2.invoke()
            X.GD6 r6 = (X.GD6) r6
            X.HJk r5 = r11.A0q
            X.GAc r3 = r11.A19
            X.93T r2 = r11.A1D
            X.GPN r10 = new X.GPN
            r50 = r10
            r51 = r9
            r52 = r3
            r53 = r7
            r54 = r6
            r55 = r5
            r56 = r2
            r50.<init>(r51, r52, r53, r54, r55, r56)
            X.GCA r2 = r11.A0z
            r2.A00(r10)
            r11.A0C = r10
        L_0x131f:
            r10.A04 = r0
        L_0x1321:
            X.2Zg r2 = r0.A02()
            if (r2 == 0) goto L_0x134b
            com.instagram.common.session.UserSession r2 = A01(r0)
            boolean r2 = X.2bA.A06(r2)
            if (r2 == 0) goto L_0x134b
            if (r17 != 0) goto L_0x134b
            X.GBE r7 = r0.A09
            if (r7 == 0) goto L_0x0bc5
            com.instagram.common.session.UserSession r6 = r7.A0a
            androidx.fragment.app.FragmentActivity r5 = r7.A0R
            com.instagram.clips.intf.ClipsViewerConfig r2 = r7.A0Y
            boolean r3 = r2.A24
            X.GKU r2 = new X.GKU
            r2.<init>(r5, r6, r3)
            X.GCA r3 = r7.A0z
            r3.A00(r2)
            r7.A0I = r2
        L_0x134b:
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.07V r2 = r2.getLifecycle()
            X.0xx r5 = X.C71772f0.A00(r2)
            com.instagram.common.session.UserSession r6 = A01(r0)
            android.content.Context r9 = r0.requireContext()
            r2 = r45
            X.0qQ.A0B(r6, r2)
            r2 = 36320541264126552(0x81095700192258, double:3.032594774289818E-306)
            boolean r2 = X.182.A06(r4, r6, r2)
            if (r2 == 0) goto L_0x13b0
            r2 = 14
            X.WxR r3 = new X.WxR
            r3.<init>(r6, r2)
            java.lang.Class<X.6gG> r2 = X.C313326gG.class
            java.lang.Object r3 = r6.A01(r2, r3)
            X.6gG r3 = (X.C313326gG) r3
            java.util.Map r2 = r3.A01
            int r2 = r2.size()
            if (r2 > 0) goto L_0x13b0
            r2 = 32
            X.Wxb r7 = new X.Wxb
            r7.<init>(r2, r6, r3, r9)
            r2 = 36320541264257626(0x810957001b225a, double:3.03259477437271E-306)
            boolean r2 = X.182.A06(r4, r6, r2)
            if (r2 == 0) goto L_0x1a24
            X.12T r3 = X.AnonymousClass12T.A00
            r2 = -18
            r6 = r25
            X.0nV r9 = r3.AOJ(r2, r6)
            r6 = 36
            X.MFx r3 = new X.MFx
            r2 = r46
            r3.<init>(r7, r2, r6)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.1Eo.A03(r2, r9, r3, r5)
        L_0x13b0:
            com.instagram.common.session.UserSession r7 = A01(r0)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GBn r6 = r2.A1K
            androidx.fragment.app.FragmentActivity r3 = r0.getActivity()
            boolean r3 = r3 instanceof X.AnonymousClass2ZQ
            r5 = r3 ^ 1
            boolean r2 = r2.A0V()
            if (r2 != 0) goto L_0x13df
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            boolean r2 = r2.A0W()
            if (r2 != 0) goto L_0x13df
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            com.instagram.clips.intf.ClipsViewerConfig r2 = r2.A0Y
            com.instagram.clips.intf.ClipsViewerSource r9 = r2.A0J
            com.instagram.clips.intf.ClipsViewerSource r3 = com.instagram.clips.intf.ClipsViewerSource.SPOTLIGHT
            r2 = 0
            if (r9 != r3) goto L_0x13e0
        L_0x13df:
            r2 = 1
        L_0x13e0:
            X.GCC r21 = new X.GCC
            r3 = r21
            r3.<init>(r7, r6, r5, r2)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GCA r2 = r2.A0z
            r2.A00(r3)
            X.GKz r2 = r0.A0g
            if (r2 == 0) goto L_0x0be2
            r2.A00 = r3
            com.instagram.common.session.UserSession r5 = A01(r0)
            r2 = 36325862727562540(0x810e2e0009352c, double:3.03596008919455E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 != 0) goto L_0x1414
            com.instagram.common.session.UserSession r5 = A01(r0)
            r2 = 36325862727628077(0x810e2e000a352d, double:3.035960089235996E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 == 0) goto L_0x1445
        L_0x1414:
            X.GD6 r6 = r0.A0C
            if (r6 == 0) goto L_0x23a6
            X.GD9 r15 = r0.A0O()
            com.instagram.common.session.UserSession r11 = A01(r0)
            java.lang.Object r5 = r140.getValue()
            X.GBg r5 = (X.C52009GBg) r5
            X.GC3 r3 = r0.A0M
            if (r3 == 0) goto L_0x2397
            X.HKB r2 = new X.HKB
            r9 = r2
            r10 = r5
            r12 = r6
            r13 = r21
            r14 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15)
            X.GBj r3 = r0.A0N
            if (r3 == 0) goto L_0x1cbc
            r3.A0J(r2)
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.GCA r3 = r3.A0z
            r3.A00(r2)
        L_0x1445:
            com.instagram.common.session.UserSession r5 = A01(r0)
            X.0qQ.A0B(r5, r8)
            r2 = 36322959329077963(0x810b8a00002acb, double:3.0341239683018565E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 != 0) goto L_0x19a4
            com.instagram.common.session.UserSession r5 = A01(r0)
            X.0qQ.A0B(r5, r8)
            r2 = 36325862726972712(0x810e2e00003528, double:3.0359600888215407E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 != 0) goto L_0x19a4
            com.instagram.common.session.UserSession r5 = A01(r0)
            X.0qQ.A0B(r5, r8)
            r2 = 36325862727103785(0x810e2e00023529, double:3.035960088904432E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 != 0) goto L_0x19a4
            com.instagram.common.session.UserSession r53 = A01(r0)
            com.instagram.clips.intf.ClipsViewerConfig r52 = A00(r0)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GBn r5 = r2.A1K
            X.GC3 r3 = r0.A0M
            if (r3 == 0) goto L_0x2397
            androidx.fragment.app.FragmentActivity r51 = r0.requireActivity()
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GAc r2 = r2.A19
            X.GCD r20 = new X.GCD
            r50 = r20
            r54 = r2
            r55 = r21
            r56 = r3
            r57 = r5
            r50.<init>(r51, r52, r53, r54, r55, r56, r57)
        L_0x14a6:
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GCA r2 = r2.A0z
            r3 = r20
            r2.A00(r3)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GBn r2 = r2.A1K
            X.GCE r5 = new X.GCE
            r5.<init>(r2)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GCA r2 = r2.A0z
            r2.A00(r5)
            X.GD6 r3 = r0.A0C
            if (r3 == 0) goto L_0x23a6
            java.util.List r2 = r3.A0D
            r2.add(r5)
            X.GBe r3 = r3.A0C
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r3.A06 = r2
            boolean r2 = r0.A0J()
            if (r2 == 0) goto L_0x150a
            if (r143 == 0) goto L_0x150a
            java.lang.String r3 = "ClipsViewerFragment.SAVED_CLIPS_VIEWER_ITEM_LIST"
            r2 = r27
            java.lang.String[] r2 = r2.getStringArray(r3)
            if (r2 == 0) goto L_0x14ed
            int r2 = r2.length
            r61 = 1
            if (r2 > 0) goto L_0x14ef
        L_0x14ed:
            r61 = 0
        L_0x14ef:
            com.instagram.common.session.UserSession r5 = A01(r0)
            r2 = 36325918563120514(0x810e3b00183582, double:3.035995399826245E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 == 0) goto L_0x150c
            java.lang.String r3 = "ClipsViewerFragment.SAVED_CLIPS_VIEWER_LIST_SIZE"
            r2 = r27
            int r2 = r2.getInt(r3)
            r61 = 1
            if (r2 > 0) goto L_0x150c
        L_0x150a:
            r61 = 0
        L_0x150c:
            X.GBE r6 = r0.A09
            if (r6 == 0) goto L_0x0bc5
            X.GD6 r5 = r0.A0C
            if (r5 == 0) goto L_0x23a6
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.07V r2 = r2.getLifecycle()
            X.0xx r60 = X.C71772f0.A00(r2)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GAc r2 = r2.A19
            java.lang.String r3 = r2.getModuleName()
            r2 = r36
            X.0qQ.A0B(r3, r2)
            com.instagram.clips.intf.ClipsViewerConfig r9 = r6.A0Y
            java.lang.String r2 = r9.A0w
            if (r2 == 0) goto L_0x192a
            com.instagram.clips.intf.ClipsViewerSource r3 = r9.A0J
            com.instagram.clips.intf.ClipsViewerSource r2 = com.instagram.clips.intf.ClipsViewerSource.MID_CARD_CONTEXTUAL_CHAIN_WITH_RECIPE_SHEET_TRENDING_TRACK_WITH_SIMILAR_ACCOUNTS
            if (r3 == r2) goto L_0x154c
            com.instagram.clips.intf.ClipsViewerSource r2 = com.instagram.clips.intf.ClipsViewerSource.MID_CARD_OPEN_REELS_CHAIN
            if (r3 != r2) goto L_0x192a
            com.instagram.common.session.UserSession r7 = r6.A0a
            r2 = 36330295133225523(0x81123600004233, double:3.038763160383686E-306)
            boolean r2 = X.182.A06(r4, r7, r2)
            if (r2 == 0) goto L_0x192a
        L_0x154c:
            r9 = 0
        L_0x154d:
            r6.A0E = r9
            if (r9 == 0) goto L_0x155d
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GCA r2 = r2.A0z
            r2.A00(r9)
            r1.A01(r9)
        L_0x155d:
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GYI r2 = r2.A0r
            if (r2 == 0) goto L_0x1568
            r1.A02(r2)
        L_0x1568:
            com.instagram.common.session.UserSession r9 = A01(r0)
            com.instagram.common.session.UserSession r7 = A01(r0)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.93T r6 = r2.A1D
            X.GAc r5 = r2.A19
            X.4h9 r3 = r2.A0S
            X.GCF r2 = new X.GCF
            r2.<init>(r3, r5, r7, r6)
            X.0qQ.A0B(r9, r8)
            X.MMV r5 = new X.MMV
            r3 = r45
            r5.<init>(r3, r2, r9)
            java.lang.Class<X.GJT> r2 = X.GJT.class
            java.lang.Object r2 = r9.A01(r2, r5)
            X.GJT r2 = (X.GJT) r2
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.0qQ.A0B(r2, r8)
            r3.A01 = r2
            X.0eM r3 = X.GJW.A03
            java.lang.Object r3 = r3.getValue()
            X.GJW r3 = (X.GJW) r3
            r3.A00 = r2
            com.instagram.common.session.UserSession r3 = A01(r0)
            boolean r3 = X.GCI.A00(r3)
            if (r3 == 0) goto L_0x15bd
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.0eM r3 = r3.A1W
            java.lang.Object r3 = r3.getValue()
            X.GE6 r3 = (X.GE6) r3
            r1.A01(r3)
        L_0x15bd:
            com.instagram.common.session.UserSession r3 = A01(r0)
            boolean r3 = X.GCI.A00(r3)
            if (r3 == 0) goto L_0x15d6
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.0eM r3 = r3.A1T
            java.lang.Object r3 = r3.getValue()
            X.GE8 r3 = (X.GE8) r3
            r1.A01(r3)
        L_0x15d6:
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.0eM r3 = r3.A1V
            java.lang.Object r3 = r3.getValue()
            X.GCJ r3 = (X.GCJ) r3
            r1.A02(r3)
            com.instagram.clips.intf.ClipsViewerConfig r3 = A00(r0)
            com.instagram.clips.intf.ClipsViewerSource r5 = r3.A0J
            com.instagram.clips.intf.ClipsViewerSource r3 = com.instagram.clips.intf.ClipsViewerSource.ADS_HISTORY
            if (r5 == r3) goto L_0x15fe
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.0eM r3 = r3.A1R
            java.lang.Object r3 = r3.getValue()
            X.GCK r3 = (X.GCK) r3
            r1.A02(r3)
        L_0x15fe:
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.0eM r3 = r3.A1X
            java.lang.Object r3 = r3.getValue()
            X.GCL r3 = (X.GCL) r3
            r1.A02(r3)
            com.instagram.common.session.UserSession r3 = A01(r0)
            X.0qQ.A0B(r3, r8)
            r5 = 36603059916575592(0x820a4a00051368, double:3.211260707709893E-306)
            r7 = r22
            long r9 = X.182.A01(r7, r3, r5)
            r5 = 0
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x1634
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.0eM r3 = r3.A1U
            java.lang.Object r3 = r3.getValue()
            X.GE9 r3 = (X.GE9) r3
            r1.A02(r3)
        L_0x1634:
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.0eM r3 = r3.A1Y
            java.lang.Object r3 = r3.getValue()
            X.GCM r3 = (X.GCM) r3
            r1.A01(r3)
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.0eM r3 = r3.A1Y
            java.lang.Object r3 = r3.getValue()
            X.GCM r3 = (X.GCM) r3
            r1.A02(r3)
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.0eM r3 = r3.A1S
            java.lang.Object r3 = r3.getValue()
            X.GCN r3 = (X.GCN) r3
            r1.A02(r3)
            X.0eM r1 = r0.A12
            java.lang.Object r7 = r1.getValue()
            java.util.List r7 = (java.util.List) r7
            com.instagram.common.session.UserSession r3 = A01(r0)
            X.0qQ.A0B(r7, r8)
            r5 = r45
            X.0qQ.A0B(r3, r5)
            boolean r5 = r7 instanceof java.util.Collection
            if (r5 == 0) goto L_0x18d5
            boolean r5 = r7.isEmpty()
            if (r5 == 0) goto L_0x18d5
        L_0x167f:
            com.instagram.clips.intf.ClipsViewerConfig r3 = A00(r0)
            boolean r3 = r3.A1z
            if (r3 == 0) goto L_0x16b5
            androidx.fragment.app.FragmentActivity r10 = r0.requireActivity()
            com.instagram.common.session.UserSession r12 = A01(r0)
            java.lang.Object r5 = r1.getValue()
            java.util.List r5 = (java.util.List) r5
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            boolean r14 = r3.A0U()
            boolean r15 = r0.Cda()
            X.GCp r3 = new X.GCp
            r9 = r3
            r11 = r48
            r13 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15)
            X.GBE r5 = r0.A09
            if (r5 == 0) goto L_0x0bc5
            X.GCA r5 = r5.A0z
            r5.A00(r3)
            r0.A0H = r3
        L_0x16b5:
            com.instagram.common.session.UserSession r3 = A01(r0)
            r5 = 36316413798912356(0x81059600001164, double:3.029984548668392E-306)
            r7 = r22
            boolean r3 = X.182.A06(r7, r3, r5)
            if (r3 == 0) goto L_0x16eb
            androidx.fragment.app.FragmentActivity r11 = r0.requireActivity()
            com.instagram.common.session.UserSession r13 = A01(r0)
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.GAc r6 = r3.A19
            X.GD6 r5 = r0.A0C
            if (r5 == 0) goto L_0x23a6
            X.GCO r3 = new X.GCO
            r9 = r3
            r10 = r48
            r12 = r6
            r14 = r5
            r9.<init>(r10, r11, r12, r13, r14)
            X.GBE r5 = r0.A09
            if (r5 == 0) goto L_0x0bc5
            X.GCA r5 = r5.A0z
            r5.A00(r3)
        L_0x16eb:
            com.instagram.common.session.UserSession r52 = A01(r0)
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.GAc r9 = r3.A19
            X.93T r7 = r3.A1D
            X.GD6 r6 = r0.A0C
            if (r6 == 0) goto L_0x23a6
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r10 = r1.get(r8)
            X.GJY r10 = (X.GJY) r10
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.0eM r1 = r1.A1j
            java.lang.Object r5 = r1.getValue()
            X.JS0 r5 = (X.JS0) r5
            r1 = 45
            X.9LH r3 = new X.9LH
            r3.<init>(r0, r1)
            X.GCy r1 = new X.GCy
            r50 = r1
            r51 = r48
            r53 = r9
            r54 = r6
            r55 = r5
            r56 = r7
            r57 = r10
            r58 = r3
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58)
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.GCH r3 = r3.A1A
            r3.A03(r1)
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            X.GCA r3 = r3.A0z
            r3.A00(r1)
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            com.instagram.common.session.UserSession r5 = A01(r0)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GAc r3 = r1.A19
            X.32T r57 = new X.32T
            r1 = r57
            r1.<init>(r6, r5, r0, r3)
            X.GBj r3 = r0.A0N
            if (r3 == 0) goto L_0x1cbc
            r3.A0J(r1)
            X.GCP r14 = new X.GCP
            r14.<init>(r0)
            com.instagram.common.session.UserSession r60 = A01(r0)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GAc r10 = r1.A19
            X.93T r9 = r1.A1D
            X.GBn r7 = r1.A1K
            X.GD6 r6 = r0.A0C
            if (r6 == 0) goto L_0x23a6
            X.GBj r5 = r0.A0N
            if (r5 == 0) goto L_0x1cbc
            X.GE5 r3 = r1.A0u
            X.GCQ r1 = new X.GCQ
            r58 = r1
            r59 = r0
            r61 = r10
            r62 = r9
            r63 = r6
            r64 = r3
            r65 = r7
            r66 = r5
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66)
            r0.A0e = r1
            androidx.fragment.app.FragmentActivity r59 = r0.requireActivity()
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GAc r12 = r1.A19
            com.instagram.common.session.UserSession r62 = A01(r0)
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            java.lang.String r11 = r1.A1F
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GBn r10 = r1.A1K
            X.GIN r9 = r1.A15
            X.93T r7 = r1.A1D
            X.Hlh r6 = r1.A1E
            X.GCQ r5 = r0.A0e
            java.lang.String r37 = "adsNavigator"
            if (r5 == 0) goto L_0x0be2
            X.HqC r3 = r1.A0n
            X.GCR r1 = new X.GCR
            r58 = r1
            r60 = r0
            r61 = r126
            r63 = r12
            r64 = r7
            r65 = r3
            r66 = r5
            r67 = r9
            r68 = r6
            r69 = r10
            r70 = r11
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)
            r0.A0b = r1
            androidx.fragment.app.FragmentActivity r59 = r0.requireActivity()
            X.GBp r12 = r0.A0E
            java.lang.String r27 = "clipsAutoScrollController"
            if (r12 == 0) goto L_0x2392
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GAc r15 = r1.A19
            java.lang.String r13 = r1.A1M
            java.lang.String r11 = r1.A1N
            X.93T r10 = r1.A1D
            X.GF2 r9 = r1.A1H
            X.JU5 r7 = r1.A0e
            X.GIN r6 = r1.A15
            X.Hlh r5 = r1.A1E
            com.instagram.common.session.UserSession r61 = A01(r0)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GBn r3 = r1.A1K
            com.instagram.clips.intf.ClipsViewerConfig r60 = A00(r0)
            X.GCS r1 = new X.GCS
            r58 = r1
            r62 = r15
            r63 = r7
            r64 = r10
            r65 = r6
            r66 = r12
            r67 = r5
            r68 = r9
            r69 = r3
            r70 = r13
            r71 = r11
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71)
            r0.A07 = r1
            com.instagram.common.session.UserSession r61 = A01(r0)
            androidx.fragment.app.FragmentActivity r59 = r0.requireActivity()
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GAc r7 = r1.A19
            X.GBp r6 = r0.A0E
            if (r6 == 0) goto L_0x2392
            X.93T r5 = r1.A1D
            X.0eM r1 = r1.A1f
            java.lang.Object r3 = r1.getValue()
            X.GCT r3 = (X.GCT) r3
            X.GCU r1 = new X.GCU
            r58 = r1
            r60 = r14
            r62 = r7
            r63 = r5
            r64 = r3
            r65 = r6
            r58.<init>(r59, r60, r61, r62, r63, r64, r65)
            r0.A0D = r1
            com.instagram.common.session.UserSession r3 = A01(r0)
            X.GKH r1 = new X.GKH
            r1.<init>(r0, r3)
            r0.A04 = r1
            androidx.fragment.app.FragmentActivity r60 = r0.requireActivity()
            X.GBp r12 = r0.A0E
            if (r12 == 0) goto L_0x2392
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.H3C r13 = r1.A17
            X.GAc r11 = r1.A19
            X.HqC r10 = r1.A0n
            X.4h9 r9 = r1.A0S
            X.93T r7 = r1.A1D
            X.GF2 r6 = r1.A1H
            X.JU5 r5 = r1.A0e
            X.Hlh r3 = r1.A1E
            com.instagram.common.session.UserSession r65 = A01(r0)
            com.instagram.clips.intf.ClipsViewerConfig r63 = A00(r0)
            X.GCV r1 = new X.GCV
            r58 = r1
            r59 = r48
            r61 = r0
            r62 = r9
            r64 = r14
            r66 = r11
            r67 = r5
            r68 = r7
            r69 = r10
            r70 = r12
            r71 = r13
            r72 = r3
            r73 = r6
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73)
            r0.A0L = r1
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            com.instagram.common.session.UserSession r5 = A01(r0)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GAc r3 = r1.A19
            X.GCX r1 = new X.GCX
            r1.<init>(r6, r5, r3)
            r0.A0B = r1
            X.GBE r1 = r0.A09
            r56 = r1
            if (r1 == 0) goto L_0x0bc5
            com.instagram.common.session.UserSession r15 = A01(r0)
            androidx.fragment.app.FragmentActivity r60 = r0.requireActivity()
            X.0eM r1 = r0.A0y
            r125 = r1
            java.lang.Object r14 = r125.getValue()
            X.GCY r14 = (X.GCY) r14
            X.Hrp r1 = r0.A0J
            r55 = r1
            if (r1 != 0) goto L_0x1a8c
            java.lang.String r16 = "overlayFragmentController"
            goto L_0x0bc5
        L_0x18d5:
            java.util.Iterator r9 = r7.iterator()
        L_0x18d9:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x167f
            java.lang.Object r6 = r9.next()
            X.0qQ.A0B(r6, r8)
            X.GJY r5 = X.GJY.A08
            if (r6 == r5) goto L_0x18d9
            X.GJY r5 = X.GJY.A09
            boolean r5 = r7.contains(r5)
            if (r5 == 0) goto L_0x1919
            java.lang.Boolean r5 = X.C52274GLq.A00(r3)
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x1909
            r5 = 36318518332954840(0x810780000118d8, double:3.0313154644711375E-306)
        L_0x1901:
            boolean r5 = X.182.A06(r4, r3, r5)
        L_0x1905:
            if (r5 != 0) goto L_0x16b5
            goto L_0x167f
        L_0x1909:
            java.lang.Boolean r5 = X.GM2.A00(r3)
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x167f
            r5 = 36320128945954866(0x8108f700052032, double:3.032334022617772E-306)
            goto L_0x1901
        L_0x1919:
            r5 = 36318866225371671(0x8107d100021a17, double:3.031535473036392E-306)
            boolean r5 = X.182.A06(r4, r3, r5)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            X.0qQ.A0A(r3)
            goto L_0x1905
        L_0x192a:
            X.4hF r3 = r6.A0Z
            r2 = r45
            X.0qQ.A0B(r3, r2)
            boolean r2 = r3.CTp(r8)
            if (r2 != 0) goto L_0x195c
            com.instagram.clips.intf.ClipsViewerSource r2 = r9.A0J
            int r2 = r2.ordinal()
            switch(r2) {
                case 11: goto L_0x195c;
                case 15: goto L_0x195c;
                case 18: goto L_0x195c;
                case 29: goto L_0x195c;
                case 30: goto L_0x195c;
                case 31: goto L_0x195c;
                case 50: goto L_0x1942;
                case 56: goto L_0x1942;
                case 64: goto L_0x1942;
                case 67: goto L_0x1942;
                case 81: goto L_0x1942;
                case 84: goto L_0x195c;
                case 87: goto L_0x194c;
                case 109: goto L_0x1942;
                default: goto L_0x1940;
            }
        L_0x1940:
            goto L_0x154c
        L_0x1942:
            r2 = r45
            boolean r2 = r3.CTp(r2)
            if (r2 != 0) goto L_0x195c
            goto L_0x154c
        L_0x194c:
            com.instagram.model.rixu.RIXUChainingBehaviorDefinition r2 = r9.A0P
            if (r2 == 0) goto L_0x195c
            java.lang.Boolean r3 = r2.A02
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r45)
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 != 0) goto L_0x154c
        L_0x195c:
            com.instagram.common.session.UserSession r7 = r6.A0a
            X.0qQ.A0B(r7, r8)
            r2 = 36317861203220081(0x8106e700051671, double:3.030899892980827E-306)
            boolean r2 = X.182.A06(r4, r7, r2)
            if (r2 != 0) goto L_0x154c
            r2 = 36318509743478944(0x81077e000818a0, double:3.031310032451994E-306)
            boolean r2 = X.182.A06(r4, r7, r2)
            if (r2 != 0) goto L_0x154c
            boolean r2 = r9.A1s
            if (r2 != 0) goto L_0x154c
            android.content.Context r14 = r6.A0Q
            X.GCH r13 = r6.A1A
            X.GE0 r12 = r6.A1B
            X.6sO r11 = r6.A0U
            java.lang.String r10 = r9.A1H
            com.instagram.clips.intf.ClipsViewerSource r3 = r9.A0J
            X.GIb r2 = r6.A0t
            X.GIn r9 = new X.GIn
            r50 = r9
            r51 = r14
            r52 = r11
            r53 = r3
            r54 = r7
            r55 = r5
            r56 = r2
            r57 = r13
            r58 = r12
            r59 = r10
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            goto L_0x154d
        L_0x19a4:
            com.instagram.common.session.UserSession r59 = A01(r0)
            com.instagram.clips.intf.ClipsViewerConfig r57 = A00(r0)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GBn r12 = r2.A1K
            X.GC3 r10 = r0.A0M
            if (r10 == 0) goto L_0x2397
            X.GD6 r9 = r0.A0C
            if (r9 == 0) goto L_0x23a6
            X.GME r11 = r2.A0H
            X.GNH r7 = r2.A0B
            com.instagram.common.session.UserSession r5 = A01(r0)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GAc r3 = r2.A19
            X.93T r2 = r2.A1D
            X.GNK r6 = new X.GNK
            r6.<init>(r3, r5, r2)
            androidx.fragment.app.FragmentActivity r53 = r0.requireActivity()
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GAc r5 = r2.A19
            java.lang.Object r3 = r140.getValue()
            X.GBg r3 = (X.C52009GBg) r3
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.93T r2 = r2.A1D
            X.0gy r56 = X.AnonymousClass07i.A00(r0)
            X.0hq r54 = r0.getChildFragmentManager()
            X.0qQ.A07(r54)
            X.GNL r20 = new X.GNL
            r50 = r20
            r51 = r48
            r52 = r0
            r55 = r0
            r58 = r3
            r60 = r5
            r61 = r2
            r62 = r9
            r63 = r21
            r64 = r7
            r65 = r11
            r66 = r6
            r67 = r10
            r68 = r12
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68)
            r2 = r20
            r1.A01(r2)
            X.GBj r3 = r0.A0N
            if (r3 == 0) goto L_0x1cbc
            X.GNO r2 = new X.GNO
            r2.<init>(r0)
            r3.A0J(r2)
            goto L_0x14a6
        L_0x1a24:
            r7.invoke()
            goto L_0x13b0
        L_0x1a29:
            boolean r2 = r2.A21
            if (r2 == 0) goto L_0x1a36
            X.HK6 r2 = new X.HK6
            r2.<init>(r10, r9)
            r2.A02 = r0
            goto L_0x12d3
        L_0x1a36:
            r2 = 0
            goto L_0x12d8
        L_0x1a39:
            if (r5 == 0) goto L_0x0bc5
            com.instagram.clips.intf.ClipsViewerConfig r2 = r5.A0Y
            com.instagram.clips.intf.ClipsViewerSource r3 = r2.A0J
            com.instagram.clips.intf.ClipsViewerSource r2 = com.instagram.clips.intf.ClipsViewerSource.SPOTLIGHT
            if (r3 != r2) goto L_0x11e4
            r5.A0F()
            X.GBE r11 = r0.A09
            if (r11 == 0) goto L_0x0bc5
            com.instagram.clips.intf.ClipsViewerConfig r2 = r11.A0Y
            com.instagram.clips.model.ClipsSpotlightData r10 = r2.A0M
            if (r10 == 0) goto L_0x2408
            X.0sa r2 = r11.A20
            java.lang.Object r9 = r2.invoke()
            X.GD6 r9 = (X.GD6) r9
            com.instagram.common.session.UserSession r7 = r11.A0a
            androidx.fragment.app.FragmentActivity r6 = r11.A0R
            X.HJk r5 = r11.A0q
            X.Meq r3 = r11.A0D
            if (r3 == 0) goto L_0x2402
            X.Ni1 r2 = new X.Ni1
            r50 = r2
            r51 = r6
            r52 = r10
            r53 = r7
            r54 = r5
            r55 = r9
            r56 = r3
            r50.<init>(r51, r52, r53, r54, r55, r56)
            X.GCA r3 = r11.A0z
            r3.A00(r2)
            r11.A0H = r2
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.Meq r3 = r2.A0D
            if (r3 == 0) goto L_0x23eb
            X.GME r2 = r2.A0H
            if (r2 == 0) goto L_0x23e2
            r3.A04 = r2
            goto L_0x11e4
        L_0x1a8c:
            X.GC3 r1 = r0.A0M
            r54 = r1
            if (r1 == 0) goto L_0x2397
            X.GD6 r1 = r0.A0C
            r53 = r1
            if (r1 == 0) goto L_0x23a6
            X.GBj r1 = r0.A0N
            r52 = r1
            if (r1 == 0) goto L_0x1cbc
            java.lang.Object r13 = r95.getValue()
            java.lang.String r13 = (java.lang.String) r13
            X.GBp r1 = r0.A0E
            r51 = r1
            if (r1 == 0) goto L_0x2392
            X.GBE r12 = r0.A09
            if (r12 == 0) goto L_0x0bc5
            X.GE5 r1 = r12.A0u
            r102 = r1
            java.lang.Object r11 = r94.getValue()
            X.GBI r11 = (X.GBI) r11
            X.GCQ r1 = r0.A0e
            r50 = r1
            if (r1 == 0) goto L_0x0be2
            X.GCR r1 = r0.A0b
            r47 = r1
            java.lang.String r41 = "bottomSheetHelper"
            if (r1 == 0) goto L_0x239c
            X.GCU r1 = r0.A0D
            r40 = r1
            if (r1 != 0) goto L_0x1ad0
            java.lang.String r16 = "commentsNavigator"
            goto L_0x0bc5
        L_0x1ad0:
            X.0eM r1 = r0.A11
            java.lang.Object r10 = r1.getValue()
            X.GBG r10 = (X.GBG) r10
            X.0eM r1 = r0.A1B
            r124 = r1
            java.lang.Object r9 = r124.getValue()
            X.GIY r9 = (X.GIY) r9
            X.GCS r1 = r0.A07
            r39 = r1
            if (r1 != 0) goto L_0x1aec
            java.lang.String r16 = "audioPageNavigator"
            goto L_0x0bc5
        L_0x1aec:
            X.GCV r1 = r0.A0L
            r37 = r1
            if (r1 != 0) goto L_0x1af6
            java.lang.String r16 = "shareNavigator"
            goto L_0x0bc5
        L_0x1af6:
            X.GCX r1 = r0.A0B
            r27 = r1
            if (r1 != 0) goto L_0x1b00
            java.lang.String r16 = "visualSearchNavigator"
            goto L_0x0bc5
        L_0x1b00:
            java.lang.Object r7 = r93.getValue()
            X.GBM r7 = (X.GBM) r7
            r1 = r45
            X.0qQ.A0B(r15, r1)
            r1 = r44
            X.0qQ.A0B(r14, r1)
            r3 = r31
            r1 = r102
            X.0qQ.A0B(r1, r3)
            r1 = r33
            X.0qQ.A0B(r11, r1)
            r1 = r34
            X.0qQ.A0B(r10, r1)
            r1 = r35
            X.0qQ.A0B(r9, r1)
            r1 = 30
            X.0qQ.A0B(r7, r1)
            X.GBn r1 = r12.A1K
            r116 = r1
            X.GCa r6 = new X.GCa
            r6.<init>(r15, r1)
            X.GCA r1 = r12.A0z
            r1.A00(r6)
            X.Hlh r1 = r12.A1E
            r111 = r1
            X.GAc r1 = r12.A19
            r70 = r1
            X.HqC r1 = r12.A0n
            r83 = r1
            X.93T r1 = r12.A1D
            r75 = r1
            X.0eM r1 = r12.A1f
            java.lang.Object r5 = r1.getValue()
            X.GCT r5 = (X.GCT) r5
            X.GE2 r1 = r12.A12
            r98 = r1
            X.Hrq r1 = r12.A14
            r99 = r1
            X.TrX r1 = r12.A0k
            r74 = r1
            X.GIN r1 = r12.A15
            r100 = r1
            X.GHv r1 = r12.A0x
            r94 = r1
            X.GCB r1 = r12.A09
            r90 = r1
            com.instagram.clips.intf.ClipsViewerConfig r3 = r12.A0Y
            java.lang.String r1 = r3.A1F
            r118 = r1
            X.GF2 r1 = r12.A1H
            r113 = r1
            X.4h9 r1 = r12.A0S
            r64 = r1
            X.HJk r1 = r12.A0q
            r68 = r1
            java.lang.String r1 = r12.A1M
            r119 = r1
            java.lang.String r1 = r12.A1N
            r120 = r1
            boolean r1 = r3.A1q
            r122 = r1
            X.HK5 r1 = r12.A10
            r96 = r1
            X.JU5 r1 = r12.A0e
            r71 = r1
            X.4gf r1 = r3.A0T
            r76 = r1
            X.GI5 r1 = r12.A11
            r97 = r1
            boolean r1 = r3.A1m
            r123 = r1
            X.Hjm r1 = r12.A0m
            r81 = r1
            X.GE0 r1 = r12.A1B
            r110 = r1
            X.H3C r1 = r12.A17
            r105 = r1
            X.IMq r1 = r12.A08
            r35 = r1
            X.How r1 = r12.A1I
            r34 = r1
            X.GCb r1 = new X.GCb
            r58 = r1
            r61 = r2
            r62 = r12
            r63 = r0
            r65 = r3
            r66 = r126
            r67 = r0
            r69 = r15
            r72 = r57
            r73 = r24
            r77 = r9
            r78 = r39
            r79 = r47
            r80 = r0
            r82 = r12
            r84 = r27
            r85 = r68
            r86 = r53
            r87 = r50
            r88 = r35
            r89 = r40
            r91 = r6
            r92 = r20
            r93 = r21
            r95 = r5
            r101 = r51
            r103 = r14
            r104 = r55
            r106 = r11
            r107 = r7
            r108 = r10
            r109 = r70
            r112 = r37
            r114 = r54
            r115 = r34
            r117 = r52
            r121 = r13
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123)
            r2 = r1
            r1 = r56
            r1.A06 = r2
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.0eM r1 = r1.A1c
            java.lang.Object r6 = r1.getValue()
            X.JNq r6 = (X.C59544JNq) r6
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.Hlh r5 = r1.A1E
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            java.lang.String r3 = r1.A0l
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            java.lang.String r2 = r1.A0k
            X.GCn r1 = new X.GCn
            r1.<init>(r6, r5, r3, r2)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GBn r2 = r2.A1K
            r2.A94(r1)
            X.GD6 r6 = r0.A0C
            if (r6 == 0) goto L_0x23a6
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.0eM r1 = r1.A1c
            java.lang.Object r5 = r1.getValue()
            X.JTB r5 = (X.JTB) r5
            java.lang.Object r3 = r125.getValue()
            X.GCY r3 = (X.GCY) r3
            X.0eM r1 = r0.A19
            java.lang.Object r2 = r1.getValue()
            X.GCo r2 = (X.C52042GCo) r2
            X.0qQ.A0B(r5, r8)
            r1 = r45
            X.0qQ.A0B(r3, r1)
            r1 = r25
            X.0qQ.A0B(r2, r1)
            X.GBe r1 = r6.A0C
            r1.A01 = r5
            r1.A03 = r3
            r3 = r18
            r1.A02 = r3
            r1.A04 = r2
            X.GC7 r1 = r0.A0I
            if (r1 == 0) goto L_0x23a1
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.0eM r2 = r2.A1c
            java.lang.Object r2 = r2.getValue()
            X.JTB r2 = (X.JTB) r2
            X.0qQ.A0B(r2, r8)
            r1.A00 = r2
            X.GBE r6 = r0.A09
            if (r6 == 0) goto L_0x0bc5
            com.instagram.clips.intf.ClipsViewerConfig r5 = r6.A0Y
            boolean r1 = r5.A1t
            if (r1 != 0) goto L_0x1d4e
            java.util.List r1 = X.C52213GJe.A02
            X.GAc r3 = r6.A19
            java.lang.String r2 = r3.getModuleName()
            X.0qQ.A0B(r2, r8)
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x1caa
            java.lang.String r3 = r3.getModuleName()
            java.lang.Integer r2 = r5.A0a
            r1 = 0
            if (r2 == 0) goto L_0x1ca0
            r1 = 1
        L_0x1ca0:
            com.instagram.common.session.UserSession r2 = r6.A0a
            com.instagram.clips.intf.ClipsViewerSource r5 = r5.A0J
            boolean r1 = X.GEE.A00(r5, r2, r3, r1)
            if (r1 == 0) goto L_0x1d4e
        L_0x1caa:
            com.instagram.common.session.UserSession r14 = A01(r0)
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.07V r13 = r1.getLifecycle()
            X.GD6 r12 = r0.A0C
            if (r12 != 0) goto L_0x1cc1
            r26 = r28
        L_0x1cbc:
            X.0qQ.A0F(r26)
            goto L_0x0698
        L_0x1cc1:
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.HJk r11 = r1.A0q
            X.GBj r10 = r0.A0N
            if (r10 == 0) goto L_0x1cbc
            X.2nF r9 = r1.A0X
            java.lang.String r7 = r1.A1O
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            boolean r6 = r1.A1f
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GAc r1 = r1.A19
            java.lang.String r5 = r1.getModuleName()
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            java.lang.Integer r1 = r1.A0a
            r3 = 0
            if (r1 == 0) goto L_0x1ce9
            r3 = 1
        L_0x1ce9:
            com.instagram.common.session.UserSession r2 = A01(r0)
            r1 = r126
            boolean r1 = X.GEE.A00(r1, r2, r5, r3)
            if (r1 != 0) goto L_0x1cfe
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.0eM r1 = r1.A1Q
            r1.getValue()
        L_0x1cfe:
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GAc r3 = r1.A19
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            java.lang.String r2 = r1.A0x
            A00(r0)
            r1 = r45
            X.0qQ.A0B(r14, r1)
            r1 = r36
            X.0qQ.A0B(r13, r1)
            r1 = r44
            X.0qQ.A0B(r11, r1)
            r1 = 10
            X.0qQ.A0B(r3, r1)
            if (r6 != 0) goto L_0x1d4e
            X.GKE r1 = new X.GKE
            r50 = r1
            r51 = r48
            r52 = r13
            r53 = r9
            r54 = r3
            r55 = r14
            r56 = r12
            r57 = r11
            r58 = r10
            r59 = r7
            r60 = r2
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.GCH r2 = r2.A1A
            r2.A03(r1)
            X.GBj r2 = r0.A0N
            if (r2 == 0) goto L_0x1cbc
            r2.A0J(r1)
        L_0x1d4e:
            X.GD6 r3 = r0.A0C
            if (r3 == 0) goto L_0x23a6
            X.GCR r2 = r0.A0b
            if (r2 == 0) goto L_0x239c
            X.GKI r1 = new X.GKI
            r1.<init>(r2)
            X.GBe r2 = r3.A0C
            r2.A00 = r1
            X.9LR r1 = new X.9LR
            r3 = r30
            r1.<init>(r0, r3)
            r2.A08 = r1
            r3 = 16
            X.9LR r1 = new X.9LR
            r1.<init>(r0, r3)
            r2.A09 = r1
            r3 = 17
            X.9LR r1 = new X.9LR
            r1.<init>(r0, r3)
            r2.A0A = r1
            X.9LR r1 = new X.9LR
            r3 = r31
            r1.<init>(r0, r3)
            r2.A0D = r1
            r3 = 19
            X.9LR r1 = new X.9LR
            r1.<init>(r0, r3)
            r2.A07 = r1
            r3 = 20
            X.9LR r1 = new X.9LR
            r1.<init>(r0, r3)
            r2.A0B = r1
            X.9LR r1 = new X.9LR
            r3 = r33
            r1.<init>(r0, r3)
            r2.A0C = r1
            X.9LR r1 = new X.9LR
            r3 = r32
            r1.<init>(r0, r3)
            r2.A0E = r1
            com.instagram.common.session.UserSession r3 = A01(r0)
            r1 = 36318556987726056(0x810789000218e8, double:3.031339909904105E-306)
            boolean r5 = X.182.A06(r4, r3, r1)
            if (r5 == 0) goto L_0x2214
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            r2 = 46
            X.9LH r1 = new X.9LH
            r1.<init>(r0, r2)
            r3.A0S(r1)
        L_0x1dc4:
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GCH r2 = r1.A1A
            X.GJx r1 = r1.A0l
            r2.A03(r1)
            if (r5 != 0) goto L_0x1ddf
            X.GBE r3 = r0.A09
            if (r3 == 0) goto L_0x0bc5
            r2 = 34
            X.IwI r1 = new X.IwI
            r1.<init>(r0, r2)
            r3.A0S(r1)
        L_0x1ddf:
            com.instagram.clips.intf.ClipsViewerSource r2 = com.instagram.clips.intf.ClipsViewerSource.MID_CARD_INJECT_TOOL
            r1 = r126
            if (r1 != r2) goto L_0x1e27
            com.instagram.common.session.UserSession r1 = A01(r0)
            X.GLi r1 = X.C52266GLh.A00(r1)
            java.util.HashMap r1 = r1.A00()
            java.util.Collection r1 = r1.values()
            X.0qQ.A07(r1)
            java.lang.Object r1 = X.00k.A0A(r1)
            X.GmI r1 = (X.C53332GmI) r1
            if (r1 == 0) goto L_0x1e27
            X.GD6 r3 = r0.A0C
            if (r3 == 0) goto L_0x23a6
            X.GYP r2 = new X.GYP
            r2.<init>(r1)
            X.4bN r1 = new X.4bN
            r1.<init>((X.C267334bO) r2)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            X.0qQ.A07(r1)
            r3.A0B(r1, r8)
            com.instagram.common.session.UserSession r1 = A01(r0)
            X.GLi r1 = X.C52266GLh.A00(r1)
            java.util.HashMap r1 = r1.A00()
            r1.clear()
        L_0x1e27:
            X.0xi r3 = X.0tS.A4E
            r1 = r42
            com.instagram.common.session.UserSession r1 = r1.A00
            X.0wX r1 = r1.A03
            android.content.Context r1 = r1.A06()
            r3.A01(r1)
            if (r5 == 0) goto L_0x1e43
            X.GBj r2 = r0.A0N
            if (r2 == 0) goto L_0x1cbc
            r1 = r48
            r5 = r29
            r0.A08(r1, r5, r2)
        L_0x1e43:
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.07V r10 = r2.getLifecycle()
            X.0qQ.A0B(r10, r8)
            X.0eM r2 = r1.A1l
            java.lang.Object r13 = r2.getValue()
            X.GCu r13 = (X.C52048GCu) r13
            X.GLn r12 = r1.A0J
            com.instagram.clips.intf.ClipsViewerConfig r11 = r13.A00
            boolean r1 = r13.A04
            if (r1 == 0) goto L_0x21d9
            com.instagram.common.session.UserSession r10 = r13.A01
            com.instagram.clips.intf.ClipsViewerSource r9 = r11.A0J
            java.lang.String r7 = r11.A1H
            java.lang.String r6 = r11.A00
            boolean r5 = r11.A1f
            java.lang.String r2 = r11.A1L
            java.lang.String r1 = r11.A1K
            r14 = r45
            X.0qQ.A0B(r9, r14)
            X.1E8 r14 = X.1E7.A00(r10)
            X.1Xj r15 = r14.A02(r7)
            r14 = 0
            if (r15 == 0) goto L_0x1e81
            r14 = 1
        L_0x1e81:
            java.lang.Boolean r31 = java.lang.Boolean.valueOf(r14)
            r29 = r9
            r30 = r10
            r32 = r6
            r33 = r2
            r34 = r1
            r35 = r5
            boolean r2 = X.C52047GCt.A00(r29, r30, r31, r32, r33, r34, r35)
            if (r2 == 0) goto L_0x1eab
            if (r12 == 0) goto L_0x21b5
            java.lang.String r2 = r12.A01
            if (r2 == 0) goto L_0x21b5
            X.GLR r6 = r13.A02
            if (r6 == 0) goto L_0x1eab
            X.BJ4 r5 = new X.BJ4
            r1 = r45
            r5.<init>(r2, r1)
        L_0x1ea8:
            r6.A0B(r5)
        L_0x1eab:
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.07V r9 = r2.getLifecycle()
            X.0qQ.A0B(r9, r8)
            X.0eM r2 = r1.A1l
            java.lang.Object r7 = r2.getValue()
            X.GCu r7 = (X.C52048GCu) r7
            X.GLn r6 = r1.A0J
            com.instagram.clips.intf.ClipsViewerConfig r1 = r7.A00
            com.instagram.clips.intf.ClipsViewerSource r2 = r1.A0J
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.MID_CARD_CONTEXTUAL_CHAIN_WITH_RECIPE_SHEET_TRENDING_TRACK_WITH_SIMILAR_ACCOUNTS
            if (r2 == r1) goto L_0x215a
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.MID_CARD_OPEN_REELS_CHAIN
            if (r2 == r1) goto L_0x215a
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_MEDIA_NOTES
            if (r2 == r1) goto L_0x215a
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.EDUCATION_HUB
            if (r2 == r1) goto L_0x215a
        L_0x1ed8:
            X.GBE r9 = r0.A09
            if (r9 == 0) goto L_0x0bc5
            com.instagram.common.session.UserSession r7 = r9.A0a
            X.0sa r1 = r9.A20
            java.lang.Object r6 = r1.invoke()
            X.2rN r6 = (X.C231292rN) r6
            X.GAc r5 = r9.A19
            X.0MB r34 = X.0MB.A05(r7)
            X.4h9 r2 = r9.A0S
            X.348 r1 = new X.348
            r29 = r1
            r30 = r0
            r31 = r7
            r32 = r5
            r33 = r6
            r35 = r46
            r36 = r2
            r37 = r46
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37)
            r9.A05 = r1
            com.instagram.common.session.UserSession r2 = A01(r0)
            r1 = r45
            X.0qQ.A0B(r2, r1)
            X.9Ky r1 = new X.9Ky
            r5 = r44
            r1.<init>(r2, r5)
            X.0eM r1 = X.AnonymousClass1YB.A00(r1)
            java.lang.Object r1 = r1.getValue()
            X.35H r1 = (X.AnonymousClass35H) r1
            com.instagram.common.session.UserSession r5 = r1.A00
            r1 = 36328654455913986(0x8110b800033e02, double:3.0377255894453925E-306)
            r6 = r22
            boolean r1 = X.182.A06(r6, r5, r1)
            if (r1 == 0) goto L_0x1f3d
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            com.instagram.common.session.UserSession r2 = A01(r0)
            java.lang.String r1 = r0.getModuleName()
            X.AnonymousClass4KB.A00(r5, r0, r2, r1)
        L_0x1f3d:
            X.2jd r5 = new X.2jd
            r5.<init>()
            X.GC3 r1 = r0.A0M
            if (r1 == 0) goto L_0x2397
            r5.A0E(r1)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GCA r1 = r1.A0z
            r5.A0E(r1)
            r1 = r21
            r5.A0E(r1)
            r1 = r20
            r5.A0E(r1)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.2qT r1 = r1.A0i
            r5.A0E(r1)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GCx r1 = r1.A0o
            r5.A0E(r1)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.2wu r1 = r1.A0d
            r5.A0E(r1)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.348 r1 = r1.A05
            r5.A0E(r1)
            X.GCp r1 = r0.A0H
            if (r1 == 0) goto L_0x1f87
            r5.A0E(r1)
        L_0x1f87:
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.2lJ r1 = r1.A0f
            if (r1 == 0) goto L_0x1f92
            r5.A0E(r1)
        L_0x1f92:
            com.instagram.common.session.UserSession r6 = A01(r0)
            r1 = 36324299358875604(0x810cc200002fd4, double:3.0349714085417515E-306)
            boolean r1 = X.182.A06(r4, r6, r1)
            com.instagram.common.session.UserSession r6 = A01(r0)
            X.GAT r2 = new X.GAT
            r2.<init>(r0, r1)
            X.36D r1 = new X.36D
            r7 = r45
            r1.<init>(r6, r2, r7, r8)
            r5.A0E(r1)
            if (r17 == 0) goto L_0x2028
            com.instagram.common.session.UserSession r34 = A01(r0)
            java.lang.Integer r38 = X.AnonymousClass05K.A01
            androidx.fragment.app.FragmentActivity r32 = r0.requireActivity()
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GAc r7 = r1.A19
            X.2qi r6 = r1.A0h
            X.7QE r2 = r1.A0c
            X.7N7 r1 = new X.7N7
            r29 = r1
            r30 = r48
            r31 = r0
            r33 = r0
            r35 = r2
            r36 = r7
            r37 = r6
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r5.A0E(r1)
            com.instagram.common.session.UserSession r6 = A01(r0)
            r1 = 36328250730036366(0x81105a00133c8e, double:3.037470271574712E-306)
            boolean r1 = X.182.A06(r4, r6, r1)
            if (r1 != 0) goto L_0x1ffa
            com.instagram.common.session.UserSession r1 = A01(r0)
            X.4t3 r2 = X.C276314t2.A00(r1)
            r1 = r48
            r2.A00(r1)
        L_0x1ffa:
            com.instagram.common.session.UserSession r6 = A01(r0)
            X.0qQ.A0B(r6, r8)
            java.lang.Boolean r1 = X.AnonymousClass35I.A00(r6)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x2028
            r1 = 2342172144706404173(0x20811128000a3f4d, double:4.073332003113549E-152)
            boolean r1 = X.182.A06(r4, r6, r1)
            if (r1 == 0) goto L_0x2028
            com.instagram.common.session.UserSession r6 = A01(r0)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GAc r2 = r1.A19
            com.instagram.nme.contextualpromo.ClipsUploadPromoHelper r1 = new com.instagram.nme.contextualpromo.ClipsUploadPromoHelper
            r1.<init>(r0, r6, r2)
            r5.A0E(r1)
        L_0x2028:
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            java.lang.String r2 = r1.A1I
            if (r2 != 0) goto L_0x203a
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            com.instagram.clips.model.ClipsReplyBarData r1 = r1.A0L
            if (r1 == 0) goto L_0x2157
            java.lang.String r2 = r1.A0B
        L_0x203a:
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            boolean r1 = r1.A1g
            if (r1 == 0) goto L_0x2153
            java.lang.String r2 = ""
        L_0x2044:
            com.instagram.common.session.UserSession r32 = A01(r0)
            X.GBj r1 = r0.A0N
            if (r1 == 0) goto L_0x1cbc
            X.GMC r6 = new X.GMC
            r29 = r6
            r30 = r48
            r31 = r0
            r33 = r46
            r34 = r1
            r35 = r46
            r36 = r2
            r37 = r46
            r38 = r46
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r5.A0E(r6)
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            java.lang.String r1 = r1.A1I
            if (r1 == 0) goto L_0x2081
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            com.instagram.clips.intf.ClipsViewerSource r2 = r1.A0J
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.BLEND
            if (r2 == r1) goto L_0x2081
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            boolean r2 = r1.A0N
            r1 = 1
            if (r2 == 0) goto L_0x2082
        L_0x2081:
            r1 = 0
        L_0x2082:
            r6.A03(r1)
            r0.A05 = r6
        L_0x2087:
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            r1.A0K = r8
            r0.registerLifecycleListenerSet(r5)
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            boolean r1 = r1.A20
            if (r1 == 0) goto L_0x20bf
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            java.lang.String r1 = r1.A1H
            if (r1 == 0) goto L_0x20bf
            X.GD9 r1 = r0.A0O()
            X.4bN r1 = r1.A02()
            if (r1 == 0) goto L_0x20bf
            X.1Xj r5 = r1.A02
            if (r5 == 0) goto L_0x20bf
            com.instagram.common.session.UserSession r2 = A01(r0)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GAc r1 = r1.A19
            java.lang.String r1 = r1.getModuleName()
            X.C48899Elz.A00(r0, r2, r5, r1)
        L_0x20bf:
            X.3E5 r1 = X.AnonymousClass3E4.A01(r0, r8, r8)
            r0.A0X = r1
            com.instagram.common.session.UserSession r5 = A01(r0)
            r1 = 36317466065900703(0x81068b0000149f, double:3.030650006548962E-306)
            X.182.A06(r4, r5, r1)
            r1 = r48
            X.0tS r4 = r3.A01(r1)
            X.0s0 r3 = r4.A2k
            X.0YZ[] r2 = X.0tS.A4G
            r1 = 49
            r1 = r2[r1]
            java.lang.Object r1 = r3.CDM(r4, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x20ff
            X.GD6 r3 = r0.A0C
            if (r3 == 0) goto L_0x23a6
            X.HK4 r2 = new X.HK4
            r1 = r48
            r2.<init>(r1, r3)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GCA r1 = r1.A0z
            r1.A00(r2)
        L_0x20ff:
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.0eM r1 = r1.A1a
            java.lang.Object r2 = r1.getValue()
            X.GCz r2 = (X.C52053GCz) r2
            if (r2 == 0) goto L_0x2116
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.3DW r1 = r1.A0j
            r1.A00(r2)
        L_0x2116:
            X.2k2 r2 = r0.volumeKeyPressController
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GBn r1 = r1.A1K
            X.4DM r1 = r1.A0D
            r2.A00(r1)
            X.GBj r1 = r0.A0N
            if (r1 == 0) goto L_0x2232
            com.instagram.common.session.UserSession r20 = A01(r0)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GBn r3 = r1.A1K
            X.GD9 r24 = r0.A0O()
            X.GBj r2 = r0.A0N
            if (r2 == 0) goto L_0x1cbc
            com.instagram.common.session.UserSession r1 = A01(r0)
            X.1Ng r19 = X.AnonymousClass1Nd.A00(r1)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GAc r1 = r1.A19
            java.lang.String r25 = r1.getModuleName()
            X.GBq r4 = r0.A08
            if (r4 != 0) goto L_0x2221
            java.lang.String r16 = "videoControllerDelegate"
            goto L_0x0bc5
        L_0x2153:
            if (r2 == 0) goto L_0x2087
            goto L_0x2044
        L_0x2157:
            r2 = 0
            goto L_0x203a
        L_0x215a:
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_MEDIA_NOTES
            if (r2 != r1) goto L_0x2183
            boolean r1 = r7.A04
            if (r1 == 0) goto L_0x217d
            if (r6 == 0) goto L_0x216e
            java.lang.String r1 = r6.A01
            if (r1 == 0) goto L_0x216e
            boolean r1 = X.00l.A0W(r1)
            if (r1 == 0) goto L_0x2183
        L_0x216e:
            com.instagram.common.session.UserSession r5 = r7.A01
            r1 = 2342163662150050545(0x20810971004822f1, double:4.066139514880736E-152)
            boolean r1 = X.182.A06(r4, r5, r1)
            if (r1 == 0) goto L_0x2183
            goto L_0x1ed8
        L_0x217d:
            X.GCr r1 = r7.A03
            java.lang.String r1 = r1.A01
            if (r1 == 0) goto L_0x216e
        L_0x2183:
            boolean r1 = r7.A04
            if (r1 == 0) goto L_0x219d
            if (r6 == 0) goto L_0x1ed8
            java.lang.String r5 = r6.A01
            if (r5 == 0) goto L_0x1ed8
            X.GLR r6 = r7.A02
            if (r6 == 0) goto L_0x1ed8
            X.BJ4 r2 = new X.BJ4
            r1 = r45
            r2.<init>(r5, r1)
            r6.A0B(r2)
            goto L_0x1ed8
        L_0x219d:
            X.GCr r6 = r7.A03
            X.0xx r7 = X.C71772f0.A00(r9)
            X.ImL r5 = new X.ImL
            r2 = r38
            r1 = r46
            r5.<init>(r6, r1, r2)
            X.19B r2 = X.19B.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.1Eo.A03(r1, r2, r5, r7)
            goto L_0x1ed8
        L_0x21b5:
            java.lang.String r2 = r11.A1A
            r5 = r7
            if (r2 == 0) goto L_0x21d6
            java.lang.String r2 = X.C70282O0m.A00(r2)
            if (r2 == 0) goto L_0x21d6
            r5 = r2
        L_0x21c1:
            X.1Xv r2 = X.1Xj.A0h
            java.lang.String r2 = X.1Xv.A06(r5)
            if (r2 == 0) goto L_0x1eab
            X.GLR r6 = r13.A02
            if (r6 == 0) goto L_0x1eab
            X.B5J r7 = X.B5J.A00
            X.GPD r5 = new X.GPD
            r5.<init>(r2, r1, r7)
            goto L_0x1ea8
        L_0x21d6:
            if (r7 == 0) goto L_0x1eab
            goto L_0x21c1
        L_0x21d9:
            X.GCr r13 = r13.A03
            com.instagram.clips.intf.ClipsViewerSource r12 = r11.A0J
            java.lang.String r9 = r11.A00
            java.lang.String r7 = r11.A1H
            java.lang.String r6 = r11.A1A
            boolean r5 = r11.A1f
            java.lang.String r2 = r11.A1L
            java.lang.String r11 = r11.A1K
            r1 = r45
            X.0qQ.A0B(r12, r1)
            X.0xx r10 = X.C71772f0.A00(r10)
            X.GKG r1 = new X.GKG
            r50 = r1
            r51 = r12
            r52 = r13
            r53 = r9
            r54 = r7
            r55 = r6
            r56 = r2
            r57 = r11
            r58 = r46
            r59 = r5
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59)
            X.19B r5 = X.19B.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.1Eo.A03(r2, r5, r1, r10)
            goto L_0x1eab
        L_0x2214:
            X.GBj r2 = r0.A0N
            if (r2 == 0) goto L_0x1cbc
            r1 = r48
            r3 = r29
            r0.A08(r1, r3, r2)
            goto L_0x1dc4
        L_0x2221:
            X.GCv r1 = new X.GCv
            r17 = r1
            r18 = r48
            r21 = r4
            r22 = r3
            r23 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r0.A0f = r1
        L_0x2232:
            android.os.Bundle r2 = r0.requireArguments()
            java.lang.String r1 = "ClipsConstants.ARGS_IGSHID"
            java.lang.String r1 = r2.getString(r1)
            if (r1 == 0) goto L_0x2278
            X.Hjj r7 = new X.Hjj
            r7.<init>(r0)
            com.instagram.common.session.UserSession r6 = A01(r0)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GAc r5 = r1.A19
            android.content.Context r3 = r0.requireContext()
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            X.I4M r2 = new X.I4M
            r2.<init>(r3, r4, r5, r6, r7)
            r0.A0i = r2
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            java.lang.String r1 = r1.A1A
            if (r1 == 0) goto L_0x226a
            java.lang.String r1 = X.C70282O0m.A00(r1)
            r2.A02 = r1
        L_0x226a:
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GBn r1 = r1.A1K
            r1.A02 = r2
            X.GD6 r1 = r0.A0C
            if (r1 == 0) goto L_0x23a6
            r1.A00 = r2
        L_0x2278:
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            boolean r1 = r1.A1n
            if (r1 == 0) goto L_0x22b1
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.07V r1 = r1.getLifecycle()
            X.0xx r14 = X.C71772f0.A00(r1)
            r124.getValue()
            com.instagram.common.session.UserSession r10 = r2.A0a
            X.0sa r1 = r2.A20
            java.lang.Object r11 = r1.invoke()
            X.GD6 r11 = (X.GD6) r11
            X.GBn r13 = r2.A1K
            X.0eM r1 = r2.A1c
            java.lang.Object r12 = r1.getValue()
            X.JTB r12 = (X.JTB) r12
            X.HKC r9 = new X.HKC
            r9.<init>(r10, r11, r12, r13, r14)
            X.GCA r1 = r2.A0z
            r1.A00(r9)
        L_0x22b1:
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            com.instagram.clips.intf.ClipsViewerSource r2 = r1.A0J
            r1 = r43
            if (r2 != r1) goto L_0x22ca
            X.0wX r1 = X.C61170le.A00
            X.18g r2 = X.C638918c.A01(r1)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.Ah8 r1 = r1.A0w
            r2.A0R(r1)
        L_0x22ca:
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            java.lang.String r1 = r1.A1O
            if (r1 == 0) goto L_0x22fc
            X.GD6 r5 = r0.A0C
            if (r5 == 0) goto L_0x23a6
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            java.lang.String r4 = r1.A1H
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            java.lang.String r3 = r1.A1O
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.0eM r1 = r1.A1c
            java.lang.Object r1 = r1.getValue()
            X.JTB r1 = (X.JTB) r1
            X.Ieq r2 = new X.Ieq
            r2.<init>(r5, r1, r4, r3)
            X.GBE r1 = r0.A09
            if (r1 == 0) goto L_0x0bc5
            X.GBn r1 = r1.A1K
            r1.A94(r2)
        L_0x22fc:
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            boolean r1 = r1.A1v
            if (r1 == 0) goto L_0x2315
            r3 = 8
            androidx.fragment.app.FragmentActivity r2 = r0.getActivity()
            boolean r1 = r2 instanceof X.AnonymousClass2ZP
            if (r1 == 0) goto L_0x2315
            X.2ZP r2 = (X.AnonymousClass2ZP) r2
            if (r2 == 0) goto L_0x2315
            r2.Enj(r3)
        L_0x2315:
            com.instagram.clips.intf.ClipsViewerConfig r1 = A00(r0)
            com.instagram.clips.intf.ClipsViewerSource r2 = r1.A0J
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.IMMERSIVE_CATCH_UP
            if (r2 != r1) goto L_0x2364
            X.GD6 r5 = r0.A0C
            if (r5 == 0) goto L_0x23a6
            X.5o2 r3 = X.C295365o2.CATCH_UP_SUMMARY
            X.GEC r2 = new X.GEC
            r1 = r46
            r2.<init>(r3, r1)
            X.4bN r4 = new X.4bN
            r4.<init>((X.GEC) r2)
            X.5o2 r3 = X.C295365o2.CATCH_UP_COMPLETED
            X.GEC r2 = new X.GEC
            r2.<init>(r3, r1)
            X.4bN r1 = new X.4bN
            r1.<init>((X.GEC) r2)
            X.4bN[] r1 = new X.C267324bN[]{r4, r1}
            java.util.List r2 = X.0sr.A1P(r1)
            X.GBg r1 = r5.A0A
            r1.A0O(r8, r2)
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.07V r1 = r1.getLifecycle()
            X.0xx r4 = X.C71772f0.A00(r1)
            r3 = 31
            X.ImL r2 = new X.ImL
            r1 = r46
            r2.<init>(r0, r1, r3)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r2, r4)
        L_0x2364:
            r1 = -503350480(0xffffffffe1ff7b30, float:-5.8909954E20)
            r0 = r49
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x236d:
            X.0hq r58 = r9.getSupportFragmentManager()
            goto L_0x0a58
        L_0x2373:
            java.lang.String r2 = r0.getModuleName()
            X.0xG r3 = new X.0xG
            r3.<init>(r2)
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x0bc5
            X.2el r2 = r2.A0b
            X.2nI r2 = X.C229382nI.A02(r0, r3, r10, r2)
            goto L_0x0a6f
        L_0x2388:
            X.34Q r1 = X.C3252971v.A00(r3)
            goto L_0x08f2
        L_0x238e:
            java.lang.String r1 = "clips_viewer"
            goto L_0x07f0
        L_0x2392:
            X.0qQ.A0F(r27)
            goto L_0x0698
        L_0x2397:
            X.0qQ.A0F(r23)
            goto L_0x0698
        L_0x239c:
            X.0qQ.A0F(r41)
            goto L_0x0698
        L_0x23a1:
            X.0qQ.A0F(r19)
            goto L_0x0698
        L_0x23a6:
            X.0qQ.A0F(r28)
            goto L_0x0698
        L_0x23ab:
            r116 = 0
            goto L_0x0274
        L_0x23af:
            r2 = 36320197665103967(0x8109070000205f, double:3.032377480884373E-306)
            boolean r2 = X.182.A06(r4, r1, r2)
            if (r2 != 0) goto L_0x023e
            r2 = 36320197665759335(0x810907000a2067, double:3.0323774812988305E-306)
            boolean r2 = X.182.A06(r4, r1, r2)
            if (r2 != 0) goto L_0x023e
            r139 = 0
            goto L_0x023e
        L_0x23c9:
            r139 = 1
            goto L_0x023e
        L_0x23cd:
            r50 = 0
            r51 = 0
            goto L_0x021c
        L_0x23d3:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r13)
            r1 = -987842734(0xffffffffc51eb752, float:-2539.4575)
            goto L_0x23fc
        L_0x23dc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
            throw r0
        L_0x23e2:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r13)
            r1 = 1038395900(0x3de4a9fc, float:0.111652344)
            goto L_0x23fc
        L_0x23eb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r13)
            r1 = -631416376(0xffffffffda5d59c8, float:-1.55761713E16)
            goto L_0x23fc
        L_0x23f4:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r13)
            r1 = -726267773(0xffffffffd4b60883, float:-6.2546148E12)
        L_0x23fc:
            r0 = r49
            X.AnonymousClass0fD.A09(r1, r0)
            throw r2
        L_0x2402:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
            throw r0
        L_0x2408:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
            throw r0
        L_0x240e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227232is.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-527965818);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_viewer_fragment, viewGroup, false);
        C234342xi r0 = this.A0a;
        if (r0 == null) {
            0qQ.A0F("zoomController");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0A(inflate);
        r0.D6z(inflate);
        AnonymousClass0fD.A09(-1441332735, A022);
        return inflate;
    }

    /* JADX WARNING: type inference failed for: r0v99, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r3 == com.instagram.clips.intf.ClipsViewerSource.A1T) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroy() {
        /*
            r13 = this;
            r0 = -497786577(0xffffffffe254612f, float:-9.7942814E20)
            int r2 = X.AnonymousClass0fD.A02(r0)
            super.onDestroy()
            com.instagram.clips.intf.ClipsViewerConfig r0 = A00(r13)
            com.instagram.clips.intf.ClipsViewerSource r3 = r0.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.FEED_TIMELINE_SEED_AD
            if (r3 == r0) goto L_0x0019
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.FEED_TIMELINE_FEED_OF_ADS
            r0 = 0
            if (r3 != r1) goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            java.lang.String r12 = "clipsViewerFragmentViewModel"
            r3 = 0
            if (r0 == 0) goto L_0x0049
            X.GBE r0 = r13.A09
            if (r0 == 0) goto L_0x00cb
            int r1 = r0.A00
            r0 = 4
            if (r1 < r0) goto L_0x0049
            com.instagram.common.session.UserSession r5 = A01(r13)
            X.0Tu r4 = X.0Tu.A06
            r0 = 36321992961828743(0x810aa900062787, double:3.033512833762201E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0049
            com.instagram.common.session.UserSession r0 = A01(r13)
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            X.36p r0 = new X.36p
            r0.<init>()
            r1.A00(r0)
        L_0x0049:
            com.instagram.common.session.UserSession r0 = A01(r13)
            X.1wY r1 = X.1wY.A00(r0)
            java.lang.String r0 = r13.getModuleName()
            r1.A08(r0)
            X.GBE r6 = r13.A09
            if (r6 == 0) goto L_0x00cb
            X.2nH r4 = r6.A02
            if (r4 == 0) goto L_0x006a
            X.2nF r1 = r6.A0X
            java.lang.String r0 = r6.A1O
            r1.A05(r4, r0)
            r1.A05(r6, r0)
        L_0x006a:
            X.GLd r1 = r6.A1G
            if (r1 == 0) goto L_0x007d
            java.util.Set r0 = r1.A01
            r0.clear()
            java.util.Set r0 = r1.A00
            r0.clear()
            java.util.Set r0 = r1.A02
            r0.clear()
        L_0x007d:
            X.GE3 r0 = r6.A18
            X.0qK r0 = r0.A05
            X.C61940qJ.A00(r0)
            X.IOG r0 = r6.A0y
            X.14i.A06(r0)
            com.instagram.common.session.UserSession r5 = r6.A0a
            r4 = 0
            X.0qQ.A0B(r5, r4)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36323586395090205(0x810c1c000c2d1d, double:3.0345205273729905E-306)
            boolean r0 = X.182.A06(r8, r5, r0)
            if (r0 == 0) goto L_0x00a2
            X.GE0 r0 = r6.A1B
            X.GIQ r0 = r0.A05
            r0.A01 = r3
        L_0x00a2:
            X.H3C r0 = r6.A17
            if (r0 == 0) goto L_0x00a8
            r0.A00 = r3
        L_0x00a8:
            X.GBE r0 = r13.A09
            if (r0 == 0) goto L_0x00cb
            X.0eM r0 = r0.A1Q
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00c1
            X.2wV r0 = r13.A0Z
            if (r0 == 0) goto L_0x00c1
            r0.A0B()
        L_0x00c1:
            X.GBE r9 = r13.A09
            if (r9 == 0) goto L_0x00cb
            X.GD6 r10 = r13.A0C
            if (r10 != 0) goto L_0x00d3
            java.lang.String r12 = "viewerAdapter"
        L_0x00cb:
            X.0qQ.A0F(r12)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d3:
            X.5o2 r1 = X.C295365o2.ORGANIC
            X.5o2 r0 = X.C295365o2.AD
            r5 = 1
            X.5o2[] r0 = new X.C295365o2[]{r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r0.iterator()
        L_0x00e9:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r1 = r6.next()
            X.5o2 r1 = (X.C295365o2) r1
            X.GBg r0 = r10.A0A
            java.util.List r0 = r0.A0K(r1)
            X.018.A16(r0, r7)
            goto L_0x00e9
        L_0x00ff:
            java.util.List r1 = r9.A1P
            java.util.Set r0 = X.00k.A0k(r1)
            r9.A0R(r7, r0)
            r1.clear()
            X.GBE r0 = r13.A09
            if (r0 == 0) goto L_0x00cb
            X.HJk r0 = r0.A0q
            r0.A0L()
            X.GBE r0 = r13.A09
            if (r0 == 0) goto L_0x00cb
            boolean r0 = r0.A0U()
            if (r0 == 0) goto L_0x0129
            com.instagram.common.session.UserSession r0 = A01(r13)
            X.GMD r0 = X.GNS.A00(r0)
            r0.onUserSessionWillEnd(r5)
        L_0x0129:
            com.instagram.clips.intf.ClipsViewerConfig r0 = A00(r13)
            com.instagram.clips.intf.ClipsViewerSource r0 = r0.A0J
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0151
            com.instagram.common.session.UserSession r0 = A01(r13)
            X.GTq r11 = X.GM4.A00(r0)
            java.lang.Long r0 = r11.A07
            if (r0 == 0) goto L_0x0151
            long r9 = r0.longValue()
            long r0 = r11.A02
            X.0JR r6 = r11.A08
            long r6 = r6.now()
            long r6 = r6 - r9
            long r0 = r0 + r6
            r11.A02 = r0
        L_0x0151:
            com.instagram.common.session.UserSession r6 = A01(r13)
            X.0qQ.A0B(r6, r4)
            r0 = 36320541264126552(0x81095700192258, double:3.032594774289818E-306)
            boolean r0 = X.182.A06(r8, r6, r0)
            if (r0 == 0) goto L_0x0175
            r0 = 14
            X.WxR r1 = new X.WxR
            r1.<init>(r6, r0)
            java.lang.Class<X.6gG> r0 = X.C313326gG.class
            java.lang.Object r0 = r6.A01(r0, r1)
            X.6gG r0 = (X.C313326gG) r0
            r0.A00()
        L_0x0175:
            X.GBE r0 = r13.A09
            if (r0 == 0) goto L_0x00cb
            X.348 r0 = r0.A05
            if (r0 == 0) goto L_0x0180
            r0.onPause()
        L_0x0180:
            X.GBE r0 = r13.A09
            if (r0 == 0) goto L_0x00cb
            X.GBn r1 = r0.A1K
            r1.A00 = r3
            monitor-enter(r1)
            X.0qK r0 = r1.A0F     // Catch:{ all -> 0x025e }
            X.C61940qJ.A00(r0)     // Catch:{ all -> 0x025e }
            java.util.Set r0 = r1.A0I     // Catch:{ all -> 0x025e }
            r0.clear()     // Catch:{ all -> 0x025e }
            java.util.Set r0 = r1.A0J     // Catch:{ all -> 0x025e }
            r0.clear()     // Catch:{ all -> 0x025e }
            monitor-exit(r1)
            X.GBE r0 = r13.A09
            if (r0 == 0) goto L_0x00cb
            X.GI5 r1 = r0.A11
            X.GBn r0 = r1.A09
            r0.EDu(r1)
            X.1wn r6 = r1.A00
            if (r6 == 0) goto L_0x01b3
            com.instagram.common.session.UserSession r0 = r1.A07
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.INX> r0 = X.INX.class
            r1.A02(r6, r0)
        L_0x01b3:
            X.GBE r0 = r13.A09
            if (r0 == 0) goto L_0x00cb
            X.0eM r0 = r0.A1n
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01d8
            com.instagram.common.session.UserSession r0 = A01(r13)
            X.OyY r0 = X.C72208OyY.A00(r0)
            X.OO3 r0 = r0.A01
            if (r0 == 0) goto L_0x01d8
            java.util.concurrent.ScheduledFuture r0 = r0.A09
            if (r0 == 0) goto L_0x01d8
            r0.cancel(r5)
        L_0x01d8:
            com.instagram.common.session.UserSession r0 = A01(r13)
            X.GMD r0 = X.GNS.A00(r0)
            java.util.List r0 = r0.A03
            r0.clear()
            X.GBE r1 = r13.A09
            if (r1 == 0) goto L_0x00cb
            X.GCH r0 = r1.A1A
            X.6z9 r0 = r0.A04
            X.6zA r0 = r0.A03
            r0.A06 = r3
            X.0eM r0 = r1.A1a
            java.lang.Object r1 = r0.getValue()
            X.GCz r1 = (X.C52053GCz) r1
            if (r1 == 0) goto L_0x0204
            X.GBE r0 = r13.A09
            if (r0 == 0) goto L_0x00cb
            X.3DW r0 = r0.A0j
            r0.A01(r1)
        L_0x0204:
            X.GBE r1 = r13.A09
            if (r1 == 0) goto L_0x00cb
            r1.A00 = r4
            r1.A0O = r4
            r1.A0M = r4
            X.GJw r0 = r1.A0p
            r0.A00 = r3
            r1.A07 = r3
            X.0eM r0 = X.GJW.A03
            java.lang.Object r0 = r0.getValue()
            X.GJW r0 = (X.GJW) r0
            r0.A00 = r3
            X.GCv r1 = r13.A0f
            if (r1 != 0) goto L_0x0226
            java.lang.String r12 = "clipsGradientBackgroundHelper"
            goto L_0x00cb
        L_0x0226:
            X.GBn r0 = r1.A04
            r0.EDu(r1)
            X.GBj r0 = r1.A05
            r0.A0K(r1)
            X.GOw r0 = r1.A00
            if (r0 == 0) goto L_0x023d
            X.19e r1 = r0.A01
            if (r1 == 0) goto L_0x023d
            X.GOx r0 = r0.A02
            r1.EDs(r0)
        L_0x023d:
            com.instagram.clips.intf.ClipsViewerConfig r0 = A00(r13)
            com.instagram.clips.intf.ClipsViewerSource r1 = r0.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.IMMERSIVE_CATCH_UP
            if (r1 != r0) goto L_0x0257
            com.instagram.common.session.UserSession r0 = A01(r13)
            com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository r0 = X.C63303Kum.A00(r0)
            X.HmS r0 = r0.A00
            r0.A00 = r3
            r0.A02 = r3
            r0.A01 = r3
        L_0x0257:
            r0 = -1590133815(0xffffffffa1387bc9, float:-6.2505453E-19)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x025e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227232is.onDestroy():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014f, code lost:
        if (r0.A0U() == false) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0041, code lost:
        if (r10 == com.instagram.clips.intf.ClipsViewerSource.A0u) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroyView() {
        /*
            r20 = this;
            r0 = 940323200(0x380c3180, float:3.34247E-5)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r3 = r20
            super.onDestroyView()
            com.instagram.common.session.UserSession r4 = A01(r3)
            X.0Tu r9 = X.0Tu.A06
            r0 = 36330067499958708(0x811201000041b4, double:3.0386192041891464E-306)
            boolean r0 = X.182.A06(r9, r4, r0)
            if (r0 == 0) goto L_0x00d2
            com.instagram.common.session.UserSession r0 = A01(r3)
            X.IOI r8 = X.I3O.A00(r0)
            com.instagram.common.session.UserSession r7 = A01(r3)
            r6 = 0
            X.0qQ.A0B(r7, r6)
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r8.A04
            long r4 = r4 - r0
            r8.A05 = r4
            com.instagram.clips.intf.ClipsViewerSource r10 = r8.A06
            boolean r0 = r10.A01()
            if (r0 != 0) goto L_0x0043
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.EXPLORE_GRID_AD_FEED_OF_ADS
            r0 = 0
            if (r10 != r1) goto L_0x0044
        L_0x0043:
            r0 = 1
        L_0x0044:
            r5 = 1
            if (r0 == 0) goto L_0x02f9
            com.instagram.clips.intf.ClipsViewerSource r1 = r8.A07
            if (r1 == 0) goto L_0x02f9
            boolean r0 = r1.A01()
            if (r0 != 0) goto L_0x0055
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.EXPLORE_GRID_AD_FEED_OF_ADS
            if (r1 != r0) goto L_0x02f9
        L_0x0055:
            int r0 = r8.A01
            int r0 = r0 + 1
            r8.A01 = r0
            r8.A07 = r10
            X.0xN r0 = X.C60510iO.A00(r7)
            java.lang.String r0 = r0.BcO()
            r8.A0A = r0
            androidx.fragment.app.FragmentActivity r7 = r3.getActivity()
            com.instagram.common.session.UserSession r6 = A01(r3)
            X.0qQ.A0B(r6, r5)
            X.IOI r4 = X.I3O.A00(r6)
            com.instagram.clips.intf.ClipsViewerSource r1 = r4.A06
            boolean r0 = r1.A01()
            if (r0 != 0) goto L_0x0090
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.EXPLORE_GRID_AD_FEED_OF_ADS
            if (r1 == r0) goto L_0x0090
            boolean r0 = X.I3O.A01(r1)
            if (r0 != 0) goto L_0x0090
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.DIRECT
            if (r1 == r0) goto L_0x0090
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.DIRECT_AD_FEED_OF_ADS
            if (r1 != r0) goto L_0x00bb
        L_0x0090:
            r0 = 36611542476724459(0x821201000118eb, double:3.216625112904565E-306)
            long r0 = X.182.A01(r9, r6, r0)
            int r8 = (int) r0
            int r0 = r4.A01
            int r1 = r4.A02
            if (r0 != r5) goto L_0x02f3
            if (r1 != 0) goto L_0x02e6
            java.lang.String r5 = "1066133294902025"
        L_0x00a4:
            java.lang.String r0 = "830787885872229"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x02e3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
        L_0x00b0:
            java.util.LinkedHashMap r0 = X.C55276Hf5.A00(r4, r0)
            X.1Wj r1 = X.1Wj.A00
            if (r1 == 0) goto L_0x00bb
            r1.A00(r7, r6, r5, r0)
        L_0x00bb:
            r0 = 0
            r4.A04 = r0
            r4.A05 = r0
            r1 = 0
            r4.A03 = r1
            java.util.HashMap r0 = r4.A0B
            r0.clear()
            r0 = 0
            r4.A09 = r0
            r4.A08 = r0
            r4.A00 = r1
            r4.A02 = r1
        L_0x00d2:
            X.2xi r0 = r3.A0a
            r1 = 0
            if (r0 != 0) goto L_0x00e1
            java.lang.String r7 = "zoomController"
        L_0x00d9:
            X.0qQ.A0F(r7)
        L_0x00dc:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00e1:
            r0.onDestroyView()
            com.instagram.common.session.UserSession r0 = A01(r3)
            X.34K r0 = X.AnonymousClass34J.A00(r0)
            r0.A00 = r1
            java.util.List r0 = X.Pzm.A00
            r0.clear()
            X.GD9 r0 = r3.A0O()
            X.4bN r5 = r0.A02()
            java.lang.String r9 = "clipsViewerFragmentViewModel"
            if (r5 == 0) goto L_0x01ab
            X.GBE r0 = r3.A09
            if (r0 == 0) goto L_0x02de
            X.GE2 r7 = r0.A12
            boolean r6 = r7.A05
            X.0xa r0 = r7.A0F
            X.0xY r4 = r0.AR4()
            java.lang.String r0 = "KEY_SCROLLED_ON_LAST_VIEW"
            r4.E5T(r0, r6)
            r4.apply()
            X.4bN r6 = r7.A01
            if (r6 != 0) goto L_0x011d
            X.4bN r6 = X.GE2.A00(r7)
        L_0x011d:
            r4 = 0
            if (r6 == 0) goto L_0x0135
            X.0sa r0 = r7.A0J
            java.lang.Object r0 = r0.invoke()
            X.GD6 r0 = (X.GD6) r0
            X.GBg r0 = r0.A0A
            X.GDe r0 = r0.BzC(r6)
            boolean r0 = r0.A0f
            if (r0 == 0) goto L_0x0135
            X.GE2.A01(r6, r7, r4)
        L_0x0135:
            X.GE2.A03(r7, r4)
            java.lang.Runnable r0 = r7.A0H
            X.11Z.A01(r0)
            com.instagram.clips.intf.ClipsViewerConfig r0 = A00(r3)
            com.instagram.clips.intf.ClipsViewerSource r4 = r0.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.BLEND
            if (r4 == r0) goto L_0x0151
            X.GBE r0 = r3.A09
            if (r0 == 0) goto L_0x02de
            boolean r0 = r0.A0U()
            if (r0 != 0) goto L_0x01ab
        L_0x0151:
            X.4bO r0 = r5.A0G
            boolean r4 = r0.CcK()
            r0 = 1
            if (r4 != r0) goto L_0x0229
            X.3OA r0 = r5.A06()
            boolean r0 = r0.A0t
            if (r0 == 0) goto L_0x0229
            X.3OA r0 = r5.A06()
            java.lang.String r0 = r0.A0S
            long r6 = java.lang.Long.parseLong(r0)
            java.lang.Long r14 = java.lang.Long.valueOf(r6)
        L_0x0170:
            X.GBE r0 = r3.A09
            if (r0 == 0) goto L_0x02de
            X.GAc r12 = r0.A19
            com.instagram.common.session.UserSession r10 = A01(r3)
            java.lang.String r15 = r3.A0O
            if (r15 != 0) goto L_0x0180
            java.lang.String r15 = "system_back"
        L_0x0180:
            X.1Xj r11 = r5.A02
            X.GBE r0 = r3.A09
            if (r0 == 0) goto L_0x02de
            X.93T r13 = r0.A1D
            X.Hlh r0 = r0.A1E
            java.lang.String r4 = r0.A00
            X.GD9 r0 = r3.A0O()
            int r18 = r0.A01()
            X.GBE r0 = r3.A09
            if (r0 == 0) goto L_0x02de
            X.GE5 r0 = r0.A0u
            int r19 = r0.BlO(r5)
            com.instagram.clips.intf.ClipsViewerConfig r0 = A00(r3)
            java.lang.String r0 = r0.A0m
            r17 = r0
            r16 = r4
            X.C52086GEg.A0i(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x01ab:
            X.Hrp r6 = r3.A0J
            java.lang.String r5 = "overlayFragmentController"
            if (r6 == 0) goto L_0x02d9
            X.7Pu r0 = r6.A03
            r4 = 1
            if (r0 == 0) goto L_0x01be
            boolean r0 = r0.A0S()
            if (r0 != r4) goto L_0x01be
            r6.A08 = r4
        L_0x01be:
            X.Hrp r0 = r3.A0J
            if (r0 == 0) goto L_0x02d9
            r0.A03 = r1
            X.GBE r4 = r3.A09
            if (r4 == 0) goto L_0x02de
            X.GBj r0 = r3.A0N
            java.lang.String r6 = "clipsViewerViewPager"
            if (r0 == 0) goto L_0x02d4
            int r0 = r0.A06()
            r4.A00 = r0
            com.instagram.common.session.UserSession r0 = A01(r3)
            X.1Ng r5 = X.AnonymousClass1Nd.A00(r0)
            X.GBE r0 = r3.A09
            if (r0 == 0) goto L_0x02de
            X.1wn r4 = r0.A04
            if (r4 == 0) goto L_0x01e9
            java.lang.Class<X.36g> r0 = X.C2370836g.class
            r5.A02(r4, r0)
        L_0x01e9:
            X.1wn r4 = r3.A0U
            if (r4 == 0) goto L_0x01f2
            java.lang.Class<X.36f> r0 = X.C2370736f.class
            r5.A02(r4, r0)
        L_0x01f2:
            X.1wn r4 = r3.A0T
            if (r4 == 0) goto L_0x01fb
            java.lang.Class<X.DGm> r0 = X.C45957DGm.class
            r5.A02(r4, r0)
        L_0x01fb:
            X.GBE r0 = r3.A09
            if (r0 == 0) goto L_0x02de
            X.1wn r4 = r0.A03
            if (r4 == 0) goto L_0x0208
            java.lang.Class<X.WQA> r0 = X.WQA.class
            r5.A02(r4, r0)
        L_0x0208:
            X.GBE r0 = r3.A09
            if (r0 == 0) goto L_0x02de
            r0.A04 = r1
            r3.A0U = r1
            r3.A0T = r1
            X.GBj r0 = r3.A0N
            if (r0 == 0) goto L_0x02d4
            X.GBl r0 = r0.A04
            if (r0 == 0) goto L_0x0221
            java.util.Set r0 = r0.A03
            if (r0 == 0) goto L_0x0221
            r0.clear()
        L_0x0221:
            X.2nK r0 = r3.A0Y
            if (r0 != 0) goto L_0x022c
            java.lang.String r7 = "dropFrameWatcher"
            goto L_0x00d9
        L_0x0229:
            r14 = r1
            goto L_0x0170
        L_0x022c:
            r3.unregisterLifecycleListener(r0)
            X.GBj r5 = r3.A0N
            if (r5 == 0) goto L_0x02d4
            X.GD6 r6 = r5.A09
            androidx.recyclerview.widget.RecyclerView r8 = X.C52012GBj.A03(r5)
            X.GBY r7 = r6.A0B
            X.GBQ r0 = r7.A06
            android.app.Activity r4 = r0.A06
            X.2im r0 = r0.A08
            X.C226122ff.A02(r4, r0)
            if (r8 == 0) goto L_0x0254
            X.2We r0 = r7.A00
            if (r0 == 0) goto L_0x024d
            r0.detach()
        L_0x024d:
            X.2We r0 = r7.A00
            if (r0 == 0) goto L_0x0254
            r0.A0f(r8)
        L_0x0254:
            boolean r0 = r7.A08
            if (r0 != 0) goto L_0x0266
            X.GBa r4 = r7.A05
            r0 = 0
            r4.A01 = r0
            r4.A00 = r1
            X.9OA r0 = r4.A08
            android.util.LruCache r0 = r0.A01
            r0.evictAll()
        L_0x0266:
            androidx.viewpager2.widget.ViewPager2 r0 = r5.A00
            if (r0 == 0) goto L_0x026d
            r0.setAdapter(r1)
        L_0x026d:
            X.2Rw r0 = r6.A05()
            r0.unregisterAdapterDataObserver(r5)
            r5.A00 = r1
            r5.A03 = r1
            r5.A04 = r1
            X.GBE r0 = r3.A09
            if (r0 == 0) goto L_0x02de
            r0.onDestroyView()
            X.0lV r0 = r3.A1H
            X.14i.A06(r0)
            X.3E6 r0 = r3.A0X
            java.lang.String r7 = "keyboardHeightChangeDetector"
            if (r0 == 0) goto L_0x00d9
            r0.EEH(r3)
            com.instagram.common.session.UserSession r6 = A01(r3)
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.0Tu r0 = X.0Tu.A05
            r4 = 36323586395417890(0x810c1c00112d22, double:3.03452052758022E-306)
            boolean r0 = X.182.A06(r0, r6, r4)
            if (r0 == 0) goto L_0x02ab
            X.3E6 r0 = r3.A0X
            if (r0 == 0) goto L_0x00d9
            r0.onDestroy()
        L_0x02ab:
            com.instagram.common.session.UserSession r0 = A01(r3)
            X.AnonymousClass6OH.A01(r0)
            com.instagram.common.session.UserSession r0 = A01(r3)
            X.GMD r0 = X.GNS.A00(r0)
            java.util.List r0 = r0.A03
            r0.clear()
            X.GBE r0 = r3.A09
            if (r0 == 0) goto L_0x02de
            X.GCH r0 = r0.A1A
            X.6z9 r0 = r0.A04
            X.6zA r0 = r0.A03
            r0.A06 = r1
            r3.A01 = r1
            r0 = -1143226799(0xffffffffbbdbbe51, float:-0.006706037)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x02d4:
            X.0qQ.A0F(r6)
            goto L_0x00dc
        L_0x02d9:
            X.0qQ.A0F(r5)
            goto L_0x00dc
        L_0x02de:
            X.0qQ.A0F(r9)
            goto L_0x00dc
        L_0x02e3:
            r0 = 0
            goto L_0x00b0
        L_0x02e6:
            if (r5 > r1) goto L_0x02ef
            r0 = 3
            if (r1 >= r0) goto L_0x02ef
            java.lang.String r5 = "1743317253107345"
            goto L_0x00a4
        L_0x02ef:
            java.lang.String r5 = "1334245914219510"
            goto L_0x00a4
        L_0x02f3:
            if (r0 != r8) goto L_0x00bb
            java.lang.String r5 = "830787885872229"
            goto L_0x00a4
        L_0x02f9:
            boolean r0 = X.I3O.A01(r10)
            if (r0 == 0) goto L_0x030b
            com.instagram.clips.intf.ClipsViewerSource r0 = r8.A07
            if (r0 == 0) goto L_0x030b
            boolean r0 = X.I3O.A01(r0)
            if (r0 != r5) goto L_0x030b
            goto L_0x0055
        L_0x030b:
            com.instagram.clips.intf.ClipsViewerSource r4 = com.instagram.clips.intf.ClipsViewerSource.DIRECT
            if (r10 == r4) goto L_0x0313
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.DIRECT_AD_FEED_OF_ADS
            if (r10 != r0) goto L_0x031f
        L_0x0313:
            com.instagram.clips.intf.ClipsViewerSource r1 = r8.A07
            if (r1 == 0) goto L_0x031f
            if (r1 == r4) goto L_0x0055
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.DIRECT_AD_FEED_OF_ADS
            if (r1 != r0) goto L_0x031f
            goto L_0x0055
        L_0x031f:
            int r0 = r8.A01
            if (r0 == 0) goto L_0x0055
            r8.A01 = r6
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227232is.onDestroyView():void");
    }

    public final void onPause() {
        C52464GTq A002;
        Long l;
        2dZ r0;
        int A022 = AnonymousClass0fD.A02(734665738);
        C227232is.super.onPause();
        GDB gdb = this.A0A;
        if (!(gdb == null || (r0 = gdb.A06) == null)) {
            ViewGroup viewGroup = r0.A0O;
            if (viewGroup.getLayerType() != 0) {
                viewGroup.setLayerType(0, (Paint) null);
            }
        }
        A0G(this);
        GBE gbe = this.A09;
        String str = "clipsViewerFragmentViewModel";
        if (gbe != null) {
            gbe.A1B.A05.A0E("on_pause");
            C52278GLu gLu = gbe.A0V;
            if (gLu != null && gLu.A00) {
                02m r5 = gLu.A01;
                String lowerCase = "ON_PAUSE".toLowerCase(Locale.ROOT);
                0qQ.A07(lowerCase);
                r5.markerAnnotate(749808675, "cancel_reason", lowerCase);
                r5.markerEnd(749808675, 4);
                gLu.A00 = false;
            }
            C320446sO r7 = gbe.A0U;
            if (r7 != null && r7.A00) {
                02m r52 = r7.A01;
                String lowerCase2 = "ON_PAUSE".toLowerCase(Locale.ROOT);
                0qQ.A07(lowerCase2);
                r52.markerAnnotate(749812461, "cancel_reason", lowerCase2);
                r52.markerEnd(749812461, 4);
                r7.A00 = false;
            }
            AnonymousClass3E6 r02 = this.A0X;
            if (r02 == null) {
                str = "keyboardHeightChangeDetector";
            } else {
                r02.onStop();
                GBE gbe2 = this.A09;
                if (gbe2 != null) {
                    GME gme = gbe2.A0H;
                    if (gme != null) {
                        gme.A0E();
                    }
                    2Zg A023 = A02();
                    if (A023 != null) {
                        A023.C3W().A01(this);
                    }
                    if (A00(this).A0J.A01() && (l = (A002 = GM4.A00(A01(this))).A07) != null) {
                        A002.A02 += A002.A08.now() - l.longValue();
                    }
                    AnonymousClass3KG r4 = this.A0V;
                    if (r4 != null) {
                        r4.A06(this.A0W);
                        AnonymousClass3KG r03 = this.A0V;
                        if (r03 == null) {
                            0qQ.A0F("screenshotDetector");
                            throw AnonymousClass00P.createAndThrow();
                        } else {
                            r03.A04();
                            this.A0W = null;
                        }
                    }
                    this.A00 = System.currentTimeMillis();
                    C276314t2.A00(A01(this)).A04 = false;
                    A06();
                    C3728893a r8 = (C3728893a) this.A0x.getValue();
                    if (r8 != null) {
                        GBE gbe3 = this.A09;
                        if (gbe3 != null) {
                            String moduleName = gbe3.A19.getModuleName();
                            int A012 = A0O().A01();
                            GBE gbe4 = this.A09;
                            if (gbe4 != null) {
                                AnonymousClass93T r04 = gbe4.A1D;
                                String str2 = r04.A01;
                                String str3 = r04.A00;
                                0qQ.A0B(moduleName, 0);
                                0qQ.A0B(str2, 2);
                                0qQ.A0B(str3, 3);
                                if (!r8.A00) {
                                    0XK r13 = new 0XK();
                                    r13.A00("analytics_module", moduleName, 1);
                                    r13.A00("exit_index", String.valueOf(A012), 2);
                                    r13.A00(Dbn.A00(42, 10, 73), str2, 1);
                                    r13.A00("chaining_session_id", str3, 1);
                                    C3728893a.A00(r8).markerPoint(976032351, 0, 7, 002.A0R("exit_viewer_", moduleName), r13, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
                                }
                            }
                        }
                    }
                    if (182.A06(0Tu.A06, A01(this), 36319480405564857L)) {
                        if (this.A0C == null) {
                            str = "viewerAdapter";
                        } else if (GBU.A09) {
                            GBU.A00();
                        }
                    }
                    ((C39729A6u) this.A0w.getValue()).A02.A02(false);
                    AnonymousClass0fD.A09(-1129797091, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
        if (A00(r10).A0J == com.instagram.clips.intf.ClipsViewerSource.A0U) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r10 = this;
            r0 = 1133678413(0x43928f4d, float:293.11954)
            int r4 = X.AnonymousClass0fD.A02(r0)
            super.onResume()
            r3 = 0
            r10.A0O = r3
            com.instagram.clips.intf.ClipsViewerConfig r0 = A00(r10)
            com.instagram.clips.intf.ClipsViewerSource r0 = r0.A0J
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x002d
            com.instagram.common.session.UserSession r0 = A01(r10)
            X.GTq r2 = X.GM4.A00(r0)
            X.0JR r0 = r2.A08
            long r0 = r0.now()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A07 = r0
        L_0x002d:
            X.3E6 r1 = r10.A0X
            if (r1 != 0) goto L_0x003b
            java.lang.String r9 = "keyboardHeightChangeDetector"
        L_0x0033:
            X.0qQ.A0F(r9)
        L_0x0036:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003b:
            androidx.fragment.app.FragmentActivity r0 = r10.requireActivity()
            r1.DmJ(r0)
            X.2Zg r0 = r10.A02()
            if (r0 == 0) goto L_0x004f
            X.2bE r0 = r0.C3W()
            r0.A00(r10)
        L_0x004f:
            X.GBE r0 = r10.A09
            java.lang.String r8 = "clipsViewerFragmentViewModel"
            if (r0 == 0) goto L_0x0170
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x0060
            androidx.fragment.app.FragmentActivity r0 = r10.requireActivity()
            r0.finish()
        L_0x0060:
            r10.A05()
            com.instagram.clips.intf.ClipsViewerConfig r0 = A00(r10)
            com.instagram.clips.intf.ClipsViewerSource r2 = r0.A0J
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_TAB
            r0 = 0
            if (r2 != r1) goto L_0x006f
            r0 = 1
        L_0x006f:
            r7 = 1
            if (r0 != 0) goto L_0x007d
            com.instagram.clips.intf.ClipsViewerConfig r0 = A00(r10)
            com.instagram.clips.intf.ClipsViewerSource r2 = r0.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_NEARBY_PUSH
            r1 = 0
            if (r2 != r0) goto L_0x007e
        L_0x007d:
            r1 = 1
        L_0x007e:
            com.instagram.common.session.UserSession r0 = A01(r10)
            X.4t3 r6 = X.C276314t2.A00(r0)
            java.lang.String r5 = "viewerAdapter"
            java.lang.String r9 = "clipsViewerViewPager"
            if (r1 == 0) goto L_0x00ac
            boolean r0 = r6.A01()
            if (r0 == 0) goto L_0x00ac
            X.GBE r2 = r10.A09
            if (r2 == 0) goto L_0x0170
            X.4bN r1 = X.C295375o3.A00()
            X.GBj r0 = r10.A0N
            if (r0 == 0) goto L_0x0033
            androidx.viewpager2.widget.ViewPager2 r0 = r0.A00
            r2.A0I(r0, r1)
            r6.A03 = r7
        L_0x00a5:
            X.GD8 r1 = r10.A0j
            if (r1 != 0) goto L_0x00e0
            java.lang.String r9 = "clipsViewerViewPagerSecondChannelListener"
            goto L_0x0033
        L_0x00ac:
            X.GBj r0 = r10.A0N
            if (r0 == 0) goto L_0x0033
            int r1 = r0.A06()
            X.GD6 r0 = r10.A0C
            if (r0 == 0) goto L_0x016b
            X.GBg r0 = r0.A0A
            int r0 = r0.A0A()
            if (r1 >= r0) goto L_0x00a5
            X.GD6 r2 = r10.A0C
            if (r2 == 0) goto L_0x016b
            X.GBj r0 = r10.A0N
            if (r0 == 0) goto L_0x0033
            int r1 = r0.A06()
            X.GBg r0 = r2.A0A
            X.4bN r2 = r0.A0E(r1)
            X.GBE r1 = r10.A09
            if (r1 == 0) goto L_0x0170
            X.GBj r0 = r10.A0N
            if (r0 == 0) goto L_0x0033
            androidx.viewpager2.widget.ViewPager2 r0 = r0.A00
            r1.A0I(r0, r2)
            goto L_0x00a5
        L_0x00e0:
            X.GBj r0 = r10.A0N
            if (r0 == 0) goto L_0x0033
            int r0 = r0.A06()
            r1.A00(r0)
            X.3KG r0 = r10.A0V
            java.lang.String r9 = "screenshotDetector"
            if (r0 == 0) goto L_0x0033
            r0.A03()
            X.3KG r0 = r10.A0V
            if (r0 == 0) goto L_0x0033
            com.instagram.common.session.UserSession r2 = A01(r10)
            X.GBE r0 = r10.A09
            if (r0 == 0) goto L_0x0170
            X.GAc r1 = r0.A19
            X.3KN r0 = new X.3KN
            r0.<init>(r2, r10, r1, r3)
            X.3KQ r2 = X.AnonymousClass3KG.A00(r0)
            r10.A0W = r2
            X.3KG r1 = r10.A0V
            if (r1 == 0) goto L_0x0033
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.screenshot.ScreenshotSession"
            X.0qQ.A0C(r2, r0)
            r1.A05(r2)
            com.instagram.common.session.UserSession r3 = A01(r10)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36319480405564857(0x81086000001db9, double:3.0319238830636677E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x013d
            X.GD6 r0 = r10.A0C
            if (r0 == 0) goto L_0x016b
            boolean r0 = X.GBU.A09
            if (r0 == 0) goto L_0x013d
            boolean r0 = X.GBU.A0A
            if (r0 == 0) goto L_0x013d
            X.HtK r0 = X.GBU.A05
            if (r0 == 0) goto L_0x013d
            r0.A01()
        L_0x013d:
            X.2Zg r0 = r10.A02()
            if (r0 == 0) goto L_0x0162
            X.2bE r0 = r0.C3W()
            float r3 = r0.A01
            r2 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0169
            float r1 = r1 - r3
        L_0x0151:
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0162
            com.instagram.common.session.UserSession r0 = A01(r10)
            boolean r0 = X.2bA.A07(r0)
            if (r0 == 0) goto L_0x0162
            r10.A04()
        L_0x0162:
            r0 = -1618943004(0xffffffff9f80e3e4, float:-5.458712E-20)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        L_0x0169:
            float r1 = r1 + r3
            goto L_0x0151
        L_0x016b:
            X.0qQ.A0F(r5)
            goto L_0x0036
        L_0x0170:
            X.0qQ.A0F(r8)
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227232is.onResume():void");
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(450315854);
        C227232is.super.onStart();
        if (A00(this).A0J == ClipsViewerSource.CLIPS_TAB) {
            if (this.A0Q > 0) {
                18g A012 = C638918c.A01(C61170le.A00);
                GBE gbe = this.A09;
                if (gbe == null) {
                    0qQ.A0F("clipsViewerFragmentViewModel");
                    throw AnonymousClass00P.createAndThrow();
                }
                A012.A0S(gbe.A0w);
            }
            C243473Yx.A01++;
        }
        AnonymousClass0fD.A09(-459361609, A022);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0083: MOVE  (r1v3 X.2ZP) = (r1v2 X.2ZP)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onStop() {
        /*
            r7 = this;
            r0 = -1175858662(0xffffffffb9e9d21a, float:-4.459776E-4)
            int r3 = X.AnonymousClass0fD.A02(r0)
            X.C227232is.super.onStop()
            int r0 = r7.A0Q
            int r0 = r0 + 1
            r7.A0Q = r0
            com.instagram.common.session.UserSession r0 = A01(r7)
            X.2fL r0 = X.AnonymousClass2fL.A00(r0)
            r0.A0N()
            X.GBE r0 = r7.A09
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "clipsViewerFragmentViewModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0029:
            X.GBn r5 = r0.A1K
            X.GI0 r6 = r5.A0H
            java.util.Map r4 = r6.A01
            java.util.Collection r0 = r4.values()
            java.util.Iterator r2 = r0.iterator()
        L_0x0037:
            boolean r0 = r2.hasNext()
            java.lang.String r1 = "fragment_paused"
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r2.next()
            X.JRN r0 = (X.JRN) r0
            r0.ECP(r1)
            r0.EDv(r5)
            goto L_0x0037
        L_0x004c:
            X.Hrj r1 = r5.A01
            if (r1 == 0) goto L_0x005a
            X.2xy r0 = r1.A00
            if (r0 == 0) goto L_0x0057
            r0.release()
        L_0x0057:
            r0 = 0
            r1.A00 = r0
        L_0x005a:
            r0 = 0
            r5.A01 = r0
            r4.clear()
            java.util.Map r0 = r6.A00
            r0.clear()
            X.0eM r0 = r5.A0L
            r0.getValue()
            X.1vq r0 = r5.A09
            r0.A03(r5)
            r7.A04()
            com.instagram.clips.intf.ClipsViewerConfig r0 = A00(r7)
            boolean r0 = r0.A1v
            if (r0 == 0) goto L_0x008a
            r2 = 0
            androidx.fragment.app.FragmentActivity r1 = r7.getActivity()
            boolean r0 = r1 instanceof X.AnonymousClass2ZP
            if (r0 == 0) goto L_0x008a
            X.2ZP r1 = (X.AnonymousClass2ZP) r1
            if (r1 == 0) goto L_0x008a
            r1.Enj(r2)
        L_0x008a:
            r0 = 1667603389(0x63659bbd, float:4.2355265E21)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227232is.onStop():void");
    }

    public final /* synthetic */ boolean Dkv(MotionEvent motionEvent) {
        return false;
    }

    public final void EVp(Bundle bundle) {
        A09(bundle);
    }

    public final /* synthetic */ boolean EsU(MotionEvent motionEvent) {
        return false;
    }
}
