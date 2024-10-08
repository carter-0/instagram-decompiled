package X;

import android.content.Context;
import android.view.View;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.EDq  reason: case insensitive filesystem */
public final class C47707EDq extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return new IgdsButton(context);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        r5.setStyle(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        r5.setStyle(r0);
        r5.setLoading(r7.A0T(false));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A0K(android.view.View r5, X.C307786Rm r6, X.C276544tV r7, java.lang.Object r8) {
        /*
            r4 = this;
            com.instagram.igds.components.button.IgdsButton r5 = (com.instagram.igds.components.button.IgdsButton) r5
            r2 = 0
            X.AnonymousClass7TF.A1H(r5, r6)
            r1 = 2
            X.0qQ.A0B(r7, r1)
            X.C48269Ebo.A00(r7, r5)
            java.lang.String r3 = r7.A0G()
            if (r3 == 0) goto L_0x001a
            int r0 = r3.hashCode()
            switch(r0) {
                case -1170620443: goto L_0x003b;
                case -1114452969: goto L_0x004a;
                case -817598092: goto L_0x0058;
                case -314765822: goto L_0x0063;
                default: goto L_0x001a;
            }
        L_0x001a:
            r0 = 36
            boolean r0 = r7.A0R(r0, r2)
            r0 = r0 ^ 1
            r5.setEnabled(r0)
            r0 = 35
            boolean r0 = r7.A0R(r0, r2)
            r5.setActive(r0)
            r0 = 44
            X.4uI r0 = r7.A0A(r0)
            if (r0 == 0) goto L_0x0039
            X.FPH.A00(r5, r6, r0, r7, r1)
        L_0x0039:
            r0 = 0
            return r0
        L_0x003b:
            r0 = 5207(0x1457, float:7.297E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001a
            X.4lo r0 = X.C273014lo.SECONDARY_LINK
            goto L_0x0054
        L_0x004a:
            java.lang.String r0 = "primary_link"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001a
            X.4lo r0 = X.C273014lo.PRIMARY_LINK
        L_0x0054:
            r5.setStyle(r0)
            goto L_0x001a
        L_0x0058:
            java.lang.String r0 = "secondary"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001a
            X.4lo r0 = X.C273014lo.SECONDARY
            goto L_0x006d
        L_0x0063:
            java.lang.String r0 = "primary"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001a
            X.4lo r0 = X.C273014lo.PRIMARY
        L_0x006d:
            r5.setStyle(r0)
            boolean r0 = r7.A0T(r2)
            r5.setLoading(r0)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47707EDq.A0K(android.view.View, X.6Rm, X.4tV, java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r4, C276544tV r5, Object obj, Object obj2) {
        IgdsButton igdsButton = (IgdsButton) view;
        0qQ.A0B(igdsButton, 0);
        igdsButton.setOnClickListener((View.OnClickListener) null);
        igdsButton.A04 = null;
        igdsButton.setActive(false);
        igdsButton.setStyle(C273014lo.PRIMARY);
        igdsButton.setLoading(false);
        igdsButton.setEnabled(true);
        igdsButton.setSize(C273024lp.MEDIUM);
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public C47707EDq(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }
}
