package X;

import android.content.Context;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.86C  reason: invalid class name */
public final class AnonymousClass86C extends C228042kh {
    public final Context A00;
    public final AnonymousClass86B A01;
    public final AnonymousClass848 A02;
    public final UserSession A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    public AnonymousClass86C(Context context, AnonymousClass86B r3, AnonymousClass848 r4, UserSession userSession, String str, List list, boolean z) {
        0qQ.A0B(r4, 2);
        this.A03 = userSession;
        this.A02 = r4;
        this.A00 = context;
        this.A05 = list;
        this.A04 = str;
        this.A01 = r3;
        this.A06 = z;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A03;
        Context context = this.A00;
        MiniGalleryService miniGalleryService = new MiniGalleryService(context, C311766dD.A00(context, userSession), userSession);
        AnonymousClass848 r3 = this.A02;
        C311756dC A002 = C311746dB.A00(context, userSession);
        List list = this.A05;
        return new AnonymousClass86D(this.A01, miniGalleryService, r3, A002, userSession, this.A04, list, this.A06);
    }
}
