package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.repository.mediafeed.FeaturedProductsMediaFeedRepository;

/* renamed from: X.UhJ  reason: case insensitive filesystem */
public final class C15712UhJ extends C228042kh {
    public final Bundle A00;
    public final UserSession A01;
    public final C16509Uw6 A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        C16509Uw6 uw6 = this.A02;
        Bundle bundle = this.A00;
        boolean A1U = AnonymousClass7TF.A1U(0, userSession, uw6);
        if (uw6.ordinal() != 0) {
            throw new IllegalStateException("unsupported ShoppingMediaFeedEntryPoint type");
        } else if (bundle != null) {
            return new C60157Jgc(AnonymousClass1Nd.A00(userSession), new FeaturedProductsMediaFeedRepository(userSession, JTP.A0m(bundle, "media_id"), bundle.getString("parent_media_id"), bundle.getBoolean(AnonymousClass000.A00(785), A1U)));
        } else {
            throw new IllegalStateException("FeaturedProductsMediaFeedRepository requires extra arguments");
        }
    }

    public C15712UhJ(Bundle bundle, UserSession userSession, C16509Uw6 uw6) {
        AnonymousClass7TG.A1O(userSession, uw6);
        this.A01 = userSession;
        this.A02 = uw6;
        this.A00 = bundle;
    }
}
