package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.NIg  reason: case insensitive filesystem */
public final class C68443NIg extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DirectQuickReplyComposerFragment";
    public UserSession A00;
    public C69670Nps A01;
    public C74325Pt1 A02;
    public View A03;
    public ImageView A04;
    public RecyclerView A05;
    public OVX A06;

    public final String getModuleName() {
        return "direct_quick_reply_fragment";
    }

    public final AnonymousClass0wW getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(C68443NIg nIg, C67569Mq3 mq3) {
        String str;
        Bundle A0a = AnonymousClass7TE.A0a();
        C69670Nps nps = nIg.A01;
        if (nps == null) {
            str = "analyticsData";
        } else {
            nps.A00(A0a);
            if (mq3 != null) {
                A0a.putString("DirectEditQuickReplyFragment.quick_reply_id", mq3.A00());
            }
            UserSession userSession = nIg.A00;
            if (userSession == null) {
                str = "userSession";
            } else {
                DbT.A1L(nIg, DbS.A0b(nIg.requireActivity(), A0a, userSession, ModalActivity.class, "direct_edit_quick_reply"));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1219441839);
        C68443NIg.super.onCreate(bundle);
        this.A00 = DbX.A0V(this);
        AnonymousClass0fD.A09(1570681142, A022);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.Nps, java.lang.Object] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(208710910);
        0qQ.A0B(layoutInflater, 0);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("source_module");
        String string2 = requireArguments.getString("waterfall_id");
        String string3 = requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        ? obj = new Object();
        obj.A01 = string;
        obj.A02 = string2;
        obj.A00 = string3;
        this.A01 = obj;
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_quick_reply, viewGroup, false);
        this.A03 = inflate;
        if (inflate != null) {
            DbT.A18(requireContext(), AnonymousClass7TG.A0R(inflate, R.id.quick_reply_title), 2131960262);
            View view = this.A03;
            ImageView imageView = null;
            if (view != null) {
                imageView = DbS.A0G(view, R.id.add_quick_reply_button);
            }
            this.A04 = imageView;
            if (imageView != null) {
                DbU.A12(requireContext(), imageView, 2131972633);
                imageView.setVisibility(0);
                C71401Ok0.A01(imageView, 23, this);
            }
            View view2 = this.A03;
            if (view2 != null) {
                View A0F = DbY.A0F(view2, R.id.stub_quick_reply_text_list);
                0qQ.A0C(A0F, C273654mx.A00(4));
                RecyclerView recyclerView = (RecyclerView) A0F;
                this.A05 = recyclerView;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                UserSession userSession = this.A00;
                String str = "userSession";
                if (userSession != null) {
                    RecyclerView recyclerView2 = this.A05;
                    if (recyclerView2 != null) {
                        View view3 = this.A03;
                        if (view3 != null) {
                            C71662eb A0T = DbY.A0T(view3, R.id.empty_view);
                            View view4 = this.A03;
                            if (view4 != null) {
                                View requireViewById = view4.requireViewById(R.id.loading_spinner);
                                P1J p1j = new P1J(this);
                                UserSession userSession2 = this.A00;
                                if (userSession2 != null) {
                                    C66777McN A002 = C66778McO.A00(userSession2);
                                    C69670Nps nps = this.A01;
                                    if (nps == null) {
                                        str = "analyticsData";
                                    } else {
                                        OVX ovx = new OVX(requireViewById, recyclerView2, this, userSession, A0T, nps, p1j, A002);
                                        this.A06 = ovx;
                                        ovx.A01();
                                        View view5 = this.A03;
                                        AnonymousClass0fD.A09(-746432181, A022);
                                        return view5;
                                    }
                                }
                            } else {
                                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                                i = -870841461;
                            }
                        } else {
                            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                            i = -2128191721;
                        }
                    } else {
                        illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                        i = -614713200;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -1972092603;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -986581946;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-509018829);
        super.onDestroy();
        OVX ovx = this.A06;
        if (ovx == null) {
            0qQ.A0F("quickReplyTextListController");
            throw AnonymousClass00P.createAndThrow();
        }
        ovx.A06.A02(ovx.A01, C67583MqH.class);
        AnonymousClass0fD.A09(1595632512, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1981139834);
        super.onDestroyView();
        this.A03 = null;
        this.A05 = null;
        this.A04 = null;
        AnonymousClass0fD.A09(885317547, A022);
    }
}
