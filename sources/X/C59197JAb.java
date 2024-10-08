package X;

import android.view.View;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.JAb  reason: case insensitive filesystem */
public final class C59197JAb extends 0Yg implements 0sL {
    public final /* synthetic */ View.OnClickListener A00;
    public final /* synthetic */ IGCTMessagingAdsInfoDictIntf A01;
    public final /* synthetic */ AnonymousClass3OA A02;
    public final /* synthetic */ GFJ A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59197JAb(View.OnClickListener onClickListener, IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf, AnonymousClass3OA r4, GFJ gfj, String str, C62320sa r7, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A08 = z;
        this.A03 = gfj;
        this.A02 = r4;
        this.A00 = onClickListener;
        this.A07 = z2;
        this.A05 = r7;
        this.A06 = z3;
        this.A01 = iGCTMessagingAdsInfoDictIntf;
        this.A04 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        GFJ gfj;
        C52673Gal gal;
        Object obj3;
        C279794zK B68;
        List BYc;
        1Xj r1;
        View view = (View) obj;
        String str = (String) obj2;
        boolean A1Z = AnonymousClass7TG.A1Z(view, str);
        Long l = null;
        if (this.A08) {
            GFJ gfj2 = this.A03;
            C52058GDe gDe = gfj2.A08;
            Long l2 = gDe.A03;
            Long l3 = null;
            if (l2 != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l2.longValue() + 1000;
                if (currentTimeMillis >= longValue) {
                    l3 = Long.valueOf(currentTimeMillis - longValue);
                }
            }
            C267324bN r10 = gfj2.A06;
            UserSession userSession = gfj2.A0A;
            0qQ.A0B(userSession, A1Z ? 1 : 0);
            if (r10 != null && (r1 = r10.A02) != null && !r1.A5n() && !r1.A5e() && !AnonymousClass71K.A03(r10) && !r10.A06().A0v) {
                long A012 = 182.A01(0Tu.A05, userSession, 36610438670063611L);
                if (A012 >= 0 && l3 != null && l3.longValue() >= A012) {
                    gDe.A05 = str;
                    gfj2.A0P.A04(view, C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON, (C59543JNp) null, this.A02, (Integer) null);
                    C52672Gak gak = gfj2.A0E;
                    if (gak != null) {
                        C52672Gak.A03(gak, l3, "lead_ads_reels_first_question", "lead_ads_first_question_one_tap_dwell_option_click");
                    }
                    this.A00.onClick(view);
                    gDe.A03 = null;
                    gDe.A06 = A1Z;
                }
            }
            if (this.A07) {
                C257813y0 r0 = r10.A06().A0B;
                if (r0 == null || (B68 = r0.B68()) == null || (BYc = B68.BYc()) == null) {
                    obj3 = null;
                } else {
                    obj3 = 00k.A0L(BYc);
                }
                boolean equals = str.equals(obj3);
                C52672Gak gak2 = gfj2.A0E;
                if (equals) {
                    if (gak2 != null) {
                        C52672Gak.A03(gak2, l3, "lead_ads_reels_offsite_generic_question", "lead_ads_offsite_generic_question_option_no_click");
                    }
                    this.A05.invoke();
                } else {
                    if (gak2 != null) {
                        C52672Gak.A03(gak2, l3, "lead_ads_reels_offsite_generic_question", "lead_ads_offsite_generic_question_option_yes_click");
                    }
                    gfj2.A0P.A04(view, C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON, (C59543JNp) null, this.A02, (Integer) null);
                    this.A00.onClick(view);
                }
            } else {
                C52672Gak gak3 = gfj2.A0E;
                if (gak3 != null) {
                    C52672Gak.A03(gak3, l3, "lead_ads_reels_first_question", "lead_ads_first_question_option_click");
                }
            }
            gDe.A03 = null;
            gDe.A06 = A1Z;
        } else if (this.A06 && (gal = gfj.A0B) != null) {
            C267324bN r2 = (gfj = this.A03).A06;
            String A1B = C51966G9m.A1B(r2);
            IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf = this.A01;
            if (iGCTMessagingAdsInfoDictIntf != null) {
                l = Long.valueOf(C16947VBz.A00(iGCTMessagingAdsInfoDictIntf));
            }
            gal.A03(gfj.A0A, r2.A02, l, A1B, this.A04);
        }
        return C60340gF.A00;
    }
}
