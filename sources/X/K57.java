package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.modal.ModalActivity;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.ui.swipenavigation.PositionConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class K57 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ClipsDraftsFragment";
    public LBO A00;
    public PendingRecipient A01;
    public C53081GiF A02;
    public boolean A03;
    public boolean A04;
    public AnonymousClass2Fj A05 = new 2Fk(C62468KgJ.DRAFTS);
    public C60435JlT A06;
    public AnonymousClass6ST A07;
    public boolean A08;
    public boolean A09;
    public final 28D A0A = 28D.A0z;
    public final AnonymousClass0eM A0B = DbS.A0I(new MMH(this, 7), new C58673Ivi(this, 47), new C58690Ivz(17, (Object) null, this), DbS.A0z(C357638Yz.class));
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D = DbS.A0I(new MMH(this, 6), new C58673Ivi(this, 49), new C58690Ivz(16, (Object) null, this), DbS.A0z(ClipsCreationDraftViewModel.class));
    public final AnonymousClass0eM A0E = DbS.A0I(new MMH(this, 5), new MMH(this, 0), new C58690Ivz(15, (Object) null, this), DbS.A0z(AnonymousClass72N.class));
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K;
    public final C65546LvL A0L;

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        if (A04(this)) {
            r4.Etr(false);
            return;
        }
        if (this.A04) {
            Context themedContext = getThemedContext();
            2dZ r0 = (2dZ) r4;
            0qQ.A0B(themedContext, 0);
            r0.A02 = themedContext;
            2dZ.A0H(r0);
        }
        r4.Etr(true);
        r4.Eu4(true);
        r4.Eom(2131961044);
        AnonymousClass3JR A0K2 = DbS.A0K();
        A0K2.A02(AnonymousClass05K.A0Y);
        DbX.A19(new LY3((Object) this, 22), A0K2, r4);
    }

    public final String getModuleName() {
        return "clips_drafts";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        2Fk r3;
        AnonymousClass07Z viewLifecycleOwner;
        int i;
        String str;
        String string;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        this.A00 = new LBO(view2);
        boolean A042 = A04(this);
        String str2 = "viewHolder";
        LBO lbo = this.A00;
        if (A042) {
            if (lbo != null) {
                lbo.A02.setVisibility(0);
                LBO lbo2 = this.A00;
                if (lbo2 != null) {
                    AnonymousClass8GF CrP = lbo2.A0C.CrP();
                    CrP.A00 = new C64982LlL(this, 3);
                    CrP.A00();
                    Bundle bundle2 = this.mArguments;
                    if (bundle2 != null) {
                        str = bundle2.getString(AnonymousClass000.A00(862));
                    } else {
                        str = null;
                    }
                    if (!(str == null || str.length() == 0)) {
                        LBO lbo3 = this.A00;
                        if (lbo3 != null) {
                            lbo3.A0B.setText(str);
                        }
                    }
                    Bundle bundle3 = this.mArguments;
                    if (bundle3 == null || (string = bundle3.getString(AnonymousClass000.A00(861))) == null || string.length() == 0) {
                        LBO lbo4 = this.A00;
                        if (lbo4 != null) {
                            lbo4.A0A.setVisibility(8);
                        }
                    } else {
                        LBO lbo5 = this.A00;
                        if (lbo5 != null) {
                            lbo5.A0A.setText(string);
                            LBO lbo6 = this.A00;
                            if (lbo6 != null) {
                                lbo6.A0A.setVisibility(0);
                            }
                        }
                    }
                    LBO lbo7 = this.A00;
                    if (lbo7 != null) {
                        lbo7.A0E.Eql(false, false);
                        if (str == null || str.length() == 0) {
                            LBO lbo8 = this.A00;
                            if (lbo8 != null) {
                                lbo8.A0B.setText(requireContext().getText(2131961044));
                            }
                        }
                        LBO lbo9 = this.A00;
                        if (lbo9 != null) {
                            lbo9.A0D.Eql(true, false);
                            LBO lbo10 = this.A00;
                            if (lbo10 != null) {
                                AnonymousClass8GF CrP2 = lbo10.A0D.CrP();
                                CrP2.A00 = new C64982LlL(this, 4);
                                CrP2.A00();
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        if (lbo != null) {
            lbo.A02.setVisibility(8);
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
        LBO lbo11 = this.A00;
        if (lbo11 != null) {
            lbo11.A09.setText(2131961039);
            LBO lbo12 = this.A00;
            if (lbo12 != null) {
                lbo12.A07.setImageResource(R.drawable.instagram_reels_outline_96);
                LBO lbo13 = this.A00;
                if (lbo13 != null) {
                    lbo13.A0F.A02(new LY3((Object) this, 23), new C49627Ezk((Drawable) null, (CharSequence) null, (CharSequence) null, 2131955418, false));
                    LBO lbo14 = this.A00;
                    if (lbo14 != null) {
                        lbo14.A0F.A02(new LY3((Object) this, 24), new C49627Ezk((Drawable) null, (CharSequence) null, (CharSequence) null, 2131955417, false));
                        LBO lbo15 = this.A00;
                        if (lbo15 != null) {
                            RecyclerView recyclerView = lbo15.A05;
                            C53081GiF giF = this.A02;
                            if (giF != null) {
                                DbV.A1B(((HJZ) giF).A03, recyclerView);
                                LBO lbo16 = this.A00;
                                if (lbo16 != null) {
                                    RecyclerView recyclerView2 = lbo16.A06;
                                    C53081GiF giF2 = this.A02;
                                    if (giF2 != null) {
                                        DbV.A1B(((HJZ) giF2).A03, recyclerView2);
                                        if (this.A02 != null) {
                                            int dimensionPixelSize = DbV.A05(this).getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
                                            LBO lbo17 = this.A00;
                                            if (lbo17 != null) {
                                                lbo17.A05.setPadding(0, 0, 0, dimensionPixelSize);
                                                LBO lbo18 = this.A00;
                                                if (lbo18 != null) {
                                                    lbo18.A05.setClipToPadding(false);
                                                    LBO lbo19 = this.A00;
                                                    if (lbo19 != null) {
                                                        RecyclerView recyclerView3 = lbo19.A05;
                                                        C53081GiF giF3 = this.A02;
                                                        if (giF3 != null) {
                                                            recyclerView3.setAdapter(giF3);
                                                            LBO lbo20 = this.A00;
                                                            if (lbo20 != null) {
                                                                RecyclerView recyclerView4 = lbo20.A06;
                                                                C60435JlT jlT = this.A06;
                                                                if (jlT == null) {
                                                                    str2 = "scheduledContentAdapter";
                                                                } else {
                                                                    recyclerView4.setAdapter(jlT);
                                                                    if (!G9t.A1b(this.A0F) || !G9t.A1b(this.A0K)) {
                                                                        boolean A1b = G9t.A1b(this.A0K);
                                                                        AnonymousClass72N r0 = (AnonymousClass72N) this.A0E.getValue();
                                                                        if (A1b) {
                                                                            r3 = r0.A02;
                                                                            viewLifecycleOwner = getViewLifecycleOwner();
                                                                            i = 18;
                                                                        } else {
                                                                            r3 = r0.A01;
                                                                            viewLifecycleOwner = getViewLifecycleOwner();
                                                                            i = 19;
                                                                        }
                                                                    } else {
                                                                        r3 = ((AnonymousClass72N) this.A0E.getValue()).A03;
                                                                        viewLifecycleOwner = getViewLifecycleOwner();
                                                                        i = 17;
                                                                    }
                                                                    C64321LZw.A00(viewLifecycleOwner, r3, new C59097J6f(this, i), 11);
                                                                    C53081GiF giF4 = this.A02;
                                                                    if (giF4 != null) {
                                                                        if (giF4 instanceof HJZ) {
                                                                            C319116q4 r1 = C319116q4.A00;
                                                                            AnonymousClass0eM r32 = this.A0I;
                                                                            if (r1.A0A(AnonymousClass7TE.A0l(r32))) {
                                                                                07U r14 = 07U.A05;
                                                                                AnonymousClass07Z viewLifecycleOwner2 = getViewLifecycleOwner();
                                                                                AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner2);
                                                                                C58107ImT imT = new C58107ImT((Object) viewLifecycleOwner2, (Object) r14, (Object) this, (AnonymousClass4D7) null, 0);
                                                                                19B r4 = 19B.A00;
                                                                                1Eo.A05(r4, imT, A002);
                                                                                C60133JgE jgE = (C60133JgE) this.A0H.getValue();
                                                                                MG7.A01(jgE, C318116oQ.A00(jgE), 12);
                                                                                if (C319116q4.A06(AnonymousClass7TE.A0l(r32))) {
                                                                                    AnonymousClass07Z viewLifecycleOwner3 = getViewLifecycleOwner();
                                                                                    1Eo.A05(r4, new C58107ImT((Object) viewLifecycleOwner3, (Object) r14, (Object) this, (AnonymousClass4D7) null, 1), AnonymousClass07a.A00(viewLifecycleOwner3));
                                                                                    2YL A0H2 = DbS.A0H(this.A0G);
                                                                                    1Eo.A05(r4, new JVD(A0H2, (AnonymousClass4D7) null, 43), C318116oQ.A00(A0H2));
                                                                                }
                                                                            }
                                                                        }
                                                                        C59728JVm A003 = AnonymousClass9PJ.A00(AnonymousClass7TE.A0l(this.A0I));
                                                                        0JA.A01();
                                                                        29E r42 = A003.A04;
                                                                        if (r42.A0E(585177486, A003.A00)) {
                                                                            r42.A0C("draft_list_view_created", A003.A00);
                                                                            A003.A03.add("draft_list_view_created");
                                                                        }
                                                                        A003.A02 = false;
                                                                        C59728JVm.A00(A003);
                                                                        return;
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
                            0qQ.A0F("clipsDraftsAdapter");
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(C62468KgJ kgJ, K57 k57, boolean z) {
        LBO lbo = k57.A00;
        if (lbo != null) {
            if (lbo.A0F.getVisibility() == 0) {
                k57.A05.A0B(kgJ);
                LBO lbo2 = k57.A00;
                if (lbo2 != null) {
                    lbo2.A0F.A01(kgJ.ordinal(), z);
                    LBO lbo3 = k57.A00;
                    if (lbo3 != null) {
                        RecyclerView recyclerView = lbo3.A05;
                        int i = 0;
                        int i2 = 8;
                        if (kgJ == C62468KgJ.DRAFTS) {
                            i2 = 0;
                        }
                        recyclerView.setVisibility(i2);
                        LBO lbo4 = k57.A00;
                        if (lbo4 != null) {
                            RecyclerView recyclerView2 = lbo4.A06;
                            if (kgJ != C62468KgJ.SCHEDULED) {
                                i = 8;
                            }
                            recyclerView2.setVisibility(i);
                            return;
                        }
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F("viewHolder");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(K57 k57) {
        AnonymousClass0eM r1 = k57.A0I;
        if (AnonymousClass7TF.A0g(AnonymousClass7TE.A0l(r1)) == null) {
            27r A012 = 27p.A01(AnonymousClass7TE.A0l(r1));
            28D r2 = k57.A0A;
            int A002 = AnonymousClass4x3.A00(k57.requireContext());
            A012.A18(r2, C59725JVj.PRE_CAPTURE, (C357638Yz) k57.A0B.getValue(), C2801950r.FEED_POST, ((C3499582p) k57.A0C.getValue()).A02.A01.A09, (List) null, A002, -1);
        }
    }

    public static final void A03(K57 k57, List list) {
        HJZ hjz;
        String str;
        if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(k57.A0I), 36323848387440195L)) {
            LBO lbo = k57.A00;
            if (lbo == null) {
                str = "viewHolder";
            } else {
                lbo.A0F.setVisibility(0);
                str = "scheduledContentAdapter";
                if (list != null) {
                    C60435JlT jlT = k57.A06;
                    if (jlT != null) {
                        ArrayList A1D = AnonymousClass7TE.A1D(list);
                        jlT.A00 = A1D;
                        int size = A1D.size();
                        ArrayList A0v = DbS.A0v(size);
                        for (int i = 0; i < size; i++) {
                            A0v.add((Object) null);
                        }
                        jlT.A01 = A0v;
                        jlT.notifyDataSetChanged();
                    }
                }
                C60435JlT jlT2 = k57.A06;
                if (jlT2 != null) {
                    jlT2.A01();
                    return;
                }
            }
        } else {
            C53081GiF giF = k57.A02;
            if (giF == null) {
                str = "clipsDraftsAdapter";
            } else if ((giF instanceof HJZ) && (hjz = (HJZ) giF) != null) {
                hjz.A02 = true;
                hjz.notifyDataSetChanged();
                return;
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r1 == 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A04(X.K57 r1) {
        /*
            android.os.Bundle r1 = r1.mArguments
            if (r1 == 0) goto L_0x0017
            r0 = 861(0x35d, float:1.207E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x0017
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K57.A04(X.K57):boolean");
    }

    public final UserSession A05() {
        return AnonymousClass7TE.A0l(this.A0I);
    }

    public final void A06(C369968vc r5) {
        C49731F3w A082 = 1as.A04.A02.A08(AnonymousClass7TE.A0l(this.A0I), 2FW.A0V, "clips_drafts");
        A082.A02 = new C65273LqS(r5, this);
        AnonymousClass37D A0g = DbV.A0g(this, AnonymousClass37D.A00);
        A082.A01();
        if (A0g != null) {
            A0g.A0J(A082.A00());
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0I);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        2ZS r2;
        1QK A002;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i3, i4, intent2);
        2ZS A003 = C71172bH.A00();
        if (A003 != null) {
            if (A003 instanceof 2ZS) {
                r2 = A003;
            }
            r2 = null;
        } else {
            C51969G9p.A1K(0wj.A01.AEf(__redex_internal_original_name, 817902720), 002.A0n("onActivityResult: IgMainActivityHolder.getMainActivity() is null with requestCode ", ", resultCode ", ". Navigation will not succeed", i3, i4));
            r2 = null;
        }
        String A004 = C273654mx.A00(945);
        if (i3 != 9583) {
            if (i3 == 10001 && i4 == -1 && intent != null) {
                if (C273654mx.A00(209).equals(intent2.getStringExtra(C273654mx.A00(208)))) {
                    if (r2 != null) {
                        C240073Jm.A00 = true;
                        r2.Enh(1QK.A0C);
                        if (getActivity() instanceof ModalActivity) {
                            r2.FLD(new PositionConfig((AnonymousClass57C) null, (CameraConfiguration) null, (AnonymousClass3QO) null, A004, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false));
                        }
                    }
                    if (getActivity() instanceof ModalActivity) {
                        requireActivity().setResult(9683, (Intent) null);
                        DbT.A1K(this);
                    }
                }
            }
        } else if (i4 == 9683) {
            if (intent != null) {
                boolean booleanExtra = intent2.getBooleanExtra(AnonymousClass000.A00(891), false);
                if (r2 != null) {
                    C240073Jm.A00 = true;
                    if (booleanExtra) {
                        A002 = 1QK.A0C;
                    } else {
                        A002 = C226412gl.A00(AnonymousClass7TE.A0l(this.A0I)).A00();
                    }
                    r2.Enh(A002);
                    if (this.A08 && (getActivity() instanceof ModalActivity)) {
                        r2.FLD(new PositionConfig((AnonymousClass57C) null, (CameraConfiguration) null, (AnonymousClass3QO) null, A004, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false));
                    }
                }
                if (getActivity() instanceof ModalActivity) {
                    requireActivity().setResult(9683, (Intent) null);
                    DbT.A1K(this);
                }
            }
        } else if (i4 == 9685) {
            UserSession A0l = AnonymousClass7TE.A0l(this.A0I);
            if (182.A06(DbS.A0J(A0l, 0), A0l, 36321550579934724L)) {
                C59689JTv.A01(requireContext(), (String) null, 2131961036, 0);
            }
        }
    }

    public K57() {
        MMH mmh = new MMH(this, 3);
        MMH mmh2 = new MMH(this, 8);
        0eO r4 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r4, new MMH(mmh2, 9));
        this.A0H = DbS.A0I(new MMH(A002, 10), mmh, new C58690Ivz(18, (Object) null, A002), DbS.A0z(C60133JgE.class));
        MMH mmh3 = new MMH(this, 2);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(r4, new MMH(new MMH(this, 11), 12));
        this.A0G = DbS.A0I(new MMH(A003, 13), mmh3, new C58690Ivz(19, (Object) null, A003), DbS.A0z(C60132JgD.class));
        this.A0K = MMH.A00(this, 14);
        this.A0F = MMH.A00(this, 1);
        this.A0J = AnonymousClass1YB.A00(new MMH(this, 4));
        this.A0C = AnonymousClass0eN.A01(new C58673Ivi(this, 48));
        this.A0L = new C65546LvL(this, 2);
        this.A0I = C227642jf.A02(this);
    }

    public static final void A02(K57 k57) {
        IgdsHeadline igdsHeadline = new IgdsHeadline(k57.getThemedContext(), (AttributeSet) null, 0, 0);
        igdsHeadline.setHeadline(2131955389);
        igdsHeadline.setBody(2131955388);
        DbX.A1C(igdsHeadline, igdsHeadline.getPaddingLeft(), 0);
        C46498Dg1 dg1 = new C46498Dg1(k57.getThemedContext(), AnonymousClass7TE.A0l(k57.A0I));
        dg1.A01 = igdsHeadline;
        dg1.A06 = false;
        AnonymousClass2k4 r0 = k57.dayNightMode;
        0qQ.A0B(r0, 0);
        dg1.A02 = r0;
        C49945FFy.A00(k57, dg1);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-273102361);
        K57.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        setModuleNameV2("clips_drafts");
        this.A03 = requireArguments.getBoolean(C273654mx.A00(548), false);
        this.A04 = requireArguments.getBoolean(C273654mx.A00(40), false);
        this.A01 = (PendingRecipient) requireArguments.getParcelable(AnonymousClass000.A00(1876));
        this.A08 = requireArguments().getBoolean(AnonymousClass000.A00(889), false);
        this.A07 = new AnonymousClass6ST(requireActivity(), true);
        if (this.A04) {
            setDayNightMode(AnonymousClass2k4.NIGHT);
        }
        AnonymousClass0eM r4 = this.A0I;
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        FragmentActivity requireActivity = requireActivity();
        Context themedContext = getThemedContext();
        C349317zw r12 = new C349317zw(requireActivity(), AnonymousClass7TE.A0l(r4));
        int dimensionPixelSize = DbV.A05(this).getDimensionPixelSize(R.dimen.action_bar_immersive_gradient_height);
        int A072 = Dbb.A07(this, R.dimen.action_bar_immersive_gradient_height);
        AnonymousClass0eM r3 = this.A0E;
        this.A02 = new HJZ(requireActivity, themedContext, this, (AnonymousClass72N) r3.getValue(), A0l, r12, this, dimensionPixelSize, A072, this.A04);
        this.A06 = new C60435JlT(getThemedContext(), requireActivity(), this.dayNightMode, new LPH(C59722JVg.DRAFT_FOLDER, this, AnonymousClass7TE.A0l(r4)), this, AnonymousClass7TE.A0l(r4));
        27r A012 = 27p.A01(AnonymousClass7TE.A0l(r4));
        if (!this.A03) {
            requireArguments().getSerializable(AnonymousClass000.A00(2639));
        }
        A012.A0a();
        ((AnonymousClass72N) r3.getValue()).A0E();
        CameraConfiguration A002 = C358098aM.A00(AnonymousClass80N.A00, new C358088aL[0]);
        AnonymousClass80I r5 = AnonymousClass80H.A02;
        A05();
        AnonymousClass80H A023 = r5.A02(C338817ia.A01());
        Set set = A002.A04;
        C279284yO r16 = A002.A03;
        ((C357638Yz) this.A0B.getValue()).A0C(this.A0A, A023, r16, (C347087wF) null, set, A002.A00, false, true);
        if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(r4), 36325630798738533L)) {
            A01(this);
        }
        1ua.A0G.A01(requireContext(), AnonymousClass7TE.A0l(r4)).A0J(this.A0L);
        AnonymousClass0fD.A09(1490381781, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1745717876);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_media_drafts_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-268799939, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1508502983);
        super.onDestroy();
        1ua.A0G.A01(requireContext(), AnonymousClass7TE.A0l(this.A0I)).A0K(this.A0L);
        AnonymousClass0fD.A09(1958724315, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-516630595);
        this.A09 = true;
        K57.super.onPause();
        AnonymousClass0fD.A09(1836038421, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1941515343);
        super.onResume();
        if (this.A04) {
            C317756nm.A03(requireActivity(), this, AnonymousClass7TE.A0l(this.A0I), false, false);
        }
        C53081GiF giF = this.A02;
        if (giF == null) {
            0qQ.A0F("clipsDraftsAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        giF.A01 = -1;
        if (this.A09) {
            ((AnonymousClass72N) this.A0E.getValue()).A05.A01.A02.A0A();
            this.A09 = false;
        }
        C62468KgJ kgJ = (C62468KgJ) this.A05.A02();
        if (kgJ != null) {
            A00(kgJ, this, false);
        }
        AnonymousClass0fD.A09(1253972250, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1738896050);
        K57.super.onStop();
        C317756nm.A04(requireActivity(), AnonymousClass7TE.A0l(this.A0I), false);
        AnonymousClass0fD.A09(708425828, A022);
    }
}
