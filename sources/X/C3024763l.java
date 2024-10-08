package X;

import java.util.Map;

/* renamed from: X.63l  reason: invalid class name and case insensitive filesystem */
public abstract class C3024763l {
    public static final Map A00;
    public static final Map A01;
    public static final Map A02 = 0Yt.A06(new 0eP[]{new 0eP("secure_key_store_identity_private_key", "ipr"), new 0eP("secure_key_store_identity_public_key", "ipu")});

    static {
        C3024863m r2 = C3024863m.RecoveryCode;
        C3024963n r7 = C3024963n.M4A;
        C3024963n r6 = C3024963n.FB_BLUE;
        C3024963n r0 = C3024963n.FB_LITE;
        C3024963n r1 = C3024963n.FB_BLUE_DEBUG;
        0eP r5 = new 0eP(r2, new C3024963n[]{r7, r6, r0, r1});
        C3024863m r4 = C3024863m.MessageExpirationOptOutKey;
        0eP r22 = new 0eP(r4, new C3024963n[]{r7, r6, r1});
        C3024863m r3 = C3024863m.MessageExpirationTriggeredKey;
        A00 = 0Yt.A06(new 0eP[]{r5, r22, new 0eP(r3, new C3024963n[]{r7, r6, r1})});
        A01 = 0Yt.A06(new 0eP[]{new 0eP(r4, "message_expiration_lockbox_state_sync_opt_out_key"), new 0eP(r3, "message_expiration_lockbox_state_sync_triggered_key")});
    }
}
