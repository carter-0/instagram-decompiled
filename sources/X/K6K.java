package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.VideoUrlImpl;
import java.util.ArrayList;
import java.util.List;

public final class K6K extends AnonymousClass4DH implements AnonymousClass4DR, C268594df, C74332Pt8, C66524MVc {
    public static final C71392co A0r = C71392co.A00();
    public static final LNF A0s = new Object();
    public static final String __redex_internal_original_name = "DirectMediaPickerSheetFragment";
    public float A00 = 0.7f;
    public int A01;
    public int A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public ViewGroup A08;
    public Fragment A09;
    public LG7 A0A;
    public AnonymousClass8CT A0B;
    public MV8 A0C;
    public C66484MTn A0D;
    public C65126Lno A0E;
    public AnonymousClass7H6 A0F;
    public AnonymousClass7SL A0G;
    public AnonymousClass2Ep A0H;
    public IgdsBottomButtonLayout A0I;
    public DirectThreadKey A0J;
    public C254783t2 A0K;
    public String A0L;
    public String A0M;
    public List A0N;
    public boolean A0O = true;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S = true;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W = true;
    public boolean A0X;
    public float A0Y;
    public float A0Z = 1.0f;
    public View A0a;
    public View A0b;
    public View A0c;
    public C3262876d A0d;
    public L4N A0e;
    public AnonymousClass7L0 A0f;
    public OLS A0g;
    public String A0h;
    public boolean A0i;
    public final AnonymousClass0eM A0j = DbS.A0I(new C67570Mq4(this, 5), new C67570Mq4(this, 2), new C73915Plq(28, this, (Object) null), DbS.A0z(C60235Jhs.class));
    public final AnonymousClass0eM A0k = DbS.A0I(new C67570Mq4(this, 4), new C67570Mq4(this, 3), new C73915Plq(27, this, (Object) null), DbS.A0z(C60150JgV.class));
    public final AnonymousClass0eM A0l = C227642jf.A02(this);
    public final L1G A0m = new L1G(this);
    public final AnonymousClass9HB A0n = new AnonymousClass9HB();
    public final MVV A0o = new C65770LzO(this);
    public final MT1 A0p = new C65772LzQ(this, 0);
    public final String A0q = "direct_media_picker_fragment";

    public final void A04(MV8 mv8, C66484MTn mTn, AnonymousClass7H6 r5, AnonymousClass7SL r6, AnonymousClass2Ep r7, C254783t2 r8, String str, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A0F = r5;
        this.A0D = mTn;
        this.A0R = z;
        this.A0Q = false;
        this.A01 = i;
        this.A02 = i2;
        this.A0C = mv8;
        this.A0L = str;
        this.A0M = null;
        this.A0H = r7;
        this.A0K = r8;
        this.A0G = r6;
        this.A0P = z2;
        this.A0S = z3;
        this.A0O = false;
    }

    public final void ADi(AnonymousClass7L0 r4) {
        View view;
        0qQ.A0B(r4, 0);
        this.A0f = r4;
        ViewGroup viewGroup = this.A08;
        if (viewGroup != null) {
            Drawable background = viewGroup.getBackground();
            if (background != null) {
                int i = r4.A09;
                background.setColorFilter(i, PorterDuff.Mode.SRC);
                if (!this.A0Q) {
                    AnonymousClass2uJ.A04(requireActivity(), i);
                }
                if ((DbV.A05(this).getConfiguration().uiMode & 48) == 32 || this.A0G == null) {
                    View view2 = this.A05;
                    if (view2 != null) {
                        view2.setBackgroundColor(2eL.A06(i, 205));
                    }
                    view = this.A06;
                } else {
                    i = 2eL.A06(requireContext().getColor(R.color.grey_0), 191);
                    view = this.A05;
                }
                if (view != null) {
                    view.setBackgroundColor(i);
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        K6G A002 = A00(this);
        if (A002 != null) {
            A002.ADi(r4);
        }
    }

    public final int AqL() {
        return -1;
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final boolean Dkq(Medium medium, String str) {
        MV8 mv8 = this.A0C;
        if (mv8 == null) {
            return false;
        }
        mv8.Dkp(medium, str);
        return true;
    }

    public final boolean Erf() {
        return true;
    }

    public final void onAttachFragment(Fragment fragment) {
        0qQ.A0B(fragment, 0);
        K6G k6g = (K6G) fragment;
        MVV mvv = this.A0o;
        AnonymousClass7L0 r1 = this.A0f;
        0qQ.A0B(mvv, 0);
        k6g.A03 = mvv;
        LPF lpf = k6g.A02;
        if (lpf != null) {
            lpf.A01 = mvv;
            lpf.A09.A00 = mvv;
        }
        k6g.ADi(r1);
        k6g.A00 = this;
        MT1 mt1 = this.A0p;
        k6g.A04 = mt1;
        LPF lpf2 = k6g.A02;
        if (lpf2 != null) {
            lpf2.A02 = mt1;
        }
        L1G l1g = this.A0m;
        k6g.A01 = l1g;
        if (lpf2 != null) {
            lpf2.A00 = l1g;
        }
        k6g.setDayNightMode(this.dayNightMode);
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        View view;
        float f = (float) ((-i) - i2);
        View view2 = this.A03;
        if (view2 != null) {
            view2.setTranslationY(f);
        }
        View view3 = this.A0a;
        if (view3 != null) {
            view3.setTranslationY(f);
        }
        View view4 = this.A0c;
        if (view4 != null) {
            view4.setTranslationY(f);
        }
        OLS ols = this.A0g;
        if (ols == null) {
            0qQ.A0F("roundedCornerHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        ols.A00(i);
        C65126Lno lno = this.A0E;
        if (lno != null && (view = lno.A00.A03) != null) {
            view.setTranslationY(f);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: X.0iw} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ff, code lost:
        if (X.C331077Pk.A02.A03(r5.A00, r3.AiM()) != false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x011d, code lost:
        if (X.182.A06(r8, r9, 36330166284468716L) == false) goto L_0x011f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r31, android.os.Bundle r32) {
        /*
            r30 = this;
            r1 = 0
            r6 = r31
            X.0qQ.A0B(r6, r1)
            r0 = r30
            r2 = r32
            super.onViewCreated(r6, r2)
            r2 = 2131431666(0x7f0b10f2, float:1.8485068E38)
            android.view.ViewGroup r2 = X.DbU.A0C(r6, r2)
            r0.A08 = r2
            r2 = 2131432062(0x7f0b127e, float:1.848587E38)
            android.view.View r3 = r6.requireViewById(r2)
            r0.A04 = r3
            android.os.Bundle r2 = r0.mArguments
            java.lang.String r15 = "Required value was null."
            if (r2 == 0) goto L_0x0030
            if (r3 == 0) goto L_0x02b4
            boolean r2 = r0.A0Q
            int r2 = X.DbW.A00(r2)
            r3.setVisibility(r2)
        L_0x0030:
            r2 = 2131428907(0x7f0b062b, float:1.8479472E38)
            android.view.View r2 = r6.requireViewById(r2)
            r0.A03 = r2
            r2 = 2131442760(0x7f0b3c48, float:1.8507569E38)
            android.view.View r2 = r6.requireViewById(r2)
            r0.A0a = r2
            r2 = 2131442791(0x7f0b3c67, float:1.8507632E38)
            android.view.View r2 = r6.requireViewById(r2)
            r0.A05 = r2
            r2 = 2131443825(0x7f0b4071, float:1.850973E38)
            android.view.View r2 = r6.requireViewById(r2)
            r0.A0c = r2
            r2 = 2131443827(0x7f0b4073, float:1.8509733E38)
            android.view.View r2 = r6.requireViewById(r2)
            r0.A06 = r2
            android.view.ViewGroup r3 = r0.A08
            if (r3 == 0) goto L_0x02af
            X.M46 r2 = new X.M46
            r2.<init>(r0)
            X.0nA.A0r(r3, r2)
            X.0eM r14 = r0.A0l
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r14)
            boolean r13 = r0.A0Q
            int r12 = r0.A01
            java.lang.String r11 = r0.A0h
            boolean r10 = r0.A0V
            float r9 = r0.A0Y
            boolean r8 = r0.A0T
            java.lang.String r7 = r0.A0M
            java.util.List r5 = r0.A0N
            r4 = 0
            android.os.Bundle r3 = r0.requireArguments()
            java.lang.String r2 = "BUNDLE_SHOW_DONE_BUTTON_IN_GALLERY"
            boolean r28 = r3.getBoolean(r2)
            int r3 = r0.A02
            X.2Ep r2 = r0.A0H
            if (r2 == 0) goto L_0x0297
            com.instagram.model.direct.DirectThreadKey r17 = r2.BJy()
        L_0x0094:
            boolean r2 = r0.A0i
            r23 = r12
            r24 = r3
            r25 = r13
            r26 = r10
            r27 = r8
            r29 = r2
            r20 = r4
            r21 = r5
            r22 = r9
            r18 = r11
            r19 = r7
            X.K6G r7 = X.C63233Kte.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.Jhs r5 = X.JTQ.A0L(r0)
            X.3t2 r8 = r0.A0K
            if (r8 != 0) goto L_0x00d1
            X.2Ep r2 = r0.A0H
            r8 = 0
            if (r2 == 0) goto L_0x00cf
            com.instagram.model.direct.DirectThreadKey r3 = r2.BJy()
            boolean r2 = X.C66647MaG.A0F(r3)
            if (r2 == 0) goto L_0x00cf
            com.instagram.model.direct.DirectThreadKey r2 = X.C66647MaG.A03(r3)
            X.3t3 r8 = X.C66647MaG.A08(r2)
        L_0x00cf:
            r0.A0K = r8
        L_0x00d1:
            r2 = 0
            if (r8 == 0) goto L_0x0120
            boolean r3 = X.AnonymousClass6W3.A07(r8)
            if (r3 != 0) goto L_0x0120
            X.3t1 r3 = X.AnonymousClass6W3.A02(r8)
            if (r3 == 0) goto L_0x0120
            X.2Dm r8 = r5.A01
            com.instagram.model.direct.DirectThreadKey r3 = X.AnonymousClass6W4.A01(r3)
            X.3U9 r3 = r8.B33(r3)
            if (r3 == 0) goto L_0x0120
            boolean r2 = r3.CVE()
            if (r2 != 0) goto L_0x0101
            X.7Pi r8 = X.C331077Pk.A02
            X.3Tu r3 = r3.AiM()
            com.instagram.common.session.UserSession r2 = r5.A00
            boolean r2 = r8.A03(r2, r3)
            r10 = 0
            if (r2 == 0) goto L_0x0102
        L_0x0101:
            r10 = 1
        L_0x0102:
            com.instagram.common.session.UserSession r9 = r5.A00
            X.0Tu r8 = X.0Tu.A05
            r2 = 36330166284206570(0x811218000041ea, double:3.0386816757452665E-306)
            boolean r2 = X.182.A06(r8, r9, r2)
            if (r10 == 0) goto L_0x0120
            if (r2 == 0) goto L_0x011f
            r2 = 36330166284468716(0x811218000441ec, double:3.038681675911049E-306)
            boolean r3 = X.182.A06(r8, r9, r2)
            r2 = 1
            if (r3 != 0) goto L_0x0120
        L_0x011f:
            r2 = 0
        L_0x0120:
            X.05G r8 = r5.A02
            if (r2 == 0) goto L_0x0293
            java.lang.Integer r5 = X.AnonymousClass05K.A00
        L_0x0126:
            r3 = 21
            X.JwK r2 = new X.JwK
            r2.<init>((boolean) r1, (java.lang.Integer) r5, (int) r3)
            r8.FIA(r2)
            X.2k4 r2 = r0.dayNightMode
            r7.setDayNightMode(r2)
            r5 = 2
            X.LYE r8 = new X.LYE
            r8.<init>((java.lang.Object) r0, (int) r5)
            android.view.View r3 = r0.A03
            if (r3 == 0) goto L_0x02aa
            r2 = 2131441112(0x7f0b35d8, float:1.8504226E38)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = X.DbT.A0c(r3, r2)
            r0.A0I = r2
            if (r2 == 0) goto L_0x02a5
            r2.setPrimaryActionOnClickListener(r8)
            android.view.View r2 = r0.A05
            if (r2 == 0) goto L_0x02a0
            r8 = 2131433451(0x7f0b17eb, float:1.8488688E38)
            android.view.View r2 = r2.requireViewById(r8)
            r0.A0b = r2
            r2 = 2131437402(0x7f0b275a, float:1.8496702E38)
            android.view.ViewGroup r2 = X.DbU.A0C(r6, r2)
            r0.A07 = r2
            X.0s1 r3 = X.DbW.A0C(r0)
            r2 = 2131433135(0x7f0b16af, float:1.8488047E38)
            r3.A0A(r7, r2)
            r3.A00()
            r0.A09 = r7
            X.7L0 r2 = r0.A0f
            if (r2 == 0) goto L_0x0179
            r0.ADi(r2)
        L_0x0179:
            android.content.Context r7 = r0.requireContext()
            android.view.ViewGroup r3 = r0.A08
            if (r3 == 0) goto L_0x029b
            X.OLS r2 = new X.OLS
            r2.<init>(r7, r3)
            r0.A0g = r2
            boolean r2 = r0.A0T
            if (r2 == 0) goto L_0x01cc
            androidx.fragment.app.FragmentActivity r16 = r0.requireActivity()
            com.instagram.common.session.UserSession r19 = X.AnonymousClass7TE.A0l(r14)
            android.view.View r9 = X.AnonymousClass7TF.A0G(r6, r8)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r9 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r9
            boolean r8 = r0.A0U
            X.0lg r10 = X.AnonymousClass7TF.A0L(r14, r1)
            X.0Tu r7 = X.0Tu.A05
            r2 = 36323625050254670(0x810c2500132d4e, double:3.03454497305465E-306)
            boolean r2 = X.182.A06(r7, r10, r2)
            r24 = r2 ^ 1
            X.LC2 r10 = new X.LC2
            r10.<init>(r0)
            X.7SL r7 = r0.A0G
            boolean r3 = r0.A0P
            X.Lno r2 = new X.Lno
            r15 = r2
            r17 = r6
            r18 = r0
            r20 = r9
            r21 = r10
            r22 = r7
            r23 = r8
            r25 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0.A0E = r2
        L_0x01cc:
            boolean r2 = r0.A0X
            if (r2 == 0) goto L_0x0286
            X.2Ep r2 = r0.A0H
            if (r2 == 0) goto L_0x0286
            androidx.fragment.app.FragmentActivity r16 = r0.requireActivity()
            r2 = 2131443826(0x7f0b4072, float:1.8509731E38)
            android.view.View r2 = r6.requireViewById(r2)
            r10 = 0
            X.3oV r2 = X.2b1.A01(r2, r1, r1)
            android.view.View r18 = r2.getView()
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r14)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r19 = X.C226132fh.A00(r3, r2)
            r21 = 6
            X.9Pb r15 = new X.9Pb
            r17 = r4
            r20 = r4
            r22 = r5
            r23 = r1
            r24 = r1
            r25 = r1
            r26 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r14)
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            X.2Ep r2 = r0.A0H
            if (r2 == 0) goto L_0x0219
            java.lang.String r10 = r2.C6C()
        L_0x0219:
            r8 = r4
            r9 = r2
            r11 = r1
            com.instagram.model.direct.camera.DirectCameraViewModel r2 = X.C71046OaO.A01(r6, r7, r8, r9, r10, r11)
            r15.A01(r0, r2, r1)
            r15.A00(r0, r2)
            r15.EQQ(r1)
            r2 = 1
            r15.Ejs(r2)
            android.view.View r2 = r15.A0G
            X.3NG r3 = X.AnonymousClass7TE.A0m(r2)
            r2 = 29
            X.C61685KHt.A00(r3, r0, r2)
            X.2Ep r2 = r0.A0H
            if (r2 == 0) goto L_0x0254
            java.lang.String r6 = r2.C6C()
            if (r6 == 0) goto L_0x0254
            X.1Av r2 = X.DbX.A0h(r14)
            X.0xa r3 = r2.A01
            java.lang.String r2 = "direct_thread_permanent_saved_view_mode_"
            java.lang.String r2 = X.002.A0R(r2, r6)
            java.lang.String r7 = r3.getString(r2, r4)
            if (r7 != 0) goto L_0x0256
        L_0x0254:
            java.lang.String r7 = "permanent"
        L_0x0256:
            androidx.fragment.app.FragmentActivity r8 = r0.requireActivity()
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r14)
            X.8Bf r6 = X.C351988Bf.ONE_VIEW
            X.8Bf r3 = X.C351988Bf.ALLOW_REPLAY
            X.8Bf r2 = X.C351988Bf.KEEP_IN_CHAT
            X.8Bf[] r6 = new X.C351988Bf[]{r6, r3, r2}
            X.8Bf r2 = X.AnonymousClass9Q8.A00(r7)
            X.9IV r3 = new X.9IV
            r3.<init>((X.C351988Bf) r2, (X.C351988Bf[]) r6)
            X.8CT r2 = new X.8CT
            r11 = r15
            r7 = r2
            r9 = r3
            r12 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            r0.A0B = r2
            r2.A00(r1)
            X.8CT r2 = r0.A0B
            if (r2 == 0) goto L_0x0286
            r2.A01(r1)
        L_0x0286:
            X.0xx r3 = X.DbW.A0E(r0)
            X.Pfm r2 = new X.Pfm
            r2.<init>(r0, r4, r1)
            X.AnonymousClass7TE.A1Z(r2, r3)
            return
        L_0x0293:
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            goto L_0x0126
        L_0x0297:
            r17 = 0
            goto L_0x0094
        L_0x029b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x02a0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x02a5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x02aa:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x02af:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x02b4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6K.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00df, code lost:
        if (r3 != null) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C53401GnY r26, X.K6K r27, int r28, boolean r29, boolean r30) {
        /*
            X.02m r0 = X.02m.A0p
            long r18 = r0.currentMonotonicTimestampNanos()
            r15 = r27
            X.K6G r2 = A00(r15)
            if (r2 == 0) goto L_0x00a0
            java.util.List r1 = r2.A00()
            r10 = 0
            r2.A04 = r10
            X.LPF r0 = r2.A02
            if (r0 == 0) goto L_0x001b
            r0.A02 = r10
        L_0x001b:
            r8 = 0
            r2.A01 = r10
            if (r0 == 0) goto L_0x00ef
            r0.A00 = r10
            r0.A04()
            boolean r0 = r15.A0X
            if (r0 == 0) goto L_0x00e3
            X.8CT r3 = r15.A0B
            if (r3 == 0) goto L_0x00de
            X.8ph r0 = r3.A04
            if (r0 == 0) goto L_0x0035
            X.8Bf r0 = r0.A00
            r3.A02 = r0
        L_0x0035:
            X.8Bf r0 = r3.A02
            if (r0 == 0) goto L_0x00de
            java.lang.String r7 = r0.A00
        L_0x003b:
            X.AXe r0 = r3.A03
            if (r0 == 0) goto L_0x00da
            java.lang.Integer r0 = r0.A01
        L_0x0041:
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x00d2
            r0 = 1286(0x506, float:1.802E-42)
            java.lang.String r10 = X.AnonymousClass000.A00(r0)
        L_0x004d:
            X.2Ep r0 = r15.A0H
            if (r0 == 0) goto L_0x006d
            java.lang.String r4 = r0.C6C()
            if (r4 == 0) goto L_0x006d
            X.0eM r0 = r15.A0l
            X.1Av r0 = X.DbX.A0h(r0)
            X.0xY r3 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "direct_thread_permanent_saved_view_mode_"
            java.lang.String r0 = X.002.A0R(r0, r4)
            r3.E5g(r0, r7)
            r3.apply()
        L_0x006d:
            boolean r13 = r15.A0R
            X.9cJ r6 = new X.9cJ
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0078:
            java.util.List r0 = X.C64151LQo.A00(r1)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            java.lang.String r5 = "Required value was null."
            r14 = r26
            r17 = r28
            r20 = r29
            r21 = r30
            if (r0 == 0) goto L_0x00a1
            X.LzM r13 = new X.LzM
            r16 = r6
            r13.<init>(r14, r15, r16, r17, r18, r20, r21)
            r2.A01(r13, r1)
        L_0x0096:
            X.DbT.A1J(r15)
            X.MTn r0 = r15.A0D
            if (r0 == 0) goto L_0x00e5
            r0.EIt()
        L_0x00a0:
            return
        L_0x00a1:
            X.MTn r4 = r15.A0D
            if (r4 == 0) goto L_0x00ea
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r1.iterator()
        L_0x00ad:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c2
            com.instagram.common.gallery.Medium r1 = X.JTP.A0O(r2)
            if (r1 == 0) goto L_0x00ad
            X.Jtk r0 = new X.Jtk
            r0.<init>(r1, r8)
            r3.add(r0)
            goto L_0x00ad
        L_0x00c2:
            r22 = r4
            r23 = r14
            r24 = r6
            r25 = r3
            r26 = r17
            r27 = r18
            r22.EMf(r23, r24, r25, r26, r27, r29, r30)
            goto L_0x0096
        L_0x00d2:
            r0 = 106(0x6a, float:1.49E-43)
            java.lang.String r10 = X.C66579MXk.A00(r0)
            goto L_0x004d
        L_0x00da:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0041
        L_0x00de:
            r7 = r10
            if (r3 == 0) goto L_0x004d
            goto L_0x003b
        L_0x00e3:
            r6 = r10
            goto L_0x0078
        L_0x00e5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x00ea:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x00ef:
            java.lang.String r0 = "mediaPickerPhotosController"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6K.A01(X.GnY, X.K6K, int, boolean, boolean):void");
    }

    public static final boolean A03(View view, GalleryItem galleryItem, K6K k6k) {
        VideoUrlImpl videoUrlImpl;
        1aU A002;
        String str;
        AnonymousClass77B r15;
        GalleryItem galleryItem2 = galleryItem;
        Medium medium = galleryItem2.A00;
        RemoteMedia remoteMedia = galleryItem2.A04;
        if (!(medium == null && remoteMedia == null)) {
            View view2 = view;
            L4N l4n = new L4N(new P19(view2, 0));
            K6K k6k2 = k6k;
            k6k2.A0e = l4n;
            AnonymousClass7H6 r7 = k6k2.A0F;
            if (r7 != null) {
                MediaViewerReplyBarEligibilityCheckerImpl mediaViewerReplyBarEligibilityCheckerImpl = new MediaViewerReplyBarEligibilityCheckerImpl(false, false, false);
                DirectThreadKey directThreadKey = null;
                if (medium != null) {
                    C3262876d r3 = k6k2.A0d;
                    if (r3 != null) {
                        r15 = r3.A02(medium, k6k2.A0R);
                    }
                    0qQ.A0F("viewModelFactory");
                    throw AnonymousClass00P.createAndThrow();
                } else if (remoteMedia != null) {
                    C3262876d r10 = k6k2.A0d;
                    if (r10 != null) {
                        boolean z = k6k2.A0R;
                        boolean z2 = remoteMedia.A09;
                        int i = remoteMedia.A01;
                        ImageUrl imageUrl = remoteMedia.A04;
                        String str2 = null;
                        if (z2) {
                            str2 = imageUrl.getUrl();
                            videoUrlImpl = new VideoUrlImpl(str2);
                        } else {
                            videoUrlImpl = null;
                        }
                        UserSession userSession = r10.A02;
                        float f = remoteMedia.A00;
                        if (!z2) {
                            A002 = C3262876d.A00(imageUrl);
                        } else {
                            A002 = 1aU.A00();
                        }
                        1aU A003 = C3262876d.A00(remoteMedia.A03);
                        1aU A004 = C3262876d.A00(str2);
                        1aU A005 = C3262876d.A00(videoUrlImpl);
                        int i2 = 0;
                        int i3 = 8;
                        if (z2) {
                            i2 = 8;
                            i3 = 0;
                        }
                        1aU A006 = 1aU.A00();
                        long j = (long) i;
                        ImmersiveMediaFields immersiveMediaFields = remoteMedia.A02.A00;
                        if (immersiveMediaFields != null) {
                            str = immersiveMediaFields.A00;
                        } else {
                            str = null;
                        }
                        r15 = new AnonymousClass77B((Uri) null, A002, A003, A004, A005, A006, userSession, (AnonymousClass79H) null, (PrivacyMediaOverlayViewModel) null, (1Xj) null, (C300925yB) null, (2FW) null, (C254793t3) null, (1iA) null, (Boolean) null, (Long) null, (Long) null, Long.valueOf(j), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, (String) null, (List) null, f, i2, i3, 8, 0, z2, false, z, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
                    }
                    0qQ.A0F("viewModelFactory");
                    throw AnonymousClass00P.createAndThrow();
                }
                List A1I = AnonymousClass7TE.A1I(r15);
                AnonymousClass2Ep r0 = k6k2.A0H;
                if (r0 != null) {
                    directThreadKey = r0.BJy();
                }
                C68168N3i n3i = new C68168N3i(0nA.A0F(view2), view2.getRotation());
                String str3 = l4n.A01;
                Integer num = AnonymousClass05K.A01;
                r7.A0g(mediaViewerReplyBarEligibilityCheckerImpl, (AnonymousClass7XW) null, (C329967Kx) null, (AnonymousClass7L0) null, n3i, (DirectShareTarget) null, directThreadKey, num, num, str3, A1I, (C62320sa) null, (0sP) null, (0sP) null, 0.0f, 0, false, false, true, false, false);
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final AnonymousClass8XO B8p() {
        MV8 mv8 = this.A0C;
        if (mv8 != null) {
            return mv8.B8p();
        }
        return AnonymousClass8XO.PHOTO_AND_VIDEO;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    public final float CMx() {
        return this.A00;
    }

    public final boolean CPc() {
        MUL mul = this.A09;
        if (mul == null || !(mul instanceof MUL)) {
            return true;
        }
        return mul.CPd();
    }

    public final float Cmb() {
        return this.A0Z;
    }

    public final /* synthetic */ float CoU() {
        return this.A00;
    }

    public final void D0u() {
    }

    public final String getModuleName() {
        return this.A0q;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0l);
    }

    public final boolean isScrolledToTop() {
        MUL mul = this.A09;
        if (mul == null || !(mul instanceof MUL)) {
            return true;
        }
        return mul.isScrolledToTop();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0023: MOVE  (r1v1 X.4DR) = (r1v0 X.4DR)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final boolean onBackPressed() {
        /*
            r4 = this;
            X.7H6 r0 = r4.A0F
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.A0h()
            if (r0 != r2) goto L_0x000d
            return r2
        L_0x000d:
            X.LG7 r0 = r4.A0A
            if (r0 == 0) goto L_0x001d
            X.KKN r0 = r0.A01
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.onBackPressed()
            if (r0 != r2) goto L_0x001d
        L_0x001b:
            r3 = 1
        L_0x001c:
            return r3
        L_0x001d:
            androidx.fragment.app.Fragment r1 = r4.A09
            boolean r0 = r1 instanceof X.AnonymousClass4DR
            if (r0 == 0) goto L_0x001c
            X.4DR r1 = (X.AnonymousClass4DR) r1
            if (r1 == 0) goto L_0x001c
            boolean r0 = r1.onBackPressed()
            if (r0 != r2) goto L_0x001c
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6K.onBackPressed():boolean");
    }

    public final void onBottomSheetClosed() {
        FragmentActivity activity;
        if (!this.A0Q && (activity = getActivity()) != null) {
            AnonymousClass2uJ.A04(activity, activity.getColor(R.color.igds_transparent_navigation_bar));
        }
    }

    public static final K6G A00(K6K k6k) {
        if (!k6k.isResumed()) {
            return null;
        }
        K6G A0P2 = k6k.getChildFragmentManager().A0P(R.id.fragment_container);
        if (A0P2 instanceof K6G) {
            return A0P2;
        }
        return null;
    }

    public static final void A02(K6K k6k, C65126Lno lno) {
        View view;
        K6G A002 = A00(k6k);
        if (A002 != null && A002.A02()) {
            List<GalleryItem> A003 = A002.A00();
            C328767Gd r5 = lno.A01;
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (GalleryItem galleryItem : A003) {
                if (galleryItem.A02()) {
                    Medium medium = galleryItem.A00;
                    if (medium != null) {
                        galleryItem = JTR.A0f(medium);
                    }
                } else if (!galleryItem.A04()) {
                }
                A1C.add(new AnonymousClass9SZ(galleryItem, (Bitmap) null));
            }
            r5.EaZ(A1C);
            if (!k6k.A0U && k6k.A0O && (view = k6k.A0b) != null) {
                view.postDelayed(new C40867Akb(lno), 500);
            }
        }
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final boolean DHW(View view, GalleryItem galleryItem) {
        return A03(view, galleryItem, this);
    }

    public final void DIn(boolean z) {
        05G r3 = JTQ.A0L(this).A02;
        if (((C61082JwK) r3.getValue()).A00 != AnonymousClass05K.A0C) {
            Integer num = (Integer) ((C61082JwK) r3.getValue()).A00;
            0qQ.A0B(num, 1);
            r3.FIA(new C61082JwK(z, num, 21));
        }
    }

    public final boolean Et9() {
        return AnonymousClass7TF.A1W(((C61082JwK) JTQ.A0L(this).A02.getValue()).A00, AnonymousClass05K.A00);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-805678960);
        K6K.super.onCreate(bundle);
        this.A0Q = requireArguments().getBoolean("BUNDLE_IS_EMBEDDED");
        this.A0h = requireArguments().getString("BUNDLE_THREAD_TRANSPORT_TYPE");
        this.A0V = requireArguments().getBoolean("BUNDLE_SHOW_SELECT_BUTTON");
        this.A0T = requireArguments().getBoolean("BUNDLE_SHOW_MEDIA_THUMBNAILS");
        this.A0U = requireArguments().getBoolean("BUNDLE_SHOW_NEXT_BUTTON");
        this.A0X = requireArguments().getBoolean("BUNDLE_SHOW_VIEW_MODE_SELECTOR");
        this.A0Y = requireArguments().getFloat("BUNDLE_ASPECT_RATIO", 1.0f);
        this.A00 = requireArguments().getFloat("BUNDLE_INITIAL_HEIGHT_RATIO", 0.7f);
        this.A0Z = requireArguments().getFloat("BUNDLE_MAXIMUM_HEIGHT_RATIO", 1.0f);
        this.A0i = DbT.A1X(requireArguments(), "BUNDLE_SHOW_MAGIC_MEDIA_REMIX");
        this.A0J = (DirectThreadKey) requireArguments().getParcelable("BUNDLE_DIRECT_THREAD_KEY");
        Context requireContext = requireContext();
        AnonymousClass0eM r2 = this.A0l;
        this.A0d = C3262776c.A00(requireContext, AnonymousClass7TE.A0l(r2));
        AnonymousClass2Ep r0 = this.A0H;
        if (r0 == null) {
            DirectThreadKey directThreadKey = this.A0J;
            if (directThreadKey != null) {
                r0 = 2Dr.A03(2L2.A00(AnonymousClass7TE.A0l(r2)), directThreadKey);
            } else {
                r0 = null;
            }
        }
        this.A0H = r0;
        this.A0W = requireArguments().getBoolean("BUNDLE_SHOW_SEND_BUTTON");
        AnonymousClass0fD.A09(1793923019, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1001954497);
        0qQ.A0B(layoutInflater, 0);
        if (!this.A0Q) {
            this.A0n.A02(viewGroup);
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_media_picker, viewGroup, false);
        AnonymousClass0fD.A09(1710102311, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-909401889);
        this.A0b = null;
        this.A0I = null;
        this.A04 = null;
        this.A08 = null;
        this.A03 = null;
        this.A0a = null;
        this.A05 = null;
        this.A07 = null;
        if (!this.A0Q) {
            this.A0n.A01();
        }
        AnonymousClass0eM r4 = this.A0l;
        0lg A0X2 = DbT.A0X(r4);
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, A0X2, 36330754694791936L)) {
            this.A09 = null;
        }
        if (182.A06(r3, DbT.A0X(r4), 36330754695185158L)) {
            LG7 lg7 = this.A0A;
            if (lg7 != null) {
                KKN kkn = lg7.A01;
                if (kkn != null) {
                    kkn.A00 = null;
                    kkn.A02 = null;
                }
                lg7.A01 = null;
            }
            this.A0A = null;
        }
        super.onDestroyView();
        AnonymousClass0fD.A09(-706418200, A022);
    }
}
