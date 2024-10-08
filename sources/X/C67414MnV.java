package X;

import java.util.Map;

/* renamed from: X.MnV  reason: case insensitive filesystem */
public final class C67414MnV implements C250603lj {
    public final C55868Hop A00;
    public final C67403MnK A01;
    public final C67405MnM A02;

    public final void ATF(AnonymousClass30Y r14, C252093oY r15) {
        double d;
        C55868Hop hop;
        boolean A1U = AnonymousClass7TF.A1U(0, r14, r15);
        long B0M = r15.B0M(r14);
        float CFe = r15.CFe(r14);
        UO1 uo1 = (UO1) r14.A03;
        int A0A = C51968G9o.A0A(r14, r15);
        if (A0A == 0) {
            0qQ.A0A(uo1);
            A00(uo1);
        } else if (A0A != A1U) {
            C67403MnK mnK = this.A01;
            0qQ.A0A(uo1);
            double d2 = (double) B0M;
            0qQ.A0B(uo1, 0);
            Map map = mnK.A01;
            String str = uo1.A05;
            Number A14 = C51966G9m.A14(str, map);
            if (A14 != null && A14.doubleValue() >= 0.8999999761581421d && d2 >= 250.0d && (hop = mnK.A00) != null) {
                int i = uo1.A00;
                String str2 = uo1.A07;
                String str3 = uo1.A04;
                if (str3 == null) {
                    str3 = "";
                }
                0qQ.A0B(str2, A1U ? 1 : 0);
                0qQ.A0B(str, 2);
                0Aj A0e = AnonymousClass7TE.A0e(hop.A01, "ig_search_meta_ai_hcm_prompt_seen");
                if (A0e.isSampled()) {
                    C51976G9y.A0Y(A0e, hop, C66584MXp.A0T(A0e, hop));
                    A0e.A9F("prompt_index", DbS.A0j(i));
                    A0e.AAJ("prompt_source", str2);
                    A0e.AAJ("prompt_text", str);
                    A0e.AAJ("prompt_id", str3);
                    A0e.A8D("dwell_time_ms", Double.valueOf(d2));
                    A0e.Cgf();
                }
            }
            map.remove(str);
        } else {
            0qQ.A0A(uo1);
            A00(uo1);
            if (uo1.A00 != 0) {
                double d3 = (double) CFe;
                Map map2 = this.A01.A01;
                String str4 = uo1.A05;
                Number A142 = C51966G9m.A14(str4, map2);
                if (A142 != null) {
                    d = A142.doubleValue();
                } else {
                    d = 0.0d;
                }
                map2.put(str4, Double.valueOf(Math.max(d3, d)));
            }
        }
    }

    private final void A00(UO1 uo1) {
        String str;
        0Aj A0e;
        String str2;
        C67405MnM mnM = this.A02;
        String str3 = uo1.A05;
        if (mnM.AH0(str3)) {
            int i = uo1.A00;
            if (i == 0) {
                C55868Hop hop = this.A00;
                if (hop != null) {
                    A0e = AnonymousClass7TE.A0e(hop.A01, "ig_search_meta_ai_hcm_donut_impression");
                    if (A0e.isSampled()) {
                        C66584MXp.A0s(A0e, hop, C66584MXp.A0T(A0e, hop));
                        str = hop.A03.A00();
                        str2 = "text_response_id";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                C55868Hop hop2 = this.A00;
                if (hop2 != null) {
                    String str4 = uo1.A07;
                    str = uo1.A04;
                    if (str == null) {
                        str = "";
                    }
                    AnonymousClass7TG.A1O(str4, str3);
                    A0e = AnonymousClass7TE.A0e(hop2.A01, "ig_search_meta_ai_hcm_prompt_impression");
                    if (A0e.isSampled()) {
                        C51976G9y.A0Y(A0e, hop2, C66584MXp.A0T(A0e, hop2));
                        A0e.A9F("prompt_index", DbS.A0j(i));
                        A0e.AAJ("prompt_source", str4);
                        A0e.AAJ("prompt_text", str3);
                        str2 = "prompt_id";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            A0e.AAJ(str2, str);
            A0e.Cgf();
        }
    }

    public C67414MnV(C55868Hop hop, C67403MnK mnK, C67405MnM mnM) {
        this.A00 = hop;
        this.A02 = mnM;
        this.A01 = mnK;
    }
}
