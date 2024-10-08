package X;

import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.Swn  reason: case insensitive filesystem */
public final class C12537Swn implements C256363ve {
    public static final Pattern A00 = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Throwable, java.io.IOException, X.47p] */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Throwable, java.io.IOException, X.47p] */
    public final /* bridge */ /* synthetic */ Object E1j(Uri uri, InputStream inputStream) {
        long j;
        long j2;
        String readLine = new BufferedReader(new InputStreamReader(inputStream, AnonymousClass2RN.A05)).readLine();
        try {
            Matcher matcher = A00.matcher(readLine);
            if (matcher.matches()) {
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    if ("+".equals(matcher.group(4))) {
                        j = 1;
                    } else {
                        j = -1;
                    }
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    if (TextUtils.isEmpty(group2)) {
                        j2 = 0;
                    } else {
                        j2 = Long.parseLong(group2);
                    }
                    time -= j * ((((parseLong * 60) + j2) * 60) * 1000);
                }
                return Long.valueOf(time);
            }
            ? iOException = new IOException(002.A0R("Couldn't parse timestamp: ", readLine), (Throwable) null);
            iOException.A01 = true;
            iOException.A00 = 4;
            throw iOException;
        } catch (ParseException e) {
            ? iOException2 = new IOException((String) null, e);
            iOException2.A01 = true;
            iOException2.A00 = 4;
            throw iOException2;
        }
    }
}
