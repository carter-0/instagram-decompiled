package X;

import com.instagram.autoplay.models.AutoplayConfigRoot;
import com.instagram.autoplay.models.AutoplayConfiguration;
import com.instagram.autoplay.models.AutoplayCustomization;
import com.instagram.autoplay.models.AutoplayGlobalConfig;
import com.instagram.autoplay.models.AutoplayLayout;
import com.instagram.autoplay.models.AutoplayWhichVideos;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Tub  reason: case insensitive filesystem */
public final class C14349Tub implements X6I {
    public final AutoplayConfigRoot Atw() {
        AutoplayGlobalConfig autoplayGlobalConfig = new AutoplayGlobalConfig(0, 1, 2, true, 100, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION, 15000, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION);
        AutoplayLayout autoplayLayout = AutoplayLayout.UNKNOWN;
        List singletonList = Collections.singletonList(new AutoplayCustomization("local_2", 2, 1, 0, AutoplayWhichVideos.Companion.getFocused()));
        0qQ.A07(singletonList);
        List singletonList2 = Collections.singletonList(new AutoplayConfiguration(autoplayLayout, singletonList, 100, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION));
        0qQ.A07(singletonList2);
        return new AutoplayConfigRoot(autoplayGlobalConfig, singletonList2);
    }

    public final boolean BAr() {
        throw AnonymousClass00P.createAndThrow();
    }
}
