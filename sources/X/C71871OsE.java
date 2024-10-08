package X;

import android.app.Activity;
import android.graphics.RectF;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.direct.visual.model.DirectVisualMessageItemModel;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OsE  reason: case insensitive filesystem */
public final class C71871OsE implements AnonymousClass0iw, C74319Psv {
    public static final String __redex_internal_original_name = "ExpiringMediaDeeplinkHandler";
    public final AnonymousClass7XE A00;

    public C71871OsE(AnonymousClass7XE r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [boolean] */
    public final boolean Cmw(Uri uri, N3I n3i) {
        1iA r1;
        int i;
        String str;
        1iA r5;
        Uri uri2 = uri;
        N3I n3i2 = n3i;
        ? A1U = AnonymousClass7TF.A1U(0, uri2, n3i2);
        List<String> pathSegments = uri2.getPathSegments();
        if (pathSegments.size() >= A1U) {
            String A19 = AnonymousClass7TE.A19(pathSegments, 0);
            boolean equalsIgnoreCase = "story_remix_reply".equalsIgnoreCase(A19);
            String A002 = AnonymousClass000.A00(273);
            ArrayList arrayList = null;
            if (equalsIgnoreCase) {
                String queryParameter = uri2.getQueryParameter(A002);
                String queryParameter2 = uri2.getQueryParameter(AnonymousClass000.A00(88));
                String queryParameter3 = uri2.getQueryParameter(AnonymousClass000.A00(1769));
                String queryParameter4 = uri2.getQueryParameter("view_original_url");
                String queryParameter5 = uri2.getQueryParameter("media_type");
                if (!(queryParameter == null || queryParameter.length() == 0)) {
                    String str2 = n3i2.A08;
                    String str3 = n3i2.A09;
                    long A04 = DbY.A04(n3i2.A06);
                    if (queryParameter5 != null) {
                        r5 = 1i9.A00(00y.A0l(queryParameter5));
                    } else {
                        r5 = null;
                    }
                    boolean A1a = C51969G9p.A1a(r5, 1iA.A0Q);
                    Uri A09 = DbT.A09(queryParameter);
                    if (queryParameter2 == null) {
                        queryParameter2 = "";
                    }
                    DirectVisualMessageItemModel.MediaFields.RemixMedia remixMedia = new DirectVisualMessageItemModel.MediaFields.RemixMedia(A09, DbT.A09(queryParameter2), queryParameter3, queryParameter4);
                    String str4 = n3i2.A07;
                    List A1I = AnonymousClass7TE.A1I(new DirectVisualMessageItemModel(remixMedia, (PrivacyMediaOverlayViewModel) null, str2, str3, str4, 3, A04, A1a));
                    AnonymousClass7XE r15 = this.A00;
                    MessageIdentifier A0i = C66580MXl.A0i(str2, str4);
                    RectF rectF = n3i2.A01;
                    P3K p3k = new P3K(n3i2);
                    List list = n3i2.A0B;
                    if (list != null) {
                        ArrayList A0r = AnonymousClass7TG.A0r(list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            DbY.A1W(A0r, it);
                        }
                        arrayList = 00k.A0U(A0r);
                    }
                    r15.Cpe(rectF, p3k, A0i, A1I, arrayList, false, false, A1U);
                    UserSession userSession = n3i2.A03;
                    if (userSession != null) {
                        HashMap A1E = AnonymousClass7TE.A1E();
                        A1E.put("message_owner_id", str3);
                        C67000MgY.A00(this, userSession, (Long) null, "remix_xma_message", "tap", "remix_xma", (String) null, A1E);
                        return A1U;
                    }
                }
            } else if ("add_remix_reply_to_story".equalsIgnoreCase(A19)) {
                String queryParameter6 = uri2.getQueryParameter(A002);
                String queryParameter7 = uri2.getQueryParameter("media_type");
                if (!(queryParameter6 == null || queryParameter6.length() == 0)) {
                    OIB oib = new OIB();
                    oib.A00 = n3i2.A00;
                    UserSession userSession2 = n3i2.A03;
                    oib.A03 = userSession2;
                    oib.A05 = null;
                    oib.A01 = n3i2.A02;
                    oib.A02 = 28D.A2W;
                    oib.A09 = n3i2.A08;
                    oib.A0B = n3i2.A09;
                    oib.A0A = queryParameter6;
                    oib.A04 = n3i2.A05;
                    if (queryParameter7 == null || (r1 = 1i9.A00(00y.A0l(queryParameter7))) == null) {
                        r1 = 1iA.A0a;
                    }
                    oib.A06 = r1;
                    OV1 ov1 = new OV1(oib);
                    OIB oib2 = ov1.A00;
                    Activity activity = oib2.A00;
                    if (activity == null || oib2.A03 == null || oib2.A0A == null) {
                        if (oib2.A06.equals(1iA.A0a)) {
                            i = 2131961946;
                            str = "failed_to_load_video_toast";
                        } else {
                            i = 2131961945;
                            str = "failed_to_load_photo_toast";
                        }
                        C59689JTv.A01(activity, str, i, 0);
                    } else {
                        0qQ.A0A(activity);
                        UserSession userSession3 = oib2.A03;
                        0qQ.A0A(userSession3);
                        String str5 = oib2.A0A;
                        0qQ.A0A(str5);
                        O0Q.A00(userSession3).A01(activity, new NQT(ov1, 13), str5, oib2.A06.equals(1iA.A0a));
                    }
                    if (userSession2 != null) {
                        C67000MgY.A01(this, userSession2, "remix_xma_add_to_story", "tap", "remix_xma");
                    }
                }
            }
            return A1U;
        }
        return false;
    }

    public final String getModuleName() {
        return "expiring_media_deeplink_handler";
    }
}
