package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;
import java.util.ArrayList;

/* renamed from: X.GIm  reason: case insensitive filesystem */
public final class C52195GIm {
    public static final C52195GIm A00 = new Object();

    public final 2WX A00(Context context, boolean z) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        int i = R.dimen.action_bar_item_spacing_left;
        if (z) {
            i = R.dimen.abc_button_padding_horizontal_material;
        }
        int[] iArr = {0, dimensionPixelSize2, dimensionPixelSize, resources.getDimensionPixelSize(i)};
        ArrayList arrayList = new ArrayList(4);
        int i2 = 0;
        do {
            arrayList.add(new 2Wd(((long) iArr[i2]) | 9221401712017801216L));
            i2++;
        } while (i2 < 4);
        2WX r4 = 2WX.A02;
        2WX r7 = r4;
        2Wd r1 = (2Wd) 00k.A0O(arrayList, 0);
        2Wd r10 = (2Wd) 00k.A0O(arrayList, 1);
        2Wd r9 = (2Wd) 00k.A0O(arrayList, 2);
        2Wd r8 = (2Wd) 00k.A0O(arrayList, 3);
        2WX r5 = null;
        if (r1 != null) {
            r4 = new 2WX((2WX) null, new AnonymousClass9JR(AnonymousClass05K.A0u, 0, r1.A00));
        }
        if (r10 != null) {
            AnonymousClass9JR r2 = new AnonymousClass9JR(AnonymousClass05K.A15, 0, r10.A00);
            if (r4 == r7) {
                r4 = null;
            }
            r4 = new 2WX(r4, r2);
        }
        if (r9 != null) {
            AnonymousClass9JR r12 = new AnonymousClass9JR(AnonymousClass05K.A1F, 0, r9.A00);
            if (r4 == r7) {
                r4 = null;
            }
            r4 = new 2WX(r4, r12);
        }
        if (r8 == null) {
            return r4;
        }
        AnonymousClass9JR r0 = new AnonymousClass9JR(AnonymousClass05K.A1I, 0, r8.A00);
        if (r4 != r7) {
            r5 = r4;
        }
        return new 2WX(r5, r0);
    }
}
