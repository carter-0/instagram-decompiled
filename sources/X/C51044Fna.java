package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Fna  reason: case insensitive filesystem */
public final class C51044Fna implements G9S {
    public final /* synthetic */ C283155Gi A00;

    public C51044Fna(C283155Gi r1) {
        this.A00 = r1;
    }

    public final String Bgx() {
        ImageUrl imageUrl = this.A00.A04.A0E;
        if (imageUrl != null) {
            return imageUrl.getUrl();
        }
        return null;
    }

    public final int BnA() {
        return AnonymousClass7TG.A0A(this.A00.A04.A05);
    }
}
