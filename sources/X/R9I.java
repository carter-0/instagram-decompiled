package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

public final class R9I extends C14097Tpp {
    public final /* synthetic */ C276544tV A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public R9I(C307786Rm r1, C276544tV r2, C276544tV r3) {
        super(r1, r2);
        this.A00 = r3;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Q5x, android.content.BroadcastReceiver] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.RSQ, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r7, C276544tV r8, Object obj) {
        SCW.A01 = (C7375Q9j) view;
        ? broadcastReceiver = new BroadcastReceiver();
        Context context = r7.A00;
        0DH.A03(broadcastReceiver, context, new IntentFilter("crop_action_crop_completed"), false);
        broadcastReceiver.A00 = new Object();
        SOG.A06.A04 = r8.A0T(false);
        SCW.A01(context, "LOAD_PROPIC_FOR_PREVIEW");
        SCW.A01(context, "LOAD_FRAME");
        return null;
    }

    public final /* bridge */ /* synthetic */ void A0L(View view, C307786Rm r4, C276544tV r5, Object obj, Object obj2) {
        SOG sog = SOG.A06;
        sog.A00 = null;
        sog.A01 = null;
        ((ImageView) view).setImageBitmap((Bitmap) null);
        SCW.A00 = null;
        SS4.A00 = 0;
        SS4.A01 = null;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.Q9j, android.widget.ImageView, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        float f = C7375Q9j.A01;
        int A03 = this.A00.A03(54, 280);
        ? imageView = new ImageView(context);
        imageView.A00 = (float) RVO.A00(280);
        imageView.A00 = (float) RVO.A00(A03);
        return imageView;
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r2, C276544tV r3, Object obj, Object obj2) {
    }
}
