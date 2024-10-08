package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.android.R;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* renamed from: X.9q0  reason: invalid class name and case insensitive filesystem */
public final class C389669q0 extends C299875vz implements C354808Nl, C252203oj, C268714ds, C300645xY {
    public boolean A00;
    public final int A01;
    public final GradientDrawable A02;
    public final AnonymousClass6M4 A03;
    public final PromptStickerModel A04;
    public final C389619pv A05;
    public final long A06;
    public final Context A07;
    public final Resources A08;
    public final boolean A09;

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final /* synthetic */ void EVv(float f) {
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A09) {
            canvas.save();
            float currentTimeMillis = (float) (System.currentTimeMillis() - this.A06);
            float f = 400.0f - 0.0f;
            float f2 = 1.0f - 0.0f;
            float f3 = 0.0f;
            if (f != 0.0f) {
                f3 = (currentTimeMillis - 0.0f) / f;
            }
            float f4 = (f3 * f2) + 0.0f;
            float A022 = 0mi.A02(f4, 0.0f, 1.0f, 0.0f, 1.0f);
            canvas.translate(0.0f, 0mi.A02(f4, 0.0f, 1.0f, 200.0f, 0.0f));
            canvas.scale(A022, A022, getBounds().exactCenterX(), getBounds().exactCenterY());
            int A023 = (int) 0mi.A02(f4, 0.0f, 1.0f, 0.0f, 255.0f);
            C389619pv r0 = this.A05;
            r0.setAlpha(A023);
            r0.draw(canvas);
            canvas.restore();
            if (this.A00) {
                this.A02.draw(canvas);
            }
            if (f4 >= 1.0f) {
                this.A03.draw(canvas);
            } else {
                this.A02.setAlpha(A023);
            }
            invalidateSelf();
            return;
        }
        this.A05.draw(canvas);
        this.A03.draw(canvas);
    }

    public final List A07() {
        return 0sr.A1M(new Drawable[]{this.A05});
    }

    public final String A09() {
        String A002 = this.A04.BkW().A00();
        0qQ.A07(A002);
        return A002;
    }

    public final Integer Ail() {
        C389619pv r2 = this.A05;
        return Integer.valueOf(r2.A04.A00 + (r2.A02 * 2));
    }

    public final Integer Aiy() {
        return Integer.valueOf(this.A05.A03);
    }

    public final PromptStickerModel BTZ() {
        return this.A04;
    }

    public final C2802350v BzV() {
        return this.A04;
    }

    public final String C4F() {
        return this.A05.A09();
    }

    public final void Euc() {
        PromptStickerModel promptStickerModel = this.A04;
        if (!promptStickerModel.A0L() && promptStickerModel.A03() != StoryPromptType.MAGIC_MOD_ADD_YOURS_WITH_BACKDROP) {
            this.A03.A01();
            this.A00 = true;
        }
    }

    public final void FK8(Integer num) {
        this.A03.A00();
        setBounds(AnonymousClass7TE.A0J(this), getBounds().top, getBounds().right, getBounds().bottom);
        invalidateSelf();
    }

    public final int getIntrinsicHeight() {
        return this.A05.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A05.A03;
    }

    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
        if (i == 0) {
            this.A03.A00();
        }
    }

    public C389669q0(Context context, UserSession userSession, PromptStickerModel promptStickerModel, boolean z) {
        Typeface typeface;
        long j;
        this.A07 = context;
        this.A04 = promptStickerModel;
        this.A09 = z;
        Resources resources = context.getResources();
        this.A08 = resources;
        this.A05 = new C389619pv(context, userSession, this.A04);
        AnonymousClass6M3 r4 = new AnonymousClass6M3(context, this, resources.getDimensionPixelSize(R.dimen.direct_multi_media_message_fixed_height));
        if (0oh.A08()) {
            typeface = 0oh.A02(context);
        } else {
            typeface = null;
        }
        r4.A04 = typeface;
        r4.A01(2131965778);
        r4.A02(R.dimen.abc_text_size_menu_header_material);
        r4.A02 = AnonymousClass7TF.A02(r4.A09, R.dimen.ai_agent_share_profile_sticker_padding);
        if (z) {
            j = Float.valueOf(400.0f);
        } else {
            j = 0L;
        }
        r4.A03 = AnonymousClass7TE.A0R(j) + LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
        r4.A05 = new C321166tg(this);
        this.A03 = r4.A00();
        this.A02 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{context.getColor(R.color.fds_transparent), AnonymousClass7TF.A03(context, R.attr.igds_color_legibility_gradient)});
        this.A06 = System.currentTimeMillis();
        this.A01 = -this.A03.A05.A06;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        C389619pv r1 = this.A05;
        r1.setBounds(i, i2, i3, i4);
        this.A02.setBounds(0, r1.getBounds().top - 32, AnonymousClass8XF.A01(this.A07), r1.getBounds().bottom + this.A03.A05.A06);
    }

    public final void DmE(2cs r1) {
        invalidateSelf();
    }
}
