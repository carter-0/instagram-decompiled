package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

public final class PA4 implements AnonymousClass7XZ {
    public C71030OZh A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final WeakReference A03;
    public final AnonymousClass0eK A04;
    public final AnonymousClass0eK A05;
    public final AnonymousClass0eK A06;
    public final AnonymousClass0eK A07;
    public final AnonymousClass0eK A08;

    public PA4(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, AnonymousClass0eK r5, AnonymousClass0eK r6, AnonymousClass0eK r7, AnonymousClass0eK r8, AnonymousClass0eK r9) {
        0qQ.A0B(r5, 3);
        C51973G9u.A0s(5, r7, r3, r9);
        this.A02 = userSession;
        this.A05 = r5;
        this.A06 = r6;
        this.A07 = r7;
        this.A04 = r8;
        this.A01 = r3;
        this.A08 = r9;
        this.A03 = C51965G9l.A0v(fragmentActivity);
    }

    public static final void A00(PA4 pa4) {
        String A072;
        C71030OZh oZh;
        C333517Zg r1 = (C333517Zg) C66580MXl.A0s(pa4.A05);
        Activity activity = (Activity) pa4.A03.get();
        if (activity != null) {
            AnonymousClass7S7 C6l = r1.C6l();
            AnonymousClass7SD C6Q = C6l.C6Q();
            UserSession userSession = pa4.A02;
            if (!C71118OdC.A03(activity, activity, pa4.A01, userSession, (2EM) null, C6l.C68(C6Q.A0w), false) && (oZh = pa4.A00) != null) {
                oZh.A02(AnonymousClass7TF.A1V(C6Q.A0F));
            }
            C254793t3 CBU = C6l.CBU();
            if (CBU == null || (A072 = C300965yF.A07(CBU)) == null) {
                throw AnonymousClass7TE.A0y();
            }
            C70035NwD.A00(C69481NmP.CHANGE_PHOTO, C69477NmL.START, userSession, A072);
        }
    }

    public static final void A01(PA4 pa4) {
        String A072;
        C333517Zg A0V = C66580MXl.A0V(pa4.A05);
        Activity activity = (Activity) pa4.A03.get();
        if (activity != null) {
            UserSession userSession = pa4.A02;
            0qQ.A0A(A0V);
            C47167Dri A032 = new C71123OdH((C376519Ih) null, userSession, A0V).A03();
            Bundle A0A = DbV.A0A(userSession);
            E5m e5m = new E5m();
            e5m.setArguments(A0A);
            AnonymousClass7ZA C62 = A0V.C62();
            0qQ.A0B(C62, 0);
            e5m.A02 = C62;
            e5m.A01 = A032;
            e5m.A03 = "message_thread";
            DbU.A0y(activity, e5m, DbS.A0W(userSession));
            C254793t3 CBU = A0V.C6l().CBU();
            if (CBU == null || (A072 = C300965yF.A07(CBU)) == null) {
                throw AnonymousClass7TE.A0y();
            }
            C70035NwD.A00(C69481NmP.CHANGE_THREAD_NAME, C69477NmL.START, userSession, A072);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c3, code lost:
        if (r4.CUO() == false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
        r3 = X.C66582MXn.A0d(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0158, code lost:
        if (r12 != false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017e, code lost:
        if (X.182.A05(X.0Tu.A05, r5) == false) goto L_0x0180;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C61072JwA BA5() {
        /*
            r13 = this;
            X.0eK r3 = r13.A05
            X.7Zg r2 = X.C66580MXl.A0V(r3)
            X.0eK r0 = r13.A06
            java.lang.Object r1 = r0.get()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.ref.WeakReference r0 = r13.A03
            java.lang.Object r4 = r0.get()
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            if (r4 == 0) goto L_0x004f
            X.7S7 r3 = X.C66582MXn.A0d(r3)
            X.3t3 r0 = r3.CBU()
            if (r0 == 0) goto L_0x004f
            java.lang.String r8 = X.C300965yF.A07(r0)
            if (r8 == 0) goto L_0x004f
            com.instagram.common.session.UserSession r6 = r13.A02
            X.0eK r0 = r13.A04
            java.lang.Object r7 = X.C66580MXl.A0s(r0)
            X.36V r7 = (X.AnonymousClass36V) r7
            java.lang.String r9 = r3.C6k()
            int r10 = r3.AdN()
            int r11 = X.C66580MXl.A05(r3)
            java.lang.String r0 = "IgDirectUpdateGroupNameAndPhoto"
            X.0wc r5 = X.DbW.A0J(r6, r0)
            X.OZh r3 = new X.OZh
            r3.<init>((androidx.fragment.app.FragmentActivity) r4, (X.0wc) r5, (com.instagram.common.session.UserSession) r6, (X.AnonymousClass36V) r7, (java.lang.String) r8, (java.lang.String) r9, (int) r10, (int) r11)
            r13.A00 = r3
            X.PF6 r0 = X.PF6.A00
            r3.A02 = r0
        L_0x004f:
            X.7S7 r4 = r2.C6l()
            com.instagram.common.session.UserSession r5 = r13.A02
            X.3t3 r10 = r4.CBU()
            X.7SD r0 = r4.C6Q()
            boolean r8 = r0.A1A
            boolean r7 = r4.CUO()
            boolean r6 = r4.CZ0()
            java.util.List r3 = r4.BRZ()
            X.0qQ.A0A(r1)
            boolean r9 = r1.booleanValue()
            r0 = 0
            X.DbW.A1N(r5, r0, r3)
            r12 = 0
            if (r9 != 0) goto L_0x008f
            if (r10 == 0) goto L_0x0162
            X.3t0 r0 = X.C300965yF.A02(r10)
            if (r0 == 0) goto L_0x0162
            X.9HW r3 = X.AnonymousClass9HV.A00(r5)
            X.3t0 r1 = X.C300965yF.A01(r10)
            r0 = 12
            boolean r12 = r3.A00(r1, r0)
        L_0x008f:
            X.0eK r0 = r13.A07
            boolean r8 = X.C66582MXn.A1W(r0)
            X.7SD r3 = r4.C6Q()
            boolean r7 = r4.CZ0()
            boolean r6 = r4.CUO()
            boolean r0 = r2 instanceof X.C333507Zf
            r1 = -1
            if (r0 == 0) goto L_0x00b3
            X.7Zf r2 = (X.C333507Zf) r2
            X.7S6 r0 = r2.A02
            X.2Ep r0 = r0.A07
            r0.getClass()
            int r1 = r0.BSK()
        L_0x00b3:
            java.util.List r0 = r4.BRZ()
            boolean r0 = X.C66640Ma9.A04(r0, r1, r7, r6)
            r11 = 1
            if (r0 != 0) goto L_0x00c5
            boolean r0 = r4.CUO()
            r1 = 1
            if (r0 != 0) goto L_0x00c6
        L_0x00c5:
            r1 = 0
        L_0x00c6:
            boolean r0 = r3.A1A
            if (r0 == 0) goto L_0x0160
            if (r1 == 0) goto L_0x0160
            if (r9 != 0) goto L_0x0160
            boolean r0 = r4.CVr()
            if (r0 != 0) goto L_0x0160
            if (r8 != 0) goto L_0x0160
            int r1 = r3.A08
            java.lang.String r0 = r5.A06
            boolean r0 = r4.COR(r0)
            boolean r0 = X.C69945Nul.A00(r5, r1, r0)
            if (r0 == 0) goto L_0x0160
        L_0x00e4:
            int r0 = X.C66580MXl.A05(r4)
            boolean r6 = X.AnonymousClass48O.A04(r0)
            boolean r0 = r4.CUO()
            if (r0 == 0) goto L_0x015d
            if (r12 == 0) goto L_0x015d
            if (r11 == 0) goto L_0x015d
            X.0eK r0 = r13.A08
            java.lang.Object r0 = r0.get()
            X.9HC r0 = (X.AnonymousClass9HC) r0
            X.0eM r0 = r0.A08
            java.lang.Object r0 = r0.getValue()
            long r9 = X.AnonymousClass7TE.A0R(r0)
        L_0x0108:
            r8 = 1
            r3 = 0
            if (r12 == 0) goto L_0x0157
            if (r11 == 0) goto L_0x0157
            boolean r0 = r4.CUO()
            if (r0 == 0) goto L_0x0124
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r0 = 3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0157
        L_0x0124:
            r7 = 1
        L_0x0125:
            boolean r0 = r4.CUO()
            if (r0 == 0) goto L_0x013b
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r0 = 1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x015b
        L_0x013b:
            r1 = 1
        L_0x013c:
            if (r11 == 0) goto L_0x0155
            boolean r0 = r4.CUO()
            if (r0 != 0) goto L_0x0155
        L_0x0144:
            if (r7 == 0) goto L_0x0171
            r2 = 2131968693(0x7f1342b5, float:1.9574288E38)
            r1 = 4
            X.Ojx r0 = new X.Ojx
            r0.<init>((X.PA4) r13, (X.AnonymousClass7S7) r4, (int) r1, (boolean) r6)
            X.JwA r1 = new X.JwA
            r1.<init>((android.view.View.OnClickListener) r0, (int) r2)
            return r1
        L_0x0155:
            r8 = 0
            goto L_0x0144
        L_0x0157:
            r7 = 0
            if (r12 == 0) goto L_0x015b
            goto L_0x0125
        L_0x015b:
            r1 = 0
            goto L_0x013c
        L_0x015d:
            r9 = 0
            goto L_0x0108
        L_0x0160:
            r11 = 0
            goto L_0x00e4
        L_0x0162:
            boolean r0 = X.C66640Ma9.A06(r3, r6, r7)
            if (r0 != 0) goto L_0x008f
            if (r10 == 0) goto L_0x008f
            if (r7 == 0) goto L_0x008f
            if (r8 == 0) goto L_0x008f
            r12 = 1
            goto L_0x008f
        L_0x0171:
            if (r1 == 0) goto L_0x0190
            if (r6 != 0) goto L_0x0180
            X.0Tu r0 = X.0Tu.A05
            boolean r0 = X.182.A05(r0, r5)
            r3 = 2131968692(0x7f1342b4, float:1.9574286E38)
            if (r0 != 0) goto L_0x0183
        L_0x0180:
            r3 = 2131968694(0x7f1342b6, float:1.957429E38)
        L_0x0183:
            r1 = 46
        L_0x0185:
            X.Ojw r0 = new X.Ojw
            r0.<init>(r13, r1)
        L_0x018a:
            X.JwA r1 = new X.JwA
            r1.<init>((android.view.View.OnClickListener) r0, (int) r3)
            return r1
        L_0x0190:
            if (r8 == 0) goto L_0x01a3
            X.0Tu r0 = X.0Tu.A05
            boolean r0 = X.182.A05(r0, r5)
            r3 = 2131958715(0x7f131bbb, float:1.955405E38)
            if (r0 == 0) goto L_0x01a0
            r3 = 2131958714(0x7f131bba, float:1.9554048E38)
        L_0x01a0:
            r1 = 47
            goto L_0x0185
        L_0x01a3:
            X.Ojs r0 = X.C71393Ojs.A00
            goto L_0x018a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PA4.BA5():X.JwA");
    }

    public final void FMT(Intent intent) {
        String str;
        String str2;
        if (intent.getAction() != null) {
            try {
                String action = intent.getAction();
                if (action != null) {
                    Uri A09 = DbT.A09(action);
                    if (A09.getScheme() == null) {
                        A09 = 0cp.A03(002.A0R("file://", intent.getAction()));
                    }
                    C71030OZh oZh = this.A00;
                    if (oZh != null) {
                        oZh.A01(A09);
                    } else {
                        0wb.A06("UpdateGroupPhotoController Null", "UpdateGroupPhotoController became null", (Throwable) null);
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } catch (SecurityException e) {
                e = e;
                str = "Illegal URI";
                str2 = "Uri is not in correct format";
                0wb.A06(str, str2, e);
            } catch (NullPointerException e2) {
                e = e2;
                str = "Null URI";
                str2 = "Uri is null";
                0wb.A06(str, str2, e);
            } catch (Exception e3) {
                0wb.A06("Unknown error", "Unknown error", e3);
            }
        }
    }
}
