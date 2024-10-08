package X;

import android.animation.Animator;
import android.view.View;
import com.instagram.android.R;
import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.ui.widget.spinner.RefreshSpinner;

public final class FHI implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;

    public final void onAnimationRepeat(Animator animator) {
    }

    public FHI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onAnimationCancel(Animator animator) {
        if (5 - this.A00 == 0) {
            ((C50422FbV) this.A01).A00.setVisibility(8);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        String str;
        int i;
        View view;
        switch (this.A00) {
            case 0:
                C47468E3r e3r = (C47468E3r) this.A01;
                AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse = (AvatarCoinFlipBackgroundOptionResponse) DbZ.A0J(((C46368Ddk) e3r.A0I.getValue()).A06).A03;
                if (avatarCoinFlipBackgroundOptionResponse != null) {
                    str = avatarCoinFlipBackgroundOptionResponse.A03;
                } else {
                    str = null;
                }
                if (0qQ.A0K(str, "Gray")) {
                    i = 2Yu.A0H(e3r.getContext(), R.attr.igds_color_creation_tools_grey_06);
                } else {
                    i = R.color.canvas_bottom_sheet_description_text_color;
                }
                RefreshSpinner refreshSpinner = e3r.A06;
                if (refreshSpinner != null) {
                    DbU.A14(e3r.requireContext(), refreshSpinner, i);
                }
                AnonymousClass7TF.A16(e3r.A06);
                return;
            case 1:
                C47468E3r.A02((C47468E3r) this.A01);
                return;
            case 2:
                return;
            case 3:
                Dbc.A0n((C47468E3r) this.A01);
                return;
            case 4:
                C49538ExN exN = (C49538ExN) this.A01;
                AnonymousClass61R r1 = exN.A01;
                view = exN.A00;
                if (view != null && r1 != null) {
                    r1.pause();
                    r1.EL2(0.0f);
                    break;
                } else {
                    return;
                }
                break;
            default:
                view = ((C50422FbV) this.A01).A00;
                break;
        }
        view.setVisibility(8);
    }

    public final void onAnimationStart(Animator animator) {
        if (2 - this.A00 == 0) {
            Dbc.A0n((C47468E3r) this.A01);
        }
    }
}
