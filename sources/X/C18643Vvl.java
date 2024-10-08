package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;

/* renamed from: X.Vvl  reason: case insensitive filesystem */
public final class C18643Vvl {
    public ActionButton A00;
    public final 2da A01;
    public final F3V A02 = new F3V(AnonymousClass05K.A00);
    public final Context A03;

    public C18643Vvl(Context context, 2da r4) {
        0qQ.A0B(context, 1);
        this.A03 = context;
        this.A01 = r4;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Jbl, java.lang.Object] */
    public final void A01(View.OnClickListener onClickListener, Integer num) {
        2da r2 = this.A01;
        ? obj = new Object();
        obj.A01 = onClickListener;
        ActionButton ErM = r2.ErM(new C59904JbT(obj));
        this.A00 = ErM;
        ErM.setButtonResource(Tt3.A01(num));
        A02(false);
        ActionButton actionButton = this.A00;
        if (actionButton == null) {
            0qQ.A0F("actionButton");
            throw AnonymousClass00P.createAndThrow();
        } else {
            actionButton.setColorFilter(AnonymousClass37O.A00(DbV.A01(this.A03)));
        }
    }

    public final void A02(boolean z) {
        ActionButton actionButton = this.A00;
        if (actionButton != null) {
            actionButton.setEnabled(z);
            ActionButton actionButton2 = this.A00;
            if (actionButton2 != null) {
                Context context = this.A03;
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

    public final void A03(boolean z) {
        F3V f3v = this.A02;
        Context context = this.A03;
        int i = R.attr.igds_color_secondary_text;
        if (z) {
            i = R.attr.igds_color_primary_text;
        }
        f3v.A07 = AnonymousClass37O.A00(AnonymousClass7TF.A03(context, i));
        this.A01.ErJ(f3v.A00());
    }

    public static C18643Vvl A00(Fragment fragment, 2da r2) {
        return new C18643Vvl(fragment.requireContext(), r2);
    }
}
