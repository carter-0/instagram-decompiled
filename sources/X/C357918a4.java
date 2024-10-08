package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.music.common.model.TrackSnippet;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.8a4  reason: invalid class name and case insensitive filesystem */
public final class C357918a4 implements C357928a5, C357748Zm, C357938a6 {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public ViewGroup A08;
    public ViewGroup A09;
    public ImageView A0A;
    public ImageView A0B;
    public ImageView A0C;
    public ImageView A0D;
    public ProgressBar A0E;
    public TextView A0F;
    public C62642Kk4 A0G;
    public C371088xY A0H;
    public IgTextView A0I;
    public C61776KLp A0J;
    public BottomSheetViewController A0K;
    public AnonymousClass8IJ A0L;
    public AnonymousClass8IJ A0M;
    public C39887ADj A0N;
    public AnonymousClass9SE A0O;
    public MusicAssetModel A0P;
    public TrackSnippet A0Q;
    public C63785L6r A0R;
    public GVO A0S;
    public C19499Wal A0T;
    public ADl A0U;
    public A86 A0V;
    public C19501Wan A0W;
    public AGr A0X;
    public C19500Wam A0Y;
    public AJ9 A0Z;
    public AVL A0a;
    public C3506785t A0b;
    public SpinnerImageView A0c;
    public Integer A0d;
    public Integer A0e;
    public String A0f;
    public String A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public AnonymousClass8II A0m;
    public AnonymousClass6KJ A0n;
    public Integer A0o;
    public boolean A0p;
    public final int A0q;
    public final Handler A0r = new Handler(Looper.getMainLooper());
    public final ViewStub A0s;
    public final AnonymousClass9I6 A0t;
    public final AnonymousClass4DH A0u;
    public final UserSession A0v;
    public final TargetViewSizeProvider A0w;
    public final C357968a9 A0x = new C357958a8(this);
    public final C357888a1 A0y;
    public final C3515689j A0z;
    public final C357948a7 A10 = new C357948a7(this);
    public final boolean A11;
    public final boolean A12;
    public final boolean A13;
    public final boolean A14;
    public final boolean A15;
    public final boolean A16;
    public final ClipsCreationViewModel A17;

    public C357918a4(ViewStub viewStub, AnonymousClass9I6 r5, AnonymousClass4DH r6, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C357888a1 r9, C3515689j r10, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        ClipsCreationViewModel clipsCreationViewModel;
        0qQ.A0B(userSession, 2);
        0qQ.A0B(viewStub, 3);
        0qQ.A0B(r9, 5);
        this.A0u = r6;
        this.A0v = userSession;
        this.A0s = viewStub;
        this.A0t = r5;
        this.A0y = r9;
        this.A0w = targetViewSizeProvider;
        this.A14 = z;
        this.A0z = r10;
        this.A12 = z2;
        this.A11 = z3;
        this.A0q = i;
        this.A16 = z4;
        this.A13 = z5;
        this.A15 = z6;
        FragmentActivity activity = r6.getActivity();
        if (activity != null) {
            clipsCreationViewModel = (ClipsCreationViewModel) new 2YN(new C3500182v(userSession, activity), activity).A00(ClipsCreationViewModel.class);
        } else {
            clipsCreationViewModel = null;
        }
        this.A17 = clipsCreationViewModel;
        this.A0e = AnonymousClass05K.A00;
    }

    public final void A0K(MusicAssetModel musicAssetModel, int i, boolean z) {
        MusicAssetModel musicAssetModel2 = musicAssetModel;
        A03(musicAssetModel2, this, (AnonymousClass6KJ) null, Integer.valueOf(i), (Integer) null, false, z, false, false);
    }

    public final void A0L(MusicAssetModel musicAssetModel, boolean z) {
        if (this.A0u.mView != null) {
            A03(musicAssetModel, this, (AnonymousClass6KJ) null, (Integer) null, (Integer) null, true, z, false, false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DPT(java.lang.Integer r7) {
        /*
            r6 = this;
            r5 = 0
            X.0qQ.A0B(r7, r5)
            r6.A0k = r5
            int r0 = r7.intValue()
            r4 = 2
            r3 = 1
            if (r0 == r3) goto L_0x0018
            if (r0 == r4) goto L_0x001c
            if (r0 == r5) goto L_0x002b
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0018:
            r2 = 2131967809(0x7f133f41, float:1.9572495E38)
            goto L_0x001f
        L_0x001c:
            r2 = 2131967807(0x7f133f3f, float:1.957249E38)
        L_0x001f:
            android.view.ViewGroup r0 = r6.A08
            if (r0 == 0) goto L_0x002b
            android.content.Context r1 = r0.getContext()
            r0 = 0
            X.C59689JTv.A01(r1, r0, r2, r5)
        L_0x002b:
            X.85t r0 = r6.A0b
            if (r0 == 0) goto L_0x0040
            java.lang.Integer r0 = r0.C9B()
            int r0 = r0.intValue()
            if (r0 != r4) goto L_0x003d
            r6.A01()
            return
        L_0x003d:
            r6.A0p = r3
            return
        L_0x0040:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357918a4.DPT(java.lang.Integer):void");
    }

    public final void DPU(AnonymousClass9SE r3) {
        this.A0O = r3;
        this.A0k = false;
        C3506785t r0 = this.A0b;
        if (r0 == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (r0.C9B().intValue() == 2) {
            A01();
        } else {
            this.A0p = true;
        }
    }

    public static final AnonymousClass8II A00(C357918a4 r4) {
        AnonymousClass8II r0 = r4.A0m;
        if (r0 != null) {
            return r0;
        }
        Fragment fragment = r4.A0u;
        if (!fragment.isAdded()) {
            return r0;
        }
        AnonymousClass8II A002 = new 2YN(new AnonymousClass8IH(r4.A0v, fragment.requireActivity()), fragment).A00(AnonymousClass8II.class);
        r4.A0m = A002;
        return A002;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: X.Upv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: X.Upw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: X.Upr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: X.Ups} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: X.9XG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: X.9XH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: X.9XF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: X.9XJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: X.9XJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v54, resolved type: X.9XJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v55, resolved type: X.9XJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v56, resolved type: X.9XJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: X.9XJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: X.9XJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: X.9XJ} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011f, code lost:
        r5.add(r1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01() {
        /*
            r25 = this;
            r13 = r25
            X.9SE r2 = r13.A0O
            if (r2 == 0) goto L_0x0027
            X.Wam r1 = r13.A0Y
            if (r1 == 0) goto L_0x0014
            X.Wak r0 = new X.Wak
            r0.<init>(r2)
            r1.A01 = r0
            X.C19500Wam.A01(r1)
        L_0x0014:
            boolean r0 = r13.A15
            if (r0 == 0) goto L_0x0027
            X.Wam r1 = r13.A0Y
            if (r1 == 0) goto L_0x0027
            r0 = 0
            android.view.View r1 = r1.A05
            r1.setEnabled(r0)
            r0 = 8
            r1.setVisibility(r0)
        L_0x0027:
            boolean r0 = r13.A0C()
            r12 = 1
            if (r0 == 0) goto L_0x004b
            android.view.View r2 = r13.A07
            if (r2 == 0) goto L_0x003b
            X.9SE r1 = r13.A0O
            r0 = 0
            if (r1 == 0) goto L_0x0038
            r0 = 1
        L_0x0038:
            r2.setEnabled(r0)
        L_0x003b:
            android.view.View r2 = r13.A07
            if (r2 == 0) goto L_0x004b
            X.9SE r1 = r13.A0O
            r0 = 1050253722(0x3e99999a, float:0.3)
            if (r1 == 0) goto L_0x0048
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0048:
            r2.setAlpha(r0)
        L_0x004b:
            X.8a1 r0 = r13.A0y
            r24 = r0
            boolean r0 = r24.CcY()
            if (r0 == 0) goto L_0x0252
            X.AJ9 r11 = r13.A0Z
            if (r11 == 0) goto L_0x0240
            com.instagram.music.common.model.MusicAssetModel r3 = r13.A0P
            if (r3 == 0) goto L_0x0201
            X.9SE r1 = r13.A0O
            X.6KJ r10 = r13.A0n
            java.lang.Integer r2 = r13.A0o
            r9 = 0
            r0 = 0
            if (r1 == 0) goto L_0x0068
            r0 = 1
        L_0x0068:
            r11.A0A = r0
            if (r2 == 0) goto L_0x0126
            int r0 = r2.intValue()
        L_0x0070:
            r11.A08 = r3
            android.view.ViewGroup r14 = r11.A0G
            android.content.Context r8 = r14.getContext()
            X.0qQ.A07(r8)
            com.instagram.common.session.UserSession r7 = r11.A0I
            X.8a2 r15 = r11.A0L
            com.instagram.music.common.model.MusicOverlayStickerModel r6 = r15.BUu()
            if (r6 == 0) goto L_0x01f9
            boolean r17 = r15.BuA()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4 = 0
            if (r1 == 0) goto L_0x0096
            X.Wak r4 = new X.Wak
            r4.<init>(r1)
        L_0x0096:
            X.0Tu r3 = X.0Tu.A05
            r1 = 36326030230697433(0x810e55000035d9, double:3.0360660188515376E-306)
            boolean r1 = X.182.A06(r3, r7, r1)
            if (r1 == 0) goto L_0x0123
            java.util.List r1 = X.AIN.A01
        L_0x00a5:
            java.util.Iterator r16 = r1.iterator()
        L_0x00a9:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0139
            java.lang.Object r1 = r16.next()
            X.6KJ r1 = (X.AnonymousClass6KJ) r1
            int r1 = r1.ordinal()
            switch(r1) {
                case 0: goto L_0x00f9;
                case 1: goto L_0x00f2;
                case 2: goto L_0x0108;
                case 3: goto L_0x0100;
                case 4: goto L_0x0118;
                case 5: goto L_0x0110;
                case 6: goto L_0x00bc;
                case 7: goto L_0x00e6;
                case 8: goto L_0x00bd;
                default: goto L_0x00bc;
            }
        L_0x00bc:
            goto L_0x00a9
        L_0x00bd:
            java.lang.Boolean r2 = r6.A0C
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x00a9
            r1 = 36325201302139600(0x810d94000232d0, double:3.0355418010937366E-306)
            boolean r1 = X.182.A06(r3, r7, r1)
            if (r1 == 0) goto L_0x00a9
            X.9XJ r1 = new X.9XJ
            r21 = r6
            r22 = r0
            r23 = r9
            r18 = r1
            r19 = r8
            r20 = r7
            r18.<init>(r19, r20, r21, r22, r23)
            goto L_0x011f
        L_0x00e6:
            com.instagram.api.schemas.MusicProduct r2 = r6.A02
            com.instagram.api.schemas.MusicProduct r1 = com.instagram.api.schemas.MusicProduct.MUSIC_FIRST
            if (r2 == r1) goto L_0x00a9
            X.9XF r1 = new X.9XF
            r1.<init>(r8, r6)
            goto L_0x011f
        L_0x00f2:
            if (r17 != 0) goto L_0x00a9
            X.9XH r1 = X.AIN.A01(r8, r7, r6, r0, r9)
            goto L_0x011f
        L_0x00f9:
            if (r17 != 0) goto L_0x00a9
            X.9XG r1 = X.AIN.A02(r8, r7, r6, r0, r9)
            goto L_0x011f
        L_0x0100:
            if (r4 == 0) goto L_0x00a9
            X.Ups r1 = new X.Ups
            r1.<init>(r8, r6, r4, r0)
            goto L_0x011f
        L_0x0108:
            if (r4 == 0) goto L_0x00a9
            X.Upr r1 = new X.Upr
            r1.<init>(r8, r6, r4, r0)
            goto L_0x011f
        L_0x0110:
            if (r4 == 0) goto L_0x00a9
            X.Upw r1 = new X.Upw
            r1.<init>(r8, r6, r4, r0)
            goto L_0x011f
        L_0x0118:
            if (r4 == 0) goto L_0x00a9
            X.Upv r1 = new X.Upv
            r1.<init>(r8, r6, r4, r0)
        L_0x011f:
            r5.add(r1)
            goto L_0x00a9
        L_0x0123:
            java.util.List r1 = X.AIN.A00
            goto L_0x00a5
        L_0x0126:
            X.8Zr r0 = r11.A0K
            java.util.ArrayList r0 = r0.A01
            java.lang.Object r0 = r0.get(r9)
            X.0qQ.A07(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x0070
        L_0x0139:
            X.7w8 r1 = new X.7w8
            r1.<init>(r8, r7, r5)
            r11.A06 = r1
            if (r10 != 0) goto L_0x014a
            X.1Av r2 = r11.A0O
            boolean r1 = r11.A0A
            X.6KJ r10 = X.C271404in.A08(r2, r1)
        L_0x014a:
            X.7w8 r2 = r11.A06
            if (r2 == 0) goto L_0x017b
            java.lang.Class<X.B3d> r1 = X.B3d.class
            java.util.ArrayList r1 = r2.A06(r1)
            java.util.Iterator r5 = r1.iterator()
            r2 = 0
            r4 = 0
        L_0x015a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x017c
            java.lang.Object r1 = r5.next()
            int r3 = r4 + 1
            if (r4 >= 0) goto L_0x0170
            X.0sr.A1T()
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0170:
            X.B3d r1 = (X.B3d) r1
            X.6KJ r1 = r1.BV4()
            if (r1 != r10) goto L_0x0179
            r2 = r4
        L_0x0179:
            r4 = r3
            goto L_0x015a
        L_0x017b:
            r2 = 0
        L_0x017c:
            r14.setVisibility(r9)
            X.7w8 r4 = r11.A06
            if (r4 == 0) goto L_0x0240
            r4.A0B(r2)
            X.8Zr r5 = r11.A0K
            java.util.ArrayList r3 = r5.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r3.indexOf(r0)
            r0 = -1
            if (r1 != r0) goto L_0x01f3
            r1 = 0
        L_0x0196:
            r5.A00 = r1
            android.view.View r5 = r11.A0F
            X.9Wn r0 = new X.9Wn
            r0.<init>(r4)
            r5.setBackground(r0)
            boolean r0 = r15.CPG()
            if (r0 == 0) goto L_0x01c6
            int r3 = r4.getIntrinsicWidth()
            int r1 = r4.getIntrinsicHeight()
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r3, r1)
            r5.setLayoutParams(r0)
            com.instagram.avatars.store.AvatarStore r3 = X.25x.A00(r7)
            r1 = 31
            X.MP7 r0 = new X.MP7
            r0.<init>(r11, r1)
            r3.A04(r0)
        L_0x01c6:
            java.lang.Class<X.B3d> r0 = X.B3d.class
            java.util.ArrayList r0 = r4.A06(r0)
            X.9mY r5 = r11.A0M
            X.0qQ.A0B(r0, r9)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x01da:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0209
            java.lang.Object r0 = r3.next()
            X.B3d r0 = (X.B3d) r0
            X.6KJ r1 = r0.BV4()
            X.AXK r0 = new X.AXK
            r0.<init>(r1)
            r4.add(r0)
            goto L_0x01da
        L_0x01f3:
            int r0 = r3.size()
            int r1 = r1 % r0
            goto L_0x0196
        L_0x01f9:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0201:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0209:
            X.9mV r0 = r5.A02
            r0.A05(r4)
            X.8AL r0 = r5.A01
            X.AsZ r1 = new X.AsZ
            r1.<init>(r7, r5, r2)
            com.instagram.creation.capture.quickcapture.faceeffectui.NestableSnapPickerRecyclerView r0 = r0.A0P
            X.0nA.A0t(r0, r1)
            X.26t r0 = X.26G.A00(r7)
            X.0xa r1 = r0.A00
            r0 = 2340(0x924, float:3.279E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r9)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0240
            android.widget.ImageView r0 = r11.A03
            if (r0 == 0) goto L_0x0240
            com.instagram.avatars.store.AvatarStore r2 = X.25x.A00(r7)
            r1 = 33
            X.MP7 r0 = new X.MP7
            r0.<init>(r11, r1)
            r2.A04(r0)
        L_0x0240:
            android.widget.ImageView r1 = r13.A0D
            if (r1 == 0) goto L_0x0252
            boolean r0 = r24.BuA()
            if (r0 == 0) goto L_0x0276
            X.9SE r0 = r13.A0O
            if (r0 == 0) goto L_0x027d
        L_0x024e:
            r0 = 0
        L_0x024f:
            r1.setVisibility(r0)
        L_0x0252:
            X.AGr r2 = r13.A0X
            if (r2 == 0) goto L_0x0273
            X.9SE r0 = r13.A0O
            if (r0 != 0) goto L_0x025b
            r12 = 0
        L_0x025b:
            r2.A01 = r12
            android.view.View r1 = r2.A03
            X.8a3 r0 = r2.A04
            boolean r0 = r0.CcY()
            if (r0 == 0) goto L_0x0274
            X.AP6 r0 = r2.A05
        L_0x0269:
            r1.setOnTouchListener(r0)
            r0 = 0
            X.AGr.A01(r2, r0)
            X.AGr.A00(r2, r0)
        L_0x0273:
            return
        L_0x0274:
            r0 = 0
            goto L_0x0269
        L_0x0276:
            boolean r0 = r24.CcY()
            if (r0 == 0) goto L_0x027d
            goto L_0x024e
        L_0x027d:
            r0 = 8
            goto L_0x024f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357918a4.A01():void");
    }

    private final void A02() {
        C331157Pu r0;
        View[] viewArr = {this.A09};
        C71392co r02 = C315596kB.A02;
        C294975nL.A03(viewArr[0], (C295005nO) null, 4, false);
        A86 a86 = this.A0V;
        if (a86 != null && (r0 = a86.A01) != null) {
            r0.A07();
        }
    }

    public static final void A04(TrackSnippet trackSnippet, C357918a4 r4) {
        C3506785t r1 = r4.A0b;
        if (r1 != null) {
            r1.Edo(trackSnippet.A01);
        }
        if (r4.A16 || !AnonymousClass8IK.A0A(r4.A0v)) {
            C3506785t r0 = r4.A0b;
            if (r0 != null) {
                r0.E2p();
            }
        } else {
            r4.A0y.Cwe(r4.A0L, r4.A0D(), true);
        }
        A05(r4);
    }

    public static final void A05(C357918a4 r4) {
        String str;
        ImageView imageView = r4.A0C;
        if (imageView != null) {
            C357888a1 r3 = r4.A0y;
            int i = 4;
            if (r3.CZL()) {
                i = 0;
            }
            imageView.setVisibility(i);
            if (r3.CZL()) {
                C3506785t r0 = r4.A0b;
                if ((r0 == null || !r0.isPlaying()) && !r4.A0l) {
                    imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.music_editor_play));
                    str = r4.A0f;
                } else {
                    imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.music_editor_stop));
                    str = r4.A0g;
                }
                imageView.setContentDescription(str);
            }
        }
    }

    public static final void A06(C357918a4 r3) {
        View view = r3.A05;
        if (view != null) {
            view.setVisibility(8);
        }
        ADl aDl = r3.A0U;
        if (aDl != null) {
            C252063oV r2 = aDl.A02;
            if (r2.CFV() != 8) {
                r2.getView().setVisibility(0);
            }
        }
        C19499Wal wal = r3.A0T;
        if (wal != null) {
            wal.A03.setEnabled(true);
        }
        C19501Wan wan = r3.A0W;
        if (wan != null) {
            RecyclerView recyclerView = wan.A0E;
            recyclerView.setNestedScrollingEnabled(true);
            recyclerView.setOnTouchListener(wan.A0B);
        }
        C19500Wam wam = r3.A0Y;
        if (wam != null) {
            wam.A05.setEnabled(true);
        }
        View view2 = r3.A04;
        if (view2 != null) {
            view2.setEnabled(true);
        }
        View view3 = r3.A04;
        if (view3 != null) {
            view3.setAlpha(1.0f);
        }
        C3506785t r0 = r3.A0b;
        if (r0 != null) {
            r0.E2p();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (X.182.A06(X.0Tu.A05, r5.A0v, 36322362328623210L) == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.C357918a4 r5) {
        /*
            X.8a1 r0 = r5.A0y
            boolean r0 = r0.CRK()
            r4 = 0
            if (r0 != 0) goto L_0x0019
            com.instagram.common.session.UserSession r3 = r5.A0v
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322362328623210(0x810aff0000286a, double:3.033746422810343E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L_0x0026
            if (r1 != 0) goto L_0x0022
            r4 = 8
        L_0x0022:
            r0.setVisibility(r4)
            return
        L_0x0026:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357918a4.A07(X.8a4):void");
    }

    public static final void A09(C357918a4 r5, Integer num) {
        r5.A0e = num;
        r5.A0y.DSF(num);
        int intValue = r5.A0e.intValue();
        String str = null;
        if (intValue == 0) {
            IgTextView igTextView = r5.A0I;
            if (igTextView != null) {
                Resources resources = igTextView.getResources();
                if (resources != null) {
                    str = resources.getString(2131965655);
                }
                igTextView.setText(str);
            }
            C19500Wam wam = r5.A0Y;
            if (wam != null) {
                View view = wam.A05;
                view.setEnabled(false);
                view.setVisibility(8);
            }
        } else if (intValue == 1) {
            IgTextView igTextView2 = r5.A0I;
            if (igTextView2 != null) {
                Resources resources2 = igTextView2.getResources();
                if (resources2 != null) {
                    str = resources2.getString(2131965656);
                }
                igTextView2.setText(str);
            }
            C19500Wam wam2 = r5.A0Y;
            if (wam2 != null) {
                View view2 = wam2.A05;
                view2.setEnabled(true);
                view2.setVisibility(0);
            }
        } else {
            throw new RuntimeException();
        }
    }

    public static final void A0A(C357918a4 r12, String str, boolean z) {
        List list;
        String str2;
        String str3;
        UserSession userSession = r12.A0v;
        27r A012 = 27p.A01(userSession);
        AnonymousClass8IJ r8 = r12.A0L;
        boolean z2 = r12.A13;
        String str4 = null;
        if (r12.A17 != null) {
            list = 0sn.A00;
        } else {
            list = null;
        }
        A012.A1K((C59725JVj) null, r8, str, list, z2);
        if (z) {
            29I r3 = 27p.A01(userSession).A02;
            MusicAssetModel musicAssetModel = r12.A0P;
            if (musicAssetModel != null) {
                str2 = musicAssetModel.A0E;
                str3 = musicAssetModel.A0B;
                str4 = musicAssetModel.A0I;
            } else {
                str2 = null;
                str3 = null;
            }
            AnonymousClass29D r2 = r3.A00;
            String.valueOf(r2.A00.A0J());
            String.valueOf(r2.A00());
            29I.A01(r3, "user_clicked_done_on_music_browser", str2, str3, str4, (String) null, (String) null, (String) null, (String) null, (String) null);
            27p.A01(userSession).A03.A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r15 >= r14.intValue()) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        if (r9 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0063, code lost:
        if (r7 != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0B(java.lang.Integer r14, int r15, boolean r16) {
        /*
            r13 = this;
            boolean r0 = r13.A0i
            if (r0 != 0) goto L_0x012d
            r5 = 1
            r13.A0i = r5
            android.view.View r0 = r13.A04
            if (r0 == 0) goto L_0x000e
            r0.setEnabled(r5)
        L_0x000e:
            android.view.View r1 = r13.A04
            if (r1 == 0) goto L_0x0017
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
        L_0x0017:
            com.instagram.music.common.model.MusicAssetModel r3 = r13.A0P
            java.lang.String r1 = "should not be null while controller is showing"
            if (r3 == 0) goto L_0x010c
            com.instagram.music.common.model.TrackSnippet r2 = r13.A0Q
            if (r2 == 0) goto L_0x0106
            int r6 = r2.A00
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = (long) r15
            long r9 = r4.toSeconds(r0)
            r7 = 5
            r1 = 0
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r9 = 0
            if (r0 >= 0) goto L_0x0033
            r9 = 1
        L_0x0033:
            if (r14 == 0) goto L_0x003c
            int r0 = r14.intValue()
            r7 = 1
            if (r15 < r0) goto L_0x003d
        L_0x003c:
            r7 = 0
        L_0x003d:
            com.instagram.music.common.model.TrackSnippet r0 = r13.A0Q
            if (r0 == 0) goto L_0x0043
            r0.A00 = r6
        L_0x0043:
            X.8a1 r4 = r13.A0y
            r4.DvW(r6)
            X.A86 r8 = r13.A0V
            if (r8 == 0) goto L_0x0085
            boolean r12 = r4.CcC()
            boolean r0 = r4.CcD()
            if (r0 == 0) goto L_0x0059
            r11 = 1
            if (r9 == 0) goto L_0x005a
        L_0x0059:
            r11 = 0
        L_0x005a:
            boolean r0 = r4.CcE()
            if (r0 == 0) goto L_0x0065
            if (r9 != 0) goto L_0x0065
            r10 = 1
            if (r7 == 0) goto L_0x0066
        L_0x0065:
            r10 = 0
        L_0x0066:
            float r6 = (float) r6
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r6 = r6 / r0
            int r9 = java.lang.Math.round(r6)
            int r7 = r4.BPD()
            X.9Y9 r0 = r8.A07
            X.2Fj r6 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r6.A0B(r0)
            android.widget.Button r6 = r8.A04
            if (r12 != 0) goto L_0x00d4
            r0 = 4
            r6.setVisibility(r0)
        L_0x0085:
            com.instagram.ui.widget.spinner.SpinnerImageView r6 = r13.A0c
            if (r6 == 0) goto L_0x008e
            X.3uy r0 = X.C255943uy.SUCCESS
            r6.setLoadingStatus(r0)
        L_0x008e:
            boolean r0 = r4.ACI()
            if (r0 == 0) goto L_0x00b2
            android.view.ViewGroup r0 = r13.A08
            if (r0 == 0) goto L_0x00fe
            android.view.View[] r7 = new android.view.View[]{r0}
            X.2co r0 = X.C315596kB.A02
            r6 = 0
            X.C294975nL.A04(r6, r7, r1)
            android.view.ViewGroup r0 = r13.A09
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A04(r6, r0, r5)
            android.view.ViewGroup r0 = r13.A08
            if (r0 == 0) goto L_0x00b2
            r0.setClickable(r1)
        L_0x00b2:
            X.8a7 r0 = r13.A10
            int r7 = r2.A00
            int r6 = r2.A01
            java.util.List r5 = r3.A0J
            if (r5 != 0) goto L_0x00be
            X.0sn r5 = X.0sn.A00
        L_0x00be:
            java.util.List r0 = r0.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x00c4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0112
            java.lang.Object r0 = r3.next()
            X.XAT r0 = (X.XAT) r0
            r0.CMv(r5, r15, r7, r6)
            goto L_0x00c4
        L_0x00d4:
            r6.setVisibility(r1)
            int r0 = r8.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6.setText(r0)
            if (r11 == 0) goto L_0x00f0
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.setAlpha(r0)
            X.ANu r0 = new X.ANu
            r0.<init>(r8, r7)
        L_0x00ec:
            X.AnonymousClass0fU.A00(r0, r6)
            goto L_0x0085
        L_0x00f0:
            r0 = 1050253722(0x3e99999a, float:0.3)
            r6.setAlpha(r0)
            if (r10 == 0) goto L_0x00fb
            X.AOU r0 = X.AOU.A00
            goto L_0x00ec
        L_0x00fb:
            X.AOV r0 = X.AOV.A00
            goto L_0x00ec
        L_0x00fe:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0106:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x010c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0112:
            boolean r0 = r13.A0p
            if (r0 != 0) goto L_0x011c
            boolean r0 = r4.BuA()
            if (r0 == 0) goto L_0x0121
        L_0x011c:
            r13.A0p = r1
            r13.A01()
        L_0x0121:
            X.ADl r0 = r13.A0U
            if (r0 == 0) goto L_0x0128
            X.ADl.A00(r0, r1)
        L_0x0128:
            if (r16 == 0) goto L_0x012d
            A04(r2, r13)
        L_0x012d:
            A05(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357918a4.A0B(java.lang.Integer, int, boolean):void");
    }

    private final boolean A0C() {
        MusicAssetModel musicAssetModel = this.A0P;
        if (musicAssetModel == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (!this.A0y.Cai() || !musicAssetModel.A0O || !AnonymousClass30D.A06(this.A0v)) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.music.common.model.TrackSnippet, java.lang.Object] */
    public final TrackSnippet A0D() {
        TrackSnippet trackSnippet = this.A0Q;
        if (trackSnippet != null) {
            int i = trackSnippet.A01;
            int i2 = trackSnippet.A00;
            ? obj = new Object();
            if (i < 0) {
                throw new IllegalStateException("start time must be 0 or positive");
            } else if (i2 > 0) {
                obj.A01 = i;
                obj.A00 = i2;
                return obj;
            } else {
                throw new IllegalStateException("duration must be positive");
            }
        } else {
            throw new IllegalStateException("should not be null if controller is showing");
        }
    }

    public final C349337zz A0E() {
        AJ9 aj9 = this.A0Z;
        if (aj9 != null) {
            C357888a1 r2 = this.A0y;
            C40599Aen aen = null;
            if (r2.CcY()) {
                C347017w8 r0 = aj9.A06;
                if (r0 == null) {
                    return null;
                }
                Drawable A042 = r0.A04();
                0qQ.A07(A042);
                AnonymousClass6KJ BV4 = AJ9.A01(A042).BV4();
                if (BV4 != null) {
                    MusicOverlayStickerModel BUu = r2.BUu();
                    if (BUu != null) {
                        C347017w8 r02 = aj9.A06;
                        if (r02 != null) {
                            Drawable A043 = r02.A04();
                            0qQ.A07(A043);
                            int Aox = AJ9.A01(A043).Aox();
                            AnonymousClass9SE r3 = this.A0O;
                            if (aj9.A0B) {
                                C317876nz r22 = aj9.A07;
                                C347017w8 r03 = aj9.A05;
                                int i = aj9.A00;
                                if (!(r22 == null || r03 == null)) {
                                    Drawable A044 = r03.A04();
                                    0qQ.A07(A044);
                                    aen = new C40599Aen(A044, r22, i);
                                }
                            }
                            return C271404in.A07(r3, BUu, aen, BV4, Aox);
                        }
                        throw new IllegalStateException(C41631Axj.A00.toString());
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException(C41632Axk.A00.toString());
            }
            AnonymousClass6KJ r5 = AnonymousClass6KJ.MUSIC_OVERLAY_SIMPLE;
            MusicOverlayStickerModel BUu2 = r2.BUu();
            if (BUu2 != null) {
                if (aj9.A0B) {
                    C317876nz r23 = aj9.A07;
                    C347017w8 r04 = aj9.A05;
                    int i2 = aj9.A00;
                    if (!(r23 == null || r04 == null)) {
                        Drawable A045 = r04.A04();
                        0qQ.A07(A045);
                        aen = new C40599Aen(A045, r23, i2);
                    }
                }
                Af0 af0 = new Af0(BUu2, aen, r5, -1);
                af0.A04 = true;
                return af0;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0F() {
        ValueAnimator valueAnimator;
        if (this.A08 != null) {
            C3506785t r0 = this.A0b;
            if (r0 != null) {
                r0.EE8(this);
            }
            C3506785t r02 = this.A0b;
            if (r02 != null) {
                r02.AHl();
            }
            C39887ADj aDj = this.A0N;
            if (aDj != null) {
                aDj.A01 = null;
                aDj.A00 = null;
            }
            A02();
            C315596kB.A08(new View[]{this.A08}, false);
            this.A0y.DSq();
            C19501Wan wan = this.A0W;
            if (wan != null) {
                wan.A0E.A0b();
            }
            AJ9 aj9 = this.A0Z;
            if (aj9 != null) {
                AJ9.A03(aj9);
                aj9.A0G.setVisibility(8);
                aj9.A0F.setBackground((Drawable) null);
                aj9.A0K.A00 = 0;
                aj9.A0A = false;
                aj9.A0C = false;
                aj9.A06 = null;
                aj9.A05 = null;
                ((View) aj9.A0R.getValue()).setBackground((Drawable) null);
                ValueAnimator valueAnimator2 = aj9.A02;
                if (!(valueAnimator2 == null || !valueAnimator2.isRunning() || (valueAnimator = aj9.A02) == null)) {
                    valueAnimator.cancel();
                }
                aj9.A02 = null;
                aj9.A04 = null;
                aj9.A0D = false;
            }
            C19500Wam wam = this.A0Y;
            if (wam != null) {
                C18739VzK vzK = wam.A02;
                if (vzK != null) {
                    vzK.A00 = null;
                    View view = vzK.A05;
                    view.setBackground((Drawable) null);
                    view.setOnTouchListener((View.OnTouchListener) null);
                }
                wam.A02 = null;
                wam.A01 = null;
                wam.A03 = false;
                wam.A00 = -1;
            }
            AnonymousClass8II A002 = A00(this);
            if (A002 != null) {
                A002.A0I("cancel_back_button");
            }
            this.A0P = null;
            this.A0n = null;
            this.A0o = null;
            this.A0O = null;
            this.A0Q = null;
            this.A0l = false;
            this.A0k = false;
            this.A0p = false;
        }
    }

    public final void A0G() {
        C3506785t r0 = this.A0b;
        if (r0 != null && r0.isPlaying()) {
            this.A0l = true;
            C3506785t r02 = this.A0b;
            if (r02 != null) {
                r02.pause();
            }
        }
    }

    public final void A0H() {
        if (this.A0l) {
            UserSession userSession = this.A0v;
            29H r0 = 27p.A01(userSession).A03;
            29E r5 = r0.A0E;
            long A042 = r5.A04((Integer) null, (String) null, 17645025, r0.A0D);
            r0.A04 = A042;
            r5.A0B(A042, "use_case", "music_editor_scrub_finished", false);
            this.A0l = false;
            TrackSnippet trackSnippet = this.A0Q;
            C3506785t r02 = this.A0b;
            if (r02 == null || !r02.CKF() || trackSnippet == null) {
                29H r2 = 27p.A01(userSession).A03;
                r2.A04 = r2.A0E.A07("No music to play", "", 17645025, r2.A04);
                return;
            }
            A04(trackSnippet, this);
        }
    }

    public final void A0I() {
        C3506785t r0 = this.A0b;
        if (r0 != null && r0.isPlaying()) {
            C3506785t r02 = this.A0b;
            if (r02 != null) {
                r02.pause();
            }
            A05(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005f, code lost:
        if (r1 != null) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J(X.AnonymousClass8IJ r5, java.io.File r6, boolean r7) {
        /*
            r4 = this;
            X.8IJ r0 = r4.A0L
            if (r0 == r5) goto L_0x0006
            r4.A0L = r5
        L_0x0006:
            r3 = 1
            if (r7 == 0) goto L_0x000e
            r4.A0h = r3
            A06(r4)
        L_0x000e:
            X.8a1 r1 = r4.A0y
            com.instagram.music.common.model.TrackSnippet r0 = r4.A0D()
            r1.Cwe(r5, r0, r7)
            com.instagram.music.common.model.MusicAssetModel r0 = r4.A0P
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x0081
            com.instagram.music.common.model.MusicDataSource r1 = r0.A05
            if (r1 == 0) goto L_0x0046
            if (r6 == 0) goto L_0x006d
            android.net.Uri r0 = android.net.Uri.fromFile(r6)
        L_0x0027:
            r1.A00 = r0
            X.85t r0 = r4.A0b
            if (r0 == 0) goto L_0x0030
            r0.Edj(r1, r3)
        L_0x0030:
            if (r6 != 0) goto L_0x004e
            X.85t r1 = r4.A0b
            if (r1 == 0) goto L_0x003f
            com.instagram.music.common.model.TrackSnippet r0 = r4.A0Q
            if (r0 == 0) goto L_0x006f
            int r0 = r0.A01
        L_0x003c:
            r1.Edo(r0)
        L_0x003f:
            X.85t r0 = r4.A0b
            if (r0 == 0) goto L_0x0046
            r0.E2p()
        L_0x0046:
            X.85t r0 = r4.A0b
            if (r0 == 0) goto L_0x004d
            r0.E2p()
        L_0x004d:
            return
        L_0x004e:
            if (r7 == 0) goto L_0x0067
            com.instagram.music.common.model.TrackSnippet r0 = r4.A0Q
            if (r5 == 0) goto L_0x0062
            if (r0 == 0) goto L_0x0075
            int r0 = r0.A01
            float r1 = (float) r0
            float r0 = r5.A01
            float r1 = r1 / r0
            int r0 = (int) r1
        L_0x005d:
            X.85t r1 = r4.A0b
            if (r1 == 0) goto L_0x003f
            goto L_0x003c
        L_0x0062:
            if (r0 == 0) goto L_0x007b
            int r0 = r0.A01
            goto L_0x005d
        L_0x0067:
            X.85t r1 = r4.A0b
            if (r1 == 0) goto L_0x003f
            r0 = 0
            goto L_0x003c
        L_0x006d:
            r0 = 0
            goto L_0x0027
        L_0x006f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0075:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x007b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0081:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357918a4.A0J(X.8IJ, java.io.File, boolean):void");
    }

    public final boolean A0M() {
        C331157Pu r0;
        A86 a86 = this.A0V;
        if (a86 == null || !a86.A02 || (r0 = a86.A01) == null) {
            ViewGroup viewGroup = this.A08;
            if (viewGroup == null || viewGroup.getVisibility() != 0) {
                return false;
            }
            A0G();
            return this.A0y.Cxa();
        }
        r0.A07();
        return true;
    }

    public final void DTC() {
    }

    public final void DTE() {
    }

    public final void DTG() {
        29H r6 = 27p.A01(this.A0v).A03;
        long j = r6.A04;
        if (j != 17645025) {
            r6.A04 = r6.A0E.A02(17645025, j);
        }
    }

    public final void DTH() {
        TrackSnippet trackSnippet = this.A0Q;
        if (trackSnippet != null) {
            C357948a7 r0 = this.A10;
            int i = trackSnippet.A01;
            for (XAT DTI : r0.A02) {
                DTI.DTI(i);
            }
        }
    }

    public final void DTI(int i) {
        for (XAT DTI : this.A10.A02) {
            DTI.DTI(i);
        }
        AJ9 aj9 = this.A0Z;
        if (aj9 != null) {
            aj9.A01 = i;
            AJ9.A08(aj9);
        }
        ADl aDl = this.A0U;
        if (aDl != null) {
            aDl.A01(i, false);
        }
    }

    public final void DhZ(XAT xat) {
        A86 a86 = this.A0V;
        if (a86 != null && !a86.A02) {
            A0H();
        }
        AVL avl = this.A0a;
        if (avl != null) {
            Handler handler = avl.A01;
            Runnable runnable = avl.A03;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 250);
        }
        AJ9 aj9 = this.A0Z;
        if (aj9 != null) {
            AJ9.A05(aj9);
        }
        ADl aDl = this.A0U;
        if (aDl != null) {
            ADl.A00(aDl, true);
        }
        AnonymousClass8IJ r2 = this.A0L;
        if (r2 != null) {
            this.A0y.Cwe(r2, A0D(), true);
        }
    }

    public final void Dhb(XAT xat, int i) {
        boolean z;
        TrackSnippet trackSnippet = this.A0Q;
        if (trackSnippet != null) {
            trackSnippet.A01 = i;
        }
        this.A0y.DvX(i);
        ADl aDl = this.A0U;
        if (aDl != null) {
            C19501Wan wan = this.A0W;
            if (wan != null) {
                z = wan.A04();
            } else {
                z = false;
            }
            aDl.A01(i, z);
        }
    }

    public static final void A08(C357918a4 r4) {
        AnonymousClass8II A002 = A00(r4);
        if (A002 != null) {
            A002.A0I("cancel_done");
        }
        A0A(r4, "AUDIO_EDITOR_PAGE_REPLACE_CONFIRM_TAP", true);
        r4.A0y.D9r(r4.A0L, r4.A0D(), AnonymousClass05K.A01);
    }

    public final void DTD(int i, int i2) {
        A0B(Integer.valueOf(i2), i, true);
    }

    public final void Dha(XAT xat) {
        Integer num;
        A0G();
        AVL avl = this.A0a;
        if (avl != null) {
            avl.A01.removeCallbacks(avl.A03);
            2cs r3 = avl.A02;
            r3.A08((double) avl.A00, true);
            r3.A06(1.0d);
        }
        27r A012 = 27p.A01(this.A0v);
        TrackSnippet trackSnippet = this.A0Q;
        if (trackSnippet != null) {
            num = Integer.valueOf(trackSnippet.A01);
        } else {
            num = null;
        }
        String valueOf = String.valueOf(num);
        if (valueOf == null) {
            valueOf = "";
        }
        C371088xY r6 = this.A0H;
        C62642Kk4 kk4 = this.A0G;
        29R r5 = A012.A09;
        1Ln A082 = 1Ln.A08(r5.A01);
        C279294yP A0J2 = r5.A0J();
        if (A082.A00.isSampled() && A0J2 != null) {
            A082.A0t("IG_CAMERA_ENTITY_TAP");
            A082.A0r("AUDIO_LM_SCRUB");
            29R.A00(A082, r5);
            A082.A0a(A0J2);
            AnonymousClass283 r52 = r5.A04;
            A082.A0b(r52.A09);
            A082.A0W(2);
            A082.A0d(C59725JVj.POST_CAPTURE);
            A082.A0M(r6, AnonymousClass000.A00(5311));
            A082.A0n(27x.A08.getModuleName());
            A082.A0c(r52.A0A);
            A082.A0u(AnonymousClass1QI.A00.A02.A00);
            A082.A0R("composition_str_id", r52.A0M);
            A082.A0M(r52.A0A, "composition_media_type");
            A082.A0R("time_scrubber_timestamp", valueOf);
            A082.A0M(kk4, AnonymousClass000.A00(4502));
            A082.Cgf();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.music.common.model.TrackSnippet, java.lang.Object] */
    public static final void A03(MusicAssetModel musicAssetModel, C357918a4 r28, AnonymousClass6KJ r29, Integer num, Integer num2, boolean z, boolean z2, boolean z3, boolean z4) {
        int A002;
        ViewGroup viewGroup;
        ViewStub viewStub;
        View inflate;
        View view;
        View view2;
        ViewStub viewStub2;
        C357918a4 r3 = r28;
        UserSession userSession = r3.A0v;
        29H r4 = 27p.A01(userSession).A03;
        29E r5 = r4.A0E;
        long A042 = r5.A04((Integer) null, (String) null, 17645025, r4.A0D);
        r4.A04 = A042;
        r5.A0B(A042, "use_case", "music_editor_load", false);
        boolean z5 = false;
        r3.A0j = false;
        MusicAssetModel musicAssetModel2 = musicAssetModel;
        r3.A0P = musicAssetModel2;
        r3.A0n = r29;
        r3.A0o = num2;
        C3506785t r0 = r3.A0b;
        C3506785t r17 = r0;
        if (r0 != null) {
            int i = musicAssetModel2.A00;
            int BV1 = r17.BV1();
            if (i <= 0) {
                0kD.A05("MusicOverlayEditController", 002.A1D("Track duration should not be 0. isOriginalSound: ", musicAssetModel2.A0U), (Throwable) null);
            } else if (i < BV1) {
                BV1 = i;
            }
            if (BV1 <= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid track snippet duration: ");
                sb.append(BV1);
                sb.append(". trackDurationMs=");
                sb.append(i);
                sb.append(", hasMusic=");
                sb.append(r17.CKF());
                sb.append(", isPlaying=");
                sb.append(r17.isPlaying());
                sb.append(", hasDataSource=");
                if (r17.BUq() != null) {
                    z5 = true;
                }
                sb.append(z5);
                sb.append(", trackState=");
                sb.append(C39559A0b.A00(r17.C9B()));
                0kD.A05("MusicOverlayEditController", sb.toString(), (Throwable) null);
                C59689JTv.A0B(r3.A0u.getContext(), "trackSnippetDurationMs <= 0");
                r3.A0y.ATW();
                return;
            }
            if (num != null) {
                A002 = num.intValue();
            } else {
                0sn r02 = musicAssetModel2.A0J;
                if (r02 == null) {
                    r02 = 0sn.A00;
                }
                A002 = C63349KvW.A00(i, BV1, r02);
            }
            r17.Edo(A002);
            ? obj = new Object();
            if (A002 >= 0) {
                obj.A01 = A002;
                obj.A00 = BV1;
                TrackSnippet trackSnippet = r3.A0Q;
                if (trackSnippet != null) {
                    trackSnippet.A01 = A002;
                }
                C357888a1 r03 = r3.A0y;
                C357888a1 r282 = r03;
                r03.DvX(A002);
                r3.A0Q = obj;
                r17.A9Q(r3);
                boolean z6 = z4;
                if (r3.A08 != null) {
                    AJ9 aj9 = r3.A0Z;
                    if (aj9 != null) {
                        aj9.A09 = z6;
                    }
                } else {
                    View inflate2 = r3.A0s.inflate();
                    0qQ.A0C(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup2 = (ViewGroup) inflate2;
                    r3.A08 = viewGroup2;
                    if (viewGroup2 != null) {
                        AnonymousClass9I6 r8 = r3.A0t;
                        viewGroup2.setBackgroundColor(r8.A01);
                        Context context = viewGroup2.getContext();
                        Resources resources = context.getResources();
                        r3.A0c = (SpinnerImageView) viewGroup2.findViewById(R.id.track_loading_spinner);
                        r3.A09 = (ViewGroup) viewGroup2.requireViewById(R.id.music_editor_controls_container);
                        r3.A07 = viewGroup2.findViewById(R.id.report_lyrics_button);
                        r3.A0A = (ImageView) viewGroup2.requireViewById(R.id.album_art_button);
                        r3.A0D = (ImageView) viewGroup2.requireViewById(R.id.music_sticker_color_button);
                        r3.A0B = (ImageView) viewGroup2.requireViewById(R.id.music_sticker_avatar_toggle);
                        int i2 = 0;
                        if (r282.CW3()) {
                            View findViewById = viewGroup2.findViewById(R.id.time_indicator);
                            0qQ.A07(findViewById);
                            r3.A0U = new ADl(context, (TextView) findViewById, 2b1.A01(viewGroup2.findViewById(R.id.music_editor_snippet_selection_nux_label), false, false), new A4H(r3));
                        }
                        View view3 = r3.A07;
                        if (view3 != null) {
                            AnonymousClass3NG r12 = new AnonymousClass3NG(view3);
                            r12.A04 = new C386269kK(r3);
                            r12.A07 = true;
                            r12.A00();
                        }
                        ImageView imageView = r3.A0A;
                        if (imageView != null) {
                            int dimensionPixelSize = resources.getDimensionPixelSize(r8.A00);
                            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
                            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
                            int color = context.getColor(2Yu.A0H(context, R.attr.musicCreationAlbumBorderColor));
                            int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.achievements_only_you_top_margin);
                            int i3 = -1;
                            if (2Yu.A0L(context, R.attr.musicCreationShadowEnabled, false)) {
                                i3 = 0;
                            }
                            imageView.setImageDrawable(new GIH(context, (GJO) null, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, color, dimensionPixelSize4, i3, false));
                            AnonymousClass3NG r122 = new AnonymousClass3NG(imageView);
                            r122.A04 = new C386279kL(r3);
                            r122.A07 = true;
                            r122.A00();
                            if (!r8.A02) {
                                imageView.setContentDescription((CharSequence) null);
                                imageView.setEnabled(false);
                            }
                            View findViewById2 = viewGroup2.findViewById(R.id.music_editor_cancel_button);
                            if (findViewById2 != null) {
                                AnonymousClass3NG r10 = new AnonymousClass3NG(findViewById2);
                                r10.A04 = new C386289kM(r3);
                                r10.A07 = true;
                                r10.A00();
                            } else {
                                findViewById2 = null;
                            }
                            r3.A02 = findViewById2;
                            View requireViewById = viewGroup2.requireViewById(R.id.delete_button);
                            if (r3.A0z == C3515689j.GALLERY) {
                                View requireViewById2 = viewGroup2.requireViewById(R.id.divider);
                                0qQ.A07(requireViewById2);
                                requireViewById2.setVisibility(0);
                                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                                0qQ.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                C71492dQ r82 = (C71492dQ) layoutParams;
                                r82.A0t = requireViewById.getId();
                                r82.A0u = -1;
                            }
                            0qQ.A0A(requireViewById);
                            AnonymousClass3NG r83 = new AnonymousClass3NG(requireViewById);
                            r83.A04 = new C386299kN(r3);
                            r83.A07 = true;
                            r83.A00();
                            r3.A03 = requireViewById;
                            ImageView imageView2 = (ImageView) viewGroup2.requireViewById(R.id.music_editor_play_button);
                            if (!r282.CZL()) {
                                i2 = 4;
                            }
                            imageView2.setVisibility(i2);
                            AnonymousClass0fU.A00(new AN4(r3), imageView2);
                            r3.A0C = imageView2;
                            r3.A0f = context.getString(2131967853);
                            r3.A0g = context.getString(2131967890);
                            View requireViewById3 = viewGroup2.requireViewById(R.id.music_editor_done_button);
                            int i4 = 8;
                            if (r282.CRW()) {
                                i4 = 0;
                            }
                            requireViewById3.setVisibility(i4);
                            requireViewById3.setEnabled(false);
                            requireViewById3.setAlpha(0.3f);
                            2eS.A04(requireViewById3, AnonymousClass05K.A01);
                            AnonymousClass0fU.A00(new C386429ka(r3), requireViewById3);
                            0nA.A0p(requireViewById3, new C65998M7j(requireViewById3, r3));
                            r3.A04 = requireViewById3;
                            ViewGroup viewGroup3 = r3.A09;
                            if (viewGroup3 != null) {
                                AnonymousClass0fU.A00(AOT.A00, viewGroup3);
                            }
                            AnonymousClass4DH r13 = r3.A0u;
                            r3.A0V = new A86(viewGroup2, r13, userSession, new A4I(r3));
                            r3.A0N = new C39887ADj(r13, userSession);
                            C357948a7 r102 = r3.A10;
                            r3.A0T = new C19499Wal(viewGroup2, r102);
                            r3.A0W = new C19501Wan(viewGroup2, r102, r3.A14);
                            View findViewById3 = viewGroup2.findViewById(R.id.lyrics_scrubber_view);
                            0qQ.A0A(findViewById3);
                            boolean z7 = r3.A15;
                            r3.A0Y = new C19500Wam(findViewById3, r102, z7);
                            if (r13.mView != null) {
                                AJ9 aj92 = new AJ9(viewGroup2, r13.getViewLifecycleOwner(), r13, userSession, r3.A0w, r3, r282, new WeakReference(r13));
                                aj92.A09 = z6;
                                r3.A0X = new AGr(viewGroup2, r282, aj92, z7);
                                r3.A0a = new AVL(r3);
                                boolean CcY = r282.CcY();
                                ImageView imageView3 = r3.A0D;
                                if (CcY) {
                                    if (imageView3 != null) {
                                        imageView3.setImageResource(R.drawable.instagram_icons_exceptions_color_picker_filled_44);
                                        AnonymousClass3NG r7 = new AnonymousClass3NG(imageView3);
                                        r7.A02(imageView3, aj92.A0F);
                                        r7.A04 = new C386319kP(aj92);
                                        r7.A00();
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else if (imageView3 != null) {
                                    imageView3.setVisibility(8);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                boolean CPG = r282.CPG();
                                ImageView imageView4 = r3.A0B;
                                if (CPG) {
                                    if (imageView4 != null) {
                                        aj92.A03 = imageView4;
                                        Context context2 = aj92.A0G.getContext();
                                        0qQ.A07(context2);
                                        imageView4.setImageDrawable(new C60002JdB(context2, new C61028JvS((String) null, 0, false, false, false), aj92.A0I, imageView4.getContext().getResources().getDimensionPixelSize(R.dimen.accent_edge_thickness)));
                                        AnonymousClass3NG r72 = new AnonymousClass3NG(imageView4);
                                        r72.A02(imageView4, aj92.A0F);
                                        r72.A04 = new C386309kO(aj92);
                                        r72.A00();
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else if (imageView4 != null) {
                                    imageView4.setVisibility(8);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                r3.A0Z = aj92;
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                boolean z8 = r3.A12;
                if (z8 && !r3.A11) {
                    ViewGroup viewGroup4 = r3.A08;
                    if (viewGroup4 != null) {
                        View requireViewById4 = viewGroup4.requireViewById(R.id.filters_button);
                        requireViewById4.setVisibility(0);
                        r3.A01 = requireViewById4;
                        AnonymousClass0fU.A00(new AN3(r3), requireViewById4);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                boolean z9 = r3.A11;
                if (z9) {
                    ViewGroup viewGroup5 = r3.A08;
                    View view4 = null;
                    if (viewGroup5 == null || (viewStub2 = (ViewStub) viewGroup5.findViewById(R.id.music_editor_footer)) == null) {
                        view = null;
                        view2 = null;
                    } else {
                        view = viewStub2.inflate();
                        if (view != null) {
                            view2 = view.findViewById(R.id.music_editor_add_button);
                        }
                        view2 = null;
                    }
                    r3.A00 = view2;
                    if (view2 != null) {
                        boolean z10 = false;
                        float f = 0.3f;
                        if (((long) r3.A0q) < 182.A01(0Tu.A06, userSession, 36602870938080063L)) {
                            z10 = true;
                            f = 1.0f;
                        }
                        view2.setAlpha(f);
                        AnonymousClass0fU.A00(new C386439kb(view2, r3, z10), view2);
                    }
                    if (view != null) {
                        view4 = view.findViewById(R.id.music_editor_replace_button);
                    }
                    r3.A06 = view4;
                    if (view4 != null) {
                        AnonymousClass0fU.A00(new C386419kZ(r3), view4);
                    }
                }
                A07(r3);
                View view5 = r3.A03;
                if (view5 != null) {
                    int i5 = 8;
                    if (r282.CRK()) {
                        i5 = 0;
                    }
                    view5.setVisibility(i5);
                    if (!(!r3.A15 || (viewGroup = r3.A08) == null || (viewStub = (ViewStub) viewGroup.findViewById(R.id.music_editor_mode_switcher)) == null || (inflate = viewStub.inflate()) == null)) {
                        r3.A0I = inflate.findViewById(R.id.lyrics_toggle_button);
                        Context context3 = inflate.getContext();
                        0qQ.A07(context3);
                        Drawable A052 = AnonymousClass3JT.A05(context3, R.drawable.instagram_music_pano_filled_12, context3.getColor(2Yu.A07(context3)));
                        IgTextView igTextView = r3.A0I;
                        if (igTextView != null) {
                            igTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(A052, (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        if (182.A06(0Tu.A05, userSession, 36328143354739670L)) {
                            A09(r3, AnonymousClass05K.A01);
                            IgTextView igTextView2 = r3.A0I;
                            if (igTextView2 != null) {
                                igTextView2.postDelayed(new C40887Akv(r3), 500);
                            }
                        } else {
                            A09(r3, AnonymousClass05K.A00);
                        }
                        IgTextView igTextView3 = r3.A0I;
                        if (igTextView3 != null) {
                            AnonymousClass0fU.A00(new AN5(r3), igTextView3);
                        }
                    }
                    if (z8 || z9) {
                        ViewGroup viewGroup6 = r3.A08;
                        if (viewGroup6 != null) {
                            View requireViewById5 = viewGroup6.requireViewById(R.id.music_editor_bottom_container);
                            0qQ.A07(requireViewById5);
                            TargetViewSizeProvider targetViewSizeProvider = r3.A0w;
                            if (targetViewSizeProvider != null) {
                                requireViewById5.post(new C41087Ao9(requireViewById5, targetViewSizeProvider));
                            }
                            if (z9) {
                                View view6 = r3.A04;
                                if (view6 != null) {
                                    view6.setVisibility(8);
                                }
                                View view7 = r3.A03;
                                if (view7 != null) {
                                    view7.setVisibility(8);
                                }
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    r3.A0i = false;
                    MusicDataSource musicDataSource = musicAssetModel2.A05;
                    if (musicDataSource != null) {
                        r17.Edj(musicDataSource, false);
                    }
                    int intValue = r17.C9B().intValue();
                    if (intValue == 1) {
                        r3.A02();
                        ViewGroup viewGroup7 = r3.A09;
                        if (viewGroup7 != null) {
                            viewGroup7.setClickable(true);
                        }
                        View[] viewArr = {r3.A08};
                        C71392co r04 = C315596kB.A02;
                        C294975nL.A04((C295005nO) null, viewArr, false);
                        SpinnerImageView spinnerImageView = r3.A0c;
                        if (spinnerImageView != null) {
                            spinnerImageView.setLoadingStatus(C255943uy.LOADING);
                        }
                    } else if (intValue == 2) {
                        r3.A0B((Integer) null, r17.BV5(), z);
                    } else {
                        throw new IllegalStateException(002.A0R("Unhandled music player state: ", C39559A0b.A00(r17.C9B())));
                    }
                    ImageView imageView5 = r3.A0A;
                    if (imageView5 != null) {
                        Drawable drawable = imageView5.getDrawable();
                        0qQ.A0C(drawable, AnonymousClass000.A00(334));
                        JYP.A01(userSession, musicAssetModel2, (GIH) drawable);
                        if (r282.CdS()) {
                            ViewGroup viewGroup8 = r3.A08;
                            if (viewGroup8 != null) {
                                Context context4 = viewGroup8.getContext();
                                if (r3.A0F == null || r3.A0R == null) {
                                    TextView textView = (TextView) viewGroup8.requireViewById(R.id.track_title);
                                    textView.setVisibility(0);
                                    r3.A0F = textView;
                                    View requireViewById6 = viewGroup8.requireViewById(R.id.track_artist);
                                    0qQ.A07(requireViewById6);
                                    TextView textView2 = (TextView) requireViewById6;
                                    r3.A0R = new C63785L6r(textView2);
                                    textView2.setVisibility(0);
                                }
                                MusicAssetModel musicAssetModel3 = r3.A0P;
                                if (musicAssetModel3 != null) {
                                    TextView textView3 = r3.A0F;
                                    if (textView3 != null) {
                                        GVO gvo = new GVO(textView3, context4.getColor(2Yu.A0H(context4, R.attr.musicCreationExplicitIconColor)));
                                        r3.A0S = gvo;
                                        GVM.A00((Drawable) null, gvo, musicAssetModel3.A0I, musicAssetModel3.A0S, false);
                                        C63785L6r l6r = r3.A0R;
                                        if (l6r != null) {
                                            String str = musicAssetModel3.A0D;
                                            0qQ.A07(str);
                                            LJQ.A01(l6r, str, (String) null, (String) null, false, false);
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        if (z2) {
                            View view8 = r3.A07;
                            if (view8 != null) {
                                int i6 = 8;
                                if (r3.A0C()) {
                                    i6 = 0;
                                }
                                view8.setVisibility(i6);
                            }
                            C39887ADj aDj = r3.A0N;
                            if (aDj != null) {
                                MusicAssetModel musicAssetModel4 = r3.A0P;
                                if (musicAssetModel4 != null) {
                                    aDj.A00(r3, musicAssetModel4);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                            r3.A0k = true;
                        } else {
                            r3.A0p = true;
                        }
                        AJ9 aj93 = r3.A0Z;
                        boolean z11 = z3;
                        if (aj93 != null) {
                            aj93.A0C = z11;
                        }
                        if (r29 == AnonymousClass6KJ.MUSIC_ONLY && z3) {
                            r282.EuN();
                        }
                        View[] viewArr2 = {r3.A08};
                        C71392co r05 = C315596kB.A02;
                        C294975nL.A04((C295005nO) null, viewArr2, true);
                        r282.DSr();
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("start time must be 0 or positive");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
