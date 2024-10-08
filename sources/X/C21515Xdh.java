package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.api.schemas.RemoteBooleanSettingId;
import com.instagram.api.schemas.SettingId;
import java.io.IOException;

/* renamed from: X.Xdh  reason: case insensitive filesystem */
public final class C21515Xdh {
    public static XPK parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A02 = 16P.A02(r8);
                if ("error_name_value".equals(A02)) {
                    r1.A04 = AnonymousClass7TG.A0l(r8);
                } else if ("fallback_message".equals(A02)) {
                    r1.A05 = AnonymousClass7TG.A0l(r8);
                } else if (AnonymousClass000.A00(1340).equals(A02)) {
                    r1.A06 = AnonymousClass7TG.A0l(r8);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A02)) {
                    SettingId settingId = (SettingId) SettingId.A01.get(AnonymousClass7TG.A0l(r8));
                    if (settingId == null) {
                        settingId = SettingId.UNRECOGNIZED;
                    }
                    r1.A02 = settingId;
                } else if ("setting_id".equals(A02)) {
                    RemoteBooleanSettingId remoteBooleanSettingId = (RemoteBooleanSettingId) RemoteBooleanSettingId.A01.get(AnonymousClass7TG.A0l(r8));
                    if (remoteBooleanSettingId == null) {
                        remoteBooleanSettingId = RemoteBooleanSettingId.UNRECOGNIZED;
                    }
                    r1.A01 = remoteBooleanSettingId;
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A02)) {
                    r1.A03 = Boolean.valueOf(r8.A0d());
                } else {
                    1XY.A01(r8, r1, A02);
                }
                r8.A0z();
            }
            String str = r1.A04;
            String str2 = r1.A05;
            String str3 = r1.A06;
            SettingId settingId2 = r1.A02;
            RemoteBooleanSettingId remoteBooleanSettingId2 = r1.A01;
            Boolean bool = r1.A03;
            0qQ.A0A(bool);
            r1.A00 = new C60941Jtz(remoteBooleanSettingId2, settingId2, str, str2, str3, bool.booleanValue());
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
