package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CompoundButton;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgCheckBox;

public final class NMT extends C14097Tpp {
    public final /* synthetic */ C307786Rm A00;

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        IgCheckBox igCheckBox = new IgCheckBox(context);
        DbU.A11(this.A00.A00, igCheckBox, R.drawable.bridged_checkbox_selector);
        igCheckBox.setButtonDrawable((Drawable) null);
        igCheckBox.setGravity(17);
        igCheckBox.setClickable(false);
        igCheckBox.setFocusable(false);
        igCheckBox.setFocusableInTouchMode(false);
        return igCheckBox;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NMT(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r5, C276544tV r6, Object obj) {
        CompoundButton compoundButton = (CompoundButton) view;
        AnonymousClass7TF.A1B(compoundButton, 0, r6);
        boolean A0R = r6.A0R(36, false);
        boolean A0R2 = r6.A0R(35, false);
        compoundButton.setEnabled(!A0R);
        compoundButton.setChecked(A0R2);
        if (A0R2) {
            return null;
        }
        float f = 1.0f;
        if (A0R) {
            f = 0.3f;
        }
        compoundButton.setAlpha(f);
        Drawable background = compoundButton.getBackground();
        int i = 255;
        if (A0R) {
            i = 77;
        }
        background.setAlpha(i);
        return null;
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r2, C276544tV r3, Object obj, Object obj2) {
    }
}
