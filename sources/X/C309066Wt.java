package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;
import com.instagram.reels.viewer.attribution.model.ReelAttributionModel;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6Wt  reason: invalid class name and case insensitive filesystem */
public final class C309066Wt extends C308916We {
    public final Context A00;
    public final UserSession A01;
    public final ReelHeaderAttributionType A02;
    public final C255773uh A03;
    public final C316276lO A04;
    public final C317126ml A05;
    public final String A06;
    public final List A07;

    public C309066Wt(Context context, AnonymousClass0iw r4, UserSession userSession, C255773uh r6, C316276lO r7, C317126ml r8) {
        super(r4, userSession, r6);
        this.A00 = context;
        this.A04 = r7;
        this.A03 = r6;
        this.A05 = r8;
        this.A01 = userSession;
        String string = context.getString(2131973610);
        0qQ.A07(string);
        this.A06 = string;
        ReelHeaderAttributionType reelHeaderAttributionType = ReelHeaderAttributionType.EXPLORE_SHAREABLE_GRID;
        this.A02 = reelHeaderAttributionType;
        List singletonList = Collections.singletonList(new ReelAttributionModel(reelHeaderAttributionType));
        0qQ.A07(singletonList);
        this.A07 = singletonList;
    }
}
