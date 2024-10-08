package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* renamed from: X.6mY  reason: invalid class name and case insensitive filesystem */
public final class C316996mY {
    public boolean A00;
    public final ValueAnimator A01;
    public final C252063oV A02;
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new AnonymousClass9LS(this, 31));
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(new AnonymousClass9LS(this, 32));
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new AnonymousClass9LS(this, 33));
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new AnonymousClass9LS(this, 34));
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(new AnonymousClass9LS(this, 35));
    public final AnonymousClass0eM A08 = AnonymousClass1YB.A00(new AnonymousClass9LS(this, 36));
    public final AnonymousClass0eM A09 = AnonymousClass1YB.A00(new AnonymousClass9LS(this, 37));
    public final AnonymousClass0eM A0A = AnonymousClass1YB.A00(new AnonymousClass9LS(this, 38));
    public final AnonymousClass0eM A0B = AnonymousClass1YB.A00(new AnonymousClass9LS(this, 39));

    public C316996mY(C252063oV r8) {
        this.A02 = r8;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(500);
        ofFloat.setStartDelay(500);
        ofFloat.addUpdateListener(new C317006mZ(this));
        this.A01 = ofFloat;
    }

    public static final void A00(C316996mY r2) {
        ValueAnimator valueAnimator = r2.A01;
        valueAnimator.cancel();
        valueAnimator.removeAllListeners();
        r2.A00 = false;
        AnonymousClass0eM r22 = r2.A03;
        Object value = r22.getValue();
        0qQ.A07(value);
        Object value2 = r22.getValue();
        0qQ.A07(value2);
        ((View) value).setTranslationY((float) ((View) value2).getHeight());
        Object value3 = r22.getValue();
        0qQ.A07(value3);
        Object value4 = r22.getValue();
        0qQ.A07(value4);
        ((View) value3).setAlpha((float) ((View) value4).getHeight());
    }
}
