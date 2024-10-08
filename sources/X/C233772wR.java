package X;

import android.content.Context;
import android.os.Message;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2wR  reason: invalid class name and case insensitive filesystem */
public final class C233772wR implements C233782wS {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final void D1r() {
    }

    public final void Dwr(Collection collection, int i) {
    }

    public final /* bridge */ /* synthetic */ void D6A(Object obj, List list, int i) {
        AnonymousClass4EB r8 = (AnonymousClass4EB) obj;
        0qQ.A0B(r8, 0);
        if (r8.A02 != AnonymousClass3PG.CACHED) {
            0Pk r1 = 0Pl.A0n;
            Context context = this.A00;
            0Pl A002 = r1.A00(context, this.A02);
            List singletonList = Collections.singletonList(r8.A01);
            0qQ.A07(singletonList);
            1sy r4 = 1sy.A0H;
            String moduleName = this.A01.getModuleName();
            0qQ.A0B(moduleName, 3);
            AnonymousClass0s8 r12 = A002.A0L;
            Message obtainMessage = r12.obtainMessage(1, new C243423Ys(context, r4, moduleName, singletonList));
            0qQ.A07(obtainMessage);
            r12.A00(obtainMessage);
        }
    }

    public C233772wR(Context context, AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
    }
}
