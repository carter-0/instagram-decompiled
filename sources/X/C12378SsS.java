package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.List;

/* renamed from: X.SsS  reason: case insensitive filesystem */
public final class C12378SsS implements C13599TdR {
    public final /* synthetic */ C11387SRa A00;
    public final /* synthetic */ List A01;

    public C12378SsS(C11387SRa sRa, List list) {
        this.A01 = list;
        this.A00 = sRa;
    }

    public final List Avn(C7232Q0d q0d, MediaComposition mediaComposition, C10864RzP rzP) {
        List<SJC> list = this.A01;
        C11387SRa sRa = this.A00;
        if (sRa.A04() && sRa.A02 != ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE) {
            for (SJC A03 : list) {
                sRa.A03(A03);
            }
        }
        return list;
    }
}
