package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.ui.feedcolorfilterpicker.FilterPicker;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.filterkit.filter.VideoFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.K6b  reason: case insensitive filesystem */
public final class C61405K6b extends AnonymousClass4DH implements C66501MUf, MXP {
    public static final String __redex_internal_original_name = "IGTVUploadCanvasFilterFragment";
    public ViewGroup A00;
    public ViewSwitcher A01;
    public C64168LRo A02;
    public C66534MVo A03;
    public FilterPicker A04;
    public HashMap A05 = AnonymousClass7TE.A1E();
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08 = C66306MMp.A00(this, C66306MMp.A02(this, 15), new C58185Inp(48, (Object) null, this), DbS.A0z(IGTVUploadViewModel.class), 16);

    public final boolean CnC() {
        return false;
    }

    public final void Drb(L02 l02) {
    }

    public final void Drc(C60060Jeb jeb) {
        int i;
        0qQ.A0B(jeb, 0);
        C60070Jez jez = jeb.A05;
        int A002 = C66568MWw.A00(jez);
        AnonymousClass0eM r2 = this.A08;
        if (A002 == JTR.A0o(r2).A01.B5s()) {
            C66534MVo A012 = C66568MWw.A01(jez);
            0qQ.A0C(A012, "null cannot be cast to non-null type com.instagram.creation.video.ui.VideoFilterStrengthController");
            C64933LkY lkY = (C64933LkY) A012;
            lkY.A03 = this.A05;
            if (JTO.A0k(r2).A0M.A0C != null) {
                i = JTR.A0o(r2).A01.B5v();
            } else {
                Number number = (Number) JTT.A0V(this.A06).A02.A02();
                if (number != null) {
                    i = number.intValue();
                } else {
                    i = 100;
                }
            }
            lkY.A03.put(Integer.valueOf(C66568MWw.A00(jez)), Integer.valueOf(i));
            lkY.A01(jeb, this, (VideoFilter) JTT.A0V(this.A06).A00.A02(), (FilterGroupModel) null);
        }
    }

    public final void Drd(C60060Jeb jeb, boolean z) {
        String str;
        0qQ.A0B(jeb, 0);
        C60070Jez jez = jeb.A05;
        if (C66568MWw.A00(jez) != -1) {
            AnonymousClass0eM r3 = this.A06;
            JTP.A19(JTT.A0V(r3).A01, C66568MWw.A00(jez));
            AnonymousClass0eM r1 = this.A08;
            KTX A0o = JTR.A0o(r1);
            A0o.A01.EWn(C66568MWw.A00(jez));
            C66534MVo A012 = C66568MWw.A01(jez);
            0qQ.A0C(A012, "null cannot be cast to non-null type com.instagram.creation.video.ui.VideoFilterStrengthController");
            C64933LkY lkY = (C64933LkY) A012;
            lkY.A03 = this.A05;
            AnonymousClass3Q2 r7 = JTR.A0o(r1).A02;
            int B5s = JTR.A0o(r1).A01.B5s();
            int B5v = JTR.A0o(r1).A01.B5v();
            FilterGroupModel filterGroupModel = r7.A1D;
            if (filterGroupModel != null) {
                C63122Krq.A00(((FilterGroupModelImpl) filterGroupModel).A02, B5s, B5v);
                if (lkY.A01(jeb, this, (VideoFilter) JTT.A0V(r3).A00.A02(), (FilterGroupModel) null)) {
                    if (z) {
                        this.A03 = lkY;
                        ViewSwitcher viewSwitcher = this.A01;
                        if (viewSwitcher == null) {
                            str = "adjustOverlaySwitcher";
                        } else {
                            viewSwitcher.setDisplayedChild(1);
                            View AZq = lkY.AZq(requireContext());
                            ViewGroup viewGroup = this.A00;
                            if (viewGroup == null) {
                                str = "adjustmentContainer";
                            } else {
                                viewGroup.addView(AZq);
                                AnonymousClass7TF.A1O(JTT.A0V(r3).A08, false);
                                return;
                            }
                        }
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                } else if (z) {
                    C63912LBx A002 = C63124Krs.A00(AnonymousClass7TE.A0l(this.A07));
                    C66568MWw mWw = jez.A01;
                    0qQ.A07(mWw);
                    A002.A00(mWw.getName(), false);
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public final String getModuleName() {
        return "igtv_upload_canvas_filter_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FilterPicker filterPicker = (FilterPicker) view.requireViewById(R.id.filter_picker);
        AnonymousClass0eM r3 = this.A07;
        filterPicker.A01 = C63124Krs.A00(AnonymousClass7TE.A0l(r3));
        C64168LRo lRo = this.A02;
        if (lRo != null) {
            filterPicker.A04 = lRo;
            filterPicker.A07 = true;
            filterPicker.A05 = this;
            filterPicker.setEffects(A00(), false, AnonymousClass7TE.A0l(r3));
            this.A04 = filterPicker;
            ArrayList A1C = AnonymousClass7TE.A1C();
            List<C60060Jeb> list = filterPicker.A06;
            0qQ.A07(list);
            for (C60060Jeb jeb : list) {
                C60070Jez jez = jeb.A05;
                if (C66568MWw.A00(jez) != -1) {
                    C66568MWw.A03(jeb, jez, A1C);
                }
            }
            C64168LRo lRo2 = this.A02;
            if (lRo2 != null) {
                lRo2.A07(requireContext(), A1C);
                AnonymousClass0eM r32 = this.A08;
                if (JTO.A0k(r32).A0M.A0C != null) {
                    int A002 = C63126Kru.A00(A00(), JTR.A0o(r32).A01.B5s());
                    str = "filterPicker";
                    if (A002 == -1) {
                        FilterPicker filterPicker2 = this.A04;
                        if (filterPicker2 != null) {
                            if (0 < filterPicker2.A06.size()) {
                                C60060Jeb jeb2 = (C60060Jeb) filterPicker2.A06.get(0);
                                C66568MWw.A00(jeb2.A05);
                                filterPicker2.A03.getClass();
                                filterPicker2.smoothScrollBy(filterPicker2.A01(jeb2), 0);
                                C66501MUf mUf = filterPicker2.A05;
                                if (mUf != null) {
                                    mUf.Drd(jeb2, false);
                                }
                            }
                            FilterPicker filterPicker3 = this.A04;
                            if (filterPicker3 != null) {
                                filterPicker3.A01 = 0;
                            }
                        }
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    FilterPicker filterPicker4 = this.A04;
                    if (filterPicker4 != null) {
                        filterPicker4.A01 = A002;
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                this.A01 = (ViewSwitcher) view.requireViewById(R.id.creation_main_actions);
                this.A00 = DbU.A0C(view, R.id.adjust_container);
                LY6.A01(view.requireViewById(R.id.button_accept_adjust), 7, this);
                LY6.A01(view.requireViewById(R.id.button_cancel_adjust), 8, this);
                C63776L6i l6i = (C63776L6i) JTO.A0k(r32).A0E.getValue();
                1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this, l6i.A00), "ig_camera_start_post_capture_session"), 203);
                if (DbT.A1Y(A0U)) {
                    A0U.A0a(C279294yP.FEED);
                    A0U.A0S("camera_tools_struct", 0sn.A00);
                    A0U.A0V(3);
                    JTO.A1U(A0U, l6i.A01);
                    A0U.A0Q("capture_format_index", C51971G9r.A0m());
                    A0U.A0M(C360948fP.FEED, "capture_type");
                    A0U.A0M(28D.A2n, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A0U.A0W(1);
                    28t r2 = 28t.A06;
                    A0U.A0c(r2);
                    A0U.A0n("igtv_upload_canvas_filter_fragment");
                    A0U.A0M(C59725JVj.POST_CAPTURE, "surface");
                    A0U.A0R("composition_str_id", "");
                    A0U.A0M(r2, "composition_media_type");
                    A0U.A0O("is_panavision", false);
                    A0U.A0O("is_feed_fork", false);
                    A0U.Cgf();
                    return;
                }
                return;
            }
        }
        str = "blurIconCache";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final List A00() {
        AnonymousClass0eM r1 = this.A07;
        C64933LkY lkY = new C64933LkY(AnonymousClass7TE.A0l(r1));
        LinkedList<C63805L7l> A002 = C63125Krt.A00(AnonymousClass7TE.A0l(r1));
        ArrayList A0r = AnonymousClass7TG.A0r(A002);
        for (C63805L7l l7l : A002) {
            0qQ.A0A(l7l);
            A0r.add(new C61713KJe(l7l, lkY));
        }
        return A0r;
    }

    public static final void A01(C61405K6b k6b, boolean z) {
        String str;
        AnonymousClass0eM r2 = k6b.A06;
        AnonymousClass7TF.A1O(JTT.A0V(r2).A08, true);
        C66534MVo mVo = k6b.A03;
        if (mVo != null) {
            mVo.CuZ(z);
            C66534MVo mVo2 = k6b.A03;
            0qQ.A0C(mVo2, "null cannot be cast to non-null type com.instagram.creation.video.ui.VideoFilterStrengthController");
            int A002 = ((C64933LkY) mVo2).A00((VideoFilter) JTT.A0V(r2).A00.A02());
            AnonymousClass0eM r1 = k6b.A08;
            JTR.A0o(r1).A02.A1i.A00 = A002;
            JTR.A0o(r1).A01.EWp(A002);
            C66534MVo mVo3 = k6b.A03;
            0qQ.A0C(mVo3, "null cannot be cast to non-null type com.instagram.creation.video.ui.VideoFilterStrengthController");
            k6b.A05 = new HashMap(((C64933LkY) mVo3).A03);
            k6b.A03 = null;
            ViewSwitcher viewSwitcher = k6b.A01;
            if (viewSwitcher == null) {
                str = "adjustOverlaySwitcher";
            } else {
                viewSwitcher.setDisplayedChild(0);
                ViewGroup viewGroup = k6b.A00;
                if (viewGroup == null) {
                    str = "adjustmentContainer";
                } else {
                    viewGroup.removeAllViews();
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final VideoFilter B5q() {
        return (VideoFilter) JTT.A0V(this.A06).A00.A02();
    }

    public final void EEp() {
        JTP.A1B(JTT.A0V(this.A06).A03, true);
    }

    public final void EWp(int i) {
        JTP.A19(JTT.A0V(this.A06).A02, i);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public C61405K6b() {
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, C66306MMp.A02(C66306MMp.A02(this, 14), 17));
        0Yh A0z = DbS.A0z(C60206JhP.class);
        this.A06 = DbS.A0I(C66306MMp.A02(A002, 18), new C73666Phf(0, A002, this), new C58185Inp(49, (Object) null, A002), A0z);
        this.A07 = C227642jf.A02(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1324586213);
        C61405K6b.super.onCreate(bundle);
        Context requireContext = requireContext();
        AnonymousClass0eM r8 = this.A07;
        UserSession A0l = AnonymousClass7TE.A0l(r8);
        AnonymousClass0eM r3 = this.A08;
        C3499582p A002 = JWD.A00(JTO.A0k(r3).A00, A0l, new CreationSession(), new AnonymousClass82Y((C3499182k) null, (UserSession) null, (C357638Yz) null, (C3498682d) null, (C3498482b) null, (C3498382a) null, (C3499282m) null, (C3498882g) null, (C3498782e) null, (C3499382n) null, (ClipsCelebrationReshareViewModel) null, (AnonymousClass82f) null, (C2801950r) null, (SuperlativeStickerClientModel) null, (C3498982i) null, (C3498582c) null, (MusicAttributionConfig) null, (PendingRecipient) null, (C3499082j) null, (String) null, false, false, false, true, false, false, false, false));
        File A0s = JTO.A0s(requireContext.getCacheDir(), "icon_zero_frame.jpg");
        int A012 = C63994LHs.A01(requireContext, true);
        C64188LSv.A02(JTR.A0o(r3).A02, A0s, A012, A012, 50);
        C64168LRo A003 = C59953JcJ.A00(AnonymousClass7TE.A0l(r8));
        A003.A08(A002);
        A003.A05(requireContext, A0s.getCanonicalPath());
        A003.A02(requireContext, new CropInfo(new Rect(0, 0, A012, A012), A012, A012), 0, false);
        LinkedList<C63805L7l> A004 = C63125Krt.A00(AnonymousClass7TE.A0l(r8));
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C63805L7l l7l : A004) {
            AnonymousClass7TF.A1M(A1C, l7l.A00);
        }
        synchronized (A003) {
            A003.A04(requireContext, (C66436MRq) null, A1C);
        }
        this.A02 = A003;
        AnonymousClass0fD.A09(443401460, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1292051662);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.igtv_upload_canvas_filter_fragment, false);
        AnonymousClass0fD.A09(-1510965647, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(532807500);
        C59953JcJ.A01(AnonymousClass7TE.A0l(this.A07), requireContext());
        super.onDestroy();
        AnonymousClass0fD.A09(357701784, A022);
    }
}
