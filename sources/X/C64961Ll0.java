package X;

import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.Set;

/* renamed from: X.Ll0  reason: case insensitive filesystem */
public final class C64961Ll0 implements MXG {
    public static final String __redex_internal_original_name = "VideoStickerCreationController";
    public Medium A00;
    public C279284yO A01;
    public LRF A02;
    public boolean A03;
    public int A04 = 6;
    public View A05;
    public final View A06;
    public final ViewStub A07;
    public final AnonymousClass8MV A08;
    public final Set A09 = DbS.A0y();
    public final Fragment A0A;
    public final UserSession A0B;

    public final boolean CII() {
        return false;
    }

    public final /* synthetic */ void Cw3() {
    }

    public final void close() {
        this.A00 = null;
        AnonymousClass7TH.A0R(this.A05);
        LRF lrf = this.A02;
        if (lrf != null) {
            lrf.A08.removeCallbacks(lrf.A0D);
            AnonymousClass4MM r1 = lrf.A03;
            if (r1 != null) {
                r1.ECQ(false);
            }
            lrf.A03 = null;
            lrf.A09.setVisibility(8);
        }
    }

    public final Set Acf() {
        return this.A09;
    }

    public final void Dfq() {
    }

    public final void E0h() {
        Medium medium = this.A00;
        if (medium != null) {
            View view = this.A05;
            if (view == null) {
                ViewStub viewStub = this.A07;
                if (viewStub.getParent() != null) {
                    view = viewStub.inflate();
                } else {
                    viewStub.setVisibility(0);
                    view = this.A06;
                }
                Set set = this.A09;
                set.clear();
                0qQ.A0A(view);
                set.add(view);
                DbT.A18(view.getContext(), DbU.A0G(view, R.id.cutout_video_sticker_creation_title_label), 2131962993);
                LY0.A00(view.requireViewById(R.id.back_button), 20, this);
                IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view.requireViewById(R.id.cutout_sticker_next_button);
                igdsMediaButton.setLabel(igdsMediaButton.getContext().getString(2131957300));
                AnonymousClass0fU.A00(new KIR(this, 2, 42), igdsMediaButton);
                this.A05 = view;
            }
            view.setVisibility(0);
            View view2 = this.A05;
            if (view2 != null) {
                LRF lrf = this.A02;
                if (lrf == null) {
                    lrf = new LRF(view2, this.A0A, this.A0B, KK7.A00, this.A04);
                    this.A02 = lrf;
                }
                lrf.A02(medium, this.A01, this.A03);
            }
        }
    }

    public final String getModuleName() {
        return "video_sticker_creation";
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return false;
    }

    public C64961Ll0(View view, ViewStub viewStub, Fragment fragment, UserSession userSession, C279284yO r8, AnonymousClass8MV r9) {
        boolean A1Z = DbW.A1Z(viewStub);
        this.A0B = userSession;
        this.A0A = fragment;
        this.A07 = viewStub;
        this.A06 = view;
        this.A08 = r9;
        this.A01 = r8;
        this.A03 = A1Z;
        this.A04 = DbS.A04(0Tu.A06, userSession, 36605095730877623L);
    }
}
