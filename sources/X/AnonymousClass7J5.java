package X;

import android.content.Context;
import android.text.TextWatcher;

/* renamed from: X.7J5  reason: invalid class name */
public final class AnonymousClass7J5 implements TextWatcher {
    public final /* synthetic */ C329307Ij A00;
    public final /* synthetic */ C329247Id A01;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AnonymousClass7J5(C329307Ij r1, C329247Id r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d7, code lost:
        if (((java.lang.Boolean) r1).booleanValue() != false) goto L_0x00d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r25) {
        /*
            r24 = this;
            r23 = r24
            r0 = r23
            X.7Id r15 = r0.A01
            r3 = 0
            r4 = r25
            X.0qQ.A0B(r4, r3)
            X.7Ia r5 = r15.A02
            X.7Hl r0 = r5.A01
            X.C329067Hl.A0L(r4, r0)
            java.lang.String r11 = r4.toString()
            com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r10 = r0.A0K
            if (r10 == 0) goto L_0x0053
            android.content.Context r9 = r0.A1R
            X.Ats r8 = new X.Ats
            r8.<init>(r0)
            X.0qQ.A0B(r9, r3)
            r6 = 1
            X.0qQ.A0B(r11, r6)
            boolean r1 = r10.A08
            if (r1 == 0) goto L_0x00c0
            X.9JF r1 = r10.A0S
            java.lang.Object r1 = r1.A02
            if (r1 == 0) goto L_0x0053
            java.util.UUID r1 = X.AnonymousClass0HM.A00()
            java.lang.String r7 = r1.toString()
            X.0qQ.A07(r7)
            java.lang.String r6 = r10.A05
            X.0sn r2 = X.0sn.A00
            X.9JF r1 = new X.9JF
            r1.<init>(r6, r7, r2, r2)
            r10.A0S = r1
            java.util.concurrent.Executor r2 = r10.A0D
            X.DHk r1 = new X.DHk
            r1.<init>(r8)
            r2.execute(r1)
        L_0x0053:
            r0.A1C()
            r0.A1E()
            X.7Ij r1 = r0.A0b
            X.7Iv r1 = r1.A0Y
            java.lang.String r1 = r1.A00
            java.lang.String r1 = r1.trim()
            boolean r1 = r1.isEmpty()
            X.C329067Hl.A0l(r0, r1)
            r0.A18()
            r0.A17()
            X.OE7 r7 = r0.A0Y
            if (r7 == 0) goto L_0x01ce
            X.Mhg r8 = r7.A00
            java.util.Set r1 = r8.A00
            if (r1 != 0) goto L_0x0166
            int r1 = r4.length()
            if (r1 <= 0) goto L_0x0166
            java.util.List r2 = r8.A0B
            java.lang.String r1 = "2. List Item"
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>(r1)
            r10 = 1
            r9 = 11
            X.01I r6 = new X.01I
            r6.<init>()
            java.util.Iterator r12 = r2.iterator()
        L_0x0095:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x015a
            java.lang.Object r2 = r12.next()
            X.Mhm r2 = (X.C67071Mhm) r2
            X.OEq r1 = new X.OEq
            r1.<init>(r11, r3, r9, r10)
            java.util.List r1 = r2.AN4(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x00ae:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0095
            java.lang.Object r1 = r2.next()
            java.lang.Class r1 = r1.getClass()
            r6.add(r1)
            goto L_0x00ae
        L_0x00c0:
            boolean r1 = r10.A0A
            if (r1 == 0) goto L_0x011a
            boolean r1 = r10.A09
            if (r1 != 0) goto L_0x00d9
            X.0eM r1 = r10.A0H
            java.lang.Object r1 = r1.getValue()
            X.0qQ.A07(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0053
        L_0x00d9:
            r10.A0A = r3
            java.util.concurrent.atomic.AtomicBoolean r2 = r10.A0E
            boolean r1 = r2.get()
            if (r1 != 0) goto L_0x0107
            boolean r1 = r2.getAndSet(r6)
            if (r1 != 0) goto L_0x0053
            X.4Cq r7 = r10.A07
            r2 = 0
            r1 = 19
            X.MFR r6 = new X.MFR
            r6.<init>(r10, r2, r1)
            X.19B r2 = X.19B.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.1Er r6 = X.1Eo.A03(r1, r2, r6, r7)
            r2 = 13
            X.PqZ r1 = new X.PqZ
            r1.<init>(r10, r2)
            r6.CO3(r1)
            goto L_0x0053
        L_0x0107:
            java.lang.Integer r2 = r10.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r2 != r1) goto L_0x0053
            X.0eM r1 = r10.A0Q
            java.lang.Object r1 = r1.getValue()
            X.MVY r1 = (X.MVY) r1
            r1.EBC()
            goto L_0x0053
        L_0x011a:
            int r1 = r11.length()
            if (r1 != 0) goto L_0x012a
            java.util.UUID r1 = X.AnonymousClass0HM.A00()
            java.lang.String r1 = r1.toString()
            r10.A05 = r1
        L_0x012a:
            java.lang.Integer r2 = r10.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r2 == r1) goto L_0x0149
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            if (r2 != r1) goto L_0x0053
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            r10.A03 = r8
            X.4Cq r7 = r10.A07
            r6 = 0
            r1 = 18
            X.MFR r2 = new X.MFR
            r2.<init>(r10, r6, r1)
            X.19B r1 = X.19B.A00
            X.1Eo.A03(r8, r1, r2, r7)
            goto L_0x0053
        L_0x0149:
            X.4Cq r2 = r10.A07
            r12 = 0
            r13 = 12
            X.MH7 r7 = new X.MH7
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.String) r11, (X.AnonymousClass4D7) r12, (int) r13)
            X.19B r1 = X.19B.A00
            X.1Eo.A05(r1, r7, r2)
            goto L_0x0053
        L_0x015a:
            X.01I r2 = X.0kH.A04(r6)
            java.lang.Class<com.facebook.xapp.messaging.richtext.spans.RichTextForegroundColorSpan> r1 = com.facebook.xapp.messaging.richtext.spans.RichTextForegroundColorSpan.class
            java.util.LinkedHashSet r1 = X.094.A01(r1, r2)
            r8.A00 = r1
        L_0x0166:
            java.util.Set r1 = r8.A00
            if (r1 == 0) goto L_0x0197
            java.util.Iterator r6 = r1.iterator()
        L_0x016e:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0197
            java.lang.Object r2 = r6.next()
            java.lang.Class r2 = (java.lang.Class) r2
            int r1 = r4.length()
            java.lang.Object[] r1 = r4.getSpans(r3, r1, r2)
            if (r1 == 0) goto L_0x016e
            X.0sC r2 = new X.0sC
            r2.<init>(r1)
        L_0x0189:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x016e
            java.lang.Object r1 = r2.next()
            r4.removeSpan(r1)
            goto L_0x0189
        L_0x0197:
            X.Mhg r9 = r7.A00
            X.Mhl r2 = r9.A09
            java.util.List r1 = r9.A0B
            r8 = 1
            java.util.ArrayList r11 = r2.A02(r4, r1, r8)
            java.util.Iterator r10 = r11.iterator()
        L_0x01a6:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x01cb
            java.lang.Object r1 = r10.next()
            X.MqY r1 = (X.C67600MqY) r1
            X.Mhm r2 = r9.A07
            int r7 = r1.A01
            int r6 = r1.A00
            X.OEq r1 = new X.OEq
            r1.<init>(r4, r7, r6, r8)
            java.util.List r1 = r2.AN4(r1)
            java.lang.Object r2 = r1.get(r3)
            r1 = 33
            r4.setSpan(r2, r7, r6, r1)
            goto L_0x01a6
        L_0x01cb:
            r11.isEmpty()
        L_0x01ce:
            X.7Sa r1 = r0.A1i
            X.9H7 r6 = r1.A00
            X.NIE r2 = r6.A0L
            r12 = 1
            if (r2 == 0) goto L_0x01fa
            boolean r1 = r2.isVisible()
            if (r1 != r12) goto L_0x01fa
            X.OsD r1 = r2.A02
            boolean r1 = r1.A0G
            if (r1 != 0) goto L_0x01fa
            r2.onBackPressed()
            X.7Hl r6 = X.AnonymousClass9H7.A06(r6)
            X.7Ij r1 = r6.A0b
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r2 = r1.A0R
            r1 = 0
            r2.setOnFocusChangeListener(r1)
            r2.requestFocus()
            android.view.View$OnFocusChangeListener r1 = r6.A1U
            r2.setOnFocusChangeListener(r1)
        L_0x01fa:
            X.7IU r7 = r0.A1v
            int r1 = r4.length()
            if (r1 <= 0) goto L_0x04a2
            java.lang.Integer r6 = X.AnonymousClass05K.A00
        L_0x0204:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r6 != r1) goto L_0x048c
            java.lang.Integer r2 = r7.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r2 == r1) goto L_0x048c
        L_0x020e:
            X.7Kj r10 = r0.A0i
            if (r10 == 0) goto L_0x02e4
            com.instagram.model.direct.DirectThreadKey r9 = X.C329067Hl.A09(r0)
            boolean r8 = r0.A28
            X.0eM r1 = r10.A0B
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x02e4
            java.lang.String r1 = r4.toString()
            java.lang.CharSequence r1 = X.00l.A0B(r1)
            java.lang.String r7 = r1.toString()
            java.lang.String r1 = r10.A0K
            boolean r1 = X.0qQ.A0K(r1, r7)
            if (r1 != 0) goto L_0x02e4
            r10.A0K = r7
            int r1 = r7.length()
            if (r1 != 0) goto L_0x0254
            r2 = 2147483647(0x7fffffff, float:NaN)
            X.2SP r1 = X.2SP.A01
            int r1 = r1.A05(r2)
            r10.A00 = r1
            android.util.LruCache r1 = r10.A06
            r1.evictAll()
            r10.A03 = r3
        L_0x0254:
            java.lang.String r6 = X.C329827Kj.A00(r10, r9, r7)
            if (r6 == 0) goto L_0x0487
            android.view.ViewGroup r1 = r10.A01
            if (r1 != 0) goto L_0x027a
            android.view.ViewStub r1 = r10.A07
            android.view.View r2 = r1.inflate()
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r2, r1)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r10.A01 = r2
            if (r2 == 0) goto L_0x04a6
            r1 = 2131432394(0x7f0b13ca, float:1.8486544E38)
            android.view.View r1 = r2.findViewById(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            r10.A02 = r1
        L_0x027a:
            java.lang.CharSequence r1 = X.00l.A0B(r6)
            java.lang.String r11 = r1.toString()
            boolean r1 = r10.A03
            if (r1 != 0) goto L_0x02d5
            r10.A03 = r12
            com.instagram.common.session.UserSession r2 = r10.A08
            X.0qQ.A0B(r11, r12)
            X.0wc r13 = X.AnonymousClass0kN.A02(r2)
            java.lang.String r6 = "imagine_prompt_initiated"
            X.0kJ r1 = r13.A00
            X.0Aj r6 = r13.A00(r1, r6)
            boolean r1 = r6.isSampled()
            if (r1 == 0) goto L_0x02d5
            r14 = r8 ^ 1
            r1 = 365(0x16d, float:5.11E-43)
            java.lang.String r13 = X.AnonymousClass000.A00(r1)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r14 == r1) goto L_0x0481
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r6.A8k(r13, r1)
        L_0x02b2:
            java.lang.String r1 = "imagine_prompt_starter"
            r6.AAJ(r1, r11)
            X.XSV r2 = X.C71082Ob1.A00(r2, r9)
            java.lang.String r1 = "thread_type"
            r6.A8M(r2, r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            java.lang.String r1 = "is_e2ee"
            r6.A7p(r1, r2)
            if (r9 == 0) goto L_0x047e
            java.lang.String r2 = r9.A01
        L_0x02cd:
            java.lang.String r1 = "thread_id"
            r6.AAJ(r1, r2)
            r6.Cgf()
        L_0x02d5:
            com.instagram.common.session.UserSession r11 = r10.A08
            android.util.LruCache r1 = r10.A06
            java.lang.Object r1 = r1.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x045c
            X.C329827Kj.A03(r10, r9, r1)
        L_0x02e4:
            androidx.fragment.app.FragmentActivity r7 = r5.A00
            X.792 r1 = r0.A0q
            if (r1 == 0) goto L_0x0344
            X.7Jr r1 = r0.A0e
            if (r1 == 0) goto L_0x0344
            X.7Jt r2 = r1.A00
            X.7Jt r1 = r1.A0F
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0459
            X.7JT r1 = X.AnonymousClass7JT.WRITE_WITH_AI
        L_0x02fa:
            X.7JT r6 = X.AnonymousClass7JT.WRITE_WITH_AI
            if (r1 != r6) goto L_0x033d
            X.7Jr r5 = r0.A0e
            if (r5 == 0) goto L_0x033d
            android.view.ViewGroup r1 = r0.A1V
            if (r1 == 0) goto L_0x033d
            android.content.Context r1 = r0.A1R
            if (r1 == 0) goto L_0x033d
            com.instagram.common.session.UserSession r8 = r0.A1Z
            X.7Jt r2 = r5.A00
            X.7Jt r1 = r5.A0F
            boolean r2 = X.0qQ.A0K(r2, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0318
            r1 = r6
        L_0x0318:
            X.EK9 r6 = new X.EK9
            r6.<init>(r8, r1)
            X.0Tu r5 = X.0Tu.A05
            r1 = 36323513380383962(0x810c0b00082cda, double:3.034474352578756E-306)
            boolean r2 = X.182.A06(r5, r8, r1)
            r1 = 2131440532(0x7f0b3394, float:1.850305E38)
            if (r2 == 0) goto L_0x0330
            r1 = 2131440535(0x7f0b3397, float:1.8503056E38)
        L_0x0330:
            android.view.View r5 = r7.findViewById(r1)
            if (r5 == 0) goto L_0x033d
            X.792 r2 = r0.A0q
            X.79A r1 = X.AnonymousClass79A.ON_USER_TYPING
            r2.A01(r5, r6, r1)
        L_0x033d:
            X.792 r2 = r0.A0q
            X.79A r1 = X.AnonymousClass79A.ON_USER_TYPING
            r2.A00(r7, r1)
        L_0x0344:
            X.7Kr r11 = r0.A0Q
            if (r11 == 0) goto L_0x043a
            com.instagram.common.session.UserSession r13 = r0.A1Z
            X.7L0 r10 = r0.A0U
            X.2Er r9 = r0.A0W
            X.0qQ.A0B(r13, r3)
            boolean r0 = r11.A01
            if (r0 != 0) goto L_0x043a
            java.lang.Integer r0 = r11.A00
            if (r0 != 0) goto L_0x043a
            android.content.Context r8 = r11.A03
            android.view.View r7 = r11.A04
            X.6iJ r14 = r11.A07
            r2 = 4
            X.1Av r6 = X.1Au.A00(r13)
            if (r10 == 0) goto L_0x0456
            if (r9 == 0) goto L_0x0456
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r0 = 11
            int r1 = r1.get(r0)
            r0 = 22
            if (r1 >= r0) goto L_0x0378
            if (r1 > r2) goto L_0x0456
        L_0x0378:
            X.0xa r5 = r6.A01
            java.lang.String r0 = "direct_scheduled_messages_tooltip_seen_count"
            int r0 = r5.getInt(r0, r3)
            if (r0 < r12) goto L_0x0456
            java.lang.String r2 = "direct_scheduled_messages_tooltip_timestamp"
            r0 = 1
            boolean r0 = X.1Av.A07(r6, r2, r0)
            if (r0 == 0) goto L_0x0456
            java.lang.String r2 = "direct_scheduled_messages_banner_timestamp"
            r0 = 7
            boolean r0 = X.1Av.A07(r6, r2, r0)
            if (r0 == 0) goto L_0x0456
            java.lang.String r6 = "direct_scheduled_messages_banner_seen_count"
            int r1 = r5.getInt(r6, r3)
            r0 = 3
            if (r1 >= r0) goto L_0x0456
            boolean r0 = X.C3268378i.A00(r13, r9)
            if (r0 == 0) goto L_0x0456
            r0 = 2131434060(0x7f0b1a4c, float:1.8489923E38)
            android.view.View r0 = r7.findViewById(r0)
            if (r0 == 0) goto L_0x0456
            X.3oV r0 = X.2b1.A01(r0, r3, r3)
            android.view.View r9 = r0.getView()
            r0 = 2131434047(0x7f0b1a3f, float:1.8489897E38)
            android.view.View r1 = r9.findViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131238558(0x7f081e9e, float:1.8093398E38)
            android.graphics.drawable.Drawable r0 = r8.getDrawable(r0)
            r1.setImageDrawable(r0)
            r0 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 8
            r1.setVisibility(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r12 = 2131436153(0x7f0b2279, float:1.8494168E38)
            android.view.View r12 = r9.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r13 = 2131972682(0x7f13524a, float:1.9582378E38)
            java.lang.String r0 = X.C14240TsN.A01(r8, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r8.getString(r13, r0)
            r12.setText(r0)
            r0 = 2132018053(0x7f140385, float:1.9674402E38)
            r12.setTextAppearance(r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.0nA.A0e(r12, r0)
            r0 = 2131431929(0x7f0b11f9, float:1.8485601E38)
            android.view.View r1 = r9.findViewById(r0)
            X.FMw r0 = new X.FMw
            r0.<init>(r7, r14)
            X.AnonymousClass0fU.A00(r0, r1)
            int r0 = r10.A02
            r9.setBackgroundColor(r0)
            X.0xY r7 = r5.AR4()
            int r0 = r5.getInt(r6, r3)
            int r0 = r0 + 1
            r7.E5Z(r6, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r7.E5c(r2, r0)
            r7.apply()
            r14.DUt()
            java.lang.Integer r0 = X.AnonymousClass05K.A0J
            r11.A00 = r0
        L_0x043a:
            int r0 = r4.length()
            if (r0 != 0) goto L_0x0445
            java.util.Set r0 = r15.A04
            r0.clear()
        L_0x0445:
            r0 = r23
            X.7Ij r1 = r0.A00
            X.C329307Ij.A00(r1, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0455
            r0 = 0
            r1.A0B = r0
        L_0x0455:
            return
        L_0x0456:
            r11.A01 = r12
            goto L_0x043a
        L_0x0459:
            r1 = 0
            goto L_0x02fa
        L_0x045c:
            r21 = 0
            r2 = 1789269752(0x6aa616f8, float:1.0039508E26)
            r1 = 3
            X.19S r6 = X.AnonymousClass1HX.A02(r2, r1)
            com.instagram.direct.share.ui.mediacomposer.emuflash.EmuFlashManager$fetchEmuFlashImageAsync$1 r2 = new com.instagram.direct.share.ui.mediacomposer.emuflash.EmuFlashManager$fetchEmuFlashImageAsync$1
            r17 = r11
            r18 = r10
            r19 = r9
            r20 = r7
            r22 = r8
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.19B r1 = X.19B.A00
            X.1Eo.A05(r1, r2, r6)
            goto L_0x02e4
        L_0x047e:
            r2 = 0
            goto L_0x02cd
        L_0x0481:
            r1 = 0
            r6.AAJ(r13, r1)
            goto L_0x02b2
        L_0x0487:
            r10.A04()
            goto L_0x02e4
        L_0x048c:
            java.lang.Integer r1 = r7.A00
            if (r6 == r1) goto L_0x020e
            r7.A00 = r6
            com.instagram.common.session.UserSession r1 = r7.A01
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r1)
            X.7QW r1 = new X.7QW
            r1.<init>(r6)
            r2.A00(r1)
            goto L_0x020e
        L_0x04a2:
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            goto L_0x0204
        L_0x04a6:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7J5.afterTextChanged(android.text.Editable):void");
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C329307Ij r3 = this.A00;
        String charSequence2 = charSequence.toString();
        0qQ.A0B(charSequence2, 0);
        r3.A0Y.A00 = charSequence2;
        C329437Iw r1 = r3.A0W;
        if (!r1.A01) {
            C329247Id r12 = r1.A07;
            if (!(charSequence.length() <= 0 && i == 0 && i2 == 0 && i3 == 0)) {
                r12.A02.A01.A1i.A08(true);
            }
        } else {
            r1.A01 = false;
        }
        Context context = r3.A0S.getContext();
        if (charSequence.length() >= r3.A0G) {
            C59689JTv.A07(context, 2131959800);
        }
    }
}
