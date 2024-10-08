package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.AJh  reason: case insensitive filesystem */
public final class C39915AJh implements DialogInterface.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;

    public C39915AJh(FragmentActivity fragmentActivity) {
        this.A00 = fragmentActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.A00.onBackPressed();
    }
}
