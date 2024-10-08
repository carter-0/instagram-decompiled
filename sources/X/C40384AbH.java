package X;

import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;

/* renamed from: X.AbH  reason: case insensitive filesystem */
public final class C40384AbH implements B22 {
    public final /* synthetic */ StoryDraftsCreationViewModel A00;
    public final /* synthetic */ 0sP A01;
    public final /* synthetic */ 1IX A02;

    public final void DoK(C369988ve r6) {
        StoryDraftsCreationViewModel storyDraftsCreationViewModel = this.A00;
        storyDraftsCreationViewModel.A08.Epw(new AnonymousClass9I4(false, 1));
        storyDraftsCreationViewModel.A06.FIG(new C388279nZ(r6));
        storyDraftsCreationViewModel.A05.FIG(new C388279nZ(r6));
        this.A02.resumeWith(true);
        0sP r1 = this.A01;
        if (r1 != null) {
            String str = r6.A07;
            if (str == null) {
                str = "";
            }
            r1.invoke(str);
        }
        C365928nu A002 = C365918nt.A00(storyDraftsCreationViewModel.A03);
        A002.A01 = A002.A04.A02(518927515, A002.A01);
    }

    public final void onError(String str) {
        0qQ.A0B(str, 0);
        StoryDraftsCreationViewModel storyDraftsCreationViewModel = this.A00;
        storyDraftsCreationViewModel.A08.Epw(new AnonymousClass9I4(false, 1));
        storyDraftsCreationViewModel.A06.FIG(C388289na.A00);
        this.A02.resumeWith(false);
        C365928nu A002 = C365918nt.A00(storyDraftsCreationViewModel.A03);
        A002.A01 = A002.A04.A07(str, "", 518927515, A002.A01);
    }

    public C40384AbH(StoryDraftsCreationViewModel storyDraftsCreationViewModel, 0sP r2, 1IX r3) {
        this.A00 = storyDraftsCreationViewModel;
        this.A02 = r3;
        this.A01 = r2;
    }
}
