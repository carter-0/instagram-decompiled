package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import java.util.Random;

/* renamed from: X.Wov  reason: case insensitive filesystem */
public final class C20306Wov implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C19438WZl A01;
    public final /* synthetic */ C17726Vcv A02;

    public C20306Wov(C19438WZl wZl, C17726Vcv vcv, int i) {
        this.A01 = wZl;
        this.A00 = i;
        this.A02 = vcv;
    }

    public final void run() {
        C19438WZl wZl = this.A01;
        View view = wZl.A06;
        Rect rect = wZl.A05;
        view.getGlobalVisibleRect(rect);
        if (rect.left != 0 || rect.top != 0 || rect.right != 0 || rect.bottom != 0) {
            float f = ((float) this.A00) * 0.65f;
            Random random = wZl.A07;
            float nextFloat = 0.3f + ((1.0f - 0.3f) * random.nextFloat());
            C17726Vcv vcv = this.A02;
            PointF pointF = vcv.A0A;
            pointF.x = C13989Tnp.A01(rect.right, rect.left, 0.5f);
            pointF.y = C13989Tnp.A01(rect.bottom, rect.top, 0.5f);
            PointF pointF2 = vcv.A0C;
            pointF2.x = (rect.exactCenterX() - (f / 2.0f)) + (f * random.nextFloat());
            float A012 = C13989Tnp.A01(rect.bottom, rect.top, 0.55f);
            C13989Tnp.A12(pointF2, random, wZl.A01, wZl.A03, A012);
            PointF pointF3 = vcv.A0D;
            pointF3.x = 0.0f;
            pointF3.y = 0.0f;
            float f2 = wZl.A02;
            vcv.A04 = f2 + ((wZl.A00 - f2) * vcv.A06);
            vcv.A06 = nextFloat * 1.2f;
            vcv.A05 = C13990Tnq.A03(random);
            vcv.A07 = 1.0f;
            vcv.A03 = 1.0f;
            vcv.A09 = wZl.A04;
        }
    }
}
