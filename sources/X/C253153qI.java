package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3qI  reason: invalid class name and case insensitive filesystem */
public abstract class C253153qI {
    public static final SpannableStringBuilder A00(Context context, N4R n4r, UserSession userSession, 1Xj r20, C55504Him him, AnonymousClass3W1 r22, int i, int i2) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        N4R n4r2 = n4r;
        0qQ.A0B(n4r2, 2);
        C55504Him him2 = him;
        0qQ.A0B(him2, 3);
        JGN jgn = new JGN(i2, 46, (Object) n4r2, (Object) r22, (Object) him2);
        return AnonymousClass3ZI.A00(context, userSession2, r20, (User) null, (Integer) null, "sans-serif-medium", new C58186Inq(28, him2, n4r2), jgn, i, false);
    }

    public static final SpannableStringBuilder A01(Context context, UserSession userSession, C243683Zu r14, AnonymousClass53Z r15, C381479bp r16, int i) {
        0qQ.A0B(userSession, 1);
        C381479bp r2 = r16;
        0qQ.A0B(r2, 2);
        0qQ.A0B(r15, 3);
        0qQ.A0B(r14, 5);
        List list = r2.A03;
        int size = list.size();
        boolean A03 = AnonymousClass4i2.A03(userSession, new ArrayList(list), 2);
        int i2 = r14.A09;
        AnonymousClass4i3 r4 = new AnonymousClass4i3(r15, r2, i);
        SpannableStringBuilder A00 = AnonymousClass4i2.A00(context, userSession, r4, "sans-serif-medium", list, size, i2, A03, true, false).A00();
        0qQ.A07(A00);
        return A00;
    }

    public static final void A02(Context context, SpannableStringBuilder spannableStringBuilder, int i) {
        if (spannableStringBuilder.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 0);
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append(context.getString(2131962606));
        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.length(), 33);
    }

    public static final void A03(Context context, SpannableStringBuilder spannableStringBuilder, int i) {
        if (spannableStringBuilder.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 0);
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append(context.getString(2131964446));
        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.length(), 33);
    }

    public static final void A04(Context context, SpannableStringBuilder spannableStringBuilder, UserSession userSession, 1Xj r13, C244003aU r14, AnonymousClass3ZU r15, String str, int i, int i2) {
        AnonymousClass9OT r3;
        int i3;
        String str2 = str;
        0qQ.A0B(str2, 2);
        String A2n = r13.A2n();
        if (r13.A5G()) {
            r3 = AnonymousClass9OT.REEL;
        } else {
            r3 = AnonymousClass9OT.POST;
        }
        C250563lf.A0e(r3, r13.A1I(), userSession, (Boolean) null, str2, "genai_transparency_label_impression", A2n);
        boolean A01 = JUL.A01(userSession);
        int i4 = i;
        if (spannableStringBuilder.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), length, spannableStringBuilder.length(), 0);
        }
        C52769GcM gcM = new C52769GcM(r14, r15, i4);
        int length2 = spannableStringBuilder.length();
        if (!A01) {
            Drawable drawable = context.getDrawable(R.drawable.instagram_third_party_gen_ai_pano_outline_24);
            if (drawable != null) {
                Drawable mutate = drawable.mutate();
                if (mutate != null) {
                    mutate.setColorFilter(AnonymousClass37O.A00(i4));
                }
                int i5 = i2;
                drawable.setBounds(0, 0, i5, i5);
            }
            spannableStringBuilder.append(" ");
            if (drawable != null) {
                spannableStringBuilder.setSpan(new C2606346l(drawable), length2, length2 + 1, 33);
                spannableStringBuilder.append(" ");
                i3 = 2131963013;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            i3 = 2131963014;
        }
        spannableStringBuilder.append(context.getString(i3));
        spannableStringBuilder.setSpan(gcM, length2 + 1, spannableStringBuilder.length(), 33);
    }

    public static final void A05(Context context, SpannableStringBuilder spannableStringBuilder, 1Xj r7, C244003aU r8, AnonymousClass3ZU r9, int i, int i2) {
        String str;
        if (spannableStringBuilder.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 0);
        }
        Drawable drawable = context.getDrawable(R.drawable.instagram_app_horizon_pano_filled_24);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            if (mutate != null) {
                mutate.setColorFilter(AnonymousClass37O.A00(i));
            }
            drawable.setBounds(0, 0, i2, i2);
        }
        C52820GdC gdC = new C52820GdC(r8, r9, i);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append(" ");
        if (drawable != null) {
            C2606346l r0 = new C2606346l(drawable);
            int i3 = length2 + 1;
            spannableStringBuilder.setSpan(r0, length2, i3, 33);
            spannableStringBuilder.append(" ");
            JSO CGF = r7.A0C.CGF();
            if (CGF == null || (str = CGF.getAttributionTitle()) == null) {
                str = "Meta Horizon";
            }
            spannableStringBuilder.append(str);
            spannableStringBuilder.setSpan(gdC, i3, spannableStringBuilder.length(), 33);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A06(Context context, SpannableStringBuilder spannableStringBuilder, 1Xj r7, C242813Wa r8, AnonymousClass3W1 r9, int i) {
        CharSequence string;
        String B2q;
        String A2g = r7.A2g();
        C245923dh B2s = r7.A0C.B2s();
        if (B2s == null || (B2q = B2s.B2q()) == null || 00l.A0W(B2q) || A2g == null || 00l.A0W(A2g)) {
            string = context.getString(2131974683);
            0qQ.A0A(string);
        } else {
            string = C55014Hal.A00(B2q, A2g);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string);
        spannableStringBuilder2.setSpan(new C2806452v(r7, r8, r9, i), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder.append(spannableStringBuilder2);
    }

    public static final void A07(Context context, SpannableStringBuilder spannableStringBuilder, C243683Zu r6, long j) {
        0qQ.A0B(spannableStringBuilder, 0);
        0qQ.A0B(r6, 3);
        spannableStringBuilder.append(" ");
        int length = spannableStringBuilder.length();
        Resources resources = context.getResources();
        0qQ.A07(resources);
        spannableStringBuilder.append(1G0.A09(resources, (double) j));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(r6.A05), length, spannableStringBuilder.length(), 33);
    }

    public static final void A08(Context context, SpannableStringBuilder spannableStringBuilder, C244003aU r7, AnonymousClass3ZU r8, int i, int i2) {
        if (spannableStringBuilder.length() > 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 0);
        }
        C52819GdB gdB = new C52819GdB(r7, r8, i);
        Drawable drawable = context.getDrawable(R.drawable.instagram_gen_ai_pano_filled_24);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            if (mutate != null) {
                mutate.setColorFilter(AnonymousClass37O.A00(i));
            }
            drawable.setBounds(0, 0, i2, i2);
        }
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append(" ");
        if (drawable != null) {
            int i3 = length2 + 1;
            spannableStringBuilder.setSpan(new C2606346l(drawable), length2, i3, 33);
            spannableStringBuilder.append(002.A0D(context.getString(2131971517), ' '));
            spannableStringBuilder.setSpan(gdB, i3, spannableStringBuilder.length(), 33);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A09(Context context, SpannableStringBuilder spannableStringBuilder, C244003aU r7, AnonymousClass3ZU r8, String str, int i) {
        if (spannableStringBuilder.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 0);
        }
        Drawable drawable = context.getDrawable(R.drawable.instagram_glasses_pano_outline_12);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            if (mutate != null) {
                mutate.setColorFilter(AnonymousClass37O.A00(i));
            }
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        C52821GdD gdD = new C52821GdD(r7, r8, i);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append(" ");
        if (drawable != null) {
            C2606346l r0 = new C2606346l(drawable);
            int i2 = length2 + 1;
            spannableStringBuilder.setSpan(r0, length2, i2, 33);
            spannableStringBuilder.append(" ");
            spannableStringBuilder.append(str);
            spannableStringBuilder.setSpan(gdD, i2, spannableStringBuilder.length(), 33);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A0A(Context context, SpannableStringBuilder spannableStringBuilder, C244003aU r8, String str, int i, int i2) {
        if (spannableStringBuilder.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 0);
        }
        Drawable drawable = context.getDrawable(R.drawable.instagram_app_horizon_pano_filled_24);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            if (mutate != null) {
                mutate.setColorFilter(AnonymousClass37O.A00(i));
            }
            drawable.setBounds(0, 0, i2, i2);
        }
        C52818GdA gdA = new C52818GdA(r8, i);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append(" ");
        if (drawable != null) {
            C2606346l r0 = new C2606346l(drawable);
            int i3 = length2 + 1;
            spannableStringBuilder.setSpan(r0, length2, i3, 33);
            spannableStringBuilder.append(" ");
            if (str == null) {
                str = context.getString(2131966452);
                0qQ.A07(str);
            }
            spannableStringBuilder.append(str);
            spannableStringBuilder.setSpan(gdA, i3, spannableStringBuilder.length(), 33);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A0B(SpannableStringBuilder spannableStringBuilder, C242813Wa r11, AnonymousClass3ZT r12, Integer num, String str, int i, int i2, boolean z) {
        Integer num2 = num;
        0qQ.A0B(num, 2);
        AnonymousClass3ZT r5 = r12;
        0qQ.A0B(r12, 7);
        int i3 = i;
        if (spannableStringBuilder.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 0);
        }
        AnonymousClass50V r3 = new AnonymousClass50V(r11, r5, num2, i2, i3, z);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append(str);
        spannableStringBuilder.setSpan(r3, length2, spannableStringBuilder.length(), 33);
    }

    public static final void A0C(C381829cQ r3, C242813Wa r4, AnonymousClass3W1 r5) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r3, 1);
        0qQ.A0B(r5, 2);
        r4.D2f(((AnonymousClass3ZT) r3.A03).A00, r5, (Hashtag) r3.A01, r5.getPosition());
    }
}
