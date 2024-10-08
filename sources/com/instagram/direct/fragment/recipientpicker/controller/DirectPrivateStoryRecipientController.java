package com.instagram.direct.fragment.recipientpicker.controller;

import X.0mp;
import X.0nY;
import X.0qQ;
import X.0wb;
import X.16P;
import X.1Au;
import X.1Av;
import X.1Xj;
import X.1a8;
import X.1iA;
import X.1wn;
import X.2Yu;
import X.2db;
import X.2el;
import X.A1F;
import X.ADu;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass1Nd;
import X.AnonymousClass3D4;
import X.AnonymousClass48O;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass818;
import X.AnonymousClass819;
import X.AnonymousClass81A;
import X.C226112fe;
import X.C228172ku;
import X.C2355930l;
import X.C249403jg;
import X.C255773uh;
import X.C269794fh;
import X.C273634mu;
import X.C279284yO;
import X.C294975nL;
import X.C315596kB;
import X.C331157Pu;
import X.C332277Ui;
import X.C337237fw;
import X.C337257fy;
import X.C358028aF;
import X.C363008it;
import X.C363018iu;
import X.C368278sM;
import X.C368288sN;
import X.C381779cJ;
import X.C46502Dg5;
import X.C48136EZe;
import X.C50367FaS;
import X.C50990Fmd;
import X.C51899G6t;
import X.C61002Juy;
import X.C61149Jy0;
import X.C61896KQp;
import X.C61897KQq;
import X.C62052KYa;
import X.C63230Ktb;
import X.C64698LgT;
import X.C65290Lqj;
import X.C65291Lqk;
import X.C65294Lqn;
import X.C65296Lqp;
import X.C65297Lqq;
import X.C65303Lqw;
import X.C65305Lqy;
import X.C65306Lqz;
import X.C65635LxC;
import X.C65724Lye;
import X.C66574MXf;
import X.C66651MaK;
import X.C69860NtO;
import X.C71392co;
import X.C74502Pvw;
import X.DbS;
import X.DbT;
import X.DbV;
import X.Dba;
import X.F9W;
import X.FZ0;
import X.JTO;
import X.JTP;
import X.K9B;
import X.K9I;
import X.L1H;
import X.L1I;
import X.L1J;
import X.L1M;
import X.L1N;
import X.L1O;
import X.L1P;
import X.L4U;
import X.LMK;
import X.LRS;
import X.LRm;
import X.Lr0;
import X.M01;
import X.MB7;
import X.MTF;
import X.MVT;
import X.MXS;
import X.ON1;
import X.OX4;
import X.Y44;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.archive.intf.ArchivePendingUpload;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.ui.widget.search.SearchController;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DirectPrivateStoryRecipientController extends C249403jg implements C337237fw, C74502Pvw, 1wn {
    public float A00 = -1.0f;
    public int A01 = -1;
    public int A02;
    public int A03;
    public View A04;
    public EditText A05;
    public RecyclerView A06;
    public C48136EZe A07;
    public ArchivePendingUpload A08;
    public C2355930l A09;
    public MediaUploadMetadata A0A;
    public UserSession A0B;
    public C279284yO A0C;
    public IngestSessionShim A0D;
    public IngestSessionShim A0E;
    public LRm A0F;
    public C46502Dg5 A0G;
    public K9I A0H;
    public K9B A0I;
    public L4U A0J;
    public IgdsButton A0K;
    public DirectShareTarget A0L;
    public 1iA A0M;
    public C381779cJ A0N;
    public C337257fy A0O;
    public C363008it A0P;
    public MTF A0Q;
    public Integer A0R = AnonymousClass05K.A00;
    public String A0S;
    public String A0T;
    public String A0U;
    public ArrayList A0V;
    public ArrayList A0W;
    public ArrayList A0X;
    public List A0Y;
    public Map A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n = false;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q = false;
    public boolean A0r = true;
    public boolean A0s = false;
    public boolean A0t = false;
    public boolean A0u;
    public final Y44 A0v = new Y44();
    public final AnonymousClass4DH A0w;
    public final 1wn A0x = C64698LgT.A00(this, 61);
    public final 1wn A0y = C64698LgT.A00(this, 62);
    public final 1a8 A0z = new 1a8((C269794fh) null);
    public final 2el A10;
    public final C51899G6t A11 = new C50367FaS(this);
    public final L1H A12 = new L1H(this);
    public final L1I A13 = new L1I(this);
    public final L1J A14 = new L1J(this);
    public final C65635LxC A15 = new C65635LxC(this);
    public final L1M A16 = new L1M(this);
    public final L1N A17 = new L1N(this);
    public final C65306Lqz A18 = new C65306Lqz(this);
    public final Lr0 A19 = new Lr0(this);
    public final L1O A1A = new L1O(this);
    public final L1P A1B = new L1P(this);
    public final C65305Lqy A1C = new C61896KQp(this);
    public final C65305Lqy A1D = new C61897KQq(this);
    public final FZ0 A1E;
    public final C66574MXf A1F = new C65297Lqq(this);
    public final C66574MXf A1G = new C65296Lqp(this);
    public final MVT A1H = new C65303Lqw(this);
    public final C273634mu A1I = new C50990Fmd(this);
    @Deprecated
    public final List A1J = AnonymousClass7TE.A1C();
    public final Set A1K = AnonymousClass7TE.A1F();
    public final boolean A1L;
    public final C228172ku A1M = new C228172ku();
    public final boolean A1N;
    public FrameLayout mListContainer;
    public SearchController mSearchController;

    public DirectPrivateStoryRecipientController(AnonymousClass4DH r4, MediaUploadMetadata mediaUploadMetadata, 2el r6, FZ0 fz0, boolean z) {
        this.A0w = r4;
        this.A10 = r6;
        this.A1E = fz0;
        this.A1N = true;
        this.A07 = C48136EZe.LANDING_STATE;
        this.A1L = z;
        this.A0A = mediaUploadMetadata;
    }

    public final float Abo(SearchController searchController, Integer num) {
        return 0.0f;
    }

    public final void CvL(SearchController searchController, Integer num, float f, float f2) {
    }

    public final void DRx() {
    }

    public final void DRz() {
    }

    public final void Dht(String str, boolean z) {
    }

    public static void A03(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        boolean z;
        ImageView imageView;
        directPrivateStoryRecipientController.A0F.A05();
        if (directPrivateStoryRecipientController.A0o) {
            AnonymousClass4DH r2 = directPrivateStoryRecipientController.A0w;
            BottomSheetFragment bottomSheetFragment = r2.mParentFragment;
            if (bottomSheetFragment instanceof BottomSheetFragment) {
                C331157Pu r1 = bottomSheetFragment.A02;
                if (r1 != null) {
                    r1.A0L((C332277Ui) null);
                } else {
                    return;
                }
            } else {
                FragmentActivity requireActivity = r2.requireActivity();
                requireActivity.setResult(-1, directPrivateStoryRecipientController.A0E());
                requireActivity.onBackPressed();
            }
            AnonymousClass1Nd.A00(directPrivateStoryRecipientController.A0B).A00(new C358028aF(directPrivateStoryRecipientController.A0E(), directPrivateStoryRecipientController.A0F.A08()));
        } else if (directPrivateStoryRecipientController.A0k) {
            DbT.A1J(directPrivateStoryRecipientController.A0w);
        } else {
            if (directPrivateStoryRecipientController.A0g) {
                ADu aDu = (ADu) ADu.A02.getValue();
                Bitmap bitmap = null;
                try {
                    View view = directPrivateStoryRecipientController.A0w.mView;
                    if (view != null) {
                        View rootView = view.getRootView();
                        bitmap = Bitmap.createBitmap(rootView.getWidth() / 2, rootView.getHeight() / 2, Bitmap.Config.RGB_565);
                        Canvas A0B2 = JTO.A0B(bitmap);
                        A0B2.scale(0.5f, 0.5f);
                        rootView.draw(A0B2);
                    }
                } catch (OutOfMemoryError e) {
                    0wb.A06("DirectPrivateStoryRecipientController", "Failed to create screenshot", e);
                }
                aDu.A00 = bitmap;
                WeakReference weakReference = aDu.A01;
                if (!(weakReference == null || (imageView = (ImageView) weakReference.get()) == null)) {
                    imageView.setImageBitmap(bitmap);
                    imageView.setVisibility(0);
                }
                z = true;
            } else {
                z = false;
            }
            A08(directPrivateStoryRecipientController, -1, z);
        }
    }

    public static void A04(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        Context context = directPrivateStoryRecipientController.A0w.getContext();
        IngestSessionShim ingestSessionShim = directPrivateStoryRecipientController.A0D;
        if (ingestSessionShim != null && context != null) {
            LRm AXA = directPrivateStoryRecipientController.A0Q.AXA();
            C61002Juy juy = C61002Juy.A08;
            UserSession userSession = directPrivateStoryRecipientController.A0B;
            UserStoryTarget userStoryTarget = UserStoryTarget.A04;
            AXA.A06(new C65294Lqn(context, userSession, ingestSessionShim, userStoryTarget, (String) null, "ig_story_composer", false), juy);
            directPrivateStoryRecipientController.A18.Djv(userStoryTarget);
        }
    }

    public static void A05(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        Integer num;
        if (directPrivateStoryRecipientController.A04 == null) {
            return;
        }
        if ((!directPrivateStoryRecipientController.A0F.A08() && !directPrivateStoryRecipientController.A0p) || (num = directPrivateStoryRecipientController.mSearchController.A03) == AnonymousClass05K.A0C || num == AnonymousClass05K.A01 || directPrivateStoryRecipientController.A0a) {
            View view = directPrivateStoryRecipientController.A04;
            if (view != null && view.getVisibility() != 8) {
                directPrivateStoryRecipientController.A04.requireViewById(R.id.send_button).setClickable(false);
                View view2 = directPrivateStoryRecipientController.A04;
                C71392co r0 = C315596kB.A02;
                C294975nL A0A2 = JTP.A0c(view2, 0).A0A();
                A0A2.A0K((float) AnonymousClass3D4.A00(directPrivateStoryRecipientController.A0w.getContext()));
                A0A2.A03 = 8;
                A0A2.A0H();
            }
        } else if (!directPrivateStoryRecipientController.A0k) {
            A07(directPrivateStoryRecipientController, 0.0f);
        } else {
            C226112fe.A00(directPrivateStoryRecipientController.A0w.getActivity(), new M01(directPrivateStoryRecipientController, 0), false);
        }
    }

    public static void A06(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        directPrivateStoryRecipientController.A0H.A06();
        A05(directPrivateStoryRecipientController);
    }

    public static void A07(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, float f) {
        directPrivateStoryRecipientController.A04.getClass();
        View view = directPrivateStoryRecipientController.A04;
        C71392co r0 = C315596kB.A02;
        C294975nL A0A2 = JTP.A0c(view, 0).A0A();
        A0A2.A0K(f);
        A0A2.A04 = 0;
        C65724Lye.A00(A0A2, directPrivateStoryRecipientController, 15);
    }

    public static void A08(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, int i, boolean z) {
        FragmentActivity requireActivity = directPrivateStoryRecipientController.A0w.requireActivity();
        requireActivity.setResult(i, directPrivateStoryRecipientController.A00(z));
        requireActivity.finish();
        if (i == -1) {
            requireActivity.overridePendingTransition(0, 0);
        }
    }

    public static void A09(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, DirectShareTarget directShareTarget, int i, int i2, int i3) {
        C48136EZe eZe;
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController2 = directPrivateStoryRecipientController;
        FZ0 fz0 = directPrivateStoryRecipientController2.A1E;
        if (fz0 != null) {
            UserSession userSession = directPrivateStoryRecipientController2.A0B;
            long j = (long) i3;
            long j2 = (long) i2;
            Y44 y44 = directPrivateStoryRecipientController2.A0v;
            DirectShareTarget directShareTarget2 = directShareTarget;
            String str = (String) y44.get(directShareTarget2);
            String moduleName = directPrivateStoryRecipientController2.A0w.getModuleName();
            String str2 = directPrivateStoryRecipientController2.A0U;
            if (y44.containsKey(directShareTarget2)) {
                eZe = C48136EZe.CREATE_GROUP_NULL_STATE;
            } else {
                eZe = directPrivateStoryRecipientController2.A07;
            }
            fz0.A0A(eZe, userSession, directShareTarget2, directPrivateStoryRecipientController2.A0M, str, moduleName, str2, (String) null, i, j, j2, false);
        }
    }

    public static void A0A(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, C61149Jy0 jy0) {
        Integer num = jy0.A00;
        Integer num2 = AnonymousClass05K.A00;
        if (num == num2) {
            directPrivateStoryRecipientController.A0P.A05(true, "ig_story_composer");
            directPrivateStoryRecipientController.A0P.A04(false);
            A04(directPrivateStoryRecipientController);
            num2 = AnonymousClass05K.A0C;
        } else if (num == AnonymousClass05K.A01) {
            A04(directPrivateStoryRecipientController);
            num2 = AnonymousClass05K.A0j;
        } else if (num != AnonymousClass05K.A0C) {
            return;
        }
        AnonymousClass4DH r1 = directPrivateStoryRecipientController.A0w;
        int A002 = AnonymousClass3D4.A00(r1.requireContext());
        Context requireContext = r1.requireContext();
        CallerContext callerContext = C62052KYa.A02;
        LRS.A01(requireContext, num2, A002);
    }

    private void A0D(C337257fy r11) {
        ArrayList arrayList;
        int i;
        UserSession userSession = this.A0B;
        List<DirectShareTarget> list = (List) r11.Bo1();
        if (!(this.A0E == null && this.A0D == null)) {
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (DirectShareTarget directShareTarget : list) {
                if (directShareTarget.A01 != 29) {
                    A1C2.add(directShareTarget);
                }
            }
            list = A1C2;
        }
        ON1 A002 = F9W.A00(userSession, "story_share_sheet", list);
        this.A0U = r11.BnF();
        if (this.A0b) {
            UserSession userSession2 = this.A0B;
            LinkedHashSet linkedHashSet = LMK.A02;
            0qQ.A0B(userSession2, 0);
            LinkedHashSet linkedHashSet2 = LMK.A02;
            try {
                1Av A003 = 1Au.A00(userSession2);
                String A132 = DbV.A13(A003, A003.A6s, 1Av.A8a, 237);
                if (A132 != null) {
                    LMK parseFromJson = C69860NtO.parseFromJson(16P.A00(A132));
                    Set set = parseFromJson.A00;
                    if (set == null || set.size() < 2) {
                        throw JTO.A0u("Not enough targets parsed");
                    }
                    linkedHashSet2 = C63230Ktb.A00(new LinkedHashSet(parseFromJson.A00), linkedHashSet2);
                }
            } catch (IOException e) {
                1Av A004 = 1Au.A00(userSession2);
                DbS.A1a(A004, (Object) null, A004.A6s, 1Av.A8a, 237);
                0wb.A07("BlastListCandidatesManager_error_deserializing_last_send", e);
            }
            arrayList = AnonymousClass7TE.A1D(linkedHashSet2);
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = A002.A0D;
        ArrayList arrayList3 = A002.A02;
        ArrayList arrayList4 = A002.A03;
        A0B(this, arrayList2);
        A0C(this, arrayList2);
        K9I k9i = this.A0H;
        LinkedHashSet linkedHashSet3 = k9i.A0X;
        linkedHashSet3.clear();
        LinkedHashSet linkedHashSet4 = k9i.A0Y;
        linkedHashSet4.clear();
        K9I.A01(k9i);
        int min = Math.min(arrayList2.size(), k9i.A09);
        if (k9i.A0h && (i = k9i.A08) < 10) {
            min = Math.min(min, i);
        }
        linkedHashSet3.addAll(arrayList2.subList(0, min));
        linkedHashSet4.addAll(arrayList2.subList(min, arrayList2.size()));
        K9I k9i2 = this.A0H;
        LinkedHashSet linkedHashSet5 = k9i2.A0V;
        linkedHashSet5.clear();
        K9I.A01(k9i2);
        linkedHashSet5.addAll(arrayList3.subList(0, Math.min(arrayList3.size(), k9i2.A07)));
        K9I k9i3 = this.A0H;
        LinkedHashSet linkedHashSet6 = k9i3.A0W;
        linkedHashSet6.clear();
        K9I.A01(k9i3);
        linkedHashSet6.addAll(arrayList4);
        if (arrayList != null) {
            Set set2 = this.A0H.A0d;
            set2.clear();
            set2.addAll(arrayList);
        }
        this.A0H.A06();
    }

    public final Intent A0E() {
        boolean z;
        if (this.A0g || (this.A0k && this.A0F.A08())) {
            z = true;
        } else {
            z = false;
        }
        return A00(z);
    }

    public final void A0F(C368278sM r5, C255773uh r6) {
        1Xj r0;
        AnonymousClass819 A002 = A1F.A00(C363018iu.A00(this.A0B), this.A0P.A06());
        AnonymousClass81A A0O2 = JTO.A0O();
        if (!(r6 == null || (r0 = r6.A0b) == null)) {
            A0O2.A06("ig_media_id", r0.getId());
        }
        C368288sN.A00(AnonymousClass818.IG_STORY_SHARE_SHEET_SHARING_OPTIONS, r5, A002, A0O2, this.A0B);
    }

    public final void DDU() {
        FZ0 fz0 = this.A1E;
        if (fz0 != null) {
            this.A07 = C48136EZe.LANDING_STATE;
            fz0.A08();
        }
    }

    public final void Dhf(SearchController searchController, boolean z) {
        if (this.A1N) {
            AnonymousClass4DH r3 = this.A0w;
            Dba.A0A(r3).Etr(!z);
            2db.A02(r3.getActivity(), 2Yu.A0F(r3.getContext(), R.attr.statusBarBackgroundColor));
        }
    }

    public final void Dhw(String str, String str2) {
        C48136EZe eZe;
        String BiY = this.A0O.BiY();
        String A012 = 0mp.A01(str);
        this.A0O.EhX(A012);
        if (this.A1E != null) {
            boolean isEmpty = TextUtils.isEmpty(BiY);
            boolean isEmpty2 = TextUtils.isEmpty(A012);
            if (isEmpty) {
                if (!isEmpty2) {
                    eZe = C48136EZe.SEARCH_QUERY_STATE;
                } else {
                    return;
                }
            } else if (isEmpty2) {
                eZe = C48136EZe.SEARCH_NULL_STATE;
            } else {
                return;
            }
            this.A07 = eZe;
        }
    }

    public final void Dmq(SearchController searchController, Integer num, Integer num2) {
        this.A0R = num;
        A05(this);
        if (num2 == AnonymousClass05K.A00 && num == AnonymousClass05K.A01) {
            this.A0i = true;
        }
    }

    private Intent A00(boolean z) {
        ArrayList A1D2;
        Intent A092 = DbS.A09();
        ArrayList A042 = this.A0F.A04(MXS.class);
        A092.putExtra(AnonymousClass000.A00(2737), z);
        A092.putExtra("DirectPrivateStoryRecipientFragment.DIRECT_SHARE_SHEET_LOGGING_REWRITE_IS_ENABLED", AnonymousClass7TF.A1V(this.A1E));
        A092.putExtra("bundle_extra_one_tap_send_taps", this.A02).putExtra("bundle_extra_one_tap_undo_taps", this.A03).putExtra("bundle_extra_ingest_session", this.A0D).putParcelableArrayListExtra(AnonymousClass000.A00(2736), A042).putExtra("bundle_extra_user_story_targets", AnonymousClass7TE.A1D(this.A1K));
        if (this.A0d) {
            A092.putExtra(AnonymousClass000.A00(25), this.A0P.A06());
        }
        A092.putParcelableArrayListExtra(AnonymousClass000.A00(2735), this.A0F.A04(C65291Lqk.class));
        if (this.A0b) {
            ArrayList A032 = this.A0F.A03(LRm.A03, C65290Lqj.class);
            if (A032.isEmpty()) {
                A1D2 = null;
            } else {
                A1D2 = AnonymousClass7TE.A1D(((C65290Lqj) A032.get(0)).A04);
            }
            A092.putParcelableArrayListExtra(AnonymousClass000.A00(2734), A1D2);
        }
        if (this.A0L != null) {
            A092.putExtra("DirectPrivateStoryRecipientController.DIRECT_FORGOT_TO_SEND_TO_ORIGINAL_RECIPIENT", this.A0j);
            A092.putExtra("DirectPrivateStoryRecipientController.DIRECT_SEND_TO_ORIGINAL_RECIPIENT_WITH_DIALOG", this.A0f);
        }
        return A092;
    }

    public static ArrayList A01(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, ArrayList arrayList) {
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A1C2.add(OX4.A00(0nY.A00(), new MB7(11, directPrivateStoryRecipientController, it.next()), 204));
        }
        return A1C2;
    }

    public static ArrayList A02(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, ArrayList arrayList) {
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A1C2.add(OX4.A00(0nY.A00(), new MB7(10, directPrivateStoryRecipientController, it.next()), 117));
        }
        return A1C2;
    }

    public static void A0B(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget directShareTarget = (DirectShareTarget) it.next();
            if (C66651MaK.A02(directPrivateStoryRecipientController.A0B, directShareTarget) || C66651MaK.A01(directPrivateStoryRecipientController.A0B, directShareTarget)) {
                it.remove();
            }
        }
    }

    public static void A0C(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget directShareTarget = (DirectShareTarget) it.next();
            if (directShareTarget.A04(directPrivateStoryRecipientController.A0B.A06, false) == AnonymousClass05K.A0B || AnonymousClass48O.A06(Integer.valueOf(directShareTarget.A01))) {
                it.remove();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r1 != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dam(X.C337257fy r14) {
        /*
            r13 = this;
            java.lang.String r0 = r14.BiY()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x000e
            r13.A0D(r14)
            return
        L_0x000e:
            X.K9B r3 = r13.A0I
            r3.A00 = r14
            r3.A06()
            X.7fy r2 = r3.A00
            java.lang.String r0 = r2.BiY()
            r8 = 1
            r10 = 0
            if (r0 == 0) goto L_0x0026
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            java.lang.Object r7 = r2.Bo1()
            java.util.List r7 = (java.util.List) r7
            if (r0 != 0) goto L_0x008e
            boolean r0 = r2.isLoading()
            if (r0 != 0) goto L_0x0042
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0042
            java.lang.String r1 = r3.A09
            X.Dez r0 = r3.A05
            r3.A08(r0, r1)
        L_0x0042:
            com.instagram.common.session.UserSession r5 = r3.A03
            java.lang.String r6 = "story_share_sheet"
            X.OVf r4 = X.F9W.A00
            X.DbW.A1N(r5, r10, r7)
            r9 = r8
            r11 = r10
            r12 = r8
            X.ON1 r2 = r4.A01(r5, r6, r7, r8, r9, r10, r11, r12)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36317521901262094(0x810698000c150e, double:3.0306853170563365E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0096
            X.7fy r0 = r3.A00
            boolean r0 = r0.CWX()
            if (r0 != 0) goto L_0x0096
            java.util.ArrayList r0 = r2.A0D
            java.util.Iterator r1 = r0.iterator()
        L_0x006d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r1.next()
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x006d
            r1.remove()
            goto L_0x006d
        L_0x0083:
            java.util.ArrayList r0 = r2.A03
            r0.clear()
            java.util.ArrayList r0 = r2.A04
            r0.clear()
            goto L_0x0096
        L_0x008e:
            com.instagram.common.session.UserSession r1 = r3.A03
            java.lang.String r0 = "story_share_sheet"
            X.ON1 r2 = X.F9W.A00(r1, r0, r7)
        L_0x0096:
            java.util.ArrayList r1 = r2.A0D
            r0 = 6
            int r4 = X.K9B.A00(r3, r1, r0, r10, r10)
            java.util.ArrayList r2 = r2.A06
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00b3
            X.L2e r1 = r3.A04
            X.K9e r0 = r3.A01
            r3.A08(r0, r1)
            r1 = 12
            boolean r0 = r3.A0B
            X.K9B.A00(r3, r2, r1, r4, r0)
        L_0x00b3:
            X.7fy r0 = r3.A00
            boolean r0 = r0.isLoading()
            if (r0 == 0) goto L_0x00ce
            X.TwD r2 = r3.A07
            java.lang.String r1 = r3.A0A
            int r0 = r3.A02
            r2.A01 = r1
            r2.A00 = r0
            X.Viv r1 = r3.A08
            r1.A00 = r8
            X.EAC r0 = r3.A06
            r3.A09(r0, r2, r1)
        L_0x00ce:
            r3.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController.Dam(X.7fy):void");
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1716334795);
        int A033 = AnonymousClass0fD.A03(-1134982440);
        if (TextUtils.isEmpty(this.A0O.BiY())) {
            A0D(this.A0O);
        }
        AnonymousClass0fD.A0A(243720563, A033);
        AnonymousClass0fD.A0A(733977332, A032);
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A032 = AnonymousClass0fD.A03(-256712941);
        super.onScrollStateChanged(recyclerView, i);
        this.A1M.onScrollStateChanged(recyclerView, i);
        AnonymousClass0fD.A0A(2141352935, A032);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A032 = AnonymousClass0fD.A03(711849054);
        super.onScrolled(recyclerView, i, i2);
        this.A1M.onScrolled(recyclerView, i, i2);
        AnonymousClass0fD.A0A(632236414, A032);
    }
}
