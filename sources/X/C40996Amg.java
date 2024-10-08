package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.instagram.android.R;
import com.instagram.api.schemas.StoryPollColorType;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Amg  reason: case insensitive filesystem */
public final /* synthetic */ class C40996Amg implements Runnable {
    public final /* synthetic */ AnonymousClass8BA A00;
    public final /* synthetic */ C3498382a A01;

    public /* synthetic */ C40996Amg(AnonymousClass8BA r1, C3498382a r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C369648v6 r13;
        C14272Tsv tsv;
        AnonymousClass8BA r1 = this.A00;
        C3498382a r0 = this.A01;
        UserSession userSession = r1.A0v;
        InteractiveDrawableContainer interactiveDrawableContainer = r1.A1s;
        Context context = interactiveDrawableContainer.getContext();
        C272024jy r12 = r0.A06;
        int[] A04 = C297825sP.A04(userSession, r12, false);
        if (AnonymousClass9OX.A02(r12)) {
            0qQ.A0B(r12, 0);
            StoryPollColorType Aoy = r12.Aoy();
            if (Aoy == null) {
                Aoy = StoryPollColorType.EMPTY;
            }
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C272014jx r5 : AnonymousClass9OX.A01(r12)) {
                A1C.add(new C272004jw((Float) null, Integer.valueOf(C18687Vwl.A01(r5)), C18687Vwl.A02(r5)));
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (int A1M : A04) {
                AnonymousClass7TF.A1M(A1C2, A1M);
            }
            String A002 = AnonymousClass9OX.A00(r12);
            String str = r12.A0D;
            Integer num = r12.A0A;
            boolean A1X = AnonymousClass7TG.A1X(r12.CEx());
            String str2 = Aoy.A00;
            switch (Aoy.ordinal()) {
                case 2:
                    tsv = C14272Tsv.SOLID_BLUE_REFRESH;
                    break;
                case 4:
                    tsv = C14272Tsv.SOLID_GREEN_REFRESH;
                    break;
                case 5:
                    tsv = C14272Tsv.SOLID_LAVENDER_REFRESH;
                    break;
                case 6:
                    tsv = C14272Tsv.SOLID_ORANGE_REFRESH;
                    break;
                case 7:
                    tsv = C14272Tsv.SOLID_PINK_REFRESH;
                    break;
                case 8:
                    tsv = C14272Tsv.SOLID_PURPLE_REFRESH;
                    break;
                default:
                    tsv = C14272Tsv.SOLID_BLACK;
                    break;
            }
            r13 = new C369648v6(context, new C19474WaM(tsv, num, A002, str, str2, A1C, A1C2, A1X, true));
        } else {
            List A012 = AnonymousClass9OX.A01(r12);
            C272014jx r4 = (C272014jx) A012.get(0);
            C272014jx r9 = (C272014jx) A012.get(1);
            String A02 = C18687Vwl.A02(r4);
            String A022 = C18687Vwl.A02(r9);
            float A003 = 0nA.A00(context, C18687Vwl.A00(r4));
            float A004 = 0nA.A00(context, C18687Vwl.A00(r9));
            String upperCase = A02.toUpperCase(Locale.getDefault());
            String upperCase2 = A022.toUpperCase(Locale.getDefault());
            int A05 = AnonymousClass7TG.A05(context);
            int A042 = AnonymousClass7TG.A04(context);
            int A052 = AnonymousClass7TG.A05(context);
            int A043 = AnonymousClass7TG.A04(context);
            int A07 = AnonymousClass7TG.A07(context);
            int[] A1b = AnonymousClass7TG.A1b(context, R.attr.igds_color_creation_tools_blue);
            int[] A1b2 = AnonymousClass7TG.A1b(context, R.attr.igds_color_creation_tools_pink);
            int[] iArr = A1b2;
            int[] iArr2 = A1b;
            Typeface A0O = AnonymousClass7TG.A0O(context);
            int color = context.getColor(R.color.grey_9);
            int A09 = AnonymousClass7TE.A09(context);
            int color2 = context.getColor(R.color.direct_dark_mode_composer_hint_text_color);
            String A005 = AnonymousClass9OX.A00(r12);
            0qQ.A0B(r12, 0);
            boolean A1X2 = AnonymousClass7TG.A1X(r12.B60());
            if (r0.A07) {
                Resources resources = context.getResources();
                A1b2 = AnonymousClass6LW.A03;
                iArr2 = A1b2;
                A05 = resources.getDimensionPixelSize(R.dimen.fb_polling_background_corner_radius);
                A0O = AnonymousClass0qo.A00(context).A02(0qm.A0I);
                color = context.getColor(R.color.fb_polling_sticker_result_color);
                A042 = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
                A043 = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
                A07 = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_left);
                color2 = context.getColor(R.color.fb_polling_sticker_result_color);
            }
            C389529pm r132 = new C389529pm(context, A0O, (C39711A6c) null, upperCase, A005, upperCase2, iArr2, A1b, A1b2, iArr, A003, A004, A05, A09, A052, A042, A043, A07, color, color2, A1X2, false, false, false, true);
            r132.A0C(A04);
            r132.A0i.A08(2.0d, true);
            r13 = r132;
        }
        Rect A0W = AnonymousClass7TE.A0W();
        float f = r0.A04;
        float f2 = r0.A05;
        float f3 = r0.A03;
        float f4 = r0.A00;
        int width = interactiveDrawableContainer.getWidth();
        int height = interactiveDrawableContainer.getHeight();
        float f5 = r0.A02;
        C306756Nj[] r14 = C306746Ni.A05;
        float f6 = (float) width;
        float f7 = f6 / f5;
        int A053 = AnonymousClass7TE.A05(f3, f6);
        int A054 = AnonymousClass7TE.A05(f4, f7);
        int A055 = AnonymousClass7TE.A05(f, f6);
        int round = Math.round((f2 * f7) + ((((float) height) - f7) / 2.0f));
        int round2 = Math.round(((float) (-A053)) / 2.0f);
        int round3 = Math.round(((float) (-A054)) / 2.0f);
        A0W.set(round2, round3, A053 + round2, A054 + round3);
        A0W.offset(A055, round);
        int intrinsicWidth = r13.getIntrinsicWidth();
        int intrinsicHeight = r13.getIntrinsicHeight();
        C39890ADo aDo = new C39890ADo();
        aDo.A06 = new C16338Ut8(8388659, 0.0f, 0.0f);
        float f8 = (float) intrinsicWidth;
        aDo.A01(A0W.exactCenterX() - (f8 / 2.0f), A0W.exactCenterY() - (((float) intrinsicHeight) / 2.0f));
        aDo.A04 = ((float) A0W.width()) / f8;
        aDo.A03 = r0.A01 * 360.0f;
        aDo.A0R = false;
        aDo.A0Q = false;
        interactiveDrawableContainer.A0K(r13, new C310416b1(aDo), false, false, false);
    }
}
