package X;

import android.content.DialogInterface;

public final class LV6 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C314496iM A00;
    public final /* synthetic */ C66455MSj A01;
    public final /* synthetic */ String A02;

    public LV6(C314496iM r1, C66455MSj mSj, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = mSj;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        0xY A0s;
        int i;
        C314496iM r3 = this.A00;
        String str = this.A02;
        int A002 = C314496iM.A00(r3, str) + 1;
        if (0qQ.A0K(str, "story_remix_reply")) {
            A0s = JTR.A0s(r3.A06);
            i = 2442;
        } else {
            if (0qQ.A0K(str, AnonymousClass000.A00(372))) {
                A0s = JTR.A0s(r3.A06);
                i = 2443;
            }
            JTO.A0E(r3.A05).postDelayed(new C65920M4j(this.A01), 500);
        }
        A0s.E5Z(C273654mx.A00(i), A002);
        A0s.apply();
        JTO.A0E(r3.A05).postDelayed(new C65920M4j(this.A01), 500);
    }
}
