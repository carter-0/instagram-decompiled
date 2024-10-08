package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;

/* renamed from: X.Lkv  reason: case insensitive filesystem */
public final class C64956Lkv implements AnonymousClass8MI {
    public final /* synthetic */ K5S A00;

    public final void CgT(Medium medium, long j, long j2, boolean z) {
        Medium medium2 = medium;
        0qQ.A0B(medium, 0);
        K5S k5s = this.A00;
        C64965Ll4 ll4 = k5s.A01;
        String str = "photoStickerCreationController";
        if (ll4 != null) {
            ll4.A04 = new KK0(medium2, j, j2, z);
            C64435Lbq lbq = k5s.A00;
            if (lbq == null) {
                str = "assetPickerModeController";
            } else {
                lbq.A02(ll4, true);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void D4A() {
    }

    public final /* synthetic */ void D7b(Bitmap bitmap, String str) {
    }

    public final /* synthetic */ void D7e() {
    }

    public final /* synthetic */ void D7f(C381579bz r1) {
    }

    public final /* synthetic */ void DDX() {
    }

    public final /* synthetic */ void DVK() {
    }

    public final /* synthetic */ void DWc(Bitmap bitmap, String str) {
    }

    public C64956Lkv(K5S k5s) {
        this.A00 = k5s;
    }

    public final void D7c() {
        K5S k5s = this.A00;
        if (k5s.A04) {
            JTU.A0q(k5s, k5s.getParentFragmentManager());
        } else {
            DbT.A1J(k5s);
        }
    }
}
