package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.E8a  reason: case insensitive filesystem */
public final class C47562E8a extends C47564E8c {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public final void onClick(View view) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        C49906FEe fEe = SimpleWebViewActivity.A02;
        Context A0S = AnonymousClass7TE.A0S(view2);
        fEe.A02(A0S, this.A00, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, false, true, false, false, false, this.A01, "https://help.instagram.com/264014872646980"));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47562E8a(04x r2, UserSession userSession, Integer num, String str, int i) {
        super(r2, Integer.valueOf(i), num, str);
        this.A01 = str;
        this.A00 = userSession;
    }
}
