package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.K9x  reason: case insensitive filesystem */
public final class C61492K9x extends C231632rz {
    public final UserSession A00;
    public final ReelDashboardFragment A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00bd, code lost:
        r0 = r5.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00cd, code lost:
        r0 = X.DbY.A0d(r5, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d1, code lost:
        X.0qQ.A07(r0);
        r11.setText(r0);
        r10.setText(r13.Bjz());
        r0 = r13.Arm();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e2, code lost:
        if (r0 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e8, code lost:
        if (r0.isEmpty() != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ea, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00eb, code lost:
        r1.setVisibility(r2);
        r2 = r8.A0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f0, code lost:
        if (r2 == null) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f6, code lost:
        if (r2.A5p() != true) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f8, code lost:
        r1 = 2131953905;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ff, code lost:
        if (r8.A1J() == false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0101, code lost:
        r1 = 2131953902;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0104, code lost:
        r0 = r5.getString(r1);
        X.0qQ.A0A(r0);
        r9.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010e, code lost:
        if (r2 == null) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0114, code lost:
        if (r2.A5p() != true) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011a, code lost:
        if (r8.A1J() == false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011c, code lost:
        r0 = 2131953901;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011f, code lost:
        r0 = r5.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0123, code lost:
        X.0qQ.A0A(r0);
        r3.setText(r0);
        r0 = -1078390160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012e, code lost:
        r0 = com.instagram.android.R.plurals.blocked_story_photos_delete_button_text;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0136, code lost:
        if (r8.A1J() == false) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0138, code lost:
        r0 = 2131953903;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013c, code lost:
        r0 = com.instagram.android.R.plurals.blocked_story_videos_delete_button_text;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013f, code lost:
        r0 = X.DbY.A0d(r5, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0144, code lost:
        r1 = 2131953906;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014b, code lost:
        if (r8.A1J() == false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x014d, code lost:
        r1 = 2131953904;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r15, android.view.View r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r14 = this;
            r8 = r17
            r0 = 720464835(0x2af16bc3, float:4.2884975E-13)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.3uh r8 = (X.C255773uh) r8
            r1 = r16
            java.lang.Object r6 = X.DbT.A0o(r1)
            X.LAy r6 = (X.C63895LAy) r6
            boolean r0 = r8.A1H()
            r2 = 8
            if (r0 != 0) goto L_0x004d
            r1.setVisibility(r2)
            android.view.View r0 = r6.A02
            r0.setVisibility(r2)
            android.widget.TextView r0 = r6.A08
            r0.setVisibility(r2)
            android.widget.TextView r0 = r6.A06
            r0.setVisibility(r2)
            android.widget.TextView r0 = r6.A07
            r0.setVisibility(r2)
            android.widget.TextView r0 = r6.A04
            r0.setVisibility(r2)
            android.widget.TextView r0 = r6.A03
            r0.setVisibility(r2)
            android.widget.TextView r0 = r6.A05
            r0.setVisibility(r2)
            android.view.View r0 = r6.A01
            r0.setVisibility(r2)
            r0 = 2039718164(0x7993a114, float:9.581684E34)
        L_0x0049:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x004d:
            r5 = 0
            r1.setVisibility(r5)
            android.view.View r0 = r6.A02
            r0.setVisibility(r5)
            android.widget.TextView r11 = r6.A08
            r11.setVisibility(r5)
            android.widget.TextView r10 = r6.A06
            r10.setVisibility(r5)
            android.widget.TextView r1 = r6.A07
            r1.setVisibility(r5)
            android.widget.TextView r9 = r6.A04
            r9.setVisibility(r5)
            android.widget.TextView r3 = r6.A03
            r3.setVisibility(r5)
            android.widget.TextView r0 = r6.A05
            r0.setVisibility(r5)
            android.view.View r0 = r6.A01
            r0.setVisibility(r5)
            r6.A00 = r8
            android.content.res.Resources r5 = r11.getResources()
            X.DUA r13 = r8.A05()
            com.instagram.common.session.UserSession r0 = r14.A00
            int r6 = X.C64020LJh.A00(r0, r8)
            r13.getClass()
            r7 = 1
            X.0qQ.A0B(r5, r7)
            java.lang.String r0 = r13.CAh()
            if (r0 == 0) goto L_0x00ab
            java.lang.String r12 = r13.CAh()
            java.util.Map r0 = X.C62566Khw.A01
            java.lang.Object r0 = r0.get(r12)
            X.Khw r0 = (X.C62566Khw) r0
            if (r0 == 0) goto L_0x00ab
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x00b6;
                case 1: goto L_0x00ba;
                case 2: goto L_0x00ba;
                case 3: goto L_0x00c2;
                case 4: goto L_0x00c6;
                case 5: goto L_0x00ca;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            r0 = 1408(0x580, float:1.973E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x00b6:
            r0 = 2131969403(0x7f13457b, float:1.9575728E38)
            goto L_0x00bd
        L_0x00ba:
            r0 = 2131969401(0x7f134579, float:1.9575724E38)
        L_0x00bd:
            java.lang.String r0 = r5.getString(r0)
            goto L_0x00d1
        L_0x00c2:
            r0 = 2131820957(0x7f11019d, float:1.9274644E38)
            goto L_0x00cd
        L_0x00c6:
            r0 = 2131820959(0x7f11019f, float:1.9274648E38)
            goto L_0x00cd
        L_0x00ca:
            r0 = 2131820955(0x7f11019b, float:1.927464E38)
        L_0x00cd:
            java.lang.String r0 = X.DbY.A0d(r5, r6, r0)
        L_0x00d1:
            X.0qQ.A07(r0)
            r11.setText(r0)
            java.lang.String r0 = r13.Bjz()
            r10.setText(r0)
            java.util.List r0 = r13.Arm()
            if (r0 == 0) goto L_0x00eb
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00eb
            r2 = 0
        L_0x00eb:
            r1.setVisibility(r2)
            X.1Xj r2 = r8.A0b
            if (r2 == 0) goto L_0x0144
            boolean r0 = r2.A5p()
            if (r0 != r7) goto L_0x0144
            boolean r0 = r8.A1J()
            r1 = 2131953905(0x7f1308f1, float:1.9544294E38)
            if (r0 == 0) goto L_0x0104
            r1 = 2131953902(0x7f1308ee, float:1.9544288E38)
        L_0x0104:
            java.lang.String r0 = r5.getString(r1)
            X.0qQ.A0A(r0)
            r9.setText(r0)
            if (r2 == 0) goto L_0x0132
            boolean r0 = r2.A5p()
            if (r0 != r7) goto L_0x0132
            boolean r0 = r8.A1J()
            if (r0 == 0) goto L_0x012e
            r0 = 2131953901(0x7f1308ed, float:1.9544286E38)
        L_0x011f:
            java.lang.String r0 = r5.getString(r0)
        L_0x0123:
            X.0qQ.A0A(r0)
            r3.setText(r0)
            r0 = -1078390160(0xffffffffbfb91270, float:-1.4458752)
            goto L_0x0049
        L_0x012e:
            r0 = 2131820588(0x7f11002c, float:1.9273895E38)
            goto L_0x013f
        L_0x0132:
            boolean r0 = r8.A1J()
            if (r0 == 0) goto L_0x013c
            r0 = 2131953903(0x7f1308ef, float:1.954429E38)
            goto L_0x011f
        L_0x013c:
            r0 = 2131820589(0x7f11002d, float:1.9273897E38)
        L_0x013f:
            java.lang.String r0 = X.DbY.A0d(r5, r6, r0)
            goto L_0x0123
        L_0x0144:
            boolean r0 = r8.A1J()
            r1 = 2131953906(0x7f1308f2, float:1.9544296E38)
            if (r0 == 0) goto L_0x0104
            r1 = 2131953904(0x7f1308f0, float:1.9544292E38)
            goto L_0x0104
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61492K9x.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return ((C255773uh) obj).A0j.hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        DUA A05 = ((C255773uh) obj).A05();
        A05.getClass();
        return A05.hashCode();
    }

    public C61492K9x(UserSession userSession, ReelDashboardFragment reelDashboardFragment) {
        this.A00 = userSession;
        this.A01 = reelDashboardFragment;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1986910755);
        View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.reel_dashboard_rights_manager_flag_info);
        A0C.setTag(new C63895LAy(A0C, this.A01));
        AnonymousClass0fD.A0A(-799796967, A03);
        return A0C;
    }
}
