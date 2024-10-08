package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class NV6 extends NV8 implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "DirectStackCardGalleryFragment";
    public OMC A00;
    public MessageIdentifier A01;
    public AnonymousClass6ST A02;
    public String A03;
    public String A04;
    public ArrayList A05 = AnonymousClass7TE.A1C();
    public String A06;
    public List A07 = AnonymousClass7TE.A1C();
    public List A08 = AnonymousClass7TE.A1C();
    public boolean A09;
    public final 1wn A0A = C71932OtG.A00(this, 9);

    public final String getModuleName() {
        return "direct_individual_stack_card_gallery_fragment";
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.0r1, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        List list;
        boolean z;
        List list2;
        String str;
        String str2;
        String str3;
        String string;
        ArrayList parcelableArrayList;
        ArrayList parcelableArrayList2;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (parcelableArrayList2 = bundle2.getParcelableArrayList("card_gallery_recipients")) == null) {
            list = 0sn.A00;
        } else {
            list = 00k.A0a(parcelableArrayList2);
        }
        this.A08 = list;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            z = bundle3.getBoolean("removed_clips_collaborators_from_chat");
        } else {
            z = false;
        }
        this.A09 = z;
        Bundle bundle4 = this.mArguments;
        if (bundle4 == null || (parcelableArrayList = bundle4.getParcelableArrayList("all_clips_media_receivers_from_chat")) == null) {
            list2 = 0sn.A00;
        } else {
            list2 = 00k.A0a(parcelableArrayList);
        }
        this.A07 = list2;
        Bundle bundle5 = this.mArguments;
        String str4 = null;
        if (bundle5 != null) {
            str = bundle5.getString("source_chat_thread_name");
        } else {
            str = null;
        }
        this.A06 = str;
        Bundle bundle6 = this.mArguments;
        if (bundle6 != null) {
            str2 = bundle6.getString("surface");
        } else {
            str2 = null;
        }
        this.A04 = str2;
        Bundle bundle7 = this.mArguments;
        if (bundle7 != null) {
            str3 = bundle7.getString("card_gallery_sender_id");
        } else {
            str3 = null;
        }
        this.A03 = str3;
        ? obj = new Object();
        obj.A00 = true;
        Bundle bundle8 = this.mArguments;
        if (bundle8 != null) {
            str4 = C66580MXl.A0t(bundle8);
        }
        if (str4 != null) {
            Bundle bundle9 = this.mArguments;
            if (bundle9 == null || (string = bundle9.getString("client_context")) == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            this.A01 = C66580MXl.A0i(str4, string);
            AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A0S)).A01(this.A0A, AnonymousClass7MH.class);
            Dba.A15(this, A0E().A03, new C58769IxG(37, obj, this, view, bundle), 40);
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final void A01(Bundle bundle, NV6 nv6) {
        NV6 nv62 = nv6;
        AnonymousClass0eM r3 = nv62.A0S;
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        0qQ.A0C(nv62.A0G(), "null cannot be cast to non-null type com.instagram.model.direct.threadkey.intf.UnifiedThreadKey");
        AnonymousClass7L7 r8 = new AnonymousClass7L7(A0l, new AnonymousClass7L5(bundle, "shared_stacks", "DirectMediaCardUtils", (C62320sa) null), (OKL) null, C333527Zh.A00(AnonymousClass7TE.A0l(r3)), new C73656PhV(nv62, 7), new C73656PhV(nv62, 8), C66580MXl.A15(nv62, 6), C73740Pj1.A00, C73741Pj2.A00);
        K6K A012 = K6K.A0s.A01(AnonymousClass7TE.A0l(r3), C66647MaG.A01(nv62.A0G()), nv62.A0G());
        C65262LqH lqH = new C65262LqH(0, nv62, AnonymousClass7IB.A00(nv62.requireContext(), AnonymousClass7TE.A0l(r3), new P38(nv62, r8)));
        AnonymousClass7H6 r9 = nv62.A00;
        if (r9 != null) {
            A012.A04((MV8) null, lqH, r9, (AnonymousClass7SL) null, (AnonymousClass2Ep) null, (C254783t2) null, DbV.A05(nv62).getString(2131959724), DbS.A04(0Tu.A05, AnonymousClass7TE.A0l(r3), 36597923138440255L), 0, false, false, true);
            AnonymousClass9HD r4 = AnonymousClass9HC.A1b;
            UserSession A0l2 = AnonymousClass7TE.A0l(r3);
            Parcelable.Creator creator = Capabilities.CREATOR;
            A012.ADi(C250563lf.A06(nv62.requireContext(), C66581MXm.A0X(A0l2, r4, 0sn.A00)).A07);
            AnonymousClass37D A0g = DbV.A0g(nv62, AnonymousClass37D.A00);
            if (A0g != null) {
                A0g.A0J(A012);
                return;
            }
            return;
        }
        0qQ.A0F("directAggregatedMediaViewerController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0L(2da r5) {
        if (0qQ.A0K(this.A04, "stacks") && !AnonymousClass7LY.A00(this.A02)) {
            String str = this.A03;
            AnonymousClass0eM r1 = this.A0S;
            if (C51966G9m.A1W(AnonymousClass7TE.A0l(r1), str)) {
                if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(r1), 36316448158781816L)) {
                    OMC omc = this.A00;
                    if (omc == null) {
                        0qQ.A0F("sharedStacksLogger");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    omc.A00("stack_grid_view");
                    AnonymousClass3JR A0K = DbS.A0K();
                    A0K.A06 = R.drawable.instagram_users_pano_outline_24;
                    A0K.A05 = 2131966734;
                    DbX.A19(new C71407Ok6(this, 52), A0K, r5);
                }
            }
        }
        super.A0L(r5);
    }

    public static final void A02(NV6 nv6) {
        C67759MuF A0E = nv6.A0E();
        C73656PhV phV = new C73656PhV(nv6, 3);
        String str = A0E.A09.A00;
        if (str != null) {
            AnonymousClass7TE.A1Z(new C66174MGl((Object) A0E, (Object) phV, str, (AnonymousClass4D7) null, 34), C318116oQ.A00(A0E));
        }
        C310336ap A0a = DbS.A0a();
        DbS.A19(nv6.requireContext(), A0a, 2131973637);
        A0a.A06();
        DbY.A1N(A0a);
    }

    public static final void A03(NV6 nv6) {
        28D r0;
        nv6.A0D();
        if (0qQ.A0K(nv6.A04, "stacks")) {
            r0 = 28D.A0y;
        } else {
            r0 = 28D.A0x;
        }
        Bundle A002 = C250563lf.A0C(r0).A00();
        A002.putParcelableArrayList(C273654mx.A00(32), nv6.A05);
        A002.putParcelableArrayList("ClipsConstants.ARG_CLIPS_COLLABORATORS", AnonymousClass7TE.A1D(nv6.A08));
        A002.putParcelableArrayList("ClipsConstants.ARGS_ALL_CLIPS_MEDIA_RECEIVERS_FROM_CHAT", AnonymousClass7TE.A1D(nv6.A07));
        A002.putString("ClipsConstants.ARGS_SOURCE_CHAT_THREAD_NAME", nv6.A06);
        A002.putBoolean("ClipsConstants.ARGS_REMOVED_CLIPS_COLLABORATORS_FROM_CHAT", nv6.A09);
        A002.putBoolean("ClipsConstants.ARG_SHOULD_CLOSE_CAMERA_ON_EXIT_SOUNDSYNC", true);
        A002.putSerializable(C273654mx.A00(19), C2801950r.CLIPS);
        AnonymousClass6W8 A022 = AnonymousClass6W8.A02(nv6.getActivity(), A002, AnonymousClass7TE.A0l(nv6.A0S), ModalActivity.class, AnonymousClass000.A00(1176));
        Dbc.A0y(A022);
        A022.A0A(nv6.getActivity(), 9587);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, X.NKo, X.NV6] */
    public final Collection getDefinitions() {
        Collection definitions = super.getDefinitions();
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.addAll(definitions);
        A1C.add(new NOK(DbW.A0E(this), AnonymousClass7TE.A0l(this.A0S)));
        return 00k.A0a(A1C);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 9587) {
            return;
        }
        if (i2 == 9683) {
            FG7.A01(requireContext(), AnonymousClass7TE.A0l(this.A0S));
        } else if (i2 == 9685) {
            String A16 = AnonymousClass7TE.A16(requireActivity(), 2131974167);
            C310336ap A0a = DbS.A0a();
            A0a.A0D = Html.fromHtml(A16);
            A0a.A06();
            DbY.A1N(A0a);
        }
    }

    public final boolean onBackPressed() {
        return A0M();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1787979642);
        super.onCreate(bundle);
        this.A00 = new OMC(AnonymousClass7TE.A0l(this.A0S));
        AnonymousClass0fD.A09(-35429554, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(693218762);
        super.onDestroyView();
        AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A0S)).A02(this.A0A, AnonymousClass7MH.class);
        AnonymousClass0fD.A09(-1245561969, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1591628566);
        super.onPause();
        AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A0S)).A02(this.A0A, AnonymousClass7MH.class);
        AnonymousClass0fD.A09(-161789646, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-392282586);
        super.onResume();
        AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A0S)).A01(this.A0A, AnonymousClass7MH.class);
        AnonymousClass0fD.A09(-1879267833, A022);
    }
}
