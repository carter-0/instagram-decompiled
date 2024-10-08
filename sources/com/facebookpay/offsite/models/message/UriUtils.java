package com.facebookpay.offsite.models.message;

import X.0qQ;
import X.DbT;
import X.Pxe;
import X.Pxf;
import android.net.Uri;
import android.webkit.URLUtil;

public final class UriUtils {
    public static final UriUtils INSTANCE = new Object();

    public final String checkUriFormat(String str) {
        0qQ.A0B(str, 0);
        if (!URLUtil.isValidUrl(str)) {
            return null;
        }
        return str;
    }

    public final String toUriAuthorityAndPath(String str) {
        0qQ.A0B(str, 0);
        try {
            Uri A09 = DbT.A09(str);
            return Pxf.A0b(Pxe.A0I().scheme(A09.getScheme()).authority(A09.getAuthority()));
        } catch (SecurityException unused) {
            return new String();
        }
    }
}
