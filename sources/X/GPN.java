package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.reels.prompt.model.PromptStickerModel;

public final class GPN extends C52050GCw implements AnonymousClass32U, C59587JPh {
    public View A00;
    public View A01;
    public 1wn A02;
    public IgdsMediaButton A03;
    public C227232is A04;
    public final Context A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final C54575HJk A08;
    public final AnonymousClass93T A09;
    public final GD6 A0A;

    public GPN(Context context, AnonymousClass0iw r3, UserSession userSession, GD6 gd6, C54575HJk hJk, AnonymousClass93T r7) {
        0qQ.A0B(context, 1);
        C51974G9v.A1S(userSession, gd6, hJk, r3, r7);
        this.A05 = context;
        this.A07 = userSession;
        this.A0A = gd6;
        this.A08 = hJk;
        this.A06 = r3;
        this.A09 = r7;
    }

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final /* synthetic */ void DhG(float f, float f2) {
    }

    public final /* synthetic */ void DhU(Integer num) {
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    public static final C267324bN A00(GPN gpn) {
        int A062;
        C52012GBj gBj = gpn.A02;
        if (gBj == null || (A062 = gBj.A06()) < 0) {
            return null;
        }
        C52009GBg gBg = gpn.A0A.A0A;
        if (A062 < gBg.A0A()) {
            return gBg.A0E(A062);
        }
        return null;
    }

    public static final void A02(GPN gpn) {
        1Xj r0;
        IgdsMediaButton igdsMediaButton;
        Resources resources;
        int i;
        C52200GIr gIr = C52200GIr.A00;
        UserSession userSession = gpn.A07;
        C267324bN A002 = A00(gpn);
        if (A002 != null) {
            r0 = A002.A02;
        } else {
            r0 = null;
        }
        if (gIr.A02(userSession, r0)) {
            View view = gpn.A00;
            if (view != null) {
                view.setVisibility(0);
            }
            if (A01(gpn) != null) {
                boolean A1a = DbX.A1a(A01(gpn));
                View view2 = gpn.A01;
                if (A1a) {
                    if (view2 != null) {
                        view2.setVisibility(4);
                    }
                    igdsMediaButton = gpn.A03;
                    if (igdsMediaButton != null) {
                        resources = gpn.A05.getResources();
                        i = 2131956110;
                    } else {
                        return;
                    }
                } else {
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    igdsMediaButton = gpn.A03;
                    if (igdsMediaButton != null) {
                        resources = gpn.A05.getResources();
                        i = 2131956109;
                    } else {
                        return;
                    }
                }
                igdsMediaButton.setLabel(resources.getString(i));
                return;
            }
        }
        View view3 = gpn.A00;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }

    public static final Boolean A01(GPN gpn) {
        1Xj r0;
        C267324bN A002 = A00(gpn);
        if (A002 != null) {
            r0 = A002.A02;
        } else {
            r0 = null;
        }
        PromptStickerModel A003 = C52200GIr.A00(r0);
        if (A003 != null) {
            return Boolean.valueOf(A003.A0K());
        }
        return null;
    }

    public final void DLr(C267324bN r1, int i) {
        A02(this);
    }

    public final void DW8(int i, int i2) {
        A02(this);
    }

    public final void onDataSetChanged() {
        A02(this);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        1wn r2 = this.A02;
        if (r2 != null) {
            AnonymousClass1Nd.A00(this.A07).A02(r2, 1qJ.class);
        }
    }
}
