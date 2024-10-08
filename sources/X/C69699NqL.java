package X;

import android.net.Uri;

/* renamed from: X.NqL  reason: case insensitive filesystem */
public abstract class C69699NqL {
    public static void A00(Uri uri) {
        Uri uri2 = C70361O3n.A00;
        String scheme = uri.getScheme();
        if (!"https".equals(scheme) && !"http".equals(scheme)) {
            if (uri.getPath() != null && "file".equals(uri.getScheme())) {
                String path = uri.getPath();
                0qQ.A0B(path, 0);
                int length = path.length() - 1;
                int A05 = 00l.A05(path, '.', length);
                if (A05 >= 0 && A05 != length) {
                    String A0j = DbY.A0j(C66580MXl.A0z(path, A05 + 1));
                    Object obj = O5D.A01.get(A0j);
                    if (obj == null) {
                        obj = O5D.A00.getMimeTypeFromExtension(A0j);
                    }
                    if (obj == null) {
                        obj = C70360O3m.A00.get(A0j);
                    }
                    if (obj != null) {
                        0qQ.A0B("video/", 1);
                    }
                }
            } else if (!"content".equals(uri.getScheme()) && !"asset".equals(uri.getScheme()) && !"res".equals(uri.getScheme()) && !"data".equals(uri.getScheme())) {
                uri.getScheme();
            }
        }
    }
}
