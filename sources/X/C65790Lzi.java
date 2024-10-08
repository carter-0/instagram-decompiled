package X;

import android.content.Context;
import androidx.lifecycle.OnLifecycleEvent;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Lzi  reason: case insensitive filesystem */
public final class C65790Lzi implements AnonymousClass8XX, AnonymousClass8XQ, AnonymousClass07Y {
    public final AnonymousClass8XW A00;
    public final AnonymousClass0Ud A01;
    public final C355608Qq A02;
    public final AnonymousClass8XU A03;
    public final 05G A04;

    public C65790Lzi(Context context, AnonymousClass07V r15, AnonymousClass07i r16, UserSession userSession, C55747Hmi hmi) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        AnonymousClass07i r1 = r16;
        C51974G9v.A1M(context, r1, r15);
        C55747Hmi hmi2 = hmi;
        0qQ.A0B(hmi2, 5);
        02z A1J = JTO.A1J();
        this.A04 = A1J;
        this.A01 = 10b.A03(A1J);
        int i = AnonymousClass7TF.A0E(context).widthPixels / 3;
        C355608Qq r6 = new C355608Qq(context, userSession2, AnonymousClass05K.A00, i, i, false);
        this.A02 = r6;
        AnonymousClass8XN r2 = new AnonymousClass8XN(r1, r6);
        r2.A07 = this;
        r2.A03 = !hmi2.A01 ? AnonymousClass8XO.PHOTO_ONLY : AnonymousClass8XO.PHOTO_AND_VIDEO;
        r2.A0B = true;
        r2.A09 = true;
        r2.A0B = true;
        AnonymousClass8XU r12 = new AnonymousClass8XU(r2);
        this.A03 = r12;
        this.A00 = new AnonymousClass8XW(context, (2Cn) null, this, r12);
        r15.A09(this);
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
