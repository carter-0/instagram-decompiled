package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

/* renamed from: X.Ffc  reason: case insensitive filesystem */
public final class C50621Ffc implements G64 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C50621Ffc(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void CHr(FragmentActivity fragmentActivity) {
        Fragment e54;
        int i;
        String str;
        C309516Yo A0J;
        Fragment e3s;
        switch (this.A00) {
            case 0:
                0qQ.A0B(fragmentActivity, 0);
                C358248ab A0X = DbS.A0X(fragmentActivity);
                A0X.A08(2131972265);
                Dba.A0t(new C50026FJl(28, (Object) fragmentActivity, this.A02, this.A01), A0X, 2131972262);
                return;
            case 1:
                0qQ.A0B(fragmentActivity, 0);
                C309516Yo A0M = DbS.A0M(fragmentActivity, ((C49662F0t) this.A02).A02);
                A0M.A0D((Fragment) this.A01);
                A0M.A04();
                return;
            case 2:
                0qQ.A0B(fragmentActivity, 0);
                0s1 A0D = DbW.A0D(fragmentActivity);
                if (FGv.A05() || !2Yu.A0L(fragmentActivity, R.attr.nuxAllowSignUpFlow, true)) {
                    DbT.A15();
                    e54 = new E54();
                    e54.setArguments((Bundle) this.A01);
                    0qQ.A0C(e54, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
                    i = R.id.layout_container_main;
                    str = "android.nux.LoginLandingFragment";
                } else {
                    DbT.A15();
                    e54 = new E3s();
                    e54.setArguments((Bundle) this.A01);
                    0qQ.A0C(e54, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
                    i = R.id.layout_container_main;
                    str = "android.nux.FacebookLandingFragment";
                }
                A0D.A0D(e54, str, i);
                A0D.A00();
                return;
            case 3:
                0qQ.A0B(fragmentActivity, 0);
                DbT.A15();
                E54 e542 = new E54();
                e542.setArguments((Bundle) this.A01);
                DbY.A14(e542, fragmentActivity, (0lg) this.A02);
                return;
            default:
                0qQ.A0B(fragmentActivity, 0);
                if (!C49290EsZ.A00.A00(fragmentActivity)) {
                    Bundle bundle = (Bundle) this.A01;
                    String A002 = C49041EoL.A00(bundle);
                    0lg r2 = (0lg) this.A02;
                    if (A002 != null) {
                        C309516Yo A0J2 = DbY.A0J(fragmentActivity, r2);
                        DbU.A1C(bundle);
                        DbW.A0x(bundle, new C47459E3g(), A0J2);
                        return;
                    }
                    if (FCQ.A02(r2)) {
                        Integer num = C49917FEr.A00().A05;
                        Integer num2 = AnonymousClass05K.A0C;
                        if (num == num2 || C49921FEw.A02.A00().A01() == num2) {
                            DbT.A15();
                            DbU.A1C(bundle);
                            AnonymousClass4DH r1 = new AnonymousClass4DH();
                            r1.setArguments(bundle);
                            Dbc.A0T(r1, fragmentActivity.getSupportFragmentManager());
                            return;
                        }
                        A0J = DbS.A0M(fragmentActivity, r2);
                        e3s = C49793F7b.A01(bundle);
                    } else {
                        A0J = DbY.A0J(fragmentActivity, r2);
                        e3s = new E3s();
                        e3s.setArguments(bundle);
                    }
                    A0J.A0D(e3s);
                    A0J.A04();
                    return;
                }
                return;
        }
    }
}
