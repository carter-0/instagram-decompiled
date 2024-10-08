package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;

/* renamed from: X.Lku  reason: case insensitive filesystem */
public final class C64955Lku implements AnonymousClass8MI {
    public final /* synthetic */ K5S A00;

    public final /* synthetic */ void CgT(Medium medium, long j, long j2, boolean z) {
    }

    public final /* synthetic */ void D4A() {
    }

    public final void D7b(Bitmap bitmap, String str) {
    }

    public final void D7f(C381579bz r15) {
        Object value;
        C262364Dk r2;
        C381579bz r12 = r15;
        0qQ.A0B(r15, 0);
        K5S k5s = this.A00;
        C64965Ll4 ll4 = k5s.A01;
        if (ll4 == null) {
            0qQ.A0F("photoStickerCreationController");
            throw AnonymousClass00P.createAndThrow();
        }
        Context requireContext = k5s.requireContext();
        C66330MNn mNn = C66330MNn.A00;
        Drawable A002 = AnonymousClass2dd.A00(ll4.A0I.getResources(), R.drawable.cutout_sticker_merchandising_assets_checkerboard_grid_video_preview);
        if ((A002 instanceof C262364Dk) && (r2 = (C262364Dk) A002) != null) {
            r2.A01(new AZK(ll4, 1));
        }
        AnonymousClass8N2 r4 = ll4.A0S;
        05G r3 = r4.A0H;
        do {
            value = r3.getValue();
        } while (!JTU.A1W((AnonymousClass8N5) value, AnonymousClass05K.A15, value, r3));
        Bitmap bitmap = r15.A04;
        0sn r1 = r15.A07;
        if (r1 == null) {
            r1 = 0sn.A00;
        }
        C11020S5r s5r = new C11020S5r(bitmap, r1, r15.A08);
        C58769IxG ixG = new C58769IxG(29, requireContext, ll4, r12, mNn);
        r4.A03 = JTO.A1E(new C59674JTf(ixG, s5r, r4, (AnonymousClass4D7) null, 6, false), C318116oQ.A00(r4));
    }

    public final /* synthetic */ void DVK() {
    }

    public final /* synthetic */ void DWc(Bitmap bitmap, String str) {
    }

    public C64955Lku(K5S k5s) {
        this.A00 = k5s;
    }

    public final void D7c() {
        K5S k5s = this.A00;
        if (k5s.A04) {
            C64965Ll4 ll4 = k5s.A01;
            if (ll4 == null) {
                0qQ.A0F("photoStickerCreationController");
                throw AnonymousClass00P.createAndThrow();
            } else if (ll4.A0E || ((AnonymousClass8N5) ll4.A0S.A0I.getValue()).A05 == AnonymousClass05K.A0N) {
                JTU.A0q(k5s, k5s.getParentFragmentManager());
            } else {
                ll4.CII();
            }
        } else {
            DbT.A1J(k5s);
        }
    }

    public final void D7e() {
        String str;
        K5S k5s = this.A00;
        if (k5s.A04) {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putBoolean("result_sticker_creation_status", true);
            k5s.getParentFragmentManager().A0z(AnonymousClass000.A00(145), A0a);
            DbT.A1I(k5s);
            return;
        }
        Integer num = k5s.A03;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 3) {
                str = "cutout_video_post_creation_flow";
            } else if (intValue == 7 || intValue == 0) {
                str = AnonymousClass000.A00(1259);
            } else {
                str = "null";
            }
            DbX.A0N(k5s.requireActivity(), k5s.A06).A0G(str, str.equals("null") ^ true ? 1 : 0);
            FragmentActivity activity = k5s.getActivity();
            if (activity != null) {
                Integer num2 = k5s.A03;
                if (num2 != null) {
                    if (num2 == AnonymousClass05K.A15) {
                        activity.setResult(-1);
                        activity.finish();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("entryPoint");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DDX() {
        C64962Ll1 ll1 = this.A00.A02;
        if (ll1 == null) {
            0qQ.A0F("videoStickerCreationController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            ll1.A04 = true;
        }
    }
}
