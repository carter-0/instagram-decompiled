package X;

import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

public final class H8Y extends C230372pW {
    public final UserSession A00;
    public final AnonymousClass4DU A01;

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        SavedCollection savedCollection = (SavedCollection) obj;
        C53368Gms gms = (C53368Gms) obj2;
        AnonymousClass7TG.A1N(savedCollection, gms);
        UserSession userSession = this.A00;
        0Aj A0N = C51972G9s.A0N(this.A01, userSession);
        if (A0N.isSampled()) {
            String str = savedCollection.A0F;
            0qQ.A07(str);
            A0N.A9F("entity_id", AnonymousClass7TE.A10(str));
            A0N.AAJ("collection_id", savedCollection.A0F);
            A0N.AAJ("position", C320166rs.A00(gms.A01, gms.A00));
            A0N.AAJ("collection_name", savedCollection.A0G);
            A0N.AAJ("collection_type", savedCollection.A02());
            C51973G9u.A14(A0N, "user_type", I35.A01(savedCollection.A01(userSession)));
            G9w.A17(A0N);
        }
    }

    public H8Y(1Bk r1, UserSession userSession, AnonymousClass4DU r3) {
        super(r1);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
    }
}
