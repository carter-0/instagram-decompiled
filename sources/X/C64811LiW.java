package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.LiW  reason: case insensitive filesystem */
public final class C64811LiW implements C232262tL {
    public int A00 = -1;
    public final C276014sL A01;

    public C64811LiW(C276014sL r3) {
        0qQ.A0B(r3, 1);
        this.A01 = r3;
    }

    public final ImageUrl A00() {
        ImageUrl A1Q = this.A01.A00.A1Q();
        if (A1Q != null) {
            return A1Q;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String id = this.A01.A00.getId();
        if (id != null) {
            return id;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C64811LiW liW = (C64811LiW) obj;
        String id = this.A01.A00.getId();
        if (id != null) {
            ImageUrl imageUrl = null;
            if (liW != null) {
                str = liW.A01.A00.getId();
                if (str == null) {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                str = null;
            }
            if (!id.equals(str)) {
                return false;
            }
            ImageUrl A002 = A00();
            if (liW != null) {
                imageUrl = liW.A00();
            }
            if (!0qQ.A0K(A002, imageUrl) || liW == null || this.A00 != liW.A00) {
                return false;
            }
            return true;
        }
        throw AnonymousClass7TE.A0y();
    }
}
