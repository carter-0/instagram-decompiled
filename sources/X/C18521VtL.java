package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: X.VtL  reason: case insensitive filesystem */
public final class C18521VtL {
    public Bitmap A00;
    public ViewGroup.LayoutParams A01;
    public ViewGroup A02;
    public C16478UvY A03;
    public C299025uS A04;
    public boolean A05;
    public final int A06;
    public final Activity A07;
    public final Context A08;
    public final RectF A09;
    public final RectF A0A;
    public final ViewGroup A0B;
    public final FrameLayout A0C;
    public final ImageView A0D;
    public final boolean A0E;
    public final boolean A0F;

    public static final void A00(C18521VtL vtL) {
        FrameLayout frameLayout = vtL.A0C;
        if (frameLayout.getWindowToken() != null) {
            vtL.A05 = true;
        } else if (!vtL.A05) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 99, 8, -3);
            try {
                Object systemService = vtL.A08.getSystemService("window");
                0qQ.A0C(systemService, AnonymousClass000.A00(14));
                ((ViewManager) systemService).addView(frameLayout, layoutParams);
                vtL.A05 = true;
            } catch (WindowManager.BadTokenException e) {
                1Kn.A03("FullScreenCoordinator", e);
            }
        }
    }

    public C18521VtL(Context context) {
        this.A08 = context;
        Activity A002 = C18771W0t.A00(context);
        if (A002 != null) {
            this.A07 = A002;
            View A0A2 = C66581MXm.A0A(A002);
            C66580MXl.A1R(A0A2);
            this.A0B = (ViewGroup) A0A2;
            this.A0C = new FrameLayout(context);
            this.A03 = C16478UvY.A05;
            this.A0A = new RectF();
            this.A09 = new RectF();
            this.A0D = new ImageView(context);
            this.A06 = Pxf.A0G(A002).orientation;
            Window window = A002.getWindow();
            boolean z = true;
            this.A0F = (AnonymousClass7TF.A1P(window.getAttributes().flags & 1024) || AnonymousClass7TF.A1S(window.getDecorView().getSystemUiVisibility() & 4, 4)) ? false : z;
            this.A0E = AnonymousClass7TF.A1Q(C66581MXm.A0A(A002).getSystemUiVisibility() & 2);
            return;
        }
        throw new IllegalStateException("Rendering fullscreen without an activity");
    }
}
