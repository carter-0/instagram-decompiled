package X;

import android.content.DialogInterface;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.AJz  reason: case insensitive filesystem */
public final class C39933AJz implements DialogInterface.OnClickListener {
    public final /* synthetic */ C353498Hw A00;

    public C39933AJz(C353498Hw r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C49906FEe fEe = SimpleWebViewActivity.A02;
        C353498Hw r0 = this.A00;
        fEe.A02(r0.A11, r0.A1D, new SimpleWebViewConfig(new C11225SFz("https://help.instagram.com/476003390920140")));
    }
}
