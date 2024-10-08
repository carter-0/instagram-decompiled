package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.87i  reason: invalid class name and case insensitive filesystem */
public final class C3510387i implements C3510487j, C3510587k {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public Drawable A08;
    public AnonymousClass9X8 A09;
    public AnonymousClass886 A0A;
    public C53072Gi5 A0B;
    public 1Xj A0C;
    public String A0D;
    public boolean A0E;
    public final Context A0F;
    public final TextureView A0G;
    public final View A0H;
    public final TextView A0I;
    public final RecyclerView A0J;
    public final UserSession A0K;
    public final IgTextView A0L;
    public final IgTextView A0M;
    public final CircularImageView A0N;
    public final C357638Yz A0O;
    public final C3510887n A0P;
    public final C3510987o A0Q;
    public final C3506485o A0R;
    public final C3511387s A0S;
    public final SimpleVideoLayout A0T;
    public final RoundedCornerFrameLayout A0U;
    public final C3511187q A0V;
    public final BroadcastReceiver A0W = new C3510787m(this);
    public final TouchInterceptorFrameLayout A0X;
    public final C3510687l A0Y;

    public final void A09(Context context, FrameLayout.LayoutParams layoutParams, AnonymousClass9X8 r22, float f, float f2, float f3, float f4, float f5, float f6, int i, boolean z) {
        int i2;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        AnonymousClass9X8 r8 = r22;
        0qQ.A0B(r8, 1);
        Medium medium = r8.A0B;
        float f7 = this.A04;
        Integer valueOf = Integer.valueOf(i);
        if (valueOf == null || (this.A0O.A08.A00 instanceof AnonymousClass80O)) {
            i2 = 0;
        } else {
            i2 = valueOf.intValue();
        }
        C39712A6d a6d = new C39712A6d(medium, f7, i2, z);
        A80 a80 = new A80(layoutParams, r8.A03, f, f2, f3, f4, f5, f6, r8.A06);
        this.A09 = r8;
        C3506485o r1 = this.A0R;
        if (!r1.A04) {
            r1.A04 = true;
            C3506485o.A00(r1, false);
        }
        Cwo(r1.A01(), false);
        r8.A00 = a6d.A00;
        r8.A05 = this;
        SimpleVideoLayout simpleVideoLayout = this.A0T;
        ViewGroup.LayoutParams layoutParams2 = simpleVideoLayout.getLayoutParams();
        if (layoutParams2 != null) {
            Rect bounds = r8.getBounds();
            0qQ.A07(bounds);
            int width = bounds.width();
            int height = bounds.height();
            layoutParams2.width = width;
            layoutParams2.height = height;
            simpleVideoLayout.setLayoutParams(layoutParams2);
            A04(this, a80);
            this.A0U.setVisibility(0);
            simpleVideoLayout.setVisibility(0);
            this.A0G.setVisibility(8);
            this.A0I.setVisibility(8);
            this.A0H.setVisibility(8);
            this.A0P.A03(context2, a6d, simpleVideoLayout);
        }
    }

    public final void A0A(Context context, AnonymousClass9X8 r14, float f, float f2, int i) {
        0qQ.A0B(context, 0);
        0qQ.A0B(r14, 1);
        A09(context, (FrameLayout.LayoutParams) null, r14, (float) r14.getBounds().left, (float) r14.getBounds().top, f, 0.0f, f2, 0.0f, i, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r1.A05 == false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cwo(java.lang.Integer r4, boolean r5) {
        /*
            r3 = this;
            r1 = 0
            X.0qQ.A0B(r4, r1)
            X.8Yz r0 = r3.A0O
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 != 0) goto L_0x0032
            r0 = 1
            int r2 = r4.intValue()
            if (r2 == r0) goto L_0x0036
            r0 = 3
            if (r2 == r0) goto L_0x0039
            r0 = 4
            if (r2 == r0) goto L_0x0039
            r0 = 2
            if (r2 == r0) goto L_0x0043
            if (r2 == r1) goto L_0x0043
            java.lang.String r1 = "Unknown audio state: "
            int r2 = 1 - r2
            if (r2 == 0) goto L_0x0033
            java.lang.String r0 = "NO_AUDIO"
        L_0x0028:
            java.lang.String r2 = X.002.A0R(r1, r0)
            java.lang.String r1 = "VideoStickerController"
            r0 = 0
            X.0kD.A0E(r1, r2, r0)
        L_0x0032:
            return
        L_0x0033:
            java.lang.String r0 = "AUDIO_ON"
            goto L_0x0028
        L_0x0036:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0044
        L_0x0039:
            X.85o r1 = r3.A0R
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0043
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0036
        L_0x0043:
            r0 = 0
        L_0x0044:
            r3.A04 = r0
            r3.A08()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3510387i.Cwo(java.lang.Integer, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3510387i(X.AnonymousClass4DH r18, com.instagram.common.session.UserSession r19, com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r20, X.C357638Yz r21, X.C3506485o r22) {
        /*
            r17 = this;
            r6 = r17
            r6.<init>()
            r5 = r19
            r6.A0K = r5
            r1 = r20
            r6.A0X = r1
            r3 = r21
            r6.A0O = r3
            r4 = r22
            r6.A0R = r4
            X.87l r2 = new X.87l
            r2.<init>(r6)
            r6.A0Y = r2
            X.87m r0 = new X.87m
            r0.<init>(r6)
            r6.A0W = r0
            r8 = r18
            android.content.Context r0 = r8.requireContext()
            r6.A0F = r0
            X.87n r0 = new X.87n
            r0.<init>(r8, r5)
            r6.A0P = r0
            r0 = 2131443764(0x7f0b4034, float:1.8509605E38)
            android.view.View r1 = r1.findViewById(r0)
            X.0qQ.A07(r1)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r1 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout) r1
            r6.A0U = r1
            r0 = 2131443690(0x7f0b3fea, float:1.8509455E38)
            android.view.View r0 = r1.findViewById(r0)
            X.0qQ.A07(r0)
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r0 = (com.instagram.ui.simplevideolayout.SimpleVideoLayout) r0
            r6.A0T = r0
            r0 = 2131443952(0x7f0b40f0, float:1.8509987E38)
            android.view.View r0 = r1.findViewById(r0)
            X.0qQ.A07(r0)
            android.view.TextureView r0 = (android.view.TextureView) r0
            r6.A0G = r0
            r0 = 2131442533(0x7f0b3b65, float:1.8507109E38)
            android.view.View r0 = r1.findViewById(r0)
            X.0qQ.A07(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.A0I = r0
            r0 = 2131442530(0x7f0b3b62, float:1.8507102E38)
            android.view.View r0 = r1.findViewById(r0)
            X.0qQ.A07(r0)
            r6.A0H = r0
            r0 = 2131442528(0x7f0b3b60, float:1.8507098E38)
            android.view.View r0 = r1.findViewById(r0)
            X.0qQ.A07(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r6.A0M = r0
            r0 = 2131442527(0x7f0b3b5f, float:1.8507096E38)
            android.view.View r0 = r1.findViewById(r0)
            X.0qQ.A07(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = (com.instagram.common.ui.widget.imageview.CircularImageView) r0
            r6.A0N = r0
            r0 = 2131437373(0x7f0b273d, float:1.8496643E38)
            android.view.View r0 = r1.findViewById(r0)
            X.0qQ.A07(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r6.A0L = r0
            r0 = 2131442532(0x7f0b3b64, float:1.8507107E38)
            android.view.View r0 = r1.findViewById(r0)
            X.0qQ.A07(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r6.A0J = r0
            java.lang.String r0 = ""
            r6.A0D = r0
            X.80m r0 = r3.A08
            java.lang.Object r0 = r0.A00
            boolean r1 = r0 instanceof X.AnonymousClass80O
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x00bd
            r0 = 0
        L_0x00bd:
            r6.A04 = r0
            X.87o r0 = new X.87o
            r0.<init>(r3, r2)
            r6.A0Q = r0
            r0 = -1
            r6.A05 = r0
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            r3 = 0
            X.87p r0 = new X.87p
            r0.<init>(r5)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r2)
            java.lang.Class<X.87q> r0 = X.C3511187q.class
            X.2YL r7 = r1.A00(r0)
            X.87q r7 = (X.C3511187q) r7
            X.0qQ.A07(r7)
            r6.A0V = r7
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            X.87r r0 = new X.87r
            r0.<init>(r1, r5)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r2)
            java.lang.Class<X.87s> r0 = X.C3511387s.class
            X.2YL r9 = r1.A00(r0)
            X.87s r9 = (X.C3511387s) r9
            r6.A0S = r9
            java.lang.Integer r0 = r4.A01()
            r6.Cwo(r0, r3)
            java.util.Set r0 = r4.A0C
            r0.add(r6)
            androidx.fragment.app.FragmentActivity r4 = r8.requireActivity()
            X.82v r0 = new X.82v
            r0.<init>(r5, r4)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r4)
            java.lang.Class<com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel> r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.class
            X.2YL r2 = r1.A00(r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r2
            X.884 r0 = new X.884
            r0.<init>(r5)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r4)
            java.lang.Class<X.885> r0 = X.AnonymousClass885.class
            X.2YL r4 = r1.A00(r0)
            X.885 r4 = (X.AnonymousClass885) r4
            X.886 r0 = r4.A00()
            r6.A0A = r0
            X.2gB r2 = r2.A0G
            r0 = 21
            X.9LG r1 = new X.9LG
            r1.<init>(r6, r0)
            X.887 r0 = new X.887
            r0.<init>(r1)
            r2.A06(r8, r0)
            X.2Fj r2 = r4.A00
            r0 = 20
            X.9LG r1 = new X.9LG
            r1.<init>(r6, r0)
            X.887 r0 = new X.887
            r0.<init>(r1)
            r2.A06(r8, r0)
            X.2Fk r2 = r9.A0G
            r0 = 47
            X.9Ly r1 = new X.9Ly
            r1.<init>((int) r0, (java.lang.Object) r6, (java.lang.Object) r9)
            X.887 r0 = new X.887
            r0.<init>(r1)
            r2.A06(r8, r0)
            X.05G r0 = r9.A0S
            r10 = 0
            X.9KK r11 = new X.9KK
            r12 = r9
            r13 = r8
            r14 = r6
            r15 = r10
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            X.0pz r1 = new X.0pz
            r1.<init>(r11, r0)
            X.07V r0 = r8.getLifecycle()
            X.0xx r0 = X.C71772f0.A00(r0)
            X.AnonymousClass11O.A03(r0, r1)
            X.0r6 r2 = r9.A0O
            r1 = 2
            X.9KB r0 = new X.9KB
            r0.<init>(r6, r9, r10, r1)
            X.0pz r1 = new X.0pz
            r1.<init>(r0, r2)
            X.07V r0 = r8.getLifecycle()
            X.0xx r0 = X.C71772f0.A00(r0)
            X.AnonymousClass11O.A03(r0, r1)
            X.0r6 r0 = r7.A07
            r11 = 1
            X.9KO r5 = new X.9KO
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.0pz r1 = new X.0pz
            r1.<init>(r5, r0)
            X.07V r0 = r8.getLifecycle()
            X.0xx r0 = X.C71772f0.A00(r0)
            X.AnonymousClass11O.A03(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3510387i.<init>(X.4DH, com.instagram.common.session.UserSession, com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout, X.8Yz, X.85o):void");
    }

    public static final void A01(C3510387i r3) {
        AnonymousClass3OB r1;
        C3510887n r2 = r3.A0P;
        AnonymousClass4M3 r0 = r2.A01;
        if (r0 == null || (r1 = ((AnonymousClass4M1) r0).A0M) == null) {
            r1 = AnonymousClass3OB.IDLE;
        }
        if (r1 == AnonymousClass3OB.PLAYING) {
            r2.A04("user_paused_video");
        }
        r2.A02(r3.A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r4.A0P;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C3510387i r4) {
        /*
            X.8Yz r0 = r4.A0O
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x002c
            X.87n r3 = r4.A0P
            X.4M3 r2 = r3.A01
            if (r2 == 0) goto L_0x002c
            boolean r0 = r4.A0E
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x001b
            X.886 r0 = r4.A0A
            float r0 = r0.A00
            float r1 = r1 / r0
        L_0x001b:
            float r0 = r3.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x002c
            r3.A00 = r1
            X.4M1 r2 = (X.AnonymousClass4M1) r2
            X.4MM r0 = r2.A0K
            if (r0 == 0) goto L_0x002c
            r0.A06(r1)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3510387i.A02(X.87i):void");
    }

    public static final void A03(C3510387i r7) {
        r7.A0U.setVisibility(0);
        int i = 8;
        r7.A0T.setVisibility(8);
        r7.A0G.setVisibility(0);
        TextView textView = r7.A0I;
        if (182.A06(0Tu.A05, r7.A0K, 36322164760324075L)) {
            i = 4;
        }
        textView.setVisibility(i);
        r7.A0H.setVisibility(0);
    }

    public static final void A04(C3510387i r8, A80 a80) {
        Rect bounds;
        float f = a80.A04;
        r8.A02 = f;
        float f2 = a80.A05;
        r8.A03 = f2;
        float f3 = a80.A00;
        r8.A00 = f3;
        float f4 = a80.A01;
        r8.A01 = f4;
        RoundedCornerFrameLayout roundedCornerFrameLayout = r8.A0U;
        roundedCornerFrameLayout.setX(f);
        roundedCornerFrameLayout.setY(f2);
        Drawable drawable = r8.A08;
        if (!(drawable == null || (bounds = drawable.getBounds()) == null)) {
            roundedCornerFrameLayout.setPivotX(bounds.exactCenterX() - r8.A02);
            roundedCornerFrameLayout.setPivotY(bounds.exactCenterY() - r8.A03);
        }
        roundedCornerFrameLayout.setTranslationX(f + f3);
        roundedCornerFrameLayout.setTranslationY(f2 + f4);
        roundedCornerFrameLayout.setRotation(a80.A02);
        boolean z = a80.A08;
        float f5 = a80.A03;
        float f6 = f5;
        if (z) {
            f6 = -f5;
        }
        roundedCornerFrameLayout.setScaleX(f6);
        roundedCornerFrameLayout.setScaleY(f5);
        C376429Hy r0 = a80.A07;
        roundedCornerFrameLayout.A01(r0.A02, r0.A03, r0.A00, r0.A01);
        FrameLayout.LayoutParams layoutParams = a80.A06;
        if (layoutParams != null) {
            roundedCornerFrameLayout.setLayoutParams(layoutParams);
        }
    }

    public static final void A05(C3510387i r7, C3511387s r8) {
        int i = 0;
        r7.A0U.setVisibility(0);
        r7.A0T.setVisibility(0);
        int i2 = 8;
        r7.A0G.setVisibility(8);
        TextView textView = r7.A0I;
        if (r8.A0M()) {
            if (182.A06(0Tu.A05, r7.A0K, 36322164760324075L)) {
                i2 = 4;
            }
        }
        textView.setVisibility(i2);
        View view = r7.A0H;
        if (!r8.A0M()) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void A06() {
        C3510887n r2 = this.A0P;
        AnonymousClass4M3 r0 = r2.A01;
        if (r0 != null) {
            r0.E21("hide");
        }
        AnonymousClass4M3 r02 = r2.A01;
        if (r02 != null) {
            r02.ECP("hide");
        }
        r2.A01 = null;
        this.A0V.A00();
        this.A09 = null;
        RoundedCornerFrameLayout roundedCornerFrameLayout = this.A0U;
        roundedCornerFrameLayout.setTranslationX(0.0f);
        roundedCornerFrameLayout.setTranslationY(0.0f);
        roundedCornerFrameLayout.setScaleX(1.0f);
        roundedCornerFrameLayout.setScaleY(1.0f);
        roundedCornerFrameLayout.setRotation(0.0f);
        roundedCornerFrameLayout.setVisibility(8);
    }

    public final void A07() {
        int i;
        C3510887n r1 = this.A0P;
        r1.A04("hide");
        if (this.A0O.A08.A00 instanceof AnonymousClass80O) {
            i = this.A06;
        } else {
            i = 0;
        }
        r1.A02(i);
    }

    public final void A08() {
        AnonymousClass9X8 r1 = this.A09;
        if (r1 != null) {
            r1.A00 = this.A04;
        }
        AnonymousClass4M3 r2 = this.A0P.A01;
        if (r2 != null) {
            r2.Eqr(this.A04, 0);
        }
    }

    public final boolean A0B() {
        if (this.A0U.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void DV1(float f) {
        this.A00 = f;
        this.A0U.setTranslationX(this.A02 + f);
    }

    public final void DV2(float f) {
        this.A01 = f;
        this.A0U.setTranslationY(this.A03 + f);
    }

    public final void Dg1(float f) {
        this.A0U.setRotation(f);
    }

    public final void Dgr(float f) {
        RoundedCornerFrameLayout roundedCornerFrameLayout = this.A0U;
        roundedCornerFrameLayout.setScaleX(f);
        roundedCornerFrameLayout.setScaleY(f);
    }

    public static final void A00(AnonymousClass4DH r3, C3510387i r4, C3511387s r5, boolean z) {
        if (!r5.A0K()) {
            return;
        }
        if (!z) {
            r4.A0X.A00((View.OnTouchListener) null, (View.OnTouchListener) null);
            return;
        }
        GestureDetector gestureDetector = new GestureDetector(r4.A0F, new C380289Xk(r3, r4, r5));
        r4.A0X.A00(new C40034AOq(gestureDetector), new C40035AOr(gestureDetector));
    }

    public final void DKg(int i) {
        this.A05 = i;
    }
}
