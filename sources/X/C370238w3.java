package X;

import com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore;
import java.util.List;

/* renamed from: X.8w3  reason: invalid class name and case insensitive filesystem */
public final class C370238w3 implements Runnable {
    public final /* synthetic */ StoryDraftsStore A00;
    public final /* synthetic */ List A01;

    public C370238w3(StoryDraftsStore storyDraftsStore, List list) {
        this.A00 = storyDraftsStore;
        this.A01 = list;
    }

    public final void run() {
        StoryDraftsStore storyDraftsStore = this.A00;
        List A0g = 00k.A0g(this.A01, new C369338uO());
        List list = storyDraftsStore.A03;
        list.clear();
        list.addAll(A0g);
        StoryDraftsStore.A02(storyDraftsStore, A0g);
        StoryDraftsStore.A01(storyDraftsStore);
    }
}
