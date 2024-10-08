package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import java.util.List;

/* renamed from: X.KyE  reason: case insensitive filesystem */
public abstract class C63503KyE {
    public static final void A00(AnonymousClass4DH r29, UserSession userSession, AnonymousClass3Q2 r31, TaggingFeedMultiSelectState taggingFeedMultiSelectState, Long l, String str, String str2, String str3, List list, List list2) {
        ClipInfo clipInfo;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        AnonymousClass4DH r22 = r29;
        String moduleName = r22.getModuleName();
        Integer num = AnonymousClass05K.A01;
        C16581Uxb uxb = C16581Uxb.CLIPS_COMPOSER;
        String str4 = null;
        TaggingFeedMultiSelectState taggingFeedMultiSelectState2 = null;
        0qQ.A0B(moduleName, 1);
        String str5 = str;
        C51974G9v.A1M(num, uxb, str5);
        List list3 = 0sn.A00;
        ShoppingTaggingFeedClientState shoppingTaggingFeedClientState = new ShoppingTaggingFeedClientState(list3, list3, list3, list3, list3, list3, list3);
        shoppingTaggingFeedClientState.A00 = 0sr.A1N(str2);
        TaggingFeedMultiSelectState taggingFeedMultiSelectState3 = taggingFeedMultiSelectState;
        if (taggingFeedMultiSelectState != null) {
            taggingFeedMultiSelectState2 = taggingFeedMultiSelectState3;
            shoppingTaggingFeedClientState.A03 = JTU.A0b(shoppingTaggingFeedClientState.A03, 0sr.A1N(C64174LSb.A02(shoppingTaggingFeedClientState, taggingFeedMultiSelectState3)));
        }
        boolean A00 = C63447KxC.A00(userSession2);
        AnonymousClass3Q2 r5 = r31;
        if (r31 != null) {
            clipInfo = r5.A1N;
        } else {
            clipInfo = null;
        }
        List list4 = list2;
        if (list2 != null) {
            shoppingTaggingFeedClientState.A02 = list4;
        }
        if (!(r31 == null || r5.A0r == null)) {
            str4 = r5.A35;
        }
        C249713kF.A00.A0j(r22, r22.requireActivity(), (FragmentActivity) null, userSession2, C64174LSb.A01(clipInfo, uxb, shoppingTaggingFeedClientState, taggingFeedMultiSelectState2, num, l, str3, str4, moduleName, (String) null, (String) null, (String) null, str5, list, A00), (String) null, false, true);
    }
}
