package X;

import android.content.DialogInterface;
import instagram.features.stories.fragment.ReelViewerFragment;

public final /* synthetic */ class I93 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ ReelViewerFragment A00;

    public /* synthetic */ I93(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.A00.CpD();
    }
}
