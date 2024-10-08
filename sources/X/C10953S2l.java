package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.S2l  reason: case insensitive filesystem */
public final class C10953S2l {
    public long A00 = 2;
    public String A01;
    public Map A02 = AnonymousClass7TE.A1E();
    public final Context A03;
    public final SFN A04;

    public C10953S2l(Context context, UserSession userSession) {
        0qQ.A0B(context, 1);
        SFN sfn = new SFN(context);
        this.A03 = context.getApplicationContext();
        this.A04 = sfn;
        this.A00 = (long) DbS.A04(0Tu.A05, userSession, 36592249483624828L);
    }

    public final String A00(File file) {
        String str;
        String str2;
        SFN sfn = this.A04;
        String name = file.getName();
        Pattern pattern = SFN.A05;
        if (DbV.A1b(name, pattern)) {
            name = "__id__";
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            if (sfn.A01 == null) {
                File parentFile2 = sfn.A02.getDatabasePath("ignore").getParentFile();
                if (parentFile2 == null) {
                    String str3 = sfn.A00;
                    if (str3 == null) {
                        C10243Rp3 rp3 = sfn.A03;
                        if (rp3 != null) {
                            File file2 = rp3.A00;
                            try {
                                str3 = file2.getCanonicalPath();
                            } catch (IOException unused) {
                                str3 = file2.getAbsolutePath();
                            }
                            0qQ.A07(str3);
                            sfn.A00 = str3;
                        } else {
                            throw AnonymousClass7TE.A0z("Sanitizer initialised without a valid path");
                        }
                    }
                    parentFile2 = new File(str3, "databases");
                }
                try {
                    str2 = parentFile2.getCanonicalPath();
                } catch (IOException unused2) {
                    str2 = parentFile2.getAbsolutePath();
                }
                sfn.A01 = str2;
            }
            try {
                str = parentFile.getCanonicalPath();
            } catch (IOException unused3) {
                str = parentFile.getAbsolutePath();
            }
            if (str.equals(sfn.A01)) {
                String[] strArr = SFN.A06;
                for (int i = 0; i < 9; i++) {
                    String str4 = strArr[i];
                    if (name.endsWith(str4)) {
                        name = name.replace(str4, "");
                    }
                }
            }
        }
        Matcher matcher = SFN.A04.matcher(name);
        if (matcher.find()) {
            name = matcher.replaceAll("__hash__");
        }
        String replace = pattern.matcher(name).replaceAll("X").replace(' ', '_');
        if (replace.length() >= 64) {
            return "__hash__";
        }
        return replace;
    }
}
