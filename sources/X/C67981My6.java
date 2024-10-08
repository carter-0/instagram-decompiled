package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.My6  reason: case insensitive filesystem */
public final class C67981My6 extends C249703kE {
    public final IgLinearLayout A00;
    public final IgTextView A01;
    public final IgTextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67981My6(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = JTO.A0X(view, R.id.title);
        this.A02 = JTO.A0X(view, R.id.url);
        this.A00 = (IgLinearLayout) view.findViewById(R.id.meta_ai_hcm_sources_list_item);
    }
}
