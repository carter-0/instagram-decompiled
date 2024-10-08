package X;

import android.util.Patterns;
import java.util.regex.Pattern;

/* renamed from: X.WXu  reason: case insensitive filesystem */
public final class C19401WXu implements X4E {
    public final int A00;
    public final Object A01;

    public C19401WXu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final C17355VSi getState(C17355VSi vSi, CharSequence charSequence, boolean z) {
        C15273UZb uZb;
        int i;
        switch (this.A00) {
            case 0:
                boolean A1U = AnonymousClass7TF.A1U(0, vSi, charSequence);
                if (00l.A0W(charSequence)) {
                    uZb = (C15273UZb) this.A01;
                    uZb.A07 = false;
                    vSi.A01 = "error";
                    i = 2131970826;
                } else {
                    Pattern pattern = Patterns.WEB_URL;
                    if (!DbV.A1b(charSequence.toString(), pattern)) {
                        uZb = (C15273UZb) this.A01;
                        uZb.A07 = false;
                        uZb.A06 = charSequence.toString();
                        C15273UZb.A00(uZb);
                        vSi.A01 = "error";
                        i = 2131970824;
                    } else if (DbV.A1b(charSequence.toString(), pattern)) {
                        C15273UZb uZb2 = (C15273UZb) this.A01;
                        uZb2.A06 = charSequence.toString();
                        uZb2.A07 = A1U;
                        C15273UZb.A00(uZb2);
                        vSi.A01 = "confirmed";
                        return vSi;
                    }
                }
                vSi.A00 = uZb.getString(i);
                return vSi;
            case 1:
                0qQ.A0B(vSi, 0);
                C15308UaF uaF = (C15308UaF) this.A01;
                C61072JwA jwA = (C61072JwA) uaF.A01().A03.A02();
                if (jwA != null) {
                    C15308UaF.A00(jwA, vSi, uaF);
                    return vSi;
                }
                break;
            default:
                0qQ.A0B(vSi, 0);
                C15312UaJ uaJ = (C15312UaJ) this.A01;
                C61072JwA jwA2 = (C61072JwA) uaJ.A01().A04.A02();
                if (jwA2 != null) {
                    C15312UaJ.A00(jwA2, vSi, uaJ);
                    break;
                }
                break;
        }
        return vSi;
    }
}
