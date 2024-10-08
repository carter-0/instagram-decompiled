package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Tv6  reason: case insensitive filesystem */
public final class C14377Tv6 extends C232222tE {
    public final C14378Tv7 A00;
    public final WW4 A01;
    public final UserSession A02;
    public final XBt A03;
    public final X41 A04;
    public final AnonymousClass4DU A05;

    public C14377Tv6(UserSession userSession, WW4 ww4, XBt xBt, X41 x41, AnonymousClass4DU r11, boolean z) {
        0qQ.A0B(userSession, 2);
        this.A01 = ww4;
        this.A02 = userSession;
        this.A05 = r11;
        this.A04 = x41;
        this.A03 = xBt;
        this.A00 = new C14378Tv7(r11, userSession, xBt, x41, z);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0071, code lost:
        if (r11 != null) goto L_0x0073;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r21, X.C249703kE r22) {
        /*
            r20 = this;
            r0 = r22
            r7 = r21
            X.HAV r7 = (X.HAV) r7
            X.UCg r0 = (X.C14852UCg) r0
            r2 = 0
            boolean r10 = X.AnonymousClass7TF.A1U(r2, r7, r0)
            r1 = r20
            X.Tv7 r3 = r1.A00
            X.1Xj r12 = r7.A02
            com.instagram.igds.components.imagebutton.IgImageButton r13 = r0.A01
            com.instagram.common.ui.base.IgTextView r9 = r0.A00
            X.WW4 r6 = r1.A01
            X.0qQ.A0B(r12, r10)
            X.C51974G9v.A1M(r13, r9, r6)
            X.5qq r4 = r7.A02
            X.XBt r0 = r3.A02
            X.5qz r5 = r0.B9n(r7)
            X.X41 r0 = r3.A03
            r15 = r13
            r17 = r4
            r18 = r7
            r19 = r2
            r14 = r0
            r16 = r5
            r14.ECL(r15, r16, r17, r18, r19)
            X.CsU r0 = r7.A01
            if (r0 == 0) goto L_0x0080
            X.Ctl r0 = r0.A00
            if (r0 == 0) goto L_0x0080
            java.lang.String r11 = r0.A01
            int r0 = r11.length()
            if (r0 <= 0) goto L_0x0073
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            char r1 = r11.charAt(r2)
            boolean r0 = java.lang.Character.isLowerCase(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            if (r0 == 0) goto L_0x0066
            r0 = 336(0x150, float:4.71E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            java.lang.String r1 = X.AnonymousClass7TF.A0k(r1)
        L_0x0066:
            r8.append(r1)
            java.lang.String r0 = X.C66580MXl.A0z(r11, r10)
            java.lang.String r11 = X.AnonymousClass7TF.A0l(r0, r8)
            if (r11 == 0) goto L_0x0080
        L_0x0073:
            r9.setText(r11)
            r9.setVisibility(r2)
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r10)
            r9.setTypeface(r0)
        L_0x0080:
            r15 = 6
            X.WBF r8 = new X.WBF
            r14 = r8
            r16 = r7
            r17 = r5
            r18 = r6
            r19 = r12
            r14.<init>((int) r15, (java.lang.Object) r16, (java.lang.Object) r17, (java.lang.Object) r18, (java.lang.Object) r19)
            com.instagram.common.session.UserSession r11 = r3.A01
            r9 = 0
            int r15 = r5.A01
            int r1 = r5.A00
            float r14 = r4.A00
            X.0iw r10 = r3.A00
            boolean r0 = r3.A04
            r18 = r0
            r17 = r2
            r16 = r1
            X.C321466uD.A03(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14377Tv6.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return HAV.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C14852UCg(2Su.A00(layoutInflater, (ViewGroup.LayoutParams) null, viewGroup, R.layout.layout_grid_item_topictiles));
    }
}
