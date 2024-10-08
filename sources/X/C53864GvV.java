package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.GvV  reason: case insensitive filesystem */
public final class C53864GvV extends C251343mx {
    public final 2V5 A00;
    public final C267324bN A01;
    public final C52058GDe A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final JTB A05;
    public final GC5 A06;
    public final JQX A07;
    public final HashMap A08;
    public final HashMap A09;
    public final boolean A0A;

    public final C251263mp A0X(AnonymousClass3Y5 r46) {
        String str;
        String str2;
        AnonymousClass3Y5 r7 = r46;
        0qQ.A0B(r7, 0);
        C267324bN r0 = this.A01;
        C267324bN r44 = r0;
        C267334bO r1 = r0.A0G;
        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.clips.model.QPMidcardImpressionItem");
        AnonymousClass4V7 r12 = ((C57029ILv) r1).A00.A08;
        AnonymousClass4VG r02 = r12.A01;
        if (r02 != null) {
            str = DbZ.A0n(r02.A00);
        } else {
            str = null;
        }
        AnonymousClass4V8 r8 = r12.A09;
        C283845Jo r03 = r12.A03;
        if (r03 != null) {
            str2 = DbZ.A0n(r03);
        } else {
            str2 = "";
        }
        C52058GDe gDe = this.A02;
        C52058GDe gDe2 = gDe;
        AnonymousClass3W1 r04 = gDe.A0E;
        AnonymousClass3W1 r19 = r04;
        if (r04 == null) {
            return null;
        }
        Object A002 = AnonymousClass3Zw.A00(r7, C58715IwO.A01(C243643Zq.A00(r7, C58646IvH.A00), 33), new Object[0]);
        Object A003 = AnonymousClass3Zw.A00(r7, C58715IwO.A01(C243643Zq.A00(r7, C58647IvI.A00), 34), new Object[0]);
        Object A004 = AnonymousClass3Zw.A00(r7, C58715IwO.A01(C243643Zq.A00(r7, C58648IvJ.A00), 35), new Object[0]);
        AnonymousClass3XV r05 = 2WX.A02;
        long A032 = C244013aV.A03(r7);
        long A062 = C244013aV.A06(r7);
        2WX A005 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A08, 0, A032);
        Integer num = AnonymousClass05K.A0A;
        2WX A006 = AnonymousClass9JR.A00(A005, num, 0, A062);
        long A033 = C244013aV.A03(r7);
        Integer num2 = AnonymousClass05K.A04;
        2WX A007 = AnonymousClass9JR.A00(A006, num2, 0, A033);
        String A0n = DbZ.A0n(r8);
        Integer num3 = AnonymousClass05K.A0N;
        2WX A0Y = C51971G9r.A0Y(A007, num3, A0n, 0);
        Integer num4 = AnonymousClass05K.A0C;
        long A0C = C244013aV.A0C(r7, R.dimen.auth_credential_title_text_size);
        2V1 r9 = r7.A05;
        Context context = r9.A0C;
        Context context2 = context;
        int A092 = C51972G9s.A09(context, r7);
        String A0n2 = DbZ.A0n(r8);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        Integer num5 = AnonymousClass05K.A00;
        C244103ae A0b = C51971G9r.A0b(r9, (2V5) null, A0n2, 0);
        C51973G9u.A16(r7, A0b, A092, A0C);
        A0b.A0R(1);
        G9w.A11(typeface, r7, A0b, A0D);
        C51970G9q.A1K(A0b, num4, num5);
        C51970G9q.A1I(A0b, 1.09f, false);
        A0b.A0M(2);
        C51974G9v.A0z(A0Y, A0b, false);
        2WW A0A2 = A0b.A0A();
        2WX A0T = C51973G9u.A0T(AnonymousClass9JR.A00((2WX) null, num, 0, C244013aV.A03(r7)), C51965G9l.A0c(num2, 0, C244013aV.A03(r7)), num3, str2, 0);
        long A042 = C244013aV.A04(r7);
        int A093 = C51972G9s.A09(context2, r7);
        C244103ae A0b2 = C51971G9r.A0b(r9, (2V5) null, str2, 0);
        C51973G9u.A16(r7, A0b2, A093, A042);
        A0b2.A0R(0);
        G9w.A11(typeface, r7, A0b2, A0D);
        A0b2.A0W(num4);
        C51973G9u.A1A(A0b2, num5, 1.09f, false);
        A0b2.A0M(3);
        C51974G9v.A0z(A0T, A0b2, false);
        2WW A0A3 = A0b2.A0A();
        C243533Zd r13 = 2Vi.A04;
        AnonymousClass4Ey A008 = 2Vi.A00(r13, "caption_bg");
        C51966G9m.A1M(A008, 300);
        C246053du r10 = C246033ds.A00;
        A008.A03(r10);
        AnonymousClass4F7.A00(r7, A008);
        C243773a4.A00(r7, new C58207IoB(3, r19, A004, A002, A003), C51970G9q.A1b());
        AnonymousClass4Ex r6 = new AnonymousClass4Ex(IgNetworkConsentStorage.MAX_ENTRIES);
        AnonymousClass4Ey A009 = 2Vi.A00(r13, "end_scene_background");
        C51969G9p.A1H(r6, A009, r10, 0.0f);
        AnonymousClass4F7.A00(r7, A009);
        C243583Zi r39 = C243583Zi.SPACE_BETWEEN;
        2Wb A0S = AnonymousClass7TG.A0S(r9);
        Integer num6 = AnonymousClass05K.A01;
        2WX A0O = C51974G9v.A0O((2WX) null, num6, num5, 100.0f, 0);
        C244413b9 r15 = C244413b9.ABSOLUTE;
        Integer num7 = AnonymousClass05K.A0Y;
        2WX A0Y2 = C51971G9r.A0Y(A0O, num7, r15, 3);
        2V1 r132 = A0S.A00;
        2Wb A0S2 = AnonymousClass7TG.A0S(r132);
        UserSession userSession = this.A04;
        AnonymousClass0iw r41 = this.A03;
        JTB jtb = this.A05;
        A0S2.A00(new GH3((C14065TpD) null, r44, gDe2, r41, userSession, jtb, (JP2) null, this.A09, this.A08, 0.0f, 0.0f, false, this.A0A));
        C51967G9n.A1C(A0S2, A0S, A0Y2);
        2V5 r122 = this.A00;
        2WX A0T2 = C51973G9u.A0T(C51971G9r.A0X(C51971G9r.A0W(r122, (2WX) null, num5), num6, 50.0f, 0), C51965G9l.A0b(num5, 100.0f, 0), num7, r15, 3);
        C243573Zh r14 = C243573Zh.FLEX_END;
        C51974G9v.A0h(C244013aV.A0D(A0S, R.drawable.clips_viewer_gradient_background), r132, A0S, C51971G9r.A0Y(A0T2, num5, r14, 3));
        2WX A0W = C51971G9r.A0W(r122, C51973G9u.A0S((2WX) null, C51965G9l.A0d(num5, r14, 3), num6, 100.0f, 0), num5);
        C243583Zi r28 = C243583Zi.FLEX_END;
        2Wb A0S3 = AnonymousClass7TG.A0S(r132);
        2WX A0X = C51971G9r.A0X((2WX) null, num6, 50.0f, 0);
        2Wb A0w = G9t.A0w(A0S3);
        2WX A0010 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(C51974G9v.A0O(C51973G9u.A0S(C51971G9r.A0Y((2WX) null, num5, r14, 3), new AnonymousClass9JS(r122, num5), num6, 100.0f, 0), num6, num4, 1.0f, 1), AnonymousClass05K.A1I, 0, C244013aV.A0B(A0w)), AnonymousClass05K.A0E, 0, C244013aV.A03(A0w));
        2V1 r35 = A0w.A00;
        2Wb A0S4 = AnonymousClass7TG.A0S(r35);
        2WX A0O2 = C51974G9v.A0O((2WX) null, num5, num6, 100.0f, 0);
        C243573Zh r26 = C243573Zh.FLEX_START;
        2Wb A0w2 = G9t.A0w(A0S4);
        A0w2.A00(new GG8(r44, r41, userSession, jtb, this.A07));
        A0w2.A00(A0A2);
        A0w2.A00(A0A3);
        GC5 gc5 = this.A06;
        C267324bN r06 = r44;
        A0w2.A00(new C53760Gtp(r06, gc5, num6, str));
        A0w2.A00(new C53679GsW(r06, gc5));
        A0S4.A00(C243563Zg.A06(A0w2, A0S4, A0O2, r26, r26, r28, false));
        A0w.A00(C243563Zg.A0D(A0S4, A0w, A0010));
        2WX A0Y3 = C51971G9r.A0Y(C51974G9v.A0O((2WX) null, num6, num5, 100.0f, 0), num7, r15, 3);
        C267324bN r123 = r44;
        C52058GDe gDe3 = gDe2;
        UserSession userSession2 = userSession;
        2Wb r07 = A0S3;
        C51971G9r.A1C(C51967G9n.A0O(new C53807Gua((ClipsViewerSource) null, r123, gDe3, r41, userSession2, jtb), AnonymousClass7TG.A0S(r35), A0w, A0Y3), A0w, r07, A0X);
        A0S.A00(C243563Zg.A02(r07, A0S, A0W));
        if (gDe3.A0f) {
            A0S.A00(new C53904GwA(C243803a8.A00(A0S), r123, gDe3, userSession2, jtb, true, false));
        }
        return new 2Tp((C243573Zh) null, (C243573Zh) null, r39, (C244343b2) null, A0S.A01, false);
    }

    public C53864GvV(2V5 r2, C267324bN r3, C52058GDe gDe, AnonymousClass0iw r5, UserSession userSession, JTB jtb, GC5 gc5, JQX jqx, HashMap hashMap, HashMap hashMap2, boolean z) {
        C51974G9v.A1S(userSession, r5, gc5, jtb, hashMap);
        AnonymousClass7TF.A1F(hashMap2, 7, jqx);
        C51972G9s.A1F(gDe, r2);
        this.A01 = r3;
        this.A04 = userSession;
        this.A03 = r5;
        this.A06 = gc5;
        this.A05 = jtb;
        this.A09 = hashMap;
        this.A08 = hashMap2;
        this.A07 = jqx;
        this.A02 = gDe;
        this.A00 = r2;
        this.A0A = z;
    }
}
