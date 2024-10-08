package X;

/* renamed from: X.5EU  reason: invalid class name */
public final class AnonymousClass5EU extends AnonymousClass0T0 implements C251373n0 {
    public final AnonymousClass4EB A00;
    public final int A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5EU) {
                AnonymousClass5EU r5 = (AnonymousClass5EU) obj;
                if (!(0qQ.A0K(this.A00, r5.A00) && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final long AsM() {
        throw new UnsupportedOperationException("Creation time retrieval is not supported for this object.");
    }

    public final long B2r() {
        throw new UnsupportedOperationException("Explicit expiration time retrieval is not supported for this object.");
    }

    public final /* synthetic */ int B9W() {
        throw new UnsupportedOperationException("Not supported");
    }

    public final /* bridge */ /* synthetic */ Object BTb() {
        return this.A00;
    }

    public final /* synthetic */ Integer Bdb() {
        return AnonymousClass05K.A00;
    }

    public final /* synthetic */ String BnF() {
        return "";
    }

    public final int BnH() {
        return this.A01;
    }

    public final /* synthetic */ String BnL() {
        return "";
    }

    public final /* synthetic */ boolean Bo5() {
        return false;
    }

    public final Integer Bxj() {
        return this.A02;
    }

    public final /* synthetic */ boolean CUo() {
        return false;
    }

    public final /* synthetic */ void Eiv(boolean z) {
        throw new UnsupportedOperationException("Not supported");
    }

    public final int hashCode() {
        Integer num = this.A02;
        return (((this.A00.hashCode() * 31) + C271804jc.A01(num).hashCode() + num.intValue()) * 31) + this.A01;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("FeedSponsoredPoolItem(sponsoredFeedItem=");
        sb.append(this.A00);
        sb.append(", deliverySource=");
        Integer num = this.A02;
        if (num != null) {
            str = C271804jc.A01(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", requestPosition=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass5EU(AnonymousClass4EB r1, Integer num, int i) {
        this.A00 = r1;
        this.A02 = num;
        this.A01 = i;
    }
}
