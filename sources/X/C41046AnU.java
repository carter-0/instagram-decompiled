package X;

import com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.AnU  reason: case insensitive filesystem */
public final class C41046AnU implements Runnable {
    public final /* synthetic */ StoryDraftsStore A00;
    public final /* synthetic */ Set A01;

    public C41046AnU(StoryDraftsStore storyDraftsStore, Set set) {
        this.A00 = storyDraftsStore;
        this.A01 = set;
    }

    public final void run() {
        StoryDraftsStore storyDraftsStore = this.A00;
        List<C369988ve> list = storyDraftsStore.A03;
        018.A1A(list, new MP5(this.A01, 2));
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C369988ve A002 : list) {
            A0r.add(C369978vd.A00(A002));
        }
        Set A0k = 00k.A0k(A0r);
        0xY AR4 = storyDraftsStore.A02.A01.AR4();
        AR4.E5h("story_drafts", A0k);
        AR4.apply();
        StoryDraftsStore.A02(storyDraftsStore, list);
    }
}
