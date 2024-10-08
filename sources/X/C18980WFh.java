package X;

import android.content.Context;
import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.instagram.common.session.UserSession;

/* renamed from: X.WFh  reason: case insensitive filesystem */
public final class C18980WFh implements C13919TlL {
    public final /* synthetic */ AnonymousClass7AX A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public final void onError(Throwable th) {
        throw AnonymousClass00P.createAndThrow();
    }

    public C18980WFh(AnonymousClass7AX r1, String str, boolean z) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = str;
    }

    public final void onSuccess() {
        String str;
        AnonymousClass7AX r2 = this.A00;
        String str2 = r2.A08;
        AnonymousClass7AX.A00(r2, str2, false);
        VN2 vn2 = new VN2();
        Context context = r2.A00;
        UserSession userSession = r2.A04;
        vn2.A00.submit(new C13068TJy(context, userSession, vn2, AnonymousClass05K.A01));
        if (this.A02 && (str = this.A01) != null) {
            C11367SPk.A03(str2, "groupishId");
            long currentTimeMillis = System.currentTimeMillis();
            String str3 = userSession.A06;
            C11367SPk.A03(str3, C273654mx.A00(421));
            r2.A07.A00(new C18977WFe(), new LiveLocationSession(str2, (String) null, str, str3, 0, currentTimeMillis, false));
        }
    }
}
