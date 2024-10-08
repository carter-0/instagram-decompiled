package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

public final class AAZ {
    public static C384609hb parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A17)) {
                    Parcelable.Creator creator = User.CREATOR;
                    r1.A00 = 1aC.A00(r5, false);
                } else {
                    ArrayList arrayList = null;
                    if ("media".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                1Xj A00 = 1Xj.A00(r5);
                                if (A00 != null) {
                                    arrayList.add(A00);
                                }
                            }
                        }
                        r1.A01 = arrayList;
                    } else if ("like_count".equals(A17) || "comment_count".equals(A17)) {
                        r5.A1D();
                    } else if ("stats".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r5, arrayList);
                            }
                        }
                        r1.A02 = arrayList;
                    } else {
                        1XY.A01(r5, r1, A17);
                    }
                }
                r5.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
