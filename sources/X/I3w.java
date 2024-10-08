package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;
import java.util.List;

public abstract class I3w {
    public static String A00;

    public static final XSC A00(ClipsMidCardSubtype clipsMidCardSubtype) {
        0qQ.A0B(clipsMidCardSubtype, 0);
        try {
            return XSC.valueOf(AnonymousClass7TF.A0k(clipsMidCardSubtype.A00));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final XSE A01(InstagramMidcardType instagramMidcardType) {
        0qQ.A0B(instagramMidcardType, 0);
        try {
            return XSE.valueOf(AnonymousClass7TF.A0k(instagramMidcardType.A00));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void A02(0Aj r2, ClipsMidCardSubtype clipsMidCardSubtype, InstagramMidcardType instagramMidcardType, AnonymousClass93T r5) {
        r2.AAJ("chaining_session_id", r5.A00);
        r2.AAe("playlist_ids", (List) null);
        r2.A8M(A01(instagramMidcardType), "midcard_type");
        r2.A8M(A00(clipsMidCardSubtype), "midcard_subtype");
        r2.Cgf();
    }
}
