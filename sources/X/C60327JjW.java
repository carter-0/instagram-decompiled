package X;

import com.instagram.android.R;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.mediakit.analytics.VisibilitySheetOrigin;
import com.instagram.mediakit.config.MediaKitInfoSheetConfig;
import com.instagram.mediakit.repository.MediaKitRepository;
import com.instagram.monetization.repository.MonetizationRepository;
import java.util.ArrayList;

/* renamed from: X.JjW  reason: case insensitive filesystem */
public final class C60327JjW extends 2YL implements MXF {
    public static final String __redex_internal_original_name = "MediaKitViewModel";
    public LML A00;
    public boolean A01;
    public final 1a8 A02 = new 1a8(C318146oT.A01);
    public final UserSession A03;
    public final 2Dm A04;
    public final L9D A05;
    public final LC9 A06;
    public final MediaKitRepository A07;
    public final L9F A08;
    public final C65329LrS A09;
    public final MonetizationRepository A0A;
    public final ArrayList A0B;
    public final C249513ju A0C;
    public final C249513ju A0D;
    public final AnonymousClass0r6 A0E;
    public final AnonymousClass0r6 A0F;
    public final 05G A0G;
    public final 05G A0H;
    public final 05G A0I;
    public final AnonymousClass0Ud A0J;
    public final AnonymousClass0Ud A0K;
    public final AnonymousClass0Ud A0L;
    public final AnonymousClass0Ud A0M;
    public final AnonymousClass0Ud A0N;
    public final AnonymousClass0iw A0O;
    public final LDW A0P;

    public C60327JjW(AnonymousClass0iw r13, UserSession userSession, 2Dm r15, LDW ldw, L9D l9d, LC9 lc9, MediaKitRepository mediaKitRepository, MonetizationRepository monetizationRepository) {
        L9D l9d2 = l9d;
        MediaKitRepository mediaKitRepository2 = mediaKitRepository;
        MonetizationRepository monetizationRepository2 = monetizationRepository;
        C51974G9v.A1M(l9d2, mediaKitRepository2, monetizationRepository2);
        LC9 lc92 = lc9;
        0qQ.A0B(lc92, 5);
        AnonymousClass7TF.A1E(r15, 6, r13);
        LDW ldw2 = ldw;
        0qQ.A0B(ldw2, 8);
        this.A03 = userSession;
        this.A05 = l9d2;
        this.A07 = mediaKitRepository2;
        this.A0A = monetizationRepository2;
        this.A06 = lc92;
        this.A04 = r15;
        this.A0O = r13;
        this.A0P = ldw2;
        this.A08 = LJF.A00(userSession);
        this.A09 = new C65329LrS(userSession, this, mediaKitRepository2, this);
        02z A10 = DbS.A10(C62466KgG.VIEW);
        this.A0H = A10;
        05F A032 = 10b.A03(A10);
        this.A0L = A032;
        02z A012 = 106.A01(C65449LtX.A00);
        this.A0G = A012;
        this.A0J = 10b.A03(A012);
        1HR A1G = JTO.A1G(Integer.MAX_VALUE);
        this.A0C = A1G;
        this.A0E = 0u9.A04(A1G);
        AnonymousClass0Ud r9 = mediaKitRepository2.A0C;
        C61860pz A1I = JTO.A1I(MGW.A01(this, (AnonymousClass4D7) null, 21), MC9.A00(r9, 53));
        C318136oS A002 = C318116oQ.A00(this);
        AnonymousClass109 r8 = AnonymousClass10A.A01;
        this.A0M = 10b.A02((Object) null, A002, A1I, r8);
        AnonymousClass0Ud r2 = mediaKitRepository2.A0B;
        C318136oS A003 = C318116oQ.A00(this);
        0sn r7 = 0sn.A00;
        this.A0K = 10b.A02(r7, A003, r2, r8);
        02z A013 = 106.A01(C65431LtF.A00);
        this.A0I = A013;
        this.A0N = 10b.A02(r7, C318116oQ.A00(this), AnonymousClass10H.A00(new MIK(this, 1), A013, r9, A032), r8);
        1HR A1G2 = JTO.A1G(Integer.MAX_VALUE);
        this.A0D = A1G2;
        this.A0F = 0u9.A04(A1G2);
        this.A0B = AnonymousClass7TE.A1C();
        l9d2.A01 = 0qQ.A0K(l9d2.A03.A06, (Object) null);
        MediaKitRepository mediaKitRepository3 = this.A07;
        DbY.A19(this, MGW.A01(this, (AnonymousClass4D7) null, 19), mediaKitRepository3.A04);
        DbY.A19(this, new JV6(this, (AnonymousClass4D7) null, 28), mediaKitRepository3.A05);
        C318136oS A004 = C318116oQ.A00(this);
        C51645Fy4 fy4 = new C51645Fy4(this, (AnonymousClass4D7) null, 6);
        19B r4 = 19B.A00;
        1Eo.A05(r4, fy4, A004);
        M1T.A00(this.A04.A0C.A09(2EN.A04), this.A02, this, 9);
        if (this.A05.A04) {
            MonetizationRepository monetizationRepository3 = this.A0A;
            if (!monetizationRepository3.A0B.containsKey(UserMonetizationProductType.BRANDED_CONTENT_DEAL_BRAND)) {
                DbY.A19(this, MGW.A01(this, (AnonymousClass4D7) null, 22), monetizationRepository3.A0F);
                1Eo.A05(r4, new C51645Fy4(this, (AnonymousClass4D7) null, 8), C318116oQ.A00(this));
                return;
            }
        }
        A03();
    }

    public static final void A00(LE6 le6, C60327JjW jjW) {
        A02(new C65454Ltc(le6), jjW);
    }

    public static final void A01(C62577KiA kiA, C60327JjW jjW) {
        boolean z;
        C66407MQn[] mQnArr;
        C66407MQn ltb;
        C61221JzE A002;
        LC9 lc9 = jjW.A06;
        MediaKitRepository mediaKitRepository = jjW.A07;
        if (MediaKitRepository.A00(mediaKitRepository) == null || !((A002 = MediaKitRepository.A00(mediaKitRepository)) == null || A002.A03 == null)) {
            z = false;
        } else {
            z = true;
        }
        if (lc9.A00(kiA, z)) {
            int ordinal = kiA.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    mQnArr = new C66407MQn[1];
                    MediaKitInfoSheetConfig mediaKitInfoSheetConfig = MediaKitInfoSheetConfig.A0D;
                    mediaKitInfoSheetConfig.A09 = new C51793G2c(jjW, 12);
                    mediaKitInfoSheetConfig.A00 = LY6.A00(mediaKitInfoSheetConfig, 43);
                    ltb = new C65465Ltn(mediaKitInfoSheetConfig);
                }
                DbX.A1V(lc9.A00, kiA.A00, true);
            }
            mQnArr = new C66407MQn[1];
            C63934LDu lDu = new C63934LDu(2131966612, 2131966611);
            lDu.A02 = Integer.valueOf(R.drawable.ig_illustrations_illo_add_photos_videos_refresh);
            lDu.A00(C358278ae.BLUE_BOLD, new C51793G2c(jjW, 10), 2131966559);
            ltb = new C65453Ltb(lDu);
            mQnArr[0] = ltb;
            jjW.A05(mQnArr);
            DbX.A1V(lc9.A00, kiA.A00, true);
        }
    }

    public final void A03() {
        L9D l9d = this.A05;
        if (l9d.A04) {
            MonetizationRepository monetizationRepository = this.A0A;
            UserMonetizationProductType userMonetizationProductType = UserMonetizationProductType.BRANDED_CONTENT_DEAL_BRAND;
            boolean A052 = monetizationRepository.A05(userMonetizationProductType);
            boolean A062 = monetizationRepository.A06(userMonetizationProductType);
            l9d.A02 = A052;
            l9d.A00 = A062;
        }
    }

    public final void A04(VisibilitySheetOrigin visibilitySheetOrigin) {
        A02(new C65467Ltp(visibilitySheetOrigin), this);
    }

    public final LDW BO3() {
        return this.A0P;
    }

    public final String getModuleName() {
        return this.A0O.getModuleName();
    }

    public final void onCleared() {
        this.A02.A01();
    }

    public static void A02(C66407MQn mQn, C60327JjW jjW) {
        jjW.A05(mQn);
    }

    public final void A05(C66407MQn... mQnArr) {
        AnonymousClass7TE.A1Z(new C58096ImI(mQnArr, this, (AnonymousClass4D7) null, 1), C51975G9x.A0R(this, mQnArr));
    }
}
