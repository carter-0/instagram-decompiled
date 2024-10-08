package X;

import com.instagram.api.schemas.TrackDataImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.D1z  reason: case insensitive filesystem */
public final class C45700D1z {
    public static CGK parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CGK cgk = new CGK();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                if (C41846B3n.A1Z(r5, A0q)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C45237Css parseFromJson = C44954Cno.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cgk.A01 = arrayList;
                } else {
                    1XY.A01(r5, cgk, A0q);
                }
                r5.A0z();
            }
            List<C45237Css> list = cgk.A01;
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C45237Css css : list) {
                TrackDataImpl trackDataImpl = css.A00;
                if (trackDataImpl != null) {
                    A1C.add(new JVX(trackDataImpl));
                }
            }
            cgk.A00 = A1C;
            return cgk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
