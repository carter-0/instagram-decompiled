package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.9pk  reason: invalid class name and case insensitive filesystem */
public final class C389509pk extends C299875vz {
    public final int A00;
    public final int A01;
    public final Resources A02;
    public final U1H A03;
    public final C306386Ly A04;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0072, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36319918495637253L) != false) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C389509pk(android.content.Context r6, com.instagram.common.session.UserSession r7, com.instagram.reels.prompt.model.PromptStickerModel r8, int r9) {
        /*
            r5 = this;
            r0 = 1
            r1 = 6
            X.AnonymousClass7TF.A1B(r6, r0, r7)
            r5.<init>()
            android.content.res.Resources r4 = r6.getResources()
            r5.A02 = r4
            int r0 = X.AnonymousClass7TE.A0C(r4)
            r5.A01 = r0
            int r2 = X.AnonymousClass7TE.A0B(r4)
            r5.A00 = r2
            com.instagram.api.schemas.StoryPromptType r0 = r8.A03()
            int r0 = r0.ordinal()
            if (r0 != r1) goto L_0x0084
            r0 = 2131238318(0x7f081dae, float:1.8092911E38)
        L_0x0027:
            X.U1H r1 = new X.U1H
            r1.<init>(r6, r0, r2, r2)
            r1.A00 = r9
            r0 = 0
            r1.A01 = r0
            r5.A03 = r1
            r0 = 2131165258(0x7f07004a, float:1.7944728E38)
            int r0 = r4.getDimensionPixelSize(r0)
            X.6Ly r3 = new X.6Ly
            r3.<init>(r6, r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            X.0qq r1 = X.AnonymousClass0qo.A00(r6)
            X.0qm r0 = X.0qm.A0u
            android.graphics.Typeface r0 = r1.A02(r0)
            X.C339207jE.A00(r6, r0, r3, r2)
            r0 = 2131165249(0x7f070041, float:1.794471E38)
            int r0 = r4.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r3.A0A(r0)
            r3.A0F(r9)
            com.instagram.api.schemas.StoryPromptType r1 = r8.A03()
            com.instagram.api.schemas.StoryPromptType r0 = com.instagram.api.schemas.StoryPromptType.MAGIC_MOD_ADD_YOURS_WITH_BACKDROP
            if (r1 == r0) goto L_0x0074
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319918495637253(0x8108c600341f05, double:3.032200932989498E-306)
            boolean r1 = X.182.A06(r2, r7, r0)
            r0 = 2131965802(0x7f13376a, float:1.9568424E38)
            if (r1 == 0) goto L_0x0077
        L_0x0074:
            r0 = 2131965740(0x7f13372c, float:1.9568298E38)
        L_0x0077:
            java.lang.String r0 = r6.getString(r0)
            r3.A0M(r0)
            r3.setCallback(r5)
            r5.A04 = r3
            return
        L_0x0084:
            com.instagram.api.schemas.StoryPromptType r0 = r8.A03()
            X.8hK r0 = X.AnonymousClass6XS.A01(r0)
            if (r0 == 0) goto L_0x0091
            int r0 = r0.A01
            goto L_0x0027
        L_0x0091:
            java.lang.String r1 = "Could not get icon drawable"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C389509pk.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.reels.prompt.model.PromptStickerModel, int):void");
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A03.draw(canvas);
        this.A04.draw(canvas);
    }

    public final List A07() {
        return 0sr.A1M(new Drawable[]{this.A03, this.A04});
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A00 + this.A01 + this.A04.A0A;
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A04.setAlpha(i);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float intrinsicWidth = ((float) getIntrinsicWidth()) / 2.0f;
        float f3 = f - intrinsicWidth;
        U1H u1h = this.A03;
        int A012 = AnonymousClass1GB.A01(f3);
        int i5 = this.A00;
        float f4 = (float) (i5 / 2);
        u1h.setBounds(A012, AnonymousClass1GB.A01(f2 - f4), AnonymousClass1GB.A01(f3 + ((float) i5)), AnonymousClass1GB.A01(f4 + f2));
        C306386Ly r5 = this.A04;
        int i6 = r5.A06;
        r5.setBounds(u1h.getBounds().right + this.A01, AnonymousClass1GB.A01(f2 - ((float) (i6 / 2))), AnonymousClass1GB.A01(f + intrinsicWidth), AnonymousClass1GB.A01(f2 + ((float) i6)));
    }
}
