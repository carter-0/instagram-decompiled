package X;

import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Jiv  reason: case insensitive filesystem */
public final class C60297Jiv extends 2YL {
    public final UserSession A00;
    public final C3500883e A01;
    public final List A02;
    public final C249513ju A03;
    public final AnonymousClass0r6 A04;
    public final AnonymousClass0r6 A05;
    public final 05G A06;
    public final C63910LBu A07;
    public final 05G A08;

    public C60297Jiv(C63910LBu lBu, UserSession userSession, C3500883e r11, AudioOverlayTrack audioOverlayTrack, List list) {
        int A032 = DbW.A03(2, list, lBu);
        this.A00 = userSession;
        this.A02 = list;
        this.A07 = lBu;
        this.A01 = r11;
        1HR A1G = JTO.A1G(0);
        this.A03 = A1G;
        0sn r7 = 0sn.A00;
        02z A012 = 106.A01(r7);
        this.A08 = A012;
        02z A013 = 106.A01(r7);
        this.A06 = A013;
        this.A04 = 0u9.A04(A1G);
        C61820pm A033 = AnonymousClass10H.A03(MIJ.A00, A012, A013);
        this.A05 = 10b.A02(new C53337GmN(r7, r7), C318116oQ.A00(this), A033, AnonymousClass10A.A01);
        1Eo.A05(AnonymousClass12T.A00.AOJ(1632833315, A032), new C59673JTe(this, list, (AnonymousClass4D7) null), C318116oQ.A00(this));
        if (audioOverlayTrack != null) {
            A013.Epw(0sr.A1L(new AudioOverlayTrack[]{audioOverlayTrack}));
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C60297Jiv r6, java.util.Map r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 42
            boolean r0 = X.C66139MDr.A01(r3, r8)
            if (r0 == 0) goto L_0x007a
            r5 = r8
            X.MDr r5 = (X.C66139MDr) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007a
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 == r2) goto L_0x005a
            if (r0 != r3) goto L_0x0080
            java.lang.Object r6 = r5.A01
            X.Jiv r6 = (X.C60297Jiv) r6
            X.0eS.A00(r1)
        L_0x002b:
            X.5sO r1 = X.DbU.A0f()
        L_0x002f:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003f
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r1 = r1.A00
            X.05G r0 = r6.A08
            r0.Epw(r1)
        L_0x003c:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x003f:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x003c
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0048:
            X.0eS.A00(r1)
            X.LBu r1 = r6.A07
            r0 = 10
            r5.A01 = r6
            r5.A00 = r2
            java.lang.Object r1 = r1.A00(r7, r5, r0)
            if (r1 != r4) goto L_0x0061
            return r4
        L_0x005a:
            java.lang.Object r6 = r5.A01
            X.Jiv r6 = (X.C60297Jiv) r6
            X.0eS.A00(r1)
        L_0x0061:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x002f
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0085
            X.3ju r1 = r6.A03
            X.HJC r0 = X.HJC.A00
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r0 = r1.ELH(r0, r5)
            if (r0 != r4) goto L_0x002b
            return r4
        L_0x007a:
            X.MDr r5 = new X.MDr
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0085:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60297Jiv.A00(X.Jiv, java.util.Map, X.4D7):java.lang.Object");
    }

    public static final LinkedHashMap A01(List list) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        for (Object next : list) {
            ((List) JTS.A0h(((C381469bo) next).A02, A1H)).add(next);
        }
        LinkedHashMap A0o = C51975G9x.A0o(A1H);
        Iterator A0s = AnonymousClass7TF.A0s(A1H);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            Object key = A1J.getKey();
            Iterable<C381469bo> iterable = (Iterable) A1J.getValue();
            LinkedHashMap A0x = DbS.A0x(JTT.A08(iterable));
            for (C381469bo r0 : iterable) {
                A0x.put(r0.A01, Float.valueOf(r0.A00));
            }
            A0o.put(key, A0x);
        }
        return A0o;
    }
}
