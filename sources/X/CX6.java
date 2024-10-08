package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CX6 {
    public static Map A00(AnonymousClass5DW r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        r3.isVerified();
        A1H.put("is_verified", Boolean.valueOf(r3.isVerified()));
        if (r3.getProfilePicUrl() != null) {
            A1H.put("profile_pic_url", r3.getProfilePicUrl());
        }
        if (r3.getUsername() != null) {
            A1H.put(Dbk.A00(), r3.getUsername());
        }
        return 0Yt.A0B(A1H);
    }
}
