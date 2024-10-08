package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: X.5FV  reason: invalid class name */
public enum AnonymousClass5FV {
    None(0, false),
    Love(1, false),
    GiftWrap(2, false),
    Celebration(3, false),
    Fire(4, false),
    AvatarHeart(IgNetworkConsentStorage.MAX_ENTRIES, true),
    AvatarAngry(1001, true),
    AvatarLaugh(1002, true),
    AvatarCry(1003, true),
    Unsupported(-1, false);
    
    public static final AnonymousClass5FW A02 = null;
    public static final Set A03 = null;
    public static final AnonymousClass0eM A04 = null;
    public static final Set A05 = null;
    public static final Set A06 = null;
    public final int A00;
    public final boolean A01;

    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, X.5FW] */
    /* access modifiers changed from: public */
    static {
        AnonymousClass5FV r6;
        AnonymousClass5FV r7;
        AnonymousClass5FV r8;
        AnonymousClass5FV r9;
        AnonymousClass5FV r10;
        AnonymousClass5FV r11;
        AnonymousClass5FV r12;
        AnonymousClass5FV r13;
        AnonymousClass5FV[] r0;
        A07 = 0oU.A00(r0);
        A02 = new Object();
        A06 = 0sc.A07(new AnonymousClass5FV[]{r6, r7, r8, r9});
        A05 = 0sc.A07(new AnonymousClass5FV[]{r10, r11, r12, r13});
        A04 = AnonymousClass0eN.A00(0eO.A02, AnonymousClass5FX.A00);
        EnumSet of = EnumSet.of(r6, r8, r7, r9);
        0qQ.A07(of);
        A03 = of;
    }

    /* access modifiers changed from: public */
    AnonymousClass5FV(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}
