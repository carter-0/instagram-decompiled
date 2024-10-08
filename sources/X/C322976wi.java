package X;

import com.instagram.common.session.UserSession;
import com.instagram.repository.storyhighlights.StoryHighlightsTrayManager$Instance;
import java.util.Map;

/* renamed from: X.6wi  reason: invalid class name and case insensitive filesystem */
public final class C322976wi {
    public final StoryHighlightsTrayManager$Instance A00(UserSession userSession, String str) {
        0qQ.A0B(str, 0);
        0qQ.A0B(userSession, 1);
        C322966wh r2 = (C322966wh) userSession.A01(C322966wh.class, new C377209Ky(userSession, 6));
        Map map = r2.A01;
        StoryHighlightsTrayManager$Instance storyHighlightsTrayManager$Instance = (StoryHighlightsTrayManager$Instance) map.get(str);
        if (storyHighlightsTrayManager$Instance != null) {
            return storyHighlightsTrayManager$Instance;
        }
        StoryHighlightsTrayManager$Instance storyHighlightsTrayManager$Instance2 = new StoryHighlightsTrayManager$Instance(r2, str);
        map.put(str, storyHighlightsTrayManager$Instance2);
        return storyHighlightsTrayManager$Instance2;
    }
}
