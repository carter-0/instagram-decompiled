package X;

import android.content.DialogInterface;
import java.util.Set;

public final class W5d implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ U9G A00;

    public W5d(U9G u9g) {
        this.A00 = u9g;
    }

    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        boolean remove;
        U9G u9g = this.A00;
        boolean z2 = u9g.A01;
        Set set = u9g.A00;
        String charSequence = u9g.A03[i].toString();
        if (z) {
            remove = set.add(charSequence);
        } else {
            remove = set.remove(charSequence);
        }
        u9g.A01 = remove | z2;
    }
}
