package X;

import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Oiz  reason: case insensitive filesystem */
public final class C71349Oiz implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass7IS A01;
    public final /* synthetic */ C314466iJ A02;
    public final /* synthetic */ 2Er A03;

    public C71349Oiz(View view, AnonymousClass7IS r2, C314466iJ r3, 2Er r4) {
        this.A00 = view;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1493048632);
        View view2 = this.A00;
        C314466iJ r2 = this.A02;
        View findViewById = view2.findViewById(R.id.nux_banner);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            C48827Ekp.A00(findViewById);
            r2.DUr();
        }
        this.A01.A00(this.A03.BJz(), false);
        AnonymousClass0fD.A0C(1473433932, A05);
    }
}
