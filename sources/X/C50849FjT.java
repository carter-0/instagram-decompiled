package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.ui.swipenavigation.PositionConfig;

/* renamed from: X.FjT  reason: case insensitive filesystem */
public final class C50849FjT implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        String str;
        Uri uri2 = uri;
        0qQ.A0B(uri2, 0);
        String queryParameter = uri2.getQueryParameter("entrypoint");
        String queryParameter2 = uri2.getQueryParameter("sticker_id");
        boolean booleanQueryParameter = uri2.getBooleanQueryParameter(AnonymousClass000.A00(3463), false);
        UserSession userSession = this.A01;
        1Av A002 = 1Au.A00(userSession);
        DbS.A1a(A002, queryParameter2, A002.A84, 1Av.A8a, 265);
        AnonymousClass4DH r7 = this.A00;
        Activity activity = r7.mParentFragment;
        if (!(activity instanceof 2Zg)) {
            if (r7 instanceof AnonymousClass4DH) {
                0qQ.A0C(r7, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
                AnonymousClass4DH r1 = r7;
                if (r1.getRootActivity() instanceof 2Zg) {
                    0qQ.A0C(r7, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
                    activity = r1.getRootActivity();
                    0qQ.A0C(activity, AnonymousClass000.A00(51));
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        2Zg r12 = (2Zg) activity;
        if (r12 != null) {
            String str2 = null;
            String str3 = null;
            if ("SHOPPING_PRODUCT_STICKER_NUDGE".equals(queryParameter)) {
                str = AnonymousClass000.A00(1710);
            } else {
                str = "megaphone_main_feed";
            }
            AnonymousClass57C r6 = AnonymousClass57C.FEED_MEGAPHONE;
            if (booleanQueryParameter) {
                1Au.A00(userSession).A1d(true);
                str2 = queryParameter2;
            } else {
                str3 = queryParameter2;
            }
            r12.FLD(new PositionConfig(r6, (CameraConfiguration) null, (AnonymousClass3QO) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str3, str2, (String) null, -1.0f, 0, true));
        }
    }

    public C50849FjT(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
