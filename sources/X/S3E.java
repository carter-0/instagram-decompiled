package X;

import android.os.Process;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONObject;

public final class S3E {
    public final String A00;
    public final String A01;
    public final long A02 = System.currentTimeMillis();
    public final String A03;
    public final String A04;
    public final String A05;
    public final Throwable A06;
    public final Object[] A07;

    public final String toString() {
        try {
            JSONObject A11 = DbS.A11();
            StringBuilder A1A = AnonymousClass7TE.A1A();
            String str = this.A04;
            if (!AnonymousClass7TF.A1Q(str.length())) {
                A1A.append(str);
                A1A.append(": ");
            }
            Object[] objArr = this.A07;
            Locale locale = Locale.ROOT;
            String str2 = this.A03;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            A1A.append(Pxg.A0v(str2, locale, copyOf, copyOf.length));
            A11.put("content", A1A.toString());
            Throwable th = this.A06;
            if (th != null) {
                A11.put("traces", Log.getStackTraceString(th));
            }
            A11.put("time", this.A02);
            A11.put("thread", this.A05);
            A11.put("process", Process.myPid());
            return A11.toString();
        } catch (Exception e) {
            return Pxe.A12(Locale.ROOT, "Invalid log: %s", C66581MXm.A1b(e.getMessage(), 1));
        }
    }

    public S3E(String str, String str2, String str3, String str4, Throwable th, Object[] objArr) {
        this.A00 = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A06 = th;
        this.A03 = str4;
        this.A07 = objArr;
        String name = Thread.currentThread().getName();
        0qQ.A07(name);
        this.A05 = name;
    }
}
