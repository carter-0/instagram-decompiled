package X;

import android.content.DialogInterface;
import com.instagram.creation.fragment.EditMediaInfoFragment;

public final class LU7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditMediaInfoFragment A00;

    public LU7(EditMediaInfoFragment editMediaInfoFragment) {
        this.A00 = editMediaInfoFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LPD lpd = this.A00.A0O;
        if (lpd.A06()) {
            lpd.A01();
        } else {
            lpd.A03();
        }
    }
}
