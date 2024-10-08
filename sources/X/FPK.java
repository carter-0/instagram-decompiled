package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

public final class FPK implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public FPK(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onFocusChange(View view, boolean z) {
        if (this.A00 != 0) {
            EditPhoneNumberView editPhoneNumberView = (EditPhoneNumberView) this.A01;
            G86 g86 = (G86) this.A02;
            if (!editPhoneNumberView.A06) {
                ViewGroup viewGroup = editPhoneNumberView.A00;
                if (z) {
                    viewGroup.setBackgroundResource(R.drawable.input_highlighted);
                } else {
                    viewGroup.setBackgroundResource(R.drawable.input);
                    return;
                }
            } else if (!z) {
                return;
            }
            g86.DWw();
        } else if (z) {
            Fl1 fl1 = ((C47485E4p) this.A02).A02;
            if (fl1 == null) {
                0qQ.A0F("searchController");
                throw AnonymousClass00P.createAndThrow();
            } else if (fl1.A03) {
                ((View) this.A01).setVisibility(0);
            }
        }
    }
}
