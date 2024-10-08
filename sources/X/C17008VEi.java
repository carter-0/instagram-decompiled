package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VEi  reason: case insensitive filesystem */
public abstract class C17008VEi {
    public static C15966Uli parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C15966Uli uli = new C15966Uli();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("dismissible".equals(A17)) {
                    uli.A0H = r4.A0d();
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A17)) {
                    uli.A01 = 16h.A00(r4);
                } else if ("icon_width_dp".equals(A17)) {
                    uli.A04 = AnonymousClass7TF.A0X(r4);
                } else if ("icon_height_dp".equals(A17)) {
                    uli.A03 = AnonymousClass7TF.A0X(r4);
                } else {
                    ArrayList arrayList = null;
                    if (DialogModule.KEY_MESSAGE.equals(A17)) {
                        uli.A0B = AnonymousClass7TG.A0l(r4);
                    } else if ("message_color".equals(A17)) {
                        uli.A0C = AnonymousClass7TG.A0l(r4);
                    } else if (C41845B3m.A1E(A17)) {
                        uli.A0D = AnonymousClass7TG.A0l(r4);
                    } else if ("title_color".equals(A17)) {
                        uli.A0E = AnonymousClass7TG.A0l(r4);
                    } else if (C41845B3m.A1C(A17)) {
                        uli.A0F = AnonymousClass7TG.A0l(r4);
                    } else if ("background_color".equals(A17)) {
                        uli.A05 = AnonymousClass7TG.A0l(r4);
                    } else if ("dismiss_button_color".equals(A17)) {
                        uli.A09 = AnonymousClass7TG.A0l(r4);
                    } else if ("button_location".equals(A17)) {
                        uli.A08 = AnonymousClass7TG.A0l(r4);
                    } else if ("megaphone_version".equals(A17)) {
                        uli.A0A = AnonymousClass7TG.A0l(r4);
                    } else if (AnonymousClass000.A00(4543).equals(A17)) {
                        uli.A07 = AnonymousClass7TG.A0l(r4);
                    } else if ("buttons".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C17633VbP parseFromJson = C17007VEh.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        uli.A0G = arrayList;
                    } else if ("bottom_icon".equals(A17)) {
                        uli.A00 = 16h.A00(r4);
                    } else if ("bottom_message".equals(A17)) {
                        uli.A06 = AnonymousClass7TG.A0l(r4);
                    } else {
                        C48900Em0.A00(r4, uli, A17);
                    }
                }
                r4.A0z();
            }
            if (!"v3".equalsIgnoreCase(uli.A0A)) {
                return uli;
            }
            C16584Uxe uxe = (C16584Uxe) C16584Uxe.A01.get(uli.A07);
            if (uxe != null) {
                uli.A02 = uxe;
                return uli;
            }
            throw new IllegalStateException("Unsupported button layout");
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
