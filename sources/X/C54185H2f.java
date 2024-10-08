package X;

import com.instagram.creator.agent.settings.content.sources.fetch.IGCreatorAIContentCategoriesRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.H2f  reason: case insensitive filesystem */
public final class C54185H2f extends AnonymousClass8ZF {
    public final IGCreatorAIContentCategoriesRepository A00;
    public final Map A01 = AnonymousClass7TE.A1H();
    public final 05G A02;
    public final AnonymousClass0Ud A03;

    public static final void A00(C54185H2f h2f, HND hnd, boolean z) {
        Object value;
        C54617HLa hLa;
        List<C53398GnV> list = (List) ((C59721JVf) h2f.A03.getValue()).A00;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C53398GnV gnV : list) {
            HND hnd2 = (HND) gnV.A02;
            if (hnd2 == hnd) {
                String str = gnV.A04;
                String str2 = gnV.A03;
                AnonymousClass7TG.A1T(hnd2, str, str2);
                gnV = new C53398GnV(hnd2, (Integer) gnV.A01, str, str2, z);
            }
            A0r.add(gnV);
        }
        05G r4 = h2f.A02;
        do {
            value = r4.getValue();
            hLa = (C54617HLa) ((C59721JVf) value).A01;
            0qQ.A0B(hLa, 1);
        } while (!r4.AIY(value, new C59721JVf(hLa, (List) A0r, 47)));
    }

    public C54185H2f(IGCreatorAIContentCategoriesRepository iGCreatorAIContentCategoriesRepository) {
        this.A00 = iGCreatorAIContentCategoriesRepository;
        02z A10 = DbS.A10(new C59721JVf(C54617HLa.LOADING, (List) 0sn.A00, 47));
        this.A02 = A10;
        this.A03 = A10;
    }
}
