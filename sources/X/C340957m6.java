package X;

import java.io.File;
import java.io.FileDescriptor;

/* renamed from: X.7m6  reason: invalid class name and case insensitive filesystem */
public final class C340957m6 {
    public int A00;
    public B2T A01;
    public LOF A02;
    public C21986Xoh A03;
    public C340547lR A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final AnonymousClass8FP A0A = new C340977m8(this);
    public final AnonymousClass8FP A0B = new C340967m7(this);
    public final C340347l7 A0C = new C340987m9(this);
    public final C3496981j A0D = new C3496981j();
    public final C3496981j A0E = new C3496981j();
    public final C340547lR A0F;
    public final String A0G;

    public static void A00(AnonymousClass8GD r5, LOF lof, C340547lR r7) {
        File file = (File) lof.A00(LOF.A07);
        String str = (String) lof.A00(LOF.A09);
        FileDescriptor fileDescriptor = (FileDescriptor) lof.A00(LOF.A08);
        if (file != null) {
            r7.A0N.Exq(r5, file, (File) null);
        } else if (str != null) {
            r7.A0N.Exs(r5, str, (String) null);
        } else if (fileDescriptor != null) {
            r7.A0N.Exr(r5, fileDescriptor, (FileDescriptor) null);
        }
    }

    public static void A01(AnonymousClass8GD r4, C340957m6 r5, String str) {
        C340577lU.A01("ConcurrentFrontBackController", "Disconnecting camera");
        r5.A0D.A00();
        if (!r5.A0F.A0I(new C364548lb(r4, r5, str), 002.A0R("disconnect_main_for_concurrent_front_back_mode_", str))) {
            C340577lU.A01("ConcurrentFrontBackController", "Main camera was already disconnected");
            A02(r4, r5, str);
        }
    }

    public static void A02(AnonymousClass8GD r4, C340957m6 r5, String str) {
        String str2;
        String str3;
        C340547lR r3 = r5.A04;
        if (r3 != null) {
            if (!r3.A0I(new C364538la(r4, r5), 002.A0R("disconnect_auxiliary_for_concurrent_front_back_mode_", str))) {
                str2 = "ConcurrentFrontBackController";
                str3 = "Auxiliary camera was already disconnected";
            } else {
                return;
            }
        } else {
            str2 = "ConcurrentFrontBackController";
            str3 = "No auxiliary instance to disconnect from";
        }
        C340577lU.A01(str2, str3);
        r4.A02((Object) null);
    }

    public static void A03(C340957m6 r1) {
        if (!r1.A0D.A00.isEmpty() && r1.A09 && r1.A05) {
            r1.A09 = false;
            r1.A05 = false;
            C342057ny.A00(new C40747Aid(r1));
        }
    }

    public C340957m6(C340547lR r2, String str) {
        this.A0F = r2;
        this.A0G = str;
    }
}
