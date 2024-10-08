package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.JcD  reason: case insensitive filesystem */
public final class C59947JcD implements AnonymousClass8QW {
    public final C59946JcC A00;
    public final AnonymousClass8QZ A01;

    public C59947JcD(Context context, View view, View view2, UserSession userSession, C59946JcC jcC) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        this.A00 = jcC;
        C328767Gd r9 = new C328767Gd(userSession2);
        r9.A91(new C59945JcB(this));
        Context context2 = context;
        this.A01 = new AnonymousClass8QZ(context2, view2, DbS.A0O("feed_gallery"), userSession2, AnonymousClass7TF.A0G(view, R.id.gallery_media_thumbnail_tray), (C355458Qb) null, r9, this, (C355468Qc) null, (AnonymousClass7SL) null, JYJ.A00, AnonymousClass8QY.A00, 0.5625f, 2131968361, 182.A06(0Tu.A05, userSession2, 36328834844540534L) ? 5 : 1, context2.getResources().getDimensionPixelSize(R.dimen.action_bar_plus_shadow_height), context2.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material) / 2, 2Yu.A0H(context2, R.attr.igds_color_media_thumbnail_tray_background), R.dimen.abc_button_inset_vertical_material, true, false, false, false, false, true);
    }

    public final /* synthetic */ void D3h(Integer num) {
    }

    public final /* synthetic */ void DBA(int i) {
    }

    public final /* synthetic */ void Dik() {
    }

    public final /* synthetic */ void Du1(C53401GnY gnY) {
    }

    public final /* synthetic */ void Du4() {
    }

    public final /* synthetic */ boolean Cdb() {
        return false;
    }

    public final /* synthetic */ boolean EtH() {
        return false;
    }

    public final /* synthetic */ boolean getCanHaveEmptySegments() {
        return false;
    }
}
