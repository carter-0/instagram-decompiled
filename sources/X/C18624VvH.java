package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.VvH  reason: case insensitive filesystem */
public final class C18624VvH {
    public 2da A00;
    public User A01;
    public C20929X4u A02;
    public final AnonymousClass4DH A03;
    public final UserSession A04;
    public final String A05;
    public final String A06;
    public final Context A07;
    public final WQU A08 = new WQU(this, 8);
    public final AnonymousClass0iw A09;
    public final C323536xe A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;

    public C18624VvH(Context context, AnonymousClass4DH r4, AnonymousClass0iw r5, UserSession userSession, C20929X4u x4u, C323536xe r8, String str, String str2, String str3, String str4, String str5, boolean z) {
        0qQ.A0B(str3, 3);
        this.A05 = str;
        this.A0C = str2;
        this.A06 = str4;
        this.A03 = r4;
        this.A04 = userSession;
        this.A0A = r8;
        this.A02 = x4u;
        this.A0D = z;
        this.A07 = context;
        this.A09 = r5;
        this.A0B = str5;
    }

    public final void A02(2da r13) {
        long j;
        String str;
        this.A00 = r13;
        r13.Eu4(true);
        this.A01 = 17h.A00(this.A04).A02(this.A05);
        A00(this);
        C323536xe r1 = this.A0A;
        if (r1 != null) {
            String str2 = this.A06;
            UserSession userSession = r1.A09;
            C17377VTe vTe = new C17377VTe(r1, str2);
            String str3 = r1.A0G;
            0qQ.A0B(userSession, 0);
            String str4 = "all_merchants";
            String str5 = str3;
            if (str3 == null) {
                str5 = str4;
            }
            if (str5.equals(str4)) {
                j = 182.A01(0Tu.A06, userSession, 36594633190672178L) / 60;
            } else {
                j = 10;
            }
            HashMap hashMap = VKE.A00;
            Number A0z = JTO.A0z(str5, hashMap);
            if (A0z != null) {
                if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - A0z.longValue()) <= j) {
                    return;
                }
            }
            if (str3 != null) {
                str4 = str3;
            }
            Pxe.A1X(str4, hashMap, System.currentTimeMillis());
            if (str3 != null) {
                str = 002.A0g("commerce/merchants/", str3, "/tooltip/");
            } else {
                str = "commerce/shop_tab/cart/tooltip/";
            }
            1NY A0b = AnonymousClass7TG.A0b(userSession);
            A0b.A0A(str);
            1OC A0S = DbU.A0S(A0b, UXM.class, C18255VoM.class);
            C15622Ufo.A00(A0S, vTe, 4);
            1ES.A03(A0S);
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public static final void A00(C18624VvH vvH) {
        2da r3 = vvH.A00;
        if (r3 != null) {
            Context context = vvH.A07;
            AnonymousClass0iw r10 = vvH.A09;
            User user = vvH.A01;
            C20929X4u x4u = vvH.A02;
            boolean z = vvH.A0D;
            String str = vvH.A0C;
            String str2 = vvH.A0B;
            if (user == null) {
                if (str == null) {
                    str = "";
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                if (!z) {
                    r3.EfN(spannableStringBuilder, str2);
                    return;
                }
                ? circularImageView = new CircularImageView(context, (AttributeSet) null, 0);
                DbT.A16(context, circularImageView, 2Yu.A0H(context, R.attr.igds_color_stroke));
                r3.EfO(spannableStringBuilder, circularImageView, str2);
                return;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(user.getUsername());
            if (user.isVerified()) {
                C244273av.A08(context, spannableStringBuilder2, true);
            }
            if (!z) {
                if (str2 == null) {
                    str2 = user.A03.getStorefrontAttributionUsername();
                }
                r3.EfN(spannableStringBuilder2, str2);
            } else {
                IgImageView circularImageView2 = new CircularImageView(context, (AttributeSet) null, 0);
                circularImageView2.A0H(1, AnonymousClass7TF.A03(context, R.attr.igds_color_stroke));
                circularImageView2.A02 = true;
                DbU.A1S(r10, circularImageView2, user);
                DbU.A12(context, circularImageView2, 2131970052);
                if (str2 == null) {
                    str2 = user.A03.getStorefrontAttributionUsername();
                }
                r3.EfO(spannableStringBuilder2, circularImageView2, str2);
            }
            r3.Eoo(new WBD(68, (Object) user, (Object) x4u));
        }
    }

    public final void A01() {
        C323536xe r0 = this.A0A;
        if (r0 != null) {
            r0.onDestroy();
        }
        AnonymousClass1Nd.A00(this.A04).A02(this.A08, C2370836g.class);
    }
}
