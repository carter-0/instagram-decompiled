package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;

public final class KEZ extends C228042kh {
    public final C3515589i A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final MusicProduct A03;
    public final AnonymousClass4DH A04;
    public final UserSession A05;
    public final C60329JjY A06;

    public KEZ(C3515589i r2, ImmutableList immutableList, ImmutableList immutableList2, MusicProduct musicProduct, AnonymousClass4DH r6, UserSession userSession, C60329JjY jjY) {
        AnonymousClass7TF.A1E(userSession, 2, jjY);
        this.A04 = r6;
        this.A05 = userSession;
        this.A03 = musicProduct;
        this.A02 = immutableList;
        this.A01 = immutableList2;
        this.A00 = r2;
        this.A06 = jjY;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        AnonymousClass4DH r5 = this.A04;
        UserSession userSession = this.A05;
        MusicProduct musicProduct = this.A03;
        return new C60330JjZ(this.A00, this.A02, this.A01, musicProduct, r5, userSession, this.A06);
    }
}
