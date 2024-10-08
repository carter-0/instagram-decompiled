package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.7zf  reason: invalid class name and case insensitive filesystem */
public final class C349147zf implements View.OnLayoutChangeListener {
    public final /* synthetic */ C349067zX A00;

    public C349147zf(C349067zX r1) {
        this.A00 = r1;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        view.removeOnLayoutChangeListener(this);
        int i10 = -1;
        while (true) {
            C349067zX r4 = this.A00;
            int i11 = r4.A00;
            if (i10 < i11) {
                LinearLayoutManager linearLayoutManager = r4.A05;
                if (linearLayoutManager.A1D(i11) == null) {
                    i9 = linearLayoutManager.A1b();
                    if (i9 <= i10) {
                        return;
                    }
                } else {
                    i9 = r4.A00;
                }
                i10 = i9;
                View A1D = linearLayoutManager.A1D(i9);
                if (A1D != null) {
                    int[] A09 = r4.A06.A09(A1D, linearLayoutManager);
                    r4.A07.scrollBy(A09[0], A09[1]);
                }
            } else {
                return;
            }
        }
    }
}
