package X;

import android.content.Context;
import android.view.View;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: X.9iy  reason: invalid class name and case insensitive filesystem */
public final class C385459iy extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C385459iy(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onFail(C268654dm r6) {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(-1984049779);
                C387549mO r3 = (C387549mO) this.A01;
                AnonymousClass87H r2 = r3.A0B;
                r2.A00.A06();
                r2.A0J(r3.A07.getString(2131973858));
                r3.A0D.E3H(new Object());
                i2 = -36133813;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-1971237025);
                C39964ALg aLg = (C39964ALg) this.A02;
                if (aLg.A09 == this.A01) {
                    aLg.A0B = new C61076JwE[3];
                    aLg.A0M.E3H(new AnonymousClass8TR(C39964ALg.A00(aLg)));
                    i2 = 631676100;
                    break;
                } else {
                    i2 = -1580673333;
                    break;
                }
            default:
                C385459iy.super.onFail(r6);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(1156355477);
                i2 = -977820184;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-687976711);
                i2 = -670750340;
                break;
            default:
                C385459iy.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        if (2 - this.A00 != 0) {
            C385459iy.super.onStart();
            return;
        }
        int A03 = AnonymousClass0fD.A03(-761939302);
        C39964ALg aLg = (C39964ALg) this.A02;
        if (aLg.A02 != null) {
            AnonymousClass7TG.A1A(aLg.A00, false);
            C294975nL.A05(new View[]{aLg.A02, aLg.A08, aLg.A03}, false);
        }
        aLg.A06 = new C386709l2(this, aLg);
        0no A002 = 0no.A00();
        0ng r2 = aLg.A06;
        if (r2 != null) {
            A002.A01(r2, 8000);
            AnonymousClass0fD.A0A(-1014458939, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(-1859371167, A03);
        throw A0y;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        ImmutableList immutableList;
        int i2;
        IllegalStateException A0z;
        int i3;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(-1787604104);
                C295315nw r2 = (C295315nw) obj2;
                int A0D = AnonymousClass7TG.A0D(r2, -619657748);
                C375169Cn A002 = C375149Cl.A00((Context) this.A01, (UserSession) this.A02);
                String str = r2.A00;
                0xY AR4 = A002.A00.AR4();
                AR4.E5g("autofill_js", str);
                AR4.apply();
                AnonymousClass0fD.A0A(-1940363273, A0D);
                i = -1257830536;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(-1925630761);
                int A032 = AnonymousClass0fD.A03(620472021);
                C387549mO r5 = (C387549mO) this.A01;
                User user = (User) this.A02;
                List list = ((C384609hb) obj2).A01;
                if (list != null) {
                    immutableList = ImmutableList.copyOf((Collection) list);
                } else {
                    immutableList = null;
                }
                immutableList.getClass();
                if (!immutableList.isEmpty()) {
                    C387549mO.A03(r5, user, immutableList, 0);
                } else {
                    AnonymousClass87H r8 = r5.A0B;
                    UserSession userSession = r5.A09;
                    Context context = r5.A07;
                    r8.A0C(C39808AAf.A00(context, userSession, user, C387549mO.A00(r5).A01), r5.A0H, true);
                    r8.A0B(new C386019jv(context, userSession, user), AnonymousClass57C.CREATE_MODE_USER_SEARCH, C317876nz.A17, r5.A0F, true, false);
                    r5.A06 = true;
                    r8.A00.A06();
                    r8.A05();
                }
                AnonymousClass0fD.A0A(-1167495170, A032);
                i = -10478886;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-2050410745);
                1XO r22 = (1XO) obj2;
                int A0D2 = AnonymousClass7TG.A0D(r22, -1311821549);
                C39964ALg aLg = (C39964ALg) this.A02;
                User user2 = aLg.A09;
                User user3 = (User) this.A01;
                if (user2 != user3) {
                    i2 = 614299029;
                } else {
                    if (r22.A06.size() >= 3) {
                        int dimensionPixelSize = aLg.A0D.getResources().getDimensionPixelSize(R.dimen.bio_product_sticker_width);
                        int i4 = 0;
                        do {
                            ExtendedImageUrl A1m = ((1Xj) r22.A06.get(i4)).A1m(dimensionPixelSize);
                            String A2n = ((1Xj) r22.A06.get(i4)).A2n();
                            if (A2n != null) {
                                1NK A003 = 1NK.A00();
                                if (A1m != null) {
                                    1OO A0J = A003.A0J(A1m, aLg.A0J.getModuleName());
                                    A0J.A08 = Integer.valueOf(i4);
                                    A0J.A02(new C40252AXq(aLg, user3, A2n));
                                    A0J.A01();
                                    i4++;
                                } else {
                                    A0z = AnonymousClass7TE.A0z("Required value was null.");
                                    i3 = 1128473271;
                                }
                            } else {
                                A0z = AnonymousClass7TE.A0z("Required value was null.");
                                i3 = -972626187;
                            }
                            AnonymousClass0fD.A0A(i3, A0D2);
                            throw A0z;
                        } while (i4 < 3);
                    }
                    onFail(AnonymousClass7BQ.A00());
                    i2 = -1365187315;
                }
                AnonymousClass0fD.A0A(i2, A0D2);
                i = -377407067;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
