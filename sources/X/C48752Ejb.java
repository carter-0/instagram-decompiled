package X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.Ejb  reason: case insensitive filesystem */
public abstract class C48752Ejb {
    public static final void A00(Context context, boolean z) {
        int i;
        DialogInterface.OnClickListener onClickListener;
        C358248ab A0Y = DbS.A0Y(context);
        if (z) {
            A0Y.A09(2131954377);
            DbU.A17(context, A0Y, 2131954375);
            i = 2131954373;
            onClickListener = FJ4.A00;
        } else {
            A0Y.A09(2131954376);
            DbU.A17(context, A0Y, 2131954374);
            i = 2131954373;
            onClickListener = FJ5.A00;
        }
        Dba.A0t(onClickListener, A0Y, i);
    }
}
