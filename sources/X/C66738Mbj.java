package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mbj  reason: case insensitive filesystem */
public abstract class C66738Mbj {
    public static final void A00(ViewModelListUpdate viewModelListUpdate, C66737Mbi mbi, C67145Mj3 mj3, C67141Miz miz, List list) {
        C51974G9v.A1L(mj3, list, mbi);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A01(viewModelListUpdate, mbi, mj3, (C67214MkA) it.next(), miz);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:221:0x03cc, code lost:
        if (r2.A0K.size() > r3) goto L_0x03ce;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(com.instagram.common.recyclerview.ViewModelListUpdate r15, X.C66737Mbi r16, X.C67145Mj3 r17, X.C67214MkA r18, X.C67141Miz r19) {
        /*
            r7 = 0
            r0 = 1
            r2 = r17
            X.0qQ.A0B(r2, r0)
            r0 = 2
            r3 = r18
            X.0qQ.A0B(r3, r0)
            r0 = 4
            r1 = r16
            X.0qQ.A0B(r1, r0)
            java.util.BitSet r1 = r1.A00
            int r0 = r3.A00
            boolean r0 = r1.get(r0)
            r11 = 0
            if (r0 != 0) goto L_0x001f
            return r7
        L_0x001f:
            java.util.Map r0 = r2.A00
            java.lang.Object r5 = r0.get(r3)
            X.Mis r5 = (X.C67134Mis) r5
            boolean r0 = r5 instanceof X.NW0
            r4 = r15
            r2 = r19
            if (r0 == 0) goto L_0x01ff
            X.NW0 r5 = (X.NW0) r5
            boolean r0 = r5 instanceof X.C67221MkH
            if (r0 == 0) goto L_0x003d
            X.NPL r5 = r2.A0B
        L_0x0036:
            if (r5 == 0) goto L_0x003c
        L_0x0038:
            r4.A00(r5)
        L_0x003b:
            r11 = 1
        L_0x003c:
            return r11
        L_0x003d:
            boolean r0 = r5 instanceof X.C67129Min
            if (r0 == 0) goto L_0x005d
            X.Min r5 = (X.C67129Min) r5
            X.NPJ r0 = r2.A0F
            if (r0 == 0) goto L_0x003c
            com.instagram.common.session.UserSession r1 = r5.A00
            boolean r0 = X.AnonymousClass430.A01(r1)
            if (r0 != 0) goto L_0x005a
            X.0qQ.A0B(r1, r7)
            com.instagram.monetization.repository.MonetizationRepository r0 = X.AnonymousClass2o3.A00(r1)
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x003c
        L_0x005a:
            X.NPJ r5 = r2.A0F
            goto L_0x0036
        L_0x005d:
            boolean r0 = r5 instanceof X.C67217MkD
            if (r0 == 0) goto L_0x0064
            X.2tL r5 = r2.A03
            goto L_0x0036
        L_0x0064:
            boolean r0 = r5 instanceof X.C67219MkF
            if (r0 == 0) goto L_0x006b
            X.MhY r5 = X.C67219MkF.A00
            goto L_0x0036
        L_0x006b:
            boolean r0 = r5 instanceof X.C67215MkB
            if (r0 == 0) goto L_0x0072
            X.MeV r5 = r2.A0H
            goto L_0x0036
        L_0x0072:
            boolean r0 = r5 instanceof X.C67218MkE
            if (r0 == 0) goto L_0x0079
            X.2tL r5 = r2.A02
            goto L_0x0036
        L_0x0079:
            boolean r0 = r5 instanceof X.C67146Mj4
            if (r0 == 0) goto L_0x0086
            X.NPK r5 = r2.A0D
            if (r5 == 0) goto L_0x003c
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x003c
            goto L_0x0036
        L_0x0086:
            boolean r0 = r5 instanceof X.C67123Mih
            if (r0 == 0) goto L_0x00fe
            X.Mih r5 = (X.C67123Mih) r5
            java.util.List r0 = r2.A0N
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != 0) goto L_0x009c
            java.util.List r0 = r2.A0O
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x003c
        L_0x009c:
            X.2EM r1 = r2.A0E
            X.2EX r0 = X.AnonymousClass2EX.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00c2
            com.instagram.common.session.UserSession r6 = r5.A00
            X.0qQ.A0B(r6, r7)
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r6)
            boolean r0 = X.2Ek.A02(r0)
            if (r0 == 0) goto L_0x00d3
            X.0Tu r3 = X.0Tu.A05
            r0 = 36317934217402005(0x8106f800011695, double:3.03094606744348E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 == 0) goto L_0x00d3
        L_0x00c2:
            java.util.List r0 = r2.A0M
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x00da
            java.util.List r0 = r2.A0O
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00da
            return r11
        L_0x00d3:
            boolean r0 = X.2El.A0J(r6)
            if (r0 != 0) goto L_0x00c2
            return r11
        L_0x00da:
            boolean r0 = r2.A0P
            if (r0 == 0) goto L_0x00f2
            java.util.List r0 = r2.A0O
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x00f2
            com.instagram.common.session.UserSession r0 = r5.A00
            boolean r0 = X.2El.A05(r0)
            if (r0 != 0) goto L_0x00f2
            X.MiZ r5 = r5.A01
            goto L_0x0036
        L_0x00f2:
            boolean r0 = r2.A0Q
            if (r0 == 0) goto L_0x003c
            X.2ms r0 = r5.A02
            X.Toc r5 = X.C14036Toc.A00(r0)
            goto L_0x0036
        L_0x00fe:
            boolean r0 = r5 instanceof X.C67126Mik
            if (r0 == 0) goto L_0x0134
            X.Mik r5 = (X.C67126Mik) r5
            com.instagram.common.session.UserSession r12 = r5.A00
            X.Mbk r5 = r5.A01
            X.AnonymousClass7TF.A1H(r12, r5)
            java.lang.Integer r1 = r2.A0J
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0115
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x003c
        L_0x0115:
            r14 = 0
            java.lang.String r13 = "IRIS_ERROR_EMPTY_STATE_VIEW_IMPRESSION"
            r16 = r14
            r18 = r14
            X.C3265677h.A0p(r12, r13, r14, r16, r18)
            java.util.List r0 = r2.A0N
            boolean r3 = X.AnonymousClass7TE.A1b(r0)
            java.util.List r0 = r2.A0O
            boolean r1 = X.AnonymousClass7TE.A1b(r0)
            java.lang.Integer r0 = r2.A0J
            X.MlO r5 = r5.A01(r0, r3, r1)
            goto L_0x0036
        L_0x0134:
            boolean r0 = r5 instanceof X.C67131Mip
            if (r0 == 0) goto L_0x013c
            X.NP6 r5 = r2.A04
            goto L_0x0036
        L_0x013c:
            boolean r0 = r5 instanceof X.C67216MkC
            if (r0 == 0) goto L_0x0144
            X.MfX r5 = r2.A07
            goto L_0x0036
        L_0x0144:
            boolean r0 = r5 instanceof X.C67222MkI
            if (r0 == 0) goto L_0x014c
            X.McZ r5 = r2.A0C
            goto L_0x0036
        L_0x014c:
            boolean r0 = r5 instanceof X.C67132Miq
            if (r0 == 0) goto L_0x0154
            X.Oty r5 = r2.A05
            goto L_0x0036
        L_0x0154:
            boolean r0 = r5 instanceof X.C67127Mil
            if (r0 == 0) goto L_0x01a3
            X.Mil r5 = (X.C67127Mil) r5
            com.instagram.common.session.UserSession r6 = r5.A00
            boolean r0 = X.C66582MXn.A1Q(r6)
            if (r0 == 0) goto L_0x003c
            com.instagram.api.schemas.BizUserInboxState r1 = r2.A01
            com.instagram.api.schemas.BizUserInboxState r0 = com.instagram.api.schemas.BizUserInboxState.GENERAL_FOLDER_THROTTLED
            if (r1 == r0) goto L_0x016c
            com.instagram.api.schemas.BizUserInboxState r0 = com.instagram.api.schemas.BizUserInboxState.NORMAL
            if (r1 != r0) goto L_0x0185
        L_0x016c:
            boolean r0 = X.AnonymousClass78K.A00(r6)
            if (r0 == 0) goto L_0x0185
            X.NPD r0 = r2.A08
            if (r0 == 0) goto L_0x0185
            X.Mie r1 = r5.A02
            com.instagram.api.schemas.BizUserInboxState r0 = r2.A01
            java.lang.String r0 = r0.name()
            r1.A00(r0)
        L_0x0181:
            X.NPD r5 = r2.A08
            goto L_0x0036
        L_0x0185:
            com.instagram.api.schemas.BizUserInboxState r3 = r2.A01
            com.instagram.api.schemas.BizUserInboxState r0 = com.instagram.api.schemas.BizUserInboxState.NEW_API_THREADS_THROTTLED
            if (r3 != r0) goto L_0x003c
            X.Mie r1 = r5.A02
            java.lang.String r0 = r3.name()
            r1.A00(r0)
            boolean r0 = X.AnonymousClass78K.A00(r6)
            if (r0 == 0) goto L_0x019f
            X.NPD r0 = r2.A08
            if (r0 == 0) goto L_0x019f
            goto L_0x0181
        L_0x019f:
            X.Mia r5 = r5.A01
            goto L_0x0036
        L_0x01a3:
            boolean r0 = r5 instanceof X.C67128Mim
            if (r0 == 0) goto L_0x01ed
            X.Mim r5 = (X.C67128Mim) r5
            com.instagram.common.session.UserSession r3 = r5.A00
            X.0qQ.A0B(r3, r7)
            com.instagram.api.schemas.BizUserInboxState r1 = r2.A01
            com.instagram.api.schemas.BizUserInboxState r0 = com.instagram.api.schemas.BizUserInboxState.GENERAL_FOLDER_THROTTLED
            if (r1 != r0) goto L_0x003c
            boolean r0 = X.C66582MXn.A1Q(r3)
            if (r0 == 0) goto L_0x003c
            boolean r0 = X.AnonymousClass78K.A00(r3)
            if (r0 != 0) goto L_0x003c
            X.Mie r1 = r5.A02
            com.instagram.api.schemas.BizUserInboxState r0 = r2.A01
            java.lang.String r0 = r0.name()
            r1.A00(r0)
            X.Mbk r0 = r5.A01
            X.72b r3 = r0.A05
            X.6rr r2 = X.C320156rr.EMPTY
            X.2EM r1 = r0.A00
            if (r1 != 0) goto L_0x01df
            java.lang.String r0 = "emptyMode"
        L_0x01d7:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01df:
            X.48q r0 = r0.A01
            if (r0 != 0) goto L_0x01e6
            java.lang.String r0 = "emptyFilter"
            goto L_0x01d7
        L_0x01e6:
            X.MlO r5 = new X.MlO
            r5.<init>(r1, r0, r3, r2)
            goto L_0x0038
        L_0x01ed:
            boolean r0 = r5 instanceof X.C67133Mir
            if (r0 == 0) goto L_0x01f7
            X.Mir r5 = (X.C67133Mir) r5
            X.JYS r5 = r5.A00
            goto L_0x0036
        L_0x01f7:
            boolean r0 = r5 instanceof X.C67130Mio
            if (r0 == 0) goto L_0x003c
            X.NOx r5 = r2.A0A
            goto L_0x0036
        L_0x01ff:
            boolean r0 = r5 instanceof X.C68764NVz
            if (r0 == 0) goto L_0x0427
            X.NVz r5 = (X.C68764NVz) r5
            boolean r0 = r5 instanceof X.C67125Mij
            if (r0 == 0) goto L_0x029e
            X.Mij r5 = (X.C67125Mij) r5
            X.Mbk r5 = r5.A00
            java.util.List r0 = r2.A0N
            boolean r3 = X.AnonymousClass7TE.A1b(r0)
            java.util.List r0 = r2.A0O
            boolean r1 = X.AnonymousClass7TE.A1b(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.MlO r3 = r5.A01(r0, r3, r1)
            java.util.List r0 = r2.A0O
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x028b
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r2.A0O
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x0239:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0252
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.Mb9 r0 = (X.C66702Mb9) r0
            boolean r0 = r0.A0h
            if (r0 == 0) goto L_0x024e
            r7.add(r2)
            goto L_0x0239
        L_0x024e:
            r8.add(r2)
            goto L_0x0239
        L_0x0252:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r8.iterator()
        L_0x025e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0277
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.Mb9 r0 = (X.C66702Mb9) r0
            boolean r0 = r0.A0f
            if (r0 == 0) goto L_0x0273
            r6.add(r2)
            goto L_0x025e
        L_0x0273:
            r5.add(r2)
            goto L_0x025e
        L_0x0277:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0280
            r1.addAll(r7)
        L_0x0280:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x031d
            r1.addAll(r6)
            goto L_0x031d
        L_0x028b:
            X.2EM r1 = r2.A0E
            X.2EX r0 = X.AnonymousClass2EX.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0405
            java.util.List r0 = r2.A0N
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0405
            return r11
        L_0x029e:
            boolean r0 = r5 instanceof X.C67124Mii
            if (r0 == 0) goto L_0x02d1
            X.Mii r5 = (X.C67124Mii) r5
            X.48q r1 = r2.A0G
            X.48q r0 = X.C2611948q.ALL
            if (r1 != r0) goto L_0x003c
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            X.2EM r0 = r2.A0E
            X.2EX r3 = X.AnonymousClass2EX.A00
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x02f2
            java.util.List r0 = r2.A0L
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x02f2
            X.Mid r0 = r5.A00
            r1.add(r0)
            java.util.List r0 = r2.A0L
            r1.addAll(r0)
            X.MiX r0 = r5.A02
            r1.add(r0)
            goto L_0x041c
        L_0x02d1:
            boolean r0 = r5 instanceof X.C67142Mj0
            if (r0 == 0) goto L_0x0322
            java.util.List r0 = r2.A0M
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x003c
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            X.Dg4 r0 = r2.A09
            if (r0 == 0) goto L_0x02e8
            r1.add(r0)
        L_0x02e8:
            X.Ote r0 = r2.A06
            if (r0 == 0) goto L_0x02ef
            r1.add(r0)
        L_0x02ef:
            java.util.List r5 = r2.A0M
            goto L_0x031d
        L_0x02f2:
            java.util.List r0 = r2.A0L
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0304
            X.Mid r0 = r5.A01
            r1.add(r0)
            java.util.List r0 = r2.A0L
            r1.addAll(r0)
        L_0x0304:
            X.2EM r0 = r2.A0E
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 != 0) goto L_0x041a
            java.util.List r0 = r2.A0N
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x041a
            X.Mgs r0 = r2.A0I
            if (r0 == 0) goto L_0x031b
            r1.add(r0)
        L_0x031b:
            java.util.List r5 = r2.A0N
        L_0x031d:
            r1.addAll(r5)
            goto L_0x041c
        L_0x0322:
            boolean r0 = r5 instanceof X.C67122Mig
            if (r0 == 0) goto L_0x0399
            X.Mig r5 = (X.C67122Mig) r5
            X.Mib r3 = r5.A00
            X.48q r6 = r2.A0G
            java.util.List r0 = r2.A0O
            int r1 = r0.size()
            java.util.List r0 = r2.A0N
            int r9 = r0.size()
            java.util.List r0 = r2.A0M
            int r10 = r0.size()
            X.48q r0 = X.C2611948q.ALL
            if (r6 != r0) goto L_0x003c
            r8 = 5
            if (r1 >= r8) goto L_0x003c
            X.PxD r1 = r3.A02
            boolean r0 = r1.isLoading()
            if (r0 != 0) goto L_0x003c
            boolean r0 = r1.CJm()
            if (r0 != 0) goto L_0x003c
            android.content.Context r7 = r3.A00
            com.instagram.common.session.UserSession r6 = r3.A01
            X.4bu r2 = r3.A03
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            X.Mi2 r0 = new X.Mi2
            r0.<init>(r2)
            r1.add(r0)
            X.Mi1 r0 = new X.Mi1
            r0.<init>(r2)
            r1.add(r0)
            r3 = 2
            java.util.Iterator r2 = r1.iterator()
            r1 = 0
        L_0x0373:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0385
            java.lang.Object r0 = r2.next()
            X.Pw2 r0 = (X.C74507Pw2) r0
            boolean r0 = r0.Esw(r7, r6)
            int r1 = r1 + r0
            goto L_0x0373
        L_0x0385:
            if (r1 < r3) goto L_0x003c
            if (r9 > r8) goto L_0x003c
            if (r10 > r8) goto L_0x003c
            X.Mgs r1 = r5.A01
            X.MiY r0 = r5.A02
            X.2tL[] r0 = new X.C232262tL[]{r1, r0}
            java.util.List r1 = X.0sr.A1P(r0)
            goto L_0x041a
        L_0x0399:
            X.Mj2 r5 = (X.C67144Mj2) r5
            X.48q r1 = r2.A0G
            X.48q r0 = X.C2611948q.ALL
            if (r1 != r0) goto L_0x003c
            com.instagram.common.session.UserSession r8 = r5.A00
            X.0Tu r7 = X.0Tu.A05
            r0 = 36317934218385060(0x8106f8001016a4, double:3.030946068065168E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x003c
            java.util.List r0 = r2.A0K
            boolean r0 = r0.isEmpty()
            r6 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x003c
            r0 = 36599409195945475(0x8206f8001d0e03, double:3.208951977283135E-306)
            int r3 = X.DbS.A04(r7, r8, r0)
            if (r3 <= 0) goto L_0x0403
            java.util.List r0 = r2.A0K
            int r0 = r0.size()
            if (r0 <= r3) goto L_0x03ec
        L_0x03ce:
            r0 = 36317934218778281(0x8106f8001616a9, double:3.0309460683138425E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x03ec
            X.Mid r12 = r5.A01
        L_0x03db:
            java.util.List r1 = X.AnonymousClass7TE.A1I(r12)
            java.util.List r0 = r2.A0K
            if (r6 == 0) goto L_0x03e7
            java.util.List r0 = X.00k.A0d(r0, r3)
        L_0x03e7:
            java.util.ArrayList r1 = X.00k.A0S(r0, r1)
            goto L_0x041a
        L_0x03ec:
            X.Mid r0 = r5.A01
            java.lang.String r15 = r0.A03
            java.lang.Integer r13 = r0.A02
            int r1 = r0.A00
            r14 = 0
            boolean r0 = r0.A05
            r18 = 1
            X.Mid r12 = new X.Mid
            r17 = r0
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            goto L_0x03db
        L_0x0403:
            r6 = 0
            goto L_0x03ce
        L_0x0405:
            if (r3 != 0) goto L_0x0416
            X.2EM r1 = r2.A0E
            X.496 r0 = X.AnonymousClass496.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x003c
            X.NOt r3 = new X.NOt
            r3.<init>()
        L_0x0416:
            java.util.List r1 = X.AnonymousClass7TE.A1I(r3)
        L_0x041a:
            if (r1 == 0) goto L_0x003c
        L_0x041c:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x003c
            r4.A01(r1)
            goto L_0x003b
        L_0x0427:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "No section generator found for section type "
            r1.append(r0)
            r1.append(r3)
            r0 = 33
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66738Mbj.A01(com.instagram.common.recyclerview.ViewModelListUpdate, X.Mbi, X.Mj3, X.MkA, X.Miz):boolean");
    }
}
