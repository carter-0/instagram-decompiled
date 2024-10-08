package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.LinkedHashMap;

public final class M9J implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public M9J(UserSession userSession, Context context, String str) {
        this.A02 = str;
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void run() {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        BitSet bitSet = new BitSet(1);
        A1H.put("encrypted_subno", this.A02);
        bitSet.set(0);
        A1H.put("feature_key", AnonymousClass000.A00(1976));
        if (bitSet.nextClearBit(0) >= 1) {
            C11844ShW shW = new C11844ShW("com.bloks.www.screen_query.BloksCMonInterstitialScreenQuery", (String) null, (String) null, 0Yt.A0B(A1H), 0Yt.A0E(), 719983200, 0, true);
            Context context = this.A00;
            C307506Qj A002 = C48721Ej6.A00(this.A01, false);
            FRI fri = new FRI((UKI) null, (Boolean) null, (Integer) null, (Integer) null, 1.0f, false, false, false, true);
            0qQ.A0B(context, 0);
            0qQ.A0B(A002, 1);
            shW.E0s(context, fri, A002);
            return;
        }
        throw AnonymousClass7TE.A0z("Missing required params");
    }
}
