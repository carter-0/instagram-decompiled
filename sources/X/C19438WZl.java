package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import java.util.Random;

/* renamed from: X.WZl  reason: case insensitive filesystem */
public final class C19438WZl implements X4M {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final Bitmap A04;
    public final Rect A05 = new Rect();
    public final View A06;
    public final Random A07 = new Random();

    public C19438WZl(Bitmap bitmap, View view) {
        0qQ.A0B(view, 1);
        this.A06 = view;
        this.A04 = bitmap;
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A02 = (float) C61380mr.A01(A0S, -350);
        this.A00 = (float) C61380mr.A01(A0S, -550);
        this.A03 = (float) C61380mr.A01(A0S, 100);
        this.A01 = (float) C61380mr.A01(A0S, -200);
    }

    public final void AJ7(C17726Vcv vcv, int i, int i2, long j) {
        this.A06.post(new C20306Wov(this, vcv, i));
    }
}
