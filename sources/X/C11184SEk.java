package X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.SEk  reason: case insensitive filesystem */
public final class C11184SEk {
    public Object A00;
    public final 0hq A01;
    public final /* synthetic */ DialogModule A02;

    public C11184SEk(0hq r1, DialogModule dialogModule) {
        this.A02 = dialogModule;
        this.A01 = r1;
    }

    public static void A00(C11184SEk sEk) {
        0SM A0R;
        if (sEk.A02.mIsInForeground && (A0R = sEk.A01.A0R(DialogModule.FRAGMENT_TAG)) != null && A0R.isResumed()) {
            A0R.A07();
        }
    }
}
