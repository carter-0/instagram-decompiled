package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.android.R;

/* renamed from: X.HXq  reason: case insensitive filesystem */
public abstract class C54908HXq {
    public static final void A00(Context context, JO0 jo0, int i) {
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A05 = context.getResources().getQuantityString(R.plurals.story_drafts_confirmation_title, i);
        A0Y.A0K(C56719I8z.A00(jo0, 4), 2131974404);
        A0Y.A0O((DialogInterface.OnClickListener) null, C358278ae.DEFAULT, 2131954722);
        A0Y.A04();
        DbT.A1V(A0Y);
    }
}
