package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Gqm  reason: case insensitive filesystem */
public final class C53571Gqm extends AnonymousClass0T0 implements C59506JMe {
    public final int A00;
    public final int A01;
    public final ImageUrl A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53571Gqm) {
                C53571Gqm gqm = (C53571Gqm) obj;
                if (!(this.A01 == gqm.A01 && this.A00 == gqm.A00 && this.A03 == gqm.A03 && 0qQ.A0K(this.A02, gqm.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int i = ((this.A01 * 31) + this.A00) * 31;
        int intValue = this.A03.intValue();
        if (1 != intValue) {
            str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        } else {
            str = "SAVED_AUDIO";
        }
        return C51971G9r.A0F(str, intValue, i) + AnonymousClass7TG.A0C(this.A02);
    }

    public C53571Gqm(ImageUrl imageUrl, Integer num, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = num;
        this.A02 = imageUrl;
    }
}
