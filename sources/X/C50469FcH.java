package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;

/* renamed from: X.FcH  reason: case insensitive filesystem */
public final class C50469FcH implements G76 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C50469FcH(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onActionClicked() {
        String str;
        SUL sul;
        String A002;
        switch (this.A00) {
            case 0:
                DbS.A1U(this.A01);
                return;
            case 1:
                UserSession userSession = ((C18486Vsh) this.A01).A00;
                String A04 = 182.A04(0Tu.A05, userSession, 36882675172114889L);
                if (!TextUtils.isEmpty(A04)) {
                    sul = new SUL((Context) this.A02, userSession, 2EG.A0H, A04);
                    A002 = AnonymousClass000.A00(3287);
                    break;
                } else {
                    return;
                }
            case 2:
                FGY.A00((Context) this.A01, (FGY) this.A02);
                return;
            case 3:
                EyO eyO = ((C49407Ev9) this.A02).A00;
                if (eyO != null) {
                    E6X e6x = eyO.A00;
                    AnonymousClass0eM r6 = e6x.A0L;
                    r6.getValue();
                    C56044Hrt A0C = C250563lf.A0C(28D.A1y);
                    A0C.A0z = true;
                    A0C.A0n = true;
                    A0C.A01(C363138jC.A00);
                    A0C.A01(AnonymousClass9QA.A00);
                    A0C.A01(AnonymousClass80L.A00);
                    Bundle A003 = A0C.A00();
                    AnonymousClass6W8 A022 = AnonymousClass6W8.A02(e6x.requireActivity(), A003, DbT.A0X(r6), TransparentModalActivity.class, "clips_camera");
                    Dbc.A0y(A022);
                    DbT.A1L(e6x, A022);
                    Long l = eyO.A02;
                    if (l != null) {
                        0lg A0X = DbT.A0X(r6);
                        if (e6x.A0B) {
                            str = "collaborators_bottomsheet_reels";
                        } else {
                            str = "collaborators_bottomsheet_feed";
                        }
                        Dbc.A0s(DbX.A0O(e6x, A0X), l, "ig_collaborator_bottom_sheet_education_banner_cta_tap", str);
                        return;
                    }
                    return;
                }
                return;
            default:
                EffectsPageFragment effectsPageFragment = (EffectsPageFragment) this.A01;
                String A042 = 182.A04(0Tu.A05, effectsPageFragment.A07, 36882675172114889L);
                if (!TextUtils.isEmpty(A042)) {
                    sul = new SUL((Context) this.A02, effectsPageFragment.A07, 2EG.A0H, A042);
                    A002 = "effect_page";
                    break;
                } else {
                    return;
                }
        }
        sul.A0S = A002;
        sul.A0A();
    }

    public final void onBannerDismissed() {
        String str;
        switch (this.A00) {
            case 0:
                DbS.A1U(this.A02);
                return;
            case 2:
                FGY.A04((FGY) this.A02, "DISMISSAL");
                return;
            case 3:
                ((C49408EvA) this.A01).A00.setVisibility(8);
                EyO eyO = ((C49407Ev9) this.A02).A00;
                if (eyO != null) {
                    E6X e6x = eyO.A00;
                    AnonymousClass0eM r5 = e6x.A0L;
                    1Av A0h = DbX.A0h(r5);
                    AnonymousClass7TF.A1J(A0h, A0h.A0k, 1Av.A8a, 95, true);
                    K99 k99 = eyO.A01;
                    k99.A07 = false;
                    k99.A0C();
                    Long l = eyO.A02;
                    if (l != null) {
                        0lg A0X = DbT.A0X(r5);
                        if (e6x.A0B) {
                            str = "collaborators_bottomsheet_reels";
                        } else {
                            str = "collaborators_bottomsheet_feed";
                        }
                        Dbc.A0s(DbT.A0Q(e6x, A0X, 0), l, "ig_collaborator_bottom_sheet_education_banner_dismiss", str);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
