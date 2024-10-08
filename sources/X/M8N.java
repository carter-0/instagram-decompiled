package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentBackgroundModalActivity;

public final class M8N implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;

    public M8N(Activity activity, Context context, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = context;
    }

    public final void run() {
        Bundle bundle = new Bundle(0);
        AnonymousClass6W8 A03 = AnonymousClass6W8.A03(this.A00, bundle, this.A02, TransparentBackgroundModalActivity.class, C273654mx.A00(1184));
        A03.A08();
        A03.A0C(this.A01);
    }
}
