package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallImage;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallText;
import com.instagram.wonderwall.repository.WallPostRepository;
import java.util.List;

/* renamed from: X.Ghg  reason: case insensitive filesystem */
public final class C53048Ghg extends 2YL implements C66528MVg, C59623JQr {
    public final 1Ng A00;
    public final UserSession A01;
    public final WallInfo A02;
    public final JQP A03;
    public final WallPostRepository A04;
    public final List A05;
    public final List A06;
    public final AnonymousClass0eM A07;
    public final C249513ju A08;
    public final AnonymousClass0r6 A09;
    public final 05G A0A;
    public final AnonymousClass0Ud A0B;

    public final void ADx(User user) {
        0qQ.A0B(user, 0);
        A02(new C57512Ic0(user, C59098J6g.A01(this, 16)), this);
    }

    public final void Dzv(WallPostItem wallPostItem) {
        0qQ.A0B(wallPostItem, 0);
        A02(new C57510Iby(wallPostItem), this);
    }

    public final void Dzw(WallPostItem wallPostItem) {
    }

    public final void Dzz(C61046Jvk jvk, WallPostItem wallPostItem) {
    }

    public final void E00(WallPostItem wallPostItem) {
    }

    public final void EGN(WallPostItem wallPostItem) {
        0qQ.A0B(wallPostItem, 0);
        A02(new C57513Ic1(wallPostItem, new J6T(32, (Object) wallPostItem, (Object) this)), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0080, code lost:
        if (r6.A0B != false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C53048Ghg(com.instagram.common.session.UserSession r15, com.instagram.wonderwall.model.WallPostItem r16, boolean r17) {
        /*
            r14 = this;
            r8 = r16
            com.instagram.wonderwall.model.WallPostInfo r6 = r8.BeB()
            com.instagram.wonderwall.model.WallInfo r1 = r6.A04
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r15)
            r2 = 1
            X.C51973G9u.A0r(r2, r15, r1, r0)
            r14.<init>()
            r14.A01 = r15
            r14.A02 = r1
            r14.A00 = r0
            X.1HR r0 = X.G9w.A0w()
            r14.A08 = r0
            X.05Y r0 = X.0u9.A04(r0)
            r14.A09 = r0
            com.instagram.user.model.User r1 = r1.A00
            com.instagram.user.model.User r0 = r6.A03
            com.instagram.user.model.User[] r1 = new com.instagram.user.model.User[]{r1, r0}
            r0 = 0
            java.util.Set r0 = X.C51967G9n.A0t(r1, r0)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r0.iterator()
        L_0x003a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r3 = r5.next()
            java.lang.String r1 = X.DbS.A0q(r3)
            com.instagram.common.session.UserSession r0 = r14.A01
            boolean r0 = X.C51966G9m.A1W(r0, r1)
            if (r0 != 0) goto L_0x003a
            r4.add(r3)
            goto L_0x003a
        L_0x0054:
            r14.A05 = r4
            X.0eO r1 = X.0eO.A02
            r3 = 16
            X.Ivv r0 = X.C58686Ivv.A00(r14, r3)
            X.0eM r0 = X.AnonymousClass0eN.A00(r1, r0)
            r14.A07 = r0
            java.util.ArrayList r0 = X.00k.A0U(r4)
            r14.A06 = r0
            com.instagram.wonderwall.model.WallInfo r0 = r14.A02
            com.instagram.user.model.User r0 = r0.A00
            java.lang.String r0 = r0.getUsername()
            com.instagram.wonderwall.model.WallText$Raw r9 = new com.instagram.wonderwall.model.WallText$Raw
            r9.<init>(r0)
            com.instagram.wonderwall.model.WallInfo r0 = r14.A02
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0082
            boolean r0 = r6.A0B
            r11 = 0
            if (r0 == 0) goto L_0x0083
        L_0x0082:
            r11 = 1
        L_0x0083:
            com.instagram.common.session.UserSession r7 = r14.A01
            X.0Tu r5 = X.0Tu.A05
            r0 = 36322353739409504(0x810afd000b2860, double:3.033740990957009E-306)
            boolean r0 = X.182.A06(r5, r7, r0)
            if (r0 == 0) goto L_0x009c
            com.instagram.wonderwall.model.WallInfo r0 = r14.A02
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x00d9
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x00d9
        L_0x009c:
            r12 = 0
        L_0x009d:
            com.instagram.wonderwall.model.WallText r10 = A01(r14)
            int r0 = r4.size()
            boolean r13 = X.C51970G9q.A1W(r0, r2)
            X.GnH r7 = new X.GnH
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.02z r0 = X.DbS.A10(r7)
            r14.A0A = r0
            r14.A0B = r0
            X.IbV r4 = new X.IbV
            r4.<init>(r8, r14)
            r14.A03 = r4
            com.instagram.common.session.UserSession r0 = r14.A01
            com.instagram.wonderwall.api.WallApiGraphQLImpl r2 = new com.instagram.wonderwall.api.WallApiGraphQLImpl
            r2.<init>(r0)
            com.instagram.wonderwall.repository.WallPendingPostManager r1 = X.C56353Hx4.A00(r0)
            com.instagram.wonderwall.repository.WallPostRepository r0 = new com.instagram.wonderwall.repository.WallPostRepository
            r0.<init>(r2, r1, r4)
            r14.A04 = r0
            if (r17 == 0) goto L_0x00d8
            X.6oS r0 = X.C318116oQ.A00(r14)
            X.C58106ImS.A03(r14, r0, r3)
        L_0x00d8:
            return
        L_0x00d9:
            r12 = 1
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53048Ghg.<init>(com.instagram.common.session.UserSession, com.instagram.wonderwall.model.WallPostItem, boolean):void");
    }

    public static final C55818Hny A00(User user, User user2, C62320sa r5, boolean z) {
        WallText raw;
        if (user2 != null) {
            raw = new WallText.Res(2131976773, new String[]{user2.getUsername(), user.getUsername()});
        } else {
            raw = new WallText.Raw(user.getUsername());
        }
        return new C55818Hny(new WallImage.CircularAvatar(user, user2), raw, r5, false, z);
    }

    public static final WallText A01(C53048Ghg ghg) {
        int i;
        String[] strArr;
        List list = ghg.A06;
        int size = list.size();
        if (size == 0) {
            return C56485HzH.A00;
        }
        if (size != 1) {
            i = 2131976771;
            strArr = new String[]{DbX.A0u(list, 0), DbX.A0u(list, 1)};
        } else {
            i = 2131976770;
            strArr = new String[]{DbX.A0u(list, 0)};
        }
        return new WallText.Res(i, strArr);
    }

    public static final void A03(C53048Ghg ghg, 0sP r3) {
        Object value;
        05G r2 = ghg.A0A;
        do {
            value = r2.getValue();
        } while (!r2.AIY(value, r3.invoke(value)));
    }

    public final void A04(boolean z) {
        A03(this, new GL4(z, 27));
    }

    public final void CLN() {
        A03(this, C59061J4u.A00);
    }

    public final void DwK(String str) {
        A02(new C57508Ibw(str), this);
    }

    public final void Dzy(String str) {
        A02(new C57507Ibv(str), this);
    }

    public final void EuO(C55817Hnx hnx) {
        A03(this, C59098J6g.A01(hnx, 18));
    }

    public final void EvQ(WallText wallText) {
        A02(new C57511Ibz(wallText), this);
    }

    public static final void A02(JMN jmn, C53048Ghg ghg) {
        C51975G9x.A1E(jmn, ghg, C318116oQ.A00(ghg), 25);
    }
}
