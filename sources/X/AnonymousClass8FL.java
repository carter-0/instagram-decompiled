package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.8FL  reason: invalid class name */
public final class AnonymousClass8FL implements AnonymousClass81E {
    public float A00 = 0.27499998f;
    public float A01 = -0.23499998f;
    public float A02;
    public float A03 = 0.35f;
    public Drawable A04;
    public Drawable A05;
    public C343437qD A06;
    public AnonymousClass8BH A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final int A0B;
    public final Context A0C;
    public final TextureView A0D;
    public final AnonymousClass57C A0E = AnonymousClass57C.ASSET_PICKER;
    public final AnonymousClass8FP A0F;
    public final UserSession A0G;
    public final C357638Yz A0H;
    public final C3510387i A0I;
    public final AnonymousClass8BA A0J;
    public final AnonymousClass8FN A0K;
    public final InteractiveDrawableContainer A0L;
    public final C3510487j A0M = new AnonymousClass8FM(this);
    public final RoundedCornerFrameLayout A0N;
    public final 0sP A0O;

    public AnonymousClass8FL(Context context, ViewGroup viewGroup, UserSession userSession, C357638Yz r7, C357638Yz r8, C3510387i r9, AnonymousClass8BA r10, InteractiveDrawableContainer interactiveDrawableContainer, InteractiveDrawableContainer interactiveDrawableContainer2, int i, int i2) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(viewGroup, 4);
        0qQ.A0B(r10, 5);
        0qQ.A0B(r9, 7);
        this.A0C = context;
        this.A0G = userSession;
        this.A0H = r7;
        this.A0J = r10;
        this.A0L = interactiveDrawableContainer;
        this.A0I = r9;
        this.A0B = i;
        this.A0A = i2;
        View requireViewById = viewGroup.requireViewById(R.id.dual_layout);
        0qQ.A07(requireViewById);
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) requireViewById;
        this.A0N = roundedCornerFrameLayout;
        View requireViewById2 = roundedCornerFrameLayout.requireViewById(R.id.dual_camera_view);
        0qQ.A07(requireViewById2);
        this.A0D = (TextureView) requireViewById2;
        AnonymousClass8FN r1 = new AnonymousClass8FN(this);
        this.A0K = r1;
        ViewGroup.LayoutParams layoutParams = roundedCornerFrameLayout.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        roundedCornerFrameLayout.setLayoutParams(layoutParams);
        interactiveDrawableContainer2.A0y(r1);
        AnonymousClass9LG r12 = new AnonymousClass9LG(this, 29);
        this.A0O = r12;
        this.A0F = new AnonymousClass8FO(this);
        r8.A0G(new AnonymousClass8FQ(r12));
    }

    public final /* synthetic */ void A7M(Parcelable parcelable) {
    }

    public static final void A00(AnonymousClass8FL r6) {
        C343437qD r5 = r6.A06;
        if (r5 != null) {
            float f = (-r6.A00) / ((float) r6.A0B);
            float f2 = r6.A01 / ((float) r6.A0A);
            float f3 = r6.A03;
            float f4 = r6.A02;
            C340547lR r0 = ((BasicCameraOutputController) C340297l2.A02(r5.A00)).A04;
            if (r0 != null) {
                C340537lQ r02 = r0.A0R;
                r02.A03 = f;
                r02.A04 = f2;
                r02.A06 = f3;
                r02.A05 = f4;
                C18015Vjr vjr = r02.A00;
                if (vjr != null) {
                    vjr.A01(f, f2, f3, f4);
                }
            }
        }
    }

    public static final void A01(AnonymousClass8FL r7, boolean z) {
        C343437qD r3 = r7.A06;
        if (r3 != null && r7.A08 != z) {
            r7.A08 = z;
            boolean A0T = r3.A00.A0T();
            if (z) {
                if (!A0T) {
                    r7.A09 = true;
                    RoundedCornerFrameLayout roundedCornerFrameLayout = r7.A0N;
                    roundedCornerFrameLayout.setVisibility(0);
                    TextureView textureView = r7.A0D;
                    textureView.setVisibility(0);
                    roundedCornerFrameLayout.setAlpha(0.0f);
                    C3496881i r0 = r3.A01;
                    C340297l2 r4 = r0.A02;
                    if (r4 != null) {
                        r0.A0A = false;
                        C364428lP r2 = new C364428lP(r0);
                        C345497tb A022 = C340297l2.A02(r4);
                        C364498lW r1 = new C364498lW(r2, r4);
                        C340547lR r02 = ((BasicCameraOutputController) A022).A04;
                        if (r02 != null) {
                            r02.A09(textureView, r1);
                        }
                    }
                    AnonymousClass8FP r12 = r7.A0F;
                    0qQ.A0B(r12, 0);
                    r3.A00.A0G(r12);
                }
            } else if (A0T) {
                RoundedCornerFrameLayout roundedCornerFrameLayout2 = r7.A0N;
                C294975nL.A00(roundedCornerFrameLayout2).A0G();
                roundedCornerFrameLayout2.setVisibility(4);
                InteractiveDrawableContainer interactiveDrawableContainer = r7.A0L;
                interactiveDrawableContainer.A0S(r7.A04);
                r7.A04 = null;
                if (interactiveDrawableContainer.getInteractiveDrawables().size() == 0) {
                    interactiveDrawableContainer.A0S = false;
                }
                AnonymousClass8FP r22 = r7.A0F;
                0qQ.A0B(r22, 0);
                r3.A00.A0H(r22);
                C3496881i r23 = r3.A01;
                C340297l2 r03 = r23.A02;
                if (r03 != null) {
                    r23.A0A = false;
                    C364418lO r13 = new C364418lO(r23);
                    C340547lR r04 = ((BasicCameraOutputController) C340297l2.A02(r03)).A04;
                    if (r04 != null) {
                        r04.A0A(r13);
                    }
                }
            }
            C357638Yz r42 = r7.A0H;
            C279284yO r32 = (C279284yO) r42.A08.A00;
            C358088aL r24 = C358088aL.A0G;
            boolean z2 = true;
            if (r42.A0V(C358088aL.A0D) || r42.A0V(C358088aL.A0M)) {
                z2 = false;
            }
            r42.A0J(r32, r24, z2);
        }
    }

    public final void A02() {
        Drawable drawable = this.A04;
        if (drawable != null) {
            InteractiveDrawableContainer interactiveDrawableContainer = this.A0L;
            interactiveDrawableContainer.A0o(drawable, 0.35f);
            interactiveDrawableContainer.A0n(this.A04, 0.0f);
            interactiveDrawableContainer.A0p(this.A04, ((float) this.A0B) * 0.27499998f, ((float) this.A0A) * -0.23499998f);
        }
    }

    public final /* synthetic */ Parcelable ANX() {
        return null;
    }
}
