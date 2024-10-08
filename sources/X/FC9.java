package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class FC9 {
    public static final C244323b0 A00(Context context, User user) {
        0qQ.A0B(user, 1);
        Context context2 = context;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.appreciation_reels_grid_item_width);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Drawable drawable = context.getDrawable(R.drawable.ig_illustrations_illo_subscriber_crown);
        if (drawable != null) {
            A1C.add(drawable);
        }
        A1C.add(new C244303ay(user.Bh3(), (String) null, dimensionPixelSize, AnonymousClass1GB.A01(0nA.A04(context, 14)), 0, 0));
        return new C244323b0(context2, AnonymousClass05K.A00, A1C, 0.4f, dimensionPixelSize, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0033, code lost:
        if (A02(r0, r6) == false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r14, android.view.View r15, com.instagram.common.session.UserSession r16, boolean r17) {
        /*
            r4 = 0
            r0 = 1
            r1 = r16
            int r9 = X.DbW.A02(r0, r1, r15)
            r0 = 2131432624(0x7f0b14b0, float:1.848701E38)
            android.view.View r13 = X.AnonymousClass7TF.A0F(r15, r0)
            r0 = 2131432626(0x7f0b14b2, float:1.8487015E38)
            android.widget.ImageView r11 = X.DbX.A0J(r15, r0)
            r0 = 2131432627(0x7f0b14b3, float:1.8487017E38)
            android.view.View r12 = X.AnonymousClass7TF.A0G(r15, r0)
            X.6jB r6 = X.C314986jA.A00(r1)
            float r1 = r12.getAlpha()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0035
            if (r17 == 0) goto L_0x0101
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.CLIPS
        L_0x002e:
            boolean r0 = A02(r0, r6)
            r8 = 1
            if (r0 != 0) goto L_0x0036
        L_0x0035:
            r8 = 0
        L_0x0036:
            X.U7C r0 = new X.U7C
            r0.<init>(r9)
            X.03v.A0B(r11, r0)
            r7 = 8
            r2 = 3000(0xbb8, double:1.482E-320)
            r0 = 300(0x12c, double:1.48E-321)
            r5 = 0
            r10 = r14
            if (r17 == 0) goto L_0x0094
            if (r8 == 0) goto L_0x0120
            r12.setVisibility(r4)
            r8 = 2131238187(0x7f081d2b, float:1.8092646E38)
            android.graphics.drawable.Drawable r8 = r14.getDrawable(r8)
            if (r8 == 0) goto L_0x0063
            android.graphics.drawable.Drawable r8 = r8.mutate()
            if (r8 == 0) goto L_0x0063
            r5 = 2131099843(0x7f0600c3, float:1.781205E38)
            X.DbX.A11(r14, r8, r5)
            r5 = r8
        L_0x0063:
            r11.setImageDrawable(r5)
            r5 = 2131231781(0x7f080425, float:1.8079653E38)
            X.DbU.A11(r14, r13, r5)
            r13.setVisibility(r4)
            float[] r4 = new float[r9]
            r4 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r4)
            r4.setDuration(r0)
            r4.setStartDelay(r2)
            X.Oej r0 = new X.Oej
            r0.<init>(r12, r7)
            r4.addUpdateListener(r0)
            com.instagram.model.mediatype.ProductType r1 = com.instagram.model.mediatype.ProductType.CLIPS
        L_0x0088:
            X.FHJ r0 = new X.FHJ
            r0.<init>(r1, r6)
            r4.addListener(r0)
            r4.start()
            return
        L_0x0094:
            if (r8 == 0) goto L_0x0105
            r12.setVisibility(r4)
            r7 = 2131238187(0x7f081d2b, float:1.8092646E38)
            android.graphics.drawable.Drawable r7 = r14.getDrawable(r7)
            if (r7 == 0) goto L_0x00af
            android.graphics.drawable.Drawable r7 = r7.mutate()
            if (r7 == 0) goto L_0x00af
            r5 = 2131099843(0x7f0600c3, float:1.781205E38)
            X.DbX.A11(r14, r7, r5)
            r5 = r7
        L_0x00af:
            r11.setImageDrawable(r5)
            r5 = 2131231781(0x7f080425, float:1.8079653E38)
            X.DbU.A11(r14, r13, r5)
            r13.setVisibility(r4)
            float[] r4 = new float[r9]
            r4 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r4)
            r4.setDuration(r0)
            r4.setStartDelay(r2)
            X.Oeg r8 = new X.Oeg
            r8.<init>(r9, r10, r11, r12, r13)
            r4.addUpdateListener(r8)
            r4.start()
            android.animation.ArgbEvaluator r7 = new android.animation.ArgbEvaluator
            r7.<init>()
            r4 = 2131099843(0x7f0600c3, float:1.781205E38)
            java.lang.Integer r5 = X.DbV.A0n(r14, r4)
            r4 = 2131099928(0x7f060118, float:1.7812223E38)
            java.lang.Integer r4 = X.DbV.A0n(r14, r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r4}
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofObject(r7, r4)
            r4.setDuration(r0)
            r4.setStartDelay(r2)
            X.FHO r0 = new X.FHO
            r0.<init>(r11, r9)
            r4.addUpdateListener(r0)
            com.instagram.model.mediatype.ProductType r1 = com.instagram.model.mediatype.ProductType.FEED
            goto L_0x0088
        L_0x0101:
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.FEED
            goto L_0x002e
        L_0x0105:
            r12.setVisibility(r7)
            r0 = 2131238188(0x7f081d2c, float:1.8092648E38)
            android.graphics.drawable.Drawable r1 = r14.getDrawable(r0)
            if (r1 == 0) goto L_0x011e
            r0 = 2131099928(0x7f060118, float:1.7812223E38)
            X.DbX.A11(r14, r1, r0)
        L_0x0117:
            r11.setImageDrawable(r1)
            r13.setBackground(r5)
            goto L_0x0142
        L_0x011e:
            r1 = r5
            goto L_0x0117
        L_0x0120:
            r12.setVisibility(r7)
            r0 = 2131238187(0x7f081d2b, float:1.8092646E38)
            android.graphics.drawable.Drawable r0 = r14.getDrawable(r0)
            if (r0 == 0) goto L_0x0139
            android.graphics.drawable.Drawable r1 = r0.mutate()
            if (r1 == 0) goto L_0x0139
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            X.DbX.A11(r14, r1, r0)
            r5 = r1
        L_0x0139:
            r11.setImageDrawable(r5)
            r0 = 2131231781(0x7f080425, float:1.8079653E38)
            X.DbU.A11(r14, r13, r0)
        L_0x0142:
            r13.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FC9.A01(android.content.Context, android.view.View, com.instagram.common.session.UserSession, boolean):void");
    }

    public static final boolean A02(ProductType productType, C314996jB r8) {
        long currentTimeMillis;
        long A06;
        int ordinal = productType.ordinal();
        if (ordinal == 13) {
            0xa r3 = r8.A01;
            if (r3.getInt("exclusive_content_animation_tall_video_count", 0) >= 3) {
                return false;
            }
            currentTimeMillis = System.currentTimeMillis();
            A06 = DbW.A06(r3, "exclusive_content_animation_tall_video_timestamp");
        } else if (ordinal == 1) {
            0xa r32 = r8.A01;
            if (r32.getInt("exclusive_content_animation_post_count", 0) >= 3) {
                return false;
            }
            currentTimeMillis = System.currentTimeMillis();
            A06 = DbW.A06(r32, "exclusive_content_animation_post_timestamp");
        } else if (ordinal != 9) {
            return false;
        } else {
            0xa r33 = r8.A01;
            if (r33.getInt("exclusive_content_animation_story_count", 0) >= 3) {
                return false;
            }
            currentTimeMillis = System.currentTimeMillis();
            A06 = DbW.A06(r33, "exclusive_content_animation_story_timestamp");
        }
        if (currentTimeMillis - A06 > TimeUnit.DAYS.toMillis(1)) {
            return true;
        }
        return false;
    }
}
