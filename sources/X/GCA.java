package X;

import android.os.Bundle;
import android.view.View;
import java.util.List;

public final class GCA extends C252233om {
    public final List A00 = AnonymousClass7TE.A1C();

    public final void A00(C52050GCw gCw) {
        0qQ.A0B(gCw, 0);
        this.A00.add(gCw);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        for (C52050GCw onViewCreated : this.A00) {
            onViewCreated.onViewCreated(view, bundle);
        }
    }

    public final void onDestroyView() {
        for (C52050GCw onDestroyView : this.A00) {
            onDestroyView.onDestroyView();
        }
    }

    public final void onPause() {
        for (C52050GCw onPause : this.A00) {
            onPause.onPause();
        }
    }

    public final void onResume() {
        for (C52050GCw onResume : this.A00) {
            onResume.onResume();
        }
    }
}
