package X;

import java.util.Set;

/* renamed from: X.7UI  reason: invalid class name */
public final class AnonymousClass7UI implements C61110lV {
    public final /* synthetic */ AnonymousClass7UH A00;

    public AnonymousClass7UI(AnonymousClass7UH r1) {
        this.A00 = r1;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(-1022642843);
        AnonymousClass7UH r6 = this.A00;
        Set<String> set = r6.A04;
        for (String hashCode : set) {
            r6.A01.markerEnd(r6.A00, hashCode.hashCode(), 630);
        }
        set.clear();
        14i.A06(this);
        AnonymousClass0fD.A0A(-269031400, A03);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(180039742, AnonymousClass0fD.A03(1743241736));
    }
}
