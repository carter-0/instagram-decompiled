package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;

public final class WAO implements View.OnClickListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ X4P A02;
    public final /* synthetic */ X4Q A03;
    public final /* synthetic */ AnonymousClass6ZF A04;
    public final /* synthetic */ C311376ca A05;
    public final /* synthetic */ X4R A06;
    public final /* synthetic */ X4U A07;
    public final /* synthetic */ C19201WPh A08;
    public final /* synthetic */ AnonymousClass6ZB A09;
    public final /* synthetic */ AnonymousClass6ZK A0A;
    public final /* synthetic */ AnonymousClass6ZD A0B;
    public final /* synthetic */ AnonymousClass6ZC A0C;
    public final /* synthetic */ CharSequence A0D;

    public WAO(DialogInterface.OnDismissListener onDismissListener, AnonymousClass0iw r2, X4P x4p, X4Q x4q, AnonymousClass6ZF r5, C311376ca r6, X4R x4r, X4U x4u, C19201WPh wPh, AnonymousClass6ZB r10, AnonymousClass6ZK r11, AnonymousClass6ZD r12, AnonymousClass6ZC r13, CharSequence charSequence) {
        this.A08 = wPh;
        this.A0D = charSequence;
        this.A00 = onDismissListener;
        this.A04 = r5;
        this.A07 = x4u;
        this.A0A = r11;
        this.A09 = r10;
        this.A0C = r13;
        this.A0B = r12;
        this.A05 = r6;
        this.A06 = x4r;
        this.A02 = x4p;
        this.A03 = x4q;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        String str;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod;
        Activity activity;
        int i;
        C309516Yo r5;
        Fragment h0i;
        C358248ab r3;
        int i2;
        int A052 = AnonymousClass0fD.A05(1720773047);
        C19201WPh wPh = this.A08;
        CharSequence charSequence = this.A0D;
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        AnonymousClass6ZF r9 = this.A04;
        X4U x4u = this.A07;
        AnonymousClass6ZK r21 = this.A0A;
        AnonymousClass6ZB r20 = this.A09;
        AnonymousClass6ZC r11 = this.A0C;
        AnonymousClass6ZD r4 = this.A0B;
        C311376ca r19 = this.A05;
        X4R x4r = this.A06;
        X4P x4p = this.A02;
        X4Q x4q = this.A03;
        AnonymousClass0iw r8 = this.A01;
        C255773uh r2 = wPh.A0F;
        1Xj r52 = r2.A0b;
        Resources resources = wPh.A05;
        if (C13988Tno.A1X(resources, charSequence, 2131971524) && r52 != null && r52.A2K() == AnonymousClass05K.A0C && wPh.A0H.A0B) {
            Activity activity2 = wPh.A04;
            0hq r112 = wPh.A07;
            UserSession userSession = wPh.A0B;
            DialogInterface.OnDismissListener onDismissListener2 = wPh.A01;
            if (onDismissListener2 != null) {
                r3 = new C358248ab(activity2);
                r3.A09(2131971460);
                r3.A08(2131971459);
                r3.A0I(new W5T(activity2, onDismissListener2, r112, userSession, r2, 0), 2131971524);
                r3.A0r(true);
                r3.A0s(true);
                r3.A0C(new W5U(r4, 35));
                i2 = 3;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (C13988Tno.A1X(resources, charSequence, 2131971601)) {
            Activity activity3 = wPh.A04;
            0hq r113 = wPh.A07;
            UserSession userSession2 = wPh.A0B;
            DialogInterface.OnDismissListener onDismissListener3 = wPh.A01;
            if (onDismissListener3 != null) {
                r3 = new C358248ab(activity3);
                r3.A09(2131971462);
                r3.A08(2131971461);
                r3.A0I(new W5T(activity3, onDismissListener3, r113, userSession2, r2, 1), 2131971601);
                r3.A0r(true);
                r3.A0s(true);
                r3.A0C(new W5U(r4, 36));
                i2 = 4;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            if (C13988Tno.A1X(resources, charSequence, 2131957531)) {
                W2A.A03(r8, r2, r9, wPh);
            } else if (C13988Tno.A1X(resources, charSequence, 2131954764)) {
                C19201WPh.A05(onDismissListener, wPh);
            } else if (C13988Tno.A1X(resources, charSequence, 2131973016)) {
                r21.A00(r2);
            } else if (C13988Tno.A1X(resources, charSequence, 2131972588) || C13988Tno.A1X(resources, charSequence, 2131972572)) {
                W2A.A01(wPh.A04, wPh.A01, wPh.A07, wPh.A08, wPh.A0B, r2);
            } else if (C13988Tno.A1X(resources, charSequence, 2131953150)) {
                x4q.Cvu(r2);
            } else if (C13988Tno.A1X(resources, charSequence, 2131973099) || C13988Tno.A1X(resources, charSequence, 2131973100)) {
                x4u.DjF(r2);
            } else if (C13988Tno.A1X(resources, charSequence, 2131973564)) {
                r19.DkG(r2, wPh.A0G, AnonymousClass05K.A01, C51972G9s.A0n());
            } else if (C13988Tno.A1X(resources, charSequence, 2131973445)) {
                UserSession userSession3 = wPh.A0B;
                0hq r6 = wPh.A07;
                AnonymousClass07i r7 = wPh.A08;
                DialogInterface.OnDismissListener onDismissListener4 = wPh.A01;
                AnonymousClass36V r92 = wPh.A0C;
                if (r92 != null) {
                    Activity activity4 = wPh.A04;
                    0qQ.A0B(r7, 3);
                    FCO.A00(activity4, r2, new C19524WbA(activity4, onDismissListener4, r6, r7, userSession3, r92, r2));
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (C13988Tno.A1X(resources, charSequence, 2131969192)) {
                wPh.A0K.A00(onDismissListener, true);
            } else if (C66581MXm.A11(resources.getString(2131961467), resources.getString(2131952328)).contains(charSequence.toString())) {
                C19201WPh.A06(onDismissListener, wPh, charSequence);
            } else if (C13988Tno.A1X(resources, charSequence, 2131952308)) {
                x4p.Cu8(r2);
            } else {
                if (C13988Tno.A1X(resources, charSequence, 2131971635)) {
                    r5 = new C309516Yo(wPh.A06.requireActivity(), wPh.A0B);
                    h0i = C250563lf.A0E();
                } else if (r52 != null && (C13988Tno.A1X(resources, charSequence, C305796Jo.A00(ProductType.STORY, false)) || C13988Tno.A1X(resources, charSequence, 2131953965))) {
                    1Yh A002 = C18138VmE.A00();
                    UserSession userSession4 = wPh.A0B;
                    AnonymousClass0iw r72 = wPh.A09;
                    A002.A07(wPh.A06, new C57016ILi(onDismissListener, 3), (PromoteLaunchOrigin) null, r72, userSession4, r52, r72.getModuleName(), (String) null, true);
                } else if (C13988Tno.A1X(resources, charSequence, 2131963114)) {
                    C13990Tnq.A1M(wPh);
                } else if (C13988Tno.A1X(resources, charSequence, 2131970695)) {
                    AnonymousClass6Z5.A09(r20.A00);
                } else if (0qQ.A0K(wPh.A0R, charSequence)) {
                    C19201WPh.A0G(wPh);
                } else if (0qQ.A0K(wPh.A0O, charSequence)) {
                    C19201WPh.A0E(wPh);
                } else if (0qQ.A0K(wPh.A0S, charSequence)) {
                    C19201WPh.A0H(wPh);
                } else if ("[INTERNAL] Pause Playback".equals(charSequence)) {
                    r11.A00.A17.EHY("user_paused_video");
                } else if ("[INTERNAL] Resume Playback".equals(charSequence)) {
                    G9w.A1O(r11.A00);
                } else if (C13988Tno.A1X(resources, charSequence, 2131971474)) {
                    x4r.DJN(r2);
                } else if (C273654mx.A00(226).equals(charSequence)) {
                    C15621Ufn ufn = new C15621Ufn(wPh.A04, 39);
                    UserSession userSession5 = wPh.A0B;
                    String str2 = r2.A0j;
                    1NY A0N = DbU.A0N(userSession5);
                    C51968G9o.A1K(A0N, "story_interactions/bulk_story_like/", str2);
                    1OC A0S = DbT.A0S(A0N, 1XP.class, 1XY.class);
                    A0S.A00 = ufn;
                    1ES.A03(A0S);
                } else if ("[INTERNAL] Show Reel Ranker Score".equals(charSequence)) {
                    FragmentActivity requireActivity = wPh.A06.requireActivity();
                    UserSession userSession6 = wPh.A0B;
                    r5 = new C309516Yo(requireActivity, userSession6);
                    Bundle A0B2 = DbY.A0B("reel_id", r2.A0k);
                    AnonymousClass0Dg.A00(A0B2, userSession6);
                    h0i = new C54138H0i();
                    h0i.setArguments(A0B2);
                } else {
                    if (C13988Tno.A1X(resources, charSequence, 2131974388)) {
                        if (r52 != null) {
                            activity = wPh.A04;
                            C56304HwH.A01(activity, wPh.A0B, r52, G9t.A18(r52));
                            wPh.A0T.invoke();
                            i = 2131974386;
                        }
                    } else if (C13988Tno.A1X(resources, charSequence, 2131974390)) {
                        if (r52 != null) {
                            activity = wPh.A04;
                            C56304HwH.A00(activity, wPh.A0B, r52);
                            wPh.A0T.invoke();
                            i = 2131974387;
                        }
                    } else if (C13988Tno.A1X(resources, charSequence, 2131974324)) {
                        C63406KwS.A00(wPh.A04, new W5U(wPh, 38), r8, wPh.A0B, r2);
                    } else if (C13988Tno.A1X(resources, charSequence, 2131974282)) {
                        C17040VFo.A00(wPh.A04, wPh.A07, wPh.A0B, r2);
                    } else if (C13988Tno.A1X(resources, charSequence, 2131961453)) {
                        C19845WgQ wgQ = new C19845WgQ(0, onDismissListener, wPh);
                        Context requireContext = wPh.A06.requireContext();
                        UserSession userSession7 = wPh.A0B;
                        String moduleName = wPh.A09.getModuleName();
                        if (r52 != null) {
                            str = r52.A2n();
                            mediaGenAIDetectionMethod = r52.A1I();
                        } else {
                            str = null;
                            mediaGenAIDetectionMethod = null;
                        }
                        C250563lf.A0P(requireContext, AnonymousClass9OT.STORY, mediaGenAIDetectionMethod, userSession7, wgQ, moduleName, str);
                    } else if (C13988Tno.A1X(resources, charSequence, 2131952630)) {
                        C19201WPh.A08(r8, wPh);
                    }
                    C59689JTv.A07(activity, i);
                }
                r5.A0B((Bundle) null, h0i);
                r5.A04();
            }
            wPh.A01 = null;
            C19201WPh.A0I(wPh, AnonymousClass7TG.A0m(charSequence, "", new StringBuilder()));
            AnonymousClass0fD.A0C(-1177719495, A052);
        }
        r3.A0B(new W4V(r4, i2));
        DbT.A1V(r3);
        wPh.A01 = null;
        C19201WPh.A0I(wPh, AnonymousClass7TG.A0m(charSequence, "", new StringBuilder()));
        AnonymousClass0fD.A0C(-1177719495, A052);
    }
}
