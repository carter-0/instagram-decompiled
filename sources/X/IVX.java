package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.CollaborativeCollectionMetadata;
import com.instagram.save.model.SavedCollection;

public final class IVX implements MVB {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ SavedCollection A03;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public IVX(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, SavedCollection savedCollection) {
        this.A03 = savedCollection;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final void onButtonClick(View view) {
        SavedCollection savedCollection = this.A03;
        CollaborativeCollectionMetadata collaborativeCollectionMetadata = savedCollection.A05;
        if (collaborativeCollectionMetadata == null) {
            FragmentActivity fragmentActivity = this.A00;
            if (!fragmentActivity.getSupportFragmentManager().A0G) {
                UserSession userSession = this.A02;
                C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
                C55115HcO.A00();
                A0M.A0B((Bundle) null, C56344Hwv.A00(HMH.COLLECTION_FEED, savedCollection, (HMV) null, userSession.A05, this.A01.getModuleName()));
                A0M.A0C = "DELETE_COLLECTION_BACK_STACK_NAME";
                A0M.A0A = "DELETE_COLLECTION_BACK_STACK_NAME";
                A0M.A0G = true;
                A0M.A04();
            }
        } else if (!0mp.A0B(collaborativeCollectionMetadata.A00)) {
            1pE A012 = 1pE.A01(this.A00, this.A01, this.A02, "direct_save_to_collection_confirmation_toast");
            A012.A0B = new C254763t0(collaborativeCollectionMetadata.A00);
            A012.A06();
        }
    }
}
