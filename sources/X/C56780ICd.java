package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: X.ICd  reason: case insensitive filesystem */
public final class C56780ICd implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    public C56780ICd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj6;
        this.A06 = obj3;
        this.A05 = obj5;
        this.A02 = obj2;
        this.A03 = obj4;
        this.A07 = str;
    }

    public final void onClick(View view) {
        int A052;
        Integer num;
        int i;
        Long l;
        String organicTrackingToken;
        String AYt;
        1Xj A0u;
        switch (this.A00) {
            case 0:
                A052 = AnonymousClass0fD.A05(-1185218104);
                C60708Jpt jpt = (C60708Jpt) this.A06;
                Context context = (Context) this.A03;
                HNQ hnq = (HNQ) this.A05;
                MXT mxt = (MXT) this.A02;
                String str = this.A07;
                C71662eb r9 = (C71662eb) this.A01;
                C60005JdE jdE = (C60005JdE) this.A04;
                int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                C270194gL Ahy = mxt.Ahy();
                if (Ahy == null) {
                    1Xj BPf = mxt.BPf();
                    switch (hnq.ordinal()) {
                        case 0:
                            I9I i9i = jpt.A00;
                            if (i9i != null) {
                                i9i.A00(mxt);
                            }
                            C60708Jpt.A02(jpt, false);
                            num = AnonymousClass05K.A01;
                            break;
                        case 2:
                            UserSession userSession = jpt.A04;
                            jpt.A0E.D2t(userSession, C51972G9s.A0r(userSession, BPf), C62572Ki5.THUMBNAIL.A00);
                            break;
                        case 7:
                            UserSession userSession2 = jpt.A04;
                            1se A002 = 1sd.A00(userSession2);
                            0qQ.A0A(BPf);
                            A002.A03(BPf, true, true);
                            C60708Jpt.A02(jpt, false);
                            C60708Jpt.A00(jdE, r9, mxt, AnonymousClass05K.A00);
                            AnonymousClass4DU r7 = jpt.A0A;
                            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession2), "igtv_hide_item");
                            User A2A = BPf.A2A(userSession2);
                            C51972G9s.A15(A0e, BPf);
                            C51965G9l.A1E(A0e, C51972G9s.A0j(BPf.getId()));
                            if (A2A != null) {
                                l = C51972G9s.A0h(A2A);
                            } else {
                                l = null;
                            }
                            A0e.A9F("creator_id", l);
                            A0e.A9F("media_type", C51972G9s.A0g(BPf));
                            A0e.A9F("chaining_seed_media_id", (Long) null);
                            A0e.AAJ("channel_pk", (String) null);
                            if (AnonymousClass3WX.A02(BPf, r7)) {
                                organicTrackingToken = C231122qu.A0F(userSession2, BPf);
                            } else {
                                organicTrackingToken = BPf.A0C.getOrganicTrackingToken();
                            }
                            C51965G9l.A1L(A0e, organicTrackingToken);
                            if (BPf.A5D()) {
                                List A1I = C51966G9m.A1I(BPf);
                                if (A1I == null || (A0u = C51966G9m.A0u(A1I, 0)) == null) {
                                    AYt = null;
                                } else {
                                    AYt = A0u.A0C.AYt();
                                }
                            } else {
                                AYt = BPf.A0C.AYt();
                            }
                            DbS.A1J(A0e, AYt);
                            A0e.AAJ(C273654mx.A00(134), (String) null);
                            DbS.A1O(A0e, (String) null);
                            DbS.A1N(A0e, (String) null);
                            A0e.AAJ(C273654mx.A00(748), (String) null);
                            A0e.AAJ(C273654mx.A00(159), (String) null);
                            A0e.AAJ(C273654mx.A00(2859), (String) null);
                            A0e.AAJ(AnonymousClass000.A00(4868), (String) null);
                            A0e.AAJ(C273654mx.A00(94), (String) null);
                            DbS.A1M(A0e, (String) null);
                            A0e.A9F(C273654mx.A00(3477), (Long) null);
                            A0e.A9F(C273654mx.A00(3478), (Long) null);
                            A0e.Cgf();
                            break;
                        case 8:
                            1se A003 = 1sd.A00(jpt.A04);
                            0qQ.A0A(BPf);
                            A003.A03(BPf, false, false);
                            break;
                        case 9:
                        case 10:
                            JSz jSz = jpt.A0E;
                            UserSession userSession3 = jpt.A04;
                            0qQ.A0A(BPf);
                            jSz.D32(context, userSession3, BPf, jpt.getBindingAdapterPosition());
                            break;
                        case 13:
                            C49937FFq.A00.A02(context, jpt.A04, "video_overflow_menu");
                            break;
                    }
                } else {
                    int ordinal = hnq.ordinal();
                    if (ordinal == 2) {
                        jpt.A0E.D2t(jpt.A04, Ahy.A03().getId(), C62572Ki5.THUMBNAIL.A00);
                        i = -1992981579;
                    } else if (ordinal != 7) {
                        if (ordinal == 8) {
                            C278164wN.A00(jpt.A04).A01(Ahy.getId(), false);
                            C60708Jpt.A02(jpt, true);
                            i = -1992981579;
                            break;
                        }
                    } else {
                        C278164wN.A00(jpt.A04).A01(Ahy.getId(), true);
                        C60708Jpt.A02(jpt, false);
                        num = AnonymousClass05K.A00;
                        C60708Jpt.A00(jdE, r9, mxt, num);
                        i = -1992981579;
                    }
                }
                I9I i9i2 = jpt.A00;
                if (i9i2 != null) {
                    jpt.A0E.D2T(context, i9i2, mxt, hnq);
                } else {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("Option: ");
                    A1A.append(hnq);
                    A1A.append(" not supported. Entry point: ");
                    0wb.A03("longPressOptionsHandler.onClickExtraMenuOptions", AnonymousClass7TF.A0l(str, A1A));
                }
                i = -1992981579;
                break;
            case 1:
                A052 = AnonymousClass0fD.A05(-452679654);
                UserSession userSession4 = (UserSession) this.A06;
                if (AnonymousClass2o2.A03(userSession4)) {
                    User user = (User) this.A04;
                    if (user.A02 == 17M.A06) {
                        Context context2 = (Context) this.A02;
                        AnonymousClass0iw r2 = (AnonymousClass0iw) this.A01;
                        C50026FJl fJl = new C50026FJl(30, this.A03, (Object) userSession4, (Object) user);
                        DbY.A1S(context2, r2);
                        C358248ab A0Y = DbS.A0Y(context2);
                        A0Y.A0n(user.Bh3(), r2);
                        A0Y.A0q(AnonymousClass7TF.A0e(context2.getResources(), user.getUsername(), 2131975855));
                        A0Y.A0K(fJl, 2131975854);
                        A0Y.A05();
                        DbT.A1V(A0Y);
                        i = 1092839103;
                        break;
                    }
                }
                User user2 = (User) this.A04;
                if (user2.A0N() == AnonymousClass05K.A01) {
                    ((C51028FnK) this.A03).A00(user2, this.A07);
                } else {
                    FH6.A06((Context) this.A02, new C50018FJd(this.A03, (Object) user2, this.A07, 8), (DialogInterface.OnClickListener) null, (AnonymousClass0iw) this.A01, (C243853aD) this.A05, user2);
                }
                i = 1092839103;
            default:
                A052 = AnonymousClass0fD.A05(945696350);
                FragmentActivity fragmentActivity = (Activity) this.A01;
                if (fragmentActivity instanceof FragmentActivity) {
                    GBV.A08 = true;
                    GBV.A07 = 00k.A0U((Collection) this.A04);
                    UserSession userSession5 = (UserSession) this.A06;
                    C309516Yo A0Q = DbU.A0Q(fragmentActivity, userSession5);
                    1a1 A022 = C46447Df9.A02();
                    User user3 = (User) this.A05;
                    String id = user3.getId();
                    AnonymousClass0iw r5 = (AnonymousClass0iw) this.A02;
                    C46474Dfc.A03(A0Q, userSession5, A022, C46548Dgp.A01(userSession5, id, "suggested_users_in_reels", r5.getModuleName()));
                    C230012om r3 = GBV.A06;
                    if (r3 != null) {
                        r3.A0B(new AnonymousClass6KN(C46575DhH.A00(r5, (AnonymousClass3UK) this.A03, user3, (Integer) GBV.A0A.get(user3.getId()), this.A07)));
                    }
                }
                i = 1341787123;
                break;
        }
        AnonymousClass0fD.A0C(i, A052);
    }
}
