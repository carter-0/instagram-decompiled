package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.precapture.PreCaptureButtonManagerIntf$State;
import com.instagram.reels.common.ui.StoryTypeSelectorView;
import com.instagram.ui.widget.colourwheel.ColourWheelView;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.util.Arrays;

/* renamed from: X.81s  reason: invalid class name and case insensitive filesystem */
public final class C3497781s implements C3497881t {
    public static final C71392co A0p = C71392co.A03(2.0d, 20.0d);
    public int A00 = -1;
    public View A01;
    public C3498081w A02;
    public View A03;
    public View A04;
    public View A05;
    public FrameLayout A06;
    public C3498081w A07;
    public C3498081w A08;
    public C338917ik A09;
    public AnonymousClass8GE A0A;
    public AnonymousClass8E2 A0B;
    public AnonymousClass8E0 A0C;
    public C387399m9 A0D;
    public ColourWheelView A0E;
    public final int A0F;
    public final int A0G;
    public final Activity A0H;
    public final View A0I;
    public final View A0J;
    public final ViewGroup A0K;
    public final ViewGroup A0L;
    public final ViewGroup A0M;
    public final AnonymousClass2Fj A0N;
    public final C3498081w A0O;
    public final C3498081w A0P;
    public final 1Av A0Q;
    public final boolean A0R;
    public final Rect A0S = new Rect();
    public final View A0T;
    public final View A0U;
    public final View A0V;
    public final ViewGroup A0W;
    public final ViewGroup A0X;
    public final ViewGroup A0Y;
    public final ViewStub A0Z;
    public final ViewStub A0a;
    public final ViewStub A0b;
    public final ViewStub A0c;
    public final ViewStub A0d;
    public final ViewStub A0e;
    public final ViewStub A0f;
    public final ImageView A0g;
    public final 2cs A0h;
    public final UserSession A0i;
    public final C252063oV A0j;
    public final C3498081w A0k;
    public final C3498081w A0l;
    public final C3498081w A0m;
    public final ShutterButton A0n;
    public final boolean A0o;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        if (r6 == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r6 == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(boolean r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r3 = this;
            r2 = 0
            if (r5 == 0) goto L_0x0012
            if (r4 != 0) goto L_0x0008
            r1 = 1
            if (r6 != 0) goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            X.7ik r0 = r3.A09
            X.81w[] r0 = new X.C3498081w[]{r0}
            X.C359158c6.A00(r0, r1)
        L_0x0012:
            if (r4 != 0) goto L_0x0017
            r1 = 1
            if (r6 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            X.81w r0 = r3.A07
            X.81w[] r0 = new X.C3498081w[]{r0}
            X.C359158c6.A00(r0, r1)
            android.view.View r1 = r3.A0V
            if (r1 == 0) goto L_0x002c
            r0 = 4
            if (r4 == 0) goto L_0x0029
            r0 = 0
        L_0x0029:
            r1.setVisibility(r0)
        L_0x002c:
            if (r8 == 0) goto L_0x0037
            android.view.ViewGroup r1 = r3.A0K
            r0 = 0
            if (r4 == 0) goto L_0x0034
            r0 = 4
        L_0x0034:
            r1.setVisibility(r0)
        L_0x0037:
            if (r7 == 0) goto L_0x0041
            android.view.ViewGroup r0 = r3.A0M
            if (r4 == 0) goto L_0x003e
            r2 = 4
        L_0x003e:
            r0.setVisibility(r2)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3497781s.A01(boolean, boolean, boolean, boolean, boolean):void");
    }

    private void A02(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ((C3497981v) this.A0m).Eql(z3, false);
        ((C3497981v) this.A0P).Eql(z2, false);
        ViewGroup viewGroup = this.A0L;
        int i = 8;
        if (z4) {
            i = 0;
        }
        viewGroup.setVisibility(i);
        A00(z5, 1.0f);
        C3498081w r0 = this.A02;
        if (r0 != null && ((C3497981v) r0).getView().getVisibility() == 0) {
            CLZ();
        }
        AnonymousClass8E0 r02 = this.A0C;
        if (r02 != null) {
            r02.Eql(false, false);
        }
        AnonymousClass8E2 r03 = this.A0B;
        if (r03 != null) {
            r03.Eql(false, false);
        }
        C3498081w[] r04 = {this.A09};
        if (z) {
            C359158c6.A00(r04, false);
        } else {
            C359158c6.A01((C3498081w[]) Arrays.copyOf(r04, 1), false, false);
        }
        C359158c6.A00(new C3498081w[]{this.A07}, false);
    }

    private boolean A03(View view, int i, int i2, boolean z) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        Rect rect = this.A0S;
        if (z) {
            view.getHitRect(rect);
        } else {
            view.getGlobalVisibleRect(rect);
        }
        return rect.contains(i, i2);
    }

    public final /* bridge */ /* synthetic */ Parcelable ANX() {
        A01(true, true, false, true, true);
        return null;
    }

    public final void CLO() {
        FM9(false, false, false, false, false, true, false, true, true, false, true, false, false, false, false, true, true, true, false, false, false);
        Ety(false);
    }

    public final void FMB(boolean z) {
        View[] viewArr = {this.A0J};
        if (z) {
            C294975nL.A04((C295005nO) null, viewArr, true);
        } else {
            C294975nL.A05(viewArr, true);
        }
    }

    public final void FME() {
        A02(false, false, false, false, false);
    }

    public final void FMF(boolean z, boolean z2, boolean z3) {
        A02(z, true, z2, true, true);
    }

    public final void FMG() {
        A02(false, false, false, false, false);
    }

    public final void FMI(boolean z, boolean z2, boolean z3, boolean z4) {
        A01(false, z, z2, z3, z4);
    }

    public final void FMJ(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        A02(z, false, z4, z5, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003a, code lost:
        if (r0.A00 != 3) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3497781s(android.view.View r20, X.AnonymousClass80D r21) {
        /*
            r19 = this;
            r3 = r19
            r3.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.A0S = r0
            r0 = -1
            r3.A00 = r0
            X.2cp r0 = X.C61340me.A00()
            X.2cs r1 = r0.A02()
            X.2co r0 = A0p
            r1.A09(r0)
            X.81u r0 = new X.81u
            r0.<init>(r3)
            r1.A0A(r0)
            r3.A0h = r1
            X.2Fj r17 = new X.2Fj
            r17.<init>()
            r0 = r17
            r3.A0N = r0
            r8 = r21
            com.instagram.model.direct.camera.DirectCameraViewModel r0 = r8.A1I
            if (r0 == 0) goto L_0x003c
            int r1 = r0.A00
            r0 = 3
            r16 = 1
            if (r1 == r0) goto L_0x003e
        L_0x003c:
            r16 = 0
        L_0x003e:
            android.app.Activity r0 = r8.A05
            r3.A0H = r0
            com.instagram.common.session.UserSession r0 = r8.A0S
            r18 = r0
            r3.A0i = r0
            X.1Av r0 = X.1Au.A00(r18)
            r3.A0Q = r0
            r0 = 2131438063(0x7f0b29ef, float:1.8498042E38)
            r1 = r20
            android.view.View r7 = r1.requireViewById(r0)
            r3.A0I = r7
            r0 = 2131438067(0x7f0b29f3, float:1.849805E38)
            android.view.View r1 = r1.requireViewById(r0)
            r0 = 2131435179(0x7f0b1eab, float:1.8492193E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.A0W = r0
            r0 = 2131432251(0x7f0b133b, float:1.8486254E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.A0X = r0
            r0 = 2131430179(0x7f0b0b23, float:1.8482052E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r3.A0Z = r0
            r0 = 2131438062(0x7f0b29ee, float:1.849804E38)
            android.view.View r12 = r7.requireViewById(r0)
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            r3.A0K = r12
            r0 = 2131438064(0x7f0b29f0, float:1.8498044E38)
            android.view.View r4 = r7.requireViewById(r0)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r3.A0M = r4
            r0 = 2131429472(0x7f0b0860, float:1.8480618E38)
            android.view.View r5 = r7.requireViewById(r0)
            r0 = 2131429473(0x7f0b0861, float:1.848062E38)
            android.view.View r0 = r7.requireViewById(r0)
            r3.A0J = r0
            r0 = 2131429471(0x7f0b085f, float:1.8480616E38)
            android.view.View r0 = r5.requireViewById(r0)
            com.instagram.ui.widget.shutterbutton.ShutterButton r0 = (com.instagram.ui.widget.shutterbutton.ShutterButton) r0
            r3.A0n = r0
            boolean r13 = r8.A3m
            r3.A0o = r13
            r0 = 2131442376(0x7f0b3ac8, float:1.850679E38)
            android.view.View r0 = r5.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r3.A0f = r0
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131165263(0x7f07004f, float:1.7944738E38)
            int r2 = r1.getDimensionPixelSize(r0)
            r0 = 2131165296(0x7f070070, float:1.7944805E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r2 = r2 - r0
            X.0nA.A0V(r5, r2)
            r0 = 2131440853(0x7f0b34d5, float:1.8503701E38)
            android.view.View r6 = r7.requireViewById(r0)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r3.A0Y = r6
            r0 = 2131439799(0x7f0b30b7, float:1.8501563E38)
            android.view.View r2 = r7.requireViewById(r0)
            X.81v r0 = new X.81v
            r0.<init>(r2)
            r3.A0l = r0
            r0 = 2131429433(0x7f0b0839, float:1.8480539E38)
            android.view.View r2 = r7.requireViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r3.A0g = r2
            boolean r0 = X.AnonymousClass81x.A00(r18)
            r11 = 8
            if (r0 == 0) goto L_0x0106
            r2.setVisibility(r11)
        L_0x0106:
            X.81v r0 = new X.81v
            r0.<init>(r2)
            r3.A0O = r0
            r0 = 2131429444(0x7f0b0844, float:1.848056E38)
            android.view.View r0 = r7.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r3.A0d = r0
            r0 = 2131432945(0x7f0b15f1, float:1.8487662E38)
            android.view.View r10 = r7.requireViewById(r0)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r3.A0L = r10
            r0 = 2131428161(0x7f0b0341, float:1.8477959E38)
            android.view.View r0 = r7.requireViewById(r0)
            X.81v r9 = new X.81v
            r9.<init>(r0)
            r3.A0k = r9
            r0 = 2131429470(0x7f0b085e, float:1.8480614E38)
            android.view.View r15 = r7.requireViewById(r0)
            android.view.ViewStub r15 = (android.view.ViewStub) r15
            r3.A0e = r15
            r0 = 2131433204(0x7f0b16f4, float:1.8488187E38)
            android.view.View r0 = r7.requireViewById(r0)
            r5 = 0
            X.3oV r2 = X.2b1.A01(r0, r5, r5)
            r3.A0j = r2
            X.81y r0 = new X.81y
            r0.<init>(r3)
            r2.EeU(r0)
            r0 = 2131429437(0x7f0b083d, float:1.8480547E38)
            android.view.View r14 = r7.requireViewById(r0)
            android.view.ViewStub r14 = (android.view.ViewStub) r14
            r3.A0c = r14
            r0 = 2131429616(0x7f0b08f0, float:1.848091E38)
            android.view.View r0 = r7.findViewById(r0)
            r3.A0V = r0
            r0 = 2131430454(0x7f0b0c36, float:1.848261E38)
            android.view.View r2 = r7.findViewById(r0)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r3.A0a = r2
            r0 = 2131435232(0x7f0b1ee0, float:1.84923E38)
            android.view.View r0 = r7.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r3.A0b = r0
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.A0F = r0
            com.instagram.model.direct.camera.DirectCameraViewModel r0 = r8.A1I
            if (r0 != 0) goto L_0x0195
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = r8.A1S
            if (r0 != 0) goto L_0x0195
            com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig r0 = r8.A0b
            if (r0 == 0) goto L_0x0244
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x0244
        L_0x0195:
            r0 = 2131165304(0x7f070078, float:1.7944821E38)
            if (r16 == 0) goto L_0x019d
            r0 = 2131165296(0x7f070070, float:1.7944805E38)
        L_0x019d:
            int r1 = r1.getDimensionPixelSize(r0)
            r3.A0G = r1
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.topMargin = r1
            X.0nA.A0e(r15, r1)
            X.0nA.A0e(r14, r1)
        L_0x01b1:
            r0 = 2131433467(0x7f0b17fb, float:1.848872E38)
            android.view.View r1 = r12.requireViewById(r0)
            X.81v r0 = new X.81v
            r0.<init>(r1)
            r3.A0P = r0
            r0 = 2131429478(0x7f0b0866, float:1.848063E38)
            android.view.View r1 = r12.requireViewById(r0)
            X.81v r0 = new X.81v
            r0.<init>(r1)
            r3.A0m = r0
            r0 = 2131431486(0x7f0b103e, float:1.8484703E38)
            android.view.View r0 = r12.requireViewById(r0)
            r3.A0T = r0
            if (r13 == 0) goto L_0x01e1
            r0.setVisibility(r11)
            r9.Eql(r5, r5)
            r10.setVisibility(r11)
        L_0x01e1:
            r0 = 2131431487(0x7f0b103f, float:1.8484705E38)
            android.view.View r0 = r12.requireViewById(r0)
            r3.A0U = r0
            r0 = 0
            if (r2 == 0) goto L_0x01ee
            r0 = 1
        L_0x01ee:
            r3.A0R = r0
            boolean r0 = r8.A3d
            if (r0 == 0) goto L_0x0222
            X.0Tu r5 = X.0Tu.A05
            r1 = 36311835363771167(0x81016c0000031f, double:3.027089127849226E-306)
            r0 = r18
            boolean r0 = X.182.A06(r5, r0, r1)
            if (r0 == 0) goto L_0x0222
            r0 = 2131441303(0x7f0b3697, float:1.8504614E38)
            android.view.View r0 = r7.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x0222
            android.view.View r2 = r0.inflate()
            r0 = 2131441305(0x7f0b3699, float:1.8504618E38)
            android.view.View r1 = r2.requireViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.9m9 r0 = new X.9m9
            r0.<init>(r2, r1)
            r3.A0D = r0
        L_0x0222:
            r0 = 2131435181(0x7f0b1ead, float:1.8492197E38)
            android.view.View r0 = r6.findViewById(r0)
            r3.A05 = r0
            int r1 = r4.getHeight()
            int r0 = r3.A0G
            int r1 = r1 + r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0 = r17
            r0.A0B(r1)
            X.81z r0 = new X.81z
            r0.<init>(r3)
            r4.addOnLayoutChangeListener(r0)
            return
        L_0x0244:
            r3.A0G = r5
            goto L_0x01b1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3497781s.<init>(android.view.View, X.80D):void");
    }

    private void A00(boolean z, float f) {
        ViewStub viewStub = this.A0b;
        if (viewStub != null) {
            View view = this.A01;
            if (view == null) {
                view = viewStub.inflate();
                this.A01 = view;
            }
            if (z) {
                C294975nL.A04(new Ag7(this, f), new View[]{view}, true);
            } else {
                C294975nL.A03(view, (C295005nO) null, 8, false);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void A7M(Parcelable parcelable) {
        Boolean bool;
        PreCaptureButtonManagerIntf$State preCaptureButtonManagerIntf$State = (PreCaptureButtonManagerIntf$State) parcelable;
        if (preCaptureButtonManagerIntf$State != null && (bool = preCaptureButtonManagerIntf$State.A00) != null) {
            Ety(bool.booleanValue());
        }
    }

    public final void APH() {
        C3498081w r2 = this.A0P;
        r2.EOX(0.5f);
        r2.setEnabled(false);
        A00(true, 0.5f);
    }

    public final C3498081w Acd() {
        return this.A0k;
    }

    @Deprecated
    public final ViewGroup AhF() {
        return this.A0K;
    }

    public final void AhH(Rect rect) {
        this.A0K.getHitRect(rect);
    }

    public final View Anx() {
        View view = this.A03;
        if (view != null) {
            return view;
        }
        View inflate = ((ViewStub) this.A0I.requireViewById(R.id.clips_edit_button_stub)).inflate();
        this.A03 = inflate;
        return inflate;
    }

    public final View Ao7() {
        if (this.A04 == null) {
            View view = this.A0I;
            View inflate = ((ViewStub) view.requireViewById(R.id.clips_next_button_stub)).inflate();
            this.A04 = inflate;
            TextView textView = (TextView) inflate;
            textView.setText(2131955521);
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            if (drawable != null) {
                drawable.setAutoMirrored(true);
            }
            Drawable drawable2 = compoundDrawablesRelative[2];
            if (drawable2 != null) {
                drawable2.setAutoMirrored(true);
            }
            Resources resources = view.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
            int i = (resources.getDisplayMetrics().widthPixels / 2) - (dimensionPixelSize * 2);
            textView.setTextSize(0nA.A02(view.getContext(), AnonymousClass91W.A00(textView.getPaint(), textView.getText().toString(), 1, (int) textView.getTextSize(), i - dimensionPixelSize)));
        }
        return this.A04;
    }

    public final AnonymousClass8GE Ap1() {
        View inflate;
        AnonymousClass8GE r3 = this.A0A;
        if (r3 != null) {
            return r3;
        }
        if (this.A0R) {
            ColourWheelView Ap6 = Ap6();
            Ap6.getClass();
            inflate = Ap6.requireViewById(R.id.color_picker_button);
        } else {
            inflate = ((ViewStub) this.A0I.requireViewById(R.id.color_picker_stub_bottom)).inflate();
        }
        Context context = inflate.getContext();
        0qQ.A0B(context, 0);
        AnonymousClass8GE r32 = new AnonymousClass8GE(inflate, 0nA.A04(context, 34), 0nA.A04(context, 2), 0nA.A04(context, 2));
        this.A0A = r32;
        return r32;
    }

    public final ColourWheelView Ap6() {
        if (!this.A0R) {
            return null;
        }
        ColourWheelView colourWheelView = this.A0E;
        if (colourWheelView != null) {
            return colourWheelView;
        }
        ViewStub viewStub = this.A0a;
        viewStub.getClass();
        ColourWheelView colourWheelView2 = (ColourWheelView) viewStub.inflate();
        this.A0E = colourWheelView2;
        return colourWheelView2;
    }

    public final C3498081w B6T() {
        return this.A0O;
    }

    public final StoryTypeSelectorView B8D() {
        return (StoryTypeSelectorView) this.A0j.getView();
    }

    public final C3498081w B8r() {
        return this.A0P;
    }

    public final C3498081w BDi() {
        if (this.A07 == null) {
            C3497981v r1 = new C3497981v(this.A0c.inflate());
            this.A07 = r1;
            if (this.A0o) {
                Context context = this.A0I.getContext();
                r1.EZd(context.getDrawable(R.drawable.instagram_arrow_back_24));
                this.A07.ESF(context.getColor(2Yu.A07(context)));
            }
        }
        return this.A07;
    }

    public final C3498081w BOi() {
        C3498081w r1 = this.A02;
        if (r1 != null) {
            return r1;
        }
        C3497981v r12 = new C3497981v(this.A0d.inflate());
        this.A02 = r12;
        return r12;
    }

    public final AnonymousClass8E2 BUh() {
        AnonymousClass8E2 r1 = this.A0B;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass8E2 r12 = new AnonymousClass8E2((ImageView) ((ViewStub) this.A0I.requireViewById(R.id.music_asset_button_stub)).inflate());
        this.A0B = r12;
        return r12;
    }

    public final AnonymousClass8E0 BV0() {
        AnonymousClass8E0 r1 = this.A0C;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass8E0 r12 = new AnonymousClass8E0((ImageView) ((ViewStub) this.A0I.requireViewById(R.id.music_snippet_button_stub)).inflate());
        this.A0C = r12;
        return r12;
    }

    public final C3498081w BlZ() {
        return this.A0l;
    }

    public final 2Fk Bp5() {
        return this.A0N;
    }

    public final ViewGroup BqZ() {
        return this.A0Y;
    }

    public final C338917ik Bt4() {
        C338917ik r1 = this.A09;
        if (r1 != null) {
            return r1;
        }
        C338917ik r12 = new C338917ik((ImageView) this.A0e.inflate());
        this.A09 = r12;
        return r12;
    }

    public final C387399m9 Btk() {
        return this.A0D;
    }

    public final FrameLayout Btr() {
        ViewStub viewStub = (ViewStub) this.A0I.findViewById(R.id.shopping_camera_purchase_pill_stub);
        if (viewStub != null) {
            this.A06 = (FrameLayout) viewStub.inflate();
        }
        return this.A06;
    }

    public final C3498081w C3a() {
        return this.A0m;
    }

    public final C3498081w C3b() {
        C3498081w r1 = this.A08;
        if (r1 != null) {
            return r1;
        }
        C3497981v r12 = new C3497981v(this.A0f.inflate());
        this.A08 = r12;
        return r12;
    }

    public final int C8O() {
        return this.A0G;
    }

    public final void CLF(boolean z) {
        C294975nL.A05(new View[]{this.A0K}, z);
        C294975nL.A05(new View[]{this.A0X}, z);
    }

    public final void CLH() {
        C294975nL.A05(new View[]{this.A0W}, false);
    }

    public final void CLJ() {
        C294975nL.A05(new View[]{this.A0Z}, false);
    }

    public final void CLK() {
        C294975nL.A05(new View[]{this.A0I}, false);
    }

    public final void CLW() {
        this.A0T.setVisibility(8);
        this.A0U.setVisibility(8);
    }

    public final void CLX() {
        this.A0T.setVisibility(8);
    }

    public final void CLZ() {
        this.A0h.A06(0.0d);
    }

    public final void CLq() {
        C3498081w r1 = this.A08;
        r1.getClass();
        ((C3497981v) r1).Eql(false, false);
    }

    public final void CLt() {
        C294975nL.A05(new View[]{this.A0M}, false);
    }

    public final boolean CPb() {
        if (this.A0K.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean CQ1() {
        if (this.A0W.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean CZd() {
        if (this.A0Z.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean Cb1() {
        if (this.A0I.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void EPv(int i) {
        this.A0K.setTranslationY((float) Math.min(0, 0));
    }

    public final void EZh(boolean z) {
        View view = this.A0I;
        int i = 4;
        if (z) {
            i = 0;
        }
        2eQ.A04(view, i);
    }

    public final void ElJ(int i) {
        this.A0n.setShutterButtonSingularColor(i);
    }

    public final void ElK(Drawable drawable) {
        this.A0n.setFormatIcon(drawable);
    }

    public final void Ety(boolean z) {
        this.A0K.getViewTreeObserver().addOnGlobalLayoutListener(new C348107xt(this, z));
    }

    public final void Eu6(boolean z) {
        C294975nL.A04((C295005nO) null, new View[]{this.A0K}, z);
        C294975nL.A04((C295005nO) null, new View[]{this.A0X}, z);
    }

    public final void EuA() {
        C294975nL.A04((C295005nO) null, new View[]{this.A0W}, false);
    }

    public final void EuD() {
        View view = this.A03;
        if (view != null) {
            view.postDelayed(new C41148Ap8(view.getResources(), view, this), 200);
        }
    }

    public final void EuE() {
        C294975nL.A04((C295005nO) null, new View[]{this.A0Z}, false);
    }

    public final void EuK() {
        C294975nL.A04((C295005nO) null, new View[]{this.A0I}, false);
    }

    public final void Euh() {
        if (!this.A0o) {
            this.A0T.setVisibility(0);
            this.A0U.setVisibility(0);
        }
    }

    public final void Euk() {
        this.A0h.A03();
        if (this.A02 != null) {
            1Av r6 = this.A0Q;
            0s0 r5 = r6.A3q;
            AnonymousClass0YZ[] r8 = 1Av.A8a;
            if (!((Boolean) r5.CDM(r6, r8[49])).booleanValue()) {
                C3498081w r4 = this.A02;
                Activity activity = this.A0H;
                AnonymousClass5Gt r2 = new AnonymousClass5Gt(activity, new C315476jx((CharSequence) activity.getString(2131965636)));
                r2.A01();
                C3497981v r42 = (C3497981v) r4;
                r42.getView().post(new C41019An3(r42, r2));
                r5.Epx(r6, true, r8[49]);
            }
        }
    }

    public final void EvM() {
        C3498081w r2 = this.A08;
        r2.getClass();
        ((C3497981v) r2).Eql(true, false);
    }

    public final void EvW() {
        C294975nL.A04((C295005nO) null, new View[]{this.A0M}, false);
    }

    public final void FMA(boolean z, boolean z2, boolean z3) {
        C3498081w r1 = this.A0P;
        if (r1 != null) {
            ((C3497981v) r1).Eql(z2, false);
        }
        ((C3497981v) this.A0k).Eql(z, false);
        Ap1().Eql(z3, false);
    }

    public final void FMC(float f) {
        this.A0K.setTranslationY(f);
    }

    public final void FMD(boolean z, boolean z2) {
        if (z) {
            Eu6(z2);
        } else {
            CLF(z2);
        }
    }

    @Deprecated
    public final void FMH(boolean z, boolean z2, boolean z3, boolean z4) {
        if (2CC.A00(AnonymousClass05K.A0Q)) {
            0wj.A00("updateUiForStatesTransitionToPostCapture", 17640711, false).report();
        } else {
            A01(true, z, z2, z3, z4);
        }
    }

    public final void AAq(28D r5, UserSession userSession, C279284yO r7, boolean z) {
        boolean A022 = AnonymousClass8X8.A02(r5, userSession, r7, z);
        ViewStub viewStub = this.A0e;
        int i = 8388613;
        int i2 = 8388611;
        if (A022) {
            i2 = 8388613;
        }
        0nA.A0W(viewStub, i2 | 48);
        ViewStub viewStub2 = this.A0c;
        if (A022) {
            i = 8388611;
        }
        0nA.A0W(viewStub2, i | 48);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (A03(r5.A0U, r6, r7, false) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (A03(r5.A0K, r6, r7, !r3) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (A03(r5.A0M, r6, r7, true) != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r0 = r5.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r0 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r0.AJY(r6, r7, r3) != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        r0 = r5.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        if (r0.AJY(r6, r7, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AJY(int r6, int r7, boolean r8) {
        /*
            r5 = this;
            boolean r3 = X.C61290mR.A07()
            r2 = 1
            r1 = 0
            if (r8 == 0) goto L_0x003e
            android.view.View r0 = r5.A05
            if (r0 != 0) goto L_0x0017
            android.view.ViewGroup r4 = r5.A0Y
            r0 = 2131435181(0x7f0b1ead, float:1.8492197E38)
            android.view.View r0 = r4.findViewById(r0)
            r5.A05 = r0
        L_0x0017:
            boolean r0 = r5.A03(r0, r6, r7, r1)
            if (r0 != 0) goto L_0x003d
            com.instagram.ui.widget.shutterbutton.ShutterButton r0 = r5.A0n
            boolean r0 = r5.A03(r0, r6, r7, r1)
            if (r0 != 0) goto L_0x003d
            android.view.View r0 = r5.A0T
            boolean r0 = r5.A03(r0, r6, r7, r1)
            if (r0 != 0) goto L_0x003d
            android.widget.ImageView r0 = r5.A0g
            boolean r0 = r5.A03(r0, r6, r7, r1)
            if (r0 != 0) goto L_0x003d
            android.view.View r0 = r5.A0U
            boolean r0 = r5.A03(r0, r6, r7, r1)
            if (r0 == 0) goto L_0x0048
        L_0x003d:
            return r2
        L_0x003e:
            r1 = r3 ^ 1
            android.view.ViewGroup r0 = r5.A0K
            boolean r0 = r5.A03(r0, r6, r7, r1)
            if (r0 != 0) goto L_0x003d
        L_0x0048:
            android.view.ViewGroup r0 = r5.A0M
            boolean r0 = r5.A03(r0, r6, r7, r2)
            if (r0 != 0) goto L_0x003d
            X.81w r0 = r5.A07
            if (r0 == 0) goto L_0x005a
            boolean r0 = r0.AJY(r6, r7, r3)
            if (r0 != 0) goto L_0x003d
        L_0x005a:
            X.7ik r0 = r5.A09
            if (r0 == 0) goto L_0x0065
            boolean r0 = r0.AJY(r6, r7, r3)
            if (r0 == 0) goto L_0x0065
            return r2
        L_0x0065:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3497781s.AJY(int, int, boolean):boolean");
    }

    public final void CLs() {
        CLt();
        C359158c6.A00(new C3498081w[]{this.A09}, false);
        C359158c6.A00(new C3498081w[]{this.A07}, false);
    }

    public final void EvV() {
        EvW();
        C359158c6.A00(new C3498081w[]{this.A09}, true);
        C359158c6.A00(new C3498081w[]{this.A07}, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FM9(boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40, boolean r41, boolean r42, boolean r43) {
        /*
            r22 = this;
            r2 = 1
            r15 = 0
            r3 = r22
            X.81w r0 = r3.A0m
            X.81v r0 = (X.C3497981v) r0
            r1 = r23
            r0.Eql(r1, r15)
            if (r24 == 0) goto L_0x01f4
            r3.EvM()
        L_0x0012:
            android.view.ViewGroup r1 = r3.A0L
            r10 = 8
            r0 = 8
            if (r25 == 0) goto L_0x001b
            r0 = 0
        L_0x001b:
            r1.setVisibility(r0)
            X.8E0 r0 = r3.A0C
            if (r0 == 0) goto L_0x0027
            r1 = r26
            r0.Eql(r1, r15)
        L_0x0027:
            X.8E2 r0 = r3.A0B
            if (r0 == 0) goto L_0x0030
            r1 = r27
            r0.Eql(r1, r15)
        L_0x0030:
            r7 = r32
            if (r28 == 0) goto L_0x01e1
            if (r31 == 0) goto L_0x01d2
            if (r30 == 0) goto L_0x01d2
            X.7ik r0 = r3.A09
            X.81w[] r0 = new X.C3498081w[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            X.81w[] r0 = (X.C3498081w[]) r0
            X.C359158c6.A01(r0, r2, r7)
            X.7ik r0 = r3.A09
            if (r0 == 0) goto L_0x0140
            X.8g6 r1 = X.C361358g6.A00
            android.view.View r0 = r3.A0I
            android.content.Context r6 = r0.getContext()
            com.instagram.common.session.UserSession r5 = r3.A0i
            X.1Av r0 = r3.A0Q
            X.7ik r4 = r3.Bt4()
            X.0qQ.A0B(r6, r15)
            X.0qQ.A0B(r5, r2)
            r8 = 2
            X.0qQ.A0B(r0, r8)
            r8 = 3
            X.0qQ.A0B(r4, r8)
            X.7nv r8 = X.C342017nu.A00(r6, r5)
            X.0eM r8 = r8.A03
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0140
            if (r29 == 0) goto L_0x01c9
            X.0xa r9 = r0.A01
            r8 = 794(0x31a, float:1.113E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r8)
            boolean r8 = r9.getBoolean(r8, r15)
            if (r8 != 0) goto L_0x01c9
            android.view.View r8 = r4.getView()
            android.content.Context r8 = r8.getContext()
            X.0qQ.A07(r8)
            boolean r0 = r1.A02(r8, r5, r0)
            if (r0 != 0) goto L_0x01c9
            android.graphics.drawable.Drawable r8 = r4.A00
            if (r8 == 0) goto L_0x00f0
            int r0 = r8.getIntrinsicWidth()
            double r0 = (double) r0
            r11 = 4604029899060858061(0x3fe4cccccccccccd, double:0.65)
            double r0 = r0 * r11
            int r12 = (int) r0
            int r0 = r8.getIntrinsicHeight()
            double r0 = (double) r0
            r13 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r0 = r0 * r13
            int r11 = (int) r0
            android.widget.ImageView r0 = r4.A01
            android.content.Context r1 = r0.getContext()
            r0 = 2131239707(0x7f08231b, float:1.8095729E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r8, r0}
            android.graphics.drawable.LayerDrawable r14 = new android.graphics.drawable.LayerDrawable
            r14.<init>(r0)
            r16 = r15
            r17 = r15
            r18 = r15
            r19 = r15
            r14.setLayerInset(r15, r16, r17, r18, r19)
            r0 = 25
            r14.setLayerSize(r2, r0, r0)
            r16 = r14
            r19 = r11
            r20 = r15
            r21 = r15
            r17 = r2
            r18 = r12
            r16.setLayerInset(r17, r18, r19, r20, r21)
            r4.EZd(r14)
        L_0x00f0:
            X.FA7 r1 = X.C48962En0.A00(r6, r5)
            boolean r0 = X.FA7.A00(r1)
            if (r0 == 0) goto L_0x0140
            X.0eM r0 = r1.A01
            java.lang.Object r4 = r0.getValue()
            X.0wc r4 = (X.0wc) r4
            java.lang.String r1 = "ig_lock_screen_shortcuts"
            X.0kJ r0 = r4.A00
            X.0Aj r8 = r4.A00(r0, r1)
            boolean r0 = r8.isSampled()
            if (r0 == 0) goto L_0x0140
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = "story_camera_lockscreen_shortcut_badge_imp_timestamp_ms"
            r4 = 0
            long r4 = r9.getLong(r6, r4)
            long r13 = r0 - r4
            X.30J r4 = X.AnonymousClass30J.DAYS
            long r4 = X.AnonymousClass30K.A03(r4, r2)
            long r11 = X.AnonymousClass30M.A03(r4)
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0140
            java.lang.String r5 = "story_camera_settings_button_badge_imp"
            java.lang.String r4 = "action"
            r8.AAJ(r4, r5)
            r8.Cgf()
            X.0xY r4 = r9.AR4()
            r4.E5c(r6, r0)
            r4.apply()
        L_0x0140:
            X.81w r0 = r3.A07
            X.81w[] r0 = new X.C3498081w[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            X.81w[] r0 = (X.C3498081w[]) r0
            X.C359158c6.A01(r0, r2, r7)
        L_0x014f:
            android.view.View r4 = r3.A0J
            if (r33 == 0) goto L_0x01be
            android.view.View[] r1 = new android.view.View[]{r4}
            r0 = 0
            X.C294975nL.A04(r0, r1, r15)
            r3.EZh(r2)
        L_0x015e:
            X.81w r0 = r3.A0k
            X.81v r0 = (X.C3497981v) r0
            r1 = r36
            r0.Eql(r1, r15)
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r34 == 0) goto L_0x016d
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x016d:
            r4.setAlpha(r0)
            X.8GE r0 = r3.A0A
            if (r0 == 0) goto L_0x0185
            r4 = r35
            r0.Eql(r4, r15)
            com.instagram.ui.widget.colourwheel.ColourWheelView r1 = r3.A0E
            if (r1 == 0) goto L_0x0185
            r0 = 8
            if (r35 == 0) goto L_0x0182
            r0 = 0
        L_0x0182:
            r1.setVisibility(r0)
        L_0x0185:
            if (r37 == 0) goto L_0x01ba
            r3.EvW()
        L_0x018a:
            X.81w r4 = r3.A0P
            r0 = r38
            r4.Eql(r0, r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 1056964608(0x3f000000, float:0.5)
            r2 = r40
            if (r40 == 0) goto L_0x019b
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x019b:
            r4.EOX(r0)
            r4.setEnabled(r2)
            if (r40 != 0) goto L_0x01a5
            r1 = 1056964608(0x3f000000, float:0.5)
        L_0x01a5:
            r0 = r41
            r3.A00(r0, r1)
            X.81w r0 = r3.A0l
            X.81v r0 = (X.C3497981v) r0
            r0.Eql(r15, r15)
            X.3oV r0 = r3.A0j
            if (r43 == 0) goto L_0x01b6
            r10 = 0
        L_0x01b6:
            r0.setVisibility(r10)
            return
        L_0x01ba:
            r3.CLt()
            goto L_0x018a
        L_0x01be:
            android.view.View[] r0 = new android.view.View[]{r4}
            X.C294975nL.A06(r0, r2)
            r3.EZh(r15)
            goto L_0x015e
        L_0x01c9:
            android.graphics.drawable.Drawable r0 = r4.A00
            if (r0 == 0) goto L_0x0140
            r4.EZd(r0)
            goto L_0x0140
        L_0x01d2:
            X.7ik r0 = r3.A09
            X.81w[] r0 = new X.C3498081w[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            X.81w[] r0 = (X.C3498081w[]) r0
            X.C359158c6.A01(r0, r15, r7)
        L_0x01e1:
            if (r31 != 0) goto L_0x0140
            X.81w r0 = r3.A07
            X.81w[] r0 = new X.C3498081w[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            X.81w[] r0 = (X.C3498081w[]) r0
            X.C359158c6.A01(r0, r15, r7)
            goto L_0x014f
        L_0x01f4:
            r3.CLq()
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3497781s.FM9(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
