package X;

import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;

/* renamed from: X.Dec  reason: case insensitive filesystem */
public final class C46415Dec implements C267604bt {
    public WeakReference A00;

    public final void Cl8() {
        UserDetailFragment userDetailFragment;
        WeakReference weakReference = this.A00;
        if (weakReference != null && (userDetailFragment = (UserDetailFragment) weakReference.get()) != null) {
            userDetailFragment.Cl8();
        }
    }

    public final void DFR(boolean z, boolean z2, String str) {
        UserDetailFragment userDetailFragment;
        WeakReference weakReference = this.A00;
        if (weakReference != null && (userDetailFragment = (UserDetailFragment) weakReference.get()) != null) {
            userDetailFragment.DFR(z, z2, str);
        }
    }

    public final void Dw9() {
        WeakReference weakReference = this.A00;
        if (weakReference != null) {
            weakReference.get();
        }
    }

    public final void Dwc(C324706zl r8, User user, String str, long j, boolean z) {
        UserDetailFragment userDetailFragment;
        WeakReference weakReference = this.A00;
        if (weakReference != null && (userDetailFragment = (UserDetailFragment) weakReference.get()) != null) {
            userDetailFragment.Dwc(r8, user, str, j, z);
        }
    }

    public final void EaM(boolean z) {
        UserDetailFragment userDetailFragment;
        WeakReference weakReference = this.A00;
        if (weakReference != null && (userDetailFragment = (UserDetailFragment) weakReference.get()) != null) {
            userDetailFragment.EaM(z);
        }
    }

    public final void Ehu(C375639El r2) {
        UserDetailFragment userDetailFragment;
        WeakReference weakReference = this.A00;
        if (weakReference != null && (userDetailFragment = (UserDetailFragment) weakReference.get()) != null) {
            userDetailFragment.Ehu(r2);
        }
    }

    public final boolean isValid() {
        UserDetailFragment userDetailFragment;
        WeakReference weakReference = this.A00;
        if (weakReference == null || (userDetailFragment = (UserDetailFragment) weakReference.get()) == null) {
            return true;
        }
        return userDetailFragment.isValid();
    }
}
