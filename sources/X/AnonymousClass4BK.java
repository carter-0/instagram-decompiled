package X;

/* renamed from: X.4BK  reason: invalid class name */
public final class AnonymousClass4BK implements 1UV {
    public final /* synthetic */ AnonymousClass48S A00;

    public AnonymousClass4BK(AnonymousClass48S r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        C2606546n r2;
        BBV bbv;
        String str;
        C254703su r5 = (C254703su) obj;
        if (r5.A10 == 2FW.A0G && (r2 = r5.A0N) != null && (((bbv = r2.A01) != null && C2606546n.A0B.contains(bbv.A00)) || ((str = r2.A02) != null && C2606546n.A0A.contains(str)))) {
            return false;
        }
        if ((!r5.A1u.equals(this.A00.A0H.A06) || !"igd_automation_automated_message".equals(r5.A1p)) && r5.A1Q == null) {
            return true;
        }
        return false;
    }
}
