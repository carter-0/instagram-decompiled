package X;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.List;

/* renamed from: X.TlF  reason: case insensitive filesystem */
public interface C13913TlF extends C13687Tf4 {
    Path Bar();

    static void A00(Matrix matrix, Path path, List list, int i) {
        path.addPath(((C13913TlF) list.get(i)).Bar(), matrix);
    }
}
