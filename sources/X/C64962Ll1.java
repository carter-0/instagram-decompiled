package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.Set;

/* renamed from: X.Ll1  reason: case insensitive filesystem */
public final class C64962Ll1 implements MXG {
    public static final String __redex_internal_original_name = "CutoutVideoStickerCreationController";
    public Medium A00;
    public C279284yO A01;
    public LRF A02;
    public Integer A03;
    public boolean A04;
    public View A05;
    public final View A06;
    public final ViewStub A07;
    public final AnonymousClass8MI A08;
    public final C358148aR A09;
    public final Set A0A = DbS.A0y();
    public final Fragment A0B;
    public final UserSession A0C;

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
        return this.A0A;
    }

    public final boolean CII() {
        C358148aR.A00(this.A09, AnonymousClass05K.A0Y, (Integer) null, this.A03, (Long) null, "video_trimming_quitted");
        return false;
    }

    public final void Dfq() {
        if (this.A04) {
            this.A04 = false;
            this.A08.D7c();
        }
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
                Set set = this.A0A;
                set.clear();
                if (this.A03 == AnonymousClass05K.A15) {
                    Context context = view.getContext();
                    DbT.A16(context, view, 2Yu.A0H(context, R.attr.igds_color_media_background));
                }
                0qQ.A0A(view);
                set.add(view);
                LY0.A00(view.requireViewById(R.id.back_button), 11, this);
                IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view.requireViewById(R.id.cutout_sticker_next_button);
                igdsMediaButton.setLabel(igdsMediaButton.getContext().getString(2131957300));
                AnonymousClass0fU.A00(new KIR(this, 1, 42), igdsMediaButton);
                this.A05 = view;
            }
            view.setVisibility(0);
            this.A04 = false;
            View view2 = this.A05;
            if (view2 != null) {
                LRF lrf = this.A02;
                if (lrf == null) {
                    lrf = new LRF(view2, this.A0B, this.A0C, KK6.A00, 6);
                    this.A02 = lrf;
                }
                lrf.A02(medium, this.A01, false);
            }
        }
    }

    public final String getModuleName() {
        return "cutout_video_sticker_creation";
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return false;
    }

    public C64962Ll1(View view, ViewStub viewStub, Fragment fragment, AnonymousClass0iw r5, UserSession userSession, C279284yO r7, AnonymousClass8MI r8, Integer num) {
        AnonymousClass7TG.A1P(userSession, viewStub);
        this.A0C = userSession;
        this.A0B = fragment;
        this.A07 = viewStub;
        this.A06 = view;
        this.A08 = r8;
        this.A01 = r7;
        this.A03 = num;
        this.A09 = new C358148aR(r5, userSession);
    }
}
