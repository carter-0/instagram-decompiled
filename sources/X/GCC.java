package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.mediaactions.ScrubberPreviewThumbnailView;
import com.instagram.ui.videothumbnail.ThumbView;
import java.util.List;

public final class GCC extends C52050GCw implements JRF, AnonymousClass32U {
    public int A00;
    public View A01;
    public View A02;
    public FrameLayout A03;
    public IgTextView A04;
    public ScrubberPreviewThumbnailView A05;
    public AnonymousClass3WR A06;
    public List A07;
    public final UserSession A08;
    public final C52016GBn A09;
    public final boolean A0A;
    public final boolean A0B;

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DW8(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final void DaS(C267324bN r1, int i, int i2, boolean z) {
    }

    public final /* synthetic */ void DhG(float f, float f2) {
    }

    public final /* synthetic */ void DhU(Integer num) {
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    public final void Dxm(C267324bN r3, Integer num, int i) {
        0qQ.A0B(r3, 0);
        UserSession userSession = this.A08;
        this.A06 = r3.A09(userSession, num);
        if (AnonymousClass71K.A08(r3, userSession)) {
            this.A07 = C51966G9m.A0s(r3).A0C.CE2();
        }
    }

    public static final void A00(GCC gcc) {
        C267324bN A0C;
        View view;
        C52012GBj gBj = gcc.A02;
        if (gBj != null && (A0C = gBj.A0C(gcc.A00)) != null && (view = gcc.A01) != null) {
            view.setVisibility(DbW.A01(gcc.A01(A0C) ? 1 : 0));
        }
    }

    private final boolean A01(C267324bN r8) {
        long j;
        long j2;
        C295365o2 r1 = r8.A01;
        if (r1 == C295365o2.AD) {
            return GJ7.A00.A0H(r8, this.A08);
        }
        UserSession userSession = this.A08;
        boolean A1W = AnonymousClass7TF.A1W(r1, C295365o2.ORGANIC);
        1Xj r0 = r8.A02;
        if (r0 != null) {
            j = (long) r0.A0k();
        } else {
            j = 0;
        }
        boolean A032 = C52076GDw.A03(r8);
        if (!A1W) {
            return false;
        }
        if (A032) {
            j2 = 10;
        } else {
            j2 = 15;
        }
        if (j < j2 || C51965G9l.A1a(AnonymousClass7TF.A0H(userSession), userSession, 36317646455313829L)) {
            return false;
        }
        return true;
    }

    public final void A0C() {
        C267324bN A0C;
        C52012GBj gBj = this.A02;
        if (gBj != null && (A0C = gBj.A0C(this.A00)) != null && A01(A0C)) {
            11Z.A02(new C52321GNn(this, 0));
        }
    }

    public final void DWA(int i, int i2) {
        ScrubberPreviewThumbnailView scrubberPreviewThumbnailView;
        this.A00 = i;
        A00(this);
        UserSession userSession = this.A08;
        if (182.A06(DbS.A0J(userSession, 0), userSession, 36317646455182756L) && (scrubberPreviewThumbnailView = this.A05) != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(scrubberPreviewThumbnailView.A01.getLayoutParams());
            layoutParams.gravity = 8388691;
            layoutParams.leftMargin = 0;
            ViewGroup viewGroup = scrubberPreviewThumbnailView.A01;
            viewGroup.setLayoutParams(layoutParams);
            scrubberPreviewThumbnailView.A02.setText("");
            viewGroup.setVisibility(8);
            ThumbView thumbView = scrubberPreviewThumbnailView.A04;
            if (thumbView != null) {
                ThumbView.A00(thumbView);
                thumbView.A04 = null;
                thumbView.A02 = null;
                thumbView.A03 = null;
                thumbView.A05 = false;
                thumbView.invalidate();
            }
            scrubberPreviewThumbnailView.A03 = null;
        }
    }

    public final void Dzs() {
    }

    public GCC(UserSession userSession, C52016GBn gBn, boolean z, boolean z2) {
        AnonymousClass7TG.A1O(userSession, gBn);
        this.A08 = userSession;
        this.A09 = gBn;
        this.A0B = z;
        this.A0A = z2;
    }

    public final void D7O(C267324bN r1, List list) {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
    }

    public final void Dxg(C267324bN r1, int i) {
    }

    public final void Dxi(C267324bN r1, int i) {
    }

    public final void DxZ(C267324bN r1, int i, int i2) {
    }

    public final void Dzr(C267324bN r1, JRO jro, boolean z) {
    }

    public final void Dxl(C267324bN r1, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
    }
}
