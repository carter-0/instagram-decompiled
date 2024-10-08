package com.instagram.urlhandlers.media;

import X.0Tu;
import X.182;
import X.1OC;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C227272iw;
import X.C273374mT;
import X.C47649EBj;
import X.C49168EqZ;
import X.C60960kU;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbX;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public class ShortUrlReelLoadingFragment extends C273374mT implements C227272iw {
    public final Handler A00 = AnonymousClass7TF.A0D();
    public SpinnerImageView mLoadingSpinner;

    public final boolean COC() {
        return true;
    }

    public final String getModuleName() {
        return "short_url_reel_loading_fragment";
    }

    public final void configureActionBar(2da r6) {
        Resources A05;
        if (182.A06(0Tu.A05, getSession(), 36330131924468187L)) {
            A05 = C60960kU.A00.getResources();
        } else {
            A05 = DbV.A05(this);
        }
        r6.ETj(getSession(), R.layout.action_bar_title_logo, AnonymousClass7TE.A0F(A05), 0);
        r6.Eu4(true);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(566205458);
        ShortUrlReelLoadingFragment.super.onCreate(bundle);
        String string = requireArguments().getString("com.instagram.url.constants.ARGUMENTS_KEY_REEL_SHORT_URL");
        if (string != null) {
            1OC A002 = C49168EqZ.A00(getSession(), string);
            A002.A00 = new C47649EBj(this, string);
            schedule(A002);
        }
        AnonymousClass0fD.A09(1049292480, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1738416918);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_loading_spinner);
        AnonymousClass0fD.A09(188695034, A02);
        return A0C;
    }

    public final void onDestroyView() {
        int A02 = AnonymousClass0fD.A02(1179998937);
        super.onDestroyView();
        this.mLoadingSpinner = null;
        AnonymousClass0fD.A09(-1358229143, A02);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        SpinnerImageView A0k = DbX.A0k(view);
        this.mLoadingSpinner = A0k;
        DbS.A1T(A0k);
    }
}
