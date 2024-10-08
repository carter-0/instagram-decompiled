package X;

import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService;
import com.instagram.common.session.UserSession;

public final class KEO extends C228042kh {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public KEO(MiniGalleryService miniGalleryService, AnonymousClass86D r2, UserSession userSession, String str, String str2, int i) {
        this.A00 = i;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = userSession;
        this.A01 = miniGalleryService;
        this.A02 = r2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        if (this.A00 != 0) {
            String str = this.A04;
            String str2 = this.A05;
            return new C60298Jiw((MiniGalleryService) this.A01, (AnonymousClass86D) this.A02, (UserSession) this.A03, str, str2);
        }
        String str3 = this.A04;
        return new C60287Jij((MiniGalleryService) this.A01, (AnonymousClass86D) this.A02, (UserSession) this.A03, str3);
    }
}
