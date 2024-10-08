package X;

import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Olc  reason: case insensitive filesystem */
public final class C71487Olc implements C74288PsG {
    public final String A00;
    public final HashMap A01 = AnonymousClass7TE.A1E();

    public static boolean A00(String str, String str2) {
        HashMap hashMap = FileProvider.A05;
        int length = str.length();
        if (length > 0) {
            int i = length - 1;
            if (str.charAt(i) == '/') {
                str = str.substring(0, i);
            }
        }
        int length2 = str2.length();
        if (length2 > 0) {
            int i2 = length2 - 1;
            if (str2.charAt(i2) == '/') {
                str2 = str2.substring(0, i2);
            }
        }
        if (str.equals(str2) || str.startsWith(002.A0C(str2, '/'))) {
            return true;
        }
        return false;
    }

    public C71487Olc(String str) {
        this.A00 = str;
    }

    public final File B5f(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.A01.get(decode);
        if (file != null) {
            File A0s = JTO.A0s(file, decode2);
            try {
                File canonicalFile = A0s.getCanonicalFile();
                if (A00(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw C51973G9u.A0g(A0s, "Failed to resolve canonical path for ", AnonymousClass7TE.A1A());
            }
        } else {
            throw C51973G9u.A0g(uri, "Unable to find configured root for ", AnonymousClass7TE.A1A());
        }
    }
}
