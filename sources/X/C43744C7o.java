package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* renamed from: X.C7o  reason: case insensitive filesystem */
public final class C43744C7o extends C250663lr implements C250673ls {
    public final User A0E(1E6 r5) {
        Parcelable.Creator creator = User.CREATOR;
        return 1aC.A01(new 1E9(r5, AnonymousClass7TE.A1F(), false), (ImmutablePandoUserDict) reinterpret(ImmutablePandoUserDict.class));
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kz r5 = AnonymousClass4Kz.A00;
        return C41846B3n.A0M(C41845B3m.A0E(r5), C41845B3m.A0N(r5), C41845B3m.A0D(r5), AnonymousClass7TE.A0f(r5, C67009Mgh.A00()), AnonymousClass7TE.A0f(r5, PublicKeyCredentialControllerUtility.JSON_KEY_ID));
    }

    public C43744C7o(int i) {
        super(i);
    }

    public C43744C7o() {
        super(-508424204);
    }
}
