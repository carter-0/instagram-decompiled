package X;

import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.HashSet;

/* renamed from: X.Fr7  reason: case insensitive filesystem */
public final class C51252Fr7 implements Runnable {
    public final /* synthetic */ C47691EDa A00;

    public C51252Fr7(C47691EDa eDa) {
        this.A00 = eDa;
    }

    public final void run() {
        HashSet A1F = AnonymousClass7TE.A1F();
        A1F.add(Trigger.A0O);
        C46656Dib dib = (C46656Dib) this.A00.A01;
        C230882qT r3 = dib.A0o;
        C231002qi r2 = dib.A0n;
        r3.A00(dib.A04, QPTooltipAnchor.PROFILE_ACTIONS_ROW, r2);
        dib.A0n.AVg(A1F);
    }
}
