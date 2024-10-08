package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class I6A {
    public final UserSession A00;
    public final Map A01 = AnonymousClass7TE.A1H();

    public static final C61078JwG A00(N1Z n1z, I6A i6a, 1Xj r7) {
        ExtendedImageUrl extendedImageUrl;
        int ordinal = ((C69421Nl3) n1z.A04(TraceFieldType.ContentType, C69421Nl3.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)).ordinal();
        String str = null;
        if (ordinal != 2 && ordinal != 4) {
            return new C61078JwG((List) null, (DefaultConstructorMarker) null, 1, 9);
        }
        User A11 = C51966G9m.A11(r7);
        if (A11 != null) {
            extendedImageUrl = new ExtendedImageUrl(A11.Bh3());
        } else {
            extendedImageUrl = null;
        }
        User A112 = C51966G9m.A11(r7);
        if (A112 != null) {
            str = A112.getUsername();
        }
        return new C61078JwG(AnonymousClass7TE.A1I(C71152OeO.A08(extendedImageUrl, r7.A1n(C51966G9m.A0P(i6a.A00)), str, (String) null, n1z.A05("target_url"))), 9);
    }

    public static final C53243Gkr A01(C69421Nl3 nl3, String str, String str2, String str3) {
        C55912HpZ gki;
        String str4;
        String A19 = AnonymousClass7TE.A19(DbV.A18(str, "_"), 0);
        switch (nl3.ordinal()) {
            case 1:
                gki = new C53236Gkk();
                gki.A00("note_igid", A19);
                str4 = "XMSGIgReceiverFetchXmaNoteFetchParams";
                break;
            case 3:
                gki = new C53237Gkl();
                gki.A00("igid", A19);
                str4 = "XMSGIgReceiverFetchXmaProfileFetchParams";
                break;
            case 4:
                gki = new C53230Gke();
                gki.A00("media_igid", A19);
                str4 = "XMSGIgReceiverFetchXmaClipFetchParams";
                break;
            case 5:
                gki = new C53232Gkg();
                gki.A00("media_igid", A19);
                gki.A00("carousel_share_child_media_igid", str3);
                str4 = "XMSGIgReceiverFetchXmaFeedFetchParams";
                break;
            case 6:
                gki = new C53233Gkh();
                gki.A00("live_igid", A19);
                str4 = "XMSGIgReceiverFetchXmaLiveFetchParams";
                break;
            case 7:
                gki = new C53231Gkf();
                gki.A00("comment_fbid", A19);
                str4 = "XMSGIgReceiverFetchXmaCommentFetchParams";
                break;
            case 8:
                gki = new C53234Gki();
                gki.A00("location_igid", str);
                str4 = "XMSGIgReceiverFetchXmaLocationShareFetchParams";
                break;
            case 9:
                gki = new C53238Gkm();
                gki.A00("audio_igid", A19);
                str4 = "XMSGIgReceiverFetchXmaReelsAudioFetchParams";
                break;
            case 10:
                gki = new C53235Gkj();
                gki.A00("media_note_igid", A19);
                str4 = "XMSGIgReceiverFetchXmaMediaNoteFetchParams";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                gki = new C53239Gkn();
                gki.A00("media_igid", A19);
                str4 = "XMSGIgReceiverFetchXmaSocialContextFetchParams";
                break;
            default:
                gki = new C53240Gko();
                gki.A00("story_igid", A19);
                gki.A00("reel_id", str2);
                str4 = "XMSGIgReceiverFetchXmaStoryFetchParams";
                break;
        }
        return new C53243Gkr(gki, str4);
    }

    public static void A03(C69421Nl3 nl3, I6A i6a, Class cls, 0sL r7, 0sK r8) {
        List A1M;
        OEB oeb = new OEB(cls, r7, r8);
        Map map = i6a.A01;
        if (!map.containsKey(nl3) || (A1M = (List) map.get(nl3)) == null) {
            A1M = 0sr.A1M(new OEB[]{oeb});
        } else if (!A1M.contains(oeb)) {
            A1M.add(oeb);
        } else {
            return;
        }
        map.put(nl3, A1M);
    }

    public I6A(UserSession userSession) {
        this.A00 = userSession;
        A03(C69421Nl3.PROFILE, this, User.class, JGK.A01(this, 16), C59415JIq.A00);
        C69421Nl3 nl3 = C69421Nl3.STORY;
        Class<1Xj> cls = 1Xj.class;
        A03(nl3, this, cls, JGK.A01(this, 21), JJR.A00(this, 33));
        A03(C69421Nl3.STORY_HIGHLIGHT, this, cls, JGK.A01(this, 20), JJR.A00(this, 32));
        A03(nl3, this, C381429bk.class, JGK.A01(this, 19), JJR.A00(this, 31));
        C69421Nl3 nl32 = C69421Nl3.NOTE;
        Class<C39798A9t> cls2 = C39798A9t.class;
        A03(nl32, this, cls2, JGK.A01(this, 11), JJR.A00(this, 25));
        A03(nl32, this, C45416Cvw.class, JGK.A01(this, 12), JJR.A00(this, 26));
        A03(nl32, this, C45421Cw1.class, JGK.A01(this, 13), JJR.A00(this, 27));
        A03(nl32, this, C55775HnA.class, JGK.A01(this, 14), JJR.A00(this, 28));
        A03(nl32, this, N2G.class, JGK.A01(this, 15), JJR.A00(this, 24));
        A03(C69421Nl3.MEDIA_NOTE, this, cls2, JGK.A01(this, 6), JJR.A00(this, 19));
        A03(C69421Nl3.CLIP, this, cls, JGK.A01(this, 4), JJR.A00(this, 17));
        C69421Nl3 nl33 = C69421Nl3.FEED;
        A03(nl33, this, AnonymousClass1dS.class, JGK.A01(this, 7), JJR.A00(this, 20));
        A03(C69421Nl3.LIVE, this, OBM.class, JGK.A01(this, 9), JJR.A00(this, 22));
        A03(nl33, this, 1dq.class, JGK.A01(this, 8), JJR.A00(this, 21));
        A03(C69421Nl3.COMMENT, this, OG7.class, JGK.A01(this, 5), JJR.A00(this, 18));
        A03(C69421Nl3.REELS_AUDIO, this, AnonymousClass1eE.class, JGK.A01(this, 17), JJR.A00(this, 29));
        A03(C69421Nl3.SOCIAL_CONTEXT, this, C53260Gl8.class, JGK.A01(this, 18), JJR.A00(this, 30));
        A03(C69421Nl3.LOCATION_SHARE, this, C65571eI.class, JGK.A01(this, 10), JJR.A00(this, 23));
    }

    public static final String A02(C69421Nl3 nl3, Object obj) {
        2FW r1;
        switch (nl3.ordinal()) {
            case 2:
            case 11:
                r1 = 2FW.A20;
                break;
            case 3:
                r1 = 2FW.A1w;
                break;
            case 4:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                r1 = 2FW.A1p;
                break;
            case 5:
                r1 = 2FW.A1v;
                break;
            case 6:
                r1 = 2FW.A1t;
                break;
            case 9:
                r1 = 2FW.A1S;
                break;
            default:
                r1 = 2FW.A1M;
                break;
        }
        return OP3.A00().A01(r1, obj);
    }
}
