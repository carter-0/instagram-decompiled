package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.57P  reason: invalid class name */
public final class AnonymousClass57P implements C233452vk {
    public C228802mM A00;
    public C18625VvI A01;
    public C233462vl A02;
    public C233812wV A03;
    public final AnonymousClass3VX A04 = new AnonymousClass3VX();
    public final UserSession A05;

    public final void EDO() {
        this.A01 = null;
        this.A04.A00 = null;
    }

    public final /* bridge */ /* synthetic */ void A9o(Object obj) {
        AnonymousClass4EB r3 = (AnonymousClass4EB) obj;
        0qQ.A0B(r3, 0);
        1Xg r1 = r3.A01;
        if (1Xi.A02(r1.A05) == null) {
            return;
        }
        if (this.A00 != null) {
            String str = r1.A09;
            if (str != null) {
                this.A04.A04.put(str, str);
                C18625VvI vvI = this.A01;
                if (vvI != null) {
                    vvI.A01();
                    return;
                }
                return;
            }
            return;
        }
        0qQ.A0F("modelIdentifier");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void AHQ() {
        C233812wV r1 = this.A03;
        if (r1 != null) {
            C233812wV.A06(r1, true);
        }
        AnonymousClass3VX r12 = this.A04;
        r12.A04.clear();
        C18625VvI vvI = r12.A00;
        if (vvI != null) {
            vvI.A01();
        }
    }

    public final void AV2(Context context) {
        C233812wV r0 = this.A03;
        if (r0 != null) {
            r0.A0T.Cmr();
        }
    }

    public final /* bridge */ /* synthetic */ Object Atu() {
        return this.A02;
    }

    public final Map AuU() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.A04.A02);
        0qQ.A07(unmodifiableMap);
        return unmodifiableMap;
    }

    public final Map B8v() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.A04.A03);
        0qQ.A07(unmodifiableMap);
        return unmodifiableMap;
    }

    public final List BHf() {
        List unmodifiableList = Collections.unmodifiableList(this.A04.A01);
        0qQ.A07(unmodifiableList);
        return unmodifiableList;
    }

    public final Map Bdc() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.A04.A04);
        0qQ.A07(unmodifiableMap);
        return unmodifiableMap;
    }

    public final AnonymousClass3VX BtU() {
        return this.A04;
    }

    public final void EQL(C18625VvI vvI) {
        this.A01 = vvI;
        this.A04.A00 = vvI;
    }

    public final /* bridge */ /* synthetic */ void ETU(Object obj) {
        C233462vl r8 = (C233462vl) obj;
        0qQ.A0B(r8, 0);
        this.A02 = r8;
        AnonymousClass3VX r0 = this.A04;
        r0.A01(-1.0d, -1, -1, -1, -1);
        r0.A03.put("min_gap_ad_ad", String.valueOf(r8.A05()));
    }

    public final void EXL(int i, int i2) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public AnonymousClass57P(UserSession userSession) {
        this.A05 = userSession;
    }

    public final void ENq(C233812wV r1) {
        this.A03 = r1;
    }
}
