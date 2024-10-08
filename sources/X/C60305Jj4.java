package X;

import android.content.Context;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.brandedcontent.repository.BrandedContentSettingsRepository;
import com.instagram.common.session.UserSession;
import com.instagram.mediakit.repository.MediaKitRepository;
import com.instagram.monetization.repository.MonetizationRepository;
import java.util.ArrayList;

/* renamed from: X.Jj4  reason: case insensitive filesystem */
public final class C60305Jj4 extends 2YL {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final 2Fk A04;
    public final BrandedContentSettingsRepository A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final MediaKitRepository A08;
    public final MonetizationRepository A09;
    public final 1Am A0A;
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A01(new C20606Wvn(this, 0));
    public final C249513ju A0C;
    public final AnonymousClass0r6 A0D;
    public final 05G A0E;
    public final AnonymousClass0Ud A0F;
    public final boolean A0G;
    public final Context A0H;

    public C60305Jj4(Context context, BrandedContentSettingsRepository brandedContentSettingsRepository, AnonymousClass0iw r16, UserSession userSession, MediaKitRepository mediaKitRepository, MonetizationRepository monetizationRepository, 1Am r20) {
        UserSession userSession2 = userSession;
        int A022 = DbW.A02(1, context, userSession2);
        MediaKitRepository mediaKitRepository2 = mediaKitRepository;
        MonetizationRepository monetizationRepository2 = monetizationRepository;
        AnonymousClass0iw r6 = r16;
        C51974G9v.A0d(3, r6, brandedContentSettingsRepository, monetizationRepository2, mediaKitRepository2);
        1Am r2 = r20;
        0qQ.A0B(r2, 7);
        this.A0H = context;
        this.A07 = userSession2;
        this.A06 = r6;
        this.A05 = brandedContentSettingsRepository;
        this.A09 = monetizationRepository2;
        this.A08 = mediaKitRepository2;
        this.A0A = r2;
        this.A0G = AnonymousClass7TG.A1X(DbX.A0m(userSession2).Ajz());
        02z A0u = C51967G9n.A0u();
        this.A0E = A0u;
        this.A0F = A0u;
        this.A04 = DbT.A0G(10q.A00(new 0ic(new AnonymousClass0r6[]{A00(brandedContentSettingsRepository.A0D), A00(brandedContentSettingsRepository.A0C), A00(brandedContentSettingsRepository.A0B), A00(brandedContentSettingsRepository.A0A), A00(brandedContentSettingsRepository.A09), A00(brandedContentSettingsRepository.A08), A00(A0u), A00(mediaKitRepository2.A0A)}, A022), 10q.A00));
        1HR A1G = JTO.A1G(0);
        this.A0C = A1G;
        this.A0D = 0u9.A04(A1G);
    }

    private final AnonymousClass0r6 A00(AnonymousClass0r6 r4) {
        return AnonymousClass11E.A01(10q.A01(new JVD(this, (AnonymousClass4D7) null, 37), r4));
    }

    public final void A02() {
        if (182.A06(0Tu.A05, this.A07, 36319394506349779L)) {
            MH8.A03(this, C318116oQ.A00(this), 34);
        }
    }

    public final void A03() {
        UserMonetizationProductType userMonetizationProductType;
        ArrayList A1M = 0sr.A1M(new UserMonetizationProductType[]{UserMonetizationProductType.BRANDED_CONTENT});
        UserSession userSession = this.A07;
        if (AnonymousClass430.A03(userSession, 36316808936034961L)) {
            userMonetizationProductType = UserMonetizationProductType.BRANDED_CONTENT_DEAL_BRAND;
        } else {
            userMonetizationProductType = UserMonetizationProductType.BRANDED_CONTENT_DEAL_CREATOR;
        }
        A1M.add(userMonetizationProductType);
        C318136oS A002 = C318116oQ.A00(this);
        MHC mhc = new MHC((Object) A1M, (Object) this, (AnonymousClass4D7) null, 42);
        19B r3 = 19B.A00;
        1Eo.A05(r3, mhc, A002);
        A02();
        if (AnonymousClass430.A01(userSession)) {
            1Eo.A05(r3, new JVD(this, (AnonymousClass4D7) null, 36), C318116oQ.A00(this));
        }
        if (LPL.A02(userSession)) {
            1Eo.A05(r3, new MH8((Object) this, (AnonymousClass4D7) null, 35), C318116oQ.A00(this));
        }
        if (182.A06(0Tu.A05, userSession, 36316289244860616L)) {
            1Eo.A05(r3, new MH8((Object) this, (AnonymousClass4D7) null, 36), C318116oQ.A00(this));
        }
    }

    public final void onCleared() {
        this.A05.A03.A01();
    }

    public static final void A01(C48166Ea8 ea8, C60305Jj4 jj4) {
        AnonymousClass7TE.A1Z(new MHC((Object) ea8, (Object) jj4, (AnonymousClass4D7) null, 43), C318116oQ.A00(jj4));
    }
}
