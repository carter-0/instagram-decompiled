package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerDirectData;
import com.instagram.clips.model.ClipsReplyBarData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.FriendshipStatus;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

public final class H4B extends 1P0 {
    public final /* synthetic */ C55686Hlj A00;

    public H4B(C55686Hlj hlj) {
        this.A00 = hlj;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        C250663lr optionalTreeField;
        C250663lr requiredTreeField;
        C250663lr reinterpretRequired;
        String str;
        int A03 = AnonymousClass0fD.A03(-1108070192);
        AnonymousClass3JC r1 = (AnonymousClass3JC) obj;
        int A032 = AnonymousClass0fD.A03(-1513344480);
        0qQ.A0B(r1, 0);
        C55686Hlj hlj = this.A00;
        C250663lr r5 = (C250663lr) r1.A01;
        if (!(r5 == null || (optionalTreeField = r5.getOptionalTreeField(0, AnonymousClass000.A00(4236), C42298BYp.class, -711053695)) == null || (requiredTreeField = optionalTreeField.getRequiredTreeField(0, "sender", C42297BYo.class, 1362168056)) == null || (reinterpretRequired = requiredTreeField.reinterpretRequired(0, C42296BYn.class, 719220713)) == null)) {
            UserSession userSession = hlj.A00;
            1E5 A002 = 1E4.A00(userSession);
            SimpleImageUrl simpleImageUrl = User.A08;
            User A01 = 1aC.A01(new 1E9(A002, AnonymousClass7TE.A1F(), false), (ImmutablePandoUserDict) reinterpretRequired.reinterpret(ImmutablePandoUserDict.class));
            if (A01 != null) {
                GNS.A00(userSession).A04(AnonymousClass7TE.A1I(new AnonymousClass9JD(new AnonymousClass9IL(-1, A01, 1))));
                FriendshipStatus B8F = A01.A03.B8F();
                if (B8F == null || !AnonymousClass7TF.A1Y(B8F.B6y(), true)) {
                    FriendshipStatus B8F2 = A01.A03.B8F();
                    if (B8F2 != null && AnonymousClass7TF.A1Y(B8F2.B6y(), false)) {
                        C55957HqO hqO = hlj.A01;
                        C227232is r52 = hqO.A02;
                        C267324bN A003 = GD9.A00(r52);
                        if (!(A003 == null || A003.A02 == null)) {
                            GBE gbe = r52.A09;
                            if (gbe != null) {
                                gbe.A0P = true;
                                hqO.A00();
                                GBE gbe2 = r52.A09;
                                if (gbe2 != null) {
                                    GNH gnh = gbe2.A0B;
                                    if (gnh != null) {
                                        AnonymousClass7TH.A0R(gnh.A02);
                                    }
                                    GBE gbe3 = r52.A09;
                                    if (gbe3 != null) {
                                        View view = hqO.A00;
                                        Context context = gbe3.A0Q;
                                        UserSession userSession2 = gbe3.A0a;
                                        GD9 gd9 = gbe3.A1L;
                                        C52029GCb gCb = gbe3.A06;
                                        if (gCb != null) {
                                            HKA hka = new HKA(context, gbe3.A19, userSession2, A01, gCb, gd9);
                                            gbe3.A0z.A00(hka);
                                            hka.onViewCreated(view, (Bundle) null);
                                            gbe3.A0F = hka;
                                            GBE gbe4 = r52.A09;
                                            if (gbe4 != null) {
                                                HKA hka2 = gbe4.A0F;
                                                if (hka2 != null) {
                                                    SwipeRefreshLayout swipeRefreshLayout = hqO.A01;
                                                    C52012GBj gBj = r52.A0N;
                                                    str = "clipsViewerViewPager";
                                                    if (gBj != null) {
                                                        gBj.A0J(hka2);
                                                        C52012GBj gBj2 = r52.A0N;
                                                        if (gBj2 != null) {
                                                            C56042Hrp hrp = r52.A0J;
                                                            if (hrp != null) {
                                                                GBE gbe5 = r52.A09;
                                                                if (gbe5 != null) {
                                                                    hka2.A0B(swipeRefreshLayout, gbe5.A14, hrp, gBj2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    0qQ.A0F(str);
                                                    throw AnonymousClass00P.createAndThrow();
                                                }
                                            }
                                        } else {
                                            throw AnonymousClass7TE.A0y();
                                        }
                                    }
                                }
                            }
                            0qQ.A0F("clipsViewerFragmentViewModel");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        i = 261124004;
                        AnonymousClass0fD.A0A(i, A032);
                        AnonymousClass0fD.A0A(-485496146, A03);
                    }
                } else {
                    C55957HqO hqO2 = hlj.A01;
                    C227232is r53 = hqO2.A02;
                    GDB gdb = r53.A0A;
                    if (gdb != null) {
                        gdb.A0A();
                    }
                    DirectShareTarget directShareTarget = new DirectShareTarget(A01);
                    GBE gbe6 = r53.A09;
                    if (gbe6 != null) {
                        View view2 = hqO2.A00;
                        ClipsViewerConfig clipsViewerConfig = gbe6.A0Y;
                        boolean z = false;
                        ClipsReplyBarData clipsReplyBarData = new ClipsReplyBarData(directShareTarget, (DirectThreadKey) null, (MsysThreadId) null, (String) null, (String) null, (String) null, "clips_viewer_external_send", (String) null, (String) null, (String) null, clipsViewerConfig.A0m, 0, 0, false, false, false, true, false, false, false, false, false, false);
                        GD6 gd6 = (GD6) gbe6.A20.invoke();
                        UserSession userSession3 = gbe6.A0a;
                        C51979GAc gAc = gbe6.A19;
                        FragmentActivity fragmentActivity = gbe6.A0R;
                        C54575HJk hJk = gbe6.A0q;
                        C66907Meq meq = gbe6.A0D;
                        GNH gnh2 = gbe6.A0B;
                        ClipsViewerDirectData clipsViewerDirectData = clipsViewerConfig.A0I;
                        if (clipsViewerDirectData != null) {
                            z = clipsViewerDirectData.A09;
                        }
                        C66906Mep mep = new C66906Mep(fragmentActivity, clipsViewerConfig.A0J, clipsReplyBarData, userSession3, gAc, hJk, gd6, gbe6.A09, gnh2, meq, z);
                        gbe6.A0z.A00(mep);
                        mep.onViewCreated(view2, (Bundle) null);
                        gbe6.A0H = mep;
                        GBE gbe7 = r53.A09;
                        if (gbe7 != null) {
                            GME gme = gbe7.A0H;
                            if (gme != null) {
                                SwipeRefreshLayout swipeRefreshLayout2 = hqO2.A01;
                                C52012GBj gBj3 = r53.A0N;
                                str = "clipsViewerViewPager";
                                if (gBj3 != null) {
                                    gBj3.A0J(gme);
                                    C52012GBj gBj4 = r53.A0N;
                                    if (gBj4 != null) {
                                        C56042Hrp hrp2 = r53.A0J;
                                        if (hrp2 != null) {
                                            GBE gbe8 = r53.A09;
                                            if (gbe8 != null) {
                                                gme.A0B(swipeRefreshLayout2, gbe8.A14, hrp2, gBj4);
                                            }
                                        }
                                    }
                                }
                                0qQ.A0F(str);
                                throw AnonymousClass00P.createAndThrow();
                            }
                            if (182.A06(0Tu.A05, C227232is.A01(r53), 36324728855736618L)) {
                                GMC gmc = r53.A05;
                                if (gmc != null) {
                                    gmc.A02 = new DirectShareTarget(A01);
                                    gmc.A03 = true;
                                    GMF gmf = gmc.A0D;
                                    ImageUrl Bh3 = A01.Bh3();
                                    GradientSpinnerAvatarView gradientSpinnerAvatarView = gmf.A08;
                                    if (gradientSpinnerAvatarView != null) {
                                        gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, gmf.A0H, Bh3);
                                    }
                                    GradientSpinnerAvatarView gradientSpinnerAvatarView2 = gmf.A08;
                                    if (gradientSpinnerAvatarView2 != null) {
                                        gradientSpinnerAvatarView2.A05();
                                    }
                                }
                            } else {
                                hqO2.A00();
                                GBE gbe9 = r53.A09;
                                if (gbe9 != null) {
                                    GNH gnh3 = gbe9.A0B;
                                    if (gnh3 != null) {
                                        AnonymousClass7TH.A0R(gnh3.A02);
                                    }
                                    GBE gbe10 = r53.A09;
                                    if (gbe10 != null) {
                                        GNH gnh4 = gbe10.A0B;
                                        if (gnh4 != null) {
                                            gnh4.A05 = true;
                                        }
                                    }
                                }
                            }
                            i = 825163874;
                            AnonymousClass0fD.A0A(i, A032);
                            AnonymousClass0fD.A0A(-485496146, A03);
                        }
                    }
                    0qQ.A0F("clipsViewerFragmentViewModel");
                    throw AnonymousClass00P.createAndThrow();
                }
                str = "overlayFragmentController";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        hlj.A01.A00();
        i = -1586935577;
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-485496146, A03);
    }
}
