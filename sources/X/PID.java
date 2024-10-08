package X;

import android.view.View;
import java.util.List;

public final class PID implements G7A {
    public final /* synthetic */ C61062Jw0 A00;
    public final /* synthetic */ C68042Mz9 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public final void ECJ(View view, UO1 uo1) {
    }

    public PID(C61062Jw0 jw0, C68042Mz9 mz9, String str, String str2, String str3) {
        this.A01 = mz9;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = jw0;
        this.A04 = str3;
    }

    public final void Dag(UO1 uo1) {
        String str;
        boolean z;
        String str2;
        C69505Nmn nmn;
        UO1 uo12 = uo1;
        int i = uo12.A00;
        if (i != 0) {
            str = uo12.A05;
            z = false;
        } else {
            str = null;
            z = true;
        }
        C68042Mz9 mz9 = this.A01;
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        O7P o7p = mz9.A09;
        long j = (long) i;
        String str3 = this.A03;
        String str4 = this.A02;
        C61062Jw0 jw0 = this.A00;
        String str5 = this.A04;
        C71874OsH osH = o7p.A00;
        NPE npe = osH.A02.A01;
        if (npe != null) {
            C72208OyY oyY = osH.A0F;
            Long valueOf = Long.valueOf(j);
            long j2 = npe.A00;
            Boolean valueOf2 = Boolean.valueOf(z);
            OO3 oo3 = oyY.A01;
            if (oo3 != null) {
                boolean booleanValue = valueOf2.booleanValue();
                String str6 = oo3.A07;
                if (str6 != null) {
                    0Aj A0e = AnonymousClass7TE.A0e(oo3.A0E, "universal_search_result_selected");
                    if (A0e.isSampled()) {
                        0bb r14 = new 0bb();
                        r14.A06("query_string", oo3.A06);
                        if (booleanValue) {
                            nmn = C69505Nmn.A0C;
                        } else {
                            nmn = C69505Nmn.A0D;
                        }
                        r14.A01(nmn, "result_type");
                        C66583MXo.A1A(r14, j2);
                        A0e.AAK(r14, "search_result");
                        A0e.A8M(C69504Nmm.A08, "ui_section");
                        C66580MXl.A1H(A0e, str6);
                        A0e.AAe("data_sources", AnonymousClass7TE.A1I(C69469NmD.SERVER_ENTITIES_NAMED_DSQ1));
                        A0e.AAJ("bot_response_id", str3);
                        A0e.AAe("recipient_ids", C66582MXn.A10(Long.parseLong(C3262475z.A00(oo3.A0F))));
                        A0e.A9F("ui_section_index", valueOf);
                        A0e.Cgf();
                    }
                }
            }
            String str7 = str4;
            String str8 = str3;
            String str9 = str5;
            C68112N1a A002 = C70892OQk.A00(HNL.NULL_STATE_PROMPT, C70273O0d.A00(str9, str8, str7, jw0.A04, jw0.A02, jw0.A03, str, (List) jw0.A01, (List) jw0.A00), osH.A0D, osH.A02.A01.A05, (String) null);
            if (z) {
                str2 = "igd_universal_search:serp_snippet_donut";
            } else {
                str2 = "igd_universal_search:serp_snippet_pill";
            }
            C71874OsH.A01(A002, osH, str2, osH.A02.A01.A05, true);
        }
    }
}
