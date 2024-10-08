package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.BrowserLiteFragment;
import java.util.List;

/* renamed from: X.Sbc  reason: case insensitive filesystem */
public final class C11515Sbc implements ViewTreeObserver.OnGlobalLayoutListener {
    public double A00;
    public int A01;
    public Point A02 = null;
    public boolean A03;
    public boolean A04;
    public final /* synthetic */ View A05;
    public final /* synthetic */ C11209SFj A06;
    public final /* synthetic */ List A07;

    public C11515Sbc(View view, C11209SFj sFj, List list) {
        this.A06 = sFj;
        this.A05 = view;
        this.A07 = list;
        this.A00 = sFj.A00;
    }

    public final void onGlobalLayout() {
        SRY sry;
        Rect A0W = AnonymousClass7TE.A0W();
        View view = this.A05;
        view.getWindowVisibleDisplayFrame(A0W);
        Point point = new Point();
        FragmentActivity fragmentActivity = this.A06.A01;
        fragmentActivity.getWindowManager().getDefaultDisplay().getSize(point);
        if (this.A02 == null) {
            this.A02 = point;
            return;
        }
        boolean z = true;
        boolean A1S = AnonymousClass7TF.A1S(Pxf.A0G(fragmentActivity).orientation, 2);
        if (A0W.height() >= point.y - 100) {
            z = false;
        }
        int height = view.getRootView().getHeight() - ((int) (((double) A0W.height()) * this.A00));
        if (!(z == this.A03 && A1S == this.A04 && height == this.A01)) {
            for (C10375RrC rrC : this.A07) {
                boolean z2 = this.A03;
                boolean z3 = this.A04;
                C11209SFj sFj = rrC.A01;
                BrowserLiteFragment browserLiteFragment = sFj.A02;
                if (browserLiteFragment != null) {
                    if (z && (sry = sFj.A04) != null) {
                        sry.A07(browserLiteFragment.A08, rrC.A00);
                    }
                    List<B3J> list = sFj.A02.A0n;
                    if (list != null) {
                        StringBuilder A012 = SSR.A01("onSoftKeyboardOrOrientationChanged");
                        for (B3J Dll : list) {
                            Dll.Dll(z2, height, z, z3, A1S);
                        }
                        SSR.A03(A012);
                    }
                }
            }
        }
        this.A01 = height;
        this.A03 = z;
        this.A04 = A1S;
    }
}
