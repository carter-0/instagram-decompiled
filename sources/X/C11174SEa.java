package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.SEa  reason: case insensitive filesystem */
public final class C11174SEa {
    public static final C11228SGg A02 = new C11228SGg("ReviewService");
    public SOS A00;
    public final String A01;

    public C11174SEa(Context context) {
        int length;
        String str;
        this.A01 = context.getPackageName();
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (length = signatureArr.length) == 0) {
                    C11228SGg sGg = C10002Rkx.A00;
                    if (Log.isLoggable("PlayCore", 5)) {
                        Pxf.A1L(sGg.A00, " : ", "Phonesky package is not signed -- possibly self-built package. Could not verify.", "PlayCore");
                        return;
                    }
                    return;
                }
                int i = 0;
                do {
                    byte[] byteArray = signatureArr[i].toByteArray();
                    try {
                        MessageDigest instance = MessageDigest.getInstance("SHA-256");
                        instance.update(byteArray);
                        str = Base64.encodeToString(instance.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        str = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                        String str2 = Build.TAGS;
                        if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                            i++;
                        }
                    }
                    this.A00 = new SOS(context, Pxe.A0G("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), A02, SC1.A00);
                    return;
                } while (i < length);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
