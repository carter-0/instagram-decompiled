package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class GOo {
    public final 1L5 A00;

    public final HashMap A00(String str, List list) {
        String str2;
        List list2 = list;
        0qQ.A0B(list2, 0);
        HashMap A1E = AnonymousClass7TE.A1E();
        ArrayList<AnonymousClass9IV> A1C = AnonymousClass7TE.A1C();
        for (Object next : list2) {
            if (((AnonymousClass9IV) next).A00 instanceof HF8) {
                A1C.add(next);
            }
        }
        ArrayList<C53347GmX> A0r = AnonymousClass7TG.A0r(A1C);
        for (AnonymousClass9IV r1 : A1C) {
            this.A00.EGZ(r1, str);
            C253513qu r3 = (C253513qu) r1.A00;
            0qQ.A0C(r3, AnonymousClass000.A00(3670));
            HF8 hf8 = (HF8) r3;
            String str3 = ((AnonymousClass9J4) r1.A01).A06;
            String str4 = hf8.A05;
            String str5 = hf8.A06;
            String str6 = hf8.A03;
            String str7 = hf8.A07;
            int ordinal = hf8.A02.ordinal();
            List list3 = hf8.A08;
            long j = hf8.A00;
            A0r.add(new C53347GmX(hf8.A01, str3, str4, str5, str6, str7, hf8.A04, list3, ordinal, j));
        }
        if (AnonymousClass7TE.A1b(A0r)) {
            try {
                StringWriter stringWriter = new StringWriter();
                17W A0e = C51970G9q.A0e(stringWriter);
                for (C53347GmX gmX : A0r) {
                    A0e.A0c();
                    A0e.A0R("signal_id", gmX.A08);
                    A0e.A0R("container_module", gmX.A05);
                    A0e.A0R("inventory_source", gmX.A06);
                    A0e.A0R("author_id", gmX.A03);
                    A0e.A0R("item_id", gmX.A07);
                    A0e.A0P("item_type", gmX.A00);
                    A0e.A0q("media_ids");
                    A0e.A0b();
                    Iterator it = gmX.A09.iterator();
                    while (it.hasNext()) {
                        A0e.A0t(AnonymousClass7TE.A18(it));
                    }
                    A0e.A0Y();
                    A0e.A0Q(C273654mx.A00(616), gmX.A01);
                    A0e.A0R(C273654mx.A00(2156), gmX.A04);
                    C53251Gkz gkz = gmX.A02;
                    A0e.A0R("afi_id", gkz.A03);
                    A0e.A0R("ad_tracking_token", gkz.A02);
                    A0e.A0q("extra_data");
                    A0e.A0c();
                    Iterator A0u = AnonymousClass7TF.A0u(gkz.A08);
                    while (A0u.hasNext()) {
                        Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                        A0e.A0R(DbT.A13(A1J), (String) A1J.getValue());
                    }
                    A0e.A0Z();
                    A0e.A0R("afi_type", gkz.A04);
                    A0e.A0Q("global_position", gkz.A00);
                    A0e.A0R("question_id", gkz.A06);
                    A0e.A0R(AnonymousClass000.A00(5349), gkz.A07);
                    A0e.A0R("answer_id", gkz.A05);
                    A0e.A0R(AnonymousClass000.A00(4442), C55158HdA.A00(gkz.A01));
                    A0e.A0Z();
                }
                A0e.A0Y();
                A0e.close();
                str2 = stringWriter.toString();
            } catch (IOException e) {
                0KC.A0H("AFIRealtimeInfo", C273654mx.A00(1406), e);
                str2 = "";
            }
            A1E.put("afi", str2);
        }
        return A1E;
    }

    public GOo(1L5 r1) {
        this.A00 = r1;
    }
}
