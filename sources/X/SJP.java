package X;

import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public abstract class SJP {
    public final S0G A00;

    public static final Map A00(C10996S4q s4q) {
        0qQ.A0B(s4q, 0);
        return Pxh.A0v(AnonymousClass7TE.A1L("has_accepted_consent", Boolean.valueOf(s4q.A00)), AnonymousClass7TE.A1L("is_contact_opt_in", Boolean.valueOf(s4q.A01)), AnonymousClass7TE.A1L("is_payment_opt_in", Boolean.valueOf(s4q.A02)), AnonymousClass7TE.A1L("with_ads_disclosure", Boolean.valueOf(s4q.A04)), AnonymousClass7TE.A1L("has_shown_fbpay_occp_disclosure", Boolean.valueOf(!s4q.A03)));
    }

    public final void A04() {
        C13811The A01 = A01();
        S0G s0g = this.A00;
        A01.E3a(s0g.A00(), C48721Ej6.A00(s0g.A00, false), new C12782T6r(), false);
    }

    public final C13811The A01() {
        if (this instanceof QK8) {
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            BitSet A0w = DbS.A0w(8);
            0sm A0E = 0Yt.A0E();
            0qQ.A0B(A0E, 0);
            A1H.put("logging_metadata", A0E);
            A0w.set(4);
            Pxi.A1H("is_reoptin", false, A0w, A1H);
            Pxi.A1G("has_accepted_consent", false, A0w, A1H);
            0sn r1 = 0sn.A00;
            0qQ.A0B(r1, 0);
            A1H.put("contacts", r1);
            A0w.set(1);
            A1H.put("cards", r1);
            A0w.set(0);
            C13353TWn tWn = C13353TWn.A00;
            0qQ.A0B(tWn, 0);
            A1H.put("on_accept_payment", Q3B.A00(tWn, 32));
            A0w.set(5);
            TU8 tu8 = TU8.A00;
            0qQ.A0B(tu8, 0);
            A1H.put("on_decline", Q3B.A00(tu8, 33));
            A0w.set(6);
            C13398TYi tYi = C13398TYi.A00;
            0qQ.A0B(tYi, 0);
            Q3B.A03(tYi, A1H, 34);
            A0w.set(7);
            Q3B.A02(C13405TYp.A00, A1H, 35);
            if (A0w.nextClearBit(0) >= 8) {
                return new C11843ShV(0Yt.A0B(A1H), 0Yt.A0E());
            }
            throw DbT.A0n();
        } else if (this instanceof QK7) {
            LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
            BitSet A0w2 = DbS.A0w(9);
            0sm A0E2 = 0Yt.A0E();
            0qQ.A0B(A0E2, 0);
            A1H2.put("settings", A0E2);
            A0w2.set(8);
            0sm A0E3 = 0Yt.A0E();
            0qQ.A0B(A0E3, 0);
            Pxi.A1H("logging_metadata", A0E3, A0w2, A1H2);
            A1H2.put("payment_save_action_type", "");
            A0w2.set(7);
            A1H2.put("contact_info", (Object) null);
            0sm A0E4 = 0Yt.A0E();
            0qQ.A0B(A0E4, 0);
            A1H2.put("card_info", A0E4);
            A0w2.set(0);
            0sm A0E5 = 0Yt.A0E();
            0qQ.A0B(A0E5, 0);
            A1H2.put("device_secrets", A0E5);
            A0w2.set(1);
            Pxi.A1G("hybrid_prompt_enabled", true, A0w2, A1H2);
            TYK tyk = TYK.A00;
            0qQ.A0B(tyk, 0);
            A1H2.put("on_save_contact", Q3B.A00(tyk, 30));
            A0w2.set(5);
            C13403TYn tYn = C13403TYn.A00;
            0qQ.A0B(tYn, 0);
            A1H2.put("on_save_payment_completed", Q3B.A00(tYn, 31));
            A0w2.set(6);
            Q3B.A03(C13397TYh.A00, A1H2, 28);
            Q3B.A02(C13404TYo.A00, A1H2, 29);
            C13352TWm tWm = C13352TWm.A00;
            0qQ.A0B(tWm, 0);
            A1H2.put("on_decline", Q3B.A00(tWm, 27));
            A0w2.set(4);
            if (A0w2.nextClearBit(0) >= 9) {
                return new C11842ShU(0Yt.A0B(A1H2), 0Yt.A0E());
            }
            throw DbT.A0n();
        } else {
            boolean z = this instanceof QKA;
            LinkedHashMap A1H3 = AnonymousClass7TE.A1H();
            if (z) {
                BitSet A0w3 = DbS.A0w(4);
                0sm A0E6 = 0Yt.A0E();
                0qQ.A0B(A0E6, 0);
                Pxi.A1H("settings", A0E6, A0w3, A1H3);
                0sm A0E7 = 0Yt.A0E();
                0qQ.A0B(A0E7, 0);
                A1H3.put("contact", A0E7);
                A0w3.set(0);
                A1H3.put("logging_metadata", 0Yt.A0E());
                Q3B.A03(C13396TYg.A00, A1H3, 25);
                Q3B.A02(C13402TYm.A00, A1H3, 26);
                TYJ tyj = TYJ.A00;
                0qQ.A0B(tyj, 0);
                A1H3.put("on_autofill_callback", Q3B.A00(tyj, 23));
                A0w3.set(1);
                TWl tWl = TWl.A00;
                0qQ.A0B(tWl, 0);
                Pxi.A1G("on_decline_callback", Q3B.A00(tWl, 24), A0w3, A1H3);
                if (A0w3.nextClearBit(0) >= 4) {
                    return new C11841ShT(0Yt.A0B(A1H3), 0Yt.A0E(), SandboxRepository.CACHE_TTL);
                }
                throw DbT.A0n();
            }
            BitSet A0w4 = DbS.A0w(5);
            0sm A0E8 = 0Yt.A0E();
            0qQ.A0B(A0E8, 0);
            A1H3.put("settings", A0E8);
            A0w4.set(4);
            0sm A0E9 = 0Yt.A0E();
            0qQ.A0B(A0E9, 0);
            A1H3.put("contact", A0E9);
            A0w4.set(0);
            0sm A0E10 = 0Yt.A0E();
            0qQ.A0B(A0E10, 0);
            A1H3.put("logging_metadata", A0E10);
            A0w4.set(1);
            Q3B.A03(C13395TYf.A00, A1H3, 20);
            Q3B.A02(C13401TYl.A00, A1H3, 21);
            TYI tyi = TYI.A00;
            0qQ.A0B(tyi, 0);
            Pxi.A1H("on_save_callback", Q3B.A00(tyi, 22), A0w4, A1H3);
            TU7 tu7 = TU7.A00;
            0qQ.A0B(tu7, 0);
            Pxi.A1G("on_decline_callback", Q3B.A00(tu7, 19), A0w4, A1H3);
            if (A0w4.nextClearBit(0) >= 5) {
                return new C11840ShS(0Yt.A0B(A1H3), 0Yt.A0E(), SandboxRepository.CACHE_TTL);
            }
            throw DbT.A0n();
        }
    }

    public SJP(S0G s0g) {
        this.A00 = s0g;
    }

    public final Set A02() {
        C13811The A01 = A01();
        S0G s0g = this.A00;
        return A01.AjL(s0g.A00(), C48721Ej6.A00(s0g.A00, false));
    }

    public final void A03() {
        String str;
        0xY A0N;
        String str2;
        C13811The A01 = A01();
        S0G s0g = this.A00;
        A01.CNo(s0g.A00(), C48721Ej6.A00(s0g.A00, false));
        if (this instanceof QK8) {
            str = null;
            A0N = AnonymousClass7TF.A0N(((QK8) this).A00.A03.A00);
            str2 = "autofill_bloks_payment_usage_cache_key";
        } else if (this instanceof QK7) {
            str = null;
            A0N = AnonymousClass7TF.A0N(((QK7) this).A00.A03.A00);
            str2 = "autofill_bloks_payment_save_cache_key";
        } else if (this instanceof QKA) {
            str = null;
            A0N = AnonymousClass7TF.A0N(((QKA) this).A00.A03.A00);
            str2 = "autofill_bloks_contact_usage_cache_key";
        } else {
            str = null;
            A0N = AnonymousClass7TF.A0N(((QK9) this).A00.A03.A00);
            str2 = "autofill_bloks_contact_save_cache_key";
        }
        A0N.E5g(str2, str);
        A0N.apply();
    }
}
