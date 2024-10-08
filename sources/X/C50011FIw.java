package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.reels.Reel;

/* renamed from: X.FIw  reason: case insensitive filesystem */
public final class C50011FIw implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ DialogInterface.OnDismissListener A01;
    public final /* synthetic */ 0hq A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ Reel A05;
    public final /* synthetic */ C255773uh A06;
    public final /* synthetic */ C17589Vah A07;
    public final /* synthetic */ AnonymousClass6ZF A08;
    public final /* synthetic */ boolean A09;

    public C50011FIw(Activity activity, DialogInterface.OnDismissListener onDismissListener, 0hq r3, AnonymousClass0iw r4, UserSession userSession, Reel reel, C255773uh r7, C17589Vah vah, AnonymousClass6ZF r9, boolean z) {
        this.A07 = vah;
        this.A09 = z;
        this.A04 = userSession;
        this.A08 = r9;
        this.A05 = reel;
        this.A06 = r7;
        this.A00 = activity;
        this.A02 = r3;
        this.A01 = onDismissListener;
        this.A03 = r4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        C17589Vah vah = this.A07;
        boolean z = this.A09;
        if (z) {
            str = "deep_delete_click";
        } else {
            str = "ig_delete_click";
        }
        VFY.A00(vah, str, "dialog", (String) null, z);
        UserSession userSession = this.A04;
        C49089EpE.A00(userSession).A01();
        AnonymousClass6ZF r0 = this.A08;
        Reel reel = this.A05;
        C255773uh r5 = this.A06;
        r0.D8M(reel, r5);
        if (r5.CWu()) {
            Activity activity = this.A00;
            new W01(activity, this.A02, userSession, r5).A02(this.A01, vah, z, true);
            1Xj r02 = r5.A0b;
            if (r02 != null) {
                CreativeConfigIntf AsO = r02.A0C.AsO();
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
            } else if (!182.A06(0Tu.A05, userSession, 36318943534848774L) || r5.A16() || !r3.A00.A0n()) {
                Activity activity2 = this.A00;
                C63403KwO.A00(activity2, this.A03, userSession, r3, reel);
                C59689JTv.A07(activity2, 2131954733);
            } else {
                C59689JTv.A0F(this.A00, "cancel_story_upload_unable_to_cancel", 2131954732);
            }
        } else {
            C49089EpE.A00(userSession).A03(TraceFieldType.FailureReason, "unknown_failure");
            C49089EpE.A00(userSession).A04("unknown_failure", 002.A0R(C273654mx.A00(497), r5.A0e.name()));
        }
    }
}
