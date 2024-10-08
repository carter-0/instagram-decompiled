package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.AJp  reason: case insensitive filesystem */
public final class C39923AJp implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass8ZV A00;

    public C39923AJp(AnonymousClass8ZV r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass8ZV r0 = this.A00;
        Context context = r0.getContext();
        if (context != null) {
            SimpleWebViewActivity.A02.A02(context, r0.getSession(), new SimpleWebViewConfig(new C11225SFz("https://help.instagram.com/476003390920140")));
        }
    }
}
