package X;

/* renamed from: X.LOq  reason: case insensitive filesystem */
public final class C64122LOq {
    public String A00;
    public String A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C64122LOq) {
                C64122LOq lOq = (C64122LOq) obj;
                if (!"".equals("") || !0qQ.A0K(this.A01, lOq.A01) || !0qQ.A0K(this.A00, lOq.A00) || this.A02 != lOq.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A17("ExpressoDataItem(stickerPackId=", "", ", stickerTraySurface=", this.A01, ", stickerPackType=", this.A00, AnonymousClass000.A00(C249703kE.FLAG_MOVED), C63976LGo.A01(this.A02), ')');
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A00, AnonymousClass7TE.A0O(this.A01)) + C63976LGo.A00(this.A02);
    }

    public C64122LOq(String str, Integer num, String str2) {
        AnonymousClass7TG.A1Q(str, str2);
        this.A01 = str;
        this.A00 = str2;
        this.A02 = num;
    }

    public C64122LOq() {
        this("", AnonymousClass05K.A00, "");
    }
}
