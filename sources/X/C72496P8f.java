package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.P8f  reason: case insensitive filesystem */
public final class C72496P8f implements C332897Ww {
    public MessageIdentifier A00;
    public final /* synthetic */ OIQ A01;

    public final void ATV(boolean z) {
    }

    public final void DRU() {
    }

    public C72496P8f(OIQ oiq) {
        this.A01 = oiq;
    }

    public final void AOV() {
        MessageIdentifier messageIdentifier = this.A00;
        if (messageIdentifier != null) {
            String str = messageIdentifier.A01;
            String A002 = messageIdentifier.A00();
            if (A002 != null) {
                OIQ oiq = this.A01;
                C333527Zh.A00(oiq.A04).A0L(oiq.A0H, str, AnonymousClass7TE.A1I(str), AnonymousClass7TE.A1I(A002), false);
                oiq.A06.A0C(str);
            }
        }
    }

    public final void ASg(MessageIdentifier messageIdentifier) {
        this.A00 = messageIdentifier;
    }
}
