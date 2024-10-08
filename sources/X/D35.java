package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallGifPostItem;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallMediaPostItem;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallText;
import com.instagram.wonderwall.model.WallTextPostItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class D35 {
    public static final C45325CuT A00(C268654dm r4, int i) {
        0qQ.A0B(r4, 0);
        if (r4 instanceof C268674do) {
            WallText.Res res = new WallText.Res(i, new String[0]);
            if (!(!res.equals(C56485HzH.A00))) {
                res = new WallText.Res(2131976762, new String[0]);
            }
            return new C45325CuT(res, false);
        } else if (r4 instanceof C268664dn) {
            return CTZ.A00;
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    public static final WallPostItem A01(1E6 r26, UserSession userSession, WallInfo wallInfo, C43715C6l c6l) {
        List list;
        C250663lr optionalTreeField;
        C250663lr optionalTreeField2;
        C250663lr optionalTreeField3;
        WallInfo wallInfo2 = wallInfo;
        0qQ.A0B(wallInfo2, 2);
        0qQ.A0B(r26, 3);
        C43715C6l c6l2 = c6l;
        Class<C8P> cls = C8P.class;
        UserSession userSession2 = userSession;
        User A0E = ((C8P) c6l2.getRequiredTreeField(3, "author", C43707C6d.class, 1049858260).reinterpretRequired(0, cls, 632736148)).A0E(1E4.A00(userSession2));
        0qQ.A07(A0E);
        String requiredStringField = c6l2.getRequiredStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        0qQ.A07(requiredStringField);
        String A0l = C41845B3m.A0l(c6l2, 1);
        if (A0l == null) {
            A0l = "";
        }
        boolean A1V = AnonymousClass7TF.A1V(c6l2.getOptionalTreeField(9, "viewer_reaction", C43712C6i.class, -1968830865));
        boolean A0K = 0qQ.A0K(userSession2.A06, A0E.getId());
        int coercedIntField = c6l2.getCoercedIntField(7, "num_reactions");
        ImmutableList optionalCompactedTreeListField = c6l2.getOptionalCompactedTreeListField(8, "reacting_users", C43711C6h.class, -1879039958);
        WallPostItem wallPostItem = null;
        if (optionalCompactedTreeListField != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = optionalCompactedTreeListField.iterator();
            while (it.hasNext()) {
                User A0E2 = ((C8P) C41845B3m.A0V(it).reinterpretRequired(0, C6U.class, -1054605485).getRequiredTreeField(0, PublicKeyCredentialControllerUtility.JSON_KEY_USER, C6T.class, -924824798).reinterpretRequired(0, cls, 632736148)).A0E(1E4.A00(userSession2));
                if (A0E2 != null) {
                    A1C.add(A0E2);
                }
            }
            list = 00k.A0a(A1C);
        } else {
            list = 0sn.A00;
        }
        WallInfo wallInfo3 = wallInfo2;
        WallPostInfo wallPostInfo = new WallPostInfo(A0E, wallInfo3, HMM.IDLE, requiredStringField, A0l, list, coercedIntField, -1, c6l2.getRequiredTimeField(2, "created_at"), A0K, false, A1V);
        int ordinal = ((C16640Uyc) c6l2.getRequiredEnumField(6, "post_type", C16640Uyc.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)).ordinal();
        if (ordinal == 3) {
            wallPostItem = new WallTextPostItem(wallPostInfo);
        } else if (ordinal == 2) {
            C250663lr optionalTreeField4 = c6l2.getOptionalTreeField(10, "wall_media", C43713C6j.class, -2076400368);
            if (optionalTreeField4 != null) {
                C250663lr reinterpretRequired = optionalTreeField4.reinterpretRequired(0, C43706C6c.class, 1075338530);
                1E5 A00 = 1E4.A00(userSession2);
                1Xv r0 = 1Xj.A0h;
                1Xj A01 = 1Xv.A01(new 1E9(A00, AnonymousClass7TE.A1F(), false), (ImmutablePandoMediaDict) reinterpretRequired.reinterpret(ImmutablePandoMediaDict.class));
                0qQ.A07(A01);
                wallPostItem = new WallMediaPostItem(A01, wallPostInfo);
            }
        } else if (ordinal != 1 || (optionalTreeField = c6l2.getOptionalTreeField(11, "gif_info", C43710C6g.class, 148059326)) == null || (optionalTreeField2 = optionalTreeField.getOptionalTreeField(1, "images", C43709C6f.class, 190994083)) == null || (optionalTreeField3 = optionalTreeField2.getOptionalTreeField(0, "fixed_height", C43708C6e.class, 732103033)) == null) {
            return null;
        } else {
            String optionalStringField = optionalTreeField.getOptionalStringField(0, "gif_media_id");
            if (optionalStringField == null) {
                optionalStringField = "";
            }
            String optionalStringField2 = optionalTreeField3.getOptionalStringField(2, "url");
            if (optionalStringField2 == null) {
                optionalStringField2 = "";
            }
            wallPostItem = new WallGifPostItem(new GifUrlImpl(optionalStringField2, (float) optionalTreeField3.getCoercedIntField(1, IgReactMediaPickerNativeModule.WIDTH), (float) optionalTreeField3.getCoercedIntField(0, IgReactMediaPickerNativeModule.HEIGHT)), wallPostInfo, optionalStringField);
        }
        return wallPostItem;
    }
}
