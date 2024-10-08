package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;

public final class AKA implements DialogInterface.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;

    public AKA(FragmentActivity fragmentActivity) {
        this.A00 = fragmentActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.onBackPressed();
    }
}
