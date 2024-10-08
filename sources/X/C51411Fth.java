package X;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Fth  reason: case insensitive filesystem */
public final class C51411Fth implements Runnable {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ E2A A01;

    public C51411Fth(Uri uri, E2A e2a) {
        this.A01 = e2a;
        this.A00 = uri;
    }

    public final void run() {
        E2A e2a = this.A01;
        FragmentActivity requireActivity = e2a.requireActivity();
        Intent A04 = DbT.A0e().A04(requireActivity, this.A00);
        A04.addFlags(335544320);
        String string = e2a.requireArguments().getString("short_url");
        if (!(string == null || string.length() == 0)) {
            A04.putExtra("short_url", string);
        }
        0kR.A0B(requireActivity, A04);
    }
}
