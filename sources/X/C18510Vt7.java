package X;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Vt7  reason: case insensitive filesystem */
public final class C18510Vt7 {
    public int A00;
    public AnimatorSet A01;
    public final int A02;
    public final int A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final View A08;

    public C18510Vt7(C307266Pl r3, int i) {
        String str;
        0qQ.A0B(r3, 1);
        this.A00 = i;
        View view = r3.A0B.getView();
        this.A05 = view;
        View view2 = r3.A01;
        if (view2 != null) {
            this.A06 = view2;
            View view3 = r3.A02;
            if (view3 != null) {
                this.A07 = view3;
                this.A08 = r3.A0A;
                this.A04 = r3.A09;
                Resources resources = view.getResources();
                this.A03 = resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
                this.A02 = resources.getDimensionPixelSize(R.dimen.album_rounded_corner_overlay_padding);
                return;
            }
            str = "endSceneOverlay";
        } else {
            str = "endSceneContainer";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(C18510Vt7 vt7) {
        View view = vt7.A05;
        view.setVisibility(8);
        view.setAlpha(1.0f);
        vt7.A07.setAlpha(0.0f);
        View view2 = vt7.A06;
        view2.setAlpha(0.0f);
        view2.setTranslationY((float) vt7.A03);
    }
}
