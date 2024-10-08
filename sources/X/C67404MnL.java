package X;

/* renamed from: X.MnL  reason: case insensitive filesystem */
public final class C67404MnL implements C250603lj {
    public boolean A00;
    public final C55868Hop A01;
    public final C67405MnM A02;

    public final void ATF(AnonymousClass30Y r10, C252093oY r11) {
        boolean A1U = AnonymousClass7TF.A1U(0, r10, r11);
        double B0M = (double) r11.B0M(r10);
        double CFe = (double) r11.CFe(r10);
        N3A n3a = (N3A) r10.A03;
        String str = n3a.A02.A01;
        int A0A = C51968G9o.A0A(r10, r11);
        if (A0A == 0) {
            A00(n3a, str);
        } else if (A0A == A1U) {
            A00(n3a, str);
            if (B0M >= 250.0d && CFe >= 0.9d) {
                this.A00 = A1U;
            }
        } else if (this.A00 && n3a.A05 == A1U) {
            C55868Hop hop = this.A01;
            if (hop != null) {
                0Aj A0e = AnonymousClass7TE.A0e(hop.A01, "ig_search_meta_ai_hcm_text_seen");
                if (A0e.isSampled()) {
                    C51976G9y.A0Y(A0e, hop, C66584MXp.A0T(A0e, hop));
                    A0e.A8D("dwell_time_ms", Double.valueOf(B0M));
                    A0e.Cgf();
                }
            }
            this.A00 = false;
        }
    }

    private final void A00(N3A n3a, String str) {
        C55868Hop hop;
        0Aj A0e;
        OK9 ok9;
        String str2;
        String str3;
        C61042Jvg jvg = n3a.A00;
        if (jvg.A01 && this.A02.AH0(002.A0R(str, "_startStream"))) {
            C55868Hop hop2 = this.A01;
            if (hop2 != null) {
                A0e = AnonymousClass7TE.A0e(hop2.A01, "ig_search_meta_ai_hcm_text_stream_start_impression");
                if (A0e.isSampled()) {
                    C66584MXp.A0s(A0e, hop2, C66584MXp.A0T(A0e, hop2));
                    ok9 = hop2.A03;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (jvg.A00 && this.A02.AH0(002.A0R(str, "_endStream"))) {
            C55868Hop hop3 = this.A01;
            if (hop3 != null) {
                C61062Jw0 jw0 = n3a.A01;
                if (jw0 == null || (str2 = jw0.A02) == null) {
                    str2 = "";
                }
                A0e = AnonymousClass7TE.A0e(hop3.A01, "ig_search_meta_ai_hcm_text_stream_end_impression");
                if (A0e.isSampled()) {
                    C51976G9y.A0Y(A0e, hop3, C66584MXp.A0T(A0e, hop3));
                    str3 = "third_party_link";
                    A0e.AAJ(str3, str2);
                    A0e.Cgf();
                }
                return;
            }
            return;
        } else if (00l.A0W(n3a.A03) && this.A02.AH0(002.A0R(str, "_shimmer")) && (hop = this.A01) != null) {
            A0e = AnonymousClass7TE.A0e(hop.A01, "ig_search_meta_ai_hcm_shimmer_impression");
            if (A0e.isSampled()) {
                C66584MXp.A0s(A0e, hop, C66584MXp.A0T(A0e, hop));
                ok9 = hop.A03;
            } else {
                return;
            }
        } else {
            return;
        }
        str2 = ok9.A00();
        str3 = "text_response_id";
        A0e.AAJ(str3, str2);
        A0e.Cgf();
    }

    public C67404MnL(C55868Hop hop, C67405MnM mnM) {
        this.A01 = hop;
        this.A02 = mnM;
    }
}
