package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.MediaKitVisibility;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Kv4  reason: case insensitive filesystem */
public abstract class C63321Kv4 {
    public static C61221JzE parseFromJson(16F r19) {
        String A00;
        String str;
        16F r8 = r19;
        0qQ.A0B(r8, 0);
        try {
            Boolean bool = null;
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            User user = null;
            String str4 = null;
            String str5 = null;
            MediaKitVisibility mediaKitVisibility = null;
            while (true) {
                16L A1J = r8.A1J();
                16L r9 = 16L.A09;
                A00 = C273654mx.A00(76);
                if (A1J == r9) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                if (A00.equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            C41846B3n.A1D(r8, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if ("is_draft".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r8);
                } else if ("owner".equals(A17)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = 1aC.A00(r8, false);
                } else if ("share_link".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r8.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r8.A1P();
                    }
                } else if ("visibility".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    mediaKitVisibility = (MediaKitVisibility) MediaKitVisibility.A01.get(str);
                    if (mediaKitVisibility == null) {
                        mediaKitVisibility = MediaKitVisibility.UNRECOGNIZED;
                    }
                }
                r8.A0z();
            }
            if (arrayList == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r8, "MediaKitSummary");
            } else if (bool == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_draft", r8, "MediaKitSummary");
            } else if (user == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("owner", r8, "MediaKitSummary");
            } else if (str5 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r8, "MediaKitSummary");
            } else if (mediaKitVisibility != null || !(r8 instanceof 0c9)) {
                return new C61221JzE(mediaKitVisibility, user, str2, str3, str4, str5, arrayList, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("visibility", r8, "MediaKitSummary");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
