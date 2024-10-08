package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class M6E implements Runnable {
    public final /* synthetic */ LRF A00;
    public final /* synthetic */ 1Av A01;

    public M6E(LRF lrf, 1Av r2) {
        this.A00 = lrf;
        this.A01 = r2;
    }

    public final void run() {
        LRF lrf = this.A00;
        1Av r7 = this.A01;
        IgImageView igImageView = lrf.A0C;
        if (igImageView.isActivated() && igImageView.isSelected()) {
            0s0 r6 = r7.A31;
            AnonymousClass0YZ[] r5 = 1Av.A8a;
            if (!AnonymousClass7TG.A1a(r7, r6, r5, 329)) {
                FragmentActivity requireActivity = lrf.A0A.requireActivity();
                Context context = igImageView.getContext();
                AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(requireActivity, AnonymousClass7TF.A0d(context.getResources(), 2131976525));
                A0f.A04(igImageView, 0, -AnonymousClass7TG.A06(context), true);
                A0f.A02();
                A0f.A00().A07(lrf.A0B);
                AnonymousClass7TF.A1J(r7, r6, r5, 329, true);
            }
        }
    }
}
