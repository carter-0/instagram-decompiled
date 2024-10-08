package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.FHx  reason: case insensitive filesystem */
public final class C49988FHx implements DialogInterface.OnClickListener {
    public final /* synthetic */ C311526cp A00;

    public C49988FHx(C311526cp r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        FragmentActivity fragmentActivity = this.A00.A00;
        0kR.A0F(fragmentActivity, DbV.A07(fragmentActivity, "https://help.instagram.com/519522125107875/data-policy"));
    }
}
