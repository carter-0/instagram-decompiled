package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.FIg  reason: case insensitive filesystem */
public final class C49997FIg implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public C49997FIg(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.A00 = i;
        this.A05 = z;
        this.A02 = obj2;
        this.A01 = obj;
        this.A04 = obj3;
        this.A03 = obj4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        boolean z;
        switch (this.A00) {
            case 0:
                2Eq r1 = (2Eq) this.A02;
                String C6C = r1.C6C();
                if (this.A05 && C6C != null) {
                    C70150Ny4.A00(((C66664MaX) this.A04).A03, C6C, DbS.A0q(this.A03));
                }
                C66664MaX maX = (C66664MaX) this.A04;
                String moduleName = maX.A02.getModuleName();
                User user = (User) this.A03;
                String str2 = "DEFAULT";
                C49936FFp fFp = new C49936FFp((C3263576k) null, (C69445Nlp) null, Boolean.valueOf(r1.isPending()), Boolean.valueOf(r1.CUG()), moduleName, "direct_thread", user.B6o().name(), C6C, "DEFAULT", str2, AnonymousClass7TF.A0b(), user.BIW());
                Context context = maX.A00;
                UserSession userSession = maX.A03;
                C48887Eln.A00(context, maX.A01, (FragmentActivity) null, userSession, new C49475EwG(r1.AZs().contains(userSession.A06), r1.C6a()), (C331157Pu) null, (C331127Pr) null, user, fFp, (C51922G7q) null, new C51051Fnh(this.A01, 0));
                return;
            case 1:
                if (this.A05) {
                    C71118OdC.A00((Activity) this.A01, (Context) this.A02, (UserSession) this.A04);
                    return;
                }
                ((C74419PuZ) this.A03).DVU(new N4G(1));
                return;
            case 2:
                C17589Vah vah = (C17589Vah) this.A01;
                boolean z2 = this.A05;
                if (z2) {
                    str = "deep_delete_click";
                } else {
                    str = "ig_delete_click";
                }
                VFY.A00(vah, str, "dialog", (String) null, z2);
                C19200WPg wPg = (C19200WPg) this.A04;
                UserSession userSession2 = wPg.A07;
                C49089EpE.A00(userSession2).A01();
                Reel reel = (Reel) this.A03;
                C255773uh r5 = wPg.A0A;
                ((AnonymousClass6ZF) this.A02).D8M(reel, r5);
                if (r5.CWu()) {
                    Activity activity = wPg.A01;
                    new W01(activity, wPg.A04, userSession2, r5).A02(wPg.A00, vah, z2, true);
                    1Xj r0 = wPg.A08;
                    if (r0 != null) {
                        CreativeConfigIntf AsO = r0.A0C.AsO();
                        if (AsO != null && C284745Nt.A03(AsO) == C306106Ku.CLIPS) {
                            activity.setResult(9690);
                            return;
                        }
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                } else if (r5.A1Y()) {
                    C270184gK r3 = r5.A0d;
                    if (r3 == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    } else if (!182.A06(0Tu.A05, userSession2, 36318943534848774L) || r5.A16() || !r3.A00.A0n()) {
                        Activity activity2 = wPg.A01;
                        C63403KwO.A00(activity2, wPg.A06, userSession2, r3, reel);
                        C59689JTv.A0F(activity2, "cancel_story_upload_unable_to_cancel", 2131954733);
                        return;
                    } else {
                        C59689JTv.A0F(wPg.A01, "cancel_story_upload_unable_to_cancel", 2131954732);
                        return;
                    }
                } else {
                    C49089EpE.A00(userSession2).A03(TraceFieldType.FailureReason, "unknown_failure");
                    C49089EpE.A00(userSession2).A04("unknown_failure", 002.A0R(C273654mx.A00(497), r5.A0e.name()));
                    return;
                }
            case 3:
                UserSession userSession3 = (UserSession) this.A03;
                if (!LTP.A09(userSession3)) {
                    ((C48153EZv) this.A04).A06((AnonymousClass3Q3) this.A01, this.A05);
                    break;
                } else {
                    AnonymousClass1Nd.A00(userSession3).A05(new C64661Lfn(this.A05));
                    break;
                }
            default:
                UserSession userSession4 = (UserSession) this.A03;
                if (LTP.A09(userSession4)) {
                    1Ng A002 = AnonymousClass1Nd.A00(userSession4);
                    z = this.A05;
                    A002.A05(new C64661Lfn(z));
                } else {
                    z = this.A05;
                    ((C48153EZv) this.A04).A06((AnonymousClass3Q3) this.A01, z);
                }
                LJr.A00(userSession4).A01(userSession4, AnonymousClass000.A00(3114), z);
                break;
        }
        DbS.A1U(this.A02);
    }
}
