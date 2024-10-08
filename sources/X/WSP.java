package X;

import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

public final class WSP implements C232262tL {
    public final UL5 A00;
    public final VX1 A01;
    public final String A02;

    public WSP(AnonymousClass0iw r10, C56078HsR hsR, C266444Yx r12, ImageInfo imageInfo, C17969Vj5 vj5, String str, List list, 0sP r17, boolean z, boolean z2) {
        List list2 = list;
        AnonymousClass7TF.A1F(r12, 2, list2);
        UL5 ul5 = new UL5(hsR, r12, imageInfo, list2, z, z2);
        VX1 vx1 = new VX1(r10, vj5, r17);
        this.A02 = str;
        this.A00 = ul5;
        this.A01 = vx1;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        UL5 ul5;
        WSP wsp = (WSP) obj;
        UL5 ul52 = this.A00;
        if (wsp != null) {
            ul5 = wsp.A00;
        } else {
            ul5 = null;
        }
        return 0qQ.A0K(ul52, ul5);
    }
}
