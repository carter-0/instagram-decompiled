package X;

import android.content.Context;
import com.instagram.api.schemas.ClipsTemplateBrowserV2Type;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.HoN  reason: case insensitive filesystem */
public final class C55840HoN {
    public final Context A00;
    public final AnonymousClass07i A01;
    public final ClipsTemplateBrowserV2Type A02;
    public final UserSession A03;
    public final String A04;
    public final Map A05 = AnonymousClass7TE.A1H();

    public C55840HoN(Context context, AnonymousClass07i r3, ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A00 = context;
        this.A01 = r3;
        this.A02 = clipsTemplateBrowserV2Type;
        this.A04 = str;
    }
}
