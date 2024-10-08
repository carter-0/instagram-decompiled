package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.IntentAwareAdsFormatInfo;
import com.instagram.api.schemas.IntentAwareAdsFormatType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ecs  reason: case insensitive filesystem */
public abstract /* synthetic */ class C48335Ecs {
    public static Map A00(IntentAwareAdsFormatInfo intentAwareAdsFormatInfo) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (intentAwareAdsFormatInfo.B7R() != null) {
            IntentAwareAdsFormatType B7R = intentAwareAdsFormatInfo.B7R();
            if (B7R != null) {
                str = B7R.A00;
            } else {
                str = null;
            }
            A1H.put("format", str);
        }
        if (intentAwareAdsFormatInfo.getTitle() != null) {
            A1H.put(DialogModule.KEY_TITLE, intentAwareAdsFormatInfo.getTitle());
        }
        return 0Yt.A0B(A1H);
    }
}
