package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.ui.mediaactions.LikeActionView;
import java.lang.ref.WeakReference;
import java.util.EnumMap;

public final class LEK {
    public C71662eb A00;
    public C231002qi A01;
    public C230882qT A02;
    public LikeActionView A03;
    public LA7 A04;
    public Integer A05 = AnonymousClass05K.A00;
    public String A06 = "";
    public WeakReference A07;
    public final Context A08;
    public final AnonymousClass4DH A09;
    public final UserSession A0A;
    public final 0sP A0B;

    public LEK(Context context, View view, AnonymousClass4DH r14, UserSession userSession, C313666go r16, 0sP r17) {
        C51972G9s.A1C(userSession, view);
        this.A09 = r14;
        this.A0A = userSession;
        this.A08 = context;
        this.A0B = r17;
        1YN A002 = AnonymousClass2bO.A00();
        EnumMap enumMap = new EnumMap(QPTooltipAnchor.class);
        QPTooltipAnchor qPTooltipAnchor = QPTooltipAnchor.LIVE_VIEWER_BADGES_CTA_BUTTON;
        enumMap.put(qPTooltipAnchor, new C65555Lvf());
        C230882qT A042 = A002.A04(userSession, enumMap);
        this.A02 = A042;
        1YN A003 = AnonymousClass2bO.A00();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0c;
        AnonymousClass2bO.A00();
        this.A01 = A003.A01(r14, r14, userSession, 2bV.A06(new LvU(this, 5), A042), quickPromotionSlot);
        r14.registerLifecycleListener(this.A02);
        if (C313666go.VIEWER == r16) {
            C230882qT r1 = this.A02;
            C231002qi r0 = this.A01;
            if (r0 == null) {
                0qQ.A0F("quickPromotionDelegate");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r1.A00((View) null, qPTooltipAnchor, r0);
            }
        }
    }

    public final void A00(Integer num) {
        Context context;
        int i;
        if (this.A05 != AnonymousClass05K.A0Y) {
            this.A05 = num;
            int intValue = num.intValue();
            if (intValue == 4) {
                context = this.A08;
                i = 2131965430;
                0qQ.A07(context.getString(i));
            } else if (intValue == 5) {
                context = this.A08;
                i = 2131965416;
                0qQ.A07(context.getString(i));
            } else if (intValue == 3) {
                Context context2 = this.A08;
                0qQ.A07(DbW.A0h(context2, this.A06, 2131965419));
                context2.getString(2131965420);
            }
            C62010KVj A002 = C63492Kxw.A00(this.A0A);
            String A003 = C63494Kxy.A00(this.A05);
            String A004 = C63494Kxy.A00(this.A05);
            0Aj A0e = AnonymousClass7TE.A0e(A002.A00, "ig_user_pay_viewer_payment_bar_updated");
            C64090LMi lMi = A002.A01;
            A0e.AAJ("media_id", lMi.A02);
            C64090LMi.A00(A0e, lMi, "product_type", lMi.A03);
            A0e.AAJ(DevServerEntity.COLUMN_DESCRIPTION, A003);
            A0e.AAJ(AnonymousClass000.A00(1151), A004);
            A0e.Cgf();
        }
    }
}
