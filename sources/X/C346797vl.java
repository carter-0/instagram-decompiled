package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7vl  reason: invalid class name and case insensitive filesystem */
public final class C346797vl extends C231632rz {
    public final UserSession A00;
    public final AnonymousClass8MJ A01;
    public final List A02;
    public final boolean A03;

    public C346797vl(UserSession userSession, AnonymousClass8MJ r8, boolean z) {
        this.A00 = userSession;
        this.A01 = r8;
        this.A03 = z;
        float[] fArr = new float[10];
        int i = 0;
        do {
            fArr[i] = (float) C229632nm.A04(2SP.A00, new 2HY(-2, 2));
            i++;
        } while (i < 10);
        this.A02 = new 09s(fArr);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        0qQ.A0B(r2, 0);
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0091, code lost:
        if (r1 == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0175, code lost:
        if (r0 != false) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r25, android.view.View r26, java.lang.Object r27, java.lang.Object r28) {
        /*
            r24 = this;
            r7 = r28
            r8 = r27
            r0 = 980683558(0x3a740b26, float:9.3095226E-4)
            int r17 = X.AnonymousClass0fD.A03(r0)
            r0 = 1
            r2 = r26
            X.0qQ.A0B(r2, r0)
            r0 = 2
            X.0qQ.A0B(r8, r0)
            r1 = 3
            X.0qQ.A0B(r7, r1)
            r3 = r24
            com.instagram.common.session.UserSession r6 = r3.A00
            java.lang.Object r10 = r2.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StaticStickerRedesignGridRowViewBinder.Holder"
            X.0qQ.A0C(r10, r0)
            X.A51 r10 = (X.A51) r10
            X.71g r8 = (X.C3251571g) r8
            X.9op r7 = (X.C389059op) r7
            java.util.List r5 = r3.A02
            X.8MJ r0 = r3.A01
            r19 = r0
            boolean r9 = r3.A03
            X.A8k r0 = X.A2B.A00
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 1
            X.0qQ.A0B(r10, r0)
            r0 = 2
            X.0qQ.A0B(r8, r0)
            X.0qQ.A0B(r7, r1)
            r4 = 4
            X.0qQ.A0B(r5, r4)
            r1 = 5
            r0 = r19
            X.0qQ.A0B(r0, r1)
            int r1 = r7.A00
            r0 = 0
            if (r1 != 0) goto L_0x0055
            r0 = 1
        L_0x0055:
            if (r9 == 0) goto L_0x0175
            if (r0 == 0) goto L_0x0082
            X.A8k r1 = X.A2B.A00
            android.animation.AnimatorSet r0 = r1.A00
            r0.cancel()
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r1.A00 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.A01 = r0
        L_0x006e:
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x0082
            android.view.View r2 = r10.A00
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165214(0x7f07001e, float:1.7944639E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.0nA.A0c(r2, r0)
        L_0x0082:
            android.view.View r3 = r10.A00
            android.content.res.Resources r2 = r3.getResources()
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x0093
            boolean r1 = r7.A01
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            if (r1 != 0) goto L_0x0096
        L_0x0093:
            r0 = 2131165223(0x7f070027, float:1.7944657E38)
        L_0x0096:
            int r0 = r2.getDimensionPixelSize(r0)
            X.0nA.A0X(r3, r0)
            java.util.ArrayList r10 = r10.A01
            int r3 = r10.size()
            r2 = 0
        L_0x00a4:
            if (r2 >= r3) goto L_0x0179
            java.lang.Object r14 = r10.get(r2)
            X.0qQ.A07(r14)
            android.view.View r14 = (android.view.View) r14
            java.lang.Object r11 = r14.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerSheetRedesignItemViewBinder.Holder"
            X.0qQ.A0C(r11, r0)
            X.9Yp r11 = (X.C380549Yp) r11
            int r0 = r7.A01
            int r0 = r0 + r2
            int r0 = r0 + 1
            long r0 = (long) r0
            int r13 = (int) r0
            int r12 = r5.size()
            int r13 = r13 % r12
            java.lang.Object r12 = r5.get(r13)
            java.lang.Number r12 = (java.lang.Number) r12
            float r23 = r12.floatValue()
            int r12 = r8.A01()
            if (r2 >= r12) goto L_0x0161
            java.lang.Object r12 = r8.A02(r2)
            X.6nz r12 = (X.C317876nz) r12
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            r21 = r12
            r22 = r13
            r18 = r6
            r20 = r11
            X.AAS.A00(r18, r19, r20, r21, r22, r23)
            if (r9 == 0) goto L_0x00f5
            r14.setVisibility(r4)
            X.A8k r0 = X.A2B.A00
            r0.A00(r14, r7, r2)
        L_0x00f5:
            X.6o5 r14 = new X.6o5
            r14.<init>(r6)
            X.1Av r0 = X.1Au.A00(r6)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "preference_sticker_drops_new_badge_interacted_with_sticker_ids"
            java.util.Set r1 = r1.C1t(r0)
            java.lang.String r0 = r12.A0Z
            boolean r16 = r1.contains(r0)
            X.6oG r1 = r12.A00()
            X.6oG r0 = X.C318046oG.IMAGINE_ME
            r11 = 1
            if (r1 != r0) goto L_0x0139
            if (r16 != 0) goto L_0x0139
            X.0Tu r15 = X.0Tu.A05
            r0 = 36327258594294069(0x810f73002d3935, double:3.0368428409362734E-306)
            boolean r0 = X.182.A06(r15, r6, r0)
            if (r0 == 0) goto L_0x0139
        L_0x0124:
            X.27r r15 = X.27p.A01(r6)
            java.lang.String r14 = r12.A0Z
            java.lang.String r1 = X.AED.A02(r12, r11)
            int r0 = X.AED.A00(r12)
            r15.A1j(r13, r14, r1, r0)
        L_0x0135:
            int r2 = r2 + 1
            goto L_0x00a4
        L_0x0139:
            X.6oG r1 = r12.A00()
            X.6oG r0 = X.C318046oG.AVATAR_SEARCH
            if (r1 != r0) goto L_0x014a
            if (r16 != 0) goto L_0x014a
            boolean r0 = r14.A04()
            if (r0 == 0) goto L_0x014a
            goto L_0x0124
        L_0x014a:
            boolean r0 = r19.CcX()
            if (r0 == 0) goto L_0x015f
            java.lang.Boolean r1 = r12.A0A
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x015f
            if (r16 != 0) goto L_0x015f
            goto L_0x0124
        L_0x015f:
            r11 = 0
            goto L_0x0124
        L_0x0161:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            X.3NM r0 = r11.A03
            r0.A02()
            r0 = 0
            r11.A00 = r0
            android.view.View r1 = r11.A01
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0135
        L_0x0175:
            if (r0 == 0) goto L_0x0082
            goto L_0x006e
        L_0x0179:
            if (r9 == 0) goto L_0x018b
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x018b
            X.A8k r0 = X.A2B.A00
            android.animation.AnimatorSet r1 = r0.A00
            java.util.List r0 = r0.A01
            r1.playSequentially(r0)
            r1.start()
        L_0x018b:
            r1 = -1305812946(0xffffffffb22ae02e, float:-9.946275E-9)
            r0 = r17
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C346797vl.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(-1681877595);
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup2, 1);
        UserSession userSession = this.A00;
        C39770A8k a8k = A2B.A00;
        0qQ.A0B(userSession, 1);
        Context context = viewGroup2.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_horizontal_container, viewGroup2, false);
        0qQ.A0C(inflate, C273654mx.A00(1));
        LinearLayout linearLayout = (LinearLayout) inflate;
        0qQ.A0A(context);
        0qQ.A0B(context, 0);
        int dimensionPixelSize = (int) (((double) context.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_top_margin)) * C346897vw.A00(userSession));
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        linearLayout.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        linearLayout.setGravity(1);
        A51 a51 = new A51(linearLayout);
        int i2 = 0;
        while (true) {
            boolean z = true;
            while (true) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.layout_sticker_sheet_redesign_item, viewGroup2, false);
                if (z) {
                    layoutParams.setMarginEnd((int) (((double) context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material)) * C346897vw.A00(userSession)));
                }
                inflate2.setLayoutParams(layoutParams);
                inflate2.setFocusable(true);
                inflate2.setTag(new C380549Yp(inflate2));
                a51.A01.add(inflate2);
                linearLayout.addView(inflate2);
                i2++;
                if (i2 < 8) {
                    z = false;
                    if (i2 < 7) {
                    }
                } else {
                    linearLayout.setTag(a51);
                    AnonymousClass0fD.A0A(1129249570, A032);
                    return linearLayout;
                }
            }
        }
    }
}
