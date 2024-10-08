package X;

import android.content.DialogInterface;

/* renamed from: X.AKz  reason: case insensitive filesystem */
public final class C39959AKz implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C315356jl A00;

    public C39959AKz(C315356jl r1) {
        this.A00 = r1;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C315356jl r1 = this.A00;
        r1.A04.EHd();
        0xY AR4 = ((0xa) r1.A06.getValue()).AR4();
        AR4.E5T("HAS_DISMISSED_STORY_MEMORY_DIALOG_NUX", true);
        AR4.apply();
    }
}
