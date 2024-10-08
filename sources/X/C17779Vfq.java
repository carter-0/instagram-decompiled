package X;

import java.util.Set;

/* renamed from: X.Vfq  reason: case insensitive filesystem */
public final class C17779Vfq {
    public final /* synthetic */ C15339Uap A00;

    public final void A00(C16518UwN uwN) {
        0qQ.A0B(uwN, 0);
        C14777U8n u8n = (C14777U8n) this.A00.A05.getValue();
        C18460Vs9 vs9 = u8n.A03;
        String name = uwN.name();
        0qQ.A0B(name, 0);
        XB6 xb6 = vs9.A00;
        if (xb6 != null) {
            XB6.A00(C18460Vs9.A00(vs9, name), xb6, vs9.A01, "lead_gen_creatives_context_card", "creatives_context_card_see_all_click");
        }
        05G r1 = u8n.A07;
        Set A0j = 00k.A0j((Iterable) r1.getValue());
        A0j.add(uwN);
        r1.Epw(A0j);
    }

    public C17779Vfq(C15339Uap uap) {
        this.A00 = uap;
    }
}
