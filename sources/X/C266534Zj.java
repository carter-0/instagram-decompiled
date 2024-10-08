package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4Zj  reason: invalid class name and case insensitive filesystem */
public abstract class C266534Zj {
    public static C266544Zk parseFromJson(16F r17) {
        16F r9 = r17;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (r9.A1J() != 16L.A09) {
                String A0q = r9.A0q();
                r9.A1J();
                if ("facepile_users".equals(A0q)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A00 = 1aC.A00(r9, false);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("primary_button_text".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if ("subtitle".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r9.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (str == null && (r9 instanceof 0c9)) {
                ((0c9) r9).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "GenericSuggestionCard");
            } else if (str2 == null && (r9 instanceof 0c9)) {
                ((0c9) r9).A03.A00("primary_button_text", "GenericSuggestionCard");
            } else if (str3 == null && (r9 instanceof 0c9)) {
                ((0c9) r9).A03.A00("subtitle", "GenericSuggestionCard");
            } else if (str4 == null && (r9 instanceof 0c9)) {
                ((0c9) r9).A03.A00(DialogModule.KEY_TITLE, "GenericSuggestionCard");
            } else if (str5 != null || !(r9 instanceof 0c9)) {
                return new C266544Zk(str, str2, str3, str4, str5, arrayList);
            } else {
                ((0c9) r9).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "GenericSuggestionCard");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
