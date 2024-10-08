package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jlu  reason: case insensitive filesystem */
public final class C60462Jlu extends AnonymousClass3B3 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r16) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        AnonymousClass3AW r0 = r16;
        C51974G9v.A1O(rect, view, recyclerView, r0);
        super.getItemOffsets(rect, view, recyclerView, r0);
        int A032 = RecyclerView.A03(view);
        2Rw r02 = recyclerView.A0A;
        if (r02 != null) {
            i = r02.getItemCount();
        } else {
            i = 0;
        }
        int i7 = this.A03;
        int i8 = i % i7;
        int i9 = i / i7;
        if (i8 != 0) {
            i9++;
        }
        int i10 = this.A01;
        if (i10 == 0) {
            i2 = A032 / i7;
            i3 = A032 % i7;
        } else {
            i2 = A032 % i7;
            i3 = A032 / i7;
        }
        int i11 = 0;
        boolean A1Q = AnonymousClass7TF.A1Q(i2);
        boolean A1Q2 = AnonymousClass7TF.A1Q(i3);
        int i12 = i7 - 1;
        int i13 = i12;
        if (i10 == 0) {
            i12 = i9 - 1;
        }
        boolean A1S = AnonymousClass7TF.A1S(i2, i12);
        int i14 = i9 - 1;
        if (i10 == 0) {
            i14 = i13;
        }
        boolean A1S2 = AnonymousClass7TF.A1S(i3, i14);
        if (A1Q) {
            i4 = 0;
        } else {
            i4 = this.A00 / 2;
        }
        if (!A1S) {
            i5 = this.A00 / 2;
        } else {
            i5 = 0;
        }
        if (A1Q2) {
            i6 = this.A02 / 2;
        } else {
            i6 = 0;
        }
        if (!A1S2) {
            i11 = this.A02 / 2;
        }
        if (i10 != 0) {
            int i15 = this.A00;
            rect.left = (i15 * i2) / i7;
            rect.top = i6;
            rect.right = (i15 * (i7 - (i2 + 1))) / i7;
        } else {
            rect.left = i4;
            int i16 = this.A02;
            rect.top = (i16 * i3) / i7;
            rect.right = i5;
            i11 = (i16 * (i7 - (i3 + 1))) / i7;
        }
        rect.bottom = i11;
    }

    public C60462Jlu(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }
}
