package X;

import android.os.Parcelable;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

public final class C8P extends C250663lr implements C250673ls {
    public final User A0E(1E6 r5) {
        Parcelable.Creator creator = User.CREATOR;
        return 1aC.A01(new 1E9(r5, AnonymousClass7TE.A1F(), false), (ImmutablePandoUserDict) reinterpret(ImmutablePandoUserDict.class));
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
        return AnonymousClass7TG.A0U(r4, C41845B3m.A0E(r4), AnonymousClass7TE.A0f(r4, AnonymousClass9NE.A01(52, 8, 53)), "profile_pic_url");
    }

    public C8P(int i) {
        super(i);
    }

    public C8P() {
        super(632736148);
    }
}
