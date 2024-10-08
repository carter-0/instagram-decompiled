package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.Rv7  reason: case insensitive filesystem */
public final class C10613Rv7 {
    public final C11229SGh A00;
    public final SOT A01;
    public final String A02;

    public C10613Rv7(Context context, C11229SGh sGh) {
        int length;
        String str;
        this.A02 = context.getPackageName();
        this.A00 = sGh;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (length = signatureArr.length) == 0) {
                    C11229SGh sGh2 = C10006Rl1.A00;
                    if (Log.isLoggable("PlayCore", 5)) {
                        Pxf.A1L(sGh2.A00, " : ", "Phonesky package is not signed -- possibly self-built package. Could not verify.", "PlayCore");
                    }
                } else {
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
                        this.A01 = new SOT(context, C10001Rkw.A00, SC0.A00, sGh);
                        return;
                    } while (i < length);
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", 002.A0g(sGh.A00, " : ", "Phonesky is not installed."));
        }
    }
}
