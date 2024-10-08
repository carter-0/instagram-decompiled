package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import java.util.List;

public final class K6C extends AnonymousClass4DH implements AnonymousClass4DR, C362018hC {
    public static final String __redex_internal_original_name = "StoryDraftsFragment";
    public C362358hl A00;
    public LBO A01;
    public C227182im A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06 = DbS.A0I(new C66297MMg(this, 33), new C66297MMg(this, 38), new MJ8(22, (Object) null, this), DbS.A0z(AnonymousClass8XC.class));

    public final void Dnm(Bitmap bitmap, String str) {
        0qQ.A0B(str, 1);
        JTP.A1A(((C356988Vz) this.A03.getValue()).A04, new C376649Iu(bitmap, str));
    }

    public final String getModuleName() {
        return "stories_drafts";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FragmentActivity requireActivity = requireActivity();
        M01 m01 = new M01(view, 4);
        this.A02 = m01;
        C226112fe.A0B.A04(requireActivity, m01, false);
        LBO lbo = new LBO(view);
        this.A01 = lbo;
        String str = "viewHolder";
        String str2 = str;
        lbo.A02.setVisibility(0);
        LBO lbo2 = this.A01;
        if (lbo2 != null) {
            AnonymousClass8GF CrP = lbo2.A0C.CrP();
            CrP.A00 = new C64982LlL(this, 1);
            CrP.A00();
            LBO lbo3 = this.A01;
            if (lbo3 != null) {
                C3497981v r2 = lbo3.A0E;
                C362358hl r0 = this.A00;
                if (r0 == null) {
                    str = "storyDraftsAdapter";
                } else {
                    boolean z = r0.A02;
                    int i = 2131961043;
                    if (z) {
                        i = 2131961042;
                    }
                    r2.A00(DbU.A0m(this, i));
                    LBO lbo4 = this.A01;
                    if (lbo4 != null) {
                        AnonymousClass8GF CrP2 = lbo4.A0E.CrP();
                        CrP2.A00 = new C64982LlL(this, 2);
                        CrP2.A00();
                        LBO lbo5 = this.A01;
                        if (lbo5 != null) {
                            lbo5.A08.setText(2131974410);
                            LBO lbo6 = this.A01;
                            if (lbo6 != null) {
                                lbo6.A09.setText(2131974407);
                                LBO lbo7 = this.A01;
                                if (lbo7 != null) {
                                    lbo7.A07.setImageResource(R.drawable.instagram_new_story_outline_96);
                                    LBO lbo8 = this.A01;
                                    if (lbo8 != null) {
                                        DbT.A16(requireContext(), lbo8.A04, 2Yu.A0H(getContext(), R.attr.igds_color_media_background));
                                        LBO lbo9 = this.A01;
                                        if (lbo9 != null) {
                                            C64273LXz.A00(lbo9.A04, 35, this);
                                            LBO lbo10 = this.A01;
                                            if (lbo10 != null) {
                                                DbT.A16(requireContext(), lbo10.A01, 2Yu.A0H(getContext(), R.attr.igds_color_reels_tab_bar_separator));
                                                LBO lbo11 = this.A01;
                                                if (lbo11 != null) {
                                                    JTR.A19(getContext(), lbo11.A05);
                                                    int A022 = DbS.A02(requireContext(), 2);
                                                    LBO lbo12 = this.A01;
                                                    if (lbo12 != null) {
                                                        lbo12.A05.A11(new C361648gZ(A022, false));
                                                        int dimensionPixelSize = DbV.A05(this).getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
                                                        LBO lbo13 = this.A01;
                                                        if (lbo13 != null) {
                                                            lbo13.A05.setPadding(0, 0, 0, dimensionPixelSize * 2);
                                                            LBO lbo14 = this.A01;
                                                            if (lbo14 != null) {
                                                                lbo14.A05.setClipToPadding(false);
                                                                A01(this, 0);
                                                                C362358hl r3 = this.A00;
                                                                str = "storyDraftsAdapter";
                                                                if (r3 != null) {
                                                                    LBO lbo15 = this.A01;
                                                                    if (lbo15 != null) {
                                                                        RecyclerView recyclerView = lbo15.A05;
                                                                        0qQ.A0B(recyclerView, 0);
                                                                        r3.A00 = new C63847L9c(r3.A04, C51965G9l.A0v(recyclerView));
                                                                        LBO lbo16 = this.A01;
                                                                        if (lbo16 != null) {
                                                                            RecyclerView recyclerView2 = lbo16.A05;
                                                                            C362358hl r02 = this.A00;
                                                                            if (r02 != null) {
                                                                                recyclerView2.setAdapter(r02.A08.A01);
                                                                                07U r6 = 07U.A05;
                                                                                AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                                                                                AnonymousClass7TE.A1Z(new MH5(r6, this, viewLifecycleOwner, (AnonymousClass4D7) null, 29), AnonymousClass07a.A00(viewLifecycleOwner));
                                                                                return;
                                                                            }
                                                                        }
                                                                    }
                                                                    0qQ.A0F(str2);
                                                                    throw AnonymousClass00P.createAndThrow();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(K6C k6c) {
        String str;
        C362358hl r1 = k6c.A00;
        if (r1 != null) {
            r1.A02(!r1.A02);
            LBO lbo = k6c.A01;
            if (lbo == null) {
                str = "viewHolder";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            C3497981v r2 = lbo.A0E;
            C362358hl r0 = k6c.A00;
            if (r0 != null) {
                boolean z = r0.A02;
                int i = 2131961043;
                if (z) {
                    i = 2131961042;
                }
                r2.A00(DbU.A0m(k6c, i));
                return;
            }
        }
        str = "storyDraftsAdapter";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(K6C k6c, int i) {
        LBO lbo = k6c.A01;
        if (lbo != null) {
            View view = lbo.A00;
            int visibility = view.getVisibility();
            if (i > 0) {
                if (visibility == 8) {
                    C294975nL A0c = JTP.A0c(view, 0);
                    A0c.A0T(AnonymousClass7TE.A03(view), 0.0f);
                    A0c.A04 = 0;
                    A0c.A0F(true).A0H();
                }
                LBO lbo2 = k6c.A01;
                if (lbo2 != null) {
                    DbX.A13(k6c.requireContext(), lbo2.A04, Integer.valueOf(i), 2131974406);
                    return;
                }
            } else if (visibility == 0) {
                C294975nL A0c2 = JTP.A0c(view, 0);
                A0c2.A0K(AnonymousClass7TE.A03(view));
                A0c2.A03 = 8;
                A0c2.A0F(true).A0H();
                return;
            } else {
                return;
            }
        }
        0qQ.A0F("viewHolder");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final boolean onBackPressed() {
        ((C356988Vz) this.A03.getValue()).A00(C356928Vt.NONE);
        return true;
    }

    public K6C() {
        C66297MMg mMg = new C66297MMg(this, 37);
        AnonymousClass0eM A012 = C66297MMg.A01(new C66297MMg(this, 34), 0eO.A02, 35);
        this.A05 = DbS.A0I(new C66297MMg(A012, 36), mMg, new MJ8(23, (Object) null, A012), DbS.A0z(StoryDraftsCreationViewModel.class));
        this.A03 = AnonymousClass0eN.A01(new C66297MMg(this, 32));
        this.A04 = C227642jf.A02(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1692787579);
        K6C.super.onCreate(bundle);
        setModuleNameV2("stories_drafts");
        Context requireContext = requireContext();
        AnonymousClass0eM r3 = this.A04;
        r3.getValue();
        int A052 = JTO.A05((float) AnonymousClass8XE.A02(requireContext), 0.5625f);
        Context requireContext2 = requireContext();
        r3.getValue();
        int A023 = AnonymousClass8XE.A02(requireContext2);
        Context requireContext3 = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        AnonymousClass8XH r7 = new AnonymousClass8XH(AnonymousClass7TE.A0l(r3), A023, A052);
        C65052LmW lmW = new C65052LmW(this);
        AnonymousClass0eM r1 = this.A06;
        this.A00 = new C362358hl(requireContext3, A0l, r7, this, lmW, "stories_drafts", (List) ((AnonymousClass8XC) r1.getValue()).A01.getValue());
        ((AnonymousClass8XC) r1.getValue()).A00(requireContext());
        C51971G9r.A0g(r3).A0a();
        AnonymousClass0fD.A09(-466895151, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-16273883);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_media_drafts_fragment, false);
        AnonymousClass0fD.A09(304284413, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-2087361760);
        super.onDestroyView();
        FragmentActivity requireActivity = requireActivity();
        C227182im r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("windowInsetListener");
            throw AnonymousClass00P.createAndThrow();
        }
        C226122ff.A02(requireActivity, r0);
        AnonymousClass0fD.A09(-711852840, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1311120848);
        super.onResume();
        C317756nm.A03(requireActivity(), this, AnonymousClass7TE.A0l(this.A04), false, false);
        AnonymousClass0fD.A09(-1130003860, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-636556522);
        K6C.super.onStop();
        C317756nm.A04(requireActivity(), AnonymousClass7TE.A0l(this.A04), false);
        AnonymousClass0fD.A09(1366008943, A022);
    }
}
