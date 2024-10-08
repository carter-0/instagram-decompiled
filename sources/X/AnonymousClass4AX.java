package X;

import java.util.Set;

/* renamed from: X.4AX  reason: invalid class name */
public final class AnonymousClass4AX implements AnonymousClass4AY {
    public final /* synthetic */ C2614849t A00;
    public final /* synthetic */ AnonymousClass4AG A01;

    public final void Dyw(AnonymousClass4AB r1) {
    }

    public final void FJa(AnonymousClass4AB r7, boolean z) {
        Set set;
        String str;
        0qQ.A0B(r7, 0);
        this.A00.FJa(r7, z);
        if (z) {
            AnonymousClass4AG r1 = this.A01;
            int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            C67333Mm9 mm9 = r1.A02;
            if (mm9 != null) {
                String A0g = 002.A0g(r7.A0A.getId(), r7.A0G, r7.A0F);
                boolean z2 = r7.A0P;
                0qQ.A0B(A0g, 0);
                if (z2) {
                    set = mm9.A00;
                } else {
                    set = mm9.A01;
                }
                int size = set.size();
                set.add(A0g);
                int size2 = set.size();
                if (size2 != size) {
                    if (z2) {
                        str = "active_now_render_count";
                    } else {
                        str = "notes_render_count";
                    }
                    C249813kP.A00.A02(1060769838, str, size2);
                }
            }
        }
    }

    public AnonymousClass4AX(C2614849t r1, AnonymousClass4AG r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void Cj8(AnonymousClass4AB r2, long j) {
        if (r2 != null) {
            C3018660j.A01(this.A01.A01).A0M(r2, j);
        }
    }

    public final void DLq(AnonymousClass4AB r2, long j) {
        if (r2 != null) {
            C3018660j.A01(this.A01.A01).A0N(r2, j);
        }
    }

    public final void FHX(AnonymousClass4AB r4, long j) {
        if (r4 != null) {
            C3018760k A012 = C3018660j.A01(this.A01.A01);
            if (!0qQ.A0K(r4.A0A.getId(), A012.A06.A06) || r4.A0S || r4.A0Q) {
                A012.A0C.add(new 0eP(r4, Long.valueOf(j)));
            }
        }
    }
}
