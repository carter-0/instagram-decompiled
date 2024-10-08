package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* renamed from: X.FbR  reason: case insensitive filesystem */
public final class C50418FbR implements G99 {
    public final /* synthetic */ C49729F3u A00;

    public final /* synthetic */ void CxW(View view) {
    }

    public final void Dbj(DirectShareTarget directShareTarget) {
    }

    public final void Dbp(DirectShareTarget directShareTarget) {
        0qQ.A0B(directShareTarget, 0);
        C49729F3u f3u = this.A00;
        User user = (User) f3u.A06.get(directShareTarget.A0A());
        if (user != null) {
            G84 g84 = f3u.A02;
            if (g84 == null) {
                0qQ.A0F("delegate");
                throw AnonymousClass00P.createAndThrow();
            } else {
                g84.FLR(user);
            }
        }
    }

    public final void Dbr(DirectShareTarget directShareTarget) {
    }

    public final /* synthetic */ void Dhe() {
    }

    public final void Dhx(String str, boolean z) {
        0qQ.A0B(str, 0);
        if (z) {
            G84 g84 = this.A00.A02;
            if (g84 == null) {
                0qQ.A0F("delegate");
                throw AnonymousClass00P.createAndThrow();
            } else {
                g84.onSearchTextChanged(str);
            }
        }
    }

    public final void onFocusChange(View view, boolean z) {
    }

    public C50418FbR(C49729F3u f3u) {
        this.A00 = f3u;
    }
}
