package X;

import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import com.instagram.api.schemas.CreatorDigestSignalInfo;
import com.instagram.api.schemas.FileCandidate;
import com.instagram.api.schemas.GoalsToastInfo;
import com.instagram.api.schemas.IGCommentSheetMoreInfo;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.DIc  reason: case insensitive filesystem */
public final class C45998DIc extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45998DIc(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
            case 48:
                List list = (List) this.A01;
                if (list == null) {
                    return null;
                }
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C41846B3n.A1U(A0r, it);
                }
                return A0r;
            case 1:
                AnonymousClass1eQ r0 = (AnonymousClass1eQ) this.A01;
                if (r0 != null) {
                    return r0.FHC();
                }
                return null;
            case 2:
                IGCommentSheetMoreInfo iGCommentSheetMoreInfo = (IGCommentSheetMoreInfo) this.A01;
                if (iGCommentSheetMoreInfo != null) {
                    return iGCommentSheetMoreInfo.FHC();
                }
                return null;
            case 3:
                List<C65211bM> list2 = (List) this.A01;
                if (list2 == null) {
                    return null;
                }
                ArrayList A0r2 = AnonymousClass7TG.A0r(list2);
                for (C65211bM FHC : list2) {
                    A0r2.add(FHC.FHC());
                }
                return A0r2;
            case 4:
                C278644xI r02 = (C278644xI) this.A01;
                if (r02 != null) {
                    return r02.FHC();
                }
                return null;
            case 5:
                DSX dsx = (DSX) this.A01;
                if (dsx != null) {
                    return dsx.FHC();
                }
                return null;
            case 6:
                C46306DUj dUj = (C46306DUj) this.A01;
                if (dUj != null) {
                    return dUj.FHC();
                }
                return null;
            case 7:
                DUK duk = (DUK) this.A01;
                if (duk != null) {
                    return duk.FHC();
                }
                return null;
            case 8:
                AnonymousClass5OM r03 = (AnonymousClass5OM) this.A01;
                if (r03 != null) {
                    return r03.FHC();
                }
                return null;
            case 9:
                CreativeConfigIntf creativeConfigIntf = (CreativeConfigIntf) this.A01;
                if (creativeConfigIntf != null) {
                    return creativeConfigIntf.FHC();
                }
                return null;
            case 10:
                C257643xj r04 = (C257643xj) this.A01;
                if (r04 != null) {
                    return r04.FHC();
                }
                return null;
            case 11:
                CreatorDigestSignalInfo creatorDigestSignalInfo = (CreatorDigestSignalInfo) this.A01;
                if (creatorDigestSignalInfo != null) {
                    return creatorDigestSignalInfo.FHC();
                }
                return null;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                List<C46275DTe> list3 = (List) this.A01;
                if (list3 == null) {
                    return null;
                }
                ArrayList A0r3 = AnonymousClass7TG.A0r(list3);
                for (C46275DTe FHC2 : list3) {
                    A0r3.add(FHC2.FHC());
                }
                return A0r3;
            case 13:
                C46276DTf dTf = (C46276DTf) this.A01;
                if (dTf != null) {
                    return dTf.FHC();
                }
                return null;
            case 14:
                C2608347f r05 = (C2608347f) this.A01;
                if (r05 != null) {
                    return r05.FHC();
                }
                return null;
            case 15:
                List<DSZ> list4 = (List) this.A01;
                if (list4 == null) {
                    return null;
                }
                ArrayList A0r4 = AnonymousClass7TG.A0r(list4);
                for (DSZ FHC3 : list4) {
                    A0r4.add(FHC3.FHC());
                }
                return A0r4;
            case 16:
                List<AnonymousClass5DY> list5 = (List) this.A01;
                if (list5 == null) {
                    return null;
                }
                ArrayList A0r5 = AnonymousClass7TG.A0r(list5);
                for (AnonymousClass5DY FHC4 : list5) {
                    A0r5.add(FHC4.FHC());
                }
                return A0r5;
            case 17:
                C46293DTw dTw = (C46293DTw) this.A01;
                if (dTw != null) {
                    return dTw.FHC();
                }
                return null;
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case Seq.RefTracker.REF_OFFSET:
                User user = (User) this.A01;
                if (user != null) {
                    return user.A08();
                }
                return null;
            case 19:
            case 23:
                List list6 = (List) this.A01;
                if (list6 == null) {
                    return null;
                }
                ArrayList A0r6 = AnonymousClass7TG.A0r(list6);
                Iterator it2 = list6.iterator();
                while (it2.hasNext()) {
                    C41846B3n.A1T(A0r6, it2);
                }
                return A0r6;
            case 20:
                C46245DSa dSa = (C46245DSa) this.A01;
                if (dSa != null) {
                    return dSa.FHC();
                }
                return null;
            case 21:
                C245923dh r06 = (C245923dh) this.A01;
                if (r06 != null) {
                    return r06.FHC();
                }
                return null;
            case 24:
                C65281bi r07 = (C65281bi) this.A01;
                if (r07 != null) {
                    return r07.FHC();
                }
                return null;
            case 25:
                List<C46292DTv> list7 = (List) this.A01;
                if (list7 == null) {
                    return null;
                }
                ArrayList A0r7 = AnonymousClass7TG.A0r(list7);
                for (C46292DTv FHC5 : list7) {
                    A0r7.add(FHC5.FHC());
                }
                return A0r7;
            case 26:
                C46284DTn dTn = (C46284DTn) this.A01;
                if (dTn != null) {
                    return dTn.FHC();
                }
                return null;
            case 27:
                C46246DSb dSb = (C46246DSb) this.A01;
                if (dSb != null) {
                    return dSb.FHC();
                }
                return null;
            case 28:
                AnonymousClass1YY r08 = (AnonymousClass1YY) this.A01;
                if (r08 != null) {
                    return r08.FHC();
                }
                return null;
            case 30:
                C257693xo r09 = (C257693xo) this.A01;
                if (r09 != null) {
                    return r09.FHC();
                }
                return null;
            case 31:
                C51956G8z g8z = (C51956G8z) this.A01;
                if (g8z != null) {
                    return g8z.FHC();
                }
                return null;
            case 32:
                C257873y6 r010 = (C257873y6) this.A01;
                if (r010 != null) {
                    return r010.FHC();
                }
                return null;
            case 34:
                DUW duw = (DUW) this.A01;
                if (duw != null) {
                    return duw.FHC();
                }
                return null;
            case 35:
                List<FileCandidate> list8 = (List) this.A01;
                if (list8 == null) {
                    return null;
                }
                ArrayList A0r8 = AnonymousClass7TG.A0r(list8);
                for (FileCandidate FHC6 : list8) {
                    A0r8.add(FHC6.FHC());
                }
                return A0r8;
            case 36:
                Hashtag hashtag = (Hashtag) this.A01;
                if (hashtag != null) {
                    return hashtag.FHC();
                }
                return null;
            case 37:
                C65231bS r011 = (C65231bS) this.A01;
                if (r011 != null) {
                    return r011.FHC();
                }
                return null;
            case 38:
                C65551dz r012 = (C65551dz) this.A01;
                if (r012 != null) {
                    return r012.FHC();
                }
                return null;
            case 39:
                C270164gI r013 = (C270164gI) this.A01;
                if (r013 != null) {
                    return r013.FHC();
                }
                return null;
            case 40:
                CommentGiphyMediaInfoIntf commentGiphyMediaInfoIntf = (CommentGiphyMediaInfoIntf) this.A01;
                if (commentGiphyMediaInfoIntf != null) {
                    return commentGiphyMediaInfoIntf.FHC();
                }
                return null;
            case Seq.NULL_REFNUM:
                GoalsToastInfo goalsToastInfo = (GoalsToastInfo) this.A01;
                if (goalsToastInfo != null) {
                    return goalsToastInfo.FHC();
                }
                return null;
            case 43:
                List<C22576YBq> list9 = (List) this.A01;
                if (list9 == null) {
                    return null;
                }
                ArrayList A0r9 = AnonymousClass7TG.A0r(list9);
                for (C22576YBq FHC7 : list9) {
                    A0r9.add(FHC7.FHC());
                }
                return A0r9;
            case 44:
                C46312DUp dUp = (C46312DUp) this.A01;
                if (dUp != null) {
                    return dUp.FHC();
                }
                return null;
            case 45:
                C3499182k r014 = (C3499182k) this.A01;
                if (r014 != null) {
                    return r014.FHC();
                }
                return null;
            case 46:
                C65211bM r015 = (C65211bM) this.A01;
                if (r015 != null) {
                    return r015.FHC();
                }
                return null;
            case 47:
                C2801750l r016 = (C2801750l) this.A01;
                if (r016 != null) {
                    return r016.FHC();
                }
                return null;
            case 49:
                C250143ky r017 = (C250143ky) this.A01;
                if (r017 != null) {
                    return r017.FHC();
                }
                return null;
            default:
                AnonymousClass1eD r018 = (AnonymousClass1eD) this.A01;
                if (r018 != null) {
                    return r018.FHC();
                }
                return null;
        }
    }
}
