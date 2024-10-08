package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;
import java.util.Locale;

/* renamed from: X.9mI  reason: invalid class name and case insensitive filesystem */
public final class C387489mI extends AA8 {
    public int A00;
    public AnonymousClass87G A01;
    public final AnonymousClass87H A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final UserSession A07;
    public final TargetViewSizeProvider A08;
    public final String A09;

    public static void A00(AnonymousClass57C r33, C387489mI r34) {
        String str;
        C387489mI r0 = r34;
        AnonymousClass87G r1 = r0.A01;
        r1.getClass();
        List list = r1.A0I;
        list.getClass();
        C272024jy r6 = (C272024jy) list.get(r0.A00);
        String str2 = r6.A0D;
        if (TextUtils.isEmpty(str2)) {
            str = "";
        } else {
            str = str2;
        }
        C39711A6c a6c = new C39711A6c(str, (float) r0.A03, AnonymousClass81W.A00(r0.A08) - (r0.A05 * 2), r0.A04);
        List A012 = AnonymousClass9OX.A01(r6);
        C272014jx r2 = (C272014jx) A012.get(0);
        C272014jx r7 = (C272014jx) A012.get(1);
        Context context = r0.A06;
        String A022 = C18687Vwl.A02(r2);
        String A023 = C18687Vwl.A02(r7);
        float A002 = 0nA.A00(context, C18687Vwl.A00(r2));
        float A003 = 0nA.A00(context, C18687Vwl.A00(r7));
        String upperCase = A022.toUpperCase(Locale.getDefault());
        String upperCase2 = A023.toUpperCase(Locale.getDefault());
        int A052 = AnonymousClass7TG.A05(context);
        int A042 = AnonymousClass7TG.A04(context);
        int A053 = AnonymousClass7TG.A05(context);
        int A043 = AnonymousClass7TG.A04(context);
        int A072 = AnonymousClass7TG.A07(context);
        int[] A1b = AnonymousClass7TG.A1b(context, R.attr.igds_color_creation_tools_blue);
        int[] A1b2 = AnonymousClass7TG.A1b(context, R.attr.igds_color_creation_tools_pink);
        int[] iArr = A1b;
        int[] iArr2 = A1b2;
        C389529pm r72 = new C389529pm(context, AnonymousClass7TG.A0O(context), a6c, upperCase, (String) null, upperCase2, A1b, iArr, A1b2, iArr2, A002, A003, A052, AnonymousClass7TE.A09(context), A053, A042, A043, A072, context.getColor(R.color.grey_9), context.getColor(R.color.direct_dark_mode_composer_hint_text_color), false, false, false, true, false);
        if (TextUtils.isEmpty(str2)) {
            str2 = r0.A09;
        }
        r72.A0B(str2);
        r0.A02.A0A(r72, r33, C317876nz.A1E);
    }

    public C387489mI(Context context, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass87H r6) {
        this.A02 = r6;
        this.A06 = context;
        this.A07 = userSession;
        this.A08 = targetViewSizeProvider;
        this.A09 = context.getString(2131969563);
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A04 = AnonymousClass7TE.A0F(context.getResources());
        this.A05 = AnonymousClass7TG.A02(context);
    }
}
