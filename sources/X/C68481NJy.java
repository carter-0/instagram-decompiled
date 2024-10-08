package X;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.request.graphql.IGDirectChangeNicknameQueryResponseImpl;
import com.instagram.user.model.User;

/* renamed from: X.NJy  reason: case insensitive filesystem */
public final class C68481NJy extends AnonymousClass4DH implements C268594df, TextWatcher {
    public static final String __redex_internal_original_name = "ThreadDetailsNicknameChangeFragment";
    public 1Ng A00;
    public C74449Pv4 A01;
    public C254793t3 A02;
    public Capabilities A03;
    public String A04;
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C73899Pla(this, 4));
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new C73899Pla(this, 5));
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final 1wn A08 = C71932OtG.A00(this, 18);
    public final 1wn A09 = C71932OtG.A00(this, 19);
    public final boolean A0A = true;

    public final void A01(C254793t3 r20, Integer num, String str) {
        Editable text;
        String str2 = str;
        0qQ.A0B(str2, 1);
        if (this.A04 != null || ((text = ((EditText) AnonymousClass7TE.A14(this.A05)).getText()) != null && text.length() != 0)) {
            UserSession A0l = AnonymousClass7TE.A0l(this.A07);
            C254793t3 r6 = r20;
            String str3 = ((C254763t0) r6).A00;
            String A0f = AnonymousClass7TF.A0f((EditText) AnonymousClass7TE.A14(this.A05));
            C73673Phm phm = new C73673Phm(r6, this, str2, 6);
            0qQ.A0B(A0l, 0);
            AnonymousClass7TF.A1C(str3, 1, A0f);
            1vn A012 = 1vm.A01(A0l);
            2IS A042 = C41845B3m.A04();
            2IS A043 = C41845B3m.A04();
            AnonymousClass0K0 r62 = GraphQlCallInput.A02;
            0Df A032 = C41845B3m.A03(r62, str3, "ig_thread_igid");
            2IV r8 = A042.A00;
            r8.A02().A0E(A032, "metadata");
            0Df A033 = C41845B3m.A03(r62, A0f, C66654MaN.A01(0, 8, 88));
            0Df.A00(A033, str2, "user_igid");
            r8.A02().A0E(A033, "data");
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "IGDirectChangeNicknameQuery", A042.getParamsCopy(), A043.getParamsCopy(), IGDirectChangeNicknameQueryResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xig_direct_change_nickname", AnonymousClass7TE.A1C());
            A012.ATL(C71564Omz.A00, new C71570On7(phm, 7), pandoGraphQLRequest);
            A00(num, AnonymousClass05K.A0C, str2);
        }
    }

    public final int AqL() {
        return -2;
    }

    public final float CMx() {
        return 0.8f;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final boolean Erf() {
        return true;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        Integer num;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        17i A0u = JTR.A0u(this.A07);
        Bundle bundle2 = this.mArguments;
        String str4 = null;
        if (bundle2 != null) {
            str = bundle2.getString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
        } else {
            str = null;
        }
        User A022 = A0u.A02(str);
        if (A022 != null) {
            DbX.A0b(view, R.id.nickname_change_selected_user_profile_photo).setUrl(C253833rU.A00(DbT.A09(A022.Bh3().getUrl()), -1, -1), this);
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                str2 = bundle3.getString(C66654MaN.A01(0, 8, 88));
            } else {
                str2 = null;
            }
            this.A04 = str2;
            AnonymousClass0eM r4 = this.A05;
            TextView A0A2 = JTQ.A0A(r4);
            if (str2 != null) {
                A0A2.setText(this.A04);
            } else {
                Bundle bundle4 = this.mArguments;
                if (bundle4 != null) {
                    str3 = bundle4.getString("username_hint");
                } else {
                    str3 = null;
                }
                A0A2.setHint(str3);
            }
            JTQ.A0A(r4).addTextChangedListener(this);
            0nA.A0Q(AnonymousClass7TH.A06(r4));
            JTO.A0I(this.A06).setText(002.A03(DbX.A05(this.A04), "/32"));
            Bundle bundle5 = this.mArguments;
            if (bundle5 != null) {
                str4 = bundle5.getString("nickname_change_entry_point");
            }
            if (0qQ.A0K(str4, "thread_details") || !0qQ.A0K(str4, "admin_text")) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A01;
            }
            A00(num, AnonymousClass05K.A00, A022.getId());
        }
    }

    private final void A00(Integer num, Integer num2, String str) {
        String str2;
        UserSession A0l = AnonymousClass7TE.A0l(this.A07);
        C254763t0 r0 = (C254763t0) this.A02;
        if (r0 != null) {
            str2 = r0.A00;
        } else {
            str2 = null;
        }
        C69938Nue.A00(A0l, num, num2, str2, str);
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    public final boolean CPc() {
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final boolean isScrolledToTop() {
        return this.A0A;
    }

    public final void onBottomSheetClosed() {
        A00(AnonymousClass05K.A00, AnonymousClass05K.A0N, (String) null);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Integer num;
        TextView A0I = JTO.A0I(this.A06);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (charSequence != null) {
            num = Integer.valueOf(charSequence.length());
        } else {
            num = null;
        }
        A1A.append(num);
        A0I.setText(AnonymousClass7TF.A0l("/32", A1A));
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final /* synthetic */ float CoU() {
        return 0.8f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1359764582);
        C68481NJy.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        C254793t3 A002 = OXL.A00(requireArguments, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        this.A02 = A002;
        if (A002 != null) {
            Capabilities capabilities = (Capabilities) requireArguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
            this.A03 = capabilities;
            if (capabilities != null) {
                this.A01 = C330397Mp.A01(requireContext(), AnonymousClass7TE.A0l(this.A07), capabilities, A002);
            }
        }
        C291035gP r1 = new C291035gP(AnonymousClass05K.A0C);
        1Ng A0R = DbX.A0R(this.A07);
        this.A00 = A0R;
        if (A0R != null) {
            A0R.A00(r1);
            1Ng r2 = this.A00;
            if (r2 != null) {
                r2.A01(this.A08, C291035gP.class);
                1Ng r22 = this.A00;
                if (r22 != null) {
                    r22.A01(this.A09, C71905Osn.class);
                    AnonymousClass0fD.A09(1194477323, A022);
                    return;
                }
            }
        }
        0qQ.A0F("igEventBus");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(135884265);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_thread_details_nickname_change_bottomsheet, viewGroup, false);
        AnonymousClass0fD.A09(26863146, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-575732960);
        super.onDestroy();
        1Ng r2 = this.A00;
        if (r2 != null) {
            r2.A02(this.A08, C291035gP.class);
            1Ng r22 = this.A00;
            if (r22 != null) {
                r22.A02(this.A09, C71905Osn.class);
                AnonymousClass0fD.A09(-345583606, A022);
                return;
            }
        }
        0qQ.A0F("igEventBus");
        throw AnonymousClass00P.createAndThrow();
    }
}
