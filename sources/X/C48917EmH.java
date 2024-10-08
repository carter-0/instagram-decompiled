package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.EmH  reason: case insensitive filesystem */
public abstract class C48917EmH {
    public static final void A00(FragmentActivity fragmentActivity, Integer num, String str, C62320sa r7) {
        if (fragmentActivity != null) {
            E0O e0o = new E0O();
            e0o.A00 = num;
            e0o.A02 = r7;
            e0o.A01 = str;
            0hq A0F = DbT.A0F(fragmentActivity);
            try {
                e0o.A0C(new 0s1(A0F), (String) null);
                return;
            } catch (IllegalStateException unused) {
                if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed() || A0F.A0G) {
                    DbT.A1Q(0wj.A01, "Error attempting to show loading screen while navigating to login bypass in A2W flow", 245701013);
                } else {
                    return;
                }
            }
        }
        r7.invoke();
    }
}
