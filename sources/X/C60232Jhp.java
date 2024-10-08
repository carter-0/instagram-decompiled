package X;

import com.instagram.direct.reactions.tabbedreaction.repository.DirectTabbedEmojiReactionRepository;
import java.util.List;
import java.util.Map;

/* renamed from: X.Jhp  reason: case insensitive filesystem */
public final class C60232Jhp extends 2YL {
    public int A00;
    public final int A01;
    public final DirectTabbedEmojiReactionRepository A02;
    public final Map A03 = AnonymousClass7TE.A1H();

    public final void A00(String str, String str2, String str3, String str4, int i, boolean z) {
        String str5;
        05G r6 = (05G) this.A03.get(str4);
        if (r6 == null) {
            return;
        }
        if (!z || !G9w.A1b(((C61079JwH) r6.getValue()).A01)) {
            int i2 = this.A00;
            int i3 = this.A01;
            int i4 = i;
            if (i2 - i3 <= i4 && i2 + i3 >= i4) {
                if (z || !((str5 = ((C61079JwH) r6.getValue()).A02) == null || str5.length() == 0)) {
                    Object obj = ((C61079JwH) r6.getValue()).A00;
                    KRG krg = KRG.A00;
                    if (!0qQ.A0K(obj, krg)) {
                        C61079JwH jwH = (C61079JwH) r6.getValue();
                        List list = (List) jwH.A01;
                        String str6 = jwH.A02;
                        AnonymousClass7TF.A1B(list, 0, krg);
                        String str7 = str3;
                        AnonymousClass7TE.A1Z(new C66178MGp(this, r6, str7, str2, str, (AnonymousClass4D7) null, 4), JTP.A0K(this, new C61079JwH((C62811Kmn) krg, str6, list), r6));
                    }
                }
            }
        }
    }

    public C60232Jhp(DirectTabbedEmojiReactionRepository directTabbedEmojiReactionRepository, int i) {
        this.A02 = directTabbedEmojiReactionRepository;
        this.A01 = i;
    }
}
