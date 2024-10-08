package X;

import com.instagram.reels.storiestemplate.discovery.view.StoryTemplateDiscoverySurfaceFragment;

/* renamed from: X.MvL  reason: case insensitive filesystem */
public final class C67817MvL extends C231402rc {
    public final /* synthetic */ StoryTemplateDiscoverySurfaceFragment A00;

    public C67817MvL(StoryTemplateDiscoverySurfaceFragment storyTemplateDiscoverySurfaceFragment) {
        this.A00 = storyTemplateDiscoverySurfaceFragment;
    }

    public final void onItemRangeInserted(int i, int i2) {
        this.A00.logTemplateImpression();
    }
}
