package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ViS  reason: case insensitive filesystem */
public final class C17937ViS {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final UserSession A05;
    public final C358088aL A06;
    public final C17215VMt A07;
    public final List A08 = new ArrayList();
    public final List A09;
    public final boolean A0A;

    public C17937ViS(Context context, UserSession userSession, C358088aL r9, C17215VMt vMt, int i, int i2, int i3, int i4, boolean z) {
        int dimensionPixelOffset;
        int dimensionPixelOffset2;
        this.A04 = context;
        this.A05 = userSession;
        this.A06 = r9;
        this.A02 = i;
        this.A03 = i2;
        this.A07 = vMt;
        this.A01 = i4;
        this.A0A = z;
        List A012 = C347067wD.A01(userSession, r9);
        this.A09 = A012;
        this.A00 = i3;
        if (A012.isEmpty()) {
            0kD.A07("SecondaryPickerAdapter", "Items should not be empty.", (Throwable) null);
        }
        int size = A012.size();
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = this.A01;
            int i7 = i5 / i6;
            int i8 = i5 % i6;
            float f = ((float) i8) * ((float) this.A02);
            if (!this.A0A) {
                dimensionPixelOffset = 0;
            } else {
                dimensionPixelOffset = this.A04.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material) * i8;
            }
            float f2 = f + ((float) dimensionPixelOffset);
            float f3 = ((float) i7) * ((float) this.A02);
            if (!this.A0A) {
                dimensionPixelOffset2 = 0;
            } else {
                dimensionPixelOffset2 = this.A04.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material) * i7;
            }
            float f4 = f3 + ((float) dimensionPixelOffset2);
            C347117wI r1 = (C347117wI) 00k.A0O(this.A09, i5);
            if (r1 != null) {
                C17574VaS vaS = new C17574VaS(this, f2, f4, i5, r1.A01, r1.A00);
                if (i5 == this.A00) {
                    vaS.A04.setItemViewState(true);
                }
                this.A08.add(vaS);
            }
        }
    }

    public final C17574VaS A00(int i) {
        if (i < 0) {
            return null;
        }
        List list = this.A08;
        if (i < list.size()) {
            return (C17574VaS) list.get(i);
        }
        return null;
    }
}
