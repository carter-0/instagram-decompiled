package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.5kU  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C293295kU implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass5GJ A02;
    public final /* synthetic */ C230212pD A03;
    public final /* synthetic */ AnonymousClass5GH A04;

    public /* synthetic */ C293295kU(View view, UserSession userSession, AnonymousClass5GJ r3, C230212pD r4, AnonymousClass5GH r5) {
        this.A01 = userSession;
        this.A00 = view;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final void onClick(View view) {
        UserSession userSession = this.A01;
        View view2 = this.A00;
        AnonymousClass5GH r7 = this.A04;
        AnonymousClass5GJ r6 = this.A02;
        C230212pD r5 = this.A03;
        Context context = view2.getContext();
        0qQ.A0B(context, 1);
        0qQ.A0B(r5, 4);
        C56160Hto hto = new C56160Hto(userSession);
        String string = context.getString(2131963365);
        0qQ.A07(string);
        hto.A01(context, new FNX(r5, r7, r6), string, R.drawable.instagram_eye_off_pano_outline_24);
        new C17897Vho(hto).A00(context);
    }
}
