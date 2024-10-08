package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.api.schemas.RemoteStringSettingId;
import com.instagram.api.schemas.SettingId;
import java.io.IOException;

/* renamed from: X.Xdk  reason: case insensitive filesystem */
public final class C21518Xdk {
    public static XPL parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            while (r9.A1J() != 16L.A09) {
                String A02 = 16P.A02(r9);
                if ("error_name_value".equals(A02)) {
                    r2.A03 = AnonymousClass7TG.A0l(r9);
                } else if ("fallback_message".equals(A02)) {
                    r2.A04 = AnonymousClass7TG.A0l(r9);
                } else if (AnonymousClass000.A00(1340).equals(A02)) {
                    r2.A05 = AnonymousClass7TG.A0l(r9);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A02)) {
                    SettingId settingId = (SettingId) SettingId.A01.get(AnonymousClass7TG.A0l(r9));
                    if (settingId == null) {
                        settingId = SettingId.UNRECOGNIZED;
                    }
                    r2.A01 = settingId;
                } else if ("setting_id".equals(A02)) {
                    RemoteStringSettingId remoteStringSettingId = (RemoteStringSettingId) RemoteStringSettingId.A01.get(AnonymousClass7TG.A0l(r9));
                    if (remoteStringSettingId == null) {
                        remoteStringSettingId = RemoteStringSettingId.UNRECOGNIZED;
                    }
                    r2.A00 = remoteStringSettingId;
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A02)) {
                    r2.A06 = AnonymousClass7TG.A0l(r9);
                } else {
                    1XY.A01(r9, r2, A02);
                }
                r9.A0z();
            }
            String str = r2.A03;
            String str2 = r2.A04;
            String str3 = r2.A05;
            SettingId settingId2 = r2.A01;
            RemoteStringSettingId remoteStringSettingId2 = r2.A00;
            String str4 = r2.A06;
            0qQ.A0A(str4);
            r2.A02 = new C60943Ju1(remoteStringSettingId2, settingId2, str, str2, str3, str4);
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
