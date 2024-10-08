package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Txi  reason: case insensitive filesystem */
public abstract class C14522Txi {
    public static C14523Txj parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C14523Txj txj = new C14523Txj();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    txj.A00 = (C16630UyQ) EnumHelper.A00(r4.A1Q(), C16630UyQ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("parameters".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C14529Txp parseFromJson = C14528Txo.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    txj.A01 = arrayList;
                }
                r4.A0z();
            }
            return txj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
