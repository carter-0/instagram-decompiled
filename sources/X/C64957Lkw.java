package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lkw  reason: case insensitive filesystem */
public final class C64957Lkw implements AnonymousClass8MI {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final /* synthetic */ K5Q A02;

    public C64957Lkw(FragmentActivity fragmentActivity, UserSession userSession, K5Q k5q) {
        0qQ.A0B(userSession, 3);
        this.A02 = k5q;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final /* synthetic */ void CgT(Medium medium, long j, long j2, boolean z) {
    }

    public final /* synthetic */ void D4A() {
    }

    public final /* synthetic */ void D7e() {
    }

    public final /* synthetic */ void D7f(C381579bz r1) {
    }

    public final /* synthetic */ void DDX() {
    }

    public final /* synthetic */ void DVK() {
    }

    public final void DWc(Bitmap bitmap, String str) {
        C309516Yo r1;
        String str2;
        0qQ.A0B(str, 1);
        K5Q k5q = this.A02;
        switch (k5q.A01.intValue()) {
            case 0:
            case 7:
                r1 = DbS.A0M(k5q.requireActivity(), this.A01);
                str2 = AnonymousClass000.A00(1259);
                break;
            case 1:
            case 5:
            case 6:
            case 9:
            case 10:
                return;
            case 2:
                r1 = DbS.A0M(k5q.requireActivity(), this.A01);
                str2 = "cutout_photo_post_creation_flow";
                break;
            case 3:
            case 4:
                r1 = DbS.A0M(k5q.requireActivity(), this.A01);
                str2 = "cutout_video_post_creation_flow";
                break;
            case 8:
                if (k5q.A02) {
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putBoolean("result_sticker_creation_status", true);
                    k5q.getParentFragmentManager().A0z(AnonymousClass000.A00(145), A0a);
                    DbT.A1I(k5q);
                    return;
                }
                return;
            default:
                throw AnonymousClass7TE.A1K();
        }
        r1.A0G(str2, 1);
    }

    public final void D7b(Bitmap bitmap, String str) {
        K5Q k5q = this.A02;
        boolean z = k5q.A02;
        Bundle A0a = AnonymousClass7TE.A0a();
        boolean A1V = AnonymousClass7TF.A1V(str);
        if (z) {
            A0a.putBoolean("result_sticker_creation_status", A1V);
            k5q.getParentFragmentManager().A0z(AnonymousClass000.A00(145), A0a);
            DbT.A1I(k5q);
            return;
        }
        A0a.putBoolean("result_sticker_creation_status", A1V);
        k5q.getParentFragmentManager().A0z(AnonymousClass000.A00(144), A0a);
        DbS.A0M(k5q.requireActivity(), this.A01).A06();
    }

    public final void D7c() {
        K5Q k5q = this.A02;
        if (k5q.A02) {
            C64965Ll4 ll4 = k5q.A00;
            if (ll4 == null) {
                0qQ.A0F("photoStickerCreationController");
                throw AnonymousClass00P.createAndThrow();
            } else if (ll4.A0E || ((AnonymousClass8N5) ll4.A0S.A0I.getValue()).A05 == AnonymousClass05K.A0N) {
                JTU.A0q(k5q, k5q.getParentFragmentManager());
            } else {
                ll4.CII();
            }
        } else {
            DbS.A0M(k5q.requireActivity(), this.A01).A06();
        }
    }
}
