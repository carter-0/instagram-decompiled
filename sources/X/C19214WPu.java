package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.instagram.archive.fragment.ArchiveReelCalendarFragment;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.WPu  reason: case insensitive filesystem */
public final class C19214WPu implements AnonymousClass1MK {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C19214WPu(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A01 = obj;
    }

    public final void CyF(C226952iF r10, AnonymousClass3LX r11) {
        Bitmap bitmap;
        switch (this.A00) {
            case 0:
                ArchiveReelCalendarFragment archiveReelCalendarFragment = (ArchiveReelCalendarFragment) this.A01;
                archiveReelCalendarFragment.A0E.remove(this);
                if (ArchiveReelCalendarFragment.A05(archiveReelCalendarFragment)) {
                    ArchiveReelCalendarFragment.A01((C14910UEp) this.A02, archiveReelCalendarFragment, (Reel) this.A03);
                    return;
                }
                return;
            case 1:
                0qQ.A0B(r11, 1);
                Bitmap bitmap2 = r11.A01;
                if (bitmap2 == null) {
                    DbS.A1U(this.A01);
                    return;
                }
                int hashCode = ((C317966o8) this.A03).A0H.getUrl().hashCode();
                C63228KtZ.A00(bitmap2, (C62320sa) this.A01, (0sP) this.A02, hashCode);
                return;
            case 2:
                Bitmap bitmap3 = r11.A01;
                if (bitmap3 != null) {
                    C17345VRy vRy = (C17345VRy) this.A03;
                    C330577Nj r6 = (C330577Nj) this.A02;
                    C20895X3m ALe = ((C20896X3n) this.A01).ALe(bitmap3);
                    if (ALe != null) {
                        for (int i = 0; i < vRy.A00; i++) {
                            C17344VRx vRx = new C17344VRx(ALe, vRy.A01);
                            List list = r6.A09;
                            list.add(vRx);
                            if (list.size() == 1) {
                                long j = r6.A00;
                                if (j > 0) {
                                    r6.A01 = Math.max(r6.A01, j);
                                } else {
                                    r6.A01 = 0;
                                    C14086Tpc.A01.A00(r6.A06);
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                AnonymousClass7TG.A1N(r10, r11);
                if (0qQ.A0K(r10.C3s(), this.A03) && (bitmap = r11.A01) != null) {
                    View view = (View) this.A01;
                    view.setBackground(new BitmapDrawable(view.getResources(), BlurUtil.blur(bitmap, 0.1f, 6)));
                    return;
                }
                return;
        }
    }

    public final void DJx(C226952iF r4, C254673sr r5) {
        switch (this.A00) {
            case 0:
                ArchiveReelCalendarFragment archiveReelCalendarFragment = (ArchiveReelCalendarFragment) this.A01;
                archiveReelCalendarFragment.A0E.remove(this);
                if (ArchiveReelCalendarFragment.A05(archiveReelCalendarFragment)) {
                    ArchiveReelCalendarFragment.A01((C14910UEp) this.A02, archiveReelCalendarFragment, (Reel) this.A03);
                    return;
                }
                return;
            case 3:
                0qQ.A0B(r4, 0);
                C51965G9l.A1W(this.A02, r4);
                return;
            default:
                return;
        }
    }

    public final void DK4(C226952iF r1, int i) {
    }
}
