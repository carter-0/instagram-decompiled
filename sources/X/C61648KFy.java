package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.KFy  reason: case insensitive filesystem */
public final class C61648KFy extends C232222tE {
    public final float A00;
    public final float A01;
    public final Activity A02;
    public final C355608Qq A03;
    public final UserSession A04;
    public final C59943Jc9 A05;
    public final 0sP A06;

    public C61648KFy(Activity activity, Context context, C355608Qq r11, UserSession userSession, 0sP r13, float f, float f2) {
        0qQ.A0B(r13, 7);
        this.A04 = userSession;
        this.A02 = activity;
        this.A01 = f;
        this.A00 = f2;
        this.A03 = r11;
        this.A06 = r13;
        C59943Jc9 jc9 = new C59943Jc9(context, f, f2);
        C59944JcA jcA = jc9.A00;
        float f3 = jcA.A00;
        float f4 = jcA.A01;
        int i = (int) f4;
        C347087wF r3 = C347087wF.A0I;
        ArrayList A1L = 0sr.A1L(new C63809L7p[]{new C63809L7p(f4, f3, 0.0f, 0.0f)});
        ArrayList A1C = AnonymousClass7TE.A1C();
        C71492dQ r0 = new C71492dQ(i, (int) f3);
        JTP.A16(r0);
        C59943Jc9.A02(jc9, r3, A1L, A1C, new C71492dQ[]{r0});
        jc9.A07();
        jc9.A06();
        jc9.A09();
        jc9.A05();
        jc9.A08();
        this.A05 = jc9;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r28, X.C249703kE r29) {
        /*
            r27 = this;
            r12 = r29
            r5 = r28
            X.LiG r5 = (X.C64796LiG) r5
            X.Jpw r12 = (X.C60711Jpw) r12
            boolean r11 = X.AnonymousClass7TG.A1Z(r5, r12)
            r1 = r27
            android.app.Activity r0 = r1.A02
            r26 = r0
            com.instagram.common.session.UserSession r0 = r1.A04
            r25 = r0
            float r0 = r1.A01
            r21 = r0
            float r0 = r1.A00
            r20 = r0
            X.8Qq r0 = r1.A03
            r19 = r0
            X.Jc9 r14 = r1.A05
            r10 = 0
            r4 = 2
            r1 = r26
            r0 = r25
            X.AnonymousClass7TF.A1C(r1, r4, r0)
            r2 = 6
            r0 = r19
            X.AnonymousClass7TF.A1E(r0, r2, r14)
            X.3oV r3 = r12.A08
            r6 = 8
            r3.setVisibility(r6)
            X.3oV r0 = r12.A09
            r18 = r0
            r0.setVisibility(r6)
            X.3oV r0 = r12.A0A
            r0.setVisibility(r6)
            X.3oV r1 = r12.A0B
            r1.setVisibility(r6)
            X.3oV r0 = r12.A07
            r24 = r0
            r0.setVisibility(r6)
            android.widget.TextView r9 = r12.A05
            r9.setVisibility(r6)
            X.Jd6 r6 = r12.A00
            if (r6 == 0) goto L_0x006e
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x0064
            r6.A04 = r10
            r6.invalidateSelf()
        L_0x0064:
            X.LRZ r0 = r6.A01
            r0.A01()
            X.LRZ r0 = r6.A02
            r0.A01()
        L_0x006e:
            r13 = 0
            r12.A00 = r13
            android.content.Context r8 = X.DbS.A07(r12)
            java.lang.Integer r0 = r5.A01
            r22 = r0
            int r16 = r22.intValue()
            if (r16 == 0) goto L_0x00c6
            r23 = 0
        L_0x0081:
            java.util.List r0 = r5.A03
            r17 = r0
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat r7 = r5.A00
            int r0 = r7.ordinal()
            r6 = 0
            if (r0 == r11) goto L_0x00fd
            if (r0 != r4) goto L_0x00a4
            android.view.View r1 = r1.getView()
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r1 = (com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar) r1
            r1.setVisibility(r10)
            int r0 = r17.size()
            r1.setSegments(r0)
            r0 = 0
            r1.setProgress(r0)
        L_0x00a4:
            X.0qQ.A0A(r8)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r17)
            java.util.Iterator r2 = r17.iterator()
        L_0x00b3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c9
            com.instagram.common.gallery.Medium r1 = X.JTO.A0W(r2)
            X.LEp r0 = new X.LEp
            r0.<init>(r1)
            r5.add(r0)
            goto L_0x00b3
        L_0x00c6:
            r23 = 1
            goto L_0x0081
        L_0x00c9:
            r4.addAll(r5)
            int r0 = r12.A03
            float r1 = (float) r0
            r0 = 2130970254(0x7f04068e, float:1.7549213E38)
            int r0 = X.AnonymousClass7TF.A03(r8, r0)
            X.Jd6 r2 = new X.Jd6
            r2.<init>(r12, r4, r1, r0)
            r2.A03 = r11
            r2.invalidateSelf()
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x00ef
            r2.A04 = r11
            long r0 = java.lang.System.currentTimeMillis()
            r2.A00 = r0
            r2.invalidateSelf()
        L_0x00ef:
            r12.A00 = r2
            android.view.View r1 = r3.getView()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            X.Jd6 r0 = r12.A00
            r1.setImageDrawable(r0)
            goto L_0x0152
        L_0x00fd:
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()
            int r5 = r17.size()
            if (r5 <= r2) goto L_0x01a2
            r5 = 6
        L_0x0108:
            X.7wF[] r0 = X.C347077wE.A00(r5)
            java.lang.Object r4 = X.03t.A05(r0)
            X.7wF r4 = (X.C347087wF) r4
        L_0x0112:
            if (r6 < r5) goto L_0x01a6
            android.view.View r1 = r18.getView()
            r0 = 2131433410(0x7f0b17c2, float:1.8488605E38)
            androidx.recyclerview.widget.RecyclerView r2 = X.DbT.A0I(r1, r0)
            r0 = r21
            int r5 = (int) r0
            r0 = r20
            int r3 = (int) r0
            X.JlY r1 = new X.JlY
            r0 = r19
            r1.<init>(r0, r13, r5, r3)
            java.util.ArrayList r0 = r1.A05
            r0.clear()
            r0.addAll(r15)
            r1.notifyDataSetChanged()
            r2.setAdapter(r1)
            int r0 = r4.A00
            androidx.recyclerview.widget.GridLayoutManager r1 = new androidx.recyclerview.widget.GridLayoutManager
            r1.<init>(r8, r0)
            X.6sz r0 = r4.A04
            if (r0 != 0) goto L_0x014a
            X.6sy r0 = new X.6sy
            r0.<init>()
        L_0x014a:
            r1.A01 = r0
            r2.setLayoutManager(r1)
            r2.suppressLayout(r11)
        L_0x0152:
            android.view.View r1 = r12.itemView
            int r0 = r7.A02
            r1.setId(r0)
            android.widget.TextView r2 = r12.A06
            int r0 = r7.A01
            X.DbT.A18(r8, r2, r0)
            android.widget.ImageView r1 = r12.A04
            int r0 = r7.A00
            X.DbU.A13(r8, r1, r0)
            android.view.View r0 = X.JTO.A0F(r12)
            X.3NG r1 = X.AnonymousClass7TE.A0m(r0)
            r1.A07 = r11
            X.KHw r0 = new X.KHw
            r17 = r0
            r18 = r26
            r19 = r25
            r20 = r12
            r21 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r1.A04 = r0
            r1.A00()
            if (r23 != 0) goto L_0x01c4
            X.0nA.A0T(r2, r10)
            r9.setVisibility(r10)
            switch(r16) {
                case 0: goto L_0x019c;
                case 1: goto L_0x019e;
                default: goto L_0x0190;
            }
        L_0x0190:
            r0 = 2131962918(0x7f132c26, float:1.9562575E38)
        L_0x0193:
            r9.setText(r0)
            r0 = r24
            r0.setVisibility(r10)
            return
        L_0x019c:
            r0 = -1
            goto L_0x0193
        L_0x019e:
            r0 = 2131962920(0x7f132c28, float:1.9562579E38)
            goto L_0x0193
        L_0x01a2:
            if (r5 != r11) goto L_0x0108
            X.7wF r4 = X.C347087wF.A0I
        L_0x01a6:
            r0 = r17
            java.lang.Object r3 = r0.get(r6)
            com.instagram.common.gallery.Medium r3 = (com.instagram.common.gallery.Medium) r3
            X.2dQ r2 = r14.A03(r4, r6)
            if (r2 == 0) goto L_0x01ca
            X.L7p r0 = r14.A04(r4, r6)
            X.L7q r1 = new X.L7q
            r1.<init>(r13, r2, r3, r0)
            r15.add(r1)
            int r6 = r6 + 1
            goto L_0x0112
        L_0x01c4:
            int r0 = r12.A02
            X.0nA.A0T(r2, r0)
            return
        L_0x01ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61648KFy.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C64796LiG.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        UserSession userSession = this.A04;
        0sP r2 = this.A06;
        AnonymousClass7TF.A1C(userSession, 0, r2);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C60711Jpw(DbT.A0D(layoutInflater, viewGroup, R.layout.gallery_grid_formats_thumbnail, false), userSession, r2);
    }
}
