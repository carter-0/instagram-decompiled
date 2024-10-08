package X;

import android.app.Activity;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.DhZ  reason: case insensitive filesystem */
public final class C46593DhZ implements C252213ok {
    public final /* synthetic */ AnonymousClass3M3 A00;

    public C46593DhZ(AnonymousClass3M3 r1) {
        this.A00 = r1;
    }

    public final void DMr(int i, boolean z) {
        int A0G;
        AnonymousClass3M3 r3 = this.A00;
        ImmutableMap immutableMap = AnonymousClass3M3.A0U;
        if (r3.mView != null && r3.getRootActivity() != null && r3.getRootActivity().getWindow() != null) {
            boolean A1S = AnonymousClass7TF.A1S(r3.getRootActivity().getWindow().getAttributes().softInputMode & 240, 16);
            if (!AnonymousClass3M3.A06(r3) && A1S && 0nA.A0x(r3.getRootActivity())) {
                if (r3.A0A.A0l) {
                    Activity rootActivity = r3.getRootActivity();
                    if (rootActivity == null) {
                        A0G = 0;
                    } else {
                        A0G = 2Yu.A0G(rootActivity, 0Pn.A01(r3.A0D));
                    }
                    i -= A0G;
                }
                0nA.A0X(r3.mView, Math.max(i, 0));
            }
        }
    }
}
