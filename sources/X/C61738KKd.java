package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.KKd  reason: case insensitive filesystem */
public final class C61738KKd extends AA8 {
    public String A00;
    public String A01 = "";
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public Runnable A06;
    public String A07;
    public final ColorDrawable A08;
    public final Handler A09;
    public final UserSession A0A;
    public final C59990Jcz A0B;
    public final AnonymousClass87H A0C;
    public final C60406Jkz A0D;
    public final L6D A0E;
    public final Runnable A0F;
    public final int A0G;
    public final Context A0H;
    public final C62928Kog A0I;
    public final String A0J;
    public final String A0K;

    public static void A02(C61738KKd kKd, String str) {
        kKd.A00 = null;
        kKd.A04 = false;
        C60406Jkz jkz = kKd.A0D;
        jkz.A05.clear();
        jkz.A06.clear();
        jkz.A01 = null;
        jkz.notifyDataSetChanged();
        AnonymousClass87H r1 = kKd.A0C;
        r1.A00.A01.A00();
        r1.A07();
        Handler handler = kKd.A09;
        handler.removeCallbacks(kKd.A0F);
        r1.A09(kKd.A0B);
        Runnable runnable = kKd.A06;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        M6U m6u = new M6U(kKd, str);
        kKd.A06 = m6u;
        handler.postDelayed(m6u, 800);
    }

    public final void A0B(C39889ADn aDn) {
        aDn.A0E = false;
        aDn.A0F = false;
    }

    public final boolean A0G() {
        return false;
    }

    public final boolean A0I() {
        return true;
    }

    public final boolean A0J(Drawable drawable, AnonymousClass80W r3) {
        return true;
    }

    public static void A01(C317876nz r46, C317966o8 r47, C61738KKd kKd, String str) {
        int A062;
        int A052;
        float f;
        ImageUrl imageUrl;
        C61738KKd kKd2 = kKd;
        Context context = kKd2.A0H;
        UserSession userSession = kKd2.A0A;
        C64847Lj9 lj9 = new C64847Lj9(kKd2, str);
        Integer num = AnonymousClass05K.A00;
        C317966o8 r8 = r47;
        DbY.A1S(context, r8);
        Resources resources = context.getResources();
        ArrayList A1C = AnonymousClass7TE.A1C();
        float f2 = r8.A01;
        float f3 = r8.A00;
        if (C226122ff.A03()) {
            A062 = C226132fh.A01(context).getWidth();
        } else {
            0kD.A07(002.A0R("TargetViewSizeUtil", "#getDisplayWidth"), AnonymousClass000.A00(126), (Throwable) null);
            A062 = 0nA.A06(context);
        }
        if (C226122ff.A03()) {
            A052 = C226132fh.A01(context).getHeight();
        } else {
            0kD.A07(002.A0R("TargetViewSizeUtil", "#getDisplayHeight"), AnonymousClass000.A00(126), (Throwable) null);
            A052 = 0nA.A05(context);
        }
        float f4 = (float) A062;
        float f5 = (f4 / f2) * f3;
        float f6 = (float) A052;
        if (f5 * 4.0f < f6) {
            f5 = (float) Math.ceil((double) (f6 / 4.0f));
            f = f2 * (f5 / f3);
        } else {
            f = f4;
        }
        int i = (int) f5;
        int A002 = (int) C51967G9n.A00(f, f4);
        int i2 = 0;
        for (int i3 = i; ((float) i3) < f6 + f5; i3 += i) {
            ImageUrl imageUrl2 = r8.A0H;
            0qQ.A07(imageUrl2);
            String str2 = r8.A0S;
            0qQ.A07(str2);
            C317966o8 r0 = r8.A0I;
            if (r0 != null) {
                imageUrl = r0.A0H;
            } else {
                imageUrl = null;
            }
            float A042 = (float) JTP.A04(resources);
            Context context2 = context;
            C321016tR r18 = new C321016tR(context2, userSession, imageUrl2, imageUrl, lj9, new C321076tX(-1, (int) f, i), num, str2, A042, context.getColor(R.color.cds_white_a20), context.getColor(R.color.fds_white_alpha60), true);
            r18.setBounds(-A002, i2, A062 + A002, i3);
            A1C.add(r18);
            i2 += i;
        }
        for (int i4 = 0; i4 < A1C.size(); i4++) {
            Drawable drawable = (Drawable) A1C.get(i4);
            AnonymousClass87H r02 = kKd2.A0C;
            AnonymousClass87H r4 = r02;
            Drawable drawable2 = drawable;
            r4.A0B(drawable2, AnonymousClass57C.CREATE_MODE_GIF_SEARCH, r46, new C310416b1(false, (AnonymousClass8BH) new C16336Ut6(drawable.getBounds()), false, (String) null, false, true, true, true, true, true, (Integer) null, false, (AnonymousClass8DA) null, false, false, 1.5f, 0.25f, (C3510487j) null, true, num, (Integer) null, -2, -1.0f, (List) null, -1.0f, -1.0f, (Object) null, false, false), false, AnonymousClass7TF.A1Q(i4));
        }
    }

    public final void A07() {
        C59990Jcz jcz = this.A0B;
        if (jcz.A04) {
            jcz.A04 = false;
            jcz.invalidateSelf();
        }
        AnonymousClass87H r2 = this.A0C;
        r2.A09(jcz);
        r2.A0A((Drawable) null, AnonymousClass57C.CREATE_MODE_DIAL_SELECTION, (C317876nz) null);
        String str = this.A02;
        Context context = this.A0H;
        r2.A0K(str, context.getString(2131972818));
        this.A03 = true;
        this.A05 = true;
        r2.A0D(this.A0D, this.A0G);
        String str2 = this.A07;
        if (str2 != null) {
            C62928Kog kog = this.A0I;
            UserSession userSession = this.A0A;
            C331897Sw r0 = C331897Sw.A0A;
            C331917Sy.A00(context).A05(new C65343Lrj(context, userSession, kog, str2), str2);
        }
    }

    public final void A08() {
        this.A0C.A05();
    }

    public final void A0A(AnonymousClass87G r2) {
        C42040BEs bEs = r2.A02;
        bEs.getClass();
        this.A07 = bEs.A02;
        this.A02 = r2.A02.A03;
    }

    public final void A0C(AnonymousClass80W r3) {
        r3.A04(new Object());
        AnonymousClass87H r1 = this.A0C;
        r1.A07();
        String str = this.A00;
        if (str != null) {
            r1.A0J(str);
        }
    }

    public final void A0E(boolean z) {
        C59990Jcz jcz = this.A0B;
        if (!jcz.A04) {
            jcz.A04 = true;
        }
        this.A04 = false;
        this.A01 = "";
        this.A00 = null;
        this.A03 = false;
        this.A09.removeCallbacks(this.A0F);
        AnonymousClass87H r0 = this.A0C;
        r0.A0D((2Rw) null, 0);
        r0.A09((Drawable) null);
        r0.A06();
        C60406Jkz jkz = this.A0D;
        jkz.A05.clear();
        jkz.A06.clear();
        jkz.A01 = null;
        jkz.notifyDataSetChanged();
    }

    public final boolean A0F() {
        return this.A04;
    }

    public final void A0L(String str, List list, List list2, boolean z) {
        if (this.A03) {
            if (!z) {
                String str2 = this.A0K;
                this.A00 = str2;
                this.A0C.A0J(str2);
            } else if (!this.A01.equals(str)) {
                this.A00 = null;
                return;
            } else if (list.isEmpty() || ((C317466nJ) list.get(0)).BzU() == null) {
                String str3 = this.A0J;
                this.A00 = str3;
                this.A0C.A0J(str3);
                return;
            } else {
                C60406Jkz jkz = this.A0D;
                if (!str.equals(jkz.A01)) {
                    List list3 = jkz.A05;
                    list3.clear();
                    list3.addAll(list);
                    List list4 = jkz.A06;
                    list4.clear();
                    list4.addAll(list2);
                    jkz.A01 = str;
                    int i = 0;
                    if (TextUtils.isEmpty(str)) {
                        i = -1;
                    }
                    jkz.A00 = i;
                    jkz.notifyDataSetChanged();
                }
                C317876nz BzU = ((C317466nJ) list.get(0)).BzU();
                BzU.getClass();
                C317966o8 r1 = (C317966o8) BzU.A0O.get(0);
                if (!TextUtils.isEmpty(str)) {
                    A01(BzU, r1, this, str);
                }
                this.A00 = null;
            }
            UserSession userSession = this.A0A;
            boolean z2 = false;
            if (!list.isEmpty() && ((C317466nJ) list.get(0)).BzU() != null) {
                z2 = true;
            }
            boolean z3 = !z;
            27r A012 = 27p.A01(userSession);
            0Aj A0e = AnonymousClass7TE.A0e(A012.A01, "ig_camera_create_mode_gif_search");
            if (A0e.isSampled()) {
                AnonymousClass283 r2 = A012.A04;
                AnonymousClass7TE.A1W(A0e, "camera_position", JTR.A0C(r2));
                JTP.A1I(A0e, r2);
                JTQ.A12(A0e, A012);
                JTS.A14(r2.A09, A0e);
                A00(A0e, z3, z2);
                JTP.A1J(A0e, r2);
                AnonymousClass7TH.A0U(A0e);
                C51965G9l.A1A(r2.A0C, A0e);
                JTS.A16(A0e);
                JTU.A0x(A0e, r2);
                AnonymousClass7TH.A0V(A0e);
            }
            AnonymousClass29S r6 = A012.A08;
            0wc r8 = r6.A01;
            String A002 = AnonymousClass000.A00(303);
            0kJ r3 = r8.A00;
            0Aj A003 = r8.A00(r3, A002);
            if (A003.isSampled()) {
                JTO.A1Q(A003, "CREATE_MODE_GIF_SEARCH");
                AnonymousClass283 r9 = r6.A04;
                AnonymousClass7TE.A1V(A003, r9);
                int i2 = 2;
                AnonymousClass7TE.A1W(A003, "event_type", 2);
                C59725JVj jVj = r9.A0C;
                if (jVj == null) {
                    jVj = C59725JVj.NONE;
                }
                C51965G9l.A1A(jVj, A003);
                JTO.A1S(A003, JTP.A0p(r9));
                AnonymousClass7TH.A0U(A003);
                JTO.A1T(A003, "IG_CAMERA_CREATE_MODE_GIF_SEARCH");
                if (r9.A01 != 2) {
                    i2 = 1;
                }
                AnonymousClass7TE.A1W(A003, "camera_position", i2);
                JTQ.A12(A003, r6);
                A00(A003, z3, z2);
                JTP.A1J(A003, r9);
                JTS.A16(A003);
                JTU.A0x(A003, r9);
                AnonymousClass7TH.A0V(A003);
            }
            0Aj A004 = r8.A00(r3, AnonymousClass000.A00(1431));
            if (A004.isSampled()) {
                JTO.A1T(A004, "IG_CAMERA_CREATE_MODE_GIF_SEARCH");
                JTO.A1Q(A004, "CREATE_MODE_GIF_SEARCH");
                AnonymousClass283 r22 = r6.A04;
                AnonymousClass7TE.A1W(A004, "camera_position", JTR.A0C(r22));
                JTP.A1I(A004, r22);
                JTQ.A12(A004, r6);
                JTS.A14(r22.A09, A004);
                A00(A004, z3, z2);
                JTP.A1J(A004, r22);
                AnonymousClass7TH.A0U(A004);
                C51965G9l.A1A(r22.A0C, A004);
                JTS.A16(A004);
                JTU.A0x(A004, r22);
                AnonymousClass7TH.A0V(A004);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [X.Kog, java.lang.Object] */
    public C61738KKd(Context context, UserSession userSession, AnonymousClass87H r5) {
        this.A0C = r5;
        this.A0H = context;
        this.A0E = new L6D(userSession, this, new MBH(this, 2));
        this.A0A = userSession;
        C59990Jcz jcz = new C59990Jcz(context);
        this.A0B = jcz;
        if (!jcz.A04) {
            jcz.A04 = true;
        }
        this.A08 = new ColorDrawable(context.getColor(R.color.black_40_transparent));
        this.A0K = context.getResources().getString(2131963076);
        this.A0J = context.getResources().getString(2131963075);
        this.A09 = AnonymousClass7TF.A0D();
        this.A0F = new C65861M2c(this);
        L0F l0f = new L0F(this);
        ? obj = new Object();
        obj.A00 = l0f;
        this.A0I = obj;
        this.A0D = new C60406Jkz(context, userSession, new L0G(this));
        this.A0G = context.getResources().getDimensionPixelOffset(R.dimen.canvas_gifs_tile_height);
    }

    public static void A00(0Aj r2, boolean z, boolean z2) {
        r2.A7p("has_network_error", Boolean.valueOf(z));
        r2.A7p("has_result", Boolean.valueOf(z2));
    }

    public final void A0D(String str) {
        A02(this, str);
    }
}
