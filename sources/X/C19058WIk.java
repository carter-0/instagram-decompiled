package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.UIManagerHelper;
import java.lang.ref.WeakReference;

/* renamed from: X.WIk  reason: case insensitive filesystem */
public final class C19058WIk implements X2X {
    public Rect A00 = null;
    public C17318VQx A01;
    public WeakReference A02 = null;
    public boolean A03 = false;
    public final ViewGroup A04;
    public final boolean A05;

    public final void A00() {
        if (!this.A03) {
            this.A03 = true;
            ViewGroup viewGroup = this.A04;
            Q6H q6h = (Q6H) viewGroup.getContext();
            int id = viewGroup.getId();
            int i = 2;
            if (id % 2 != 0) {
                i = 1;
            }
            X9N A032 = UIManagerHelper.A03(q6h, i, true);
            0Sd.A00(A032);
            A032.addUIManagerEventListener(this);
        }
    }

    public final void A01() {
        if (this.A03) {
            this.A03 = false;
            ViewGroup viewGroup = this.A04;
            Q6H q6h = (Q6H) viewGroup.getContext();
            int i = 2;
            if (viewGroup.getId() % 2 != 0) {
                i = 1;
            }
            X9N A032 = UIManagerHelper.A03(q6h, i, true);
            0Sd.A00(A032);
            A032.removeUIManagerEventListener(this);
        }
    }

    public final void A02() {
        WeakReference weakReference;
        View view;
        ViewGroup viewGroup = this.A04;
        if (viewGroup.getId() % 2 != 0 && this.A01 != null && (weakReference = this.A02) != null && this.A00 != null && (view = (View) weakReference.get()) != null) {
            Rect rect = new Rect();
            view.getHitRect(rect);
            if (this.A05) {
                int i = rect.left - this.A00.left;
                if (i != 0) {
                    int scrollX = viewGroup.getScrollX();
                    X64 x64 = (X64) viewGroup;
                    x64.EKj(i + scrollX, viewGroup.getScrollY());
                    this.A00 = rect;
                    Integer num = this.A01.A01;
                    if (num != null && scrollX <= num.intValue()) {
                        x64.E65(0, viewGroup.getScrollY());
                        return;
                    }
                    return;
                }
                return;
            }
            int i2 = rect.top - this.A00.top;
            if (i2 != 0) {
                int scrollY = viewGroup.getScrollY();
                X64 x642 = (X64) viewGroup;
                x642.EKj(viewGroup.getScrollX(), i2 + scrollY);
                this.A00 = rect;
                Integer num2 = this.A01.A01;
                if (num2 != null && scrollY <= num2.intValue()) {
                    x642.E65(viewGroup.getScrollX(), 0);
                }
            }
        }
    }

    public final void willDispatchViewUpdates(X9N x9n) {
        C18773W0w.A01(new C19948WiL(this));
    }

    public C19058WIk(ViewGroup viewGroup, boolean z) {
        this.A04 = viewGroup;
        this.A05 = z;
    }
}
