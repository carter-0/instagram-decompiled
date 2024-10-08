package X;

import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.Ife  reason: case insensitive filesystem */
public final class C57737Ife implements Runnable {
    public final /* synthetic */ C230302pO A00;

    public C57737Ife(C230302pO r1) {
        this.A00 = r1;
    }

    public final void run() {
        C230302pO r2 = this.A00;
        IntentAwareAdPivotState intentAwareAdPivotState = r2.A00;
        if (intentAwareAdPivotState != null) {
            intentAwareAdPivotState.A0B = true;
        }
        JOO joo = r2.A01;
        if (joo != null) {
            joo.EuM();
        }
    }
}
