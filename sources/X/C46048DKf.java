package X;

import com.instagram.api.schemas.FBBioLinkSocialContextType;

/* renamed from: X.DKf  reason: case insensitive filesystem */
public final class C46048DKf extends 0Yg implements 0sP {
    public static final C46048DKf A00 = new C46048DKf();

    public C46048DKf() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = FBBioLinkSocialContextType.A01.get(obj);
        if (obj2 == null) {
            return FBBioLinkSocialContextType.UNRECOGNIZED;
        }
        return obj2;
    }
}
