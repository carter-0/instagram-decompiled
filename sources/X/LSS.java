package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public abstract class LSS {
    public static void A01(Bundle bundle) {
        bundle.putBoolean("useDebugKey", false);
        A02(bundle, byte[].class, "requestMessage");
        Class<Boolean> cls = Boolean.class;
        A02(bundle, cls, "useDebugKey");
        A02(bundle, cls, "backupAttributes");
        Class<Integer> cls2 = Integer.class;
        A02(bundle, cls2, "maxSessionAmount");
        A02(bundle, cls2, "sessionTTLOverrideMinutes");
        new Bundle();
    }

    public static Class A00(Bundle bundle) {
        A04(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE, bundle);
        Class<Bundle> cls = Bundle.class;
        A02(bundle, cls, "auxArguments");
        A02(bundle, cls, "additionalKeyMaterial");
        Class<Boolean> cls2 = Boolean.class;
        A02(bundle, cls2, "refreshVerifier");
        return cls2;
    }

    public static void A03(Class cls, Object obj, String str) {
        Class<?> cls2;
        if (obj != null && (cls2 = obj.getClass()) != cls) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Expecting: ");
            A1A.append(cls);
            A1A.append(" under key ");
            A1A.append(str);
            throw C51973G9u.A0g(cls2, " but was: ", A1A);
        }
    }

    public static void A04(String str, Bundle bundle) {
        Class<byte[]> cls = byte[].class;
        Object obj = bundle.get(str);
        if (obj != null) {
            A03(cls, obj, str);
            return;
        }
        throw AnonymousClass7TF.A0W("Missing required key: ", str);
    }

    public static void A02(Bundle bundle, Class cls, String str) {
        A03(cls, bundle.get(str), str);
    }
}
