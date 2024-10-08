package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.8Bs  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C352108Bs implements AnonymousClass0eK {
    public final /* synthetic */ AnonymousClass8BA A00;

    public /* synthetic */ C352108Bs(AnonymousClass8BA r1) {
        this.A00 = r1;
    }

    public final Object get() {
        AnonymousClass8BA r5 = this.A00;
        Activity activity = r5.A0n;
        View view = r5.A0o;
        UserSession userSession = r5.A0v;
        AnonymousClass4DH r3 = r5.A0s;
        AnonymousClass80W r7 = ((AnonymousClass80T) r5.A1M).A01;
        InteractiveDrawableContainer interactiveDrawableContainer = r5.A1s;
        boolean CTv = r5.A0z.CTv();
        AnonymousClass88Z r6 = r5.A1J;
        C314676if r0 = r5.A1g;
        if (r0 != null) {
            r0.get();
        }
        return new C65787Lzf(activity, view, r3, userSession, r5, r6, r7, interactiveDrawableContainer, CTv);
    }
}
