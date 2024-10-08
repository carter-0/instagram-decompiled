package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.List;

public final class H4Y extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ SavedCollection A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ Runnable A06;
    public final /* synthetic */ List A07;

    public H4Y(Context context, AnonymousClass0iw r2, UserSession userSession, SavedCollection savedCollection, Runnable runnable, Runnable runnable2, List list, int i) {
        this.A03 = userSession;
        this.A02 = r2;
        this.A00 = i;
        this.A01 = context;
        this.A07 = list;
        this.A04 = savedCollection;
        this.A06 = runnable;
        this.A05 = runnable2;
    }

    public final void onFail(C268654dm r3) {
        int A032 = AnonymousClass0fD.A03(-1263481959);
        H4Y.super.onFail(r3);
        this.A05.run();
        AnonymousClass0fD.A0A(-1819128895, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1158584948);
        SavedCollection savedCollection = (SavedCollection) obj;
        int A033 = AnonymousClass0fD.A03(970673955);
        UserSession userSession = this.A03;
        C57078INs.A00(AnonymousClass1Nd.A00(userSession), savedCollection);
        I6U.A03(this.A02, userSession, savedCollection, "bulk_edit", this.A00);
        Context context = this.A01;
        List list = this.A07;
        1Xj r5 = (1Xj) AnonymousClass7TE.A13(list);
        int size = list.size();
        AnonymousClass7TG.A1T(context, savedCollection, r5);
        C310336ap A0a = DbS.A0a();
        A0a.A0D = context.getResources().getQuantityString(R.plurals.save_home_bulk_edit_add_success_notification, size, C51968G9o.A1Z(savedCollection.A0G, size));
        C51970G9q.A1L(r5, A0a);
        Dbb.A1Q(A0a);
        SavedCollection savedCollection2 = this.A04;
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        I32.A02(savedCollection2, savedCollection, list);
        C57077INr.A00(A002, savedCollection2, list);
        Runnable runnable = this.A06;
        if (runnable != null) {
            runnable.run();
        }
        AnonymousClass0fD.A0A(477375312, A033);
        AnonymousClass0fD.A0A(549746276, A032);
    }
}
