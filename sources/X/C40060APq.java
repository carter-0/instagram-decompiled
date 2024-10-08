package X;

import com.instagram.api.schemas.ACRType;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.io.IOException;
import java.util.List;

/* renamed from: X.APq  reason: case insensitive filesystem */
public final class C40060APq implements AnonymousClass2gO {
    public final /* synthetic */ C353498Hw A00;
    public final /* synthetic */ List A01;

    public C40060APq(C353498Hw r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        1Xj A02;
        String A2n;
        AnonymousClass6ST r0;
        List list = (List) obj;
        0qQ.A0B(list, 0);
        C353498Hw r5 = this.A00;
        C39642A3g a3g = r5.A09;
        if (!(a3g == null || (r0 = a3g.A00) == null)) {
            r0.dismiss();
        }
        boolean z = true;
        if (!list.isEmpty()) {
            List list2 = this.A01;
            String str = "";
            if (list2 != null) {
                try {
                    if (!(list2.isEmpty() || (A02 = 1E7.A00(r5.A1D).A02((String) 00k.A0O(list2, 0))) == null || (A2n = A02.A2n()) == null)) {
                        str = A2n;
                    }
                } catch (IOException unused) {
                    str = "IOExceptionID";
                }
            }
            AnonymousClass88V r2 = r5.A1o;
            String str2 = r5.A0R;
            if (str2 == null) {
                str2 = str;
            }
            ACRType aCRType = r5.A19;
            AudioOverlayTrack audioOverlayTrack = r5.A1z;
            boolean z2 = false;
            if (list2 != null) {
                if (r5.A16 != 28D.A4b || list2.size() <= 1) {
                    z = false;
                }
                z2 = z;
            }
            r2.A06.A0B(new AnonymousClass88W(new AnonymousClass88X(aCRType, audioOverlayTrack, str2, list, (List) null, 898, z2, true, false)));
        }
    }
}
