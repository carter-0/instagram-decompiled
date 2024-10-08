package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.android.R;

public final /* synthetic */ class M26 implements Runnable {
    public final /* synthetic */ KB5 A00;

    public /* synthetic */ M26(KB5 kb5) {
        this.A00 = kb5;
    }

    public final void run() {
        KB5 kb5 = this.A00;
        C358248ab A0X = DbS.A0X(kb5.A0O);
        Context context = kb5.A0N;
        A0X.A0j(context.getDrawable(R.drawable.ig_illustrations_illo_aspect_ratio_refresh));
        DbT.A19(context, A0X, 2131962351);
        DbU.A17(context, A0X, 2131962350);
        A0X.A0Y((DialogInterface.OnClickListener) null, C358278ae.BLUE_BOLD, context.getString(2131968772), true);
        LV8.A00(A0X, kb5, 3);
        A0X.A0s(true);
        DbT.A1V(A0X);
        1Au.A00(kb5.A0P).A1a(true);
    }
}
