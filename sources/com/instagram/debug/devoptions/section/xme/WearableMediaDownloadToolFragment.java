package com.instagram.debug.devoptions.section.xme;

import X.0qQ;
import X.2da;
import X.AnonymousClass0eM;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.C227642jf;
import X.C47518E6c;
import X.C50989Fmc;
import X.DbV;
import X.DbW;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class WearableMediaDownloadToolFragment extends C47518E6c implements AnonymousClass4DS {
    public WearableMediaDownloadManager downloadManager;
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);

    public void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131958396);
    }

    public String getModuleName() {
        return "xme_wearable_media_download_tool";
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.downloadManager = new WearableMediaDownloadManager(this, AnonymousClass7TE.A0l(this.session$delegate));
        getItems();
    }

    private final void getItems() {
        ArrayList arrayList = new ArrayList();
        DbV.A1W(arrayList, true);
        C50989Fmc.A02(requireContext(), new WearableMediaDownloadToolFragment$getItems$1(this), arrayList, 2131958397);
        C50989Fmc.A02(requireContext(), new WearableMediaDownloadToolFragment$getItems$2(this), arrayList, 2131958398);
        C50989Fmc.A02(requireContext(), new WearableMediaDownloadToolFragment$getItems$3(this), arrayList, 2131958399);
        C50989Fmc.A02(requireContext(), new WearableMediaDownloadToolFragment$getItems$4(this), arrayList, 2131958400);
        setItems(arrayList);
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}
