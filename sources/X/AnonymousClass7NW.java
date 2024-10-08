package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.HashSet;

/* renamed from: X.7NW  reason: invalid class name */
public final class AnonymousClass7NW implements AnonymousClass7NK {
    public final AnonymousClass5FV A00 = AnonymousClass5FV.GiftWrap;
    public final HashSet A01 = new HashSet();

    public final void ADP(C39752A7s a7s, AnonymousClass7NZ r4, String str, boolean z) {
        0qQ.A0B(a7s, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(r4, 2);
        View view = a7s.A02;
        0qQ.A0C(view, "null cannot be cast to non-null type com.facebook.xac.powerups.giftbox.GiftBoxOverlayView");
        U3N u3n = (U3N) view;
        u3n.setCornerRadiusPx(r4.A00);
        if (this.A01.contains(str)) {
            u3n.setVisibility(8);
        }
    }

    public final C39752A7s CrU(Context context, ShapeDrawable shapeDrawable, View view, ViewGroup viewGroup, ImageView imageView, AnonymousClass763 r15) {
        0qQ.A0B(context, 0);
        return new C39752A7s(shapeDrawable, (View) null, new U3N(context, C20721Wxu.A00), new U3C(context), (View) null, viewGroup, (ImageView) null, r15);
    }

    public final boolean D27(C39752A7s a7s, AnonymousClass7NZ r12, String str, boolean z) {
        0qQ.A0B(a7s, 0);
        0qQ.A0B(str, 1);
        ViewGroup viewGroup = a7s.A05;
        if (viewGroup != null) {
            HashSet hashSet = this.A01;
            if (!hashSet.contains(str)) {
                hashSet.add(str);
                View view = a7s.A02;
                0qQ.A0C(view, "null cannot be cast to non-null type com.facebook.xac.powerups.giftbox.GiftBoxOverlayView");
                U3N u3n = (U3N) view;
                View view2 = a7s.A03;
                0qQ.A0C(view2, "null cannot be cast to non-null type com.facebook.xac.powerups.giftbox.GiftBoxReleaseView");
                U3C u3c = (U3C) view2;
                u3c.setVisibility(0);
                u3c.A01 = new TYA(35, (Object) u3c, (Object) viewGroup);
                U12 u12 = u3n.A00;
                if (u12 == null) {
                    return false;
                }
                u12.setCallback((Drawable.Callback) null);
                u3n.A00 = null;
                u3n.removeCallbacks(u3n.A04);
                u3n.invalidate();
                viewGroup.setVisibility(0);
                viewGroup.addView(u3c);
                u12.setCallback(u3c);
                int[] iArr = new int[2];
                u3n.getLocationInWindow(iArr);
                Rect bounds = u12.getBounds();
                0qQ.A07(bounds);
                iArr[0] = iArr[0] + bounds.left;
                iArr[1] = iArr[1] + bounds.top;
                int[] iArr2 = new int[2];
                u3c.getLocationInWindow(iArr2);
                int i = iArr[0] - iArr2[0];
                int i2 = iArr[1] - iArr2[1];
                u12.setBounds(0, 0, bounds.width(), bounds.height());
                C17477VXe vXe = new C17477VXe(u12);
                C18573VuP vuP = vXe.A03;
                vuP.A05 = (float) i;
                vuP.A06 = (float) i2;
                vuP.A00 = (float) u12.getBounds().centerX();
                vuP.A01 = (float) u12.getBounds().centerY();
                C18619VvC vvC = vXe.A02;
                vvC.A09 = u3c.A03;
                vvC.A01 = u3c.A02;
                u3c.A07.add(vXe);
                u3c.invalidate();
                Runnable runnable = u3c.A06;
                u3c.removeCallbacks(runnable);
                if (u3c.getWindowToken() != null) {
                    u3c.postOnAnimation(runnable);
                }
                Context context = viewGroup.getContext();
                0qQ.A07(context);
                Object systemService = context.getSystemService("vibrator");
                0qQ.A0C(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                ((Vibrator) systemService).vibrate(VibrationEffect.createOneShot(50, 50));
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ void FIO(C39752A7s a7s, String str) {
    }

    public final AnonymousClass5FV CAI() {
        return this.A00;
    }

    public final boolean CQX(String str) {
        return !this.A01.contains(str);
    }
}
