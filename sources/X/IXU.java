package X;

import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.save.model.SavedCollection;

public final class IXU implements JR5 {
    public final /* synthetic */ C52770GcN A00;

    public final void AOS() {
    }

    public final void EFj() {
    }

    public IXU(C52770GcN gcN) {
        this.A00 = gcN;
    }

    public final SavedCollection Aog() {
        SavedCollection savedCollection = this.A00.A0C;
        if (savedCollection != null) {
            return savedCollection;
        }
        0qQ.A0F("collection");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void CHy() {
        H5L A0A = this.A00.A0A();
        C56080HsT hsT = A0A.A01;
        if (hsT != null) {
            A0A.A02 = true;
            hsT.A00.setVisibility(0);
            C55808Hno hno = A0A.A09;
            IgTextView igTextView = hno.A01;
            if (igTextView != null && igTextView.getVisibility() == 0) {
                AnonymousClass7TH.A0R(hno.A01);
                IgTextView igTextView2 = hno.A01;
                if (igTextView2 != null) {
                    igTextView2.clearAnimation();
                }
                IgTextView igTextView3 = hno.A01;
                if (igTextView3 != null) {
                    C55536HjI hjI = hno.A04;
                    AnimationSet animationSet = new AnimationSet(true);
                    hjI.A00 = animationSet;
                    animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
                    hjI.A00.addAnimation(new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f));
                    hjI.A00.setDuration(200);
                    igTextView3.startAnimation(hjI.A00);
                }
            }
            A0A.A01.A02(false);
            H5L.A00(A0A);
            A0A.A01();
        }
    }

    public final boolean CJz() {
        return this.A00.A09().A0A();
    }

    public final void CHs() {
        String str;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putSerializable("SaveFragment.SAVE_HOME_TAB_MODE", HMH.ADD_TO_EXISTING_COLLECTION);
        C52770GcN gcN = this.A00;
        SavedCollection savedCollection = gcN.A0C;
        if (savedCollection == null) {
            str = "collection";
        } else {
            A0a.putParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", savedCollection);
            UserSession userSession = gcN.A03;
            if (userSession == null) {
                str = "userSession";
            } else {
                DbU.A1K(gcN, C51975G9x.A0a(A0a, gcN, userSession));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void CHt() {
        String str;
        C55115HcO.A00();
        C52770GcN gcN = this.A00;
        SavedCollection savedCollection = gcN.A0C;
        if (savedCollection == null) {
            str = "collection";
        } else {
            boolean A0A = gcN.A09().A0A();
            H10 h10 = new H10();
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putParcelable("collection_to_edit", savedCollection);
            A0a.putBoolean("collection_has_items", A0A);
            FragmentActivity A0I = DbU.A0I(A0a, h10, gcN);
            UserSession userSession = gcN.A03;
            if (userSession == null) {
                str = "userSession";
            } else {
                DbY.A14(h10, A0I, userSession);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
