package X;

import com.instagram.api.schemas.MediaCroppingCoordinates;
import kotlin.Deprecated;

@Deprecated(message = "See ClipsPublishScreenViewModel")
/* renamed from: X.Jhl  reason: case insensitive filesystem */
public final class C60228Jhl extends 2YL {
    public MediaCroppingCoordinates A00;
    public final C319836rJ A01;
    public final AnonymousClass2Fj A02 = JTO.A0K();

    public C60228Jhl(C319836rJ r2) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
    }

    public final void A00(MediaCroppingCoordinates mediaCroppingCoordinates) {
        this.A00 = mediaCroppingCoordinates;
        this.A01.A01("PROFILE_CROP_COORDINATES_KEY", mediaCroppingCoordinates);
        this.A02.A0B(mediaCroppingCoordinates);
    }
}
