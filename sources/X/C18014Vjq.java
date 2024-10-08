package X;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Vjq  reason: case insensitive filesystem */
public abstract class C18014Vjq {
    public int A00;
    public int A01 = 1;
    public final Context A02;
    public final ConstraintLayout A03;
    public final C18740VzL A04;
    public final Map A05 = new LinkedHashMap();
    public final Map A06 = new LinkedHashMap();

    /* JADX WARNING: type inference failed for: r5v0, types: [X.X82, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.VPj, java.lang.Object] */
    public C18014Vjq(ConstraintLayout constraintLayout) {
        this.A03 = constraintLayout;
        this.A02 = constraintLayout.getContext();
        ? obj = new Object();
        ? obj2 = new Object();
        C18740VzL vzL = new C18740VzL(AnonymousClass7TF.A0D(), constraintLayout, new C18002Vje(obj, 0, 0, 0, false), obj2);
        this.A04 = vzL;
        vzL.A02 = this;
    }

    public final void A01(View view) {
        0qQ.A0B(view, 0);
        VU3 vu3 = (VU3) this.A06.remove(view);
        if (vu3 != null) {
            this.A05.remove(vu3.A01);
            C18740VzL vzL = this.A04;
            int i = vu3.A00;
            Map map = vzL.A09;
            Integer valueOf = Integer.valueOf(i);
            map.remove(valueOf);
            vzL.A0A.add(valueOf);
            vzL.A06.A01(new C17281VPi(vzL));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.Kcs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.Kct} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.Kcs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.Kcs} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.view.View r13, java.lang.String r14, java.lang.String r15) {
        /*
            r12 = this;
            r0 = 0
            r7 = r13
            X.0qQ.A0B(r13, r0)
            if (r14 == 0) goto L_0x0079
            int r0 = r12.A01
            r13.setId(r0)
            int r0 = r12.A01
            int r0 = r0 + 1
            r12.A01 = r0
            r0 = 1
            r13.setImportantForAccessibility(r0)
            if (r15 == 0) goto L_0x001b
            r13.setContentDescription(r15)
        L_0x001b:
            java.util.Map r2 = r12.A05
            java.lang.Object r0 = r2.get(r14)
            if (r0 != 0) goto L_0x008e
            r3 = r12
            X.Utx r3 = (X.C16380Utx) r3
            com.instagram.common.session.UserSession r9 = r3.A03
            java.lang.String r0 = r9.A06
            boolean r0 = X.0qQ.A0K(r0, r14)
            if (r0 == 0) goto L_0x007a
            X.4DH r1 = r3.A01
            boolean r0 = r3.A06
            X.Kct r5 = new X.Kct
            r5.<init>(r13, r1, r9, r0)
            X.0sL r1 = r3.A05
            android.widget.RelativeLayout r0 = r5.A01
            r1.invoke(r0, r5)
        L_0x0040:
            java.lang.String r0 = "empty_key"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x004b
            r2.put(r14, r5)
        L_0x004b:
            java.util.Map r4 = r12.A06
            int r0 = r12.A00
            X.VU3 r3 = new X.VU3
            r3.<init>(r14, r0)
            X.VzL r2 = r12.A04
            int r1 = r3.A00
            java.util.Map r0 = r2.A09
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r1, r5)
            java.util.Set r0 = r2.A0A
            r0.remove(r1)
            X.0mM r1 = r2.A06
            X.VPi r0 = new X.VPi
            r0.<init>(r2)
            r1.A01(r0)
            r4.put(r13, r3)
            int r0 = r12.A00
            int r0 = r0 + 1
            r12.A00 = r0
        L_0x0079:
            return
        L_0x007a:
            com.instagram.user.model.User r11 = X.DbV.A0j(r9, r14)
            X.0iw r8 = r3.A02
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.A03
            android.content.Context r6 = X.AnonymousClass7TE.A0S(r0)
            X.4gL r10 = r3.A04
            X.Kcs r5 = new X.Kcs
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x0040
        L_0x008e:
            java.lang.Object r3 = r2.get(r14)
            X.Us8 r3 = (X.Us8) r3
            if (r3 == 0) goto L_0x0079
            java.util.Map r2 = r12.A06
            android.view.View r1 = r3.A02()
            java.util.Map r0 = X.0u4.A03(r2)
            java.lang.Object r0 = r0.remove(r1)
            if (r0 == 0) goto L_0x0079
            r2.put(r13, r0)
            r3.A03(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18014Vjq.A02(android.view.View, java.lang.String, java.lang.String):void");
    }
}
