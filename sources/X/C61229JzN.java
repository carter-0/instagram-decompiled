package X;

import com.instagram.api.schemas.MediaPromptPrefType;
import java.util.List;

/* renamed from: X.JzN  reason: case insensitive filesystem */
public final class C61229JzN extends AnonymousClass0T0 implements C66416MQw {
    public final int A00;
    public final MediaPromptPrefType A01;
    public final MediaPromptPrefType A02;
    public final C61120JxW A03;
    public final C61121JxX A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C61229JzN(MediaPromptPrefType mediaPromptPrefType, MediaPromptPrefType mediaPromptPrefType2, C61120JxW jxW, C61121JxX jxX, String str, List list, int i, boolean z, boolean z2, boolean z3) {
        DbW.A1N(mediaPromptPrefType, 3, mediaPromptPrefType2);
        C51973G9u.A0u(6, jxX, list, str);
        this.A08 = z;
        this.A03 = jxW;
        this.A01 = mediaPromptPrefType;
        this.A07 = z2;
        this.A02 = mediaPromptPrefType2;
        this.A04 = jxX;
        this.A09 = z3;
        this.A00 = i;
        this.A06 = list;
        this.A05 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61229JzN) {
                C61229JzN jzN = (C61229JzN) obj;
                if (!(this.A08 == jzN.A08 && 0qQ.A0K(this.A03, jzN.A03) && this.A01 == jzN.A01 && this.A07 == jzN.A07 && this.A02 == jzN.A02 && 0qQ.A0K(this.A04, jzN.A04) && this.A09 == jzN.A09 && this.A00 == jzN.A00 && 0qQ.A0K(this.A06, jzN.A06) && 0qQ.A0K(this.A05, jzN.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A07(this.A01, (C51965G9l.A05(this.A08) + AnonymousClass7TG.A0C(this.A03)) * 31))));
        return C41845B3m.A01(this.A05, AnonymousClass7TF.A07(this.A06, (AnonymousClass7TF.A09(this.A09, A072) + this.A00) * 31));
    }
}
