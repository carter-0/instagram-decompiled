package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.2ly  reason: invalid class name and case insensitive filesystem */
public final class C228622ly implements C228632lz {
    public final Set A00;

    public final void DeP(C268654dm r3, AnonymousClass1GU r4, int i) {
        0qQ.A0B(r4, 0);
        for (C228632lz DeP : this.A00) {
            DeP.DeP(r3, r4, i);
        }
    }

    public final void Dek(AnonymousClass1GU r3) {
        0qQ.A0B(r3, 0);
        for (C228632lz Dek : this.A00) {
            Dek.Dek(r3);
        }
    }

    public final void Des(AnonymousClass1GU r3, 1XM r4) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(r4, 1);
        for (C228632lz Des : this.A00) {
            Des.Des(r3, r4);
        }
    }

    public final void Dey(AnonymousClass1GU r3, 1XM r4) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(r4, 1);
        for (C228632lz Dey : this.A00) {
            Dey.Dey(r3, r4);
        }
    }

    public final void DeQ(AnonymousClass1GU r3) {
        for (C228632lz DeQ : this.A00) {
            DeQ.DeQ(r3);
        }
    }

    public final void DeU(AnonymousClass1GU r3) {
        for (C228632lz DeU : this.A00) {
            DeU.DeU(r3);
        }
    }

    public final void onStop() {
        for (C228632lz onStop : this.A00) {
            onStop.onStop();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.0JR] */
    public C228622ly(Context context, AnonymousClass07i r6, UserSession userSession, AnonymousClass4DU r8, C228322lL r9, C228312lJ r10, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.A00 = linkedHashSet;
        linkedHashSet.add(new AnonymousClass2m0(new Object(), userSession));
        C61410nE r1 = C61410nE.A00;
        linkedHashSet.add(new C228642m2(r1, (AnonymousClass28j) userSession.A01(AnonymousClass28j.class, AnonymousClass28h.A00)));
        linkedHashSet.add(new C228652m3(userSession));
        if (z) {
            linkedHashSet.add(new C228662m4(context, r6, userSession));
            linkedHashSet.add(new C228672m5(context, userSession, r8));
            linkedHashSet.add(new C228682m6(userSession));
            linkedHashSet.add(new AnonymousClass2m7(userSession, context));
            linkedHashSet.add(new AnonymousClass2m8(userSession, context));
            linkedHashSet.add(new C228692m9(userSession));
        }
        if (r10 != null) {
            linkedHashSet.add(new C228702mB(new AnonymousClass2mA(r10)));
        }
        if (r9 != null) {
            linkedHashSet.add(new C228712mC(r9));
        }
    }
}
