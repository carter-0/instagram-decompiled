package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.GGz  reason: case insensitive filesystem */
public final class C52157GGz extends C251343mx {
    public final ClipsViewerConfig A00;
    public final C267324bN A01;
    public final C52058GDe A02;
    public final JRO A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final JTB A06;

    public C52157GGz(ClipsViewerConfig clipsViewerConfig, C267324bN r3, C52058GDe gDe, JRO jro, AnonymousClass0iw r6, UserSession userSession, JTB jtb) {
        0qQ.A0B(userSession, 2);
        C51974G9v.A1N(jro, clipsViewerConfig, jtb);
        this.A01 = r3;
        this.A05 = userSession;
        this.A04 = r6;
        this.A02 = gDe;
        this.A03 = jro;
        this.A00 = clipsViewerConfig;
        this.A06 = jtb;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r28) {
        int i;
        String name;
        String str;
        Boolean bool;
        String id;
        GJR gjr;
        AnonymousClass3Y5 r8 = r28;
        0qQ.A0B(r8, 0);
        if (!C52207GIy.A01.get()) {
            return null;
        }
        AtomicInteger atomicInteger = C52207GIy.A02;
        atomicInteger.incrementAndGet();
        ConcurrentHashMap concurrentHashMap = C52207GIy.A00;
        C267324bN r9 = this.A01;
        int A0A = AnonymousClass7TG.A0A((Number) C51968G9o.A0x(r9, concurrentHashMap)) + 1;
        concurrentHashMap.put(r9.getId(), Integer.valueOf(A0A));
        if (0qQ.A0K(Looper.myLooper(), Looper.getMainLooper())) {
            C52207GIy.A03.incrementAndGet();
            i = R.color.red_7;
        } else {
            i = R.color.black_40_transparent;
        }
        int A08 = C51969G9p.A08(r8, R.color.design_dark_default_color_on_background);
        UserSession userSession = this.A05;
        User A082 = r9.A08(userSession);
        if (A082 == null) {
            name = "unknown";
        } else {
            name = AnonymousClass2f1.A00(userSession).A0N(A082).name();
        }
        if (r9.A01 == C295365o2.ORGANIC) {
            1Xj r0 = r9.A02;
            if (r0 != null) {
                gjr = C52076GDw.A00(r0);
            } else {
                gjr = null;
            }
            str = String.valueOf(gjr);
        } else {
            str = "";
        }
        2Wa A002 = C243643Zq.A00(r8, C58598IuV.A00);
        AnonymousClass3XV r02 = 2WX.A02;
        2WX A0P = C51973G9u.A0P(C51971G9r.A0Y((2WX) null, AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3), 48.0d);
        long A0I = C51970G9q.A0I();
        Integer num = AnonymousClass05K.A06;
        2WX A003 = AnonymousClass9JR.A00(A0P, num, 0, A0I);
        int A083 = C51969G9p.A08(r8, i);
        Integer num2 = AnonymousClass05K.A00;
        2WX A0Y = C51971G9r.A0Y(A003, num2, C51965G9l.A0Y(A083), 4);
        2V1 r12 = r8.A05;
        ArrayList A1C = AnonymousClass7TE.A1C();
        0qQ.A0B(r12, 1);
        2WX A0Y2 = C51971G9r.A0Y((2WX) null, num2, C243573Zh.CENTER, 3);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        C244103ae A13 = G9t.A13(r12, "Debug Overlay", A08);
        AnonymousClass2V4 r2 = r12.A0D;
        0qQ.A07(r2);
        C51971G9r.A1J(A13, r2, 0, ((long) Float.floatToRawIntBits(18.0f)) | 9221683186994511872L);
        A13.A0S(typeface);
        G9w.A1G(A13, r2, num2, A0D);
        A13.A0a(false);
        A13.A0N(0);
        A13.A0E();
        C51973G9u.A19(A0Y2, A13, false);
        A1C.add(A13.A0A());
        A1C.add(A00(r8, "Clip Metadata", A08));
        String A0R = 002.A0R("Clip Id: ", r9.getId());
        long floatToRawIntBits = ((long) Float.floatToRawIntBits(16.0f)) | 9221683186994511872L;
        C244103ae A132 = G9t.A13(r12, A0R, A08);
        C51971G9r.A1J(A132, r2, 0, floatToRawIntBits);
        A132.A0S(typeface);
        G9w.A1G(A132, r2, num2, A0D);
        C51974G9v.A1B(A132, A1C);
        1Xj r14 = r9.A02;
        if (!(r14 == null || (id = r14.getId()) == null || 00l.A0W(id))) {
            C244103ae A133 = G9t.A13(r12, 002.A0R("Media Id: ", id), A08);
            C51971G9r.A1J(A133, r2, 0, floatToRawIntBits);
            A133.A0S(typeface);
            G9w.A1G(A133, r2, num2, A0D);
            C51974G9v.A1B(A133, A1C);
        }
        if (r9.CcK()) {
            C244103ae A134 = G9t.A13(r12, 002.A0R("Ad id: ", C51966G9m.A1B(r9)), A08);
            C51971G9r.A1J(A134, r2, 0, floatToRawIntBits);
            A134.A0S(typeface);
            G9w.A1G(A134, r2, num2, A0D);
            C51974G9v.A1B(A134, A1C);
        }
        C244103ae A135 = G9t.A13(r12, 002.A0R("Organic type: ", str), A08);
        C51971G9r.A1J(A135, r2, 0, floatToRawIntBits);
        A135.A0S(typeface);
        G9w.A1G(A135, r2, num2, A0D);
        C51974G9v.A1B(A135, A1C);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("isLiked: ");
        1Xj r92 = r9.A02;
        if (r92 != null) {
            bool = Boolean.valueOf(r92.A5d());
        } else {
            bool = null;
        }
        C244103ae A136 = G9t.A13(r12, AnonymousClass7TF.A0i(bool, A1A), A08);
        C51971G9r.A1J(A136, r2, 0, floatToRawIntBits);
        A136.A0S(typeface);
        G9w.A1G(A136, r2, num2, A0D);
        C51974G9v.A1B(A136, A1C);
        C244103ae A137 = G9t.A13(r12, 002.A0R("isFollowing: ", name), A08);
        C51971G9r.A1J(A137, r2, 0, floatToRawIntBits);
        A137.A0S(typeface);
        G9w.A1G(A137, r2, num2, A0D);
        C51974G9v.A1B(A137, A1C);
        A1C.add(A00(r8, "Performance", A08));
        C244103ae A138 = G9t.A13(r12, 002.A0O("all render count when this is called: ", atomicInteger.get()), A08);
        C51971G9r.A1J(A138, r2, 0, floatToRawIntBits);
        A138.A0S(typeface);
        G9w.A1G(A138, r2, num2, A0D);
        C51974G9v.A1B(A138, A1C);
        C244103ae A139 = G9t.A13(r12, 002.A0O("all render counts on UI thread count: ", C52207GIy.A03.get()), A08);
        C51971G9r.A1J(A139, r2, 0, floatToRawIntBits);
        A139.A0S(typeface);
        G9w.A1G(A139, r2, num2, A0D);
        C51974G9v.A1B(A139, A1C);
        C244103ae A1310 = G9t.A13(r12, 002.A0O("render count for this media: ", A0A), A08);
        C51971G9r.A1J(A1310, r2, 0, floatToRawIntBits);
        A1310.A0S(typeface);
        G9w.A1G(A1310, r2, num2, A0D);
        C51974G9v.A1B(A1310, A1C);
        Drawable drawable = r2.A00.getDrawable(R.drawable.rounded_corner_background);
        if (drawable != null) {
            2WX A0V = C51972G9s.A0V(C51973G9u.A0X(C51973G9u.A0X(C51971G9r.A0Y((2WX) null, num2, drawable, 4), num2, 80.0d, 0), num, 8.0d, 0), J6E.A00(A002, 33));
            String A004 = Pxd.A00(68);
            long A0K = C51971G9r.A0K();
            C244103ae A0b = C51971G9r.A0b(r12, (2V5) null, A004, 0);
            A0b.A0P(-16777216);
            C51971G9r.A1J(A0b, r2, 0, A0K);
            G9w.A13(typeface, A0b, r2, A0D);
            C51974G9v.A1A(A0b, num2, false, true);
            A1C.add(C51967G9n.A0R(A0V, A0b));
            2Tl r122 = new 2Tl((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, A1C, false);
            2WX r03 = A0Y;
            r03.A01(r122.A0Z(), r8.Aqq());
            return r122;
        }
        throw AnonymousClass7TF.A0W(AnonymousClass000.A00(927), Integer.toHexString(R.drawable.rounded_corner_background));
    }

    public static final 2WW A00(AnonymousClass3Y5 r10, String str, int i) {
        long A0G = C51972G9s.A0G(18.0f);
        AnonymousClass3XV r0 = 2WX.A02;
        long A0D = C51970G9q.A0D();
        2WX A0E = C51974G9v.A0E((2WX) null, C51965G9l.A0c(AnonymousClass05K.A15, 0, A0D), 0, A0D);
        Typeface typeface = Typeface.DEFAULT;
        long A0D2 = C51969G9p.A0D();
        Integer num = AnonymousClass05K.A00;
        C244103ae A0b = C51971G9r.A0b(r10.A05, (2V5) null, str, 0);
        C51973G9u.A16(r10, A0b, i, A0G);
        A0b.A0R(0);
        G9w.A11(typeface, r10, A0b, A0D2);
        C51974G9v.A19(A0b, num, false);
        A0b.A0E();
        C51973G9u.A19(A0E, A0b, false);
        return A0b.A0A();
    }
}
