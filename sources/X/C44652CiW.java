package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CiW  reason: case insensitive filesystem */
public abstract class C44652CiW {
    public static C279894zc parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            User user = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayList = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if ("promptText".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("creator".equals(A17)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = 1aC.A00(r14, false);
                } else if ("eduTest".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if (C273654mx.A00(1498).equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                } else if ("notes".equals(A17)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            C279864zZ parseFromJson = B5T.parseFromJson(r14);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r14.A0z();
            }
            if (str == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r14, "PromptWithResponses");
            } else if (str2 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("promptText", r14, "PromptWithResponses");
            } else if (arrayList != null || !(r14 instanceof 0c9)) {
                return new C279894zc(user, str, str2, str3, str4, arrayList);
            } else {
                AnonymousClass7TF.A1L("notes", r14, "PromptWithResponses");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
