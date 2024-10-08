package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* renamed from: X.DjE  reason: case insensitive filesystem */
public final class C46685DjE extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C46685DjE(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0095, code lost:
        com.instagram.simplewebview.SimpleWebViewActivity.A00(r2, r1, X.Dba.A0N(r4.A02));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0047, code lost:
        r2 = X.DbT.A0X(r0);
        r1 = r1.requireContext();
        r0 = "https://help.instagram.com/574047304429005/?ref=learn_more";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0051, code lost:
        r5.A02(r3, r2, new com.instagram.simplewebview.SimpleWebViewConfig((java.lang.String) null, (java.lang.String) null, true, false, false, false, false, true, false, false, true, false, false, false, r4.A02, X.SQU.A01(r1, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0074, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r24) {
        /*
            r23 = this;
            r4 = r23
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x009f;
                case 2: goto L_0x008b;
                case 3: goto L_0x0080;
                case 4: goto L_0x0075;
                case 5: goto L_0x003b;
                case 6: goto L_0x0024;
                case 7: goto L_0x0017;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r0 = r4.A02
            android.net.Uri r1 = X.0cp.A03(r0)
            java.lang.Object r0 = r4.A01
            X.Ob7 r0 = (X.C71084Ob7) r0
            android.content.Context r0 = r0.A04
            X.0kR.A0F(r0, r1)
            return
        L_0x0017:
            X.FEe r5 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r1 = r4.A01
            X.E5g r1 = (X.C47501E5g) r1
            android.content.Context r3 = r1.requireContext()
            X.0eM r0 = r1.A06
            goto L_0x0047
        L_0x0024:
            X.FEe r5 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r1 = r4.A01
            X.E5F r1 = (X.E5F) r1
            android.content.Context r3 = r1.requireContext()
            X.0eM r0 = r1.A04
            X.0lg r2 = X.DbT.A0X(r0)
            android.content.Context r1 = r1.requireContext()
            java.lang.String r0 = "https://help.instagram.com/227486307449481"
            goto L_0x0051
        L_0x003b:
            X.FEe r5 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r1 = r4.A01
            X.E5i r1 = (X.C47503E5i) r1
            android.content.Context r3 = r1.requireContext()
            X.0eM r0 = r1.A06
        L_0x0047:
            X.0lg r2 = X.DbT.A0X(r0)
            android.content.Context r1 = r1.requireContext()
            java.lang.String r0 = "https://help.instagram.com/574047304429005/?ref=learn_more"
        L_0x0051:
            java.lang.String r22 = X.SQU.A01(r1, r0)
            r7 = 0
            java.lang.String r0 = r4.A02
            r9 = 1
            r10 = 0
            com.instagram.simplewebview.SimpleWebViewConfig r6 = new com.instagram.simplewebview.SimpleWebViewConfig
            r8 = r7
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r9
            r15 = r10
            r16 = r10
            r17 = r9
            r18 = r10
            r19 = r10
            r20 = r10
            r21 = r0
            r6.<init>((java.lang.String) r7, (java.lang.String) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19, (boolean) r20, (java.lang.String) r21, (java.lang.String) r22)
            r5.A02(r3, r2, r6)
            return
        L_0x0075:
            java.lang.Object r0 = r4.A01
            X.E4O r0 = (X.E4O) r0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.0wW r1 = r0.A02
            goto L_0x0095
        L_0x0080:
            java.lang.Object r0 = r4.A01
            X.E20 r0 = (X.E20) r0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.0wW r1 = r0.A01
            goto L_0x0095
        L_0x008b:
            java.lang.Object r0 = r4.A01
            X.E3o r0 = (X.C47466E3o) r0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.0wW r1 = r0.A00
        L_0x0095:
            java.lang.String r0 = r4.A02
            com.instagram.simplewebview.SimpleWebViewConfig r0 = X.Dba.A0N(r0)
            com.instagram.simplewebview.SimpleWebViewActivity.A00(r2, r1, r0)
            return
        L_0x009f:
            java.lang.Object r0 = r4.A01
            X.E2Y r0 = (X.E2Y) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r1 = r4.A02
            X.2EG r0 = X.2EG.A2k
            X.SUL r1 = X.Dba.A0J(r3, r2, r0, r1)
            java.lang.String r0 = "ProductEligibilityStatusFragment"
            r1.A0S = r0
            r1.A0A()
            return
        L_0x00bd:
            java.lang.Object r0 = r4.A01
            X.P2g r0 = (X.C72341P2g) r0
            com.instagram.common.session.UserSession r2 = r0.A01
            androidx.fragment.app.FragmentActivity r1 = r0.A00
            java.lang.String r0 = r4.A02
            X.C49845F9k.A00(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46685DjE.onClick(android.view.View):void");
    }

    public final void updateDrawState(TextPaint textPaint) {
        boolean z;
        switch (this.A00) {
            case 1:
                0qQ.A0B(textPaint, 0);
                Context A07 = DbT.A07(this.A01);
                if (A07 != null) {
                    textPaint.setUnderlineText(false);
                    AnonymousClass7TE.A1N(A07, textPaint, 2Yu.A06(A07));
                    return;
                }
                return;
            case 5:
            case 6:
            case 7:
                z = false;
                0qQ.A0B(textPaint, 0);
                super.updateDrawState(textPaint);
                break;
            case 8:
                z = false;
                break;
            default:
                super.updateDrawState(textPaint);
                return;
        }
        textPaint.setUnderlineText(z);
    }
}
