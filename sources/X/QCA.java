package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

public abstract class QCA extends Fragment {
    public C13857Tic A00;

    public void onAttach(Context context) {
        0qQ.A0B(context, 0);
        QCA.super.onAttach(context);
        if (context instanceof C13581Td7) {
            this.A00 = ((C13581Td7) context).Az2();
        }
    }

    public void onDetach() {
        int A02 = AnonymousClass0fD.A02(86582017);
        QCA.super.onDetach();
        this.A00 = null;
        AnonymousClass0fD.A09(456156007, A02);
    }
}
