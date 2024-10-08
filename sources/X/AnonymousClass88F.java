package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.88F  reason: invalid class name */
public final class AnonymousClass88F implements View.OnTouchListener, AnonymousClass88G, AnonymousClass88H, AnonymousClass88I, AnonymousClass85Y, C3502283u {
    public int A00;
    public AnonymousClass1MK A01;
    public AnonymousClass9X8 A02;
    public C369948va A03;
    public AnonymousClass804 A04;
    public AnonymousClass804 A05;
    public C369458un A06;
    public Integer A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final UserSession A0C;
    public final ImageUrl A0D;
    public final TouchInterceptorFrameLayout A0E;
    public final C357638Yz A0F;
    public final C3510387i A0G;
    public final TargetViewSizeProvider A0H;
    public final C39646A3m A0I;
    public final AnonymousClass88E A0J;
    public final C388689oE A0K;
    public final C3498982i A0L;
    public final C379289Tg A0M;
    public final InteractiveDrawableContainer A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final Deque A0R;
    public final HashSet A0S = new HashSet();
    public final AnonymousClass0eM A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final ViewStub A0X;
    public final A69 A0Y;
    public final C3497281m A0Z;
    public final ClipsCreationViewModel A0a;
    public final AVM A0b;
    public final AnonymousClass88B A0c;
    public final boolean A0d;
    public volatile boolean A0e;
    public volatile boolean A0f;

    /* JADX WARNING: type inference failed for: r11v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass88F(android.content.Context r9, android.view.View r10, X.AnonymousClass4DH r11, com.instagram.common.session.UserSession r12, com.instagram.common.typedurl.ImageUrl r13, com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r14, X.C357638Yz r15, X.C3510387i r16, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r17, X.A69 r18, X.C39646A3m r19, X.C3497281m r20, X.AnonymousClass88E r21, X.AVM r22, X.C388689oE r23, X.C3498982i r24, com.instagram.ui.widget.interactive.InteractiveDrawableContainer r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, boolean r30, boolean r31) {
        /*
            r8 = this;
            r2 = 1
            X.0qQ.A0B(r9, r2)
            r4 = 3
            X.0qQ.A0B(r11, r4)
            r0 = 4
            r3 = r20
            X.0qQ.A0B(r3, r0)
            r0 = 5
            X.0qQ.A0B(r14, r0)
            r0 = 6
            r6 = r17
            X.0qQ.A0B(r6, r0)
            r0 = 7
            X.0qQ.A0B(r15, r0)
            r0 = 8
            r1 = r25
            X.0qQ.A0B(r1, r0)
            r0 = 15
            r5 = r16
            X.0qQ.A0B(r5, r0)
            r0 = 18
            X.0qQ.A0B(r12, r0)
            r8.<init>()
            r8.A0B = r9
            r8.A0Z = r3
            r8.A0E = r14
            r8.A0H = r6
            r8.A0F = r15
            r8.A0N = r1
            r3 = r23
            r8.A0K = r3
            r0 = r22
            r8.A0b = r0
            r0 = r21
            r8.A0J = r0
            r8.A0D = r13
            r0 = r26
            r8.A0Q = r0
            r0 = r27
            r8.A08 = r0
            r8.A0G = r5
            r0 = r19
            r8.A0I = r0
            r8.A0C = r12
            r0 = r18
            r8.A0Y = r0
            r7 = r24
            r8.A0L = r7
            r0 = r29
            r8.A0O = r0
            r0 = r30
            r8.A0d = r0
            r0 = r31
            r8.A0U = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r8.A0S = r0
            r6 = 0
            if (r24 == 0) goto L_0x007c
            X.9Tg r6 = r7.A02
        L_0x007c:
            r8.A0M = r6
            r0 = 2131429458(0x7f0b0852, float:1.848059E38)
            android.view.View r0 = r10.findViewById(r0)
            X.0qQ.A07(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r8.A0X = r0
            X.9L5 r0 = new X.9L5
            r0.<init>(r8, r4)
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)
            r8.A0T = r0
            X.AYT r0 = new X.AYT
            r0.<init>(r8)
            r15.A0G(r0)
            X.804[] r0 = r3.A04()
            java.util.List r3 = X.03t.A0J(r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>(r3)
            r8.A0R = r0
            r0 = 0
            X.804 r0 = r8.A01(r0)
            r8.A04 = r0
            r0 = r28
            r8.A0P = r0
            android.content.Context r0 = r10.getContext()
            boolean r0 = X.0mk.A02(r0)
            r8.A0V = r0
            r14.CNi(r8)
            r1.A0T = r2
            androidx.fragment.app.FragmentActivity r4 = r11.requireActivity()
            X.2YN r1 = new X.2YN
            r1.<init>(r4)
            java.lang.Class<X.88B> r0 = X.AnonymousClass88B.class
            X.2YL r5 = r1.A00(r0)
            X.88B r5 = (X.AnonymousClass88B) r5
            r8.A0c = r5
            X.88C r0 = X.AnonymousClass88C.DOWNLOADING
            X.2Fj r3 = r5.A06
            r3.A0B(r0)
            r5.A00 = r7
            X.A8E r1 = X.A2Q.A00
            X.804 r0 = r8.A04
            java.lang.Integer r0 = r1.A00(r6, r0)
            r8.A07 = r0
            X.APm r0 = new X.APm
            r0.<init>(r8)
            r3.A06(r11, r0)
            X.05G r1 = r5.A02
            X.19B r0 = X.19B.A00
            androidx.lifecycle.CoroutineLiveData r1 = X.C226292g8.A00(r0, r1)
            X.APn r0 = new X.APn
            r0.<init>(r8)
            r1.A06(r11, r0)
            X.82v r0 = new X.82v
            r0.<init>(r12, r4)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r4)
            java.lang.Class<com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel> r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.class
            X.2YL r0 = r1.A00(r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r0
            r8.A0a = r0
            r8.A0W = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass88F.<init>(android.content.Context, android.view.View, X.4DH, com.instagram.common.session.UserSession, com.instagram.common.typedurl.ImageUrl, com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout, X.8Yz, X.87i, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.A69, X.A3m, X.81m, X.88E, X.AVM, X.9oE, X.82i, com.instagram.ui.widget.interactive.InteractiveDrawableContainer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void A07(AnonymousClass804 r3) {
        0qQ.A0B(r3, 0);
        Deque deque = this.A0R;
        if (!deque.contains(r3)) {
            throw new IllegalStateException("Check failed.");
        }
        while (!0qQ.A0K(deque.peekLast(), r3)) {
            A01(true);
        }
        A03(this, r3);
    }

    public final /* synthetic */ void CtK(Drawable drawable) {
    }

    public final /* synthetic */ void CtX() {
    }

    public final /* synthetic */ void CtY() {
    }

    public final /* synthetic */ void CuV(Drawable drawable, int i) {
    }

    public final /* synthetic */ void DAq(Drawable drawable, int i) {
    }

    public final /* synthetic */ void DAr(float f, float f2) {
    }

    public final /* synthetic */ void DAs(Drawable drawable) {
    }

    public final /* synthetic */ void DG3(MotionEvent motionEvent, float f, float f2, boolean z, boolean z2) {
    }

    public final /* synthetic */ void DP7(Drawable drawable, int i, float f, float f2) {
    }

    public final /* synthetic */ void DPH() {
    }

    public final void DhH(Drawable drawable, float f, float f2, float f3, float f4) {
        0qQ.A0B(drawable, 0);
        if (!this.A0d && drawable == this.A03) {
            A69 a69 = this.A0Y;
            AnonymousClass88A r1 = a69.A00.A1A;
            if (a69.A02 && r1 != null) {
                C378249Pb r0 = r1.A05;
                r0.EQQ(false);
                C294975nL.A05(new View[]{r0.A0D}, false);
            }
            C63708L3s l3s = a69.A01;
            if (l3s != null) {
                C315596kB.A08(new View[]{l3s.A00.A0D}, false);
            }
            C3497281m r12 = this.A0Z;
            r12.A00().CLF(false);
            r12.A00().CLt();
            r12.A00().CLH();
            r12.A00().CLJ();
        }
    }

    public final /* synthetic */ void DhL(float f, float f2, float f3, float f4, boolean z, boolean z2) {
    }

    public final /* synthetic */ void DlE(Drawable drawable, float f, float f2, float f3, float f4, int i) {
    }

    public final void EI6() {
    }

    public final void onResume() {
        AnonymousClass8JI r1;
        this.A0e = false;
        if (!this.A09) {
            C3498982i r0 = this.A0c.A00;
            if (r0 != null) {
                r1 = r0.A00;
            } else {
                r1 = null;
            }
            if (r1 != AnonymousClass8JI.REMIX) {
                return;
            }
        }
        this.A0N.A0y(this);
    }

    private final Rect A00(C369948va r8) {
        Context context = this.A0N.getContext();
        0qQ.A07(context);
        AnonymousClass81W r0 = ((NineSixteenLayoutConfigImpl) this.A0H).A0K;
        int width = r0.getWidth();
        int height = r0.getHeight();
        Drawable drawable = (Drawable) r8;
        boolean z = this.A0V;
        return C39822AAt.A01(context, this.A07, ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight()), width, height, z);
    }

    private final AnonymousClass804 A01(boolean z) {
        AnonymousClass804 r2;
        while (true) {
            Deque deque = this.A0R;
            Object poll = deque.poll();
            0qQ.A0A(poll);
            r2 = (AnonymousClass804) poll;
            deque.offer(r2);
            if (z) {
                break;
            }
            C357638Yz r1 = this.A0F;
            if (C394939yw.A00(r2, (Set) r1.A09.A00)) {
                0qQ.A0B(r2, 0);
                if (!(r2 instanceof AnonymousClass803) || !r1.A0U(C358088aL.A0l)) {
                    break;
                }
            }
        }
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02b1, code lost:
        if (java.lang.Float.valueOf(r15) != null) goto L_0x02b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.AnonymousClass88F r20, X.AnonymousClass804 r21) {
        /*
            r0 = r20
            X.8va r5 = r0.A03
            if (r5 == 0) goto L_0x02e6
            X.8Yz r1 = r0.A0F
            X.80m r1 = r1.A08
            java.lang.Object r1 = r1.A00
            boolean r2 = r1 instanceof X.AnonymousClass80O
            r6 = 1
            r1 = r21
            if (r2 == 0) goto L_0x0243
            boolean r4 = r1 instanceof X.C339987kV
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r3 = r0.A0N
            r2 = r5
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            if (r4 == 0) goto L_0x020b
            X.B3f r2 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A00(r2, r3)
            if (r2 == 0) goto L_0x0026
            X.9Qs r2 = (X.C378669Qs) r2
            r2.A0U = r6
        L_0x0026:
            r4 = r5
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            X.B3f r2 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A00(r4, r3)
            if (r2 == 0) goto L_0x0039
            X.9Qs r2 = (X.C378669Qs) r2
            r2.A0S = r6
            r2.A0R = r6
            r2.A0Q = r6
            r2.A0T = r6
        L_0x0039:
            r3.A0t(r4, r6)
        L_0x003c:
            X.A3m r7 = r0.A0I
            int r6 = r0.A00
            X.9oE r8 = r0.A0K
            java.lang.String r2 = r0.A0Q
            java.util.List r4 = r8.A03(r1, r2)
            r11 = 0
            X.80R r2 = r7.A00
            X.8BA r2 = r2.A0e
            X.6if r2 = r2.A1g
            java.lang.Object r2 = r2.get()
            X.8ME r2 = (X.AnonymousClass8ME) r2
            android.util.SparseArray r2 = r2.A0g
            java.lang.Object r2 = r2.get(r6)
            X.4nO r2 = (X.C273914nO) r2
            if (r2 != 0) goto L_0x0207
            java.lang.String r4 = "StickerOverlayController"
            java.lang.String r2 = "null reel asset in rotateRemixSticker"
            X.0kD.A0E(r4, r2, r11)
        L_0x0066:
            X.9X8 r12 = r0.A02
            X.804 r2 = r0.A04
            boolean r2 = X.0qQ.A0K(r2, r1)
            if (r2 != 0) goto L_0x0267
            r0.A04 = r1
            X.A8E r4 = X.A2Q.A00
            X.9Tg r2 = r0.A0M
            java.lang.Integer r2 = r4.A00(r2, r1)
            r0.A07 = r2
            r4 = r5
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            android.graphics.Rect r2 = r0.A00(r5)
            r4.setBounds(r2)
            boolean r2 = r8 instanceof X.C388679oD
            if (r2 == 0) goto L_0x01e6
            X.9oD r8 = (X.C388679oD) r8
            r7 = 0
            X.0qQ.A0B(r1, r7)
            boolean r2 = r1 instanceof X.C365058mS
            if (r2 == 0) goto L_0x009d
            X.B1T r6 = r8.A09
            X.8va r2 = r8.A02
            if (r2 == 0) goto L_0x025d
            r6.ALX(r2)
        L_0x009d:
            r8.A03 = r1
            com.instagram.common.session.UserSession r2 = r8.A06
            X.27r r10 = X.27p.A01(r2)
            X.804 r6 = r8.A03
            boolean r2 = r6 instanceof X.AnonymousClass803
            if (r2 == 0) goto L_0x01ce
            java.lang.String r9 = "side-by-side"
        L_0x00ad:
            X.29R r10 = r10.A09
            X.0wc r2 = r10.A01
            X.1Ln r6 = X.1Ln.A08(r2)
            X.0Aj r2 = r6.A00
            boolean r2 = r2.isSampled()
            if (r2 == 0) goto L_0x00ed
            java.lang.String r2 = "IG_CAMERA_CHANGE_REMIX_STICKER_TYPE"
            r6.A0t(r2)
            java.lang.String r2 = "CHANGE_REMIX_STICKER_TYPE"
            r6.A0r(r2)
            X.29R.A00(r6, r10)
            X.283 r2 = r10.A04
            X.28D r2 = r2.A09
            r6.A0b(r2)
            r6.A0T()
            X.JVj r2 = X.C59725JVj.PRE_CAPTURE
            r6.A0d(r2)
            X.0iw r2 = X.27x.A08
            java.lang.String r2 = r2.getModuleName()
            r6.A0n(r2)
            java.lang.String r2 = "remix_type"
            r6.A0R(r2, r9)
            X.AnonymousClass7TF.A18(r6)
            r6.Cgf()
        L_0x00ed:
            X.8va r2 = r8.A02
            if (r2 == 0) goto L_0x025d
            X.A6i r6 = r2.Bla()
            if (r6 == 0) goto L_0x00fd
            java.lang.String r2 = r8.A05()
            r6.A00 = r2
        L_0x00fd:
            X.8un r8 = r0.A06
            if (r8 == 0) goto L_0x01cb
            float r10 = r8.A01
            android.graphics.Rect r2 = r4.getBounds()
            float r2 = r2.exactCenterX()
            float r10 = r10 + r2
            float r9 = r8.A02
            android.graphics.Rect r2 = r4.getBounds()
            float r2 = r2.exactCenterY()
            float r9 = r9 + r2
            float r6 = r8.A06
            float r2 = r8.A05
            X.AD5 r8 = new X.AD5
            r8.<init>(r10, r9, r6, r2)
            r14 = 0
            r19 = 255(0xff, float:3.57E-43)
            X.ADA r13 = new X.ADA
            r15 = r14
            r16 = r14
            r17 = r14
            r18 = r14
            r20 = r7
            r21 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            android.content.Context r6 = r0.A0B
            r2 = 12
            float r2 = X.0nA.A04(r6, r2)
            int r2 = (int) r2
            X.A6j r6 = new X.A6j
            r6.<init>(r13, r8, r2, r7)
        L_0x0141:
            X.AVM r8 = r0.A0b
            X.8va r2 = r8.A02
            if (r2 == 0) goto L_0x0184
            X.804 r2 = r8.A04
            if (r2 == 0) goto L_0x019a
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019a
            X.A6j r6 = r8.A03
        L_0x0153:
            if (r6 == 0) goto L_0x0184
            X.AD5 r2 = r6.A03
            float r8 = r2.A01
            r2 = 1069547520(0x3fc00000, float:1.5)
            float r2 = r2 * r8
            X.B3f r7 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A00(r4, r3)
            if (r7 == 0) goto L_0x016e
            X.9Qs r7 = (X.C378669Qs) r7
            r7.A05 = r2
            r6 = 1065353216(0x3f800000, float:1.0)
            float r2 = r7.A04
            float r2 = r2 * r6
            r7.EjE(r2)
        L_0x016e:
            r2 = 1053609165(0x3ecccccd, float:0.4)
            float r8 = r8 * r2
            X.B3f r6 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A00(r4, r3)
            if (r6 == 0) goto L_0x0184
            X.9Qs r6 = (X.C378669Qs) r6
            r6.A06 = r8
            r4 = 1065353216(0x3f800000, float:1.0)
            float r2 = r6.A04
            float r2 = r2 * r4
            r6.EjE(r2)
        L_0x0184:
            java.util.HashSet r2 = r0.A0S
            java.util.Iterator r4 = r2.iterator()
        L_0x018a:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0267
            java.lang.Object r2 = r4.next()
            X.8WG r2 = (X.AnonymousClass8WG) r2
            r2.DcW(r1)
            goto L_0x018a
        L_0x019a:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r10 = r8.A0A
            int r2 = r8.A00
            X.8un r9 = r10.A0N(r2)
            if (r6 != 0) goto L_0x01c7
            X.AVJ r7 = r8.A09
            X.8un r6 = r8.A05
            int r18 = r10.getWidth()
            int r19 = r10.getHeight()
            X.8va r2 = r8.A02
            if (r2 == 0) goto L_0x025d
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            android.graphics.Rect r14 = r2.getBounds()
            X.0qQ.A07(r14)
            r17 = r9
            r13 = r7
            r15 = r1
            r16 = r6
            X.A6j r6 = r13.A00(r14, r15, r16, r17, r18, r19)
        L_0x01c7:
            X.AVM.A01(r8, r6, r1, r9)
            goto L_0x0153
        L_0x01cb:
            r6 = 0
            goto L_0x0141
        L_0x01ce:
            boolean r2 = r6 instanceof X.C339987kV
            if (r2 == 0) goto L_0x01d6
            java.lang.String r9 = "pic-in-pic"
            goto L_0x00ad
        L_0x01d6:
            boolean r2 = r6 instanceof X.C340007kX
            if (r2 == 0) goto L_0x01de
            java.lang.String r9 = "hidden"
            goto L_0x00ad
        L_0x01de:
            boolean r2 = r6 instanceof X.C365058mS
            if (r2 == 0) goto L_0x0258
            java.lang.String r9 = ""
            goto L_0x00ad
        L_0x01e6:
            X.9oC r8 = (X.C388669oC) r8
            r7 = 0
            X.0qQ.A0B(r1, r7)
            boolean r2 = r1 instanceof X.C339987kV
            if (r2 == 0) goto L_0x01fc
            X.80U r6 = r8.A00
            X.8TW r2 = new X.8TW
            r2.<init>()
            r6.E3H(r2)
            goto L_0x00fd
        L_0x01fc:
            boolean r2 = r1 instanceof X.C365058mS
            if (r2 == 0) goto L_0x00fd
            X.B1T r2 = r8.A01
            r2.ALX(r11)
            goto L_0x00fd
        L_0x0207:
            r2.A06 = r4
            goto L_0x0066
        L_0x020b:
            X.B3f r4 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A00(r2, r3)
            if (r4 == 0) goto L_0x0220
            r2 = 1065353216(0x3f800000, float:1.0)
            r4.EjE(r2)
            r2 = 0
            r4.EeI(r2)
            r4.EeJ(r2)
            r4.Ej2(r2)
        L_0x0220:
            r6 = r5
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            r4 = 0
            X.B3f r2 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A00(r6, r3)
            if (r2 == 0) goto L_0x022e
            X.9Qs r2 = (X.C378669Qs) r2
            r2.A0U = r4
        L_0x022e:
            X.B3f r2 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A00(r6, r3)
            if (r2 == 0) goto L_0x023e
            X.9Qs r2 = (X.C378669Qs) r2
            r2.A0S = r4
            r2.A0R = r4
            r2.A0Q = r4
            r2.A0T = r4
        L_0x023e:
            r3.A0t(r6, r4)
            goto L_0x003c
        L_0x0243:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r3 = r0.A0N
            r6 = r5
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            boolean r2 = r1 instanceof X.AnonymousClass803
            r4 = r2 ^ 1
            X.B3f r2 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A00(r6, r3)
            if (r2 == 0) goto L_0x003c
            X.9Qs r2 = (X.C378669Qs) r2
            r2.A0U = r4
            goto L_0x003c
        L_0x0258:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x025d:
            java.lang.String r0 = "thumbnailDrawable"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0267:
            if (r12 == 0) goto L_0x02d7
            r5.APn()
            X.87i r9 = r0.A0G
            boolean r2 = r9.A0B()
            if (r2 != 0) goto L_0x02c0
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            android.graphics.Rect r6 = r5.getBounds()
            X.0qQ.A07(r6)
            android.graphics.Rect r5 = r12.getBounds()
            X.0qQ.A07(r5)
            android.content.Context r10 = r0.A0B
            float r13 = r6.exactCenterX()
            int r2 = r5.width()
            float r2 = (float) r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            float r13 = r13 - r2
            float r14 = r6.exactCenterY()
            int r2 = r5.height()
            float r2 = (float) r2
            float r2 = r2 / r4
            float r14 = r14 - r2
            int r2 = r0.A00
            X.B3f r2 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A02(r3, r2)
            if (r2 == 0) goto L_0x02d4
            X.9Qs r2 = (X.C378669Qs) r2
            float r15 = r2.A04
            float r2 = r2.A00
            float r15 = r15 * r2
            java.lang.Float r2 = java.lang.Float.valueOf(r15)
            if (r2 == 0) goto L_0x02d4
        L_0x02b3:
            r20 = 0
            r19 = 15000(0x3a98, float:2.102E-41)
            r16 = 0
            r17 = r16
            r18 = r16
            r9.A09(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x02c0:
            X.88E r2 = r0.A0J
            if (r2 == 0) goto L_0x02e6
            X.81C r2 = r2.A00
            X.81E r2 = r2.A00()
            X.Ab8 r2 = (X.C40375Ab8) r2
            if (r2 == 0) goto L_0x02e6
            X.9X8 r0 = r0.A02
            r2.A00(r0, r1)
            return
        L_0x02d4:
            r15 = 1065353216(0x3f800000, float:1.0)
            goto L_0x02b3
        L_0x02d7:
            r5.CLg()
            X.87i r3 = r0.A0G
            boolean r2 = r3.A0B()
            if (r2 == 0) goto L_0x02c0
            r3.A06()
            goto L_0x02c0
        L_0x02e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass88F.A03(X.88F, X.804):void");
    }

    public static final void A04(AnonymousClass88F r8, boolean z) {
        C379289Tg r1;
        AnonymousClass804 r5 = r8.A04;
        if (r5 instanceof AnonymousClass803) {
            C3498982i r0 = r8.A0L;
            if (r0 != null) {
                r1 = r0.A02;
            } else {
                r1 = null;
            }
            if (r1 == C379289Tg.CLIPS && r8.A06 == null) {
                AVM avm = r8.A0b;
                0qQ.A0B(r5, 0);
                AnonymousClass804 r02 = avm.A04;
                if (r02 != null && r5.equals(r02) && !z) {
                    return;
                }
                if (avm.A02 == null || avm.A01 == null) {
                    0kD.A07("ig_remix", "Camera initialization called before setting needed parameters", (Throwable) null);
                    return;
                }
                InteractiveDrawableContainer interactiveDrawableContainer = avm.A0A;
                C369458un A0N2 = interactiveDrawableContainer.A0N(avm.A00);
                C39718A6j A002 = avm.A09.A00(new Rect(), r5, (C369458un) null, A0N2, interactiveDrawableContainer.getWidth(), interactiveDrawableContainer.getHeight());
                if (A002 != null) {
                    AVM.A01(avm, A002, r5, A0N2);
                }
            }
        }
    }

    public static final boolean A05(AnonymousClass88F r1) {
        AnonymousClass8JI r12;
        if (r1.A0e) {
            return false;
        }
        if (r1.A09) {
            return true;
        }
        C3498982i r0 = r1.A0c.A00;
        if (r0 != null) {
            r12 = r0.A00;
        } else {
            r12 = null;
        }
        if (r12 == AnonymousClass8JI.REMIX) {
            return true;
        }
        return false;
    }

    public final void A06() {
        C3498982i r3 = this.A0L;
        if (r3 != null) {
            boolean A5p = r3.A03.A5p();
            Context context = this.A0B;
            int i = 2131974290;
            if (A5p) {
                i = 2131974288;
            }
            String string = context.getString(i, new Object[]{r3.A05.getUsername()});
            0qQ.A0A(string);
            C59689JTv.A09(context, string);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r7.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004b, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0130, code lost:
        if (java.lang.Float.valueOf(r12) != null) goto L_0x0132;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.AnonymousClass88C r27) {
        /*
            r26 = this;
            r0 = r26
            X.88B r2 = r0.A0c
            boolean r1 = r2.A02()
            if (r1 != 0) goto L_0x022e
            X.88C r1 = X.AnonymousClass88C.SUCCESS
            r3 = r27
            if (r3 != r1) goto L_0x022e
            java.io.File r8 = r2.A01     // Catch:{ IllegalArgumentException -> 0x0226 }
            if (r8 == 0) goto L_0x022e
            boolean r1 = r0.A0A     // Catch:{ IllegalArgumentException -> 0x0226 }
            if (r1 != 0) goto L_0x022e
            boolean r1 = A05(r0)     // Catch:{ IllegalArgumentException -> 0x0226 }
            if (r1 == 0) goto L_0x022e
            X.JtC r6 = X.Q0Y.A01(r8)     // Catch:{ IllegalArgumentException -> 0x01ea }
            r2 = 1
            r9 = 0
            r4 = 0
            java.lang.String r1 = r8.getPath()     // Catch:{ Exception -> 0x004d }
            X.0qQ.A07(r1)     // Catch:{ Exception -> 0x004d }
            android.media.MediaExtractor r7 = new android.media.MediaExtractor     // Catch:{ Exception -> 0x004d }
            r7.<init>()     // Catch:{ Exception -> 0x004d }
            r7.setDataSource(r1)     // Catch:{ Exception -> 0x004d }
            int r3 = X.Ahv.A00(r7)     // Catch:{ all -> 0x0040 }
            r1 = 0
            if (r3 <= 0) goto L_0x003c
            r1 = 1
        L_0x003c:
            r7.release()     // Catch:{ Exception -> 0x004d }
            goto L_0x004c
        L_0x0040:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r3 = move-exception
            r7.release()     // Catch:{ all -> 0x0047 }
            goto L_0x004b
        L_0x0047:
            r1 = move-exception
            X.2Og.A01(r5, r1)     // Catch:{ Exception -> 0x004d }
        L_0x004b:
            throw r3     // Catch:{ Exception -> 0x004d }
        L_0x004c:
            r9 = r1
        L_0x004d:
            if (r9 != 0) goto L_0x005d
            X.A3m r1 = r0.A0I     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.80R r1 = r1.A00     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.85o r3 = r1.A0j     // Catch:{ IllegalArgumentException -> 0x0226 }
            if (r3 == 0) goto L_0x005d
            r3.A0B = r2     // Catch:{ IllegalArgumentException -> 0x0226 }
            r1 = 0
            X.C3506485o.A00(r3, r1)     // Catch:{ IllegalArgumentException -> 0x0226 }
        L_0x005d:
            r3 = 3
            r1 = 0
            com.instagram.common.gallery.Medium r15 = X.C282665Eg.A03(r8, r3, r1)     // Catch:{ IllegalArgumentException -> 0x0226 }
            java.lang.String r3 = r0.A0Q     // Catch:{ IllegalArgumentException -> 0x0226 }
            r15.A0Y = r3     // Catch:{ IllegalArgumentException -> 0x0226 }
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r3 = r0.A0N     // Catch:{ IllegalArgumentException -> 0x0226 }
            android.content.Context r7 = r3.getContext()     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.0qQ.A07(r7)     // Catch:{ IllegalArgumentException -> 0x0226 }
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r5 = r0.A0H     // Catch:{ IllegalArgumentException -> 0x0226 }
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r5 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r5     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.81W r5 = r5.A0K     // Catch:{ IllegalArgumentException -> 0x0226 }
            int r10 = r5.getWidth()     // Catch:{ IllegalArgumentException -> 0x0226 }
            int r11 = r5.getHeight()     // Catch:{ IllegalArgumentException -> 0x0226 }
            int r5 = r6.A01     // Catch:{ IllegalArgumentException -> 0x0226 }
            float r9 = (float) r5     // Catch:{ IllegalArgumentException -> 0x0226 }
            int r5 = r6.A00     // Catch:{ IllegalArgumentException -> 0x0226 }
            float r5 = (float) r5     // Catch:{ IllegalArgumentException -> 0x0226 }
            float r9 = r9 / r5
            boolean r5 = r0.A0V     // Catch:{ IllegalArgumentException -> 0x0226 }
            java.lang.Integer r8 = r0.A07     // Catch:{ IllegalArgumentException -> 0x0226 }
            r12 = r5
            android.graphics.Rect r5 = X.C39822AAt.A01(r7, r8, r9, r10, r11, r12)     // Catch:{ IllegalArgumentException -> 0x0226 }
            com.instagram.common.session.UserSession r6 = r0.A0C     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.9sQ r17 = X.C391149sQ.REEL_REMIX     // Catch:{ IllegalArgumentException -> 0x0226 }
            int r21 = r5.width()     // Catch:{ IllegalArgumentException -> 0x0226 }
            int r22 = r5.height()     // Catch:{ IllegalArgumentException -> 0x0226 }
            r5 = 0
            r10 = 15
            X.9Hy r14 = new X.9Hy     // Catch:{ IllegalArgumentException -> 0x0226 }
            r7 = r14
            r8 = r5
            r9 = r5
            r11 = r5
            r12 = r2
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.9sL r18 = X.C391099sL.NOT_CLIPS     // Catch:{ IllegalArgumentException -> 0x0226 }
            r23 = -1
            r24 = -2147483648(0xffffffff80000000, float:-0.0)
            X.9X8 r13 = new X.9X8     // Catch:{ IllegalArgumentException -> 0x0226 }
            r25 = r1
            r19 = r4
            r20 = r5
            r16 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ IllegalArgumentException -> 0x0226 }
            r0.A02 = r13     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.88E r7 = r0.A0J     // Catch:{ IllegalArgumentException -> 0x0226 }
            if (r7 == 0) goto L_0x00d2
            X.81C r7 = r7.A00     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.81E r9 = r7.A00()     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.Ab8 r9 = (X.C40375Ab8) r9     // Catch:{ IllegalArgumentException -> 0x0226 }
            if (r9 == 0) goto L_0x00d2
            X.9X8 r8 = r0.A02     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.804 r7 = r0.A04     // Catch:{ IllegalArgumentException -> 0x0226 }
            r9.A00(r8, r7)     // Catch:{ IllegalArgumentException -> 0x0226 }
        L_0x00d2:
            android.content.Context r8 = r0.A0B     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.9Tg r7 = r0.A0M     // Catch:{ IllegalArgumentException -> 0x0226 }
            if (r7 == 0) goto L_0x00e2
            int r7 = r7.ordinal()     // Catch:{ IllegalArgumentException -> 0x0226 }
            if (r7 == r1) goto L_0x00e2
            if (r7 == r2) goto L_0x00e2
            goto L_0x0220
        L_0x00e2:
            r9 = 2131165231(0x7f07002f, float:1.7944673E38)
            android.content.res.Resources r7 = r8.getResources()     // Catch:{ IllegalArgumentException -> 0x0226 }
            int r7 = r7.getDimensionPixelSize(r9)     // Catch:{ IllegalArgumentException -> 0x0226 }
            float r7 = (float) r7     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.9XM r10 = new X.9XM     // Catch:{ IllegalArgumentException -> 0x0226 }
            r10.<init>(r8, r7)     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.9oE r9 = r0.A0K     // Catch:{ IllegalArgumentException -> 0x0226 }
            java.lang.String r7 = r0.A0O     // Catch:{ IllegalArgumentException -> 0x0226 }
            r11 = r9
            r12 = r8
            r14 = r10
            r15 = r6
            r16 = r7
            X.8va r10 = r11.A01(r12, r13, r14, r15, r16)     // Catch:{ IllegalArgumentException -> 0x0226 }
            r0.A03 = r10     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.804 r6 = r0.A04     // Catch:{ IllegalArgumentException -> 0x0226 }
            A02(r0, r10, r6)     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.804 r6 = r0.A05     // Catch:{ IllegalArgumentException -> 0x0226 }
            if (r6 == 0) goto L_0x0111
            A03(r0, r6)     // Catch:{ IllegalArgumentException -> 0x0226 }
            r0.A05 = r4     // Catch:{ IllegalArgumentException -> 0x0226 }
        L_0x0111:
            X.8un r7 = r0.A06     // Catch:{ IllegalArgumentException -> 0x0226 }
            if (r7 == 0) goto L_0x011d
            r6 = r10
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6     // Catch:{ IllegalArgumentException -> 0x0226 }
            r3.A0r(r6, r7)     // Catch:{ IllegalArgumentException -> 0x0226 }
            r0.A06 = r4     // Catch:{ IllegalArgumentException -> 0x0226 }
        L_0x011d:
            int r6 = r0.A00     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.B3f r3 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A02(r3, r6)     // Catch:{ IllegalArgumentException -> 0x0226 }
            if (r3 == 0) goto L_0x01e5
            X.9Qs r3 = (X.C378669Qs) r3     // Catch:{ IllegalArgumentException -> 0x0226 }
            float r12 = r3.A04     // Catch:{ IllegalArgumentException -> 0x0226 }
            float r3 = r3.A00     // Catch:{ IllegalArgumentException -> 0x0226 }
            float r12 = r12 * r3
            java.lang.Float r3 = java.lang.Float.valueOf(r12)     // Catch:{ IllegalArgumentException -> 0x0226 }
            if (r3 == 0) goto L_0x01e5
        L_0x0132:
            android.graphics.Rect r3 = r13.getBounds()     // Catch:{ IllegalArgumentException -> 0x0226 }
            int r3 = r3.left     // Catch:{ IllegalArgumentException -> 0x0226 }
            float r11 = (float) r3     // Catch:{ IllegalArgumentException -> 0x0226 }
            android.graphics.Rect r3 = r13.getBounds()     // Catch:{ IllegalArgumentException -> 0x0226 }
            int r3 = r3.top     // Catch:{ IllegalArgumentException -> 0x0226 }
            float r7 = (float) r3     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.9Hy r6 = r13.A03     // Catch:{ IllegalArgumentException -> 0x0226 }
            boolean r3 = r13.A06     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.A80 r9 = new X.A80     // Catch:{ IllegalArgumentException -> 0x0226 }
            r14 = r9
            r15 = r4
            r16 = r6
            r17 = r11
            r18 = r7
            r19 = r12
            r21 = r5
            r22 = r5
            r23 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ IllegalArgumentException -> 0x0226 }
            com.instagram.common.gallery.Medium r7 = r13.A0B     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.8Yz r3 = r0.A0F     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.80m r3 = r3.A08     // Catch:{ IllegalArgumentException -> 0x0226 }
            java.lang.Object r3 = r3.A00     // Catch:{ IllegalArgumentException -> 0x0226 }
            boolean r3 = r3 instanceof X.AnonymousClass80O     // Catch:{ IllegalArgumentException -> 0x0226 }
            if (r3 == 0) goto L_0x01d6
            X.0qQ.A0B(r7, r1)     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.A6d r6 = new X.A6d     // Catch:{ IllegalArgumentException -> 0x0226 }
            r6.<init>(r7, r5, r1, r1)     // Catch:{ IllegalArgumentException -> 0x0226 }
        L_0x016d:
            X.8va r3 = r0.A03     // Catch:{ IllegalArgumentException -> 0x0226 }
            if (r3 == 0) goto L_0x0174
            r3.APn()     // Catch:{ IllegalArgumentException -> 0x0226 }
        L_0x0174:
            X.87i r7 = r0.A0G     // Catch:{ IllegalArgumentException -> 0x0226 }
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10     // Catch:{ IllegalArgumentException -> 0x0226 }
            r7.A08 = r10     // Catch:{ IllegalArgumentException -> 0x0226 }
            r7.A09 = r13     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.85o r4 = r7.A0R     // Catch:{ IllegalArgumentException -> 0x0226 }
            boolean r3 = r4.A04     // Catch:{ IllegalArgumentException -> 0x0226 }
            if (r3 == r2) goto L_0x0187
            r4.A04 = r2     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.C3506485o.A00(r4, r1)     // Catch:{ IllegalArgumentException -> 0x0226 }
        L_0x0187:
            java.lang.Integer r3 = r4.A01()     // Catch:{ IllegalArgumentException -> 0x0226 }
            r7.Cwo(r3, r1)     // Catch:{ IllegalArgumentException -> 0x0226 }
            float r3 = r6.A00     // Catch:{ IllegalArgumentException -> 0x0226 }
            r13.A00 = r3     // Catch:{ IllegalArgumentException -> 0x0226 }
            r13.A05 = r7     // Catch:{ IllegalArgumentException -> 0x0226 }
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r5 = r7.A0T     // Catch:{ IllegalArgumentException -> 0x0226 }
            android.view.ViewGroup$LayoutParams r10 = r5.getLayoutParams()     // Catch:{ IllegalArgumentException -> 0x0226 }
            if (r10 == 0) goto L_0x01d3
            android.graphics.Rect r3 = r13.getBounds()     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.0qQ.A07(r3)     // Catch:{ IllegalArgumentException -> 0x0226 }
            int r4 = r3.width()     // Catch:{ IllegalArgumentException -> 0x0226 }
            int r3 = r3.height()     // Catch:{ IllegalArgumentException -> 0x0226 }
            r10.width = r4     // Catch:{ IllegalArgumentException -> 0x0226 }
            r10.height = r3     // Catch:{ IllegalArgumentException -> 0x0226 }
            r5.setLayoutParams(r10)     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.C3510387i.A04(r7, r9)     // Catch:{ IllegalArgumentException -> 0x0226 }
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r3 = r7.A0U     // Catch:{ IllegalArgumentException -> 0x0226 }
            r3.setVisibility(r1)     // Catch:{ IllegalArgumentException -> 0x0226 }
            r5.setVisibility(r1)     // Catch:{ IllegalArgumentException -> 0x0226 }
            android.view.TextureView r1 = r7.A0G     // Catch:{ IllegalArgumentException -> 0x0226 }
            r3 = 8
            r1.setVisibility(r3)     // Catch:{ IllegalArgumentException -> 0x0226 }
            android.widget.TextView r1 = r7.A0I     // Catch:{ IllegalArgumentException -> 0x0226 }
            r1.setVisibility(r3)     // Catch:{ IllegalArgumentException -> 0x0226 }
            android.view.View r1 = r7.A0H     // Catch:{ IllegalArgumentException -> 0x0226 }
            r1.setVisibility(r3)     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.87n r1 = r7.A0P     // Catch:{ IllegalArgumentException -> 0x0226 }
            r1.A03(r8, r6, r5)     // Catch:{ IllegalArgumentException -> 0x0226 }
        L_0x01d3:
            r0.A0A = r2     // Catch:{ IllegalArgumentException -> 0x0226 }
            goto L_0x01e9
        L_0x01d6:
            X.87i r3 = r0.A0G     // Catch:{ IllegalArgumentException -> 0x0226 }
            float r4 = r3.A04     // Catch:{ IllegalArgumentException -> 0x0226 }
            X.0qQ.A0B(r7, r1)     // Catch:{ IllegalArgumentException -> 0x0226 }
            r3 = 15000(0x3a98, float:2.102E-41)
            X.A6d r6 = new X.A6d     // Catch:{ IllegalArgumentException -> 0x0226 }
            r6.<init>(r7, r4, r3, r1)     // Catch:{ IllegalArgumentException -> 0x0226 }
            goto L_0x016d
        L_0x01e5:
            r12 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0132
        L_0x01e9:
            return
        L_0x01ea:
            r7 = move-exception
            java.lang.String r6 = r0.A08     // Catch:{ IllegalArgumentException -> 0x0226 }
            if (r6 != 0) goto L_0x01f1
            java.lang.String r6 = "NULL"
        L_0x01f1:
            java.lang.String r5 = "Failed to get thumbnail metadata.\nFile path: "
            java.lang.String r4 = r8.getPath()     // Catch:{ IllegalArgumentException -> 0x0226 }
            java.lang.String r3 = "\nFile exists: "
            boolean r2 = r8.exists()     // Catch:{ IllegalArgumentException -> 0x0226 }
            java.lang.String r1 = "\nOriginal video url: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0226 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0226 }
            r0.append(r5)     // Catch:{ IllegalArgumentException -> 0x0226 }
            r0.append(r4)     // Catch:{ IllegalArgumentException -> 0x0226 }
            r0.append(r3)     // Catch:{ IllegalArgumentException -> 0x0226 }
            r0.append(r2)     // Catch:{ IllegalArgumentException -> 0x0226 }
            r0.append(r1)     // Catch:{ IllegalArgumentException -> 0x0226 }
            r0.append(r6)     // Catch:{ IllegalArgumentException -> 0x0226 }
            java.lang.String r1 = r0.toString()     // Catch:{ IllegalArgumentException -> 0x0226 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0226 }
            r0.<init>(r1, r7)     // Catch:{ IllegalArgumentException -> 0x0226 }
            goto L_0x0225
        L_0x0220:
            X.Wub r0 = new X.Wub     // Catch:{ IllegalArgumentException -> 0x0226 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0226 }
        L_0x0225:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0226 }
        L_0x0226:
            r2 = move-exception
            java.lang.String r1 = "VisualReplyThumbnailController"
            java.lang.String r0 = "Could not retrieve video metadata"
            X.0KC.A0F(r1, r0, r2)
        L_0x022e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass88F.A08(X.88C):void");
    }

    public final boolean CKM() {
        if (this.A03 != null) {
            return true;
        }
        return false;
    }

    public final boolean CKR(boolean z, boolean z2) {
        if (this.A03 != null) {
            return true;
        }
        return false;
    }

    public final void DHa(float f, float f2) {
        InteractiveDrawableContainer interactiveDrawableContainer = this.A0N;
        boolean z = false;
        if (((double) f) < 0.01d) {
            z = true;
        }
        interactiveDrawableContainer.A0S = z;
    }

    public final void DdI(Drawable drawable, int i, boolean z) {
        if (this.A00 == i) {
            this.A03 = null;
        }
    }

    public final void DlC(Drawable drawable, int i, float f, float f2) {
        if (i == this.A00 && !this.A0d && !this.A0U) {
            C357638Yz r1 = this.A0F;
            if (!(r1.A08.A00 instanceof AnonymousClass80O)) {
                AnonymousClass804 r0 = this.A04;
                0qQ.A0B(r0, 0);
                if (!(r0 instanceof AnonymousClass803) || !r1.A0U(C358088aL.A0l)) {
                    if (this.A04 instanceof C339987kV) {
                        0xa r2 = 1Au.A00(this.A0C).A01;
                        String A002 = AnonymousClass000.A00(3236);
                        if (!r2.getBoolean(A002, false)) {
                            0xY AR4 = r2.AR4();
                            AR4.E5T(A002, true);
                            AR4.apply();
                        }
                    }
                    A03(this, A01(false));
                }
            }
        }
    }

    public final void DsQ(float f, float f2) {
        C369948va r1 = this.A03;
        if (r1 != null) {
            r1.CLf(true);
        }
    }

    public final void Dsb() {
        C369458un r3;
        if (!this.A0d) {
            A69 a69 = this.A0Y;
            C369948va r1 = this.A03;
            if (r1 != null) {
                r3 = this.A0N.A0O((Drawable) r1);
            } else {
                r3 = null;
            }
            AnonymousClass80R r2 = a69.A00;
            AnonymousClass88A r12 = r2.A1A;
            if (!a69.A02 || r12 == null) {
                C63708L3s l3s = a69.A01;
                if (l3s != null) {
                    C315596kB.A08(new View[]{l3s.A00.A0D}, false);
                } else if (r3 != null) {
                    r2.A24.A04.A0B(r3);
                }
            } else {
                C378249Pb r13 = r12.A05;
                r13.EQQ(true);
                C294975nL.A05(new View[]{r13.A0D}, false);
            }
            if (this.A09) {
                C3497281m r22 = this.A0Z;
                r22.A00().Eu6(false);
                r22.A00().EuA();
                r22.A00().EuE();
                if (!this.A0I.A00.A1r.A00().isVisible()) {
                    r22.A00().EvW();
                }
            }
        }
    }

    public final void EF8(Canvas canvas, int i, boolean z, boolean z2) {
        C369948va r1 = this.A03;
        if (r1 != null) {
            r1.CLf(false);
        }
    }

    public final boolean isVisible() {
        return this.A0W;
    }

    public final void onPause() {
        this.A0N.A0z(this);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C369948va r1 = this.A03;
        if (r1 == null) {
            return false;
        }
        r1.CLf(true);
        return false;
    }

    public static final void A02(AnonymousClass88F r7, C369948va r8, AnonymousClass804 r9) {
        boolean z;
        String str;
        1Xj r0;
        if (A05(r7)) {
            r7.A0f = true;
            float f = 1.0f;
            if (!(r7.A0F.A08.A00 instanceof AnonymousClass80O)) {
                if (r9 instanceof C339987kV) {
                    f = ((C339987kV) r9).A00;
                } else if (!(r9 instanceof AnonymousClass803)) {
                    if (r9 instanceof C340007kX) {
                        f = 0.0f;
                    } else {
                        0kD.A07("ig_remix", "Display mode when adding thumbnail is not THUMBNAIL", (Throwable) null);
                    }
                }
            }
            C3498982i r6 = r7.A0L;
            if (r6 == null || (r0 = r6.A03) == null) {
                z = false;
            } else {
                z = r0.CeS();
            }
            C39890ADo aDo = new C39890ADo();
            aDo.A0A = AnonymousClass05K.A01;
            int i = -1;
            if (z) {
                i = -3;
            }
            aDo.A05 = i;
            aDo.A06 = new C16336Ut6(r7.A00(r8));
            aDo.A00 = 1.5f * f;
            aDo.A01 = 0.4f * f;
            aDo.A0F = true;
            aDo.A0Q = true;
            aDo.A04 = f;
            aDo.A0C = "VisualReplyThumbnailController";
            Context context = r7.A0N.getContext();
            0qQ.A07(context);
            if (r6 != null) {
                str = context.getString(2131974286, new Object[]{r6.A05.getUsername()});
            } else {
                str = null;
            }
            aDo.A0D = str;
            aDo.A0Q = false;
            aDo.A0M = false;
            aDo.A0J = false;
            aDo.A0L = false;
            aDo.A0K = false;
            C388689oE r2 = r7.A0K;
            if (r2 instanceof C388679oD) {
                aDo.A08 = (C388679oD) r2;
            }
            C310416b1 r62 = new C310416b1(aDo);
            C39646A3m a3m = r7.A0I;
            List A032 = r2.A03(r7.A04, r7.A0Q);
            r7.A00 = ((AnonymousClass8ME) a3m.A00.A0e.A1g.get()).A0z((Drawable) r8, r62, (String) null, A032);
            if (!r7.A0d && !r7.A0U) {
                r8.APm();
            }
            AVM avm = r7.A0b;
            int i2 = r7.A00;
            avm.A02 = r8;
            avm.A00 = i2;
            A04(r7, false);
        }
    }

    public final /* synthetic */ boolean DHo(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        return false;
    }
}
