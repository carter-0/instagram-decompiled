package X;

import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.JjQ  reason: case insensitive filesystem */
public final class C60321JjQ extends 2YL implements C361518gM {
    public C361518gM A00;
    public final AnonymousClass2gO A01;
    public final UserSession A02;
    public final C64586LeU A03;
    public final L09 A04;
    public final 05G A05 = DbS.A10(AnonymousClass7TE.A1C());
    public final 05G A06 = 106.A01(A00(this));

    public C60321JjQ(UserSession userSession, C64586LeU leU, L09 l09) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = leU;
        this.A04 = l09;
        C64317LZr lZr = new C64317LZr(this, 1);
        this.A01 = lZr;
        leU.A02.A09(lZr);
        A01(this);
    }

    public final void Ch8(C63945LEl lEl, int i) {
        0qQ.A0B(lEl, 1);
        27p.A01(this.A02).A0p(i, lEl.A01(), 3);
    }

    public final boolean DQC(C63945LEl lEl, int i) {
        Object obj;
        boolean z;
        C361518gM r1;
        0qQ.A0B(lEl, 1);
        C64586LeU leU = this.A03;
        Iterator it = leU.A02().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C357268Xf) obj).BEU() == lEl.A00()) {
                break;
            }
        }
        C357268Xf r2 = (C357268Xf) obj;
        if (r2 == null) {
            r2 = new Folder(lEl.A01(), (String) null, lEl.A00(), false);
        }
        27r A012 = 27p.A01(this.A02);
        int BEU = r2.BEU();
        String name = r2.getName();
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.addAll(C64586LeU.A00(leU));
        A1C.addAll(C64586LeU.A01(leU));
        Folder ACT = r2.ACT();
        if (ACT != null) {
            z = ACT.A07;
        } else {
            z = false;
        }
        int i2 = i;
        A012.A1y(name, A1C, i2, BEU, 3, z);
        C361518gM r0 = this.A00;
        if ((r0 != null && r0.DQC(lEl, i2)) || (r1 = this.A00) == null) {
            return true;
        }
        r1.Cuy(new C61080JwI(r2), i2);
        return true;
    }

    public final void DiE(int i, String str) {
        0qQ.A0B(str, 1);
        this.A06.Epw(new C61079JwH((C62748Klm) new KKI(i), AnonymousClass05K.A00, str));
        C361518gM r0 = this.A00;
        if (r0 != null) {
            r0.DiE(i, str);
        }
    }

    public static final C61079JwH A00(C60321JjQ jjQ) {
        return new C61079JwH((C62748Klm) KKJ.A00, AnonymousClass05K.A01, AnonymousClass7TE.A16(jjQ.A04.A00, 2131973025));
    }

    public final void Ch9(C61080JwI jwI, int i) {
        int i2 = 2;
        if (((C357268Xf) jwI.A00).CAp() == AnonymousClass05K.A01) {
            i2 = 1;
        }
        27p.A01(this.A02).A0p(i, ((C357268Xf) jwI.A00).getName(), i2);
    }

    public final void Cuy(C61080JwI jwI, int i) {
        boolean z;
        C361518gM r0 = this.A00;
        int i2 = i;
        if (r0 != null) {
            r0.Cuy(jwI, i);
        }
        Integer CAp = ((C357268Xf) jwI.A00).CAp();
        Integer num = AnonymousClass05K.A01;
        if (CAp == num) {
            AnonymousClass9PQ.A08(DbS.A0O("AlbumPickerViewModel"), this.A02, "cloud_album_tap", "album_picker", AnonymousClass7TF.A0w("folder_name", ((C357268Xf) jwI.A00).getName()));
        }
        27r A012 = 27p.A01(this.A02);
        C357268Xf r02 = (C357268Xf) jwI.A00;
        int BEU = r02.BEU();
        String name = r02.getName();
        int i3 = 2;
        if (r02.CAp() == num) {
            i3 = 1;
        }
        C64586LeU leU = this.A03;
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.addAll(C64586LeU.A00(leU));
        A1C.addAll(C64586LeU.A01(leU));
        Folder ACT = ((C357268Xf) jwI.A00).ACT();
        if (ACT != null) {
            z = ACT.A07;
        } else {
            z = false;
        }
        A012.A1y(name, A1C, i2, BEU, i3, z);
    }

    public final void Cv2() {
        this.A06.Epw(A00(this));
        C361518gM r0 = this.A00;
        if (r0 != null) {
            r0.Cv2();
        }
    }

    public final void onCleared() {
        this.A03.A02.A08(this.A01);
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 191 */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0185, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36329285815910359L) == false) goto L_0x01c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C60321JjQ r15) {
        /*
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            X.LeU r2 = r15.A03
            java.util.ArrayList r0 = r2.A02()
            java.util.Iterator r9 = r0.iterator()
        L_0x001a:
            boolean r0 = r9.hasNext()
            r8 = 1
            if (r0 == 0) goto L_0x0059
            java.lang.Object r3 = r9.next()
            X.8Xf r3 = (X.C357268Xf) r3
            com.instagram.ui.widget.mediapicker.Folder r1 = r3.ACT()
            if (r1 == 0) goto L_0x0043
            java.util.List r0 = r1.A01()
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0043
            boolean r1 = r1.A07
            X.JwI r0 = new X.JwI
            if (r1 == 0) goto L_0x0052
            r0.<init>((X.C357268Xf) r3)
            r5.add(r0)
        L_0x0043:
            X.Lzo r1 = r3.ACa()
            if (r1 == 0) goto L_0x001a
            X.JwI r0 = new X.JwI
            r0.<init>((X.C357268Xf) r1)
            r7.add(r0)
            goto L_0x001a
        L_0x0052:
            r0.<init>((X.C357268Xf) r3)
            r6.add(r0)
            goto L_0x0043
        L_0x0059:
            boolean r0 = X.DbT.A1b(r7)
            r3 = 2
            if (r0 == 0) goto L_0x0068
            X.KKS r0 = new X.KKS
            r0.<init>(r7, r3, r8)
            r4.add(r0)
        L_0x0068:
            boolean r1 = X.DbT.A1b(r5)
            boolean r0 = X.DbT.A1b(r6)
            if (r0 == 0) goto L_0x007d
            if (r1 == 0) goto L_0x0075
            r3 = 1
        L_0x0075:
            X.KKS r0 = new X.KKS
            r0.<init>(r6, r8, r3)
            r4.add(r0)
        L_0x007d:
            if (r1 == 0) goto L_0x0088
            r1 = 3
            X.KKS r0 = new X.KKS
            r0.<init>(r5, r1, r8)
            r4.add(r0)
        L_0x0088:
            boolean r0 = X.DbT.A1b(r4)
            if (r0 == 0) goto L_0x01b0
            java.util.ArrayList r14 = r2.A02()
            X.L09 r1 = r15.A04
            r0 = 2131952866(0x7f1304e2, float:1.9542187E38)
            android.content.Context r6 = r1.A00
            java.lang.String r0 = X.AnonymousClass7TE.A16(r6, r0)
            X.KKE r3 = new X.KKE
            r3.<init>(r0)
            r0 = 2131952863(0x7f1304df, float:1.954218E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r6, r0)
            X.KKC r0 = new X.KKC
            r0.<init>(r1)
            X.LEl[] r0 = new X.C63945LEl[]{r3, r0}
            java.util.ArrayList r9 = X.0sr.A1M(r0)
            com.instagram.common.session.UserSession r7 = r15.A02
            boolean r0 = X.C63272KuH.A00(r7)
            if (r0 == 0) goto L_0x00cd
            r0 = 2131952865(0x7f1304e1, float:1.9542185E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r6, r0)
            X.KKD r0 = new X.KKD
            r0.<init>(r1)
            r9.add(r0)
        L_0x00cd:
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x00e0
            r0 = 2131952867(0x7f1304e3, float:1.9542189E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r6, r0)
            X.KKF r0 = new X.KKF
            r0.<init>(r1)
            r9.add(r0)
        L_0x00e0:
            java.util.Iterator r10 = r14.iterator()
        L_0x00e4:
            boolean r0 = r10.hasNext()
            r13 = 0
            if (r0 == 0) goto L_0x0170
            java.lang.Object r5 = r10.next()
            r0 = r5
            X.8Xf r0 = (X.C357268Xf) r0
            com.instagram.ui.widget.mediapicker.Folder r0 = r0.ACT()
            if (r0 == 0) goto L_0x00e4
            java.lang.String r1 = r0.A03
            if (r1 == 0) goto L_0x00e4
            java.lang.String r0 = "Meta View"
            boolean r0 = r1.equals(r0)
            if (r0 != r8) goto L_0x00e4
            X.0Tu r3 = X.0Tu.A05
            r0 = 36329285815910359(0x81114b00003fd7, double:3.0381248640493814E-306)
            boolean r0 = X.182.A06(r3, r7, r0)
            if (r0 == 0) goto L_0x00e4
        L_0x0111:
            X.8Xf r5 = (X.C357268Xf) r5
            if (r5 == 0) goto L_0x0128
            int r3 = r5.BEU()
            r0 = 2131952864(0x7f1304e0, float:1.9542183E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r6, r0)
            X.KKG r0 = new X.KKG
            r0.<init>(r3, r1)
            r9.add(r0)
        L_0x0128:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r9.iterator()
        L_0x0130:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01b1
            java.lang.Object r9 = r12.next()
            r11 = r9
            X.LEl r11 = (X.C63945LEl) r11
            java.util.Iterator r10 = r14.iterator()
        L_0x0141:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x016e
            java.lang.Object r3 = r10.next()
            r0 = r3
            X.8Xf r0 = (X.C357268Xf) r0
            int r1 = r0.BEU()
            int r0 = r11.A00()
            if (r1 != r0) goto L_0x0141
        L_0x0158:
            X.8Xf r3 = (X.C357268Xf) r3
            if (r3 == 0) goto L_0x0130
            com.instagram.ui.widget.mediapicker.Folder r0 = r3.ACT()
            if (r0 == 0) goto L_0x0130
            java.util.Set r0 = r0.A05
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0130
            r5.add(r9)
            goto L_0x0130
        L_0x016e:
            r3 = r13
            goto L_0x0158
        L_0x0170:
            r5 = r13
            goto L_0x0111
        L_0x0172:
            java.lang.String r4 = "Meta View"
            boolean r0 = r0.equals(r4)
            if (r0 != r8) goto L_0x01c9
            X.0Tu r0 = X.0Tu.A05
            r4 = 36329285815910359(0x81114b00003fd7, double:3.0381248640493814E-306)
            boolean r0 = X.182.A06(r0, r7, r4)
            if (r0 == 0) goto L_0x01c9
        L_0x0187:
            X.8Xf r1 = (X.C357268Xf) r1
            if (r1 == 0) goto L_0x01ab
            int r2 = r1.BEU()
            r0 = 2131952864(0x7f1304e0, float:1.9542183E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r6, r0)
            X.KKH r0 = new X.KKH
            r0.<init>(r2, r1)
            X.KKP r1 = new X.KKP
            r1.<init>(r0)
            X.KKR r0 = new X.KKR
            r0.<init>()
            r3.add(r0)
            r3.add(r1)
        L_0x01ab:
            X.05G r0 = r15.A05
            r0.Epw(r3)
        L_0x01b0:
            return
        L_0x01b1:
            X.KKQ r0 = new X.KKQ
            r0.<init>(r5)
            X.HQe[] r0 = new X.C54725HQe[]{r0}
            java.util.ArrayList r3 = X.0sr.A1M(r0)
            r3.addAll(r4)
            java.util.ArrayList r0 = r2.A02()
            java.util.Iterator r2 = r0.iterator()
        L_0x01c9:
            boolean r0 = r2.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0187
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.8Xf r0 = (X.C357268Xf) r0
            com.instagram.ui.widget.mediapicker.Folder r0 = r0.ACT()
            if (r0 == 0) goto L_0x01c9
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x01c9
            goto L_0x0172
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60321JjQ.A01(X.JjQ):void");
    }
}
