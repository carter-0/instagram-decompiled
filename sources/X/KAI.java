package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.util.List;

public final class KAI extends 1P0 {
    public final ImageUrl A00;
    public final /* synthetic */ K72 A01;

    public KAI(ImageUrl imageUrl, K72 k72) {
        0qQ.A0B(imageUrl, 2);
        this.A01 = k72;
        this.A00 = imageUrl;
    }

    public final void onFail(C268654dm r4) {
        int i;
        int A03 = AnonymousClass0fD.A03(-312060975);
        Context context = this.A01.getContext();
        if (context == null) {
            i = -1385471040;
        } else {
            C59689JTv.A0C(context, "createSingleSongMusicRequest_unknown_error_occured");
            i = 1029833827;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        AnonymousClass3HX r6;
        int A03 = AnonymousClass0fD.A03(1942980036);
        K18 k18 = (K18) obj;
        int A032 = AnonymousClass0fD.A03(-1333317738);
        0qQ.A0B(k18, 0);
        List list = k18.A00;
        if (list == null || list.isEmpty() || (r6 = (AnonymousClass3HX) list.get(0)) == null) {
            i = -2023569631;
        } else {
            K72 k72 = this.A01;
            C65724Lye lye = new C65724Lye((Object) k72, 20);
            C65602Lwc lwc = k72.A07;
            if (lwc == null) {
                0qQ.A0F("trackCoverReelHolder");
                throw AnonymousClass00P.createAndThrow();
            }
            C294975nL.A04(lye, new View[]{lwc.A02}, true);
            Reel A0I = 1OP.A05(AnonymousClass7TE.A0l(k72.A0E)).A0I(r6, false);
            ImageUrl imageUrl = this.A00;
            1Ns r0 = A0I.A0W;
            if (r0 != null) {
                r0.ET4(imageUrl);
            }
            k72.A05 = A0I;
            i = -1431672617;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(1093894309, A03);
    }
}
