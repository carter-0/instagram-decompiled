package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6Wk  reason: invalid class name and case insensitive filesystem */
public final class C308976Wk extends C308916We {
    public static final ConcurrentHashMap A08 = new ConcurrentHashMap();
    public AnonymousClass5Gv A00;
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final C255773uh A03;
    public final C316276lO A04;
    public final C317126ml A05;
    public final String A06;
    public final Set A07 = 0sc.A07(new ReelHeaderAttributionType[]{ReelHeaderAttributionType.META_QUEST_ATTRIBUTION, ReelHeaderAttributionType.HORIZON_WORLDS_ATTRIBUTION, ReelHeaderAttributionType.WEARABLE_ATTRIBUTION});

    public C308976Wk(Context context, AnonymousClass0iw r9, UserSession userSession, C255773uh r11, C316276lO r12, C317126ml r13) {
        super(r9, userSession, r11);
        this.A01 = context;
        this.A04 = r12;
        this.A03 = r11;
        this.A05 = r13;
        this.A02 = r9;
        int ordinal = A01().ordinal();
        String str = "wearable";
        if (ordinal == 47) {
            str = "meta_quest";
        } else if (ordinal == 46) {
            str = "horizon_worlds";
        } else if (ordinal != 45 && ordinal == 54) {
            str = "iconic_entrypoints";
        }
        this.A06 = str;
    }
}
