package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.common.session.UserSession;

/* renamed from: X.Erc  reason: case insensitive filesystem */
public abstract class C49233Erc {
    public static final void A00(Context context, UserSession userSession, AnonymousClass4DU r8, String str) {
        Uri.Builder A07 = DbW.A07(002.A0R(C10065Rm2.A01, "donate/"));
        A07.appendQueryParameter("fundraiser_campaign_id", str);
        A07.appendQueryParameter("source", "instagram_story_api");
        AnonymousClass4DU r1 = r8;
        FFi.A01(context, r1, userSession, "ig_story", (String) null, A07.build().toString());
    }
}
