package X;

import android.graphics.Bitmap;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.util.creation.RenderBridge;
import java.util.List;

public final /* synthetic */ class M8X implements Runnable {
    public final /* synthetic */ C63839L8u A00;
    public final /* synthetic */ C66436MRq A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ M8X(C63839L8u l8u, C66436MRq mRq, List list) {
        this.A00 = l8u;
        this.A02 = list;
        this.A01 = mRq;
    }

    public final void run() {
        C63839L8u l8u = this.A00;
        List<L66> list = this.A02;
        C66436MRq mRq = this.A01;
        for (L66 l66 : list) {
            UserSession userSession = l8u.A03;
            1Yt A002 = C353948Ka.A00(userSession);
            int i = l66.A00;
            PhotoFilter photoFilter = new PhotoFilter(userSession, A002.A01(i), AnonymousClass05K.A00);
            if (!ImmutableList.of(1100, 1101, 1102, 1103, 1104, 1105, 1106, 1107, 1108, 1109, 1110).contains(Integer.valueOf(i))) {
                photoFilter.A00(100);
            }
            FilterGroupModel filterGroupModel = l8u.A04;
            filterGroupModel.EWj(photoFilter.A03, 17);
            C364988mL r5 = l8u.A02;
            r5.A07(((FilterGroupModelImpl) filterGroupModel).A02);
            C344727sK.A00(r5.A0C, (Long) null);
            0Tu r7 = 0Tu.A05;
            if (182.A06(r7, userSession, 36329247161204609L)) {
                Bitmap A003 = r5.A00();
                if (A003 != null) {
                    LAM lam = new LAM(C62461KgB.GALLERY, AnonymousClass05K.A01, l66.A01, Integer.MAX_VALUE, 1, true, false);
                    int i2 = l8u.A00;
                    C64001LId.A01(A003, lam, i2, i2, 75).A02(userSession);
                }
            } else if (r5.A01() == null) {
                int i3 = l8u.A00;
                int readRenderResult = RenderBridge.readRenderResult(i3, i3, 6408, 12);
                RenderBridge.mirrorImage(readRenderResult);
                String str = l66.A01;
                0qQ.A0B(userSession, 0);
                RenderBridge.saveAndClearCachedImageFull(readRenderResult, str, true, false, 75, 182.A06(r7, userSession, 36313291357685617L), false);
            }
            mRq.EF1(l66);
        }
    }
}
