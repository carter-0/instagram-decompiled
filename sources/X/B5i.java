package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;
import java.util.List;

public final class B5i extends C250663lr implements C250673ls {
    public final C41888B5h A0E(1E6 r7) {
        ArrayList arrayList;
        C41888B5h b5h = (C41888B5h) reinterpret(C41888B5h.class);
        1E9 r4 = new 1E9(r7, AnonymousClass7TE.A1F(), false);
        List<C276024sM> Ao0 = b5h.Ao0();
        ArrayList arrayList2 = null;
        if (Ao0 != null) {
            arrayList = AnonymousClass7TF.A0p(Ao0);
            for (C276024sM r0 : Ao0) {
                r0.E7A(r4);
                arrayList.add(r0);
            }
        } else {
            arrayList = null;
        }
        b5h.A00 = arrayList;
        List<C276024sM> items = b5h.getItems();
        ArrayList A0p = AnonymousClass7TF.A0p(items);
        for (C276024sM r02 : items) {
            r02.E7A(r4);
            A0p.add(r02);
        }
        b5h.A01 = A0p;
        List<DU5> BJe = b5h.BJe();
        if (BJe != null) {
            arrayList2 = AnonymousClass7TF.A0p(BJe);
            for (DU5 du5 : BJe) {
                du5.E7B(r4);
                arrayList2.add(du5);
            }
        }
        b5h.A02 = arrayList2;
        return b5h;
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "first_seen_media_id");
        AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A02(), BZ1.class, DialogModule.KEY_ITEMS, -148814760);
        String A00 = AnonymousClass000.A00(2167);
        return C41847B3o.A0j(AnonymousClass4LF.A00, A0f, A0A, new AVF(C41845B3m.A08(C42471Bcq.class, A00, 936321853), A00, C273654mx.A00(420)), "is_defer_fulfilled(fragment_name:\"ClipsProfilePagingInfo\")");
    }

    public B5i(int i) {
        super(i);
    }

    public B5i() {
        super(-2107973840);
    }
}
