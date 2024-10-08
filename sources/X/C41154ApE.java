package X;

import com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore;
import java.util.List;

/* renamed from: X.ApE  reason: case insensitive filesystem */
public final class C41154ApE implements Runnable {
    public final /* synthetic */ C369988ve A00;
    public final /* synthetic */ StoryDraftsStore A01;
    public final /* synthetic */ String A02;

    public C41154ApE(C369988ve r1, StoryDraftsStore storyDraftsStore, String str) {
        this.A01 = storyDraftsStore;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void run() {
        StoryDraftsStore storyDraftsStore = this.A01;
        List list = storyDraftsStore.A03;
        018.A1A(list, new MYK(this.A02, 23));
        C369988ve r4 = this.A00;
        list.add(0, r4);
        StoryDraftsStore.A01(storyDraftsStore);
        StoryDraftsStore.A02(storyDraftsStore, list);
        for (C362908ih r0 : storyDraftsStore.A04) {
            0qQ.A0B(r4, 0);
            r0.A00.A05.FIG(new C39866ACn(r4));
        }
    }
}
