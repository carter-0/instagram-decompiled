package X;

import android.view.View;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.IBw  reason: case insensitive filesystem */
public final class C56773IBw implements View.OnClickListener {
    public final /* synthetic */ IntentAwareAdPivotState A00;
    public final /* synthetic */ C54077Gz1 A01;
    public final /* synthetic */ AnonymousClass2pM A02;
    public final /* synthetic */ C227802jw A03;

    public C56773IBw(IntentAwareAdPivotState intentAwareAdPivotState, C54077Gz1 gz1, AnonymousClass2pM r3, C227802jw r4) {
        this.A03 = r4;
        this.A01 = gz1;
        this.A02 = r3;
        this.A00 = intentAwareAdPivotState;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1903902487);
        C227802jw r1 = this.A03;
        C54077Gz1 gz1 = this.A01;
        r1.A0Q(gz1.getId());
        this.A02.A08.A0D(this.A00, gz1);
        AnonymousClass0fD.A0C(-1868745277, A05);
    }
}
