package X;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.instagram.android.R;

/* renamed from: X.Vju  reason: case insensitive filesystem */
public class C18018Vju {
    public int A00 = 8388611;
    public View A01;
    public PopupWindow.OnDismissListener A02;
    public WDW A03;
    public C20936X5e A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final PopupWindow.OnDismissListener A09 = new LZL(this, 0);
    public final C18932WDk A0A;
    public final boolean A0B;

    public void A01() {
        this.A03 = null;
        PopupWindow.OnDismissListener onDismissListener = this.A02;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final WDW A00() {
        WDW wdw = this.A03;
        if (wdw == null) {
            Context context = this.A08;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                wdw = new C14734U5w(context, this.A01, this.A06, this.A07, this.A0B);
            } else {
                wdw = new C14735U5x(context, this.A01, this.A0A, this.A06, this.A07, this.A0B);
            }
            C18932WDk wDk = this.A0A;
            boolean z = wdw instanceof C14735U5x;
            if (!z) {
                C14734U5w u5w = (C14734U5w) wdw;
                wDk.A07(u5w.A0H, u5w);
                if (u5w.Cc6()) {
                    C14734U5w.A00(u5w, wDk);
                } else {
                    u5w.A0L.add(wDk);
                }
            }
            PopupWindow.OnDismissListener onDismissListener = this.A09;
            if (z) {
                ((C14735U5x) wdw).A05 = onDismissListener;
            } else {
                ((C14734U5w) wdw).A08 = onDismissListener;
            }
            View view = this.A01;
            if (z) {
                ((C14735U5x) wdw).A02 = view;
            } else {
                C14734U5w u5w2 = (C14734U5w) wdw;
                if (u5w2.A05 != view) {
                    u5w2.A05 = view;
                    u5w2.A00 = Gravity.getAbsoluteGravity(u5w2.A02, view.getLayoutDirection());
                }
            }
            wdw.EQJ(this.A04);
            wdw.A02(this.A05);
            int i = this.A00;
            if (z) {
                ((C14735U5x) wdw).A01 = i;
            } else {
                C14734U5w u5w3 = (C14734U5w) wdw;
                if (u5w3.A02 != i) {
                    u5w3.A02 = i;
                    u5w3.A00 = Gravity.getAbsoluteGravity(i, u5w3.A05.getLayoutDirection());
                }
            }
            this.A03 = wdw;
        }
        return wdw;
    }

    public C18018Vju(Context context, View view, C18932WDk wDk, int i, int i2, boolean z) {
        this.A08 = context;
        this.A0A = wDk;
        this.A01 = view;
        this.A0B = z;
        this.A06 = i;
        this.A07 = i2;
    }
}
