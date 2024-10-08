package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.security.InvalidParameterException;

/* renamed from: X.NIe  reason: case insensitive filesystem */
public final class C68441NIe extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DirectPendingInboxFolderFragment";
    public ViewStub A00;
    public UserSession A01;
    public IgFrameLayout A02;
    public C71153OeR A03;
    public C229132mt A04;
    public C238143As A05;
    public EmptyStateView A06;
    public final C70497O8w A07 = new C70497O8w(this);

    public final String getModuleName() {
        return "pending_inbox_folder";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C74463PvI A0Y;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = DbU.A0D(view, R.id.thread_list_stub);
        this.A06 = (EmptyStateView) view.requireViewById(R.id.direct_folder_empty_view);
        IgFrameLayout igFrameLayout = (IgFrameLayout) view.requireViewById(R.id.direct_folder_container);
        this.A02 = igFrameLayout;
        if (igFrameLayout != null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                Object serializable = requireArguments().getSerializable("thread_folder_name");
                if (serializable == null) {
                    serializable = C67256Mkq.PENDING;
                }
                int i = 2131959784;
                if (serializable == C67256Mkq.SPAM) {
                    i = 2131959960;
                }
                str = activity.getString(i);
            } else {
                str = null;
            }
            igFrameLayout.setContentDescription(str);
            C71153OeR oeR = this.A03;
            if (oeR != null) {
                oeR.A0d();
                C71153OeR oeR2 = this.A03;
                if (oeR2 != null) {
                    C67256Mkq mkq = (C67256Mkq) requireArguments().getSerializable("thread_folder_name");
                    if (mkq == null) {
                        mkq = C67256Mkq.PENDING;
                    }
                    int ordinal = mkq.ordinal();
                    if (ordinal == 1) {
                        A0Y = oeR2.A0Y();
                    } else if (ordinal == 3) {
                        A0Y = oeR2.A0Z();
                    } else if (ordinal == 8) {
                        A0Y = oeR2.A0a();
                        if (A0Y == null) {
                            throw new InvalidParameterException();
                        }
                    } else if (ordinal == 9) {
                        A0Y = oeR2.A0X();
                    } else {
                        throw new InvalidParameterException();
                    }
                    0qQ.A07(A0Y);
                    PIG pig = new PIG(requireContext(), A0Y);
                    ViewStub viewStub = this.A00;
                    if (viewStub != null) {
                        viewStub.setLayoutResource(R.layout.inbox_refreshable_thread_list_recyclerview_legacy);
                        ViewStub viewStub2 = this.A00;
                        if (viewStub2 != null) {
                            RecyclerView A0c = JTR.A0c(viewStub2.inflate(), R.id.inbox_refreshable_thread_list_recyclerview);
                            DbY.A15(this, A0c);
                            C238143As r1 = (C238143As) C238103Ao.A00(A0c);
                            if (r1 != null) {
                                r1.APL();
                                r1.ENw(pig);
                            }
                            C229132mt r6 = this.A04;
                            if (r6 != null) {
                                UserSession userSession = this.A01;
                                if (userSession != null) {
                                    C14230TsD A002 = C14293TtR.A00(userSession, r6, pig, AnonymousClass7TE.A0v(), AnonymousClass05K.A01, 5, false);
                                    if (r1 != null) {
                                        r1.AAD(A002);
                                    }
                                } else {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                            }
                            this.A05 = r1;
                            C71153OeR oeR3 = this.A03;
                            if (oeR3 != null) {
                                oeR3.A07 = this.A07;
                                oeR3.A0m(false, false);
                                A0Y.AF6();
                                C71153OeR oeR4 = this.A03;
                                if (oeR4 != null) {
                                    oeR4.A0j();
                                    return;
                                }
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void beforeOnDestroy() {
        C71153OeR oeR = this.A03;
        if (oeR != null) {
            oeR.A07 = null;
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(1878021046);
        C68441NIe.super.onCreate(bundle);
        UserSession A0U = DbS.A0U(requireArguments());
        this.A01 = A0U;
        if (A0U != null) {
            C69004Ncg A002 = O0Z.A00(A0U);
            Object serializable = requireArguments().getSerializable("thread_folder_name");
            if (serializable == null) {
                serializable = C67256Mkq.PENDING;
            }
            if (C67256Mkq.PENDING == serializable) {
                str = "open_pending";
            } else {
                str = "open_other";
            }
            A002.A04(str, (String) null);
            AnonymousClass0fD.A09(1766743438, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-1164740801, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1498564546);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_permissions_inbox_folder, viewGroup, false);
        AnonymousClass0fD.A09(-222737964, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1817269912);
        super.onDestroyView();
        C71153OeR oeR = this.A03;
        if (oeR != null) {
            oeR.A0e();
        }
        C71153OeR oeR2 = this.A03;
        if (oeR2 != null) {
            oeR2.A0i();
        }
        this.A06 = null;
        this.A00 = null;
        this.A02 = null;
        AnonymousClass0fD.A09(1702117029, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(166864962);
        C68441NIe.super.onPause();
        C71153OeR oeR = this.A03;
        if (oeR != null) {
            oeR.A0f();
        }
        AnonymousClass0fD.A09(-433809959, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(312134330);
        super.onResume();
        C71153OeR oeR = this.A03;
        if (oeR != null) {
            oeR.A0g();
        }
        IgFrameLayout igFrameLayout = this.A02;
        if (igFrameLayout != null) {
            igFrameLayout.sendAccessibilityEvent(8);
            AnonymousClass0fD.A09(1857415295, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(712415746, A022);
        throw A0y;
    }
}
