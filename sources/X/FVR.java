package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.business.fragment.OnboardingCheckListFragment;

public final class FVR implements C51897G6n {
    public final int A00;
    public final Object A01;

    public FVR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFailure(Throwable th) {
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                if (th != null) {
                    str2 = th.getMessage();
                } else {
                    str2 = "";
                }
                Fragment fragment = (Fragment) this.A01;
                if (fragment.getContext() != null) {
                    C59689JTv.A03(fragment.getContext(), 0mp.A06("An error occurred during the call: %s", new Object[]{str2}), (String) null, 1);
                    return;
                }
                return;
            case 2:
                E0O e0o = (E0O) this.A01;
                e0o.A02.invoke();
                e0o.A07();
                E0O.A01(e0o);
                return;
            case 7:
                C48261Ebg ebg = (C48261Ebg) this.A01;
                if (th == null || (str = th.getLocalizedMessage()) == null) {
                    str = "async controller launch failed";
                }
                ebg.A04(str);
                ebg.A02();
                return;
            default:
                return;
        }
    }

    public final void onSuccess() {
        switch (this.A00) {
            case 0:
                Fragment fragment = (Fragment) this.A01;
                if (fragment.getContext() != null) {
                    C59689JTv.A03(fragment.getContext(), 0mp.A06("The Async controller has been invoked!", new Object[0]), (String) null, 1);
                    return;
                }
                return;
            case 1:
                OnboardingCheckListFragment onboardingCheckListFragment = (OnboardingCheckListFragment) this.A01;
                new C46383De2(onboardingCheckListFragment.A07, onboardingCheckListFragment).A01(C47697EDg.A00(this, 20), AnonymousClass05K.A04);
                return;
            case 2:
                E0O e0o = (E0O) this.A01;
                if (e0o.A03.get()) {
                    e0o.A02.invoke();
                }
                e0o.A07();
                E0O.A01(e0o);
                return;
            case 5:
                C310336ap A0a = DbS.A0a();
                FO6 fo6 = (FO6) ((FNG) this.A01).A02;
                DbS.A19((Context) fo6.A02, A0a, 2131963243);
                Dbb.A1Q(A0a);
                ((View) fo6.A03).setEnabled(false);
                return;
            case 7:
                C48261Ebg ebg = (C48261Ebg) this.A01;
                ebg.A03();
                ebg.A02();
                return;
            default:
                return;
        }
    }
}
