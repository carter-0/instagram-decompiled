package X;

import android.util.Log;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.HZz  reason: case insensitive filesystem */
public abstract class C54969HZz {
    public static final void A00(1Fa r8, C231312rP r9) {
        Number number;
        Integer num;
        StringWriter stringWriter = new StringWriter();
        try {
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            A0K.A0P("total_num_items", r9.B5I());
            Pair BL8 = r9.BL8();
            AnonymousClass1Xn r6 = null;
            if (BL8 != null) {
                r6 = (AnonymousClass1Xn) BL8.first;
                number = (Number) BL8.second;
            } else {
                number = null;
            }
            if (!(r6 == null || number == null)) {
                A0K.A0q("last_non_organic_item");
                A0K.A0c();
                A0K.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r6.getId());
                if (r6 instanceof 1Xj) {
                    if (C51966G9m.A1Y(r6)) {
                        num = AnonymousClass05K.A0C;
                    } else {
                        num = AnonymousClass05K.A01;
                    }
                } else if (r6 instanceof AnonymousClass3O9) {
                    num = AnonymousClass05K.A0N;
                } else {
                    num = AnonymousClass05K.A00;
                }
                A0K.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, num.intValue());
                A0K.A0P("index", number.intValue());
                A0K.A0Z();
            }
            Pair BLD = r9.BLD();
            if (BLD != null) {
                1Xj r2 = (1Xj) BLD.first;
                Number number2 = (Number) BLD.second;
                if (!(r2 == null || number2 == null)) {
                    A0K.A0q("last_organic_item");
                    A0K.A0c();
                    A0K.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r2.getId());
                    A0K.A0P("index", number2.intValue());
                    A0K.A0Z();
                }
            }
            A0K.A0Z();
            A0K.close();
            r8.A9m("paging_token", stringWriter.toString());
        } catch (IOException unused) {
            Log.e("DiscoveryChainingApiUtil", AnonymousClass000.A00(2258));
        }
    }
}
