package X;

import android.content.DialogInterface;

/* renamed from: X.FJw  reason: case insensitive filesystem */
public final class C50037FJw implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ boolean[] A00;

    public C50037FJw(boolean[] zArr) {
        this.A00 = zArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.A00[i] = true;
    }
}
