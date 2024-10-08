package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lo5  reason: case insensitive filesystem */
public final class C65143Lo5 implements MVP {
    public final /* synthetic */ AlbumEditFragment A00;
    public final /* synthetic */ AnonymousClass3Q2 A01;

    public final void EuQ(C65499LuN luN, boolean z) {
        String str;
        0qQ.A0B(luN, 0);
        AlbumEditFragment albumEditFragment = this.A00;
        View view = albumEditFragment.A03;
        boolean z2 = false;
        if (view != null) {
            view.setVisibility(0);
        }
        albumEditFragment.A0U = z;
        AnonymousClass0eM r4 = albumEditFragment.A0f;
        05G r6 = ((C60323JjS) r4.getValue()).A0J;
        do {
        } while (!r6.AIY(r6.getValue(), new C59721JVf((C66534MVo) luN, AnonymousClass05K.A0N)));
        if (this.A01.A1G == 1iA.A09) {
            z2 = true;
        }
        UserSession A0l = AnonymousClass7TE.A0l(albumEditFragment.A0d);
        C3499682q r0 = albumEditFragment.A0H;
        if (r0 == null) {
            str = "creationCameraSession";
        } else if (AnonymousClass30D.A0K(A0l, z2, r0.CL3())) {
            KB5 kb5 = albumEditFragment.A0D;
            if (kb5 != null) {
                kb5.A0G = true;
            }
            C60323JjS jjS = (C60323JjS) r4.getValue();
            C267834cI r02 = albumEditFragment.A0Q;
            if (r02 == null) {
                str = "pendingMediaProvider";
            } else {
                jjS.A05(r02, true);
                return;
            }
        } else {
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public C65143Lo5(AlbumEditFragment albumEditFragment, AnonymousClass3Q2 r2) {
        this.A00 = albumEditFragment;
        this.A01 = r2;
    }

    public final void D9Y() {
        KB5 kb5 = this.A00.A0D;
        if (kb5 != null) {
            kb5.onResume();
        }
    }

    public final void DFk(AudioOverlayTrack audioOverlayTrack) {
        boolean z;
        AlbumEditFragment albumEditFragment = this.A00;
        C60323JjS jjS = (C60323JjS) albumEditFragment.A0f.getValue();
        C267834cI r0 = albumEditFragment.A0Q;
        if (r0 == null) {
            0qQ.A0F("pendingMediaProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        List A02 = jjS.A02(r0);
        if (!(A02 instanceof Collection) || !A02.isEmpty()) {
            Iterator it = A02.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (JTO.A0m(it).A5F) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        AlbumEditFragment.A0E(albumEditFragment, z, false);
        KB5 kb5 = albumEditFragment.A0D;
        if (kb5 != null) {
            kb5.A0G = false;
        }
        AnonymousClass7TH.A0R(albumEditFragment.A03);
    }

    public final void DSl() {
        AlbumEditFragment albumEditFragment = this.A00;
        JTS.A1N(albumEditFragment.A0I, albumEditFragment);
        182.A06(0Tu.A05, AnonymousClass7TE.A0l(albumEditFragment.A0d), 36326541331871556L);
    }

    public final void E2A() {
        KB5 kb5 = this.A00.A0D;
        if (kb5 != null) {
            kb5.onPause();
        }
    }
}
