package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.Scene;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public final class H1C extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DS, C74302Psc {
    public static final String __redex_internal_original_name = "PromptPivotPageFragment";
    public ViewGroup A00;
    public FrameLayout A01;
    public AnonymousClass2u9 A02;
    public 1Xj A03;
    public C231002qi A04;
    public C231982sj A05;
    public PromptStickerModel A06;
    public C249763kK A07;
    public String A08;
    public AnonymousClass8ZN A09;
    public 1wn A0A;
    public Trigger A0B;
    public final String A0C = AnonymousClass7TG.A0j();
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131970858);
        r3.Eu5(C56802ICz.A00(this, 13), true);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A02(AnonymousClass05K.A00);
        DbX.A19(C56802ICz.A00(this, 14), A0K, r3);
    }

    public final String getModuleName() {
        return "clips_prompt_pivot_page";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C263944Ny r0;
        long j;
        String str2;
        String A30;
        Long A10;
        User A2A;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        view.requireViewById(R.id.swipe_refresh).setEnabled(false);
        AnonymousClass0eM r4 = this.A0D;
        String str3 = null;
        ((C53007Ggy) r4.getValue()).A04.A00.A04((Long) null, (String) null, 0sn.A00, false);
        ViewGroup A0C2 = DbU.A0C(view, R.id.use_in_camera_button_scene_root);
        this.A00 = A0C2;
        String str4 = "useInCameraButtonGroup";
        String str5 = null;
        if (A0C2 != null) {
            TextView A0G = DbU.A0G(A0C2, R.id.use_in_camera_label);
            Context context = A0G.getContext();
            if (context != null) {
                str3 = context.getString(2131970853);
            }
            A0G.setText(str3);
            2eS.A01(A0G);
            ViewGroup viewGroup = this.A00;
            if (viewGroup != null) {
                Scene scene = new Scene(viewGroup, (ViewGroup) view.findViewById(R.id.use_in_camera_button));
                ViewGroup viewGroup2 = this.A00;
                if (viewGroup2 != null) {
                    ((AppBarLayout) view.requireViewById(R.id.app_bar_layout)).A02(new C54492HFy(scene, Scene.getSceneForLayout(viewGroup2, R.layout.layout_use_in_camera_button_scrolling, getActivity())));
                    ViewGroup viewGroup3 = this.A00;
                    if (viewGroup3 != null) {
                        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(viewGroup3);
                        A0m.A04 = new C54310H7f(this, 3);
                        A0m.A07 = true;
                        A0m.A00();
                        DbZ.A1C(this, new C73567Pfo(this, (AnonymousClass4D7) null, 48), ((C53007Ggy) r4.getValue()).A07);
                        UserSession A0l = AnonymousClass7TE.A0l(this.A0E);
                        PromptStickerModel promptStickerModel = this.A06;
                        if (promptStickerModel == null) {
                            str4 = "promptStickerModel";
                        } else {
                            String str6 = promptStickerModel.A03;
                            1Xj r7 = this.A03;
                            AnonymousClass8ZN r5 = this.A09;
                            AnonymousClass7TF.A1B(A0l, 0, str6);
                            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this, A0l), "instagram_organic_sticker_page_impression");
                            if (A0e.isSampled()) {
                                if (r7 == null || (A2A = r7.A2A(A0l)) == null) {
                                    str = null;
                                } else {
                                    str = A2A.getId();
                                }
                                C51965G9l.A1M(A0e, "clips_prompt_pivot_page");
                                if (str != null) {
                                    r0 = C263944Ny.A00(str);
                                } else {
                                    r0 = new C263944Ny(0L);
                                }
                                A0e.AAE(r0, "media_author_id");
                                if (r7 == null || (A30 = r7.A30()) == null || (A10 = AnonymousClass7TE.A10(A30)) == null) {
                                    j = 0;
                                } else {
                                    j = A10.longValue();
                                }
                                C51970G9q.A18(A0e, j);
                                C51965G9l.A1C(C54689HOu.A0w, A0e);
                                C51965G9l.A1F(A0e, AnonymousClass7TE.A10(str6));
                                C51970G9q.A19(A0e, 0);
                                G9t.A1G(A0e);
                                if (r7 != null) {
                                    str2 = r7.A0C.getMezqlToken();
                                } else {
                                    str2 = null;
                                }
                                A0e.AAJ("mezql_token", str2);
                                if (r7 != null) {
                                    str5 = DbT.A0x(r7);
                                }
                                C51973G9u.A14(A0e, "ranking_info_token", str5);
                                A0e.A8M(r5, "pivot_page_entry_point");
                                A0e.Cgf();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str4);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dwi() {
        String str;
        C53381GnB gnB = (C53381GnB) ((C53007Ggy) this.A0D.getValue()).A0B.getValue();
        if (gnB != null && (str = gnB.A08) != null) {
            AnonymousClass0eM r0 = this.A0E;
            0lg A0X = DbT.A0X(r0);
            C51974G9v.A0f(requireActivity(), C46447Df9.A02().A01(AnonymousClass7TE.A0l(r0), C46548Dgp.A02(AnonymousClass7TE.A0l(r0), str, "clips_prompt_pivot_page", "clips_prompt_pivot_page").A04()), this, A0X);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0E);
    }

    public H1C() {
        C66299MMi mMi = new C66299MMi(this, 49);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73660PhZ(new C73660PhZ(this, 0), 1));
        this.A0D = DbS.A0I(new C73660PhZ(A002, 2), mMi, new C73666Phf(27, (Object) null, A002), DbS.A0z(C53007Ggy.class));
        this.A0E = C227642jf.A02(this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9587 && i2 == 9683) {
            FG7.A01(requireContext(), AnonymousClass7TE.A0l(this.A0E));
        }
    }

    public final void onCreate(Bundle bundle) {
        IllegalArgumentException illegalArgumentException;
        int i;
        Parcelable.Creator creator;
        AnonymousClass8ZN r1;
        User user;
        Trigger trigger;
        int A022 = AnonymousClass0fD.A02(-1965379074);
        H1C.super.onCreate(bundle);
        this.A07 = 1L2.A00();
        Bundle requireArguments = requireArguments();
        this.A08 = requireArguments.getString("media_id");
        Class<StoryPromptTappableData> cls = StoryPromptTappableData.class;
        Trigger trigger2 = null;
        Object obj = cls.getDeclaredField("CREATOR").get((Object) null);
        if (!(obj instanceof Parcelable.Creator) || (creator = (Parcelable.Creator) obj) == null) {
            String A002 = C66579MXk.A00(90);
            Map map = 0Yh.A03;
            illegalArgumentException = AnonymousClass7TF.A0W(A002, 0q1.A01(cls));
            i = 1040605009;
        } else {
            Parcelable parcelable = (Parcelable) 0B0.A01(creator, requireArguments.getParcelable(C273654mx.A00(178)), cls);
            if (parcelable != null) {
                this.A06 = new PromptStickerModel((StoryPromptTappableDataIntf) parcelable);
                AnonymousClass0eM r2 = this.A0E;
                this.A03 = DbX.A0d(r2).A02(this.A08);
                Serializable serializable = requireArguments.getSerializable(AnonymousClass000.A00(1727));
                if (serializable instanceof AnonymousClass8ZN) {
                    r1 = (AnonymousClass8ZN) serializable;
                } else {
                    r1 = null;
                }
                this.A09 = r1;
                IO4 io4 = new IO4((Object) this, 6);
                DbX.A0R(r2).A01(io4, 1qJ.class);
                this.A0A = io4;
                PromptStickerModel promptStickerModel = this.A06;
                if (promptStickerModel == null) {
                    0qQ.A0F("promptStickerModel");
                    throw AnonymousClass00P.createAndThrow();
                }
                if (promptStickerModel.A07 && (user = promptStickerModel.A02) != null) {
                    String id = user.getId();
                    if (id.equals(AnonymousClass7TF.A0Q(AnonymousClass7TE.A0l(r2)).getId())) {
                        trigger = Trigger.A0s;
                    } else {
                        if (!id.equals(AnonymousClass7TF.A0Q(AnonymousClass7TE.A0l(r2)).getId())) {
                            trigger = Trigger.A0r;
                        }
                        this.A0B = trigger2;
                    }
                    1YN A003 = AnonymousClass2bO.A00();
                    UserSession A0l = AnonymousClass7TE.A0l(r2);
                    QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0n;
                    AnonymousClass2bO.A00();
                    C231002qi A012 = A003.A01(this, this, A0l, 2bV.A04(new C50735Fha(this, 3), new C50736Fhb(this, 4)), quickPromotionSlot);
                    1YN A004 = AnonymousClass2bO.A00();
                    requireContext();
                    C231982sj A032 = A004.A03(this, AnonymousClass7TE.A0l(r2), A012);
                    this.A02 = new AnonymousClass2u9((C232642u8) null, ImmutableList.of(A032));
                    this.A05 = A032;
                    this.A04 = A012;
                    trigger2 = trigger;
                    this.A0B = trigger2;
                }
                AnonymousClass0fD.A09(1279477410, A022);
                return;
            }
            illegalArgumentException = DbU.A0h();
            i = 1416938967;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalArgumentException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1267053900);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_pivot_default_parent_fragment, viewGroup, false);
        this.A01 = (FrameLayout) inflate.requireViewById(R.id.megaphone_container);
        UserSession A0l = AnonymousClass7TE.A0l(this.A0E);
        0hq childFragmentManager = getChildFragmentManager();
        C53007Ggy ggy = (C53007Ggy) this.A0D.getValue();
        PromptStickerModel promptStickerModel = this.A06;
        if (promptStickerModel == null) {
            0qQ.A0F("promptStickerModel");
            throw AnonymousClass00P.createAndThrow();
        }
        String A052 = promptStickerModel.A05();
        String str = this.A0C;
        0qQ.A0B(A0l, 0);
        AnonymousClass7TG.A1P(childFragmentManager, ggy);
        0qQ.A0B(str, 5);
        H17 h17 = new H17();
        Bundle A0a = AnonymousClass7TE.A0a();
        C227642jf.A04(A0a, A0l);
        h17.setArguments(A0a);
        H1K A002 = C55245Hea.A00(ClipsViewerSource.CLIPS_PROMPT, A052, str, (String) null, false);
        0s1 r1 = new 0s1(childFragmentManager);
        r1.A09(h17, R.id.header_container);
        r1.A09(A002, R.id.grid_container);
        r1.A0H(new C57959IjE(this, ggy, A002, h17));
        r1.A0K();
        AnonymousClass0fD.A09(442458403, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(807646316);
        super.onDestroy();
        1wn r2 = this.A0A;
        if (r2 != null) {
            DbX.A0R(this.A0E).A02(r2, 1qJ.class);
        }
        AnonymousClass0fD.A09(-628758721, A022);
    }

    public final void onResume() {
        C231002qi r1;
        int A022 = AnonymousClass0fD.A02(792390727);
        super.onResume();
        Trigger trigger = this.A0B;
        if (!(trigger == null || (r1 = this.A04) == null)) {
            Set singleton = Collections.singleton(trigger);
            0qQ.A07(singleton);
            r1.AVg(singleton);
        }
        AnonymousClass0fD.A09(490671811, A022);
    }
}
