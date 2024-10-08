package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.AbB  reason: case insensitive filesystem */
public final class C40378AbB implements MTZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ A98 A02;
    public final /* synthetic */ AnonymousClass3Q2 A03;

    public C40378AbB(Context context, UserSession userSession, A98 a98, AnonymousClass3Q2 r4) {
        this.A02 = a98;
        this.A03 = r4;
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void DVt() {
        C59797JYq.A07(this.A00, this.A01, this.A03, "template_overlay_failed_to_save");
    }

    public final void DVu(String str) {
        this.A02.A00(str);
    }
}
