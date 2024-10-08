package X;

import com.instagram.api.schemas.InspirationSignalType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ioe  reason: case insensitive filesystem */
public final class C58236Ioe extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final String A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58236Ioe(C53451Goj goj, AnonymousClass0iw r3, UserSession userSession, C57669IeY ieY, Long l, String str, String str2, List list, C62320sa r10, int i) {
        super(0);
        this.A00 = i;
        if (i != 0) {
            this.A02 = list;
            this.A05 = r10;
            this.A03 = l;
            this.A04 = goj;
            this.A01 = r3;
        } else {
            this.A04 = list;
            this.A02 = r10;
            this.A05 = l;
            this.A01 = goj;
            this.A03 = r3;
        }
        this.A06 = userSession;
        this.A07 = ieY;
        this.A08 = str;
        this.A09 = str2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        String str;
        if (this.A00 != 0) {
            List list = (List) this.A02;
            if (list != null) {
                Number number = (Number) this.A03;
                C53451Goj goj = (C53451Goj) this.A04;
                AnonymousClass0iw r2 = (AnonymousClass0iw) this.A01;
                UserSession userSession = (UserSession) this.A06;
                String str2 = this.A08;
                String str3 = this.A09;
                if (number != null) {
                    long longValue = number.longValue();
                    if (goj != null) {
                        C52086GEg.A0f(r2, userSession, C57669IeY.A00(goj), str2, str3, list, longValue);
                    }
                }
            }
            obj = this.A05;
        } else {
            List<InspirationSignalType> list2 = (List) this.A04;
            if (list2 != null) {
                Long l = (Long) this.A05;
                C53451Goj goj2 = (C53451Goj) this.A01;
                AnonymousClass0iw r6 = (AnonymousClass0iw) this.A03;
                0lg r0 = (0lg) this.A06;
                String str4 = this.A08;
                String str5 = this.A09;
                if (!(l == null || goj2 == null)) {
                    String A002 = C57669IeY.A00(goj2);
                    AnonymousClass7TG.A1N(r6, r0);
                    0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, r0), "ig_lumen_midcard_media_button_tap");
                    if (A0e.isSampled()) {
                        ArrayList A0r = AnonymousClass7TG.A0r(list2);
                        for (InspirationSignalType inspirationSignalType : list2) {
                            0bb r22 = new 0bb();
                            r22.A06("signal", inspirationSignalType.A00);
                            A0r.add(r22);
                        }
                        0bb r1 = new 0bb();
                        r1.A06("button_text_enum", A002);
                        List A1I = AnonymousClass7TE.A1I(r1);
                        A0e.A9F("media_ig_id", l);
                        InspirationSignalType inspirationSignalType2 = (InspirationSignalType) 00k.A0J(list2);
                        if (inspirationSignalType2 == null || (str = inspirationSignalType2.A00) == null) {
                            str = InspirationSignalType.UNRECOGNIZED.A00;
                        }
                        A0e.AAJ("signal", str);
                        A0e.AAe("recommendation_info", A0r);
                        A0e.AAe("button_info", A1I);
                        C51969G9p.A1A(A0e, r6);
                        A0e.AAJ("layout", str4);
                        A0e.AAJ("midcard_type", str5);
                        A0e.Cgf();
                    }
                }
            }
            obj = this.A02;
        }
        DbS.A1U(obj);
        return C60340gF.A00;
    }
}
