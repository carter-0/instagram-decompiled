package X;

import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fn0  reason: case insensitive filesystem */
public final class C51011Fn0 implements G7N {
    public final /* synthetic */ E6R A00;

    public final void registerTextViewLogging(TextView textView) {
        0qQ.A0B(textView, 0);
        UserSession userSession = this.A00.A00;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        } else {
            textView.addTextChangedListener(AnonymousClass4v0.A00(userSession));
        }
    }

    public final void searchTextChanged(String str) {
        0qQ.A0B(str, 0);
        C47583E8v e8v = this.A00.A02;
        if (e8v == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            e8v.getFilter().filter(str);
        }
    }

    public C51011Fn0(E6R e6r) {
        this.A00 = e6r;
    }
}
