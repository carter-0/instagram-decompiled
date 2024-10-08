package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.MAy  reason: case insensitive filesystem */
public final class C66091MAy implements Callable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;

    public C66091MAy(Context context, UserSession userSession, List list, boolean z) {
        this.A02 = list;
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = z;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            A1C.add(new JZ5(this.A00, JTO.A0W(it), this.A01, this.A03).call());
        }
        return A1C;
    }
}
