package X;

import com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore;
import java.util.List;

/* renamed from: X.ApF  reason: case insensitive filesystem */
public final class C41155ApF implements Runnable {
    public final /* synthetic */ C369988ve A00;
    public final /* synthetic */ StoryDraftsStore A01;
    public final /* synthetic */ boolean A02;

    public C41155ApF(C369988ve r1, StoryDraftsStore storyDraftsStore, boolean z) {
        this.A01 = storyDraftsStore;
        this.A00 = r1;
        this.A02 = z;
    }

    public final void run() {
        StoryDraftsStore storyDraftsStore = this.A01;
        List list = storyDraftsStore.A03;
        C369988ve r2 = this.A00;
        list.remove(r2);
        list.add(new C369988ve(r2.A02, r2.A03, r2.A04, r2.A07, r2.A08, r2.A05, r2.A06, r2.A00, r2.A01, this.A02));
        StoryDraftsStore.A01(storyDraftsStore);
        StoryDraftsStore.A02(storyDraftsStore, list);
    }
}
