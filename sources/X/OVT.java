package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.icebreaker.DirectIceBreakerSettingFragment;

public final class OVT {
    public final Activity A00;
    public final Context A01;
    public final 1Ng A02;
    public final 1wn A03;
    public final UserSession A04;
    public final DirectIceBreakerSettingFragment A05;
    public final C70932OSf A06;
    public final OyN A07;
    public final String A08;

    public static void A00(DirectIceBreakerSettingFragment directIceBreakerSettingFragment) {
        2dZ.A0t.A03(directIceBreakerSettingFragment.A03).EVS(true);
        directIceBreakerSettingFragment.setItems(directIceBreakerSettingFragment.A06.A01());
    }

    public OVT(Activity activity, Context context, 1Ng r5, UserSession userSession, DirectIceBreakerSettingFragment directIceBreakerSettingFragment, C70932OSf oSf, OyN oyN, String str) {
        C51974G9v.A1P(userSession, context, activity, oyN);
        C51973G9u.A0s(5, r5, oSf, str);
        this.A04 = userSession;
        this.A01 = context;
        this.A00 = activity;
        this.A07 = oyN;
        this.A02 = r5;
        this.A05 = directIceBreakerSettingFragment;
        this.A06 = oSf;
        this.A08 = str;
        C71932OtG A002 = C71932OtG.A00(this, 13);
        this.A03 = A002;
        r5.A01(A002, C71889OsX.class);
    }

    /* JADX WARNING: type inference failed for: r10v4, types: [X.NgI, X.Oak] */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x016a, code lost:
        if (r1 != 4) goto L_0x016c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A01() {
        /*
            r21 = this;
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            r8 = 2131959391(0x7f131e5f, float:1.9555421E38)
            r2 = r21
            X.OyN r5 = r2.A07
            boolean r6 = r5.A08
            X.OlA r1 = X.C71466OlA.A00
            r7 = 1
            X.PHt r0 = new X.PHt
            r0.<init>(r2, r7)
            X.PR9 r3 = new X.PR9
            r3.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r1, (X.C358618bC) r0, (int) r8, (boolean) r6)
            r0 = 2131959390(0x7f131e5e, float:1.955542E38)
            r3.A02 = r0
            android.content.Context r8 = r2.A01
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r0 = X.DbS.A03(r1, r0)
            r3.A05 = r0
            r3.A00 = r0
            r9.add(r3)
            r4.addAll(r9)
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x0068
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            r0 = 2131959382(0x7f131e56, float:1.9555403E38)
            java.lang.String r9 = X.AnonymousClass7TE.A16(r8, r0)
            r1 = 2131959381(0x7f131e55, float:1.95554E38)
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r6 = X.DbY.A0c(r8, r0, r1)
            r0 = 65
            X.Ok6 r3 = new X.Ok6
            r3.<init>(r2, r0)
            r1 = 0
            X.Oak r0 = new X.Oak
            r0.<init>((android.view.View.OnClickListener) r3, (java.lang.CharSequence) r9, (java.lang.CharSequence) r6, (java.lang.String) r1)
            r10.add(r0)
            r4.addAll(r10)
        L_0x0068:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            X.DbV.A1W(r3, r7)
            android.content.res.Resources r9 = r8.getResources()
            r1 = 2131959385(0x7f131e59, float:1.9555409E38)
            r19 = 2
            int r0 = r5.A03()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = 4
            java.lang.Object[] r0 = X.C51968G9o.A1Z(r0, r6)
            java.lang.String r0 = r9.getString(r1, r0)
            X.0qQ.A07(r0)
            X.C66583MXo.A1J(r0, r3)
            monitor-enter(r5)
            java.util.Map r0 = r5.A05     // Catch:{ all -> 0x0182 }
            if (r0 != 0) goto L_0x0095
            goto L_0x009e
        L_0x0095:
            java.util.ArrayList r0 = X.Dba.A0e(r0)     // Catch:{ all -> 0x0182 }
            java.util.List r9 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x0182 }
            goto L_0x009f
        L_0x009e:
            r9 = 0
        L_0x009f:
            monitor-exit(r5)
            if (r9 == 0) goto L_0x0141
            int r18 = r9.size()
            r1 = 0
        L_0x00a7:
            r0 = r18
            if (r1 >= r0) goto L_0x0141
            java.lang.Object r11 = r9.get(r1)
            X.OMj r11 = (X.C70814OMj) r11
            r14 = 1
            if (r1 != 0) goto L_0x013f
            java.lang.String r10 = r2.A08
            java.lang.String r0 = "inbox_qp_auto_response"
            boolean r0 = X.0qQ.A0K(r10, r0)
            if (r0 == 0) goto L_0x013f
            java.lang.String r0 = r11.A03
            if (r0 == 0) goto L_0x00c8
            int r0 = r0.length()
            if (r0 != 0) goto L_0x013f
        L_0x00c8:
            boolean r0 = r5.A07
            if (r0 != 0) goto L_0x013f
        L_0x00cc:
            r13 = 0
            java.lang.String r12 = r11.A02
            if (r14 == 0) goto L_0x012e
            X.0qQ.A07(r12)
            com.instagram.common.session.UserSession r0 = r2.A04
            r20 = r0
            r17 = 0
            android.app.Activity r10 = r2.A00
            r0 = 2131959445(0x7f131e95, float:1.955553E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r8, r0)
            X.5Gt r14 = X.AnonymousClass7TG.A0f(r10, r0)
            r14.A02()
            r0 = 3000(0xbb8, float:4.204E-42)
            r14.A00 = r0
            X.9p9 r0 = new X.9p9
            r0.<init>(r13)
            r14.A04 = r0
            r0 = 32
            X.Ok4 r15 = new X.Ok4
            r15.<init>(r0, r11, r2)
            r16 = 1000(0x3e8, float:1.401E-42)
            X.NgI r10 = new X.NgI
            r0 = r17
            r10.<init>((android.view.View.OnClickListener) r15, (java.lang.CharSequence) r12, (java.lang.String) r0, (boolean) r13)
            r0 = r16
            r10.A00 = r0
            r10.A02 = r14
            r0 = r20
            r10.A01 = r0
        L_0x010f:
            com.instagram.common.session.UserSession r0 = r2.A04
            boolean r0 = X.C69903Nu5.A00(r0)
            if (r0 != 0) goto L_0x0127
            java.lang.String r11 = r11.A03
            if (r11 == 0) goto L_0x0127
            int r0 = r11.length()
            if (r0 == 0) goto L_0x0127
            r10.A08 = r11
            r0 = r19
            r10.A03 = r0
        L_0x0127:
            r3.add(r10)
            int r1 = r1 + 1
            goto L_0x00a7
        L_0x012e:
            X.0qQ.A07(r12)
            r14 = 0
            r10 = 32
            X.Ok4 r0 = new X.Ok4
            r0.<init>(r10, r11, r2)
            X.Oak r10 = new X.Oak
            r10.<init>((android.view.View.OnClickListener) r0, (java.lang.CharSequence) r12, (java.lang.String) r14, (boolean) r13)
            goto L_0x010f
        L_0x013f:
            r14 = 0
            goto L_0x00cc
        L_0x0141:
            boolean r0 = r5.A07
            if (r0 != 0) goto L_0x0147
            r5.A07 = r7
        L_0x0147:
            r7 = 2131959378(0x7f131e52, float:1.9555395E38)
            r1 = 64
            X.Ok6 r0 = new X.Ok6
            r0.<init>(r2, r1)
            X.FAc r2 = new X.FAc
            r2.<init>((android.view.View.OnClickListener) r0, (int) r7)
            int r0 = X.2Yu.A0D(r8)
            int r0 = r8.getColor(r0)
            r2.A03 = r0
            monitor-enter(r5)
            java.util.Map r0 = r5.A05     // Catch:{ all -> 0x0182 }
            if (r0 == 0) goto L_0x016c
            int r1 = r0.size()     // Catch:{ all -> 0x0182 }
            r0 = 1
            if (r1 == r6) goto L_0x016d
        L_0x016c:
            r0 = 0
        L_0x016d:
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0175
            r0 = 1050253722(0x3e99999a, float:0.3)
            r2.A00 = r0
        L_0x0175:
            r3.add(r2)
            r4.addAll(r3)
            r0 = 2131959380(0x7f131e54, float:1.9555399E38)
            X.FGF.A01(r4, r0)
            return r4
        L_0x0182:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OVT.A01():java.util.ArrayList");
    }
}
