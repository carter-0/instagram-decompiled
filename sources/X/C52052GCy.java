package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.GCy  reason: case insensitive filesystem */
public final class C52052GCy extends C52050GCw implements C270674h7 {
    public View A00;
    public View A01;
    public ViewStub A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgImageView A05;
    public Integer A06 = AnonymousClass05K.A0C;
    public final Context A07;
    public final UserSession A08;
    public final AnonymousClass4DU A09;
    public final GD6 A0A;
    public final GJY A0B;
    public final C62320sa A0C;
    public final JS0 A0D;
    public final AnonymousClass93T A0E;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C52052GCy r11) {
        /*
            r0 = r11
            java.lang.Integer r1 = r11.A06
            int r3 = r1.intValue()
            r1 = 0
            if (r3 == r1) goto L_0x0169
            r2 = 2
            if (r3 == r2) goto L_0x0169
            r7 = 1
            if (r3 == r7) goto L_0x0018
            r2 = 3
            if (r3 == r2) goto L_0x0018
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0018:
            android.view.View r2 = r11.A00
            X.AnonymousClass7TH.A0R(r2)
            android.view.View r2 = r11.A01
            if (r2 != 0) goto L_0x0057
            android.view.ViewStub r2 = r11.A02
            if (r2 == 0) goto L_0x0166
            android.view.View r5 = r2.inflate()
            if (r5 == 0) goto L_0x0166
            r2 = 2131432373(0x7f0b13b5, float:1.8486502E38)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = X.DbT.A0b(r5, r2)
            r11.A05 = r2
            r2 = 2131432378(0x7f0b13ba, float:1.8486512E38)
            com.instagram.common.ui.base.IgTextView r2 = X.DbT.A0a(r5, r2)
            r11.A04 = r2
            r2 = 2131432369(0x7f0b13b1, float:1.8486494E38)
            com.instagram.common.ui.base.IgTextView r2 = X.DbT.A0a(r5, r2)
            r11.A03 = r2
        L_0x0046:
            r11.A01 = r5
            if (r5 == 0) goto L_0x0057
            X.3MM r4 = X.AnonymousClass3MM.A00
            X.4DU r2 = r11.A09
            java.lang.String r3 = r2.getModuleName()
            java.lang.String r2 = "show empty view"
            r4.A00(r5, r2, r3)
        L_0x0057:
            X.GJY r5 = r11.A0B
            X.0qQ.A0B(r5, r1)
            X.GJY r2 = X.GJY.A09
            boolean r2 = X.AnonymousClass7TF.A1W(r5, r2)
            java.lang.String r4 = "null cannot be cast to non-null type android.app.Activity"
            if (r2 == 0) goto L_0x00df
            java.lang.Integer r3 = r11.A06
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            if (r3 != r2) goto L_0x00df
            android.content.Context r3 = r11.A07
            X.0qQ.A0C(r3, r4)
            X.0qQ.A0B(r3, r1)
            r2 = 2131955473(0x7f130f11, float:1.9547474E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r2 = 9
            X.Ivj r8 = new X.Ivj
            r8.<init>(r3, r2)
            r7 = 0
            r9 = 2131238965(0x7f082035, float:1.8094224E38)
            r10 = 2131955474(0x7f130f12, float:1.9547476E38)
        L_0x0089:
            X.Gkw r5 = new X.Gkw
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x008e:
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r0.A05
            if (r4 == 0) goto L_0x00a5
            android.content.Context r3 = r4.getContext()
            int r2 = r5.A01
            X.DbU.A13(r3, r4, r2)
            r3 = 13
            X.ID3 r2 = new X.ID3
            r2.<init>((int) r3, (java.lang.Object) r5, (java.lang.Object) r4)
            X.AnonymousClass0fU.A00(r2, r4)
        L_0x00a5:
            com.instagram.common.ui.base.IgTextView r4 = r0.A04
            if (r4 == 0) goto L_0x00b2
            android.content.Context r3 = r4.getContext()
            int r2 = r5.A00
            X.DbT.A18(r3, r4, r2)
        L_0x00b2:
            com.instagram.common.ui.base.IgTextView r4 = r0.A03
            if (r4 == 0) goto L_0x00cd
            java.lang.Integer r2 = r5.A02
            if (r2 == 0) goto L_0x00d5
            android.content.Context r3 = r4.getContext()
            int r2 = r2.intValue()
            X.DbT.A18(r3, r4, r2)
            r4.setVisibility(r1)
            r2 = 59
            X.C56801ICy.A01(r4, r2, r5)
        L_0x00cd:
            android.view.View r0 = r0.A01
            if (r0 == 0) goto L_0x00d4
            r0.setVisibility(r1)
        L_0x00d4:
            return
        L_0x00d5:
            r2 = 8
            r4.setVisibility(r2)
            r2 = 0
            r4.setOnClickListener(r2)
            goto L_0x00cd
        L_0x00df:
            X.GJY r2 = X.GJY.A0B
            if (r5 != r2) goto L_0x0107
            java.lang.Integer r3 = r11.A06
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            if (r3 != r2) goto L_0x0107
            android.content.Context r3 = r11.A07
            X.0qQ.A0C(r3, r4)
            X.0qQ.A0B(r3, r1)
            r2 = 2131955502(0x7f130f2e, float:1.9547533E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r2 = 10
            X.Ivj r8 = new X.Ivj
            r8.<init>(r3, r2)
            r7 = 0
            r9 = 2131238506(0x7f081e6a, float:1.8093293E38)
            r10 = 2131955503(0x7f130f2f, float:1.9547535E38)
            goto L_0x0089
        L_0x0107:
            X.GJY r2 = X.GJY.A0C
            if (r5 != r2) goto L_0x0152
            java.lang.Integer r3 = r11.A06
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            if (r3 != r2) goto L_0x0152
            android.content.Context r6 = r11.A07
            X.0qQ.A0C(r6, r4)
            com.instagram.common.session.UserSession r5 = r11.A08
            X.0qQ.A0B(r6, r1)
            X.0Tu r4 = X.DbS.A0J(r5, r7)
            r2 = 36328263613693086(0x81105d00003c9e, double:3.0374784192511E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 == 0) goto L_0x0147
            r2 = 2131955524(0x7f130f44, float:1.9547578E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r8 = 0
            r2 = 11
        L_0x0134:
            X.Ivj r9 = new X.Ivj
            r9.<init>(r6, r2)
            r10 = 2131238156(0x7f081d0c, float:1.8092583E38)
            r11 = 2131955525(0x7f130f45, float:1.954758E38)
            X.Gkw r5 = new X.Gkw
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x008e
        L_0x0147:
            r2 = 2131955523(0x7f130f43, float:1.9547576E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r8 = 0
            r2 = 12
            goto L_0x0134
        L_0x0152:
            X.0sa r7 = r11.A0C
            X.0qQ.A0B(r7, r1)
            r6 = 0
            r9 = 2131237910(0x7f081c16, float:1.8092084E38)
            r10 = 2131963032(0x7f132c98, float:1.9562806E38)
            X.Gkw r5 = new X.Gkw
            r8 = r6
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x008e
        L_0x0166:
            r5 = 0
            goto L_0x0046
        L_0x0169:
            android.view.View r2 = r11.A00
            if (r2 == 0) goto L_0x0170
            r2.setVisibility(r1)
        L_0x0170:
            android.view.View r0 = r11.A01
            X.AnonymousClass7TH.A0R(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52052GCy.A00(X.GCy):void");
    }

    public final void D3s() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r0 != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D3u(X.C52263GLe r4) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.JS0 r1 = r3.A0D
            java.util.List r2 = r4.A09
            boolean r0 = r4.A0D
            boolean r0 = r1.Cn0(r2, r0)
            if (r0 != 0) goto L_0x0037
            X.5u7 r1 = r4.A01
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0023
            X.4sa r0 = r1.BaP()
            boolean r0 = r0.BU8()
            r1 = 1
            if (r0 == 0) goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            X.GD6 r0 = r3.A0A
            X.GBg r0 = r0.A0A
            boolean r0 = r0.A0Z()
            if (r1 == 0) goto L_0x0038
            if (r0 != 0) goto L_0x0038
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
        L_0x0032:
            r3.A06 = r0
            A00(r3)
        L_0x0037:
            return
        L_0x0038:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52052GCy.D3u(X.GLe):void");
    }

    public final void D3r(H3D h3d) {
        if (!this.A0A.A0A.A0Z()) {
            this.A06 = AnonymousClass05K.A01;
        }
        A00(this);
    }

    public final void D3t(C52228GJt gJt) {
        if (!this.A0A.A0A.A0Z()) {
            this.A06 = AnonymousClass05K.A00;
        }
        A00(this);
    }

    public C52052GCy(Context context, UserSession userSession, AnonymousClass4DU r4, GD6 gd6, JS0 js0, AnonymousClass93T r7, GJY gjy, C62320sa r9) {
        C51974G9v.A1M(userSession, r4, r7);
        C51972G9s.A1E(gjy, js0);
        this.A07 = context;
        this.A08 = userSession;
        this.A09 = r4;
        this.A0E = r7;
        this.A0A = gd6;
        this.A0B = gjy;
        this.A0D = js0;
        this.A0C = r9;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.A00 = null;
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A01 = null;
        this.A03 = null;
    }
}
