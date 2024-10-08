package X;

import com.instagram.api.schemas.RepostRestrictedReason;

/* renamed from: X.DNv  reason: case insensitive filesystem */
public final class C46142DNv extends 0Yg implements 0sP {
    public static final C46142DNv A00 = new C46142DNv();

    public C46142DNv() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = RepostRestrictedReason.A01.get(obj);
        if (obj2 == null) {
            return RepostRestrictedReason.UNRECOGNIZED;
        }
        return obj2;
    }
}
