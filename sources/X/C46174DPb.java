package X;

import com.instagram.api.schemas.ShopManagementAccessState;

/* renamed from: X.DPb  reason: case insensitive filesystem */
public final class C46174DPb extends 0Yg implements 0sP {
    public static final C46174DPb A00 = new C46174DPb();

    public C46174DPb() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ShopManagementAccessState.A01.get(obj);
        if (obj2 == null) {
            return ShopManagementAccessState.UNRECOGNIZED;
        }
        return obj2;
    }
}
