package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.List;

/* renamed from: X.Ijg  reason: case insensitive filesystem */
public final class C57987Ijg implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ SavedCollection A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    public C57987Ijg(Context context, AnonymousClass0iw r2, UserSession userSession, SavedCollection savedCollection, Runnable runnable, String str, List list, int i) {
        this.A02 = r2;
        this.A01 = context;
        this.A03 = userSession;
        this.A04 = savedCollection;
        this.A06 = str;
        this.A07 = list;
        this.A00 = i;
        this.A05 = runnable;
    }

    public final void run() {
        AnonymousClass0iw r4 = this.A02;
        Context context = this.A01;
        UserSession userSession = this.A03;
        SavedCollection savedCollection = this.A04;
        String str = this.A06;
        List list = this.A07;
        int i = this.A00;
        Runnable runnable = this.A05;
        I32.A00(AnonymousClass1Nd.A00(userSession), savedCollection, list);
        I6V.A03(context, (1Xj) AnonymousClass7TE.A13(list), new C57274IVj(context, r4, userSession, savedCollection, runnable, str, list, i), list.size());
    }
}
