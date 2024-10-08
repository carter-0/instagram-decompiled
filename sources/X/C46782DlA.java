package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.intf.DirectShareSheetAppearance;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.DlA  reason: case insensitive filesystem */
public final class C46782DlA extends 2YL {
    public static final 2YM A0D;
    public final UserSession A00;
    public final C49465Ew6 A01;
    public final C49466Ew7 A02;
    public final ExY A03;
    public final String A04;
    public final 05G A05;
    public final 05G A06;
    public final 05G A07;
    public final AnonymousClass0Ud A08;
    public final AnonymousClass0Ud A09;
    public final AnonymousClass0Ud A0A;
    public final boolean A0B;
    public final DirectShareSheetAppearance A0C;

    public C46782DlA(UserSession userSession, C49465Ew6 ew6, C49466Ew7 ew7, ExY exY, DirectShareSheetAppearance directShareSheetAppearance, String str, String str2, boolean z, boolean z2) {
        String str3 = str;
        UserSession userSession2 = userSession;
        AnonymousClass7TF.A1C(userSession2, 1, str3);
        ExY exY2 = exY;
        0qQ.A0B(exY2, 7);
        C49465Ew6 ew62 = ew6;
        C49466Ew7 ew72 = ew7;
        AnonymousClass7TF.A1G(ew72, 8, ew62);
        this.A00 = userSession2;
        DirectShareSheetAppearance directShareSheetAppearance2 = directShareSheetAppearance;
        this.A0C = directShareSheetAppearance2;
        this.A0B = z;
        this.A04 = str2;
        this.A03 = exY2;
        this.A02 = ew72;
        this.A01 = ew62;
        boolean z3 = true;
        Integer num = AnonymousClass05K.A01;
        02z A10 = DbS.A10(new C47829EJb(num));
        this.A07 = A10;
        this.A0A = 10b.A03(A10);
        02z A102 = DbS.A10(new C61063Jw1(7, (Integer) null));
        this.A05 = A102;
        this.A08 = 10b.A03(A102);
        02z A103 = DbS.A10(new C61066Jw4(false, (List) null, false, 7, (DefaultConstructorMarker) null, 4));
        this.A06 = A103;
        this.A09 = 10b.A03(A103);
        if (z) {
            A10.Epw(new C47255Dtj(num, str3, (directShareSheetAppearance == null || !directShareSheetAppearance2.A09) ? false : z3, false));
            A102.Epw(new C61063Jw1(6, num));
        } else {
            A10.Epw(new C47255Dtj(num, str3, (directShareSheetAppearance == null || !directShareSheetAppearance2.A09) ? false : z3, z2));
            A102.Epw(new C61063Jw1(6, AnonymousClass05K.A00));
        }
        AnonymousClass7TE.A1Z(new C73565Pfm(this, (AnonymousClass4D7) null, 8), C318116oQ.A00(this));
    }

    static {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        C392359ug.A00(A1H, G3K.A00, DbS.A0z(C46782DlA.class));
        A0D = C48264Ebj.A00(A1H.values());
    }
}
