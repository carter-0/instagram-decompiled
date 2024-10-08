package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.api.schemas.NoteEmojiReactionInfoIntf;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HTj  reason: case insensitive filesystem */
public abstract /* synthetic */ class C54802HTj {
    public static Map A00(C2809354u r5) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r5.AdI() != null) {
            A1H.put("audience", r5.AdI());
        }
        if (r5.AsC() != null) {
            A1H.put("created_at", r5.AsC());
        }
        ArrayList arrayList = null;
        if (r5.Auz() != null) {
            NoteCustomTheme Auz = r5.Auz();
            if (Auz != null) {
                treeUpdaterJNI = Auz.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(4687), treeUpdaterJNI);
        }
        List Azi = r5.Azi();
        if (Azi != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(Azi);
            Iterator it = Azi.iterator();
            while (it.hasNext()) {
                C41846B3n.A1T(A0r, it);
            }
            A1H.put(AnonymousClass000.A00(3036), A0r);
        }
        if (r5.B2l() != null) {
            A1H.put("expires_at", r5.B2l());
        }
        if (r5.BCJ() != null) {
            A1H.put("has_translation", r5.BCJ());
        }
        if (r5.getId() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r5.getId());
        }
        if (r5.getMediaId() != null) {
            A1H.put("media_id", r5.getMediaId());
        }
        if (r5.Bjr() != null) {
            List<NoteEmojiReactionInfoIntf> Bjr = r5.Bjr();
            if (Bjr != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (NoteEmojiReactionInfoIntf noteEmojiReactionInfoIntf : Bjr) {
                    if (noteEmojiReactionInfoIntf != null) {
                        arrayList.add(noteEmojiReactionInfoIntf.FHC());
                    }
                }
            }
            A1H.put("reactions", arrayList);
        }
        if (r5.getText() != null) {
            A1H.put("text", r5.getText());
        }
        User CCd = r5.CCd();
        if (CCd != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER, CCd.A08());
        }
        if (r5.getUserId() != null) {
            A1H.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, r5.getUserId());
        }
        if (r5.CF2() != null) {
            A1H.put(AnonymousClass000.A00(5380), r5.CF2());
        }
        return 0Yt.A0B(A1H);
    }
}
