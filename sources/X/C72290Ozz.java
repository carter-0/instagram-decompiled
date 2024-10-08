package X;

import android.graphics.Bitmap;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.IOException;

/* renamed from: X.Ozz  reason: case insensitive filesystem */
public final class C72290Ozz implements MS6 {
    public final /* synthetic */ C69106Nel A00;
    public final /* synthetic */ String A01;

    public C72290Ozz(C69106Nel nel, String str) {
        this.A01 = str;
        this.A00 = nel;
    }

    public final void Dgl(boolean z, String str) {
        Throwable th;
        if (z) {
            try {
                C59796JYp A012 = C59796JYp.A01(this.A01, 0);
                0qQ.A07(A012);
                String str2 = A012.A07;
                0qQ.A07(str2);
                long j = A012.A03;
                C69106Nel nel = this.A00;
                ClipInfo A03 = Q0X.A03(nel.A0B, str2, j, j);
                A03.A00 = ((float) A03.A09) / ((float) A03.A06);
                if (A03.A0F != null) {
                    C71111Ocu ocu = nel.A0D;
                    String str3 = str;
                    if (str != null) {
                        ocu.A03(new C72821PLj(A03, str3));
                        Bitmap bitmap = nel.A02;
                        if (bitmap != null) {
                            nel.A0J(new N9U(bitmap, AnonymousClass05K.A01, false, true));
                            nel.A0C.A00(new IX1(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, (String) null, nel.A08, true));
                            return;
                        }
                        th = AnonymousClass7TE.A0z("Required value was null.");
                    } else {
                        th = AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    th = new IOException("clipInfo.videoFilePath is null");
                }
                throw th;
            } catch (IOException e) {
                0KC.A0F("RtcCallPhotoboothPresenter", "Failed to share to direct", e);
                C69106Nel nel2 = this.A00;
                C59689JTv.A01(nel2.A0A, "direct_failed_to_send_video_to_thread_toast", 2131959256, 0);
                nel2.A0C.A00(new IX1(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, e.getMessage(), nel2.A08, false));
            }
        } else {
            C69106Nel nel3 = this.A00;
            nel3.A0C.A00(new IX1(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, "Failed to save coverImage bitmap", nel3.A08, false));
        }
    }
}
