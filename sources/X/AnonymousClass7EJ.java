package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.7EJ  reason: invalid class name */
public final class AnonymousClass7EJ implements C328007Db {
    public final UserSession A00;
    public final C71662eb A01;
    public final AnonymousClass7Y0 A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new AnonymousClass9LB(this, 27));

    public AnonymousClass7EJ(UserSession userSession, C71662eb r4, AnonymousClass7Y0 r5) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r4, 2);
        0qQ.A0B(r5, 3);
        this.A00 = userSession;
        this.A01 = r4;
        this.A02 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        if (r20.isEmpty() != false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C3262275x r22) {
        /*
            r21 = this;
            r6 = r21
            X.2eb r1 = r6.A01
            r5 = r22
            if (r22 != 0) goto L_0x000e
            r0 = 8
            r1.A03(r0)
        L_0x000d:
            return
        L_0x000e:
            r4 = 0
            r1.A03(r4)
            android.view.View r3 = r1.A01()
            X.0qQ.A07(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.content.Context r2 = r3.getContext()
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
            boolean r0 = r7 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x0031
            r1 = r7
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r0 = r5.A04
            r1.gravity = r0
            r3.setLayoutParams(r7)
        L_0x0031:
            com.instagram.model.direct.messageid.MessageIdentifier r8 = r5.A08
            if (r8 == 0) goto L_0x0051
            X.7Bo r1 = r5.A06
            X.7Bo r0 = X.C327627Bo.NUX_TYPE_SAVED_REPLY
            if (r1 == r0) goto L_0x0051
            X.7Bo r0 = X.C327627Bo.NUX_TYPE_GET_BARCELONA
            if (r1 == r0) goto L_0x0051
            java.util.List r0 = r5.A0H
            if (r0 == 0) goto L_0x0049
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0051
        L_0x0049:
            X.ANa r0 = new X.ANa
            r0.<init>(r6, r8)
            X.AnonymousClass0fU.A00(r0, r3)
        L_0x0051:
            X.9IV r1 = r5.A05
            java.util.List r0 = r5.A0H
            r20 = r0
            r7 = 0
            if (r0 == 0) goto L_0x0061
            boolean r9 = r20.isEmpty()
            r0 = 0
            if (r9 == 0) goto L_0x0062
        L_0x0061:
            r0 = 1
        L_0x0062:
            r19 = 2
            if (r0 != 0) goto L_0x0185
            int r12 = r5.A01
            r0 = 9
            X.9M5 r11 = new X.9M5
            r11.<init>(r0, r6, r5)
            r0 = r20
            X.0qQ.A0B(r0, r4)
            android.text.SpannableStringBuilder r13 = new android.text.SpannableStringBuilder
            r13.<init>()
            java.util.Iterator r18 = r20.iterator()
            r14 = 0
        L_0x007e:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r10 = r18.next()
            int r17 = r14 + 1
            if (r14 >= 0) goto L_0x0094
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0094:
            X.9JN r10 = (X.AnonymousClass9JN) r10
            r9 = 17
            if (r14 <= 0) goto L_0x00c9
            int r1 = r20.size()
            r0 = 1
            int r1 = r1 - r0
            if (r14 != r1) goto L_0x00c9
            android.text.style.ForegroundColorSpan r14 = new android.text.style.ForegroundColorSpan
            r14.<init>(r12)
            int r16 = r13.length()
            android.text.style.StyleSpan r15 = new android.text.style.StyleSpan
            r15.<init>(r0)
            int r1 = r13.length()
            java.lang.String r0 = " • "
            r13.append(r0)
            int r0 = r13.length()
            r13.setSpan(r15, r1, r0, r9)
            int r1 = r13.length()
            r0 = r16
            r13.setSpan(r14, r0, r1, r9)
        L_0x00c9:
            int r14 = r13.length()
            java.lang.String r0 = r10.A04
            int r1 = r0.length()
            int r1 = r1 + r14
            r13.append(r0)
            X.9ox r0 = new X.9ox
            r0.<init>(r10, r11, r12)
            r13.setSpan(r0, r14, r1, r9)
            r14 = r17
            goto L_0x007e
        L_0x00e2:
            r3.setText(r13)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r3.setMovementMethod(r0)
            r0 = r19
            r3.setMaxLines(r0)
            X.0qQ.A0A(r2)
            int r0 = X.AnonymousClass7PV.A00(r2, r4)
            r3.setMaxWidth(r0)
            if (r8 == 0) goto L_0x0236
            java.lang.String r13 = r8.A01
            java.lang.String r12 = r5.A0D
            java.lang.String r11 = r5.A0E
            java.lang.String r10 = r5.A0F
            java.util.Iterator r14 = r20.iterator()
        L_0x0109:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0236
            java.lang.Object r8 = r14.next()
            X.9JN r8 = (X.AnonymousClass9JN) r8
            java.lang.String r1 = "xma_gen_ai_search_plugin_response_search_engine_attribution"
            java.lang.String r0 = "xma_gen_ai_search_plugin_response_sources"
            java.lang.String[] r1 = new java.lang.String[]{r1, r0}
            java.lang.String r0 = r8.A05
            boolean r0 = X.03t.A0O(r0, r1)
            if (r0 == 0) goto L_0x0109
            X.0eM r0 = r6.A03
            java.lang.Object r8 = r0.getValue()
            X.7I3 r8 = (X.AnonymousClass7I3) r8
            java.util.Set r1 = r8.A02
            boolean r0 = r1.contains(r13)
            if (r0 != 0) goto L_0x0109
            r1.add(r13)
            X.0wc r8 = r8.A01
            r0 = 303(0x12f, float:4.25E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            X.0kJ r0 = r8.A00
            X.0Aj r9 = r8.A00(r0, r1)
            boolean r0 = r9.isSampled()
            if (r0 == 0) goto L_0x0109
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.lang.String r1 = "content_type"
            r0 = 104(0x68, float:1.46E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r8.put(r1, r0)
            if (r12 == 0) goto L_0x0163
            java.lang.String r0 = "agent_id"
            r8.put(r0, r12)
        L_0x0163:
            if (r11 == 0) goto L_0x016a
            java.lang.String r0 = "bot_response_id"
            r8.put(r0, r11)
        L_0x016a:
            if (r10 == 0) goto L_0x0175
            r0 = 1858(0x742, float:2.604E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.put(r0, r10)
        L_0x0175:
            java.lang.String r1 = "surface"
            java.lang.String r0 = "thread"
            r8.put(r1, r0)
            java.lang.String r0 = "extra"
            r9.A9H(r0, r8)
            r9.Cgf()
            goto L_0x0109
        L_0x0185:
            java.lang.CharSequence r0 = r5.A09
            if (r0 == 0) goto L_0x0236
            java.lang.String r14 = r5.A0G
            X.7Bo r10 = r5.A06
            java.lang.Integer r9 = r5.A0B
            if (r14 == 0) goto L_0x02d3
            if (r10 == 0) goto L_0x02d3
            int r13 = r5.A01
            X.ApV r12 = new X.ApV
            r12.<init>(r6, r5, r10)
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>(r0)
            X.9os r0 = new X.9os
            r0.<init>(r13, r12)
            X.AnonymousClass7AV.A05(r11, r0, r14)
            r3.setText(r11)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r3.setMovementMethod(r0)
        L_0x01b1:
            boolean r0 = r5.A0K
            if (r0 == 0) goto L_0x01c4
            r0 = r19
            r3.setMaxLines(r0)
            X.0qQ.A0A(r2)
            int r0 = X.AnonymousClass7PV.A00(r2, r4)
            r3.setMaxWidth(r0)
        L_0x01c4:
            X.7Bo r0 = X.C327627Bo.NUX_TYPE_CHANNEL_XPOSTING_UPSELL
            if (r10 != r0) goto L_0x01dd
            android.content.res.Resources r11 = r2.getResources()
            r0 = 2131165810(0x7f070272, float:1.7945848E38)
            int r0 = r11.getDimensionPixelSize(r0)
            r3.setWidth(r0)
            int r0 = r3.getWidth()
            r3.setMaxWidth(r0)
        L_0x01dd:
            X.7Bo r0 = X.C327627Bo.NUX_TYPE_META_AI_INTENT_DETECTION
            if (r10 != r0) goto L_0x01f8
            X.0qQ.A0A(r2)
            int r0 = X.AnonymousClass7PV.A00(r2, r4)
            r3.setWidth(r0)
            int r0 = r3.getWidth()
            r3.setMaxWidth(r0)
            r0 = 8388613(0x800005, float:1.175495E-38)
            r3.setGravity(r0)
        L_0x01f8:
            X.7Bo r0 = X.C327627Bo.NUX_TYPE_GET_BARCELONA
            if (r10 != r0) goto L_0x0211
            if (r8 == 0) goto L_0x0211
            java.lang.String r0 = r8.A01
            X.7Y0 r11 = r6.A02
            X.7Wh r11 = (X.C332767Wh) r11
            java.lang.String r15 = r8.A00()
            r16 = 1
            java.lang.String r13 = "xma_threads_upsell_nux"
            r12 = r0
            r14 = r7
            r11.AFb(r12, r13, r14, r15, r16)
        L_0x0211:
            X.7Bo r0 = X.C327627Bo.NUX_TYPE_CHANNEL_TRANSLATION
            if (r10 != r0) goto L_0x02a0
            if (r1 == 0) goto L_0x02a0
            X.7Y0 r9 = r6.A02
            X.7XO r9 = (X.AnonymousClass7XO) r9
            X.0qQ.A0A(r2)
            java.lang.Object r8 = r1.A00
            com.instagram.model.direct.messageid.MessageIdentifier r8 = (com.instagram.model.direct.messageid.MessageIdentifier) r8
            java.lang.Object r1 = r1.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r5.A01
            android.text.SpannableString r0 = r9.DkY(r2, r8, r1, r0)
            r3.setText(r0)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r3.setMovementMethod(r0)
        L_0x0236:
            int r0 = r5.A03
            r3.setTextColor(r0)
            X.0qQ.A0A(r2)
            int r0 = r5.A00
            float r0 = X.0nA.A04(r2, r0)
            int r8 = (int) r0
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.setPadding(r8, r0, r8, r4)
            java.lang.Integer r0 = r5.A0C
            if (r0 == 0) goto L_0x02f6
            int r0 = r0.intValue()
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r0)
            if (r1 == 0) goto L_0x02d8
            java.lang.Integer r0 = r5.A0A
            if (r0 == 0) goto L_0x026c
            int r0 = r0.intValue()
            r1.setTint(r0)
        L_0x026c:
            boolean r0 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x000d
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            if (r1 == 0) goto L_0x000d
            android.graphics.Bitmap r9 = r1.getBitmap()
            if (r9 == 0) goto L_0x000d
            android.content.res.Resources r8 = r2.getResources()
            android.content.res.Resources r4 = r2.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            r1 = 2131165184(0x7f070000, float:1.7944578E38)
            int r4 = r4.getDimensionPixelSize(r0)
            android.content.res.Resources r0 = r2.getResources()
            int r1 = r0.getDimensionPixelSize(r1)
            r0 = 1
            android.graphics.Bitmap r1 = X.0fO.A00(r9, r4, r1, r0)
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r8, r1)
            r3.setCompoundDrawablesWithIntrinsicBounds(r0, r7, r7, r7)
            goto L_0x02d8
        L_0x02a0:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r9 != r0) goto L_0x0236
            if (r1 == 0) goto L_0x0236
            X.7Y0 r9 = r6.A02
            X.7XO r9 = (X.AnonymousClass7XO) r9
            X.0qQ.A0A(r2)
            java.lang.Object r8 = r1.A00
            com.instagram.model.direct.messageid.MessageIdentifier r8 = (com.instagram.model.direct.messageid.MessageIdentifier) r8
            java.lang.Object r1 = r1.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r5.A01
            android.text.SpannableString r0 = r9.DkY(r2, r8, r1, r0)
            r3.setText(r0)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r3.setMovementMethod(r0)
            int r0 = X.AnonymousClass7PV.A00(r2, r4)
            r3.setWidth(r0)
            int r0 = r5.A02
            r3.setTextAlignment(r0)
            goto L_0x0236
        L_0x02d3:
            r3.setText(r0)
            goto L_0x01b1
        L_0x02d8:
            android.content.res.Resources r1 = r2.getResources()     // Catch:{ NotFoundException -> 0x02e7 }
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r0 = r1.getDimensionPixelSize(r0)     // Catch:{ NotFoundException -> 0x02e7 }
            r3.setCompoundDrawablePadding(r0)     // Catch:{ NotFoundException -> 0x02e7 }
            goto L_0x02f9
        L_0x02e7:
            X.0wj r2 = X.0wj.A01
            r1 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r0 = "Resource.NotFoundException when getting R.dimen.direct_thread_footer_drawable_padding"
            X.0f9 r0 = r2.AEf(r0, r1)
            r0.report()
            goto L_0x02f9
        L_0x02f6:
            r3.setCompoundDrawablesWithIntrinsicBounds(r7, r7, r7, r7)
        L_0x02f9:
            java.lang.String r7 = r5.A0G
            X.7Bo r1 = r5.A06
            boolean r0 = r5.A0J
            if (r0 == 0) goto L_0x000d
            if (r1 == 0) goto L_0x000d
            if (r7 == 0) goto L_0x000d
            java.lang.CharSequence r0 = r5.A09
            int r4 = r5.A01
            X.ApW r2 = new X.ApW
            r2.<init>(r6, r5, r1)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r0)
            X.9or r0 = new X.9or
            r0.<init>(r4, r2)
            X.AnonymousClass7AV.A05(r1, r0, r7)
            r3.setText(r1)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r3.setMovementMethod(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7EJ.A00(X.75x):void");
    }

    public final View BJd() {
        View view;
        C71662eb r1 = this.A01;
        if (r1.A00 != null) {
            view = r1.A01();
        } else {
            view = r1.A01;
        }
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
