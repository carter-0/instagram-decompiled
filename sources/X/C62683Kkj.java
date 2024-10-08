package X;

import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.Kkj  reason: case insensitive filesystem */
public final class C62683Kkj extends Exception {
    public final BroadcastFailureType A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62683Kkj(BroadcastFailureType broadcastFailureType, String str, String str2) {
        super(str2);
        0qQ.A0B(str2, 3);
        this.A00 = broadcastFailureType;
        this.A01 = str;
    }
}
