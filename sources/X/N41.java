package X;

import com.instagram.model.direct.stickerstore.DirectStoreSticker;

public final class N41 extends AnonymousClass0T0 {
    public final int A00;
    public final Object A01;

    public N41(C61077JwF jwF, int i) {
        this.A00 = i;
        this.A01 = jwF;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof N41) || ((N41) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final String A01() {
        int i = this.A00;
        Object obj = ((C61077JwF) this.A01).A00;
        switch (i) {
            case 2:
                return ((C68137N2b) obj).A00.A05;
            case 3:
                return ((DirectStoreSticker) obj).A04;
            default:
                String str = ((C317966o8) obj).A0S;
                0qQ.A07(str);
                return str;
        }
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(i, obj) || !0qQ.A0K(this.A01, ((N41) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        switch (i) {
            case 0:
                str = "AiSticker(stickerItem=";
                break;
            case 1:
                str = "CutoutSticker(stickerItem=";
                break;
            case 2:
                str = "GiphySticker(stickerItem=";
                break;
            default:
                str = "StoreSticker(stickerItem=";
                break;
        }
        A1A.append(str);
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
