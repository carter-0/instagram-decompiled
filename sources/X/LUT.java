package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

public final class LUT implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass6SP A01;
    public final /* synthetic */ String A02;

    public LUT(Activity activity, AnonymousClass6SP r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        28D r2 = 28D.A1U;
        ACRType aCRType = ACRType.HIGHLIGHT_REEL;
        UserSession userSession = this.A01.A00;
        AnonymousClass8ZO.A00(userSession).A00(r2, aCRType);
        Bundle A002 = C250563lf.A0C(r2).A00();
        String str = this.A02;
        A002.putString(C273654mx.A00(33), str);
        0qQ.A0B(aCRType, 0);
        A002.putString(C273654mx.A00(55), aCRType.A00);
        Activity activity = this.A00;
        AnonymousClass6W8 A022 = AnonymousClass6W8.A02(activity, A002, userSession, TransparentModalActivity.class, "clips_camera");
        Dbc.A0y(A022);
        A022.A0A(activity, 9587);
        0qQ.A0B(userSession, 0);
        C63400KwL.A00(userSession, "primary_click", str);
    }
}
