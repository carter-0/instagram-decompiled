package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import com.instagram.arlink.fragment.NametagController;
import com.instagram.common.session.UserSession;

/* renamed from: X.KGw  reason: case insensitive filesystem */
public final class C61672KGw extends 2Cn {
    public final /* synthetic */ NametagController A00;
    public final /* synthetic */ String A01;

    public C61672KGw(NametagController nametagController, String str) {
        this.A00 = nametagController;
        this.A01 = str;
    }

    public final void onFail(Exception exc) {
        NametagController nametagController = this.A00;
        nametagController.A08.post(new C65849M1p(this));
        UserSession userSession = nametagController.A0D;
        C22031Xty.A0H(nametagController.A0C, userSession, userSession.A06, nametagController.A0F, "system_share_sheet", exc);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Uri uri = (Uri) obj;
        NametagController nametagController = this.A00;
        nametagController.A08.post(new C65850M1q(this));
        String str = this.A01;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", NametagController.A00(nametagController, str));
        intent.putExtra(Pxd.A00(564), true);
        if (uri != null) {
            intent.setType("image/png");
            intent.putExtra(AnonymousClass000.A00(66), uri);
            intent.setFlags(1);
            intent.setClipData(ClipData.newRawUri("profile", uri));
        } else {
            intent.setType("text/plain");
        }
        Activity activity = nametagController.A06;
        0kR.A0D(activity, Intent.createChooser(intent, activity.getString(2131973504)));
        UserSession userSession = nametagController.A0D;
        C22031Xty.A0I(nametagController.A0C, userSession, userSession.A06, nametagController.A0F, "system_share_sheet", NametagController.A00(nametagController, str));
    }
}
