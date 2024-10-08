package X;

import android.opengl.EGLContext;
import android.os.Handler;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.List;
import java.util.Map;

/* renamed from: X.AVg  reason: case insensitive filesystem */
public final class C40192AVg implements B2V {
    public final /* synthetic */ ADF A00;

    public C40192AVg(ADF adf) {
        this.A00 = adf;
    }

    public final boolean AJ5(C11354SOn sOn, MediaComposition mediaComposition, C41828B2j b2j, C7334Q4k q4k, Map map, int i, int i2, int i3, int i4) {
        C344777sP r2;
        ADF adf = this.A00;
        C344737sL BQ9 = ADF.A00(adf).A01.BQ9();
        List list = (List) mediaComposition.A00.get(C266714aE.VIDEO);
        if (list != null && !list.isEmpty()) {
            if (BQ9 instanceof C344777sP) {
                r2 = (C344777sP) BQ9;
            } else {
                r2 = null;
            }
            adf.A01 = r2;
        }
        return true;
    }

    public final C41828B2j AMn(EGLContext eGLContext, Handler handler, C344497rx r4, C344557s3 r5, C11354SOn sOn, C7334Q4k q4k, Object obj) {
        ADF adf = this.A00;
        adf.A00 = r4;
        return adf.A04;
    }

    public final C344777sP Blt() {
        return this.A00.A01;
    }
}
