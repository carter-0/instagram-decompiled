package X;

import com.instagram.common.session.UserSession;
import com.instagram.repository.storyhighlights.StoryHighlightsTrayManager$Instance;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.6yP  reason: invalid class name and case insensitive filesystem */
public final class C323976yP implements 02o {
    public final /* synthetic */ StoryHighlightsTrayManager$Instance A00;

    public C323976yP(StoryHighlightsTrayManager$Instance storyHighlightsTrayManager$Instance) {
        this.A00 = storyHighlightsTrayManager$Instance;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, AnonymousClass4D7 r12) {
        StoryHighlightsTrayManager$Instance storyHighlightsTrayManager$Instance;
        boolean z;
        Set<C317776no> set;
        C318776pV r11 = (C318776pV) obj;
        if (r11 instanceof C318766pU) {
            storyHighlightsTrayManager$Instance = this.A00;
            C318766pU r112 = (C318766pU) r11;
            AnonymousClass3HO r5 = r112.A00;
            z = r112.A01;
            C239753Ia A002 = r5.FH3();
            UserSession userSession = storyHighlightsTrayManager$Instance.A09.A00;
            1E4.A00(userSession);
            List<AnonymousClass3HX> A01 = AnonymousClass3P8.A01(userSession, r5.FH3());
            boolean z2 = storyHighlightsTrayManager$Instance.A07;
            ArrayList arrayList = new ArrayList();
            for (AnonymousClass3HX A0I : A01) {
                arrayList.add(1OP.A05(userSession).A0I(A0I, z2));
            }
            storyHighlightsTrayManager$Instance.A02 = false;
            storyHighlightsTrayManager$Instance.A01 = A002.A0E;
            set = storyHighlightsTrayManager$Instance.A06;
            for (C317776no DJS : set) {
                DJS.DJS(r5, arrayList, z);
            }
        } else if (r11 instanceof KXD) {
            storyHighlightsTrayManager$Instance = this.A00;
            z = ((KXD) r11).A01;
            storyHighlightsTrayManager$Instance.A02 = true;
            set = storyHighlightsTrayManager$Instance.A06;
            for (C317776no DJQ : set) {
                DJQ.DJQ(z);
            }
        } else {
            throw new RuntimeException();
        }
        if (z) {
            storyHighlightsTrayManager$Instance.A03 = false;
        } else {
            storyHighlightsTrayManager$Instance.A04 = false;
        }
        for (C317776no DJP : set) {
            DJP.DJP(z);
        }
        return C60340gF.A00;
    }
}
