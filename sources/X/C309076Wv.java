package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;
import com.instagram.reels.viewer.attribution.model.ReelAttributionModel;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6Wv  reason: invalid class name and case insensitive filesystem */
public final class C309076Wv extends C308916We {
    public final Context A00;
    public final ReelHeaderAttributionType A01;
    public final C255773uh A02;
    public final C316276lO A03;
    public final C317126ml A04;
    public final String A05;
    public final List A06;

    public C309076Wv(Context context, AnonymousClass0iw r4, UserSession userSession, C255773uh r6, C316276lO r7, C317126ml r8) {
        super(r4, userSession, r6);
        this.A00 = context;
        this.A03 = r7;
        this.A02 = r6;
        this.A04 = r8;
        String string = context.getString(2131971766);
        0qQ.A07(string);
        this.A05 = string;
        ReelHeaderAttributionType reelHeaderAttributionType = ReelHeaderAttributionType.PUBLIC_COLLECTION;
        this.A01 = reelHeaderAttributionType;
        List singletonList = Collections.singletonList(new ReelAttributionModel(reelHeaderAttributionType));
        0qQ.A07(singletonList);
        this.A06 = singletonList;
    }
}
