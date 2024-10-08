package X;

import com.instagram.api.schemas.GuideMediaType;

/* renamed from: X.DNk  reason: case insensitive filesystem */
public final class C46131DNk extends 0Yg implements 0sP {
    public static final C46131DNk A00 = new C46131DNk();

    public C46131DNk() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = GuideMediaType.A01.get(obj);
        if (obj2 == null) {
            return GuideMediaType.UNRECOGNIZED;
        }
        return obj2;
    }
}
