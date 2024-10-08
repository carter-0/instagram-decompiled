package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Mym  reason: case insensitive filesystem */
public final class C68020Mym extends C249703kE {
    public AnonymousClass7L0 A00;
    public final View A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final C70649OEw A05;

    public C68020Mym(View view) {
        super(view);
        this.A01 = view;
        this.A04 = DbX.A0Z(view, R.id.title);
        this.A02 = DbX.A0Z(view, R.id.cta);
        this.A03 = DbX.A0Z(view, R.id.live_pill);
        this.A05 = new C70649OEw(view);
    }
}
