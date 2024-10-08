package X;

import android.os.Bundle;
import com.instagram.modal.ModalActivity;

/* renamed from: X.KAr  reason: case insensitive filesystem */
public final class C61512KAr extends C21478XcN {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ LBL A01;
    public final /* synthetic */ C62892Ko6 A02;

    public C61512KAr(AnonymousClass4DH r1, LBL lbl, C62892Ko6 ko6) {
        this.A01 = lbl;
        this.A00 = r1;
        this.A02 = ko6;
    }

    public final void A01() {
        Bundle A0a = AnonymousClass7TE.A0a();
        C62892Ko6 ko6 = this.A02;
        LBL lbl = this.A01;
        C62330Ke2 ke2 = (C62330Ke2) ko6;
        A0a.putString("args.broadcast_id", ke2.A00);
        A0a.putString("args.media_id", ke2.A04);
        A0a.putString("args.server_info", ke2.A06);
        A0a.putString("args.video_call_id", ke2.A07);
        A0a.putString("args.broadcaster_id", ke2.A02);
        A0a.putString("args.invite_type", ke2.A03);
        A0a.putString("args.broadcast_message", ke2.A01);
        A0a.putString("args.tracking_token", ke2.A05);
        A0a.putBoolean("args.live_trace_enabled", false);
        A0a.putStringArrayList("args.tagged_business_partner_ids", ke2.A08);
        C340307l3 r0 = (C340307l3) AnonymousClass7TE.A14(lbl.A0C);
        if (r0 != null) {
            A0a.putBoolean("args.camera_front_facing", r0.CPy());
        }
        AnonymousClass4DH r2 = this.A00;
        DbW.A0W(r2.getActivity(), A0a, lbl.A04, ModalActivity.class, C273654mx.A00(2988)).A0D(r2, 5151);
    }
}
