package X;

import com.instagram.common.session.UserSession;
import com.instagram.opal.impl.data.OpalEditRepository;
import com.instagram.opal.impl.data.OpalProfileData;
import com.instagram.user.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Dkj  reason: case insensitive filesystem */
public final class C46756Dkj extends 2YL {
    public final UserSession A00;
    public final OpalEditRepository A01;
    public final C46461DfP A02;
    public final User A03;
    public final 05G A04;
    public final AnonymousClass0Ud A05;

    public /* synthetic */ C46756Dkj(UserSession userSession, OpalEditRepository opalEditRepository) {
        C46461DfP dfP = new C46461DfP(userSession);
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = opalEditRepository;
        this.A02 = dfP;
        02z A10 = DbS.A10(new C61084JwM((OpalProfileData) null, (OpalProfileData) null, (C62520KhB) null, (DefaultConstructorMarker) null, 7, 49));
        this.A04 = A10;
        this.A05 = A10;
        this.A03 = AnonymousClass7TF.A0Q(userSession);
        C51647Fy6.A02(this, C318116oQ.A00(this), 2);
    }
}
