package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;

public final class UDG extends C249703kE {
    public final Context A00;
    public final IgProgressImageView A01;
    public final C19514Wb0 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDG(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = AnonymousClass7TE.A0S(view);
        this.A02 = new C19514Wb0(view, R.id.photo);
        this.A01 = (IgProgressImageView) AnonymousClass7TF.A0F(view, R.id.photo);
    }
}
