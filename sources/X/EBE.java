package X;

import java.util.Iterator;

public final class EBE extends 1P0 {
    public final /* synthetic */ AnonymousClass9EU A00;
    public final /* synthetic */ C62320sa A01;

    public EBE(AnonymousClass9EU r1, C62320sa r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-506027758);
        DwO dwO = (DwO) obj;
        int A0D = AnonymousClass7TG.A0D(dwO, 82257522);
        AnonymousClass9ET r7 = this.A00.A04;
        Iterator it = dwO.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C47157DrY drY = (C47157DrY) it.next();
            if (0qQ.A0K(drY.A05, r7.A00.getString(2131968648))) {
                Iterator it2 = drY.A06.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AnonymousClass9JM r2 = (AnonymousClass9JM) it2.next();
                    if (0qQ.A0K(r2.A01, "likes")) {
                        Boolean bool = (Boolean) r2.A00;
                        if (bool != null && (!bool.booleanValue())) {
                            this.A01.invoke();
                        }
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(-420657279, A0D);
        AnonymousClass0fD.A0A(-1471157005, A03);
    }
}
