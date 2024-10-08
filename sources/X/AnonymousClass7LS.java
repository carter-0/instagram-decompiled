package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7LS  reason: invalid class name */
public final class AnonymousClass7LS {
    public final Context A00;
    public final UserSession A01;
    public final User A02;
    public final List A03 = new ArrayList();
    public final AnonymousClass7LR A04;
    public final List A05 = new ArrayList();

    /* JADX WARNING: type inference failed for: r3v8, types: [X.4wf, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0156, code lost:
        if (r11 != null) goto L_0x0158;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A00(X.0mo r28, X.AnonymousClass7L2 r29, X.AnonymousClass7SD r30, boolean r31) {
        /*
            r27 = this;
            r0 = r27
            monitor-enter(r0)
            r5 = 0
            r14 = 1
            r1 = r28
            int r4 = r1.A01     // Catch:{ all -> 0x01fc }
        L_0x0009:
            int r4 = r4 + -1
            r2 = -1
            if (r2 >= r4) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r11 = 0
            goto L_0x002a
        L_0x0011:
            java.lang.Object r3 = r1.A05(r4)     // Catch:{ all -> 0x01fc }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x01fc }
            X.7So r3 = (X.C331837So) r3     // Catch:{ all -> 0x01fc }
            boolean r2 = r3 instanceof X.AnonymousClass7LQ     // Catch:{ all -> 0x01fc }
            if (r2 == 0) goto L_0x0009
            X.7LQ r3 = (X.AnonymousClass7LQ) r3     // Catch:{ all -> 0x01fc }
            X.3su r2 = r3.A0e     // Catch:{ all -> 0x01fc }
            long r2 = r2.C7c()     // Catch:{ all -> 0x01fc }
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x01fc }
        L_0x002a:
            r4 = r30
            X.A5N r2 = r4.A0L     // Catch:{ all -> 0x01fc }
            if (r2 == 0) goto L_0x01fa
            java.lang.Long r2 = r2.A00     // Catch:{ all -> 0x01fc }
            if (r2 == 0) goto L_0x01fa
            long r2 = r2.longValue()     // Catch:{ all -> 0x01fc }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x01fc }
            long r2 = r6.toMicros(r2)     // Catch:{ all -> 0x01fc }
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x01fc }
            if (r8 == 0) goto L_0x01fa
            java.util.List r7 = r0.A03     // Catch:{ all -> 0x01fc }
            boolean r2 = r7.contains(r8)     // Catch:{ all -> 0x01fc }
            if (r2 != 0) goto L_0x01fa
            long r12 = r8.longValue()     // Catch:{ all -> 0x01fc }
            if (r11 == 0) goto L_0x005a
            long r9 = r11.longValue()     // Catch:{ all -> 0x01fc }
            int r2 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x0158
        L_0x005a:
            if (r31 != 0) goto L_0x0156
            X.3Tu r3 = r4.A0H     // Catch:{ all -> 0x01fc }
            boolean r2 = X.C331057Pi.A02(r3)     // Catch:{ all -> 0x01fc }
            if (r2 == 0) goto L_0x0156
            r7.add(r8)     // Catch:{ all -> 0x01fc }
            if (r3 == 0) goto L_0x006a
            goto L_0x006d
        L_0x006a:
            java.lang.Integer r10 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x01fc }
            goto L_0x0075
        L_0x006d:
            boolean r2 = r3.A02()     // Catch:{ all -> 0x01fc }
            if (r2 != r14) goto L_0x006a
            java.lang.Integer r10 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x01fc }
        L_0x0075:
            android.content.Context r6 = r0.A00     // Catch:{ all -> 0x01fc }
            r2 = 2131958845(0x7f131c3d, float:1.9554314E38)
            java.lang.String r9 = r6.getString(r2)     // Catch:{ all -> 0x01fc }
            X.0qQ.A07(r9)     // Catch:{ all -> 0x01fc }
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder     // Catch:{ all -> 0x01fc }
            r8.<init>()     // Catch:{ all -> 0x01fc }
            r2 = 2130971409(0x7f040b11, float:1.7551556E38)
            int r7 = X.2Yu.A0F(r6, r2)     // Catch:{ all -> 0x01fc }
            r2 = 2131238507(0x7f081e6b, float:1.8093295E38)
            android.graphics.drawable.Drawable r4 = r6.getDrawable(r2)     // Catch:{ all -> 0x01fc }
            if (r4 == 0) goto L_0x00be
            android.content.res.Resources r3 = r6.getResources()     // Catch:{ all -> 0x01fc }
            r2 = 2131165207(0x7f070017, float:1.7944625E38)
            int r2 = r3.getDimensionPixelSize(r2)     // Catch:{ all -> 0x01fc }
            r4.setBounds(r5, r5, r2, r2)     // Catch:{ all -> 0x01fc }
            android.graphics.drawable.Drawable r3 = r4.mutate()     // Catch:{ all -> 0x01fc }
            android.graphics.ColorFilter r2 = X.AnonymousClass37O.A00(r7)     // Catch:{ all -> 0x01fc }
            r3.setColorFilter(r2)     // Catch:{ all -> 0x01fc }
            java.lang.String r2 = " "
            r8.append(r2)     // Catch:{ all -> 0x01fc }
            X.46l r3 = new X.46l     // Catch:{ all -> 0x01fc }
            r3.<init>(r4)     // Catch:{ all -> 0x01fc }
            r2 = 33
            r8.setSpan(r3, r5, r14, r2)     // Catch:{ all -> 0x01fc }
        L_0x00be:
            java.lang.String r4 = " "
            r8.append(r4)     // Catch:{ all -> 0x01fc }
            int r3 = r10.intValue()     // Catch:{ all -> 0x01fc }
            r2 = 2131958846(0x7f131c3e, float:1.9554316E38)
            if (r3 == r5) goto L_0x00cf
            r2 = 2131959239(0x7f131dc7, float:1.9555113E38)
        L_0x00cf:
            java.lang.String r3 = r6.getString(r2)     // Catch:{ all -> 0x01fc }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x01fc }
            int r2 = X.2Yu.A07(r6)     // Catch:{ all -> 0x01fc }
            int r7 = r6.getColor(r2)     // Catch:{ all -> 0x01fc }
            java.lang.String r2 = X.002.A0R(r3, r4)     // Catch:{ all -> 0x01fc }
            r8.append(r2)     // Catch:{ all -> 0x01fc }
            int r5 = r8.length()     // Catch:{ all -> 0x01fc }
            if (r2 == 0) goto L_0x0154
            int r2 = r2.length()     // Catch:{ all -> 0x01fc }
        L_0x00ef:
            int r2 = r2 + 1
            int r5 = r5 - r2
            int r4 = r8.length()     // Catch:{ all -> 0x01fc }
            r3 = 2132018632(0x7f1405c8, float:1.9675576E38)
            android.text.style.TextAppearanceSpan r2 = new android.text.style.TextAppearanceSpan     // Catch:{ all -> 0x01fc }
            r2.<init>(r6, r3)     // Catch:{ all -> 0x01fc }
            r3 = 33
            r8.setSpan(r2, r5, r4, r3)     // Catch:{ all -> 0x01fc }
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan     // Catch:{ all -> 0x01fc }
            r2.<init>(r7)     // Catch:{ all -> 0x01fc }
            r8.setSpan(r2, r5, r4, r3)     // Catch:{ all -> 0x01fc }
            r2 = 10
            r8.append(r2)     // Catch:{ all -> 0x01fc }
            r8.append(r9)     // Catch:{ all -> 0x01fc }
            r5 = 2131964884(0x7f1333d4, float:1.9566562E38)
            int r7 = r8.length()     // Catch:{ all -> 0x01fc }
            int r2 = r9.length()     // Catch:{ all -> 0x01fc }
            int r2 = r2 + 1
            int r7 = r7 - r2
            int r4 = r8.length()     // Catch:{ all -> 0x01fc }
            r2 = 2132018053(0x7f140385, float:1.9674402E38)
            android.text.style.TextAppearanceSpan r3 = new android.text.style.TextAppearanceSpan     // Catch:{ all -> 0x01fc }
            r3.<init>(r6, r2)     // Catch:{ all -> 0x01fc }
            r2 = 33
            r8.setSpan(r3, r7, r4, r2)     // Catch:{ all -> 0x01fc }
            android.text.SpannableString r7 = new android.text.SpannableString     // Catch:{ all -> 0x01fc }
            r7.<init>(r8)     // Catch:{ all -> 0x01fc }
            r2 = 2131963729(0x7f132f51, float:1.956422E38)
            java.lang.String r8 = r6.getString(r2)     // Catch:{ all -> 0x01fc }
            r2 = r29
            int r10 = r2.A00     // Catch:{ all -> 0x01fc }
            java.lang.String r9 = r6.getString(r5)     // Catch:{ all -> 0x01fc }
            X.0qQ.A07(r9)     // Catch:{ all -> 0x01fc }
            X.7Kx r2 = r2.A04     // Catch:{ all -> 0x01fc }
            int r11 = r2.A04     // Catch:{ all -> 0x01fc }
            X.7OD r6 = new X.7OD     // Catch:{ all -> 0x01fc }
            r6.<init>(r7, r8, r9, r10, r11, r12, r14)     // Catch:{ all -> 0x01fc }
            goto L_0x01f4
        L_0x0154:
            r2 = 0
            goto L_0x00ef
        L_0x0156:
            if (r11 == 0) goto L_0x01fa
        L_0x0158:
            long r5 = r11.longValue()     // Catch:{ all -> 0x01fc }
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 >= 0) goto L_0x01fa
            r7.add(r8)     // Catch:{ all -> 0x01fc }
            android.content.Context r8 = r0.A00     // Catch:{ all -> 0x01fc }
            r2 = 2131958846(0x7f131c3e, float:1.9554316E38)
            java.lang.String r5 = r8.getString(r2)     // Catch:{ all -> 0x01fc }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x01fc }
            r2 = 2131958845(0x7f131c3d, float:1.9554314E38)
            java.lang.String r3 = r8.getString(r2)     // Catch:{ all -> 0x01fc }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x01fc }
            r2 = 10
            java.lang.String r3 = X.002.A0T(r5, r3, r2)     // Catch:{ all -> 0x01fc }
            r2 = 0
            X.NXr r5 = new X.NXr     // Catch:{ all -> 0x01fc }
            r5.<init>(r3, r2)     // Catch:{ all -> 0x01fc }
            r3 = 2131238507(0x7f081e6b, float:1.8093295E38)
            java.lang.Integer r22 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01fc }
            java.lang.String r18 = "https://help.instagram.com/491565145294150/"
            com.instagram.common.session.UserSession r7 = r0.A01     // Catch:{ all -> 0x01fc }
            java.lang.String r6 = r5.A00(r8)     // Catch:{ all -> 0x01fc }
            r3 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r5 = r8.getString(r3)     // Catch:{ all -> 0x01fc }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x01fc }
            r3 = 32
            java.lang.String r23 = X.002.A0T(r6, r5, r3)     // Catch:{ all -> 0x01fc }
            if (r6 == 0) goto L_0x01f8
            int r6 = r6.length()     // Catch:{ all -> 0x01fc }
        L_0x01aa:
            java.lang.String r3 = " "
            int r3 = r3.length()     // Catch:{ all -> 0x01fc }
            int r6 = r6 + r3
            int r3 = r5.length()     // Catch:{ all -> 0x01fc }
            int r5 = r6 + r3
            X.4wf r3 = new X.4wf     // Catch:{ all -> 0x01fc }
            r3.<init>()     // Catch:{ all -> 0x01fc }
            r3.A01 = r6     // Catch:{ all -> 0x01fc }
            r3.A00 = r5     // Catch:{ all -> 0x01fc }
            java.lang.Integer r16 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x01fc }
            java.lang.String r17 = "#999999"
            X.4wh r15 = new X.4wh     // Catch:{ all -> 0x01fc }
            r19 = r6
            r20 = r5
            r21 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01fc }
            java.util.List r25 = java.util.Collections.singletonList(r3)     // Catch:{ all -> 0x01fc }
            X.0qQ.A07(r25)     // Catch:{ all -> 0x01fc }
            java.lang.String r24 = "cutover_admin_message"
            java.util.List r26 = java.util.Collections.singletonList(r15)     // Catch:{ all -> 0x01fc }
            X.0qQ.A07(r26)     // Catch:{ all -> 0x01fc }
            X.NaW r20 = new X.NaW     // Catch:{ all -> 0x01fc }
            r21 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x01fc }
            X.OZ5 r5 = X.OZ5.A00     // Catch:{ all -> 0x01fc }
            com.instagram.user.model.User r2 = r0.A02     // Catch:{ all -> 0x01fc }
            r6 = r7
            r7 = r4
            r8 = r20
            r9 = r2
            r10 = r12
            X.7LQ r6 = r5.A01(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01fc }
        L_0x01f4:
            r1.A03(r6)     // Catch:{ all -> 0x01fc }
            goto L_0x01fa
        L_0x01f8:
            r6 = 0
            goto L_0x01aa
        L_0x01fa:
            monitor-exit(r0)
            return
        L_0x01fc:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7LS.A00(X.0mo, X.7L2, X.7SD, boolean):void");
    }

    public AnonymousClass7LS(Context context, UserSession userSession, AnonymousClass7LR r4, User user) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = user;
        this.A04 = r4;
    }
}
