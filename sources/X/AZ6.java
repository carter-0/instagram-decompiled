package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

public final class AZ6 implements C41815B1v {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public AZ6(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i2;
        this.A06 = obj4;
        this.A01 = i;
        this.A05 = obj2;
        this.A03 = obj3;
        this.A02 = obj;
        this.A04 = obj5;
    }

    public final void DOX() {
        C387549mO r5;
        User user;
        Object obj;
        switch (this.A00) {
            case 0:
                C387499mJ r2 = (C387499mJ) this.A06;
                if (r2.A00 == this.A01) {
                    AnonymousClass87H r52 = r2.A09;
                    if (r52.A0L(r2)) {
                        r52.A0F(((Medium) this.A05).A0H);
                        C317876nz r0 = C317876nz.A0a;
                        C317876nz A002 = C317886o0.A00();
                        Drawable drawable = (Drawable) this.A03;
                        r52.A0B(drawable, (AnonymousClass57C) this.A02, A002, r2.A0B, true, true);
                        Context context = r2.A05;
                        1Xj r3 = (1Xj) this.A04;
                        User A2A = r3.A2A(r2.A07);
                        if (A2A != null) {
                            String id = r3.getId();
                            if (id != null) {
                                0qQ.A0B(context, 1);
                                Resources resources = context.getResources();
                                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
                                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.font_large);
                                int A0F = AnonymousClass7TE.A0F(resources);
                                C369848vQ r6 = new C369848vQ(context, (Drawable) null, (0qm) null, A2A, (String) null, id, A0F, A0F, dimensionPixelSize, dimensionPixelSize2, A0F, false);
                                r2.A03 = r6;
                                C39890ADo aDo = r2.A0A;
                                aDo.A06 = new C16336Ut6(drawable.getBounds());
                                AnonymousClass87H.A01(r6, r52, aDo, false);
                                return;
                            }
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    return;
                }
                return;
            case 1:
                ((C268684dp) this.A04).EE1(this);
                r5 = (C387549mO) this.A02;
                UserSession userSession = r5.A09;
                if (182.A06(0Tu.A05, userSession, 36330836299825960L)) {
                    11Z.A02(new C40799AjV(this));
                } else {
                    r5.A0B.A08(r5.A02);
                }
                AnonymousClass87H r32 = r5.A0B;
                Context context2 = r5.A07;
                user = (User) this.A06;
                r32.A0C(C39808AAf.A00(context2, userSession, user, C387549mO.A00(r5).A01), r5.A0G, false);
                C39740A7g A003 = AnonymousClass87H.A00(r32, (1Xj) this.A03);
                A003.A00 = r5.A01;
                r5.A04.add(A003);
                obj = this.A05;
                break;
            default:
                C386049jy r62 = (C386049jy) this.A05;
                r62.EE1(this);
                r5 = (C387549mO) this.A02;
                AnonymousClass87H r33 = r5.A0B;
                UserSession userSession2 = r5.A09;
                Context context3 = r5.A07;
                user = (User) this.A06;
                r33.A0C(C39808AAf.A00(context3, userSession2, user, C387549mO.A00(r5).A01), r5.A0G, true);
                r33.A0C(r62, C39906AIv.A04(r5.A0A), false);
                C39740A7g A004 = AnonymousClass87H.A00(r33, (1Xj) this.A03);
                A004.A00 = r5.A01;
                r5.A04.add(A004);
                obj = this.A04;
                break;
        }
        C387549mO.A03(r5, user, (List) obj, this.A01 + 1);
    }

    public final void DXr() {
    }
}
