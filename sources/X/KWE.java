package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

public final class KWE extends C299875vz implements C354808Nl, C268714ds {
    public C339167jA A00;
    public final int A01;
    public final AnonymousClass6M4 A02;
    public final PromptStickerModel A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final C61677KHk A09;
    public final KHj A0A;
    public final C306386Ly A0B;
    public final C363208jL A0C;

    public KWE(Context context, UserSession userSession, PromptStickerModel promptStickerModel) {
        0qQ.A0B(promptStickerModel, 3);
        this.A03 = promptStickerModel;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.imagine_sticker_width);
        this.A01 = dimensionPixelSize;
        this.A04 = context.getResources().getDimensionPixelSize(R.dimen.audio_translations_language_list_cell_row_height);
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding);
        int A062 = AnonymousClass7TG.A06(context);
        this.A08 = DbY.A01(context);
        this.A06 = AnonymousClass7TG.A06(context);
        this.A07 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        KWJ kwj = new KWJ(context);
        kwj.setCallback(this);
        this.A0A = kwj;
        int A002 = this.A03.A00();
        C339167jA r4 = new C339167jA(context, A002, R.dimen.account_discovery_bottom_gap, true, false, true);
        r4.setCallback(this);
        this.A00 = r4;
        C306386Ly A0P = AnonymousClass7TF.A0P(context, A062, dimensionPixelSize);
        C339207jE.A00(context, AnonymousClass0qo.A00(context).A02(0qm.A11), A0P, AnonymousClass05K.A0C);
        A0P.A0F(AnonymousClass7TF.A03(context, R.attr.igds_color_text_on_white));
        A0P.A0A(AnonymousClass7TE.A01(context.getResources(), R.dimen.ai_agent_share_profile_sticker_padding));
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.abc_button_inset_vertical_material, typedValue, true);
        A0P.A0B(typedValue.getFloat(), 1.0f);
        JTU.A0f(context, this, A0P, 2131964144, 3);
        this.A0B = A0P;
        this.A0C = LJC.A01(context, this, A002);
        C61677KHk kHk = new C61677KHk(context);
        kHk.setCallback(this);
        this.A09 = kHk;
        this.A02 = C339157j9.A01(context, userSession, this).A00();
    }

    public final void EVv(float f) {
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A00.draw(canvas);
        this.A0B.draw(canvas);
        this.A0C.draw(canvas);
        this.A09.draw(canvas);
        this.A02.draw(canvas);
        this.A0A.draw(canvas);
    }

    public final List A07() {
        Drawable[] drawableArr = {this.A00, this.A0B, this.A0C, this.A09, this.A0A};
        0qQ.A0B(drawableArr, 0);
        return 03t.A0I(drawableArr);
    }

    public final Integer A08() {
        return AnonymousClass05K.A0u;
    }

    public final /* synthetic */ Integer Aiy() {
        return null;
    }

    public final PromptStickerModel BTZ() {
        return this.A03;
    }

    public final C2802350v BzV() {
        return this.A03;
    }

    public final /* synthetic */ void Euc() {
        this.A02.A01();
    }

    public final void FK8(Integer num) {
        this.A02.A00();
        JTU.A0j(this);
    }

    public final int getIntrinsicHeight() {
        return this.A04 + this.A05 + this.A0A.A08();
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
        this.A0B.setAlpha(i);
        this.A0C.setAlpha(i);
        this.A09.setAlpha(i);
        this.A0A.setAlpha(i);
        if (i == 0) {
            this.A02.A00();
        }
    }

    public final Integer Ail() {
        return Integer.valueOf(getIntrinsicHeight());
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float f3 = ((float) this.A01) / 2.0f;
        float intrinsicHeight = ((float) getIntrinsicHeight()) / 2.0f;
        float f4 = f2 - intrinsicHeight;
        KHj kHj = this.A0A;
        int i5 = (int) (f - f3);
        int i6 = (int) (f3 + f);
        this.A00.setBounds(i5, (int) (((float) kHj.A08()) + f4), i6, (int) (f2 + intrinsicHeight));
        kHj.setBounds(i5, (int) f4, i6, (int) (f4 + ((float) kHj.getIntrinsicHeight())));
        C306386Ly r9 = this.A0B;
        int A062 = JTO.A06(kHj);
        int i7 = this.A08;
        r9.setBounds((int) (f - (((float) r9.A0A) / 2.0f)), A062 + i7, (int) ((((float) r9.A0A) / 2.0f) + f), JTO.A06(kHj) + i7 + r9.A06);
        C363208jL r8 = this.A0C;
        int A063 = JTO.A06(r9);
        int i8 = this.A06;
        r8.setBounds(i5, A063 + i8, i6, JTO.A06(r9) + i8 + r8.getIntrinsicHeight());
        C61677KHk kHk = this.A09;
        C306386Ly r6 = kHk.A00;
        int A064 = JTO.A06(r8);
        int i9 = this.A07;
        kHk.setBounds((int) (f - (((float) r6.A0A) / 2.0f)), A064 + i9, (int) (f + (((float) r6.A0A) / 2.0f)), JTO.A06(r8) + i9 + r6.A06);
    }
}
