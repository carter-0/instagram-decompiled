package X;

import com.instagram.model.direct.stickerstore.DirectStoreSticker;

/* renamed from: X.N5l  reason: case insensitive filesystem */
public final class C68196N5l extends AnonymousClass0T0 implements C232262tL {
    public boolean A00;
    public final C61064Jw2 A01;
    public final DirectStoreSticker A02;

    public C68196N5l(C61064Jw2 jw2, DirectStoreSticker directStoreSticker) {
        0qQ.A0B(directStoreSticker, 1);
        this.A02 = directStoreSticker;
        this.A01 = jw2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68196N5l) {
                C68196N5l n5l = (C68196N5l) obj;
                if (!0qQ.A0K(this.A02, n5l.A02) || !0qQ.A0K(this.A01, n5l.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02.A04;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A02) + AnonymousClass7TG.A0C(this.A01);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
