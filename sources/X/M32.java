package X;

import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController;
import com.instagram.creation.capture.quickcapture.sundial.edit.stacked.actionbar.ClipsTimelineActionBarRecyclerView;
import java.util.List;

public final class M32 implements Runnable {
    public final /* synthetic */ ClipsTimelineActionBarViewController A00;

    public M32(ClipsTimelineActionBarViewController clipsTimelineActionBarViewController) {
        this.A00 = clipsTimelineActionBarViewController;
    }

    public final void run() {
        List<C61263Jzw> list;
        ClipsTimelineActionBarRecyclerView clipsTimelineActionBarRecyclerView;
        C249703kE A0W;
        ClipsTimelineActionBarViewController clipsTimelineActionBarViewController = this.A00;
        C62636KjH kjH = C62636KjH.A0f;
        C60422JlF jlF = clipsTimelineActionBarViewController.adapter;
        if (jlF != null && (list = jlF.A00) != null) {
            int i = 0;
            for (C61263Jzw jzw : list) {
                if (jzw.A00 != kjH) {
                    i++;
                } else if (i >= 0 && (clipsTimelineActionBarRecyclerView = clipsTimelineActionBarViewController.actionBarRecyclerView) != null && (A0W = clipsTimelineActionBarRecyclerView.A0W(i)) != null) {
                    AnonymousClass4DH r0 = clipsTimelineActionBarViewController.A02;
                    AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(r0.requireActivity(), r0.requireActivity().getText(2131955859).toString());
                    A0f.A02();
                    A0f.A03(JTO.A0F(A0W));
                    A0f.A0B = false;
                    A0f.A04 = new KSO(clipsTimelineActionBarViewController, 2);
                    A0f.A00().A07(clipsTimelineActionBarViewController.A03);
                    return;
                } else {
                    return;
                }
            }
        }
    }
}
