package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public abstract class RUN {
    public static final String A00(Set set) {
        0qQ.A0B(set, 0);
        Set A0j = 00k.A0j(00k.A0Z(00k.A0a(set)));
        List asList = Arrays.asList(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID, "ent_id", "usage_frequency"});
        0qQ.A07(asList);
        A0j.removeAll(00k.A0k(asList));
        String join = TextUtils.join(", ", A0j);
        0qQ.A07(join);
        return join;
    }
}
