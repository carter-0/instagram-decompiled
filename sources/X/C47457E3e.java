package X;

import android.view.View;
import com.instagram.android.R;

/* renamed from: X.E3e  reason: case insensitive filesystem */
public final class C47457E3e extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "LearnMoreBottomSheetImpl";
    public C51890G6f A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;

    public final String getModuleName() {
        return "offensive_content_warning";
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final boolean onBackPressed() {
        C51890G6f g6f = this.A00;
        if (g6f == null) {
            return false;
        }
        g6f.D9K();
        return false;
    }

    public C47457E3e() {
        0eO r2 = 0eO.A02;
        this.A03 = AnonymousClass0eN.A00(r2, new C20610Wvr(this, 37));
        this.A04 = AnonymousClass0eN.A00(r2, new C20610Wvr(this, 38));
        this.A01 = AnonymousClass0eN.A00(r2, new C20610Wvr(this, 35));
        this.A02 = AnonymousClass0eN.A00(r2, new C20610Wvr(this, 36));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            r9 = this;
            r0 = 1398241146(0x5357777a, float:9.2542245E11)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r4 = 0
            android.content.Context r8 = X.DbT.A06(r9, r10, r4)
            r0 = 2131625716(0x7f0e06f4, float:1.8878648E38)
            android.view.View r3 = r10.inflate(r0, r11, r4)
            r0 = 2131435368(0x7f0b1f68, float:1.8492576E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r3, r0)
            X.0eM r6 = r9.A01
            java.lang.Object r0 = r6.getValue()
            r7 = 1
            if (r0 == 0) goto L_0x008c
            java.lang.Object r0 = r6.getValue()
            X.9ri r0 = (X.C390709ri) r0
            if (r0 == 0) goto L_0x0044
            int r0 = r0.ordinal()
            if (r0 != r4) goto L_0x0084
            boolean r0 = X.0oI.A09(r8)
            if (r0 == 0) goto L_0x008c
            r1 = 2131953665(0x7f130801, float:1.9543807E38)
            r0 = 2131951625(0x7f130009, float:1.953967E38)
            java.lang.String r0 = r9.getString(r0)
            X.DbX.A1F(r5, r9, r0, r1)
        L_0x0044:
            r0 = 2131435358(0x7f0b1f5e, float:1.8492556E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r3, r0)
            X.0eM r0 = r9.A04
            java.lang.Object r0 = r0.getValue()
            X.9rq r0 = (X.C390789rq) r0
            if (r0 == 0) goto L_0x00a6
            int r0 = r0.ordinal()
            if (r0 == r4) goto L_0x0097
            if (r0 != r7) goto L_0x007c
            java.lang.Object r0 = r6.getValue()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r6.getValue()
            X.9ri r0 = (X.C390709ri) r0
            if (r0 == 0) goto L_0x00a6
            int r0 = r0.ordinal()
            if (r0 == r4) goto L_0x0093
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            r0 = 1691176064(0x64cd4c80, float:3.029676E22)
        L_0x0078:
            X.AnonymousClass0fD.A09(r0, r2)
            throw r1
        L_0x007c:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            r0 = 1726085560(0x66e1f9b8, float:5.3356948E23)
            goto L_0x0078
        L_0x0084:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            r0 = -160006633(0xfffffffff6767e17, float:-1.24986566E33)
            goto L_0x0078
        L_0x008c:
            r0 = 2131968761(0x7f1342f9, float:1.9574426E38)
            r5.setText(r0)
            goto L_0x0044
        L_0x0093:
            r1 = 2131968758(0x7f1342f6, float:1.957442E38)
            goto L_0x00a3
        L_0x0097:
            boolean r0 = X.0oI.A09(r8)
            r1 = 2131968757(0x7f1342f5, float:1.9574418E38)
            if (r0 == 0) goto L_0x00a3
            r1 = 2131953664(0x7f130800, float:1.9543805E38)
        L_0x00a3:
            r5.setText(r1)
        L_0x00a6:
            r0 = 2131435359(0x7f0b1f5f, float:1.8492558E38)
            android.widget.TextView r5 = X.AnonymousClass7TE.A0d(r3, r0)
            if (r5 == 0) goto L_0x00e0
            r5.setVisibility(r4)
            r0 = 2131968759(0x7f1342f7, float:1.9574422E38)
            java.lang.String r0 = r9.getString(r0)
            android.text.SpannableStringBuilder r4 = X.DbS.A0C(r0)
            int r1 = X.DbV.A02(r8)
            X.ESx r0 = new X.ESx
            r0.<init>((X.C47457E3e) r9, (int) r1)
            X.Dba.A0x(r4, r0)
            X.DbT.A1H(r5)
            r0 = 2131968760(0x7f1342f8, float:1.9574424E38)
            java.lang.String r0 = r9.getString(r0)
            android.text.SpannableStringBuilder r1 = X.DbZ.A0B(r0, r4)
            java.lang.String r0 = "."
            android.text.SpannableStringBuilder r0 = r1.append(r0)
            r5.setText(r0)
        L_0x00e0:
            r0 = 1550701831(0x5c6dd507, float:2.67775182E17)
            X.AnonymousClass0fD.A09(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47457E3e.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1858772486);
        super.onResume();
        View view = this.mView;
        if (view != null) {
            2eQ.A06(view.findViewById(R.id.learn_more_title), 500);
            AnonymousClass0fD.A09(-1266622204, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-747979172, A022);
        throw A0y;
    }
}
