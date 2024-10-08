package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.HFv  reason: case insensitive filesystem */
public final class C54489HFv extends C2806552w {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54489HFv(Context context, UserSession userSession, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = str;
    }

    public final void onClick(View view) {
        C49906FEe.A01(this.A00, this.A01, SimpleWebViewActivity.A02, new C11225SFz("https://help.instagram.com/652943337035777"), this.A02);
    }
}
