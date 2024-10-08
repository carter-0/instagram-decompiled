package X;

import java.util.Iterator;

/* renamed from: X.4W7  reason: invalid class name */
public abstract class AnonymousClass4W7 {
    public static final AnonymousClass4W8 A00(C265674Vs r3) {
        Object obj;
        Iterator it = r3.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof AnonymousClass4W8) {
                break;
            }
        }
        if (obj instanceof AnonymousClass4W8) {
            return (AnonymousClass4W8) obj;
        }
        return null;
    }

    public static final void A02(AnonymousClass4W8 r5) {
        StringBuilder sb = new StringBuilder();
        sb.append("folding_mode_unexpected_");
        C18546Vty vty = ((C18958WEl) r5).A00;
        sb.append(vty);
        sb.append('_');
        C18545Vtx BYt = r5.BYt();
        sb.append(BYt);
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected folding feature values: state=");
        sb2.append(vty);
        sb2.append(C273654mx.A00(100));
        sb2.append(BYt);
        0wb.A03(obj, sb2.toString());
    }

    public static final AnonymousClass88T A01(C265674Vs r2) {
        AnonymousClass4W8 A00 = A00(r2);
        if (A00 == null) {
            return null;
        }
        C18546Vty vty = ((C18958WEl) A00).A00;
        if (0qQ.A0K(vty, C18546Vty.A02)) {
            C18545Vtx BYt = A00.BYt();
            if (0qQ.A0K(BYt, C18545Vtx.A02)) {
                return AnonymousClass88T.BOOK;
            }
            if (0qQ.A0K(BYt, C18545Vtx.A01)) {
                return AnonymousClass88T.TABLE_TOP;
            }
            A02(A00);
            return AnonymousClass88T.TABLE_TOP;
        } else if (0qQ.A0K(vty, C18546Vty.A01)) {
            return AnonymousClass88T.FLAT;
        } else {
            A02(A00);
            return AnonymousClass88T.FLAT;
        }
    }
}
