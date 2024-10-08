package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Jo6  reason: case insensitive filesystem */
public final class C60597Jo6 extends C249703kE {
    public C323716xz A00;
    public final View A01;

    public C60597Jo6(View view) {
        super(view);
        View A0G = AnonymousClass7TF.A0G(view, R.id.loading_spinner);
        this.A01 = A0G;
        Context context = view.getContext();
        if (context != null) {
            C323716xz A002 = C63297Kug.A00(context, true);
            this.A00 = A002;
            A0G.setBackground(A002);
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
