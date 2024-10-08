package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;

public final class W0D {
    public ActionButton A00;
    public final 2da A01;
    public final Context A02;
    public final F3V A03 = new F3V(AnonymousClass05K.A00);

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Jbl, java.lang.Object] */
    public final void A02(View.OnClickListener onClickListener) {
        2da r2 = this.A01;
        ? obj = new Object();
        obj.A01 = onClickListener;
        ActionButton ErM = r2.ErM(new C59904JbT(obj));
        this.A00 = ErM;
        ErM.setButtonResource(R.drawable.instagram_check_pano_outline_24);
        A03(false);
        ActionButton actionButton = this.A00;
        if (actionButton != null) {
            actionButton.setColorFilter(AnonymousClass37O.A00(DbV.A01(this.A02)));
        } else {
            0qQ.A0F("actionButton");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static void A01(W0D w0d, Object obj, int i) {
        w0d.A02(new WBA(obj, i));
        w0d.A03(true);
    }

    public final void A03(boolean z) {
        ActionButton actionButton = this.A00;
        if (actionButton != null) {
            actionButton.setEnabled(z);
            ActionButton actionButton2 = this.A00;
            if (actionButton2 != null) {
                Context context = this.A02;
                int i = R.attr.igds_color_secondary_text;
                if (z) {
                    i = R.attr.igds_color_primary_text;
                }
                actionButton2.setColorFilter(AnonymousClass37O.A00(AnonymousClass7TF.A03(context, i)));
                return;
            }
        }
        0qQ.A0F("actionButton");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A04(boolean z) {
        F3V f3v = this.A03;
        Context context = this.A02;
        int i = R.attr.igds_color_secondary_text;
        if (z) {
            i = R.attr.igds_color_primary_text;
        }
        f3v.A07 = AnonymousClass37O.A00(AnonymousClass7TF.A03(context, i));
        2da r1 = this.A01;
        r1.ErJ(f3v.A00());
        r1.EVS(z);
    }

    public W0D(Context context, 2da r4) {
        this.A02 = context;
        this.A01 = r4;
    }

    public static W0D A00(Fragment fragment, 2da r2) {
        return new W0D(fragment.requireContext(), r2);
    }
}
