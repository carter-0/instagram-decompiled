package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9mO  reason: invalid class name and case insensitive filesystem */
public final class C387549mO extends AA8 implements AnonymousClass1MK, C3493580b {
    public int A00;
    public Bitmap A01;
    public Drawable A02;
    public User A03;
    public List A04 = AnonymousClass7TE.A1C();
    public List A05;
    public boolean A06;
    public final Context A07;
    public final TextWatcher A08 = new C39962ALe(true);
    public final UserSession A09;
    public final TargetViewSizeProvider A0A;
    public final AnonymousClass87H A0B;
    public final C358548b5 A0C;
    public final AnonymousClass80U A0D;
    public final C337257fy A0E;
    public final C310416b1 A0F;
    public final C310416b1 A0G;
    public final C310416b1 A0H;
    public final AnonymousClass0iw A0I;
    public final C39890ADo A0J;

    public static void A01(C387549mO r3, C45361Cv3 cv3) {
        r3.A01 = null;
        1OO A0J2 = 1NK.A00().A0J(cv3.A00, (String) null);
        A0J2.A02(r3);
        A0J2.A08 = Integer.valueOf(r3.A00);
        A0J2.A01();
        27p.A01(r3.A09).A0v(C391599tL.CARDS, cv3.A02);
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public C387549mO(Context context, AnonymousClass07i r39, AnonymousClass0iw r40, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass87H r43, AnonymousClass80U r44) {
        C39890ADo aDo = new C39890ADo();
        aDo.A0R = false;
        this.A0J = aDo;
        this.A0G = new C310416b1((AnonymousClass8BH) new AnonymousClass8BG(0.5f, 0.12f), (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, false, false, true, true, false, false, true, true, true, true, true, true, false, false);
        C39890ADo aDo2 = new C39890ADo();
        aDo2.A0H = true;
        aDo2.A06 = new AnonymousClass8BG(0.5f, 0.27f);
        this.A0H = new C310416b1(aDo2);
        this.A0F = C39808AAf.A01();
        Context context2 = context;
        this.A07 = context2;
        AnonymousClass0iw r8 = r40;
        this.A0I = r8;
        this.A0B = r43;
        UserSession userSession2 = userSession;
        this.A09 = userSession2;
        AnonymousClass80U r0 = r44;
        this.A0D = r0;
        this.A0A = targetViewSizeProvider;
        r0.A7w(this);
        C336297eO A002 = C336237eI.A00(new AWR(this, 3), userSession2, new C228602lw(context2, r39), new AfG(1, this, userSession2), "coefficient_besties_list_ranking", Collections.singletonList(AnonymousClass0t1.A01.A01(userSession2)), true);
        this.A0E = A002;
        C358548b5 r02 = new C358548b5(r8, userSession2, new C40342Aab(userSession2, this), A002);
        this.A0C = r02;
        r02.setHasStableIds(true);
        A002.EcJ(new C65613Lwo(this, 0));
    }

    public static C45361Cv3 A00(C387549mO r2) {
        List list = r2.A05;
        list.getClass();
        return (C45361Cv3) list.get(r2.A00);
    }

    public static void A02(C387549mO r5, User user) {
        AnonymousClass87H r2 = r5.A0B;
        r2.A0I(002.A0R("@", user.getUsername()));
        if (r5.A01 == null) {
            r2.A0J(r5.A07.getString(2131973858));
            return;
        }
        r5.A0D.E3H(new Object());
        r2.A04();
        r2.A00.A01.A05.A02.A01.A0A = user;
        C45361Cv3 A002 = A00(r5);
        UserSession userSession = r5.A09;
        String id = user.getId();
        String str = A002.A02;
        1NY r3 = new 1NY(userSession);
        r3.A05();
        r3.A0K("creatives/create_mode/card_for_user/%s/", new Object[]{id, str});
        r3.A9m(C66579MXk.A00(267), str);
        r3.A0R(C384609hb.class, AAZ.class);
        1OC A0M = r3.A0M();
        A0M.A00 = new C385459iy(1, r5, user);
        1ES.A03(A0M);
    }

    public static void A03(C387549mO r16, User user, List list, int i) {
        C387549mO r9 = r16;
        AnonymousClass87H r5 = r9.A0B;
        Drawable drawable = r9.A02;
        C39890ADo aDo = r9.A0J;
        aDo.A0N = false;
        r5.A0C(drawable, new C310416b1(aDo), true);
        List list2 = list;
        User user2 = user;
        int i2 = i;
        if (i2 == list2.size()) {
            r9.A06 = true;
            C3509386y r4 = r5.A00;
            r4.A06();
            List list3 = r9.A04;
            r5.A0C(C39808AAf.A00(r9.A07, r9.A09, user2, A00(r9).A01), r9.A0G, true);
            r5.A0G(r4.A01.A01.A08(), list3);
            return;
        }
        1Xj r11 = (1Xj) list2.get(i2);
        if (r11.A5v()) {
            C290815g0 A002 = C59730JVo.A00(r9.A07, r9.A09, r11, "CanvasShoutoutController");
            A002.A00 = new C385939jm(r11, user2, r16, list2, i2, 0);
            1ES.A03(A002);
            return;
        }
        AnonymousClass57C r6 = AnonymousClass57C.CREATE_MODE_USER_SEARCH;
        C310416b1 A022 = C39906AIv.A02(r9.A07, r9.A0A, r11);
        C3509386y r1 = r5.A00;
        r1.A01.A00();
        C347017w8 A0O = r1.A01.A03.A0O(r6, r11, A022);
        Drawable drawable2 = r9.A02;
        aDo.A0N = false;
        AnonymousClass87H.A01(drawable2, r5, aDo, false);
        A0O.A9D(new AZ6(i2, 1, r9, list2, r11, user2, A0O));
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        if ((obj3 instanceof AnonymousClass8T3) && obj2 == AnonymousClass80V.SHOUTOUT_PREPARE_MEDIA) {
            User user = this.A03;
            if (user != null) {
                A02(this, user);
            } else {
                0kD.A01("Shoutouts", "Done button tapped with no user available");
            }
        }
    }

    public final void CyF(C226952iF r5, AnonymousClass3LX r6) {
        Object C3s = r5.C3s();
        C3s.getClass();
        if (C3s.equals(Integer.valueOf(this.A00))) {
            AnonymousClass87H r3 = this.A0B;
            if (r3.A0L(this)) {
                r3.A07();
                Bitmap bitmap = r6.A01;
                bitmap.getClass();
                this.A01 = C394369xy.A00(bitmap, this.A0A);
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.A07.getResources(), this.A01);
                this.A02 = bitmapDrawable;
                C39890ADo aDo = this.A0J;
                aDo.A0N = true;
                AnonymousClass87H.A01(bitmapDrawable, r3, aDo, true);
            }
        }
    }
}
