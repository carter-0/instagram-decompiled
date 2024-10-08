package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.U9f  reason: case insensitive filesystem */
public final class C14790U9f extends AnonymousClass52S {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    public final int A08() {
        return -1;
    }

    public final int A0B(int i) {
        return 100;
    }

    public final int A0D(View view, int i) {
        0qQ.A0B(view, 0);
        int A0D = super.A0D(view, i);
        Resources resources = this.A00.getResources();
        boolean A002 = 1NN.A00(1NM.A00(this.A01));
        int i2 = R.dimen.abc_control_corner_material;
        if (A002) {
            i2 = R.dimen.audience_lists_text_in_badge_horizontal_margin_right;
        }
        return A0D + resources.getDimensionPixelSize(i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14790U9f(Context context, UserSession userSession) {
        super(context);
        this.A00 = context;
        this.A01 = userSession;
    }
}
