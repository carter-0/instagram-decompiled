package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.urlhandlers.directthreadinternal.DirectThreadInternalUrlHandlerActivity;
import com.instagram.user.model.User;

/* renamed from: X.FnE  reason: case insensitive filesystem */
public final class C51022FnE implements C330317Mh {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C51022FnE(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onFail(C268654dm r3) {
        if (4 - this.A00 == 0) {
            ((AnonymousClass4D7) this.A02).resumeWith((Object) null);
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [com.instagram.urlhandlers.directthreadinternal.DirectThreadInternalUrlHandlerActivity, android.app.Activity] */
    public final void onSuccess(User user) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(user, 0);
                C46410DeX deX = (C46410DeX) this.A02;
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                E1L e1l = new E1L();
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putString(Dbp.A01(), user.getUsername());
                e1l.setArguments(A0a);
                e1l.A00 = new Ey5(fragmentActivity, deX, user);
                DbU.A0y(fragmentActivity, e1l, DbS.A0W(deX.A00));
                return;
            case 1:
            case 2:
                0qQ.A0B(user, 0);
                1pE A012 = 1pE.A01((DirectThreadInternalUrlHandlerActivity) this.A02, DbS.A0O("DirectMessageInternalUrlHandler"), (UserSession) this.A01, "direct_thread");
                Dbc.A0x(A012, user);
                A012.A0m = true;
                A012.A06();
                return;
            case 3:
                0qQ.A0B(user, 0);
                E22 e22 = (E22) this.A02;
                e22.A00 = user;
                E22.A00((View) this.A01, e22);
                return;
            case 4:
                0qQ.A0B(user, 0);
                ((BrandedContentTag) this.A01).A00 = user;
                ((AnonymousClass4D7) this.A02).resumeWith((Object) null);
                return;
            default:
                return;
        }
    }
}
