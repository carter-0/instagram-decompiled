package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.direct.smartsuggestion.model.SmartSuggestionCTA;
import java.io.IOException;

/* renamed from: X.3tu  reason: invalid class name and case insensitive filesystem */
public abstract class C255303tu {
    public static SmartSuggestionCTA parseFromJson(16F r8) {
        Integer num;
        String str;
        0qQ.A0B(r8, 0);
        try {
            SmartSuggestionCTA smartSuggestionCTA = new SmartSuggestionCTA();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                String str2 = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    if (r8.A11() != 16L.A0G) {
                        str2 = r8.A1P();
                    }
                    0qQ.A0B(str2, 0);
                    Integer[] A00 = AnonymousClass05K.A00(3);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            switch (num.intValue()) {
                                case 1:
                                    str = "send";
                                    break;
                                case 2:
                                    str = NetInfoModule.CONNECTION_TYPE_NONE;
                                    break;
                                default:
                                    str = "unknown";
                                    break;
                            }
                            if (!str.equals(str2)) {
                                i++;
                            }
                        } else {
                            num = AnonymousClass05K.A00;
                        }
                    }
                    smartSuggestionCTA.A00 = num;
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r8.A11() != 16L.A0G) {
                        str2 = r8.A1P();
                    }
                    smartSuggestionCTA.A01 = str2;
                }
                r8.A0z();
            }
            return smartSuggestionCTA;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, SmartSuggestionCTA smartSuggestionCTA) {
        String str;
        r2.A0c();
        Integer num = smartSuggestionCTA.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "send";
                    break;
                case 2:
                    str = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
                default:
                    str = "unknown";
                    break;
            }
            r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        }
        String str2 = smartSuggestionCTA.A01;
        if (str2 != null) {
            r2.A0R(DialogModule.KEY_TITLE, str2);
        }
        r2.A0Z();
    }
}
