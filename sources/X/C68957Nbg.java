package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.Nbg  reason: case insensitive filesystem */
public final class C68957Nbg extends AnonymousClass7EB {
    public String A00;
    public String A01;
    public String A02;
    public final AnonymousClass7H7 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68957Nbg(C71662eb r2, AnonymousClass7H7 r3) {
        super(r2);
        0qQ.A0B(r3, 2);
        this.A03 = r3;
    }

    public final void A05(2FW r1, MessageIdentifier messageIdentifier, String str, long j, boolean z) {
    }

    public final void A01() {
        this.A03.DBr(this.A00, this.A02, this.A01);
    }

    public final /* bridge */ /* synthetic */ boolean A06(AnonymousClass79H r5) {
        String str;
        String str2;
        C68955Nbe nbe = (C68955Nbe) r5;
        0qQ.A0B(nbe, 0);
        String str3 = this.A00;
        boolean z = true;
        if (str3 == null || (str2 = this.A01) == null || !str3.equals(nbe.A00) || !str2.equals(nbe.A01)) {
            z = false;
        }
        this.A00 = nbe.A00;
        this.A01 = nbe.A01;
        MessageIdentifier messageIdentifier = nbe.A0A;
        if (messageIdentifier != null) {
            str = messageIdentifier.A01;
        } else {
            str = null;
        }
        this.A02 = str;
        return z;
    }
}
