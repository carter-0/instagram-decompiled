package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.List;

/* renamed from: X.Ije  reason: case insensitive filesystem */
public final class C57985Ije implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ SavedCollection A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public C57985Ije(Context context, AnonymousClass0iw r2, UserSession userSession, SavedCollection savedCollection, String str, List list, int i) {
        this.A02 = r2;
        this.A01 = context;
        this.A03 = userSession;
        this.A04 = savedCollection;
        this.A05 = str;
        this.A06 = list;
        this.A00 = i;
    }

    public final void run() {
        AnonymousClass0iw r4 = this.A02;
        Context context = this.A01;
        UserSession userSession = this.A03;
        SavedCollection savedCollection = this.A04;
        String str = this.A05;
        List list = this.A06;
        I6V.A02(context, (1Xj) AnonymousClass7TE.A13(list), new C57271IVg(context, r4, userSession, savedCollection, str, list, this.A00), list.size());
    }
}
