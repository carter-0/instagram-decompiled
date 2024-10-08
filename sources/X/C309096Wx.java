package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;
import java.util.List;

/* renamed from: X.6Wx  reason: invalid class name and case insensitive filesystem */
public final class C309096Wx extends C308916We {
    public final Context A00;
    public final ReelHeaderAttributionType A01 = ReelHeaderAttributionType.HIGHLIGHTS_ATTRIBUTION;
    public final C255773uh A02;
    public final AnonymousClass3BQ A03;
    public final C316276lO A04;
    public final C317126ml A05;
    public final String A06 = "highlights";
    public final String A07;

    public static final String A00(C309096Wx r0) {
        C2801750l BDc;
        List AZX;
        C2801550j r02;
        String title;
        1Xj r03 = r0.A02.A0b;
        if (r03 == null || (BDc = r03.A0C.BDc()) == null || (AZX = BDc.AZX()) == null || (r02 = (C2801550j) 00k.A0J(AZX)) == null || (title = r02.getTitle()) == null) {
            return "";
        }
        return title;
    }

    public C309096Wx(Context context, AnonymousClass0iw r4, UserSession userSession, C255773uh r6, AnonymousClass3BQ r7, C316276lO r8, C317126ml r9) {
        super(r4, userSession, r6);
        this.A00 = context;
        this.A04 = r8;
        this.A02 = r6;
        this.A05 = r9;
        this.A03 = r7;
        String string = context.getString(2131971527, new Object[]{A00(this)});
        0qQ.A07(string);
        this.A07 = string;
    }
}
