package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.7zY  reason: invalid class name and case insensitive filesystem */
public final class C349077zY extends C349087zZ {
    public final /* synthetic */ TargetViewSizeProvider A00;
    public final /* synthetic */ C349067zX A01;

    public final int A02(C252553pI r4, int i, int i2) {
        0qQ.A0B(r4, 0);
        View A03 = A03(r4);
        if (A03 == null) {
            return -1;
        }
        int A06 = C252553pI.A06(A03);
        int max = Math.max(0, A06 - 1);
        int min = Math.min(A06 + 1, r4.A0U() - 1);
        boolean z = this.A01.A09;
        if (i < 0) {
            if (z) {
                return min;
            }
            return max;
        } else if (z) {
            return max;
        }
        return min;
    }

    public C349077zY(TargetViewSizeProvider targetViewSizeProvider, C349067zX r2) {
        this.A01 = r2;
        this.A00 = targetViewSizeProvider;
    }

    public final View A03(C252553pI r8) {
        View A03 = super.A03(r8);
        if ((r8 instanceof LinearLayoutManager) && A03 != null) {
            int i = A09(A03, r8)[0];
            if (Integer.valueOf(i) != null) {
                View A1D = r8.A1D(0);
                if (A1D != null) {
                    int width = A09(A1D, r8)[0] + ((((NineSixteenLayoutConfigImpl) this.A00).A0K.getWidth() - A1D.getMeasuredWidth()) / 4);
                    if (Integer.valueOf(width) != null && Math.abs(width) < Math.abs(i)) {
                        return A1D;
                    }
                }
                View A1D2 = r8.A1D(r8.A0U() - 1);
                if (A1D2 != null) {
                    int width2 = A09(A1D2, r8)[0] - ((((NineSixteenLayoutConfigImpl) this.A00).A0K.getWidth() - A1D2.getMeasuredWidth()) / 4);
                    if (Integer.valueOf(width2) == null || Math.abs(width2) >= Math.abs(i)) {
                        return A03;
                    }
                    return A1D2;
                }
            }
        }
        return A03;
    }
}
