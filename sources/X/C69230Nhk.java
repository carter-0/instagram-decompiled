package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.Nhk  reason: case insensitive filesystem */
public final class C69230Nhk extends NKS implements C243853aD, C74435Pup {
    public static final String __redex_internal_original_name = "SelfRemediationBottomSheetFragmentImpl";
    public float A00;
    public int A01;
    public C331157Pu A02;
    public User A03;
    public NL1 A04;
    public C49530ExC A05;
    public C74477PvX A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final String A0B = "comment_reporting_self_remediation_bottom_sheet";
    public final AnonymousClass0eM A0C = C227642jf.A02(this);

    public final void D2Y(FollowStatus followStatus, User user) {
    }

    public final void D2p(User user) {
    }

    public final void DGO(User user) {
    }

    public final void DGP(User user) {
    }

    public final void DGQ(C267064at r1) {
    }

    public final void DGR(EWA ewa, User user) {
    }

    public final void Dix(C69313NjE njE) {
        int ordinal = njE.ordinal();
        String str = "commenterUser";
        if (ordinal == 0) {
            if (this.A05 != null) {
                if (this.A03 != null) {
                    FragmentActivity requireActivity = requireActivity();
                    UserSession A0l = AnonymousClass7TE.A0l(this.A0C);
                    User user = this.A03;
                    if (user != null) {
                        String str2 = this.A0B;
                        String str3 = this.A07;
                        if (str3 == null) {
                            str = "commentId";
                        } else {
                            JSONObject A11 = DbS.A11();
                            A11.put("surface", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
                            A11.put("comment_id", str3);
                            C49960FGs.A04(requireActivity, A0l, this, user, "comment_reporting_self_remediation_bottom_sheet", str2, A11, this.A09);
                            return;
                        }
                    }
                }
            }
            0qQ.A0F("reportingLogger");
            throw AnonymousClass00P.createAndThrow();
        } else if (ordinal == 2) {
            if (this.A05 != null) {
                if (this.A03 != null) {
                    C331157Pu r5 = this.A02;
                    if (r5 != null) {
                        AnonymousClass0eM r3 = this.A0C;
                        C331127Pr A0f = DbX.A0f(r3);
                        Resources A052 = DbV.A05(this);
                        User user2 = this.A03;
                        if (user2 != null) {
                            A0f.A0d = AnonymousClass7TF.A0e(A052, user2.getUsername(), 2131973067);
                            DbS.A1S(A0f, this.A08);
                            A0f.A03 = this.A00;
                            UserSession A0l2 = AnonymousClass7TE.A0l(r3);
                            User user3 = this.A03;
                            if (user3 != null) {
                                r5.A0F(C49960FGs.A00(A0l2, user3, new C69210NhQ(), "comment_thread"), A0f);
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
            0qQ.A0F("reportingLogger");
            throw AnonymousClass00P.createAndThrow();
        } else if (ordinal == 5) {
            C74477PvX pvX = this.A06;
            if (pvX != null) {
                pvX.DfO();
                return;
            }
            return;
        } else if (ordinal == 6) {
            C74477PvX pvX2 = this.A06;
            if (pvX2 != null) {
                pvX2.Dv6();
            }
            if (!this.A09) {
                C66580MXl.A1G(this);
                return;
            }
            return;
        } else if (ordinal == 1) {
            C74477PvX pvX3 = this.A06;
            if (pvX3 != null) {
                pvX3.CyO();
            }
            if (this.A05 != null) {
                if (this.A03 != null) {
                    return;
                }
            }
            0qQ.A0F("reportingLogger");
            throw AnonymousClass00P.createAndThrow();
        } else {
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return DbT.A0X(this.A0C);
    }

    public final void Diw(C69313NjE njE) {
        String str;
        if (this.A05 == null) {
            str = "reportingLogger";
        } else if (this.A03 == null) {
            str = "commenterUser";
        } else {
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return this.A0B;
    }

    public final void onCreate(Bundle bundle) {
        C69326NjR njR;
        int i;
        int A022 = AnonymousClass0fD.A02(-2041001204);
        C69230Nhk.super.onCreate(bundle);
        if (bundle != null) {
            C66580MXl.A1G(this);
            i = 480206963;
        } else {
            Bundle requireArguments = requireArguments();
            AnonymousClass0eM r4 = this.A0C;
            this.A05 = ORV.A00(AnonymousClass7TE.A0l(r4), requireArguments.getBoolean("ReportingConstants.ARG_IS_ENCRYPTED_THREAD"));
            this.A08 = requireArguments.getBoolean("ReportingConstants.ARG_IS_FULL_SCREEN_ENABLED");
            this.A00 = requireArguments.getFloat("ReportingConstants.ARG_INITIAL_OPENING_HEIGHT_RATIO");
            this.A07 = JTP.A0m(requireArguments, "SelfRemediationBottomSheetFragment.ARG_COMMENT_ID");
            User A023 = JTR.A0u(r4).A02(JTP.A0m(requireArguments, "SelfRemediationBottomSheetFragment.COMMENTER_USER_ID"));
            if (A023 != null) {
                this.A03 = A023;
                this.A01 = requireArguments.getInt("SelfRemediationBottomSheetFragment.AGR_COMMENT_HOST_SURFACE_TYPE");
                this.A0A = requireArguments.getBoolean("SelfRemediationBottomSheetFragment.ARG_SHOW_RESTRICT_ACTIONS", false);
                this.A09 = requireArguments.getBoolean("SelfRemediationBottomSheetFragment.ARG_KEEP_OPEN_AFTER_ACTION", false);
                User user = this.A03;
                String str = "commenterUser";
                if (user != null) {
                    if (user.B6o() == FollowStatus.A08) {
                        C294705mt A002 = C294695ms.A00(AnonymousClass7TE.A0l(r4));
                        User user2 = this.A03;
                        if (user2 != null) {
                            A002.A0G(user2, false);
                        }
                    }
                    Context requireContext = requireContext();
                    UserSession A0l = AnonymousClass7TE.A0l(r4);
                    User user3 = this.A03;
                    if (user3 != null) {
                        NL1 nl1 = new NL1(requireContext, A0l, user3, this, this, this.A01, this.A0A);
                        this.A04 = nl1;
                        A0V(nl1);
                        NL1 nl12 = this.A04;
                        if (nl12 == null) {
                            str = "adapter";
                        } else {
                            nl12.A06();
                            if (nl12.A00 == 8) {
                                njR = C69326NjR.REPLY;
                            } else {
                                njR = C69326NjR.COMMENT;
                            }
                            nl12.A08(nl12.A02, njR);
                            C61083JwL jwL = new C61083JwL(nl12.A01, C69328NjT.VIEW_TYPE_ROW);
                            C69313NjE njE = C69313NjE.MUTE;
                            C68513NLk nLk = nl12.A03;
                            nl12.A09(nLk, jwL, njE);
                            if (nl12.A04) {
                                nl12.A09(nLk, jwL, C69313NjE.RESTRICT);
                                nl12.A09(nLk, jwL, C69313NjE.UNRESTRICT);
                            }
                            nl12.A09(nLk, jwL, C69313NjE.UNFOLLOW);
                            nl12.A09(nLk, jwL, C69313NjE.BLOCK);
                            nl12.A07();
                            if (this.A05 == null) {
                                str = "reportingLogger";
                            } else if (this.A07 == null) {
                                str = "commentId";
                            } else if (this.A03 != null) {
                                i = -1045767211;
                            }
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            throw AnonymousClass7TE.A0y();
        }
        AnonymousClass0fD.A09(i, A022);
    }
}
