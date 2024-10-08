package X;

import com.instagram.api.schemas.LinkAction;
import com.instagram.common.textwithentities.model.TextWithEntities;
import java.util.List;

/* renamed from: X.UKo  reason: case insensitive filesystem */
public final class C15035UKo extends AnonymousClass0T0 {
    public C61083JwL A00 = null;
    public C61083JwL A01;
    public C61074JwC A02;
    public TextWithEntities A03;
    public TextWithEntities A04;
    public TextWithEntities A05;
    public C16573UxQ A06;
    public C16562UxE A07;
    public boolean A08;
    public boolean A09;

    public C15035UKo() {
        C16562UxE uxE = C16562UxE.UNKNOWN;
        C16573UxQ uxQ = C16573UxQ.UNKNOWN;
        C61083JwL jwL = new C61083JwL();
        TextWithEntities textWithEntities = new TextWithEntities((LinkAction) null, (Long) null, (String) null, (List) null, (List) null, (List) null);
        this.A07 = uxE;
        this.A06 = uxQ;
        this.A02 = null;
        this.A01 = jwL;
        this.A03 = textWithEntities;
        this.A04 = null;
        this.A05 = null;
        this.A09 = false;
        this.A08 = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15035UKo) {
                C15035UKo uKo = (C15035UKo) obj;
                if (!0qQ.A0K(this.A00, uKo.A00) || this.A07 != uKo.A07 || this.A06 != uKo.A06 || !0qQ.A0K(this.A02, uKo.A02) || !0qQ.A0K(this.A01, uKo.A01) || !0qQ.A0K(this.A03, uKo.A03) || !0qQ.A0K(this.A04, uKo.A04) || !0qQ.A0K(this.A05, uKo.A05) || this.A09 != uKo.A09 || this.A08 != uKo.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A07, AnonymousClass7TG.A0C(this.A00) * 31);
        int A073 = AnonymousClass7TF.A07(this.A01, (AnonymousClass7TF.A07(this.A06, A072) + AnonymousClass7TG.A0C(this.A02)) * 31);
        return DbS.A06(this.A08, AnonymousClass7TF.A09(this.A09, (((AnonymousClass7TF.A07(this.A03, A073) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A05)) * 31));
    }
}
