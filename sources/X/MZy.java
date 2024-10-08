package X;

import android.content.Context;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.lang.reflect.InvocationTargetException;

public final class MZy {
    public final Context A00;
    public final 1vl A01;
    public final 1vo A02;

    public final void A00(String str, boolean z) {
        UserSession userSession = this.A01.A00;
        0Tu r4 = 0Tu.A05;
        if (182.A06(r4, userSession, 36321335831766298L)) {
            long A0I = AnonymousClass7TG.A0I();
            String str2 = str;
            if (z || ((int) A0I) - this.A00.getSharedPreferences("token_ack_prefs", 0).getInt(str, 0) >= DbS.A04(r4, userSession, 36602810808537913L)) {
                try {
                    C71590OnR onR = (C71590OnR) C41847B3o.A17(OOH.class, "create", 0);
                    2IS r2 = onR.A00;
                    r2.A04("token_fbid", str);
                    onR.A02 = true;
                    Integer valueOf = Integer.valueOf((int) A0I);
                    r2.A03("timestamp", valueOf);
                    onR.A01 = AnonymousClass7TF.A1V(valueOf);
                    PandoGraphQLRequest A002 = onR.build();
                    this.A02.ATL(new C71567On2(this, 6), new C19045WHx(this, str2, 0, A0I), A002);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw C41845B3m.A0j(e);
                }
            }
        }
    }

    public MZy(Context context, 1vo r2, 1vl r3) {
        this.A02 = r2;
        this.A00 = context;
        this.A01 = r3;
    }
}
