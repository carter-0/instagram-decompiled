package X;

import android.content.Context;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.3v8  reason: invalid class name and case insensitive filesystem */
public final class C256043v8 {
    public final Context A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;

    public static final void A00(C256043v8 r3, boolean z) {
        float f = 0.0f;
        float f2 = 1.0f;
        if (z) {
            f2 = 0.0f;
            f = 1.0f;
        }
        if (r3.A01().getAlpha() != f) {
            r3.A01().setAlpha(f2);
            r3.A01().animate().alpha(f).setDuration(200).start();
        }
    }

    public final SlideInAndOutIconView A01() {
        Object value = this.A02.getValue();
        0qQ.A07(value);
        return (SlideInAndOutIconView) value;
    }

    public C256043v8(Context context, ViewStub viewStub, boolean z) {
        this.A00 = context;
        0t0 A012 = AnonymousClass0eN.A01(new AnonymousClass9L2(viewStub, 3));
        this.A01 = A012;
        if (!z) {
            0qQ.A07(A012.getValue());
        }
        this.A02 = AnonymousClass0eN.A01(new AnonymousClass9L2(this, 4));
    }

    public final void A02(int i) {
        A01().setIcon(this.A00.getDrawable(i));
        A01().setVisibility(0);
        A01().animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200).setInterpolator(new DecelerateInterpolator()).withEndAction(new C57729IfW(this)).start();
    }
}
