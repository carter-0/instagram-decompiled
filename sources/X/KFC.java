package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class KFC extends C232222tE {
    public final C66531MVj A00;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        r2.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        X.LY1.A00(r2, r0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a6, code lost:
        X.0qQ.A0B(r5, 0);
        r2.A0J(r5, (java.lang.CharSequence) null, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b4, code lost:
        X.LY1.A00(r2, r0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        if (r7 != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r11, X.C249703kE r12) {
        /*
            r10 = this;
            X.LiK r11 = (X.C64800LiK) r11
            X.JoG r12 = (X.C60607JoG) r12
            r3 = 0
            boolean r1 = X.AnonymousClass7TF.A1U(r3, r11, r12)
            X.KiF r9 = r11.A01
            java.lang.String r5 = r11.A02
            boolean r6 = r11.A04
            boolean r7 = r11.A03
            android.view.View$OnClickListener r8 = r11.A00
            X.0qQ.A0B(r9, r3)
            com.instagram.igds.components.textcell.IgdsListCell r2 = r12.A02
            android.content.Context r4 = r12.A00
            int r0 = r9.A00
            java.lang.String r0 = X.AnonymousClass7TE.A16(r4, r0)
            r2.A0I(r0)
            java.lang.Integer r0 = r9.A01
            if (r0 == 0) goto L_0x0032
            int r0 = r0.intValue()
            java.lang.String r0 = X.AnonymousClass7TE.A16(r4, r0)
            r2.A0H(r0)
        L_0x0032:
            int r0 = r9.ordinal()
            r4 = 0
            switch(r0) {
                case 0: goto L_0x006d;
                case 1: goto L_0x006d;
                case 2: goto L_0x003a;
                case 3: goto L_0x003a;
                case 4: goto L_0x003a;
                case 5: goto L_0x0056;
                case 6: goto L_0x0074;
                case 7: goto L_0x0097;
                case 8: goto L_0x007b;
                case 9: goto L_0x0085;
                case 10: goto L_0x0085;
                case 11: goto L_0x00ad;
                case 12: goto L_0x009e;
                case 13: goto L_0x00b8;
                default: goto L_0x003a;
            }
        L_0x003a:
            X.Njo r0 = X.C69349Njo.TYPE_SWITCH
            r2.setTextCellType(r0)
            if (r6 == 0) goto L_0x0044
            r0 = 1
            if (r7 == 0) goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            r2.setChecked(r0)
            if (r7 != 0) goto L_0x0069
            r2.setEnabled(r1)
            X.LsA r0 = new X.LsA
            r0.<init>(r12, r3)
        L_0x0052:
            r2.A0E(r0)
            return
        L_0x0056:
            X.Njo r0 = X.C69349Njo.TYPE_SWITCH
            r2.setTextCellType(r0)
            r2.setChecked(r6)
            java.lang.String r0 = ""
            r2.A0H(r0)
            X.LsA r0 = new X.LsA
            r0.<init>(r12, r1)
            goto L_0x0052
        L_0x0069:
            r2.setEnabled(r3)
            return
        L_0x006d:
            X.Njo r0 = X.C69349Njo.TYPE_CHEVRON
            r2.setTextCellType(r0)
            r0 = 4
            goto L_0x0081
        L_0x0074:
            X.Njo r0 = X.C69349Njo.TYPE_CHEVRON
            r2.setTextCellType(r0)
            r0 = 5
            goto L_0x0081
        L_0x007b:
            X.Njo r0 = X.C69349Njo.TYPE_CHEVRON
            r2.setTextCellType(r0)
            r0 = 6
        L_0x0081:
            X.LY1.A00(r2, r0, r12)
            goto L_0x00a6
        L_0x0085:
            X.Njo r0 = X.C69349Njo.TYPE_SWITCH
            r2.setTextCellType(r0)
            r2.setChecked(r6)
            r1 = 2
            X.LsA r0 = new X.LsA
            r0.<init>(r12, r1)
            r2.A0E(r0)
            goto L_0x00a6
        L_0x0097:
            X.Njo r0 = X.C69349Njo.TYPE_CHEVRON
            r2.setTextCellType(r0)
            r0 = 7
            goto L_0x00b4
        L_0x009e:
            X.Njo r0 = X.C69349Njo.TYPE_CHEVRON
            r2.setTextCellType(r0)
            X.AnonymousClass0fU.A00(r8, r2)
        L_0x00a6:
            X.0qQ.A0B(r5, r3)
            r2.A0J(r5, r4, r3)
            return
        L_0x00ad:
            X.Njo r0 = X.C69349Njo.TYPE_CHEVRON
            r2.setTextCellType(r0)
            r0 = 8
        L_0x00b4:
            X.LY1.A00(r2, r0, r12)
            return
        L_0x00b8:
            X.Njo r0 = X.C69349Njo.TYPE_CHEVRON
            r2.setTextCellType(r0)
            X.0qQ.A0B(r5, r3)
            r2.A0J(r5, r4, r3)
            X.AnonymousClass0fU.A00(r8, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KFC.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C64800LiK.class;
    }

    public KFC(C66531MVj mVj) {
        this.A00 = mVj;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Context A06 = JTU.A06(viewGroup);
        return new C60607JoG(A06, this.A00, new IgdsListCell(A06, (AttributeSet) null));
    }
}
