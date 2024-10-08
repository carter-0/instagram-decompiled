package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import java.util.Random;

/* renamed from: X.WZk  reason: case insensitive filesystem */
public final class C19437WZk implements X4M {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final Bitmap A04;
    public final Rect A05 = new Rect();
    public final View A06;
    public final Random A07 = new Random();

    public C19437WZk(Bitmap bitmap, View view) {
        0qQ.A0B(view, 1);
        this.A06 = view;
        this.A04 = bitmap;
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A02 = (float) C61380mr.A01(A0S, -250);
        this.A00 = (float) C61380mr.A01(A0S, -450);
        this.A03 = (float) C61380mr.A01(A0S, 100);
        this.A01 = (float) C61380mr.A01(A0S, -200);
    }

    public final void AJ7(C17726Vcv vcv, int i, int i2, long j) {
        View view = this.A06;
        Rect rect = this.A05;
        view.getGlobalVisibleRect(rect);
        if (rect.left != 0 || rect.top != 0 || rect.right != 0 || rect.bottom != 0) {
            Random random = this.A07;
            float nextFloat = 0.3f + ((1.0f - 0.3f) * random.nextFloat());
            PointF pointF = vcv.A0A;
            pointF.x = C13989Tnp.A01(rect.right, rect.left, (random.nextFloat() * 0.7f) + 0.15f);
            pointF.y = C13989Tnp.A01(rect.bottom, rect.top, (random.nextFloat() * 0.6f) + 0.33f);
            PointF pointF2 = vcv.A0C;
            pointF2.x = ((float) i) * random.nextFloat();
            float A012 = C13989Tnp.A01(rect.bottom, rect.top, 0.75f);
            C13989Tnp.A12(pointF2, random, this.A01, this.A03, A012);
            PointF pointF3 = vcv.A0D;
            pointF3.x = 0.0f;
            pointF3.y = 0.0f;
            float f = this.A02;
            vcv.A04 = f + ((this.A00 - f) * vcv.A06);
            vcv.A06 = nextFloat * 1.2f;
            vcv.A05 = C13990Tnq.A03(random);
            vcv.A07 = 1.0f;
            vcv.A03 = 1.0f;
            vcv.A09 = this.A04;
        }
    }
}
