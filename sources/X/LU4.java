package X;

import android.app.Activity;
import android.content.DialogInterface;

public final class LU4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass7JI A00;

    public LU4(AnonymousClass7JI r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Object A002 = 0mE.A00(this.A00.A0L, Activity.class);
        if (A002 != null) {
            W38.A03((Activity) A002, 2131966510);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
