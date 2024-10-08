package X;

import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.Ixs  reason: case insensitive filesystem */
public final class C58807Ixs extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ IntentAwareAdPivotState A03;
    public final /* synthetic */ C230292pL A04;
    public final /* synthetic */ C54077Gz1 A05;
    public final /* synthetic */ C230282pK A06;
    public final /* synthetic */ C227802jw A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58807Ixs(UserSession userSession, 1Xj r3, IntentAwareAdPivotState intentAwareAdPivotState, C230292pL r5, C54077Gz1 gz1, C230282pK r7, C227802jw r8, int i) {
        super(1);
        this.A07 = r8;
        this.A02 = r3;
        this.A01 = userSession;
        this.A05 = gz1;
        this.A04 = r5;
        this.A06 = r7;
        this.A03 = intentAwareAdPivotState;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C227802jw r0 = this.A07;
        1Xj r2 = this.A02;
        r0.A0G(r2);
        UserSession userSession = this.A01;
        C54077Gz1 gz1 = this.A05;
        I73.A04(userSession, r2, this.A04, gz1);
        this.A06.A0F(this.A03, gz1, AnonymousClass05K.A01, this.A00);
        return C60340gF.A00;
    }
}
