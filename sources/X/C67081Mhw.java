package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.Mhw  reason: case insensitive filesystem */
public final class C67081Mhw implements View.OnClickListener {
    public final /* synthetic */ C66934MfT A00;

    public C67081Mhw(C66934MfT mfT) {
        this.A00 = mfT;
    }

    public final void onClick(View view) {
        Activity rootActivity;
        int A05 = AnonymousClass0fD.A05(-696369357);
        AnonymousClass4DH r1 = this.A00.A04;
        if (r1.isResumed() && (rootActivity = r1.getRootActivity()) != null) {
            rootActivity.onBackPressed();
        }
        AnonymousClass0fD.A0C(267015673, A05);
    }
}
