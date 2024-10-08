package X;

import com.instagram.api.schemas.AdFormatType;

/* renamed from: X.DNz  reason: case insensitive filesystem */
public final class C46146DNz extends 0Yg implements 0sP {
    public static final C46146DNz A00 = new C46146DNz();

    public C46146DNz() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = AdFormatType.A01.get(obj);
        if (obj2 == null) {
            return AdFormatType.UNRECOGNIZED;
        }
        return obj2;
    }
}
