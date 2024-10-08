package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final /* synthetic */ class A98 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1GK A02;
    public final /* synthetic */ 1GK A03;
    public final /* synthetic */ AnonymousClass3Q2 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ LinkedHashMap A06;

    public /* synthetic */ A98(Context context, UserSession userSession, 1GK r3, 1GK r4, AnonymousClass3Q2 r5, String str, LinkedHashMap linkedHashMap) {
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = linkedHashMap;
        this.A05 = str;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.KH3, X.11X] */
    public final void A00(Object obj) {
        Context context = this.A00;
        UserSession userSession = this.A01;
        AnonymousClass3Q2 r9 = this.A04;
        1GK r6 = this.A02;
        1GK r7 = this.A03;
        LinkedHashMap linkedHashMap = this.A06;
        String str = this.A05;
        String str2 = (String) obj;
        r9.A0e(ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE);
        r9.A4w = true;
        if (str != null) {
            r9.A3e = str;
        }
        if (r9.A5w) {
            str2.getClass();
            Iterator it = r9.A0L().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass3Q2 r2 = (AnonymousClass3Q2) it.next();
                if (r2.A0E() == ShareType.STORY_TEMPLATE_ASSET) {
                    r2.A33 = str2;
                    break;
                }
            }
        }
        1ES.A03(new KH3(context, userSession, r6, r7, new C40361Aau(r9), r9, linkedHashMap));
        1ua.A00(context, userSession).A0F(r9);
        PendingMediaStore A002 = 28K.A00(userSession);
        A002.A07.add(r9.A35);
    }
}
