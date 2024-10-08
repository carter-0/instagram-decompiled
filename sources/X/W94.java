package X;

import android.app.Dialog;
import android.view.View;

public final class W94 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass3GD A00;

    public W94(AnonymousClass3GD r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(808701516);
        AnonymousClass3GD r1 = this.A00;
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        Dialog dialog = r1.A01;
        if (dialog != null) {
            dialog.dismiss();
        }
        AnonymousClass0fD.A0C(-811901574, A05);
    }
}
