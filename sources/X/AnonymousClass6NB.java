package X;

import android.view.View;
import android.widget.RelativeLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.6NB  reason: invalid class name */
public final class AnonymousClass6NB implements C2365734g {
    public final /* synthetic */ AnonymousClass6NA A00;

    public AnonymousClass6NB(AnonymousClass6NA r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        AnonymousClass6NA r1 = this.A00;
        RelativeLayout relativeLayout = (RelativeLayout) view.requireViewById(R.id.netego_ig_consent_layout);
        0qQ.A0B(relativeLayout, 0);
        r1.A00 = relativeLayout;
        IgTextView requireViewById = view.requireViewById(R.id.title);
        0qQ.A0B(requireViewById, 0);
        r1.A02 = requireViewById;
        IgTextView requireViewById2 = view.requireViewById(R.id.top_text);
        0qQ.A0B(requireViewById2, 0);
        r1.A03 = requireViewById2;
        IgTextView requireViewById3 = view.requireViewById(R.id.bottom_text);
        0qQ.A0B(requireViewById3, 0);
        r1.A01 = requireViewById3;
    }
}
