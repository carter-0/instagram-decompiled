package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;

public final class LMz {
    public static final C71392co A06 = C71392co.A03(5.0d, 10.0d);
    public final Handler A00 = AnonymousClass7TF.A0D();
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final MRD A04;
    public final Runnable A05 = new C65929M4s(this);

    public LMz(View view, View view2, MRD mrd) {
        this.A01 = view;
        ImageView A0J = DbX.A0J(view, R.id.type_indicator_icon);
        this.A03 = A0J;
        Context context = view.getContext();
        DbX.A12(context, A0J, 2Yu.A0B(context));
        this.A02 = view2;
        this.A04 = mrd;
    }
}
