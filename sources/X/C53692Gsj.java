package X;

import android.content.Context;
import android.graphics.Typeface;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Gsj  reason: case insensitive filesystem */
public final class C53692Gsj extends C251343mx {
    public final AnonymousClass1eD A00;
    public final C55505Hin A01;
    public final UserSession A02;

    public final C251263mp A0X(AnonymousClass3Y5 r50) {
        AnonymousClass3Y5 r0 = r50;
        0qQ.A0B(r0, 0);
        2V1 r11 = r0.A05;
        ArrayList A1C = AnonymousClass7TE.A1C();
        0qQ.A0B(r11, 1);
        AnonymousClass1eD r27 = this.A00;
        String Apy = r27.Apy();
        long floatToRawIntBits = ((long) Float.floatToRawIntBits(16.0f)) | 9221683186994511872L;
        Context context = r11.A0C;
        int A07 = 2Yu.A07(context);
        AnonymousClass2V4 r6 = r11.A0D;
        0qQ.A07(r6);
        int A022 = r6.A02(A07);
        AnonymousClass3XV r02 = 2WX.A02;
        long A0I = C51970G9q.A0I();
        Integer num = AnonymousClass05K.A08;
        2WX A002 = AnonymousClass9JR.A00((2WX) null, num, 0, A0I);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        Integer num2 = AnonymousClass05K.A00;
        C244103ae A13 = G9t.A13(r11, Apy, A022);
        C51971G9r.A1J(A13, r6, 1, floatToRawIntBits);
        G9w.A13(typeface, A13, r6, A0D);
        C51974G9v.A1A(A13, num2, false, true);
        A1C.add(C51967G9n.A0R(A002, A13));
        String Apv = r27.Apv();
        long A0K = C51971G9r.A0K();
        int A023 = r6.A02(2Yu.A08(context));
        long A0F = C51969G9p.A0F();
        2WX A003 = AnonymousClass9JR.A00((2WX) null, num, 0, A0F);
        Integer num3 = AnonymousClass05K.A04;
        2WX A004 = AnonymousClass9JR.A00(A003, num3, 0, A0F);
        C244103ae A132 = G9t.A13(r11, Apv, A023);
        C51971G9r.A1J(A132, r6, 0, A0K);
        G9w.A13(typeface, A132, r6, A0D);
        C51974G9v.A1A(A132, num2, false, true);
        A1C.add(C51967G9n.A0R(A004, A132));
        2V3 r3 = r6.A02;
        CharSequence charSequence = (CharSequence) r3.A00.A02(2131975851);
        if (charSequence == null) {
            charSequence = r6.A01.getText(2131975851);
            0qQ.A07(charSequence);
            r3.A00(2131975851, charSequence);
        }
        int A024 = r6.A02(2Yu.A07(context));
        2WX A0G = C51974G9v.A0G((2WX) null, C51965G9l.A0c(num3, 0, A0F), 0, A0I);
        C244413b9 r2 = C244413b9.ABSOLUTE;
        Integer num4 = AnonymousClass05K.A0Y;
        2WX A0Z = C51973G9u.A0Z(AnonymousClass9JR.A00(AnonymousClass9JR.A00(G9t.A0z(A0G, num4, r2), AnonymousClass05K.A0N, 1, A0D), num4, 1, A0D), new C59100J6i(this, 7));
        C244103ae A133 = G9t.A13(r11, charSequence, A024);
        C51971G9r.A1J(A133, r6, 0, floatToRawIntBits);
        A133.A0S(typeface);
        G9w.A1G(A133, r6, num2, A0D);
        A133.A0a(false);
        A133.A0N(0);
        A133.A0E();
        C51973G9u.A19(A0Z, A133, false);
        A1C.add(A133.A0A());
        2WX A005 = AnonymousClass9JR.A00(G9t.A0y(C51972G9s.A0T((2WX) null, 0, 9221401712017801217L), num2, 0), num, 0, A0F);
        int A025 = r6.A02(2Yu.A0H(context, R.attr.igds_color_elevated_separator));
        C53616GrV A006 = C54000Gxi.A00(r11);
        A006.A0B(A025);
        C244123ag.A00(A006, A005);
        A1C.add(A006.A0A());
        AnonymousClass3AS r26 = C336767f9.A00;
        2Sa r22 = r11.A02.A01;
        AnonymousClass3X7 r5 = r22.A02;
        boolean z = r22.A0W;
        C336557eo r33 = new C336557eo();
        List<C246193eB> B73 = r27.B73();
        if (B73 != null) {
            for (C246193eB r7 : B73) {
                C336557eo r12 = r33;
                r12.A00(new C53656Gs9(r7, this.A01), r7.getId(), -1.0f, -1.0f, false);
            }
        }
        A1C.add(new C336707f3(r26, (AnonymousClass3B3) null, (C331097Pn) null, (C249403jg) null, (2WX) null, (C334327b5) null, C336677f0.A00(r11, r5, 2Wd.A00(r6, A0D), z), r33, (C334997cD) null, (C335477d1) null, (2Wd) null, (2Wd) null, (2Wd) null, (2Wd) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (List) null, (C62320sa) null, (0sI) null, true, false));
        return new 2Tl((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, A1C, false);
    }

    public C53692Gsj(AnonymousClass1eD r1, UserSession userSession, C55505Hin hin) {
        C51972G9s.A1C(userSession, hin);
        this.A02 = userSession;
        this.A00 = r1;
        this.A01 = hin;
    }
}
