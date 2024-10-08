package X;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.MusicSearchPlaylist;
import com.instagram.music.profile.musiconprofile.repository.MusicOnProfileRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.EglBase14Impl;

public final class MMS extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMS(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static MMS A00(Object obj, int i) {
        return new MMS(obj, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        ArrayList<JZC> arrayList;
        AnonymousClass07g r3;
        switch (this.A00) {
            case 0:
                return 1Au.A00(((LFB) this.A01).A01);
            case 1:
                return new C46841DmH((E2Y) this.A01);
            case 2:
                E2Y e2y = (E2Y) this.A01;
                UserSession A0l = AnonymousClass7TE.A0l(e2y.A04);
                UserMonetizationProductType userMonetizationProductType = e2y.A00;
                if (userMonetizationProductType == null) {
                    str = "productType";
                    break;
                } else {
                    return new C61568KCv(userMonetizationProductType, A0l);
                }
            case 3:
            case 10:
            case Seq.NULL_REFNUM:
            case 49:
                return this.A01;
            case 4:
            case 11:
            case Seq.RefTracker.REF_OFFSET:
                return DbT.A0r(this.A01);
            case 5:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 43:
                return DbY.A0I(this.A01);
            case 6:
                return new C242833We((UserSession) this.A01);
            case 7:
                return new C61542KBv(AnonymousClass7TE.A0l(((K3N) this.A01).A07));
            case 8:
                return new KBR(AnonymousClass7TE.A0l(((K3N) this.A01).A07));
            case 13:
                MusicSearchPlaylist musicSearchPlaylist = (MusicSearchPlaylist) this.A01;
                List<C66564MWs> Bf2 = musicSearchPlaylist.A00().Bf2();
                if (Bf2 != null) {
                    arrayList = AnonymousClass7TG.A0r(Bf2);
                    for (C66564MWs jzc : Bf2) {
                        arrayList.add(new JZC(jzc));
                    }
                } else {
                    arrayList = AnonymousClass7TE.A1C();
                }
                for (JZC A002 : arrayList) {
                    C66569MWx A003 = A002.A00();
                    if (A003 != null) {
                        A003.EOL(musicSearchPlaylist.A00().Aab());
                    }
                }
                return arrayList;
            case 14:
                return JTP.A0k(((GIH) this.A01).A09.getResources(), R.dimen.achievements_only_you_bottom_margin);
            case 15:
                Drawable drawable = ((GIH) this.A01).A09.getDrawable(R.drawable.default_album_art_icon);
                0qQ.A0C(drawable, C66579MXk.A00(145));
                return ((BitmapDrawable) drawable).getBitmap();
            case 16:
                return Integer.valueOf(C51972G9s.A08(((GIH) this.A01).A09));
            case 17:
                return new WT4((UserSession) this.A01);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return LJQ.A00(AnonymousClass7TE.A0S(((C63785L6r) this.A01).A00), R.drawable.top_trending);
            case 19:
                return LJQ.A00(AnonymousClass7TE.A0S(((C63785L6r) this.A01).A00), R.drawable.clips_trending_arrow);
            case 20:
                AJ9 aj9 = (AJ9) this.A01;
                Fragment fragment = (Fragment) aj9.A0P.get();
                if (fragment == null) {
                    return null;
                }
                return JTO.A0L(new C61542KBv(aj9.A0I), fragment.requireActivity()).A00(C60153JgY.class);
            case 21:
                AJ9 aj92 = (AJ9) this.A01;
                View A0G = AnonymousClass7TF.A0G(aj92.A0G, R.id.avatar_sticker_preview_view);
                AOX.A00(A0G, 30, aj92);
                return A0G;
            case 22:
                AJ9 aj93 = (AJ9) this.A01;
                WeakReference weakReference = aj93.A0P;
                Object obj = weakReference.get();
                Context context = null;
                if (!(obj instanceof AnonymousClass07g) || (r3 = (AnonymousClass07g) obj) == null) {
                    return null;
                }
                UserSession userSession = aj93.A0I;
                Integer num = AnonymousClass05K.A00;
                Fragment fragment2 = (Fragment) weakReference.get();
                if (fragment2 != null) {
                    context = fragment2.requireActivity().getApplicationContext();
                }
                0qQ.A0C(context, AnonymousClass000.A00(29));
                return JTO.A0L(new KDY((Application) context, userSession, num), r3).A00(C60286Jii.class);
            case 23:
                AJ9 aj94 = (AJ9) this.A01;
                Fragment fragment3 = (Fragment) aj94.A0P.get();
                if (fragment3 != null) {
                    return JTO.A0L(new KBR(aj94.A0I), fragment3).A00(C314326i1.class);
                }
                return null;
            case 24:
                return new C322286vY(AnonymousClass7TE.A0l(((K73) this.A01).A05));
            case 26:
                return new C322286vY(AnonymousClass7TE.A0l(((K52) this.A01).A0A));
            case 28:
                return new MusicOnProfileRepository((UserSession) this.A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new C63732L4q((UserSession) this.A01);
            case 30:
                K6I k6i = (K6I) this.A01;
                return JTU.A0M(k6i, k6i.A0S);
            case 32:
                K70 k70 = (K70) this.A01;
                UserSession A0l2 = AnonymousClass7TE.A0l(k70.A0R);
                return new C61590KDr(k70.requireActivity(), A0l2, (C3507185x) k70.A0N.getValue(), ((ClipsCreationViewModel) k70.A0O.getValue()).A0S);
            case 33:
                K70 k702 = (K70) this.A01;
                return JTS.A0M(k702, k702.A0R);
            case 34:
                K70 k703 = (K70) this.A01;
                return new C3500182v(AnonymousClass7TE.A0l(k703.A0R), k703.requireActivity());
            case 35:
                K70 k704 = (K70) this.A01;
                UserSession A0l3 = AnonymousClass7TE.A0l(k704.A0R);
                MusicProduct musicProduct = k704.A04;
                if (musicProduct == null) {
                    str = "musicProduct";
                    break;
                } else {
                    ImmutableList immutableList = k704.A03;
                    if (immutableList == null) {
                        str = "ineligibleAudioTypes";
                        break;
                    } else {
                        ImmutableList immutableList2 = k704.A02;
                        if (immutableList2 == null) {
                            str = "attachedTracks";
                            break;
                        } else {
                            return new KEZ(k704.A01, immutableList, immutableList2, musicProduct, k704, A0l3, (C60329JjY) k704.A0Q.getValue());
                        }
                    }
                }
            case 36:
                return new C61543KBw(AnonymousClass7TE.A0l(((K70) this.A01).A0R));
            case 44:
                C61423K6w k6w = (C61423K6w) this.A01;
                UserSession A0l4 = AnonymousClass7TE.A0l(k6w.A0R);
                return new C61590KDr(k6w.requireActivity(), A0l4, (C3507185x) k6w.A0O.getValue(), JTP.A0Y(k6w).A0S);
            case 45:
                C61423K6w k6w2 = (C61423K6w) this.A01;
                return JTS.A0M(k6w2, k6w2.A0R);
            case 46:
                C61423K6w k6w3 = (C61423K6w) this.A01;
                return new C3500182v(AnonymousClass7TE.A0l(k6w3.A0R), k6w3.requireActivity());
            case 47:
                C61423K6w k6w4 = (C61423K6w) this.A01;
                return C3500382y.A00(DbY.A05(k6w4), AnonymousClass7TE.A0l(k6w4.A0R)).A00(JTP.A0Y(k6w4).A0S).A00;
            default:
                return C51971G9r.A0U(this.A01);
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
