package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Dm5  reason: case insensitive filesystem */
public final class C46829Dm5 extends 2Rw {
    public C14631Tzd A00;
    public List A01 = AnonymousClass7TE.A1C();
    public final UserSession A02;
    public final User A03;
    public final C49533ExF A04;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        X.FPG.A00(r7.itemView, 43, r6, r5);
        r7.itemView.setTag(java.lang.Integer.valueOf(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d1, code lost:
        r2.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d4, code lost:
        X.DbT.A17(r4, r2, X.2Yu.A03(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r7, int r8) {
        /*
            r6 = this;
            X.Dnb r7 = (X.C46921Dnb) r7
            java.util.List r0 = r6.A01
            java.lang.Object r5 = r0.get(r8)
            X.EVe r5 = (X.C48086EVe) r5
            android.content.Context r4 = X.DbS.A07(r7)
            int r0 = r5.ordinal()
            r2 = 1
            switch(r0) {
                case 0: goto L_0x009e;
                case 1: goto L_0x008f;
                case 2: goto L_0x0083;
                case 3: goto L_0x00a4;
                case 4: goto L_0x007d;
                case 5: goto L_0x006c;
                case 6: goto L_0x0089;
                case 7: goto L_0x0054;
                case 8: goto L_0x003c;
                case 9: goto L_0x0035;
                case 10: goto L_0x00c4;
                case 11: goto L_0x002e;
                case 12: goto L_0x0027;
                default: goto L_0x0016;
            }
        L_0x0016:
            android.view.View r1 = r7.itemView
            r0 = 43
            X.FPG.A00(r1, r0, r6, r5)
            android.view.View r1 = r7.itemView
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1.setTag(r0)
            return
        L_0x0027:
            android.widget.TextView r4 = r7.A00
            r1 = 2131971636(0x7f134e34, float:1.9580257E38)
            goto L_0x00bf
        L_0x002e:
            android.widget.TextView r4 = r7.A00
            r1 = 2131971617(0x7f134e21, float:1.9580218E38)
            goto L_0x00bf
        L_0x0035:
            android.widget.TextView r4 = r7.A00
            r1 = 2131974396(0x7f1358fc, float:1.9585855E38)
            goto L_0x00bf
        L_0x003c:
            android.widget.TextView r4 = r7.A00
            com.instagram.common.session.UserSession r3 = r6.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318247751522347(0x8107410018182b, double:3.031144347683685E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 2131966168(0x7f1338d8, float:1.9569167E38)
            if (r0 == 0) goto L_0x00bf
            r1 = 2131966169(0x7f1338d9, float:1.9569169E38)
            goto L_0x00bf
        L_0x0054:
            android.widget.TextView r4 = r7.A00
            com.instagram.common.session.UserSession r3 = r6.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318247751522347(0x8107410018182b, double:3.031144347683685E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 2131966160(0x7f1338d0, float:1.956915E38)
            if (r0 == 0) goto L_0x00bf
            r1 = 2131966161(0x7f1338d1, float:1.9569152E38)
            goto L_0x00bf
        L_0x006c:
            android.widget.TextView r4 = r7.A00
            com.instagram.user.model.User r0 = r6.A03
            int r0 = r0.BIW()
            r1 = 2131976660(0x7f1361d4, float:1.9590447E38)
            if (r0 != r2) goto L_0x00bf
            r1 = 2131976627(0x7f1361b3, float:1.959038E38)
            goto L_0x00bf
        L_0x007d:
            android.widget.TextView r4 = r7.A00
            r1 = 2131966166(0x7f1338d6, float:1.9569162E38)
            goto L_0x00bf
        L_0x0083:
            android.widget.TextView r4 = r7.A00
            r1 = 2131972018(0x7f134fb2, float:1.9581032E38)
            goto L_0x00bf
        L_0x0089:
            android.widget.TextView r4 = r7.A00
            r1 = 2131966167(0x7f1338d7, float:1.9569164E38)
            goto L_0x00bf
        L_0x008f:
            android.widget.TextView r2 = r7.A00
            r1 = 2131953910(0x7f1308f6, float:1.9544304E38)
            com.instagram.user.model.User r0 = r6.A03
            java.lang.String r0 = r0.getFullName()
            X.DbX.A13(r4, r2, r0, r1)
            goto L_0x00d4
        L_0x009e:
            android.widget.TextView r2 = r7.A00
            r0 = 2131953909(0x7f1308f5, float:1.9544302E38)
            goto L_0x00d1
        L_0x00a4:
            com.instagram.user.model.User r3 = r6.A03
            int r0 = r3.BIW()
            if (r0 != r2) goto L_0x00ba
            android.widget.TextView r2 = r7.A00
            r1 = 2131966164(0x7f1338d4, float:1.9569158E38)
            java.lang.String r0 = r3.getFullName()
            X.DbX.A13(r4, r2, r0, r1)
            goto L_0x0016
        L_0x00ba:
            android.widget.TextView r4 = r7.A00
            r1 = 2131966163(0x7f1338d3, float:1.9569156E38)
        L_0x00bf:
            r4.setText(r1)
            goto L_0x0016
        L_0x00c4:
            X.Tzd r0 = r6.A00
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r0.A0D
            if (r0 != 0) goto L_0x00dd
            android.widget.TextView r2 = r7.A00
            r0 = 2131972313(0x7f1350d9, float:1.958163E38)
        L_0x00d1:
            r2.setText(r0)
        L_0x00d4:
            int r0 = X.2Yu.A03(r4)
            X.DbT.A17(r4, r2, r0)
            goto L_0x0016
        L_0x00dd:
            android.widget.TextView r2 = r7.A00
            r0 = 2131975973(0x7f135f25, float:1.9589053E38)
            goto L_0x00d1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46829Dm5.onBindViewHolder(X.3kE, int):void");
    }

    public C46829Dm5(UserSession userSession, C14631Tzd tzd, User user, C49533ExF exF) {
        this.A02 = userSession;
        this.A03 = user;
        this.A00 = tzd;
        this.A04 = exF;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1771161417);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(1679832569, A032);
        return size;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C46921Dnb(DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.layout_reel_dashboard_actions_row));
    }
}
