package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* renamed from: X.8BF  reason: invalid class name */
public final class AnonymousClass8BF implements AnonymousClass8BE {
    public final AnonymousClass8BH A00 = new AnonymousClass8BG(0.5f, 0.5f);

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0011 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AFN(X.C2802350v r6) {
        /*
            r5 = this;
            r4 = 0
            X.0qQ.A0B(r6, r4)
            java.lang.Integer r0 = r6.CAk()
            int r0 = r0.intValue()
            r2 = 0
            r3 = 1
            switch(r0) {
                case 2: goto L_0x009a;
                case 3: goto L_0x009a;
                case 8: goto L_0x00d1;
                case 11: goto L_0x00bf;
                case 13: goto L_0x0070;
                case 20: goto L_0x007d;
                case 23: goto L_0x0063;
                case 26: goto L_0x0033;
                case 28: goto L_0x003f;
                case 29: goto L_0x003f;
                case 33: goto L_0x00ca;
                case 34: goto L_0x0056;
                case 58: goto L_0x0020;
                case 65: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            r2 = 1
        L_0x0012:
            return r2
        L_0x0013:
            com.instagram.reels.musicpick.model.MusicPickStickerModel r6 = (com.instagram.reels.musicpick.model.MusicPickStickerModel) r6
            com.instagram.api.schemas.StoryMusicPickTappableData r1 = r6.A00
            com.instagram.api.schemas.TrackData r0 = r1.A04
            if (r0 != 0) goto L_0x0011
            com.instagram.api.schemas.OriginalSoundData r0 = r1.A01
            if (r0 == 0) goto L_0x00bd
            goto L_0x0011
        L_0x0020:
            X.9m3 r6 = (X.C387339m3) r6
            java.util.List r0 = r6.A06
            int r1 = r0.size()
            java.util.List r0 = r6.A05
            int r0 = r0.size()
            int r1 = r1 + r0
            r2 = 1
            if (r1 <= r3) goto L_0x00bd
            return r2
        L_0x0033:
            X.WaM r6 = (X.C19474WaM) r6
            java.util.List r0 = r6.A06
            int r1 = r0.size()
            r0 = 2
            if (r1 < r0) goto L_0x00bd
            goto L_0x0011
        L_0x003f:
            com.instagram.reels.prompt.model.PromptStickerModel r6 = (com.instagram.reels.prompt.model.PromptStickerModel) r6
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r6.A00
            java.lang.String r0 = r0.getText()
            if (r0 == 0) goto L_0x004f
            boolean r0 = X.00l.A0W(r0)
            if (r0 == 0) goto L_0x0011
        L_0x004f:
            boolean r0 = r6.A0M()
            if (r0 == 0) goto L_0x0012
            goto L_0x0011
        L_0x0056:
            X.Aej r6 = (X.C40595Aej) r6
            java.lang.String r0 = r6.A01
            if (r0 == 0) goto L_0x0012
            boolean r0 = X.00l.A0W(r0)
            if (r0 == 0) goto L_0x0011
            return r2
        L_0x0063:
            X.Aei r6 = (X.C40594Aei) r6
            com.instagram.common.gallery.Medium r0 = r6.A00
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.A06()
            if (r0 != r3) goto L_0x0012
            goto L_0x0011
        L_0x0070:
            X.9m5 r6 = (X.C387359m5) r6
            java.lang.String r0 = r6.A02
            if (r0 == 0) goto L_0x0012
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0011
            return r2
        L_0x007d:
            X.9m6 r6 = (X.C387369m6) r6
            java.lang.String r1 = r6.A04
            int[] r0 = X.AnonymousClass91M.A02
            X.0qQ.A0B(r1, r4)
            int r0 = r1.length()
            r2 = 1
            if (r0 <= r3) goto L_0x00bd
            java.util.regex.Pattern r0 = X.AnonymousClass91M.A01
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x00bd
            return r2
        L_0x009a:
            X.WaH r6 = (X.C19469WaH) r6
            X.UOB r0 = r6.A00
            java.lang.String r0 = r0.A0M
            if (r0 != 0) goto L_0x00a4
            java.lang.String r0 = ""
        L_0x00a4:
            boolean r0 = X.00l.A0W(r0)
            r2 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00bd
            X.UOB r0 = r6.A00
            java.lang.String r0 = r0.A0M
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = ""
        L_0x00b5:
            int r1 = r0.length()
            r0 = 100
            if (r1 <= r0) goto L_0x0012
        L_0x00bd:
            r2 = 0
            return r2
        L_0x00bf:
            X.9m7 r6 = (X.C387379m7) r6
            com.instagram.common.gallery.Medium r0 = r6.A00()
            boolean r2 = r0.A06()
            return r2
        L_0x00ca:
            X.WaJ r6 = (X.C19471WaJ) r6
            boolean r2 = X.C265894Ws.A03(r6)
            return r2
        L_0x00d1:
            X.WaO r6 = (X.C19476WaO) r6
            boolean r2 = X.C309186Xg.A01(r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BF.AFN(X.50v):boolean");
    }

    public final String Ayb(Context context) {
        0qQ.A0B(context, 0);
        String string = context.getString(2131960992);
        0qQ.A07(string);
        return string;
    }

    public final AnonymousClass8BH Az4() {
        return this.A00;
    }

    public final boolean CRa() {
        return true;
    }

    public final AnonymousClass8BH Az5(View view, int i) {
        RectF A0F = 0nA.A0F(view);
        return new C16336Ut6(new Rect((int) A0F.left, ((int) A0F.top) - i, (int) A0F.right, ((int) A0F.bottom) - i));
    }
}
