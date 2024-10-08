package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CaW {
    public static Map A00(DUP dup) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dup.B4L() != null) {
            A1H.put("fb_obid", dup.B4L());
        }
        if (dup.getFullName() != null) {
            A1H.put("full_name", dup.getFullName());
        }
        if (dup.Bgr() != null) {
            A1H.put("profile_deeplink", dup.Bgr());
        }
        if (dup.Bh8() != null) {
            A1H.put("profile_picture_url", dup.Bh8());
        }
        if (dup.BhP() != null) {
            A1H.put("profile_www_link", dup.BhP());
        }
        if (dup.getUsername() != null) {
            A1H.put(Dbh.A00(), dup.getUsername());
        }
        return 0Yt.A0B(A1H);
    }
}
