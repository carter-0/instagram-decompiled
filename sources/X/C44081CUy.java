package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CUy  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44081CUy {
    public static Map A00(C46274DTd dTd) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dTd.AXs() != null) {
            A1H.put("account_id", dTd.AXs());
        }
        if (dTd.getFullName() != null) {
            A1H.put("full_name", dTd.getFullName());
        }
        if (dTd.getProfilePicUrl() != null) {
            A1H.put("profile_pic_url", dTd.getProfilePicUrl());
        }
        if (dTd.getUsername() != null) {
            A1H.put(Dbk.A00(), dTd.getUsername());
        }
        return 0Yt.A0B(A1H);
    }
}
