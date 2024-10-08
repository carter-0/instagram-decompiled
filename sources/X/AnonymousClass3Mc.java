package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.3Mc  reason: invalid class name */
public abstract class AnonymousClass3Mc {
    public static final AnonymousClass3N1 A00(Context context, ViewGroup viewGroup, UserSession userSession) {
        int i;
        View A01;
        0qQ.A0B(userSession, 0);
        LayoutInflater from = LayoutInflater.from(context);
        UserSession userSession2 = 1NM.A00(userSession).A00;
        0Tu r5 = 0Tu.A05;
        ViewGroup viewGroup2 = viewGroup;
        if (182.A06(r5, userSession2, 36322044502026151L)) {
            i = R.layout.reel_item_story_unit_one_by_one;
        } else if (((int) 182.A01(r5, userSession, 36604949707756693L)) > 0) {
            0qQ.A0A(from);
            A01 = 2Su.A01(from, (ViewGroup.LayoutParams) null, viewGroup2, R.layout.reel_item_story_unit, false, true);
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            0qQ.A0A(A01);
            0qQ.A0B(A01, 1);
            AnonymousClass3N1 r4 = new AnonymousClass3N1(A01);
            r4.A00 = userSession;
            if (182.A06(r5, 1NM.A00(userSession).A00, 36322044502026151L) && A01.findViewById(R.id.media_preview_one_by_one) != null) {
                r4.A01 = A01.requireViewById(R.id.media_preview_one_by_one);
            }
            A01.setTag(r4);
            return r4;
        } else {
            i = R.layout.reel_item_story_unit;
        }
        A01 = from.inflate(i, viewGroup, false);
        int i22 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(A01);
        0qQ.A0B(A01, 1);
        AnonymousClass3N1 r42 = new AnonymousClass3N1(A01);
        r42.A00 = userSession;
        r42.A01 = A01.requireViewById(R.id.media_preview_one_by_one);
        A01.setTag(r42);
        return r42;
    }

    public static final void A02(AnonymousClass0iw r2, C247833gz r3, ImageUrl imageUrl, String str, int i) {
        1OO A0J = 1NK.A00().A0J(imageUrl, r2.getModuleName());
        A0J.A0I = false;
        A0J.A01 = 1;
        A0J.A02 = i;
        A0J.A0E = false;
        A0J.A0M = false;
        A0J.A04 = r3;
        A0J.A09 = str;
        A0J.A0O = false;
        A0J.A0L = false;
        A0J.A0J = true;
        A0J.A00().E5t();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v68, resolved type: X.M9f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v92, resolved type: X.MAK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: X.MAK} */
    /* JADX WARNING: type inference failed for: r0v69, types: [java.lang.Runnable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r32, X.AnonymousClass0iw r33, com.instagram.common.session.UserSession r34, X.AnonymousClass3BT r35, X.AnonymousClass3BT r36, X.AnonymousClass3N1 r37, X.C230242pG r38, java.util.List r39, int r40, boolean r41, boolean r42, boolean r43, boolean r44) {
        /*
            r0 = 0
            r15 = r32
            X.0qQ.A0B(r15, r0)
            r0 = 1
            r5 = r34
            X.0qQ.A0B(r5, r0)
            r0 = 2
            r3 = r37
            X.0qQ.A0B(r3, r0)
            r0 = 3
            r4 = r35
            X.0qQ.A0B(r4, r0)
            r1 = 6
            r32 = r38
            r0 = r32
            X.0qQ.A0B(r0, r1)
            r0 = 7
            r2 = r39
            X.0qQ.A0B(r2, r0)
            r0 = 9
            r6 = r33
            X.0qQ.A0B(r6, r0)
            X.3N5 r1 = r3.A02
            X.3NB r0 = new X.3NB
            r0.<init>(r3)
            r22 = r40
            r25 = r43
            r26 = r15
            r27 = r0
            r28 = r6
            r29 = r5
            r30 = r4
            r31 = r1
            r33 = r2
            r34 = r22
            r35 = r25
            X.AnonymousClass3NC.A00(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView r8 = r3.A03
            r20 = r36
            r23 = r41
            r24 = r42
            r26 = r44
            r16 = r8
            r17 = r6
            r18 = r5
            r19 = r4
            r21 = r32
            r16.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            com.instagram.model.reels.Reel r2 = r4.A03
            boolean r0 = r2.A1a
            if (r0 == 0) goto L_0x02e0
            boolean r7 = r4.A06(r5)
            r1 = 14
            X.9Kl r0 = new X.9Kl
            r0.<init>(r5, r1)
            if (r7 == 0) goto L_0x02dd
            java.lang.Object r7 = r0.invoke()
        L_0x007b:
            com.instagram.model.reels.Reel r7 = (com.instagram.model.reels.Reel) r7
            if (r7 == 0) goto L_0x02a9
            boolean r0 = r7.A16(r5)
            if (r0 != 0) goto L_0x02a9
            r14 = 0
            r21 = 1
            X.0Tu r9 = X.0Tu.A05
            r0 = 36327748218075813(0x810fe500073aa5, double:3.037152480987405E-306)
            boolean r27 = X.182.A06(r9, r5, r0)
            r0 = 25
            X.Plc r1 = new X.Plc
            r1.<init>(r5, r0)
            java.lang.Class<X.LDH> r0 = X.LDH.class
            java.lang.Object r11 = r5.A01(r0, r1)
            X.LDH r11 = (X.LDH) r11
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x02a5
            X.0xa r10 = r11.A01
            java.lang.String r9 = "last_play_pile_animation_time"
            r0 = 0
            long r0 = r10.getLong(r9, r0)
        L_0x00b0:
            X.3N0 r13 = r8.getHolder()
            X.0eM r8 = r13.A05
            r18 = r8
            java.lang.Object r8 = r18.getValue()
            X.3oV r8 = (X.C252063oV) r8
            int r8 = r8.CFV()
            r12 = 8
            if (r8 != r12) goto L_0x0273
            long r16 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.HOURS
            r8 = 1
            long r8 = r10.toMillis(r8)
            long r0 = r0 + r8
            int r8 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x0273
            java.lang.Object r10 = r18.getValue()
            X.3oV r10 = (X.C252063oV) r10
            android.view.View r9 = r10.getView()
            r0 = 2131436087(0x7f0b2237, float:1.8494035E38)
            android.view.View r8 = r9.findViewById(r0)
            X.0qQ.A07(r8)
            com.instagram.common.ui.widget.imageview.IgImageView r8 = (com.instagram.common.ui.widget.imageview.IgImageView) r8
            r0 = 0
            r9.setScaleX(r0)
            r9.setScaleY(r0)
            X.0eM r0 = r13.A09
            java.lang.Object r0 = r0.getValue()
            X.3oV r0 = (X.C252063oV) r0
            android.view.View r1 = r0.getView()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            X.MAK r0 = new X.MAK
            r23 = r7
            r24 = r11
            r25 = r3
            r26 = r32
            r16 = r0
            r17 = r9
            r18 = r1
            r19 = r6
            r20 = r5
            r21 = r8
            r22 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x011d:
            r9.post(r0)
        L_0x0120:
            X.0Tu r7 = X.0Tu.A05
            r0 = 36322044501698467(0x810ab5000a27a3, double:3.033545427783349E-306)
            boolean r0 = X.182.A06(r7, r5, r0)
            if (r0 == 0) goto L_0x015d
            boolean r0 = r4.A06(r5)
            java.lang.String r1 = "Required value was null."
            r9 = 0
            if (r0 != 0) goto L_0x0231
            X.3uh r10 = r2.A09(r5)
            if (r10 == 0) goto L_0x02f9
            X.1Xj r8 = r10.A0b
            r1 = 1
            if (r8 == 0) goto L_0x022f
            boolean r0 = r8.A5f()
            if (r0 != r1) goto L_0x0250
            java.lang.String r1 = r8.BTL()
            java.lang.String r0 = "preview:/"
            java.lang.String r0 = X.002.A0R(r0, r1)
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r0)
            r0 = 6
            r10.A02()
            A02(r6, r9, r1, r9, r0)
        L_0x015d:
            X.1NN r0 = X.1NM.A00(r5)
            com.instagram.common.session.UserSession r8 = r0.A00
            r0 = 36322044502026151(0x810ab5000f27a7, double:3.033545427990578E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x019f
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r3.A01
            if (r3 == 0) goto L_0x019f
            boolean r0 = r2.A0t()
            r7 = 1
            if (r0 == 0) goto L_0x01a0
            android.graphics.drawable.GradientDrawable$Orientation r5 = android.graphics.drawable.GradientDrawable.Orientation.BL_TR
            java.lang.String r0 = "#FFD400"
            int r4 = android.graphics.Color.parseColor(r0)
            java.lang.String r0 = "#FF7000"
            int r2 = android.graphics.Color.parseColor(r0)
            java.lang.String r0 = "#FF0067"
            int r1 = android.graphics.Color.parseColor(r0)
            java.lang.String r0 = "#E700CB"
            int r0 = android.graphics.Color.parseColor(r0)
            int[] r1 = new int[]{r4, r2, r1, r0}
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>(r5, r1)
            r3.setImageDrawable(r0)
        L_0x019f:
            return
        L_0x01a0:
            boolean r0 = X.AnonymousClass3NF.A01(r5, r4)
            if (r0 == 0) goto L_0x01b1
            r0 = 2131099948(0x7f06012c, float:1.7812264E38)
            int r0 = r15.getColor(r0)
            r3.setBackgroundColor(r0)
            return
        L_0x01b1:
            boolean r0 = r4.A06(r5)
            java.lang.String r1 = "Required value was null."
            if (r0 != 0) goto L_0x0207
            X.3uh r4 = r2.A09(r5)
            if (r4 == 0) goto L_0x02f3
            X.1Xj r2 = r4.A0b
            if (r2 == 0) goto L_0x01f2
            boolean r0 = r2.A5f()
            if (r0 != r7) goto L_0x01e5
            r0 = 6
            r3.A04 = r0
            long r0 = r4.A02()
            r3.A05 = r0
            java.lang.String r1 = r2.BTL()
            java.lang.String r0 = "preview:/"
            java.lang.String r1 = X.002.A0R(r0, r1)
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r1)
        L_0x01e1:
            r3.setUrl(r0, r6)
            return
        L_0x01e5:
            X.3gz r0 = new X.3gz
            r0.<init>()
            r3.A0A = r0
            java.lang.String r0 = r2.BTL()
            r3.A0K = r0
        L_0x01f2:
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131165281(0x7f070061, float:1.7944775E38)
            int r0 = r1.getDimensionPixelSize(r0)
            com.instagram.common.typedurl.ImageUrl r0 = r4.A07(r0)
            if (r0 == 0) goto L_0x019f
            X.0qQ.A0A(r3)
            goto L_0x01e1
        L_0x0207:
            X.PFz r2 = r2.A0E
            if (r2 == 0) goto L_0x019f
            X.0qQ.A0A(r3)
            X.3gz r0 = new X.3gz
            r0.<init>()
            r3.A0A = r0
            X.3I4 r0 = r2.A00
            java.lang.String r0 = r0.getPreview()
            r3.A0K = r0
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r2.A00()
            r3.setUrl(r0, r6)
            r1 = 2131435124(0x7f0b1e74, float:1.8492081E38)
            java.lang.String r0 = r2.getId()
            r3.setTag(r1, r0)
            return
        L_0x022f:
            r8 = r9
            goto L_0x0259
        L_0x0231:
            X.PFz r1 = r2.A0E
            if (r1 == 0) goto L_0x015d
            X.3I4 r0 = r1.A00
            java.lang.String r0 = r0.getPreview()
            if (r0 == 0) goto L_0x024e
            X.3gz r9 = new X.3gz
            r9.<init>()
            X.3I4 r0 = r1.A00
            java.lang.String r8 = r0.getPreview()
        L_0x0248:
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r1.A00()
            r0 = 3
            goto L_0x026e
        L_0x024e:
            r8 = r9
            goto L_0x0248
        L_0x0250:
            X.3gz r9 = new X.3gz
            r9.<init>()
            java.lang.String r8 = r8.BTL()
        L_0x0259:
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131165281(0x7f070061, float:1.7944775E38)
            int r0 = r1.getDimensionPixelSize(r0)
            com.instagram.common.typedurl.ImageUrl r1 = r10.A07(r0)
            if (r1 == 0) goto L_0x015d
            r0 = 3
            r10.A02()
        L_0x026e:
            A02(r6, r9, r1, r8, r0)
            goto L_0x015d
        L_0x0273:
            if (r27 == 0) goto L_0x0120
            X.0eM r0 = r13.A09
            java.lang.Object r0 = r0.getValue()
            X.3oV r0 = (X.C252063oV) r0
            r0.setVisibility(r12)
            java.lang.Object r1 = r18.getValue()
            X.3oV r1 = (X.C252063oV) r1
            X.OzI r0 = X.C72250OzI.A00
            r1.EeU(r0)
            r1.setVisibility(r14)
            java.lang.Object r0 = r18.getValue()
            X.3oV r0 = (X.C252063oV) r0
            android.view.View r16 = r0.getView()
            r17 = r6
            r18 = r5
            r19 = r7
            r20 = r32
            X.C63408KwU.A00(r16, r17, r18, r19, r20, r21)
            goto L_0x0120
        L_0x02a5:
            long r0 = r11.A00
            goto L_0x00b0
        L_0x02a9:
            X.3N0 r0 = r8.getHolder()
            X.0eM r0 = r0.A05
            java.lang.Object r7 = r0.getValue()
            X.3oV r7 = (X.C252063oV) r7
            int r0 = r7.CFV()
            if (r0 != 0) goto L_0x0120
            android.view.View r9 = r7.getView()
            X.3N0 r0 = r8.getHolder()
            X.0eM r0 = r0.A09
            java.lang.Object r0 = r0.getValue()
            X.3oV r0 = (X.C252063oV) r0
            android.view.View r1 = r0.getView()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 8
            r1.setVisibility(r0)
            X.M9f r0 = new X.M9f
            r0.<init>(r9, r1, r5, r7)
            goto L_0x011d
        L_0x02dd:
            r7 = 0
            goto L_0x007b
        L_0x02e0:
            X.3N0 r0 = r8.getHolder()
            X.0eM r0 = r0.A05
            java.lang.Object r1 = r0.getValue()
            X.3oV r1 = (X.C252063oV) r1
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0120
        L_0x02f3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02f9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Mc.A01(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.3BT, X.3BT, X.3N1, X.2pG, java.util.List, int, boolean, boolean, boolean, boolean):void");
    }
}
