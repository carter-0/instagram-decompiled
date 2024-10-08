package X;

import java.lang.ref.WeakReference;

/* renamed from: X.4Nq  reason: invalid class name and case insensitive filesystem */
public final class C263864Nq implements C263874Nr {
    public C263884Ns A00 = new C263884Ns();
    public WeakReference A01;
    public AnonymousClass4MB A02;
    public C252323ov A03;
    public Object A04;
    public final C263854Np A05;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0095 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C263974Ob BH9(java.lang.String r7) {
        /*
            r6 = this;
            r3 = 0
            java.lang.ref.WeakReference r0 = r6.A01
            r5 = 0
            if (r0 == 0) goto L_0x0092
            java.lang.Object r4 = r0.get()
            X.4M5 r4 = (X.AnonymousClass4M5) r4
        L_0x000c:
            X.4Ns r0 = r6.A00
            java.util.Map r0 = r0.A00
            java.lang.Object r2 = r0.get(r7)
            if (r2 != 0) goto L_0x001e
            X.4Ob r2 = new X.4Ob
            r2.<init>()
            r0.put(r7, r2)
        L_0x001e:
            X.4Ob r2 = (X.C263974Ob) r2
            r0.remove(r7)
            if (r4 == 0) goto L_0x0090
            java.lang.Integer r0 = r4.CEj()
            if (r0 == 0) goto L_0x0039
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "view_height"
            r2.A05(r0, r1)
        L_0x0039:
            java.lang.Integer r0 = r4.CEr()
            if (r0 == 0) goto L_0x004d
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "view_width"
            r2.A05(r0, r1)
        L_0x004d:
            X.3uR r0 = r4.CEW()
            if (r0 == 0) goto L_0x0090
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x008d
            r0 = 1
            if (r1 == r0) goto L_0x008d
            r0 = 2
            if (r1 != r0) goto L_0x0090
            java.lang.String r1 = "progressive"
        L_0x0061:
            java.lang.String r0 = "video_format"
            r2.A06(r0, r1)
            X.4Np r3 = r6.A05
            if (r3 == 0) goto L_0x0083
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "audio_derived_content_id"
            r2.A06(r0, r1)
            java.lang.Integer r0 = r3.A00
            if (r0 == 0) goto L_0x0083
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "client_position"
            r2.A05(r0, r1)
        L_0x0083:
            X.3ov r1 = r6.A03
            if (r1 == 0) goto L_0x0095
            java.lang.Object r0 = r6.A04
            r1.A06(r2, r0)
            return r2
        L_0x008d:
            java.lang.String r1 = "dash"
            goto L_0x0061
        L_0x0090:
            r1 = 0
            goto L_0x0061
        L_0x0092:
            r4 = r5
            goto L_0x000c
        L_0x0095:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C263864Nq.BH9(java.lang.String):X.4Ob");
    }

    public final AnonymousClass4MB BO6() {
        return this.A02;
    }

    public final Integer BSo() {
        Integer A08;
        C252323ov r2 = this.A03;
        if (r2 == null || r2.A0B(this.A04) || (A08 = r2.A08()) == null) {
            return AnonymousClass05K.A00;
        }
        return A08;
    }

    public final AnonymousClass4OR BnS() {
        C252323ov r1 = this.A03;
        AnonymousClass4OR r2 = null;
        if (!(r1 == null || (r2 = r1.A05(this.A04)) == null)) {
            r2.A06("nav_chain", AnonymousClass1QI.A00.A02.A00);
        }
        return r2;
    }

    public final /* bridge */ /* synthetic */ C60340gF EZp(C263974Ob r2, String str) {
        this.A00.A00.put(str, r2);
        return C60340gF.A00;
    }

    public C263864Nq(AnonymousClass4MB r2, C263854Np r3, C252323ov r4, Object obj) {
        this.A04 = obj;
        this.A03 = r4;
        this.A05 = r3;
        this.A02 = r2;
    }
}
