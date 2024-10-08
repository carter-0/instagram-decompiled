package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.List;
import java.util.Map;

public final class IQX implements C66483MTm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C52079GDz A02;
    public final /* synthetic */ GDR A03;

    public final void D6q(AnonymousClass3Q2 r7) {
        MediaComposition mediaComposition = r7.A0r;
        if (mediaComposition == null) {
            DbT.A1Q(0wj.A01, "ClipsMidCardMegacardVideoPlayerViewModel: generated draft mediaComposition is null", 817892914);
            return;
        }
        try {
            mediaComposition.A0A(false);
            C51967G9n.A1O(mediaComposition, this.A03.A07, this.A01);
        } catch (TQC e) {
            0wj r2 = 0wj.A01;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("ClipsMidCardMegacardVideoPlayerViewModel: draft VVP failed, error: ");
            DbT.A1Q(r2, AnonymousClass7TF.A0i(e.getStackTrace(), A1A), 817892914);
        }
        GDR gdr = this.A03;
        Map map = gdr.A07;
        int size = map.size();
        int i = this.A00;
        if (size == i) {
            1wS.A01(gdr.A06).A0C(i);
            C55988Hqu hqu = gdr.A00;
            if (hqu != null) {
                List list = this.A02.A0D;
                0qQ.A0B(list, 1);
                hqu.A02 = map;
                hqu.A01 = list;
                hqu.A00(AnonymousClass7TG.A0A((Number) gdr.A02.getValue()));
            }
        }
    }

    public IQX(C52079GDz gDz, GDR gdr, int i, int i2) {
        this.A03 = gdr;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = gDz;
    }

    public final void D6p(String str) {
        DbT.A1Q(0wj.A01, 002.A0R("ClipsMidCardMegacardVideoPlayerViewModel: failed to generate pending media from draft. failure message is: ", AnonymousClass000.A00(147)), 817892914);
    }
}
