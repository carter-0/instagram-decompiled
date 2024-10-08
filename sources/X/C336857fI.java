package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.api.schemas.MediaType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7fI  reason: invalid class name and case insensitive filesystem */
public final class C336857fI extends C251343mx {
    public final GestureDetector A00;
    public final C52971GgO A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final Map A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final int A0H;
    public final C335867df A0I;
    public final C337197fs A0J;
    public final C335847dd A0K;
    public final AnonymousClass571 A0L;
    public final AnonymousClass572 A0M;
    public final User A0N;
    public final String A0O;
    public final boolean A0P;

    public final C251263mp A0X(AnonymousClass3Y5 r31) {
        String str;
        String str2;
        2WX r1;
        int i;
        String str3;
        List list;
        Object obj;
        AnonymousClass3Y5 r9 = r31;
        0qQ.A0B(r9, 0);
        SpannableString spannableString = (SpannableString) AnonymousClass3Zw.A00(r9, new C377119Kp(r9, 38), new Object[0]);
        2Wa A002 = C243643Zq.A00(r9, new C377119Kp(this, 37));
        UserSession userSession = this.A03;
        String str4 = this.A04;
        C52971GgO ggO = this.A01;
        CharSequence charSequence = (CharSequence) AnonymousClass3Zw.A00(r9, new AnonymousClass9MH(12, (Object) A002, (Object) this, (Object) r9), new Object[]{userSession, str4, ggO, A002, Boolean.valueOf(this.A0C), Boolean.valueOf(this.A0E)});
        C337197fs r4 = this.A0J;
        AnonymousClass571 r14 = this.A0L;
        if (r14 != null) {
            str = r14.A04;
        } else {
            str = null;
        }
        AnonymousClass572 r0 = this.A0M;
        if (r0 != null) {
            str2 = r0.A01;
        } else {
            str2 = null;
        }
        C335847dd r12 = this.A0K;
        ImageUrl imageUrl = r12.A00;
        int i2 = 120;
        if (r4 != null) {
            2Wb r8 = new 2Wb(r9.A05, new ArrayList());
            if (!this.A0P) {
                i2 = 160;
            }
            int i3 = 8;
            if (r4.A06) {
                i3 = 0;
            }
            AnonymousClass3XV r02 = 2WX.A02;
            r8.A00(new C53947Gwr(new 2WX((2WX) null, new AnonymousClass9JR(AnonymousClass05K.A08, 0, Double.doubleToRawLongBits(2.0d))), r4, userSession, i2, i3));
            return new 2Tp((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, (C244343b2) null, r8.A01, false);
        } else if (str != null) {
            MediaType mediaType = null;
            2Wb r3 = new 2Wb(r9.A05, new ArrayList());
            if (r14 != null) {
                mediaType = r14.A00;
            }
            int i4 = 120;
            if (this.A0P) {
                i4 = 80;
            }
            r3.A00(new C53951Gwv(mediaType, ggO, this.A02, userSession, str, i4));
            return new 2Tp((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, (C244343b2) null, r3.A01, false);
        } else if (str2 != null) {
            2Wb r92 = new 2Wb(r9.A05, new ArrayList());
            AnonymousClass3XV r03 = 2WX.A02;
            long doubleToRawLongBits = Double.doubleToRawLongBits(120.0d);
            r92.A00(new GYW(ImageView.ScaleType.FIT_CENTER, new 2WX(new 2WX((2WX) null, new AnonymousClass9JR(AnonymousClass05K.A00, 0, doubleToRawLongBits)), new AnonymousClass9JR(AnonymousClass05K.A01, 0, doubleToRawLongBits)), this.A02, new SimpleImageUrl(str2), (ImageUrl) null, (C240963Ni) null, (C226632hb) null, (String) null, 3, false, false));
            return new 2Tp((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, (C244343b2) null, r92.A01, false);
        } else if (imageUrl != null) {
            2Wb r82 = new 2Wb(r9.A05, new ArrayList());
            AnonymousClass3XV r04 = 2WX.A02;
            r82.A00(new C53948Gws(new 2WX((2WX) null, new AnonymousClass9JR(AnonymousClass05K.A08, 0, Double.doubleToRawLongBits(2.0d))), r12, ggO, this.A02));
            return new 2Tp((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, (C244343b2) null, r82.A01, false);
        } else {
            C335867df r05 = this.A0I;
            if (r05 == C335867df.RESTRICT_SENSITIVITY_SCREEN) {
                String A0E2 = C244013aV.A0E(r9, 2131972325);
                2V1 r7 = r9.A05;
                int A022 = C244013aV.A02(r9, 2Yu.A08(r7.A0C));
                AnonymousClass3XV r06 = 2WX.A02;
                2WX r10 = new 2WX(new 2WX((2WX) null, new AnonymousClass9JS(AnonymousClass05K.A0N, C244013aV.A0E(r9, 2131972325), 0)), new AnonymousClass9JS(AnonymousClass05K.A0j, 1, 0));
                Typeface typeface = Typeface.DEFAULT;
                long doubleToRawLongBits2 = Double.doubleToRawLongBits(0.0d);
                Integer num = AnonymousClass05K.A00;
                C244103ae A003 = 2WW.A00(r7, 0);
                A003.A0V(A0E2);
                A003.A0U((2V5) null);
                A003.A0P(A022);
                A003.A0Q(2Wd.A00(r9.Bnf(), ((long) Float.floatToRawIntBits(14.0f)) | 9221683186994511872L));
                A003.A0R(0);
                A003.A0S(typeface);
                A003.A0F();
                A003.A0K((float) 2Wd.A00(r9.Bnf(), doubleToRawLongBits2));
                A003.A0I((float) 2Wd.A00(r9.Bnf(), doubleToRawLongBits2));
                A003.A0J((float) 2Wd.A00(r9.Bnf(), doubleToRawLongBits2));
                A003.A0H((float) 2Wd.A00(r9.Bnf(), doubleToRawLongBits2));
                A003.A0W(num);
                A003.A0C();
                A003.A0X(num);
                A003.A0G();
                A003.A0a(false);
                A003.A0N(0);
                A003.A0E();
                A003.A0b(true);
                A003.A0Y(true);
                A003.A0Z(true);
                A003.A05((AnonymousClass2VW) null);
                C244123ag.A00(A003, r10);
                return A003.A0A();
            } else if (charSequence == null || charSequence.length() == 0) {
                return null;
            } else {
                AnonymousClass3XV r13 = 2WX.A02;
                String username = this.A0N.getUsername();
                if (str4 == null) {
                    str4 = "";
                }
                2WX r42 = new 2WX(new 2WX((2WX) null, new AnonymousClass9JS(AnonymousClass05K.A0N, C244013aV.A0G(r9, new Object[]{username, str4}, 2131972498), 0)), new AnonymousClass9JS(AnonymousClass05K.A0j, 1, 0));
                AnonymousClass9LG r32 = new AnonymousClass9LG(this, 2);
                Integer num2 = AnonymousClass05K.A00;
                2WX r11 = new 2WX(new 2WX(r42, new C244253at(num2, r32, (String) null)), new AnonymousClass9JS(AnonymousClass05K.A08, "row_comment_textview_comment", 4));
                boolean booleanValue = ((Boolean) A002.A03).booleanValue();
                if (booleanValue) {
                    r1 = new 2WX((2WX) null, new AnonymousClass9JS(AnonymousClass05K.A1F, new C377469Ly(36, (Object) this, (Object) A002), 4));
                } else {
                    r1 = null;
                }
                2WX A004 = r11.A00(r1);
                2Wb r112 = new 2Wb(r9.A05, new ArrayList());
                2WX r15 = new 2WX((2WX) null, new AnonymousClass9JQ(num2, 100.0f, 0));
                2V1 r122 = r112.A00;
                2Wb r142 = new 2Wb(r122, new ArrayList());
                2V1 r93 = r142.A00;
                Context context = r93.A0C;
                int A023 = C244013aV.A02(r142, 2Yu.A0H(context, R.attr.igds_color_primary_text));
                long floatToRawIntBits = ((long) Float.floatToRawIntBits(14.0f)) | 9221683186994511872L;
                Typeface A032 = 0oh.A03(context, Typeface.DEFAULT, num2);
                float f = 0.4f;
                if (r05 == C335867df.APPROVED) {
                    f = 1.0f;
                }
                2WX A012 = C52112GFg.A01(A004, f);
                if (booleanValue) {
                    i = this.A0H;
                    if (i == 0) {
                        i = 2;
                    }
                } else {
                    i = Integer.MAX_VALUE;
                }
                long doubleToRawLongBits3 = Double.doubleToRawLongBits(0.0d);
                C244103ae A005 = 2WW.A00(r93, 0);
                A005.A0V(charSequence);
                A005.A0U((2V5) null);
                A005.A0P(A023);
                A005.A0Q(2Wd.A00(r142.Bnf(), floatToRawIntBits));
                A005.A0R(0);
                A005.A0S(A032);
                A005.A0O(-7829368);
                A005.A0K((float) 2Wd.A00(r142.Bnf(), doubleToRawLongBits3));
                A005.A0I((float) 2Wd.A00(r142.Bnf(), doubleToRawLongBits3));
                A005.A0J((float) 2Wd.A00(r142.Bnf(), doubleToRawLongBits3));
                A005.A0H((float) 2Wd.A00(r142.Bnf(), doubleToRawLongBits3));
                A005.A0W(num2);
                A005.A0C();
                A005.A0X(num2);
                A005.A0L(1.0f);
                A005.A0a(false);
                A005.A0N(0);
                A005.A0M(i);
                A005.A0b(true);
                A005.A0Y(true);
                A005.A0Z(true);
                if (spannableString != null) {
                    A005.A01.A0R = spannableString;
                }
                A005.A05((AnonymousClass2VW) null);
                C244123ag.A00(A005, A012);
                r142.A00(A005.A0A());
                r112.A00(C243563Zg.A0H(r142, r112, r15, (C243573Zh) null, (C243573Zh) null, (C243583Zi) null, (C244343b2) null, false));
                String str5 = this.A0O;
                if (!(str5 == null || (str3 = this.A05) == null || (list = this.A07) == null)) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (!((DT9) obj).CQ7()) {
                            break;
                        }
                    }
                    DT9 dt9 = (DT9) obj;
                    if (dt9 != null) {
                        2WX r43 = new 2WX((2WX) null, new AnonymousClass9JQ(num2, 100.0f, 0));
                        2Wb r33 = new 2Wb(r122, new ArrayList());
                        r33.A00(new C53952Gww(ggO, this.A02, dt9.BRi(), str5, str3, dt9.Alm()));
                        r112.A00(C243563Zg.A0B(r33, r112, r43));
                    }
                }
                return new 2Tl((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, r112.A01, false);
            }
        }
    }

    public C336857fI(GestureDetector gestureDetector, C335867df r3, C337197fs r4, C335847dd r5, C52971GgO ggO, AnonymousClass0iw r7, UserSession userSession, AnonymousClass571 r9, AnonymousClass572 r10, User user, String str, String str2, String str3, String str4, List list, Map map, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        0qQ.A0B(r7, 18);
        0qQ.A0B(userSession, 19);
        this.A0N = user;
        this.A04 = str;
        this.A0B = z;
        this.A05 = str2;
        this.A07 = list;
        this.A0O = str3;
        this.A0J = r4;
        this.A0L = r9;
        this.A0M = r10;
        this.A0I = r3;
        this.A0P = z2;
        this.A0C = z3;
        this.A0D = z4;
        this.A09 = z5;
        this.A0F = z6;
        this.A0G = z7;
        this.A0K = r5;
        this.A02 = r7;
        this.A03 = userSession;
        this.A01 = ggO;
        this.A00 = gestureDetector;
        this.A08 = map;
        this.A0E = z8;
        this.A06 = str4;
        this.A0A = z9;
        this.A0H = i;
    }

    public static final void A00(GestureDetector gestureDetector) {
        gestureDetector.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
    }
}
