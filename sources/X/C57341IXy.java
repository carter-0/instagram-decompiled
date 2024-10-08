package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.IXy  reason: case insensitive filesystem */
public final class C57341IXy implements AnonymousClass4LR {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C57341IXy(UserSession userSession, 1L5 r2, int i) {
        this.A00 = i;
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final Map Bay(String str) {
        C230432pc r7;
        1L5 r4;
        AnonymousClass5CL r6;
        AnonymousClass5CO r5;
        int i;
        int i2 = this.A00;
        UserSession userSession = (UserSession) this.A02;
        switch (i2) {
            case 0:
                r7 = C230432pc.CLIPS;
                break;
            case 1:
                r7 = C230432pc.EXPLORE;
                break;
            case 2:
                r7 = C230432pc.EXPLORE_GRID;
                break;
            case 3:
                r7 = C230432pc.FEED;
                break;
            case 4:
                r7 = C230432pc.STORIES;
                r4 = (1L5) this.A01;
                AnonymousClass7TF.A1D(userSession, 0, r4);
                r6 = new AnonymousClass5CL(r7);
                r5 = new AnonymousClass5CO(userSession, r4, "seen_sponsored_reels", "seen_organic_reels");
                i = 32;
                break;
            case 5:
                r7 = C230432pc.STORIES;
                break;
            default:
                r7 = C230432pc.PROFILE_FEED;
                break;
        }
        r4 = (1L5) this.A01;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r4, 2);
        r6 = new AnonymousClass5CL(r7);
        r5 = null;
        i = 48;
        return new AnonymousClass5CM(userSession, r4, r5, r6, r7, i).AUO(str);
    }
}
