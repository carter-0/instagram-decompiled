package X;

import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class LOL {
    public final View A00;
    public final UserSession A01;
    public final C63637L0z A02;
    public final L4J A03;
    public final ArrayList A04 = AnonymousClass7TE.A1C();
    public final ArrayList A05 = AnonymousClass7TE.A1C();
    public final LinkedHashMap A06 = AnonymousClass7TE.A1H();
    public final RecyclerView A07;
    public final C60400Jkt A08;
    public final ArrayList A09 = AnonymousClass7TE.A1C();

    public LOL(View view, UserSession userSession, C63637L0z l0z, L4J l4j) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = view;
        this.A02 = l0z;
        this.A03 = l4j;
        RecyclerView A0c = JTR.A0c(view, R.id.suggested_items_recyclerview);
        this.A07 = A0c;
        C60400Jkt jkt = new C60400Jkt(l0z, l4j);
        this.A08 = jkt;
        DbV.A1A(view.getContext(), A0c);
        A0c.setAdapter(jkt);
        Resources resources = view.getResources();
        JTP.A1D(A0c, AnonymousClass7TE.A0B(resources), AnonymousClass7TE.A0D(resources));
        1OC A002 = C45154CrH.A00(this.A01);
        C61500KAf.A00(A002, this, 17);
        1ES.A03(A002);
    }

    public final void A01(List list) {
        0qQ.A0B(list, 0);
        LinkedHashMap linkedHashMap = this.A06;
        linkedHashMap.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C46322DUz dUz = (C46322DUz) it.next();
            String Amv = dUz.Amv();
            if (Amv == null) {
                Amv = 002.A0D(dUz.getFundraiserId(), '!');
            }
            linkedHashMap.put(Amv, dUz);
        }
        A00(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.LOL r8) {
        /*
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r1 = r8.A04
            java.util.ArrayList r0 = r8.A05
            r6 = 1
            java.util.ArrayList[] r0 = new java.util.ArrayList[]{r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            X.0jq r4 = X.00k.A0o(r0)
            X.MP3 r1 = X.MP3.A00
            X.PqJ r0 = X.C74177PqJ.A00
            X.Pe3 r2 = new X.Pe3
            r2.<init>(r0, r1, r4)
            r1 = 9
            X.MP9 r0 = new X.MP9
            r0.<init>(r8, r1)
            X.3T1 r2 = X.C242173Sx.A09(r0, r2)
            r1 = 13
            X.MAY r0 = new X.MAY
            r0.<init>(r1)
            X.9Us r1 = new X.9Us
            r1.<init>(r0, r2)
            r0 = 5
            X.Wr8 r2 = new X.Wr8
            r2.<init>(r1, r0)
            r1 = 29
            X.J6W r0 = new X.J6W
            r0.<init>(r1, r3, r7, r8)
            X.3Sz r0 = X.C242173Sx.A0E(r0, r2)
            X.C242173Sx.A07(r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r3)
            r5 = 0
            if (r0 == 0) goto L_0x00a1
            com.instagram.common.session.UserSession r4 = r8.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317985756944088(0x810704000016d8, double:3.0309786612574264E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x00a1
            java.util.ArrayList r1 = r8.A09
            boolean r0 = X.0qQ.A0K(r1, r7)
            if (r0 != 0) goto L_0x0091
            r1.clear()
            r1.addAll(r7)
            X.L4J r0 = r8.A03
            com.instagram.common.session.UserSession r2 = r0.A01
            java.lang.String r1 = "VIDEO_COMPOSER"
            X.0iw r0 = r0.A00
            X.LTM.A08(r0, r2, r1, r7)
            X.Jkt r2 = r8.A08
            java.util.ArrayList r1 = r2.A03
            boolean r0 = X.0qQ.A0K(r1, r3)
            if (r0 != 0) goto L_0x008e
            r2.A00 = r5
            r1.clear()
            r1.addAll(r3)
        L_0x008e:
            r2.notifyDataSetChanged()
        L_0x0091:
            androidx.recyclerview.widget.RecyclerView r1 = r8.A07
            X.Jkt r0 = r8.A08
            int r0 = r0.getItemCount()
            if (r0 != 0) goto L_0x009d
            r5 = 8
        L_0x009d:
            r1.setVisibility(r5)
            return
        L_0x00a1:
            java.util.ArrayList r1 = r8.A09
            boolean r0 = X.DbT.A1b(r1)
            if (r0 == 0) goto L_0x00bf
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00bf
            r1.clear()
            X.L4J r0 = r8.A03
            com.instagram.common.session.UserSession r3 = r0.A01
            java.lang.String r2 = "VIDEO_COMPOSER"
            X.0sn r1 = X.0sn.A00
            X.0iw r0 = r0.A00
            X.LTM.A08(r0, r3, r2, r1)
        L_0x00bf:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.LinkedHashMap r0 = r8.A06
            java.util.Iterator r3 = X.AnonymousClass7TF.A0t(r0)
        L_0x00c9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r1 = X.AnonymousClass7TF.A0a(r3)
            X.DUz r1 = (X.C46322DUz) r1
            java.lang.String r2 = r1.getFundraiserTitle()
            r0 = 46
            X.LYG r1 = X.LYG.A01(r8, r1, r0)
            X.L4I r0 = new X.L4I
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x00c9
        L_0x00e8:
            X.Jkt r2 = r8.A08
            java.util.ArrayList r1 = r2.A03
            boolean r0 = X.0qQ.A0K(r1, r4)
            if (r0 != 0) goto L_0x008e
            r2.A00 = r6
            r1.clear()
            r1.addAll(r4)
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LOL.A00(X.LOL):void");
    }
}
