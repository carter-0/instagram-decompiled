package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.AIy  reason: case insensitive filesystem */
public final class C39907AIy {
    public static final File A00(2Nn r5, File file) {
        0qQ.A0B(r5, 0);
        try {
            String A04 = A04(file);
            if (!r5.A01) {
                0mb.A07(new File(r5.A04, "panavideo"));
                r5.A01 = true;
            }
            File createTempFile = File.createTempFile("source", A04, r5.A07);
            0qQ.A07(createTempFile);
            AnonymousClass5Kg.A08(file, createTempFile, true);
            return createTempFile;
        } catch (IOException e) {
            String format = String.format("Unable to copy source video file to clips panavideo source directory: fileLocation = %s", Arrays.copyOf(new Object[]{file.getAbsolutePath()}, 1));
            0qQ.A07(format);
            0kD.A07("ClipsFileUtil", format, e);
            return file;
        }
    }

    public static final File A02(2Nn r3, String str) {
        File file;
        0qQ.A0B(r3, 0);
        File file2 = null;
        if (str != null) {
            try {
                file = new File(r3.A01(), str);
            } catch (Throwable th) {
                file = new 0eQ(th);
            }
        } else {
            file = null;
        }
        if (!(file instanceof 0eQ)) {
            file2 = file;
        }
        File file3 = file2;
        if (file3 != null) {
            C357818Zu.A00(file3);
        }
        return file3;
    }

    public static final synchronized File A01(2Nn r6, File file, String str) {
        IllegalStateException th;
        String A0T;
        File file2;
        synchronized (C39907AIy.class) {
            0qQ.A0B(str, 2);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                File file3 = new File(r6.C4W(), parentFile.getName());
                try {
                    C357818Zu.A00(file3);
                    if (AnonymousClass7TF.A1R(AnonymousClass5Kg.A05(file).length())) {
                        A0T = 002.A0j(AnonymousClass5Kg.A06(file), str, AnonymousClass5Kg.A05(file), '-', '.');
                    } else {
                        A0T = 002.A0T(AnonymousClass5Kg.A06(file), str, '-');
                    }
                    file2 = new File(file3, A0T);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                th = AnonymousClass7TE.A0y();
                throw th;
            }
        }
        return file2;
    }

    public static final File A03(2Nn r1, String str, String str2, String str3) {
        AnonymousClass7TG.A1N(r1, str);
        File file = new File(r1.A01(), str);
        C357818Zu.A00(file);
        File createTempFile = File.createTempFile(002.A0R("source_", str3), str2, file);
        0qQ.A07(createTempFile);
        return createTempFile;
    }

    public static final String A04(File file) {
        String path = file.getPath();
        0qQ.A0A(path);
        0qQ.A0B(path, 0);
        int A05 = 00l.A05(path, '.', path.length() - 1);
        if (A05 < 0) {
            return "";
        }
        String substring = path.substring(A05);
        0qQ.A07(substring);
        return substring;
    }

    public static final void A05(UserSession userSession, 2Nn r4) {
        PendingMediaStore A00 = 28K.A00(userSession);
        synchronized (A00) {
            0nY.A00().ATE(new C61699KIp(r4, A00.A06()));
        }
    }
}
