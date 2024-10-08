package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;
import java.util.List;

/* renamed from: X.6Wd  reason: invalid class name and case insensitive filesystem */
public final class C308906Wd extends C308916We {
    public String A00;
    public List A01;
    public final Context A02;
    public final ReelHeaderAttributionType A03 = ReelHeaderAttributionType.MULTIPLE_LISTS_ATTRIBUTION;
    public final C255773uh A04;
    public final C316276lO A05;
    public final C317126ml A06;
    public final String A07;

    public C308906Wd(Context context, AnonymousClass0iw r3, UserSession userSession, C255773uh r5, C316276lO r6, C317126ml r7) {
        super(r3, userSession, r5);
        this.A02 = context;
        this.A05 = r6;
        this.A04 = r5;
        this.A06 = r7;
        String string = context.getString(2131971666);
        0qQ.A07(string);
        this.A07 = string;
    }
}
