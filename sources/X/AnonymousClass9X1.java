package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.9X1  reason: invalid class name */
public final class AnonymousClass9X1 extends Drawable implements C300645xY, C369758vH {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final UserSession A05;
    public final C306386Ly A06;
    public final C306386Ly A07;
    public final C306386Ly A08;
    public final C3499082j A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Drawable A0E;
    public final C68638NQr A0F;
    public final List A0G;

    public AnonymousClass9X1(Context context, UserSession userSession, C3499082j r12) {
        SimpleImageUrl A002;
        this.A04 = context;
        this.A05 = userSession;
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A0G = A1C;
        this.A09 = r12;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        this.A0B = dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.achievements_only_you_bottom_margin);
        this.A0C = dimensionPixelSize2;
        this.A02 = AnonymousClass7TE.A0H(resources);
        this.A03 = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A0D = resources.getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
        this.A01 = resources.getDimensionPixelSize(R.dimen.challenge_sticker_button_text_size);
        this.A0A = resources.getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
        this.A00 = resources.getDimensionPixelSize(R.dimen.challenge_sticker_v2_facepile_text_size);
        int i = dimensionPixelSize - (dimensionPixelSize2 * 2);
        C363208jL r6 = new C363208jL(context, AnonymousClass7TE.A01(resources, R.dimen.account_recs_header_image_margin), R.color.chat_sticker_button_divider_color, 80);
        this.A0E = r6;
        C3499082j r0 = this.A09;
        AE3 ae3 = r0.A03;
        0qQ.A07(ae3);
        AE3 ae32 = r0.A02;
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        SimpleImageUrl A003 = ae3.A00();
        if (A003 != null) {
            A1C2.add(A003);
        }
        if (!(ae32 == null || ae3.equals(ae32) || (A002 = ae32.A00()) == null)) {
            A1C2.add(A002);
        }
        C68638NQr nQr = new C68638NQr(this.A04, A1C2);
        this.A0F = nQr;
        C306386Ly A0s = AnonymousClass7TE.A0s(context, i);
        this.A08 = A0s;
        C306386Ly A0s2 = AnonymousClass7TE.A0s(context, i);
        this.A07 = A0s2;
        C306386Ly A0s3 = AnonymousClass7TE.A0s(context, i);
        this.A06 = A0s3;
        Collections.addAll(0u4.A01(A1C), new Drawable[]{nQr, A0s, A0s2, A0s3, r6});
        Context context2 = this.A04;
        C306386Ly r4 = this.A08;
        float f = (float) this.A03;
        float f2 = (float) this.A02;
        AnonymousClass7TG.A1N(context2, r4);
        r4.A0I(AnonymousClass7TG.A0O(context2));
        AJB.A0B(r4, f, 0.0f, f2);
        AnonymousClass7TG.A0y(r4.A0Z, r4, R.attr.igds_color_text_on_white);
        r4.A0M(this.A09.A09);
        C306386Ly r62 = this.A07;
        r62.A0C(0.0f, (float) this.A02);
        r62.A0A((float) this.A01);
        r62.A0F(-6710887);
        String str = "";
        if (182.A06(0Tu.A06, this.A05, 36318449613412481L)) {
            String str2 = this.A09.A06;
            if (str2 != null) {
                Locale locale = Locale.getDefault();
                0qQ.A07(locale);
                String lowerCase = str2.toLowerCase(locale);
                0qQ.A07(lowerCase);
                str = C296675qS.A00(lowerCase);
            }
            r62.A0M(str);
        } else {
            C3499082j r1 = this.A09;
            String A012 = r1.A03.A01();
            AE3 ae33 = r1.A02;
            r62.A0M(0bC.A01(this.A04.getResources(), new String[]{A012, ae33 != null ? ae33.A01() : str}, 2131962842));
        }
        C306386Ly r63 = this.A06;
        r63.A0J(Typeface.SANS_SERIF, 1);
        Context context3 = r63.A0Z;
        r63.A0M(context3.getString(182.A06(0Tu.A05, this.A05, 36316624252441115L) ? 2131962838 : 2131962837));
        r63.A0A((float) this.A00);
        AnonymousClass7TE.A1O(context3, r63, 2Yu.A0D(context3));
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Iterator it = this.A0G.iterator();
        while (it.hasNext()) {
            AnonymousClass7TE.A0Z(it).draw(canvas);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final String AsL() {
        return this.A09.A05;
    }

    public final NewFundraiserInfo BVw() {
        return this.A09.A01;
    }

    public final String C4F() {
        return 002.A0R("standalone_fundraiser_without_cover_photo_variant_", this.A09.A07);
    }

    public final String getFundraiserId() {
        return this.A09.A07;
    }

    public final int getIntrinsicHeight() {
        int i = this.A0D;
        C306386Ly r1 = this.A08;
        int i2 = this.A02;
        int i3 = ((i + r1.A06) - r1.A08) - i2;
        return this.A0F.A01 + i3 + (this.A07.A06 - i2) + this.A0C + this.A0A;
    }

    public final void setAlpha(int i) {
        Iterator it = this.A0G.iterator();
        while (it.hasNext()) {
            AnonymousClass7TE.A0Z(it).setAlpha(i);
        }
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i;
        super.setBounds(i5, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float f3 = ((float) this.A0B) / 2.0f;
        float intrinsicHeight = ((float) getIntrinsicHeight()) / 2.0f;
        float f4 = f2 - intrinsicHeight;
        float f5 = f2 + intrinsicHeight;
        float f6 = (float) this.A0A;
        float f7 = f5 - f6;
        float f8 = (f6 / 2.0f) + f7;
        C68638NQr nQr = this.A0F;
        int i6 = nQr.A01;
        C306386Ly r8 = this.A08;
        int i7 = r8.A0A;
        int i8 = r8.A06;
        int i9 = r8.A08;
        int i10 = this.A0D;
        int i11 = ((i10 + i8) - i9) - this.A02;
        C306386Ly r4 = this.A07;
        int i12 = r4.A0A;
        int i13 = r4.A06;
        C306386Ly r3 = this.A06;
        int i14 = r3.A0A;
        int i15 = r3.A06;
        int i16 = (int) (f - f3);
        int i17 = (int) (f3 + f);
        nQr.setBounds(i16, (int) f4, i17, (int) f5);
        float f9 = ((float) i7) / 2.0f;
        float f10 = f4 + ((float) i6);
        float f11 = (float) i9;
        float f12 = f10 + ((float) i11);
        r8.setBounds((int) (f - f9), (int) ((((float) i10) + f10) - f11), (int) (f9 + f), (int) (f11 + f12));
        float f13 = ((float) i12) / 2.0f;
        r4.setBounds((int) (f - f13), (int) f12, (int) (f13 + f), (int) (f12 + ((float) i13)));
        int i18 = (int) f7;
        this.A0E.setBounds(i16, i18, i17, i18);
        float f14 = ((float) i14) / 2.0f;
        float f15 = ((float) i15) / 2.0f;
        r3.setBounds((int) (f - f14), (int) (f8 - f15), (int) (f + f14), (int) (f8 + f15));
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        invalidateSelf();
    }
}
