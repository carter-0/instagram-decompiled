package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Rdf  reason: case insensitive filesystem */
public abstract class C9601Rdf {
    public static MediaComposition A00(Context context, C266724aF r7, File file, List list, List list2) {
        C266794aM r0;
        C266824aP r4 = new C266824aP();
        C266714aE r5 = C266714aE.VIDEO;
        C266744aH r02 = new C266744aH(file);
        r02.A03 = r7;
        C266754aI A00 = r02.A00();
        C266764aJ r03 = new C266764aJ(r5);
        r03.A02(A00);
        C266794aM r3 = new C266794aM(r03);
        if (!new C7259Q1i(context, false).AU7(Uri.fromFile(file)).A0K) {
            r0 = null;
        } else {
            C266714aE r2 = C266714aE.AUDIO;
            C266744aH r04 = new C266744aH(file);
            r04.A03 = r7;
            C266754aI A002 = r04.A00();
            C266764aJ r1 = new C266764aJ(r2);
            r1.A02(A002);
            r0 = new C266794aM(r1);
        }
        r4.A04(r3);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SIO sio = (SIO) it.next();
            r4.A01(sio.A00, r5, sio.A01);
        }
        if (r0 != null) {
            r4.A04(r0);
            C266714aE r32 = C266714aE.AUDIO;
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                SIO sio2 = (SIO) it2.next();
                r4.A01(sio2.A00, r32, sio2.A01);
            }
        }
        return new MediaComposition(r4);
    }
}
