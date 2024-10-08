package X;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.DeadObjectException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

public final class MY3 {
    public static final HashMap A06 = AnonymousClass7TE.A1E();
    public static final HashSet A07 = C66580MXl.A12(Arrays.asList(new MY4[]{MY4.FILES_PATH, MY4.CACHE_PATH, MY4.EXTERNAL_FILES_PATH, MY4.EXTERNAL_CACHE_PATH}));
    public boolean A00 = false;
    public final MY5 A01;
    public final String A02;
    public final HashMap A03 = AnonymousClass7TE.A1E();
    public final Context A04;
    public final 0bY A05;

    private Uri A00(String str, String str2, String str3, boolean z) {
        boolean endsWith = str.endsWith("/");
        String str4 = "";
        int length = str3.length();
        int length2 = str.length();
        if (!endsWith) {
            length2++;
        }
        if (length > length2) {
            str4 = str3.substring(length2);
        }
        if (z) {
            str2 = 002.A0R("secure_shared_", str2);
        }
        int length3 = str4.length();
        String encode = Uri.encode(str2);
        if (length3 > 0) {
            encode = 002.A0T(encode, Uri.encode(str4, "/"), '/');
        }
        return new Uri.Builder().scheme("content").authority(this.A02).encodedPath(encode).build();
    }

    public static MY3 A01(Context context, ProviderInfo providerInfo, 0bY r6) {
        String str;
        MY3 my3;
        if (providerInfo == null) {
            str = 002.A0R(context.getApplicationContext().getPackageName(), ".securefileprovider");
        } else {
            str = providerInfo.authority;
        }
        HashMap hashMap = A06;
        synchronized (hashMap) {
            my3 = (MY3) hashMap.get(str);
            if (my3 == null) {
                try {
                    my3 = new MY3(context, providerInfo, r6);
                    hashMap.put(str, my3);
                } catch (IOException | XmlPullParserException e) {
                    r6.EFT("SecurePathStrategy", "Failed to parse com.facebook.secure.fileprovider.SECURE_FILE_PROVIDER_PATHS meta-data.", e);
                    throw AnonymousClass7TE.A0w("Failed to parse com.facebook.secure.fileprovider.SECURE_FILE_PROVIDER_PATHS meta-data.");
                }
            }
        }
        return my3;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.0bY] */
    public static C70806OMb A02(MY3 my3, MY4 my4) {
        C70806OMb oMb;
        File A002;
        HashMap hashMap = my3.A03;
        synchronized (hashMap) {
            oMb = (C70806OMb) hashMap.get(my4);
            if (oMb == null) {
                if (A07.contains(my4)) {
                    Context context = my3.A04;
                    int i = my4.A00;
                    if (i == 0) {
                        A002 = JTO.A0s(my4.A00(context), "secure_shared");
                    } else {
                        A002 = AnonymousClass0eX.A00(context, i);
                        A002.mkdirs();
                    }
                    oMb = new C70806OMb(new Object(), A002.getCanonicalFile());
                    hashMap.put(my4, oMb);
                } else {
                    throw C51973G9u.A0g(my4, "No directory manager defined for ", AnonymousClass7TE.A1A());
                }
            }
        }
        return oMb;
    }

    public static void A03(MY3 my3) {
        if (!my3.A00) {
            synchronized (my3.A03) {
                if (!my3.A00) {
                    Iterator it = A07.iterator();
                    while (it.hasNext()) {
                        A02(my3, (MY4) it.next());
                    }
                    my3.A00 = true;
                }
            }
        }
    }

    public MY3(Context context, ProviderInfo providerInfo, 0bY r7) {
        this.A05 = r7;
        this.A04 = context;
        if (providerInfo == null || providerInfo.metaData == null) {
            String A0R = 002.A0R(context.getApplicationContext().getPackageName(), ".securefileprovider");
            this.A02 = A0R;
            try {
                providerInfo = 0ba.A01(context, A0R, 2176);
            } catch (RuntimeException e) {
                if (e.getCause() instanceof DeadObjectException) {
                    this.A05.EFT("SecurePathStrategy", "DeadObjectException", e);
                } else {
                    throw e;
                }
            }
        } else {
            this.A02 = providerInfo.authority;
        }
        this.A01 = new MY5(context, providerInfo, r7, this.A02);
    }

    public final Uri A04(File file) {
        int length;
        Map.Entry A062 = A06(file);
        if (A062 == null) {
            MY5 my5 = this.A01;
            if (my5.A03) {
                String canonicalPath = file.getCanonicalPath();
                MY5.A00(my5);
                HashMap hashMap = my5.A02;
                Iterator A0s = AnonymousClass7TF.A0s(hashMap);
                Map.Entry entry = null;
                int i = 0;
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    String canonicalPath2 = ((File) A1J.getValue()).getCanonicalPath();
                    if (canonicalPath.startsWith(canonicalPath2) && (length = canonicalPath2.length()) > i) {
                        i = length;
                        entry = A1J;
                    }
                }
                String canonicalPath3 = file.getCanonicalPath();
                if (entry != null) {
                    return A00(((File) entry.getValue()).getPath(), DbT.A13(entry), canonicalPath3, false);
                }
                StringBuilder sb = new StringBuilder(canonicalPath3);
                Iterator A0s2 = AnonymousClass7TF.A0s(hashMap);
                while (A0s2.hasNext()) {
                    Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s2);
                    sb.append(", ");
                    sb.append(((File) A1J2.getValue()).getCanonicalPath());
                }
                throw new SecurityException(002.A0R("Resolved path jumped beyond configured direct roots: ", sb.toString()));
            }
            throw new SecurityException(002.A0R("Resolved path jumped beyond configured temporary roots: ", file.getPath()));
        }
        File A002 = ((C70806OMb) A062.getValue()).A00();
        return A00(A002.getPath(), ((MY4) A062.getKey()).A01, file.getCanonicalPath(), true);
    }

    public final File A05(Uri uri, Boolean bool) {
        File file;
        String encodedPath = uri.getEncodedPath();
        if (encodedPath != null) {
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            if (decode == null || !decode.startsWith("secure_shared")) {
                MY5 my5 = this.A01;
                if (my5.A03) {
                    String encodedPath2 = uri.getEncodedPath();
                    int indexOf2 = encodedPath2.indexOf(47, 1);
                    String decode2 = Uri.decode(encodedPath2.substring(1, indexOf2));
                    String decode3 = Uri.decode(encodedPath2.substring(indexOf2 + 1));
                    MY5.A00(my5);
                    File file2 = (File) my5.A02.get(decode2);
                    if (file2 != null) {
                        file = JTO.A0s(file2, decode3).getCanonicalFile();
                        if (!file.getPath().startsWith(file2.getPath())) {
                            throw new SecurityException("Resolved path jumped beyond configured roots");
                        } else if (!file.exists()) {
                            throw new FileNotFoundException(002.A0g("File ", file.getPath(), " not found"));
                        }
                    } else {
                        throw new SecurityException("Resolved path jumped beyond configured roots");
                    }
                } else {
                    throw new SecurityException("Direct access to shared files is not enabled.");
                }
            } else {
                File A002 = A02(this, (MY4) MY4.A03.get(decode.substring(14))).A00();
                String decode4 = Uri.decode(encodedPath.substring(indexOf + 1));
                if (decode4 != null) {
                    File A0s = JTO.A0s(A002, decode4);
                    if (A0s.getCanonicalFile().getPath().startsWith(A002.getPath()) || ((!A0s.getCanonicalFile().equals(A0s.getAbsoluteFile())) && bool.booleanValue())) {
                        file = A0s.getCanonicalFile();
                        if (!file.exists()) {
                            throw new FileNotFoundException(002.A0g("File ", file.getPath(), " not found"));
                        }
                    } else {
                        throw new SecurityException("Resolved path jumped beyond configured roots");
                    }
                } else {
                    throw new FileNotFoundException("Unable to resolve file path");
                }
            }
            return file;
        }
        throw new FileNotFoundException("Unable to resolve file path");
    }

    public final Map.Entry A06(File file) {
        String canonicalPath = file.getCanonicalPath();
        A03(this);
        Iterator A0s = AnonymousClass7TF.A0s(this.A03);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            try {
                if (canonicalPath.startsWith(((C70806OMb) A1J.getValue()).A00().getPath())) {
                    return A1J;
                }
            } catch (IOException e) {
                0bY r2 = this.A05;
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("Cannot use the path ");
                A1A.append(A1J.getValue());
                A1A.append(" as the writable root.\n The path triggers an IOException: ");
                r2.EFT("SecurePathStrategy", AnonymousClass7TF.A0l(e.getMessage(), A1A), (Throwable) null);
            }
        }
        return null;
    }
}
