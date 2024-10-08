package X;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.webrtc.MediaStreamTrack;

public abstract class LHW {
    public static final boolean A00(Uri uri) {
        0qQ.A0B(uri, 0);
        String scheme = uri.getScheme();
        if (scheme == null || scheme.length() == 0) {
            throw AnonymousClass7TE.A0w("URI scheme is required, relative URIs are not supported");
        } else if (!0qQ.A0K(uri.getScheme(), "file")) {
            return true;
        } else {
            List<File> A1P = 0sr.A1P(new File[]{AnonymousClass1F2.A00().AXT((1LJ) null, 195432639), AnonymousClass1F2.A00().AXT((1LJ) null, 1307688829), AnonymousClass1F2.A00().AXT((1LJ) null, 1253461911)});
            if (!(A1P instanceof Collection) || !A1P.isEmpty()) {
                for (File canonicalPath : A1P) {
                    try {
                        0t0 A01 = AnonymousClass0eN.A01(new C58181Inl(canonicalPath.getCanonicalPath(), 4));
                        try {
                            OOC ooc = new OOC();
                            ooc.A04((11T) A01.getValue(), C69680Nq2.A00(uri), false);
                            ooc.A00();
                        } catch (SecurityException unused) {
                            return false;
                        }
                    } catch (IOException unused2) {
                        return true;
                    }
                }
            }
            return true;
        }
    }

    public static final boolean A01(Uri uri, C58840Ae r7) {
        String path;
        String mimeTypeFromExtension;
        0Tu A0J = DbS.A0J(uri, 0);
        0qQ.A08(A0J);
        if (1AW.A06(A0J, 18313074830293459L)) {
            String A10 = DbT.A10(uri);
            String A0j = AnonymousClass7TF.A0j(A10);
            0qQ.A0B("content://", 1);
            if (A0j.startsWith("content://")) {
                return false;
            }
            OOC ooc = new OOC();
            ooc.A06(A10);
            ooc.A00 = r7;
            ArrayList A0v = DbS.A0v(2);
            0tw.A00(C9949Rk2.A00, A0v);
            A0v.add("application/pdf");
            ooc.A07((String[]) A0v.toArray(new String[A0v.size()]));
            ooc.A00();
            return true;
        }
        String scheme = uri.getScheme();
        if (scheme == null || scheme.length() == 0) {
            throw AnonymousClass7TE.A0w("URI scheme is required, relative URIs are not supported");
        }
        if (0qQ.A0K(uri.getScheme(), "file") && (path = uri.getPath()) != null) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            int length = path.length();
            for (int i = 0; i < length; i++) {
                char charAt = path.charAt(i);
                if (!11R.A01(charAt)) {
                    A1A.append(charAt);
                }
            }
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(DbT.A10(A1A));
            if (fileExtensionFromUrl == null || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl)) == null || !MimeTypeMap.getSingleton().hasMimeType(mimeTypeFromExtension)) {
                return false;
            }
            if (00l.A0d(mimeTypeFromExtension, MediaStreamTrack.VIDEO_TRACK_KIND, false) || 00l.A0d(mimeTypeFromExtension, "image", false) || 00l.A0d(mimeTypeFromExtension, MediaStreamTrack.AUDIO_TRACK_KIND, false)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
