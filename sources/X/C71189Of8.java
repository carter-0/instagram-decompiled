package X;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.FollowStatus;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Of8  reason: case insensitive filesystem */
public final class C71189Of8 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C71189Of8(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj3;
        this.A04 = obj2;
        this.A01 = obj;
        this.A02 = obj4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        String str2;
        int i2;
        String str3;
        String id;
        switch (this.A00) {
            case 0:
                C328837Gl r2 = (C328837Gl) this.A04;
                C254763t0 r1 = (C254763t0) this.A01;
                C328837Gl.A00(r2, r1, (MessageIdentifier) this.A03);
                C71866Os8 A002 = C69841Nt5.A00(r2.A01);
                2FW r0 = null;
                String valueOf = String.valueOf(r1.A00);
                C254703su r12 = (C254703su) this.A02;
                if (r12 != null) {
                    r0 = r12.A10;
                }
                String valueOf2 = String.valueOf(r0);
                AnonymousClass7TG.A1N(valueOf, valueOf2);
                0Aj A0H = C66582MXn.A0H(A002.A00, "direct_replace_pin_click", valueOf);
                A0H.AAJ("media_type", valueOf2);
                A0H.AAJ("target", "continue");
                A0H.Cgf();
                return;
            case 1:
                Context context = (Context) this.A01;
                C62320sa r13 = (C62320sa) this.A02;
                0qQ.A0B(r13, 2);
                ((1X9) this.A03).A00(context, (UserSession) this.A04).A0A(r13);
                dialogInterface.dismiss();
                return;
            case 2:
                int i3 = i;
                if (i == 0) {
                    UserSession userSession = (UserSession) this.A04;
                    AnonymousClass4DH r22 = (AnonymousClass4DH) this.A01;
                    C74516PwB pwB = (C74516PwB) this.A02;
                    C254743sy r6 = (C254743sy) this.A03;
                    Context requireContext = r22.requireContext();
                    boolean CUG = pwB.CUG();
                    AnonymousClass170 A003 = C71097OcX.A00(pwB);
                    if (A003 != null) {
                        String moduleName = r22.getModuleName();
                        int BIW = A003.BIW();
                        FollowStatus B6o = A003.B6o();
                        if (C66647MaG.A04(r6) != null) {
                            str3 = C66647MaG.A0B(r6);
                        } else {
                            str3 = null;
                        }
                        C48887Eln.A00(requireContext, r22, (FragmentActivity) null, userSession, new C49475EwG(pwB.AZs().contains(userSession.A06), pwB.C6a()), (C331157Pu) null, (C331127Pr) null, A003, new C49936FFp(C3263476j.A00(r6 instanceof MsysThreadId, CUG), (C69445Nlp) null, Boolean.valueOf(pwB.isPending()), Boolean.valueOf(CUG), moduleName, "direct_thread", B6o.name(), str3, "DEFAULT", "DEFAULT", AnonymousClass7TF.A0b(), BIW), (C51922G7q) null, (G8B) null);
                        return;
                    }
                    return;
                } else if (i3 == 1) {
                    UserSession userSession2 = (UserSession) this.A04;
                    AnonymousClass4DH r14 = (AnonymousClass4DH) this.A01;
                    AnonymousClass170 A004 = C71097OcX.A00((C74516PwB) this.A02);
                    if (A004 != null && (id = A004.getId()) != null) {
                        C71093OcF.A00((C331157Pu) null, ORV.A01(r14.requireActivity(), r14, userSession2, C14068TpH.DIRECT_MESSAGES, C16677UzD.USER, id));
                        return;
                    }
                    return;
                } else {
                    throw AnonymousClass7TE.A0w(002.A0c("the dialog option index ", " is not supported", i3));
                }
            case 3:
                VYK vyk = (VYK) this.A04;
                VW6 vw6 = (VW6) this.A03;
                C255773uh r5 = (C255773uh) this.A02;
                boolean z = !vw6.A00;
                vw6.A00 = z;
                UserSession userSession3 = vyk.A03;
                Reel reel = vw6.A02;
                String id2 = reel.getId();
                String str4 = r5.A0j;
                if (z) {
                    str = "media/%s/block_from_multi_author_story/";
                } else {
                    str = "media/%s/unblock_from_multi_author_story/";
                }
                String A06 = 0mp.A06(str, new Object[]{str4.split("_")[0]});
                1NY A0N = DbU.A0N(userSession3);
                A0N.A0A(A06);
                A0N.A9m("reel_id", id2);
                1OC A0S = DbT.A0S(A0N, 1XP.class, 1XY.class);
                A0S.A00 = new NMG(5, vw6, vyk, z);
                1ES.A03(A0S);
                1Ns r02 = reel.A0W;
                if (r02 != null) {
                    str2 = r02.getName();
                } else {
                    str2 = null;
                }
                boolean A1m = r5.A1m();
                boolean z2 = vw6.A00;
                if (A1m) {
                    i2 = 2131975875;
                    if (z2) {
                        i2 = 2131963335;
                    }
                } else {
                    i2 = 2131975874;
                    if (z2) {
                        i2 = 2131963333;
                    }
                }
                Context context2 = vyk.A01;
                0qQ.A0A(context2);
                C59689JTv.A09(context2, DbY.A0c(context2, str2, i2));
                0fE.A00(((ReelDashboardFragment) this.A01).mListAdapter, -335352360);
                return;
            default:
                C70972OTt oTt = (C70972OTt) this.A04;
                ((C74476PvW) this.A02).CxU(oTt);
                oTt.A09 = true;
                C67882MwQ mwQ = (C67882MwQ) this.A03;
                ImageView imageView = mwQ.A00;
                DbU.A13((Context) this.A01, imageView, R.drawable.share_check);
                imageView.clearColorFilter();
                mwQ.A01.setVisibility(8);
                mwQ.A02.setVisibility(0);
                return;
        }
    }
}
