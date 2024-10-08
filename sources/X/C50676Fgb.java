package X;

import android.text.Editable;
import com.instagram.profile.edit.fragment.CompleteYourProfileFragment;

/* renamed from: X.Fgb  reason: case insensitive filesystem */
public final class C50676Fgb implements G98 {
    public boolean A00 = true;
    public final /* synthetic */ CompleteYourProfileFragment A01;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C50676Fgb(CompleteYourProfileFragment completeYourProfileFragment) {
        this.A01 = completeYourProfileFragment;
    }

    public final void DFS() {
        if (this.A00) {
            CompleteYourProfileFragment completeYourProfileFragment = this.A01;
            completeYourProfileFragment.A07 = true;
            CompleteYourProfileFragment.A01(completeYourProfileFragment);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.A00) {
            CompleteYourProfileFragment completeYourProfileFragment = this.A01;
            completeYourProfileFragment.A07 = true;
            CompleteYourProfileFragment.A01(completeYourProfileFragment);
        }
    }

    public final void setEnabled(boolean z) {
        this.A00 = z;
    }
}
