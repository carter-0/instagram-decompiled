package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

public final class KWF extends C299875vz implements C354808Nl, C268714ds, C300645xY {
    public C339167jA A00;
    public KHj A01;
    public final int A02;
    public final AnonymousClass6M4 A03;
    public final PromptStickerModel A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Context A0B;
    public final UserSession A0C;
    public final C61678KHl A0D;
    public final C339177jB A0E;
    public final C306386Ly A0F;
    public final C363208jL A0G;
    public final String A0H;

    public KWF(Context context, UserSession userSession, PromptStickerModel promptStickerModel, String str) {
        int i;
        PromptStickerModel promptStickerModel2 = promptStickerModel;
        0qQ.A0B(promptStickerModel2, 4);
        Context context2 = context;
        this.A0B = context2;
        UserSession userSession2 = userSession;
        this.A0C = userSession2;
        String str2 = str;
        this.A0H = str2;
        this.A04 = promptStickerModel2;
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height);
        this.A02 = dimensionPixelSize;
        int A062 = AnonymousClass7TG.A06(context2);
        this.A09 = DbY.A01(context2);
        this.A0A = AnonymousClass7TG.A03(context2);
        this.A07 = AnonymousClass7TG.A02(context2);
        this.A08 = C51972G9s.A08(context2);
        KWK kwk = new KWK(context2, this.A04, str2, false);
        kwk.setCallback(this);
        this.A01 = kwk;
        int A002 = this.A04.A00();
        this.A05 = A002;
        C339167jA r20 = new C339167jA(context2, A002, R.dimen.abc_select_dialog_padding_start_material, true, false, true);
        r20.setCallback(this);
        this.A00 = r20;
        C306386Ly A0P = AnonymousClass7TF.A0P(context2, A062, dimensionPixelSize);
        Integer num = AnonymousClass05K.A0C;
        Context context3 = A0P.A0Z;
        0qQ.A07(context3);
        C339207jE.A00(context3, AnonymousClass0qo.A00(context3).A02(0qm.A11), A0P, num);
        A0P.A0A((float) AnonymousClass7TF.A02(context3, R.dimen.abc_select_dialog_padding_start_material));
        TypedValue typedValue = new TypedValue();
        context3.getResources().getValue(R.dimen.accent_edge_thickness, typedValue, true);
        A0P.A0B(typedValue.getFloat(), 1.0f);
        int i2 = C63560Kz9.A00;
        String text = this.A04.A00.getText();
        text = text == null ? "" : text;
        int i3 = C63560Kz9.A01;
        int i4 = C63560Kz9.A00;
        SpannableString spannableString = new SpannableString(text);
        String A0j = AnonymousClass7TF.A0j(text);
        if (00p.A0i(A0j, "me", false)) {
            i = 00l.A07(A0j, "me", A0j.length() - 1);
        } else {
            i = -1;
        }
        if (i == -1) {
            spannableString.setSpan(new ForegroundColorSpan(i3), 0, text.length(), 33);
        } else {
            spannableString.setSpan(new ForegroundColorSpan(i3), 0, i, 33);
            spannableString.setSpan(new ForegroundColorSpan(i4), i, text.length(), 33);
        }
        A0P.A0L(spannableString);
        A0P.A0F(i3);
        A0P.A0G(3, context3.getString(2131961564));
        A0P.setCallback(this);
        this.A0F = A0P;
        this.A0E = new C339177jB(context2, this.A04, (Integer) null, str2, 0, 0, 248);
        this.A0G = LJC.A01(context2, this, A002);
        C61678KHl kHl = new C61678KHl(context2, this.A04.A01(context2));
        kHl.setCallback(this);
        this.A0D = kHl;
        this.A03 = C339157j9.A01(context2, userSession2, this).A00();
        this.A06 = this.A01.getIntrinsicHeight();
    }

    public final void EVv(float f) {
    }

    public final void FK8(Integer num) {
        0qQ.A0B(num, 0);
        boolean A1W = AnonymousClass7TF.A1W(num, AnonymousClass05K.A01);
        this.A03.A00();
        Context context = this.A0B;
        C339167jA r4 = new C339167jA(context, this.A05, R.dimen.account_discovery_bottom_gap, !A1W, false, true);
        r4.setCallback(this);
        this.A00 = r4;
        KWK kwk = new KWK(context, this.A04, this.A0H, A1W);
        kwk.setCallback(this);
        this.A01 = kwk;
        JTU.A0j(this);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A00.draw(canvas);
        this.A0F.draw(canvas);
        this.A0E.draw(canvas);
        if (this.A04.A01 == 0) {
            this.A0G.draw(canvas);
            this.A0D.draw(canvas);
            this.A03.draw(canvas);
        }
        this.A01.draw(canvas);
    }

    public final List A07() {
        return 0sr.A1P(new Drawable[]{this.A00, this.A0F, this.A0E, this.A0G, this.A0D, this.A01});
    }

    public final Integer A08() {
        return AnonymousClass05K.A0u;
    }

    public final Integer Ail() {
        return Integer.valueOf(this.A0D.A00.A06 + (this.A08 * 2));
    }

    public final /* synthetic */ Integer Aiy() {
        return null;
    }

    public final PromptStickerModel BTZ() {
        return this.A04;
    }

    public final C2802350v BzV() {
        return this.A04;
    }

    public final String C4F() {
        if (this.A04.A0H()) {
            return C273654mx.A00(71);
        }
        return "prompt_sticker_bundle_id";
    }

    public final /* synthetic */ void Euc() {
        this.A03.A01();
    }

    public final int getIntrinsicHeight() {
        return this.A0F.A06 + this.A0E.A01 + this.A0A + this.A0G.getIntrinsicHeight() + this.A0D.A00.A06 + this.A09 + this.A07 + (this.A08 * 2) + this.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A02;
    }

    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
        this.A0F.setAlpha(i);
        this.A0E.setAlpha(i);
        this.A0G.setAlpha(i);
        this.A0D.setAlpha(i);
        this.A01.setAlpha(i);
        if (i == 0) {
            this.A03.A00();
        }
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float f3 = ((float) this.A02) / 2.0f;
        float intrinsicHeight = f2 - (((float) getIntrinsicHeight()) / 2.0f);
        int i9 = (int) (f - f3);
        int i10 = (int) (f3 + f);
        this.A00.setBounds(i9, (int) (((float) this.A01.A08()) + intrinsicHeight), i10, (int) ((((float) getIntrinsicHeight()) / 2.0f) + f2));
        KHj kHj = this.A01;
        kHj.setBounds(i9, (int) intrinsicHeight, i10, (int) (intrinsicHeight + ((float) kHj.getIntrinsicHeight())));
        int A062 = JTO.A06(this.A01);
        int i11 = this.A04.A01;
        C306386Ly r6 = this.A0F;
        if (i11 != 0) {
            int i12 = r6.A06;
            int i13 = i12 + this.A09;
            float f4 = ((float) r6.A0A) / 2.0f;
            i5 = (int) (f - f4);
            float f5 = f2 - (((float) i13) / 2.0f);
            i6 = (int) f5;
            i7 = (int) (f4 + f);
            i8 = (int) (f5 + ((float) i12));
        } else {
            float f6 = ((float) r6.A0A) / 2.0f;
            i5 = (int) (f - f6);
            i6 = this.A09 + A062;
            i7 = (int) (f6 + f);
            i8 = r6.A06 + i6;
        }
        r6.setBounds(i5, i6, i7, i8);
        int A063 = JTO.A06(r6);
        C339177jB r62 = this.A0E;
        int A0A2 = JTR.A0A(r62, f);
        int i14 = this.A0A + A063;
        r62.setBounds(A0A2, i14, (int) ((((float) r62.getIntrinsicWidth()) / 2.0f) + f), r62.A01 + i14);
        int A064 = JTO.A06(r62);
        C363208jL r1 = this.A0G;
        int i15 = A064 + this.A07;
        r1.setBounds(i9, i15, i10, r1.getIntrinsicHeight() + i15);
        C61678KHl kHl = this.A0D;
        int A0A3 = JTR.A0A(kHl, f);
        int A065 = JTO.A06(r1);
        int i16 = this.A08;
        kHl.setBounds(A0A3, A065 + i16, (int) (f + (((float) kHl.getIntrinsicWidth()) / 2.0f)), JTO.A06(r1) + i16 + kHl.A00.A06);
    }
}
