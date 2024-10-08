package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.7WQ  reason: invalid class name */
public final class AnonymousClass7WQ extends BroadcastReceiver {
    public final UserSession A00;
    public final C62320sa A01;
    public final C62320sa A02;

    public AnonymousClass7WQ(C62320sa r1, UserSession userSession, C62320sa r3) {
        this.A01 = r1;
        this.A00 = userSession;
        this.A02 = r3;
    }

    public final void onReceive(Context context, Intent intent) {
        int A012 = AnonymousClass0fD.A01(-45159356);
        AnonymousClass0fQ.A01(this, context, intent);
        0qQ.A0B(context, 0);
        0qQ.A0B(intent, 1);
        Activity activity = (Activity) this.A01.invoke();
        UserSession userSession = this.A00;
        C254783t2 r1 = (C254783t2) this.A02.invoke();
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r1, 1);
        Bundle bundle = new Bundle();
        AnonymousClass9H0.A02(bundle, r1, C66579MXk.A00(691));
        AnonymousClass0Dg.A00(bundle, userSession);
        AnonymousClass6W8 r3 = new AnonymousClass6W8(activity, bundle, userSession, ModalActivity.class, C273654mx.A00(2243));
        r3.A08();
        r3.A0C(activity);
        AnonymousClass0fD.A0E(-1111346429, A012, intent);
    }
}
