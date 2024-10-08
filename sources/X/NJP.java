package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

public final class NJP extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DirectQuickReplySettingsFragment";
    public UserSession A00;
    public C69670Nps A01;
    public View A02;
    public OVX A03;
    public boolean A04;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131960262);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A00();
        DbX.A1A(C71401Ok0.A00(this, 24), A0K, r3);
        AnonymousClass3JR A0K2 = DbS.A0K();
        A0K2.A06 = R.drawable.instagram_add_pano_outline_24;
        A0K2.A05 = 2131952348;
        DbX.A19(C71401Ok0.A00(this, 25), A0K2, r3);
    }

    public final String getModuleName() {
        return "direct_quick_reply_settings_fragment";
    }

    public final AnonymousClass0wW getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        if (!this.A04) {
            return false;
        }
        this.A04 = false;
        FragmentActivity requireActivity = requireActivity();
        UserSession userSession = this.A00;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        }
        C48751Eja.A00(requireActivity, userSession);
        return true;
    }

    public static final void A00(NJP njp, C67569Mq3 mq3) {
        String str;
        Bundle A0a = AnonymousClass7TE.A0a();
        C69670Nps nps = njp.A01;
        if (nps == null) {
            str = "analyticsData";
        } else {
            nps.A00(A0a);
            if (mq3 != null) {
                A0a.putString("DirectEditQuickReplyFragment.quick_reply_id", mq3.A00());
            }
            UserSession userSession = njp.A00;
            if (userSession == null) {
                str = "userSession";
            } else {
                DbS.A0b(njp.requireActivity(), A0a, userSession, ModalActivity.class, "direct_edit_quick_reply").A0D(njp, -1);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 504) {
            this.A04 = true;
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1860533989);
        NJP.super.onCreate(bundle);
        this.A00 = DbX.A0V(this);
        AnonymousClass0fD.A09(199050013, A022);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.Nps, java.lang.Object] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(1960565335);
        0qQ.A0B(layoutInflater, 0);
        this.A02 = layoutInflater.inflate(R.layout.fragment_direct_quick_reply_settings, viewGroup, false);
        String string = requireArguments().getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        String A0b = AnonymousClass7TF.A0b();
        ? obj = new Object();
        obj.A01 = "settings";
        obj.A02 = A0b;
        obj.A00 = string;
        this.A01 = obj;
        UserSession userSession = this.A00;
        String str = "userSession";
        if (userSession != null) {
            View view = this.A02;
            if (view != null) {
                RecyclerView A0I = DbT.A0I(view, R.id.quick_reply_text_list);
                View view2 = this.A02;
                if (view2 != null) {
                    C71662eb A0T = DbY.A0T(view2, R.id.empty_view);
                    View view3 = this.A02;
                    if (view3 != null) {
                        View requireViewById = view3.requireViewById(R.id.loading_spinner);
                        P1K p1k = new P1K(this);
                        UserSession userSession2 = this.A00;
                        if (userSession2 != null) {
                            C66777McN A002 = C66778McO.A00(userSession2);
                            C69670Nps nps = this.A01;
                            if (nps == null) {
                                str = "analyticsData";
                            } else {
                                OVX ovx = new OVX(requireViewById, A0I, this, userSession, A0T, nps, p1k, A002);
                                this.A03 = ovx;
                                ovx.A01();
                                View view4 = this.A02;
                                AnonymousClass0fD.A09(78227835, A022);
                                return view4;
                            }
                        }
                    } else {
                        illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                        i = 285193695;
                    }
                } else {
                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                    i = -798238019;
                }
            } else {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = -456960218;
            }
            AnonymousClass0fD.A09(i, A022);
            throw illegalStateException;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-644476274);
        super.onDestroy();
        OVX ovx = this.A03;
        if (ovx != null) {
            ovx.A06.A02(ovx.A01, C67583MqH.class);
        }
        AnonymousClass0fD.A09(-1631998506, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(2069400316);
        super.onDestroyView();
        this.A02 = null;
        AnonymousClass0fD.A09(2108684133, A022);
    }
}
