package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.WUg  reason: case insensitive filesystem */
public final class C19324WUg implements X6W {
    public int A00 = 0;
    public User A01 = null;

    public final Integer CAn() {
        return AnonymousClass05K.A0N;
    }

    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            A0K.A0P("bounds_padding_for_underline", this.A00);
            if (this.A01 != null) {
                A0K.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                User user = this.A01;
                Parcelable.Creator creator = User.CREATOR;
                1aC.A08(A0K, user);
            }
            return AnonymousClass7TG.A0k(A0K, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
