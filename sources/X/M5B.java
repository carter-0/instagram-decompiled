package X;

import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment;

public final class M5B implements Runnable {
    public final /* synthetic */ IgLiveWithGuestFragment A00;

    public M5B(IgLiveWithGuestFragment igLiveWithGuestFragment) {
        this.A00 = igLiveWithGuestFragment;
    }

    public final void run() {
        Window window;
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.addFlags(128);
        }
    }
}
