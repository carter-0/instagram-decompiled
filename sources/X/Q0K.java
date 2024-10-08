package X;

import android.util.Xml;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public abstract class Q0K {
    public static final byte[] A00 = {102, 116, 121, 112};

    public static final XmlPullParser A00(UserSession userSession, File file) {
        byte[] bArr;
        AnonymousClass7TG.A1N(file, userSession);
        long A01 = 182.A01(0Tu.A06, userSession, 36602080663769632L) * 1024 * 1024;
        try {
            if (file.exists() && file.isFile() && A01 >= file.length()) {
                XmlPullParser newPullParser = Xml.newPullParser();
                0qQ.A07(newPullParser);
                C227982kb A02 = C227922kK.A02(new C227922kK(file), "Xmp");
                if (A02 != null) {
                    bArr = A02.A03;
                } else {
                    bArr = null;
                }
                if (bArr != null) {
                    Charset charset = StandardCharsets.UTF_8;
                    0qQ.A08(charset);
                    newPullParser.setInput(new StringReader(new String(bArr, charset)));
                }
                return newPullParser;
            }
        } catch (IOException | SecurityException | XmlPullParserException unused) {
        }
        return null;
    }
}
