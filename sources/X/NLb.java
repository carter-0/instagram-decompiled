package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class NLb extends C231632rz {
    public OJU A00;
    public Context A01;
    public UserSession A02;
    public final View.OnClickListener A03 = new C71407Ok6(this, 69);

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public NLb(Context context, UserSession userSession, OJU oju) {
        this.A01 = context;
        this.A00 = oju;
        this.A02 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0044, code lost:
        if (r12.A01 == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r9, android.view.View r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r8 = this;
            r0 = 1344054315(0x501ca42b, float:1.05120184E10)
            int r5 = X.AnonymousClass0fD.A03(r0)
            com.instagram.igds.components.textcell.IgdsListCell r10 = (com.instagram.igds.components.textcell.IgdsListCell) r10
            X.OMj r11 = (X.C70814OMj) r11
            X.Npv r12 = (X.C69673Npv) r12
            X.OJU r1 = r8.A00
            android.view.View$OnClickListener r6 = r8.A03
            com.instagram.common.session.UserSession r0 = r8.A02
            boolean r0 = X.C69903Nu5.A00(r0)
            r7 = r0 ^ 1
            X.AnonymousClass7TG.A1N(r10, r11)
            r3 = 2
            X.AnonymousClass7TG.A0w(r3, r12, r1, r6)
            r0 = 7
            X.Ojy r4 = new X.Ojy
            r4.<init>(r0, r1, r11, r10)
            r0 = 3
            X.Ol0 r2 = new X.Ol0
            r2.<init>(r0, r11, r1)
            boolean r1 = r12.A00
            r0 = 1050253722(0x3e99999a, float:0.3)
            if (r1 == 0) goto L_0x0035
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0035:
            r10.setAlpha(r0)
            boolean r0 = r12.A00
            r10.setButtonUIEnabled(r0)
            boolean r0 = r12.A00
            if (r0 == 0) goto L_0x0046
            boolean r1 = r12.A01
            r0 = 1
            if (r1 != 0) goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            r10.setChecked(r0)
            boolean r0 = r12.A00
            if (r0 == 0) goto L_0x004f
            r6 = r4
        L_0x004f:
            X.AnonymousClass0fU.A00(r6, r10)
            r10.A0D(r2)
            java.lang.String r0 = r11.A02
            X.0qQ.A07(r0)
            r10.A0I(r0)
            java.lang.String r1 = r11.A03
            if (r7 == 0) goto L_0x006f
            if (r1 == 0) goto L_0x006f
            int r0 = r1.length()
            if (r0 == 0) goto L_0x006f
            r10.A0H(r1)
            r10.setSubtitleMaxLine(r3)
        L_0x006f:
            r0 = 1050739948(0x3ea104ec, float:0.31449068)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NLb.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(-2138843430);
        Context context = this.A01;
        0qQ.A0B(context, 0);
        IgdsListCell A0d = C66581MXm.A0d(context);
        A0d.setTextCellType(C69349Njo.TYPE_CHECKBOX);
        AnonymousClass0fD.A0A(1787506222, A032);
        return A0d;
    }
}
