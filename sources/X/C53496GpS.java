package X;

import com.instagram.model.mediatype.ProductType;

/* renamed from: X.GpS  reason: case insensitive filesystem */
public final class C53496GpS extends AnonymousClass0T0 implements C59481JLf {
    public final int A00 = 0;
    public final Object A01;

    public C53496GpS(Integer num) {
        0qQ.A0B(num, 1);
        this.A01 = num;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C53496GpS) || ((C53496GpS) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!A00(i, obj) || this.A01 != ((C53496GpS) obj).A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        if (this.A00 == 0) {
            return this.A01.hashCode();
        }
        int A0M = AnonymousClass7TE.A0M(this.A01);
        if (1 != A0M) {
            str = "MESSAGE_ALLOWED";
        } else {
            str = "UNSUPPORTED_COMMENT_TYPE";
        }
        return C51966G9m.A04(str, A0M);
    }

    public C53496GpS(ProductType productType) {
        this.A01 = productType;
    }
}
