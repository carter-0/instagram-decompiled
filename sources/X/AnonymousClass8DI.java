package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.8DI  reason: invalid class name */
public final class AnonymousClass8DI {
    public AnonymousClass8DM A00;
    public final AnonymousClass8DE A01;
    public final AnonymousClass86A A02;
    public final Set A03 = new HashSet();
    public final UserSession A04;

    private final void A00(int i) {
        String str;
        AnonymousClass87G B0Q;
        AnonymousClass8DM r0 = this.A00;
        if (r0 == null || (B0Q = r0.B0Q(i)) == null) {
            str = 002.A0O("fireLoggingEvent() effect is null at index=", i);
        } else {
            AnonymousClass87I r1 = B0Q.A04;
            if ((r1 == AnonymousClass87I.DISCOVERY_SURFACE || B0Q != AnonymousClass87G.A0T) && r1 != AnonymousClass87I.FILTER) {
                AnonymousClass86A r12 = this.A02;
                String id = B0Q.getId();
                0qQ.A07(id);
                HashSet hashSet = r12.A00;
                if (!hashSet.contains(id)) {
                    01r r3 = new 01r(1);
                    AnonymousClass87I r13 = B0Q.A04;
                    if (r13 == null) {
                        r13 = AnonymousClass87I.EMPTY;
                    }
                    if (r13 == AnonymousClass87I.AR_EFFECT || r13 == AnonymousClass87I.AVATAR_PRESET) {
                        CameraAREffect A002 = B0Q.A00();
                        if (A002 != null) {
                            String str2 = A002.A0K;
                            if (str2 != null) {
                                AnonymousClass8DE r14 = this.A01;
                                r3.put(str2, String.valueOf(i - r14.BMI()));
                                r14.AVf(B0Q, r3);
                            }
                        } else {
                            str = "fireLoggingEvent() logs empty effect id";
                        }
                    }
                    String id2 = B0Q.getId();
                    0qQ.A07(id2);
                    hashSet.add(id2);
                    return;
                }
                return;
            }
            return;
        }
        0kD.A07("DialImpressionLogger", str, (Throwable) null);
    }

    public final void A01() {
        AnonymousClass87G B0Q;
        AnonymousClass8DM r1 = this.A00;
        if (r1 == null) {
            0kD.A07("DialImpressionLogger", "logImpressionForVisibleElements() mEffectPickerViewManager is null", (Throwable) null);
        } else if (r1.AFa()) {
            int B6H = r1.B6H();
            int BLO = r1.BLO();
            if (B6H != -1 && BLO != -1 && B6H <= BLO) {
                while (true) {
                    AnonymousClass8DM r0 = this.A00;
                    if (!(r0 == null || (B0Q = r0.B0Q(B6H)) == null || (B0Q.A04 != AnonymousClass87I.DISCOVERY_SURFACE && !this.A03.contains(B0Q)))) {
                        A00(B6H);
                    }
                    if (B6H != BLO) {
                        B6H++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void A02(int i) {
        String A0O;
        AnonymousClass8DM r4 = this.A00;
        if (r4 == null) {
            A0O = "logImpressionOnIconLoaded() mEffectPickerViewManager is null";
        } else {
            AnonymousClass87G B0Q = r4.B0Q(i);
            if (B0Q == null) {
                A0O = 002.A0O("logImpressionOnIconLoaded() effect is null at index=", i);
            } else {
                Set set = this.A03;
                if (!set.contains(B0Q)) {
                    set.add(B0Q);
                    if (r4.AFa()) {
                        int B6H = r4.B6H();
                        int BLO = r4.BLO();
                        if (B6H != -1 && BLO != -1 && i >= B6H && i <= BLO) {
                            A00(i);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        0kD.A07("DialImpressionLogger", A0O, (Throwable) null);
    }

    public AnonymousClass8DI(UserSession userSession, AnonymousClass8DE r3, AnonymousClass86A r4) {
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = userSession;
    }
}
