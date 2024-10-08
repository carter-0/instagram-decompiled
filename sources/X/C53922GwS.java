package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spanned;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.GwS  reason: case insensitive filesystem */
public final class C53922GwS extends C251343mx {
    public final C46275DTe A00;
    public final C46307DUk A01;
    public final ClipsViewerConfig A02;
    public final C267324bN A03;
    public final C52058GDe A04;
    public final UserSession A05;
    public final 1Xj A06;
    public final JTB A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final AnonymousClass4DU A0B;
    public final String A0C;

    public C53922GwS(C46275DTe dTe, C46307DUk dUk, ClipsViewerConfig clipsViewerConfig, C267324bN r5, C52058GDe gDe, UserSession userSession, 1Xj r8, AnonymousClass4DU r9, JTB jtb, String str, String str2, boolean z, boolean z2) {
        C51974G9v.A0d(1, userSession, r8, r5, gDe);
        C51973G9u.A0t(7, jtb, clipsViewerConfig, r9);
        0qQ.A0B(str, 11);
        this.A05 = userSession;
        this.A00 = dTe;
        this.A01 = dUk;
        this.A06 = r8;
        this.A03 = r5;
        this.A04 = gDe;
        this.A07 = jtb;
        this.A02 = clipsViewerConfig;
        this.A0B = r9;
        this.A0A = z;
        this.A0C = str;
        this.A09 = z2;
        this.A08 = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r9) {
        /*
            r8 = this;
            r5 = 0
            X.0qQ.A0B(r9, r5)
            r4 = 2131237982(0x7f081c5e, float:1.809223E38)
            X.DUk r0 = r8.A01
            r6 = 0
            if (r0 == 0) goto L_0x0019
            com.instagram.api.schemas.CreatorViewerContextCTA r0 = r0.Aqv()
            if (r0 == 0) goto L_0x0019
            java.lang.String r3 = r0.BE9()
            if (r3 == 0) goto L_0x001a
            goto L_0x001e
        L_0x0019:
            r3 = r6
        L_0x001a:
            r0 = 2131237982(0x7f081c5e, float:1.809223E38)
            goto L_0x0028
        L_0x001e:
            java.lang.Integer r0 = X.C14091Tpi.A05(r3)     // Catch:{ Exception -> 0x002d }
            if (r0 == 0) goto L_0x001a
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x002d }
        L_0x0028:
            android.graphics.drawable.Drawable r7 = X.C244013aV.A0D(r9, r0)     // Catch:{ Exception -> 0x002d }
            goto L_0x0049
        L_0x002d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed to get drawable resource id "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ". Exception "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            java.lang.String r0 = "CreatorViewerInsightsLineComponentKt"
            X.0kD.A07(r0, r1, r6)
            android.graphics.drawable.Drawable r7 = X.C244013aV.A0D(r9, r4)
        L_0x0049:
            X.3XV r0 = X.2WX.A02
            r1 = 0
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.2WX r4 = X.G9t.A0x(r6, r0, r1)
            long r2 = X.C244013aV.A0A(r9)
            long r0 = X.C244013aV.A07(r9)
            X.9JR r2 = X.C51967G9n.A0V(r2)
            X.2WX r1 = X.C51974G9v.A0E(r4, r2, r5, r0)
            r0 = 6
            X.J6J r0 = X.J6J.A00(r8, r0)
            X.2WX r2 = X.C51973G9u.A0Z(r1, r0)
            r0 = 7
            X.J6J r1 = X.J6J.A00(r8, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.2WX r3 = X.C51971G9r.A0Z(r2, r0, r1, r6)
            X.2V1 r2 = r9.A05
            java.lang.String r1 = r8.A0C
            X.3Zd r0 = X.C243533Zd.GLOBAL
            X.2WX r5 = X.C51971G9r.A0V(r2, r3, r0, r1)
            X.2Wb r4 = X.AnonymousClass7TG.A0S(r2)
            X.3gE r0 = r8.A00(r7, r4, r6)
            r4.A00(r0)
            com.instagram.common.session.UserSession r3 = r8.A05
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327082498209956(0x810f4a000838a4, double:3.0367314770635983E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00c1
            X.2Wb r3 = X.G9t.A0w(r4)
            X.2WW r0 = r8.A04(r3)
            r3.A00(r0)
            r0 = 2131238091(0x7f081ccb, float:1.809245E38)
            android.graphics.drawable.Drawable r2 = X.C244013aV.A0D(r3, r0)
            long r0 = X.C51970G9q.A0J()
            X.2Wd r0 = X.C51965G9l.A0e(r0)
            X.3gE r0 = r8.A00(r2, r3, r0)
            X.2Tp r0 = X.C51967G9n.A0P(r0, r3, r4, r6)
        L_0x00bc:
            X.2Tp r0 = X.C51967G9n.A0P(r0, r4, r9, r5)
            return r0
        L_0x00c1:
            X.2WW r0 = r8.A04(r4)
            goto L_0x00bc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53922GwS.A0X(X.3Y5):X.3mp");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.2T3, java.lang.Object] */
    private final C247373gE A00(Drawable drawable, 2Wb r11, 2Wd r12) {
        2V1 r4 = r11.A00;
        Context A0B2 = C51965G9l.A0B(r4);
        ? obj = new Object();
        A04(r11).A0M(r4, obj, 0, 0, false);
        int min = Math.min((((int) 0nA.A01(A0B2, (float) obj.A00)) - 12) / 2, 5);
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0T = C51972G9s.A0T(C51973G9u.A0P(G9t.A11(AnonymousClass05K.A0C, 0.0f, 1), (double) min), 0, C51965G9l.A07(min + 12));
        long A0I = C51970G9q.A0I();
        Integer num = AnonymousClass05K.A00;
        2WX A0z = G9t.A0z(AnonymousClass9JR.A00(A0T, num, 0, A0I), num, C243573Zh.FLEX_START);
        if (r12 != null) {
            A0z = C51972G9s.A0R(A0z, 0, r12.A00);
        }
        Drawable mutate = drawable.mutate();
        C51969G9p.A12(PorterDuff.Mode.SRC_IN, mutate, r11.Bnf().A02(R.color.fundraiser_sticker_donate_button_background_color));
        return C51974G9v.A0P(mutate, r4, A0z);
    }

    private final 2WW A04(C70832Wc r22) {
        String str;
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A002 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0u, 0, C51970G9q.A0H());
        C243573Zh r02 = C243573Zh.FLEX_START;
        Integer num = AnonymousClass05K.A00;
        2WX A0X = C51971G9r.A0X(C51971G9r.A0Y(A002, num, r02, 3), AnonymousClass05K.A01, 1.0f, 1);
        C70832Wc r14 = r22;
        2V1 Aqq = r14.Aqq();
        Typeface A032 = 0oh.A03(Aqq.A0C, Typeface.DEFAULT, num);
        long A082 = C244013aV.A08(r14);
        if (this.A09) {
            str = C244013aV.A0E(r14, 2131957149);
        } else {
            C46275DTe dTe = this.A00;
            if (dTe == null || (str = dTe.getText()) == null) {
                str = this.A08;
            }
        }
        if (str == null) {
            str = "";
        }
        Spanned fromHtml = Html.fromHtml(str);
        0qQ.A07(fromHtml);
        int A022 = r14.Bnf().A02(R.color.fundraiser_sticker_donate_button_background_color);
        UserSession userSession = this.A05;
        long A033 = GHW.A03(userSession);
        int A023 = GHW.A02(userSession, r14.Bnf().A02(R.color.black));
        long A042 = GHW.A04(userSession);
        Integer A052 = GHW.A05(userSession, r14.Bnf().A02(R.color.black));
        long A0D = C51969G9p.A0D();
        C244103ae A13 = G9t.A13(Aqq, fromHtml, A022);
        C51971G9r.A1J(A13, r14.Bnf(), 0, A082);
        A13.A0S(A032);
        A13.A0O(A023);
        C51974G9v.A10(A13, r14, C51969G9p.A09(r14, A033), A0D);
        C51974G9v.A11(A13, r14.Bnf(), A052, A042);
        A13.A0W(num);
        C51973G9u.A1A(A13, num, 1.0f, false);
        A13.A0M(3);
        C51974G9v.A0z(A0X, A13, false);
        return A13.A0A();
    }
}
