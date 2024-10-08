package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.List;

/* renamed from: X.JXx  reason: case insensitive filesystem */
public abstract class C59778JXx {
    public static final MediaUploadMetadata A02(0lg r16, String str) {
        String str2 = str;
        if (str == null || !00p.A0k(str2, "OCULUS_ATTRIBUTION_ID:", false) || !00l.A0X(str2, '-')) {
            return null;
        }
        List A18 = DbV.A18(new 11S("^OCULUS_ATTRIBUTION_ID:").A01(str2, ""), "-");
        String str3 = (String) 00k.A0O(A18, 1);
        return new MediaUploadMetadata((ImmersiveMediaFields) null, 182.A04(0Tu.A05, r16, 36882683762639307L), str3, (String) null, (String) null, (String) 00k.A0O(A18, 0), (String) null, (String) null, (String) null, (String) null, (String) 00k.A0O(A18, 2), false);
    }

    public static final MediaUploadMetadata A01(Intent intent, 0lg r4) {
        if (182.A06(0Tu.A05, r4, 36316662908523077L)) {
            return A02(r4, intent.getStringExtra("media_info"));
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.0bY] */
    public static final MediaUploadMetadata A00(Context context, Uri uri, UserSession userSession, String str) {
        String A00;
        AnonymousClass7TG.A1N(str, userSession);
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36316662908523077L)) {
            return null;
        }
        if (182.A06(r2, userSession, 36316662908719688L)) {
            A00 = C59805JYz.A00(context, uri);
        } else {
            Uri A002 = 0cp.A00(new Object(), str);
            if (A002 == null) {
                return null;
            }
            A00 = C59782JYb.A00(A002);
        }
        return A02(userSession, A00);
    }

    public static final MediaUploadMetadata A03(UserSession userSession, String str) {
        String str2;
        AnonymousClass7TG.A1N(str, userSession);
        if (!182.A06(0Tu.A05, userSession, 36316662908523077L)) {
            return null;
        }
        Uri uri = C364678lo.A00;
        try {
            str2 = new C227922kK(str).A0N("ImageDescription");
            if (str2 == null) {
                str2 = "";
            }
        } catch (IOException e) {
            0KC.A0F("ImageManager", "cannot read exif", e);
            str2 = "";
        }
        return A02(userSession, str2);
    }
}
