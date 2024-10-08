package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import java.util.List;

/* renamed from: X.ICg  reason: case insensitive filesystem */
public final class C56783ICg implements View.OnClickListener {
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

    public C56783ICg(UserSession userSession, 1Xj r2, IntentAwareAdPivotState intentAwareAdPivotState, C54077Gz1 gz1, C230282pK r5, C53155GjR gjR, C227802jw r7, List list, int i, int i2) {
        this.A00 = i2;
        if (i2 != 0) {
            this.A04 = gz1;
            this.A09 = userSession;
            this.A05 = r7;
            this.A03 = r2;
            this.A02 = gjR;
            this.A08 = list;
            this.A07 = intentAwareAdPivotState;
        } else {
            this.A03 = r2;
            this.A09 = userSession;
            this.A05 = r7;
            this.A08 = list;
            this.A04 = gz1;
            this.A07 = intentAwareAdPivotState;
            this.A02 = gjR;
        }
        this.A06 = r5;
        this.A01 = i;
    }

    public final void onClick(View view) {
        int A052;
        int i;
        long j;
        if (this.A00 != 0) {
            A052 = AnonymousClass0fD.A05(747241324);
            AnonymousClass4I5 r1 = AnonymousClass59V.A00;
            C54077Gz1 gz1 = (C54077Gz1) this.A04;
            boolean A022 = r1.A02(Integer.valueOf(gz1.A00));
            0lg r3 = (0lg) this.A09;
            0Tu r2 = 0Tu.A06;
            if (A022) {
                j = 36875837588897870L;
            } else {
                j = 36875837585883213L;
            }
            String A042 = 182.A04(r2, r3, j);
            int hashCode = A042.hashCode();
            if (hashCode != -38695841) {
                if (hashCode == 0 && A042.equals("")) {
                    ((C227802jw) this.A05).A0H((1Xj) this.A03, (IntentAwareAdPivotState) this.A07, gz1, (List) this.A08);
                }
            } else if (A042.equals("cta_destination")) {
                ((C227802jw) this.A05).A0G((1Xj) this.A03);
                C238833Dp.A00(r3).A07(((C53155GjR) this.A02).A03, C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON, new String[0], 1);
            }
            ((C230282pK) this.A06).A0F((IntentAwareAdPivotState) this.A07, gz1, AnonymousClass05K.A00, this.A01);
            i = 1198948491;
        } else {
            A052 = AnonymousClass0fD.A05(1235635362);
            1Xj r4 = (1Xj) this.A03;
            if (!1sx.A0Q(r4, 0)) {
                if (182.A06(0Tu.A06, (0lg) this.A09, 36312887639016895L)) {
                    C54077Gz1 gz12 = (C54077Gz1) this.A04;
                    ((C227802jw) this.A05).A0H(r4, (IntentAwareAdPivotState) this.A07, gz12, (List) this.A08);
                    ((C230282pK) this.A06).A0F((IntentAwareAdPivotState) this.A07, (C54077Gz1) this.A04, AnonymousClass05K.A01, this.A01);
                    i = -633500550;
                }
            }
            ((C227802jw) this.A05).A0G(r4);
            C238833Dp.A00((0lg) this.A09).A07(((C53155GjR) this.A02).A03, C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON, new String[0], 1);
            ((C230282pK) this.A06).A0F((IntentAwareAdPivotState) this.A07, (C54077Gz1) this.A04, AnonymousClass05K.A01, this.A01);
            i = -633500550;
        }
        AnonymousClass0fD.A0C(i, A052);
    }
}
