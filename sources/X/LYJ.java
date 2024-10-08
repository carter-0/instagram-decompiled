package X;

import android.app.Activity;
import android.content.ClipData;
import android.graphics.drawable.GradientDrawable;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final /* synthetic */ class LYJ implements View.OnDragListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ GradientDrawable A01;
    public final /* synthetic */ GradientDrawable A02;
    public final /* synthetic */ ViewGroup A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C357638Yz A05;
    public final /* synthetic */ AnonymousClass85X A06;
    public final /* synthetic */ AnonymousClass8WX A07;

    public /* synthetic */ LYJ(Activity activity, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, ViewGroup viewGroup, UserSession userSession, C357638Yz r6, AnonymousClass85X r7, AnonymousClass8WX r8) {
        this.A07 = r8;
        this.A05 = r6;
        this.A04 = userSession;
        this.A03 = viewGroup;
        this.A06 = r7;
        this.A01 = gradientDrawable;
        this.A02 = gradientDrawable2;
        this.A00 = activity;
    }

    public final boolean onDrag(View view, DragEvent dragEvent) {
        View findViewById;
        AnonymousClass8WX r12 = this.A07;
        C357638Yz r5 = this.A05;
        UserSession userSession = this.A04;
        ViewGroup viewGroup = this.A03;
        AnonymousClass85X r1 = this.A06;
        GradientDrawable gradientDrawable = this.A01;
        GradientDrawable gradientDrawable2 = this.A02;
        Activity activity = this.A00;
        if (view == null || dragEvent == null) {
            return false;
        }
        C362048hG r11 = r12.A00().A02;
        C279284yO r10 = (C279284yO) r5.A08.A00;
        switch (dragEvent.getAction()) {
            case 1:
                29R A0b = JTO.A0b(userSession);
                1Ln A0N = JTO.A0N(A0b);
                if (A0b.A0P() && DbT.A1Y(A0N)) {
                    JTO.A1V(A0N);
                    AnonymousClass283 A0N2 = JTT.A0N(A0N, A0b, "DRAG_AND_DROP_DRAG_START");
                    A0N.A0d(A0N2.A0C);
                    JTQ.A1A(A0N);
                    A0N.A0c(A0N2.A0A);
                    JTS.A1E(A0N);
                }
                if ((r10 instanceof C363138jC) && ((findViewById = viewGroup.findViewById(R.id.feed_gallery_fragment_holder)) == null || findViewById.getVisibility() != 0)) {
                    r1.A0C();
                }
                if (r11 != null) {
                    return true;
                }
                r12.A00().A08();
                return true;
            case 2:
                return true;
            case 3:
                DragAndDropPermissions requestDragAndDropPermissions = activity.requestDragAndDropPermissions(dragEvent);
                ClipData clipData = dragEvent.getClipData();
                if (requestDragAndDropPermissions == null || clipData == null) {
                    C59689JTv.A01(activity, AnonymousClass000.A00(1909), 2131975837, 0);
                    return false;
                } else if (((r10 instanceof AnonymousClass9QA) || (r10 instanceof C363138jC)) && clipData.getItemCount() > 10) {
                    C59689JTv.A03(activity, JTS.A0i(activity.getResources(), 10, 2131973048), "unsupported_media_amount", 0);
                    return false;
                } else {
                    0nY.A00().ATE(new KJG(activity, clipData, viewGroup, userSession, r10, r11, r12));
                    requestDragAndDropPermissions.release();
                    return true;
                }
            case 4:
            case 6:
                C63146KsF.A00((GradientDrawable) null, (GradientDrawable) null, viewGroup, r10);
                return true;
            case 5:
                C63146KsF.A00(gradientDrawable, gradientDrawable2, viewGroup, r10);
                return true;
            default:
                return false;
        }
    }
}
