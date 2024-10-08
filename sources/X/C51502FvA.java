package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.FvA  reason: case insensitive filesystem */
public final class C51502FvA implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass4kA A03;

    public C51502FvA(Activity activity, View view, UserSession userSession, AnonymousClass4kA r4) {
        this.A01 = view;
        this.A00 = activity;
        this.A03 = r4;
        this.A02 = userSession;
    }

    public final void run() {
        View view = this.A01;
        if (view.isAttachedToWindow()) {
            Activity activity = this.A00;
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(activity, activity.getString(2131960456));
            A0f.A03(view);
            A0f.A02();
            A0f.A00 = 5000;
            A0f.A0A = true;
            C47898ELs.A00(A0f, this, 6).A07(this.A02);
        }
    }
}
