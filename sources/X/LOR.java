package X;

import android.content.Context;
import java.io.File;
import java.util.Locale;

public final class LOR {
    public static Context A00;
    public static final LOR A01 = new Object();

    public final File A00(C16522UwR uwR, String str) {
        0qQ.A0B(str, 1);
        StringBuilder A0d = JTQ.A0d(uwR);
        A0d.append('_');
        A0d.append(str);
        A0d.append('_');
        String language = Locale.getDefault().getLanguage();
        0qQ.A07(language);
        A0d.append(language);
        return JTO.A0s(JTO.A0s(A00.getFilesDir(), "superlative"), AnonymousClass7TF.A0l(".png", A0d));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.LOR, java.lang.Object] */
    static {
        Context context = C60960kU.A00;
        0qQ.A07(context);
        A00 = context;
        File A0s = JTO.A0s(context.getFilesDir(), "superlative");
        if (!A0s.exists()) {
            A0s.mkdir();
        }
    }

    public final void A01(AnonymousClass3IP r6) {
        if (r6 != null) {
            File A0s = JTO.A0s(A00.getFilesDir(), "superlative");
            if (A0s.exists()) {
                AnonymousClass7TE.A1Z(new MGW(r6, A0s, (AnonymousClass4D7) null, 23), AnonymousClass1HX.A02(2022716810, 3));
            }
        }
    }
}
