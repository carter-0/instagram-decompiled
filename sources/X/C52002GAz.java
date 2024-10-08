package X;

import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GAz  reason: case insensitive filesystem */
public final class C52002GAz extends C230372pW {
    public final AnonymousClass4DU A00;
    public final C51984GAh A01;
    public final AnonymousClass0eM A02;

    public C52002GAz(UserSession userSession, AnonymousClass4DU r4, C51984GAh gAh) {
        super(C51969G9p.A0i(1Bk.A03, userSession, "clips_viewer_multi_ad"));
        this.A01 = gAh;
        this.A00 = r4;
        this.A02 = C58715IwO.A00(userSession, 0eO.A02, 37);
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        Long l;
        int i;
        int i2;
        int i3;
        int i4;
        C267324bN r12 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        AnonymousClass7TF.A1H(r12, gDe);
        if (r12.A0F()) {
            C51984GAh gAh = this.A01;
            long A09 = (long) gDe.A09();
            Long valueOf = Long.valueOf(A09);
            0Aj A0e = AnonymousClass7TE.A0e(gAh.A01, C273654mx.A00(758));
            String str = null;
            if (A0e.isSampled()) {
                IntentAwareAdsInfoIntf A002 = C57031ILx.A00(r12);
                List<AnonymousClass3OA> A022 = C57031ILx.A02(r12);
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (AnonymousClass3OA r6 : A022) {
                    String str2 = r6.A0S;
                    0qQ.A0B(str2, 0);
                    C51973G9u.A1F(str2, A1C);
                }
                if (valueOf == null) {
                    A09 = -1;
                }
                C51984GAh.A00(A0e, gAh, A09);
                A0e.AAe("ad_ids", A1C);
                A0e.A9F("first_hscroll_item_ad_id", (Long) 00k.A0J(A1C));
                C51969G9p.A1A(A0e, gAh.A00);
                Integer BUY = A002.BUY();
                if (BUY != null) {
                    l = C51969G9p.A0r(BUY);
                } else {
                    l = null;
                }
                A0e.A9F("multi_ads_type_number", l);
                C51969G9p.A18(A0e, A002);
                A0e.AAJ("insertion_mechanism", A002.BHg());
                C51974G9v.A0n(A0e, A002, C51972G9s.A0j(A002.Br2()));
                C51970G9q.A1D(A0e, A002);
                AnonymousClass3W1 r5 = gDe.A0E;
                if (r5 != null) {
                    i = r5.A0M;
                } else {
                    i = -1;
                }
                A0e.A9F(AnonymousClass000.A00(3186), DbS.A0j(i));
                if (r5 != null) {
                    i2 = r5.A0L;
                } else {
                    i2 = -1;
                }
                A0e.A9F(AnonymousClass000.A00(3185), DbS.A0j(i2));
                if (r5 != null) {
                    i3 = r5.A0K;
                } else {
                    i3 = -1;
                }
                A0e.A9F(AnonymousClass000.A00(3184), DbS.A0j(i3));
                if (r5 != null) {
                    i4 = r5.A0I;
                } else {
                    i4 = -1;
                }
                A0e.A9F(AnonymousClass000.A00(3183), DbS.A0j(i4));
                Integer A2P = C51966G9m.A0s(r12).A2P();
                if (A2P != null) {
                    str = A2P.toString();
                }
                A0e.AAJ("imp_signature", str);
                A0e.Cgf();
            }
            C3728893a A0p = C51965G9l.A0p(this.A02);
            if (A0p != null) {
                C52058GDe.A07(r12, gDe, this.A00, A0p, false);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C267324bN r4 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        boolean A1Z = AnonymousClass7TG.A1Z(r4, gDe);
        C3728893a A0p = C51965G9l.A0p(this.A02);
        if (A0p != null) {
            C52058GDe.A07(r4, gDe, this.A00, A0p, A1Z);
        }
    }
}
