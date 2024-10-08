package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

public final class IDI implements View.OnLongClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ IntentAwareAdPivotState A03;
    public final /* synthetic */ C54077Gz1 A04;
    public final /* synthetic */ C230282pK A05;
    public final /* synthetic */ C55512Hiu A06;
    public final /* synthetic */ C227802jw A07;

    public IDI(UserSession userSession, 1Xj r2, IntentAwareAdPivotState intentAwareAdPivotState, C54077Gz1 gz1, C230282pK r5, C55512Hiu hiu, C227802jw r7, int i) {
        this.A01 = userSession;
        this.A04 = gz1;
        this.A07 = r7;
        this.A00 = i;
        this.A02 = r2;
        this.A03 = intentAwareAdPivotState;
        this.A06 = hiu;
        this.A05 = r5;
    }

    public final boolean onLongClick(View view) {
        UserSession userSession = this.A01;
        C54077Gz1 gz1 = this.A04;
        if (I7D.A06(userSession, gz1.A00)) {
            this.A07.A0L(this.A02, this.A06, this.A00);
        }
        this.A05.A0F(this.A03, gz1, AnonymousClass05K.A0j, this.A00);
        return true;
    }
}
