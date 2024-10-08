package X;

import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.text.TightTextView;
import java.util.List;

/* renamed from: X.768  reason: invalid class name */
public final class AnonymousClass768 implements AnonymousClass7D2 {
    @Deprecated
    public boolean A00 = false;
    public final AnonymousClass7XR A01;
    public final AnonymousClass9HC A02;
    public final AnonymousClass7DZ A03;
    @Deprecated
    public final View.OnClickListener A04 = new AnonymousClass76K(this);
    public final C255763ug A05 = new AnonymousClass76H(this);
    public final C255763ug A06 = new AnonymousClass76J(this);
    public final C255763ug A07 = new AnonymousClass76I(this);

    /* renamed from: A02 */
    public final void FIP(AnonymousClass76M r5) {
        TightTextView tightTextView;
        TextView textView = r5.A03;
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            C3271479o.A01((Spannable) text);
        }
        AnonymousClass9HC r1 = this.A02;
        if (r1.A1V && A01(textView, text)) {
            textView.setOnClickListener((View.OnClickListener) null);
            if (r1.A1U) {
                textView.clearAnimation();
            }
        }
        if ((textView instanceof TightTextView) && (tightTextView = (TightTextView) textView) != null) {
            tightTextView.A01 = true;
        }
        AnonymousClass76O r0 = r5.A04;
        r0.A01 = null;
        AnonymousClass76P r12 = r0.A03;
        if (r12.A00) {
            r12.A01.removeCallbacksAndMessages((Object) null);
            r12.A00 = false;
        }
        this.A03.A01(r5);
    }

    /* JADX WARNING: type inference failed for: r0v52, types: [X.79l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: A03 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ADp(X.AnonymousClass76M r26, X.AnonymousClass79c r27) {
        /*
            r25 = this;
            X.79f r12 = new X.79f
            r14 = r26
            r13 = r27
            r12.<init>(r14, r13)
            X.7FU r0 = r13.A00
            r24 = r0
            java.lang.String r11 = r24.CBF()
            java.lang.CharSequence r10 = r13.A04
            r15 = r25
            X.7XR r9 = r15.A01
            r7 = 0
            if (r9 == 0) goto L_0x0192
            r0 = r9
            X.7Wq r0 = (X.C332857Wq) r0
            X.7NT r8 = r0.BeR()
        L_0x0021:
            boolean r0 = r10 instanceof android.text.Spannable
            if (r0 == 0) goto L_0x0036
            if (r9 == 0) goto L_0x0133
            r0 = r9
            X.7Xr r0 = (X.C333107Xr) r0
            boolean r0 = r0.CPk()
            if (r0 == 0) goto L_0x0133
            r0 = r10
            android.text.Spannable r0 = (android.text.Spannable) r0
            X.C3271479o.A01(r0)
        L_0x0036:
            android.widget.TextView r3 = r14.A03
            if (r8 != 0) goto L_0x012f
            X.5FV r0 = X.AnonymousClass5FV.None
        L_0x003c:
            boolean r2 = r13.A0F
            android.content.Context r1 = r3.getContext()
            X.0qQ.A07(r1)
            int r1 = X.AnonymousClass7PV.A00(r1, r2)
            r3.setMaxWidth(r1)
            android.graphics.drawable.Drawable r1 = r14.A02
            X.C3271479o.A00(r1, r3, r0, r13)
            boolean r0 = r13.A0G
            r4 = 1
            if (r0 == 0) goto L_0x010f
            r1 = 0
            boolean r0 = r3 instanceof com.instagram.common.ui.text.TightTextView
            if (r0 == 0) goto L_0x0062
            r0 = r3
            com.instagram.common.ui.text.TightTextView r0 = (com.instagram.common.ui.text.TightTextView) r0
            if (r0 == 0) goto L_0x0062
            r0.A01 = r1
        L_0x0062:
            X.76O r5 = r14.A04
            boolean r0 = r13.A09
            r5.A02 = r0
            X.Mhg r0 = r13.A01
            r5.A00 = r0
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r13.BSG()
            java.lang.String r2 = r0.A01
            X.79s r1 = r5.A01
            if (r1 == 0) goto L_0x010c
            java.lang.String r0 = r1.A03
        L_0x0078:
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x00fa
            r1.A00(r10)
        L_0x0081:
            X.76P r1 = r5.A03
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x008a
            r1.run()
        L_0x008a:
            boolean r1 = r24.CU2()
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r1 == 0) goto L_0x0096
            r0 = 8388613(0x800005, float:1.175495E-38)
        L_0x0096:
            r3.setGravity(r0)
        L_0x0099:
            X.9HC r2 = r15.A02
            boolean r0 = r2.A1V
            if (r0 == 0) goto L_0x00f1
            boolean r0 = A01(r3, r10)
            if (r0 == 0) goto L_0x00f1
            android.view.ViewParent r1 = r3.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x00b5
            android.view.View r1 = (android.view.View) r1
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            X.0nA.A0n(r3, r1, r0)
        L_0x00b5:
            android.view.View$OnClickListener r0 = r15.A04
            X.AnonymousClass0fU.A00(r0, r3)
            X.1Av r1 = r9.CCu()
            boolean r0 = r2.A1U
            if (r0 == 0) goto L_0x00f1
            boolean r0 = r15.A00
            if (r0 != 0) goto L_0x00f1
            if (r1 == 0) goto L_0x00f1
            X.0xa r1 = r1.A01
            java.lang.String r0 = "barcelona_easter_egg_direct_animation_message_id_set"
            java.util.Set r0 = r1.C1t(r0)
            boolean r0 = r0.contains(r11)
            if (r0 != 0) goto L_0x00f1
            r15.A00 = r4
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r4 = new android.os.Handler
            r4.<init>(r0)
            X.Pab r2 = new X.Pab
            r2.<init>(r3, r15, r11)
            boolean r0 = r24.CU2()
            if (r0 == 0) goto L_0x00f7
            r0 = 1000(0x3e8, double:4.94E-321)
        L_0x00ee:
            r4.postDelayed(r2, r0)
        L_0x00f1:
            X.7DZ r0 = r15.A03
            r0.A02(r14, r13)
            return
        L_0x00f7:
            r0 = 500(0x1f4, double:2.47E-321)
            goto L_0x00ee
        L_0x00fa:
            int r0 = r10.length()
            int r1 = r0 + -1
            X.79s r0 = new X.79s
            r0.<init>(r5, r2, r1)
            r0.A00(r10)
            r5.A01 = r0
            goto L_0x0081
        L_0x010c:
            r0 = 0
            goto L_0x0078
        L_0x010f:
            boolean r0 = r3 instanceof com.instagram.common.ui.text.TightTextView
            if (r0 == 0) goto L_0x011a
            r0 = r3
            com.instagram.common.ui.text.TightTextView r0 = (com.instagram.common.ui.text.TightTextView) r0
            if (r0 == 0) goto L_0x011a
            r0.A01 = r4
        L_0x011a:
            X.76O r0 = r14.A04
            r2 = 0
            r0.A01 = r2
            X.76P r1 = r0.A03
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0099
            android.os.Handler r0 = r1.A01
            r0.removeCallbacksAndMessages(r2)
            r0 = 0
            r1.A00 = r0
            goto L_0x0099
        L_0x012f:
            X.5FV r0 = r13.A00
            goto L_0x003c
        L_0x0133:
            X.9HC r0 = r15.A02
            boolean r0 = r0.A1Y
            if (r0 == 0) goto L_0x0146
            X.79k r7 = new X.79k
            r7.<init>(r15, r13)
            if (r8 == 0) goto L_0x0146
            X.79l r0 = new X.79l
            r0.<init>(r8, r7, r11)
            r7 = r0
        L_0x0146:
            X.79m r1 = new X.79m
            r1.<init>(r15, r13)
            X.79n r2 = new X.79n
            r2.<init>(r15, r11)
            r6 = r10
            android.text.Spannable r6 = (android.text.Spannable) r6
            if (r8 == 0) goto L_0x0189
            X.3ug r0 = r15.A05
            X.79l r5 = new X.79l
            r5.<init>(r8, r0, r11)
            X.3ug r0 = r15.A07
            X.79l r4 = new X.79l
            r4.<init>(r8, r0, r11)
            X.79l r3 = new X.79l
            r3.<init>(r8, r2, r11)
            X.79l r2 = new X.79l
            r2.<init>(r8, r1, r11)
            X.3ug r1 = r15.A06
            X.79l r0 = new X.79l
            r0.<init>(r8, r1, r11)
        L_0x0174:
            r21 = r0
            r22 = r7
            r23 = r12
            r19 = r3
            r20 = r2
            r18 = r4
            r17 = r5
            r16 = r6
            X.C3271479o.A02(r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0036
        L_0x0189:
            X.3ug r5 = r15.A05
            X.3ug r4 = r15.A07
            r3 = r2
            r2 = r1
            X.3ug r0 = r15.A06
            goto L_0x0174
        L_0x0192:
            r8 = r7
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass768.ADp(X.76M, X.79c):void");
    }

    public AnonymousClass768(AnonymousClass7XR r2, AnonymousClass9HC r3, List list) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = new AnonymousClass7DZ(list);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.7XR, X.7XA, java.lang.Object, X.7XN, X.7XX] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass768 A00(X.AnonymousClass7XR r9, X.AnonymousClass9HC r10) {
        /*
            r8 = 2131431794(0x7f0b1172, float:1.8485327E38)
            r7 = r10
            X.0eM r1 = r10.A07
            r1.getClass()
            X.769 r0 = new X.769
            r0.<init>(r1)
            X.76A r3 = new X.76A
            r6 = r9
            r3.<init>(r9, r0)
            X.7DT r4 = new X.7DT
            r4.<init>(r9)
            boolean r0 = r10.A1X
            X.7DV r5 = new X.7DV
            r5.<init>(r9, r0)
            X.7DX r2 = new X.7DX
            r2.<init>(r9)
            X.76F r1 = new X.76F
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            X.76G r0 = new X.76G
            r0.<init>(r9)
            X.7DY[] r0 = new X.AnonymousClass7DY[]{r1, r0}
            java.util.List r1 = X.0sr.A1P(r0)
            X.768 r0 = new X.768
            r0.<init>(r9, r10, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass768.A00(X.7XR, X.9HC):X.768");
    }

    @Deprecated
    public static boolean A01(TextView textView, CharSequence charSequence) {
        String charSequence2;
        CharSequence A002 = C2364433t.A00(textView, charSequence);
        if (A002 == null || (charSequence2 = A002.toString()) == null) {
            return false;
        }
        if (charSequence2.equals("🎫") || charSequence2.equals("🎟️") || charSequence2.equals("🎟") || charSequence2.equals("🧵") || charSequence2.equals("@")) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass76M r1 = new AnonymousClass76M((TextView) layoutInflater.inflate(R.layout.direct_text_message_text_view, viewGroup, false));
        this.A03.A00(r1);
        return r1;
    }
}
