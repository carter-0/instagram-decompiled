package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController;
import java.util.Iterator;
import java.util.List;

public final class M33 implements Runnable {
    public final /* synthetic */ ClipsTimelineActionBarViewController A00;

    public M33(ClipsTimelineActionBarViewController clipsTimelineActionBarViewController) {
        this.A00 = clipsTimelineActionBarViewController;
    }

    public final void run() {
        List list;
        ClipsTimelineActionBarViewController clipsTimelineActionBarViewController = this.A00;
        C62636KjH kjH = C62636KjH.A0f;
        C60422JlF jlF = clipsTimelineActionBarViewController.adapter;
        if (jlF != null && (list = jlF.A00) != null) {
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (((C61263Jzw) it.next()).A00 == kjH) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            int intValue = Integer.valueOf(i).intValue();
            if (intValue >= 0) {
                AnonymousClass52S r1 = new AnonymousClass52S(clipsTimelineActionBarViewController.A02.requireContext());
                r1.A00 = intValue;
                LinearLayoutManager linearLayoutManager = clipsTimelineActionBarViewController.linearLayoutManager;
                if (linearLayoutManager != null) {
                    linearLayoutManager.A0t(r1);
                }
            }
        }
    }
}
