package X;

import android.view.View;
import com.instagram.android.R;

public final class FMs implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C314466iJ A01;

    public FMs(View view, C314466iJ r2) {
        this.A00 = view;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(254564271);
        View view2 = this.A00;
        C314466iJ r2 = this.A01;
        View findViewById = view2.findViewById(R.id.nux_banner);
        0qQ.A0A(findViewById);
        findViewById.setVisibility(8);
        r2.DUr();
        AnonymousClass0fD.A0C(2022752916, A05);
    }
}
