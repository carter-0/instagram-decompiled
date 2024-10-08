package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.4AO  reason: invalid class name */
public final class AnonymousClass4AO extends C232232tF {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final 2el A02;
    public final AnonymousClass4AF A03;
    public final 1Av A04;
    public final boolean A05;
    public final boolean A06;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.friend_map_item_pog, viewGroup, false);
        0qQ.A07(inflate);
        return new C52573GXy(inflate, this);
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        0qQ.A0B(r3, 0);
        this.A02.A04(r3.itemView);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0136, code lost:
        if (r1.A06 == false) goto L_0x00f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x018f A[LOOP:1: B:56:0x0189->B:58:0x018f, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r21, X.C249703kE r22) {
        /*
            r20 = this;
            r3 = r22
            r4 = r21
            X.4A9 r4 = (X.AnonymousClass4A9) r4
            X.GXy r3 = (X.C52573GXy) r3
            r2 = 0
            X.0qQ.A0B(r4, r2)
            r9 = 1
            X.0qQ.A0B(r3, r9)
            X.30Y r5 = r4.A02
            if (r5 == 0) goto L_0x001d
            r0 = r20
            X.2el r1 = r0.A02
            android.view.View r0 = r3.itemView
            r1.A05(r0, r5)
        L_0x001d:
            X.AnonymousClass3HE.A00()
            X.4AO r1 = r3.A05
            com.instagram.common.session.UserSession r5 = r1.A01
            X.0qQ.A0B(r5, r2)
            com.instagram.friendmap.data.FriendMapRepository r0 = X.AnonymousClass4A3.A00(r5)
            com.instagram.common.typedurl.SimpleImageUrl r8 = r0.A01
            if (r8 == 0) goto L_0x0062
            com.instagram.friendmap.data.FriendMapRepository r0 = X.AnonymousClass4A3.A00(r5)
            boolean r0 = r0.A04
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            r10 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)
            if (r0 == 0) goto L_0x0049
            r6 = 764826648(0x2d965418, float:1.709037E-11)
            java.lang.String r0 = "FriendMap.bindImageView"
            X.0fS.A01(r0, r6)
        L_0x0049:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r3.A03     // Catch:{ all -> 0x01af }
            X.0iw r6 = r1.A00     // Catch:{ all -> 0x01af }
            r0.setUrl(r8, r6)     // Catch:{ all -> 0x01af }
            android.view.View r8 = r3.A00     // Catch:{ all -> 0x01af }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x01af }
            r6 = 8
            if (r7 == 0) goto L_0x005b
            r6 = 0
        L_0x005b:
            r8.setVisibility(r6)     // Catch:{ all -> 0x01af }
            X.C52573GXy.A00(r4, r3, r7)     // Catch:{ all -> 0x01af }
            goto L_0x00a5
        L_0x0062:
            r10 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)
            if (r0 == 0) goto L_0x0072
            r6 = 627635470(0x2568f50e, float:2.020582E-16)
            java.lang.String r0 = "FriendMap.generateAndBindImageView"
            X.0fS.A01(r0, r6)
        L_0x0072:
            X.1q6 r12 = X.AnonymousClass3HE.A00()     // Catch:{ all -> 0x01a4 }
            android.view.View r0 = r3.itemView     // Catch:{ all -> 0x01a4 }
            android.content.Context r13 = r0.getContext()     // Catch:{ all -> 0x01a4 }
            X.0qQ.A07(r13)     // Catch:{ all -> 0x01a4 }
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r3.A03     // Catch:{ all -> 0x01a4 }
            android.content.res.Resources r7 = r0.getResources()     // Catch:{ all -> 0x01a4 }
            r6 = 2131165235(0x7f070033, float:1.7944681E38)
            int r17 = r7.getDimensionPixelSize(r6)     // Catch:{ all -> 0x01a4 }
            java.lang.Integer r15 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x01a4 }
            r7 = 19
            X.JG3 r6 = new X.JG3     // Catch:{ all -> 0x01a4 }
            r6.<init>(r7, r4, r1, r3)     // Catch:{ all -> 0x01a4 }
            r14 = r5
            r16 = r6
            r12.A03(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x01a4 }
            boolean r6 = com.facebook.systrace.Systrace.A0E(r10)
            if (r6 == 0) goto L_0x00b1
            r6 = -1201785324(0xffffffffb85e3614, float:-5.297929E-5)
            goto L_0x00ae
        L_0x00a5:
            boolean r6 = com.facebook.systrace.Systrace.A0E(r10)
            if (r6 == 0) goto L_0x00b1
            r6 = 2059977927(0x7ac8c4c7, float:5.2122525E35)
        L_0x00ae:
            X.0fS.A00(r6)
        L_0x00b1:
            com.instagram.common.ui.base.IgTextView r7 = r3.A01
            int r11 = r4.A03
            if (r11 <= 0) goto L_0x013b
            android.content.res.Resources r10 = r7.getResources()
            r8 = 2131820856(0x7f110138, float:1.9274439E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r6 = r10.getQuantityString(r8, r11, r6)
        L_0x00ca:
            r7.setText(r6)
            boolean r12 = r4.A08
            r11 = 0
            if (r12 != 0) goto L_0x0139
            boolean r6 = r1.A05
            if (r6 != 0) goto L_0x0134
            X.1Av r13 = r1.A04
            long r15 = java.lang.System.currentTimeMillis()
            X.0s0 r10 = r13.A1R
            X.0YZ[] r14 = X.1Av.A8a
            r6 = 506(0x1fa, float:7.09E-43)
            r8 = r14[r6]
            java.lang.Long r6 = java.lang.Long.valueOf(r15)
            r10.Epx(r13, r6, r8)
            X.0s0 r10 = r13.A1Q
            r6 = 505(0x1f9, float:7.08E-43)
            r8 = r14[r6]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r9)
            r10.Epx(r13, r6, r8)
        L_0x00f8:
            r8 = 1
        L_0x00f9:
            com.instagram.common.ui.widget.imageview.IgImageView r6 = r3.A04
            if (r12 != 0) goto L_0x0101
            if (r8 != 0) goto L_0x0101
            r11 = 8
        L_0x0101:
            r6.setVisibility(r11)
            if (r12 == 0) goto L_0x0147
            android.view.View r8 = r3.itemView
            android.content.Context r11 = r8.getContext()
            X.0qQ.A07(r11)
            java.util.List r10 = r4.A06
            r8 = 10
            int r9 = X.0Yv.A1E(r10, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r9)
            java.util.Iterator r10 = r10.iterator()
        L_0x0120:
            boolean r9 = r10.hasNext()
            if (r9 == 0) goto L_0x0158
            java.lang.Object r9 = r10.next()
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            X.MqO r9 = X.C67589MqN.A01(r9)
            r8.add(r9)
            goto L_0x0120
        L_0x0134:
            boolean r6 = r1.A06
            if (r6 != 0) goto L_0x0139
            goto L_0x00f8
        L_0x0139:
            r8 = 0
            goto L_0x00f9
        L_0x013b:
            android.content.res.Resources r8 = r7.getResources()
            r6 = 2131968547(0x7f134223, float:1.9573992E38)
            java.lang.String r6 = r8.getString(r6)
            goto L_0x00ca
        L_0x0147:
            if (r8 == 0) goto L_0x016e
            android.view.View r2 = r3.itemView
            android.content.Context r2 = r2.getContext()
            X.0qQ.A07(r2)
            X.UjL r10 = new X.UjL
            r10.<init>(r2)
            goto L_0x016b
        L_0x0158:
            X.MqT r13 = X.C67595MqT.A00
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            r17 = 3
            r16 = 0
            r18 = 1984(0x7c0, float:2.78E-42)
            X.MqK r10 = new X.MqK
            r15 = r8
            r19 = r2
            r12 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x016b:
            r6.setImageDrawable(r10)
        L_0x016e:
            boolean r2 = X.C324536zU.A00(r5)
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0179
            r8 = 1050253722(0x3e99999a, float:0.3)
        L_0x0179:
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r3.A02
            android.view.View r2 = r3.A00
            android.view.View[] r0 = new android.view.View[]{r0, r5, r2, r7, r6}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0189:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0199
            java.lang.Object r0 = r2.next()
            android.view.View r0 = (android.view.View) r0
            r0.setAlpha(r8)
            goto L_0x0189
        L_0x0199:
            android.view.View r2 = r3.itemView
            X.Mpx r0 = new X.Mpx
            r0.<init>(r4, r1)
            X.AnonymousClass0fU.A00(r0, r2)
            return
        L_0x01a4:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)
            if (r0 == 0) goto L_0x01bc
            r0 = -1649297595(0xffffffff9db1b745, float:-4.7041006E-21)
            goto L_0x01b9
        L_0x01af:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)
            if (r0 == 0) goto L_0x01bc
            r0 = -811380934(0xffffffffcfa34f3a, float:-5.4797568E9)
        L_0x01b9:
            X.0fS.A00(r0)
        L_0x01bc:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4AO.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return AnonymousClass4A9.class;
    }

    public AnonymousClass4AO(AnonymousClass0iw r5, UserSession userSession, 2el r7, AnonymousClass4AF r8) {
        this.A01 = userSession;
        this.A00 = r5;
        this.A02 = r7;
        this.A03 = r8;
        1Av A002 = 1Au.A00(userSession);
        this.A04 = A002;
        this.A05 = ((Boolean) A002.A1Q.CDM(A002, 1Av.A8a[505])).booleanValue();
        this.A06 = 1Av.A07(A002, "friend_map_notes_tray_badge_shown_timestamp", 3);
    }
}
