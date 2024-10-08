package X;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import com.instagram.android.R;

/* renamed from: X.5sk  reason: invalid class name and case insensitive filesystem */
public final class C298025sk {
    public final float A00;
    public final int A01;
    public final int A02;
    public final boolean A03;

    public final int A00(int i, float f) {
        if (!this.A03 || 2eL.A06(i, 255) != this.A01) {
            return i;
        }
        float f2 = this.A00;
        float f3 = 0.0f;
        if (f2 > 0.0f && f > 0.0f) {
            f3 = Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return 2eL.A06(C18108Vlc.A00(f3, 2eL.A06(i, 255), this.A02), Color.alpha(i));
    }

    public C298025sk(Context context) {
        int i;
        int i2;
        boolean z = false;
        TypedValue A022 = C298035sl.A02(context, R.attr.elevationOverlayEnabled);
        if (!(A022 == null || A022.type != 18 || A022.data == 0)) {
            z = true;
        }
        this.A03 = z;
        TypedValue A023 = C298035sl.A02(context, R.attr.elevationOverlayColor);
        if (A023 != null) {
            i = A023.data;
        } else {
            i = 0;
        }
        this.A02 = i;
        TypedValue A024 = C298035sl.A02(context, R.attr.colorSurface);
        if (A024 != null) {
            i2 = A024.data;
        } else {
            i2 = 0;
        }
        this.A01 = i2;
        this.A00 = context.getResources().getDisplayMetrics().density;
    }
}
