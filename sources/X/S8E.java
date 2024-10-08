package X;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

public abstract class S8E {
    public static final 0eP A00(SPF spf) {
        String A00 = RUB.A00(spf.A01.A03);
        boolean z = false;
        String str = "";
        if (!AnonymousClass7TF.A1Q(A00.length()) && spf.A04(A00)) {
            z = true;
            str = DbT.A10(DbT.A09(A00).buildUpon().clearQuery().build());
        }
        return AnonymousClass7TE.A1L(z, str);
    }

    public static final void A01(Context context, SPF spf, boolean z) {
        String str;
        long j;
        String str2;
        SPF spf2 = spf;
        0qQ.A0B(spf2, 1);
        0eP A00 = A00(spf2);
        boolean A1a = AnonymousClass7TE.A1a(A00.A00);
        Object obj = A00.A01;
        if (A1a) {
            HashMap A1E = AnonymousClass7TE.A1E();
            ArrayList A1C = AnonymousClass7TE.A1C();
            StringBuilder A1A = AnonymousClass7TE.A1A();
            S3V s3v = spf2.A04;
            String str3 = s3v.A02;
            String str4 = spf2.A01.A01;
            A1A.append(str3);
            A1A.append("=");
            A1A.append(str4);
            A1A.append(";");
            if (spf2.A01()) {
                str = s3v.A03;
            } else {
                str = s3v.A04;
            }
            Pxj.A1M("Domain", "=", str, ";", A1A);
            Pxj.A1M("Path", "=", "/", ";", A1A);
            A1A.append("Secure");
            A1A.append(";");
            A1A.append("HttpOnly");
            A1A.append(";");
            if (z) {
                j = 0;
            } else {
                j = s3v.A00;
            }
            A1A.append("Max-Age");
            A1A.append("=");
            A1A.append(j);
            String A0l = AnonymousClass7TF.A0l(";", A1A);
            0qQ.A07(A0l);
            A1C.add(A0l);
            C10533Rtm rtm = spf2.A03;
            String str5 = rtm.A02;
            if (!(str5 == null || str5.length() == 0)) {
                StringBuilder A1A2 = AnonymousClass7TE.A1A();
                Pxj.A1M(s3v.A01, "=", str5, ";", A1A2);
                if (spf2.A01()) {
                    str2 = s3v.A03;
                } else {
                    str2 = s3v.A04;
                }
                Pxj.A1M("Domain", "=", str2, ";", A1A2);
                Pxj.A1M("Path", "=", "/", ";", A1A2);
                A1A2.append("Secure");
                A1A2.append(";");
                A1A2.append("HttpOnly");
                A1A2.append(";");
                long j2 = rtm.A00;
                A1A2.append("Expires");
                A1A2.append("=");
                Date date = new Date(j2 * 1000);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                String format = simpleDateFormat.format(date);
                0qQ.A07(format);
                String A0s = Pxg.A0s(format, ";", A1A2);
                0qQ.A07(A0s);
                A1C.add(A0s);
            }
            if (spf2.A02) {
                obj = "https://.shop-external.amazon";
            }
            A1E.put(obj, A1C);
            Pattern pattern = SCX.A01;
            SB5.A00(new TJZ(context, (A9z) null, A1E, true));
        }
    }
}
