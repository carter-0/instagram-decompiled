package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.PYl  reason: case insensitive filesystem */
public final class C73207PYl implements Runnable {
    public final /* synthetic */ C67491Mol A00;
    public final /* synthetic */ Map A01;

    public C73207PYl(C67491Mol mol, Map map) {
        this.A01 = map;
        this.A00 = mol;
    }

    public final void run() {
        Map map = this.A01;
        C67491Mol mol = this.A00;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            C71031OZi.A01(mol.A01).A01(C66647MaG.A00((C254743sy) AnonymousClass7TE.A1J(A0u).getKey()));
        }
    }
}
