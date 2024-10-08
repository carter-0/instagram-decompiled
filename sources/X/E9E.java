package X;

import android.content.Context;
import com.instagram.actionbar.ActionButton;
import com.instagram.business.fragment.SupportProfileDisplayOptionsFragment;
import java.util.List;

public final class E9E extends 2Ru {
    public C274674os A00;
    public List A01 = AnonymousClass7TE.A1C();
    public final C47606E9s A02;
    public final SupportProfileDisplayOptionsFragment A03;

    public E9E(Context context, SupportProfileDisplayOptionsFragment supportProfileDisplayOptionsFragment) {
        super(false);
        this.A03 = supportProfileDisplayOptionsFragment;
        C47606E9s e9s = new C47606E9s(context, this);
        this.A02 = e9s;
        DbU.A1Q(this, e9s);
    }

    public final void A01(C274674os r5) {
        boolean z;
        SupportProfileDisplayOptionsFragment supportProfileDisplayOptionsFragment = this.A03;
        E9E e9e = supportProfileDisplayOptionsFragment.A02;
        e9e.A00 = r5;
        A00(e9e);
        ActionButton actionButton = supportProfileDisplayOptionsFragment.A00;
        if (supportProfileDisplayOptionsFragment.A01 == null || (r5.AmM() != null && !r5.AmM().equals(supportProfileDisplayOptionsFragment.A01.AmM()))) {
            z = true;
        } else {
            z = false;
        }
        actionButton.setEnabled(z);
    }

    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    public static final void A00(E9E e9e) {
        boolean z;
        e9e.clear();
        for (C47359Dvt dvt : e9e.A01) {
            C274674os r0 = e9e.A00;
            if (r0 != null) {
                boolean A0K = 0qQ.A0K(dvt.A01, r0.AmM());
                z = true;
                if (A0K) {
                    e9e.addModel(dvt, Boolean.valueOf(z), e9e.A02);
                }
            }
            z = false;
            e9e.addModel(dvt, Boolean.valueOf(z), e9e.A02);
        }
        e9e.notifyDataSetChanged();
    }
}
