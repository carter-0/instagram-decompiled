package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class Us5 extends C262934Go {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ C15383Ubh A01;
    public final /* synthetic */ String A02;

    public final void Dx6(C61065Jw3 jw3) {
        UserSession A0l;
        AnonymousClass4DU r1;
        String str;
        0qQ.A0B(jw3, 0);
        1Xj r4 = this.A00;
        if (r4 != null) {
            int i = jw3.A00;
            if (i == 1 && jw3.A01 == 2) {
                C15383Ubh ubh = this.A01;
                A0l = AnonymousClass7TE.A0l(ubh.A0N);
                r1 = ubh.A0M;
                str = "bottom_sheet_swipe_up_fullscreen";
            } else if (i == 2 && jw3.A01 == 1) {
                C15383Ubh ubh2 = this.A01;
                A0l = AnonymousClass7TE.A0l(ubh2.A0N);
                r1 = ubh2.A0M;
                str = "bottom_sheet_swipe_down_dismiss";
            } else {
                return;
            }
            AnonymousClass6L4.A00(A0l, r4, r1, str);
        }
    }

    public Us5(1Xj r1, C15383Ubh ubh, String str) {
        this.A00 = r1;
        this.A01 = ubh;
        this.A02 = str;
    }

    public final void DHB(Integer num) {
        1Xj r5 = this.A00;
        if (r5 != null) {
            C15383Ubh ubh = this.A01;
            if (182.A06(0Tu.A06, AnonymousClass7TE.A0l(ubh.A0N), 36318849045961218L)) {
                String str = this.A02;
                C19376WWr wWr = ubh.A0B;
                if (wWr == null) {
                    0qQ.A0F("delegate");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    SUD.A06(r5, wWr.A00((IgImageView) null, r5, 2EG.A2o), "webclick", str);
                }
            }
        }
    }
}
