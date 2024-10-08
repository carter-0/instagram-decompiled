package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class KOJ extends LSR {
    public final UserSession A00;
    public final KO2 A01;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(C66245MKg.A00);
    public final AnonymousClass0r6 A03;
    public final 05G A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KOJ(UserSession userSession, KO2 ko2) {
        super(ko2);
        0qQ.A0B(userSession, 2);
        this.A01 = ko2;
        this.A00 = userSession;
        02z A10 = DbS.A10(new JVH((NewFundraiserInfo) null, (ExistingStandaloneFundraiserForFeedModel) null, (String) null, (List) null, (List) null, (DefaultConstructorMarker) null, 31, 2));
        this.A04 = A10;
        this.A03 = A10;
    }
}
