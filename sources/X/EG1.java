package X;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsFooterCell;

public final class EG1 extends C232222tE {
    public final AnonymousClass4DH A00;
    public final UserSession A01;

    public EG1(AnonymousClass4DH r2, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = r2;
        this.A01 = userSession;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: android.text.SpannableStringBuilder} */
    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.common.accessibility.AccessibleTextView, android.widget.TextView] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00d9, code lost:
        X.AnonymousClass7AV.A05(r2, r1, r9);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00e5, code lost:
        r2 = X.AnonymousClass7TE.A16(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00e9, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0100, code lost:
        r5.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0103, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r11, X.C249703kE r12) {
        /*
            r10 = this;
            X.FY7 r11 = (X.FY7) r11
            X.DpT r12 = (X.C47036DpT) r12
            r0 = 0
            boolean r3 = X.AnonymousClass7TF.A1U(r0, r11, r12)
            java.lang.Integer r9 = r11.A00
            java.lang.String r4 = r11.A01
            r8 = 0
            X.0qQ.A0B(r9, r0)
            com.instagram.igds.components.textcell.IgdsFooterCell r5 = r12.A03
            android.content.Context r7 = r12.A00
            int r0 = X.C47036DpT.A00(r9, r4)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r7, r0)
            r5.A00(r0)
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            X.0qQ.A07(r1)
            com.instagram.common.accessibility.AccessibleTextView r0 = r5.A02
            r0.setMovementMethod(r1)
            int r0 = r9.intValue()
            switch(r0) {
                case 1: goto L_0x00ec;
                case 2: goto L_0x00ec;
                case 3: goto L_0x00ec;
                case 4: goto L_0x0088;
                case 5: goto L_0x00e2;
                case 6: goto L_0x0088;
                case 7: goto L_0x005c;
                case 8: goto L_0x0033;
                case 9: goto L_0x004e;
                case 10: goto L_0x0049;
                case 11: goto L_0x0034;
                default: goto L_0x0033;
            }
        L_0x0033:
            return
        L_0x0034:
            r0 = 2131954165(0x7f1309f5, float:1.9544822E38)
            java.lang.String r9 = X.AnonymousClass7TE.A16(r7, r0)
            r0 = 2131954187(0x7f130a0b, float:1.9544866E38)
            android.text.SpannableStringBuilder r2 = X.DbY.A0D(r7, r9, r0)
            X.Dj8 r1 = new X.Dj8
            r1.<init>(r7, r3)
            goto L_0x00d9
        L_0x0049:
            r0 = 2131969173(0x7f134495, float:1.9575261E38)
            goto L_0x00e5
        L_0x004e:
            X.4DH r0 = r12.A01
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            com.instagram.common.session.UserSession r0 = r12.A02
            android.text.SpannableStringBuilder r2 = X.C49950FGf.A00(r1, r0)
            goto L_0x00e9
        L_0x005c:
            r0 = 2131964896(0x7f1333e0, float:1.9566587E38)
            java.lang.String r6 = X.AnonymousClass7TE.A16(r7, r0)
            X.4DH r1 = r12.A01
            androidx.fragment.app.FragmentActivity r4 = r1.requireActivity()
            com.instagram.common.session.UserSession r3 = r12.A02
            int r0 = X.C48726EjB.A00(r9)
            java.lang.String r2 = X.DbW.A0h(r7, r6, r0)
            java.lang.String r1 = r1.getModuleName()
            r0 = 6
            X.0qQ.A0B(r1, r0)
            X.DjK r0 = new X.DjK
            r0.<init>(r3, r4, r1, r8)
            android.text.SpannableStringBuilder r2 = X.DbS.A0C(r2)
            X.AnonymousClass7AV.A05(r2, r0, r6)
            goto L_0x0100
        L_0x0088:
            X.4DH r0 = r12.A01
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            com.instagram.common.session.UserSession r7 = r12.A02
            java.lang.String r2 = r0.getModuleName()
            java.lang.String r0 = "story"
            boolean r1 = r4.equals(r0)
            r0 = 3
            X.0qQ.A0B(r2, r0)
            r0 = 2131952887(0x7f1304f7, float:1.954223E38)
            java.lang.String r9 = X.AnonymousClass7TE.A16(r6, r0)
            r0 = 2131952888(0x7f1304f8, float:1.9542231E38)
            if (r1 == 0) goto L_0x00ad
            r0 = 2131952889(0x7f1304f9, float:1.9542233E38)
        L_0x00ad:
            java.lang.String r4 = X.DbY.A0c(r6, r9, r0)
            X.2nI r3 = X.DbY.A0L(r6, r7, r2)
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
            java.util.BitSet r0 = X.DbS.A0w(r8)
            int r0 = r0.nextClearBit(r8)
            if (r0 < r8) goto L_0x00dd
            X.0sm r2 = X.0Yt.A0E()
            java.util.Map r1 = X.0Yt.A0B(r1)
            X.FRD r0 = new X.FRD
            r0.<init>(r1, r2)
            X.DjL r1 = new X.DjL
            r1.<init>(r6, r0, r3, r7)
            android.text.SpannableStringBuilder r2 = X.DbS.A0C(r4)
        L_0x00d9:
            X.AnonymousClass7AV.A05(r2, r1, r9)
            goto L_0x00e9
        L_0x00dd:
            java.lang.IllegalStateException r0 = X.DbT.A0n()
            throw r0
        L_0x00e2:
            r0 = 2131960789(0x7f1323d5, float:1.9558257E38)
        L_0x00e5:
            java.lang.String r2 = X.AnonymousClass7TE.A16(r7, r0)
        L_0x00e9:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            goto L_0x0100
        L_0x00ec:
            X.4DH r0 = r12.A01
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.common.session.UserSession r2 = r12.A02
            java.lang.String r1 = r0.getModuleName()
            int r0 = X.C47036DpT.A00(r9, r4)
            android.text.SpannableStringBuilder r2 = X.C49946FGa.A02(r3, r2, r1, r0)
        L_0x0100:
            r5.A00(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EG1.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return FY7.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        DbS.A1W(viewGroup);
        return new C47036DpT(this.A00, this.A01, new IgdsFooterCell(AnonymousClass7TE.A0S(viewGroup), (AttributeSet) null));
    }
}
