package X;

import android.app.Activity;

/* renamed from: X.9UJ  reason: invalid class name */
public final class AnonymousClass9UJ implements C295005nO {
    public final /* synthetic */ AnonymousClass8WJ A00;
    public final /* synthetic */ String A01;

    public AnonymousClass9UJ(AnonymousClass8WJ r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onFinish() {
        AnonymousClass8WJ r4 = this.A00;
        AnonymousClass4DH r3 = r4.A0C;
        0hq r1 = r3.mFragmentManager;
        if (r1 == null) {
            0kD.A07("createExitAnimationOnFinishListener", "Null fragmentManager", (Throwable) null);
            return;
        }
        C71342cb.A00(r4.A0D).A0D(r3, this.A01, r1.A0M());
        r4.A0B.setAlpha(0.0f);
        Activity activity = r4.A08;
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }
}
