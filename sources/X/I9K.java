package X;

import android.content.DialogInterface;

public final class I9K implements DialogInterface.OnShowListener {
    public final /* synthetic */ C273384mU A00;
    public final /* synthetic */ C315346jk A01;

    public I9K(C273384mU r1, C315346jk r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C315346jk r2 = this.A01;
        Dba.A1I(r2.A01, "ig_stories_unified_feedback_disclosure_impression");
        this.A00.EHY("dialog");
        r2.A02.A00();
    }
}
