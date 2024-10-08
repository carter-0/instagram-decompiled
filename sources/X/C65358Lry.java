package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.Lry  reason: case insensitive filesystem */
public final class C65358Lry implements MVB {
    public final int A00;
    public final Object A01;

    public C65358Lry(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onButtonClick(View view) {
        C62320sa r0;
        switch (this.A00) {
            case 2:
                LinkedHashMap A06 = 0Yt.A06(new 0eP[]{AnonymousClass7TE.A1L("media_id", "0"), AnonymousClass7TE.A1L("module", "")});
                C64963Ll2 ll2 = (C64963Ll2) this.A01;
                C360678ey A05 = C359988do.A05(ll2.A06, "com.instagram.sensitivity.see_why_sheets.news_sheet_action", A06);
                A05.A00(new K8T(ll2, 1));
                1ES.A03(A05);
                return;
            case 3:
                ((C361998hA) this.A01).A0H.A0a.DHR();
                return;
            case 4:
                r0 = ((LE6) this.A01).A04;
                if (r0 == null) {
                    return;
                }
                break;
            case 5:
                return;
            default:
                r0 = (C62320sa) this.A01;
                break;
        }
        r0.invoke();
    }

    public final void onDismiss() {
        if (5 - this.A00 == 0) {
            ((C60255JiC) ((C64856LjI) this.A01).A0I.getValue()).A01 = false;
        }
    }

    public final void onShow() {
        switch (this.A00) {
            case 2:
                0eE r1 = AnonymousClass0t1.A01;
                C64963Ll2 ll2 = (C64963Ll2) this.A01;
                UserSession userSession = ll2.A06;
                ((LCS) ll2.A09.getValue()).A00(AnonymousClass7TE.A10(userSession.A06), C51971G9r.A0m(), "genpop_story_link_error_impression", AnonymousClass7TG.A1X(r1.A01(userSession).A03.CaZ()));
                return;
            case 5:
                ((C60255JiC) ((C64856LjI) this.A01).A0I.getValue()).A01 = true;
                return;
            default:
                return;
        }
    }

    public final /* synthetic */ void onTextClick(View view) {
    }
}
