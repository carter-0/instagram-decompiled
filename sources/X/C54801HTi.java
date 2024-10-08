package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HTi  reason: case insensitive filesystem */
public abstract /* synthetic */ class C54801HTi {
    public static Map A00(C274404oG r4) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.AyG() != null) {
            A1H.put("display_url", r4.AyG());
        }
        String str2 = null;
        if (r4.B40() != null) {
            ImageUrl B40 = r4.B40();
            if (B40 != null) {
                str = B40.getUrl();
            } else {
                str = null;
            }
            A1H.put("favicon_url", str);
        }
        if (r4.BGK() != null) {
            ImageUrl BGK = r4.BGK();
            if (BGK != null) {
                str2 = BGK.getUrl();
            }
            A1H.put("image_url", str2);
        }
        if (r4.Bjg() != null) {
            A1H.put(C273654mx.A00(909), r4.Bjg());
        }
        if (r4.getTitle() != null) {
            A1H.put(DialogModule.KEY_TITLE, r4.getTitle());
        }
        if (r4.getUrl() != null) {
            A1H.put("url", r4.getUrl());
        }
        return 0Yt.A0B(A1H);
    }
}
