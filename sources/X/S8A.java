package X;

import android.content.Context;
import com.facebook.analytics.util.AnalyticsMemoryUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public abstract class S8A {
    public static HashSet A00() {
        String[] loadedLibraries = AnalyticsMemoryUtil.getLoadedLibraries();
        HashSet A1F = AnonymousClass7TE.A1F();
        for (String str : loadedLibraries) {
            if (!str.startsWith("/system") && !str.startsWith("/vendor")) {
                A1F.add(AnonymousClass7TE.A0t(str).getName());
            }
        }
        return A1F;
    }

    public static HashSet A01(Context context, String[] strArr) {
        BufferedReader bufferedReader;
        HashSet A00 = A00();
        for (String str : strArr) {
            File A0U = Pxf.A0U("libs_", str, JTO.A0s(context.getFilesDir(), "nativemetrics"));
            if (A0U.exists()) {
                try {
                    bufferedReader = new BufferedReader(new FileReader(A0U));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        A00.add(readLine);
                    }
                    bufferedReader.close();
                } catch (IOException e) {
                    0KC.A0M("NativeFilesUtils", "Error reading loaded libraries for process: %s", e, new Object[]{str});
                } catch (Throwable th) {
                    C9153RRe.A00(th, th);
                }
            }
        }
        return A00;
        throw th;
    }
}
