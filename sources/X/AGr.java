package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.faceeffectui.NestableSnapPickerRecyclerView;

public final class AGr {
    public float A00 = -1.0f;
    public boolean A01;
    public final View A02;
    public final View A03;
    public final C357908a3 A04;
    public final AP6 A05 = new AP6(this);
    public final A6O A06;
    public final View A07;
    public final boolean A08;
    public final View[] A09;
    public final View[] A0A;

    public static final void A00(AGr aGr, float f) {
        View[] viewArr;
        int i;
        if (!aGr.A01) {
            viewArr = aGr.A09;
            i = 8;
        } else if (!aGr.A08) {
            float f2 = 1.0f - 0.33333334f;
            float f3 = 1.0f - 0.0f;
            float f4 = 0.0f;
            if (f2 != 0.0f) {
                f4 = (f - 0.33333334f) / f2;
            }
            float f5 = (f4 * f3) + 0.0f;
            viewArr = aGr.A09;
            for (View alpha : viewArr) {
                alpha.setAlpha(f5);
            }
            i = 0;
            if (f == 0.0f && aGr.A04.CcY()) {
                i = 4;
            }
        } else {
            return;
        }
        for (View visibility : viewArr) {
            visibility.setVisibility(i);
        }
    }

    public static final void A01(AGr aGr, float f) {
        View[] viewArr;
        int i;
        if (!aGr.A04.CcY()) {
            viewArr = aGr.A0A;
            i = 8;
        } else {
            float f2 = 0.6666666f - 0.0f;
            float f3 = 0.0f - 1.0f;
            float f4 = 0.0f;
            if (f2 != 0.0f) {
                f4 = (f - 0.0f) / f2;
            }
            float f5 = (f4 * f3) + 1.0f;
            viewArr = aGr.A0A;
            for (View alpha : viewArr) {
                alpha.setAlpha(f5);
            }
            i = 0;
            if (f == 1.0f) {
                i = 4;
            }
        }
        for (View visibility : viewArr) {
            visibility.setVisibility(i);
        }
    }

    public AGr(ViewGroup viewGroup, C357908a3 r5, AJ9 aj9, boolean z) {
        this.A08 = z;
        View A0G = AnonymousClass7TF.A0G(viewGroup, R.id.sticker_preview_view);
        this.A07 = A0G;
        View A0G2 = AnonymousClass7TF.A0G(viewGroup, R.id.lyrics_scrubber_view);
        this.A02 = A0G2;
        this.A04 = r5;
        NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView = aj9.A0M.A01.A0P;
        0qQ.A07(nestableSnapPickerRecyclerView);
        this.A0A = new View[]{A0G, nestableSnapPickerRecyclerView};
        this.A09 = new View[]{A0G2};
        this.A06 = aj9.A0N;
        this.A03 = viewGroup.requireViewById(R.id.sticker_edit_container);
    }
}
