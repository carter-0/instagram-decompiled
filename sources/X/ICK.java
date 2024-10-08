package X;

import android.view.View;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import java.util.List;

public final class ICK implements View.OnClickListener {
    public final /* synthetic */ IntentAwareAdPivotState A00;
    public final /* synthetic */ C54077Gz1 A01;
    public final /* synthetic */ AnonymousClass2pM A02;
    public final /* synthetic */ C227802jw A03;
    public final /* synthetic */ List A04;

    public ICK(IntentAwareAdPivotState intentAwareAdPivotState, C54077Gz1 gz1, AnonymousClass2pM r3, C227802jw r4, List list) {
        this.A03 = r4;
        this.A04 = list;
        this.A01 = gz1;
        this.A00 = intentAwareAdPivotState;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(8269811);
        C227802jw r4 = this.A03;
        List list = this.A04;
        C54077Gz1 gz1 = this.A01;
        IntentAwareAdPivotState intentAwareAdPivotState = this.A00;
        r4.A0H((1Xj) 00k.A0I(list), intentAwareAdPivotState, gz1, list);
        this.A02.A08.A0C(intentAwareAdPivotState, gz1);
        AnonymousClass0fD.A0C(949914761, A05);
    }
}
