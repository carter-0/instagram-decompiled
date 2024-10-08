package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.android.R;

public final class I1X {
    public final Context A00;

    public final void A01(DialogInterface.OnClickListener onClickListener) {
        Context context = this.A00;
        A00(onClickListener, AnonymousClass7TE.A16(context, 2131972533), AnonymousClass7TE.A16(context, 2131972532), AnonymousClass7TE.A16(context, 2131972077), true);
    }

    public final void A02(DialogInterface.OnClickListener onClickListener, int i) {
        Context context = this.A00;
        String quantityString = context.getResources().getQuantityString(R.plurals.save_home_bulk_edit_remove_confirmation_title, i);
        0qQ.A07(quantityString);
        String quantityString2 = context.getResources().getQuantityString(R.plurals.save_home_bulk_edit_remove_confirmation_message, i);
        0qQ.A07(quantityString2);
        A00(onClickListener, quantityString, quantityString2, AnonymousClass7TE.A16(context, 2131975988), true);
    }

    public final void A03(DialogInterface.OnClickListener onClickListener, String str, int i) {
        0qQ.A0B(str, 0);
        Context context = this.A00;
        A00(onClickListener, AnonymousClass7TE.A16(context, 2131972531), DbY.A0e(context.getResources(), str, R.plurals.save_home_bulk_edit_move_to_collection_confirmation_message, i), AnonymousClass7TE.A16(context, 2131966744), false);
    }

    private final void A00(DialogInterface.OnClickListener onClickListener, String str, String str2, String str3, boolean z) {
        C358278ae r0;
        C358248ab A0Y = DbS.A0Y(this.A00);
        A0Y.A05 = str;
        A0Y.A0q(str2);
        if (z) {
            r0 = C358278ae.RED_BOLD;
        } else {
            r0 = C358278ae.DEFAULT;
        }
        A0Y.A0Y(onClickListener, r0, str3, true);
        A0Y.A0C(C56708I8o.A00);
        AnonymousClass7TH.A0a(A0Y, true);
    }

    public I1X(Context context) {
        this.A00 = context;
    }
}
