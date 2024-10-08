package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.HashSet;

/* renamed from: X.LGa  reason: case insensitive filesystem */
public final class C63971LGa {
    public C262204Co A00;
    public boolean A01;
    public final AnonymousClass0xx A02;
    public final 02m A03;
    public final HashSet A04 = AnonymousClass7TE.A1F();

    public final void A05(String str, Integer num) {
        String str2;
        0qQ.A0B(str, 0);
        int hashCode = str.hashCode();
        HashSet hashSet = this.A04;
        Integer valueOf = Integer.valueOf(hashCode);
        if (hashSet.contains(valueOf)) {
            02m r3 = this.A03;
            if (num.intValue() != 0) {
                str2 = "no_media";
            } else {
                str2 = "network";
            }
            r3.markerAnnotate(18953813, hashCode, TraceFieldType.FailureReason, str2);
            r3.markerEnd(18953813, hashCode, 3);
            hashSet.remove(valueOf);
        }
    }

    public final void A00() {
        if (this.A01) {
            02m r3 = this.A03;
            r3.markerAnnotate(18945137, TraceFieldType.FailureReason, AnonymousClass000.A00(4113));
            r3.markerEnd(18945137, 3);
            this.A00 = JTQ.A0n(this.A00);
            this.A01 = false;
        }
    }

    public C63971LGa(AnonymousClass0xx r2, 02m r3) {
        AnonymousClass7TG.A1O(r3, r2);
        this.A03 = r3;
        this.A02 = r2;
    }

    public final void A01(String str) {
        int hashCode = str.hashCode();
        HashSet hashSet = this.A04;
        Integer valueOf = Integer.valueOf(hashCode);
        if (hashSet.contains(valueOf)) {
            this.A03.markerEnd(18953813, hashCode, 2);
            hashSet.remove(valueOf);
        }
    }

    public final void A02(String str) {
        int hashCode = str.hashCode();
        if (this.A04.contains(Integer.valueOf(hashCode))) {
            this.A03.markerPoint(18953813, hashCode, "fetch_end");
        }
    }

    public final void A03(String str) {
        int A0F = JTR.A0F(str);
        if (this.A04.contains(Integer.valueOf(A0F))) {
            this.A03.markerPoint(18953813, A0F, AnonymousClass000.A00(1364));
        }
    }

    public final void A04(String str) {
        int A0F = JTR.A0F(str);
        HashSet hashSet = this.A04;
        Integer valueOf = Integer.valueOf(A0F);
        if (!hashSet.contains(valueOf)) {
            hashSet.add(valueOf);
            this.A03.markerStart(18953813, A0F);
        }
    }
}
