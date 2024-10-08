package X;

import android.view.ViewStub;
import com.instagram.android.R;

public abstract class OSO {
    public static final int[] A00 = {R.id.bottom_context, R.id.megaphone_social_context_facepile, R.id.megaphone_social_context_text, R.id.button_placeholder};

    public static final void A00(ViewStub viewStub, AnonymousClass91K r3, C69017Nct nct) {
        0qQ.A0B(r3, 2);
        viewStub.setLayoutResource(R.layout.generic_v3_megaphone);
        viewStub.setOnInflateListener(new C71440Okf(0, r3, nct));
    }
}
