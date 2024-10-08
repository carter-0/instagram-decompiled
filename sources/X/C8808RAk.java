package X;

import androidx.fragment.app.Fragment;
import com.instagram.android.R;

/* renamed from: X.RAk  reason: case insensitive filesystem */
public final class C8808RAk extends R8b implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "FBPayAuthIgContainerFragment";

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        Fragment A0P = getChildFragmentManager().A0P(R.id.container_fragment);
        if (A0P instanceof QCG) {
            r5.Etr(true);
            r5.Eu4(true);
            int i = 2131962151;
            if (C11431STx.A03()) {
                i = 2131966478;
            }
            String string = A0P.getString(i);
            if (string != null) {
                r5.setTitle(string);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        r5.Etr(false);
    }
}
