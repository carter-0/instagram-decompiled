package X;

import android.view.View;
import com.instagram.android.R;

public final class UDT extends C249703kE {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDT(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A03 = view;
        this.A02 = AnonymousClass7TF.A0G(view, R.id.title_placeholder);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.subtitle_placeholder);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.button_placeholder);
    }
}
