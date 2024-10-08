package X;

import android.content.Context;
import androidx.lifecycle.OnLifecycleEvent;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Lzh  reason: case insensitive filesystem */
public final class C65789Lzh implements AnonymousClass8XX, AnonymousClass8XQ, AnonymousClass07Y {
    public final AnonymousClass8XW A00;
    public final AnonymousClass0Ud A01;
    public final C355608Qq A02;
    public final AnonymousClass8XU A03;
    public final 05G A04;

    public C65789Lzh(Context context, AnonymousClass07V r14, AnonymousClass07i r15, UserSession userSession) {
        AnonymousClass8XO r1;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        C51974G9v.A1M(context, r15, r14);
        02z A1J = JTO.A1J();
        this.A04 = A1J;
        this.A01 = 10b.A03(A1J);
        int i = AnonymousClass7TF.A0E(context).widthPixels / 3;
        C355608Qq r5 = new C355608Qq(context, userSession2, AnonymousClass05K.A00, i, i, false);
        this.A02 = r5;
        if (182.A06(0Tu.A05, userSession2, 36316289246105808L)) {
            r1 = AnonymousClass8XO.PHOTO_AND_VIDEO;
        } else {
            r1 = AnonymousClass8XO.VIDEO_ONLY;
        }
        AnonymousClass8XN r0 = new AnonymousClass8XN(r15, r5);
        r0.A07 = this;
        r0.A03 = r1;
        r0.A0B = true;
        r0.A09 = true;
        r0.A0B = true;
        AnonymousClass8XU r12 = new AnonymousClass8XU(r0);
        this.A03 = r12;
        this.A00 = new AnonymousClass8XW(context, (2Cn) null, this, r12);
        r14.A09(this);
    }

    public final void DCx(Exception exc) {
    }

    public final void DQY(AnonymousClass8XW r4, List list, List list2, int i) {
        0qQ.A0B(list2, 2);
        ArrayList A1D = AnonymousClass7TE.A1D(list2);
        Folder folder = this.A00.A02;
        Ecr(Integer.valueOf(folder.A02), folder.getName(), A1D);
    }

    public final void Ecr(Integer num, String str, List list) {
        0qQ.A0B(list, 0);
        this.A04.Epw(list);
    }

    public final void Ejh(GalleryItem galleryItem, boolean z, boolean z2) {
    }

    public final /* synthetic */ List BPh() {
        return 0sn.A00;
    }

    @OnLifecycleEvent(07T.ON_PAUSE)
    public final void onPause() {
        this.A00.A08();
    }

    @OnLifecycleEvent(07T.ON_RESUME)
    public final void onResume() {
        this.A00.A09();
    }

    public final List AN0() {
        return AnonymousClass7TE.A1C();
    }
}
