package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;

/* renamed from: X.KNr  reason: case insensitive filesystem */
public final class C61828KNr extends C60102Jfi {
    public final AnonymousClass07Z A00;
    public final UserSession A01;
    public final C60304Jj3 A02;
    public final KO3 A03;
    public final C61825KNo A04;
    public final KOX A05;
    public final KOC A06;
    public final C61840KOe A07;
    public final C61837KOb A08;
    public final KO8 A09;
    public final C61845KOj A0A;
    public final KOD A0B;
    public final KOO A0C;
    public final KOP A0D;
    public final KO7 A0E;
    public final C60259JiG A0F;
    public final KOQ A0G;
    public final C61838KOc A0H;
    public final KOU A0I;
    public final KOI A0J;
    public final C61841KOf A0K;
    public final KOM A0L;
    public final C61850KOp A0M;
    public final KON A0N;
    public final C61847KOm A0O;
    public final KOF A0P;
    public final C61839KOd A0Q;
    public final Application A0R;

    public final boolean A0H(PublishScreenCategoryType publishScreenCategoryType, C62779KmH kmH) {
        0qQ.A0B(publishScreenCategoryType, 1);
        C61825KNo kNo = this.A04;
        C61075JwD A012 = A01(this);
        if (kmH instanceof C61833KNw) {
            return kNo.A08(publishScreenCategoryType, A012, ((C61833KNw) kmH).A00);
        }
        if (!(kmH instanceof C61832KNv)) {
            return false;
        }
        PublishScreenCategoryType publishScreenCategoryType2 = ((C61832KNv) kmH).A00;
        if (publishScreenCategoryType2.ordinal() != 4) {
            return kNo.A07(publishScreenCategoryType2, publishScreenCategoryType2, A012);
        }
        return 182.A06(0Tu.A05, kNo.A00, 36328645866438137L);
    }

    public static final C61075JwD A01(C61828KNr kNr) {
        return (C61075JwD) ((C361278fx) kNr.A03.A06.getValue()).A01;
    }

    public final void A0F(Runnable runnable) {
        MHN.A03(runnable, this, C318116oQ.A00(this), 40);
    }

    public final boolean A0G() {
        AnonymousClass3QO r1;
        C61075JwD A012 = A01(this);
        if (A012 != null) {
            r1 = A012.A0C;
        } else {
            r1 = null;
        }
        return AnonymousClass7TF.A1W(r1, AnonymousClass3QO.CLOSE_FRIENDS);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61828KNr(Application application, AnonymousClass07Z r4, UserSession userSession, C60304Jj3 jj3, KO3 ko3, C61825KNo kNo, KOX kox, KOC koc, C61840KOe kOe, C61837KOb kOb, KO8 ko8, C61845KOj kOj, KOD kod, KOO koo, KOP kop, KO7 ko7, C60259JiG jiG, KOQ koq, C61838KOc kOc, KOU kou, KOI koi, C61841KOf kOf, KOM kom, C61850KOp kOp, KON kon, C61847KOm kOm, KOF kof, C61839KOd kOd) {
        super(application, kNo);
        C60259JiG jiG2 = jiG;
        C51973G9u.A0r(3, userSession, r4, jiG2);
        this.A0R = application;
        this.A03 = ko3;
        this.A01 = userSession;
        this.A00 = r4;
        this.A0F = jiG2;
        this.A02 = jj3;
        this.A04 = kNo;
        this.A0B = kod;
        this.A08 = kOb;
        this.A0M = kOp;
        this.A06 = koc;
        this.A0G = koq;
        this.A0H = kOc;
        this.A0I = kou;
        this.A0N = kon;
        this.A0C = koo;
        this.A0J = koi;
        this.A0O = kOm;
        this.A0A = kOj;
        this.A0P = kof;
        this.A0Q = kOd;
        this.A09 = ko8;
        this.A05 = kox;
        this.A07 = kOe;
        this.A0D = kop;
        this.A0E = ko7;
        this.A0L = kom;
        this.A0K = kOf;
        MH9.A04(this, C318116oQ.A00(this), 2);
        A0F(new C65893M3i(this));
    }
}
