package X;

import android.os.Bundle;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Hec  reason: case insensitive filesystem */
public abstract class C55247Hec {
    public static final Bundle A00(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("header_title", str);
        A0a.putString("header_profile_user_name", str2);
        A0a.putBoolean("header_profile_is_verified", z);
        A0a.putString("header_description", str3);
        A0a.putString("image_url", str4);
        A0a.putParcelable(AnonymousClass000.A00(40), imageUrl);
        A0a.putString("profile_id", str5);
        A0a.putString("source_media_id", str6);
        A0a.putString("source_media_surface", str7);
        A0a.putBoolean("disable_cta", z2);
        A0a.putString("cta_url_override", str8);
        return A0a;
    }
}
