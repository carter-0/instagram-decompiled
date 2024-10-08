package X;

import com.facebook.graphql.enums.EnumHelper;

/* renamed from: X.8cI  reason: invalid class name and case insensitive filesystem */
public final class C359218cI {
    public static final C359228cJ A03;
    public static final C359218cI A04;
    public static final C359218cI A05;
    public static final C359218cI A06;
    public static final C359218cI A07;
    public static final C359218cI A08;
    public static final C359218cI A09;
    public static final C359218cI A0A;
    public static final C359218cI A0B;
    public static final C359218cI A0C;
    public static final C359218cI A0D;
    public static final C359218cI A0E;
    public static final C359218cI A0F;
    public static final C359218cI A0G;
    public static final C359218cI A0H;
    public static final C359218cI A0I;
    public static final C359218cI A0J;
    public static final C359218cI A0K;
    public static final C359218cI A0L;
    public static final C359218cI A0M;
    public final AnonymousClass84A A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && 0qQ.A0K(getClass(), obj.getClass())) {
                C359218cI r5 = (C359218cI) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.8cJ, java.lang.Object] */
    static {
        ? obj = new Object();
        A03 = obj;
        AnonymousClass84A r1 = AnonymousClass84A.STORIES;
        A0I = C359228cJ.A00(r1);
        A0L = obj.A01(r1, "FOR_YOU");
        A0H = obj.A01(r1, "EFFECT_BY_ID");
        AnonymousClass84A r12 = AnonymousClass84A.REELS;
        A09 = C359228cJ.A00(r12);
        A0K = obj.A01(r12, "FOR_YOU");
        A08 = obj.A01(r12, "EFFECT_BY_ID");
        AnonymousClass84A r13 = AnonymousClass84A.LIVE;
        A07 = C359228cJ.A00(r13);
        A06 = obj.A01(r13, "FOR_YOU");
        AnonymousClass84A r14 = AnonymousClass84A.DIRECT_RTC;
        A0F = C359228cJ.A00(r14);
        A0D = obj.A01(r14, "FOR_YOU");
        A0E = obj.A01(r14, "MULTIPEER");
        A0A = obj.A01(r14, "AVATAR_SDK_PRESETS");
        A0B = obj.A01(r14, "BACKGROUNDS");
        A0G = obj.A01(r14, "SOLO_BACKGROUNDS");
        A0C = obj.A01(r14, "EFFECT_BY_ID");
        AnonymousClass84A r15 = AnonymousClass84A.DIRECT;
        A05 = C359228cJ.A00(r15);
        A04 = obj.A01(r15, "FOR_YOU");
        AnonymousClass84A r16 = (AnonymousClass84A) EnumHelper.A00("DIRECT_THREAD", AnonymousClass84A.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        0qQ.A07(r16);
        0qQ.A0B("EFFECT_BY_ID", 1);
        A0J = new C359218cI(r16, "EFFECT_BY_ID");
        A0M = obj.A01(AnonymousClass84A.THREADS, "FOR_YOU");
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A02.hashCode();
    }

    public C359218cI(AnonymousClass84A r2, String str) {
        this.A00 = r2;
        this.A01 = str;
        this.A02 = r2.name();
    }
}
