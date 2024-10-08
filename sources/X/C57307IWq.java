package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.IWq  reason: case insensitive filesystem */
public final class C57307IWq implements C313466gU, C313476gV {
    public final UserSession A00;
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final C313486gW A03;
    public final Map A04 = AnonymousClass7TE.A1H();

    /* JADX WARNING: type inference failed for: r0v1, types: [X.6gW, X.3ou] */
    public C57307IWq(Context context, AnonymousClass0iw r5, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A00 = userSession;
        this.A02 = r5;
        AnonymousClass4DU r52 = (AnonymousClass4DU) r5;
        0qQ.A0B(r52, 2);
        this.A03 = new C252313ou(userSession, r52, (String) null, false);
    }

    public final synchronized void ECQ(boolean z) {
        synchronized (this) {
        }
    }

    public final synchronized void ECe(C255773uh r1) {
    }

    public final synchronized void EIx() {
    }

    public final /* synthetic */ void onCompletion() {
    }

    public final /* synthetic */ void onProgressUpdate(int i, int i2, boolean z) {
    }

    public final synchronized void pause() {
    }

    public final void Dxv(1Xj r5) {
        Iterator A0u = AnonymousClass7TF.A0u(this.A04);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (0qQ.A0K(C51966G9m.A1E(A1J.getKey()), C51969G9p.A0u(r5))) {
                C57467IbB.A00((C57467IbB) A1J.getValue());
                return;
            }
        }
        throw new NoSuchElementException(AnonymousClass000.A00(3));
    }
}
