package X;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Jc2  reason: case insensitive filesystem */
public final class C59938Jc2 {
    public C62320sa A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final View A04;
    public final View A05;
    public final C340297l2 A06;
    public final AnonymousClass0eM A07 = C66295MMe.A00(this, 32);
    public final AnonymousClass0eM A08 = C66295MMe.A00(this, 33);
    public final AnonymousClass0eM A09 = C66295MMe.A00(this, 34);
    public final AnonymousClass0eM A0A;
    public final float A0B;
    public final int A0C;
    public final int A0D;

    public final void A01(C62320sa r5) {
        0qQ.A0B(r5, 0);
        if (this.A01) {
            this.A00 = new MJ9(41, r5, this);
        } else if (!this.A02) {
            r5.invoke();
        } else {
            this.A02 = false;
            AnonymousClass0eM r3 = this.A08;
            ((Animator) r3.getValue()).addListener(new C64194LTc(r5, 4));
            ((Animator) r3.getValue()).start();
        }
    }

    public static final void A00(Bitmap bitmap, C59938Jc2 jc2) {
        AnonymousClass0eM r5 = jc2.A09;
        ((IgImageView) AnonymousClass7TE.A14(r5)).setVisibility(0);
        ((IgImageView) AnonymousClass7TE.A14(r5)).setScaleX(1.0f);
        ((IgImageView) AnonymousClass7TE.A14(r5)).setScaleY(1.0f);
        ((IgImageView) AnonymousClass7TE.A14(r5)).setAlpha(1.0f);
        ((IgImageView) AnonymousClass7TE.A14(r5)).setImageBitmap(bitmap);
        int i = jc2.A0D;
        int i2 = jc2.A03;
        ((IgImageView) AnonymousClass7TE.A14(r5)).setX(((float) (i - i2)) / 2.0f);
        ((IgImageView) AnonymousClass7TE.A14(r5)).setY(((float) (jc2.A0C - i2)) / 2.0f);
        AnonymousClass8LZ.A01((IgImageView) AnonymousClass7TE.A14(r5), jc2.A0B, 0);
    }

    public C59938Jc2(View view, View view2, ViewGroup viewGroup, C340297l2 r6, float f, int i, int i2, int i3) {
        C51972G9s.A1E(view, view2);
        this.A06 = r6;
        this.A03 = i;
        this.A0D = i2;
        this.A0C = i3;
        this.A0B = f;
        this.A05 = view;
        this.A04 = view2;
        this.A0A = C66295MMe.A00(viewGroup, 35);
        view2.setCameraDistance(0nA.A04(AnonymousClass7TE.A0S(view2), 5000));
    }
}
