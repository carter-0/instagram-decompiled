package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vv5  reason: case insensitive filesystem */
public final class C18612Vv5 {
    public final AnonymousClass2t9 A00;
    public final UserSession A01;
    public final List A02 = new ArrayList();
    public final Context A03;
    public final AnonymousClass4DU A04;
    public final C310296al A05;

    /* JADX WARNING: type inference failed for: r0v4, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [X.2tF, java.lang.Object] */
    public C18612Vv5(Context context, UserSession userSession, AnonymousClass4DU r11, XC8 xc8) {
        AnonymousClass7TG.A1P(userSession, r11);
        this.A01 = userSession;
        Context context2 = context;
        this.A03 = context;
        this.A04 = r11;
        this.A05 = new C310296al(userSession);
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        A002.A01(new C15765UiA(userSession));
        A002.A01(new C15819Uj2(userSession));
        A002.A01(new C15764Ui9(userSession));
        A002.A01(new Object());
        A002.A01(new Object());
        A002.A01(new C15766UiB(userSession));
        C13991Tnr.A1E(A002, new Object());
        A002.A01(new Object());
        this.A00 = DbU.A0U(A002, new C15793Uic(context2, r11, userSession, xc8, AnonymousClass05K.A09));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r5 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r6.CcK() != true) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0155, code lost:
        if (r1 != null) goto L_0x0157;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.VU0 r19) {
        /*
            r18 = this;
            r8 = 0
            r0 = r19
            X.VcH r11 = r0.A01
            X.UbS r7 = r0.A00
            com.instagram.user.model.UpcomingEvent r12 = r11.A00
            X.1Xj r6 = r11.A01
            r10 = 1
            if (r6 == 0) goto L_0x0015
            boolean r0 = r6.CcK()
            r5 = 1
            if (r0 == r10) goto L_0x0016
        L_0x0015:
            r5 = 0
        L_0x0016:
            com.instagram.user.model.UpcomingEventLiveMetadata r17 = r12.BNJ()
            r9 = r18
            X.6al r0 = r9.A05
            boolean r16 = r0.A00(r12)
            if (r6 == 0) goto L_0x002d
            boolean r0 = r6.A4P()
            if (r0 != r10) goto L_0x002d
            r15 = 1
            if (r5 == 0) goto L_0x002e
        L_0x002d:
            r15 = 0
        L_0x002e:
            boolean r4 = r11.A02
            if (r5 == 0) goto L_0x0219
            if (r16 == 0) goto L_0x0232
            if (r4 == 0) goto L_0x0232
            if (r15 != 0) goto L_0x0232
            java.lang.Integer r13 = X.AnonymousClass05K.A00
        L_0x003a:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            boolean r14 = X.C51969G9p.A1a(r13, r0)
            java.util.List r3 = r9.A02
            r3.clear()
            if (r17 == 0) goto L_0x016b
            if (r6 == 0) goto L_0x016b
            boolean r0 = r11.A08
            if (r0 == 0) goto L_0x0108
            boolean r0 = r11.A06
            if (r0 == 0) goto L_0x0108
            r2 = 2131238498(0x7f081e62, float:1.8093276E38)
            android.content.Context r1 = r9.A03
            r0 = 2131976009(0x7f135f49, float:1.9589126E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 18
            X.N4G r11 = new X.N4G
            r11.<init>((int) r2, (java.lang.String) r1, (int) r0)
            X.WfT r1 = new X.WfT
            r1.<init>(r7, r10)
        L_0x0069:
            X.WSE r0 = new X.WSE
            r0.<init>(r11, r1)
            r3.add(r0)
        L_0x0071:
            if (r4 == 0) goto L_0x008f
            if (r14 != 0) goto L_0x008f
            if (r16 != 0) goto L_0x0104
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x0079:
            java.lang.String r0 = r9.A00(r6)
            X.JwF r2 = new X.JwF
            r2.<init>((java.lang.Integer) r1, (java.lang.String) r0, (boolean) r5)
            X.VPq r1 = new X.VPq
            r1.<init>(r7)
            X.WSF r0 = new X.WSF
            r0.<init>(r2, r1)
            r3.add(r0)
        L_0x008f:
            if (r15 == 0) goto L_0x00b3
            if (r14 != 0) goto L_0x00b3
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00db
            com.instagram.common.session.UserSession r4 = r9.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323019458751219(0x810b9800022af3, double:3.0341619945493463E-306)
            boolean r2 = X.182.A06(r2, r4, r0)
            X.VPm r1 = new X.VPm
            r1.<init>(r7)
            X.WSG r0 = new X.WSG
            r0.<init>(r1, r2)
            r3.add(r0)
        L_0x00b3:
            if (r16 == 0) goto L_0x00cd
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r0 = 2131976003(0x7f135f43, float:1.9589114E38)
            X.GKO r2 = new X.GKO
            r2.<init>(r1, r0)
            r0 = 4
            X.Jvs r1 = new X.Jvs
            r1.<init>((java.lang.Object) r2, (int) r0)
            X.WRx r0 = new X.WRx
            r0.<init>(r1)
            r3.add(r0)
        L_0x00cd:
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r1.<init>()
            r1.A01(r3)
            X.2t9 r0 = r9.A00
            r0.A05(r1)
            return
        L_0x00db:
            if (r4 != 0) goto L_0x00ff
            r5 = 0
        L_0x00de:
            r4 = 2131238596(0x7f081ec4, float:1.8093475E38)
            android.content.Context r1 = r9.A03
            r0 = 2131976008(0x7f135f48, float:1.9589124E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 18
            X.N4G r2 = new X.N4G
            r2.<init>((int) r4, (java.lang.String) r1, (int) r0)
            X.WfT r1 = new X.WfT
            r1.<init>(r7, r8)
            X.WSE r0 = new X.WSE
            r0.<init>(r2, r1)
            r3.add(r5, r0)
            goto L_0x00b3
        L_0x00ff:
            int r5 = r3.size()
            goto L_0x00de
        L_0x0104:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            goto L_0x0079
        L_0x0108:
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x012f
            boolean r0 = r11.A06
            if (r0 != 0) goto L_0x012f
            boolean r0 = r11.A04
            if (r0 != 0) goto L_0x012f
            r2 = 2131238245(0x7f081d65, float:1.8092763E38)
            android.content.Context r1 = r9.A03
            r0 = 2131976006(0x7f135f46, float:1.958912E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 18
            X.N4G r11 = new X.N4G
            r11.<init>((int) r2, (java.lang.String) r1, (int) r0)
            r0 = 2
            X.WfT r1 = new X.WfT
            r1.<init>(r7, r0)
            goto L_0x0069
        L_0x012f:
            boolean r0 = r11.A06
            if (r0 == 0) goto L_0x0192
            boolean r0 = r11.A07
            if (r0 != 0) goto L_0x0192
            r10 = 2131238498(0x7f081e62, float:1.8093276E38)
            com.instagram.common.session.UserSession r0 = r9.A01
            com.instagram.user.model.User r0 = r6.A2A(r0)
            if (r0 == 0) goto L_0x0161
            java.lang.String r2 = r0.getUsername()
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0161
            android.content.Context r1 = r9.A03
            r0 = 2131976013(0x7f135f4d, float:1.9589135E38)
            java.lang.String r1 = X.DbW.A0h(r1, r2, r0)
            if (r1 == 0) goto L_0x0161
        L_0x0157:
            r0 = 18
            X.N4G r11 = new X.N4G
            r11.<init>((int) r10, (java.lang.String) r1, (int) r0)
            r1 = 0
            goto L_0x0069
        L_0x0161:
            android.content.Context r1 = r9.A03
            r0 = 2131976012(0x7f135f4c, float:1.9589133E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            goto L_0x0157
        L_0x016b:
            if (r14 == 0) goto L_0x01c3
            boolean r0 = r12.getReminderEnabled()
            if (r0 == 0) goto L_0x01c0
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0175:
            r0 = 45
            X.JwK r10 = new X.JwK
            r10.<init>((java.lang.Integer) r1, (int) r0, (boolean) r5)
            java.lang.String r1 = r9.A00(r6)
            r0 = 25
            X.JwE r2 = new X.JwE
            r2.<init>((java.lang.String) r1, (int) r0, (java.lang.Integer) r13)
            X.VPn r0 = new X.VPn
            r0.<init>(r7)
            X.WSt r1 = new X.WSt
            r1.<init>(r10, r2, r0)
            goto L_0x01bb
        L_0x0192:
            boolean r0 = r11.A07
            if (r0 == 0) goto L_0x016b
            r10 = 2131238498(0x7f081e62, float:1.8093276E38)
            android.content.Context r2 = r9.A03
            boolean r1 = r11.A03
            r0 = 2131976011(0x7f135f4b, float:1.958913E38)
            if (r1 == 0) goto L_0x01a5
            r0 = 2131976010(0x7f135f4a, float:1.9589128E38)
        L_0x01a5:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r2, r0)
            r0 = 18
            X.N4G r2 = new X.N4G
            r2.<init>((int) r10, (java.lang.String) r1, (int) r0)
            r1 = 3
            X.WfT r0 = new X.WfT
            r0.<init>(r7, r1)
            X.WSE r1 = new X.WSE
            r1.<init>(r2, r0)
        L_0x01bb:
            r3.add(r1)
            goto L_0x0071
        L_0x01c0:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0175
        L_0x01c3:
            if (r16 == 0) goto L_0x0071
            if (r15 != 0) goto L_0x01fc
            if (r4 != 0) goto L_0x01fc
            boolean r0 = r12.getReminderEnabled()
            if (r0 == 0) goto L_0x01f9
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x01d1:
            r0 = 45
            X.JwK r12 = new X.JwK
            r12.<init>((java.lang.Integer) r1, (int) r0, (boolean) r5)
            if (r5 != 0) goto L_0x01ea
            com.instagram.common.session.UserSession r11 = r9.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323019458751219(0x810b9800022af3, double:3.0341619945493463E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 != 0) goto L_0x01ea
            r10 = 0
        L_0x01ea:
            X.VPo r0 = new X.VPo
            r0.<init>(r7)
            X.WSu r2 = new X.WSu
            r2.<init>(r12, r0, r10)
        L_0x01f4:
            r3.add(r2)
            goto L_0x0071
        L_0x01f9:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x01d1
        L_0x01fc:
            boolean r0 = r12.getReminderEnabled()
            if (r0 == 0) goto L_0x0216
            java.lang.Integer r2 = X.AnonymousClass05K.A00
        L_0x0204:
            r0 = 45
            X.JwK r1 = new X.JwK
            r1.<init>((java.lang.Integer) r2, (int) r0, (boolean) r5)
            X.VPp r0 = new X.VPp
            r0.<init>(r7)
            X.WSs r2 = new X.WSs
            r2.<init>(r1, r0)
            goto L_0x01f4
        L_0x0216:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x0204
        L_0x0219:
            if (r16 == 0) goto L_0x0232
            if (r4 != 0) goto L_0x0232
            if (r15 == 0) goto L_0x0232
            com.instagram.common.session.UserSession r3 = r9.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323019458751219(0x810b9800022af3, double:3.0341619945493463E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0232
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            goto L_0x003a
        L_0x0232:
            java.lang.Integer r13 = X.AnonymousClass05K.A0C
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18612Vv5.A01(X.VU0):void");
    }

    public final void A02(UpcomingEvent upcomingEvent) {
        Integer num;
        List list = this.A02;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next() instanceof X5J) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        C232262tL r1 = (C232262tL) 00k.A0O(list, i);
        if (r1 instanceof X5J) {
            C61082JwK BlT = ((X5J) r1).BlT();
            if (upcomingEvent.getReminderEnabled()) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A01;
            }
            0qQ.A0B(num, 0);
            BlT.A00 = num;
        }
        this.A00.notifyItemChanged(i);
    }

    private final String A00(1Xj r4) {
        String BMq;
        if (r4 == null || (BMq = r4.A0C.BMq()) == null || BMq.length() <= 0 || BMq.equals(this.A03.getString(2131976020))) {
            return AnonymousClass7TE.A16(this.A03, 2131976007);
        }
        return BMq;
    }
}
