package X;

import com.instagram.debug.quickexperiment.MobileConfigBisection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

/* renamed from: X.4Cs  reason: invalid class name and case insensitive filesystem */
public abstract class C262244Cs {
    public static final Pattern A00 = Pattern.compile("(\\d+)\\.mctable");

    public static String A01(File file) {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
            }
            bufferedReader.close();
        } catch (IOException e) {
            0KC.A0L("MobileConfigFilesOnDiskUtils", "Failed to read file %s", e, new Object[]{file});
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
        }
        return sb.toString();
        throw th;
    }

    public static String A02(File file, int i) {
        String str = i != 1 ? "" : "qce";
        try {
            String canonicalPath = file.getCanonicalPath();
            if (!canonicalPath.endsWith("/")) {
                canonicalPath = 002.A0R(canonicalPath, "/");
            }
            return 002.A0u(canonicalPath, MobileConfigBisection.BISECT_DIR, str.isEmpty() ? "" : 002.A0R("_", str), "/");
        } catch (IOException e) {
            0KC.A0O("MobileConfigFilesOnDiskUtils", "In getBufferPath, failed to get canonical path for data dir %s: %s", new Object[]{file, e});
            return "";
        }
    }

    public static String A03(File file, int i) {
        String A0g;
        StringBuilder sb = new StringBuilder();
        sb.append(file);
        String str = "/";
        if (file.getName().endsWith(str)) {
            str = "";
        }
        sb.append(str);
        if (i <= 2) {
            A0g = "params_map_v4_u0.txt";
        } else {
            A0g = 002.A0g("params_map_v4_u", String.valueOf(i), ".txt");
        }
        sb.append(A0g);
        String obj = sb.toString();
        if (!new File(obj).exists()) {
            return null;
        }
        return obj;
    }

    public static String A04(String str) {
        int i;
        File[] listFiles = new File(str).listFiles(new AnonymousClass4Ct());
        String str2 = "";
        if (listFiles != null) {
            int i2 = -1;
            for (File file : listFiles) {
                String name = file.getName();
                try {
                    i = Integer.parseInt(name.substring(0, name.length() - 8));
                } catch (NumberFormatException e) {
                    0KC.A0M("MobileConfigFilesOnDiskUtils", "Unexpected mctable file: %s", e, new Object[]{file});
                    i = -1;
                }
                if (i > i2) {
                    try {
                        str2 = file.getCanonicalPath();
                        i2 = i;
                    } catch (IOException e2) {
                        0KC.A0M("MobileConfigFilesOnDiskUtils", "In  findLatestFlatbufferUnderDir, fail to get canonical path for %s: %s", e2, new Object[]{file, e2});
                    }
                }
            }
        }
        return str2;
    }

    public static String A00(int i, String str, String str2) {
        String A0R;
        if (str2.isEmpty()) {
            A0R = "";
        } else {
            A0R = 002.A0R("_", str2);
        }
        String A0g = 002.A0g(A0R, ".data", "/");
        if (i == 1) {
            str = "sessionless";
        } else if (!(i == 2 || i == 3 || i == 4)) {
            StringBuilder sb = new StringBuilder();
            sb.append("u");
            if (i != 7) {
                sb.append(i);
                sb.append("_");
                sb.append(str);
            } else {
                sb.append(i);
            }
            str = sb.toString();
        }
        return 002.A0R(str, A0g);
    }

    public static boolean A05(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            boolean z = true;
            for (File file2 : listFiles) {
                if (z) {
                    z = true;
                    if (A05(file2)) {
                    }
                }
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        if (file.delete()) {
            return true;
        }
        return false;
    }
}
