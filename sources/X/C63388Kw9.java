package X;

import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.Kw9  reason: case insensitive filesystem */
public abstract class C63388Kw9 {
    public static final C61021JvL A00(C255323tw r8) {
        String A03 = r8.A03(AnonymousClass000.A00(1042));
        if (A03 != null) {
            String A032 = r8.A03("PENDING_MEDIA_KEY");
            if (A032 != null) {
                String A033 = r8.A03("PENDING_MEDIA_TYPE_KEY");
                if (A033 == null) {
                    A033 = "UNINITIALIZED";
                }
                1iA valueOf = 1iA.valueOf(A033);
                String A034 = r8.A03("PENDING_SHARE_TYPE_KEY");
                if (A034 != null) {
                    ShareType valueOf2 = ShareType.valueOf(A034);
                    28D A01 = AnonymousClass3QU.A01(r8.A03("CAMERA_ENTRY_POINT_KEY"));
                    String A035 = r8.A03("SOURCE_KEY");
                    if (A035 != null) {
                        return new C61021JvL(A01, valueOf, valueOf2, A03, A032, A035, r8.A02("RUN_COUNT_KEY", -1));
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
