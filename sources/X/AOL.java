package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.ui.base.IgSimpleImageView;

public final class AOL implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C355148Ov A02;
    public final /* synthetic */ C324426zG A03;

    public AOL(Context context, C355148Ov r2, C324426zG r3, int i) {
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = i;
        this.A01 = context;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1328039262);
        C355148Ov r4 = this.A02;
        IgSimpleImageView igSimpleImageView = this.A03.A03;
        int i = this.A00;
        Context context = this.A01;
        0qQ.A0A(context);
        r4.showAsDropDown(igSimpleImageView, i, C61380mr.A01(context, -64));
        AnonymousClass0fD.A0C(-832784051, A05);
    }
}
