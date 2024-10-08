package X;

import android.content.Context;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.Collections;

public abstract class FCO {
    public static void A01(Context context, MusicOverlayStickerModel musicOverlayStickerModel, G7K g7k, boolean z) {
        int i;
        if (z || !C271404in.A0D(musicOverlayStickerModel)) {
            C50021FJg A00 = C50021FJg.A00(g7k, 27);
            C50021FJg A002 = C50021FJg.A00(g7k, 28);
            C358248ab A0Y = DbS.A0Y(context);
            if (musicOverlayStickerModel == null || !AnonymousClass7TF.A1Y(musicOverlayStickerModel.A0E, true)) {
                A0Y.A09(2131972590);
                i = 2131972589;
            } else {
                A0Y.A09(2131972592);
                i = 2131972591;
            }
            A0Y.A08(i);
            A0Y.A0I(A00, 2131972512);
            A0Y.A0C(A002);
            A0Y.A0s(true);
            C49968FHb.A00(A0Y, A002, 4);
            DbT.A1V(A0Y);
            return;
        }
        g7k.Dje(Collections.singletonList(AnonymousClass7TE.A0v()));
    }

    public static void A00(Context context, C255773uh r4, G7K g7k) {
        MusicOverlayStickerModel A04 = C271404in.A04(r4);
        if (!C271404in.A0D(A04)) {
            Boolean bool = Boolean.TRUE;
            A04.getClass();
            C49007Enj.A00(context, C50021FJg.A00(g7k, 29), bool.equals(A04.A0E));
            return;
        }
        g7k.Dje(Collections.singletonList(AnonymousClass7TE.A0v()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        if (r3 == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.content.Context r9, X.G7K r10, java.util.List r11) {
        /*
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.lang.Boolean r8 = X.AnonymousClass7TE.A0v()
            java.util.Iterator r7 = r11.iterator()
            r6 = r8
        L_0x000d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0050
            java.lang.Object r1 = r7.next()
            X.1Xj r1 = (X.1Xj) r1
            r0 = 0
            com.instagram.music.common.model.MusicOverlayStickerModel r4 = X.C271404in.A03(r0, r1, r0)
            boolean r3 = X.C271404in.A0D(r4)
            boolean r0 = r8.booleanValue()
            r2 = 0
            if (r0 == 0) goto L_0x002c
            r0 = 1
            if (r3 != 0) goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            if (r4 == 0) goto L_0x0048
            boolean r0 = r6.booleanValue()
            if (r0 == 0) goto L_0x0044
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r4.A0E
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0044
            r2 = 1
        L_0x0044:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
        L_0x0048:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r5.add(r0)
            goto L_0x000d
        L_0x0050:
            boolean r0 = r8.booleanValue()
            if (r0 != 0) goto L_0x0064
            boolean r1 = r6.booleanValue()
            r0 = 50
            X.FJk r0 = X.C50025FJk.A00(r10, r5, r0)
            X.C49007Enj.A00(r9, r0, r1)
            return
        L_0x0064:
            r10.Dje(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FCO.A02(android.content.Context, X.G7K, java.util.List):void");
    }
}
