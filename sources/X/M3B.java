package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.creation.fragment.AlbumEditFragment;

public final class M3B implements Runnable {
    public final /* synthetic */ AlbumEditFragment A00;

    public M3B(AlbumEditFragment albumEditFragment) {
        this.A00 = albumEditFragment;
    }

    public final void run() {
        AlbumEditFragment albumEditFragment = this.A00;
        if (albumEditFragment.getActivity() != null && albumEditFragment.isVisible()) {
            C273514mi r0 = albumEditFragment.A0N;
            if (r0 == null) {
                0qQ.A0F("provider");
                throw AnonymousClass00P.createAndThrow();
            }
            View findViewById = r0.BQ1().findViewById(R.id.feed_creation_filter_button);
            if (findViewById != null) {
                findViewById.post(new M70(findViewById, albumEditFragment));
            }
        }
    }
}
