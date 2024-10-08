package X;

import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.4Yt  reason: invalid class name and case insensitive filesystem */
public final class C266404Yt extends AnonymousClass4X8 implements SurfaceHolder.Callback {
    public A4W A00;
    public final Surface A01;
    public final SurfaceView A02;
    public final View A03;
    public final UserSession A04;
    public final boolean A05;
    public final boolean A06;
    public final Handler A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C266404Yt(android.view.SurfaceView r5, com.instagram.common.session.UserSession r6, X.AnonymousClass4M1 r7, int r8, boolean r9) {
        /*
            r4 = this;
            r2 = 1
            r0 = 3
            X.0qQ.A0B(r5, r0)
            r4.<init>(r7, r8)
            r4.A04 = r6
            r4.A02 = r5
            r4.A06 = r9
            X.0Tu r3 = X.0Tu.A05
            r0 = 36316246295646380(0x81056f000710ac, double:3.0298786189285074E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 == 0) goto L_0x0069
            X.0eM r0 = X.C63553Kz2.A00
            java.lang.Object r0 = r0.getValue()
            android.os.HandlerThread r0 = (android.os.HandlerThread) r0
            android.os.Looper r1 = r0.getLooper()
            if (r1 != 0) goto L_0x0030
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            X.0qQ.A07(r1)
        L_0x0030:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
        L_0x0035:
            r4.A07 = r0
            r0 = 42
            X.9Ku r1 = new X.9Ku
            r1.<init>(r4, r0)
            java.lang.String r0 = "SurfaceVideoViewController.init()"
            X.AnonymousClass4X9.A00(r0, r1)
            r4.A03 = r5
            android.view.SurfaceHolder r0 = r5.getHolder()
            android.view.Surface r0 = r0.getSurface()
            r1 = 1
            if (r0 == 0) goto L_0x0067
            boolean r0 = r0.isValid()
            if (r0 != r2) goto L_0x0067
        L_0x0056:
            r4.A05 = r1
            if (r1 == 0) goto L_0x0065
            android.view.SurfaceHolder r0 = r5.getHolder()
            android.view.Surface r0 = r0.getSurface()
        L_0x0062:
            r4.A01 = r0
            return
        L_0x0065:
            r0 = 0
            goto L_0x0062
        L_0x0067:
            r1 = 0
            goto L_0x0056
        L_0x0069:
            r0 = 36316246295580843(0x81056f000610ab, double:3.0298786188870616E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 == 0) goto L_0x0079
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L_0x0030
        L_0x0079:
            r0 = 0
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C266404Yt.<init>(android.view.SurfaceView, com.instagram.common.session.UserSession, X.4M1, int, boolean):void");
    }

    public final void A05(C242423Ua r8) {
        ViewGroup viewGroup;
        super.A05(r8);
        A4W a4w = this.A00;
        if (a4w != null && !0qQ.A0K(a4w.A00, false) && (r8 instanceof View)) {
            View view = (View) r8;
            ViewParent parent = view.getParent();
            Object obj = null;
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                0kx r2 = new 0kx(viewGroup);
                while (true) {
                    if (!r2.hasNext()) {
                        break;
                    }
                    Object next = r2.next();
                    if (next instanceof IgImageView) {
                        obj = next;
                        break;
                    }
                }
                View view2 = (View) obj;
                if (view2 != null) {
                    viewGroup.removeView(view2);
                    viewGroup.addView(view2, viewGroup.indexOfChild(view) + 1);
                    a4w.A00 = false;
                    view2.getWidth();
                    view2.getHeight();
                }
            }
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        A00(this, new C377349Lm((Object) this, i2, i3, 5));
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        0qQ.A0B(surfaceHolder, 0);
        AnonymousClass4X9.A00("SurfaceVideoViewController.surfaceCreated()", new AnonymousClass9M1(37, surfaceHolder, this));
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        0qQ.A0B(surfaceHolder, 0);
        A00(this, new AnonymousClass9M1(39, surfaceHolder, this));
    }

    public static final void A00(C266404Yt r1, C62320sa r2) {
        Handler handler = r1.A07;
        if (handler != null) {
            handler.post(new C45988DHr(r2));
        } else {
            r2.invoke();
        }
    }
}
