package X;

import com.instagram.api.schemas.AudioFilterType;

/* renamed from: X.Ayn  reason: case insensitive filesystem */
public final class C41696Ayn extends 0Yg implements 0sP {
    public static final C41696Ayn A00 = new C41696Ayn();

    public C41696Ayn() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = AudioFilterType.A01.get(obj);
        if (obj2 == null) {
            return AudioFilterType.UNRECOGNIZED;
        }
        return obj2;
    }
}
