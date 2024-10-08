package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

public final class FPT implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;

    public FPT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onLongClick(View view) {
        String str;
        if (this.A00 != 0) {
            E25 e25 = (E25) this.A01;
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(e25.requireActivity(), DbU.A0m(e25, 2131969204));
            ConfirmationCodeEditText confirmationCodeEditText = e25.A0A;
            if (confirmationCodeEditText == null) {
                str = "confirmationCodeEditText";
            } else {
                A0f.A03(confirmationCodeEditText);
                A0f.A04 = new FdU(e25, 1);
                DbU.A1T(A0f);
                return true;
            }
        } else {
            E4T e4t = (E4T) this.A01;
            if (e4t.getContext() == null) {
                return false;
            }
            Context context = e4t.getContext();
            0qQ.A0C(context, "null cannot be cast to non-null type android.app.Activity");
            AnonymousClass5Gt A0f2 = AnonymousClass7TG.A0f((Activity) context, DbU.A0m(e4t, 2131953575));
            TextView textView = e4t.A02;
            if (textView == null) {
                str = "backupCodesTextView";
            } else {
                A0f2.A03(textView);
                A0f2.A04 = new FdU(e4t, 0);
                DbU.A1T(A0f2);
                return true;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
