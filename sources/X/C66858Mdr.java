package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.Mdr  reason: case insensitive filesystem */
public final class C66858Mdr {
    public final Context A00;
    public final AnonymousClass0eM A01 = A00(R.drawable.instagram_call_filled_20);
    public final AnonymousClass0eM A02 = A00(R.drawable.instagram_call_incoming_pano_filled_20);
    public final AnonymousClass0eM A03 = A00(R.drawable.instagram_video_chat_incoming_pano_filled_20);
    public final AnonymousClass0eM A04 = A00(R.drawable.instagram_call_x_pano_filled_20);
    public final AnonymousClass0eM A05 = A00(R.drawable.instagram_video_chat_x_pano_filled_20);
    public final AnonymousClass0eM A06 = A00(R.drawable.instagram_call_outgoing_pano_filled_20);
    public final AnonymousClass0eM A07 = A00(R.drawable.instagram_video_chat_outgoing_pano_filled_20);
    public final AnonymousClass0eM A08 = A00(R.drawable.instagram_video_chat_pano_filled_20);

    private final AnonymousClass0eM A00(int i) {
        return AnonymousClass0eN.A00(0eO.A02, new MJ3(i, 28, this));
    }

    public final Drawable A01(boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass0eM r0;
        if (z) {
            if (z4) {
                r0 = this.A04;
            } else if (z3) {
                r0 = this.A01;
            } else if (z2) {
                r0 = this.A06;
            } else {
                r0 = this.A02;
            }
        } else if (z4) {
            r0 = this.A05;
        } else if (z3) {
            r0 = this.A08;
        } else if (z2) {
            r0 = this.A07;
        } else {
            r0 = this.A03;
        }
        return JTO.A0D(r0);
    }

    public C66858Mdr(Context context) {
        this.A00 = context;
    }
}
