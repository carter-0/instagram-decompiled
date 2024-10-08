package X;

import com.instagram.api.schemas.ProfileThemeType;

/* renamed from: X.DLg  reason: case insensitive filesystem */
public final class C46075DLg extends 0Yg implements 0sP {
    public static final C46075DLg A00 = new C46075DLg();

    public C46075DLg() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ProfileThemeType.A01.get(obj);
        if (obj2 == null) {
            return ProfileThemeType.UNRECOGNIZED;
        }
        return obj2;
    }
}
