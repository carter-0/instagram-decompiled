package X;

import android.content.Context;
import android.content.DialogInterface;

public final class I8D implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C315346jk A01;

    public I8D(Context context, C315346jk r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C315346jk r2 = this.A01;
        Dba.A1I(r2.A01, "ig_stories_unified_feedback_disclosure_click");
        r2.A02.A01(this.A00);
    }
}
