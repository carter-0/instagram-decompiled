package X;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import com.instagram.ui.widget.flyingreactionview.FlyingReactionView;

/* renamed from: X.WPv  reason: case insensitive filesystem */
public final class C19215WPv implements AnonymousClass1MK {
    public final /* synthetic */ Point A00;
    public final /* synthetic */ Point A01;
    public final /* synthetic */ FlyingReactionView A02;
    public final /* synthetic */ int[] A03;

    public final void CyF(C226952iF r12, AnonymousClass3LX r13) {
        0qQ.A0B(r13, 1);
        FlyingReactionView flyingReactionView = this.A02;
        Point point = this.A01;
        Point point2 = this.A00;
        int[] iArr = this.A03;
        Point point3 = new Point(iArr[0], iArr[1]);
        Bitmap bitmap = r13.A01;
        if (bitmap != null) {
            OvershootInterpolator overshootInterpolator = FlyingReactionView.A06;
            flyingReactionView.A01 = new C17602Vau(bitmap, point, point2, point3, flyingReactionView.A03);
            if (!flyingReactionView.A02) {
                flyingReactionView.A02 = true;
                flyingReactionView.setVisibility(0);
                flyingReactionView.bringToFront();
                C17602Vau vau = flyingReactionView.A01;
                if (vau != null) {
                    vau.A00 = SystemClock.elapsedRealtime();
                    flyingReactionView.postInvalidateOnAnimation();
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public C19215WPv(Point point, Point point2, FlyingReactionView flyingReactionView, int[] iArr) {
        this.A02 = flyingReactionView;
        this.A01 = point;
        this.A00 = point2;
        this.A03 = iArr;
    }
}
