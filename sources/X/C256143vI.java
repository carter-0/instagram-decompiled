package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.UserTagInfoDict;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3vI  reason: invalid class name and case insensitive filesystem */
public abstract class C256143vI {
    public static UserTagInfoDict parseFromJson(16F r11) {
        String A1P;
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Float f = null;
            ArrayList arrayList2 = null;
            Boolean bool = null;
            Float f2 = null;
            User user = null;
            while (r11.A1J() != 16L.A09) {
                String A0q = r11.A0q();
                r11.A1J();
                if ("categories".equals(A0q)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r11.A1J() != 16L.A08) {
                            if (!(r11.A11() == 16L.A0G || (A1P = r11.A1P()) == null)) {
                                arrayList.add(A1P);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("duration_in_video_in_sec".equals(A0q)) {
                    f = new Float(r11.A0U());
                } else if ("position".equals(A0q)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r11.A1J() != 16L.A08) {
                            arrayList2.add(new Float(r11.A0U()));
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("show_category_of_user".equals(A0q)) {
                    bool = Boolean.valueOf(r11.A0d());
                } else if ("start_time_in_video_in_sec".equals(A0q)) {
                    f2 = new Float(r11.A0U());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = 1aC.A00(r11, false);
                }
                r11.A0z();
            }
            return new UserTagInfoDict(user, bool, f, f2, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
