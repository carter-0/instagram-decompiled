package X;

import android.app.Application;
import androidx.paging.PageFetcher;
import androidx.paging.PagingConfig;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class HJG extends C52963GgG {
    public ArrayList A00 = AnonymousClass7TE.A1C();
    public AnonymousClass0r6 A01 = A00(this);
    public final UserSession A02;
    public final C55474HiI A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HJG(Application application, C54429HDb hDb, UserSession userSession, C55474HiI hiI, C62037KWw kWw, HM8 hm8) {
        super(application, (TrackOrOriginalSoundSchema) null, hDb, userSession, kWw, hm8, (String) null, (String) null);
        AnonymousClass7TG.A0w(1, application, hDb, kWw);
        this.A03 = hiI;
        this.A02 = userSession;
    }

    public static final AnonymousClass0r6 A00(HJG hjg) {
        UserSession userSession = hjg.A02;
        0qQ.A0B(userSession, 0);
        return LGl.A01(C318116oQ.A00(hjg), new C58028IkL(11, hjg, new PageFetcher(new PagingConfig(5, 5, 15, false), new C58081IlI(new GW6(userSession, 45), (AnonymousClass4D7) null, 1)).A03));
    }
}
