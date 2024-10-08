package X;

import android.net.Uri;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SJ5 {
    public static final Pattern A02 = Pattern.compile("^(.*\\/)(live-dash.*)");
    public String A00;
    public final Uri A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SJ5)) {
            return false;
        }
        SJ5 sj5 = (SJ5) obj;
        String str = this.A00;
        if (str != null) {
            return str.equals(sj5.A00);
        }
        return this.A01.equals(sj5.A01);
    }

    public final int hashCode() {
        String str = this.A00;
        if (str != null) {
            return str.hashCode();
        }
        return this.A01.hashCode();
    }

    public String toString() {
        return this.A01.toString();
    }

    public SJ5(Uri uri) {
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        Uri build = buildUpon.build();
        this.A01 = build;
        String path = build.getPath();
        if (path != null) {
            Matcher matcher = A02.matcher(path);
            if (matcher.find() && matcher.groupCount() == 2) {
                this.A00 = matcher.group(2);
            }
        }
    }
}
