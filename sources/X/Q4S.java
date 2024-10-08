package X;

import android.app.Activity;
import java.util.LinkedHashSet;
import java.util.Set;

public final class Q4S implements Runnable {
    public final /* synthetic */ AnonymousClass37F A00;

    public Q4S(AnonymousClass37F r1) {
        this.A00 = r1;
    }

    public final void run() {
        String str = "failed to pop backstack";
        AnonymousClass37F r5 = this.A00;
        0hq r2 = (0hq) r5.A0x.get();
        if (r2 == null) {
            0wb.A03("BottomSheetNavigator:null_frag_manager", "FragmentManager is null onFinish");
            return;
        }
        if (!r2.A12()) {
            try {
                if (r5.A13) {
                    r2.A19("BottomSheetConstants.FRAGMENT_TAG", 1);
                } else {
                    r2.A13();
                }
            } catch (IllegalArgumentException | IllegalStateException e) {
                String message = e.getMessage();
                if (message != null) {
                    str = message;
                }
                0wb.A03("BottomSheetNavigator:popBackStackImmediate", str);
            } catch (ClassCastException e2) {
                String message2 = e2.getMessage();
                if (message2 != null) {
                    str = message2;
                }
                0kD.A04("BottomSheetNavigator:popBackStackImmediate", str, 817905253, e2);
            }
        }
        synchronized (r5) {
            r5.A0t.A0D.clear();
            r5.A0E = null;
            AnonymousClass37F.A02(r5).setTranslationY(0.0f);
            r5.A0S = false;
            AnonymousClass37F.A01(r5).setClickable(false);
            r5.A08 = null;
            r5.A0F = null;
            r5.A0G = null;
            r5.A0R = false;
            if (r5.A0o == null) {
                ((C252063oV) r5.A11.getValue()).setVisibility(8);
            }
            r5.A00 = 0.0f;
            r5.A0g = false;
            r5.A0f = false;
            r5.A0m = false;
            r5.A0n = false;
            r5.A0b = false;
            r5.A0h = false;
            r5.A0Y = false;
            r5.A07 = 0;
            r5.A0D();
            r5.A0B = null;
            r5.A0o = null;
            r5.A0a = false;
            Set set = r5.A0z;
            for (C262944Gp D9d : new LinkedHashSet(set)) {
                D9d.D9d();
            }
            set.clear();
            C332277Ui r0 = r5.A0H;
            r5.A0H = null;
            if (r0 != null) {
                r0.D9V();
            }
            r5.A0K = AnonymousClass05K.A02;
            r5.A0I = null;
        }
        Activity activity = r5.A0r;
        0lg r02 = r5.A0v;
        AnonymousClass7TF.A1H(activity, r02);
        2cc A002 = C71342cb.A00(r02);
        AnonymousClass0iw A01 = AnonymousClass6WL.A01(activity);
        if (A01 != null) {
            2cc.A01(A002, A01, (String) null);
        }
        r5.A0j = false;
    }
}
