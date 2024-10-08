package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.8PC  reason: invalid class name */
public final class AnonymousClass8PC implements C2365734g {
    public final /* synthetic */ C355048Oj A00;

    public AnonymousClass8PC(C355048Oj r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        C355048Oj r2 = this.A00;
        ((ImageView) view.findViewById(R.id.camera_ar_effect_image)).setImageResource(C338887ih.A00(r2.A0d));
        view.setContentDescription(r2.A0F.getString(2131961884));
        AnonymousClass3NG r1 = new AnonymousClass3NG(view);
        r1.A04 = new C369928vY(r2);
        r1.A05 = AnonymousClass05K.A01;
        r1.A00();
    }
}
