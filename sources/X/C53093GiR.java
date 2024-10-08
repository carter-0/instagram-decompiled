package X;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.GiR  reason: case insensitive filesystem */
public final class C53093GiR extends C249403jg {
    public final /* synthetic */ IntentAwareAdPivotState A00;
    public final /* synthetic */ C54077Gz1 A01;
    public final /* synthetic */ AnonymousClass2pM A02;

    public C53093GiR(IntentAwareAdPivotState intentAwareAdPivotState, C54077Gz1 gz1, AnonymousClass2pM r3) {
        this.A00 = intentAwareAdPivotState;
        this.A02 = r3;
        this.A01 = gz1;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A0D = AnonymousClass7TG.A0D(recyclerView, -1864330349);
        if (i == 0) {
            IntentAwareAdPivotState intentAwareAdPivotState = this.A00;
            if (!intentAwareAdPivotState.A0A) {
                intentAwareAdPivotState.A0A = true;
                this.A02.A08.A0E(intentAwareAdPivotState, this.A01);
            }
            Handler handler = C55344HgC.A00;
            handler.removeCallbacksAndMessages((Object) null);
            handler.postDelayed(new C57846IhP(recyclerView, intentAwareAdPivotState), 200);
        }
        AnonymousClass0fD.A0A(-1308309969, A0D);
    }
}
