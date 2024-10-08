package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Dom  reason: case insensitive filesystem */
public final class C46994Dom extends C249703kE {
    public final Context A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;

    public C46994Dom(View view) {
        super(view);
        this.A00 = AnonymousClass7TE.A0S(view);
        this.A03 = DbX.A0Z(view, R.id.address_button_title);
        this.A02 = DbX.A0Z(view, R.id.address_button_subtitle);
        this.A01 = DbX.A0Z(view, R.id.primary_address_label);
    }
}
