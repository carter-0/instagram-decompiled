package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import com.instagram.direct.reactions.tabbedreaction.model.DirectCustomReactionTabModel;

public final class PRS implements C324796zu {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public PRS(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final View AN8(int i) {
        String str;
        String A04;
        if (this.A00 != 0) {
            C57417IaN iaN = (C57417IaN) this.A02;
            JQK jqk = (JQK) 00k.A0O(iaN.A06.A01, i);
            if (jqk != null) {
                View AN7 = jqk.AN7((ViewGroup) this.A01, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, iaN.A00);
                AnonymousClass0fU.A00(new WB1(iaN, i, 13), AN7);
                return AN7;
            }
            throw AnonymousClass7TE.A0z("Saved Tab Providers should have position within");
        }
        LayoutInflater A0D = DbV.A0D((View) this.A01);
        C68953Nbc nbc = (C68953Nbc) this.A02;
        TabLayout tabLayout = nbc.A01;
        if (tabLayout == null) {
            0qQ.A0F("tabLayout");
            throw AnonymousClass00P.createAndThrow();
        }
        int i2 = 0;
        View inflate = A0D.inflate(R.layout.custom_reactions_tab_custom_layout, tabLayout, false);
        IgImageView A0Y = JTO.A0Y(inflate, R.id.emoji_image_view);
        DirectCustomReactionTabModel.TabType tabType = ((DirectCustomReactionTabModel) nbc.A02.get(i)).A01;
        DirectCustomReactionTabModel.TabType tabType2 = DirectCustomReactionTabModel.TabType.ALL_TAB;
        if (tabType == tabType2) {
            AnonymousClass7TH.A0R(A0Y);
        } else if (A0Y != null) {
            C336957fS r1 = C317486nL.A04;
            DirectCountBasedReaction directCountBasedReaction = ((DirectCustomReactionTabModel) nbc.A02.get(i)).A00;
            if (directCountBasedReaction != null) {
                str = directCountBasedReaction.A01;
            } else {
                str = "";
            }
            A0Y.setUrl(r1.A04(str), nbc);
        }
        TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.reaction_count_text);
        if (A0d != null) {
            if (((DirectCustomReactionTabModel) nbc.A02.get(i)).A01 == tabType2) {
                A04 = DbV.A05(nbc).getString(2131960432);
            } else {
                DirectCountBasedReaction directCountBasedReaction2 = ((DirectCustomReactionTabModel) nbc.A02.get(i)).A00;
                if (directCountBasedReaction2 != null) {
                    i2 = directCountBasedReaction2.A00;
                }
                A04 = C253673rC.A04(JTR.A0R(nbc), Integer.valueOf(i2), IgNetworkConsentStorage.MAX_ENTRIES, true, false);
            }
            A0d.setText(A04);
        }
        if (i != 0 || A0d == null) {
            return inflate;
        }
        DbT.A17(nbc.requireContext(), A0d, 2Yu.A07(nbc.getContext()));
        return inflate;
    }
}
