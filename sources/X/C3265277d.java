package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import java.util.List;

/* renamed from: X.77d  reason: invalid class name and case insensitive filesystem */
public final class C3265277d implements AnonymousClass0eK {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;

    public C3265277d(UserSession userSession, String str, List list, List list2) {
        this.A00 = userSession;
        this.A01 = str;
        this.A03 = list;
        this.A02 = list2;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return DirectThreadApi.A0E(this.A00, this.A01, (String) null, this.A03, this.A02);
    }
}
