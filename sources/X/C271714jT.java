package X;

import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.androidlink.AndroidLinkImpl;

/* renamed from: X.4jT  reason: invalid class name and case insensitive filesystem */
public abstract class C271714jT {
    public static final AnonymousClass47L A01(AndroidLink androidLink) {
        0qQ.A0B(androidLink, 0);
        Integer BMu = androidLink.BMu();
        if (BMu == null) {
            return null;
        }
        return (AnonymousClass47L) AnonymousClass47L.A01.get(BMu.intValue());
    }

    public static final AndroidLinkImpl A00(String str) {
        return new AndroidLinkImpl((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, Integer.valueOf(AnonymousClass47L.AD_DESTINATION_WEB.A00), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str);
    }
}
