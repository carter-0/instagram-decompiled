package X;

import android.graphics.drawable.Drawable;
import com.instagram.api.schemas.StoryPromptType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class AHO {
    public static final boolean A02(Drawable drawable, boolean z, boolean z2) {
        C321046tU r0;
        if (drawable != null) {
            if (!z2) {
                if (!z && (drawable instanceof B3e) && (r0 = (C321046tU) drawable) != null && r0.Cbg()) {
                    return true;
                }
                if (AnonymousClass9SF.A04(drawable) || AnonymousClass9SF.A01(drawable) != null) {
                    return false;
                }
            }
            if (!(drawable instanceof C369658v7)) {
                if (!(drawable instanceof C347017w8)) {
                    return true;
                }
                C347017w8 r3 = (C347017w8) drawable;
                if (!r3.A0E(C369528uu.class)) {
                    return !r3.A0E(C369548uw.class) && !r3.A0E(C369558ux.class) && !r3.A0E(C369538uv.class);
                }
                if (z || z2) {
                    return true;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.9jx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.Upa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.9jx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.9jx} */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b1, code lost:
        if (r0 != null) goto L_0x0094;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.graphics.drawable.Drawable r4) {
        /*
            if (r4 == 0) goto L_0x005a
            boolean r0 = r4 instanceof X.C347017w8
            if (r0 == 0) goto L_0x0089
            r2 = r4
            X.7w8 r2 = (X.C347017w8) r2
            X.6M4 r0 = r2.A02
            r0.A00()
            r2.invalidateSelf()
            android.graphics.drawable.Drawable r1 = r2.A04()
            boolean r0 = r1 instanceof X.C389669q0
            if (r0 == 0) goto L_0x0022
            X.9q0 r1 = (X.C389669q0) r1
            if (r1 == 0) goto L_0x0022
            X.6M4 r0 = r1.A03
            r0.A00()
        L_0x0022:
            android.graphics.drawable.Drawable r1 = r2.A04()
            boolean r0 = r1 instanceof X.C389649py
            if (r0 == 0) goto L_0x0033
            X.9py r1 = (X.C389649py) r1
            if (r1 == 0) goto L_0x0033
            X.6M4 r0 = r1.A0G
            r0.A00()
        L_0x0033:
            android.graphics.drawable.Drawable r1 = r2.A04()
            boolean r0 = r1 instanceof X.C369508us
            if (r0 == 0) goto L_0x0050
            X.8us r1 = (X.C369508us) r1
            if (r1 == 0) goto L_0x0050
            java.lang.String r1 = r1.A01
            r0 = 157(0x9d, float:2.2E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0050
            r0 = 1
            r2.A04 = r0
        L_0x0050:
            boolean r0 = r4 instanceof X.C321026tS
            if (r0 == 0) goto L_0x005a
            r0 = r4
            X.6tS r0 = (X.C321026tS) r0
            r0.CLr()
        L_0x005a:
            boolean r0 = r4 instanceof X.C347017w8
            if (r0 == 0) goto L_0x0088
            X.7w8 r4 = (X.C347017w8) r4
            android.graphics.drawable.Drawable r0 = r4.A04()
            boolean r0 = r0 instanceof X.C354808Nl
            if (r0 == 0) goto L_0x0088
            android.graphics.drawable.Drawable r1 = r4.A04()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.reels.prompt.intf.BasePromptSticker"
            X.0qQ.A0C(r1, r0)
            X.8Nl r1 = (X.C354808Nl) r1
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r1.BTZ()
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r0.A00
            com.instagram.api.schemas.StoryPromptType r1 = r0.Bhw()
            com.instagram.api.schemas.StoryPromptType r0 = com.instagram.api.schemas.StoryPromptType.ELECTION
            if (r1 != r0) goto L_0x0088
            android.graphics.drawable.Drawable r0 = r4.A04()
            A00(r0)
        L_0x0088:
            return
        L_0x0089:
            boolean r0 = r4 instanceof X.C16152Upd
            if (r0 == 0) goto L_0x0098
            r0 = r4
            X.Upd r0 = (X.C16152Upd) r0
            X.6M4 r0 = r0.A0B()
        L_0x0094:
            r0.A00()
            goto L_0x0050
        L_0x0098:
            boolean r0 = r4 instanceof X.C369728vE
            if (r0 == 0) goto L_0x00a2
            r0 = r4
            X.8vE r0 = (X.C369728vE) r0
            X.6M4 r0 = r0.A03
            goto L_0x0094
        L_0x00a2:
            boolean r0 = r4 instanceof X.C369738vF
            if (r0 == 0) goto L_0x00b4
            r1 = r4
            X.8vF r1 = (X.C369738vF) r1
            boolean r0 = r1 instanceof X.C389789qC
            if (r0 != 0) goto L_0x0050
            X.9qB r1 = (X.C389779qB) r1
            X.6M4 r0 = r1.A05
            if (r0 == 0) goto L_0x0050
            goto L_0x0094
        L_0x00b4:
            boolean r0 = r4 instanceof X.C16149Upa
            if (r0 == 0) goto L_0x00d1
            r3 = r4
            X.Upa r3 = (X.C16149Upa) r3
            r0 = 0
            r3.A05 = r0
            java.util.List r1 = r3.A0K
            int r0 = r3.A00
            java.lang.Object r1 = r1.get(r0)
            X.6Ly r1 = (X.C306386Ly) r1
            int r0 = r3.A07
            r1.A0F(r0)
        L_0x00cd:
            r3.invalidateSelf()
            goto L_0x0050
        L_0x00d1:
            boolean r0 = r4 instanceof X.C389629pw
            if (r0 == 0) goto L_0x00f8
            r1 = r4
            X.9pw r1 = (X.C389629pw) r1
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x00f8
            X.UpX r1 = r1.A01
            X.WaO r0 = r1.A08
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0050
            X.9jx r3 = r1.A01
            if (r3 == 0) goto L_0x0050
            r0 = 1
            r3.A00 = r0
            X.6Ly r2 = r3.A0A
            java.lang.String r1 = r3.A0B
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r1)
            r2.A0L(r0)
            goto L_0x00cd
        L_0x00f8:
            boolean r0 = r4 instanceof X.C16147UpY
            if (r0 == 0) goto L_0x0102
            r0 = r4
            X.UpY r0 = (X.C16147UpY) r0
            X.6M4 r0 = r0.A09
            goto L_0x0094
        L_0x0102:
            boolean r0 = r4 instanceof X.C389569pq
            if (r0 == 0) goto L_0x010c
            r0 = r4
            X.9pq r0 = (X.C389569pq) r0
            X.6M4 r0 = r0.A0B
            goto L_0x0094
        L_0x010c:
            boolean r0 = r4 instanceof X.C16144UpV
            if (r0 == 0) goto L_0x0117
            r0 = r4
            X.UpV r0 = (X.C16144UpV) r0
            X.6M4 r0 = r0.A01
            goto L_0x0094
        L_0x0117:
            boolean r0 = r4 instanceof X.C16143UpU
            if (r0 == 0) goto L_0x0122
            r0 = r4
            X.UpU r0 = (X.C16143UpU) r0
            X.6M4 r0 = r0.A00
            goto L_0x0094
        L_0x0122:
            boolean r0 = r4 instanceof X.C354808Nl
            if (r0 == 0) goto L_0x0130
            r1 = r4
            X.8Nl r1 = (X.C354808Nl) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.FK8(r0)
            goto L_0x0050
        L_0x0130:
            boolean r0 = r4 instanceof X.B3d
            if (r0 == 0) goto L_0x0050
            r0 = r4
            X.B3d r0 = (X.B3d) r0
            r0.Cmx()
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AHO.A00(android.graphics.drawable.Drawable):void");
    }

    public static final void A01(Drawable drawable) {
        if (drawable instanceof C354808Nl) {
            ((C354808Nl) drawable).FK8(AnonymousClass05K.A00);
        } else if (drawable instanceof B3d) {
            ((B3d) drawable).EvJ();
        }
        if (drawable instanceof C347017w8) {
            C347017w8 r2 = (C347017w8) drawable;
            if (r2.A04() instanceof C354808Nl) {
                Drawable A04 = r2.A04();
                0qQ.A0C(A04, "null cannot be cast to non-null type com.instagram.reels.prompt.intf.BasePromptSticker");
                if (((C354808Nl) A04).BTZ().A00.Bhw() == StoryPromptType.ELECTION) {
                    A01(r2.A04());
                }
            }
        }
    }

    public static final boolean A03(List list, boolean z, boolean z2) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (A02(AnonymousClass7TE.A0Z(it), z, z2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
