package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

public final class IXV implements JR5 {
    public final /* synthetic */ H15 A00;

    public IXV(H15 h15) {
        this.A00 = h15;
    }

    public final void AOS() {
        H15 h15 = this.A00;
        if (h15.A0C == null || h15.A0E == C54665HMw.ALL_MEDIA_AUTO_COLLECTION) {
            H15.A01(h15);
            return;
        }
        C358248ab A0U = DbW.A0U(h15);
        A0U.A09(2131972543);
        A0U.A08(2131972542);
        A0U.A0Y(C56719I8z.A00(h15, 38), C358278ae.RED_BOLD, h15.getString(2131957531), true);
        A0U.A05();
        AnonymousClass7TH.A0a(A0U, true);
    }

    public final SavedCollection Aog() {
        return this.A00.A0C;
    }

    public final void CHs() {
        H15 h15 = this.A00;
        if (h15.A0C != null) {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putSerializable("SaveFragment.SAVE_HOME_TAB_MODE", HMH.ADD_TO_EXISTING_COLLECTION);
            A0a.putParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", h15.A0C);
            DbU.A1K(h15, C51975G9x.A0a(A0a, h15, h15.A05));
        }
    }

    public final void CHt() {
        H15 h15 = this.A00;
        SavedCollection savedCollection = h15.A0C;
        if (savedCollection != null) {
            C55115HcO.A00();
            boolean A03 = h15.A0B.A03();
            H10 h10 = new H10();
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putParcelable("collection_to_edit", savedCollection);
            A0a.putBoolean("collection_has_items", A03);
            C309516Yo A0M = DbS.A0M(DbU.A0I(A0a, h10, h15), h15.A05);
            A0M.A0E(h10);
            A0M.A04();
        }
    }

    public final void CHy() {
        H15 h15 = this.A00;
        if (h15.A0F != null) {
            C57417IaN iaN = h15.A0B;
            if (!iaN.A05) {
                iaN.A05 = true;
                iaN.A02();
            }
            h15.A0F.A00.setVisibility(0);
            h15.A0F.A02(false);
            Dbb.A0u(h15);
        }
    }

    public final boolean CJz() {
        return this.A00.A0B.A03();
    }

    public final void EFj() {
        H15 h15 = this.A00;
        if (H15.A0A(h15)) {
            UserSession userSession = h15.A05;
            C71093OcF A01 = ORV.A01(h15.requireActivity(), h15, userSession, C14068TpH.IG_COLLECTION, C16677UzD.IG_COLLECTION, h15.A0L);
            A01.A01 = DbT.A0j(h15.A05);
            A01.A0H = true;
            C16666Uz2 uz2 = C16666Uz2.CHEVRON_BUTTON;
            0qQ.A0B(uz2, 0);
            A01.A02 = uz2;
            C71093OcF.A00((C331157Pu) null, A01);
        }
    }
}
