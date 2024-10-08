package X;

import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.IyD  reason: case insensitive filesystem */
public final class C58828IyD extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58828IyD(UserSession userSession, 1Xj r3, IntentAwareAdPivotState intentAwareAdPivotState, AnonymousClass3W1 r5, C230292pL r6, C54077Gz1 gz1, C230282pK r8, C227802jw r9, int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A04 = r9;
        this.A02 = r3;
        this.A08 = r5;
        this.A01 = i;
        this.A09 = userSession;
        this.A03 = gz1;
        this.A07 = r6;
        this.A05 = r8;
        this.A06 = intentAwareAdPivotState;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        C54077Gz1 gz1;
        C230282pK r2;
        IntentAwareAdPivotState intentAwareAdPivotState;
        Integer num;
        int i2 = this.A00;
        Object obj2 = this.A04;
        if (i2 != 0) {
            1Xj r22 = (1Xj) this.A02;
            i = this.A01;
            ((C227802jw) obj2).A0K(r22, (AnonymousClass3W1) this.A08, i);
            gz1 = (C54077Gz1) this.A03;
            I73.A04((UserSession) this.A09, r22, (C230292pL) this.A07, gz1);
            r2 = (C230282pK) this.A05;
            intentAwareAdPivotState = (IntentAwareAdPivotState) this.A06;
            num = AnonymousClass05K.A0C;
        } else {
            1Xj r23 = (1Xj) this.A02;
            i = this.A01;
            ((C227802jw) obj2).A0J(r23, (AnonymousClass3W1) this.A08, i);
            gz1 = (C54077Gz1) this.A03;
            I73.A04((UserSession) this.A09, r23, (C230292pL) this.A07, gz1);
            r2 = (C230282pK) this.A05;
            intentAwareAdPivotState = (IntentAwareAdPivotState) this.A06;
            num = AnonymousClass05K.A0N;
        }
        r2.A0F(intentAwareAdPivotState, gz1, num, i);
        return C60340gF.A00;
    }
}
