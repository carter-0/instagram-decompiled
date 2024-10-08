package com.instagram.debug.devoptions.section.localinjection.datastore;

import X.0qQ;
import X.AnonymousClass7TG;
import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class LocalMediaInjectionUtil {
    public static final LocalMediaInjectionUtil INSTANCE = new Object();

    public static final String getJSONTextForInjectedUnit(Context context, LocalInjectionUnit localInjectionUnit) {
        AnonymousClass7TG.A1N(context, localInjectionUnit);
        return getJSONTextFromFile(context, localInjectionUnit.filePath);
    }

    public static final String getJSONTextFromFile(Context context, String str) {
        AnonymousClass7TG.A1N(context, str);
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(str);
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            Charset charset = StandardCharsets.UTF_8;
            0qQ.A08(charset);
            String str2 = new String(bArr, charset);
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            return str2;
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
