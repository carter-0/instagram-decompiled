package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* renamed from: X.JZg  reason: case insensitive filesystem */
public final class C59812JZg extends C299875vz implements C354808Nl, C268714ds, C300645xY {
    public boolean A00;
    public C339167jA A01;
    public C339177jB A02;
    public final int A03;
    public final int A04;
    public final AnonymousClass6M4 A05;
    public final PromptStickerModel A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Context A0E;
    public final C59813JZh A0F;
    public final KHj A0G;
    public final C306386Ly A0H;
    public final C363208jL A0I;
    public final Integer A0J;
    public final String A0K;
    public final boolean A0L;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x012f, code lost:
        if (r3.A06.A00.B3f().size() > 1) goto L_0x0131;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C59812JZg(android.content.Context r22, com.instagram.common.session.UserSession r23, com.instagram.reels.prompt.model.PromptStickerModel r24, java.lang.String r25) {
        /*
            r21 = this;
            r4 = 1
            r0 = 4
            r1 = r24
            X.0qQ.A0B(r1, r0)
            r3 = r21
            r3.<init>()
            r8 = r22
            r3.A0E = r8
            r11 = r25
            r3.A0K = r11
            r3.A06 = r1
            boolean r2 = r1.A0H()
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165359(0x7f0700af, float:1.7944933E38)
            if (r2 == 0) goto L_0x0026
            r0 = 2131165226(0x7f07002a, float:1.7944663E38)
        L_0x0026:
            int r7 = r1.getDimensionPixelSize(r0)
            r3.A04 = r7
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A06
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x0154
            java.lang.Integer r10 = X.AnonymousClass05K.A01
        L_0x0036:
            r3.A0J = r10
            int r6 = X.AnonymousClass7TG.A02(r8)
            int r0 = X.C51972G9s.A08(r8)
            r3.A09 = r0
            int r0 = X.AnonymousClass7TG.A05(r8)
            r3.A0A = r0
            android.content.res.Resources r0 = r8.getResources()
            r1 = 2131165228(0x7f07002c, float:1.7944667E38)
            int r0 = r0.getDimensionPixelSize(r1)
            r3.A0B = r0
            int r0 = X.C51972G9s.A08(r8)
            r3.A0C = r0
            android.content.res.Resources r0 = r8.getResources()
            int r0 = r0.getDimensionPixelSize(r1)
            r3.A0D = r0
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A06
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x0144
            com.instagram.reels.prompt.model.PromptStickerModel r1 = r3.A06
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x0144
            com.instagram.user.model.User r0 = r1.A02
            if (r0 == 0) goto L_0x0144
            X.KWL r2 = new X.KWL
            r2.<init>(r8, r0, r11)
        L_0x007c:
            r3.A0G = r2
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A06
            int r12 = r0.A00()
            r3.A07 = r12
            r5 = 0
            r13 = 0
            r17 = 2131165218(0x7f070022, float:1.7944647E38)
            X.7jA r14 = new X.7jA
            r15 = r8
            r16 = r12
            r18 = r4
            r19 = r13
            r20 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r14.setCallback(r3)
            r3.A01 = r14
            X.6Ly r6 = X.AnonymousClass7TF.A0P(r8, r6, r7)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            android.content.Context r1 = r6.A0Z
            X.C339207jE.A00(r1, r5, r6, r0)
            int r0 = X.AnonymousClass7TG.A06(r1)
            float r0 = (float) r0
            r6.A0A(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = X.0nH.A08(r12, r0)
            r6.A0F(r0)
            r7 = 0
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165718(0x7f070216, float:1.7945661E38)
            r1.getValue(r0, r5, r4)
            float r0 = r5.getFloat()
            r6.A0B(r7, r0)
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A06
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r0.A00
            java.lang.String r0 = r0.getText()
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = ""
        L_0x00dd:
            r6.A0M(r0)
            r6.setCallback(r3)
            r3.A0H = r6
            com.instagram.reels.prompt.model.PromptStickerModel r9 = r3.A06
            r14 = 224(0xe0, float:3.14E-43)
            X.7jB r7 = new X.7jB
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r7.setCallback(r3)
            r3.A02 = r7
            X.8jL r0 = X.LJC.A01(r8, r3, r12)
            r3.A0I = r0
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A06
            int r1 = r0.A01(r8)
            X.JZh r0 = new X.JZh
            r0.<init>(r8, r1)
            r0.setCallback(r3)
            r3.A0F = r0
            r0 = r23
            X.6M3 r0 = X.C339157j9.A01(r8, r0, r3)
            X.6M4 r0 = r0.A00()
            r3.A05 = r0
            r5 = 0
            if (r2 == 0) goto L_0x0142
            int r0 = r2.getIntrinsicHeight()
        L_0x011c:
            r3.A08 = r0
            boolean r0 = r2 instanceof X.KWL
            if (r0 == 0) goto L_0x0131
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A06
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r0.A00
            java.util.List r0 = r0.B3f()
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r4) goto L_0x0132
        L_0x0131:
            r0 = 0
        L_0x0132:
            r3.A0L = r0
            int r0 = r3.getIntrinsicHeight()
            if (r2 == 0) goto L_0x013e
            int r5 = r2.A08()
        L_0x013e:
            int r0 = r0 - r5
            r3.A03 = r0
            return
        L_0x0142:
            r0 = 0
            goto L_0x011c
        L_0x0144:
            com.instagram.reels.prompt.model.PromptStickerModel r1 = r3.A06
            boolean r0 = r1.A0D
            if (r0 == 0) goto L_0x0151
            X.HDQ r2 = new X.HDQ
            r2.<init>(r8, r1)
            goto L_0x007c
        L_0x0151:
            r2 = 0
            goto L_0x007c
        L_0x0154:
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59812JZg.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.reels.prompt.model.PromptStickerModel, java.lang.String):void");
    }

    public final void FK8(Integer num) {
        0qQ.A0B(num, 0);
        boolean z = false;
        boolean A1W = AnonymousClass7TF.A1W(num, AnonymousClass05K.A01);
        this.A05.A00();
        PromptStickerModel promptStickerModel = this.A06;
        PromptStickerModel A042 = promptStickerModel.A04();
        C17946Vib AKQ = A042.A00.AKQ();
        AKQ.A00 = 0;
        A042.A00 = AKQ.A00();
        A042.A0C(00k.A0d(promptStickerModel.A00.B3f(), 1));
        Context context = this.A0E;
        String str = this.A0K;
        if (!A1W) {
            A042 = promptStickerModel;
        }
        Integer num2 = this.A0J;
        int i = this.A07;
        C339177jB r6 = new C339177jB(context, A042, num2, str, i, 0, 224);
        r6.setCallback(this);
        this.A02 = r6;
        C339167jA r62 = new C339167jA(context, i, R.dimen.account_discovery_bottom_gap, !A1W, false, true);
        r62.setCallback(this);
        this.A01 = r62;
        if (promptStickerModel.A00.Bhw() == StoryPromptType.ELECTION && A1W) {
            z = true;
        }
        this.A00 = z;
        JTU.A0j(this);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A01.draw(canvas);
        this.A0H.draw(canvas);
        if (!this.A0L) {
            this.A02.draw(canvas);
        }
        if (!this.A00 && this.A06.A01 == 0) {
            this.A0I.draw(canvas);
            this.A0F.draw(canvas);
            this.A05.draw(canvas);
        }
        KHj kHj = this.A0G;
        if (kHj != null) {
            kHj.draw(canvas);
        }
    }

    public final List A07() {
        Drawable[] drawableArr = {this.A01, this.A0H, this.A02, this.A0I, this.A0F, this.A0G};
        0qQ.A0B(drawableArr, 0);
        return 03t.A0I(drawableArr);
    }

    public final Integer A08() {
        return AnonymousClass05K.A0u;
    }

    public final Integer Ail() {
        return Integer.valueOf(this.A0F.getIntrinsicHeight() + this.A0C + this.A0D);
    }

    public final /* synthetic */ Integer Aiy() {
        return null;
    }

    public final PromptStickerModel BTZ() {
        return this.A06;
    }

    public final C2802350v BzV() {
        return this.A06;
    }

    public final String C4F() {
        if (this.A06.A0H()) {
            return C273654mx.A00(71);
        }
        return "prompt_sticker_bundle_id";
    }

    public final void EVv(float f) {
        this.A02.A09(f);
    }

    public final /* synthetic */ void Euc() {
        this.A05.A01();
    }

    public final int getIntrinsicHeight() {
        int i;
        int i2 = this.A0H.A06;
        if (this.A0L) {
            i = 0;
        } else {
            i = this.A02.A01 + this.A0A;
        }
        return i2 + i + this.A0I.getIntrinsicHeight() + this.A0F.getIntrinsicHeight() + this.A09 + this.A0B + this.A0C + this.A0D + this.A08;
    }

    public final int getIntrinsicWidth() {
        return this.A04;
    }

    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
        this.A0H.setAlpha(i);
        this.A02.setAlpha(i);
        this.A0I.setAlpha(i);
        this.A0F.setAlpha(i);
        KHj kHj = this.A0G;
        if (kHj != null) {
            kHj.setAlpha(i);
        }
        if (i == 0) {
            this.A05.A00();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setBounds(int r13, int r14, int r15, int r16) {
        /*
            r12 = this;
            r0 = r16
            super.setBounds(r13, r14, r15, r0)
            int r13 = r13 + r15
            float r7 = (float) r13
            r11 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r11
            int r14 = r14 + r16
            float r6 = (float) r14
            float r6 = r6 / r11
            int r0 = r12.A04
            float r3 = (float) r0
            float r3 = r3 / r11
            float r1 = r7 - r3
            int r0 = r12.getIntrinsicHeight()
            float r0 = (float) r0
            float r0 = r0 / r11
            float r10 = r6 - r0
            float r3 = r3 + r7
            int r0 = r12.getIntrinsicHeight()
            float r9 = (float) r0
            float r9 = r9 / r11
            float r9 = r9 + r6
            X.KHj r8 = r12.A0G
            if (r8 == 0) goto L_0x00f9
            int r0 = r8.A08()
        L_0x002c:
            float r5 = (float) r0
            float r5 = r5 + r10
            X.7jA r2 = r12.A01
            int r4 = (int) r1
            int r1 = (int) r5
            int r3 = (int) r3
            int r0 = (int) r9
            r2.setBounds(r4, r1, r3, r0)
            if (r8 == 0) goto L_0x00f3
            int r1 = (int) r10
            int r0 = r8.getIntrinsicHeight()
            float r0 = (float) r0
            float r10 = r10 + r0
            int r0 = (int) r10
            r8.setBounds(r4, r1, r3, r0)
            android.graphics.Rect r0 = r8.getBounds()
            if (r0 == 0) goto L_0x00f3
            int r0 = r0.bottom
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0050:
            int r9 = X.AnonymousClass7TE.A0M(r0)
            boolean r0 = r12.A00
            if (r0 != 0) goto L_0x00d4
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r12.A06
            int r0 = r0.A01
            if (r0 != 0) goto L_0x00d4
            X.6Ly r8 = r12.A0H
            int r0 = r8.A0A
            float r2 = (float) r0
            float r2 = r2 / r11
            float r0 = r7 - r2
            int r5 = (int) r0
            int r1 = r12.A09
            int r1 = r1 + r9
            float r2 = r2 + r7
            int r2 = (int) r2
            int r0 = r8.A06
            int r0 = r0 + r1
        L_0x006f:
            r8.setBounds(r5, r1, r2, r0)
            int r2 = X.JTO.A06(r8)
            boolean r0 = r12.A0L
            if (r0 != 0) goto L_0x00a4
            X.7jB r10 = r12.A02
            int r9 = X.JTR.A0A(r10, r7)
            int r6 = X.JTO.A06(r8)
            int r5 = r12.A0A
            int r6 = r6 + r5
            X.7jB r0 = r12.A02
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            float r0 = r0 / r11
            float r0 = r0 + r7
            int r2 = (int) r0
            int r1 = X.JTO.A06(r8)
            int r1 = r1 + r5
            X.7jB r0 = r12.A02
            int r0 = r0.A01
            int r1 = r1 + r0
            r10.setBounds(r9, r6, r2, r1)
            X.7jB r0 = r12.A02
            int r2 = X.JTO.A06(r0)
        L_0x00a4:
            X.8jL r1 = r12.A0I
            int r0 = r12.A0B
            int r2 = r2 + r0
            int r0 = r1.getIntrinsicHeight()
            int r0 = r0 + r2
            r1.setBounds(r4, r2, r3, r0)
            X.JZh r6 = r12.A0F
            int r5 = X.JTR.A0A(r6, r7)
            int r4 = X.JTO.A06(r1)
            int r3 = r12.A0C
            int r4 = r4 + r3
            int r0 = r6.getIntrinsicWidth()
            float r0 = (float) r0
            float r0 = r0 / r11
            float r7 = r7 + r0
            int r2 = (int) r7
            int r1 = X.JTO.A06(r1)
            int r1 = r1 + r3
            int r0 = r6.getIntrinsicHeight()
            int r1 = r1 + r0
            r6.setBounds(r5, r4, r2, r1)
            return
        L_0x00d4:
            X.6Ly r8 = r12.A0H
            int r9 = r8.A06
            int r0 = r12.A0A
            int r1 = r9 + r0
            X.7jB r0 = r12.A02
            int r0 = r0.A01
            int r1 = r1 + r0
            int r0 = r8.A0A
            float r2 = (float) r0
            float r2 = r2 / r11
            float r0 = r7 - r2
            int r5 = (int) r0
            float r0 = (float) r1
            float r0 = r0 / r11
            float r6 = r6 - r0
            int r1 = (int) r6
            float r2 = r2 + r7
            int r2 = (int) r2
            float r0 = (float) r9
            float r6 = r6 + r0
            int r0 = (int) r6
            goto L_0x006f
        L_0x00f3:
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            goto L_0x0050
        L_0x00f9:
            r0 = 0
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59812JZg.setBounds(int, int, int, int):void");
    }
}
