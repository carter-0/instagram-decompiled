package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Fnb  reason: case insensitive filesystem */
public final class C51045Fnb implements G9S {
    public final /* synthetic */ C337297g5 A00;

    public C51045Fnb(C337297g5 r1) {
        this.A00 = r1;
    }

    public final String Bgx() {
        ImageUrl Bgw = this.A00.Bgw();
        if (Bgw != null) {
            return Bgw.getUrl();
        }
        return null;
    }

    public final int BnA() {
        return AnonymousClass7TG.A0A(this.A00.BnB());
    }
}
