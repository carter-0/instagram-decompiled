package X;

import com.instagram.api.schemas.RepostRestrictedReason;
import com.instagram.api.schemas.XDTTextAppQuoteAttachmentEligibility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HaT  reason: case insensitive filesystem */
public abstract /* synthetic */ class C54996HaT {
    public static Map A00(C274334o8 r4) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        String str2 = null;
        if (r4.AkL() != null) {
            XDTTextAppQuoteAttachmentEligibility AkL = r4.AkL();
            if (AkL != null) {
                str = AkL.A00;
            } else {
                str = null;
            }
            A1H.put(C273654mx.A00(2128), str);
        }
        if (r4.AkM() != null) {
            A1H.put(C273654mx.A00(2129), r4.AkM());
        }
        if (r4.AkS() != null) {
            A1H.put("can_repost", r4.AkS());
        }
        if (r4.Ako() != null) {
            A1H.put(C273654mx.A00(2132), r4.Ako());
        }
        if (r4.Akp() != null) {
            A1H.put(C273654mx.A00(2133), r4.Akp());
        }
        if (r4.Caj() != null) {
            A1H.put(C273654mx.A00(2940), r4.Caj());
        }
        if (r4.Cap() != null) {
            A1H.put(C273654mx.A00(2941), r4.Cap());
        }
        if (r4.Biz() != null) {
            A1H.put(C273654mx.A00(3200), r4.Biz());
        }
        1Xj Bj0 = r4.Bj0();
        if (Bj0 != null) {
            A1H.put(C273654mx.A00(3201), Bj0.A1C());
        }
        if (r4.Bj1() != null) {
            A1H.put(C273654mx.A00(3202), r4.Bj1());
        }
        if (r4.Bj2() != null) {
            A1H.put(C273654mx.A00(3203), r4.Bj2());
        }
        1Xj Bj4 = r4.Bj4();
        if (Bj4 != null) {
            A1H.put("quoted_post", Bj4.A1C());
        }
        if (r4.Bj5() != null) {
            A1H.put(C273654mx.A00(3204), r4.Bj5());
        }
        if (r4.Bmz() != null) {
            RepostRestrictedReason Bmz = r4.Bmz();
            if (Bmz != null) {
                str2 = Bmz.A00;
            }
            A1H.put(C273654mx.A00(3260), str2);
        }
        1Xj Bn2 = r4.Bn2();
        if (Bn2 != null) {
            A1H.put(C273654mx.A00(939), Bn2.A1C());
        }
        return 0Yt.A0B(A1H);
    }
}
