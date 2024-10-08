package com.instagram.direct.avatar.stickers.suggestions;

import X.0Tu;
import X.0eO;
import X.0eP;
import X.0qQ;
import X.0sn;
import X.19E;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0lh;
import X.AnonymousClass12T;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass9JF;
import X.C262224Cq;
import X.C51972G9s;
import X.C64583LeP;
import X.C66162MFz;
import X.C70784OLe;
import X.DbS;
import X.DbY;
import X.G9t;
import X.JTQ;
import X.MB8;
import X.MMO;
import X.MVY;
import X.N4G;
import X.OL5;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class DirectStickerSuggestionsController implements AnonymousClass0lh {
    public AnonymousClass9JF A00;
    public N4G A01;
    public OL5 A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public C262224Cq A07 = DbY.A0r(AnonymousClass12T.A00, 891758784);
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final UserSession A0B;
    public final C64583LeP A0C;
    public final Executor A0D = MB8.A00;
    public final AtomicBoolean A0E = JTQ.A0k();
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K;
    public final AnonymousClass0eM A0L;
    public final AnonymousClass0eM A0M;
    public final AnonymousClass0eM A0N;
    public final AnonymousClass0eM A0O;
    public final AnonymousClass0eM A0P;
    public final AnonymousClass0eM A0Q = AnonymousClass0eN.A01(new MMO(this, 39));
    public final AnonymousClass0eM A0R;
    public volatile AnonymousClass9JF A0S;

    public DirectStickerSuggestionsController(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A0B = userSession;
        0eO r1 = 0eO.A02;
        this.A0J = MMO.A00(this, r1, 32);
        this.A0L = MMO.A00(this, r1, 34);
        this.A0F = MMO.A00(this, r1, 28);
        this.A0K = MMO.A00(this, r1, 33);
        this.A0M = MMO.A00(this, r1, 35);
        this.A03 = AnonymousClass05K.A00;
        this.A05 = C51972G9s.A0n();
        this.A0I = MMO.A00(this, r1, 31);
        this.A0G = MMO.A00(this, r1, 29);
        this.A0H = MMO.A00(this, r1, 30);
        this.A0N = MMO.A00(this, r1, 36);
        this.A0R = MMO.A00(this, r1, 40);
        this.A01 = new N4G(-1, "Unknown", 8);
        this.A04 = "NotSet";
        this.A0A = true;
        0sn r2 = 0sn.A00;
        this.A0S = new AnonymousClass9JF("", "", r2, r2);
        this.A0P = AnonymousClass0eN.A01(new MMO(this, 38));
        this.A0C = new C64583LeP(userSession);
        this.A0O = AnonymousClass0eN.A01(new MMO(this, 37));
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r5, X.AnonymousClass4D7 r6) {
        /*
            r3 = 24
            boolean r0 = X.C66129MDh.A01(r3, r6)
            if (r0 == 0) goto L_0x0026
            r4 = r6
            X.MDh r4 = (X.C66129MDh) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r2) goto L_0x002c
            java.lang.Object r5 = r4.A01
            com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r5 = (com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController) r5
            goto L_0x004d
        L_0x0026:
            X.MDh r4 = new X.MDh
            r4.<init>(r5, r6, r3)
            goto L_0x0016
        L_0x002c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0031:
            X.0eS.A00(r1)
            java.lang.Integer r1 = r5.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0078
            X.0eM r0 = r5.A0P     // Catch:{ all -> 0x0053 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0053 }
            com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl r0 = (com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl) r0     // Catch:{ all -> 0x0053 }
            r4.A01 = r5     // Catch:{ all -> 0x0053 }
            r4.A00 = r2     // Catch:{ all -> 0x0053 }
            java.lang.Object r1 = r0.A01(r4)     // Catch:{ all -> 0x0053 }
            if (r1 != r3) goto L_0x0050
            return r3
        L_0x004d:
            X.0eS.A00(r1)     // Catch:{ all -> 0x0053 }
        L_0x0050:
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0053 }
            goto L_0x0058
        L_0x0053:
            r0 = move-exception
            X.0eQ r1 = X.JTO.A1B(r0)
        L_0x0058:
            boolean r0 = r1 instanceof X.0eQ
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0062
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r5.A03 = r0
        L_0x0062:
            java.lang.Throwable r0 = X.0eR.A00(r1)
            if (r0 == 0) goto L_0x0078
            boolean r0 = r0 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x007b
            X.0eM r0 = r5.A0K
            boolean r0 = X.G9t.A1b(r0)
            if (r0 != 0) goto L_0x007b
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
        L_0x0076:
            r5.A03 = r0
        L_0x0078:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x007b:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController.A00(com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r6, X.AnonymousClass4D7 r7) {
        /*
            r4 = 10
            boolean r0 = X.C66145MDx.A02(r4, r7)
            if (r0 == 0) goto L_0x007e
            r3 = r7
            X.MDx r3 = (X.C66145MDx) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007e
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r3.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 == r1) goto L_0x002a
            if (r0 != r4) goto L_0x0084
            X.0eS.A00(r5)
        L_0x0027:
            X.0gF r2 = X.C60340gF.A00
        L_0x0029:
            return r2
        L_0x002a:
            java.lang.Object r6 = r3.A02
            com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r6 = (com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController) r6
            java.lang.Object r1 = r3.A01
            com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r1 = (com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController) r1
            X.0eS.A00(r5)
            goto L_0x004e
        L_0x0036:
            X.0eS.A00(r5)
            X.0eM r0 = r6.A0Q
            java.lang.Object r0 = r0.getValue()
            X.MVY r0 = (X.MVY) r0
            r3.A01 = r6
            r3.A02 = r6
            r3.A00 = r1
            java.lang.Object r5 = r0.E3g(r3)
            if (r5 == r2) goto L_0x0029
            r1 = r6
        L_0x004e:
            X.N4G r5 = (X.N4G) r5
            r6.A01 = r5
            X.0eM r0 = r1.A0Q
            java.lang.Object r0 = r0.getValue()
            X.MVY r0 = (X.MVY) r0
            boolean r0 = r0.BAc()
            if (r0 != 0) goto L_0x0070
            X.0eM r0 = r1.A0G
            boolean r0 = X.G9t.A1b(r0)
            if (r0 == 0) goto L_0x0027
            X.0eM r0 = r1.A0I
            boolean r0 = X.G9t.A1b(r0)
            if (r0 == 0) goto L_0x0027
        L_0x0070:
            r0 = 0
            r3.A01 = r0
            r3.A02 = r0
            r3.A00 = r4
            java.lang.Object r0 = A00(r1, r3)
            if (r0 != r2) goto L_0x0027
            return r2
        L_0x007e:
            X.MDx r3 = new X.MDx
            r3.<init>(r6, r7, r4)
            goto L_0x0016
        L_0x0084:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController.A01(com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController, X.4D7):java.lang.Object");
    }

    public static final boolean A02(DirectStickerSuggestionsController directStickerSuggestionsController) {
        return G9t.A1b(directStickerSuggestionsController.A0K);
    }

    public final 0eP A03() {
        AnonymousClass0eM r3 = this.A0Q;
        return AnonymousClass7TE.A1L(((MVY) r3.getValue()).AjS((List) this.A0S.A01), ((MVY) r3.getValue()).FIB((List) this.A0S.A01));
    }

    public final void A04() {
        boolean z = true;
        if (!this.A0A) {
            this.A0A = !((MVY) this.A0Q.getValue()).CKi();
        }
        if (!G9t.A1b(this.A0K)) {
            if (19E.A07(this.A07)) {
                19E.A05((CancellationException) null, this.A07);
                this.A07 = DbY.A0r(AnonymousClass12T.A00, 891758784);
            }
            OL5 ol5 = this.A02;
            if (ol5 != null) {
                C70784OLe oLe = ol5.A01;
                if (oLe == null || !oLe.A00()) {
                    z = false;
                }
                this.A08 = z;
                return;
            }
            if (DbS.A04(0Tu.A05, this.A0B, 36603571018404795L) > 0) {
                this.A08 = true;
                AnonymousClass7TE.A1Z(new C66162MFz(this, (AnonymousClass4D7) null, 24), this.A07);
            }
        }
    }

    public final void onSessionWillEnd() {
        19E.A05((CancellationException) null, this.A07);
    }
}
