package X;

import android.view.View;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.ICa  reason: case insensitive filesystem */
public final class C56777ICa implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ IntentAwareAdPivotState A02;
    public final /* synthetic */ C54077Gz1 A03;
    public final /* synthetic */ C230282pK A04;
    public final /* synthetic */ C55512Hiu A05;
    public final /* synthetic */ C227802jw A06;

    public C56777ICa(1Xj r1, IntentAwareAdPivotState intentAwareAdPivotState, C54077Gz1 gz1, C230282pK r4, C55512Hiu hiu, C227802jw r6, int i) {
        this.A06 = r6;
        this.A00 = i;
        this.A01 = r1;
        this.A02 = intentAwareAdPivotState;
        this.A05 = hiu;
        this.A04 = r4;
        this.A03 = gz1;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-2110439225);
        C227802jw r2 = this.A06;
        int i = this.A00;
        1Xj r1 = this.A01;
        IntentAwareAdPivotState intentAwareAdPivotState = this.A02;
        r2.A0L(r1, this.A05, i);
        this.A04.A0F(intentAwareAdPivotState, this.A03, AnonymousClass05K.A0u, i);
        AnonymousClass0fD.A0C(-665244645, A052);
    }
}
