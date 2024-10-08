package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ukx  reason: case insensitive filesystem */
public final class C15932Ukx extends NK3 {
    public static final String __redex_internal_original_name = "StickerExistingThreadSheetFragment";
    public C62030KWg A00;
    public C74461PvG A01;
    public boolean A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final boolean A04 = true;

    public final String getModuleName() {
        return "sticker_existing_thread_sheet_fragment";
    }

    public final UserSession A01() {
        return AnonymousClass7TE.A0l(this.A03);
    }

    public final C62030KWg A02() {
        C62030KWg kWg = this.A00;
        if (kWg != null) {
            return kWg;
        }
        0qQ.A0F("repository");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C74461PvG A03() {
        C74461PvG pvG = this.A01;
        if (pvG != null) {
            return pvG;
        }
        0qQ.A0F("delegate");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A04() {
        return this.A02;
    }

    public final boolean A05() {
        if (this.A02) {
            return false;
        }
        UserSession A012 = getSession();
        0Tu r3 = 0Tu.A05;
        if (!182.A06(r3, A012, 36314936330161056L)) {
            return false;
        }
        if (this.A04 != null || 182.A06(r3, getSession(), 36314936330423203L)) {
            return true;
        }
        return false;
    }

    public final boolean A06() {
        return this.A04;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-680206718);
        C15932Ukx.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = requireArguments.getString(AnonymousClass000.A00(477));
        this.A02 = requireArguments.getBoolean("IS_CAMERA_DESTINATION_CLIPS_KEY");
        AnonymousClass0fD.A09(-1363654223, A022);
    }
}
