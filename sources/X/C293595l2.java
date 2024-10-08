package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5l2  reason: invalid class name and case insensitive filesystem */
public abstract class C293595l2 {
    public static C293605l3 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C293605l3 r1 = new C293605l3();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                ArrayList arrayList = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A00 = 1aC.A00(r5, false);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r1.A01 = arrayList;
                } else if ("thread".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C290915gD parseFromJson = C290905gC.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r1.A00 = arrayList;
                }
                r5.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
