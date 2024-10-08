package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.OjU  reason: case insensitive filesystem */
public final class C71371OjU implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Bundle A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ ONF A05;
    public final /* synthetic */ String A06;

    public C71371OjU(Activity activity, Context context, Bundle bundle, AnonymousClass0iw r4, UserSession userSession, ONF onf, String str) {
        this.A02 = bundle;
        this.A06 = str;
        this.A04 = userSession;
        this.A00 = activity;
        this.A01 = context;
        this.A05 = onf;
        this.A03 = r4;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(1195719193);
        Bundle bundle = this.A02;
        String str = this.A06;
        bundle.putString("target_user_id", str);
        DbW.A0W(this.A00, bundle, this.A04, ModalActivity.class, "recs_from_friends_sender").A0C(this.A01);
        00y.A0n(10, str);
        this.A03.getModuleName();
        AnonymousClass0fD.A0C(1578127444, A052);
    }
}
